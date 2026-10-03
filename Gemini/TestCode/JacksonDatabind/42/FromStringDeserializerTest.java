package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.TypeFactory;
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

    // Helper dummy parser to simulate json tokens and values
    private static class DummyJsonParser extends JsonParser {
        private JsonToken currentToken;
        private String valueString;
        private Object embeddedObject;

        public DummyJsonParser(JsonToken token, String valueString) {
            this.currentToken = token;
            this.valueString = valueString;
        }

        public DummyJsonParser(JsonToken token, Object embeddedObject) {
            this.currentToken = token;
            this.embeddedObject = embeddedObject;
        }

        @Override public JsonToken getCurrentToken() { return currentToken; }
        @Override public String getValueAsString() throws IOException { return valueString; }
        @Override public Object getEmbeddedObject() throws IOException { return embeddedObject; }
        @Override public JsonToken nextToken() throws IOException { 
            // Simulate advancing for array unwrap tests
            if (currentToken == JsonToken.START_ARRAY) {
                currentToken = JsonToken.VALUE_STRING;
                return currentToken;
            } else if (currentToken == JsonToken.VALUE_STRING) {
                currentToken = JsonToken.END_ARRAY;
                return currentToken;
            }
            return null;
        }
        
        // Unused stubs required by abstract JsonParser
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec c) {}
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public void close() {}
        @Override public boolean isClosed() { return false; }
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public void clearCurrentToken() {}
        @Override public String getCurrentName() throws IOException { return null; }
        @Override public void overrideCurrentName(String name) {}
        @Override public String getText() throws IOException { return valueString; }
        @Override public char[] getTextCharacters() throws IOException { return new char[0]; }
        @Override public int getTextLength() throws IOException { return 0; }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public NumbergetNumberValue() throws IOException { return null; }
        @Override public NumberType getNumberType() throws IOException { return null; }
        @Override public int getIntValue() throws IOException { return 0; }
        @Override public long getLongValue() throws IOException { return 0L; }
        @Override public java.math.BigInteger getBigIntegerValue() throws IOException { return null; }
        @Override public float getFloatValue() throws IOException { return 0f; }
        @Override public double getDoubleValue() throws IOException { return 0d; }
        @Override public java.math.BigDecimal getDecimalValue() throws IOException { return null; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
        @Override public JsonParser skipChildren() throws IOException { return exceptionThrownStub(); }
        private <T> T exceptionThrownStub() { throw new UnsupportedOperationException(); }
    }

    // Helper dummy parser that simulates a multi-element array for unwrap error branch
    private static class MultiElementArrayParser extends DummyJsonParser {
        private int step = 0;
        public MultiElementArrayParser() { super(JsonToken.START_ARRAY, (String) null); }
        @Override
        public JsonToken nextToken() throws IOException {
            step++;
            if (step == 1) return JsonToken.VALUE_STRING;
            if (step == 2) return JsonToken.VALUE_STRING; // Extra value causing failure
            return JsonToken.END_ARRAY;
        }
    }

    @Test
    public void testTypesAndFindDeserializerCoverage() {
        assertNotNull(FromStringDeserializer.types());
        
        // Test all valid kinds in findDeserializer
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
        
        // Test unsupported class -> returns null branch
        assertNull(FromStringDeserializer.findDeserializer(Integer.class));
    }

    @Test
    public void testStdDeserializationKinds() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        // 1. STD_FILE
        Std stdFile = (Std) FromStringDeserializer.findDeserializer(File.class);
        assertEquals(new File("test.txt"), stdFile._deserialize("test.txt", ctxt));

        // 2. STD_URL
        Std stdUrl = (Std) FromStringDeserializer.findDeserializer(URL.class);
        assertEquals(new URL("http://localhost"), stdUrl._deserialize("http://localhost", ctxt));

        // 3. STD_URI
        Std stdUri = (Std) FromStringDeserializer.findDeserializer(URI.class);
        assertEquals(URI.create("urn:test"), stdUri._deserialize("urn:test", ctxt));
        // Empty string URI branch
        assertEquals(URI.create(""), stdUri._deserializeFromEmptyString());

        // 4. STD_CLASS (Success & Exception)
        Std stdClass = (Std) FromStringDeserializer.findDeserializer(Class.class);
        assertEquals(String.class, stdClass._deserialize("java.lang.String", ctxt));
        try {
            stdClass._deserialize("non.existent.ClassXYZ", ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e);
        }

        // 5. STD_JAVA_TYPE
        Std stdJavaType = (Std) FromStringDeserializer.findDeserializer(JavaType.class);
        assertNotNull(stdJavaType._deserialize("java.lang.String", ctxt));

        // 6. STD_CURRENCY
        Std stdCurrency = (Std) FromStringDeserializer.findDeserializer(Currency.class);
        assertEquals(Currency.getInstance("USD"), stdCurrency._deserialize("USD", ctxt));

        // 7. STD_PATTERN
        Std stdPattern = (Std) FromStringDeserializer.findDeserializer(Pattern.class);
        assertNotNull(stdPattern._deserialize("a*b", ctxt));

        // 8. STD_LOCALE (1, 2, and 3 parts)
        Std stdLocale = (Std) FromStringDeserializer.findDeserializer(Locale.class);
        assertEquals(new Locale("th"), stdLocale._deserialize("th", ctxt));
        assertEquals(new Locale("th", "TH"), stdLocale._deserialize("th_TH", ctxt));
        assertEquals(new Locale("th", "TH", "EXT"), stdLocale._deserialize("th_TH_EXT", ctxt));

        // 9. STD_CHARSET
        Std stdCharset = (Std) FromStringDeserializer.findDeserializer(Charset.class);
        assertEquals(Charset.forName("UTF-8"), stdCharset._deserialize("UTF-8", ctxt));

        // 10. STD_TIME_ZONE
        Std stdTimeZone = (Std) FromStringDeserializer.findDeserializer(TimeZone.class);
        assertEquals(TimeZone.getTimeZone("GMT"), stdTimeZone._deserialize("GMT", ctxt));

        // 11. STD_INET_ADDRESS
        Std stdInetAddress = (Std) FromStringDeserializer.findDeserializer(InetAddress.class);
        assertNotNull(stdInetAddress._deserialize("127.0.0.1", ctxt));

        // 12. STD_INET_SOCKET_ADDRESS (IPv6 bracketed, host:port, unbracketed/host-only)
        Std stdInetSocket = (Std) FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        assertNotNull(stdInetSocket._deserialize("localhost:8080", ctxt));
        assertNotNull(stdInetSocket._deserialize("localhost", ctxt));
        assertNotNull(stdInetSocket._deserialize("[0:0:0:0:0:0:0:1]:80", ctxt));
        
        // Edge case: Malformed bracketed IPv6 (missing closing bracket)
        try {
            stdInetSocket._deserialize("[0:0:0:0:0:0:0:1", ctxt);
            fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            assertNotNull(e);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStdInvalidKindFallback() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        // Constructing Std with invalid kind using reflection or custom subclass to trigger default switch case
        Std invalidStd = new Std(File.class, 9999);
        invalidStd._deserialize("dummy", ctxt);
    }

    @Test
    public void testDeserializeEmptyAndBlankStrings() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        Std stdFile = (Std) FromStringDeserializer.findDeserializer(File.class);

        DummyJsonParser jpEmpty = new DummyJsonParser(JsonToken.VALUE_STRING, "");
        assertNull(stdFile.deserialize(jpEmpty, ctxt));

        DummyJsonParser jpBlank = new DummyJsonParser(JsonToken.VALUE_STRING, "   ");
        assertNull(stdFile.deserialize(jpBlank, ctxt));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeIllegalArgumentExceptionHandling() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        Std stdCurrency = (Std) FromStringDeserializer.findDeserializer(Currency.class);

        // Invalid currency code triggers IllegalArgumentException inside _deserialize
        DummyJsonParser jp = new DummyJsonParser(JsonToken.VALUE_STRING, "INVALID_CURRENCY_CODE");
        stdCurrency.deserialize(jp, ctxt);
    }

    @Test
    public void testEmbeddedObjectHandling() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        Std stdFile = (Std) FromStringDeserializer.findDeserializer(File.class);

        // Sub-case: embedded object is null
        DummyJsonParser jpNull = new DummyJsonParser(JsonToken.VALUE_EMBEDDED_OBJECT, (Object) null);
        assertNull(stdFile.deserialize(jpNull, ctxt));

        // Sub-case: embedded object is instance of value class itself
        File targetFile = new File("abc.txt");
        DummyJsonParser jpInstance = new DummyJsonParser(JsonToken.VALUE_EMBEDDED_OBJECT, targetFile);
        assertEquals(targetFile, stdFile.deserialize(jpInstance, ctxt));

        // Sub-case: embedded object requires conversion (triggers _deserializeEmbedded which throws mappingException)
        try {
            DummyJsonParser jpOther = new DummyJsonParser(JsonToken.VALUE_EMBEDDED_OBJECT, 12345);
            stdFile.deserialize(jpOther, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e);
        }
    }

    @Test(expected = JsonMappingException.class)
    public void testGeneralMappingExceptionFallback() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        Std stdFile = (Std) FromStringDeserializer.findDeserializer(File.class);

        // Passing token that doesn't match string or embedded object (e.g. VALUE_NUMBER_INT)
        DummyJsonParser jp = new DummyJsonParser(JsonToken.VALUE_NUMBER_INT, (String) null);
        stdFile.deserialize(jp, ctxt);
    }

    @Test
    public void testSingleValueArrayUnwrap() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        // Enable unwrap single value array feature
        DeserializationConfig config = ctxt.getConfig().with(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        
        // Create a custom context or mock-like behavior if config is immutable, but we can configure ObjectMapper directly:
        ObjectMapper mapperWithUnwrap = new ObjectMapper().enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        DeserializationContext unwrapCtxt = mapperWithUnwrap.getDeserializationContext();
        Std stdFile = (Std) FromStringDeserializer.findDeserializer(File.class);

        // Valid single value array unwrap
        DummyJsonParser jpArray = new DummyJsonParser(JsonToken.START_ARRAY, "test.txt");
        File file = (File) stdFile.deserialize(jpArray, unwrapCtxt);
        assertEquals(new File("test.txt"), file);

        // Invalid single value array unwrap (more than one element)
        try {
            MultiElementArrayParser multiParser = new MultiElementArrayParser();
            stdFile.deserialize(multiParser, unwrapCtxt);
            fail("Expected JsonMappingException for multi-element array unwrap");
        } catch (JsonMappingException e) {
            assertNotNull(e);
        }
    }
}