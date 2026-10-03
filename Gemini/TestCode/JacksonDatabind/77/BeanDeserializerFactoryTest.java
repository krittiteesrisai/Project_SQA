package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Comprehensive JUnit 4 Test Suite for BeanDeserializerFactory.
 * Maximizes Branch and Condition Coverage, targeting potential Defects4J faults.
 */
public class BeanDeserializerFactoryTest {

    private BeanDeserializerFactory factory;
    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;

    @Before
    public void setUp() {
        factory = BeanDeserializerFactory.instance;
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
    }

    @Test
    public void testWithConfig_SameConfig() {
        DeserializerFactoryConfig config = factory.getFactoryConfig();
        DeserializerFactory result = factory.withConfig(config);
        assertSame("Should return the same instance if config is identical", factory, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_SubclassWithoutOverride() {
        BeanDeserializerFactory subFactory = new BeanDeserializerFactory(new DeserializerFactoryConfig()) {
            // Anonymous subclass to trigger getClass() != BeanDeserializerFactory.class check
        };
        subFactory.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testCreateBeanDeserializer_Throwable() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(RuntimeException.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(deserializationContext, type, beanDesc);
        assertNotNull("Should build a throwable deserializer", deserializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_PrimitiveOrArray() throws Exception {
        // Arrays or primitives trigger canBeABeanType != null
        JavaType type = TypeFactory.defaultInstance().constructType(int[].class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        factory.createBeanDeserializer(deserializationContext, type, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_LocalClass() throws Exception {
        class LocalClass {}
        JavaType type = TypeFactory.defaultInstance().constructType(LocalClass.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        factory.createBeanDeserializer(deserializationContext, type, beanDesc);
    }

    @Test
    public void testCreateBeanDeserializer_NormalBean() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(deserializationContext, type, beanDesc);
        assertNotNull("Should successfully build bean deserializer for standard POJO", deserializer);
    }

    @Test
    public void testMaterializeAbstractType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(AbstractInterface.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        // Abstract type without concrete resolver should return null or handle gracefully
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(deserializationContext, type, beanDesc);
        // Depending on abstract handling, it may return null or abstract deserializer builder
        assertNull("Unresolvable abstract type should result in null or abstract fallback", deserializer);
    }

    @Test
    public void testFilterBeanProps_IgnoredProperties() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(deserializationContext, beanDesc);
        
        // Test filtering with explicit ignores
        java.util.List<BeanPropertyDefinition> filtered = factory.filterBeanProps(
                deserializationContext, beanDesc, builder, beanDesc.findProperties(), 
                Collections.singleton("ignoredField")
        );
        assertNotNull(filtered);
    }

    @Test
    public void testConstructSettableProperty_CauseFieldEdgeCase() throws Exception {
        // Edge case specifically targeting the 'cause' field access modifier rule in Throwable subclasses
        JavaType type = TypeFactory.defaultInstance().constructType(CustomException.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        // This exercises the block where mutator is an AnnotatedField and name is "cause"
        JsonDeserializer<Object> deserializer = factory.buildThrowableDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deserializer);
    }

    // --- Helper Dummy Classes for Testing ---
    public static class SimpleBean {
        public String name;
        public int id;
        public String ignoredField;
    }

    public interface AbstractInterface {
        String getData();
    }

    public static class CustomException extends Exception {
        private static final long serialVersionUID = 1L;
        // 'cause' field inherited from Throwable
    }
}