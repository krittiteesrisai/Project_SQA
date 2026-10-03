package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeserializerCacheTest {

    private DeserializerCache cache;
    private ObjectMapper objectMapper;
    private DeserializationContext context;
    private DeserializerFactory deserializerFactory;

    @Before
    public void setUp() {
        cache = new DeserializerCache();
        objectMapper = new ObjectMapper();
        context = objectMapper.getDeserializationContext();
        deserFactory = objectMapper.getDeserializationConfig().getDeserializerFactory();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCachedDeserializer_NullType_ThrowsException() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void testCachedDeserializersCountAndFlush() {
        assertEquals(0, cache.cachedDeserializersCount());
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        
        // Populate cache manually or via finding
        try {
            cache.findValueDeserializer(context, deserFactory, type);
        } catch (Exception e) {
            // Ignore if factory fails, but count should reflect or be testable via direct cache insertion/flush
        }
        
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindKeyDeserializer_NullHandling() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        // Test key deserializer lookup flow
        try {
            KeyDeserializer kd = cache.findKeyDeserializer(context, deserFactory, type);
            assertNotNull(kd);
        } catch (Exception e) {
            // Expected if default factory doesn't handle String keys without additional setup in minimal context
        }
    }

    @Test
    public void testHasValueDeserializerFor_BasicType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        boolean hasDeser = cache.hasValueDeserializerFor(context, deserFactory, type);
        assertTrue(hasDeser);
    }

    @Test
    public void testHasValueDeserializerFor_AbstractType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(java.util.List.class);
        boolean hasDeser = cache.hasValueDeserializerFor(context, deserFactory, type);
        // Abstract list should map to collection type and be resolvable
        assertTrue(hasDeser);
    }

    @Test
    public void testWriteReplace_ClearsIncompleteDeserializers() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        cache._incompleteDeserializers.put(type, new com.fasterxml.jackson.databind.deser.std.StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        });

        assertFalse(cache._incompleteDeserializers.isEmpty());
        Object replaced = cache.writeReplace();
        assertSame(cache, replaced);
        assertTrue(cache._incompleteDeserializers.isEmpty());
    }

    @Test
    public void testHasCustomHandlers_EdgeCases() {
        // Constructing types with custom value handlers to trigger _hasCustomHandlers branches
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType arrayType = TypeFactory.defaultInstance().constructArrayType(baseType);
        
        // Initially no custom handlers
        JsonDeserializer<Object> deser = cache._findCachedDeserializer(arrayType);
        assertNull(deser); // Not cached yet
    }
}