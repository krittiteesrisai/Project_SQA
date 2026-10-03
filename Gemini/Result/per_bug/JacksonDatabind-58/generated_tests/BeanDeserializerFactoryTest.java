package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void testWithConfig_SubtypeInvalidOverride() {
        BeanDeserializerFactory subFactory = new BeanDeserializerFactory(new DeserializerFactoryConfig()) {
            private static final long serialVersionUID = 1L;
        };
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        subFactory.withConfig(newConfig);
    }

    @Test
    public void testWithConfig_NewConfig() {
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory result = factory.withConfig(newConfig);
        assertNotNull(result);
        assertNotSame(factory, result);
    }

    @Test
    public void testCreateBeanDeserializer_Throwable() throws Exception {
        JavaType type = objectMapper.constructType(Exception.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deserializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_Primitive() throws Exception {
        JavaType type = objectMapper.constructType(int.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        factory.createBeanDeserializer(deserializationContext, type, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_Array() throws Exception {
        JavaType type = objectMapper.constructType(int[].class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        factory.createBeanDeserializer(deserializationContext, type, beanDesc);
    }

    @Test
    public void testCreateBeanDeserializer_NormalBean() throws Exception {
        JavaType type = objectMapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(deserializationContext, type, beanDesc);
        assertNotNull(deserializer);
    }

    // Dummy bean for testing
    public static class SimpleBean {
        public String name;
        public int id;
    }
}