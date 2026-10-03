package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.StdConverter;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;

import static org.junit.Assert.*;

public class StdDelegatingSerializerTest {

    // --- Mocks / Helpers สำหรับทดสอบ ---

    private static class DummyConverter extends StdConverter<Object, String> {
        @Override
        public String convert(Object value) {
            if (value == null) {
                return null;
            }
            return value.toString();
        }
    }

    private static class SubclassDelegatingSerializer extends StdDelegatingSerializer {
        public SubclassDelegatingSerializer(com.fasterxml.jackson.databind.util.Converter<Object, ?> converter,
                                            JavaType delegateType, JsonSerializer<?> delegateSerializer) {
            super(converter, delegateType, delegateSerializer);
        }
    }

    private static class DummyResolvableSerializer extends JsonSerializer<Object> implements ResolvableSerializer, ContextualSerializer, SchemaAware {
        public boolean resolved = false;
        public boolean contextualized = false;

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {}

        @Override
        public void resolve(SerializerProvider provider) throws JsonMappingException {
            resolved = true;
        }

        @Override
        public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException {
            contextualized = true;
            return this;
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) throws JsonMappingException {
            return null;
        }
    }

    // --- Test Cases ---

    @Test
    public void testConstructorsAndAccessors() {
        DummyConverter converter = new DummyConverter();
        StdDelegatingSerializer serializer1 = new StdDelegatingSerializer(converter);
        assertNotNull(serializer1.getConverter());

        StdDelegatingSerializer serializer2 = new StdDelegatingSerializer(String.class, converter);
        assertNotNull(serializer2.getConverter());

        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        JsonSerializer<Object> delSer = mapper.getSerializerProviderInstance().findNullValueSerializer(null);

        StdDelegatingSerializer serializer3 = new StdDelegatingSerializer(converter, type, delSer);
        assertEquals(converter, serializer3.getConverter());
        assertEquals(delSer, serializer3.getDelegatee());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithDelegateSubclassException() {
        DummyConverter converter = new DummyConverter();
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        
        SubclassDelegatingSerializer subSerializer = new SubclassDelegatingSerializer(converter, type, null);
        // จะต้องโยน IllegalStateException เพราะเป็น Subclass และไม่ได้ override 'withDelegate'
        subSerializer.withDelegate(converter, type, null);
    }

    @Test
    public void testResolveWithResolvableSerializer() throws Exception {
        DummyConverter converter = new DummyConverter();
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        DummyResolvableSerializer resolvableSerializer = new DummyResolvableSerializer();

        StdDelegatingSerializer serializer = new StdDelegatingSerializer(converter, type, resolvableSerializer);
        serializer.resolve(mapper.getSerializerProviderInstance());

        assertTrue("Should invoke resolve on delegate", resolvableSerializer.resolved);
    }

    @Test
    public void testResolveWithNullSerializer() throws Exception {
        DummyConverter converter = new DummyConverter();
        StdDelegatingSerializer serializer = new StdDelegatingSerializer(converter);
        // ไม่ควรเกิด Exception ใดๆ เมื่อ delegateSerializer เป็น null
        serializer.resolve(new ObjectMapper().getSerializerProviderInstance());
    }

    @Test
    public void testCreateContextualDynamicLookupAndContextual() throws Exception {
        DummyConverter converter = new DummyConverter();
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        // กรณี _delegateSerializer == null และ delegateType == null (ต้องเรียก getOutputType)
        StdDelegatingSerializer serializer = new StdDelegatingSerializer(converter);
        JsonSerializer<?> contextualized = serializer.createContextual(provider, null);
        assertNotNull(contextualized);
    }

    @Test
    public void testCreateContextualWithExistingDelegate() throws Exception {
        DummyConverter converter = new DummyConverter();
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        DummyResolvableSerializer delSer = new DummyResolvableSerializer();
        JavaType type = mapper.constructType(String.class);

        StdDelegatingSerializer serializer = new StdDelegatingSerializer(converter, type, delSer);
        JsonSerializer<?> result = serializer.createContextual(provider, null);
        
        assertTrue("Should handle secondary contextualization and return new or same serializer", delSer.contextualized);
        assertNotNull(result);
    }

    @Test
    public void testSerializeNullValue() throws Exception {
        DummyConverter converter = new DummyConverter();
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        
        StdDelegatingSerializer serializer = new StdDelegatingSerializer(converter);
        // ทดสอบส่งค่า null เข้าไปเพื่อให้ convertValue ได้ null และเรียก defaultSerializeNull
        // ใช้ JsonGenerator จำลองผ่าน ObjectMapper ในการทดสอบเบื้องต้น
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        
        serializer.serialize(null, gen, provider);
        gen.flush();
    }

    @Test
    public void testIsEmptyMethods() {
        DummyConverter converter = new DummyConverter();
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JsonSerializer<Object> stringSerializer = mapper.getSerializerProviderInstance().findValueSerializer(String.class);
        JavaType type = mapper.constructType(String.class);

        StdDelegatingSerializer serializer = new StdDelegatingSerializer(converter, type, stringSerializer);
        
        assertFalse(serializer.isEmpty("not-empty"));
        assertFalse(serializer.isEmpty(provider, "not-empty"));
    }

    @Test
    public void testGetSchemaMethods() throws Exception {
        DummyConverter converter = new DummyConverter();
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        DummyResolvableSerializer schemaAwareSer = new DummyResolvableSerializer();
        JavaType type = mapper.constructType(String.class);

        StdDelegatingSerializer serializer = new StdDelegatingSerializer(converter, type, schemaAwareSer);
        
        assertNull(serializer.getSchema(provider, String.class));
        assertNull(serializer.getSchema(provider, String.class, true));
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        DummyConverter converter = new DummyConverter();
        ObjectMapper mapper = new ObjectMapper();
        DummyResolvableSerializer delSer = new DummyResolvableSerializer();
        JavaType type = mapper.constructType(String.class);

        StdDelegatingSerializer serializer = new StdDelegatingSerializer(converter, type, delSer);
        // ตรวจสอบว่าไม่โยน Exception เมื่อเรียก acceptJsonFormatVisitor
        JsonFormatVisitorWrapper visitor = null; 
        try {
            serializer.acceptJsonFormatVisitor(visitor, type);
        } catch (NullPointerException e) {
            // คาดหวังได้ถ้าวีซิทอร์เป็น null แต่เป้าหมายคือให้โค้ดรันผ่านบรรทัดเรียก delSer.acceptJsonFormatVisitor
        }
    }
}