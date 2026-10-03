package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import org.junit.Test;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberSerializersTest {

    @Test
    public void testAddAll() {
        Map<String, JsonSerializer<?>> serializers = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(serializers);

        assertTrue(serializers.containsKey(Integer.class.getName()));
        assertTrue(serializers.containsKey(Integer.TYPE.getName()));
        assertTrue(serializers.containsKey(Long.class.getName()));
        assertTrue(serializers.containsKey(Long.TYPE.getName()));
        assertTrue(serializers.containsKey(Byte.class.getName()));
        assertTrue(serializers.containsKey(Byte.TYPE.getName()));
        assertTrue(serializers.containsKey(Short.class.getName()));
        assertTrue(serializers.containsKey(Short.TYPE.getName()));
        assertTrue(serializers.containsKey(Double.class.getName()));
        assertTrue(serializers.containsKey(Double.TYPE.getName()));
        assertTrue(serializers.containsKey(Float.class.getName()));
        assertTrue(serializers.containsKey(Float.TYPE.getName()));
    }

    @Test
    public void testShortSerializer() throws Exception {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);

        serializer.serialize(Short.valueOf((short) 123), gen, null);
        gen.flush();
        assertEquals("123", sw.toString());
    }

    @Test
    public void testIntegerSerializer() throws Exception {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);

        serializer.serialize(Integer.valueOf(456), gen, null);
        gen.flush();
        assertEquals("456", sw.toString());
    }

    @Test
    public void testIntegerSerializerSerializeWithType() throws Exception {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        serializer.serializeWithType(Integer.valueOf(789), gen, null, typeSer);
        gen.flush();
        assertEquals("789", sw.toString());
        verifyZeroInteractions(typeSer);
    }

    @Test
    public void testIntLikeSerializer() throws Exception {
        NumberSerializers.IntLikeSerializer serializer = NumberSerializers.IntLikeSerializer.instance;
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);

        serializer.serialize(Long.valueOf(99L), gen, null);
        gen.flush();
        assertEquals("99", sw.toString());
    }

    @Test
    public void testLongSerializer() throws Exception {
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer(Long.class);
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);

        serializer.serialize(Long.valueOf(123456789L), gen, null);
        gen.flush();
        assertEquals("123456789", sw.toString());
    }

    @Test
    public void testFloatSerializer() throws Exception {
        NumberSerializers.FloatSerializer serializer = NumberSerializers.FloatSerializer.instance;
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);

        serializer.serialize(Float.valueOf(1.23f), gen, null);
        gen.flush();
        assertEquals("1.23", sw.toString());
    }

    @Test
    public void testDoubleSerializer() throws Exception {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer(Double.class);
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);

        serializer.serialize(Double.valueOf(4.56), gen, null);
        gen.flush();
        assertEquals("4.56", sw.toString());
    }

    @Test
    public void testDoubleSerializerSerializeWithType() throws Exception {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer(Double.class);
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        serializer.serializeWithType(Double.valueOf(7.89), gen, null, typeSer);
        gen.flush();
        assertEquals("7.89", sw.toString());
        verifyZeroInteractions(typeSer);
    }

    @Test
    public void testAcceptJsonFormatVisitorInt() throws Exception {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = ObjectMapper.defaultInstance().constructType(Integer.class);

        // _isInt = true branch
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        verify(visitor).expectIntegerFormat(typeHint);
    }

    @Test
    public void testAcceptJsonFormatVisitorFloat() throws Exception {
        NumberSerializers.FloatSerializer serializer = NumberSerializers.FloatSerializer.instance;
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = ObjectMapper.defaultInstance().constructType(Float.class);

        // _isInt = false branch
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        verify(visitor).expectNumberFormat(typeHint);
    }

    @Test
    public void testGetSchema() {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProvider();

        JsonNode node = serializer.getSchema(provider, null);
        assertNotNull(node);
        assertEquals("integer", node.get("type").asText());
    }

    @Test
    public void testCreateContextualNoFormat() throws Exception {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProvider();

        JsonSerializer<?> contextual = serializer.createContextual(provider, null);
        assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextualWithStringShape() throws Exception {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProvider();

        BeanProperty property = mock(BeanProperty.class);
        JsonFormat.Value formatVal = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
        when(property.findPropertyFormat(provider, serializer.handledType())).thenReturn(formatVal);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        assertSame(ToStringSerializer.instance, contextual);
    }

    @Test
    public void testCreateContextualWithNonStringShape() throws Exception {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProvider();

        BeanProperty property = mock(BeanProperty.class);
        JsonFormat.Value formatVal = JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER);
        when(property.findPropertyFormat(provider, serializer.handledType())).thenReturn(formatVal);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        assertSame(serializer, contextual);
    }
}