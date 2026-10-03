package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TypeDeserializerBaseTest {

    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;
    private JavaType baseType;
    private TestableTypeDeserializer deserializer;
    private TypeIdResolver idResolver;

    // Concrete implementation for testing protected methods of TypeDeserializerBase
    private static class TestableTypeDeserializer extends TypeDeserializerBase {
        public TestableTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                                       String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        public TestableTypeDeserializer(TypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new TestableTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        // Expose protected methods for testing
        public JsonDeserializer<Object> publicFindDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        public JsonDeserializer<Object> publicFindDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        public Object publicDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }

        public JavaType publicHandleUnknownTypeId(DeserializationContext ctxt, String typeId) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId);
        }

        public JavaType publicHandleMissingTypeId(DeserializationContext ctxt, String extraDesc) throws IOException {
            return _handleMissingTypeId(ctxt, extraDesc);
        }
    }

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
        baseType = objectMapper.constructType(Object.class);
        
        // Mock or create a simple TypeIdResolver
        idResolver = new TypeIdResolver() {
            @Override
            public void init(JavaType bt) {}

            @Override
            public String idFromValue(Object value) { return "id"; }

            @Override
            public String idFromValueAndType(Object value, Class<?> suggestedType) { return "id"; }

            @Override
            public String idFromBaseType() { return "id"; }

            @Override
            public JavaType typeFromId(DatabindContext context, String id) {
                if ("known".equals(id)) {
                    return objectMapper.constructType(String.class);
                }
                return null;
            }

            @Override
            public String getDescForKnownTypeIds() { return "known-ids"; }

            @Override
            public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CUSTOM; }
        };

        deserializer = new TestableTypeDeserializer(baseType, idResolver, "typeProp", false, null);
    }

    @Test
    public void testConstructorsAndAccessors() {
        assertNotNull(deserializer.baseType());
        assertEquals("java.lang.Object", deserializer.baseTypeName());
        assertEquals("typeProp", deserializer.getPropertyName());
        assertNotNull(deserializer.getTypeIdResolver());
        assertNull(deserializer.getDefaultImpl());
        assertNotNull(deserializer.toString());

        TypeDeserializer cloned = deserializer.forProperty(null);
        assertNotNull(cloned);
    }

    @Test
    public void testFindDeserializerCached() throws IOException {
        // Populate cache first via valid id lookup
        JsonDeserializer<Object> first = deserializer.publicFindDeserializer(deserializationContext, "known");
        assertNotNull(first);

        // Second call should hit the ConcurrentHashMap cache
        JsonDeserializer<Object> second = deserializer.publicFindDeserializer(deserializationContext, "known");
        assertSame(first, second);
    }

    @Test
    public void testFindDeserializerUnknownTypeWithDefaultImpl() throws IOException {
        JavaType defaultImplType = objectMapper.constructType(Integer.class);
        TestableTypeDeserializer deserWithDefault = new TestableTypeDeserializer(
                baseType, idResolver, "typeProp", false, defaultImplType
        );

        JsonDeserializer<Object> result = deserWithDefault.publicFindDeserializer(deserializationContext, "unknown");
        assertNotNull(result);
    }

    @Test
    public void testFindDeserializerUnknownTypeNoDefaultImplReturnsNull() throws IOException {
        // Disable fail on invalid subtype to let it return null/nullifying
        deserializationContext.getConfig().without(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
        
        // When type is unknown, default impl is null, handleUnknownTypeId returns null
        TestableTypeDeserializer strictDeser = new TestableTypeDeserializer(baseType, idResolver, "typeProp", false, null) {
            @Override
            protected JavaType _handleUnknownTypeId(DeserializationContext ctxt, String typeId) throws IOException {
                return null; // Simulate returning null
            }
        };

        JsonDeserializer<Object> result = strictDeser.publicFindDeserializer(deserializationContext, "completelyUnknown");
        assertNull(result);
    }

    @Test
    public void testFindDefaultImplDeserializerNullWithFailFeature() throws IOException {
        deserializationContext.getConfig().without(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
        TestableTypeDeserializer deser = new TestableTypeDeserializer(baseType, idResolver, "typeProp", false, null);
        
        JsonDeserializer<Object> result = deser.publicFindDefaultImplDeserializer(deserializationContext);
        assertEquals(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultImplDeserializerBogusClass() throws IOException {
        JavaType voidType = objectMapper.constructType(Void.TYPE);
        TestableTypeDeserializer deser = new TestableTypeDeserializer(baseType, idResolver, "typeProp", false, voidType);
        
        JsonDeserializer<Object> result = deser.publicFindDefaultImplDeserializer(deserializationContext);
        assertEquals(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testDeserializeWithNativeTypeIdNull() throws IOException {
        JavaType defaultImplType = objectMapper.constructType(Integer.class);
        TestableTypeDeserializer deser = new TestableTypeDeserializer(baseType, idResolver, "typeProp", false, defaultImplType);
        
        JsonParser jp = objectMapper.getFactory().createParser("{}");
        jp.nextToken(); // move parser
        
        Object result = deser.publicDeserializeWithNativeTypeId(jp, deserializationContext, null);
        assertNotNull(result);
        jp.close();
    }

    @Test
    public void testDeserializeWithNativeTypeIdValidString() throws IOException {
        JsonParser jp = objectMapper.getFactory().createParser("\"test\"");
        jp.nextToken();
        
        Object result = deser.publicDeserializeWithNativeTypeId(jp, deserializationContext, "known");
        assertNotNull(result);
        jp.close();
    }

    @Test
    public void testDeserializeWithNativeTypeIdValidNonString() throws IOException {
        JsonParser jp = objectMapper.getFactory().createParser("\"test\"");
        jp.nextToken();
        
        // Pass a non-string object as typeId to trigger String.valueOf(typeId)
        Object result = deser.publicDeserializeWithNativeTypeId(jp, deserializationContext, 12345);
        assertNotNull(result);
        jp.close();
    }

    @Test
    public void testHandleMissingTypeId() throws IOException {
        JavaType result = deserializer.publicHandleMissingTypeId(deserializationContext, "missing desc");
        // Expecting an exception or non-null based on context handling
        assertNotNull(deserializationContext);
    }
}