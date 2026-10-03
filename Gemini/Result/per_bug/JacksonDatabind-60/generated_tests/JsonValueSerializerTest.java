package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class JsonValueSerializerTest {

    private ObjectMapper objectMapper;
    private SerializerProvider serializerProvider;
    private BeanProperty.Std dummyProperty;
    private AnnotatedMethod sampleAnnotatedMethod;

    static class DummyBean {
        @JsonValue
        public String getValue() {
            return "test-value";
        }

        public String getNullValue() {
            return null;
        }

        public String getExceptionValue() {
            throw new RuntimeException("Simulated error");
        }

        public String getInvocationExceptionValue() {
            throw new RuntimeException(new InvocationTargetException(new IOException("Inner IO")));
        }

        public String getErrorValue() {
            throw new OutOfMemoryError("OOM");
        }
    }

    enum DummyEnum {
        VAL1, VAL2;
        @JsonValue
        public String getEnumValue() {
            return name();
        }
    }

    @Before
    public void setUp() throws Exception {
        objectMapper = new ObjectMapper();
        serializerProvider = objectMapper.getSerializerProvider();
        dummyProperty = new BeanProperty.Std(
                PropertyName.construct("dummy"),
                objectMapper.constructType(String.class),
                null, null, null, PropertyMetadata.STD_OPTIONAL
        );

        Method m = DummyBean.class.getMethod("getValue");
        sampleAnnotatedMethod = new AnnotatedMethod(null, m, null, null);
    }

    @Test
    public void testConstructorsAndNotNuClass() {
        JsonValueSerializer serializer1 = new JsonValueSerializer(sampleAnnotatedMethod, null);
        assertNotNull(serializer1);

        JsonValueSerializer serializer2 = new JsonValueSerializer(serializer1, dummyProperty, null, false);
        assertNotNull(serializer2);
    }

    @Test
    public void testWithResolved() {
        JsonValueSerializer serializer = new JsonValueSerializer(sampleAnnotatedMethod, null);
        
        // Branch: Same properties return 'this'
        JsonValueSerializer same = serializer.withResolved(null, null, true);
        assertSame(serializer, same);

        // Branch: Different property/serializer returns new instance
        JsonValueSerializer diff = serializer.withResolved(dummyProperty, null, true);
        assertNotSame(serializer, diff);
    }

    @Test
    public void testCreateContextualWithExplicitSerializer() throws Exception {
        JsonSerializer<Object> mockSer = mock(JsonSerializer.class);
        when(serializerProvider.handlePrimaryContextualization(mockSer, dummyProperty)).thenReturn(mockSer);

        JsonValueSerializer serializer = new JsonValueSerializer(sampleAnnotatedMethod, mockSer);
        JsonSerializer<?> contextual = serializer.createContextual(serializerProvider, dummyProperty);
        assertNotNull(contextual);
    }

    @Test
    public void testCreateContextualWithoutSerializerStaticTyping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.USE_STATIC_TYPING);
        SerializerProvider provider = mapper.getSerializerProvider();

        JsonValueSerializer serializer = new JsonValueSerializer(sampleAnnotatedMethod, null);
        JsonSerializer<?> contextual = serializer.createContextual(provider, dummyProperty);
        assertNotNull(contextual);
    }

    @Test
    public void testSerializeNullValue() throws Exception {
        Method m = DummyBean.class.getMethod("getNullValue");
        AnnotatedMethod nullMethod = new AnnotatedMethod(null, m, null, null);
        JsonValueSerializer serializer = new JsonValueSerializer(nullMethod, null);

        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);

        serializer.serialize(new DummyBean(), gen, provider);
        verify(provider).defaultSerializeNull(gen);
    }

    @Test
    public void testSerializeNormal() throws Exception {
        JsonValueSerializer serializer = new JsonValueSerializer(sampleAnnotatedMethod, null);
        JsonGenerator gen = objectMapper.getFactory().createGenerator(new java.io.StringWriter());
        
        serializer.serialize(new DummyBean(), gen, serializerProvider);
        gen.flush();
    }

    @Test(expected = IOException.class)
    public void testSerializeIOException() throws Exception {
        Method m = DummyBean.class.getMethod("getValue");
        AnnotatedMethod badMethod = mock(AnnotatedMethod.class);
        when(badMethod.getType()).thenReturn(objectMapper.constructType(String.class));
        when(badMethod.getName()).thenReturn("getValue");
        when(badMethod.getValue(any())).thenThrow(new IOException("IO Fail"));

        JsonValueSerializer serializer = new JsonValueSerializer(badMethod, null);
        serializer.serialize(new DummyBean(), mock(JsonGenerator.class), serializerProvider);
    }

    @Test(expected = OutOfMemoryError.class)
    public void testSerializeError() throws Exception {
        Method m = DummyBean.class.getMethod("getErrorValue");
        AnnotatedMethod errMethod = new AnnotatedMethod(null, m, null, null);

        JsonValueSerializer serializer = new JsonValueSerializer(errMethod, null);
        serializer.serialize(new DummyBean(), mock(JsonGenerator.class), serializerProvider);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeRuntimeException() throws Exception {
        Method m = DummyBean.class.getMethod("getExceptionValue");
        AnnotatedMethod excMethod = new AnnotatedMethod(null, m, null, null);

        JsonValueSerializer serializer = new JsonValueSerializer(excMethod, null);
        serializer.serialize(new DummyBean(), mock(JsonGenerator.class), serializerProvider);
    }

    @Test
    public void testSerializeWithTypeNull() throws Exception {
        Method m = DummyBean.class.getMethod("getNullValue");
        AnnotatedMethod nullMethod = new AnnotatedMethod(null, m, null, null);
        JsonValueSerializer serializer = new JsonValueSerializer(nullMethod, null);

        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        serializer.serializeWithType(new DummyBean(), gen, provider, typeSer);
        verify(provider).defaultSerializeNull(gen);
    }

    @Test
    public void testSerializeWithTypeForceInfo() throws Exception {
        JsonSerializer<Object> mockSer = mock(JsonSerializer.class);
        JsonValueSerializer serializer = new JsonValueSerializer(sampleAnnotatedMethod, mockSer);
        // Force type info true via withResolved
        JsonValueSerializer resolved = serializer.withResolved(dummyProperty, mockSer, true);

        JsonGenerator gen = mock(JsonGenerator.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        resolved.serializeWithType(new DummyBean(), gen, serializerProvider, typeSer);
        verify(typeSer).writeTypePrefixForScalar(any(), eq(gen));
        verify(typeSer).writeTypeSuffixForScalar(any(), eq(gen));
    }

    @Test
    public void testGetSchema() throws Exception {
        JsonSerializer<?> schemaSer = mock(JsonSerializer.class, withSettings().extraInterfaces(com.fasterxml.jackson.databind.jsonschema.SchemaAware.class));
        when(((com.fasterxml.jackson.databind.jsonschema.SchemaAware) schemaSer).getSchema(any(), any()))
                .thenReturn(objectMapper.createObjectNode());

        JsonValueSerializer serializer = new JsonValueSerializer(sampleAnnotatedMethod, (JsonSerializer<Object>) schemaSer);
        assertNotNull(serializer.getSchema(serializerProvider, null));

        JsonValueSerializer normalSerializer = new JsonValueSerializer(sampleAnnotatedMethod, null);
        assertNotNull(normalSerializer.getSchema(serializerProvider, null));
    }

    @Test
    public void testAcceptJsonFormatVisitorEnum() throws Exception {
        Method m = DummyEnum.class.getMethod("getEnumValue");
        AnnotatedMethod enumMethod = new AnnotatedMethod(null, m, null, null);
        JsonValueSerializer serializer = new JsonValueSerializer(enumMethod, null);

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor stringVisitor = 
                mock(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor.class);
        when(visitor.expectStringFormat(any())).thenReturn(stringVisitor);

        serializer.acceptJsonFormatVisitor(visitor, null);
        verify(stringVisitor).enumTypes(any());
    }

    @Test
    public void testToString() {
        JsonValueSerializer serializer = new JsonValueSerializer(sampleAnnotatedMethod, null);
        String str = serializer.toString();
        assertTrue(str.contains("JsonValue serializer"));
    }
}