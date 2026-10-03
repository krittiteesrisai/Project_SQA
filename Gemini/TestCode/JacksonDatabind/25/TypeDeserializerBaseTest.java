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
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Senior JUnit 4 Test Automation Suite for TypeDeserializerBase (Defects4J JacksonDatabind-25b)
 */
public class TypeDeserializerBaseTest {

    private ConcreteTypeDeserializerBase deserializer;
    private JavaType baseType;
    private TypeIdResolver idResolver;
    private DeserializationContext context;
    private BeanProperty property;

    // Concrete implementation to test abstract class TypeDeserializerBase
    private static class ConcreteTypeDeserializerBase extends TypeDeserializerBase {
        public ConcreteTypeDeserializerBase(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        public ConcreteTypeDeserializerBase(TypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new ConcreteTypeDeserializerBase(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        // Exposing protected methods for testing
        public JsonDeserializer<Object> publicFindDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        public JsonDeserializer<Object> publicFindDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        public Object publicDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }
    }

    @Before
    public void setUp() {
        ObjectMapper mapper = new ObjectMapper();
        baseType = mapper.constructType(String.class);
        idResolver = mock(TypeIdResolver.class);
        context = mock(DeserializationContext.class);
        property = mock(BeanProperty.class);

        deserializer = new ConcreteTypeDeserializerBase(
                baseType, idResolver, "typeProp", true, null
        );
    }

    @Test
    public void testLifeCycleAndAccessors() {
        assertNotNull(deserializer.baseTypeName());
        assertEquals("typeProp", deserializer.getPropertyName());
        assertEquals(idResolver, deserializer.getTypeIdResolver());
        assertNull(deserializer.getDefaultImpl());
        assertTrue(deserializer.toString().contains(ConcreteTypeDeserializerBase.class.getName()));
        
        TypeDeserializer cloned = deserializer.forProperty(property);
        assertNotNull(cloned);
        assertEquals(JsonTypeInfo.As.PROPERTY, cloned.getTypeInclusion());
    }

    @Test
    public void testFindDeserializerWithCacheAndResolvedType() throws IOException {
        String typeId = "stringId";
        JavaType resolvedType = baseType;

        when(idResolver.typeFromId(context, typeId)).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(context.findContextualValueDeserializer(resolvedType, null)).thenReturn(mockDeser);

        // First call: Miss cache & resolve
        JsonDeserializer<Object> result1 = deserializer.publicFindDeserializer(context, typeId);
        assertEquals(mockDeser, result1);

        // Second call: Hit cache (should not call idResolver again)
        JsonDeserializer<Object> result2 = deserializer.publicFindDeserializer(context, typeId);
        assertEquals(mockDeser, result2);
        verify(idResolver, times(1)).typeFromId(context, typeId);
    }

    @Test
    public void testFindDeserializerWithDifferentClassTypesForNarrowing() throws IOException {
        String typeId = "customId";
        // Mock a type whose class is identical to baseType's class to trigger _baseType.narrowBy(...)
        JavaType sameClassType = mock(JavaType.class);
        when(sameClassType.getRawClass()).thenReturn((Class) String.class);
        when(sameClassType.getClass()).thenReturn((Class) baseType.getClass());

        when(idResolver.typeFromId(context, typeId)).thenReturn(sameClassType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(context.findContextualValueDeserializer(any(JavaType.class), eq(null))).thenReturn(mockDeser);

        JsonDeserializer<Object> result = deserializer.publicFindDeserializer(context, typeId);
        assertNotNull(result);
    }

    @Test
    public void testFindDeserializerUnknownTypeFallbackToDefaultImpl() throws IOException {
        String typeId = "unknownId";
        when(idResolver.typeFromId(context, typeId)).thenReturn(null);
        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);

        JsonDeserializer<Object> result = deserializer.publicFindDeserializer(context, typeId);
        assertEquals(NullifyingDeserializer.instance, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindDeserializerUnknownTypeThrowsExceptionWhenFailOnInvalidSubtype() throws IOException {
        String typeId = "unknownId";
        when(idResolver.typeFromId(context, typeId)).thenReturn(null);
        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        when(context.unknownTypeException(eq(baseType), eq(typeId), anyString()))
                .thenReturn(new JsonMappingException("Unknown type"));

        deserializer.publicFindDeserializer(context, typeId);
    }

    @Test
    public void testFindDefaultImplDeserializerWithBogusClass() throws Exception {
        // Use Void.class which is handled or treated as Bogus / null-mapping context
        ConcreteTypeDeserializerBase deserWithVoid = new ConcreteTypeDeserializerBase(
                baseType, idResolver, "typeProp", true, Void.class
        );
        JsonDeserializer<Object> result = deserWithVoid.publicFindDefaultImplDeserializer(context);
        assertEquals(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testDeserializeWithNativeTypeIdNull() throws Exception {
        JsonParser jp = mock(JsonParser.class);
        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);

        // When typeId is null and no default impl, fallback to NullifyingDeserializer which might fail on deserialize,
        // but here we check the internal resolution when default impl returns NullifyingDeserializer.
        Object result = deserializer.publicDeserializeWithNativeTypeId(jp, context, null);
        // NullifyingDeserializer.deserialize returns null usually or handles it
        assertNotNull(result);
    }

    @Test(expected = IOException.class)
    public void testDeserializeWithNativeTypeIdNullThrowsMappingException() throws Exception {
        JsonParser jp = mock(JsonParser.class);
        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        when(context.mappingException(anyString())).thenReturn(new JsonMappingException("No native type id"));

        deserializer.publicDeserializeWithNativeTypeId(jp, context, null);
    }

    @Test
    public void testDeserializeWithNativeTypeIdNonString() throws Exception {
        JsonParser jp = mock(JsonParser.class);
        Object rawTypeId = 123; // Non-string typeId
        String typeIdStr = "123";

        JavaType resolvedType = baseType;
        when(idResolver.typeFromId(context, typeIdStr)).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(mockDeser.deserialize(jp, context)).thenReturn("DeserializedValue");
        when(context.findContextualValueDeserializer(resolvedType, null)).thenReturn(mockDeser);

        Object result = deserializer.publicDeserializeWithNativeTypeId(jp, context, rawTypeId);
        assertEquals("DeserializedValue", result);
    }
}