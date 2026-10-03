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
        deserializerFactory = objectMapper.getDeserializationContext().getDeserializerFactory();
    }

    @Test
    public void testCacheLifeCycleAndCount() {
        assertEquals(0, cache.cachedDeserializersCount());
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
        
        Object replaced = cache.writeReplace();
        assertNotNull(replaced);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCachedDeserializerNullType() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void testFindCachedDeserializerWithCustomHandler() {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(java.util.List.class, String.class);
        // กำหนด value handler ให้ content type เพื่อทดสอบ _hasCustomValueHandler เงื่อนไขที่เป็น true
        JavaType contentTypeWithHandler = type.getContentType().withValueHandler(new Object());
        JavaType containerWithHandler = type.widenBy(java.util.List.class).withContentType(contentTypeWithHandler);

        JsonDeserializer<Object> deser = cache._findCachedDeserializer(containerWithHandler);
        assertNull(deser);
    }

    @Test
    public void testFindCachedDeserializerNormal() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> deser = cache._findCachedDeserializer(type);
        assertNull(deser); // ยังไม่ได้แคชไว้ตอนแรก
    }

    @Test
    public void testHasValueDeserializerForNonContainer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        boolean hasDeser = cache.hasValueDeserializerFor(context, deserializerFactory, type);
        assertTrue(hasDeser);
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleUnknownValueDeserializerAbstract() throws Exception {
        JavaType abstractType = TypeFactory.defaultInstance().constructType(java.util.List.class);
        cache._handleUnknownValueDeserializer(abstractType);
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleUnknownValueDeserializerConcrete() throws Exception {
        JavaType concreteType = TypeFactory.defaultInstance().constructType(DeserializerCacheTest.class);
        cache._handleUnknownValueDeserializer(concreteType);
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleUnknownKeyDeserializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        cache._handleUnknownKeyDeserializer(type);
    }

    @Test
    public void testFindKeyDeserializerNull() throws Exception {
        // ทดสอบกรณีสร้าง KeyDeserializer แล้วได้ null จะเรียก _handleUnknownKeyDeserializer
        JavaType type = TypeFactory.defaultInstance().constructType(DeserializerCacheTest.class);
        try {
            cache.findKeyDeserializer(context, deserializerFactory, type);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Can not find a (Map) Key deserializer"));
        }
    }
}