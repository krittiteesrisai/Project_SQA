package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TokenBufferTest {

    private final ObjectMapper MAPPER = new ObjectMapper();

    @Test
    public void testConstructorsAndBasicAccessors() throws IOException {
        TokenBuffer tb1 = new TokenBuffer(MAPPER, true);
        assertNotNull(tb1.version());
        assertTrue(tb1.canWriteTypeId());
        assertTrue(tb1.canWriteObjectId());
        assertNull(tb1.firstToken());

        tb1.writeStartObject();
        tb1.writeFieldName("testKey");
        tb1.writeString("testVal");
        tb1.writeEndObject();
        tb1.close();
        assertTrue(tb1.isClosed());
        assertNotNull(tb1.firstToken());

        TokenBuffer tb2 = new TokenBuffer(null, false);
        assertFalse(tb2.canWriteTypeId());
        assertFalse(tb2.canWriteObjectId());

        JsonParser parser = tb1.asParser();
        TokenBuffer tb3 = new TokenBuffer(parser);
        assertNotNull(tb3);

        TokenBuffer tb4 = new TokenBuffer(parser, null);
        assertNotNull(tb4);
    }

    @Test
    public void testSerializeAllNumberTypesAndEmbeddedObjects() throws IOException {
        TokenBuffer tb = new TokenBuffer(MAPPER, false);
        tb.writeStartArray();
        tb.writeNumber((short) 123);
        tb.writeNumber(12345);
        tb.writeNumber(123456789L);
        tb.writeNumber(BigInteger.valueOf(987654321L));
        tb.writeNumber(BigDecimal.valueOf(123.456));
        tb.writeNumber(12.34F);
        tb.writeNumber(56.78D);
        tb.writeNumber("999.99");
        tb.writeBoolean(true);
        tb.writeBoolean(false);
        tb.writeNull();
        tb.writeRawValue("{\"raw\":true}");
        tb.writeObject(new byte[] { 1, 2, 3 });
        tb.writeObject("SimpleObjectCodecFallback");
        tb.writeEndArray();

        TokenBuffer target = new TokenBuffer(MAPPER, false);
        tb.serialize(target);
        assertNotNull(target.firstToken());
    }

    @Test
    public void testSerializeWithNativeIds() throws IOException {
        TokenBuffer tb = new TokenBuffer(MAPPER, true);
        tb.writeStartObject();
        tb.writeObjectId("obj-1");
        tb.writeTypeId("type-1");
        tb.writeFieldName("idField");
        tb.writeString("value");
        tb.writeEndObject();

        TokenBuffer target = new TokenBuffer(MAPPER, true);
        tb.serialize(target);
        assertEquals(JsonToken.START_OBJECT, target.firstToken());
    }

    @Test
    public void testDeserializeStartingFromFieldName() throws IOException {
        // ทดสอบเคส #592 ที่เริ่มต้นด้วย FIELD_NAME แทน START_OBJECT
        TokenBuffer source = new TokenBuffer(MAPPER, false);
        source.writeFieldName("field1");
        source.writeString("val1");

        TokenBuffer tb = new TokenBuffer(MAPPER, false);
        JsonParser p = source.asParser();
        p.nextToken(); // ไปที่ FIELD_NAME
        
        DeserializationContext ctxt = MAPPER.getDeserializationContext();
        tb.deserialize(p, ctxt);
        assertNotNull(tb.firstToken());
    }

    @Test
    public void testParserNumberConversionsAndEdgeCases() throws IOException {
        TokenBuffer tb = new TokenBuffer(MAPPER, false);
        tb.writeStartArray();
        tb.writeNumber(BigInteger.TEN);
        tb.writeNumber(BigDecimal.ONE);
        tb.writeNumber(100.5D);
        tb.writeNumber(10.5F);
        tb.writeNumber((short) 5);
        tb.writeEndArray();

        JsonParser p = tb.asParser();
        assertNotNull(p.nextToken()); // START_ARRAY

        assertNotNull(p.nextToken()); // BigInteger
        assertEquals(BigInteger.TEN, p.getBigIntegerValue());
        assertEquals(new BigDecimal(BigInteger.TEN), p.getDecimalValue());
        assertEquals(JsonParser.NumberType.BIG_INTEGER, p.getNumberType());

        assertNotNull(p.nextToken()); // BigDecimal
        assertEquals(BigDecimal.ONE, p.getDecimalValue());
        assertEquals(BigInteger.ONE, p.getBigIntegerValue());
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, p.getNumberType());

        assertNotNull(p.nextToken()); // Double
        assertEquals(100.5, p.getDoubleValue(), 0.001);
        assertEquals(100.5f, p.getFloatValue(), 0.001f);
        assertEquals(JsonParser.NumberType.DOUBLE, p.getNumberType());

        assertNotNull(p.nextToken()); // Float
        assertEquals(10.5f, p.getFloatValue(), 0.001f);
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, p.getDecimalValue());

        assertNotNull(p.nextToken()); // Short
        assertEquals(5, p.getIntValue());
        assertEquals(JsonParser.NumberType.INT, p.getNumberType());

        p.close();
        assertTrue(p.isClosed());
        assertNull(p.peekNextToken());
    }

    @Test
    public void testParserBinaryAndTextOperations() throws IOException {
        TokenBuffer tb = new TokenBuffer(MAPPER, false);
        tb.writeStartArray();
        tb.writeBinary(Base64Variants.MIME, new byte[] { 10, 20, 30 }, 0, 3);
        tb.writeString((String) null);
        tb.writeString((SerializableString) null);
        tb.writeEndArray();

        JsonParser p = tb.asParser();
        p.nextToken(); // START_ARRAY
        p.nextToken(); // VALUE_EMBEDDED_OBJECT (binary)
        
        byte[] bytes = p.getBinaryValue(Base64Variants.MIME);
        assertNotNull(bytes);

        ByteArrayBuilder bout = new ByteArrayBuilder();
        int readLen = p.readBinaryValue(Base64Variants.MIME, bout);
        assertEquals(3, readLen);

        p.close();
    }

    @Test
    public void testToStringTruncationAndAppend() throws IOException {
        TokenBuffer tb = new TokenBuffer(MAPPER, false);
        tb.writeStartArray();
        for (int i = 0; i < 110; i++) {
            tb.writeNumber(i);
        }
        tb.writeEndArray();

        String str = tb.toString();
        assertTrue(str.contains("truncated"));

        TokenBuffer other = new TokenBuffer(MAPPER, false);
        other.writeStartObject();
        other.writeEndObject();

        tb.append(other);
        assertNotNull(tb.firstToken());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedOperations() throws IOException {
        TokenBuffer tb = new TokenBuffer(MAPPER, false);
        tb.writeRaw("test");
    }
}