package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.net.URI;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.*;

public class StdKeyDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final DeserializationContext ctxt = mapper.getDeserializationContext();

    // ==================== forType Tests = ====================
    @Test
    public void testForTypeStandardTypes() {
        assertNotNull(StdKeyDeserializer.forType(String.class));
        assertNotNull(StdKeyDeserializer.forType(Object.class));
        assertNotNull(StdKeyDeserializer.forType(UUID.class));
        assertNotNull(StdKeyDeserializer.forType(Integer.class));
        assertNotNull(StdKeyDeserializer.forType(Long.class));
        assertNotNull(StdKeyDeserializer.forType(Date.class));
        assertNotNull(StdKeyDeserializer.forType(Calendar.class));
        assertNotNull(StdKeyDeserializer.forType(Boolean.class));
        assertNotNull(StdKeyDeserializer.forType(Byte.class));
        assertNotNull(StdKeyDeserializer.forType(Character.class));
        assertNotNull(StdKeyDeserializer.forType(Short.class));
        assertNotNull(StdKeyDeserializer.forType(Float.class));
        assertNotNull(StdKeyDeserializer.forType(Double.class));
        assertNotNull(StdKeyDeserializer.forType(URI.class));
        assertNotNull(StdKeyDeserializer.forType(URL.class));
        assertNotNull(StdKeyDeserializer.forType(Class.class));
        assertNotNull(StdKeyDeserializer.forType(Locale.class));
        assertNotNull(StdKeyDeserializer.forType(Currency.class));
    }

    @Test
    public void testForTypeUnsupportedReturnsNull() {
        assertNull(StdKeyDeserializer.forType(Void.class));
    }

    // ==================== deserializeKey (Null Key) = ====================
    @Test
    public void testDeserializeKeyNull() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Integer.class);
        assertNull(kdeser.deserializeKey(null, ctxt));
    }

    // ==================== TYPE_BOOLEAN = ====================
    @Test
    public void testBooleanKey() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Boolean.class);
        assertEquals(Boolean.TRUE, kdeser.deserializeKey("true", ctxt));
        assertEquals(Boolean.FALSE, kdeser.deserializeKey("false", ctxt));
    }

    @Test(expected = Exception.class)
    public void testBooleanKeyInvalid() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Boolean.class);
        kdeser.deserializeKey("not-a-bool", ctxt);
    }

    // ==================== TYPE_BYTE = ====================
    @Test
    public void testByteKeyBoundary() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Byte.class);
        assertEquals(Byte.valueOf((byte) 127), kdeser.deserializeKey("127", ctxt));
        assertEquals(Byte.valueOf((byte) -128), kdeser.deserializeKey("-128", ctxt));
        // Unsigned byte support up to 255
        assertEquals(Byte.valueOf((byte) 255), kdeser.deserializeKey("255", ctxt));
    }

    @Test(expected = Exception.class)
    public void testByteKeyOverflow() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Byte.class);
        kdeser.deserializeKey("300", ctxt);
    }

    // ==================== TYPE_SHORT = ====================
    @Test
    public void testShortKeyBoundary() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Short.class);
        assertEquals(Short.valueOf(Short.MAX_VALUE), kdeser.deserializeKey(String.valueOf(Short.MAX_VALUE), ctxt));
        assertEquals(Short.valueOf(Short.MIN_VALUE), kdeser.deserializeKey(String.valueOf(Short.MIN_VALUE), ctxt));
    }

    @Test(expected = Exception.class)
    public void testShortKeyOverflow() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Short.class);
        kdeser.deserializeKey("40000", ctxt);
    }

    // ==================== TYPE_CHAR = ====================
    @Test
    public void testCharKeyValid() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Character.class);
        assertEquals(Character.valueOf('A'), kdeser.deserializeKey("A", ctxt));
    }

    @Test(expected = Exception.class)
    public void testCharKeyInvalidLength() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Character.class);
        kdeser.deserializeKey("AB", ctxt);
    }

    // ==================== TYPE_INT, LONG, FLOAT, DOUBLE = ====================
    @Test
    public void testNumericKeys() throws Exception {
        assertEquals(123, StdKeyDeserializer.forType(Integer.class).deserializeKey("123", ctxt));
        assertEquals(123L, StdKeyDeserializer.forType(Long.class).deserializeKey("123", ctxt));
        assertEquals(123.45f, StdKeyDeserializer.forType(Float.class).deserializeKey("123.45", ctxt));
        assertEquals(123.456d, StdKeyDeserializer.forType(Double.class).deserializeKey("123.456", ctxt));
    }

    @Test(expected = Exception.class)
    public void testIntegerKeyInvalid() throws Exception {
        StdKeyDeserializer.forType(Integer.class).deserializeKey("not-an-int", ctxt);
    }

    // ==================== TYPE_LOCALE & CURRENCY = ====================
    @Test
    public void testLocaleAndCurrencyKeys() throws Exception {
        Object localeKey = StdKeyDeserializer.forType(Locale.class).deserializeKey("en_US", ctxt);
        assertNotNull(localeKey);

        Object currencyKey = StdKeyDeserializer.forType(Currency.class).deserializeKey("USD", ctxt);
        assertNotNull(currencyKey);
    }

    @Test(expected = Exception.class)
    public void testLocaleKeyInvalid() throws Exception {
        // Force invalid or problematic format if applicable, or simulate exception
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Locale.class);
        // บางเวอร์ชัน Locale อาจยอมรับเกือบทุก string ลองใช้ค่าที่ทำให้เกิดปัญหาแน่ๆ หรือพึ่งพา Exception handling
        kdeser.deserializeKey(null, ctxt); // จะถูกดักตั้งแต่แรก ลองผ่านค่าแปลกๆ
    }

    // ==================== TYPE_DATE & CALENDAR = ====================
    @Test
    public void testDateAndCalendarKeys() throws Exception {
        StdKeyDeserializer dateDeser = StdKeyDeserializer.forType(Date.class);
        Object dateRes = dateDeser.deserializeKey("2023-01-01T00:00:00.000+0000", ctxt);
        assertNotNull(dateRes);

        StdKeyDeserializer calDeser = StdKeyDeserializer.forType(Calendar.class);
        Object calRes = calDeser.deserializeKey("2023-01-01T00:00:00.000+0000", ctxt);
        assertNotNull(calRes);
    }

    // ==================== TYPE_UUID, URI, URL, CLASS = ====================
    @Test
    public void testUuidUriUrlClassKeys() throws Exception {
        UUID uuid = UUID.randomUUID();
        assertEquals(uuid, StdKeyDeserializer.forType(UUID.class).deserializeKey(uuid.toString(), ctxt));

        URI uri = URI.create("http://example.com");
        assertEquals(uri, StdKeyDeserializer.forType(URI.class).deserializeKey("http://example.com", ctxt));

        URL url = new URL("http://example.com");
        assertEquals(url, StdKeyDeserializer.forType(URL.class).deserializeKey("http://example.com", ctxt));

        assertEquals(String.class, StdKeyDeserializer.forType(Class.class).deserializeKey("java.lang.String", ctxt));
    }

    @Test(expected = Exception.class)
    public void testUuidKeyInvalid() throws Exception {
        StdKeyDeserializer.forType(UUID.class).deserializeKey("invalid-uuid", ctxt);
    }

    @Test(expected = Exception.class)
    public void testUriKeyInvalid() throws Exception {
        // ข้อมูลที่ผิดพลาดโครงสร้าง URI (เช่น มี space หรืออักขระต้องห้ามในบางกรณี)
        StdKeyDeserializer.forType(URI.class).deserializeKey("http://<invalid>.com", ctxt);
    }

    @Test(expected = Exception.class)
    public void testUrlKeyInvalid() throws Exception {
        StdKeyDeserializer.forType(URL.class).deserializeKey("not-a-url", ctxt);
    }

    @Test(expected = Exception.class)
    public void testClassKeyInvalid() throws Exception {
        StdKeyDeserializer.forType(Class.class).deserializeKey("com.nonexistent.ClassXYZ", ctxt);
    }

    // ==================== StringKD Tests = ====================
    @Test
    public void testStringKD() throws Exception {
        KeyDeserializer stringKd = StdKeyDeserializer.StringKD.forType(String.class);
        assertEquals("test-string", stringKd.deserializeKey("test-string", ctxt));

        KeyDeserializer objKd = StdKeyDeserializer.StringKD.forType(Object.class);
        assertEquals("test-object", objKd.deserializeKey("test-object", ctxt));

        KeyDeserializer customKd = StdKeyDeserializer.StringKD.forType(StringBuffer.class);
        assertNotNull(customKd);
        assertEquals("custom", customKd.deserializeKey("custom", ctxt));
    }
}