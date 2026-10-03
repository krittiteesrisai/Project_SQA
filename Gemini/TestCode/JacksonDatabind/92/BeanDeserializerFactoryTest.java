package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
    public void testWithConfig_SameConfigReturnsThis() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory customFactory = new BeanDeserializerFactory(config);
        
        DeserializerFactory result = customFactory.withConfig(config);
        assertSame("Should return the exact same instance if config is identical", customFactory, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_SubtypeThrowsIllegalState() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory subFactory = new BeanDeserializerFactory(config) {
            // Anonymous subclass to trigger getClass() != BeanDeserializerFactory.class
        };
        subFactory.withConfig(config);
    }

    @Test
    public void testCreateBeanDeserializer_ThrowableType() throws Exception {
        JavaType type = objectMapper.constructType(RuntimeException.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(deserializationContext, type, beanDesc);
        assertNotNull("Should successfully build a throwable deserializer", deserializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateBeanDeserializer_PrimitiveTypeIsIgnoredOrRejected() throws Exception {
        JavaType type = objectMapper.constructType(int.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);

        // Primitives are handled or throw exception via isPotentialBeanType if forced
        factory.createBeanDeserializer(deserializationContext, type, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_ProxyTypeThrowsException() throws Exception {
        // Proxy types trigger IllegalArgumentException in isPotentialBeanType
        Class<?> proxyClass = java.lang.reflect.Proxy.getProxyClass(
                ClassLoader.getSystemClassLoader(), new Class<?>[]{Runnable.class}
        );
        JavaType type = objectMapper.constructType(proxyClass);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);

        factory.createBeanDeserializer(deserializationContext, type, beanDesc);
    }

    @Test(expected = JsonMappingException.class)
    public void testCheckIllegalTypes_BlocksDangerousClass() throws Exception {
        // Simulate dangerous class from DEFAULT_NO_DESER_CLASS_NAMES
        Class<?> dangerousClass = org.apache.commons.collections.functors.InvokerTransformer.class;
        JavaType type = objectMapper.constructType(dangerousClass);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);

        factory.createBeanDeserializer(deserializationContext, type, beanDesc);
    }

    @Test
    public void testCreateBeanDeserializer_NormalBean() throws Exception {
        JavaType type = objectMapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(deserializationContext, type, beanDesc);
        assertNotNull("Should create a valid bean deserializer for standard POJO", deserializer);
    }

    // Dummy Bean for testing
    public static class SimpleBean {
        public String name;
        public int id;
    }
}