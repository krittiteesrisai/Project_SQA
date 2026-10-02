package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@SuppressWarnings("unchecked")
public class InnerClassPropertyTest {

    // ใช้เป็น non-static inner class จริง เพื่อให้ได้ Constructor<?> ที่ใช้งานได้จริงกับ newInstance(outer)
    public class Inner {
        public Inner() { }
    }

    @Deprecated
    static class DeprecatedMarker { }

    private SettableBeanProperty mockDelegate;
    private Constructor<?> ctor;
    private JsonParser mockParser;
    private DeserializationContext mockCtxt;
    private JsonDeserializer<Object> mockValueDeserializer;

    @Before
    public void setUp() throws Exception {
        mockDelegate = mock(SettableBeanProperty.class);
        ctor = Inner.class.getDeclaredConstructor(InnerClassPropertyTest.class);
        mockParser = mock(JsonParser.class);
        mockCtxt = mock(DeserializationContext.class);
        mockValueDeserializer = mock(JsonDeserializer.class);
    }

    // ---- reflection helpers สำหรับ field ที่สืบทอดจาก SettableBeanProperty (คนละ package) ----

    private static void setValueDeserializer(SettableBeanProperty target, JsonDeserializer<?> deser) throws Exception {
        Field f = SettableBeanProperty.class.getDeclaredField("_valueDeserializer");
        f.setAccessible(true);
        f.set(target, deser);
    }

    private static void setValueTypeDeserializer(SettableBeanProperty target, TypeDeserializer td) throws Exception {
        Field f = SettableBeanProperty.class.getDeclaredField("_valueTypeDeserializer");
        f.setAccessible(true);
        f.set(target, td);
    }

    /* ========================================================
     * Plain delegation methods (no branch, แต่ยังต้อง cover ค่า boundary)
     * ======================================================== */

    @Test
    public void testAssignIndex_delegatesToDelegate_withVariousIndices() {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        prop.assignIndex(0);
        prop.assignIndex(-1);
        prop.assignIndex(100);
        verify(mockDelegate).assignIndex(0);
        verify(mockDelegate).assignIndex(-1);
        verify(mockDelegate).assignIndex(100);
    }

    @Test
    public void testGetPropertyIndex_returnsDelegateValue() {
        when(mockDelegate.getPropertyIndex()).thenReturn(42);
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        assertEquals(42, prop.getPropertyIndex());
    }

