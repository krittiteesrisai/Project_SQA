package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.Assert.*;

public class BasicDeserializerFactoryTest {

    private ConcreteBasicDeserializerFactory factory;
    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;

    // Concrete subclass to instantiate abstract BasicDeserializerFactory for testing
    private static class ConcreteBasicDeserializerFactory extends BasicDeserializerFactory {
        public ConcreteBasicDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        public ConcreteBasicDeserializerFactory() {
            this(new DeserializerFactoryConfig());
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new ConcreteBasicDeserializerFactory(config);
        }
    }

    @Before
    public void setUp() {
        factory = new ConcreteBasicDeserializerFactory();
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
    }

    @Test
    public void testMapAbstractType_NoMapping() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JavaType result = factory.mapAbstractType(objectMapper.getDeserializationConfig(), type);
        assertEquals(type, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_InvalidResolution() throws Exception {
        // Mocking a scenario where abstract resolution returns an unrelated type
        AbstractTypeResolver invalidResolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                return TypeFactory.defaultInstance().constructType(Integer.class);
            }
        };
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig().withAbstractTypeResolver(invalidResolver);
        ConcreteBasicDeserializerFactory customFactory = new ConcreteBasicDeserializerFactory(cfg);

        JavaType type = TypeFactory.defaultInstance().constructType(List.class);
        customFactory.mapAbstractType(objectMapper.getDeserializationConfig(), type);
    }

    @Test
    public void testFindStdValueInstantiator_Collections() throws Exception {
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(TypeFactory.defaultInstance().constructType(Collections.EMPTY_SET.getClass()));
        ValueInstantiator inst = factory.findValueInstantiator(deserializationContext, beanDesc);
        assertNotNull(inst);
    }

    @Test
    public void testValueInstantiatorInstance_NullInput() throws Exception {
        ValueInstantiator inst = factory._valueInstantiatorInstance(objectMapper.getDeserializationConfig(), null, null);
        assertNull(inst);
    }

    @Test
    public void testValueInstantiatorInstance_DirectInstance() throws Exception {
        ValueInstantiator expected = new StdValueInstantiator(objectMapper.getDeserializationConfig(), Object.class);
        ValueInstantiator actual = factory._valueInstantiatorInstance(objectMapper.getDeserializationConfig(), null, expected);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_InvalidType() throws Exception {
        factory._valueInstantiatorInstance(objectMapper.getDeserializationConfig(), null, "NotAClassOrInstantiator");
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_InvalidClassType() throws Exception {
        factory._valueInstantiatorInstance(objectMapper.getDeserializationConfig(), null, String.class);
    }

    @Test
    public void testFindDefaultDeserializer_Object() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testFindDefaultDeserializer_String() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testFindDefaultDeserializer_Iterable() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Iterable.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testFindDefaultDeserializer_MapEntry() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Map.Entry.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testFindDefaultDeserializer_TokenBuffer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(TokenBuffer.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testCreateCollectionDeserializer_ArrayBlockingQueue() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(ArrayBlockingQueue.class, String.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.createCollectionDeserializer(deserializationContext, (com.fasterxml.jackson.databind.type.CollectionType) type, beanDesc);
        assertNotNull(deser);
    }
}