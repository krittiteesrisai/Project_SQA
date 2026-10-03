package com.fasterxml.jackson.databind.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.PackageVersion;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class TokenBufferTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
        mapper = null;
    }

    @Test
    public void testConstructorsAndVersion() {
        TokenBuffer tb1 = new TokenBuffer(null);
        assertNotNull(tb1.version());
        assertEquals(PackageVersion.VERSION, tb1.version());
        assertFalse(tb1.isClosed());

        TokenBuffer tb2 = new TokenBuffer(null, true);
        assertTrue(tb2.canWriteTypeId());
        assertTrue(tb2.canWriteObjectId());

        try {
            tb1.close();
            assertTrue(tb1.isClosed());
        } catch (IOException e) {
            fail("Should not throw IOException on close");
        }
    }

    @Test
    public void testParserConstructorWithContext() throws IOException {
        String json = "{\"a\": 1.23}";
        JsonParser p = mapper.getFactory().createParser(json);
        p.nextToken(); // START_OBJECT

        // Test ctxt == null branch
        TokenBuffer tbNull = new TokenBuffer(p, null);
        assertNotNull(tbNull);

        // Test ctxt != null branch
        DeserializationContext ctxt = mapper.getDeserializationContext();
        TokenBuffer tbCtxt = new TokenBuffer(p, ctxt);
        assertNotNull(tbCtxt);
    }

    @Test
    public void testForceBigDecimal() {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.forceUseOfBigDecimal(true);
        // Verify fluent API return
        assertSame(tb, tb.forceUseOfBigDecimal(false));
    }

    @Test
    public void testFirstTokenAndEmptyBuffer() {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        assertNull(tb.firstToken());
        assertEquals("[TokenBuffer: ]", tb.toString());
    }

    @Test
    public void testWritePrimitiveNumbers() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeNumber((short) 10);
        tb.writeNumber(20);
        tb.writeNumber(30L);
        tb.writeNumber(40.5d);
        tb.writeNumber(50.5f);
        tb.writeNumber(new BigDecimal("60.75"));
        tb.writeNumber(new BigInteger("70"));
        tb.writeNumber("80.5");
        tb.writeBoolean(true);
        tb.writeBoolean(false);
        tb.writeNull();

        JsonParser p = tb.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(10, p.getShortValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(20, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(30L, p.getLongValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(40.5d, p.getDoubleValue(), 0.001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(50.5f, p.getFloatValue(), 0.001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(new BigDecimal("60.75"), p.getDecimalValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(new BigInteger("70"), p.getBigIntegerValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(80.5, p.getDoubleValue(), 0.001);
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertFalse(p.getBooleanValue());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteStringsAndRawValues() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeString((String) null); // should write null
        tb.writeString("Hello");
        tb.writeString("World".toCharArray(), 0, 5);
        tb.writeString((SerializableString) null); // should write null
        tb.writeString(new SerializedString("Serializable"));
        tb.writeRawValue("{\"raw\":1}");
        tb.writeRawValue("rawString", 0, 9);
        tb.writeRawValue("charRaw".toCharArray(), 0, 7);

        JsonParser p = tb.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("Hello", p.getText());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("World", p.getText());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("Serializable", p.getText());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedOperations() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeRaw("test");
    }

    @Test
    public void testObjectAndTreeWriting() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeObject(null);
        tb.writeObject(new byte[]{1, 2, 3});
        tb.writeTree(null);

        // Test codec null paths
        TokenBuffer tbNoCodec = new TokenBuffer((ObjectCodec) null, false);
        tbNoCodec.writeObject("CustomObj");
        tbNoCodec.writeTree(null);

        JsonParser p = tb.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(new byte[]{1, 2, 3}, (byte[]) p.getEmbeddedObject());
    }

    @Test
    public void testBinaryOperations() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeBinary(Base64Variants.MIME, new byte[]{10, 20, 30}, 0, 3);

        JsonParser p = tb.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(new byte[]{10, 20, 30}, p.getBinaryValue());

        // Test string base64 decoding branch in Parser
        TokenBuffer tbStr = new TokenBuffer(mapper, false);
        tbStr.writeString("AQID"); // Base64 for {1, 2, 3}
        JsonParser pStr = tbStr.asParser();
        assertEquals(JsonToken.VALUE_STRING, pStr.nextToken());
        assertArrayEquals(new byte[]{1, 2, 3}, pStr.getBinaryValue(Base64Variants.MIME));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testStreamBinaryUnsupported() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeBinary(Base64Variants.MIME, null, 10);
    }

    @Test
    public void testAppendBuffer() throws IOException {
        TokenBuffer tb1 = new TokenBuffer(mapper, false);
        tb1.writeStartObject();
        tb1.writeFieldName("field");
        tb1.writeNumber(123);
        tb1.writeEndObject();

        TokenBuffer tb2 = new TokenBuffer(mapper, false);
        tb2.append(tb1);

        JsonParser p = tb2.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("field", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testSerializeBuffer() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeStartArray();
        tb.writeString("item1");
        tb.writeNumber(100L);
        tb.writeNumber(10.5f);
        tb.writeNumber(20.5d);
        tb.writeNumber(new BigInteger("999"));
        tb.writeEndArray();

        // Serialize back to another TokenBuffer or Generator
        TokenBuffer target = new TokenBuffer(mapper, false);
        tb.serialize(target);

        JsonParser p = target.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("item1", p.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(100L, p.getLongValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testDeserializeSpecialCaseFieldName() throws IOException {
        // [databind#592] test starting from FIELD_NAME
        TokenBuffer source = new TokenBuffer(mapper, false);
        source.writeFieldName("testKey");
        source.writeNumber(456);

        JsonParser p = source.asParser();
        p.nextToken(); // Move to FIELD_NAME

        TokenBuffer target = new TokenBuffer(mapper, false);
        target.deserialize(p, mapper.getDeserializationContext());

        JsonParser pTarget = target.asParser();
        assertEquals(JsonToken.START_OBJECT, pTarget.nextToken());
        assertEquals(JsonToken.FIELD_NAME, pTarget.nextToken());
        assertEquals("testKey", pTarget.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, pTarget.nextToken());
        assertEquals(456, pTarget.getIntValue());
        assertEquals(JsonToken.END_OBJECT, pTarget.nextToken());
    }

    @Test
    public void testParserPeekAndNextFieldName() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeStartObject();
        tb.writeFieldName("key1");
        tb.writeString("val1");
        tb.writeEndObject();

        JsonParser p = tb.asParser();
        // Test peekNextToken
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, ((TokenBuffer.Parser)p).peekNextToken());
        
        // Test nextFieldName
        assertEquals("key1", p.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("val1", p.getText());
    }

    @Test
    public void testParserNumberConversions() throws IOException {
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeNumber(100);
        tb.writeNumber("123.45"); // String number format

        JsonParser p = tb.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(BigInteger.valueOf(100), p.getBigIntegerValue());
        assertEquals(BigDecimal.valueOf(100), p.getDecimalValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(123.45, p.getDoubleValue(), 0.001);
        assertEquals(123.45f, p.getFloatValue(), 0.001);
    }
}