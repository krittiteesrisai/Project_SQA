package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class StringCollectionDeserializerTest {

    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;
    private JavaType collectionType;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
        collectionType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
    }

    @Test
    public void testIsCachable() {
        StringCollectionDeserializer deser1 = new StringCollectionDeserializer(collectionType, null, null);
        assertTrue(deser1.isCachable());

        // Custom deserializer present
        JsonDeserializer<String> dummyDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "dummy";
            }
        };
        StringCollectionDeserializer deser2 = new StringCollectionDeserializer(collectionType, dummyDeser, null);
        assertFalse(deser2.isCachable());
    }

    @Test
    public void testWithResolvedNoChange() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, null);
        // Calling with same parameters should return 'this' due to optimization branch
        StringCollectionDeserializer resolved = deser.withResolved(null, null, null, null);
        assertSame(deser, resolved);
    }

    @Test
    public void testWithResolvedChanged() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, null);
        JsonDeserializer<String> dummyDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "test";
            }
        };
        StringCollectionDeserializer resolved = deser.withResolved(null, dummyDeser, null, Boolean.TRUE);
        assertNotSame(deser, resolved);
    }

    @Test
    public void testGetContentDeserializerAndValueInstantiator() {
        JsonDeserializer<String> dummyDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "test";
            }
        };
        ValueInstantiator instantiator = new ValueInstantiator.Base(collectionType);
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, dummyDeser, instantiator);

        assertEquals(dummyDeser, deser.getContentDeserializer());
        assertEquals(instantiator, deser.getValueInstantiator());
    }

    @Test
    public void testDeserializeStandardArray() throws Exception {
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = objectMapper.getFactory().createParser(json);
        parser.nextToken(); // START_ARRAY

        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, null);
        Collection<String> result = new ArrayList<>();
        Collection<String> deserialized = deser.deserialize(parser, deserializationContext, result);

        assertNotNull(deserialized);
        assertEquals(3, deserialized.size());
        assertTrue(deserialized.contains("a"));
        assertTrue(deserialized.contains("b"));
        assertTrue(deserialized.contains("c"));
    }

    @Test
    public void testDeserializeWithNullsAndParsing() throws Exception {
        // Contains null value and non-string or regular token parsing path
        String json = "[\"first\", null, 123]";
        JsonParser parser = objectMapper.getFactory().createParser(json);
        parser.nextToken(); // START_ARRAY

        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, null);
        Collection<String> result = new ArrayList<>();
        
        // Use a custom null provider or default behavior
        Collection<String> deserialized = deser.deserialize(parser, deserializationContext, result);
        assertNotNull(deserialized);
        assertTrue(deserialized.contains("first"));
        assertTrue(deserialized.contains("123")); // Integer parsed as string via _parseString
    }

    @Test
    public void testDeserializeCustomDeserializer() throws Exception {
        String json = "[\"custom1\", \"custom2\"]";
        JsonParser parser = objectMapper.getFactory().createParser(json);
        parser.nextToken(); // START_ARRAY

        JsonDeserializer<String> customDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "custom_" + p.getText();
            }
        };

        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, customDeser, null);
        Collection<String> result = new ArrayList<>();
        Collection<String> deserialized = deser.deserialize(parser, deserializationContext, result);

        assertNotNull(deserialized);
        assertTrue(deserialized.contains("custom_custom1"));
        assertTrue(deserialized.contains("custom_custom2"));
    }

    @Test
    public void testHandleNonArrayAcceptSingleValue() throws Exception {
        // Single value with ACCEPT_SINGLE_VALUE_AS_ARRAY enabled
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        String json = "\"singleItem\"";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken(); // VALUE_STRING

        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, null);
        Collection<String> result = new ArrayList<>();
        Collection<String> deserialized = deser.deserialize(parser, ctxt, result);

        assertEquals(1, deserialized.size());
        assertTrue(deserialized.contains("singleItem"));
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleNonArrayRejectSingleValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        String json = "\"singleItem\"";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken(); // VALUE_STRING

        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, null);
        Collection<String> result = new ArrayList<>();
        deser.deserialize(parser, ctxt, result); // Should throw exception
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        String json = "[\"x\"]";
        JsonParser parser = objectMapper.getFactory().createParser(json);
        parser.nextToken();

        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, null);
        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override
            public TypeIdResolver getTypeIdResolver() { return null; }
            @Override
            public As getTypeInclusion() { return As.WRAPPER_OBJECT; }
            @Override
            public String getPropertyName() { return "type"; }
            @Override
            public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override
            public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
                return deser.deserialize(p, ctxt, new ArrayList<>());
            }
            @Override
            public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override
            public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        };

        Object res = deser.deserializeWithType(parser, deserializationContext, typeDeserializer);
        assertNotNull(res);
        assertTrue(res instanceof Collection);
    }
}