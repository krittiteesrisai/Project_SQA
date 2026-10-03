package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class BasicSerializerFactoryTest {

    private ConcreteSerializerFactory factory;
    private ObjectMapper mapper;
    private SerializationConfig config;

    // Concrete implementation for testing abstract BasicSerializerFactory
    private static class ConcreteSerializerFactory extends BasicSerializerFactory {
        public ConcreteSerializerFactory(SerializerFactoryConfig config) {
            super(config);
        }

        @Override
        public SerializerFactory withConfig(SerializerFactoryConfig config) {
            return new ConcreteSerializerFactory(config);
        }

        @Override
        public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        protected Iterable<Serializers> customSerializers() {
            return Collections.emptyList();
        }

        // Expose protected methods for testing
        public JsonSerializer<?> publicFindSerializerByLookup(JavaType type, SerializationConfig config, BeanDescription beanDesc, boolean staticTyping) {
            return findSerializerByLookup(type, config, beanDesc, staticTyping);
        }

        public JsonSerializer<?> publicFindSerializerByPrimaryType(SerializerProvider prov, JavaType type, BeanDescription beanDesc, boolean staticTyping) throws JsonMappingException {
            return findSerializerByPrimaryType(prov, type, beanDesc, staticTyping);
        }

        public boolean publicUsesStaticTyping(SerializationConfig config, BeanDescription beanDesc, TypeSerializer typeSer) {
            return usesStaticTyping(config, beanDesc, typeSer);
        }
    }

    @Before
    public void setUp() {
        factory = new ConcreteSerializerFactory(null);
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    @Test
    public void testFactoryConstructorAndConfig() {
        assertNotNull(factory.getFactoryConfig());
        SerializerFactoryConfig newConfig = new SerializerFactoryConfig();
        SerializerFactory newFactory = factory.withConfig(newConfig);
        assertNotNull(newFactory);
        assertNotNull(factory.withAdditionalSerializers(new EmptySerializers()));
        assertNotNull(factory.withAdditionalKeySerializers(new EmptySerializers()));
        assertNotNull(factory.withSerializerModifier(new EmptySerializerModifier()));
    }

    @Test
    public void testFindSerializerByLookupAtomicReference() {
        JavaType type = TypeFactory.defaultInstance().constructType(AtomicReference.class);
        JsonSerializer<?> ser = factory.publicFindSerializerByLookup(type, config, null, false);
        assertNotNull(ser);
        assertTrue(ser instanceof AtomicReferenceSerializer);
    }

    @Test
    public void testFindSerializerByLookupConcreteAndLazy() {
        // Concrete standard type
        JavaType strType = TypeFactory.defaultInstance().constructType(String.class);
        JsonSerializer<?> strSer = factory.publicFindSerializerByLookup(strType, config, null, false);
        assertNotNull(strSer);
        assertTrue(strSer instanceof StringSerializer);

        // Lazy type (e.g. java.sql.Date)
        JavaType sqlDateType = TypeFactory.defaultInstance().constructType(java.sql.Date.class);
        JsonSerializer<?> sqlSer = factory.publicFindSerializerByLookup(sqlDateType, config, null, false);
        assertNotNull(sqlSer);

        // Unknown type
        JavaType unknownType = TypeFactory.defaultInstance().constructType(Object.class);
        // Object might not be in _concrete directly or handled differently, let's use a dummy unknown class
        JavaType dummyType = TypeFactory.defaultInstance().constructType(BasicSerializerFactoryTest.class);
        JsonSerializer<?> nullSer = factory.publicFindSerializerByLookup(dummyType, config, null, false);
        assertNull(nullSer);
    }

    @Test
    public void testFindSerializerByPrimaryTypeEdgeCases() throws Exception {
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        BeanDescription beanDesc = config.introspect(TypeFactory.defaultInstance().constructType(Integer.class));

        // Calendar
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(Calendar.class), beanDesc, false));
        // Date
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(Date.class), beanDesc, false));
        // ByteBuffer
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(ByteBuffer.class), beanDesc, false));
        // InetAddress
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(InetAddress.class), beanDesc, false));
        // InetSocketAddress
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(InetSocketAddress.class), beanDesc, false));
        // TimeZone
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(TimeZone.class), beanDesc, false));
        // Charset
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(Charset.class), beanDesc, false));
        // Number
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(Integer.class), beanDesc, false));
        // Enum
        assertNotNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(TestEnum.class), beanDesc, false));
        // Unhandled primary type
        assertNull(factory.publicFindSerializerByPrimaryType(prov, TypeFactory.defaultInstance().constructType(BasicSerializerFactoryTest.class), beanDesc, false));
    }

    @Test
    public void testCreateKeySerializerWithDefaults() {
        JavaType keyType = TypeFactory.defaultInstance().constructType(String.class);
        JsonSerializer<Object> keySer = factory.createKeySerializer(config, keyType, null);
        assertNotNull(keySer);
    }

    @Test
    public void testUsesStaticTypingBranches() {
        BeanDescription beanDesc = config.introspect(TypeFactory.defaultInstance().constructType(String.class));
        // When typeSer is not null -> returns false
        TypeSerializer dummyTypeSer = new TypeSerializer() {
            @Override public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion() { return null; }
            @Override public String getPropertyName() { return null; }
            @Override public com.fasterxml.jackson.databind.jsontype.TypeIdResolver getTypeIdResolver() { return null; }
            @Override public WritableTypeId writeTypePrefix(com.fasterxml.jackson.core.JsonGenerator g, WritableTypeId idMetadata) throws java.io.IOException { return null; }
            @Override public WritableTypeId writeTypeSuffix(com.fasterxml.jackson.core.JsonGenerator g, WritableTypeId idMetadata) throws java.io.IOException { return null; }
            @Override public void writeTypePrefixForObject(Object value, com.fasterxml.jackson.core.JsonGenerator g) throws java.io.IOException {}
            @Override public void writeTypePrefixForArray(Object value, com.fasterxml.jackson.core.JsonGenerator g) throws java.io.IOException {}
            @Override public void writeTypePrefixForScalar(Object value, com.fasterxml.jackson.core.JsonGenerator g) throws java.io.IOException {}
            @Override public void writeTypeSuffixForObject(Object value, com.fasterxml.jackson.core.JsonGenerator g) throws java.io.IOException {}
            @Override public void writeTypeSuffixForArray(Object value, com.fasterxml.jackson.core.JsonGenerator g) throws java.io.IOException {}
            @Override public void writeTypeSuffixForScalar(Object value, com.fasterxml.jackson.core.JsonGenerator g) throws java.io.IOException {}
            @Override public void writeTypePrefixForObject(Object value, com.fasterxml.jackson.core.JsonGenerator g, Class<?> type) throws java.io.IOException {}
            @Override public void writeTypePrefixForArray(Object value, com.fasterxml.jackson.core.JsonGenerator g, Class<?> type) throws java.io.IOException {}
            @Override public void writeTypePrefixForScalar(Object value, com.fasterxml.jackson.core.JsonGenerator g, Class<?> type) throws java.io.IOException {}
            @Override public void writeTypeSuffixForObject(Object value, com.fasterxml.jackson.core.JsonGenerator g, Class<?> type) throws java.io.IOException {}
            @Override public void writeTypeSuffixForArray(Object value, com.fasterxml.jackson.core.JsonGenerator g, Class<?> type) throws java.io.IOException {}
            @Override public void writeTypeSuffixForScalar(Object value, com.fasterxml.jackson.core.JsonGenerator g, Class<?> type) throws java.io.IOException {}
            @Override public void writeCustomTypePrefixForObject(Object value, com.fasterxml.jackson.core.JsonGenerator g, String typeId) throws java.io.IOException {}
            @Override public void writeCustomTypePrefixForArray(Object value, com.fasterxml.jackson.core.JsonGenerator g, String typeId) throws java.io.IOException {}
            @Override public void writeCustomTypePrefixForScalar(Object value, com.fasterxml.jackson.core.JsonGenerator g, String typeId) throws java.io.IOException {}
            @Override public void writeCustomTypeSuffixForObject(Object value, com.fasterxml.jackson.core.JsonGenerator g, String typeId) throws java.io.IOException {}
            @Override public void writeCustomTypeSuffixForArray(Object value, com.fasterxml.jackson.core.JsonGenerator g, String typeId) throws java.io.IOException {}
            @Override public void writeCustomTypeSuffixForScalar(Object value, com.fasterxml.jackson.core.JsonGenerator g, String typeId) throws java.io.IOException {}
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
        };

        assertFalse(factory.publicUsesStaticTyping(config, beanDesc, dummyTypeSer));
        assertFalse(factory.publicUsesStaticTyping(config, beanDesc, null));
    }

    private enum TestEnum {
        A, B
    }

    private static class EmptySerializers extends Serializers.Base {}
    private static class EmptySerializerModifier extends BeanSerializerModifier {}
}