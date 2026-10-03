package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for DeserializerCache.
 * Implements rigorous edge cases and branch coverage targeting Defects4J fault patterns.
 */
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
        deserializerFactory = objectMapper.getDeserializationConfig().getDeserializerFactory();
    }

    @Test
    public void testCachedDeserializersCountAndFlush() {
        assertEquals(0, cache.cachedDeserializersCount());
        
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> dummyDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        
        cache._cachedDeserializers.put(type, dummyDeser);
        assertEquals(1, cache.cachedDeserializersCount());

        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCachedDeserializerWithNullType() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void testFindCachedDeserializerWithCustomHandlers() {
        JavaType contentType = TypeFactory.defaultInstance().constructType(String.class)
                .withValueHandler(new Object());
        JavaType containerType = TypeFactory.defaultInstance().constructCollectionType(java.util.List.class, contentType);

        JsonDeserializer<Object> result = cache._findCachedDeserializer(containerType);
        assertNull(result);
    }

    @Test
    public void testFindKeyDeserializerNullAndResolvable() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        
        // Mocking or passing a type where key deserializer is null or needs resolution
        KeyDeserializer kd = cache.findKeyDeserializer(context, deserializerFactory, type);
        assertNotNull(kd);
    }

    @Test
    public void testWriteReplace() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> dummyDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        cache._incompleteDeserializers.put(type, dummyDeser);
        
        Object replaced = cache.writeReplace();
        assertSame(cache, replaced);
        assertTrue(cache._incompleteDeserializers.isEmpty());
    }

    @Test
    public void testVerifyAsClassEdgeCases() throws Exception {
        Method method = DeserializerCache.class.getDeclaredMethod("_verifyAsClass", Object.class, String.class, Class.class);
        method.setAccessible(true);

        // 1. src == null -> returns null
        Object res1 = method.invoke(cache, null, "testMethod", JsonDeserializer.None.class);
        assertNull(res1);

        // 2. src is not a Class -> throws IllegalStateException (InvocationTargetException)
        try {
            method.invoke(cache, "NotAClass", "testMethod", JsonDeserializer.None.class);
            fail("Expected IllegalStateException");
        } catch (java.lang.reflect.InvocationTargetException e) {
            assertTrue(e.getTargetException() instanceof IllegalStateException);
        }

        // 3. cls == noneClass -> returns null
        Object res3 = method.invoke(cache, JsonDeserializer.None.class, "testMethod", JsonDeserializer.None.class);
        assertNull(res3);
    }

    @Test
    public void testHasValueDeserializerForCaching() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        boolean hasDeser = cache.hasValueDeserializerFor(context, deserializerFactory, type);
        assertTrue(hasDeser);
        // Second call should hit the cache
        boolean hasDeserCached = cache.hasValueDeserializerFor(context, deserializerFactory, type);
        assertTrue(hasDeserCached);
    }
}