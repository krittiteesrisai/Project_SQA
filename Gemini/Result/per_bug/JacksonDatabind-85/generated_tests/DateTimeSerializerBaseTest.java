package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class DateTimeSerializerBaseTest {

    // Concrete implementation สำหรับทดสอบ Abstract Class
    private static class ConcreteDateTimeSerializer extends DateTimeSerializerBase<Date> {
        private final long timestampValue;

        protected ConcreteDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat, long timestampValue) {
            super(Date.class, useTimestamp, customFormat);
            this.timestampValue = timestampValue;
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new ConcreteDateTimeSerializer(timestamp, customFormat, this.timestampValue);
        }

        @Override
        protected long _timestamp(Date value) {
            if (value == null) {
                return 0L;
            }
            return timestampValue != -999L ? timestampValue : value.getTime();
        }

        @Override
        public void serialize(Date value, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider serializers) {
            // No-op for testing
        }
    }

    private ObjectMapper objectMapper;
    private SerializerProvider serializerProvider;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        serializerProvider = objectMapper.getSerializerProviderInstance();
    }

    @Test
    public void testCreateContextualWithNullProperty() throws Exception {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 0L);
        JsonSerializer<?> contextual = serializer.createContextual(serializerProvider, null);
        assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextualWithNoFormatOverrides() throws Exception {
        // ใช้ Property ที่ไม่มี Annotation ควบคุมรูปแบบวันที่
        BeanProperty property = new BeanProperty.Std(
                PropertyName.construct("testDate"),
                objectMapper.constructType(Date.class),
                null,
                null,
                null,
                PropertyMetadata.STD_REQUIRED
        );
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 0L);
        JsonSerializer<?> contextual = serializer.createContextual(serializerProvider, property);
        assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextualNumericShape() throws Exception {
        // จำลองคลาสหรือใช้ Mock/Anonymous ที่มี Annotation shape = NUMERIC
        // ในที่นี้ทดสอบผ่านการสร้าง Concrete ที่จำลองพฤติกรรม หรือใช้ฟีเจอร์ของ Jackson ObjectMapper
        // สร้าง Bean ที่มี @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        class DummyBean {
            @JsonFormat(shape = JsonFormat.Shape.NUMBER)
            public Date getDate() { return new Date(); }
        }
        BeanProperty property = objectMapper.getSerializationConfig()
                .introspect(objectMapper.constructType(DummyBean.class))
                .findProperties().get(0).getPrimaryMember();

        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 0L);
        JsonSerializer<?> contextual = serializer.createContextual(serializerProvider, property);
        assertNotNull(contextual);
    }

    @Test
    public void testCreateContextualStringShapeOrPattern() throws Exception {
        class DummyBeanString {
            @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC", locale = "en_US")
            public Date getDate() { return new Date(); }
        }
        BeanProperty property = objectMapper.getSerializationConfig()
                .introspect(objectMapper.constructType(DummyBeanString.class))
                .findProperties().get(0).getPrimaryMember();

        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 0L);
        JsonSerializer<?> contextual = serializer.createContextual(serializerProvider, property);
        assertNotNull(contextual);
    }

    @Test
    public void testIsEmptyValueNull() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 0L);
        assertTrue(serializer.isEmpty(null));
        assertTrue(serializer.isEmpty(serializerProvider, null));
    }

    @Test
    public void testIsEmptyTimestampZero() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 0L);
        assertTrue(serializer.isEmpty(new Date()));
        assertTrue(serializer.isEmpty(serializerProvider, new Date()));
    }

    @Test
    public void testIsEmptyTimestampNonZero() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 12345L);
        assertFalse(serializer.isEmpty(new Date()));
        assertFalse(serializer.isEmpty(serializerProvider, new Date()));
    }

    @Test
    public void testAsTimestampUseTimestampNotNull() {
        ConcreteDateTimeSerializer serializerTrue = new ConcreteDateTimeSerializer(Boolean.TRUE, null, 0L);
        assertTrue(serializerTrue._asTimestamp(serializerProvider));

        ConcreteDateTimeSerializer serializerFalse = new ConcreteDateTimeSerializer(Boolean.FALSE, null, 0L);
        assertFalse(serializerFalse._asTimestamp(serializerProvider));
    }

    @Test
    public void testAsTimestampWithCustomFormat() {
        SimpleDateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd");
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, customFormat, 0L);
        assertFalse(serializer._asTimestamp(serializerProvider));
    }

    @Test
    public void testAsTimestampNoUseTimestampNoCustomFormatWithProvider() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 0L);
        // ค่าเริ่มต้นของ Jackson อาจจะเป็น false หรือ true ขึ้นอยู่กับ Config
        boolean result = serializer._asTimestamp(serializerProvider);
        assertEquals(serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestampNullProviderThrowsException() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null, 0L);
        serializer._asTimestamp(null);
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        ConcreteDateTimeSerializer serializerAsNum = new ConcreteDateTimeSerializer(Boolean.TRUE, null, 0L);
        JsonFormatVisitorWrapper visitor = org.mockito.Mockito.mock(JsonFormatVisitorWrapper.class);
        org.mockito.Mockito.when(visitor.getProvider()).thenReturn(serializerProvider);

        // ทดสอบทั้งกรณี asNumber = true และ asNumber = false ผ่าน _asTimestamp
        serializerAsNum.acceptJsonFormatVisitor(visitor, objectMapper.constructType(Date.class));

        ConcreteDateTimeSerializer serializerAsStr = new ConcreteDateTimeSerializer(Boolean.FALSE, null, 0L);
        serializerAsStr.acceptJsonFormatVisitor(visitor, objectMapper.constructType(Date.class));
    }
}