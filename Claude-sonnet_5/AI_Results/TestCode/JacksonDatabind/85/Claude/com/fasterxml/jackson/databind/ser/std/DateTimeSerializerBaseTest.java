package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;

/**
 * Unit tests for {@link DateTimeSerializerBase}.
 *
 * หมายเหตุสำคัญ: {@code findFormatOverrides(...)} ที่ {@code createContextual}
 * เรียกใช้ เป็น method ที่สืบทอดมาจากคลาสแม่ (ไม่อยู่ในซอร์สที่ให้มา)
 * และมี logic ภายในที่ซับซ้อน (annotation introspection) ซึ่งไม่สามารถยืนยัน
 * behavior ได้แน่ชัดจากซอร์สโค้ดที่ให้มา จึง override method นี้ใน subclass
 * ทดสอบเพื่อ "isolate" การทดสอบให้ตรงกับ logic ของ createContextual เอง
 * (if/else เกี่ยวกับ shape/pattern/locale/timezone) ตามที่ปรากฏในซอร์สจริง
 */
public class DateTimeSerializerBaseTest
{
    /** Concrete helper subclass used purely for testing purposes. */
    static class TestSerializer extends DateTimeSerializerBase<Date>
    {
        JsonFormat.Value formatOverride;

        TestSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        void setFormatOverride(JsonFormat.Value v) {
            this.formatOverride = v;
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            TestSerializer s = new TestSerializer(timestamp, customFormat);
            s.formatOverride = this.formatOverride;
            return s;
        }

        @Override
        protected long _timestamp(Date value) {
            return (value == null) ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) {
            // ไม่ถูกใช้งานในชุดทดสอบนี้ (serialize ไม่ใช่ logic ของ base class)
        }

        // ควบคุมผลลัพธ์ของ dependency ที่อยู่นอกคลาสเป้าหมาย เพื่อแยกทดสอบ
        // if/else ของ createContextual ในคลาสเป้าหมายเองโดยเฉพาะ
        @Override
        protected JsonFormat.Value findFormatOverrides(SerializerProvider serializers,
                BeanProperty property, Class<?> typeForDefaults) {
            return formatOverride;
        }
    }

    // ---------------------------------------------------------------
    // createContextual()
    // ---------------------------------------------------------------

    @Test
    public void testCreateContextual_PropertyNull_ReturnsThis() throws Exception {
        TestSerializer ser = new TestSerializer(null, null);
        JsonSerializer<?> result = ser.createContextual(mock(SerializerProvider.class), null);
        assertSame("property == null ต้อง return this", ser, result);
    }

    @Test
    public void testCreateContextual_FormatNull_ReturnsThis() throws Exception {
        TestSerializer ser = new TestSerializer(null, null);
        ser.setFormatOverride(null);
        BeanProperty prop = mock(BeanProperty.class);
        JsonSerializer<?> result = ser.createContextual(mock(SerializerProvider.class), prop);
        assertSame("format == null ต้อง return this", ser, result);
    }

    @Test
    public void testCreateContextual_NumericShape_UsesTimestampTrue() throws Exception {
        TestSerializer ser = new TestSerializer(null, null);
        ser.setFormatOverride(new JsonFormat.Value().withShape(JsonFormat.Shape.NUMBER));
        BeanProperty prop = mock(BeanProperty.class);

        Object result = ser.createContextual(mock(SerializerProvider.class), prop);
        assertTrue(result instanceof TestSerializer);
        TestSerializer r = (TestSerializer) result;
        assertEquals(Boolean.TRUE, r._useTimestamp);
        assertNull(r._customFormat);
    }

