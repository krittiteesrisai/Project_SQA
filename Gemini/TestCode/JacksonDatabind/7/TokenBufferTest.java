package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.JsonReadContext;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class TokenBufferTest {

    @Test
    public void testConstructorsAndVersion() {
        TokenBuffer tb1 = new TokenBuffer((ObjectCodec) null);
        assertNotNull(tb1.version());
        assertFalse(tb1.canWriteTypeId());
        assertFalse(tb1.canWriteObjectId());

        TokenBuffer tb2 = new TokenBuffer(null, true);
        assertTrue(tb2.canWriteTypeId());
        assertTrue(tb2.canWriteObjectId());

        // Test with mock parser
        JsonParser mockParser = tb1.asParser();
        TokenBuffer tb3 = new TokenBuffer(mockParser);
        assertNotNull(tb3.asParser());
        assertNotNull(tb3.asParser(mockParser));
        
        mockParser.close();
    }

    @Test
    public void testFirstTokenAndEmptyBuffer() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        assertNull(tb.firstToken());
        assertEquals("[TokenBuffer: ]", tb.toString());

        tb.writeStartObject();
        assertEquals(JsonToken.START_OBJECT, tb.firstToken());
        tb.writeEndObject();
        tb.close();
        assertTrue(tb.isClosed());
    }

    @Test
    public void testWriteNullEdgeCases() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeString((String) null);
        tb.writeString((SerializableString) null);
        tb.writeNumber((BigDecimal) null);
        tb.writeNumber((BigInteger) null);
        tb.writeObject(null);
        tb.writeTree(null);

        JsonParser jp = tb.asParser();
        assertEquals(JsonToken.VALUE_NULL, jp.nextToken());
        assertEquals(JsonToken.VALUE_NULL, jp.nextToken());
        assertEquals(JsonToken.VALUE_NULL, jp.nextToken());
        assertEquals(JsonToken.VALUE_NULL, jp.nextToken());
        assertEquals(JsonToken.VALUE_NULL, jp.nextToken());
        assertEquals(JsonToken.VALUE_NULL, jp.nextToken());
        jp.close();
    }

    @Test
    public void testSegmentOverflow() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartArray();
        // Write more than 16 tokens to force new Segment allocation (TOKENS_PER_SEGMENT = 16)
        for (int i = 0; i < 20; i++) {
            tb.writeNumber(i);
        }
        tb.writeEndArray();

        JsonParser jp = tb.asParser();
        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        for (int i = 0; i < 20; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
            assertEquals(i, jp.getIntValue());
        }
        assertEquals(JsonToken.END_ARRAY, jp.nextToken());
        jp.close();
    }

    @Test
    public void testWritePrimitivesAndNumbers() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartObject();
        tb.writeFieldName("short");
        tb.writeNumber((short) 10);
        tb.writeFieldName("int");
        tb.writeNumber(100);
        tb.writeFieldName("long");
        tb.writeNumber(1000L);
        tb.writeFieldName("double");
        tb.writeNumber(10.5d);
        tb.writeFieldName("float");
        tb.writeNumber(5.5f);
        tb.writeFieldName("bigDecimal");
        tb.writeNumber(new BigDecimal("123.456"));
        tb.writeFieldName("bigInteger");
        tb.writeNumber(new BigInteger("999999"));
        tb.writeFieldName("encoded");
        tb.writeNumber("3.14");
        tb.writeFieldName("boolTrue");
        tb.writeBoolean(true);
        tb.writeFieldName("boolFalse");
        tb.writeBoolean(false);
        tb.writeFieldName("binary");
        tb.writeBinary(Base64Variants.MIME, new byte[]{1, 2, 3}, 0, 3);
        tb.writeEndObject();

        JsonParser jp = tb.asParser();
        while (jp.nextToken() != null) {
            // Traverse all generated tokens
        }
        jp.close();
    }

    @Test
    public void testParserTextAndNumberAccessors() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartObject();
        tb.writeFieldName("strField");
        tb.writeString("hello");
        tb.writeFieldName("numInt");
        tb.writeNumber(42);
        tb.writeFieldName("numFloat");
        tb.writeNumber(3.14);
        tb.writeFieldName("numStringFloat");
        tb.writeNumber("2.718");
        tb.writeFieldName("numStringLong");
        tb.writeNumber("12345");
        tb.writeEndObject();

        JsonParser jp = tb.asParser();
        assertNull(jp.getText()); // Before first token

        assertEquals(JsonToken.START_OBJECT, jp.nextToken());
        assertNull(jp.getText());

        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals("strField", jp.getText());
        assertEquals("strField", jp.getCurrentName());

        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("hello", jp.getText());
        assertArrayEquals("hello".toCharArray(), jp.getTextCharacters());
        assertEquals(5, jp.getTextLength());
        assertEquals(0, jp.getTextOffset());
        assertFalse(jp.hasTextCharacters());

        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(42, jp.getIntValue());
        assertEquals(42L, jp.getLongValue());
        assertEquals(42.0, jp.getDoubleValue(), 0.001);
        assertEquals(42f, jp.getFloatValue(), 0.001f);
        assertEquals(BigInteger.valueOf(42), jp.getBigIntegerValue());
        assertEquals(BigDecimal.valueOf(42), jp.getDecimalValue());
        assertEquals(JsonParser.NumberType.INT, jp.getNumberType());

        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken());
        assertEquals(3.14, jp.getDoubleValue(), 0.001);
        assertEquals(JsonParser.NumberType.DOUBLE, jp.getNumberType());

        // numStringFloat (parsed from string)
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken());
        assertEquals(2.718, jp.getDoubleValue(), 0.001);

        // numStringLong (parsed from string)
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken());
        assertEquals(12345L, jp.getLongValue());

        assertEquals(JsonToken.END_OBJECT, jp.nextToken());
        jp.close();
    }

    @Test
    public void testParserBinaryHandling() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartArray();
        tb.writeBinary(new byte[]{10, 20, 30}); // Embedded object
        tb.writeString("AQIDBA=="); // Base64 string
        tb.writeEndArray();

        JsonParser jp = tb.asParser();
        jp.nextToken(); // START_ARRAY

        jp.nextToken(); // VALUE_EMBEDDED_OBJECT
        assertNotNull(jp.getBinaryValue());
        
        jp.nextToken(); // VALUE_STRING
        assertNotNull(jp.getBinaryValue(Base64Variants.MIME));

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        assertEquals(4, jp.readBinaryValue(Base64Variants.MIME, out));

        jp.nextToken(); // END_ARRAY
        jp.close();
    }

    @Test(expected = JsonParseException.class)
    public void testParserBinaryError() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeNumber(100);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        jp.getBinaryValue(); // Should throw exception because token is not string or embedded object
    }

    @Test
    public void testSerializeAllTokenTypes() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeStartObject();
        tb.writeFieldName("a");
        tb.writeStartArray();
        tb.writeString("test");
        tb.writeNumber(1L);
        tb.writeNumber(BigInteger.TEN);
        tb.writeNumber((short) 5);
        tb.writeNumber(1.5f);
        tb.writeNull();
        tb.writeEndArray();
        tb.writeEndObject();

        JsonFactory f = new JsonFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator jgen = f.createGenerator(sw);
        
        tb.serialize(jgen);
        jgen.close();
        assertFalse(sw.toString().isEmpty());
    }

    @Test
    public void testAppendAndCopyStructure() throws IOException, JsonGenerationException {
        TokenBuffer tb1 = new TokenBuffer(null, false);
        tb1.writeStartObject();
        tb1.writeFieldName("key");
        tb1.writeString("val");
        tb1.writeEndObject();

        TokenBuffer tb2 = new TokenBuffer(null, false);
        tb2.append(tb1);

        JsonParser jp = tb1.asParser();
        jp.nextToken(); // START_OBJECT
        TokenBuffer tb3 = new TokenBuffer(null, false);
        tb3.copyCurrentStructure(jp);
        
        assertNotNull(tb3.firstToken());
        jp.close();
    }

    @Test
    public void testParserPeekAndOverrideName() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartObject();
        tb.writeFieldName("orig");
        tb.writeString("value");
        tb.writeEndObject();

        JsonParser jp = tb.asParser();
        assertNotNull(((TokenBuffer.Parser) jp).peekNextToken());

        jp.nextToken(); // START_OBJECT
        jp.nextToken(); // FIELD_NAME
        jp.overrideCurrentName("updated");
        assertEquals("updated", jp.getCurrentName());
        
        jp.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedOperations() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeRaw("test");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedBinaryStream() {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeBinary(Base64Variants.MIME, null, 0);
    }
}