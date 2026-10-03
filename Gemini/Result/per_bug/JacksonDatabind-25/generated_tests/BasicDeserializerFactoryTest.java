package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.Assert.*;

public class BasicDeserializerFactoryTest {

    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;
    private DeserializationConfig deserializationConfig;
    private ConcreteDeserializerFactory factory;

    // คลาสลูกสำหรับทดสอบ Abstract Factory เนื่องจากเป็น Abstract Class
    private static class ConcreteDeserializerFactory extends BasicDeserializerFactory {
        public ConcreteDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new ConcreteDeserializerFactory(config);
        }
    }

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
        deserializationConfig = objectMapper.getDeserializationConfig();
        factory = new ConcreteDeserializerFactory(new DeserializerFactoryConfig());
    }

    @Test
    public void testMapAbstractType_ValidResolution() throws Exception {
        JavaType inputType = TypeFactory.defaultInstance().constructType(List.class);
        // ใช้ AbstractTypeResolver เพื่อแมป List ไปยัง ArrayList
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                if (type.getRawClass() == List.class) {
                    return TypeFactory.defaultInstance().constructType(ArrayList.class);
                }
                return null;
            }
        };
        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withAbstractTypeResolver(resolver);
        ConcreteDeserializerFactory customFactory = new ConcreteDeserializerFactory(config);

        JavaType resolved = customFactory.mapAbstractType(deserializationConfig, inputType);
        assertNotNull(resolved);
        assertEquals(ArrayList.class, resolved.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_InvalidResolutionThrowsException() throws Exception {
        JavaType inputType = TypeFactory.defaultInstance().constructType(List.class);
        // แมปจาก List ไปยัง String ซึ่งไม่ใช่ Subtype จะต้องพ่น IllegalArgumentException ออกมา
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                if (type.getRawClass() == List.class) {
                    return TypeFactory.defaultInstance().constructType(String.class);
                }
                return null;
            }
        };
        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withAbstractTypeResolver(resolver);
        ConcreteDeserializerFactory customFactory = new ConcreteDeserializerFactory(config);

        customFactory.mapAbstractType(deserializationConfig, inputType);
    }

    @Test
    public void testFindValueInstantiator_JsonLocation() throws Exception {
        BeanDescription beanDesc = deserializationConfig.introspect(TypeFactory.defaultInstance().constructType(JsonLocation.class));
        ValueInstantiator instantiator = factory.findValueInstantiator(deserializationContext, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator instanceof com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindValueInstantiator_BrokenValueInstantiators() throws Exception {
        // จำลองสถานการณ์ ValueInstantiators คืนค่า null เพื่อทดสอบ Sanity Check
        ValueInstantiators brokenInstantiators = new ValueInstantiators.Base() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config, BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                return null; // ผิดกฎต้องห้ามคืนค่า null
            }
        };
        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withValueInstantiators(brokenInstantiators);
        ConcreteDeserializerFactory customFactory = new ConcreteDeserializerFactory(config);

        BeanDescription beanDesc = deserializationConfig.introspect(TypeFactory.defaultInstance().constructType(SimplePojo.class));
        customFactory.findValueInstantiator(deserializationContext, beanDesc);
    }

    @Test
    public void testCreateCollectionDeserializer_InterfaceFallback() throws Exception {
        CollectionType type = (CollectionType) TypeFactory.defaultInstance().constructType(Collection.class);
        BeanDescription beanDesc = deserializationConfig.introspect(type);

        JsonDeserializer<?> deserializer = factory.createCollectionDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deserializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCollectionDeserializer_NonConcreteWithoutHandlerThrowsException() throws Exception {
        // ใช้คลาส Interface สมมติที่ไม่มีใน Fallbacks และไม่มี Type Handler
        JavaType customInterfaceType = TypeFactory.defaultInstance().constructSpecializedType(
                TypeFactory.defaultInstance().constructType(Collection.class), UnknownCollectionInterface.class
        );
        BeanDescription beanDesc = deserializationConfig.introspect(customInterfaceType);

        factory.createCollectionDeserializer(deserializationContext, (CollectionType) customInterfaceType, beanDesc);
    }

    @Test
    public void testCreateCollectionDeserializer_ArrayBlockingQueue() throws Exception {
        CollectionType type = (CollectionType) TypeFactory.defaultInstance().constructType(ArrayBlockingQueue.class);
        BeanDescription beanDesc = deserializationConfig.introspect(type);

        JsonDeserializer<?> deserializer = factory.createCollectionDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deserializer);
    }

    @Test
    public void testCreateMapDeserializer_InterfaceFallback() throws Exception {
        MapType type = (MapType) TypeFactory.defaultInstance().constructType(Map.class);
        BeanDescription beanDesc = deserializationConfig.introspect(type);

        JsonDeserializer<?> deserializer = factory.createMapDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deserializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_EnumMapInvalidKeyType() throws Exception {
        // EnumMap แต่กำหนด Key เป็น String แทนที่จะเป็น Enum ควรจะพ่น IllegalArgumentException
        MapType type = MapType.construct(EnumMap.class, TypeFactory.defaultInstance().constructType(String.class), TypeFactory.defaultInstance().constructType(String.class));
        BeanDescription beanDesc = deserializationConfig.introspect(type);

        factory.createMapDeserializer(deserializationContext, type, beanDesc);
    }

    // --- Helper Classes for Testing ---
    public static class SimplePojo {
        public String name;
        public SimplePojo(String name) { this.name = name; }
    }

    public interface UnknownCollectionInterface extends Collection<String> {}
}