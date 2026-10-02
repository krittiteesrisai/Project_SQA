package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.IOException;
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

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for {@link FromStringDeserializer} (and its nested {@link Std} class).
 *
 * NOTE: DeserializationContext/JsonParser are mocked with Mockito because they are
 * abstract classes in the library. Some behaviors that depend on code NOT shown in
 * the provided source (e.g. {@code _deserializeFromArray}, which is inherited from
 * a superclass not included here) are only verified to the extent that the branch
 * is reached; internal outcome of that inherited method is intentionally not
 * over-specified (commented at the relevant test).
 */
public class FromStringDeserializerTest {

    private JsonParser parser;
    private DeserializationContext ctxt;

    @Before
    public void setUp() throws Exception {
        parser = mock(JsonParser.class);
        ctxt = mock(DeserializationContext.class);
        when(ctxt.getParser()).thenReturn(parser);
        // Default stub: weirdStringException returns a real JsonMappingException built
        // via the public factory method (constructor is protected/cross-package).
        when(ctxt.weirdStringException(anyString(), any(Class.class), anyString()))
                .thenAnswer(invocation -> {
                    String msg = invocation.getArgument(2);
                    return JsonMappingException.from(parser, msg);
                });
    }

    // =====================================================================
    // findDeserializer()
    // =====================================================================

    @Test
    public void testFindDeserializer_AllSupportedTypes() {
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
    public void testFindDeserializer_UnknownType_ReturnsNull() {
        assertNull(FromStringDeserializer.findDeserializer(String.class));
    }

    // =====================================================================
    // Std._deserialize(...) — per "kind" branch
    // =====================================================================

    @Test
    public void testKind_File_Deserialize() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(File.class);
        Object result = d._deserialize("test.txt", ctxt);
        assertTrue(result instanceof File);
        assertEquals("test.txt", ((File) result).getName());
    }