    @Test
    public void testGetAnnotation_delegatesAndReturnsDelegateResult() {
        Deprecated ann = DeprecatedMarker.class.getAnnotation(Deprecated.class);
        when(mockDelegate.getAnnotation(Deprecated.class)).thenReturn(ann);
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        assertSame(ann, prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetAnnotation_whenDelegateReturnsNull() {
        when(mockDelegate.getAnnotation(Deprecated.class)).thenReturn(null);
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        assertNull(prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMember_delegatesAndReturnsDelegateResult() {
        AnnotatedMember mockMember = mock(AnnotatedMember.class);
        when(mockDelegate.getMember()).thenReturn(mockMember);
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        assertSame(mockMember, prop.getMember());
    }

    @Test
    public void testSet_delegatesToDelegate() throws IOException {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        Object bean = new Object();
        Object value = new Object();
        prop.set(bean, value);
        verify(mockDelegate).set(bean, value);
    }

    @Test
    public void testSetAndReturn_delegatesToDelegate_andReturnsDelegateResult() throws IOException {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        Object bean = new Object();
        Object value = new Object();
        Object expected = new Object();
        when(mockDelegate.setAndReturn(bean, value)).thenReturn(expected);
        Object actual = prop.setAndReturn(bean, value);
        assertSame(expected, actual);
        verify(mockDelegate).setAndReturn(bean, value);
    }

    /* ========================================================
     * withName / withValueDeserializer (factory copy-constructors)
     * หมายเหตุ: super(src, newName)/super(src, deser) เป็น copy-constructor ของ
     * SettableBeanProperty ที่ไม่มีซอร์สให้ — สมมติว่าเป็นการ copy field แบบตรงไปตรงมา
     * ======================================================== */

    @Test
    public void testWithName_callsDelegateWithNameAndReturnsNewInstance() {
        PropertyName newName = PropertyName.construct("newName"); // API มาตรฐานของ Jackson
        when(mockDelegate.withName(newName)).thenReturn(mockDelegate);
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        InnerClassProperty renamed = prop.withName(newName);
        assertNotNull(renamed);
        assertNotSame(prop, renamed);
        verify(mockDelegate).withName(newName);
    }

    @Test
    public void testWithValueDeserializer_callsDelegateWithValueDeserializerAndReturnsNewInstance() {
        JsonDeserializer<?> newDeser = mock(JsonDeserializer.class);
        when(mockDelegate.withValueDeserializer(newDeser)).thenReturn(mockDelegate);
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        InnerClassProperty updated = prop.withValueDeserializer(newDeser);
        assertNotNull(updated);
        assertNotSame(prop, updated);
        verify(mockDelegate).withValueDeserializer(newDeser);
    }

    /* ========================================================
     * deserializeAndSet: 3 branches (VALUE_NULL / typeDeserializer!=null / usual-case)
     * ======================================================== */

    @Test
    public void testDeserializeAndSet_nullToken_usesGetNullValueThenSet() throws Exception {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        setValueDeserializer(prop, mockValueDeserializer);
        Object nullReplacement = new Object();
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        when(mockValueDeserializer.getNullValue(mockCtxt)).thenReturn(nullReplacement);
        Object bean = new Object();

        prop.deserializeAndSet(mockParser, mockCtxt, bean);

        verify(mockValueDeserializer).getNullValue(mockCtxt);
        verify(mockDelegate).set(bean, nullReplacement);
        verify(mockValueDeserializer, never())
                .deserialize(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void testDeserializeAndSet_withValueTypeDeserializer_usesDeserializeWithType() throws Exception {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        setValueDeserializer(prop, mockValueDeserializer);
        TypeDeserializer mockTypeDeserializer = mock(TypeDeserializer.class);
        setValueTypeDeserializer(prop, mockTypeDeserializer);
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT);
        Object typedValue = new Object();
        when(mockValueDeserializer.deserializeWithType(mockParser, mockCtxt, mockTypeDeserializer))
                .thenReturn(typedValue);
        Object bean = new Object();

        prop.deserializeAndSet(mockParser, mockCtxt, bean);

        verify(mockValueDeserializer).deserializeWithType(mockParser, mockCtxt, mockTypeDeserializer);
        verify(mockDelegate).set(bean, typedValue);
    }

    @Test
    public void testDeserializeAndSet_usualCase_instantiatesAndDeserializes() throws Exception {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        setValueDeserializer(prop, mockValueDeserializer);
        // _valueTypeDeserializer ยังเป็น null -> เข้า usual-case branch
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT);
        Object bean = this; // ต้องเป็น enclosing instance ที่ถูกต้องสำหรับ Inner constructor

        prop.deserializeAndSet(mockParser, mockCtxt, bean);

        verify(mockValueDeserializer).deserialize(eq(mockParser), eq(mockCtxt), any(Inner.class));
        verify(mockDelegate).set(eq(bean), any(Inner.class));
    }

    @Test
    public void testDeserializeAndSet_usualCase_wrongBeanType_throwsException() throws Exception {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        setValueDeserializer(prop, mockValueDeserializer);
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT);
        Object wrongBean = new Object(); // ไม่ใช่ enclosing instance ที่ถูกต้อง -> Constructor.newInstance ล้มเหลว

        try {
            prop.deserializeAndSet(mockParser, mockCtxt, wrongBean);
            fail("ควร throw exception เนื่องจาก bean ไม่ใช่ enclosing instance ที่ถูกต้องของ Inner constructor");
        } catch (Exception expected) {
            // หมายเหตุ: exception ที่แท้จริงขึ้นกับ ClassUtil.unwrapAndThrowAsIAE ซึ่งไม่มีซอร์สให้
            // (ชื่อเมธอดบอกเป็นนัยว่าจะโยน IllegalArgumentException) จึง assert แบบกว้างเพื่อไม่เดา behavior เกินซอร์ส
        }
    }

    @Test(expected = NullPointerException.class)
    public void testDeserializeAndSet_usualCase_nullCreator_throwsNPE() throws Exception {
        // _creator == null: _creator.newInstance(bean) จะ NPE, จากนั้นในบรรทัด catch ที่สร้าง message
        // ด้วย _creator.getDeclaringClass() ก็จะ NPE ซ้ำอีกครั้ง (ก่อนเรียก ClassUtil.unwrapAndThrowAsIAE)
        // -> NPE หลุดออกมาจาก deserializeAndSet โดยตรง (fault ที่ตรวจจับได้จาก error-message construction)
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, null);
        setValueDeserializer(prop, mockValueDeserializer);
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.START_OBJECT);

        prop.deserializeAndSet(mockParser, mockCtxt, this);
    }

    /* ========================================================
     * deserializeSetAndReturn: ไม่มี branch ภายในเมธอดเอง แต่ทดสอบการ delegate ไปยัง setAndReturn
     * หมายเหตุ: deserialize(jp, ctxt) เป็นเมธอด inherited จาก SettableBeanProperty ที่ไม่มีซอร์สให้
     * จึงใช้ any() แทนการเดาค่าที่แน่นอนที่ deserialize() คำนวณได้
     * ======================================================== */

    @Test
    public void testDeserializeSetAndReturn_delegatesToSetAndReturn() throws Exception {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        setValueDeserializer(prop, mockValueDeserializer);
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        Object nullReplacement = new Object();
        when(mockValueDeserializer.getNullValue(mockCtxt)).thenReturn(nullReplacement);
        Object instance = new Object();
        Object expectedReturn = new Object();
        when(mockDelegate.setAndReturn(eq(instance), any())).thenReturn(expectedReturn);

        Object actual = prop.deserializeSetAndReturn(mockParser, mockCtxt, instance);

        assertSame(expectedReturn, actual);
        verify(mockDelegate).setAndReturn(eq(instance), any());
    }

    /* ========================================================
     * Protected copy-constructor (InnerClassProperty, AnnotatedConstructor)
     * if (_creator == null) throw new IllegalArgumentException(...)
     * ======================================================== */

    @Test(expected = IllegalArgumentException.class)
    public void testAnnotatedConstructorCopyCtor_withNullAnnotated_throwsIllegalArgumentException() {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        new InnerClassProperty(prop, (AnnotatedConstructor) null);
    }

    @Test
    public void testAnnotatedConstructorCopyCtor_withValidAnnotated_setsCreator() {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        AnnotatedConstructor ann = new AnnotatedConstructor(null, ctor, null, null);

        InnerClassProperty withAnnotated = new InnerClassProperty(prop, ann);

        assertSame(ctor, withAnnotated._creator);
        assertSame(ann, withAnnotated._annotated);
        assertSame(prop._delegate, withAnnotated._delegate);
    }

    /* ========================================================
     * writeReplace(): if (_annotated != null) return this; else สร้าง wrapper ใหม่
     * ======================================================== */

    @Test
    public void testWriteReplace_whenAnnotatedIsNull_createsWrapperWithAnnotatedConstructor() {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        assertNull(prop._annotated); // precondition

        Object replaced = prop.writeReplace();

        assertNotSame(prop, replaced);
        assertTrue(replaced instanceof InnerClassProperty);
        InnerClassProperty replacedProp = (InnerClassProperty) replaced;
        assertNotNull(replacedProp._annotated);
        assertSame(ctor, replacedProp._creator);
    }

    @Test
    public void testWriteReplace_whenAnnotatedAlreadySet_returnsSameInstance() {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        AnnotatedConstructor ann = new AnnotatedConstructor(null, ctor, null, null);
        InnerClassProperty withAnnotated = new InnerClassProperty(prop, ann);

        Object replaced = withAnnotated.writeReplace();

        assertSame(withAnnotated, replaced);
    }

    /* ========================================================
     * readResolve(): return new InnerClassProperty(this, _annotated);
     * ======================================================== */

    @Test
    public void testReadResolve_recreatesInstanceUsingAnnotated() {
        InnerClassProperty prop = new InnerClassProperty(mockDelegate, ctor);
        AnnotatedConstructor ann = new AnnotatedConstructor(null, ctor, null, null);
        InnerClassProperty withAnnotated = new InnerClassProperty(prop, ann);

        Object resolved = withAnnotated.readResolve();

        assertNotSame(withAnnotated, resolved);
        assertTrue(resolved instanceof InnerClassProperty);
        InnerClassProperty resolvedProp = (InnerClassProperty) resolved;
        assertSame(ctor, resolvedProp._creator);
        assertSame(ann, resolvedProp._annotated);
    }
}
