package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class FromStringDeserializerTest {

    // ================================================================
    // findDeserializer()
    // ================================================================

    @Test
    public void testFindDeserializer_AllKnownTypes() {
        assertKind(File.class, FromStringDeserializer.Std.STD_FILE);
        assertKind(URL.class, FromStringDeserializer.Std.STD_URL);
        assertKind(URI.class, FromStringDeserializer.Std.STD_URI);
        assertKind(Class.class, FromStringDeserializer.Std.STD_CLASS);
        assertKind(JavaType.class, FromStringDeserializer.Std.STD_JAVA_TYPE);
        assertKind(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        assertKind(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        assertKind(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        assertKind(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        assertKind(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        assertKind(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        assertKind(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
    }

    private void assertKind(Class<?> type, int expectedKind) {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(type);
        assertNotNull("deserializer for " + type, std);
        assertEquals(expectedKind, std._kind);
    }

    @Test
    public void testFindDeserializer_UnknownType_ReturnsNull() {
        assertNull(FromStringDeserializer.findDeserializer(String.class));
    }

    // ================================================================
    // Std._deserialize() - ทดสอบตรงทีละ kind
    // ================================================================

    @Test
    public void testDeserialize_File() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        Object result = d._deserialize("/tmp/test.txt", mock(DeserializationContext.class));
        assertEquals(new File("/tmp/test.txt"), result);
    }

    @Test
    public void testDeserialize_URL_Valid() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(URL.class, FromStringDeserializer.Std.STD_URL);
        Object result = d._deserialize("http://example.com", mock(DeserializationContext.class));
        assertEquals(new URL("http://example.com"), result);
    }

    @Test(expected = MalformedURLException.class)
    public void testDeserialize_URL_Malformed_Throws() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(URL.class, FromStringDeserializer.Std.STD_URL);
        d._deserialize("no-protocol-string", mock(DeserializationContext.class));
    }

    @Test
    public void testDeserialize_URI() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(URI.class, FromStringDeserializer.Std.STD_URI);
        Object result = d._deserialize("http://example.com/path", mock(DeserializationContext.class));
        assertEquals(URI.create("http://example.com/path"), result);
    }

    @Test
    public void testDeserialize_Class_Success() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Class.class, FromStringDeserializer.Std.STD_CLASS);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.findClass("java.lang.String")).thenReturn((Class) String.class);
        Object result = d._deserialize("java.lang.String", ctxt);
        assertEquals(String.class, result);
    }

    @Test
    public void testDeserialize_Class_FindClassFails_ThrowsInstantiationException() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Class.class, FromStringDeserializer.Std.STD_CLASS);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.findClass(anyString())).thenThrow(new ClassNotFoundException("nope"));
        JsonMappingException ex = new JsonMappingException("cannot instantiate");
        when(ctxt.instantiationException(any(Class.class), any(Throwable.class))).thenReturn(ex);
        try {
            d._deserialize("no.such.Class", ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(ex, e);
        }
    }

    @Test
    public void testDeserialize_JavaType() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(JavaType.class, FromStringDeserializer.Std.STD_JAVA_TYPE);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.getTypeFactory()).thenReturn(TypeFactory.defaultInstance());
        Object result = d._deserialize("java.lang.String", ctxt);
        assertTrue(result instanceof JavaType);
        assertEquals(String.class, ((JavaType) result).getRawClass());
    }

    @Test
    public void testDeserialize_Currency_Valid() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        Object result = d._deserialize("USD", mock(DeserializationContext.class));
        assertEquals(Currency.getInstance("USD"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_Currency_Invalid_Throws() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        d._deserialize("NOT_A_CURRENCY", mock(DeserializationContext.class));
    }

    @Test
    public void testDeserialize_Pattern_Valid() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        Object result = d._deserialize("^[a-z]+$", mock(DeserializationContext.class));
        assertTrue(result instanceof Pattern);
        assertEquals("^[a-z]+$", ((Pattern) result).pattern());
    }

    @Test(expected = PatternSyntaxException.class)
    public void testDeserialize_Pattern_Invalid_Throws() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        d._deserialize("[", mock(DeserializationContext.class)); // malformed regex -> PatternSyntaxException (IAE subtype)
    }

    @Test
    public void testDeserialize_Locale_SinglePart() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        Object result = d._deserialize("en", mock(DeserializationContext.class));
        assertEquals(new Locale("en"), result);
    }

    @Test
    public void testDeserialize_Locale_TwoParts() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        Object result = d._deserialize("en_US", mock(DeserializationContext.class));
        assertEquals(new Locale("en", "US"), result);
    }

    @Test
    public void testDeserialize_Locale_ThreeParts() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        Object result = d._deserialize("no_NO_NY", mock(DeserializationContext.class));
        assertEquals(new Locale("no", "NO", "NY"), result);
    }

    @Test
    public void testDeserialize_Charset_Valid() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        Object result = d._deserialize("UTF-8", mock(DeserializationContext.class));
        assertEquals(Charset.forName("UTF-8"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_Charset_Invalid_Throws() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        d._deserialize("this-is-not-a-valid-charset-xyz", mock(DeserializationContext.class));
    }

    @Test
    public void testDeserialize_TimeZone() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        Object result = d._deserialize("UTC", mock(DeserializationContext.class));
        assertEquals(TimeZone.getTimeZone("UTC"), result);
    }

    @Test
    public void testDeserialize_InetAddress() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        // ใช้ literal IP เพื่อไม่พึ่ง DNS จริง
        Object result = d._deserialize("127.0.0.1", mock(DeserializationContext.class));
        assertEquals(InetAddress.getByName("127.0.0.1"), result);
    }

    // ---------- STD_INET_SOCKET_ADDRESS: ครอบทุก sub-branch ----------

    @Test
    public void testDeserialize_InetSocketAddress_BracketedIPv6_WithPort() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        Object result = d._deserialize("[::1]:8080", mock(DeserializationContext.class));
        assertTrue(result instanceof InetSocketAddress);
        assertEquals(8080, ((InetSocketAddress) result).getPort());
    }

    @Test
    public void testDeserialize_InetSocketAddress_BracketedIPv6_NoPort() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        Object result = d._deserialize("[::1]", mock(DeserializationContext.class));
        assertTrue(result instanceof InetSocketAddress);
        assertEquals(0, ((InetSocketAddress) result).getPort()); // ternary: j==-1 -> port=0
    }

    @Test(expected = InvalidFormatException.class)
    public void testDeserialize_InetSocketAddress_BracketedIPv6_MissingClosingBracket_Throws() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        d._deserialize("[::1", mock(DeserializationContext.class)); // ไม่มี ']' ปิด
    }

    @Test
    public void testDeserialize_InetSocketAddress_HostPort() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        Object result = d._deserialize("192.168.1.1:8080", mock(DeserializationContext.class));
        InetSocketAddress addr = (InetSocketAddress) result;
        assertEquals(8080, addr.getPort());
    }

    @Test
    public void testDeserialize_InetSocketAddress_UnbracketedIPv6_MultiColon_NoPort() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        Object result = d._deserialize("2001:db8::1", mock(DeserializationContext.class));
        InetSocketAddress addr = (InetSocketAddress) result;
        assertEquals(0, addr.getPort());
    }

    @Test
    public void testDeserialize_InetSocketAddress_PlainHost_NoColon_NoPort() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        Object result = d._deserialize("192.168.1.2", mock(DeserializationContext.class));
        InetSocketAddress addr = (InetSocketAddress) result;
        assertEquals(0, addr.getPort());
    }

    // ================================================================
    // Std._deserializeFromEmptyString()
    // ================================================================

    @Test
    public void testDeserializeFromEmptyString_URI_ReturnsEmptyURI() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(URI.class, FromStringDeserializer.Std.STD_URI);
        Object result = d._deserializeFromEmptyString();
        assertEquals(URI.create(""), result);
    }

    @Test
    public void testDeserializeFromEmptyString_NonURI_ReturnsNull() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        assertNull(d._deserializeFromEmptyString());
    }

    // ================================================================
    // _deserializeEmbedded() default behaviour
    // ================================================================

    @Test
    public void testDeserializeEmbedded_DefaultThrows() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonMappingException ex = new JsonMappingException("embedded not supported");
        when(ctxt.mappingException(anyString(), any(), any())).thenReturn(ex);
        try {
            d._deserializeEmbedded(Integer.valueOf(5), ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(ex, e);
        }
    }

    // ================================================================
    // deserialize(JsonParser, DeserializationContext) - main flow
    // ================================================================

    @Test
    public void testDeserialize_StartArray_UnwrapEnabled_SingleValue_Success() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        when(jp.getCurrentToken())
            .thenReturn(JsonToken.START_ARRAY)   // outer check
            .thenReturn(JsonToken.VALUE_STRING);  // inner (recursive) check
        when(jp.getValueAsString()).thenReturn("/tmp/single.txt");
        when(jp.nextToken())
            .thenReturn(JsonToken.VALUE_STRING) // ก่อนเรียก recursive (ค่านี้ไม่ถูกใช้ตรง ๆ)
            .thenReturn(JsonToken.END_ARRAY);   // หลัง recursive -> ตรวจ END_ARRAY

        Object result = d.deserialize(jp, ctxt);
        assertEquals(new File("/tmp/single.txt"), result);
    }

    @Test
    public void testDeserialize_StartArray_UnwrapEnabled_MoreThanOneValue_Throws() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        when(jp.getCurrentToken())
            .thenReturn(JsonToken.START_ARRAY)
            .thenReturn(JsonToken.VALUE_STRING);
        when(jp.getValueAsString()).thenReturn("/tmp/one.txt");
        when(jp.nextToken())
            .thenReturn(JsonToken.VALUE_STRING)
            .thenReturn(JsonToken.VALUE_STRING); // ไม่ใช่ END_ARRAY -> มีค่ามากกว่า 1

        JsonMappingException ex = new JsonMappingException("more than one value in array");
        when(ctxt.wrongTokenException(any(JsonParser.class), eq(JsonToken.END_ARRAY), anyString()))
            .thenReturn(ex);

        try {
            d.deserialize(jp, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(ex, e);
        }
    }

    @Test
    public void testDeserialize_StartArray_UnwrapDisabled_FallsThroughToMappingException() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(false);
        when(jp.getCurrentToken()).thenReturn(JsonToken.START_ARRAY); // ทุกครั้งที่เรียก
        when(jp.getValueAsString()).thenReturn(null);

        JsonMappingException ex = new JsonMappingException("cannot map array");
        when(ctxt.mappingException(eq(File.class))).thenReturn(ex);

        try {
            d.deserialize(jp, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(ex, e);
        }
    }

    @Test
    public void testDeserialize_TextValid() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(jp.getValueAsString()).thenReturn("/tmp/valid.txt");

        Object result = d.deserialize(jp, ctxt);
        assertEquals(new File("/tmp/valid.txt"), result);
    }

    @Test
    public void testDeserialize_TextEmptyString_ReturnsFromEmptyStringHandler() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(jp.getValueAsString()).thenReturn(""); // length()==0 -> true branch (short-circuit)

        Object result = d.deserialize(jp, ctxt);
        assertNull(result); // FILE ไม่ override -> null
    }

    @Test
    public void testDeserialize_TextWhitespaceOnly_TrimsToEmpty() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(jp.getValueAsString()).thenReturn("   "); // length()!=0 แต่ trim() แล้ว==0

        Object result = d.deserialize(jp, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserialize_TextInvalid_IllegalArgumentException_WithMessage() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(jp.getValueAsString()).thenReturn("["); // malformed regex -> PatternSyntaxException (IAE)

        JsonMappingException ex = new JsonMappingException("bad pattern");
        when(ctxt.weirdStringException(eq("["), eq(Pattern.class), anyString())).thenReturn(ex);

        try {
            d.deserialize(jp, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(ex, e);
            assertNotNull(e.getCause());
            assertTrue(e.getCause() instanceof PatternSyntaxException);
        }
    }

    @Test
    public void testDeserialize_EmbeddedObject_Null_ReturnsNull() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(jp.getValueAsString()).thenReturn(null);
        when(jp.getEmbeddedObject()).thenReturn(null);

        Object result = d.deserialize(jp, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserialize_EmbeddedObject_Assignable_ReturnedAsIs() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        File embedded = new File("/tmp/embedded.txt");
        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(jp.getValueAsString()).thenReturn(null);
        when(jp.getEmbeddedObject()).thenReturn(embedded);

        Object result = d.deserialize(jp, ctxt);
        assertSame(embedded, result);
    }

    @Test
    public void testDeserialize_EmbeddedObject_NotAssignable_ThrowsViaDeserializeEmbedded() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        Integer embedded = Integer.valueOf(42); // ไม่ใช่ File -> not assignable
        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(jp.getValueAsString()).thenReturn(null);
        when(jp.getEmbeddedObject()).thenReturn(embedded);

        JsonMappingException ex = new JsonMappingException("cannot convert embedded");
        when(ctxt.mappingException(anyString(), any(), any())).thenReturn(ex);

        try {
            d.deserialize(jp, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(ex, e);
        }
    }

    @Test
    public void testDeserialize_UnknownToken_NoTextNoEmbedded_ThrowsMappingException() throws Exception {
        FromStringDeserializer.Std d = new FromStringDeserializer.Std(File.class, FromStringDeserializer.Std.STD_FILE);
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);
        when(jp.getValueAsString()).thenReturn(null);

        JsonMappingException ex = new JsonMappingException("no mapping for token");
        when(ctxt.mappingException(eq(File.class))).thenReturn(ex);

        try {
            d.deserialize(jp, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(ex, e);
        }
    }
}
