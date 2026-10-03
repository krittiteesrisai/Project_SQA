package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
        mapper = null;
    }

    @Test
    public void testDefaultTypeResolverBuilder_ObjectAndNonConcrete() {
        ObjectMapper.DefaultTypeResolverBuilder builder = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);

        JavaType javaObjectType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType treeNodeType = TypeFactory.defaultInstance().constructType(ObjectNode.class);

        assertTrue("Object type should use typing", builder.useForType(javaObjectType));
        assertFalse("Concrete String type should not use typing", builder.useForType(stringType));
        assertFalse("TreeNode should not use typing per issue #88", builder.useForType(treeNodeType));
    }

    @Test
    public void testDefaultTypeResolverBuilder_NonConcreteAndArrays() {
        ObjectMapper.DefaultTypeResolverBuilder builder = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);

        JavaType arrayStringType = TypeFactory.defaultInstance().constructType(String[].class);
        JavaType listType = TypeFactory.defaultInstance().constructType(List.class);

        assertTrue("Array type should use typing", builder.useForType(arrayStringType));
        assertTrue("Abstract list type should use typing", builder.useForType(listType));
    }

    @Test
    public void testDefaultTypeResolverBuilder_NonFinal() {
        ObjectMapper.DefaultTypeResolverBuilder builder = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);

        JavaType arrayListType = TypeFactory.defaultInstance().constructType(ArrayList.class);
        JavaType finalClassType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType treeNodeType = TypeFactory.defaultInstance().constructType(ObjectNode.class);

        assertTrue("Non-final collection should use typing", builder.useForType(arrayListType));
        assertFalse("Final class should not use typing", builder.useForType(finalClassType));
        assertFalse("TreeNode should not use typing", builder.useForType(treeNodeType));
    }

    @Test
    public void testDefaultTypeResolverBuilder_JavaLangObject() {
        ObjectMapper.DefaultTypeResolverBuilder builder = 
            new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);

        JavaType javaObjectType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);

        assertTrue(builder.useForType(javaObjectType));
        assertFalse(builder.useForType(stringType));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableDefaultTypingWithExternalPropertyThrowsException() {
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    @Test
    public void testRegisterModuleAndDuplicates() {
        TestModule module = new TestModule("test-module", new Version(1, 0, 0, null, "pkg", "name"));
        mapper.enable(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS);
        
        mapper.registerModule(module);
        // Registering again should trigger duplicate check and return early
        mapper.registerModule(module);

        assertNotNull(mapper.findAndRegisterModules());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModuleWithoutName() {
        TestModule invalidModule = new TestModule(null, new Version(1, 0, 0, null, "pkg", "name"));
        mapper.registerModule(invalidModule);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModuleWithoutVersion() {
        TestModule invalidModule = new TestModule("name", null);
        mapper.registerModule(invalidModule);
    }

    @Test
    public void testReadValueNullAndEmptyTokens() throws IOException {
        // Test null value token branch
        String jsonNull = "null";
        String resultNull = mapper.readValue(jsonNull, String.class);
        assertNull(resultNull);

        // Test end of array / object branch returning null
        String jsonEmptyArray = "[]";
        Object resultEmpty = mapper.readValue(jsonEmptyArray, Object.class);
        assertNull(resultEmpty);
    }

    @Test
    public void testUnwrapAndDeserializeSuccessAndFailure() throws IOException {
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);

        String json = "{\"DummyRoot\":{\"value\":\"test\"}}";
        DummyPojo pojo = mapper.readValue(json, DummyPojo.class);
        assertNotNull(pojo);
        assertEquals("test", pojo.value);

        // Failure branch: Wrong root name
        String invalidJson = "{\"WrongRoot\":{\"value\":\"test\"}}";
        try {
            mapper.readValue(invalidJson, DummyPojo.class);
            fail("Expected JsonMappingException due to root name mismatch");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("does not match expected"));
        }

        // Failure branch: Current token not START_OBJECT
        String invalidTokenJson = "\"justAString\"";
        try {
            mapper.readValue(invalidTokenJson, DummyPojo.class);
            fail("Expected JsonMappingException due to non-START_OBJECT token");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Current token not START_OBJECT"));
        }
    }

    @Test
    public void testConvertValueEdgeCases() {
        // null input
        assertNull(mapper.convertValue(null, String.class));

        // assignment compatibility optimization branch
        String original = "hello";
        String converted = mapper.convertValue(original, String.class);
        assertSame(original, converted);

        // normal conversion
        Map<String, Object> map = new HashMap<>();
        map.put("value", "convertedValue");
        DummyPojo pojo = mapper.convertValue(map, DummyPojo.class);
        assertNotNull(pojo);
        assertEquals("convertedValue", pojo.value);
    }

    @Test
    public void testCanSerializeAndDeserializeWithCause() {
        AtomicReference<Throwable> cause = new AtomicReference<>();
        assertTrue(mapper.canSerialize(String.class, cause));
        assertNull(cause.get());

        assertTrue(mapper.canDeserialize(mapper.constructType(String.class), cause));
        assertNull(cause.get());
    }

    @Test
    public void testReadTreeVariations() throws IOException {
        String json = "{\"key\":\"value\"}";
        assertNotNull(mapper.readTree(json));
        assertNotNull(mapper.readTree(json.getBytes()));
        assertNotNull(mapper.readTree(new StringReader(json)));
    }

    // --- Helper classes for testing ---
    public static class TestModule extends Module {
        private final String name;
        private final Version version;

        public TestModule(String name, Version version) {
            this.name = name;
            this.version = version;
        }

        @Override
        public String getModuleName() { return name; }

        @Override
        public Version version() { return version; }

        @Override
        public void setupModule(SetupContext context) {
            // No-op setup
        }
    }

    @JsonRootName("DummyRoot")
    public static class DummyPojo {
        public String value;
    }
}