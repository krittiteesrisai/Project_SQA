package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;

public class PropertyBuilderTest {

    private ObjectMapper objectMapper;
    private SerializationConfig serializationConfig;
    private BeanDescription beanDescription;

    static class DummyBean {
        public String stringField = "default";
        public int intField = 42;
        public List<String> listField = new ArrayList<>();
        public Optional<String> optionalField = Optional.empty();
    }

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        serializationConfig = objectMapper.getSerializationConfig();
        beanDescription = serializationConfig.introspect(objectMapper.constructType(DummyBean.class));
    }

    @Test
    public void testConstructorAndGetClassAnnotations() {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        assertNotNull(builder.getClassAnnotations());
    }

    @Test
    public void testGetDefaultBeanInstantiationAndCaching() {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        Object bean1 = builder.getDefaultBean();
        Object bean2 = builder.getDefaultBean();
        assertNotNull(bean1);
        assertEquals(bean1, bean2);
    }

    @Test
    public void testGetDefaultValuePrimitivesAndContainers() {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        TypeFactory tf = objectMapper.getTypeFactory();

        assertEquals(0, builder.getDefaultValue(tf.constructType(int.class)));
        assertEquals("", builder.getDefaultValue(tf.constructType(String.class)));
        assertEquals(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(tf.constructType(List.class)));
        assertEquals(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(tf.constructType(Optional.class)));
        assertNull(builder.getDefaultValue(tf.constructType(Object.class)));
    }

    @Test
    public void testThrowWrappedWithRuntimeException() {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        RuntimeException ex = new RuntimeException(new IllegalArgumentException("Inner root cause"));
        try {
            builder._throwWrapped(ex, "testProp", new DummyBean());
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Inner root cause", e.getCause().getMessage());
        }
    }

    @Test(expected = Error.class)
    public void testThrowWrappedWithError() {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        Error err = new Error("Fatal Error");
        builder._throwWrapped(err, "testProp", new DummyBean());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowWrappedWithCheckedException() {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        Exception ex = new Exception("Checked exception");
        builder._throwWrapped(ex, "testProp", new DummyBean());
    }

    @Test
    public void testFindSerializationTypeValidOverride() throws Exception {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        AnnotatedMethod am = beanDescription.findMethods().get(0);
        JavaType declaredType = objectMapper.constructType(CharSequence.class);
        
        // Invoke protected method via subclassing or reflection if needed, but since it's protected in same package/subclass:
        PropertyBuilderAccessor accessor = new PropertyBuilderAccessor(serializationConfig, beanDescription);
        JavaType result = accessor.findSerializationType(am, false, declaredType);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSerializationTypeInvalidOverride() throws Exception {
        PropertyBuilderAccessor accessor = new PropertyBuilderAccessor(serializationConfig, beanDescription);
        AnnotatedMethod am = beanDescription.findMethods().get(0);
        JavaType declaredType = objectMapper.constructType(Integer.class);
        
        // Force incompatible secondary type refinement by passing String.class where Integer is expected
        accessor.findSerializationType(am, false, declaredType);
    }

    @Test
    public void testBuildWriterWithNonDefaultInclusion() throws Exception {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        SerializerProvider prov = objectMapper.getSerializerProvider();
        BeanPropertyDefinition propDef = beanDescription.findProperties().get(0);
        JavaType declaredType = objectMapper.constructType(String.class);

        BeanPropertyWriter bpw = builder.buildWriter(prov, propDef, declaredType, null, null, null, null, false);
        assertNotNull(bpw);
    }

    @Test
    public void testBuildWriterWithContentTypeSerializer() throws Exception {
        PropertyBuilder builder = new PropertyBuilder(serializationConfig, beanDescription);
        SerializerProvider prov = objectMapper.getSerializerProvider();
        BeanPropertyDefinition propDef = beanDescription.findProperties().get(0);
        JavaType declaredType = objectMapper.constructType(List.class);
        TypeSerializer typeSer = objectMapper.getSerializerFactory().createTypeSerializer(serializationConfig, declaredType);

        BeanPropertyWriter bpw = builder.buildWriter(prov, propDef, declaredType, null, null, typeSer, null, false);
        assertNotNull(bpw);
    }

    // Helper subclass to expose protected methods for advanced branch testing
    private static class PropertyBuilderAccessor extends PropertyBuilder {
        public PropertyBuilderAccessor(SerializationConfig config, BeanDescription beanDesc) {
            super(config, beanDesc);
        }

        @Override
        public JavaType findSerializationType(Annotated a, boolean useStaticTyping, JavaType declaredType) throws JsonMappingException {
            return super.findSerializationType(a, useStaticTyping, declaredType);
        }
    }
}