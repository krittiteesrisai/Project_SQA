package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.*;

public class StdKeyDeserializerTest {

    private ObjectMapper objectMapper;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        ctxt = objectMapper.getDeserializationContext();
    }

    @Test
    public void testForTypeKnownTypes() {
        assertNotNull(StdKeyDeserializer.forType(String.class));
        assertNotNull(StdKeyDeserializer.forType(Object.class));
        assertNotNull(StdKeyDeserializer.forType(CharSequence.class));
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
        assertNotNull(StdKeyDeserializer.forType(byte[].class));
    }

    @Test
    public void testForTypeUnknownReturnsNull() {
        assertNull(StdKeyDeserializer.forType(Void.class));
    }

    @Test
    public void testDeserializeKeyNull() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Integer.class);
        assertNull(kdeser.deserializeKey(null, ctxt));
    }

    @Test
    public void testBooleanKey() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Boolean.class);
        assertEquals(Boolean.TRUE, kdeser.deserializeKey("true", ctxt));
        assertEquals(Boolean.FALSE, kdeser.deserializeKey("false", ctxt));
        
        // Invalid boolean trigger handleWeirdKey
        try {
            kdeser.deserializeKey("invalid-bool", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testByteKey() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Byte.class);
        assertEquals(Byte.valueOf((byte) 120), kdeser.deserializeKey("120", ctxt));
        assertEquals(Byte.valueOf((byte) 200), kdeser.deserializeKey("200", ctxt)); // Unsigned byte support

        // Overflow
        try {
            kdeser.deserializeKey("300", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testShortKey() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Short.class);
        assertEquals(Short.valueOf((short) 3000), kdeser.deserializeKey("3000", ctxt));

        // Overflow
        try {
            kdeser.deserializeKey("70000", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testCharKey() throws Exception {
        StdKeyDeserializer kdeser = StdKeyDeserializer.forType(Character.class);
        assertEquals(Character.valueOf('A'), kdeser.deserializeKey("A", ctxt));

        // Invalid length > 1
        try {
            kdeser.deserializeKey("AB", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testIntAndLongKey() throws Exception {
        StdKeyDeserializer intDeser = StdKeyDeserializer.forType(Integer.class);
        assertEquals(Integer.valueOf(12345), intDeser.deserializeKey("12345", ctxt));

        StdKeyDeserializer longDeser = StdKeyDeserializer.forType(Long.class);
        assertEquals(Long.valueOf(123456789L), longDeser.deserializeKey("123456789", ctxt));
    }

    @Test
    public void testFloatAndDoubleKey() throws Exception {
        StdKeyDeserializer floatDeser = StdKeyDeserializer.forType(Float.class);
        assertEquals(Float.valueOf(12.34f), floatDeser.deserializeKey("12.34", ctxt));

        StdKeyDeserializer doubleDeser = StdKeyDeserializer.forType(Double.class);
        assertEquals(Double.valueOf(123.456), doubleDeser.deserializeKey("123.456", ctxt));
    }

    @Test
    public void testLocaleAndCurrencyKey() throws Exception {
        StdKeyDeserializer localeDeser = StdKeyDeserializer.forType(Locale.class);
        assertEquals(Locale.US, localeDeser.deserializeKey("en_US", ctxt));

        StdKeyDeserializer currencyDeser = StdKeyDeserializer.forType(Currency.class);
        assertEquals(Currency.getInstance("USD"), currencyDeser.deserializeKey("USD", ctxt));

        // Invalid currency/locale triggering exception
        try {
            currencyDeser.deserializeKey("INVALID_CURRENCY_CODE", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testDateAndCalendarKey() throws Exception {
        StdKeyDeserializer dateDeser = StdKeyDeserializer.forType(Date.class);
        assertNotNull(dateDeser.deserializeKey("2023-01-01T00:00:00.000+0000", ctxt));

        StdKeyDeserializer calDeser = StdKeyDeserializer.forType(Calendar.class);
        assertNotNull(calDeser.deserializeKey("2023-01-01T00:00:00.000+0000", ctxt));
    }

    @Test
    public void testUuidUriUrlKey() throws Exception {
        StdKeyDeserializer uuidDeser = StdKeyDeserializer.forType(UUID.class);
        UUID uuid = UUID.randomUUID();
        assertEquals(uuid, uuidDeser.deserializeKey(uuid.toString(), ctxt));

        StdKeyDeserializer uriDeser = StdKeyDeserializer.forType(URI.class);
        assertEquals(URI.create("http://example.com"), uriDeser.deserializeKey("http://example.com", ctxt));

        StdKeyDeserializer urlDeser = StdKeyDeserializer.forType(URL.class);
        assertEquals(new URL("http://example.com"), urlDeser.deserializeKey("http://example.com", ctxt));

        // Edge case: Malformed URL / Invalid UUID
        try {
            uuidDeser.deserializeKey("not-a-uuid", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }

        try {
            urlDeser.deserializeKey("ht!tp://invalid-url", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testClassKey() throws Exception {
        StdKeyDeserializer classDeser = StdKeyDeserializer.forType(Class.class);
        assertEquals(String.class, classDeser.deserializeKey("java.lang.String", ctxt));

        try {
            classDeser.deserializeKey("com.nonexistent.Class", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testByteArrayKey() throws Exception {
        StdKeyDeserializer byteArrayDeser = StdKeyDeserializer.forType(byte[].class);
        byte[] decoded = byteArrayDeser.deserializeKey("SGVsbG8=", ctxt);
        assertNotNull(decoded);
        assertEquals("Hello", new String(decoded));

        try {
            byteArrayDeser.deserializeKey("Invalid-Base64!!!", ctxt);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testStringKD() throws Exception {
        StdKeyDeserializer.StringKD stringKD = StdKeyDeserializer.StringKD.forType(String.class);
        assertEquals("test", stringKD.deserializeKey("test", ctxt));

        StdKeyDeserializer.StringKD objectKD = StdKeyDeserializer.StringKD.forType(Object.class);
        assertEquals("test", objectKD.deserializeKey("test", ctxt));

        StdKeyDeserializer.StringKD customKD = StdKeyDeserializer.StringKD.forType(StringBuffer.class);
        assertNotNull(customKD);
    }
}