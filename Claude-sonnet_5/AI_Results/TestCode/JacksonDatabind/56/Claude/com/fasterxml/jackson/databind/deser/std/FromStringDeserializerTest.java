package com.fasterxml.jackson.databind.deser.std.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for {@link FromStringDeserializer} and its inner {@link Std} class.
 *
 * หมายเหตุ: ใช้ Mockito mock สำหรับ JsonParser / DeserializationContext เนื่องจาก
 * เป็น abstract class/interface ของ jackson-core/jackson-databind ที่ compile
 * อยู่ในโปรเจกต์ (ไม่ใช่ jar dependency แยก) ฟังก์ชันที่ถูก stub อ้างอิงตาม
 * การเรียกใช้จริงในซอร์สโค้ดที่ให้มาเท่านั้น
 */
public class FromStringDeserializerTest {

    private JsonParser parser;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        parser = mock(JsonParser.class);
        ctxt = mock(DeserializationContext.class);
    }

    // ------------------------------------------------------------------
    // findDeserializer() - if/else chain
    // ------------------------------------------------------------------

    @Test
    public void testFindDeserializer_AllKnownTypes() {
        Class<?>[] types = FromStringDeserializer.types();
        for (Class<?> t : types) {
            Std d = FromStringDeserializer.findDeserializer(t);
            assertNotNull("deserializer should not be null for " + t, d);
            assertEquals(t, d.handledType());
        }
    }

    @Test
    public void testFindDeserializer_UnknownType_ReturnsNull() {
        // ประเภทที่ไม่อยู่ใน if/else chain -> else branch -> return null
        Std d = FromStringDeserializer.findDeserializer(Integer.class);
        assertNull(d);
    }

    // ------------------------------------------------------------------
    // deserialize() - START_ARRAY branch
    // ------------------------------------------------------------------

    @Test
    public void testDeserialize_StartArray_UnwrapEnabled_Success() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);

        // 1st getCurrentToken() call (outer) -> START_ARRAY
        // 2nd call onward (inner recursive call) -> VALUE_STRING
        when(parser.getCurrentToken())
                .thenReturn(JsonToken.START_ARRAY, JsonToken.VALUE_STRING);
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        when(parser.getValueAsString()).thenReturn("test.txt");
        // 1st nextToken() -> advance into array, 2nd nextToken() -> END_ARRAY check
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);

        Object result = deser.deserialize(parser, ctxt);
        assertTrue(result instanceof File);
        assertEquals("test.txt", ((File) result).getPath());
    }

    @Test
    public void testDeserialize_StartArray_TooManyElements_ThrowsWrongTokenException() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);

        when(parser.getCurrentToken())
                .thenReturn(JsonToken.START_ARRAY, JsonToken.VALUE_STRING);
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(true);
        when(parser.getValueAsString()).thenReturn("test.txt");
        // 2nd nextToken() ไม่ใช่ END_ARRAY -> ต้อง throw wrongTokenException
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.VALUE_STRING);

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.wrongTokenException(eq(parser), eq(JsonToken.END_ARRAY), anyString()))
                .thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
    }

    @Test
    public void testDeserialize_StartArray_UnwrapDisabled_FallsThroughToMappingException() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);

        // isEnabled() = false -> short-circuit condition ล้มเหลว -> ไม่เข้า array-branch
        when(parser.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        when(ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)).thenReturn(false);
        when(parser.getValueAsString()).thenReturn(null); // START_ARRAY ไม่มี String repr

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.mappingException(File.class)).thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
    }

    // ------------------------------------------------------------------
    // deserialize() - text handling branches
    // ------------------------------------------------------------------

    @Test
    public void testDeserialize_NormalText_Success() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("path/to/file.txt");

        Object result = deser.deserialize(parser, ctxt);
        assertTrue(result instanceof File);
        assertEquals("path/to/file.txt", ((File) result).getPath());
    }

    @Test
    public void testDeserialize_EmptyString_ReturnsNull_ForDefaultKind() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("");

        Object result = deser.deserialize(parser, ctxt);
        assertNull(result); // default _deserializeFromEmptyString() -> null
    }

    @Test
    public void testDeserialize_WhitespaceOnlyString_TrimsToEmpty() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("   ");

        Object result = deser.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserialize_EmptyString_URI_ReturnsEmptyURI() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(URI.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("");

        Object result = deser.deserialize(parser, ctxt);
        assertEquals(URI.create(""), result);
    }

    @Test
    public void testDeserialize_EmptyString_Locale_ReturnsRoot() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(Locale.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("");

        Object result = deser.deserialize(parser, ctxt);
        assertEquals(Locale.ROOT, result);
    }

    @Test
    public void testDeserialize_InvalidText_IllegalArgumentException_WrapsIntoWeirdStringException() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(Currency.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("NOT_A_CURRENCY_CODE");

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.weirdStringException(eq("NOT_A_CURRENCY_CODE"), eq(Currency.class), anyString()))
                .thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
        verify(fakeEx).initCause(any(Throwable.class));
    }

    // ------------------------------------------------------------------
    // deserialize() - VALUE_EMBEDDED_OBJECT branches
    // ------------------------------------------------------------------

    @Test
    public void testDeserialize_EmbeddedObject_Null_ReturnsNull() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getEmbeddedObject()).thenReturn(null);

        Object result = deser.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserialize_EmbeddedObject_Assignable_ReturnsAsIs() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);
        File embedded = new File("already.txt");
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getEmbeddedObject()).thenReturn(embedded);

        Object result = deser.deserialize(parser, ctxt);
        assertSame(embedded, result);
    }

    @Test
    public void testDeserialize_EmbeddedObject_NotAssignable_ThrowsMappingException() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);
        Object embedded = new Object(); // ไม่ใช่ File -> not assignable
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getEmbeddedObject()).thenReturn(embedded);

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.mappingException(anyString(), any(), any())).thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception via _deserializeEmbedded default impl");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
    }

    // ------------------------------------------------------------------
    // deserialize() - fallback (neither text nor embedded)
    // ------------------------------------------------------------------

    @Test
    public void testDeserialize_NoTextNoEmbedded_ThrowsMappingException() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);
        when(parser.getValueAsString()).thenReturn(null);

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.mappingException(File.class)).thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
    }

    // ------------------------------------------------------------------
    // Std._deserialize() - switch-case branches, ทดสอบผ่าน deserialize()
    // ------------------------------------------------------------------

    @Test
    public void testDeserialize_Kind_File_Success() throws IOException {
        assertSuccess(File.class, "some/path.txt", result -> {
            assertTrue(result instanceof File);
            assertEquals("some/path.txt", ((File) result).getPath());
        });
    }

    @Test
    public void testDeserialize_Kind_URL_Success() throws IOException {
        assertSuccess(URL.class, "http://example.com", result -> {
            assertTrue(result instanceof URL);
            assertEquals("http://example.com", result.toString());
        });
    }

    @Test
    public void testDeserialize_Kind_URL_Malformed_PropagatesIOException() throws IOException {
        // MalformedURLException เป็น IOException ไม่ใช่ IllegalArgumentException
        // จึงไม่ถูกจับใน catch(IllegalArgumentException) -> ต้อง propagate ตรง ๆ
        Std deser = FromStringDeserializer.findDeserializer(URL.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("not a valid protocol://x");

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected IOException to propagate");
        } catch (IOException e) {
            // คาดหวังว่าเป็น MalformedURLException (ไม่ถูก wrap)
            assertTrue(e instanceof java.net.MalformedURLException);
        }
    }

    @Test
    public void testDeserialize_Kind_URI_Success() throws IOException {
        assertSuccess(URI.class, "http://example.com/path", result -> {
            assertEquals(URI.create("http://example.com/path"), result);
        });
    }

    @Test
    public void testDeserialize_Kind_URI_Invalid_TriggersWeirdStringException() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(URI.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        // space ที่ไม่ escape ทำให้ URI.create() throw IllegalArgumentException
        when(parser.getValueAsString()).thenReturn("http:// bad uri");

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.weirdStringException(anyString(), eq(URI.class), anyString()))
                .thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
    }

    @Test
    public void testDeserialize_Kind_Class_Success() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(Class.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("java.lang.String");
        when(ctxt.findClass("java.lang.String")).thenReturn((Class) String.class);

        Object result = deser.deserialize(parser, ctxt);
        assertEquals(String.class, result);
    }

    @Test
    public void testDeserialize_Kind_Class_NotFound_PropagatesInstantiationException() throws Exception {
        Std deser = FromStringDeserializer.findDeserializer(Class.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("no.such.Class");
        when(ctxt.findClass("no.such.Class")).thenThrow(new ClassNotFoundException("no.such.Class"));

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.instantiationException(eq(Class.class), any(Throwable.class))).thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception to propagate directly (not IllegalArgumentException wrapping)");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
    }

    @Test
    public void testDeserialize_Kind_JavaType_Success() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(JavaType.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("java.lang.String");
        when(ctxt.getTypeFactory()).thenReturn(TypeFactory.defaultInstance());

        Object result = deser.deserialize(parser, ctxt);
        assertTrue(result instanceof JavaType);
        assertEquals(String.class, ((JavaType) result).getRawClass());
    }

    @Test
    public void testDeserialize_Kind_Currency_Success() throws IOException {
        assertSuccess(Currency.class, "USD", result -> {
            assertEquals(Currency.getInstance("USD"), result);
        });
    }

    @Test
    public void testDeserialize_Kind_Pattern_Success() throws IOException {
        assertSuccess(Pattern.class, "^[a-z]+$", result -> {
            assertTrue(result instanceof Pattern);
            assertEquals("^[a-z]+$", ((Pattern) result).pattern());
        });
    }

    @Test
    public void testDeserialize_Kind_Pattern_Invalid_TriggersWeirdStringException() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(Pattern.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("["); // unmatched bracket -> PatternSyntaxException (IAE subtype)

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.weirdStringException(anyString(), eq(Pattern.class), anyString()))
                .thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
    }

    @Test
    public void testDeserialize_Kind_Locale_NoUnderscore() throws IOException {
        assertSuccess(Locale.class, "en", result -> {
            assertEquals(new Locale("en"), result);
        });
    }

    @Test
    public void testDeserialize_Kind_Locale_OneUnderscore() throws IOException {
        assertSuccess(Locale.class, "en_US", result -> {
            assertEquals(new Locale("en", "US"), result);
        });
    }

    @Test
    public void testDeserialize_Kind_Locale_TwoUnderscores() throws IOException {
        assertSuccess(Locale.class, "en_US_WIN", result -> {
            assertEquals(new Locale("en", "US", "WIN"), result);
        });
    }

    @Test
    public void testDeserialize_Kind_Charset_Success() throws IOException {
        assertSuccess(Charset.class, "UTF-8", result -> {
            assertEquals(Charset.forName("UTF-8"), result);
        });
    }

    @Test
    public void testDeserialize_Kind_Charset_Invalid_TriggersWeirdStringException() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(Charset.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("!!not-a-charset!!");

        JsonMappingException fakeEx = mock(JsonMappingException.class);
        when(ctxt.weirdStringException(anyString(), eq(Charset.class), anyString()))
                .thenReturn(fakeEx);

        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception");
        } catch (JsonMappingException e) {
            assertSame(fakeEx, e);
        }
    }

    @Test
    public void testDeserialize_Kind_TimeZone_Success() throws IOException {
        assertSuccess(TimeZone.class, "GMT", result -> {
            assertEquals(TimeZone.getTimeZone("GMT"), result);
        });
    }

    @Test
    public void testDeserialize_Kind_InetAddress_Success() throws IOException {
        assertSuccess(java.net.InetAddress.class, "127.0.0.1", result -> {
            assertTrue(result instanceof java.net.InetAddress);
            assertEquals("127.0.0.1", ((java.net.InetAddress) result).getHostAddress());
        });
    }

    @Test
    public void testDeserialize_Kind_InetSocketAddress_BracketedIPv6WithPort_Success() throws IOException {
        assertSuccess(InetSocketAddress.class, "[::1]:8080", result -> {
            assertTrue(result instanceof InetSocketAddress);
            assertEquals(8080, ((InetSocketAddress) result).getPort());
        });
    }

    @Test
    public void testDeserialize_Kind_InetSocketAddress_BracketedMissingClosingBracket_Throws() throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getValueAsString()).thenReturn("[::1"); // ไม่มี ']'
        when(ctxt.getParser()).thenReturn(parser);

        // InvalidFormatException extends JsonMappingException ซึ่งไม่ใช่
        // IllegalArgumentException -> ต้อง propagate ตรง ๆ (ไม่ถูก weirdStringException wrap)
        try {
            deser.deserialize(parser, ctxt);
            fail("Expected IOException (InvalidFormatException) to propagate");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserialize_Kind_InetSocketAddress_HostPort_Success() throws IOException {
        assertSuccess(InetSocketAddress.class, "localhost:8080", result -> {
            assertTrue(result instanceof InetSocketAddress);
            assertEquals(8080, ((InetSocketAddress) result).getPort());
        });
    }

    @Test
    public void testDeserialize_Kind_InetSocketAddress_HostOnly_Success() throws IOException {
        assertSuccess(InetSocketAddress.class, "localhost", result -> {
            assertTrue(result instanceof InetSocketAddress);
            assertEquals(0, ((InetSocketAddress) result).getPort());
        });
    }

    @Test
    public void testDeserialize_Kind_InetSocketAddress_UnbracketedMultiColon_Success() throws IOException {
        // มีมากกว่า 1 ':' และไม่มี '[' -> เข้า branch "host or unbracketed IPv6, without port"
        assertSuccess(InetSocketAddress.class, "2001:db8::1", result -> {
            assertTrue(result instanceof InetSocketAddress);
            assertEquals(0, ((InetSocketAddress) result).getPort());
        });
    }

    // ------------------------------------------------------------------
    // Helper
    // ------------------------------------------------------------------

    private interface ResultAssertion {
        void check(Object result);
    }

    private void assertSuccess(Class<?> targetType, String input, ResultAssertion assertion) throws IOException {
        Std deser = FromStringDeserializer.findDeserializer(targetType);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext c = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(p.getValueAsString()).thenReturn(input);

        Object result = deser.deserialize(p, c);
        assertNotNull(result);
        assertion.check(result);
    }
}
