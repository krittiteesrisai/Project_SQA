package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberSerializerTest {

    private JsonGenerator jsonGenerator;
    private SerializerProvider serializerProvider;
    private JsonFormatVisitorWrapper visitorWrapper;

    @Before
    public void setUp() {
        jsonGenerator = mock(JsonGenerator.class);
        serializerProvider = mock(SerializerProvider.class);
        visitorWrapper = mock(JsonFormatVisitorWrapper.class);
    }

    @Test
    public void testSerializeBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        BigDecimal value = new BigDecimal("123.456");
        
        serializer.serialize(value, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber(value);
    }

    @Test
    public void testSerializeBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        BigInteger value = new BigInteger("1234567890");
        
        serializer.serialize(value, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber(value);
    }

    @Test
    public void testSerializeInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Integer value = 42;
        
        serializer.serialize(value, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber(42);
    }

    @Test
    public void testSerializeLong() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Long value = 123456789L;
        
        serializer.serialize(value, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber(123456789L);
    }

    @Test
    public void testSerializeDouble() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Double value = 3.14159;
        
        serializer.serialize(value, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber(3.14159);
    }

    @Test
    public void testSerializeFloat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Float value = 2.718f;
        
        serializer.serialize(value, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber(2.718f);
    }

    @Test
    public void testSerializeByte() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Byte value = 10;
        
        serializer.serialize(value, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber(10);
    }

    @Test
    public void testSerializeShort() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Short value = 500;
        
        serializer.serialize(value, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber(500);
    }

    @Test
    public void testSerializeCustomNumberFallback() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        // Custom Number implementation for fallback branch testing
        Number customNumber = new Number() {
            @Override int intValue() { return 1; }
            @Override long longValue() { return 1L; }
            @Override float floatValue() { return 1.0f; }
            @Override double doubleValue() { return 1.0; }
            @Override public String toString() { return "custom-number-string"; }
        };
        
        serializer.serialize(customNumber, jsonGenerator, serializerProvider);
        
        verify(jsonGenerator, times(1)).writeNumber("custom-number-string");
    }

    @Test
    public void testGetSchemaForIntegerType() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JsonNode schema = serializer.getSchema(serializerProvider, null);
        
        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchemaForNumberType() {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JsonNode schema = serializer.getSchema(serializerProvider, null);
        
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitorForBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(BigInteger.class);
        
        serializer.acceptJsonFormatVisitor(visitorWrapper, typeHint);
        
        verify(visitorWrapper, times(1)).visitIntFormat(eq(visitorWrapper), eq(typeHint), eq(JsonParser.NumberType.BIG_INTEGER));
    }

    @Test
    public void testAcceptJsonFormatVisitorForBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(BigDecimal.class);
        
        serializer.acceptJsonFormatVisitor(visitorWrapper, typeHint);
        
        verify(visitorWrapper, times(1)).visitFloatFormat(eq(visitorWrapper), eq(typeHint), eq(JsonParser.NumberType.BIG_INTEGER));
    }

    @Test
    public void testAcceptJsonFormatVisitorForOtherNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Double.class);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Double.class);
        
        serializer.acceptJsonFormatVisitor(visitorWrapper, typeHint);
        
        verify(visitorWrapper, times(1)).expectNumberFormat(eq(typeHint));
    }
}