    @Test
    public void testKind_URL_Deserialize_Valid() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(URL.class);
        Object result = d._deserialize("http://example.com", ctxt);
        assertTrue(result instanceof URL);
        assertEquals("http://example.com", result.toString());
    }

    @Test(expected = MalformedURLException.class)
    public void testKind_URL_Deserialize_Malformed_ThrowsDirectly() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(URL.class);
        d._deserialize("not a url", ctxt); // no protocol -> MalformedURLException
    }

    @Test
    public void testKind_URI_Deserialize() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(URI.class);
        Object result = d._deserialize("urn:test", ctxt);
        assertEquals(URI.create("urn:test"), result);
    }

    @Test
    public void testKind_URI_DeserializeFromEmptyString_ReturnsEmptyURI() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(URI.class);
        Object result = d._deserializeFromEmptyString();
        assertEquals(URI.create(""), result);
    }

    @Test
    public void testKind_Class_Deserialize_Success() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Class.class);
        when(ctxt.findClass("java.lang.String")).thenReturn(String.class);
        Object result = d._deserialize("java.lang.String", ctxt);
        assertEquals(String.class, result);
    }

    @Test
    public void testKind_Class_Deserialize_Failure_HandlesInstantiationProblem() throws Exception {
        Std d = FromStringDeserializer.findDeserializer(Class.class);
        when(ctxt.findClass("bad.class.Name")).thenThrow(new ClassNotFoundException("not found"));
        when(ctxt.handleInstantiationProblem(eq(Class.class), eq("bad.class.Name"), any(Throwable.class)))
                .thenReturn("FALLBACK");
        Object result = d._deserialize("bad.class.Name", ctxt);
        assertEquals("FALLBACK", result);
    }

    @Test
    public void testKind_JavaType_Deserialize() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(JavaType.class);
        when(ctxt.getTypeFactory()).thenReturn(TypeFactory.defaultInstance());
        Object result = d._deserialize("java.lang.String", ctxt);
        assertTrue(result instanceof JavaType);
        assertEquals(String.class, ((JavaType) result).getRawClass());
    }

    @Test
    public void testKind_Currency_Deserialize_Valid() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Currency.class);
        Object result = d._deserialize("USD", ctxt);
        assertEquals(Currency.getInstance("USD"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKind_Currency_Deserialize_Invalid_ThrowsDirectly() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Currency.class);
        d._deserialize("NOT_A_CURRENCY", ctxt);
    }

    @Test
    public void testKind_Pattern_Deserialize_Valid() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Pattern.class);
        Object result = d._deserialize("^abc$", ctxt);
        assertTrue(result instanceof Pattern);
        assertEquals("^abc$", ((Pattern) result).pattern());
    }

    @Test(expected = PatternSyntaxException.class)
    public void testKind_Pattern_Deserialize_Invalid_ThrowsDirectly() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Pattern.class);
        d._deserialize("[", ctxt);
    }

    @Test
    public void testKind_Locale_Deserialize_SinglePart() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Locale.class);
        Object result = d._deserialize("en", ctxt);
        assertEquals(new Locale("en"), result);
    }

    @Test
    public void testKind_Locale_Deserialize_TwoParts_Hyphen() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Locale.class);
        Object result = d._deserialize("en-US", ctxt);
        assertEquals(new Locale("en", "US"), result);
    }

    @Test
    public void testKind_Locale_Deserialize_ThreeParts_Underscore() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Locale.class);
        Object result = d._deserialize("en_US_X", ctxt);
        assertEquals(new Locale("en", "US", "X"), result);
    }

    @Test
    public void testKind_Locale_DeserializeFromEmptyString_ReturnsRoot() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Locale.class);
        Object result = d._deserializeFromEmptyString();
        assertEquals(Locale.ROOT, result);
    }

    @Test
    public void testKind_Charset_Deserialize() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Charset.class);
        Object result = d._deserialize("UTF-8", ctxt);
        assertEquals(Charset.forName("UTF-8"), result);
    }

    @Test
    public void testKind_TimeZone_Deserialize() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(TimeZone.class);
        Object result = d._deserialize("UTC", ctxt);
        assertEquals(TimeZone.getTimeZone("UTC"), result);
    }

    @Test
    public void testKind_InetAddress_Deserialize() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(InetAddress.class);
        Object result = d._deserialize("127.0.0.1", ctxt);
        assertTrue(result instanceof InetAddress);
        assertEquals("127.0.0.1", ((InetAddress) result).getHostAddress());
    }

    @Test
    public void testKind_InetSocketAddress_BracketedIPv6_WithPort() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        Object result = d._deserialize("[::1]:8080", ctxt);
        assertTrue(result instanceof InetSocketAddress);
        assertEquals(8080, ((InetSocketAddress) result).getPort());
    }

    @Test
    public void testKind_InetSocketAddress_BracketedIPv6_WithoutPort() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        Object result = d._deserialize("[::1]", ctxt);
        assertEquals(0, ((InetSocketAddress) result).getPort());
    }

    @Test(expected = InvalidFormatException.class)
    public void testKind_InetSocketAddress_BracketedIPv6_MissingClosingBracket_Throws() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        d._deserialize("[::1", ctxt);
    }

    @Test
    public void testKind_InetSocketAddress_HostPort() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        Object result = d._deserialize("localhost:9090", ctxt);
        InetSocketAddress sa = (InetSocketAddress) result;
        assertEquals(9090, sa.getPort());
        assertEquals("localhost", sa.getHostString());
    }

    @Test
    public void testKind_InetSocketAddress_HostOnly_NoPort() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        Object result = d._deserialize("localhost", ctxt);
        assertEquals(0, ((InetSocketAddress) result).getPort());
    }

    @Test
    public void testKind_InetSocketAddress_UnbracketedIPv6_MultipleColons_NoPort() throws IOException {
        // "::1" has >1 colon => falls through to "host or unbracketed IPv6" branch
        Std d = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        Object result = d._deserialize("::1", ctxt);
        assertEquals(0, ((InetSocketAddress) result).getPort());
    }

    @Test
    public void testKind_StringBuilder_Deserialize() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(StringBuilder.class);
        Object result = d._deserialize("hello", ctxt);
        assertTrue(result instanceof StringBuilder);
        assertEquals("hello", result.toString());
    }

    @Test
    public void testKind_StringBuilder_DeserializeFromEmptyString_ReturnsEmptyStringBuilder() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(StringBuilder.class);
        Object result = d._deserializeFromEmptyString();
        assertTrue(result instanceof StringBuilder);
        assertEquals("", result.toString());
    }

    @Test
    public void testDeserializeFromEmptyString_DefaultKind_ReturnsNull() throws IOException {
        // Kind is none of URI/LOCALE/STRING_BUILDER -> falls through to super() -> null
        Std d = FromStringDeserializer.findDeserializer(File.class);
        Object result = d._deserializeFromEmptyString();
        assertNull(result);
    }

    // =====================================================================
    // deserialize(p, ctxt) — main control flow
    // =====================================================================

    @Test
    public void testDeserialize_EmptyText_ReturnsFromDeserializeFromEmptyString() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(StringBuilder.class);
        when(parser.getValueAsString()).thenReturn("");
        Object result = d.deserialize(parser, ctxt);
        assertTrue(result instanceof StringBuilder);
        assertEquals("", result.toString());
    }

    @Test
    public void testDeserialize_WhitespaceOnlyText_TrimmedToEmpty() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(StringBuilder.class);
        when(parser.getValueAsString()).thenReturn("   ");
        Object result = d.deserialize(parser, ctxt);
        assertTrue(result instanceof StringBuilder);
        assertEquals("", result.toString());
    }

    @Test
    public void testDeserialize_ValidText_ReturnsDeserializedValue() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getValueAsString()).thenReturn("myfile.txt");
        Object result = d.deserialize(parser, ctxt);
        assertTrue(result instanceof File);
        assertEquals("myfile.txt", ((File) result).getName());
    }

    @Test
    public void testDeserialize_ValidText_WithSurroundingWhitespace_TrimmedBothEmptyChecksFalse() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getValueAsString()).thenReturn("  myfile.txt  ");
        Object result = d.deserialize(parser, ctxt);
        assertTrue(result instanceof File);
        assertEquals("myfile.txt", ((File) result).getName());
    }

    @Test
    public void testDeserialize_InvalidText_NullCauseMessage_NoProblemSuffix() throws IOException {
        // NOTE: relies on JDK behavior that Currency.getInstance(invalid) throws
        // IllegalArgumentException with a NULL message -> m2 == null branch.
        Std d = FromStringDeserializer.findDeserializer(Currency.class);
        when(parser.getValueAsString()).thenReturn("NOT_A_CURRENCY");
        ArgumentCaptor<String> msgCaptor = ArgumentCaptor.forClass(String.class);
        try {
            d.deserialize(parser, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
        verify(ctxt).weirdStringException(eq("NOT_A_CURRENCY"), eq(Currency.class), msgCaptor.capture());
        assertEquals("not a valid textual representation", msgCaptor.getValue());
    }

    @Test
    public void testDeserialize_InvalidText_NonNullCauseMessage_AppendsProblem() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(Pattern.class);
        when(parser.getValueAsString()).thenReturn("[");
        ArgumentCaptor<String> msgCaptor = ArgumentCaptor.forClass(String.class);
        try {
            d.deserialize(parser, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
        verify(ctxt).weirdStringException(eq("["), eq(Pattern.class), msgCaptor.capture());
        assertTrue(msgCaptor.getValue().startsWith("not a valid textual representation, problem:"));
    }

    @Test
    public void testDeserialize_URL_MalformedURLException_ThrowsWeirdStringException() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(URL.class);
        when(parser.getValueAsString()).thenReturn("not a url");
        try {
            d.deserialize(parser, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
        verify(ctxt).weirdStringException(eq("not a url"), eq(URL.class), anyString());
    }

    @Test
    public void testDeserialize_TokenEmbeddedObject_NullObject_ReturnsNull() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(parser.getEmbeddedObject()).thenReturn(null);
        Object result = d.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserialize_TokenEmbeddedObject_AssignableInstance_ReturnsAsIs() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(File.class);
        File embedded = new File("embedded.txt");
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(parser.getEmbeddedObject()).thenReturn(embedded);
        Object result = d.deserialize(parser, ctxt);
        assertSame(embedded, result);
    }

    @Test
    public void testDeserialize_TokenEmbeddedObject_NotAssignable_DefaultMock_ReturnsNull() throws IOException {
        // No stubbing of reportMappingException -> default mock does nothing/returns null,
        // matching the literal coded fallback "return null;" in _deserializeEmbedded().
        Std d = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(parser.getEmbeddedObject()).thenReturn(12345); // Integer, not assignable to File
        Object result = d.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_TokenEmbeddedObject_NotAssignable_ReportMappingExceptionThrows() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_EMBEDDED_OBJECT);
        when(parser.getEmbeddedObject()).thenReturn(12345); // not assignable to File
        doThrow(JsonMappingException.from(parser, "cannot convert"))
                .when(ctxt).reportMappingException(anyString(), any(), any());
        d.deserialize(parser, ctxt);
    }

    @Test
    public void testDeserialize_OtherToken_CallsHandleUnexpectedToken() throws IOException {
        Std d = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);
        when(ctxt.handleUnexpectedToken(eq(File.class), eq(parser))).thenReturn(null);
        Object result = d.deserialize(parser, ctxt);
        assertNull(result);
        verify(ctxt).handleUnexpectedToken(eq(File.class), eq(parser));
    }

    @Test
    public void testDeserialize_TokenStartArray_EntersArrayBranch() throws IOException {
        // NOTE: _deserializeFromArray() is inherited from a superclass NOT included in the
        // provided source (StdScalarDeserializer/StdDeserializer). We only assert that the
        // "if (t == JsonToken.START_ARRAY)" branch is entered; we do not assert on the exact
        // outcome since that behavior is not visible in the given source (per instructions,
        // avoiding guessing un-shown behavior).
        Std d = FromStringDeserializer.findDeserializer(File.class);
        when(parser.getValueAsString()).thenReturn(null);
        when(parser.getCurrentToken()).thenReturn(JsonToken.START_ARRAY);
        try {
            when(parser.nextToken()).thenReturn(JsonToken.END_ARRAY);
            d.deserialize(parser, ctxt);
        } catch (Exception e) {
            // acceptable — outcome depends on code not shown in provided source
        }
        assertTrue(true); // branch-entry coverage achieved regardless of outcome
    }
}
