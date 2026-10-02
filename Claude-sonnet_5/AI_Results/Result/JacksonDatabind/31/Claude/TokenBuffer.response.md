# TokenBufferTest.java

```java
package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;

public class TokenBufferTest {

    private JsonFactory jsonFactory;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        jsonFactory = new JsonFactory();
        mapper = new ObjectMapper();
    }

    // ================= Constructors & basic accessors =================

    @Test
    public void testConstructorDeprecatedCodecOnly() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper);
        assertFalse(buf.canWriteTypeId());
        assertFalse(buf.canWriteObjectId());
        assertNull(buf.firstToken());
        buf.close();
        assertTrue(buf.isClosed());
    }

    @Test
    public void testConstructorWithNativeIds() {
        TokenBuffer buf = new TokenBuffer(mapper, true);
        assertTrue(buf.canWriteTypeId());
        assertTrue(buf.canWriteObjectId());
    }

    @Test
    public void testConstructorFromParser() throws IOException {
        JsonParser p = jsonFactory.createParser("{}");
        TokenBuffer buf = new TokenBuffer(p, null);
        assertNotNull(buf);
        p.close();
    }

    @Test
    public void testForceUseOfBigDecimal() {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        TokenBuffer buf2 = buf.forceUseOfBigDecimal(true);
        assertSame(buf, buf2);
    }

    @Test
    public void testVersion() {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        assertNotNull(buf.version());
    }

    @Test
    public void testFirstTokenNullWhenEmpty() {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        assertNull(buf.firstToken());
    }

    @Test
    public void testFirstTokenAfterWrite() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        assertEquals(JsonToken.START_OBJECT, buf.firstToken());
    }

    // ================= Structural writes =================

    @Test
    public void testWriteStartEndObjectArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName("a");
        buf.writeStartArray();
        buf.writeNumber(1);
        buf.writeEndArray();
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testWriteEndArrayUnbalanced() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEndArray(); // no parent context -> stays root
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testWriteEndObjectUnbalanced() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteFieldNameSerializableString() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName(new SerializedString("field1"));
        buf.writeString("value");
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("field1", p.getCurrentName());
    }

    // ================= Textual writes =================

    @Test
    public void testWriteStringNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeString((String) null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteStringNonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeString("hello");
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
    }

    @Test
    public void testWriteStringCharArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        char[] chars = "hello world".toCharArray();
        buf.writeString(chars, 0, 5);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
    }

    @Test
    public void testWriteStringSerializableStringNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeString((SerializableString) null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteStringSerializableStringNonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeString(new SerializedString("abc"));
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("abc", p.getText());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8StringUnsupported() throws IOException {
        new TokenBuffer(mapper, false).writeRawUTF8String(new byte[]{1,2,3}, 0, 3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8StringUnsupported() throws IOException {
        new TokenBuffer(mapper, false).writeUTF8String(new byte[]{1,2,3}, 0, 3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawStringUnsupported() throws IOException {
        new TokenBuffer(mapper, false).writeRaw("test");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawStringOffsetLenUnsupported() throws IOException {
        new TokenBuffer(mapper, false).writeRaw("test", 0, 2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawSerializableStringUnsupported() throws IOException {
        new TokenBuffer(mapper, false).writeRaw(new SerializedString("test"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawCharArrayUnsupported() throws IOException {
        new TokenBuffer(mapper, false).writeRaw("test".toCharArray(), 0, 2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawCharUnsupported() throws IOException {
        new TokenBuffer(mapper, false).writeRaw('c');
    }

    @Test
    public void testWriteRawValueString() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeRawValue("12345");
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteRawValueStringOffsetLenFull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeRawValue("12345", 0, 5); // offset==0 && len==length -> no substring
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteRawValueStringOffsetLenPartial() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeRawValue("12345", 1, 3); // offset>0 -> substring branch
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteRawValueCharArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeRawValue("12345".toCharArray(), 0, 3);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    // ================= Primitive number writes =================

    @Test
    public void testWriteNumberShort() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber((short) 5);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(5, p.getIntValue());
    }

    @Test
    public void testWriteNumberInt() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(42);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getIntValue());
    }

    @Test
    public void testWriteNumberLong() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(123456789012L);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123456789012L, p.getLongValue());
    }

    @Test
    public void testWriteNumberDouble() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(3.14);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testWriteNumberFloat() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(1.5f);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5f, p.getFloatValue(), 0.0001);
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber((BigDecimal) null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteNumberBigDecimalNonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        BigDecimal bd = new BigDecimal("3.1415");
        buf.writeNumber(bd);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(bd, p.getDecimalValue());
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber((BigInteger) null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteNumberBigIntegerNonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        BigInteger bi = BigInteger.valueOf(123456789);
        buf.writeNumber(bi);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(bi, p.getBigIntegerValue());
    }

    @Test
    public void testWriteNumberStringEncoded() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber("123.45");
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
    }

    @Test
    public void testWriteBooleanTrueFalse() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeBoolean(true);
        buf.writeBoolean(false);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
    }

    @Test
    public void testWriteNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNull();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    // ================= writeObject / writeTree =================

    @Test
    public void testWriteObjectNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeObject(null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteObjectByteArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeObject(new byte[]{1,2,3});
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteObjectRawValue() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeObject(new RawValue("raw"));
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteObjectNoCodec() throws IOException {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false);
        buf.writeObject("plain string");
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteObjectWithCodec() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeObject("plain string");
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("plain string", p.getText());
    }

    @Test
    public void testWriteTreeNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeTree(null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteTreeNoCodec() throws IOException {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false);
        TreeNode node = mock(TreeNode.class);
        buf.writeTree(node);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteTreeWithCodec() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        JsonNode node = mapper.createObjectNode().put("x", 1);
        buf.writeTree(node);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
    }

    // ================= Binary =================

    @Test
    public void testWriteBinary() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        byte[] data = new byte[]{1,2,3,4,5};
        buf.writeBinary(Base64Variants.getDefaultVariant(), data, 1, 3);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        Object emb = p.getEmbeddedObject();
        assertArrayEquals(new byte[]{2,3,4}, (byte[]) emb);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryInputStreamUnsupported() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeBinary(Base64Variants.getDefaultVariant(),
                new ByteArrayInputStream(new byte[]{1}), 1);
    }

    // ================= Native ids =================

    @Test
    public void testWriteTypeIdAndObjectId() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, true);
        buf.writeTypeId("TID");
        buf.writeObjectId("OID");
        buf.writeStartObject();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals("TID", p.getTypeId());
        assertEquals("OID", p.getObjectId());
    }

    @Test
    public void testNativeIdsPersistAcrossMultipleAppends() throws IOException {
        // NOTE: _hasNativeId is never reset to false once set true, so subsequent tokens
        // also get tagged with the same (stale) id values. This documents actual behavior.
        TokenBuffer buf = new TokenBuffer(mapper, true);
        buf.writeTypeId("T");
        buf.writeObjectId("O");
        buf.writeStartObject();
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals("T", p.getTypeId());
        assertEquals("O", p.getObjectId());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals("T", p.getTypeId());
        assertEquals("O", p.getObjectId());
    }

    // ================= Feature flags / config =================

    @Test
    public void testFeatureFlags() {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(buf.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buf.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(buf.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buf.setFeatureMask(0);
        assertEquals(0, buf.getFeatureMask());
    }

    @Test
    public void testUseDefaultPrettyPrinterNoOp() {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        JsonGenerator g = buf.useDefaultPrettyPrinter();
        assertSame(buf, g);
    }

    @Test
    public void testSetCodecGetCodec() {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false);
        assertNull(buf.getCodec());
        buf.setCodec(mapper);
        assertSame(mapper, buf.getCodec());
    }

    @Test
    public void testGetOutputContext() {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        assertNotNull(buf.getOutputContext());
    }

    @Test
    public void testCanWriteBinaryNatively() {
        assertTrue(new TokenBuffer(mapper, false).canWriteBinaryNatively());
    }

    @Test
    public void testFlushNoOp() throws IOException {
        new TokenBuffer(mapper, false).flush();
    }

    @Test
    public void testCloseAndIsClosed() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        assertFalse(buf.isClosed());
        buf.close();
        assertTrue(buf.isClosed());
    }

    // ================= copyCurrentEvent / copyCurrentStructure =================

    @Test
    public void testCopyCurrentStructureObject() throws IOException {
        JsonParser p = jsonFactory.createParser(
                "{\"a\":1,\"b\":\"str\",\"c\":true,\"d\":null,\"e\":[1,2]}");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.copyCurrentStructure(p);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, rp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals("a", rp.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(1, rp.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals(JsonToken.VALUE_STRING, rp.nextToken());
        assertEquals("str", rp.getText());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, rp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals(JsonToken.VALUE_NULL, rp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals(JsonToken.START_ARRAY, rp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(JsonToken.END_ARRAY, rp.nextToken());
        assertEquals(JsonToken.END_OBJECT, rp.nextToken());
        p.close();
    }

    @Test
    public void testCopyCurrentStructureFieldNameStart() throws IOException {
        JsonParser p = jsonFactory.createParser("{\"f\":123}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.copyCurrentStructure(p); // exercises t==FIELD_NAME branch directly
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals("f", rp.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        p.close();
    }

    @Test
    public void testCopyCurrentStructureWithNativeIds() throws IOException {
        TokenBuffer src = new TokenBuffer(mapper, true);
        src.writeTypeId("T1");
        src.writeObjectId("O1");
        src.writeStartObject();
        src.writeEndObject();
        JsonParser srcParser = src.asParser();
        srcParser.nextToken();

        TokenBuffer dest = new TokenBuffer(mapper, true);
        dest.copyCurrentStructure(srcParser);

        JsonParser rp = dest.asParser();
        assertEquals(JsonToken.START_OBJECT, rp.nextToken());
        assertEquals("T1", rp.getTypeId());
        assertEquals("O1", rp.getObjectId());
    }

    @Test
    public void testCopyCurrentEventFloatNumberTypesDefaultDouble() throws IOException {
        JsonParser p = jsonFactory.createParser("3.14");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.copyCurrentEvent(p);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, rp.nextToken());
        assertEquals(3.14, rp.getDoubleValue(), 0.001);
        p.close();
    }

    @Test
    public void testCopyCurrentEventNumberFloatTypeFloat() throws IOException {
        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_FLOAT);
        when(p.getNumberType()).thenReturn(JsonParser.NumberType.FLOAT);
        when(p.getFloatValue()).thenReturn(1.5f);

        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false);
        buf.copyCurrentEvent(p);

        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, rp.nextToken());
        assertEquals(1.5f, rp.getFloatValue(), 0.0001);
    }

    @Test
    public void testCopyCurrentEventFloatNumberTypeBigDecimalNoForce() throws IOException {
        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_FLOAT);
        when(p.getNumberType()).thenReturn(JsonParser.NumberType.BIG_DECIMAL);
        BigDecimal bd = new BigDecimal("123.456");
        when(p.getDecimalValue()).thenReturn(bd);

        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false); // _forceBigDecimal=false
        buf.copyCurrentEvent(p);

        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, rp.nextToken());
        assertEquals(bd, rp.getDecimalValue());
    }

    @Test
    public void testCopyCurrentEventForceBigDecimal() throws IOException {
        JsonParser p = jsonFactory.createParser("3.14");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(p, null).forceUseOfBigDecimal(true);
        buf.copyCurrentEvent(p);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, rp.nextToken());
        assertTrue(rp.getDecimalValue() instanceof BigDecimal);
        p.close();
    }

    @Test
    public void testCopyCurrentEventBigIntegerNumberType() throws IOException {
        JsonParser p = jsonFactory.createParser("123456789012345678901234567890");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.copyCurrentEvent(p);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(new BigInteger("123456789012345678901234567890"), rp.getBigIntegerValue());
        p.close();
    }

    @Test
    public void testCopyCurrentEventLongNumberTypeDefault() throws IOException {
        JsonParser p = jsonFactory.createParser(String.valueOf(Long.MAX_VALUE));
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.copyCurrentEvent(p);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(Long.MAX_VALUE, rp.getLongValue());
        p.close();
    }

    @Test
    public void testCopyCurrentEventStringWithTextCharacters() throws IOException {
        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(p.hasTextCharacters()).thenReturn(true);
        when(p.getTextCharacters()).thenReturn("hello".toCharArray());
        when(p.getTextOffset()).thenReturn(0);
        when(p.getTextLength()).thenReturn(5);

        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false);
        buf.copyCurrentEvent(p);

        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_STRING, rp.nextToken());
        assertEquals("hello", rp.getText());
    }

    @Test
    public void testCopyCurrentEventStringWithoutTextCharacters() throws IOException {
        JsonParser p = mock(JsonParser.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(p.hasTextCharacters()).thenReturn(false);
        when(p.getText()).thenReturn("world");

        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false);
        buf.copyCurrentEvent(p);

        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_STRING, rp.nextToken());
        assertEquals("world", rp.getText());
    }

    @Test
    public void testCopyCurrentEventEmbeddedObject() throws IOException {
        TokenBuffer srcBuf = new TokenBuffer(mapper, false);
        srcBuf.writeObject(new byte[]{9,9});
        JsonParser p = srcBuf.asParser();
        p.nextToken();

        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.copyCurrentEvent(p);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, rp.nextToken());
    }

    // ================= append(TokenBuffer) =================

    @Test
    public void testAppendOtherBuffer() throws IOException {
        TokenBuffer src = new TokenBuffer(mapper, false);
        src.writeStartArray();
        src.writeNumber(1);
        src.writeEndArray();

        TokenBuffer dest = new TokenBuffer(mapper, false);
        dest.writeStartObject();
        dest.writeFieldName("arr");
        TokenBuffer result = dest.append(src);
        assertSame(dest, result);
        dest.writeEndObject();

        JsonParser p = dest.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testAppendInheritsNativeIdCapability() throws IOException {
        TokenBuffer src = new TokenBuffer(mapper, true);
        src.writeStartArray();
        src.writeEndArray();

        TokenBuffer dest = new TokenBuffer(mapper, false);
        assertFalse(dest.canWriteTypeId());
        dest.append(src);
        assertTrue(dest.canWriteTypeId());
        assertTrue(dest.canWriteObjectId());
    }

    // ================= serialize =================

    @Test
    public void testSerializeAllTokenTypes() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName("a"); buf.writeString("str");
        buf.writeFieldName("b"); buf.writeNumber(1);
        buf.writeFieldName("c"); buf.writeNumber(1.5);
        buf.writeFieldName("d"); buf.writeBoolean(true);
        buf.writeFieldName("e"); buf.writeBoolean(false);
        buf.writeFieldName("f"); buf.writeNull();
        buf.writeFieldName("g"); buf.writeStartArray(); buf.writeEndArray();
        buf.writeEndObject();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        String json = sw.toString();
        assertTrue(json.contains("\"a\":\"str\""));
        assertTrue(json.contains("\"b\":1"));
        assertTrue(json.contains("\"d\":true"));
        assertTrue(json.contains("\"e\":false"));
        assertTrue(json.contains("\"f\":null"));
        assertTrue(json.contains("\"g\":[]"));
    }

    @Test
    public void testSerializeVariousNumberTypes() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartArray();
        buf.writeNumber((short) 3);
        buf.writeNumber(BigInteger.valueOf(999));
        buf.writeNumber(123456789012L);
        buf.writeNumber(BigDecimal.valueOf(1.23));
        buf.writeNumber(2.5f);
        buf.writeEndArray();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        assertTrue(sw.toString().startsWith("["));
    }

    @Test
    public void testSerializeNumberFloatFromString() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber("99.9");
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        assertEquals("99.9", sw.toString());
    }

    @Test
    public void testSerializeEmbeddedRawValue() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeRawValue("12345");
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        assertEquals("12345", sw.toString());
    }

    @Test
    public void testSerializeEmbeddedNonRawValueObject() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeObject(new byte[]{1,2,3});
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        gen.setCodec(mapper); // needed so gen.writeObject(...) works
        buf.serialize(gen);
        gen.close();
        assertNotNull(sw.toString());
    }

    @Test
    public void testSerializeSerializableStringFieldAndValue() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName(new SerializedString("k"));
        buf.writeString(new SerializedString("v"));
        buf.writeEndObject();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        assertEquals("{\"k\":\"v\"}", sw.toString());
    }

    @Test
    public void testSerializeWithNativeIdsUsesGenerator() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, true);
        buf.writeTypeId("TID");
        buf.writeObjectId("OID");
        buf.writeStartObject();
        buf.writeEndObject();

        JsonGenerator gen = mock(JsonGenerator.class);
        buf.serialize(gen);

        verify(gen).writeObjectId("OID");
        verify(gen).writeTypeId("TID");
        verify(gen).writeStartObject();
        verify(gen).writeEndObject();
    }

    // ================= toString =================

    @Test
    public void testToStringEmptyBuffer() {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        assertTrue(buf.toString().startsWith("[TokenBuffer:"));
    }

    @Test
    public void testToStringWithFieldName() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName("x");
        buf.writeNumber(1);
        buf.writeEndObject();
        String s = buf.toString();
        assertTrue(s.contains("FIELD_NAME"));
        assertTrue(s.contains("x"));
    }

    @Test
    public void testToStringWithNativeIds() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, true);
        buf.writeTypeId("TID1");
        buf.writeObjectId("OID1");
        buf.writeStartObject();
        buf.writeEndObject();
        String s = buf.toString();
        assertTrue(s.contains("typeId=TID1"));
        assertTrue(s.contains("objectId=OID1"));
    }

    @Test
    public void testToStringTruncatedMoreThan100Tokens() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartArray();
        for (int i = 0; i < 150; i++) {
            buf.writeNumber(i);
        }
        buf.writeEndArray();
        assertTrue(buf.toString().contains("truncated"));
    }

    // ================= deserialize =================

    @Test
    public void testDeserializeNormalStructure() throws IOException {
        JsonParser p = jsonFactory.createParser("{\"a\":1}");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(mapper, false);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TokenBuffer result = buf.deserialize(p, ctxt);
        assertSame(buf, result);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, rp.nextToken());
        p.close();
    }

    @Test
    public void testDeserializeStartingFromFieldName() throws IOException {
        JsonParser p = jsonFactory.createParser("{\"a\":1,\"b\":2}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME a
        TokenBuffer buf = new TokenBuffer(mapper, false);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TokenBuffer result = buf.deserialize(p, ctxt);
        assertSame(buf, result);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, rp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals("a", rp.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals("b", rp.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(JsonToken.END_OBJECT, rp.nextToken());
        p.close();
    }

    @Test
    public void testDeserializeThrowsWhenEndTokenNotObject() throws IOException {
        // Controlled mock scenario: only way to force the "t != END_OBJECT" exception branch,
        // since a real JsonParser cannot produce FIELD_NAME loop ending with non-END_OBJECT easily.
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(p.getCurrentTokenId()).thenReturn(JsonToken.FIELD_NAME.id());
        when(p.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.VALUE_NULL);
        when(p.getCurrentName()).thenReturn("a");
        when(p.nextToken())
            .thenReturn(JsonToken.VALUE_NULL)
            .thenReturn(JsonToken.START_ARRAY);

        JsonMappingException ex = new JsonMappingException("boom");
        when(ctxt.mappingException(anyString())).thenReturn(ex);

        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false);
        try {
            buf.deserialize(p, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException caught) {
            assertSame(ex, caught);
        }
    }

    // ================= asParser variants =================

    @Test
    public void testAsParserWithCodec() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(1);
        JsonParser p = buf.asParser(mapper);
        assertSame(mapper, p.getCodec());
    }

    @Test
    public void testAsParserFromSourceParser() throws IOException {
        JsonParser src = jsonFactory.createParser("1");
        src.nextToken();
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(1);
        JsonParser p = buf.asParser(src);
        assertNotNull(p.getTokenLocation());
        src.close();
    }

    // ================= Parser extended behavior =================

    @Test
    public void testParserPeekNextToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartArray();
        buf.writeNumber(1);
        buf.writeEndArray();
        TokenBuffer.Parser p = (TokenBuffer.Parser) buf.asParser();
        assertEquals(JsonToken.START_ARRAY, p.peekNextToken());
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.peekNextToken());
    }

    @Test
    public void testParserNextFieldNameFastPath() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName("name1");
        buf.writeNumber(1);
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken(); // START_OBJECT
        assertEquals("name1", p.nextFieldName());
    }

    @Test
    public void testParserNextFieldNameReturnsNullWhenNotFieldName() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartArray();
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        assertNull(p.nextFieldName());
    }

    @Test
    public void testParserCloseAndIsClosedAndNextTokenAfterClose() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(1);
        JsonParser p = buf.asParser();
        assertFalse(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
        assertNull(p.nextToken());
    }

    @Test
    public void testParserGetCurrentNameForStartObject() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName("outer");
        buf.writeStartObject();
        buf.writeEndObject();
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken(); p.nextToken(); p.nextToken();
        assertEquals("outer", p.getCurrentName());
    }

    @Test
    public void testParserOverrideCurrentName() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName("old");
        buf.writeNumber(1);
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        p.nextToken();
        p.overrideCurrentName("new");
        assertEquals("new", p.getCurrentName());
    }

    @Test
    public void testParserTextAccessors() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeString("abcdef");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("abcdef", p.getText());
        assertArrayEquals("abcdef".toCharArray(), p.getTextCharacters());
        assertEquals(6, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertFalse(p.hasTextCharacters());
    }

    @Test
    public void testParserGetTextNullToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNull();
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("null", p.getText());
    }

    @Test
    public void testParserGetTextForNumericTokens() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(123);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("123", p.getText());
    }

    @Test
    public void testParserGetIntValueOptimizedPath() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(99);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(99, p.getIntValue());
    }

    @Test
    public void testParserGetIntValueFromNonIntNumber() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(3.99);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(3, p.getIntValue());
    }

    @Test
    public void testParserGetBigIntegerValueFromInt() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(7);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(7), p.getBigIntegerValue());
    }

    @Test
    public void testParserGetBigIntegerValueFromBigDecimal() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(new BigDecimal("123.99"));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(123), p.getBigIntegerValue());
    }

    @Test
    public void testParserGetDecimalValueFromIntLong() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(5);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigDecimal.valueOf(5L), p.getDecimalValue());
    }

    @Test
    public void testParserGetDecimalValueFromBigInteger() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(BigInteger.valueOf(500));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(new BigDecimal(BigInteger.valueOf(500)), p.getDecimalValue());
    }

    @Test
    public void testParserGetDecimalValueFromDouble() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(2.5);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigDecimal.valueOf(2.5), p.getDecimalValue());
    }

    @Test
    public void testParserGetNumberTypeShortMapsToInt() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber((short) 3);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonParser.NumberType.INT, p.getNumberType());
    }

    @Test
    public void testParserGetNumberValueFromStringWithDot() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber("3.14");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testParserGetNumberValueFromStringInteger() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber("123");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(123L, p.getLongValue());
    }

    @Test(expected = JsonParseException.class)
    public void testParserCheckIsNumberThrowsForNonNumericToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeString("notANumber");
        JsonParser p = buf.asParser();
        p.nextToken();
        p.getNumberValue();
    }

    @Test
    public void testParserGetEmbeddedObject() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        byte[] data = {1,2,3};
        buf.writeObject(data);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertSame(data, p.getEmbeddedObject());
    }

    @Test
    public void testParserGetEmbeddedObjectReturnsNullForOtherToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(1);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertNull(p.getEmbeddedObject());
    }

    @Test
    public void testParserGetBinaryValueFromEmbeddedByteArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        byte[] data = {5,6,7};
        buf.writeObject(data);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertArrayEquals(data, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testParserGetBinaryValueFromBase64String() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeString("YWJj"); // base64("abc")
        JsonParser p = buf.asParser();
        p.nextToken();
        assertArrayEquals("abc".getBytes(), p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test(expected = JsonParseException.class)
    public void testParserGetBinaryValueWrongTokenThrows() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeNumber(1);
        JsonParser p = buf.asParser();
        p.nextToken();
        p.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testParserReadBinaryValue() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        byte[] data = {1,2,3};
        buf.writeObject(data);
        JsonParser p = buf.asParser();
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(3, len);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testParserCanReadTypeIdObjectId() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, true);
        buf.writeStartObject();
        TokenBuffer.Parser p = (TokenBuffer.Parser) buf.asParser();
        assertTrue(p.canReadTypeId());
        assertTrue(p.canReadObjectId());
    }

    // ================= Segment overflow (>16 tokens per segment) =================

    @Test
    public void testSegmentOverflowCreatesNewSegment() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartArray();
        for (int i = 0; i < 20; i++) { // exceeds TOKENS_PER_SEGMENT (16)
            buf.writeNumber(i);
        }
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        for (int i = 0; i < 20; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }
}
```

