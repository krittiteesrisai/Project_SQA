package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for BasicDeserializerFactory (JacksonDatabind-67b)
 */
public class BasicDeserializerFactoryTest {

    // Concrete subclass for testing abstract BasicDeserializerFactory
    private static class ConcreteDeserializerFactory extends BasicDeserializerFactory {
        public ConcreteDeserializerFactory() {
            super(new DeserializerFactoryConfig());
        }

        public ConcreteDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new ConcreteDeserializerFactory(config);
        }
    }

    private final ObjectMapper mapper = new ObjectMapper();
    private final DeserializationContext ctxt = mapper.getDeserializationContext();
    private final ConcreteDeserializerFactory factory = new ConcreteDeserializerFactory();

    @Test
    public void testMapAbstractType_NormalAndNull() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = TypeFactory.defaultInstance().constructType(List.class);

        // Branch: _mapAbstractType2 returns null -> returns original type
        JavaType result = factory.mapAbstractType(config, type);
        assertNotNull(result);
        assertEquals(List.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_InvalidResolutionThrowsException() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        // Map List to String (String is not assignable from List)
        resolver.addMapping(List.class, String.class);
        
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig().withAbstractTypeResolver(resolver);
        ConcreteDeserializerFactory customFactory = new ConcreteDeserializerFactory(cfg);

        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = TypeFactory.defaultInstance().constructType(List.class);

        customFactory.mapAbstractType(config, type);
    }

    @Test
    public void testFindValueInstantiator_StandardJsonLocation() throws Exception {
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(
                TypeFactory.defaultInstance().constructType(JsonLocation.class)
        );

        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
    }

    @Test
    public void testValueInstantiatorInstance_EdgeCases() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AnnotatedClass ac = mapper.getDeserializationConfig().introspectClassAnnotations(Object.class).getClassInfo();

        // Edge case: instDef == null
        assertNull(factory._valueInstantiatorInstance(config, ac, null));

        // Edge case: instDef is already a ValueInstantiator instance
        ValueInstantiator dummyInst = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(config, Object.class);
        assertEquals(dummyInst, factory._valueInstantiatorInstance(config, ac, dummyInst));

        // Edge case: BogusClass
        assertNull(factory._valueInstantiatorInstance(config, ac, Void.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_InvalidTypeThrowsException() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        AnnotatedClass ac = mapper.getDeserializationConfig().introspectClassAnnotations(Object.class).getClassInfo();

        // Pass a Class that is NOT a ValueInstantiator (e.g., String.class)
        factory._valueInstantiatorInstance(config, ac, String.class);
    }

    @Test
    public void testCreateCollectionDeserializer_InterfaceFallbackAndEnumSet() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        
        // Test Interface fallback (Collection -> ArrayList)
        CollectionType collType = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        BeanDescription beanDesc = config.introspect(collType);
        
        JsonDeserializer<?> deser = factory.createCollectionDeserializer(ctxt, collType, beanDesc);
        assertNotNull(deser);

        // Test EnumSet collection class
        CollectionType enumSetType = TypeFactory.defaultInstance().constructCollectionType(EnumSet.class, MockEnum.class);
        BeanDescription enumSetBeanDesc = config.introspect(enumSetType);
        JsonDeserializer<?> enumSetDeser = factory.createCollectionDeserializer(ctxt, enumSetType, enumSetBeanDesc);
        assertNotNull(enumSetDeser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCollectionDeserializer_NonConcreteWithoutFallbackThrows() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        // Custom non-concrete collection type without fallback
        CollectionType type = TypeFactory.defaultInstance().constructCollectionType(UnregisteredCollection.class, String.class);
        BeanDescription beanDesc = config.introspect(type);

        factory.createCollectionDeserializer(ctxt, type, beanDesc);
    }

    @Test
    public void testCreateMapDeserializer_EnumMapAndFallbacks() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();

        // Test EnumMap
        MapType enumMapType = TypeFactory.defaultInstance().constructMapType(EnumMap.class, MockEnum.class, String.class);
        BeanDescription enumBeanDesc = config.introspect(enumMapType);
        JsonDeserializer<?> enumMapDeser = factory.createMapDeserializer(ctxt, enumMapType, enumBeanDesc);
        assertNotNull(enumMapDeser);

        // Test Abstract Map Fallback (Map -> LinkedHashMap)
        MapType mapType = TypeFactory.defaultInstance().constructMapType(Map.class, String.class, String.class);
        BeanDescription mapBeanDesc = config.introspect(mapType);
        JsonDeserializer<?> mapDeser = factory.createMapDeserializer(ctxt, mapType, mapBeanDesc);
        assertNotNull(mapDeser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_EnumMapInvalidKeyType() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        // Key type is String instead of Enum
        MapType enumMapType = TypeFactory.defaultInstance().constructMapType(EnumMap.class, String.class, String.class);
        BeanDescription beanDesc = config.introspect(enumMapType);

        factory.createMapDeserializer(ctxt, enumMapType, beanDesc);
    }

    @Test
    public void testFindDefaultDeserializer_WellKnownTypes() throws Exception {
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(TypeFactory.defaultInstance().constructType(Object.class));

        // Test Object.class -> UntypedObjectDeserializer
        assertNotNull(factory.findDefaultDeserializer(ctxt, TypeFactory.defaultInstance().constructType(Object.class), beanDesc));

        // Test String.class -> StringDeserializer
        assertNotNull(factory.findDefaultDeserializer(ctxt, TypeFactory.defaultInstance().constructType(String.class), beanDesc));

        // Test TokenBuffer.class -> TokenBufferDeserializer
        assertNotNull(factory.findDefaultDeserializer(ctxt, TypeFactory.defaultInstance().constructType(com.fasterxml.jackson.databind.util.TokenBuffer.class), beanDesc));
    }

    // Helper Enum and Interface for testing
    private enum MockEnum { A, B, C }
    private interface UnregisteredCollection extends Collection<String> {}
}