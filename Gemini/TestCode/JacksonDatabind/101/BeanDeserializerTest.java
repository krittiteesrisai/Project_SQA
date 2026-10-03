package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Suite for BeanDeserializer targeting high branch/condition
 * coverage and edge-case defect detection aligned with Defects4J standards.
 */
public class BeanDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
        mapper = null;
    }

    // Dummy POJO for testing vanilla and standard deserialization
    public static class SimplePojo {
        public String name;
        public int age;
    }

    // Dummy POJO with custom creator returning null to test _creatorReturnedNullException
    public static class NullCreatorPojo {
        public String value;
        public NullCreatorPojo(String value) {
            this.value = value;
        }
    }

    @Test
    public void testVanillaDeserializeSuccess() throws IOException {
        String json = "{\"name\":\"Alice\",\"age\":30}";
        SimplePojo result = mapper.readValue(json, SimplePojo.class);
        assertNotNull(result);
        assertEquals("Alice", result.name);
        assertEquals(30, result.age);
    }

    @Test
    public void testDeserializeOtherValueString() throws IOException {
        // Triggers _deserializeOther with VALUE_STRING branch via custom deserializer/parser context
        ObjectMapper customMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(SimplePojo.class, new JsonDeserializer<SimplePojo>() {
            @Override
            public SimplePojo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                BeanDeserializer deserializer = (BeanDeserializer) ctxt.findNonContextualValueDeserializer(ctxt.constructType(SimplePojo.class));
                return (SimplePojo) deserializer._deserializeOther(p, ctxt, p.getCurrentToken());
            }
        });
        customMapper.registerModule(module);
        
        // Passing a string instead of object where appropriate or directly invoking through parser
        // Here we test handling unexpected token or string deserialization branch if supported
        try {
            customMapper.readValue("\"SomeString\"", SimplePojo.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testUnwrappingDeserializerRecursionGuard() {
        // Test unwrappingDeserializer branch where class matches or transformer matches recursion
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(
                mapper.constructType(SimplePojo.class), 
                mapper.getSerializationConfig()
        );
        BeanDeserializer deserializer = new BeanDeserializer(
                builder,
                mapper.getDeserializationConfig().introspect(mapper.constructType(SimplePojo.class)),
                null, null, null, false, false
        );

        NameTransformer transformer = NameTransformer.simpleTransformer("pre_", "_post");
        JsonDeserializer<Object> firstUnwrap = deserializer.unwrappingDeserializer(transformer);
        assertNotNull(firstUnwrap);

        // Trigger recursion guard where _currentlyTransforming == transformer
        JsonDeserializer<Object> recursiveUnwrap = firstUnwrap.unwrappingDeserializer(transformer);
        assertSame(firstUnwrap, recursiveUnwrap);
    }

    @Test
    public void testWithMethods() {
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(
                mapper.constructType(SimplePojo.class), 
                mapper.getSerializationConfig()
        );
        BeanDeserializer deserializer = new BeanDeserializer(
                builder,
                mapper.getDeserializationConfig().introspect(mapper.constructType(SimplePojo.class)),
                null, null, null, false, false
        );

        assertNotNull(deserializer.withIgnorableProperties(null));
        assertNotNull(deserializer.withBeanProperties(null));
        assertNotNull(deserializer.asArrayDeserializer());
    }

    @Test
    public void testDeserializeFromNullStandard() {
        // Test deserializeFromNull when custom codec is not required -> throws unexpected token exception
        String json = "null";
        try {
            mapper.readValue(json, SimplePojo.class);
            fail("Expected JsonMappingException for null token mapping");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCreatorReturnedNullException() {
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(
                mapper.constructType(NullCreatorPojo.class), 
                mapper.getSerializationConfig()
        );
        BeanDeserializer deserializer = new BeanDeserializer(
                builder,
                mapper.getDeserializationConfig().introspect(mapper.constructType(NullCreatorPojo.class)),
                null, null, null, false, false
        );
        
        Exception ex = deserializer._creatorReturnedNullException();
        assertNotNull(ex);
        assertTrue(ex instanceof NullPointerException);
        assertEquals("JSON Creator returned null", ex.getMessage());
        
        // Verify caching of the exception instance
        Exception exCached = deserializer._creatorReturnedNullException();
        assertSame(ex, exCached);
    }
}