    @Test
    public void testCreateContextual_StringShape_UsesDefaultsFromProvider() throws Exception {
        TestSerializer ser = new TestSerializer(null, null);
        ser.setFormatOverride(new JsonFormat.Value().withShape(JsonFormat.Shape.STRING));
        BeanProperty prop = mock(BeanProperty.class);

        SerializerProvider sp = mock(SerializerProvider.class);
        TimeZone defaultTz = TimeZone.getTimeZone("UTC");
        when(sp.getLocale()).thenReturn(Locale.US);
        when(sp.getTimeZone()).thenReturn(defaultTz);

        Object result = ser.createContextual(sp, prop);
        TestSerializer r = (TestSerializer) result;

        assertEquals(Boolean.FALSE, r._useTimestamp);
        assertTrue(r._customFormat instanceof SimpleDateFormat);
        SimpleDateFormat sdf = (SimpleDateFormat) r._customFormat;
        assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, sdf.toPattern());
        assertEquals(defaultTz, sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_CustomPatternLocaleTimeZone_AllExplicit() throws Exception {
        TestSerializer ser = new TestSerializer(null, null);
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        ser.setFormatOverride(new JsonFormat.Value()
                .withPattern("dd/MM/yyyy")
                .withLocale(Locale.FRANCE)
                .withTimeZone(tz));
        BeanProperty prop = mock(BeanProperty.class);
        SerializerProvider sp = mock(SerializerProvider.class);

        Object result = ser.createContextual(sp, prop);
        TestSerializer r = (TestSerializer) result;

        assertEquals(Boolean.FALSE, r._useTimestamp);
        SimpleDateFormat sdf = (SimpleDateFormat) r._customFormat;
        assertEquals("dd/MM/yyyy", sdf.toPattern());
        assertEquals(tz, sdf.getTimeZone());
        // tz ถูกระบุเอง จึงไม่ควรเรียก serializers.getTimeZone()
        verify(sp, never()).getTimeZone();
    }

    @Test
    public void testCreateContextual_LocaleOnly_DefaultsForPatternAndTimeZone() throws Exception {
        TestSerializer ser = new TestSerializer(null, null);
        ser.setFormatOverride(new JsonFormat.Value().withLocale(Locale.GERMANY));
        BeanProperty prop = mock(BeanProperty.class);
        SerializerProvider sp = mock(SerializerProvider.class);
        TimeZone defaultTz = TimeZone.getTimeZone("UTC");
        when(sp.getTimeZone()).thenReturn(defaultTz);

        Object result = ser.createContextual(sp, prop);
        TestSerializer r = (TestSerializer) result;
        SimpleDateFormat sdf = (SimpleDateFormat) r._customFormat;

        assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, sdf.toPattern());
        assertEquals(defaultTz, sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_NoOverrides_ReturnsThis() throws Exception {
        TestSerializer ser = new TestSerializer(null, null);
        // shape ANY (default), ไม่มี pattern/locale/timezone -> เข้า else สุดท้าย
        ser.setFormatOverride(new JsonFormat.Value());
        BeanProperty prop = mock(BeanProperty.class);

        Object result = ser.createContextual(mock(SerializerProvider.class), prop);
        assertSame(ser, result);
    }

    // ---------------------------------------------------------------
    // isEmpty() - deprecated 1-arg overload
    // ---------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmptyDeprecated_NullValue() {
        TestSerializer ser = new TestSerializer(null, null);
        assertTrue(ser.isEmpty(null));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmptyDeprecated_ZeroTimestamp() {
        TestSerializer ser = new TestSerializer(null, null);
        assertTrue(ser.isEmpty(new Date(0L)));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmptyDeprecated_NonZeroTimestamp() {
        TestSerializer ser = new TestSerializer(null, null);
        assertFalse(ser.isEmpty(new Date(12345L)));
    }

    // ---------------------------------------------------------------
    // isEmpty(SerializerProvider, T) - 2-arg overload
    // ---------------------------------------------------------------

    @Test
    public void testIsEmptyWithProvider_NullValue() {
        TestSerializer ser = new TestSerializer(null, null);
        SerializerProvider sp = mock(SerializerProvider.class);
        assertTrue(ser.isEmpty(sp, null));
    }

    @Test
    public void testIsEmptyWithProvider_ZeroTimestamp() {
        TestSerializer ser = new TestSerializer(null, null);
        SerializerProvider sp = mock(SerializerProvider.class);
        assertTrue(ser.isEmpty(sp, new Date(0L)));
    }

    @Test
    public void testIsEmptyWithProvider_NonZeroTimestamp() {
        TestSerializer ser = new TestSerializer(null, null);
        SerializerProvider sp = mock(SerializerProvider.class);
        assertFalse(ser.isEmpty(sp, new Date(999L)));
    }

    // ---------------------------------------------------------------
    // _asTimestamp()
    // ---------------------------------------------------------------

    @Test
    public void testAsTimestamp_UseTimestampTrue() {
        TestSerializer ser = new TestSerializer(Boolean.TRUE, null);
        // _useTimestamp != null ทำให้ไม่ต้องใช้ serializers -> ใส่ null ได้อย่างปลอดภัย
        assertTrue(ser._asTimestamp(null));
    }

    @Test
    public void testAsTimestamp_UseTimestampFalse() {
        TestSerializer ser = new TestSerializer(Boolean.FALSE, null);
        assertFalse(ser._asTimestamp(null));
    }

    @Test
    public void testAsTimestamp_NullUseTimestamp_NoCustomFormat_ProviderEnabled() {
        TestSerializer ser = new TestSerializer(null, null);
        SerializerProvider sp = mock(SerializerProvider.class);
        when(sp.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)).thenReturn(true);
        assertTrue(ser._asTimestamp(sp));
    }

    @Test
    public void testAsTimestamp_NullUseTimestamp_NoCustomFormat_ProviderDisabled() {
        TestSerializer ser = new TestSerializer(null, null);
        SerializerProvider sp = mock(SerializerProvider.class);
        when(sp.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)).thenReturn(false);
        assertFalse(ser._asTimestamp(sp));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestamp_NullUseTimestamp_NoCustomFormat_NullProvider_Throws() {
        TestSerializer ser = new TestSerializer(null, null);
        ser._asTimestamp(null);
    }

    @Test
    public void testAsTimestamp_CustomFormatPresent_ReturnsFalse() {
        TestSerializer ser = new TestSerializer(null, new SimpleDateFormat("yyyy"));
        // customFormat != null -> return false ก่อนถึง serializers check เลย -> null ปลอดภัย
        assertFalse(ser._asTimestamp(null));
    }

    // ---------------------------------------------------------------
    // getSchema()
    // ---------------------------------------------------------------

    @Test
    public void testGetSchema_AsTimestamp_TypeNumber() {
        TestSerializer ser = new TestSerializer(Boolean.TRUE, null);
        JsonNode schema = ser.getSchema(mock(SerializerProvider.class), Date.class);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_AsString_TypeString() {
        TestSerializer ser = new TestSerializer(Boolean.FALSE, null);
        JsonNode schema = ser.getSchema(mock(SerializerProvider.class), Date.class);
        assertNotNull(schema);
        assertEquals("string", schema.get("type").asText());
    }

    // ---------------------------------------------------------------
    // acceptJsonFormatVisitor() / _acceptJsonFormatVisitor()
    // ---------------------------------------------------------------
    //
    // หมายเหตุ: เรา verify เพียงว่า branch (asNumber = true/false) ทำงานได้
    // โดยไม่ throw exception เพราะ visitIntFormat()/visitStringFormat()
    // ที่ถูกเรียกภายในเป็น static helper ที่มาจากคลาสอื่น (ไม่อยู่ในซอร์ส
    // ที่ให้มา) จึงไม่ควรเดา exact API ของ sub-visitor (expectXxxFormat)
    // ที่มันเรียกใช้

    @Test
    public void testAcceptJsonFormatVisitor_AsNumberBranch() throws Exception {
        TestSerializer ser = new TestSerializer(Boolean.TRUE, null);
        SerializerProvider sp = mock(SerializerProvider.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(sp);
        JavaType typeHint = mock(JavaType.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);
        // ไม่ throw = ผ่าน branch asNumber == true (visitIntFormat)
    }

    @Test
    public void testAcceptJsonFormatVisitor_AsStringBranch() throws Exception {
        TestSerializer ser = new TestSerializer(Boolean.FALSE, null);
        SerializerProvider sp = mock(SerializerProvider.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(sp);
        JavaType typeHint = mock(JavaType.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);
        // ไม่ throw = ผ่าน branch asNumber == false (visitStringFormat)
    }
}
