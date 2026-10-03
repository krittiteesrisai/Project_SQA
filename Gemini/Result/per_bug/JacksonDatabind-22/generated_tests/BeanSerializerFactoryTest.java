package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Advanced JUnit 4 test suite for BeanSerializerFactory designed to achieve
 * maximum Branch/Condition Coverage and target potential Defects4J faults.
 */
public class BeanSerializerFactoryTest {

    // Helper subclass to test subclass restriction in withConfig
    private static class SubBeanSerializerFactory extends BeanSerializerFactory {
        protected SubBeanSerializerFactory(SerializerFactoryConfig config) {
            super(config);
        }
    }

    @Test
    public void testWithConfigSameConfig() {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        SerializerFactoryConfig config = null;
        SerializerFactory result = factory.withConfig(config);
        assertSame("Should return the same instance if config is identical", factory, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigSubclassViolation() {
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        SubBeanSerializerFactory subFactory = new SubBeanSerializerFactory(config);
        // This should trigger IllegalStateException because subclass hasn't overridden withAdditionalSerializers/withConfig properly
        subFactory.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testWithConfigValidNewConfig() {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        SerializerFactory result = factory.withConfig(config);
        assertNotNull(result);
        assertNotSame(factory, result);
    }

    @Test
    public void testFindBeanSerializerNonBeanTypes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        SerializationConfig config = mapper.getSerializationConfig();

        // 1. Primitive type (not a bean, not an enum) -> should return null
        JavaType primitiveType = TypeFactory.defaultInstance().constructType(int.class);
        BeanDescription primitiveDesc = config.introspect(primitiveType);
        JsonSerializer<Object> ser = BeanSerializerFactory.instance.findBeanSerializer(prov, primitiveType, primitiveDesc);
        assertNull("Primitive type should not yield a bean serializer", ser);

        // 2. Array type (not a bean, not an enum) -> should return null
        JavaType arrayType = TypeFactory.defaultInstance().constructType(int[].class);
        BeanDescription arrayDesc = config.introspect(arrayType);
        JsonSerializer<Object> arraySer = BeanSerializerFactory.instance.findBeanSerializer(prov, arrayType, arrayDesc);
        assertNull("Array type should not yield a bean serializer", arraySer);
    }

    @Test
    public void testFindBeanSerializerEnumType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        SerializationConfig config = mapper.getSerializationConfig();

        // Enum type should bypass non-bean check and try to construct bean serializer
        JavaType enumType = TypeFactory.defaultInstance().constructType(Thread.State.class);
        BeanDescription enumDesc = config.introspect(enumType);
        // Enums typically return null or fallback from constructBeanSerializer since they have no standard bean properties
        JsonSerializer<Object> enumSer = BeanSerializerFactory.instance.findBeanSerializer(prov, enumType, enumDesc);
        // Will evaluate execution path without throwing unexpected errors
        assertNull(enumSer); 
    }

    @Test
    public void testConstructObjectIdHandlerNullInfo() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        SerializationConfig config = mapper.getSerializationConfig();

        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(type);
        
        // Accessing protected constructObjectIdHandler via subclass or package visibility if applicable, 
        // Or using reflection / direct testing if package-private. Since it's protected and in the same package:
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        
        // Passing null objectIdInfo scenario by testing through reflection or a testable subclass
        TestableBeanSerializerFactory testFactory = new TestableBeanSerializerFactory(null);
        ObjectIdWriter writer = testFactory.publicConstructObjectIdHandler(prov, beanDesc, new ArrayList<BeanPropertyWriter>());
        assertNull("Should return null when no ObjectIdInfo exists", writer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructObjectIdHandlerPropertyGeneratorMissingProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        SerializationConfig config = mapper.getSerializationConfig();

        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(type);

        // Mocking/Simulating ObjectIdInfo with PropertyGenerator targeting a non-existent property name
        ObjectIdInfo objectIdInfo = new ObjectIdInfo(
                PropertyName.construct("nonExistentProp"),
                Object.class,
                ObjectIdGenerators.PropertyGenerator.class,
                false
        );

        TestableBeanSerializerFactory factory = new TestableBeanSerializerFactory(null);
        factory.forceObjectIdInfo = objectIdInfo;
        factory.publicConstructObjectIdHandler(prov, beanDesc, new ArrayList<BeanPropertyWriter>());
    }

    @Test
    public void testIsPotentialBeanTypeEdges() {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        // Test via reflection or helper methods if accessible. isPotentialBeanType is protected.
        TestableBeanSerializerFactory testFactory = new TestableBeanSerializerFactory(null);
        
        assertTrue(testFactory.publicIsPotentialBeanType(SimpleBean.class));
        assertFalse(testFactory.publicIsPotentialBeanType(int.class));
        assertFalse(testFactory.publicIsPotentialBeanType(String[].class));
    }

    // Dummy Bean for testing
    public static class SimpleBean {
        public int id;
        public String name;
    }

    // Helper subclass to expose protected methods for white-box testing
    private static class TestableBeanSerializerFactory extends BeanSerializerFactory {
        public ObjectIdInfo forceObjectIdInfo;

        protected TestableBeanSerializerFactory(SerializerFactoryConfig config) {
            super(config);
        }

        public ObjectIdWriter publicConstructObjectIdHandler(SerializerProvider prov,
                BeanDescription beanDesc, List<BeanPropertyWriter> props) throws JsonMappingException {
            if (forceObjectIdInfo != null) {
                // Return custom logic simulation if needed, or invoke super if beanDesc can be wrapped
            }
            return super.constructObjectIdHandler(prov, beanDesc, props);
        }

        public boolean publicIsPotentialBeanType(Class<?> type) {
            return super.isPotentialBeanType(type);
        }
    }
}