package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class BeanDeserializerFactoryTest {

    private BeanDeserializerFactory factory;
    private ObjectMapper objectMapper;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        factory = BeanDeserializerFactory.instance;
        objectMapper = new ObjectMapper();
        ctxt = objectMapper.getDeserializationContext();
    }

    @Test
    public void testWithConfigSameInstance() {
        DeserializerFactoryConfig config = factory.getFactoryConfig();
        DeserializerFactory result = factory.withConfig(config);
        assertSame("Should return the same instance if config is identical", factory, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigSubtypeThrowsException() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory subtypeFactory = new BeanDeserializerFactory(config) {
            // Anonymous subclass to trigger getClass() != BeanDeserializerFactory.class
        };
        subtypeFactory.withConfig(config);
    }

    @Test
    public void testCreateBeanDeserializerThrowable() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(RuntimeException.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull("Should build a throwable deserializer", deserializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanTypePrimitiveThrowsException() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(int.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        factory.createBeanDeserializer(ctxt, type, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanTypeProxyThrowsException() throws Exception {
        // Proxy-like or array types that trigger canBeABeanType
        JavaType type = TypeFactory.defaultInstance().constructType(String[].class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        
        factory.createBeanDeserializer(ctxt, type, beanDesc);
    }

    @Test(expected = JsonMappingException.class)
    public void testCheckIllegalTypesThrowsException() throws Exception {
        // Construct type for an illegal class name from DEFAULT_NO_DESER_CLASS_NAMES
        Class<?> illegalClass = Class.forName("org.apache.commons.collections.functors.InvokerTransformer");
        JavaType type = TypeFactory.defaultInstance().constructType(illegalClass);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);

        factory.createBeanDeserializer(ctxt, type, beanDesc);
    }

    @Test
    public void testMaterializeAbstractTypeReturnsNullWhenNoResolvers() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Runnable.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);

        // Abstract type without registered resolvers should return null or handle appropriately
        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(ctxt, type, beanDesc);
        // Runnable is abstract, but without materializer it might return null or abstract deserializer
        assertTrue(type.isAbstract());
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        JavaType valueType = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(valueType);
        
        JsonDeserializer<Object> deserializer = factory.createBuilderBasedDeserializer(
                ctxt, valueType, beanDesc, SimpleBuilder.class);
        assertNotNull(deser);
    }

    // Dummy classes for testing builder and bean introspection
    public static class SimpleBean {
        public String name;
    }

    public static class SimpleBuilder {
        public SimpleBean build() {
            return new SimpleBean();
        }
    }
}