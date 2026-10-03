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

    @Test
    public void testConstructorsAndBasicAccessors() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer tb = new TokenBuffer(mapper);
        assertNotNull(tb.version());
        assertNotNull(tb.getCodec());
        assertNull(tb.firstToken());
        
        tb.writeStartObject();
        tb.writeFieldName("test");
        tb.writeString("value");
        tb.writeEndObject();
        tb.close();
        
        assertTrue(tb.isClosed());
        assertNotNull(tb.firstToken());
        assertEquals(JsonToken.START_OBJECT, tb.firstToken());
    }

    @Test
    public void testSegmentOverflowAndParserPeek() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        // Write more than 16 tokens to trigger Segment chaining (> TOKENS_PER_SEGMENT)
        tb.writeStartArray();
        for (int i = 0; i < 20; i++) {
            tb.writeNumber(i);
        }
        tb.writeEndArray();

        JsonParser jp = tb.asParser();
        assertNotNull(jp);
        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, jp.peekNextToken());
        
        while (jp.nextToken() != null) {
            // Traverse all
        }
        assertTrue(jp.isClosed() == false);
        jp.close();
        assertTrue(jp.isClosed());
    }

    @Test
    public void testNumericTypesSerializationAndParsing() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartObject();
        
        // Integer variants
        tb.writeFieldName("short");
        tb.writeNumber((short) 123);
        tb.writeFieldName("int");
        tb.writeNumber(456);
        tb.writeFieldName("long");
        tb.writeNumber(789L);
        tb.writeFieldName("bigInt");
        tb.writeNumber(BigInteger.valueOf(1000L));
        
        // Float variants
        tb.writeFieldName("double");
        tb.writeNumber(1.23);
        tb.writeFieldName("float");
        tb.writeNumber(4.56f);
        tb.writeFieldName("bigDec");
        tb.writeNumber(BigDecimal.valueOf(7.89));
        tb.writeFieldName("numStrInt");
        tb.writeNumber("12345");
        tb.writeFieldName("numStrFloat");
        tb.writeNumber("123.45");

        // Null numbers
        tb.writeFieldName("nullDec");
        tb.writeNumber((BigDecimal) null);
        tb.writeFieldName("nullBigInt");
        tb.writeNumber((BigInteger) null);

        tb.writeEndObject();

        // Serialize back to another TokenBuffer to exercise serialize() branches
        TokenBuffer tbDest = new TokenBuffer(null, false);
        tb.serialize(tbDest);
        
        JsonParser jp = tbDest.asParser();
        while (jp.nextToken() != null) {
            if (jp.getCurrentToken() == JsonToken.VALUE_NUMBER_INT) {
                assertNotNull(jp.getNumberValue());
                assertNotNull(jp.getBigIntegerValue());
            } else if (jp.getCurrentToken() == JsonToken.VALUE_NUMBER_FLOAT) {
                assertNotNull(jp.getDecimalValue());
                assertNotNull(jp.getDoubleValue());
                assertNotNull(jp.getFloatValue());
            }
        }
    }

    @Test
    public void testBooleanNullAndEmbeddedObjects() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartArray();
        tb.writeBoolean(true);
        tb.writeBoolean(false);
        tb.writeNull();
        tb.writeString((String) null);
        tb.writeString((SerializableString) null);
        tb.writeObject("EmbeddedObject");
        tb.writeTree(null);
        tb.writeEndArray();

        String str = tb.toString();
        assertNotNull(str);
        assertTrue(str.contains("START_ARRAY"));
        assertTrue(str.contains("VALUE_TRUE"));
        assertTrue(str.contains("VALUE_FALSE"));
        assertTrue(str.contains("VALUE_NULL"));
    }

    @Test
    public void testNativeIdsAndCopyStructure() throws IOException {
        TokenBuffer tb1 = new TokenBuffer(null, true);
        tb1.writeObjectId("obj-id-1");
        tb1.writeTypeId("type-id-1");
        tb1.writeStartObject();
        tb1.writeFieldName("field1");
        tb1.writeString("val1");
        tb1.writeEndObject();

        TokenBuffer tb2 = new TokenBuffer(null, true);
        tb2.append(tb1);

        JsonParser jp = tb2.asParser();
        TokenBuffer tb3 = new TokenBuffer(null, true);
        tb3.deserialize(jp, null);
        assertNotNull(tb3.firstToken());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedOperations() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        tb.writeRaw("unsupported");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedStreamBinary() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        tb.writeBinary(null, null, 0);
    }

    @Test
    public void testBinaryValueAccessors() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        byte[] data = new byte[] { 1, 2, 3, 4 };
        tb.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);

        JsonParser jp = tb.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, jp.nextToken());
        assertArrayEquals(data, jp.getBinaryValue(Base64Variants.getDefaultVariant()));

        ByteArrayBuilder out = new ByteArrayBuilder();
        jp.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testParserStringAndErrorBranches() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartObject();
        tb.writeFieldName("numStr");
        tb.writeString("999.88");
        tb.writeEndObject();

        JsonParser jp = tb.asParser();
        jp.nextToken(); // START_OBJECT
        jp.nextToken(); // FIELD_NAME
        jp.nextToken(); // VALUE_STRING representing number
        
        // Exercise NumberType and getNumberValue when value is String
        assertNotNull(jp.getNumberValue());
        assertNotNull(jp.getDecimalValue());
    }

    @Test(expected = JsonParseException.class)
    public void testCheckIsNumberError() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeString("notANumber");

        JsonParser jp = tb.asParser();
        jp.nextToken();
        jp.getIntValue(); // Should throw JsonParseException because current token is VALUE_STRING
    }
}