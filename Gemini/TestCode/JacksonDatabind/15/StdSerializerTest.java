package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class StdSerializerTest {

    // Concrete implementation สำหรับทดสอบคลาส Abstract StdSerializer
    private static class ConcreteSerializer extends StdSerializer<String> {
        public ConcreteSerializer(Class<T> t) { super(t); }
        public ConcreteSerializer(JavaType type) { super(type); }
        public ConcreteSerializer(Class<?> t, boolean dummy) { super(t, dummy); }

        @Override
        public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            if (value == null) {
                jgen.writeNull();
            } else {
                jgen.writeString(value);
            }
        }

        // Exposing protected methods for testing
        public ObjectNode publicCreateObjectNode() { return createObjectNode(); }
        public ObjectNode publicCreateSchemaNode(String type) { return createSchemaNode(type); }
        public ObjectNode publicCreateSchemaNode(String type, boolean isOptional) { return createSchemaNode(type, isOptional); }
        public void publicWrapAndThrow(SerializerProvider provider, Throwable t, Object bean, String fieldName) throws IOException { wrapAndThrow(provider, t, bean, fieldName); }
        public void publicWrapAndThrow(SerializerProvider provider, Throwable t, Object bean, int index) throws IOException { wrapAndThrow(provider, t, bean, index); }
        public boolean publicIsDefaultSerializer(JsonSerializer<?> ser) { return isDefaultSerializer(ser); }
        public JsonSerializer<?> publicFindConvertingContentSerializer(SerializerProvider provider, BeanProperty prop, JsonSerializer<?> existing) throws JsonMappingException { return findConvertingContentSerializer(provider, prop, existing); }
        public PropertyFilter publicFindPropertyFilter(SerializerProvider provider, Object filterId, Object valueToFilter) throws JsonMappingException { return findPropertyFilter(provider, filterId, valueToFilter); }
    }

    @JacksonStdImpl
    private static class DummyJacksonStdSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) {}
    }

    private static class NonStdSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) {}
    }

    @Test
    public void testConstructorsAndHandledType() {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        ConcreteSerializer ser1 = new ConcreteSerializer(String.class);
        ConcreteSerializer ser2 = new ConcreteSerializer(stringType);
        ConcreteSerializer ser3 = new ConcreteSerializer(Integer.class, true);

        assertEquals(String.class, ser1.handledType());
        assertEquals(String.class, ser2.handledType());
        assertEquals(Integer.class, ser3.handledType());
    }

    @Test
    public void testGetSchemaMethods() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        ConcreteSerializer ser = new ConcreteSerializer(String.class);

        JsonNode schema1 = ser.getSchema(provider, null);
        assertNotNull(schema1);
        assertEquals("string", schema1.get("type").asText());

        JsonNode schemaRequired = ser.getSchema(provider, null, false);
        assertTrue(schemaRequired.has("required"));
        assertTrue(schemaRequired.get("required").asBoolean());

        JsonNode schemaOptional = ser.getSchema(provider, null, true);
        assertFalse(schemaOptional.has("required"));
    }

    @Test
    public void testCreateSchemaNodeVariants() {
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        assertNotNull(ser.publicCreateObjectNode());

        ObjectNode node1 = ser.publicCreateSchemaNode("integer");
        assertEquals("integer", node1.get("type").asText());

        ObjectNode node2 = ser.publicCreateSchemaNode("boolean", false);
        assertEquals("boolean", node2.get("type").asText());
        assertTrue(node2.get("required").asBoolean());

        ObjectNode node3 = ser.publicCreateSchemaNode("boolean", true);
        assertEquals("boolean", node3.get("type").asText());
        assertNull(node3.get("required"));
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        JavaType type = mapper.constructType(String.class);

        // ใช้ Anonymous class จำลอง Visitor เพื่อทดสอบการเรียก expectAnyFormat
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor expectAnyFormat(JavaType typeHint) {
                assertNotNull(typeHint);
                return null;
            }
        };

        ser.acceptJsonFormatVisitor(visitor, type);
    }

    @Test(expected = Error.class)
    public void testWrapAndThrowErrorField() throws IOException {
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        Error error = new Error("Fatal Error");
        ser.publicWrapAndThrow(null, error, "bean", "field");
    }

    @Test(expected = Error.class)
    public void testWrapAndThrowErrorIndex() throws IOException {
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        Error error = new Error("Fatal Error");
        ser.publicWrapAndThrow(null, error, "bean", 0);
    }

    @Test(expected = IOException.class)
    public void testWrapAndThrowPlainIOExceptionField() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        IOException ioEx = new IOException("Plain IO");
        ser.publicWrapAndThrow(provider, ioEx, "bean", "field");
    }

    @Test(expected = IOException.class)
    public void testWrapAndThrowPlainIOExceptionIndex() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        IOException ioEx = new IOException("Plain IO");
        ser.publicWrapAndThrow(provider, ioEx, "bean", 0);
    }

    @Test(expected = RuntimeException.class)
    public void testWrapAndThrowRuntimeExceptionNoWrap() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        // สร้าง Provider หรือตั้งค่าให้ WRAP_EXCEPTIONS เป็น false
        // ในที่นี้จำลองผ่าน Provider ที่ปิดการห่อหุ้ม หรือสร้าง Mock พฤติกรรมผ่าน SerializationFeature
        ObjectMapper mapperCustom = new ObjectMapper();
        mapperCustom.disable(SerializationFeature.WRAP_EXCEPTIONS);
        SerializerProvider provider = mapperCustom.getSerializerProviderInstance();

        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        RuntimeException rtEx = new RuntimeException("Unchecked");
        ser.publicWrapAndThrow(provider, rtEx, "bean", "field");
    }

    @Test
    public void testWrapAndThrowInvocationTargetUnwrapField() {
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        Throwable cause = new IllegalArgumentException("Original Exception");
        InvocationTargetException targetEx = new InvocationTargetException(cause);
        try {
            ser.publicWrapAndThrow(null, targetEx, "bean", "field");
            fail("Expected JsonMappingException");
        } catch (Exception e) {
            assertTrue(e instanceof JsonMappingException);
            assertEquals("Original Exception", e.getCause().getMessage());
        }
    }

    @Test
    public void testWrapAndThrowInvocationTargetUnwrapIndex() {
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        Throwable cause = new IllegalArgumentException("Original Exception");
        InvocationTargetException targetEx = new InvocationTargetException(cause);
        try {
            ser.publicWrapAndThrow(null, targetEx, "bean", 1);
            fail("Expected JsonMappingException");
        } catch (Exception e) {
            assertTrue(e instanceof JsonMappingException);
            assertEquals("Original Exception", e.getCause().getMessage());
        }
    }

    @Test
    public void testIsDefaultSerializer() {
        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        assertTrue(ser.publicIsDefaultSerializer(new DummyJacksonStdSerializer()));
        assertFalse(ser.publicIsDefaultSerializer(new NonStdSerializer()));
    }

    @Test
    public void testFindConvertingContentSerializerNulls() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        ConcreteSerializer ser = new ConcreteSerializer(String.class);

        // ทดสอบเมื่อ Introspector เป็น null หรือ Property เป็น null จะคืนค่าเดิมกลับมา
        JsonSerializer<?> existing = new NonStdSerializer();
        JsonSerializer<?> result = ser.publicFindConvertingContentSerializer(provider, null, existing);
        assertEquals(existing, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindPropertyFilterMissingProvider() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance(); // ไม่มี FilterProvider
        ConcreteSerializer ser = new ConcreteSerializer(String.class);

        ser.publicFindPropertyFilter(provider, "myFilterId", "value");
    }

    @Test
    public void testFindPropertyFilterSuccess() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        SimpleFilterProvider filters = new SimpleFilterProvider();
        provider = provider.createInstance(mapper.getSerializationConfig(), filters);

        ConcreteSerializer ser = new ConcreteSerializer(String.class);
        PropertyFilter filter = ser.publicFindPropertyFilter(provider, "nonExistent", "value");
        // ถ้าไม่พบใน SimpleFilterProvider จะคืนค่า null (ขึ้นอยู่กับ Provider) แต่ไม่พ่น Exception ออกมานอกเหนือจากที่กำหนด
        assertNull(filter);
    }
}