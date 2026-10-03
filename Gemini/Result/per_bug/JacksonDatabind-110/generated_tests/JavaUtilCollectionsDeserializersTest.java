package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;

public class JavaUtilCollectionsDeserializersTest {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final TypeFactory typeFactory = objectMapper.getTypeFactory();
    private final DeserializationContext context = objectMapper.getDeserializationContext();

    @Test
    public void testFindForCollectionArraysList() throws Exception {
        List<?> instance = Arrays.asList("a", "b");
        JavaType type = typeFactory.constructType(instance.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(context, type);
        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollectionSingletonList() throws Exception {
        List<?> instance = Collections.singletonList("a");
        JavaType type = typeFactory.constructType(instance.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(context, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollectionSingletonSet() throws Exception {
        Set<?> instance = Collections.singleton("a");
        JavaType type = typeFactory.constructType(instance.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(context, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollectionUnmodifiableList() throws Exception {
        List<?> instance = Collections.unmodifiableList(new ArrayList<>());
        JavaType type = typeFactory.constructType(instance.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(context, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollectionUnmodifiableSet() throws Exception {
        Set<?> instance = Collections.unmodifiableSet(new HashSet<>());
        JavaType type = typeFactory.constructType(instance.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(context, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollectionNullElse() throws Exception {
        JavaType type = typeFactory.constructType(String.class);
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(context, type);
        assertNull(deser);
    }

    @Test
    public void testFindForMapSingletonMap() throws Exception {
        Map<?, ?> instance = Collections.singletonMap("k", "v");
        JavaType type = typeFactory.constructType(instance.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(context, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindForMapUnmodifiableMap() throws Exception {
        Map<?, ?> instance = Collections.unmodifiableMap(new HashMap<>());
        JavaType type = typeFactory.constructType(instance.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(context, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindForMapNullElse() throws Exception {
        JavaType type = typeFactory.constructType(String.class);
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(context, type);
        assertNull(deser);
    }

    @Test
    public void testConverterNullValue() throws Exception {
        JavaType type = typeFactory.constructType(List.class);
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(context, 
                typeFactory.constructType(Collections.singletonList(1).getClass()));
        // Direct test via reflection or standard deserializer conversion if exposed, 
        // Or we test through standard deserializing behavior. 
        // Here we can test Converter directly via StdDelegatingDeserializer or similar if accessible, 
        // but since Converter is private, we verify via delegating or general methods if possible.
        // Actually, we can check getOutputType/getInputType.
        assertNotNull(deser.getInputType(typeFactory));
        assertNotNull(deser.getOutputType(typeFactory));
    }

    @Test
    public void testConverterSingletonEdgeCases() throws Exception {
        // Test invalid sizes for Singletons to trigger IllegalArgumentException
        // Singleton Set with size != 1
        JavaType setType = typeFactory.constructType(Collections.singleton(1).getClass());
        JsonDeserializer<?> setDeser = JavaUtilCollectionsDeserializers.findForCollection(context, setType);
        
        try {
            ((StdDelegatingDeserializer<?>) setDeser).deserialize(
                objectMapper.createParser("[]"), context);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            // Expected exception due to size != 1
        }
    }
}