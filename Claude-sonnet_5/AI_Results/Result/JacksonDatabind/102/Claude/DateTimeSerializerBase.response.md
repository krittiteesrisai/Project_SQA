# วิเคราะห์และข้อสมมติฐานสำคัญ

คลาส `DateTimeSerializerBase` เป็น `abstract class` จึงต้องสร้าง **concrete subclass** ขึ้นมาเพื่อทดสอบ และมีหลายจุดที่ต้อง "override" method ที่สืบทอดมาจาก superclass ที่ไม่มีซอร์สโค้ดให้ (เช่น `findFormatOverrides`) เพื่อควบคุม input ของ `createContextual` โดยตรง — เป็นการแยก unit ที่ทดสอบ (createContextual's own logic) ออกจากพฤติกรรมของ superclass ที่ไม่รู้จัก ไม่ใช่การเดา behavior ของคลาสเป้าหมาย

จุดที่ **ไม่สามารถยืนยัน behavior ได้ 100%** จากซอร์สที่ให้มา จะมีคอมเมนต์กำกับไว้ในโค้ด (เช่น เนื้อหาที่แน่นอนของ `createSchemaNode`, การ implement ภายในของ `visitIntFormat`/`visitStringFormat`)

```java
package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.util.StdDateFormat;

// import คลาสเป้าหมาย (แม้อยู่ package เดียวกัน ก็ระบุให้ชัดเจนตามข้อกำหนด)
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;

public class DateTimeSerializerBaseTest {

    /**
     * Concrete subclass สำหรับทดสอบ (เนื่องจาก DateTimeSerializerBase เป็น abstract)
     * - override findFormatOverrides() เพื่อ "ฉีด" ค่า JsonFormat.Value ที่ต้องการทดสอบ
     *   โดยตรง แทนการพึ่งพา implementation จริงของ superclass ซึ่งไม่มีซอร์สให้มา
     *   (ไม่ได้เดา behavior ของ DateTimeSerializerBase เอง แต่แยก unit การทดสอบ
     *   createContextual ออกจาก dependency ที่ไม่รู้จัก)
     */
    static class TestDateTimeSerializer extends DateTimeSerializerBase<Date> {

        JsonFormat.Value formatOverrideToReturn = null;

        TestDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return (value == null) ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            // ไม่ใช้ในชุดเทสนี้
        }

        @Override
        protected JsonFormat.Value findFormatOverrides(SerializerProvider serializers,
                BeanProperty property, Class<?> typeForDefaults) {
            return formatOverrideToReturn;
        }

        // ---- public wrapper เพื่อเข้าถึง protected methods จาก test ----
        public boolean callAsTimestamp(SerializerProvider provider) {
            return _asTimestamp(provider);
        }

        public void callAcceptVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint, boolean asNumber)
                throws JsonMappingException {
            _acceptJsonFormatVisitor(visitor, typeHint, asNumber);
        }

        public void callSerializeAsString(Date value, JsonGenerator g, SerializerProvider provider) throws IOException {
            _serializeAsString(value, g, provider);
        }

        public Boolean getUseTimestampField() { return _useTimestamp; }
        public DateFormat getCustomFormatField() { return _customFormat; }
        public AtomicReference<DateFormat> getReusedCustomFormatField() { return _reusedCustomFormat; }
    }

    private TestDateTimeSerializer serializerNoFormat;

    @Before
    public void setUp() {
        serializerNoFormat = new TestDateTimeSerializer(null, null);
    }

    /** ช่วยสร้าง SerializationConfig "จริง" ที่มี getDateFormat() ตามที่ต้องการ
     *  (ใช้ ObjectMapper จริงแทนการ mock SerializationConfig เพื่อเลี่ยงความเสี่ยง
     *  กรณีคลาสนั้นเป็น final ซึ่งจะ mock ไม่ได้) */
    private SerializationConfig configWithDateFormat(DateFormat fmt) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(fmt);
        return mapper.getSerializationConfig();
    }

    // =========================================================
    // Constructor
    // =========================================================

    @Test
    public void constructor_withCustomFormat_createsReusedReference() {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        TestDateTimeSerializer s = new TestDateTimeSerializer(null, fmt);
        assertNotNull(s.getReusedCustomFormatField());
        assertSame(fmt, s.getCustomFormatField());
        assertNull(s.getUseTimestampField());
    }

    @Test
    public void constructor_withoutCustomFormat_reusedReferenceIsNull() {
        TestDateTimeSerializer s = new TestDateTimeSerializer(Boolean.TRUE, null);
        assertNull(s.getReusedCustomFormatField());
        assertNull(s.getCustomFormatField());
        assertEquals(Boolean.TRUE, s.getUseTimestampField());
    }

    // =========================================================
    // isEmpty - ตามคอมเมนต์ในซอร์ส ต้อง return false เสมอ
    // =========================================================

    @Test
    public void isEmpty_alwaysReturnsFalse() {
        SerializerProvider provider = mock(SerializerProvider.class);
        assertFalse(serializerNoFormat.isEmpty(provider, new Date(0L)));
        assertFalse(serializerNoFormat.isEmpty(provider, new Date(123456789L)));
    }

    // =========================================================
    // _asTimestamp
    // =========================================================

    @Test
    public void asTimestamp_useTimestampTrue_returnsTrue() {
        TestDateTimeSerializer s = new TestDateTimeSerializer(Boolean.TRUE, null);
        // provider ไม่ถูกใช้เมื่อ _useTimestamp != null จึงส่ง null ได้
        assertTrue(s.callAsTimestamp(null));
    }

    @Test
    public void asTimestamp_useTimestampFalse_returnsFalse() {
        TestDateTimeSerializer s = new TestDateTimeSerializer(Boolean.FALSE, null);
        assertFalse(s.callAsTimestamp(null));
    }

    @Test
    public void asTimestamp_nullUseTimestamp_customFormatNull_providerEnabled_returnsTrue() {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)).thenReturn(true);
        assertTrue(serializerNoFormat.callAsTimestamp(provider));
    }

    @Test
    public void asTimestamp_nullUseTimestamp_customFormatNull_providerDisabled_returnsFalse() {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)).thenReturn(false);
        assertFalse(serializerNoFormat.callAsTimestamp(provider));
    }

    @Test(expected = IllegalArgumentException.class)
    public void asTimestamp_nullUseTimestamp_customFormatNull_providerNull_throwsException() {
        serializerNoFormat.callAsTimestamp(null);
    }

    @Test
    public void asTimestamp_nullUseTimestamp_customFormatNotNull_alwaysFalse() {
        TestDateTimeSerializer s = new TestDateTimeSerializer(null, new SimpleDateFormat("yyyy"));
        // provider ไม่ถูกใช้ในสาขานี้ จึงส่ง null ได้โดยไม่ throw
        assertFalse(s.callAsTimestamp(null));
    }

    // =========================================================
    // acceptJsonFormatVisitor / _acceptJsonFormatVisitor
    // (ตรวจเฉพาะว่ามีการเรียก expectIntegerFormat หรือ expectStringFormat
    //  ตาม flag asNumber - เนื้อหาการ implement ภายในของ visitIntFormat/
    //  visitStringFormat ไม่มีในซอร์สที่ให้มา จึงไม่ assert รายละเอียดลึกกว่านี้)
    // =========================================================

    @Test
    public void acceptJsonFormatVisitor_asNumberTrue_callsExpectIntegerFormat() throws Exception {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonIntegerFormatVisitor intVisitor = mock(JsonIntegerFormatVisitor.class);
        when(visitor.expectIntegerFormat(any(JavaType.class))).thenReturn(intVisitor);
        JavaType typeHint = mock(JavaType.class);

        serializerNoFormat.callAcceptVisitor(visitor, typeHint, true);

        verify(visitor).expectIntegerFormat(typeHint);
        verify(visitor, never()).expectStringFormat(any(JavaType.class));
    }

    @Test
    public void acceptJsonFormatVisitor_asNumberFalse_callsExpectStringFormat() throws Exception {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonStringFormatVisitor strVisitor = mock(JsonStringFormatVisitor.class);
        when(visitor.expectStringFormat(any(JavaType.class))).thenReturn(strVisitor);
        JavaType typeHint = mock(JavaType.class);

        serializerNoFormat.callAcceptVisitor(visitor, typeHint, false);

        verify(visitor).expectStringFormat(typeHint);
        verify(visitor, never()).expectIntegerFormat(any(JavaType.class));
    }

    @Test
    public void acceptJsonFormatVisitorPublic_usesAsTimestampFromProvider() throws Exception {
        TestDateTimeSerializer s = new TestDateTimeSerializer(Boolean.TRUE, null);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        when(visitor.getProvider()).thenReturn(provider);
        JsonIntegerFormatVisitor intVisitor = mock(JsonIntegerFormatVisitor.class);
        when(visitor.expectIntegerFormat(any(JavaType.class))).thenReturn(intVisitor);
        JavaType typeHint = mock(JavaType.class);

        s.acceptJsonFormatVisitor(visitor, typeHint);

        verify(visitor).expectIntegerFormat(typeHint);
    }

    // =========================================================
    // getSchema - เนื้อหาแน่นอนของ createSchemaNode ไม่มีในซอร์สที่ให้มา
    // จึงตรวจแค่ว่าไม่ throw และ return ไม่ null (ครอบคลุม branch true/false ของ _asTimestamp)
    // =========================================================

    @Test
    public void getSchema_asTimestampTrue_doesNotThrow() {
        TestDateTimeSerializer s = new TestDateTimeSerializer(Boolean.TRUE, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        assertNotNull(s.getSchema(provider, Date.class));
    }

    @Test
    public void getSchema_asTimestampFalse_doesNotThrow() {
        TestDateTimeSerializer s = new TestDateTimeSerializer(Boolean.FALSE, null);
        SerializerProvider provider = mock(SerializerProvider.class);
        assertNotNull(s.getSchema(provider, Date.class));
    }

    // =========================================================
    // _serializeAsString
    // =========================================================

    @Test
    public void serializeAsString_customFormatNull_delegatesToProvider() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        Date d = new Date(1000L);

        serializerNoFormat.callSerializeAsString(d, gen, provider);

        verify(provider).defaultSerializeDateValue(d, gen);
        verify(gen, never()).writeString(anyString());
    }

    @Test
    public void serializeAsString_customFormatNotNull_reusedNull_clonesAndWrites() throws IOException {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        TestDateTimeSerializer s = new TestDateTimeSerializer(null, fmt);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        Date d = new Date(0L);

        s.callSerializeAsString(d, gen, provider);

        verify(gen).writeString(fmt.format(d));
        assertNotNull(s.getReusedCustomFormatField().get());
        verify(provider, never()).defaultSerializeDateValue(any(Date.class), any(JsonGenerator.class));
    }

    @Test
    public void serializeAsString_customFormatNotNull_reusedAvailable_usesReusedInstance() throws IOException {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        TestDateTimeSerializer s = new TestDateTimeSerializer(null, fmt);
        DateFormat reused = (DateFormat) fmt.clone();
        s.getReusedCustomFormatField().set(reused);

        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = mock(SerializerProvider.class);
        Date d = new Date(123456789L);

        s.callSerializeAsString(d, gen, provider);

        verify(gen).writeString(reused.format(d));
        assertNotNull(s.getReusedCustomFormatField().get());
    }

    // =========================================================
    // createContextual
    // =========================================================

    @Test
    public void createContextual_propertyNull_returnsSameInstance() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        Object result = serializerNoFormat.createContextual(provider, null);
        assertSame(serializerNoFormat, result);
    }

    @Test
    public void createContextual_formatOverrideNull_returnsSameInstance() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        serializerNoFormat.formatOverrideToReturn = null;

        Object result = serializerNoFormat.createContextual(provider, property);
        assertSame(serializerNoFormat, result);
    }

    @Test
    public void createContextual_shapeNumeric_returnsTimestampTrueFormatterNull() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        serializerNoFormat.formatOverrideToReturn =
                JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER_INT);

        Object result = serializerNoFormat.createContextual(provider, property);
        assertTrue(result instanceof TestDateTimeSerializer);
        TestDateTimeSerializer r = (TestDateTimeSerializer) result;
        assertEquals(Boolean.TRUE, r.getUseTimestampField());
        assertNull(r.getCustomFormatField());
    }

    @Test
    public void createContextual_hasPattern_withLocaleAndTimeZone() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);

        TimeZone tz = TimeZone.getTimeZone("UTC");
        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forPattern("yyyy-MM-dd")
                .withLocale(Locale.GERMANY)
                .withTimeZone(tz);

        Object result = serializerNoFormat.createContextual(provider, property);
        TestDateTimeSerializer r = (TestDateTimeSerializer) result;
        assertEquals(Boolean.FALSE, r.getUseTimestampField());
        assertTrue(r.getCustomFormatField() instanceof SimpleDateFormat);
        assertEquals(tz, r.getCustomFormatField().getTimeZone());
        verify(provider, never()).getLocale();
        verify(provider, never()).getTimeZone();
    }

    @Test
    public void createContextual_hasPattern_noLocaleNoTimeZone_usesProviderDefaults() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        when(provider.getLocale()).thenReturn(Locale.US);
        TimeZone providerTz = TimeZone.getTimeZone("Asia/Bangkok");
        when(provider.getTimeZone()).thenReturn(providerTz);

        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forPattern("dd/MM/yyyy");

        Object result = serializerNoFormat.createContextual(provider, property);
        TestDateTimeSerializer r = (TestDateTimeSerializer) result;
        assertEquals(Boolean.FALSE, r.getUseTimestampField());
        assertEquals(providerTz, r.getCustomFormatField().getTimeZone());
        verify(provider).getLocale();
        verify(provider).getTimeZone();
    }

    @Test
    public void createContextual_noPatternNoLocaleNoTZ_notString_returnsSameInstance() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);
        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forShape(JsonFormat.Shape.ANY);

        Object result = serializerNoFormat.createContextual(provider, property);
        assertSame(serializerNoFormat, result);
    }

    @Test
    public void createContextual_asString_stdDateFormat_withLocaleAndTimeZone() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);

        StdDateFormat std = new StdDateFormat();
        when(provider.getConfig()).thenReturn(configWithDateFormat(std));

        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forShape(JsonFormat.Shape.STRING)
                .withLocale(Locale.FRANCE)
                .withTimeZone(TimeZone.getTimeZone("UTC"));

        Object result = serializerNoFormat.createContextual(provider, property);
        TestDateTimeSerializer r = (TestDateTimeSerializer) result;
        assertEquals(Boolean.FALSE, r.getUseTimestampField());
        assertTrue(r.getCustomFormatField() instanceof StdDateFormat);
    }

    @Test
    public void createContextual_asString_stdDateFormat_noLocaleNoTimeZone() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);

        StdDateFormat std = new StdDateFormat();
        when(provider.getConfig()).thenReturn(configWithDateFormat(std));

        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);

        Object result = serializerNoFormat.createContextual(provider, property);
        TestDateTimeSerializer r = (TestDateTimeSerializer) result;
        assertEquals(Boolean.FALSE, r.getUseTimestampField());
        assertTrue(r.getCustomFormatField() instanceof StdDateFormat);
    }

    @Test
    public void createContextual_simpleDateFormat_withLocale_changesTimeZone() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);

        SimpleDateFormat base = new SimpleDateFormat("yyyy/MM/dd");
        base.setTimeZone(TimeZone.getTimeZone("GMT"));
        when(provider.getConfig()).thenReturn(configWithDateFormat(base));

        TimeZone newTz = TimeZone.getTimeZone("America/New_York");
        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forShape(JsonFormat.Shape.STRING)
                .withLocale(Locale.ITALY)
                .withTimeZone(newTz);

        Object result = serializerNoFormat.createContextual(provider, property);
        TestDateTimeSerializer r = (TestDateTimeSerializer) result;
        assertTrue(r.getCustomFormatField() instanceof SimpleDateFormat);
        SimpleDateFormat resultFmt = (SimpleDateFormat) r.getCustomFormatField();
        assertEquals(newTz, resultFmt.getTimeZone());
        assertEquals("yyyy/MM/dd", resultFmt.toPattern());
    }

    @Test
    public void createContextual_simpleDateFormat_noLocale_sameTimeZone_noChange() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);

        TimeZone sameTz = TimeZone.getTimeZone("GMT");
        SimpleDateFormat base = new SimpleDateFormat("yyyy/MM/dd");
        base.setTimeZone(sameTz);
        when(provider.getConfig()).thenReturn(configWithDateFormat(base));

        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forShape(JsonFormat.Shape.STRING)
                .withTimeZone(sameTz);

        Object result = serializerNoFormat.createContextual(provider, property);
        TestDateTimeSerializer r = (TestDateTimeSerializer) result;
        SimpleDateFormat resultFmt = (SimpleDateFormat) r.getCustomFormatField();
        // changeTZ ควรเป็น false เพราะ timezone เดิมเท่ากับ timezone ใหม่อยู่แล้ว
        assertEquals(sameTz, resultFmt.getTimeZone());
    }

    @Test
    public void createContextual_simpleDateFormat_noLocale_changesTimeZone() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);

        SimpleDateFormat base = new SimpleDateFormat("yyyy/MM/dd");
        base.setTimeZone(TimeZone.getTimeZone("GMT"));
        when(provider.getConfig()).thenReturn(configWithDateFormat(base));

        TimeZone newTz = TimeZone.getTimeZone("America/Los_Angeles");
        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forShape(JsonFormat.Shape.STRING)
                .withTimeZone(newTz);

        Object result = serializerNoFormat.createContextual(provider, property);
        TestDateTimeSerializer r = (TestDateTimeSerializer) result;
        SimpleDateFormat resultFmt = (SimpleDateFormat) r.getCustomFormatField();
        assertEquals(newTz, resultFmt.getTimeZone());
    }

    @Test
    public void createContextual_dateFormatNotSimpleOrStd_reportsBadDefinitionAndThrows() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        BeanProperty property = mock(BeanProperty.class);

        DateFormat weirdFormat = mock(DateFormat.class); // ไม่ใช่ StdDateFormat และไม่ใช่ SimpleDateFormat
        when(provider.getConfig()).thenReturn(configWithDateFormat(weirdFormat));

        // สมมติว่า reportBadDefinition จะ throw exception ตามปกติของ Jackson
        // (ถ้าไม่ throw โค้ดถัดไปจะ ClassCastException อยู่ดี เพราะ cast เป็น SimpleDateFormat)
        doThrow(new IllegalArgumentException("bad definition"))
                .when(provider).reportBadDefinition(any(Class.class), anyString());

        serializerNoFormat.formatOverrideToReturn = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);

        try {
            serializerNoFormat.createContextual(provider, property);
            fail("ควร throw exception เมื่อ DateFormat ไม่ใช่ SimpleDateFormat หรือ StdDateFormat");
        } catch (IllegalArgumentException expected) {
            // ok
        }
        verify(provider).reportBadDefinition(eq(Date.class), anyString());
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructor_withCustomFormat_*` / `constructor_withoutCustomFormat_*` | Constructor: `customFormat == null` → `_reusedCustomFormat = null` / `!= null` → สร้าง `AtomicReference` |
| `isEmpty_alwaysReturnsFalse` | `isEmpty()` return false เสมอ |
| `asTimestamp_useTimestampTrue/False_*` | `_asTimestamp`: `_useTimestamp != null` (true/false) |
| `asTimestamp_..._providerEnabled/Disabled_*` | `_useTimestamp==null && _customFormat==null && serializers!=null`: `isEnabled` true/false |
| `asTimestamp_..._providerNull_throwsException` | `serializers == null` → throw `IllegalArgumentException` |
| `asTimestamp_..._customFormatNotNull_alwaysFalse` | `_customFormat != null` → return false |
| `acceptJsonFormatVisitor_asNumberTrue/False_*` | `_acceptJsonFormatVisitor`: `asNumber` true/false |
| `acceptJsonFormatVisitorPublic_*` | `acceptJsonFormatVisitor()` เรียก `_asTimestamp(visitor.getProvider())` |
| `getSchema_asTimestampTrue/False_*` | `getSchema()`: `_asTimestamp` true/false |
| `serializeAsString_customFormatNull_*` | `_serializeAsString`: `_customFormat == null` |
| `serializeAsString_..._reusedNull_*` | `_customFormat != null`, `getAndSet(null)==null` → clone |
| `serializeAsString_..._reusedAvailable_*` | `_customFormat != null`, reused format พร้อมใช้ |
| `createContextual_propertyNull_*` | `property == null` → return `this` |
| `createContextual_formatOverrideNull_*` | `format == null` → return `this` |
| `createContextual_shapeNumeric_*` | `shape.isNumeric()` true → `withFormat(TRUE,null)` |
| `createContextual_hasPattern_withLocaleAndTimeZone` | `hasPattern()` true, `hasLocale()`/`hasTimeZone()` true |
| `createContextual_hasPattern_noLocaleNoTimeZone_*` | `hasPattern()` true, `hasLocale()`/`hasTimeZone()` false → ใช้ `serializers.getLocale()/getTimeZone()` |
| `createContextual_noPatternNoLocaleNoTZ_notString_*` | `!hasLocale && !hasTZ && !asString` → return `this` |
| `createContextual_asString_stdDateFormat_withLocaleAndTimeZone` | `df0 instanceof StdDateFormat`, `hasLocale()`/`hasTimeZone()` true |
| `createContextual_asString_stdDateFormat_noLocaleNoTimeZone` | `df0 instanceof StdDateFormat`, `hasLocale()`/`hasTimeZone()` false |
| `createContextual_simpleDateFormat_withLocale_changesTimeZone` | `hasLocale==true` → สร้าง `SimpleDateFormat` ใหม่, `changeTZ==true` |
| `createContextual_simpleDateFormat_noLocale_sameTimeZone_noChange` | `hasLocale==false` → `clone()`, `changeTZ==false` |
| `createContextual_simpleDateFormat_noLocale_changesTimeZone` | `hasLocale==false` → `clone()`, `changeTZ==true` |
| `createContextual_dateFormatNotSimpleOrStd_reportsBadDefinitionAndThrows` | `!(df0 instanceof SimpleDateFormat)` → `reportBadDefinition` ถูกเรียกและ exception propagate |

**หมายเหตุ:** กรณี `hasLocale==true && changeTZ==false` ไม่ได้ครอบคลุมแยกเพราะขึ้นกับ default timezone ของเครื่องทดสอบ (environment-dependent) จึงละไว้เพื่อความ deterministic ของผลทดสอบ