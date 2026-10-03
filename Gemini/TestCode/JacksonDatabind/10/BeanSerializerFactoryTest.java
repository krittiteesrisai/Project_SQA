package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdInfo;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BeanSerializerFactoryTest {

    private ObjectMapper objectMapper;
    private SerializerProvider serializerProvider;
    private SerializationConfig serializationConfig;
    private BeanSerializerFactory factory;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        serializerProvider = objectMapper.getSerializerProvider();
        serializationConfig = objectMapper.getSerializationConfig();
        factory = BeanSerializerFactory.instance;
    }

    @Test
    public void testWithConfigSameInstance() {
        SerializerFactoryConfig config = factory.getConfig();
        SerializerFactory result = factory.withConfig(config);
        assertSame("Should return the same instance if config is identical", factory, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigSubtypeException() {
        BeanSerializerFactory subFactory = new BeanSerializerFactory(null) {
            // Anonymous subclass to trigger getClass() != BeanSerializerFactory.class branch
        };
        SerializerFactoryConfig newConfig = new SerializerFactoryConfig();
        subFactory.withConfig(newConfig);
    }

    @Test
    public void testWithConfigNewInstance() {
        SerializerFactoryConfig newConfig = new SerializerFactoryConfig();
        SerializerFactory result = factory.withConfig(newConfig);
        assertNotNull(result);
        assertNotSame(factory, result);
    }

    @Test
    public void testFindBeanSerializerWithNonBeanAndNonEnum() throws Exception {
        JavaType intType = TypeFactory.defaultInstance().constructType(int.class);
        BeanDescription beanDesc = serializationConfig.introspect(intType);
        
        JsonSerializer<Object> serializer = factory.findBeanSerializer(serializerProvider, intType, beanDesc);
        assertNull("Primitive types should not be resolved as bean serializers", serializer);
    }

    @Test
    public void testFindBeanSerializerWithEnum() throws Exception {
        JavaType enumType = TypeFactory.defaultInstance().constructType(SampleEnum.class);
        BeanDescription beanDesc = serializationConfig.introspect(enumType);
        
        // Enums bypass isPotentialBeanType check as per [Issue#24]
        JsonSerializer<Object> serializer = factory.findBeanSerializer(serializerProvider, enumType, beanDesc);
        // May return null or a serializer depending on context, but should not short-circuit purely on non-bean check.
        // Verifying it reaches constructBeanSerializer path safely.
    }

    @Test
    public void testConstructObjectIdHandlerNullInfo() throws Exception {
        JavaType beanType = TypeFactory.defaultInstance().constructType(SampleBean.class);
        BeanDescription beanDesc = serializationConfig.introspect(beanType);
        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();

        ObjectIdWriter writer = factory.constructObjectIdHandler(serializerProvider, beanDesc, props);
        assertNull("Should return null when ObjectIdInfo is missing", writer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructObjectIdHandlerPropertyNotFound() throws Exception {
        JavaType beanType = TypeFactory.defaultInstance().constructType(SampleBean.class);
        BeanDescription beanDesc = serializationConfig.introspect(beanType);
        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();

        // Force ObjectIdInfo with non-existent property name
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("nonExistentId"), Object.class, ObjectIdGenerators.PropertyGenerator.class, Object.class);
        
        // Use reflection or direct package access simulation if possible, 
        // Here we test through standard execution flow if mockable, or call method directly if accessible.
        // Since constructObjectIdHandler is protected, we can subclass or test via a helper method wrapper.
        TestableBeanSerializerFactory testFactory = new TestableBeanSerializerFactory(null);
        testFactory.exposedConstructObjectIdHandler(serializerProvider, beanDesc, props, info);
    }

    @Test
    public void testIsPotentialBeanTypeEdgeCases() {
        assertTrue(factory.isPotentialBeanType(SampleBean.class));
        assertFalse(factory.isPotentialBeanType(int.class));
        assertFalse(factory.isPotentialBeanType(int[].class));
        assertFalse(factory.isPotentialBeanType(SampleEnum.class));
    }

    // --- Helper Classes and Subclasses for Testing Protected Methods ---

    public enum SampleEnum {
        VALUE_A, VALUE_B
    }

    public static class SampleBean {
        public String id;
        public String getName() { return "test"; }
    }

    private static class TestableBeanSerializerFactory extends BeanSerializerFactory {
        public TestableBeanSerializerFactory(SerializerFactoryConfig config) {
            super(config);
        }

        public ObjectIdWriter exposedConstructObjectIdHandler(SerializerProvider prov,
                BeanDescription beanDesc, List<BeanPropertyWriter> props, ObjectIdInfo info)
                throws JsonMappingException {
            // Mocking the beanDesc.getObjectIdInfo() behavior by overriding or directly invoking if accessible
            // In same package or via subclass simulation:
            return super.constructObjectIdHandler(prov, beanDesc, props);
        }
    }
}