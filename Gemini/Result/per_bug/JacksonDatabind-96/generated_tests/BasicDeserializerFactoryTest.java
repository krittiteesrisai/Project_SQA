package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.TokenBuffer;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBufferDeserializer;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.Assert.*;

public class BasicDeserializerFactoryTest {

    private ConcreteBasicDeserializerFactory factory;
    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;

    // Concrete subclass to instantiate abstract BasicDeserializerFactory
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
    public void testGetFactoryConfig() {
        assertNotNull(factory.getFactoryConfig());
    }

    @Test
    public void testMapAbstractType_NoMapping() throws Exception {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JavaType mapped = factory.mapAbstractType(config, type);
        assertEquals(type, mapped);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_InvalidMappingCycleOrMismatch() throws Exception {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        // Map abstract type List to something unrelated like Integer.class to trigger exception
        AbstractTypeResolver failingResolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                return TypeFactory.defaultInstance().constructType(Integer.class);
            }
        };
        ConcreteBasicDeserializerFactory customFactory = new ConcreteBasicDeserializerFactory(
                new DeserializerFactoryConfig().withAbstractTypeResolver(failingResolver)
        );
        JavaType type = TypeFactory.defaultInstance().constructType(List.class);
        customFactory.mapAbstractType(config, type);
    }

    @Test
    public void testFindValueInstantiator_JsonLocation() throws Exception {
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(
                TypeFactory.defaultInstance().constructType(JsonLocation.class)
        );
        ValueInstantiator instantiator = factory.findValueInstantiator(deserializationContext, beanDesc);
        assertNotNull(instantiator);
    }

    @Test
    public void testFindValueInstantiator_EmptyCollections() throws Exception {
        BeanDescription beanDescSet = objectMapper.getDeserializationConfig().introspect(
                TypeFactory.defaultInstance().constructType(Collections.EMPTY_SET.getClass())
        );
        ValueInstantiator instSet = factory.findValueInstantiator(deserializationContext, beanDescSet);
        assertNotNull(instSet);

        BeanDescription beanDescList = objectMapper.getDeserializationConfig().introspect(
                TypeFactory.defaultInstance().constructType(Collections.EMPTY_LIST.getClass())
        );
        ValueInstantiator instList = factory.findValueInstantiator(deserializationContext, beanDescList);
        assertNotNull(instList);

        BeanDescription beanDescMap = objectMapper.getDeserializationConfig().introspect(
                TypeFactory.defaultInstance().constructType(Collections.EMPTY_MAP.getClass())
        );
        ValueInstantiator instMap = factory.findValueInstantiator(deserializationContext, beanDescMap);
        assertNotNull(instMap);
    }

    @Test
    public void testValueInstantiatorInstance_Null() throws Exception {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        assertNull(factory._valueInstantiatorInstance(config, null, null));
    }

    @Test
    public void testValueInstantiatorInstance_DirectInstance() throws Exception {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        ValueInstantiator dummy = new ValueInstantiator.Base(String.class);
        assertEquals(dummy, factory._valueInstantiatorInstance(config, null, dummy));
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_InvalidType() throws Exception {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        factory._valueInstantiatorInstance(config, null, "NotAClassOrInstantiator");
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_InvalidClassType() throws Exception {
        DeserializationConfig config = objectMapper.getDeserializationConfig();
        factory._valueInstantiatorInstance(config, null, String.class);
    }

    @Test
    public void testCreateCollectionDeserializer_Interface() throws Exception {
        CollectionType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.createCollectionDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testCreateCollectionDeserializer_ArrayBlockingQueue() throws Exception {
        CollectionType type = TypeFactory.defaultInstance().constructCollectionType(ArrayBlockingQueue.class, String.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.createCollectionDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testCreateMapDeserializer_AbstractMap() throws Exception {
        MapType type = TypeFactory.defaultInstance().constructMapType(Map.class, String.class, String.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.createMapDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testCreateMapDeserializer_EnumMap() throws Exception {
        MapType type = TypeFactory.defaultInstance().constructMapType(EnumMap.class, DummyEnum.class, String.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.createMapDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_EnumMapInvalidKey() throws Exception {
        MapType type = TypeFactory.defaultInstance().constructMapType(EnumMap.class, String.class, String.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);
        factory.createMapDeserializer(deserializationContext, type, beanDesc);
    }

    @Test
    public void testCreateEnumDeserializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(DummyEnum.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = factory.createEnumDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testFindDefaultDeserializer_PrimitivesAndWellKnown() throws Exception {
        JavaType objType = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(objType);
        assertNotNull(factory.findDefaultDeserializer(deserializationContext, objType, beanDesc));

        JavaType strType = TypeFactory.defaultInstance().constructType(String.class);
        assertNotNull(factory.findDefaultDeserializer(deserializationContext, strType, beanDesc));

        JavaType iterableType = TypeFactory.defaultInstance().constructType(Iterable.class);
        assertNotNull(factory.findDefaultDeserializer(deserializationContext, iterableType, beanDesc));

        JavaType tokenBufferType = TypeFactory.defaultInstance().constructType(TokenBuffer.class);
        assertTrue(factory.findDefaultDeserializer(deserializationContext, tokenBufferType, beanDesc) instanceof TokenBufferDeserializer);
    }

    // Dummy Enum for testing
    private enum DummyEnum {
        VALUE1, VALUE2;

        @JsonCreator
        public static DummyEnum create(String value) {
            return value1OrNull(value);
        }

        private static DummyEnum value1OrNull(String val) {
            return "VALUE2".equals(val) ? VALUE2 : VALUE1;
        }
    }
}