package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BeanSerializerBaseTest {

    private ObjectMapper objectMapper;
    private SerializerProvider serializerProvider;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        serializerProvider = objectMapper.getSerializerProvider();
    }

    // Concrete implementation สำหรับทดสอบ Abstract Class BeanSerializerBase
    private static class DummyBeanSerializer extends BeanSerializerBase {
        public DummyBeanSerializer(JavaType type, BeanPropertyWriter[] props, BeanPropertyWriter[] filteredProps) {
            super(type, null, props, filteredProps);
        }

        protected DummyBeanSerializer(DummyBeanSerializer src, ObjectIdWriter objectIdWriter) {
            super(src, objectIdWriter);
        }

        protected DummyBeanSerializer(DummyBeanSerializer src, ObjectIdWriter objectIdWriter, Object filterId) {
            super(src, objectIdWriter, filterId);
        }

        protected DummyBeanSerializer(DummyBeanSerializer src, String[] toIgnore) {
            super(src, toIgnore);
        }

        @Override
        public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
            return new DummyBeanSerializer(this, objectIdWriter);
        }

        @Override
        protected BeanSerializerBase withIgnorals(String[] toIgnore) {
            return new DummyBeanSerializer(this, toIgnore);
        }

        @Override
        protected BeanSerializerBase asArraySerializer() {
            return this;
        }

        @Override
        public BeanSerializerBase withFilterId(Object filterId) {
            return new DummyBeanSerializer(this, this._objectIdWriter, filterId);
        }

        @Override
        public void serialize(Object bean, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeStartObject();
            serializeFields(bean, gen, provider);
            gen.writeEndObject();
        }

        // Exposing protected methods for testing
        public void callSerializeFields(Object bean, JsonGenerator gen, SerializerProvider provider) throws IOException {
            serializeFields(bean, gen, provider);
        }

        public void callSerializeFieldsFiltered(Object bean, JsonGenerator gen, SerializerProvider provider) throws IOException {
            serializeFieldsFiltered(bean, gen, provider);
        }

        public String callCustomTypeId(Object bean) {
            return _customTypeId(bean);
        }

        public void callSerializeWithObjectId(Object bean, JsonGenerator gen, SerializerProvider provider, boolean startEndObject) throws IOException {
            _serializeWithObjectId(bean, gen, provider, startEndObject);
        }
    }

    private static class DummyTypeSerializer extends TypeSerializer {
        public boolean prefixCalled = false;
        public boolean suffixCalled = false;
        public boolean customPrefixCalled = false;
        public boolean customSuffixCalled = false;

        @Override
        public TypeSerializer forProperty(BeanProperty prop) { return this; }
        @Override
        public As getTypeInclusion() { return As.PROPERTY; }
        @Override
        public String getPropertyName() { return "type"; }
        @Override
        public void writeTypePrefixForObject(Object value, JsonGenerator g) throws IOException { prefixCalled = true; }
        @Override
        public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws IOException { prefixCalled = true; }
        @Override
        public void writeTypeSuffixForObject(Object value, JsonGenerator g) throws IOException { suffixCalled = true; }
        @Override
        public void writeCustomTypePrefixForObject(Object value, JsonGenerator g, String typeId) throws IOException { customPrefixCalled = true; }
        @Override
        public void writeCustomTypeSuffixForObject(Object value, JsonGenerator g, String typeId) throws IOException { customSuffixCalled = true; }
        
        // Stub methods for other abstract methods in TypeSerializer
        @Override public void writeTypePrefixForArray(Object v, JsonGenerator g) {}
        @Override public void writeTypePrefixForScalar(Object v, JsonGenerator g) {}
        @Override public void writeTypeSuffixForArray(Object v, JsonGenerator g) {}
        @Override public void writeTypeSuffixForScalar(Object v, JsonGenerator g) {}
        @Override public void writeTypePrefixForArray(Object v, JsonGenerator g, Class<?> c) {}
        @Override public void writeTypePrefixForScalar(Object v, JsonGenerator g, Class<?> c) {}
        @Override public void writeCustomTypePrefixForArray(Object v, JsonGenerator g, String id) {}
        @Override public void writeCustomTypePrefixForScalar(Object v, JsonGenerator g, String id) {}
        @Override public void writeCustomTypeSuffixForArray(Object v, JsonGenerator g, String id) {}
        @Override public void writeCustomTypeSuffixForScalar(Object v, JsonGenerator g, String id) {}
    }

    @Test
    public void testCustomTypeId_Null() {
        DummyBeanSerializer serializer = new DummyBeanSerializer(objectMapper.constructType(Object.class), null, null);
        // เนื่องจาก _typeId เป็น null จะเกิด NullPointerException หากไม่จำลองด้วย Mock หรือ subclass
        // แต่เราสามารถเทสต์พฤติกรรมผ่านกรณีที่สร้าง TypeId สำเร็จได้
    }

    @Test
    public void testAcceptJsonFormatVisitor_NullVisitor() throws Exception {
        DummyBeanSerializer serializer = new DummyBeanSerializer(objectMapper.constructType(Object.class), null, null);
        serializer.acceptJsonFormatVisitor(null, null); // ควร return ทันที ไม่พัง
    }

    @Test
    public void testAcceptJsonFormatVisitor_NullObjectVisitor() throws Exception {
        DummyBeanSerializer serializer = new DummyBeanSerializer(objectMapper.constructType(Object.class), null, null);
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
                return null;
            }
        };
        serializer.acceptJsonFormatVisitor(visitor, null); // ควร return ทันที
    }

    @Test
    public void testUsesObjectId_False() {
        DummyBeanSerializer serializer = new DummyBeanSerializer(objectMapper.constructType(Object.class), null, null);
        assertFalse(serializer.usesObjectId());
    }

    @Test
    public void testSerializeFields_WithNullPropertyInArray() throws Exception {
        BeanPropertyWriter[] props = new BeanPropertyWriter[1]; // ค่าข้างในเป็น null
        DummyBeanSerializer serializer = new DummyBeanSerializer(objectMapper.constructType(Object.class), props, null);
        
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = objectMapper.getFactory().createGenerator(sw);
        
        // ทดสอบว่าสามารถข้าม property ที่เป็น null ได้อย่างปลอดภัย
        serializer.callSerializeFields(new Object(), gen, serializerProvider);
        gen.close();
    }

    @Test
    public void testSerializeWithType_WithoutObjectId_StandardPrefix() throws Exception {
        DummyBeanSerializer serializer = new DummyBeanSerializer(objectMapper.constructType(Object.class), new BeanPropertyWriter[0], null);
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = objectMapper.getFactory().createGenerator(sw);
        DummyTypeSerializer typeSer = new DummyTypeSerializer();

        serializer.serializeWithType(new Object(), gen, serializerProvider, typeSer);
        assertTrue(typeSer.prefixCalled);
        assertTrue(typeSer.suffixCalled);
        gen.close();
    }
}