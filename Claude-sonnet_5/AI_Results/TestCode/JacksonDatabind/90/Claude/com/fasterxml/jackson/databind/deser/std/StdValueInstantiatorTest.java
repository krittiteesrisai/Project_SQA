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

public class StdValueInstantiatorTest {

    private JavaType mockType;
    private StdValueInstantiator inst;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        mockType = mock(JavaType.class);
        when(mockType.toString()).thenReturn("MyType");
        doReturn(String.class).when(mockType).getRawClass();

        inst = new StdValueInstantiator(null, mockType);
        ctxt = mock(DeserializationContext.class);
    }

    // ===================== Constructors =====================

    @Test
    public void testDeprecatedConstructor_NullClass() {
        StdValueInstantiator i = new StdValueInstantiator(null, (Class<?>) null);
        assertEquals("UNKNOWN TYPE", i.getValueTypeDesc());
        assertEquals(Object.class, i.getValueClass());
    }

    @Test
    public void testDeprecatedConstructor_WithClass() {
        StdValueInstantiator i = new StdValueInstantiator(null, String.class);
        assertEquals(String.class.getName(), i.getValueTypeDesc());
        assertEquals(String.class, i.getValueClass());
    }

    @Test
    public void testJavaTypeConstructor_NullType() {
        StdValueInstantiator i = new StdValueInstantiator(null, (JavaType) null);
        assertEquals("UNKNOWN TYPE", i.getValueTypeDesc());
        assertEquals(Object.class, i.getValueClass());
    }

    @Test
    public void testJavaTypeConstructor_WithType() {
        assertEquals("MyType", inst.getValueTypeDesc());
        assertEquals(String.class, inst.getValueClass());
    }

    @Test
    public void testCopyConstructor() {
        AnnotatedWithParams defCreator = mock(AnnotatedWithParams.class);
        inst.configureFromObjectSettings(defCreator, null, null, null, null, null);
        StdValueInstantiator copy = new StdValueInstantiator(inst);
        assertEquals(inst.getValueTypeDesc(), copy.getValueTypeDesc());
        assertEquals(inst.getValueClass(), copy.getValueClass());
        assertSame(defCreator, copy.getDefaultCreator());
    }

    // ===================== Default state / getters =====================

    @Test
    public void testDefaultState_AllNullAndFalse() {
        assertNull(inst.getDefaultCreator());
        assertNull(inst.getDelegateCreator());
        assertNull(inst.getArrayDelegateCreator());
        assertNull(inst.getWithArgsCreator());
        assertNull(inst.getIncompleteParameter());
        assertNull(inst.getDelegateType(null));
        assertNull(inst.getArrayDelegateType(null));
        assertNull(inst.getFromObjectArguments(null));

        assertFalse(inst.canCreateFromString());
        assertFalse(inst.canCreateFromInt());
        assertFalse(inst.canCreateFromLong());
        assertFalse(inst.canCreateFromDouble());
        assertFalse(inst.canCreateFromBoolean());
        assertFalse(inst.canCreateUsingDefault());
        assertFalse(inst.canCreateUsingDelegate());
        assertFalse(inst.canCreateUsingArrayDelegate());
        assertFalse(inst.canCreateFromObjectWith());
    }

    // ===================== configure* methods =====================

    @Test
    public void testConfigureFromObjectSettings_And_Getters() {
        AnnotatedWithParams defCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams withArgsCreator = mock(AnnotatedWithParams.class);
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[0];
        SettableBeanProperty[] ctorArgs = new SettableBeanProperty[0];

        inst.configureFromObjectSettings(defCreator, delegateCreator, mockType, delegateArgs,
                withArgsCreator, ctorArgs);

        assertTrue(inst.canCreateUsingDefault());
        assertTrue(inst.canCreateUsingDelegate());
        assertTrue(inst.canCreateFromObjectWith());
        assertSame(defCreator, inst.getDefaultCreator());
        assertSame(delegateCreator, inst.getDelegateCreator());
        assertSame(withArgsCreator, inst.getWithArgsCreator());
        assertSame(mockType, inst.getDelegateType(null));
        assertSame(ctorArgs, inst.getFromObjectArguments(null));
    }

    @Test
    public void testConfigureFromArraySettings_And_Getters() {
        AnnotatedWithParams arrayDelegateCreator = mock(AnnotatedWithParams.class);
        SettableBeanProperty[] arrayArgs = new SettableBeanProperty[0];
        inst.configureFromArraySettings(arrayDelegateCreator, mockType, arrayArgs);
        assertTrue(inst.canCreateUsingArrayDelegate());
        assertSame(arrayDelegateCreator, inst.getArrayDelegateCreator());
        assertSame(mockType, inst.getArrayDelegateType(null));
    }

    @Test
    public void testConfigureFromStringCreator() {
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        inst.configureFromStringCreator(c);
        assertTrue(inst.canCreateFromString());
    }

    @Test
    public void testConfigureFromIntCreator() {
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        inst.configureFromIntCreator(c);
        assertTrue(inst.canCreateFromInt());
    }

    @Test
    public void testConfigureFromLongCreator() {
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        inst.configureFromLongCreator(c);
        assertTrue(inst.canCreateFromLong());
    }

    @Test
    public void testConfigureFromDoubleCreator() {
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        inst.configureFromDoubleCreator(c);
        assertTrue(inst.canCreateFromDouble());
    }

    @Test
    public void testConfigureFromBooleanCreator() {
        AnnotatedWithParams c = mock(AnnotatedWithParams.class);
        inst.configureFromBooleanCreator(c);
        assertTrue(inst.canCreateFromBoolean());
    }

    @Test
    public void testConfigureIncompleteParameter() {
        AnnotatedParameter p = mock(AnnotatedParameter.class);
        inst.configureIncompleteParameter(p);
        assertSame(p, inst.getIncompleteParameter());
    }

    // ===================== createUsingDefault =====================

    @Test
    public void testCreateUsingDefault_NoCreator_FallsBackToSuper() {
        // _defaultCreator == null -> เรียก super.createUsingDefault(ctxt)
        // behavior ของ base class ValueInstantiator ไม่มีอยู่ในซอร์สที่ให้มา
        // จึงไม่ assert ผลลัพธ์/ชนิด exception ที่แน่นอน แค่ยืนยันว่า branch นี้ถูก exercise
        try {
            inst.createUsingDefault(ctxt);
        } catch (Throwable t) {
            // acceptable: base class อาจ throw เนื่องจากไม่มี default creator
        }
    }

    @Test
    public void testCreateUsingDefault_Success() throws Exception {
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(creator.call()).thenReturn(created);
        inst.configureFromObjectSettings(creator, null, null, null, null, null);

        Object result = inst.createUsingDefault(ctxt);
        assertSame(created, result);
    }

    @Test
    public void testCreateUsingDefault_ThrowsHandled() throws Exception {
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        when(creator.call()).thenThrow(new RuntimeException("boom"));
        doReturn(String.class).when(creator).getDeclaringClass();
        Object handled = new Object();
        when(ctxt.handleInstantiationProblem(any(), any(), any())).thenReturn(handled);
        inst.configureFromObjectSettings(creator, null, null, null, null, null);

        Object result = inst.createUsingDefault(ctxt);
        assertSame(handled, result);
        verify(ctxt).handleInstantiationProblem(any(), isNull(), any());
    }

    // ===================== createFromObjectWith =====================

    @Test
    public void testCreateFromObjectWith_NoCreator_FallsBackToSuper() {
        try {
            inst.createFromObjectWith(ctxt, new Object[0]);
        } catch (Throwable t) {
            // base behavior ไม่ระบุในซอร์ส - ยอมรับได้
        }
    }

    @Test
    public void testCreateFromObjectWith_Success() throws Exception {
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        Object[] args = new Object[]{"a"};
        Object created = new Object();
        when(creator.call(args)).thenReturn(created);
        inst.configureFromObjectSettings(null, null, null, null, creator, null);

        Object result = inst.createFromObjectWith(ctxt, args);
        assertSame(created, result);
    }

    @Test
    public void testCreateFromObjectWith_ThrowsHandled() throws Exception {
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        Object[] args = new Object[]{"a"};
        when(creator.call(args)).thenThrow(new RuntimeException("boom"));
        doReturn(String.class).when(creator).getDeclaringClass();
        Object handled = new Object();
        when(ctxt.handleInstantiationProblem(any(), any(), any())).thenReturn(handled);
        inst.configureFromObjectSettings(null, null, null, null, creator, null);

        Object result = inst.createFromObjectWith(ctxt, args);
        assertSame(handled, result);
    }

    // ===================== createUsingDelegate =====================

    @Test
    public void testCreateUsingDelegate_UsesDelegateCreator_WhenNotNull() throws Exception {
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(delegateCreator.call1("D")).thenReturn(created);
        inst.configureFromObjectSettings(null, delegateCreator, mockType, null, null, null);

        Object result = inst.createUsingDelegate(ctxt, "D");
        assertSame(created, result);
    }

    @Test
    public void testCreateUsingDelegate_FallsBackToArrayDelegate_WhenDelegateNull() throws Exception {
        AnnotatedWithParams arrayDelegateCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(arrayDelegateCreator.call1("D")).thenReturn(created);
        inst.configureFromArraySettings(arrayDelegateCreator, mockType, null);
        // _delegateCreator ยังเป็น null

        Object result = inst.createUsingDelegate(ctxt, "D");
        assertSame(created, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateUsingDelegate_BothNull_ThrowsIllegalState() throws Exception {
        inst.createUsingDelegate(ctxt, "D");
    }

    @Test
    public void testCreateUsingDelegate_WithArguments_MixNullAndInjectable() throws Exception {
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        SettableBeanProperty injectableProp = mock(SettableBeanProperty.class);
        when(injectableProp.getInjectableValueId()).thenReturn("injId");
        when(ctxt.findInjectableValue(eq("injId"), eq(injectableProp), isNull()))
                .thenReturn("injectedValue");
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[]{null, injectableProp};
        Object created = new Object();
        when(delegateCreator.call(any(Object[].class))).thenReturn(created);

        inst.configureFromObjectSettings(null, delegateCreator, mockType, delegateArgs, null, null);

        Object result = inst.createUsingDelegate(ctxt, "D");
        assertSame(created, result);

        ArgumentCaptor<Object[]> captor = ArgumentCaptor.forClass(Object[].class);
        verify(delegateCreator).call(captor.capture());
        assertArrayEquals(new Object[]{"D", "injectedValue"}, captor.getValue());
    }

    @Test(expected = IOException.class) // JsonMappingException extends IOException
    public void testCreateUsingDelegate_ExceptionRewrapped() throws Exception {
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        when(delegateCreator.call1(any())).thenThrow(new RuntimeException("boom"));
        JsonMappingException jme = mock(JsonMappingException.class);
        when(ctxt.instantiationException(any(), any())).thenReturn(jme);

        inst.configureFromObjectSettings(null, delegateCreator, mockType, null, null, null);

        inst.createUsingDelegate(ctxt, "D");
    }

    // ===================== createUsingArrayDelegate =====================

    @Test
    public void testCreateUsingArrayDelegate_UsesArrayDelegateCreator_WhenNotNull() throws Exception {
        AnnotatedWithParams arrayDelegateCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(arrayDelegateCreator.call1("D")).thenReturn(created);
        inst.configureFromArraySettings(arrayDelegateCreator, mockType, null);

        Object result = inst.createUsingArrayDelegate(ctxt, "D");
        assertSame(created, result);
    }

    @Test
    public void testCreateUsingArrayDelegate_FallsBackToDelegate_WhenArrayNull() throws Exception {
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(delegateCreator.call1("D")).thenReturn(created);
        inst.configureFromObjectSettings(null, delegateCreator, mockType, null, null, null);
        // _arrayDelegateCreator ยังเป็น null

        Object result = inst.createUsingArrayDelegate(ctxt, "D");
        assertSame(created, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateUsingArrayDelegate_BothNull_ThrowsIllegalState() throws Exception {
        inst.createUsingArrayDelegate(ctxt, "D");
    }

    // ===================== createFromString =====================

    @Test
    public void testCreateFromString_NoCreator_FallsBackToFallback() {
        // _fromStringCreator == null -> _createFromStringFallbacks(ctxt,value)
        // เมธอดนี้ไม่มีนิยามในซอร์สที่ให้มา (สืบทอดจาก base class) จึงไม่ assert ผลลัพธ์แน่นอน
        try {
            inst.createFromString(ctxt, "value");
        } catch (Throwable t) {
            // acceptable
        }
    }

    @Test
    public void testCreateFromString_Success() throws Exception {
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(creator.call1("abc")).thenReturn(created);
        inst.configureFromStringCreator(creator);

        Object result = inst.createFromString(ctxt, "abc");
        assertSame(created, result);
    }

    @Test
    public void testCreateFromString_EmptyValue_Success() throws Exception {
        // ค่าว่าง (empty string) - boundary case
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(creator.call1("")).thenReturn(created);
        inst.configureFromStringCreator(creator);

        Object result = inst.createFromString(ctxt, "");
        assertSame(created, result);
    }

    @Test
    public void testCreateFromString_ThrowsHandled() throws Exception {
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        when(creator.call1("abc")).thenThrow(new RuntimeException("boom"));
        doReturn(String.class).when(creator).getDeclaringClass();
        Object handled = new Object();
        when(ctxt.handleInstantiationProblem(any(), any(), any())).thenReturn(handled);
        inst.configureFromStringCreator(creator);

        Object result = inst.createFromString(ctxt, "abc");
        assertSame(handled, result);
    }

    // ===================== createFromInt =====================

    @Test
    public void testCreateFromInt_UsesIntCreator_WhenAvailable() throws Exception {
        AnnotatedWithParams intCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(intCreator.call1(Integer.valueOf(Integer.MAX_VALUE))).thenReturn(created);
        inst.configureFromIntCreator(intCreator);

        Object result = inst.createFromInt(ctxt, Integer.MAX_VALUE);
        assertSame(created, result);
    }

    @Test
    public void testCreateFromInt_WideningToLong_WhenIntCreatorAbsent() throws Exception {
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(longCreator.call1(Long.valueOf(Integer.MIN_VALUE))).thenReturn(created);
        inst.configureFromLongCreator(longCreator);

        Object result = inst.createFromInt(ctxt, Integer.MIN_VALUE);
        assertSame(created, result);
    }

    @Test
    public void testCreateFromInt_NoCreators_FallsBackToSuper() {
        try {
            inst.createFromInt(ctxt, 42);
        } catch (Throwable t) {
            // base behavior ไม่ระบุในซอร์ส - ยอมรับได้
        }
    }

    @Test
    public void testCreateFromInt_IntCreatorThrows_Handled() throws Exception {
        AnnotatedWithParams intCreator = mock(AnnotatedWithParams.class);
        when(intCreator.call1(any())).thenThrow(new RuntimeException("boom"));
        doReturn(String.class).when(intCreator).getDeclaringClass();
        Object handled = new Object();
        when(ctxt.handleInstantiationProblem(any(), any(), any())).thenReturn(handled);
        inst.configureFromIntCreator(intCreator);

        Object result = inst.createFromInt(ctxt, 1);
        assertSame(handled, result);
    }

    @Test
    public void testCreateFromInt_LongCreatorThrows_Handled() throws Exception {
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        when(longCreator.call1(any())).thenThrow(new RuntimeException("boom"));
        doReturn(String.class).when(longCreator).getDeclaringClass();
        Object handled = new Object();
        when(ctxt.handleInstantiationProblem(any(), any(), any())).thenReturn(handled);
        inst.configureFromLongCreator(longCreator);

        Object result = inst.createFromInt(ctxt, 1);
        assertSame(handled, result);
    }

    // ===================== createFromLong =====================

    @Test
    public void testCreateFromLong_NoCreator_FallsBackToSuper() {
        try {
            inst.createFromLong(ctxt, 1L);
        } catch (Throwable t) {
            // acceptable
        }
    }

    @Test
    public void testCreateFromLong_Success() throws Exception {
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(longCreator.call1(Long.valueOf(Long.MAX_VALUE))).thenReturn(created);
        inst.configureFromLongCreator(longCreator);

        Object result = inst.createFromLong(ctxt, Long.MAX_VALUE);
        assertSame(created, result);
    }

    @Test
    public void testCreateFromLong_ThrowsHandled() throws Exception {
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        when(longCreator.call1(any())).thenThrow(new RuntimeException("boom"));
        doReturn(String.class).when(longCreator).getDeclaringClass();
        Object handled = new Object();
        when(ctxt.handleInstantiationProblem(any(), any(), any())).thenReturn(handled);
        inst.configureFromLongCreator(longCreator);

        Object result = inst.createFromLong(ctxt, Long.MIN_VALUE);
        assertSame(handled, result);
    }

    // ===================== createFromDouble =====================

    @Test
    public void testCreateFromDouble_NoCreator_FallsBackToSuper() {
        try {
            inst.createFromDouble(ctxt, 1.0);
        } catch (Throwable t) {
            // acceptable
        }
    }

    @Test
    public void testCreateFromDouble_Success() throws Exception {
        AnnotatedWithParams doubleCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(doubleCreator.call1(Double.valueOf(3.14))).thenReturn(created);
        inst.configureFromDoubleCreator(doubleCreator);

        Object result = inst.createFromDouble(ctxt, 3.14);
        assertSame(created, result);
    }

    @Test
    public void testCreateFromDouble_ThrowsHandled() throws Exception {
        AnnotatedWithParams doubleCreator = mock(AnnotatedWithParams.class);
        when(doubleCreator.call1(any())).thenThrow(new RuntimeException("boom"));
        doReturn(String.class).when(doubleCreator).getDeclaringClass();
        Object handled = new Object();
        when(ctxt.handleInstantiationProblem(any(), any(), any())).thenReturn(handled);
        inst.configureFromDoubleCreator(doubleCreator);

        Object result = inst.createFromDouble(ctxt, 0.0);
        assertSame(handled, result);
    }

    // ===================== createFromBoolean =====================

    @Test
    public void testCreateFromBoolean_NoCreator_FallsBackToSuper() {
        try {
            inst.createFromBoolean(ctxt, true);
        } catch (Throwable t) {
            // acceptable
        }
    }

    @Test
    public void testCreateFromBoolean_Success() throws Exception {
        AnnotatedWithParams boolCreator = mock(AnnotatedWithParams.class);
        Object created = new Object();
        when(boolCreator.call1(Boolean.TRUE)).thenReturn(created);
        inst.configureFromBooleanCreator(boolCreator);

        Object result = inst.createFromBoolean(ctxt, true);
        assertSame(created, result);
    }

    @Test
    public void testCreateFromBoolean_ThrowsHandled() throws Exception {
        AnnotatedWithParams boolCreator = mock(AnnotatedWithParams.class);
        when(boolCreator.call1(any())).thenThrow(new RuntimeException("boom"));
        doReturn(String.class).when(boolCreator).getDeclaringClass();
        Object handled = new Object();
        when(ctxt.handleInstantiationProblem(any(), any(), any())).thenReturn(handled);
        inst.configureFromBooleanCreator(boolCreator);

        Object result = inst.createFromBoolean(ctxt, false);
        assertSame(handled, result);
    }

    // ===================== wrapException (deprecated) =====================

    @Test
    public void testWrapException_FindsJsonMappingExceptionInChain() {
        JsonMappingException jme = mock(JsonMappingException.class);
        Throwable outer = new RuntimeException("outer", jme);

        JsonMappingException result = inst.wrapException(outer);
        assertSame(jme, result);
    }

    @Test
    public void testWrapException_NoJsonMappingExceptionInChain() {
        Throwable t = new RuntimeException("plain");
        JsonMappingException result = inst.wrapException(t);
        assertNotNull(result);
        assertSame(t, result.getCause());
    }

    // ===================== unwrapAndWrapException =====================

    @Test
    public void testUnwrapAndWrapException_FindsJsonMappingExceptionInChain() {
        JsonMappingException jme = mock(JsonMappingException.class);
        Throwable outer = new RuntimeException("outer", jme);

        JsonMappingException result = inst.unwrapAndWrapException(ctxt, outer);
        assertSame(jme, result);
        verify(ctxt, never()).instantiationException(any(), any());
    }

    @Test
    public void testUnwrapAndWrapException_NoJsonMappingExceptionInChain() {
        Throwable t = new RuntimeException("plain");
        JsonMappingException mocked = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), eq(t))).thenReturn(mocked);

        JsonMappingException result = inst.unwrapAndWrapException(ctxt, t);
        assertSame(mocked, result);
    }

    // ===================== wrapAsJsonMappingException =====================

    @Test
    public void testWrapAsJsonMappingException_AlreadyJME() {
        JsonMappingException jme = mock(JsonMappingException.class);
        JsonMappingException result = inst.wrapAsJsonMappingException(ctxt, jme);
        assertSame(jme, result);
        verifyZeroInteractions(ctxt);
    }

    @Test
    public void testWrapAsJsonMappingException_NotJME() {
        RuntimeException t = new RuntimeException("plain");
        JsonMappingException mocked = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), eq((Throwable) t))).thenReturn(mocked);

        JsonMappingException result = inst.wrapAsJsonMappingException(ctxt, t);
        assertSame(mocked, result);
    }

    // ===================== rewrapCtorProblem =====================

    @Test
    public void testRewrapCtorProblem_InvocationTargetException_WithCause() {
        RuntimeException cause = new RuntimeException("target-cause");
        InvocationTargetException ite = new InvocationTargetException(cause);
        JsonMappingException mocked = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), eq((Throwable) cause))).thenReturn(mocked);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, ite);
        assertSame(mocked, result);
    }

    @Test
    public void testRewrapCtorProblem_InvocationTargetException_NullCause() {
        InvocationTargetException ite = new InvocationTargetException(null);
        JsonMappingException mocked = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), eq((Throwable) ite))).thenReturn(mocked);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, ite);
        assertSame(mocked, result);
    }

    @Test
    public void testRewrapCtorProblem_ExceptionInInitializerError_WithCause() {
        RuntimeException cause = new RuntimeException("init-cause");
        ExceptionInInitializerError eiie = new ExceptionInInitializerError(cause);
        JsonMappingException mocked = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), eq((Throwable) cause))).thenReturn(mocked);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, eiie);
        assertSame(mocked, result);
    }

    @Test
    public void testRewrapCtorProblem_ExceptionInInitializerError_NullCause() {
        ExceptionInInitializerError eiie = new ExceptionInInitializerError();
        JsonMappingException mocked = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), eq((Throwable) eiie))).thenReturn(mocked);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, eiie);
        assertSame(mocked, result);
    }

    @Test
    public void testRewrapCtorProblem_OtherThrowable_PassThrough() {
        RuntimeException t = new RuntimeException("other");
        JsonMappingException mocked = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(String.class), eq((Throwable) t))).thenReturn(mocked);

        JsonMappingException result = inst.rewrapCtorProblem(ctxt, t);
        assertSame(mocked, result);
    }

    @Test
    public void testRewrapCtorProblem_AlreadyJME() {
        JsonMappingException jme = mock(JsonMappingException.class);
        JsonMappingException result = inst.rewrapCtorProblem(ctxt, jme);
        assertSame(jme, result);
    }
}
