package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DateTimeSerializerBaseTest {

    // Concrete subclass เพื่อทดสอบคลาส Abstract
    private static class ConcreteDateTimeSerializer extends DateTimeSerializerBase<Date> {
        public ConcreteDateTimeSerializer() {
            super(Date.class, null, null);
        }

        public ConcreteDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new ConcreteDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return value == null ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            // No-op for testing helpers
        }

        // Expose protected methods for testing
        public boolean callAsTimestamp(SerializerProvider provider) {
            return _asTimestamp(provider);
        }

        public void callSerializeAsString(Date value, JsonGenerator g, SerializerProvider provider) throws IOException {
            _serializeAsString(value, g, provider);
        }
    }

    private ObjectMapper objectMapper;
    private SerializerProvider defaultProvider;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        defaultProvider = objectMapper.getSerializerProvider();
    }

    @Test
    public void testAsTimestamp_UseTimestampNotNull() {
        ConcreteDateTimeSerializer serializerTrue = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        assertTrue(serializerTrue.callAsTimestamp(defaultProvider));

        ConcreteDateTimeSerializer serializerFalse = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        assertFalse(serializerFalse.callAsTimestamp(defaultProvider));
    }

    @Test
    public void testAsTimestamp_CustomFormatNull_ProviderEnabled() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        // เปิดใช้ WRITE_DATES_AS_TIMESTAMPS
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        assertTrue(serializer.callAsTimestamp(objectMapper.getSerializerProvider()));

        // ปิดใช้ WRITE_DATES_AS_TIMESTAMPS
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        assertFalse(serializer.callAsTimestamp(objectMapper.getSerializerProvider()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestamp_NullProviderThrowsException() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        serializer.callAsTimestamp(null);
    }

    @Test
    public void testAsTimestamp_CustomFormatNotNull() {
        SimpleDateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd");
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, customFormat);
        assertFalse(serializer.callAsTimestamp(defaultProvider));
    }

    @Test
    public void testCreateContextual_NullProperty() throws JsonMappingException {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        JsonSerializer<?> contextual = serializer.createContextual(defaultProvider, null);
        assertSame(serializer, contextual);
    }

    @Test
    public void testIsEmptyAndGetSchema() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        assertFalse(serializer.isEmpty(defaultProvider, new Date()));
        
        JsonNode schema = serializer.getSchema(defaultProvider, Object.class);
        assertNotNull(schema);
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws JsonMappingException {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(defaultProvider);
        
        // ทดสอบทั้งสอง Branch ของ asNumber ใน acceptJsonFormatVisitor
        serializer.acceptJsonFormatVisitor(visitor, null);
        
        ConcreteDateTimeSerializer serializerString = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        serializerString.acceptJsonFormatVisitor(visitor, null);
    }

    @Test
    public void testSerializeAsString_NullCustomFormat() throws IOException {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        JsonGenerator generator = mock(JsonGenerator.class);
        Date date = new Date();
        
        serializer.callSerializeAsString(date, generator, defaultProvider);
        // ผ่านเข้าไปใน defaultSerializeDateValue ของ Provider โดยตรง
    }

    @Test
    public void testSerializeAsString_WithCustomFormatReuseAndClone() throws IOException {
        SimpleDateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd");
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, customFormat);
        JsonGenerator generator = mock(JsonGenerator.class);
        Date date = new Date();

        // รันครั้งที่ 1: ดึงจาก _customFormat.clone() และคืนค่ากลับใส่ AtomicReference
        serializer.callSerializeAsString(date, generator, defaultProvider);
        
        // รันครั้งที่ 2: ดึงค่าที่ Reuse อยู่ใน AtomicReference กลับมาใช้ซ้ำ (Branch coverage ครบถ้วน)
        serializer.callSerializeAsString(date, generator, defaultProvider);
        
        verify(generator, times(2)).writeString(anyString());
    }
}