## สรุป Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructorDeprecatedCodecOnly | deprecated ctor → delegate ctor, close()/isClosed() |
| testConstructorWithNativeIds | hasNativeIds=true path, canWriteTypeId/ObjectId |
| testConstructorFromParser | ctor(JsonParser) delegate ctor(JsonParser,null) |
| testForceUseOfBigDecimal | forceUseOfBigDecimal() return-this |
| testVersion | version() non-null |
| testFirstTokenNullWhenEmpty / testFirstTokenAfterWrite | firstToken(): `_first!=null` true/false |
| testWriteStartEndObjectArray | writeStart/EndArray/Object, writeFieldName(String) |
| testWriteEndArrayUnbalanced / testWriteEndObjectUnbalanced | `c!=null` false branch (root, no parent) |
| testWriteFieldNameSerializableString | writeFieldName(SerializableString) |
| testWriteString* (Null/NonNull/CharArray/SerializableStringNull/NonNull) | writeString() null vs non-null branches |
| testWriteRaw*Unsupported (7 tests) | all writeRaw*/UTF8String → `_reportUnsupportedOperation` |
| testWriteRawValueString / OffsetLenFull / OffsetLenPartial / CharArray | writeRawValue(): substring condition (offset>0 \|\| len!=length) true/false |
| testWriteNumberShort/Int/Long/Double/Float | primitive numeric writes |
| testWriteNumberBigDecimalNull/NonNull, BigIntegerNull/NonNull | null-check branches |
| testWriteNumberStringEncoded | writeNumber(String) |
| testWriteBooleanTrueFalse / testWriteNull | writeBoolean ternary, writeNull |
| testWriteObjectNull/ByteArray/RawValue/NoCodec/WithCodec | writeObject(): null, byte[]/RawValue, codec null/non-null branches |
| testWriteTreeNull/NoCodec/WithCodec | writeTree(): null, codec null/non-null |
| testWriteBinary / InputStreamUnsupported | writeBinary(byte[]) via writeObject, InputStream overload throws |
| testWriteTypeIdAndObjectId / NativeIdsPersist... | writeTypeId/ObjectId, `_hasNativeId` never reset (documents actual behavior) |
| testFeatureFlags / UseDefaultPrettyPrinterNoOp / SetCodecGetCodec / GetOutputContext / CanWriteBinaryNatively / FlushNoOp / CloseAndIsClosed | config/capability methods |
| testCopyCurrentStructureObject | copyCurrentStructure recursive START_OBJECT/ARRAY loops, all copyCurrentEvent switch cases |
| testCopyCurrentStructureFieldNameStart | copyCurrentStructure `t==FIELD_NAME` entry branch |
| testCopyCurrentStructureWithNativeIds | `_mayHaveNativeIds` true → `_checkNativeIds` |
| testCopyCurrentEventFloatNumberTypesDefaultDouble / NumberFloatTypeFloat / FloatNumberTypeBigDecimalNoForce / ForceBigDecimal | VALUE_NUMBER_FLOAT: forceBigDecimal true/false, inner switch BIG_DECIMAL/FLOAT/default(DOUBLE) |
| testCopyCurrentEventBigIntegerNumberType / LongNumberTypeDefault | VALUE_NUMBER_INT inner switch: BIG_INTEGER, default(LONG) |
| testCopyCurrentEventStringWithTextCharacters / WithoutTextCharacters | VALUE_STRING hasTextCharacters() true/false |
| testCopyCurrentEventEmbeddedObject | VALUE_EMBEDDED_OBJECT → writeObject() |
| testAppendOtherBuffer / AppendInheritsNativeIdCapability | append(): native id inherit `if(!_hasNativeTypeIds)` true/false, copy loop |
| testSerializeAllTokenTypes / VariousNumberTypes / NumberFloatFromString / EmbeddedRawValue / EmbeddedNonRawValueObject / SerializableStringFieldAndValue / WithNativeIdsUsesGenerator | serialize(): all JsonToken switch cases, Serializable/String, RawValue/else, native id `hasIds` branch |
| testToStringEmptyBuffer / WithFieldName / WithNativeIds / TruncatedMoreThan100Tokens | toString(): FIELD_NAME formatting, native ids append, MAX_COUNT truncation `count>=MAX_COUNT` |
| testDeserializeNormalStructure | deserialize(): `getCurrentTokenId()!=FIELD_NAME.id()` true branch |
| testDeserializeStartingFromFieldName | do-while normal termination `t==END_OBJECT` |
| testDeserializeThrowsWhenEndTokenNotObject | do-while abnormal termination → `ctxt.mappingException` throw branch |
| testAsParserWithCodec / FromSourceParser | asParser(codec)/asParser(JsonParser) overloads |
| testParserPeekNextToken | Parser.peekNextToken() incl. segment-boundary ptr reset |
| testParserNextFieldNameFastPath / ReturnsNullWhenNotFieldName | nextFieldName() fast-path true/false |
| testParserCloseAndIsClosedAndNextTokenAfterClose | Parser.close/isClosed, nextToken() `_closed` guard |
| testParserGetCurrentNameForStartObject / OverrideCurrentName | getCurrentName()/overrideCurrentName() START_OBJECT special-case |
| testParserTextAccessors / GetTextNullToken / GetTextForNumericTokens | getText() branches: VALUE_STRING, null, numeric, default asString() |
| testParserGetIntValueOptimizedPath / FromNonIntNumber | getIntValue() fast path vs fallback |
| testParserGetBigIntegerValueFromInt / FromBigDecimal | getBigIntegerValue() branches |
| testParserGetDecimalValueFromIntLong / FromBigInteger / FromDouble | getDecimalValue() switch branches |
| testParserGetNumberTypeShortMapsToInt | getNumberType() Short→INT branch |
| testParserGetNumberValueFromStringWithDot / FromStringInteger | getNumberValue() String-parsing branches |
| testParserCheckIsNumberThrowsForNonNumericToken | `_checkIsNumber()` exception branch |
| testParserGetEmbeddedObject / ReturnsNullForOtherToken | getEmbeddedObject() token-check branch |
| testParserGetBinaryValueFromEmbeddedByteArray / FromBase64String / WrongTokenThrows | getBinaryValue() all branches incl. exception |
| testParserReadBinaryValue | readBinaryValue() data!=null branch |
| testParserCanReadTypeIdObjectId | canReadTypeId/ObjectId() |
| testSegmentOverflowCreatesNewSegment | Segment.append() overflow → new Segment / Parser.nextToken() segment-advance branch |

**หมายเหตุ:** สาขาที่ไม่สามารถเข้าถึงได้ผ่าน public API ปกติ (เช่น `serialize()`'s VALUE_NUMBER_FLOAT `n==null` branch, VALUE_NUMBER_INT default branch, และ `default: throw RuntimeException` ใน switch ทั้งสอง) ไม่ได้เขียนเทสเนื่องจากเป็น dead-code path ตามซอร์สที่ให้มา (ข้อกำหนดที่ 4)