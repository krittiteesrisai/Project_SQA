package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private IOContext ioContext;
    private BytesToNameCanonicalizer symbols;

    @Before
    public void setUp() {
        BufferRecycler recycler = new BufferRecycler();
        ioContext = new IOContext(recycler, "_testSource", true);
        symbols = BytesToNameCanonicalizer.createRoot();
    }

    @After
    public void tearDown() {
        if (symbols != null) {
            symbols.release();
        }
    }

    private UTF8StreamJsonParser createParser(String json) {
        byte[] bytes = json.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        return new UTF8StreamJsonParser(
                ioContext, 0, in, null, symbols,
                bytes, 0, bytes.length, true
        );
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        String data = "12345";
        byte[] bytes = data.getBytes();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, null, null, symbols,
                bytes, 0, bytes.length, true
        );
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(5, count);
        assertArrayEquals(bytes, out.toByteArray());

        // Edge case: count < 1
        parser._inputPtr = parser._inputEnd;
        assertEquals(0, parser.releaseBuffered(out));
    }

    @Test
    public void testGetInputSource() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, in, null, symbols,
                new byte[10], 0, 0, true
        );
        assertSame(in, parser.getInputSource());
    }

    @Test
    public void testCodecGetAndSet() {
        UTF8StreamJsonParser parser = createParser("{}");
        assertNull(parser.getCodec());
        ObjectCodec codec = new com.fasterxml.jackson.core.ObjectCodec() {
            @Override public com.fasterxml.jackson.core.Version version() { return Version.unknownVersion(); }
            @Override public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException { return null; }
            @Override public <T> java.util.Iterator<T> readValues(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override public <T> java.util.Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override public <T> java.util.Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException { return null; }
            @Override public com.fasterxml.jackson.databind.JsonNode readTree(JsonParser p) throws IOException { return null; }
            @Override public void writeValue(JsonGenerator g, Object value) throws IOException {}
            @Override public <T extends com.fasterxml.jackson.core.TreeNode> T readTree(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType rootType) throws IOException { return null; }
            @Override public com.fasterxml.jackson.core.TreeNode createObjectNode() { return null; }
            @Override public com.fasterxml.jackson.core.TreeNode createArrayNode() { return null; }
            @Override public com.fasterxml.jackson.core.JsonParser treeAsTokens(com.fasterxml.jackson.core.TreeNode n) { return null; }
            @Override public <T> T treeToValue(com.fasterxml.jackson.core.TreeNode n, Class<T> valueType) throws IOException { return null; }
        };
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testLoadMoreReturnsFalseWhenStreamIsNull() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, null, null, symbols,
                new byte[10], 0, 0, true
        );
        assertFalse(parser.loadMore());
    }

    @Test(expected = IOException.class)
    public void testLoadMoreZeroBytesThrowsException() throws IOException {
        InputStream zeroStream = new InputStream() {
            @Override public int read(byte[] b, int off, int len) { return 0; }
            @Override public int read() { return 0; }
        };
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, zeroStream, null, symbols,
                new byte[10], 0, 0, true
        );
        parser.loadMore();
    }

    @Test
    public void testLoadToHaveAtLeastNoStream() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ioContext, 0, null, null, symbols,
                new byte[10], 0, 0, true
        );
        assertFalse(parser._loadToHaveAtLeast(5));
    }

    @Test
    public void testGetTextAndValueAsStringVariants() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertEquals("hello", parser.getValueAsString());
        assertEquals("hello", parser.getValueAsString("default"));
    }

    @Test
    public void testGetText2NullToken() {
        UTF8StreamJsonParser parser = createParser("");
        assertNull(parser._getText2(null));
    }

    @Test
    public void testGetTextCharactersAndLengthAndOffset() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"myfield\": 123}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        
        assertNotNull(parser.getTextCharacters());
        assertEquals(7, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetBinaryValueAndReadBinaryValue() throws IOException {
        // Base64 encoded "Hello" -> SGVsbG8=
        UTF8StreamJsonParser parser = createParser("\"SGVsbG8=\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] binary = parser.getBinaryValue(Base64Variant.getDefaultBase64Variant());
        assertNotNull(binary);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8StreamJsonParser parser2 = createParser("\"SGVsbG8=\"");
        assertEquals(JsonToken.VALUE_STRING, parser2.nextToken());
        int readLen = parser2.readBinaryValue(Base64Variant.getDefaultBase64Variant(), out);
        assertTrue(readLen > 0);
    }

    @Test
    public void testNextTokenArrayAndObjectHandling() throws IOException {
        UTF8StreamJsonParser parser = createParser("[{}]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenPrimitives() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"t\":true, \"f\":false, \"n\":null, \"num\":123}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.nextIntValue(0));
        assertEquals(123L, parser.nextLongValue(0L));
        assertEquals("123", parser.nextTextValue());
    }

    @Test
    public void testNextFieldNameWithSerializableString() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"name\":\"val\"}");
        SerializedString str = new SerializedString("name");
        assertTrue(parser.nextFieldName(str));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    @Test
    public void testParseNumberEdges() throws IOException {
        UTF8StreamJsonParser parser = createParser("-123.45e2");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-12345.0, parser.getDoubleValue(), 0.001);
    }

    @Test
    public void testGrowArrayBy() {
        int[] arr = {1, 2};
        int[] grown = UTF8StreamJsonParser.growArrayBy(arr, 2);
        assertEquals(4, grown.length);
        assertNull(UTF8StreamJsonParser.growArrayBy(null, 3));
    }

    @Test
    public void testDecodeEscapedVariants() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"\\b\\t\\n\\f\\r\\/\\\\\\u0041\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\b\t\n\f\r/\\A", parser.getText());
    }
}