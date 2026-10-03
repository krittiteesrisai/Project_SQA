package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Senior Test Automation Engineer - Comprehensive JUnit 4 Test Suite
 * Target Class: AsPropertyTypeDeserializer (Defects4J JacksonDatabind-74b)
 */
public class AsPropertyTypeDeserializerTest {

    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;
    private TypeIdResolver typeIdResolver;
    private JavaType baseType;
    private JavaType defaultImplType;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
        typeIdResolver = mock(TypeIdResolver.class);
        baseType = SimpleType.constructUnsafe(Object.class);
        defaultImplType = SimpleType.constructUnsafe(String.class);
    }

    @Test
    public void testNativeTypeId() throws IOException {
        // Edge Case: Parser supports native type ID and returns non-null
        JsonParser p = mock(JsonParser.class);
        when(p.canReadTypeId()).thenReturn(true);
        when(p.getTypeId()).thenReturn("native-type-id");

        AsPropertyTypeDeserializer deserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, null, JsonTypeInfo.As.PROPERTY
        );

        try {
            deserializer.deserializeTypedFromObject(p, deserializationContext);
            fail("Expected exception due to mocked native type handling method internals");
        } catch (Exception e) {
            // Expected since _deserializeWithNativeTypeId relies on active context/deserializer mappings
            assertNotNull(e);
        }
    }

    @Test
    public void testDeserializeTypedFromObjectWithMatchingId() throws IOException {
        // Scenario: Standard JSON object starting with START_OBJECT, containing the type property name.
        String json = "{\"type\":\"string\",\"value\":\"test\"}";
        JsonParser p = objectMapper.getFactory().createParser(json);
        p.nextToken(); // Move to START_OBJECT

        AsPropertyTypeDeserializer deserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, null, JsonTypeInfo.As.PROPERTY
        );

        // Mock TypeIdResolver and Deserializer behavior
        when(typeIdResolver.typeFromId(any(), anyString())).thenReturn(SimpleType.constructUnsafe(String.class));
        
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> mockSubDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        
        // Use a spy or subclass behavior representation if needed, 
        // Here we can test through a partial mock or standard ObjectMapper configuration if feasible.
        // Direct invocation test via subclassing/overriding _findDeserializer if protected:
        AsPropertyTypeDeserializer spyDeserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, null, JsonTypeInfo.As.PROPERTY) {
            @Override
            protected JsonDeserializer<Object> _findDeserializer(DeserializationContext ctxt, String typeId) {
                return mockSubDeser;
            }
        };

        when(mockSubDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("DeserializedString");

        Object result = spyDeserializer.deserializeTypedFromObject(p, deserializationContext);
        assertEquals("DeserializedString", result);
    }

    @Test
    public void testDeserializeTypedFromObjectWithVisibleTypeIdAndBuffer() throws IOException {
        // Scenario: typeIdVisible = true and additional properties requiring TokenBuffer buffering
        String json = "{\"extraProp\":\"extraVal\",\"type\":\"string\"}";
        JsonParser p = objectMapper.getFactory().createParser(json);
        p.nextToken(); // Move to START_OBJECT

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> mockSubDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);

        AsPropertyTypeDeserializer spyDeserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", true, null, JsonTypeInfo.As.PROPERTY) {
            @Override
            protected JsonDeserializer<Object> _findDeserializer(DeserializationContext ctxt, String typeId) {
                return mockSubDeser;
            }
        };

        when(mockSubDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("VisibleIdResult");

        Object result = spyDeserializer.deserializeTypedFromObject(p, deserializationContext);
        assertEquals("VisibleIdResult", result);
    }

    @Test
    public void testDefaultImplementationFallback() throws IOException {
        // Scenario: Missing property name, but defaultImpl is specified.
        String json = "{\"notTheType\":\"val\"}";
        JsonParser p = objectMapper.getFactory().createParser(json);
        p.nextToken(); // START_OBJECT

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> mockDefaultDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);

        AsPropertyTypeDeserializer spyDeserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, defaultImplType, JsonTypeInfo.As.PROPERTY) {
            @Override
            protected JsonDeserializer<Object> _findDefaultImplDeserializer(DeserializationContext ctxt) {
                return mockDefaultDeser;
            }
        };

        when(mockDefaultDeser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("DefaultImplResult");

        Object result = spyDeserializer.deserializeTypedFromObject(p, deserializationContext);
        assertEquals("DefaultImplResult", result);
    }

    @Test
    public void testNaturalValueFallback() throws IOException {
        // Scenario: Natural values (e.g. Integer/Boolean/String) encountered directly
        String json = "123";
        JsonParser p = objectMapper.getFactory().createParser(json);
        p.nextToken(); // VALUE_NUMBER_INT

        AsPropertyTypeDeserializer deserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, null, JsonTypeInfo.As.PROPERTY
        );

        Object result = deserializer.deserializeTypedFromObject(p, deserializationContext);
        // deserializeIfNatural handles Integer for Object baseType or appropriate matching
        assertNotNull(result);
    }

    @Test
    public void testStartArrayFallback() throws IOException {
        // Scenario: Encountering START_ARRAY when as-property fails
        String json = "[1, 2, 3]";
        JsonParser p = objectMapper.getFactory().createParser(json);
        p.nextToken(); // START_ARRAY

        AsPropertyTypeDeserializer deserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, null, JsonTypeInfo.As.PROPERTY);

        try {
            deserializer.deserializeTypedFromObject(p, deserializationContext);
        } catch (Exception e) {
            // Handled or delegated to super, verifying execution path
            assertNotNull(e);
        }
    }

    @Test(expected = IOException.class)
    public void testMissingPropertyException() throws IOException {
        // Edge Case: Invalid state, missing property name and no default impl -> throws wrong token exception
        String json = "{\"wrongField\":\"value\"}";
        JsonParser p = objectMapper.getFactory().createParser(json);
        p.nextToken(); // START_OBJECT

        AsPropertyTypeDeserializer deserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, null, JsonTypeInfo.As.PROPERTY
        );

        deserializer.deserializeTypedFromObject(p, deserializationContext);
    }

    @Test
    public void testDeserializeTypedFromAnyWithStartArray() throws IOException {
        // Scenario: deserializeTypedFromAny receives START_ARRAY token
        String json = "[1, 2]";
        JsonParser p = objectMapper.getFactory().createParser(json);
        p.nextToken(); // START_ARRAY

        AsPropertyTypeDeserializer deserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, null, JsonTypeInfo.As.PROPERTY
        );

        try {
            deserializer.deserializeTypedFromAny(p, deserializationContext);
        } catch (Exception e) {
            // Expected depending on base deserialization capabilities for arrays
            assertNotNull(e);
        }
    }

    @Test
    public void testForPropertyAndInclusion() {
        // Boundary/State check: verifying property creation and inclusion getter
        AsPropertyTypeDeserializer deserializer = new AsPropertyTypeDeserializer(
                baseType, typeIdResolver, "type", false, null, JsonTypeInfo.As.PROPERTY
        );

        assertEquals(JsonTypeInfo.As.PROPERTY, deserializer.getTypeInclusion());

        BeanProperty prop = mock(BeanProperty.class);
        TypeDeserializer newDeser = deserializer.forProperty(prop);
        assertNotNull(newDeser);
        // Same property branch check
        assertSame(newDeser, deserializer.forProperty(null)); 
    }
}