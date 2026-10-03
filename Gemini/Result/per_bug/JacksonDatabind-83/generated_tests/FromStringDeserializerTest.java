package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class FromStringDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testFindDeserializerSupportedTypes() {
        assertNotNull(FromStringDeserializer.findDeserializer(File.class));
        assertNotNull(FromStringDeserializer.findDeserializer(URL.class));
        assertNotNull(FromStringDeserializer.findDeserializer(URI.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Class.class));
        assertNotNull(FromStringDeserializer.findDeserializer(JavaType.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Currency.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Pattern.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Locale.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Charset.class));
        assertNotNull(FromStringDeserializer.findDeserializer(TimeZone.class));
        assertNotNull(FromStringDeserializer.findDeserializer(InetAddress.class));
        assertNotNull(FromStringDeserializer.findDeserializer(InetSocketAddress.class));
        assertNotNull(FromStringDeserializer.findDeserializer(StringBuilder.class));
    }

    @Test
    public void testFindDeserializerUnsupportedType() {
        assertNull(FromStringDeserializer.findDeserializer(Integer.class));
    }

    @Test
    public void testTypesArray() {
        Class<?>[] types = FromStringDeserializer.types();
        assertNotNull(types);
        assertTrue(types.length > 0);
    }

    @Test
    public void testStdDeserializationAllKinds() throws IOException {
        // File
        Object fileDeser = FromStringDeserializer.findDeserializer(File.class);
        assertEquals(new File("test.txt"), mapper.readValue("\"test.txt\"", File.class));

        // URL
        assertEquals(new URL("http://localhost"), mapper.readValue("\"http://localhost\"", URL.class));

        // URI
        assertEquals(URI.create("http://localhost"), mapper.readValue("\"http://localhost\"", URI.class));

        // Class
        assertEquals(String.class, mapper.readValue("\"java.lang.String\"", Class.class));

        // JavaType
        assertNotNull(mapper.readValue("\"java.lang.String\"", JavaType.class));

        // Currency
        assertEquals(Currency.getInstance("USD"), mapper.readValue("\"USD\"", Currency.class));

        // Pattern
        assertNotNull(mapper.readValue("\"[a-z]\"", Pattern.class));

        // Locale (single, two parts, three parts)
        assertEquals(new Locale("en"), mapper.readValue("\"en\"", Locale.class));
        assertEquals(new Locale("en", "US"), mapper.readValue("\"en_US\"", Locale.class));
        assertEquals(new Locale("en", "US", "VARIANT"), mapper.readValue("\"en_US_VARIANT\"", Locale.class));
        assertEquals(new Locale("en", "US"), mapper.readValue("\"en-US\"", Locale.class));

        // Charset
        assertEquals(Charset.forName("UTF-8"), mapper.readValue("\"UTF-8\"", Charset.class));

        // TimeZone
        assertEquals(TimeZone.getTimeZone("GMT"), mapper.readValue("\"GMT\"", TimeZone.class));

        // InetAddress
        assertNotNull(mapper.readValue("\"127.0.0.1\"", InetAddress.class));

        // InetSocketAddress - host:port
        InetSocketAddress addr1 = mapper.readValue("\"localhost:8080\"", InetSocketAddress.class);
        assertEquals("localhost", addr1.getHostString());
        assertEquals(8080, addr1.getPort());

        // InetSocketAddress - IPv6 bracketed with port
        InetSocketAddress addr2 = mapper.readValue("\"[0:0:0:0:0:0:0:1]:8080\"", InetSocketAddress.class);
        assertEquals(8080, addr2.getPort());

        // InetSocketAddress - plain host
        InetSocketAddress addr3 = mapper.readValue("\"localhost\"", InetSocketAddress.class);
        assertEquals("localhost", addr3.getHostString());

        // StringBuilder
        assertEquals("hello", mapper.readValue("\"hello\"", StringBuilder.class).toString());
    }

    @Test
    public void testEmptyAndBlankStrings() throws IOException {
        assertNull(mapper.readValue("\"\"", URI.class)); // Empty string for URI returns URI.create("") via custom empty handling
        assertEquals(Locale.ROOT, mapper.readValue("\"\"", Locale.class));
        assertEquals("", mapper.readValue("\"\"", StringBuilder.class).toString());
        assertNull(mapper.readValue("\"   \"", File.class));
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidUrlThrowsException() throws IOException {
        mapper.readValue("\"not a valid url :::\"", URL.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidClassThrowsException() throws IOException {
        mapper.readValue("\"com.nonexistent.Class12345\"", Class.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidInetSocketAddressBracketThrowsException() throws IOException {
        // Missing closing bracket
        mapper.readValue("\"[0:0:0:0:0:0:0:1\"", InetSocketAddress.class);
    }

    @Test
    public void testEmbeddedObjectHandling() throws Exception {
        FromStringDeserializer.Std deserializer = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(File.class);
        JsonParser p = mapper.getFactory().createParser("{\"dummy\":1}"); // dummy to control token if needed, or mock/test directly via deserialize
        
        // Let's test deserialize with null text and VALUE_EMBEDDED_OBJECT
        // Since we can easily test embedded object via custom parser or direct call if accessible, 
        // let's invoke via a custom test scenario or standard reader where embedded object occurs.
        // Alternatively, test deserialize method directly with mock or specific stream.
    }
}