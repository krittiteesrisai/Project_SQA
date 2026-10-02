# StdValueInstantiatorTest.java

ผมวิเคราะห์ซอร์สโค้ด `StdValueInstantiator` แล้วออกแบบเทสให้ครอบคลุมทุก if/else branch, loop, exception path ที่ "เห็นได้จากซอร์สที่ให้มา" ส่วน behavior ของ superclass (`ValueInstantiator`) ที่ไม่ได้แสดงในซอร์ส (เช่น `super.createUsingDefault`, `_createFromStringFallbacks`) จะเรียกเพื่อให้ branch ถูก execute (coverage) แต่ **ไม่ assert ผลลัพธ์ที่ไม่แน่ใจ** ตามข้อกำหนด พร้อมคอมเมนต์กำกับไว้ชัดเจน

หมายเหตุสำคัญ: ไฟล์เทสถูกวางไว้ใน **package เดียวกับคลาสเป้าหมาย** (`com.fasterxml.jackson.databind.deser.std`) เพื่อให้เข้าถึง protected methods (`wrapException`, `unwrapAndWrapException`, `wrapAsJsonMappingException`, `rewrapCtorProblem`) ได้โดยตรงโดยไม่ต้องใช้ reflection

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class StdValueInstantiatorTest {

    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        ctxt = mock(DeserializationContext.class);
    }

    private JavaType mockType(Class<?> raw, String desc) {
        JavaType t = mock(JavaType.class);
        when(t.getRawClass()).thenReturn(raw);
        when(t.toString()).thenReturn(desc);
        return t;
    }

    private StdValueInstantiator newInstantiator(Class<?> valueClass) {
        JavaType type = mockType(valueClass, valueClass.getName());
        return new StdValueInstantiator(null, type);
    }

    /** subclass ใช้เพื่อเข้าถึง protected copy-constructor */
    static class CopyableInstantiator extends StdValueInstantiator {
        CopyableInstantiator(StdValueInstantiator src) { super(src); }
    }

    // ===================== Constructors =====================

    @Test
    public void deprecatedConstructor_nullType_usesObjectClassAndClassUtilName() {
        StdValueInstantiator inst = new StdValueInstantiator(null, (Class<?>) null);
        assertEquals(Object.class, inst.getValueClass());
        assertEquals(ClassUtil.nameOf((Class<?>) null), inst.getValueTypeDesc());
    }

    @Test
    public void deprecatedConstructor_nonNullType_usesGivenClass() {
        StdValueInstantiator inst = new StdValueInstantiator(null, String.class);
        assertEquals(String.class, inst.getValueClass());
        assertEquals(ClassUtil.nameOf(String.class), inst.getValueTypeDesc());
    }

    @Test
    public void javaTypeConstructor_nullType_usesDefaults() {
        StdValueInstantiator inst = new StdValueInstantiator(null, (JavaType) null);
        assertEquals(Object.class, inst.getValueClass());
        assertEquals("UNKNOWN TYPE", inst.getValueTypeDesc());
    }

    @Test
    public void javaTypeConstructor_nonNullType_usesTypeInfo() {
        JavaType type = mockType(Integer.class, "java.lang.Integer");
        StdValueInstantiator inst = new StdValueInstantiator(null, type);
        assertEquals(Integer.class, inst.getValueClass());
        assertEquals("java.lang.Integer", inst.getValueTypeDesc());
    }

    @Test
    public void copyConstructor_copiesAllConfiguredFields() {
        StdValueInstantiator src = newInstantiator(String.class);
        AnnotatedWithParams defaultCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams withArgsCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams arrayDelegateCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams fromStringCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams fromIntCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams fromLongCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams fromDoubleCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams fromBooleanCreator = mock(AnnotatedWithParams.class);
        SettableBeanProperty[] ctorArgs = new SettableBeanProperty[0];

        src.configureFromObjectSettings(defaultCreator, delegateCreator, null, null,
                withArgsCreator, ctorArgs);
        src.configureFromArraySettings(arrayDelegateCreator, null, null);
        src.configureFromStringCreator(fromStringCreator);
        src.configureFromIntCreator(fromIntCreator);
        src.configureFromLongCreator(fromLongCreator);
        src.configureFromDoubleCreator(fromDoubleCreator);
        src.configureFromBooleanCreator(fromBooleanCreator);

        StdValueInstantiator copy = new CopyableInstantiator(src);

        assertEquals(src.getValueTypeDesc(), copy.getValueTypeDesc());
        assertEquals(src.getValueClass(), copy.getValueClass());
        assertSame(defaultCreator, copy.getDefaultCreator());
        assertSame(delegateCreator, copy.getDelegateCreator());
        assertSame(withArgsCreator, copy.getWithArgsCreator());
        assertSame(arrayDelegateCreator, copy.getArrayDelegateCreator());
        assertSame(ctorArgs, copy.getFromObjectArguments(null));
        assertTrue(copy.canCreateFromString());
        assertTrue(copy.canCreateFromInt());
        assertTrue(copy.canCreateFromLong());
        assertTrue(copy.canCreateFromDouble());
        assertTrue(copy.canCreateFromBoolean());
    }

    // ===================== configure* / metadata =====================

    @Test
    public void configureFromObjectSettings_setsAllRelatedFields() {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams defaultCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams withArgsCreator = mock(AnnotatedWithParams.class);
        JavaType delegateType = mock(JavaType.class);
        SettableBeanProperty[] ctorArgs = new SettableBeanProperty[0];

        inst.configureFromObjectSettings(defaultCreator, delegateCreator, delegateType, null,
                withArgsCreator, ctorArgs);

        assertSame(defaultCreator, inst.getDefaultCreator());
        assertSame(delegateCreator, inst.getDelegateCreator());
        assertSame(delegateType, inst.getDelegateType(null));
        assertSame(withArgsCreator, inst.getWithArgsCreator());
        assertSame(ctorArgs, inst.getFromObjectArguments(null));
        assertTrue(inst.canCreateUsingDefault());
        assertTrue(inst.canCreateUsingDelegate());
        assertTrue(inst.canCreateFromObjectWith());
    }

    @Test
    public void configureFromArraySettings_setsFieldsAndFlag() {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams arrayDelegateCreator = mock(AnnotatedWithParams.class);
        JavaType arrayDelegateType = mock(JavaType.class);
        inst.configureFromArraySettings(arrayDelegateCreator, arrayDelegateType, null);
        assertSame(arrayDelegateCreator, inst.getArrayDelegateCreator());
        assertSame(arrayDelegateType, inst.getArrayDelegateType(null));
        assertTrue(inst.canCreateUsingArrayDelegate());
    }

    @Test
    public void configureFromStringCreator_setsFlagTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        assertFalse(inst.canCreateFromString());
        inst.configureFromStringCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canCreateFromString());
    }

    @Test
    public void configureFromIntCreator_setsFlagTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        assertFalse(inst.canCreateFromInt());
        inst.configureFromIntCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canCreateFromInt());
    }

    @Test
    public void configureFromLongCreator_setsFlagTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        assertFalse(inst.canCreateFromLong());
        inst.configureFromLongCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canCreateFromLong());
    }

    @Test
    public void configureFromDoubleCreator_setsFlagTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        assertFalse(inst.canCreateFromDouble());
        inst.configureFromDoubleCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canCreateFromDouble());
    }

    @Test
    public void configureFromBooleanCreator_setsFlagTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        assertFalse(inst.canCreateFromBoolean());
        inst.configureFromBooleanCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canCreateFromBoolean());
    }

    @Test
    public void configureIncompleteParameter_setsField() {
        StdValueInstantiator inst = newInstantiator(String.class);
        assertNull(inst.getIncompleteParameter());
        AnnotatedParameter param = mock(AnnotatedParameter.class);
        inst.configureIncompleteParameter(param);
        assertSame(param, inst.getIncompleteParameter());
    }

    // ===================== canInstantiate =====================

    @Test
    public void canInstantiate_allUnset_returnsFalse() {
        StdValueInstantiator inst = newInstantiator(String.class);
        assertFalse(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_defaultCreatorOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromObjectSettings(mock(AnnotatedWithParams.class), null, null, null, null, null);
        assertTrue(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_delegateTypeOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromObjectSettings(null, null, mock(JavaType.class), null, null, null);
        assertTrue(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_arrayDelegateTypeOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromArraySettings(null, mock(JavaType.class), null);
        assertTrue(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_withArgsCreatorOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromObjectSettings(null, null, null, null, mock(AnnotatedWithParams.class), null);
        assertTrue(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_fromStringCreatorOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromStringCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_fromIntCreatorOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromIntCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_fromLongCreatorOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromLongCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_fromDoubleCreatorOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromDoubleCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canInstantiate());
    }

    @Test
    public void canInstantiate_fromBooleanCreatorOnly_returnsTrue() {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.configureFromBooleanCreator(mock(AnnotatedWithParams.class));
        assertTrue(inst.canInstantiate());
    }

    // ===================== createUsingDefault =====================

    @Test
    public void createUsingDefault_noCreator_delegatesToSuperclass() {
        // หมายเหตุ: ผลลัพธ์จริงของ ValueInstantiator#createUsingDefault (superclass) ไม่ปรากฏในซอร์สที่ให้มา
        // ทดสอบเพียงให้ branch ถูก execute โดยไม่ assert ผลลัพธ์ที่ไม่แน่ใจ
        StdValueInstantiator inst = newInstantiator(String.class);
        try {
            inst.createUsingDefault(ctxt);
        } catch (Throwable ignored) {
        }
    }

    @Test
    public void createUsingDefault_success_returnsCreatedValue() throws IOException {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        try { when(creator.call()).thenReturn("created"); } catch (Exception ignored) {}
        inst.configureFromObjectSettings(creator, null, null, null, null, null);

        Object result = inst.createUsingDefault(ctxt);
        assertEquals("created", result);
    }

    @Test
    public void createUsingDefault_exception_delegatesToHandleInstantiationProblem() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        when(creator.call()).thenThrow(new RuntimeException("boom"));
        inst.configureFromObjectSettings(creator, null, null, null, null, null);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);
        when(ctxt.handleInstantiationProblem(eq(String.class), isNull(), eq(jme))).thenReturn("handled");

        Object result = inst.createUsingDefault(ctxt);
        assertEquals("handled", result);
    }

    // ===================== createFromObjectWith =====================

    @Test
    public void createFromObjectWith_noCreator_delegatesToSuperclass() {
        StdValueInstantiator inst = newInstantiator(String.class);
        try {
            inst.createFromObjectWith(ctxt, new Object[]{"a"});
        } catch (Throwable ignored) {
        }
    }

    @Test
    public void createFromObjectWith_success_returnsCreatedValue() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        Object[] args = new Object[]{"a", "b"};
        when(creator.call(args)).thenReturn("created");
        inst.configureFromObjectSettings(null, null, null, null, creator, null);

        Object result = inst.createFromObjectWith(ctxt, args);
        assertEquals("created", result);
    }

    @Test
    public void createFromObjectWith_exception_delegatesToHandleInstantiationProblem() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        Object[] args = new Object[]{"a"};
        when(creator.call(args)).thenThrow(new RuntimeException("boom"));
        inst.configureFromObjectSettings(null, null, null, null, creator, null);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);
        when(ctxt.handleInstantiationProblem(eq(String.class), eq(args), eq(jme))).thenReturn("handled");

        Object result = inst.createFromObjectWith(ctxt, args);
        assertEquals("handled", result);
    }

    // ===================== createUsingDelegate / createUsingArrayDelegate =====================

    @Test(expected = IllegalStateException.class)
    public void createUsingDelegate_noDelegateCreators_throwsIllegalState() throws IOException {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.createUsingDelegate(ctxt, "value");
    }

    @Test
    public void createUsingDelegate_onlyArrayDelegateConfigured_usesArrayDelegate() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams arrayDelegateCreator = mock(AnnotatedWithParams.class);
        when(arrayDelegateCreator.call1("value")).thenReturn("fromArrayDelegate");
        inst.configureFromArraySettings(arrayDelegateCreator, null, null);

        Object result = inst.createUsingDelegate(ctxt, "value");
        assertEquals("fromArrayDelegate", result);
    }

    @Test
    public void createUsingDelegate_delegateCreatorConfigured_simpleCall() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        when(delegateCreator.call1("value")).thenReturn("fromDelegate");
        inst.configureFromObjectSettings(null, delegateCreator, null, null, null, null);

        Object result = inst.createUsingDelegate(ctxt, "value");
        assertEquals("fromDelegate", result);
    }

    @Test
    public void createUsingDelegate_withArgsArray_buildsArgumentsCorrectly() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        SettableBeanProperty injectableProp = mock(SettableBeanProperty.class);
        when(injectableProp.getInjectableValueId()).thenReturn("injKey");
        when(ctxt.findInjectableValue(eq("injKey"), eq(injectableProp), isNull())).thenReturn("injectedValue");
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[]{ null, injectableProp };
        when(delegateCreator.call(any(Object[].class))).thenReturn("builtResult");

        inst.configureFromObjectSettings(null, delegateCreator, null, delegateArgs, null, null);

        Object result = inst.createUsingDelegate(ctxt, "delegateVal");
        assertEquals("builtResult", result);

        ArgumentCaptor<Object[]> captor = ArgumentCaptor.forClass(Object[].class);
        verify(delegateCreator).call(captor.capture());
        assertArrayEquals(new Object[]{"delegateVal", "injectedValue"}, captor.getValue());
    }

    @Test
    public void createUsingDelegate_callThrows_wrapsAndRethrows() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        when(delegateCreator.call1(any())).thenThrow(new RuntimeException("fail"));
        inst.configureFromObjectSettings(null, delegateCreator, null, null, null, null);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);

        try {
            inst.createUsingDelegate(ctxt, "x");
            fail("expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertSame(jme, e);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void createUsingArrayDelegate_noDelegateCreators_throwsIllegalState() throws IOException {
        StdValueInstantiator inst = newInstantiator(String.class);
        inst.createUsingArrayDelegate(ctxt, "value");
    }

    @Test
    public void createUsingArrayDelegate_onlyDelegateConfigured_fallsBackToDelegate() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        when(delegateCreator.call1("value")).thenReturn("viaDelegate");
        inst.configureFromObjectSettings(null, delegateCreator, null, null, null, null);

        Object result = inst.createUsingArrayDelegate(ctxt, "value");
        assertEquals("viaDelegate", result);
    }

    @Test
    public void createUsingArrayDelegate_arrayDelegateConfigured_simpleCall() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams arrayDelegateCreator = mock(AnnotatedWithParams.class);
        when(arrayDelegateCreator.call1("value")).thenReturn("fromArrayDelegate");
        inst.configureFromArraySettings(arrayDelegateCreator, null, null);

        Object result = inst.createUsingArrayDelegate(ctxt, "value");
        assertEquals("fromArrayDelegate", result);
    }

    // ===================== createFromString =====================

    @Test
    public void createFromString_noCreator_fallback() {
        // หมายเหตุ: _createFromStringFallbacks มาจาก superclass ซึ่งไม่ปรากฏในซอร์สที่ให้มา
        StdValueInstantiator inst = newInstantiator(String.class);
        try {
            inst.createFromString(ctxt, "abc");
        } catch (Throwable ignored) {
        }
    }

    @Test
    public void createFromString_success() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        when(creator.call1("abc")).thenReturn("created");
        inst.configureFromStringCreator(creator);

        Object result = inst.createFromString(ctxt, "abc");
        assertEquals("created", result);
    }

    @Test
    public void createFromString_exception_delegatesToHandleInstantiationProblem() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        when(creator.getDeclaringClass()).thenReturn(String.class);
        when(creator.call1("abc")).thenThrow(new RuntimeException("boom"));
        inst.configureFromStringCreator(creator);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);
        when(ctxt.handleInstantiationProblem(eq(String.class), eq("abc"), eq(jme))).thenReturn("handled");

        Object result = inst.createFromString(ctxt, "abc");
        assertEquals("handled", result);
    }

    // ===================== createFromInt =====================

    @Test
    public void createFromInt_intCreatorPresent_success() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams intCreator = mock(AnnotatedWithParams.class);
        when(intCreator.call1(Integer.valueOf(5))).thenReturn("fromInt");
        inst.configureFromIntCreator(intCreator);

        Object result = inst.createFromInt(ctxt, 5);
        assertEquals("fromInt", result);
    }

    @Test
    public void createFromInt_intCreatorPresent_exception() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams intCreator = mock(AnnotatedWithParams.class);
        when(intCreator.getDeclaringClass()).thenReturn(String.class);
        when(intCreator.call1(Integer.valueOf(5))).thenThrow(new RuntimeException("boom"));
        inst.configureFromIntCreator(intCreator);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);
        when(ctxt.handleInstantiationProblem(eq(String.class), eq(Integer.valueOf(5)), eq(jme))).thenReturn("handled");

        Object result = inst.createFromInt(ctxt, 5);
        assertEquals("handled", result);
    }

    @Test
    public void createFromInt_noIntCreator_fallsBackToLongCreator_success() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        when(longCreator.call1(Long.valueOf(7))).thenReturn("fromLong");
        inst.configureFromLongCreator(longCreator);

        Object result = inst.createFromInt(ctxt, 7);
        assertEquals("fromLong", result);
    }

    @Test
    public void createFromInt_noIntCreator_fallsBackToLongCreator_exception() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        when(longCreator.getDeclaringClass()).thenReturn(String.class);
        when(longCreator.call1(Long.valueOf(7))).thenThrow(new RuntimeException("boom"));
        inst.configureFromLongCreator(longCreator);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);
        when(ctxt.handleInstantiationProblem(eq(String.class), eq(Long.valueOf(7)), eq(jme))).thenReturn("handled");

        Object result = inst.createFromInt(ctxt, 7);
        assertEquals("handled", result);
    }

    @Test
    public void createFromInt_noCreatorsAtAll_delegatesToSuperclass() {
        StdValueInstantiator inst = newInstantiator(String.class);
        try {
            inst.createFromInt(ctxt, 1);
        } catch (Throwable ignored) {
        }
    }

    // ===================== createFromLong =====================

    @Test
    public void createFromLong_noCreator_delegatesToSuperclass() {
        StdValueInstantiator inst = newInstantiator(String.class);
        try {
            inst.createFromLong(ctxt, 1L);
        } catch (Throwable ignored) {
        }
    }

    @Test
    public void createFromLong_success() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        when(longCreator.call1(Long.valueOf(42))).thenReturn("fromLong");
        inst.configureFromLongCreator(longCreator);

        Object result = inst.createFromLong(ctxt, 42L);
        assertEquals("fromLong", result);
    }

    @Test
    public void createFromLong_exception() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        when(longCreator.getDeclaringClass()).thenReturn(String.class);
        when(longCreator.call1(Long.valueOf(42))).thenThrow(new RuntimeException("boom"));
        inst.configureFromLongCreator(longCreator);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);
        when(ctxt.handleInstantiationProblem(eq(String.class), eq(Long.valueOf(42)), eq(jme))).thenReturn("handled");

        Object result = inst.createFromLong(ctxt, 42L);
        assertEquals("handled", result);
    }

    // ===================== createFromDouble =====================

    @Test
    public void createFromDouble_noCreator_delegatesToSuperclass() {
        StdValueInstantiator inst = newInstantiator(String.class);
        try {
            inst.createFromDouble(ctxt, 1.0d);
        } catch (Throwable ignored) {
        }
    }

    @Test
    public void createFromDouble_success() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams doubleCreator = mock(AnnotatedWithParams.class);
        when(doubleCreator.call1(Double.valueOf(3.14))).thenReturn("fromDouble");
        inst.configureFromDoubleCreator(doubleCreator);

        Object result = inst.createFromDouble(ctxt, 3.14d);
        assertEquals("fromDouble", result);
    }

    @Test
    public void createFromDouble_exception() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams doubleCreator = mock(AnnotatedWithParams.class);
        when(doubleCreator.getDeclaringClass()).thenReturn(String.class);
        when(doubleCreator.call1(Double.valueOf(3.14))).thenThrow(new RuntimeException("boom"));
        inst.configureFromDoubleCreator(doubleCreator);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);
        when(ctxt.handleInstantiationProblem(eq(String.class), eq(Double.valueOf(3.14)), eq(jme))).thenReturn("handled");

        Object result = inst.createFromDouble(ctxt, 3.14d);
        assertEquals("handled", result);
    }

    // ===================== createFromBoolean =====================

    @Test
    public void createFromBoolean_noCreator_delegatesToSuperclass() {
        StdValueInstantiator inst = newInstantiator(String.class);
        try {
            inst.createFromBoolean(ctxt, true);
        } catch (Throwable ignored) {
        }
    }

    @Test
    public void createFromBoolean_success() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams boolCreator = mock(AnnotatedWithParams.class);
        when(boolCreator.call1(Boolean.TRUE)).thenReturn("fromBoolean");
        inst.configureFromBooleanCreator(boolCreator);

        Object result = inst.createFromBoolean(ctxt, true);
        assertEquals("fromBoolean", result);
    }

    @Test
    public void createFromBoolean_exception() throws Exception {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams boolCreator = mock(AnnotatedWithParams.class);
        when(boolCreator.getDeclaringClass()).thenReturn(String.class);
        when(boolCreator.call1(Boolean.TRUE)).thenThrow(new RuntimeException("boom"));
        inst.configureFromBooleanCreator(boolCreator);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);
        when(ctxt.handleInstantiationProblem(eq(String.class), eq(Boolean.TRUE), eq(jme))).thenReturn("handled");

        Object result = inst.createFromBoolean(ctxt, true);
        assertEquals("handled", result);
    }

    // ===================== Getters =====================

    @Test
    public void getters_returnConfiguredCreatorsAndParameter() {
        StdValueInstantiator inst = newInstantiator(String.class);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams arrayDelegateCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams defaultCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams withArgsCreator = mock(AnnotatedWithParams.class);
        AnnotatedParameter param = mock(AnnotatedParameter.class);

        inst.configureFromObjectSettings(defaultCreator, delegateCreator, null, null, withArgsCreator, null);
        inst.configureFromArraySettings(arrayDelegateCreator, null, null);
        inst.configureIncompleteParameter(param);

        assertSame(delegateCreator, inst.getDelegateCreator());
        assertSame(arrayDelegateCreator, inst.getArrayDelegateCreator());
        assertSame(defaultCreator, inst.getDefaultCreator());
        assertSame(withArgsCreator, inst.getWithArgsCreator());
        assertSame(param, inst.getIncompleteParameter());
    }

    // ===================== wrapException (deprecated) =====================

    @Test
    public void wrapException_throwableIsJsonMappingException_returnsSameInstance() {
        StdValueInstantiator inst = newInstantiator(String.class);
        JsonMappingException jme = mock(JsonMappingException.class);
        JsonMappingException result = inst.wrapException(jme);
        assertSame(jme, result);
    }

    @Test
    public void wrapException_causeChainContainsJsonMappingException_returnsThatCause() {
        StdValueInstantiator inst = newInstantiator(String.class);
        JsonMappingException jme = mock(JsonMappingException.class);
        Exception wrapper = new Exception("outer", jme);
        JsonMappingException result = inst.wrapException(wrapper);
        assertSame(jme, result);
    }

    @Test
    public void wrapException_noJsonMappingExceptionInChain_wrapsNewInstanceWithMessage() {
        StdValueInstantiator inst = newInstantiator(String.class);
        RuntimeException plain = new RuntimeException("plain fail");
        JsonMappingException result = inst.wrapException(plain);
        assertNotNull(result);
        assertTrue(result.getMessage().contains(inst.getValueTypeDesc()));
        assertTrue(result.getMessage().contains("plain fail"));
    }

    // ===================== unwrapAndWrapException =====================

    @Test
    public void unwrapAndWrapException_throwableIsJsonMappingException_returnsSameInstance() {
        StdValueInstantiator inst = newInstantiator(String.class);
        JsonMappingException jme = mock(JsonMappingException.class);
        JsonMappingException result = inst.unwrapAndWrapException(ctxt, jme);
        assertSame(jme, result);
    }

    @Test
    public void unwrapAndWrapException_causeChainContainsJsonMappingException_returnsThatCause() {
        StdValueInstantiator inst = newInstantiator(String.class);
        JsonMappingException jme = mock(JsonMappingException.class);
        Exception wrapper = new Exception("outer", jme);
        JsonMappingException result = inst.unwrapAndWrapException(ctxt, wrapper);
        assertSame(jme, result);
    }

    @Test
    public void unwrapAndWrapException_noJsonMappingExceptionInChain_usesCtxtInstantiationException() {
        StdValueInstantiator inst = newInstantiator(String.class);
        RuntimeException plain = new RuntimeException("plain fail");
        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(String.class, plain)).thenReturn(jme);

        JsonMappingException result = inst.unwrapAndWrapException(ctxt, plain);
        assertSame(jme, result);
    }

    // ===================== wrapAsJsonMappingException =====================

    @Test
    public void wrapAsJsonMappingException_alreadyJsonMappingException_returnsSameInstance() {
        StdValueInstantiator inst = newInstantiator(String.class);
        JsonMappingException jme = mock(JsonMappingException.class);
        JsonMappingException result = inst.wrapAsJsonMappingException(ctxt, jme);
        assertSame(jme, result);
    }

    @Test
    public void wrapAsJsonMappingException_otherThrowable_usesCtxtInstantiationException() {
        StdValueInstantiator inst = newInstantiator(String.class);
        RuntimeException plain = new RuntimeException("plain fail");
        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(String.class, plain)).thenReturn(jme);

        JsonMappingException result = inst.wrapAsJsonMappingException(ctxt, plain);
        assertSame(jme, result);
    }

    // ===================== rewrapCtorProblem =====================

    @Test
    public void rewrapCtorProblem_invocationTargetExceptionWithCause_unwrapsCause() {
        StdValueInstantiator inst = newInstantiator(String.class);
        RuntimeException realCause = new RuntimeException("real cause");
        InvocationTargetException ite = new InvocationTargetException(realCause);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, ite);

        assertSame(jme, result);
        ArgumentCaptor<Throwable> captor = ArgumentCaptor.forClass(Throwable.class);
        verify(ctxt).instantiationException(eq(String.class), captor.capture());
        assertSame(realCause, captor.getValue());
    }

    @Test
    public void rewrapCtorProblem_invocationTargetExceptionNullCause_keepsOriginal() {
        StdValueInstantiator inst = newInstantiator(String.class);
        InvocationTargetException ite = new InvocationTargetException(null);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, ite);

        assertSame(jme, result);
        ArgumentCaptor<Throwable> captor = ArgumentCaptor.forClass(Throwable.class);
        verify(ctxt).instantiationException(eq(String.class), captor.capture());
        assertSame(ite, captor.getValue());
    }

    @Test
    public void rewrapCtorProblem_exceptionInInitializerErrorWithCause_unwrapsCause() {
        StdValueInstantiator inst = newInstantiator(String.class);
        RuntimeException realCause = new RuntimeException("init fail");
        ExceptionInInitializerError err = new ExceptionInInitializerError(realCause);

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, err);

        assertSame(jme, result);
        ArgumentCaptor<Throwable> captor = ArgumentCaptor.forClass(Throwable.class);
        verify(ctxt).instantiationException(eq(String.class), captor.capture());
        assertSame(realCause, captor.getValue());
    }

    @Test
    public void rewrapCtorProblem_plainException_noUnwrapping() {
        StdValueInstantiator inst = newInstantiator(String.class);
        RuntimeException plain = new RuntimeException("plain");

        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), any(Throwable.class))).thenReturn(jme);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, plain);

        assertSame(jme, result);
        ArgumentCaptor<Throwable> captor = ArgumentCaptor.forClass(Throwable.class);
        verify(ctxt).instantiationException(eq(String.class), captor.capture());
        assertSame(plain, captor.getValue());
    }

    @Test
    public void rewrapCtorProblem_alreadyJsonMappingException_returnsSameInstance() {
        StdValueInstantiator inst = newInstantiator(String.class);
        JsonMappingException jme = mock(JsonMappingException.class);
        JsonMappingException result = inst.rewrapCtorProblem(ctxt, jme);
        assertSame(jme, result);
    }
}
```

## สรุปตาราง Test coverage

| กลุ่มเมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `deprecatedConstructor_*`, `javaTypeConstructor_*` | `valueType == null` vs `!= null` ในทั้งสอง constructor |
| `copyConstructor_copiesAllConfiguredFields` | copy-constructor คัดลอกทุก field (defaultCreator, delegateCreator, withArgsCreator, arrayDelegateCreator, scalar creators) |
| `configureFromObjectSettings_*`, `configureFromArraySettings_*`, `configureFromXxxCreator_*`, `configureIncompleteParameter_*` | setter ทุกตัว + flag `canCreateXxx()` true/false |
| `canInstantiate_*` (10 เมธอด) | OR-chain ทั้ง 9 เงื่อนไขใน `canInstantiate()` ทั้งกรณี all-false และแต่ละเงื่อนไข true |
| `createUsingDefault_*` | `_defaultCreator == null` (fallback), success, exception → `handleInstantiationProblem` |
| `createFromObjectWith_*` | เหมือนกันกับ `createUsingDefault` แต่ส่ง args array |
| `createUsingDelegate_*` | `_delegateCreator==null && _arrayDelegateCreator==null` (throw), `==null && !=null` (array fallback), `!=null` (ปกติ), args-array loop (null prop / injectable prop), exception path |
| `createUsingArrayDelegate_*` | `_arrayDelegateCreator==null && _delegateCreator!=null` (fallback), ทั้งคู่ null (throw), `!=null` (ปกติ) |
| `createFromString_*` | creator null (fallback, ไม่ assert), success, exception |
| `createFromInt_*` (5 เมธอด) | intCreator present (success/exception), int null→long present (success/exception), ทั้งคู่ null (fallback) |
| `createFromLong_*`, `createFromDouble_*`, `createFromBoolean_*` | creator null (fallback), success, exception — ต่อหนึ่งเมธอดละ 3 กรณี |
| `getters_returnConfiguredCreatorsAndParameter` | getter ทุกตัวคืนค่าที่ configure ไว้ |
| `wrapException_*` (deprecated) | t เป็น JME เอง, cause-chain มี JME, ไม่มี JME ในสาย (wrap ใหม่) |
| `unwrapAndWrapException_*` | เหมือนกันแต่ fallback ใช้ `ctxt.instantiationException` |
| `wrapAsJsonMappingException_*` | t instanceof JME vs ไม่ใช่ |
| `rewrapCtorProblem_*` (6 เมธอด) | `InvocationTargetException` (cause!=null / cause==null), `ExceptionInInitializerError` (cause!=null), exception ธรรมดา (ไม่ unwrap), t เป็น JME อยู่แล้ว |

**หมายเหตุสำคัญ:** เคส `*_noCreator_delegatesToSuperclass` และ `createFromString_noCreator_fallback` เรียก method เพื่อ execute branch ที่เกี่ยวกับ `super.xxx(...)` / `_createFromStringFallbacks(...)` ซึ่ง implementation อยู่ใน superclass (`ValueInstantiator`) ที่ไม่ได้แสดงในซอร์สที่ให้มา จึงจับด้วย `catch (Throwable ignored)` โดยไม่ assert ผลลัพธ์ เพื่อไม่เดา behavior ตามข้อกำหนด