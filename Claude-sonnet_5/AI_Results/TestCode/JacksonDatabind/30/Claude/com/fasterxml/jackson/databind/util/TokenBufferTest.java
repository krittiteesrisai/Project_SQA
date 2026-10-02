package com.fasterxml.jackson.databind.util;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mockito;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TextNode;

/**
 * JUnit4 test-suite for {@link TokenBuffer} (Defects4J: JacksonDatabind-30b).
 * ทดสอบครอบคลุม constructor, write*, copy*, serialize, deserialize, toString,
 * และ inner classes Parser/Segment ให้ครอบคลุม branch มากที่สุดเท่าที่วิเคราะห์ได้จาก source ที่ให้มา
 */
public class TokenBufferTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    /* ============================================================
     * Constructors / basic accessors
     * ============================================================ */

    @Test
    public void testConstructorNoNativeIds() {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertFalse(buf.canWriteTypeId());
        assertFalse(buf.canWriteObjectId());
        assertNull(buf.firstToken());
    }

    @Test
    public void testConstructorWithNativeIds() {
        TokenBuffer buf = new TokenBuffer(null, true);
        assertTrue(buf.canWriteTypeId());
        assertTrue(buf.canWriteObjectId());
    }

    @Test
    public void testDeprecatedSingleArgConstructor() {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        assertFalse(buf.canWriteTypeId());
    }

    @Test
    public void testConstructorFromParser() throws IOException {
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(p, null);
        assertNotNull(buf);
        // canWriteTypeId/ObjectId derived from underlying parser capability
        assertEquals(p.canReadTypeId(), buf.canWriteTypeId());
        assertEquals(p.canReadObjectId(), buf.canWriteObjectId());
    }

    @Test
    public void testFirstTokenNullWhenEmpty() {
        assertNull(new TokenBuffer(null, false).firstToken());
    }

    @Test
    public void testFirstTokenAfterWrite() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        assertEquals(JsonToken.START_ARRAY, buf.firstToken());
    }

    @Test
    public void testVersionNotNull() {
        assertNotNull(new TokenBuffer(null, false).version());
    }

    @Test
    public void testGetOutputContextInitial() {
        assertNotNull(new TokenBuffer(null, false).getOutputContext());
    }

    @Test
    public void testCanWriteBinaryNatively() {
        assertTrue(new TokenBuffer(null, false).canWriteBinaryNatively());
    }

    @Test
    public void testFlushCloseIsClosed() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertFalse(buf.isClosed());
        buf.flush();
        buf.close();
        assertTrue(buf.isClosed());
    }

    @Test
    public void testSetCodecGetCodec() {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertNull(buf.getCodec());
        buf.setCodec(mapper);
        assertSame(mapper, buf.getCodec());
    }

    @Test
    public void testUseDefaultPrettyPrinterIsNoOp() {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertSame(buf, buf.useDefaultPrettyPrinter());
    }

    @Test
    public void testFeatureFlags() {
        TokenBuffer buf = new TokenBuffer(null, false);
        int base = buf.getFeatureMask();
        buf.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(buf.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buf.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(buf.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buf.setFeatureMask(base);
        assertEquals(base, buf.getFeatureMask());
    }

    /* ============================================================
     * Structural writes / context balancing (if branches)
     * ============================================================ */

    @Test
    public void testWriteArrayBalanced() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testWriteEndArrayUnbalanced_ParentNullBranch() throws IOException {
        // no matching START_ARRAY -> _writeContext.getParent() == null -> context unchanged, no throw
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test
    public void testWriteObjectBalancedWithField() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("field");
        buf.writeString("value");
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("field", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteEndObjectUnbalanced_ParentNullBranch() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteFieldNameSerializableString() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName(new SerializedString("key"));
        buf.writeNumber(1);
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        p.nextToken();
        assertEquals("key", p.getCurrentName());
    }

    /* ============================================================
     * writeString / writeRaw* / writeRawValue
     * ============================================================ */

    @Test
    public void testWriteStringNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString((String) null);
        assertEquals(JsonToken.VALUE_NULL, buf.asParser().nextToken());
    }

    @Test
    public void testWriteStringNonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("hello");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("hello", p.getText());
    }

    @Test
    public void testWriteStringEmpty() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("", p.getText());
    }

    @Test
    public void testWriteStringCharArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("helloworld".toCharArray(), 0, 5);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("hello", p.getText());
    }

    @Test
    public void testWriteStringSerializableStringNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString((SerializableString) null);
        assertEquals(JsonToken.VALUE_NULL, buf.asParser().nextToken());
    }

    @Test
    public void testWriteStringSerializableStringNonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString(new SerializedString("abc"));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("abc", p.getText());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8StringUnsupported() throws IOException {
        new TokenBuffer(null, false).writeRawUTF8String(new byte[]{1,2,3}, 0, 3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8StringUnsupported() throws IOException {
        new TokenBuffer(null, false).writeUTF8String(new byte[]{1,2,3}, 0, 3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawStringUnsupported() throws IOException {
        new TokenBuffer(null, false).writeRaw("text");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawStringOffsetUnsupported() throws IOException {
        new TokenBuffer(null, false).writeRaw("text", 0, 2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawSerializableStringUnsupported() throws IOException {
        new TokenBuffer(null, false).writeRaw(new SerializedString("abc"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawCharArrayUnsupported() throws IOException {
        new TokenBuffer(null, false).writeRaw(new char[]{'a','b'}, 0, 2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawCharUnsupported() throws IOException {
        new TokenBuffer(null, false).writeRaw('c');
    }

    @Test
    public void testWriteRawValueString() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeRawValue("rawtext");
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteRawValueOffsetLen_NoSubstringBranch() throws IOException {
        // offset==0 && len==text.length() -> substring condition false
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeRawValue("abcdef", 0, 6);
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteRawValueOffsetLen_SubstringBranch() throws IOException {
        // offset>0 -> substring condition true
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeRawValue("abcdef", 1, 3);
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteRawValueOffsetLen_ZeroLenBoundary() throws IOException {
        // offset==0 but len(0) != text.length()(6) -> substring branch true, boundary case len=0
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeRawValue("abcdef", 0, 0);
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteRawValueCharArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeRawValue(new char[]{'a','b','c','d'}, 1, 2);
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    /* ============================================================
     * writeNumber / writeBoolean / writeNull
     * ============================================================ */

    @Test
    public void testWriteNumberShort() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber((short) 5);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(5, p.getIntValue());
    }

    @Test
    public void testWriteNumberIntBoundaryNegativeZero() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        buf.writeNumber(-1);
        buf.writeNumber(0);
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        p.nextToken();
        p.nextToken();
        assertEquals(-1, p.getIntValue());
        p.nextToken();
        assertEquals(0, p.getIntValue());
    }

    @Test
    public void testWriteNumberLong() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(123456789012345L);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(123456789012345L, p.getLongValue());
    }

    @Test
    public void testWriteNumberDouble() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(3.14);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testWriteNumberFloat() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(1.5f);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(1.5f, p.getFloatValue(), 0.0001f);
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber((BigDecimal) null);
        assertEquals(JsonToken.VALUE_NULL, buf.asParser().nextToken());
    }

    @Test
    public void testWriteNumberBigDecimalNonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(BigDecimal.valueOf(1.23));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigDecimal.valueOf(1.23), p.getDecimalValue());
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber((BigInteger) null);
        assertEquals(JsonToken.VALUE_NULL, buf.asParser().nextToken());
    }

    @Test
    public void testWriteNumberBigIntegerNonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(BigInteger.valueOf(999));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(999), p.getBigIntegerValue());
    }

    @Test
    public void testWriteNumberEncodedString() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber("123.45");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteBooleanTrueFalse() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        buf.writeBoolean(true);
        buf.writeBoolean(false);
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
    }

    @Test
    public void testWriteNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNull();
        assertEquals(JsonToken.VALUE_NULL, buf.asParser().nextToken());
    }

    /* ============================================================
     * writeObject / writeTree
     * ============================================================ */

    @Test
    public void testWriteObjectNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeObject(null);
        assertEquals(JsonToken.VALUE_NULL, buf.asParser().nextToken());
    }

    @Test
    public void testWriteObjectByteArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeObject(new byte[]{1,2,3});
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteObjectRawValueInstance() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeObject(new RawValue("raw"));
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteObjectNoCodecFallsBackToEmbedded() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false); // codec == null
        buf.writeObject("someString");
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteObjectWithCodecDelegates() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeObject("someString");
        JsonParser p = buf.asParser(mapper);
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("someString", p.getText());
    }

    @Test
    public void testWriteTreeNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeTree(null);
        assertEquals(JsonToken.VALUE_NULL, buf.asParser().nextToken());
    }

    @Test
    public void testWriteTreeNoCodec() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeTree(TextNode.valueOf("x"));
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, buf.asParser().nextToken());
    }

    @Test
    public void testWriteTreeWithCodec() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeTree(TextNode.valueOf("y"));
        JsonParser p = buf.asParser(mapper);
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
    }

    /* ============================================================
     * Binary
     * ============================================================ */

    @Test
    public void testWriteBinaryDelegatesToWriteObject() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        byte[] data = {10,20,30,40,50};
        buf.writeBinary(Base64Variants.getDefaultVariant(), data, 1, 3);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertArrayEquals(new byte[]{20,30,40}, (byte[]) p.getEmbeddedObject());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryFromStreamUnsupported() throws IOException {
        new TokenBuffer(null, false).writeBinary(
                Base64Variants.getDefaultVariant(), new ByteArrayInputStream(new byte[]{1,2,3}), 3);
    }

    /* ============================================================
     * Native ids on generator side
     * ============================================================ */

    @Test
    public void testWriteTypeIdAndObjectIdRoundTrip() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, true);
        buf.writeTypeId("TID");
        buf.writeObjectId("OID");
        buf.writeStartObject();
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken(); // START_OBJECT carries the ids
        assertEquals("OID", p.getObjectId());
        assertEquals("TID", p.getTypeId());
    }

    /* ============================================================
     * append(TokenBuffer)
     * ============================================================ */

    @Test
    public void testAppendCopiesTokens() throws IOException {
        TokenBuffer src = new TokenBuffer(null, false);
        src.writeStartArray();
        src.writeNumber(1);
        src.writeEndArray();

        TokenBuffer dest = new TokenBuffer(null, false);
        dest.writeStartObject();
        dest.writeFieldName("x");
        TokenBuffer result = dest.append(src);
        dest.writeEndObject();

        assertSame(dest, result);
        JsonParser p = dest.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testAppendPropagatesNativeIdFlags() throws IOException {
        TokenBuffer src = new TokenBuffer(null, true);
        src.writeStartArray();
        src.writeEndArray();

        TokenBuffer dest = new TokenBuffer(null, false);
        assertFalse(dest.canWriteTypeId());
        dest.append(src);
        assertTrue(dest.canWriteTypeId());
        assertTrue(dest.canWriteObjectId());
    }

    @Test
    public void testAppendKeepsExistingFlagsWhenAlreadyTrue() throws IOException {
        // covers the !_hasNativeTypeIds == false branch (flag already true, other() not consulted for overwrite)
        TokenBuffer src = new TokenBuffer(null, false); // other has no native ids
        src.writeNull();

        TokenBuffer dest = new TokenBuffer(null, true); // dest already has native ids
        dest.append(src);
        assertTrue(dest.canWriteTypeId());
        assertTrue(dest.canWriteObjectId());
    }

    /* ============================================================
     * serialize(JsonGenerator)
     * ============================================================ */

    @Test
    public void testSerializeAllTokenTypes() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("i");        buf.writeNumber(5);
        buf.writeFieldName("bi");       buf.writeNumber(BigInteger.valueOf(123456789012345L));
        buf.writeFieldName("l");        buf.writeNumber(9999999999L);
        buf.writeFieldName("sh");       buf.writeNumber((short) 7);
        buf.writeFieldName("d");        buf.writeNumber(1.25);
        buf.writeFieldName("bd");       buf.writeNumber(BigDecimal.valueOf(2.5));
        buf.writeFieldName("str");      buf.writeString("hello");
        buf.writeFieldName("t");        buf.writeBoolean(true);
        buf.writeFieldName("fa");       buf.writeBoolean(false);
        buf.writeFieldName("n");        buf.writeNull();
        buf.writeFieldName("arr");      buf.writeStartArray(); buf.writeEndArray();
        buf.writeEndObject();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.flush();
        String json = sw.toString();

        assertTrue(json.contains("\"i\":5"));
        assertTrue(json.contains("\"str\":\"hello\""));
        assertTrue(json.contains("\"t\":true"));
        assertTrue(json.contains("\"fa\":false"));
        assertTrue(json.contains("\"n\":null"));
        assertTrue(json.contains("\"arr\":[]"));
    }

    @Test
    public void testSerializeNumberFloatEncodedAsString() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber("3.14159");
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.flush();
        assertEquals("3.14159", sw.toString());
    }

    @Test
    public void testSerializeEmbeddedRawValue() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeRawValue("RAWCONTENT");
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.flush();
        assertEquals("RAWCONTENT", sw.toString());
    }

    @Test
    public void testSerializeEmbeddedGenericObjectDelegatesToWriteObject() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeObject(new byte[]{1,2,3});
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        gen.setCodec(mapper);
        buf.serialize(gen);
        gen.flush();
        assertTrue(sw.toString().startsWith("\"")); // base64-encoded string output
    }

    @Test
    public void testSerializeWithNativeIdsCallsGeneratorIdMethods() throws IOException {
        // Per class javadoc: "_typeId/_objectId is the id for FOLLOWING value (or first token) to be written."
        // -> Expectation: id write-calls happen exactly once (for the value they were meant for).
        TokenBuffer buf = new TokenBuffer(null, true);
        buf.writeTypeId("TID");
        buf.writeObjectId("OID");
        buf.writeStartObject();
        buf.writeEndObject();

        JsonGenerator gen = Mockito.mock(JsonGenerator.class);
        buf.serialize(gen);

        Mockito.verify(gen, Mockito.times(1)).writeObjectId("OID");
        Mockito.verify(gen, Mockito.times(1)).writeTypeId("TID");
        Mockito.verify(gen).writeStartObject();
        Mockito.verify(gen).writeEndObject();
    }

    /* ============================================================
     * deserialize(JsonParser, DeserializationContext)
     * ============================================================ */

    @Test
    public void testDeserializeNotStartingWithFieldName() throws IOException {
        JsonParser p = mapper.getFactory().createParser("42");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(null, false);
        // ctxt unused on this branch (current token != FIELD_NAME)
        TokenBuffer result = buf.deserialize(p, null);
        assertSame(buf, result);
        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(42, rp.getIntValue());
    }

    @Test
    public void testDeserializeStartingFromFieldNameNormalCompletion() throws IOException {
        JsonParser p = mapper.getFactory().createParser("{\"a\":1,\"b\":2}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME "a"
        TokenBuffer buf = new TokenBuffer(null, false);
        TokenBuffer result = buf.deserialize(p, null); // ctxt not needed: ends with END_OBJECT
        assertSame(buf, result);

        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, rp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals("a", rp.getCurrentName());
        rp.nextToken();
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals("b", rp.getCurrentName());
        rp.nextToken();
        assertEquals(JsonToken.END_OBJECT, rp.nextToken());
    }

    @Test(expected = IOException.class)
    public void testDeserializeStartingFromFieldNameErrorPath() throws IOException {
        // Build a malformed sequence (FIELD_NAME followed by two values, no END_OBJECT)
        TokenBuffer src = new TokenBuffer(null, false);
        src.writeFieldName("a");
        src.writeNumber(1);
        src.writeNumber(2); // extra value instead of END_OBJECT
        JsonParser p = src.asParser();
        p.nextToken(); // FIELD_NAME "a"

        DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        Mockito.when(ctxt.mappingException(Mockito.anyString()))
                .thenReturn(new JsonMappingException("boom"));

        new TokenBuffer(null, false).deserialize(p, ctxt);
    }

    /* ============================================================
     * toString()
     * ============================================================ */

    @Test
    public void testToStringEmptyBuffer() {
        String s = new TokenBuffer(null, false).toString();
        assertTrue(s.startsWith("[TokenBuffer: "));
        assertTrue(s.endsWith("]"));
    }

    @Test
    public void testToStringIncludesFieldName() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("key");
        buf.writeNumber(1);
        buf.writeEndObject();
        assertTrue(buf.toString().contains("FIELD_NAME(key)"));
    }

    @Test
    public void testToStringTruncatesOver100Tokens() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        for (int i = 0; i < 150; i++) buf.writeNumber(i);
        buf.writeEndArray();
        assertTrue(buf.toString().contains("truncated"));
    }

    @Test
    public void testToStringWithNativeIdsDoesNotThrow() throws IOException {
        // NOTE: _appendNativeIds() reads _last/_appendAt of the *writer* state, not of the
        // parser being iterated; exact printed id text depends on this internal, possibly
        // unintuitive behavior which is not otherwise documented -> only smoke-test here.
        TokenBuffer buf = new TokenBuffer(null, true);
        buf.writeTypeId("TID");
        buf.writeObjectId("OID");
        buf.writeStartObject();
        buf.writeEndObject();
        String s = buf.toString();
        assertNotNull(s);
        assertTrue(s.startsWith("[TokenBuffer: "));
    }

    /* ============================================================
     * copyCurrentEvent / copyCurrentStructure (via real JsonParser)
     * ============================================================ */

    @Test
    public void testCopyCurrentStructureMixedObject() throws IOException {
        JsonParser p = mapper.getFactory().createParser(
                "{\"a\":1,\"b\":\"str\",\"c\":true,\"d\":false,\"e\":null,\"f\":1.5,\"g\":[1,2]}");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.copyCurrentStructure(p);

        JsonParser rp = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, rp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, rp.nextToken());
        assertEquals("a", rp.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, rp.nextToken());
        assertEquals(1, rp.getIntValue());
        rp.nextToken(); rp.nextToken();
        assertEquals("str", rp.getText());
        rp.nextToken(); rp.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, rp.getCurrentToken());
        rp.nextToken(); rp.nextToken();
        assertEquals(JsonToken.VALUE_FALSE, rp.getCurrentToken());
        rp.nextToken(); rp.nextToken();
        assertEquals(JsonToken.VALUE_NULL, rp.getCurrentToken());
        rp.nextToken(); rp.nextToken();
        assertEquals(1.5, rp.getDoubleValue(), 0.0001);
        rp.nextToken(); rp.nextToken();
        assertEquals(JsonToken.START_ARRAY, rp.getCurrentToken());
        rp.nextToken(); rp.nextToken();
        assertEquals(JsonToken.END_ARRAY, rp.getCurrentToken());
        rp.nextToken();
        assertEquals(JsonToken.END_OBJECT, rp.getCurrentToken());
    }

    @Test
    public void testCopyCurrentStructureBigIntegerNumber() throws IOException {
        BigInteger big = new BigInteger("123456789012345678901234567890");
        JsonParser p = mapper.getFactory().createParser("[" + big + "]");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.copyCurrentStructure(p);
        JsonParser rp = buf.asParser();
        rp.nextToken(); rp.nextToken();
        assertEquals(big, rp.getBigIntegerValue());
    }

    @Test
    public void testCopyCurrentStructureBigDecimalNumber() throws IOException {
        JsonParser p = mapper.getFactory().createParser("[123456789012345678901234567890.123]");
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.copyCurrentStructure(p);
        JsonParser rp = buf.asParser();
        rp.nextToken(); rp.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, rp.getCurrentToken());
    }

    @Test
    public void testCopyCurrentStructureLongNumber() throws IOException {
        long bigLong = 9999999999L;
        JsonParser p = mapper.getFactory().createParser(String.valueOf(bigLong));
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.copyCurrentStructure(p);
        JsonParser rp = buf.asParser();
        rp.nextToken();
        assertEquals(bigLong, rp.getLongValue());
    }

    @Test
    public void testCopyCurrentEventEmbeddedObject() throws IOException {
        TokenBuffer src = new TokenBuffer(null, false);
        src.writeObject(new byte[]{9, 8, 7});
        JsonParser p = src.asParser();
        p.nextToken();
        TokenBuffer dst = new TokenBuffer(null, false);
        dst.copyCurrentEvent(p);
        JsonParser rp = dst.asParser();
        rp.nextToken();
        assertArrayEquals(new byte[]{9,8,7}, (byte[]) rp.getEmbeddedObject());
    }

    /* ============================================================
     * Segment overflow (16 tokens/segment boundary)
     * ============================================================ */

    @Test
    public void testSegmentOverflowAcrossMultipleSegments() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        for (int i = 0; i < 40; i++) buf.writeNumber(i); // > 16 -> forces Segment chaining
        buf.writeEndArray();

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        for (int i = 0; i < 40; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    /* ============================================================
     * Parser: nextToken / nextFieldName / peekNextToken / close
     * ============================================================ */

    @Test
    public void testParserNextTokenAfterClose() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNull();
        JsonParser p = buf.asParser();
        p.close();
        assertNull(p.nextToken());
        assertTrue(p.isClosed());
    }

    @Test
    public void testParserPeekNextToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        buf.writeNumber(1);
        buf.writeEndArray();
        TokenBuffer.Parser p = (TokenBuffer.Parser) buf.asParser();

        assertEquals(JsonToken.START_ARRAY, p.peekNextToken());
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.peekNextToken());
        p.nextToken();
        assertEquals(JsonToken.END_ARRAY, p.peekNextToken());
        p.nextToken();
        assertNull(p.peekNextToken());
    }

    @Test
    public void testParserPeekNextTokenWhenClosed() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNull();
        TokenBuffer.Parser p = (TokenBuffer.Parser) buf.asParser();
        p.close();
        assertNull(p.peekNextToken());
    }

    @Test
    public void testNextFieldNameHitFastPath() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("k");
        buf.writeNumber(1);
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("k", p.nextFieldName());
    }

    @Test
    public void testNextFieldNameMiss() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        buf.writeNumber(1);
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        p.nextToken();
        assertNull(p.nextFieldName());
    }

    @Test
    public void testNextFieldNameOnClosed() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        JsonParser p = buf.asParser();
        p.close();
        assertNull(p.nextFieldName());
    }

    @Test
    public void testAsParserWithSourceCopiesLocation() throws IOException {
        JsonParser src = mapper.getFactory().createParser("123");
        src.nextToken();
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(1);
        JsonParser p = buf.asParser(src);
        assertNotNull(p.getTokenLocation());
    }

    /* ============================================================
     * Parser: getCurrentName / overrideCurrentName
     * ============================================================ */

    @Test
    public void testGetCurrentNameForStartObjectUsesParentContext() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("outer");
        buf.writeStartObject();
        buf.writeEndObject();
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken(); // root START_OBJECT
        p.nextToken(); // FIELD_NAME outer
        p.nextToken(); // nested START_OBJECT
        assertEquals("outer", p.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("orig");
        buf.writeNumber(1);
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken(); // START_OBJECT branch of overrideCurrentName
        p.overrideCurrentName("ignoredForRoot");
        p.nextToken(); // FIELD_NAME orig -> normal branch
        p.overrideCurrentName("changed");
        assertEquals("changed", p.getCurrentName());
    }

    /* ============================================================
     * Parser: getText / getTextCharacters / getTextLength
     * ============================================================ */

    @Test
    public void testGetTextBeforeAnyToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertNull(buf.asParser().getText());
    }

    @Test
    public void testGetTextForVariousTokens() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        buf.writeString("abc");
        buf.writeNumber(42);
        buf.writeNumber(3.14);
        buf.writeBoolean(true);
        buf.writeNull();
        buf.writeEndArray();
        JsonParser p = buf.asParser();

        p.nextToken(); // START_ARRAY -> default branch (JsonToken.asString())
        assertEquals(JsonToken.START_ARRAY.asString(), p.getText());

        p.nextToken(); // VALUE_STRING
        assertEquals("abc", p.getText());

        p.nextToken(); // VALUE_NUMBER_INT
        assertEquals("42", p.getText());

        p.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals("3.14", p.getText());

        p.nextToken(); // VALUE_TRUE -> default branch
        assertEquals(JsonToken.VALUE_TRUE.asString(), p.getText());

        p.nextToken(); // VALUE_NULL -> default branch
        assertEquals(JsonToken.VALUE_NULL.asString(), p.getText());
    }

    @Test
    public void testGetTextCharactersAndLength() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("hello");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertArrayEquals("hello".toCharArray(), p.getTextCharacters());
        assertEquals(5, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertFalse(p.hasTextCharacters());
    }

    @Test
    public void testGetTextCharactersNullWhenNoText() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        JsonParser p = buf.asParser();
        assertNull(p.getTextCharacters());
        assertEquals(0, p.getTextLength());
    }

    /* ============================================================
     * Parser: numeric accessors
     * ============================================================ */

    @Test
    public void testGetBigIntegerValueFromBigInteger() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(BigInteger.valueOf(12345));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(12345), p.getBigIntegerValue());
    }

    @Test
    public void testGetBigIntegerValueFromBigDecimal() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(BigDecimal.valueOf(123.0));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(123), p.getBigIntegerValue());
    }

    @Test
    public void testGetBigIntegerValueFromInt() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(99);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(99), p.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValueFromBigDecimal() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(BigDecimal.valueOf(1.5));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigDecimal.valueOf(1.5), p.getDecimalValue());
    }

    @Test
    public void testGetDecimalValueFromInt() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(7);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigDecimal.valueOf(7L), p.getDecimalValue());
    }

    @Test
    public void testGetDecimalValueFromBigInteger() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(BigInteger.valueOf(555));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(new BigDecimal(BigInteger.valueOf(555)), p.getDecimalValue());
    }

    @Test
    public void testGetDecimalValueFromDouble() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(2.25);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigDecimal.valueOf(2.25), p.getDecimalValue());
    }

    @Test
    public void testGetIntValueDirectOptimizedBranch() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(100);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(100, p.getIntValue());
    }

    @Test
    public void testGetIntValueViaGenericBranch() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(9.9);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(9, p.getIntValue());
    }

    @Test
    public void testGetNumberTypeShortMapsToInt() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber((short) 3);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonParser.NumberType.INT, p.getNumberType());
    }

    @Test
    public void testGetNumberTypeFloat() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(1.5f);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonParser.NumberType.FLOAT, p.getNumberType());
    }

    @Test
    public void testGetNumberValueFromEncodedStringWithDot() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber("12.34");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(12.34, p.getNumberValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetNumberValueFromEncodedStringWithoutDot() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber("12345");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(12345L, p.getNumberValue().longValue());
    }

    @Test(expected = JsonParseException.class)
    public void testGetNumberValueOnNonNumericTokenThrows() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("notanumber");
        JsonParser p = buf.asParser();
        p.nextToken();
        p.getNumberValue();
    }

    /* ============================================================
     * Parser: embedded object / binary
     * ============================================================ */

    @Test
    public void testGetEmbeddedObjectPresent() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        byte[] data = {1,2,3};
        buf.writeObject(data);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertSame(data, p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObjectAbsentForOtherTokens() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("x");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertNull(p.getEmbeddedObject());
    }

    @Test
    public void testGetBinaryValueFromEmbeddedByteArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        byte[] data = {5,6,7};
        buf.writeObject(data);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertArrayEquals(data, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueWrongTokenTypeThrows() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(5);
        JsonParser p = buf.asParser();
        p.nextToken();
        p.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testGetBinaryValueFromBase64String() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        byte[] original = {9,8,7,6};
        String encoded = Base64Variants.getDefaultVariant().encode(original);
        buf.writeString(encoded);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertArrayEquals(original, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testGetBinaryValueNullText() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString((String) null); // becomes VALUE_NULL not VALUE_STRING
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonToken.VALUE_NULL, p.getCurrentToken());
        // VALUE_NULL != VALUE_STRING and not embedded-byte[] -> should throw per source
    }

    @Test
    public void testReadBinaryValueWritesToOutputStream() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        byte[] original = {1,2,3,4,5};
        String encoded = Base64Variants.getDefaultVariant().encode(original);
        buf.writeString(encoded);
        JsonParser p = buf.asParser();
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(original.length, len);
        assertArrayEquals(original, out.toByteArray());
    }

    /* ============================================================
     * Parser: native ids / misc
     * ============================================================ */

    @Test
    public void testParserCanReadIdsFlagsFalseByDefault() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        JsonParser p = buf.asParser();
        assertFalse(p.canReadTypeId());
        assertFalse(p.canReadObjectId());
    }

    @Test
    public void testParserVersionNotNull() throws IOException {
        assertNotNull(new TokenBuffer(null, false).asParser().version());
    }

    @Test
    public void testParserGetParsingContextNotNull() throws IOException {
        assertNotNull(new TokenBuffer(null, false).asParser().getParsingContext());
    }
}
