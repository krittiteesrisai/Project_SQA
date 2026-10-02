package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Unit tests for {@link StdKeyDeserializer}.
 *
 * หมายเหตุสำคัญ:
 * - ใช้ PowerMock เพราะไม่แน่ใจว่า {@link DeserializationConfig} เป็น final class
 *   หรือไม่ (ไม่มีข้อมูลยืนยันจาก source ที่ให้มา) จึงใช้ PowerMockito.mock()
 *   เพื่อรองรับทั้งสองกรณีอย่างปลอดภัย
 * - ไม่มีเทสสำหรับ nested class EnumKD เนื่องจาก constructor ต้องการ EnumResolver
 *   และ AnnotatedMethod ซึ่งไม่มี implementation ให้ในซอร์สที่ได้รับ
 *   (หลีกเลี่ยงการเดา behavior ตามข้อกำหนด)
 * - หลีกเลี่ยงการใช้ URL.equals() เพราะทำ DNS lookup จริง ใช้ toExternalForm() แทน
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(DeserializationConfig.class)
public class StdKeyDeserializerTest {

    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        ctxt = mock(DeserializationContext.class);
    }

    // ====================================================================
    // forType() - branch coverage สำหรับทุกเงื่อนไข if/else
    // ====================================================================

    @Test
    public void forType_String_returnsStringKDSingleton() throws Exception {
        StdKeyDeserializer kd1 = StdKeyDeserializer.forType(String.class);
        StdKeyDeserializer kd2 = StdKeyDeserializer.forType(String.class);
        assertNotNull(kd1);
        assertSame(kd1, kd2);
        assertEquals("abc", kd1.deserializeKey("abc", ctxt));
    }

    @Test
    public void forType_Object_returnsStringKDSingleton() throws Exception {
        StdKeyDeserializer kd1 = StdKeyDeserializer.forType(Object.class);
        StdKeyDeserializer kd2 = StdKeyDeserializer.forType(Object.class);
        assertNotNull(kd1);
        assertSame(kd1, kd2);
        assertEquals("xyz", kd1.deserializeKey("xyz", ctxt));
    }

    @Test
    public void forType_UUID() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(UUID.class);
        assertEquals(StdKeyDeserializer.TYPE_UUID, kd._kind);
        assertEquals(UUID.class, kd._keyClass);
    }

    @Test
    public void forType_Integer() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertEquals(StdKeyDeserializer.TYPE_INT, kd._kind);
    }

    @Test
    public void forType_Long() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        assertEquals(StdKeyDeserializer.TYPE_LONG, kd._kind);
    }

    @Test
    public void forType_Date() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Date.class);
        assertEquals(StdKeyDeserializer.TYPE_DATE, kd._kind);
    }

    @Test
    public void forType_Calendar() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Calendar.class);
        assertEquals(StdKeyDeserializer.TYPE_CALENDAR, kd._kind);
    }

    @Test
    public void forType_Boolean() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        assertEquals(StdKeyDeserializer.TYPE_BOOLEAN, kd._kind);
    }

    @Test
    public void forType_Byte() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        assertEquals(StdKeyDeserializer.TYPE_BYTE, kd._kind);
    }

    @Test
    public void forType_Character() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        assertEquals(StdKeyDeserializer.TYPE_CHAR, kd._kind);
    }

    @Test
    public void forType_Short() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        assertEquals(StdKeyDeserializer.TYPE_SHORT, kd._kind);
    }

    @Test
    public void forType_Float() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Float.class);
        assertEquals(StdKeyDeserializer.TYPE_FLOAT, kd._kind);
    }

    @Test
    public void forType_Double() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        assertEquals(StdKeyDeserializer.TYPE_DOUBLE, kd._kind);
    }

    @Test
    public void forType_URI() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URI.class);
        assertEquals(StdKeyDeserializer.TYPE_URI, kd._kind);
    }

    @Test
    public void forType_URL() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        assertEquals(StdKeyDeserializer.TYPE_URL, kd._kind);
    }

    @Test
    public void forType_Class() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Class.class);
        assertEquals(StdKeyDeserializer.TYPE_CLASS, kd._kind);
    }

    @Test
    public void forType_Locale_setsDeser() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Locale.class);
        assertEquals(StdKeyDeserializer.TYPE_LOCALE, kd._kind);
        assertEquals(Locale.class, kd._keyClass);
        assertNotNull(kd._deser);
    }

    @Test
    public void forType_Currency_setsDeser() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Currency.class);
        assertEquals(StdKeyDeserializer.TYPE_CURRENCY, kd._kind);
        assertEquals(Currency.class, kd._keyClass);
        assertNotNull(kd._deser);
    }

    @Test
    public void forType_UnknownType_returnsNull() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(List.class);
        assertNull(kd);
    }

    @Test
    public void getKeyClass_returnsExpected() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertEquals(Integer.class, kd.getKeyClass());
    }

    // ====================================================================
    // deserializeKey() - null check
    // ====================================================================

    @Test
    public void deserializeKey_nullKey_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertNull(kd.deserializeKey(null, ctxt));
        verifyNoMoreInteractions(ctxt);
    }

    // ====================================================================
    // TYPE_BOOLEAN
    // ====================================================================

    @Test
    public void parse_boolean_true() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        assertEquals(Boolean.TRUE, kd.deserializeKey("true", ctxt));
    }

    @Test
    public void parse_boolean_false() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        assertEquals(Boolean.FALSE, kd.deserializeKey("false", ctxt));
    }

    @Test
    public void parse_boolean_invalid_returnsNullAndCallsHandleWeirdKeyTwice() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        Object result = kd.deserializeKey("maybe", ctxt);
        assertNull(result);
        // ครั้งแรกจาก switch-case ภายใน _parse, ครั้งที่สองจาก fallback ใน deserializeKey
        verify(ctxt, times(2)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_BYTE (boundary: -128 .. 255 "unsigned")
    // ====================================================================

    @Test
    public void parse_byte_validNegativeBoundary() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        assertEquals(Byte.valueOf((byte) -128), kd.deserializeKey("-128", ctxt));
    }

    @Test
    public void parse_byte_upperExtendedBoundary_255_wrapsToMinusOne() throws Exception {
        // ตามซอร์ส: อนุญาตค่าถึง 255 (unsigned) แต่ (byte) cast จะ wrap 255 -> -1
        // (เป็นจุดที่ควรระวัง อาจเป็น fault ที่ต้องการดักจับ)
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        Object result = kd.deserializeKey("255", ctxt);
        assertEquals(Byte.valueOf((byte) -1), result);
    }

    @Test
    public void parse_byte_overflowAbove255_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        Object result = kd.deserializeKey("256", ctxt);
        assertNull(result);
        verify(ctxt, times(2)).handleWeirdKey(any(), any(), any(), any());
    }

    @Test
    public void parse_byte_underflowBelowMin_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        Object result = kd.deserializeKey("-129", ctxt);
        assertNull(result);
        verify(ctxt, times(2)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_SHORT
    // ====================================================================

    @Test
    public void parse_short_validBoundaries() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        assertEquals(Short.valueOf(Short.MIN_VALUE),
                kd.deserializeKey(String.valueOf(Short.MIN_VALUE), ctxt));
        assertEquals(Short.valueOf(Short.MAX_VALUE),
                kd.deserializeKey(String.valueOf(Short.MAX_VALUE), ctxt));
    }

    @Test
    public void parse_short_overflow_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        Object result = kd.deserializeKey(String.valueOf(Short.MAX_VALUE + 1), ctxt);
        assertNull(result);
        verify(ctxt, times(2)).handleWeirdKey(any(), any(), any(), any());
    }

    @Test
    public void parse_short_underflow_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        Object result = kd.deserializeKey(String.valueOf(Short.MIN_VALUE - 1), ctxt);
        assertNull(result);
        verify(ctxt, times(2)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_CHAR
    // ====================================================================

    @Test
    public void parse_char_singleChar() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        assertEquals(Character.valueOf('A'), kd.deserializeKey("A", ctxt));
    }

    @Test
    public void parse_char_empty_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        Object result = kd.deserializeKey("", ctxt);
        assertNull(result);
        verify(ctxt, times(2)).handleWeirdKey(any(), any(), any(), any());
    }

    @Test
    public void parse_char_multiChar_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        Object result = kd.deserializeKey("AB", ctxt);
        assertNull(result);
        verify(ctxt, times(2)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_INT
    // ====================================================================

    @Test
    public void parse_int_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertEquals(Integer.valueOf(2147483647), kd.deserializeKey("2147483647", ctxt));
    }

    @Test
    public void parse_int_invalid_throwsCaughtByOuterCatch() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        Object result = kd.deserializeKey("notanumber", ctxt);
        assertNull(result);
        // ครั้งเดียว เพราะ NumberFormatException ถูก throw ออกจาก _parse แล้วโดน catch(Exception) ใน deserializeKey
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_LONG
    // ====================================================================

    @Test
    public void parse_long_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        assertEquals(Long.valueOf(123456789012345L), kd.deserializeKey("123456789012345", ctxt));
    }

    @Test
    public void parse_long_invalid_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        Object result = kd.deserializeKey("notanumber", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_FLOAT / TYPE_DOUBLE
    // ====================================================================

    @Test
    public void parse_float_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Float.class);
        assertEquals(Float.valueOf(10.5f), kd.deserializeKey("10.5", ctxt));
    }

    @Test
    public void parse_double_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        assertEquals(Double.valueOf(10.5d), kd.deserializeKey("10.5", ctxt));
    }

    @Test
    public void parse_double_invalid_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        Object result = kd.deserializeKey("notanumber", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_UUID
    // ====================================================================

    @Test
    public void parse_uuid_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(UUID.class);
        UUID uuid = UUID.randomUUID();
        assertEquals(uuid, kd.deserializeKey(uuid.toString(), ctxt));
    }

    @Test
    public void parse_uuid_invalid_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(UUID.class);
        Object result = kd.deserializeKey("not-a-uuid", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_URI
    // ====================================================================

    @Test
    public void parse_uri_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URI.class);
        assertEquals(URI.create("http://example.com"), kd.deserializeKey("http://example.com", ctxt));
    }

    @Test
    public void parse_uri_invalid_returnsNull() throws Exception {
        // สมมติฐาน: space ที่ไม่ escape ทำให้ URI.create() throw IllegalArgumentException
        // (อ้างอิงพฤติกรรมมาตรฐานของ java.net.URI ไม่ใช่การเดา logic ของ target class)
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URI.class);
        Object result = kd.deserializeKey("http://exa mple.com", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_URL
    // ====================================================================

    @Test
    public void parse_url_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        Object result = kd.deserializeKey("http://example.com", ctxt);
        assertTrue(result instanceof URL);
        // หลีกเลี่ยง URL.equals() เพราะทำ DNS lookup จริง
        assertEquals("http://example.com", ((URL) result).toExternalForm());
    }

    @Test
    public void parse_url_invalid_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        Object result = kd.deserializeKey("not a url", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_CLASS
    // ====================================================================

    @Test
    public void parse_class_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Class.class);
        doReturn(String.class).when(ctxt).findClass("java.lang.String");
        assertEquals(String.class, kd.deserializeKey("java.lang.String", ctxt));
    }

    @Test
    public void parse_class_invalid_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Class.class);
        doThrow(new ClassNotFoundException("nope")).when(ctxt).findClass("not.a.Class");
        Object result = kd.deserializeKey("not.a.Class", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_DATE
    // ====================================================================

    @Test
    public void parse_date_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Date.class);
        Date expected = new Date(0L);
        when(ctxt.parseDate("epoch")).thenReturn(expected);
        assertEquals(expected, kd.deserializeKey("epoch", ctxt));
    }

    @Test
    public void parse_date_nullResult_fallsThroughToHandleWeirdKey() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Date.class);
        when(ctxt.parseDate("bad")).thenReturn(null);
        Object result = kd.deserializeKey("bad", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // TYPE_CALENDAR
    // ====================================================================

    @Test
    public void parse_calendar_valid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Calendar.class);
        Date d = new Date(0L);
        Calendar cal = new GregorianCalendar();
        when(ctxt.parseDate("epoch")).thenReturn(d);
        when(ctxt.constructCalendar(d)).thenReturn(cal);
        assertSame(cal, kd.deserializeKey("epoch", ctxt));
    }

    @Test
    public void parse_calendar_nullDate_doesNotCallConstructCalendar() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Calendar.class);
        when(ctxt.parseDate("bad")).thenReturn(null);
        Object result = kd.deserializeKey("bad", ctxt);
        assertNull(result);
        verify(ctxt, never()).constructCalendar(any());
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // default switch case (unreachable ผ่าน public forType แต่ทดสอบผ่าน protected ctor)
    // ====================================================================

    @Test(expected = IllegalStateException.class)
    public void parse_unknownKind_throwsIllegalStateException() throws Exception {
        StdKeyDeserializer kd = new StdKeyDeserializer(9999, Object.class);
        kd._parse("whatever", ctxt);
    }

    // ====================================================================
    // enum branch ใน deserializeKey(): _keyClass.isEnum() && READ_UNKNOWN_ENUM_VALUES_AS_NULL
    // ====================================================================

    private enum Color { RED, GREEN }

    @Test
    public void deserializeKey_enumKeyClass_readUnknownAsNullTrue_skipsSecondHandleWeirdKey() throws Exception {
        StdKeyDeserializer kd = new StdKeyDeserializer(StdKeyDeserializer.TYPE_CHAR, Color.class);
        DeserializationConfig config = PowerMockito.mock(DeserializationConfig.class);
        when(ctxt.getConfig()).thenReturn(config);
        when(config.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)).thenReturn(true);

        Object result = kd.deserializeKey("AB", ctxt); // length != 1 -> invalid สำหรับ TYPE_CHAR
        assertNull(result);
        // เรียก handleWeirdKey เพียงครั้งเดียว (จากภายใน _parse) เพราะเงื่อนไข isEnum() && isEnabled()==true
        // ทำให้ return null ทันทีโดยไม่เรียก handleWeirdKey รอบสอง
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    @Test
    public void deserializeKey_enumKeyClass_readUnknownAsNullFalse_callsSecondHandleWeirdKey() throws Exception {
        StdKeyDeserializer kd = new StdKeyDeserializer(StdKeyDeserializer.TYPE_CHAR, Color.class);
        DeserializationConfig config = PowerMockito.mock(DeserializationConfig.class);
        when(ctxt.getConfig()).thenReturn(config);
        when(config.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)).thenReturn(false);

        Object result = kd.deserializeKey("AB", ctxt);
        assertNull(result);
        verify(ctxt, times(2)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // StringKD - non-singleton branch
    // ====================================================================

    @Test
    public void stringKD_forType_nonStringNonObject_createsNewInstanceEachTime() throws Exception {
        StdKeyDeserializer.StringKD kd1 = StdKeyDeserializer.StringKD.forType(Integer.class);
        StdKeyDeserializer.StringKD kd2 = StdKeyDeserializer.StringKD.forType(Integer.class);
        assertNotSame(kd1, kd2);
        assertEquals("42", kd1.deserializeKey("42", ctxt));
    }

    // ====================================================================
    // DelegatingKD
    // ====================================================================

    @Test
    public void delegatingKD_nullKey_returnsNull() throws Exception {
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> delegate = mock(JsonDeserializer.class);
        StdKeyDeserializer.DelegatingKD kd = new StdKeyDeserializer.DelegatingKD(String.class, delegate);
        assertNull(kd.deserializeKey(null, ctxt));
    }

    @Test
    public void delegatingKD_success_returnsDelegateResult() throws Exception {
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> delegate = mock(JsonDeserializer.class);
        when(ctxt.getParser()).thenReturn(mock(JsonParser.class));
        when(delegate.deserialize(any(JsonParser.class), eq(ctxt))).thenReturn("delegatedValue");

        StdKeyDeserializer.DelegatingKD kd = new StdKeyDeserializer.DelegatingKD(String.class, delegate);
        Object result = kd.deserializeKey("key", ctxt);
        assertEquals("delegatedValue", result);
        assertEquals(String.class, kd.getKeyClass());
    }

    @Test
    public void delegatingKD_delegateReturnsNull_callsHandleWeirdKey() throws Exception {
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> delegate = mock(JsonDeserializer.class);
        when(ctxt.getParser()).thenReturn(mock(JsonParser.class));
        when(delegate.deserialize(any(JsonParser.class), eq(ctxt))).thenReturn(null);

        StdKeyDeserializer.DelegatingKD kd = new StdKeyDeserializer.DelegatingKD(String.class, delegate);
        Object result = kd.deserializeKey("key", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    @Test
    public void delegatingKD_delegateThrows_callsHandleWeirdKey() throws Exception {
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> delegate = mock(JsonDeserializer.class);
        when(ctxt.getParser()).thenReturn(mock(JsonParser.class));
        when(delegate.deserialize(any(JsonParser.class), eq(ctxt))).thenThrow(new RuntimeException("boom"));

        StdKeyDeserializer.DelegatingKD kd = new StdKeyDeserializer.DelegatingKD(String.class, delegate);
        Object result = kd.deserializeKey("key", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // StringCtorKeyDeserializer
    // ====================================================================

    @Test
    public void stringCtorKeyDeserializer_success() throws Exception {
        Constructor<?> ctor = String.class.getConstructor(String.class);
        StdKeyDeserializer.StringCtorKeyDeserializer kd = new StdKeyDeserializer.StringCtorKeyDeserializer(ctor);
        assertEquals(String.class, kd.getKeyClass());
        Object result = kd._parse("hello", ctxt);
        assertEquals("hello", result);
    }

    @Test
    public void stringCtorKeyDeserializer_reflectionFailure_caughtByDeserializeKey() throws Exception {
        // ใช้ constructor ของ URI(String) ซึ่งจะ throw URISyntaxException เมื่อ input ผิดรูปแบบ
        Constructor<?> ctor = URI.class.getConstructor(String.class);
        StdKeyDeserializer.StringCtorKeyDeserializer kd = new StdKeyDeserializer.StringCtorKeyDeserializer(ctor);
        Object result = kd.deserializeKey("http://exa mple.com", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }

    // ====================================================================
    // StringFactoryKeyDeserializer
    // ====================================================================

    @Test
    public void stringFactoryKeyDeserializer_success() throws Exception {
        Method m = Integer.class.getMethod("valueOf", String.class);
        StdKeyDeserializer.StringFactoryKeyDeserializer kd = new StdKeyDeserializer.StringFactoryKeyDeserializer(m);
        assertEquals(Integer.class, kd.getKeyClass());
        Object result = kd._parse("123", ctxt);
        assertEquals(Integer.valueOf(123), result);
    }

    @Test
    public void stringFactoryKeyDeserializer_invocationFailure_caughtByDeserializeKey() throws Exception {
        Method m = Integer.class.getMethod("valueOf", String.class);
        StdKeyDeserializer.StringFactoryKeyDeserializer kd = new StdKeyDeserializer.StringFactoryKeyDeserializer(m);
        Object result = kd.deserializeKey("notanumber", ctxt);
        assertNull(result);
        verify(ctxt, times(1)).handleWeirdKey(any(), any(), any(), any());
    }
}
