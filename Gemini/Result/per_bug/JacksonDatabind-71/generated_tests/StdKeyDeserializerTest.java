package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import static org.junit.Assert.*;

public class StdKeyDeserializerTest {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final DeserializationContext defaultContext = objectMapper.getDeserializationContext();

    @Test
    public void testForType_CommonAndPrimitiveWrappers() {
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
    public void testForType_UnknownTypeReturnsNull() {
        assertNull(StdKeyDeserializer.forType(Thread.class));
    }

    @Test
    public void testDeserializeKey_NullKey() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Integer.class);
        assertNull(kdeser.deserializeKey(null, defaultContext));
    }

    @Test
    public void testDeserializeKey_StringKey() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(String.class);
        assertEquals("test-string", kdeser.deserializeKey("test-string", defaultContext));
    }

    @Test
    public void testDeserializeKey_BooleanValid() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Boolean.class);
        assertEquals(Boolean.TRUE, kdeser.deserializeKey("true", defaultContext));
        assertEquals(Boolean.FALSE, kdeser.deserializeKey("false", defaultContext));
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testDeserializeKey_BooleanInvalid() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Boolean.class);
        kdeser.deserializeKey("not-a-boolean", defaultContext);
    }

    @Test
    public void testDeserializeKey_ByteValidAndBoundary() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Byte.class);
        assertEquals(Byte.valueOf((byte) 123), kdeser.deserializeKey("123", defaultContext));
        // Test Jackson-804 range up to 255 inclusive
        assertEquals(Byte.valueOf((byte) -128), kdeser.deserializeKey("-128", defaultContext));
        assertEquals(Byte.valueOf((byte) -1), kdeser.deserializeKey("255", defaultContext));
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testDeserializeKey_ByteOverflowHigh() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Byte.class);
        kdeser.deserializeKey("256", defaultContext);
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testDeserializeKey_ByteOverflowLow() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Byte.class);
        kdeser.deserializeKey("-129", defaultContext);
    }

    @Test
    public void testDeserializeKey_ShortValidAndBoundary() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Short.class);
        assertEquals(Short.valueOf((short) 32767), kdeser.deserializeKey("32767", defaultContext));
        assertEquals(Short.valueOf((short) -32768), kdeser.deserializeKey("-32768", defaultContext));
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testDeserializeKey_ShortOverflow() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Short.class);
        kdeser.deserializeKey("32768", defaultContext);
    }

    @Test
    public void testDeserializeKey_CharacterValid() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Character.class);
        assertEquals(Character.valueOf('A'), kdeser.deserializeKey("A", defaultContext));
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testDeserializeKey_CharacterInvalidLength() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Character.class);
        kdeser.deserializeKey("AB", defaultContext);
    }

    @Test
    public void testDeserializeKey_IntegerAndLong() throws Exception {
        StdKeyDeserializer intDeser = StdKeyDeserializer.forType(Integer.class);
        assertEquals(12345, intDeser.deserializeKey("12345", defaultContext));

        StdKeyDeserializer longDeser = StdKeyDeserializer.forType(Long.class);
        assertEquals(123456789L, longDeser.deserializeKey("123456789", defaultContext));
    }

    @Test
    public void testDeserializeKey_FloatAndDouble() throws Exception {
        StdKeyDeserializer floatDeser = StdKeyDeserializer.forType(Float.class);
        assertEquals(12.34f, (Float) floatDeser.deserializeKey("12.34", defaultContext), 0.001f);

        StdKeyDeserializer doubleDeser = StdKeyDeserializer.forType(Double.class);
        assertEquals(123.456d, (Double) doubleDeser.deserializeKey("123.456", defaultContext), 0.001d);
    }

    @Test
    public void testDeserializeKey_UUID_URI_URL() throws Exception {
        StdKeyDeserializer uuidDeser = StdKeyDeserializer.forType(UUID.class);
        String uuidStr = "12345678-1234-1234-1234-123456789abc";
        assertEquals(UUID.fromString(uuidStr), uuidDeser.deserializeKey(uuidStr, defaultContext));

        StdKeyDeserializer uriDeser = StdKeyDeserializer.forType(URI.class);
        assertEquals(URI.create("http://example.com"), uriDeser.deserializeKey("http://example.com", defaultContext));

        StdKeyDeserializer urlDeser = StdKeyDeserializer.forType(URL.class);
        assertEquals(new URL("http://example.com"), urlDeser.deserializeKey("http://example.com", defaultContext));
    }

    @Test
    public void testDeserializeKey_LocaleAndCurrency() throws Exception {
        StdKeyDeserializer localeDeser = StdKeyDeserializer.forType(Locale.class);
        assertEquals(Locale.US, localeDeser.deserializeKey("en_US", defaultContext));

        StdKeyDeserializer currencyDeser = StdKeyDeserializer.forType(Currency.class);
        assertEquals(Currency.getInstance("USD"), currencyDeser.deserializeKey("USD", defaultContext));
    }

    @Test
    public void testDeserializeKey_Class() throws Exception {
        StdKeyDeserializer classDeser = StdKeyDeserializer.forType(Class.class);
        assertEquals(String.class, classDeser.deserializeKey("java.lang.String", defaultContext));
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testDeserializeKey_ClassInvalid() throws Exception {
        StdKeyDeserializer classDeser = StdKeyDeserializer.forType(Class.class);
        classDeser.deserializeKey("non.existent.ClassXYZ", defaultContext);
    }
}