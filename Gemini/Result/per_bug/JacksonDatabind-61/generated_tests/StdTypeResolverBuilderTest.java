package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class StdTypeResolverBuilderTest {

    private StdTypeResolverBuilder builder;
    private ObjectMapper objectMapper;
    private JavaType baseType;
    private Collection<NamedType> subtypes;

    @Before
    public void setUp() {
        builder = new StdTypeResolverBuilder();
        objectMapper = new ObjectMapper();
        baseType = objectMapper.constructType(Object.class);
        subtypes = new ArrayList<>();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitNullIdType() {
        builder.init(null, null);
    }

    @Test
    public void testInitValid() {
        StdTypeResolverBuilder result = builder.init(JsonTypeInfo.Id.CLASS, null);
        assertNotNull(result);
        assertEquals(JsonTypeInfo.Id.CLASS, builder._idType);
        assertEquals("@class", builder.getTypeProperty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInclusionNull() {
        builder.inclusion(null);
    }

    @Test
    public void testInclusionValid() {
        StdTypeResolverBuilder result = builder.inclusion(JsonTypeInfo.As.PROPERTY);
        assertNotNull(result);
        assertEquals(JsonTypeInfo.As.PROPERTY, builder._includeAs);
    }

    @Test
    public void testTypePropertyEdgeCases() {
        builder.init(JsonTypeInfo.Id.CLASS, null);

        // Null value -> should fallback to default property name
        builder.typeProperty(null);
        assertEquals("@class", builder.getTypeProperty());

        // Empty string -> should fallback to default property name
        builder.typeProperty("");
        assertEquals("@class", builder.getTypeProperty());

        // Custom value
        builder.typeProperty("customTypeProp");
        assertEquals("customTypeProp", builder.getTypeProperty());
    }

    @Test
    public void testBuildTypeSerializerNone() {
        builder.init(JsonTypeInfo.Id.NONE, null);
        SerializationConfig config = objectMapper.getSerializationConfig();
        assertNull(builder.buildTypeSerializer(config, baseType, subtypes));
    }

    @Test
    public void testBuildTypeSerializerAllCases() {
        SerializationConfig config = objectMapper.getSerializationConfig();

        for (JsonTypeInfo.As includeAs : JsonTypeInfo.As.values()) {
            builder.init(JsonTypeInfo.Id.CLASS, null).inclusion(includeAs);
            try {
                assertNotNull(builder.buildTypeSerializer(config, baseType, subtypes));
            } catch (IllegalStateException e) {
                // If an unexpected inclusion type is introduced
                fail("Failed to build serializer for inclusion: " + includeAs);
            }
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testBuildTypeSerializerInvalidState() {
        builder.init(JsonTypeInfo.Id.CLASS, null);
        // _includeAs is left null
        SerializationConfig config = objectMapper.getSerializationConfig();
        builder.buildTypeSerializer(config, baseType, subtypes);
    }

    @Test
    public void testBuildTypeDeserializerNone() {
        builder.init(JsonTypeInfo.Id.NONE, null);
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        assertNull(builder.buildTypeDeserializer(config, baseType, subtypes));
    }

    @Test
    public void testBuildTypeDeserializerDefaultImplVariants() {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        builder.init(JsonTypeInfo.Id.CLASS, null).inclusion(JsonTypeInfo.As.PROPERTY);

        // Case 1: _defaultImpl == null
        builder.defaultImpl(null);
        assertNotNull(builder.buildTypeDeserializer(config, baseType, subtypes));

        // Case 2: _defaultImpl == Void.class
        builder.defaultImpl(Void.class);
        assertNotNull(builder.buildTypeDeserializer(config, baseType, subtypes));

        // Case 3: _defaultImpl == NoClass.class
        builder.defaultImpl(NoClass.class);
        assertNotNull(builder.buildTypeDeserializer(config, baseType, subtypes));

        // Case 4: Normal specialized class
        builder.defaultImpl(String.class);
        assertNotNull(builder.buildTypeDeserializer(config, baseType, subtypes));
    }

    @Test
    public void testBuildTypeDeserializerAllInclusions() {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        builder.init(JsonTypeInfo.Id.CLASS, null);

        JsonTypeInfo.As[] validDeserializerInclusions = {
            JsonTypeInfo.As.WRAPPER_ARRAY,
            JsonTypeInfo.As.PROPERTY,
            JsonTypeInfo.As.EXISTING_PROPERTY,
            JsonTypeInfo.As.WRAPPER_OBJECT,
            JsonTypeInfo.As.EXTERNAL_PROPERTY
        };

        for (JsonTypeInfo.As includeAs : validDeserializerInclusions) {
            builder.inclusion(includeAs);
            assertNotNull(builder.buildTypeDeserializer(config, baseType, subtypes));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testBuildTypeDeserializerInvalidInclusion() {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        // Force an invalid or unhandled inclusion for deserializer if possible, 
        // or bypass via reflection/direct setting if needed. 
        builder._includeAs = null; 
        builder.buildTypeDeserializer(config, baseType, subtypes);
    }

    @Test
    public void testNoTypeInfoBuilderFactory() {
        StdTypeResolverBuilder b = StdTypeResolverBuilder.noTypeInfoBuilder();
        assertNotNull(b);
        assertEquals(JsonTypeInfo.Id.NONE, b._idType);
    }

    @Test
    public void testIdResolverCustomAndStandardTypes() {
        SerializationConfig config = objectMapper.getSerializationConfig();

        // Custom Id Resolver branch
        TypeIdResolver customRes = new ClassNameIdResolver(baseType, config.getTypeFactory());
        builder.init(JsonTypeInfo.Id.CLASS, customRes);
        assertEquals(customRes, builder.idResolver(config, baseType, subtypes, true, false));

        // Uninitialized idType check
        StdTypeResolverBuilder uninitBuilder = new StdTypeResolverBuilder();
        try {
            uninitBuilder.idResolver(config, baseType, subtypes, true, false);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Can not build, 'init()' not yet called", e.getMessage());
        }

        // Test standard IdTypes
        for (JsonTypeInfo.Id id : new JsonTypeInfo.Id[]{JsonTypeInfo.Id.CLASS, JsonTypeInfo.Id.MINIMAL_CLASS, JsonTypeInfo.Id.NAME}) {
            builder.init(id, null);
            assertNotNull(builder.idResolver(config, baseType, subtypes, true, false));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testIdResolverInvalidIdType() {
        SerializationConfig config = objectMapper.getSerializationConfig();
        builder.init(JsonTypeInfo.Id.CUSTOM, null);
        builder.idResolver(config, baseType, subtypes, true, false);
    }

    @Test
    public void testGettersAndSetters() {
        builder.typeIdVisibility(true);
        assertTrue(builder.isTypeIdVisible());

        builder.defaultImpl(String.class);
        assertEquals(String.class, builder.getDefaultImpl());
    }
}