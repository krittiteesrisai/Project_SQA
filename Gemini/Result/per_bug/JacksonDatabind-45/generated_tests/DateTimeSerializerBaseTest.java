package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
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

    private ObjectMapper objectMapper;
    private SerializerProvider serializerProvider;
    private ConcreteDateTimeSerializer serializer;

    // Concrete implementation สำหรับทดสอบ Abstract Class
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
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            // No-op for testing setup
        }

        @Override
        protected long _timestamp(Date value) {
            return value == null ? 0L : value.getTime();
        }

        // Exposing protected methods for test coverage
        public boolean callAsTimestamp(SerializerProvider provider) {
            return _asTimestamp(provider);
        }
    }

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        serializerProvider = objectMapper.getSerializerProviderInstance();
        serializer = new ConcreteDateTimeSerializer();
    }

    @Test
    public void testCreateContextualWithNullProperty() throws JsonMappingException {
        JsonSerializer<?> result = serializer.createContextual(serializerProvider, null);
        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextualWithoutAnnotation() throws JsonMappingException {
        BeanProperty property = mock(BeanProperty.class);
        when(property.getMember()).thenReturn(null);
        when(serializerProvider.getAnnotationIntrospector()).thenReturn(new AnnotationIntrospector() {
            @Override
            public Object findSerializer(Annotated a) { return null; }
            // ใช้ default findFormat ที่คืนค่า null หรือไม่มี Annotation
        });

        JsonSerializer<?> result = serializer.createContextual(serializerProvider, property);
        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextualNumericShape() throws JsonMappingException {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        when(property.getMember()).thenReturn(member);

        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        JsonFormat.Value formatValue = new JsonFormat.Value().withShape(JsonFormat.Shape.NUMBER);
        when(introspector.findFormat(member)).thenReturn(formatValue);
        
        SerializerProvider sp = mock(SerializerProvider.class);
        when(sp.getAnnotationIntrospector()).thenReturn(introspector);

        JsonSerializer<?> result = serializer.createContextual(sp, property);
        assertNotNull(result);
        assertTrue(result instanceof ConcreteDateTimeSerializer);
        // ตรวจสอบว่า _useTimestamp ถูกเซ็ตเป็น TRUE
        ConcreteDateTimeSerializer casted = (ConcreteDateTimeSerializer) result;
        assertTrue(casted._useTimestamp);
        assertNull(casted._customFormat);
    }

    @Test
    public void testCreateContextualStringShapeComplete() throws JsonMappingException {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        when(property.getMember()).thenReturn(member);

        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        // ระบุ Shape เป็น STRING พร้อม pattern, locale, และ timezone ครบถ้วน
        TimeZone customTz = TimeZone.getTimeZone("GMT+7");
        Locale customLocale = Locale.US;
        JsonFormat.Value formatValue = new JsonFormat.Value()
                .withShape(JsonFormat.Shape.STRING)
                .withPattern("yyyy-MM-dd")
                .withLocale(customLocale)
                .withTimeZone(customTz);

        when(introspector.findFormat(member)).thenReturn(formatValue);
        
        SerializerProvider sp = mock(SerializerProvider.class);
        when(sp.getAnnotationIntrospector()).thenReturn(introspector);
        when(sp.getLocale()).thenReturn(Locale.GERMANY); // Should be overridden by customLocale
        when(sp.getTimeZone()).thenReturn(TimeZone.getTimeZone("UTC"));

        JsonSerializer<?> result = serializer.createContextual(sp, property);
        assertNotNull(result);
        ConcreteDateTimeSerializer casted = (ConcreteDateTimeSerializer) result;
        assertFalse(casted._useTimestamp);
        assertNotNull(casted._customFormat);
        assertTrue(casted._customFormat instanceof SimpleDateFormat);
        assertEquals(customTz, casted._customFormat.getTimeZone());
    }

    @Test
    public void testCreateContextualStringShapeDefaults() throws JsonMappingException {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        when(property.getMember()).thenReturn(member);

        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        // String shape แต่ไม่ระบุ pattern, locale, timezone เพื่อเทสต์ Default branches
        JsonFormat.Value formatValue = new JsonFormat.Value()
                .withShape(JsonFormat.Shape.STRING);

        when(introspector.findFormat(member)).thenReturn(formatValue);
        
        SerializerProvider sp = mock(SerializerProvider.class);
        when(sp.getAnnotationIntrospector()).thenReturn(introspector);
        when(sp.getLocale()).thenReturn(Locale.US);
        when(sp.getTimeZone()).thenReturn(null); // ทำให้ tz == null -> ดึงจาก serializers

        JsonSerializer<?> result = serializer.createContextual(sp, property);
        assertNotNull(result);
        ConcreteDateTimeSerializer casted = (ConcreteDateTimeSerializer) result;
        assertFalse(casted._useTimestamp);
        assertNotNull(casted._customFormat);
    }

    @Test
    public void testIsEmptyValues() {
        Date nullDate = null;
        Date zeroDate = new Date(0L);
        Date validDate = new Date(123456789L);

        // 1-arg isEmpty
        assertTrue(serializer.isEmpty(nullDate));
        assertTrue(serializer.isEmpty(zeroDate));
        assertFalse(serializer.isEmpty(validDate));

        // 2-arg isEmpty
        assertTrue(serializer.isEmpty(serializerProvider, nullDate));
        assertTrue(serializer.isEmpty(serializerProvider, zeroDate));
        assertFalse(serializer.isEmpty(serializerProvider, validDate));
    }

    @Test
    public void testAsTimestampLogic() {
        // Case 1: _useTimestamp is explicitly set
        ConcreteDateTimeSerializer serWithTrue = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        assertTrue(serWithTrue.callAsTimestamp(serializerProvider));

        ConcreteDateTimeSerializer serWithFalse = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        assertFalse(serWithFalse.callAsTimestamp(serializerProvider));

        // Case 2: _useTimestamp is null, _customFormat is present -> returns false
        SimpleDateFormat customDf = new SimpleDateFormat("yyyy-MM-dd");
        ConcreteDateTimeSerializer serWithCustom = new ConcreteDateTimeSerializer(null, customDf);
        assertFalse(serWithCustom.callAsTimestamp(serializerProvider));

        // Case 3: Both null, provider is present -> depends on feature
        ConcreteDateTimeSerializer serDefault = new ConcreteDateTimeSerializer(null, null);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        assertTrue(serDefault.callAsTimestamp(serializerProvider));

        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        assertFalse(serDefault.callAsTimestamp(serializerProvider));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestampNullProviderException() {
        ConcreteDateTimeSerializer serDefault = new ConcreteDateTimeSerializer(null, null);
        // ส่ง serializerProvider เป็น null เพื่อ trigger IllegalArgumentException ดักจับ Defect
        serDefault.callAsTimestamp(null);
    }

    @Test
    public void testGetSchemaAndVisitor() throws Exception {
        ConcreteDateTimeSerializer serWithTs = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        assertNotNull(serWithTs.getSchema(serializerProvider, null));

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(serializerProvider);
        
        // Test acceptJsonFormatVisitor with timestamp true and false
        serWithTs.acceptJsonFormatVisitor(visitor, objectMapper.constructType(Date.class));

        ConcreteDateTimeSerializer serWithString = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        serWithString.acceptJsonFormatVisitor(visitor, objectMapper.constructType(Date.class));
    }
}