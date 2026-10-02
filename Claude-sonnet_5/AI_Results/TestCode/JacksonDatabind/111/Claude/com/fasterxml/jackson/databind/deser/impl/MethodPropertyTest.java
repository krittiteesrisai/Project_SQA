package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.Iterator;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * JUnit4 test suite for {@link MethodProperty}.
 *
 * หมายเหตุสำคัญ (assumptions ที่ไม่สามารถยืนยันได้จากซอร์สที่ให้มาโดยตรง แต่จำเป็นต่อการสร้าง test harness):
 * 1. ใช้ {@code BeanDeserializerBase#properties()} (public API มาตรฐานของ Jackson) เพื่อดึง
 *    {@link SettableBeanProperty} จริงที่ Jackson สร้างขึ้น แทนการเรียก constructor ของ
 *    MethodProperty ตรง ๆ (เพราะไม่มีซอร์สของ SettableBeanProperty/BeanPropertyDefinition
 *    ให้ตรวจสอบ internal wiring)
 * 2. สมมติว่า {@code NullsConstantProvider.skipper()} เป็น static factory ที่คู่กับ
 *    {@code NullsConstantProvider.isSkipper(...)} ที่เห็นในซอร์ส MethodProperty
 * 3. สมมติว่า Jackson รองรับ "fluent setter" (setter ที่ return ค่าไม่ใช่ void) เป็น mutator
 *    ตามปกติ โดยไม่ต้องใส่ annotation พิเศษ (ใช้เพื่อ cover branch result!=null ใน
 *    deserializeSetAndReturn/setAndReturn)
 * 4. สมมติว่า {@code _throwAsIOE(...)} (ที่สืบทอดมาจาก SettableBeanProperty, ไม่มีซอร์สให้ดู)
 *    จะ throw exception ที่เป็น instance ของ IOException เสมอเมื่อ setter โยน exception
 * 5. branch "{@code _annotated == null}" ใน getAnnotation() ไม่สามารถทดสอบได้ เพราะ
 *    public constructor ของ MethodProperty บังคับให้ _annotated ไม่เป็น null เสมอ
 *    (ถ้าส่ง null method เข้าไปจะเกิด NPE ตั้งแต่ใน constructor ก่อนถึง branch นี้) -> unreachable
 *    จึงไม่ได้เขียนเทสสำหรับ branch นี้
 */
@SuppressWarnings("unchecked")
public class MethodPropertyTest {

    // ---------- Test POJOs ----------

    public static class SimpleBean {
        private String value = "init";
        public String getValue() { return value; }
        public void setValue(String v) { this.value = v; }
    }

    public static class AnnotatedBean {
        private String value;
        public String getValue() { return value; }
        @Deprecated
        public void setValue(String v) { this.value = v; }
    }

    public static class ThrowingBean {
        private String value;
        public String getValue() { return value; }
        public void setValue(String v) { throw new RuntimeException("boom"); }
    }

    public static class FluentBean {
        private String value;
        public String getValue() { return value; }
        // "fluent" setter: return ไม่ใช่ void เพื่อ cover branch result != null
        public Object setValue(String v) {
            this.value = v;
            return "MARKER";
        }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class")
    public static class Animal {
    }

    public static class Dog extends Animal {
    }

    public static class PolyBean {
        private Animal value;
        public Animal getValue() { return value; }
        public void setValue(Animal v) { this.value = v; }
    }

    // ---------- Helper: ดึง MethodProperty จริงจาก Jackson ----------

    private static MethodProperty captureMethodProperty(final Class<?> beanClass, final String propName)
            throws Exception {
        final MethodProperty[] holder = new MethodProperty[1];

        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                    BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                if (beanDesc.getBeanClass() == beanClass && deserializer instanceof BeanDeserializerBase) {
                    BeanDeserializerBase bd = (BeanDeserializerBase) deserializer;
                    Iterator<SettableBeanProperty> it = bd.properties();
                    while (it.hasNext()) {
                        SettableBeanProperty p = it.next();
                        if (propName.equals(p.getName()) && p instanceof MethodProperty) {
                            holder[0] = (MethodProperty) p;
                        }
                    }
                }
                return deserializer;
            }
        });

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(module);
        // ไม่สนใจ field จริงใน json แค่ trigger ให้ build deserializer schema
        mapper.readValue("{}", beanClass);

        if (holder[0] == null) {
            throw new IllegalStateException(
                    "ไม่สามารถดึง MethodProperty สำหรับ " + beanClass + "." + propName);
        }
        return holder[0];
    }

    // ===================== BeanProperty / accessor tests =====================

    @Test
    public void testGetMemberReturnsAnnotatedMethod() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        assertNotNull(mp.getMember());
        assertTrue(mp.getMember() instanceof AnnotatedMethod);
    }

    @Test
    public void testGetAnnotation_absent() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        assertNull(mp.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetAnnotation_present() throws Exception {
        MethodProperty mp = captureMethodProperty(AnnotatedBean.class, "value");
        assertNotNull(mp.getAnnotation(Deprecated.class));
    }

    @Test
    public void testFixAccessDoesNotThrow() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        ObjectMapper mapper = new ObjectMapper();
        // ไม่ควร throw exception ไม่ว่า feature จะเปิดหรือปิด
        mp.fixAccess(mapper.getDeserializationConfig());
    }

    // ===================== withX() tests =====================

    @Test
    public void testWithName_createsNewInstanceWithNewName() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        SettableBeanProperty renamed = mp.withName(new PropertyName("renamed"));
        assertNotSame(mp, renamed);
        assertEquals("renamed", renamed.getName());
        assertEquals("value", mp.getName()); // ของเดิมไม่เปลี่ยน
    }

    @Test
    public void testWithValueDeserializer_sameInstance_returnsThis() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        JsonDeserializer<?> current = mp.getValueDeserializer();
        SettableBeanProperty result = mp.withValueDeserializer(current);
        assertSame(mp, result); // ตาม if (_valueDeserializer == deser) return this;
    }

    @Test
    public void testWithValueDeserializer_differentInstance_returnsNew() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        SettableBeanProperty result = mp.withValueDeserializer(mockDeser);
        assertNotSame(mp, result);
        assertSame(mockDeser, result.getValueDeserializer());
    }

    @Test
    public void testWithNullProvider_createsNewInstance() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        NullValueProvider skip = NullsConstantProvider.skipper();
        SettableBeanProperty result = mp.withNullProvider(skip);
        assertNotSame(mp, result);
    }

    // ===================== deserializeAndSet() branch tests =====================

    @Test
    public void testDeserializeAndSet_normalNonNullValue() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("abc");
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean();
        withMock.deserializeAndSet(p, ctxt, bean);
        assertEquals("abc", bean.getValue());
    }

    @Test
    public void testDeserializeAndSet_nullToken_noSkip() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean(); // init="init"
        mp.deserializeAndSet(p, ctxt, bean);
        assertNull(bean.getValue()); // default null provider -> set null
    }

    @Test
    public void testDeserializeAndSet_nullToken_withSkip() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        SettableBeanProperty skipProp = mp.withNullProvider(NullsConstantProvider.skipper());

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean(); // init="init"
        skipProp.deserializeAndSet(p, ctxt, bean);
        assertEquals("init", bean.getValue()); // setter ไม่ถูกเรียก
    }

    @Test
    public void testDeserializeAndSet_valueNullAfterDeserialize_noSkip() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn(null);
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean();
        withMock.deserializeAndSet(p, ctxt, bean);
        assertNull(bean.getValue()); // ผ่าน _nullProvider.getNullValue -> setter(null)
    }

    @Test
    public void testDeserializeAndSet_valueNullAfterDeserialize_withSkip() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn(null);
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);
        SettableBeanProperty withSkip = withMock.withNullProvider(NullsConstantProvider.skipper());

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean(); // init="init"
        withSkip.deserializeAndSet(p, ctxt, bean);
        assertEquals("init", bean.getValue()); // skip branch -> setter ไม่ถูกเรียก
    }

    @Test
    public void testDeserializeAndSet_withTypeDeserializerBranch() throws Exception {
        MethodProperty mp = captureMethodProperty(PolyBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        Dog dog = new Dog();
        when(mockDeser.deserializeWithType(any(JsonParser.class), any(DeserializationContext.class),
                any(TypeDeserializer.class))).thenReturn(dog);
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        PolyBean bean = new PolyBean();
        withMock.deserializeAndSet(p, ctxt, bean);

        assertSame(dog, bean.getValue());
        verify(mockDeser).deserializeWithType(any(JsonParser.class), any(DeserializationContext.class),
                any(TypeDeserializer.class));
        verify(mockDeser, never()).deserialize(any(JsonParser.class), any(DeserializationContext.class));
    }

    @Test(expected = IOException.class)
    public void testDeserializeAndSet_setterThrows() throws Exception {
        MethodProperty mp = captureMethodProperty(ThrowingBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("x");
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        withMock.deserializeAndSet(p, ctxt, new ThrowingBean());
    }

    // ===================== deserializeSetAndReturn() branch tests =====================

    @Test
    public void testDeserializeSetAndReturn_voidSetter_returnsInstance() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("abc");
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean();
        Object result = withMock.deserializeSetAndReturn(p, ctxt, bean);
        assertSame(bean, result); // void setter -> invoke() null -> fallback เป็น instance
        assertEquals("abc", bean.getValue());
    }

    @Test
    public void testDeserializeSetAndReturn_fluentSetter_returnsResult() throws Exception {
        MethodProperty mp = captureMethodProperty(FluentBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("xyz");
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        FluentBean bean = new FluentBean();
        Object result = withMock.deserializeSetAndReturn(p, ctxt, bean);
        assertEquals("MARKER", result); // result != null -> คืนค่า result ไม่ใช่ instance
        assertEquals("xyz", bean.getValue());
    }

    @Test
    public void testDeserializeSetAndReturn_nullToken_skip() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        SettableBeanProperty skipProp = mp.withNullProvider(NullsConstantProvider.skipper());

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean();
        Object result = skipProp.deserializeSetAndReturn(p, ctxt, bean);
        assertSame(bean, result);
        assertEquals("init", bean.getValue());
    }

    @Test
    public void testDeserializeSetAndReturn_nullToken_noSkip() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean();
        Object result = mp.deserializeSetAndReturn(p, ctxt, bean);
        assertSame(bean, result);
        assertNull(bean.getValue());
    }

    @Test
    public void testDeserializeSetAndReturn_valueNullAfterDeserialize_skip() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn(null);
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);
        SettableBeanProperty withSkip = withMock.withNullProvider(NullsConstantProvider.skipper());

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        SimpleBean bean = new SimpleBean();
        Object result = withSkip.deserializeSetAndReturn(p, ctxt, bean);
        assertSame(bean, result);
        assertEquals("init", bean.getValue());
    }

    @Test(expected = IOException.class)
    public void testDeserializeSetAndReturn_setterThrows() throws Exception {
        MethodProperty mp = captureMethodProperty(ThrowingBean.class, "value");
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("x");
        SettableBeanProperty withMock = mp.withValueDeserializer(mockDeser);

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        withMock.deserializeSetAndReturn(p, ctxt, new ThrowingBean());
    }

    // ===================== set() / setAndReturn() tests =====================

    @Test
    public void testSet_normal() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        SimpleBean bean = new SimpleBean();
        mp.set(bean, "hello");
        assertEquals("hello", bean.getValue());
    }

    @Test(expected = IOException.class)
    public void testSet_setterThrows() throws Exception {
        MethodProperty mp = captureMethodProperty(ThrowingBean.class, "value");
        mp.set(new ThrowingBean(), "x");
    }

    @Test
    public void testSetAndReturn_voidSetter_returnsInstance() throws Exception {
        MethodProperty mp = captureMethodProperty(SimpleBean.class, "value");
        SimpleBean bean = new SimpleBean();
        Object result = mp.setAndReturn(bean, "hello");
        assertSame(bean, result);
        assertEquals("hello", bean.getValue());
    }

    @Test
    public void testSetAndReturn_fluentSetter_returnsResult() throws Exception {
        MethodProperty mp = captureMethodProperty(FluentBean.class, "value");
        FluentBean bean = new FluentBean();
        Object result = mp.setAndReturn(bean, "hello");
        assertEquals("MARKER", result);
        assertEquals("hello", bean.getValue());
    }

    @Test(expected = IOException.class)
    public void testSetAndReturn_setterThrows() throws Exception {
        MethodProperty mp = captureMethodProperty(ThrowingBean.class, "value");
        mp.setAndReturn(new ThrowingBean(), "x");
    }
}
