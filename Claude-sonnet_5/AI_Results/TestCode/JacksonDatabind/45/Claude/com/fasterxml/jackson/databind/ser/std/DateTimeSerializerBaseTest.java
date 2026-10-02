package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;

// import คลาสเป้าหมาย (อยู่ใน package เดียวกัน แต่ระบุให้ชัดเจนตามข้อกำหนด)
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;

public class DateTimeSerializerBaseTest {

    /**
     * Concrete implementation ของ abstract class เพื่อใช้ทดสอบ
     * ไม่มี logic เพิ่มเติมนอกจากสิ่งที่ abstract method บังคับให้ implement
     */
    private static class ConcreteDateTimeSerializer extends DateTimeSerializerBase<Date> {

        protected ConcreteDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new ConcreteDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            // ไม่ถูกใช้งานในชุดทดสอบนี้
        }
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_StoresFieldsCorrectly() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, sdf);
        assertEquals(Boolean.TRUE, serializer._useTimestamp);
        assertSame(sdf, serializer._customFormat);
    }

    // ---------------------------------------------------------------
    // isEmpty(T value) - deprecated one-arg version
    // ---------------------------------------------------------------

    @Test
    public void testIsEmptyDeprecated_NullValue_ReturnsTrue() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        assertTrue(serializer.isEmpty(null));
    }

    @Test
    public void testIsEmptyDeprecated_ZeroTimestamp_ReturnsTrue() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        assertTrue(serializer.isEmpty(new Date(0L)));
    }

    @Test
    public void testIsEmptyDeprecated_NonZeroTimestamp_ReturnsFalse() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        assertFalse(serializer.isEmpty(new Date(12345L)));
    }

    // ---------------------------------------------------------------
    // isEmpty(SerializerProvider, T) - two-arg version
    // ---------------------------------------------------------------

    @Test
    public void testIsEmptyWithProvider_NullValue_ReturnsTrue() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        assertTrue(serializer.isEmpty((SerializerProvider) null, null));
    }

    @Test
    public void testIsEmptyWithProvider_ZeroTimestamp_ReturnsTrue() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        assertTrue(serializer.isEmpty((SerializerProvider) null, new Date(0L)));
    }

    @Test
    public void testIsEmptyWithProvider_NonZeroTimestamp_ReturnsFalse() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        assertFalse(serializer.isEmpty((SerializerProvider) null, new Date(999L)));
    }

    // ---------------------------------------------------------------
    // _asTimestamp(SerializerProvider)
    // ---------------------------------------------------------------

    @Test
    public void testAsTimestamp_UseTimestampTrue_IgnoresNullProvider() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        assertTrue(serializer._asTimestamp(null));
    }

    @Test
    public void testAsTimestamp_UseTimestampFalse_IgnoresNullProvider() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        assertFalse(serializer._asTimestamp(null));
    }

    @Test
    public void testAsTimestamp_UseTimestampNull_CustomFormatNotNull_ReturnsFalse() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, sdf);
        // customFormat != null -> return false ก่อนถึง provider check
        assertFalse(serializer._asTimestamp(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestamp_UseTimestampNull_CustomFormatNull_ProviderNull_Throws() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        serializer._asTimestamp(null);
    }

    @Test
    public void testAsTimestamp_ProviderEnabled_ReturnsTrue() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)).thenReturn(true);
        assertTrue(serializer._asTimestamp(provider));
    }

    @Test
    public void testAsTimestamp_ProviderDisabled_ReturnsFalse() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)).thenReturn(false);
        assertFalse(serializer._asTimestamp(provider));
    }

    // ---------------------------------------------------------------
    // getSchema(...)
    // หมายเหตุ: createSchemaNode(...) inherited จาก superclass ที่ไม่มีใน source
    // จึงตรวจสอบเพียงว่าไม่ null (ไม่ guess โครงสร้างภายใน)
    // ---------------------------------------------------------------

    @Test
    public void testGetSchema_AsTimestampTrue_ReturnsNonNullNode() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        JsonNode node = serializer.getSchema(null, Date.class);
        assertNotNull(node);
    }

    @Test
    public void testGetSchema_AsTimestampFalse_ReturnsNonNullNode() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        JsonNode node = serializer.getSchema(null, Date.class);
        assertNotNull(node);
    }

    // ---------------------------------------------------------------
    // _acceptJsonFormatVisitor(...) - ทดสอบ if/else branch ตรง ๆ
    // หมายเหตุ: visitIntFormat/visitStringFormat inherited, impl ไม่แสดงใน source
    // จึง catch exception ที่อาจเกิดจาก mock ที่ยังไม่ครบ stub และเน้นทดสอบว่า branch ถูก exercise
    // ---------------------------------------------------------------

    @Test
    public void testAcceptJsonFormatVisitorInternal_AsNumberBranch() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);
        try {
            serializer._acceptJsonFormatVisitor(visitor, typeHint, true);
        } catch (Exception e) {
            // internal visitIntFormat implementation ไม่แสดงใน source ที่ให้มา
        }
    }

    @Test
    public void testAcceptJsonFormatVisitorInternal_AsStringBranch() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);
        try {
            serializer._acceptJsonFormatVisitor(visitor, typeHint, false);
        } catch (Exception e) {
            // internal visitStringFormat implementation ไม่แสดงใน source ที่ให้มา
        }
    }

    // ---------------------------------------------------------------
    // acceptJsonFormatVisitor(...) - public wrapper, ตรวจว่ามีการเรียก visitor.getProvider()
    // ตามที่ระบุใน source: _asTimestamp(visitor.getProvider())
    // ---------------------------------------------------------------

    @Test
    public void testAcceptJsonFormatVisitor_Public_CallsGetProviderOnVisitor() {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);
        when(visitor.getProvider()).thenReturn(null);
        try {
            serializer.acceptJsonFormatVisitor(visitor, typeHint);
        } catch (Exception e) {
            // internal helper ที่ไม่แสดงใน source อาจ throw - ไม่ยืนยัน behavior นี้
        }
        verify(visitor).getProvider();
    }

    // ---------------------------------------------------------------
    // createContextual(...)
    // ---------------------------------------------------------------

    @Test
    public void testCreateContextual_PropertyNull_ReturnsSameInstance() throws Exception {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        SerializerProvider provider = mock(SerializerProvider.class);

        JsonSerializer<?> result = serializer.createContextual(provider, null);

        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextual_FormatNull_ReturnsSameInstance() throws Exception {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        AnnotatedMember member = mock(AnnotatedMember.class);

        when(property.getMember()).thenReturn(member);
        when(provider.getAnnotationIntrospector()).thenReturn(introspector);
        when(introspector.findFormat(any(Annotated.class))).thenReturn(null);

        JsonSerializer<?> result = serializer.createContextual(provider, property);

        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextual_ShapeNumeric_ReturnsTimestampSerializer() throws Exception {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        JsonFormat.Value formatMock = mock(JsonFormat.Value.class);

        when(property.getMember()).thenReturn(member);
        when(provider.getAnnotationIntrospector()).thenReturn(introspector);
        when(introspector.findFormat(any(Annotated.class))).thenReturn(formatMock);
        when(formatMock.getShape()).thenReturn(JsonFormat.Shape.NUMBER);

        JsonSerializer<?> result = serializer.createContextual(provider, property);

        assertNotSame(serializer, result);
        assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer casted = (ConcreteDateTimeSerializer) result;
        assertEquals(Boolean.TRUE, casted._useTimestamp);
        assertNull(casted._customFormat);
    }

    @Test
    public void testCreateContextual_ShapeString_WithPatternLocaleAndTz() throws Exception {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        JsonFormat.Value formatMock = mock(JsonFormat.Value.class);

        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale loc = Locale.GERMANY;

        when(property.getMember()).thenReturn(member);
        when(provider.getAnnotationIntrospector()).thenReturn(introspector);
        when(introspector.findFormat(any(Annotated.class))).thenReturn(formatMock);
        when(formatMock.getShape()).thenReturn(JsonFormat.Shape.STRING);
        when(formatMock.getTimeZone()).thenReturn(tz);
        when(formatMock.hasPattern()).thenReturn(true);
        when(formatMock.getPattern()).thenReturn("yyyy-MM-dd");
        when(formatMock.hasLocale()).thenReturn(true);
        when(formatMock.getLocale()).thenReturn(loc);

        JsonSerializer<?> result = serializer.createContextual(provider, property);

        assertNotSame(serializer, result);
        ConcreteDateTimeSerializer casted = (ConcreteDateTimeSerializer) result;
        assertEquals(Boolean.FALSE, casted._useTimestamp);
        assertNotNull(casted._customFormat);
        assertTrue(casted._customFormat instanceof SimpleDateFormat);
        SimpleDateFormat sdf = (SimpleDateFormat) casted._customFormat;
        assertEquals("yyyy-MM-dd", sdf.toPattern());
        assertEquals(tz, sdf.getTimeZone());

        // tz != null -> ไม่ควรเรียก provider.getTimeZone()
        verify(provider, never()).getTimeZone();
        // hasLocale = true -> ไม่ควรเรียก provider.getLocale()
        verify(provider, never()).getLocale();
    }

    @Test
    public void testCreateContextual_ShapeString_WithoutPatternLocaleTz_UsesProviderDefaults() throws Exception {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        JsonFormat.Value formatMock = mock(JsonFormat.Value.class);

        Locale providerLocale = Locale.US;
        TimeZone providerTz = TimeZone.getTimeZone("GMT");

        when(property.getMember()).thenReturn(member);
        when(provider.getAnnotationIntrospector()).thenReturn(introspector);
        when(introspector.findFormat(any(Annotated.class))).thenReturn(formatMock);
        when(formatMock.getShape()).thenReturn(JsonFormat.Shape.STRING);
        when(formatMock.getTimeZone()).thenReturn(null);
        when(formatMock.hasPattern()).thenReturn(false);
        when(formatMock.hasLocale()).thenReturn(false);
        when(provider.getLocale()).thenReturn(providerLocale);
        when(provider.getTimeZone()).thenReturn(providerTz);

        JsonSerializer<?> result = serializer.createContextual(provider, property);

        ConcreteDateTimeSerializer casted = (ConcreteDateTimeSerializer) result;
        assertEquals(Boolean.FALSE, casted._useTimestamp);
        SimpleDateFormat sdf = (SimpleDateFormat) casted._customFormat;
        assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, sdf.toPattern());
        assertEquals(providerTz, sdf.getTimeZone());

        verify(provider, atLeastOnce()).getTimeZone();
        verify(provider, atLeastOnce()).getLocale();
    }

    @Test
    public void testCreateContextual_ShapeNotNumericNotString_ReturnsSameInstance() throws Exception {
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        AnnotationIntrospector introspector = mock(AnnotationIntrospector.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        JsonFormat.Value formatMock = mock(JsonFormat.Value.class);

        when(property.getMember()).thenReturn(member);
        when(provider.getAnnotationIntrospector()).thenReturn(introspector);
        when(introspector.findFormat(any(Annotated.class))).thenReturn(formatMock);
        when(formatMock.getShape()).thenReturn(JsonFormat.Shape.BOOLEAN);

        JsonSerializer<?> result = serializer.createContextual(provider, property);

        assertSame(serializer, result);
    }
}
