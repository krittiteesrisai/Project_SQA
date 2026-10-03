package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectMapperTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testDefaultTypeResolverBuilder_JavaLangObject() {
        ObjectMapper.DefaultTypeResolverBuilder builder = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        
        JavaType objType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType strType = TypeFactory.defaultInstance().constructType(String.class);

        assertTrue(builder.useForType(objType));
        assertFalse(builder.useForType(strType));
    }

    @Test
    public void testDefaultTypeResolverBuilder_ObjectAndNonConcrete() {
        ObjectMapper.DefaultTypeResolverBuilder builder = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);

        JavaType abstractType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType concreteType = TypeFactory.defaultInstance().constructType(ArrayList.class);
        JavaType treeNodeType = TypeFactory.defaultInstance().constructType(ObjectNode.class);

        assertTrue(builder.useForType(abstractType));
        assertFalse(builder.useForType(concreteType));
        assertFalse(builder.useForType(treeNodeType)); // TreeNode should be skipped
    }

    @Test
    public void testDefaultTypeResolverBuilder_NonConcreteAndArrays() {
        ObjectMapper.DefaultTypeResolverBuilder builder = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);

        JavaType arrayType = TypeFactory.defaultInstance().constructType(String[].class);
        JavaType abstractType = TypeFactory.defaultInstance().constructType(List.class);

        assertTrue(builder.useForType(arrayType));
        assertTrue(builder.useForType(abstractType));
    }

    @Test
    public void testDefaultTypeResolverBuilder_NonFinal() {
        ObjectMapper.DefaultTypeResolverBuilder builder = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);

        JavaType nonFinalType = TypeFactory.defaultInstance().constructType(ArrayList.class);
        JavaType finalType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType treeNodeType = TypeFactory.defaultInstance().constructType(ObjectNode.class);

        assertTrue(builder.useForType(nonFinalType));
        assertFalse(builder.useForType(finalType));
        assertFalse(builder.useForType(treeNodeType));
    }

    @Test
    public void testRegisterModule_DuplicateIgnored() {
        objectMapper.enable(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS);
        DummyModule module = new DummyModule("test-module", new Version(1, 0, 0, null, "pkg", "name"));
        
        objectMapper.registerModule(module);
        // Registering again should hit the duplicate check branch and return cleanly
        objectMapper.registerModule(module);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_NullName() {
        DummyModule module = new DummyModule(null, new Version(1, 0, 0, null, "pkg", "name"));
        objectMapper.registerModule(module);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_NullVersion() {
        DummyModule module = new DummyModule("test-module", null);
        objectMapper.registerModule(module);
    }

    @Test
    public void testConvertValue_NullInput() {
        assertNull(objectMapper.convertValue(null, String.class));
        assertNull(objectMapper.convertValue(null, TypeFactory.defaultInstance().constructType(String.class)));
    }

    @Test
    public void testConvertValue_DirectAssignment() {
        String input = "Hello World";
        String result = objectMapper.convertValue(input, String.class);
        assertEquals(input, result);
    }

    @Test
    public void testConvertValue_TokenBufferNullAndEmpty() {
        // Testing token buffer conversions simulating null or empty structures
        ObjectNode node = objectMapper.createObjectNode();
        Map<?, ?> result = objectMapper.convertValue(node, Map.class);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableDefaultTyping_ExternalPropertyException() {
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    @Test
    public void testCanSerializeAndDeserializeWithCause() {
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertTrue(objectMapper.canSerialize(String.class, cause));
        assertNull(cause.get());

        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertTrue(objectMapper.canDeserialize(type, cause));
        assertNull(cause.get());
    }

    @Test
    public void testCopyObjectMapper() {
        ObjectMapper copy = objectMapper.copy();
        assertNotNull(copy);
        assertNotSame(objectMapper, copy);
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidCopyObjectMapper() {
        SubObjectMapper sub = new SubObjectMapper();
        sub._checkInvalidCopy(ObjectMapper.class);
    }

    // --- Helper classes for testing ---
    private static class DummyModule extends Module {
        private final String name;
        private final Version version;

        public DummyModule(String name, Version version) {
            this.name = name;
            this.version = version;
        }

        @Override
        public String getModuleName() { return name; }

        @Override
        public Version version() { return version; }

        @Override
        public void setupModule(SetupContext context) {
            // No-op
        }
    }

    private static class SubObjectMapper extends ObjectMapper {
        private static final long serialVersionUID = 1L;
    }
}