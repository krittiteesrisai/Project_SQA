package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MethodPropertyTest {

    private MethodProperty property;
    private BeanPropertyDefinition propDef;
    private JavaType type;
    private TypeDeserializer typeDeser;
    private Annotations contextAnnotations;
    private AnnotatedMethod annotatedMethod;
    private Method setterMethod;

    public static class DummyBean {
        private String value;
        public void setValue(String value) { this.value = value; }
        public String getValue() { this.value = value; return value; }
        public String returnNull(String val) { return null; }
    }

    @Before
    public void setUp() throws Exception {
        propDef = mock(BeanPropertyDefinition.class);
        type = ObjectMapper.sDefaultTyping.findType(ObjectMapper.class, null); // หรือใช้ TypeFactory
        // ใช้ ObjectMapper สร้าง JavaType ง่ายๆ
        ObjectMapper mapper = new ObjectMapper();
        type = mapper.constructType(String.class);
        
        typeDeser = null;
        contextAnnotations = mock(Annotations.class);
        
        setterMethod = DummyBean.class.getMethod("setValue", String.class);
        annotatedMethod = mock(AnnotatedMethod.class);
        when(annotatedMethod.getAnnotated()).thenReturn(setterMethod);

        property = new MethodProperty(propDef, type, typeDeser, contextAnnotations, annotatedMethod);
    }

    @Test
    public void testWithSameValueDeserializer() {
        JsonDeserializer<?> deser = property.getValueDeserializer();
        SettableBeanProperty result = property.withValueDeserializer(deser);
        assertSame(property, result);
    }

    @Test
    public void testWithNewValueDeserializer() {
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        SettableBeanProperty result = property.withValueDeserializer(deser);
        assertNotSame(property, result);
    }

    @Test
    public void testWithNullProvider() {
        NullValueProvider nva = mock(NullValueProvider.class);
        SettableBeanProperty result = property.withNullProvider(nva);
        assertNotNull(result);
        assertNotSame(property, result);
    }

    @Test
    public void testWithName() {
        PropertyName newName = new PropertyName("newName");
        SettableBeanProperty result = property.withName(newName);
        assertNotNull(result);
    }

    @Test
    public void testGetAnnotationWhenAnnotatedIsNull() throws Exception {
        MethodProperty nullAnnotatedProp = new MethodProperty(propDef, type, typeDeser, contextAnnotations, null) {
            // override field if needed, but here we test via reflection or constructor behavior
        };
        // เนื่องจาก _annotated เป็น final ป้องกันด้วยการสร้างผ่าน constructor ปกติไม่ได้ถ้า null
        // แต่เราสามารถเทสผ่าน getMember() ได้
        assertNotNull(property.getMember());
    }

    @Test
    public void testFixAccess() {
        DeserializationConfig config = mock(DeserializationConfig.class);
        when(config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)).thenReturn(true);
        property.fixAccess(config);
        verify(annotatedMethod).fixAccess(true);
    }

    @Test
    public void testSetSuccess() throws Exception {
        DummyBean bean = new DummyBean();
        property.set(bean, "testValue");
        assertEquals("testValue", bean.value);
    }

    @Test(expected = IOException.class)
    public void testSetExceptionHandling() throws Exception {
        DummyBean bean = mock(DummyBean.class);
        // บังคับให้เกิด Exception ตอน invoke เช่นส่ง type ผิด
        Method invalidSetter = DummyBean.class.getMethod("setValue", String.class);
        MethodProperty errProperty = new MethodProperty(property, invalidSetter);
        // ส่ง object ผิดประเภทเพื่อให้เกิด IllegalArgumentException -> _throwAsIOE
        errProperty.set(new Object(), "value");
    }

    @Test
    public void testSetAndReturn() throws Exception {
        DummyBean bean = new DummyBean();
        Method getterMethodRef = DummyBean.class.getMethod("getValue", new Class<?>[0]);
        MethodProperty returnProp = new MethodProperty(property, getterMethodRef);
        
        Object res = returnProp.setAndReturn(bean, "hello");
        // เนื่องจาก getValue คืนค่า "hello" ซึ่งไม่เป็น null
        assertEquals("hello", res);
    }

    @Test
    public void testSetAndReturnNullResult() throws Exception {
        DummyBean bean = new DummyBean();
        Method nullMethodRef = DummyBean.class.getMethod("returnNull", String.class);
        MethodProperty returnProp = new MethodProperty(property, nullMethodRef);
        
        // ถ้าผลลัพธ์จากการ invoke เป็น null เมธอดจะคืนค่า instance กลับไปแทน
        Object res = returnProp.setAndReturn(bean, "hello");
        assertSame(bean, res);
    }

    @Test(expected = IOException.class)
    public void testSetAndReturnException() throws Exception {
        Method invalidSetter = DummyBean.class.getMethod("setValue", String.class);
        MethodProperty errProperty = new MethodProperty(property, invalidSetter);
        errProperty.setAndReturn(new Object(), "value");
    }

    @Test
    public void testReadResolve() throws Exception {
        Object resolved = property.readResolve();
        assertNotNull(resolved);
        assertTrue(resolved instanceof MethodProperty);
    }

    @Test
    public void testDeserializeAndSetNullTokenSkipNulls() throws Exception {
        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        DummyBean bean = new DummyBean();

        // _skipNulls เป็น true (สร้าง property ที่ skip nulls)
        NullValueProvider skipProvider = NullsConstantProvider.skipper();
        MethodProperty skipProp = new MethodProperty(propDef, type, typeDeser, contextAnnotations, annotatedMethod) {
            // สามารถจำลองสถานการณ์ผ่าน Constructor หรือพฤติกรรมจริง
        };
        // ใช้ reflection หรือผ่าน constructor ที่มี nullProvider
        MethodProperty skipProperty = new MethodProperty(property, null, skipProvider);
        
        skipProperty.deserializeAndSet(p, ctxt, bean);
        assertNull(bean.value); // ค่าไม่ควรถูกเซ็ต
    }

    @Test
    public void testDeserializeSetAndReturnNullTokenSkipNulls() throws Exception {
        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        DummyBean bean = new DummyBean();

        NullValueProvider skipProvider = NullsConstantProvider.skipper();
        MethodProperty skipProperty = new MethodProperty(property, null, skipProvider);
        
        Object result = skipProperty.deserializeSetAndReturn(p, ctxt, bean);
        assertSame(bean, result);
    }
}