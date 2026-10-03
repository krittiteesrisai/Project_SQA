package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class AsWrapperTypeDeserializerTest {

    // Simple Test Bean
    public static class ValueBean {
        public String name;
        public ValueBean() {}
        public ValueBean(String name) { this.name = name; }
    }

    // Custom TypeIdResolver for testing
    private TypeIdResolver createDummyIdResolver() {
        return new com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase(
                ObjectMapper.defaultInstance().constructType(Object.class),
                ObjectMapper.defaultInstance().getTypeFactory()) {
            @Override
            public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CUSTOM; }
            @Override
            public String idFromValue(Object value) { return "test-id"; }
            @Override
            public String idFromValueAndType(Object value, Class<?> suggestedType) { return "test-id"; }
            @Override
            public JavaType typeFromId(DatabindContext context, String id) {
                return ObjectMapper.defaultInstance().constructType(ValueBean.class);
            }
        };
    }

    private ObjectMapper createObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(ValueBean.class, new JsonDeserializer<ValueBean>() {
            @Override
            public ValueBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                // Read simple JSON object like {"name": "val"}
                String n = null;
                if (p.getCurrentToken() == JsonToken.START_OBJECT) {
                    p.nextToken();
                }
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("name".equals(field)) {
                        n = p.getText();
                    }
                    p.nextToken();
                }
                return new ValueBean(n);
            }
        });
        mapper.registerModule(module);
        return mapper;
    }

    @Test
    public void testGetTypeInclusion() {
        JavaType baseType = ObjectMapper.defaultInstance().constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "typeProp", false, null);
        
        assertEquals(JsonTypeInfo.As.WRAPPER_OBJECT, deserializer.getTypeInclusion());
    }

    @Test
    public void testForProperty() {
        JavaType baseType = ObjectMapper.defaultInstance().constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "typeProp", false, null);
        
        BeanProperty.Std property = new BeanProperty.Std(
                PropertyName.construct("propName"), baseType, null, null, null, PropertyMetadata.STD_REQUIRED);
        
        TypeDeserializer newDeser = deserializer.forProperty(property);
        assertNotNull(newDeser);
        
        // Same property should return 'this'
        TypeDeserializer sameDeser = deserializer.forProperty(null);
        assertSame(deserializer, sameDeser);
    }

    @Test
    public void testDeserializeTypedFromObjectSuccess() throws Exception {
        ObjectMapper mapper = createObjectMapper();
        JavaType baseType = mapper.constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "type", false, null);

        String json = "{\"test-id\":{\"name\":\"Hello Jackson\"}}";
        JsonParser p = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        p.nextToken(); // Move to START_OBJECT
        Object result = deserializer.deserializeTypedFromObject(p, ctxt);

        assertNotNull(result);
        assertTrue(result instanceof ValueBean);
        assertEquals("Hello Jackson", ((ValueBean) result).name);
    }

    @Test
    public void testDeserializeTypedFromArray() throws Exception {
        ObjectMapper mapper = createObjectMapper();
        JavaType baseType = mapper.constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "type", false, null);

        String json = "{\"test-id\":{\"name\":\"ArrayContext\"}}";
        JsonParser p = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        p.nextToken();
        Object result = deserializer.deserializeTypedFromArray(p, ctxt);
        assertNotNull(result);
    }

    @Test
    public void testDeserializeTypedFromScalar() throws Exception {
        ObjectMapper mapper = createObjectMapper();
        JavaType baseType = mapper.constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "type", false, null);

        String json = "{\"test-id\":{\"name\":\"ScalarContext\"}}";
        JsonParser p = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        p.nextToken();
        Object result = deserializer.deserializeTypedFromScalar(p, ctxt);
        assertNotNull(result);
    }

    @Test
    public void testDeserializeTypedFromAny() throws Exception {
        ObjectMapper mapper = createObjectMapper();
        JavaType baseType = mapper.constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "type", false, null);

        String json = "{\"test-id\":{\"name\":\"AnyContext\"}}";
        JsonParser p = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        p.nextToken();
        Object result = deserializer.deserializeTypedFromAny(p, ctxt);
        assertNotNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidTokenStartObjectException() throws Exception {
        ObjectMapper mapper = createObjectMapper();
        JavaType baseType = mapper.constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "type", false, null);

        // Invalid JSON: starts with START_ARRAY instead of START_OBJECT
        String json = "[1, 2, 3]";
        JsonParser p = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        p.nextToken(); // START_ARRAY
        deserializer.deserializeTypedFromObject(p, ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidTokenFieldNameException() throws Exception {
        ObjectMapper mapper = createObjectMapper();
        JavaType baseType = mapper.constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "type", false, null);

        // Invalid JSON: Object without field name (empty object)
        String json = "{}";
        JsonParser p = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        p.nextToken(); // START_OBJECT
        deserializer.deserializeTypedFromObject(p, ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidClosingEndObjectException() throws Exception {
        ObjectMapper mapper = createObjectMapper();
        JavaType baseType = mapper.constructType(ValueBean.class);
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "type", false, null);

        // Invalid JSON: missing closing END_OBJECT for wrapper
        String json = "{\"test-id\":{\"name\":\"test\"}} EXTRA_TOKEN";
        JsonParser p = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        p.nextToken();
        // This will deserialize value but fail at closing end object check due to trailing extra tokens or improper structure
        // Let's craft precisely an unclosed wrapper
        String malformedJson = "{\"test-id\":{\"name\":\"test\"}"; 
        JsonParser p2 = mapper.getFactory().createParser(malformedJson);
        p2.nextToken();
        deserializer.deserializeTypedFromObject(p2, ctxt);
    }

    @Test
    public void testTypeIdVisibleTrue() throws Exception {
        ObjectMapper mapper = createObjectMapper();
        JavaType baseType = mapper.constructType(ValueBean.class);
        // typeIdVisible = true
        AsWrapperTypeDeserializer deserializer = new AsWrapperTypeDeserializer(
                baseType, createDummyIdResolver(), "typeProp", true, null);

        String json = "{\"test-id\":{\"name\":\"VisibleTest\"}}";
        JsonParser p = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        p.nextToken();
        Object result = deserializer.deserializeTypedFromObject(p, ctxt);
        assertNotNull(result);
    }
}