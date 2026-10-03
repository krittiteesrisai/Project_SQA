package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testConstructorAndGetSchemaForBigInteger() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testConstructorAndGetSchemaForNumber() {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testCreateContextualWithNullFormat() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        JsonSerializer<?> contextual = serializer.createContextual(provider, null);
        assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextualWithStringShape() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        
        BeanProperty property = mock(BeanProperty.class);
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
        when(property.findPropertyFormat(any(), any())).thenReturn(format);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        assertEquals(ToStringSerializer.class, contextual.getClass());
    }

    @Test
    public void testCreateContextualWithNonStringShape() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        
        BeanProperty property = mock(BeanProperty.class);
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER);
        when(property.findPropertyFormat(any(), any())).thenReturn(format);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        assertSame(serializer, contextual);
    }

    @Test
    public void testSerializeBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        BigDecimal value = new BigDecimal("123.45");

        serializer.serialize(value, g, provider);
        verify(g).writeNumber(value);
    }

    @Test
    public void testSerializeBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        BigInteger value = new BigInteger("123456789");

        serializer.serialize(value, g, provider);
        verify(g).writeNumber(value);
    }

    @Test
    public void testSerializeLong() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        Long value = 123456789L;

        serializer.serialize(value, g, provider);
        verify(g).writeNumber(123456789L);
    }

    @Test
    public void testSerializeDouble() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        Double value = 123.45D;

        serializer.serialize(value, g, provider);
        verify(g).writeNumber(123.45D);
    }

    @Test
    public void testSerializeFloat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        Float value = 123.45F;

        serializer.serialize(value, g, provider);
        verify(g).writeNumber(123.45F);
    }

    @Test
    public void testSerializeIntegerByteShort() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();

        serializer.serialize(Integer.valueOf(10), g, provider);
        serializer.serialize(Byte.valueOf((byte) 1), g, provider);
        serializer.serialize(Short.valueOf((short) 2), g, provider);

        verify(g, times(3)).intValue();
    }

    @Test
    public void testSerializeFallbackCustomNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        JsonGenerator g = mock(JsonGenerator.class);
        SerializerProvider provider = objectMapper.getSerializerProvider();
        
        // Custom AtomicInteger or anonymous Number
        Number customNumber = new Number() {
            @Override public int intValue() { return 0; }
            @Override public long longValue() { return 0L; }
            @Override public float floatValue() { return 0f; }
            @Override public double doubleValue() { return 0d; }
            @Override public String toString() { return "custom-number"; }
        };

        serializer.serialize(customNumber, g, provider);
        verify(g).writeNumber("custom-number");
    }

    @Test
    public void testAcceptJsonFormatVisitorBigInt() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = objectMapper.constructType(BigInteger.class);

        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        verify(visitor).expectIntegerFormat(typeHint);
    }

    @Test
    public void testAcceptJsonFormatVisitorBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = objectMapper.constructType(BigDecimal.class);

        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        verify(visitor).expectFloatFormat(typeHint);
    }

    @Test
    public void testAcceptJsonFormatVisitorOtherNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Long.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = objectMapper.constructType(Long.class);

        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        verify(visitor).expectNumberFormat(typeHint);
    }
}