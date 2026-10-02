package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TokenBufferTest {

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDeprecatedConstructor_defaultsNoNativeIds() {
        TokenBuffer buf = new TokenBuffer(null); // deprecated ctor delegates hasNativeIds=false
        assertFalse(buf.canWriteTypeId());
        assertFalse(buf.canWriteObjectId());
    }

    @Test
    public void testConstructor_withNativeIdsTrue() {
        TokenBuffer buf = new TokenBuffer(null, true);
        assertTrue(buf.canWriteTypeId());
        assertTrue(buf.canWriteObjectId());
    }

    @Test
    public void testConstructor_withNativeIdsFalse() {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertFalse(buf.canWriteTypeId());
        assertFalse(buf.canWriteObjectId());
    }

    @Test
    public void testConstructor_fromJsonParser() {
        JsonParser src = mock(JsonParser.class);
        when(src.getCodec()).thenReturn(null);
        when(src.canReadTypeId()).thenReturn(true);
        when(src.canReadObjectId()).thenReturn(false);

        TokenBuffer buf = new TokenBuffer(src);
        assertTrue(buf.canWriteTypeId());
        assertFalse(buf.canWriteObjectId());
    }

    // ---------------------------------------------------------------
    // firstToken()
    // ---------------------------------------------------------------

    @Test
    public void testFirstToken_nullWhenEmpty() {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertNull(buf.firstToken());
    }

    @Test
    public void testFirstToken_afterWrite() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        assertEquals(JsonToken.START_ARRAY, buf.firstToken());
    }

    // ---------------------------------------------------------------
    // Basic structural writes + parser round trip
    // ---------------------------------------------------------------

    @Test
    public void testWriteStartEndArray_roundTrip() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartArray();
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testWriteStartEndObject_roundTrip() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testWriteEndObject_atRoot_unbalancedTolerated() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeEndObject(); // no matching start; parent==null branch -> stays at root
        assertTrue(buf.getOutputContext().inRoot());
    }

    @Test
    public void testWriteEndArray_atRoot_unbalancedTolerated() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeEndArray();
        assertTrue(buf.getOutputContext().inRoot());
    }

    @Test
    public void testWriteFieldName_string() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("field1");
        buf.writeString("v");
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("field1", p.getCurrentName());
    }

    @Test
    public void testWriteFieldName_serializableString() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName(new SerializedString("f2"));
        buf.writeString("v");
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        p.nextToken();
        assertEquals("f2", p.getCurrentName());
    }

    // ---------------------------------------------------------------
    // writeString variants
    // ---------------------------------------------------------------

    @Test
    public void testWriteString_null_becomesValueNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString((String) null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteString_nonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("hello");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("hello", p.getText());
    }

    @Test
    public void testWriteString_charArray() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        char[] arr = "abcdef".toCharArray();
        buf.writeString(arr, 1, 3); // "bcd"
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("bcd", p.getText());
    }

    @Test
    public void testWriteString_serializableString_null() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString((SerializableString) null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteString_serializableString_nonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString(new SerializedString("xyz"));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("xyz", p.getText());
    }

    // ---------------------------------------------------------------
    // Unsupported raw/UTF8 operations
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8String_throws() throws IOException {
        new TokenBuffer(null, false).writeRawUTF8String(new byte[]{1}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8String_throws() throws IOException {
        new TokenBuffer(null, false).writeUTF8String(new byte[]{1}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_string_throws() throws IOException {
        new TokenBuffer(null, false).writeRaw("x");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_stringOffsetLen_throws() throws IOException {
        new TokenBuffer(null, false).writeRaw("xyz", 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_serializableString_throws() throws IOException {
        new TokenBuffer(null, false).writeRaw(new SerializedString("x"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_charArray_throws() throws IOException {
        new TokenBuffer(null, false).writeRaw(new char[]{'a'}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_char_throws() throws IOException {
        new TokenBuffer(null, false).writeRaw('a');
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValue_string_throws() throws IOException {
        new TokenBuffer(null, false).writeRawValue("x");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValue_stringOffsetLen_throws() throws IOException {
        new TokenBuffer(null, false).writeRawValue("xyz", 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValue_charArray_throws() throws IOException {
        new TokenBuffer(null, false).writeRawValue(new char[]{'a'}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinary_inputStream_throws() {
        new TokenBuffer(null, false).writeBinary(Base64Variants.getDefaultVariant(),
                new ByteArrayInputStream(new byte[]{1}), 1);
    }

    // ---------------------------------------------------------------
    // writeNumber variants
    // ---------------------------------------------------------------

    @Test
    public void testWriteNumber_short() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber((short) 7);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(NumberType.INT, p.getNumberType()); // per source comment: "should be SHORT"
        assertEquals(7, p.getIntValue());
    }

    @Test
    public void testWriteNumber_int() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(42);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(42, p.getIntValue());
        assertEquals(NumberType.INT, p.getNumberType());
    }

    @Test
    public void testWriteNumber_long() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(123456789012L);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(123456789012L, p.getLongValue());
        assertEquals(NumberType.LONG, p.getNumberType());
    }

    @Test
    public void testWriteNumber_double() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(3.14);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
        assertEquals(NumberType.DOUBLE, p.getNumberType());
    }

    @Test
    public void testWriteNumber_float() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(2.5f);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(2.5f, p.getFloatValue(), 0.0001f);
        assertEquals(NumberType.FLOAT, p.getNumberType());
    }

    @Test
    public void testWriteNumber_bigDecimal_null_becomesValueNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber((BigDecimal) null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteNumber_bigDecimal_nonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(new BigDecimal("7.9"));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(new BigDecimal("7.9"), p.getDecimalValue());
        assertEquals(NumberType.BIG_DECIMAL, p.getNumberType());
    }

    @Test
    public void testWriteNumber_bigInteger_null_becomesValueNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber((BigInteger) null);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteNumber_bigInteger_nonNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(BigInteger.valueOf(555));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(555), p.getBigIntegerValue());
        assertEquals(NumberType.BIG_INTEGER, p.getNumberType());
    }

    @Test
    public void testWriteNumber_encodedString_withoutDot_parsedAsLong() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber("123");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(123L, p.getLongValue());
    }

    @Test
    public void testWriteNumber_encodedString_withDot_parsedAsDouble() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber("123.45");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(123.45, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testWriteBoolean_trueFalse() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeBoolean(true);
        buf.writeBoolean(false);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
    }

    @Test
    public void testWriteNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNull();
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testWriteObject_embedded() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeObject(Integer.valueOf(99));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.getCurrentToken());
        assertEquals(Integer.valueOf(99), p.getEmbeddedObject());
    }

    @Test
    public void testWriteTree_embedded() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeTree(null); // node param unused beyond embedding value itself
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteBinary_bytesCopiedCorrectly() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        byte[] data = {10, 20, 30, 40, 50};
        buf.writeBinary(Base64Variants.getDefaultVariant(), data, 1, 3); // {20,30,40}
        JsonParser p = buf.asParser();
        p.nextToken();
        byte[] result = (byte[]) p.getEmbeddedObject();
        assertArrayEquals(new byte[]{20, 30, 40}, result);
    }

    // ---------------------------------------------------------------
    // Feature / config methods
    // ---------------------------------------------------------------

    @Test
    public void testEnableDisableIsEnabled() {
        TokenBuffer buf = new TokenBuffer(null, false);
        JsonGenerator.Feature f = JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        buf.disable(f);
        assertFalse(buf.isEnabled(f));
        buf.enable(f);
        assertTrue(buf.isEnabled(f));
    }

    @Test
    public void testGetSetFeatureMask() {
        TokenBuffer buf = new TokenBuffer(null, false);
        int original = buf.getFeatureMask();
        buf.setFeatureMask(0);
        assertEquals(0, buf.getFeatureMask());
        assertFalse(buf.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buf.setFeatureMask(original);
        assertEquals(original, buf.getFeatureMask());
    }

    @Test
    public void testUseDefaultPrettyPrinter_isNoOpReturnsThis() {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertSame(buf, buf.useDefaultPrettyPrinter());
    }

    @Test
    public void testSetGetCodec() {
        TokenBuffer buf = new TokenBuffer(null, false);
        ObjectMapper mapper = new ObjectMapper();
        buf.setCodec(mapper);
        assertSame(mapper, buf.getCodec());
    }

    @Test
    public void testGetOutputContext_initialIsRoot() {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertTrue(buf.getOutputContext().inRoot());
    }

    @Test
    public void testCanWriteBinaryNatively_alwaysTrue() {
        assertTrue(new TokenBuffer(null, false).canWriteBinaryNatively());
    }

    @Test
    public void testFlush_noException() throws IOException {
        new TokenBuffer(null, false).flush(); // NOP, just ensure no exception
    }

    @Test
    public void testCloseAndIsClosed() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertFalse(buf.isClosed());
        buf.close();
        assertTrue(buf.isClosed());
    }

    // ---------------------------------------------------------------
    // Native type/object id (writer side)
    // ---------------------------------------------------------------

    @Test
    public void testCanWriteTypeIdObjectId_defaultFalse() {
        TokenBuffer buf = new TokenBuffer(null, false);
        assertFalse(buf.canWriteTypeId());
        assertFalse(buf.canWriteObjectId());
    }

    @Test
    public void testWriteTypeIdObjectId_thenReadBackViaParser() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, true);
        buf.writeObjectId("obj-1");
        buf.writeTypeId("type-1");
        buf.writeString("val");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("obj-1", p.getObjectId());
        assertEquals("type-1", p.getTypeId());
        assertTrue(p.canReadObjectId());
        assertTrue(p.canReadTypeId());
    }

    // ---------------------------------------------------------------
    // serialize(JsonGenerator) - main structural/value branches
    // ---------------------------------------------------------------

    @Test
    public void testSerialize_fullStructure() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("a");
        buf.writeString("hello");
        buf.writeFieldName("b");
        buf.writeNumber(42);
        buf.writeFieldName("c");
        buf.writeBoolean(true);
        buf.writeFieldName("d");
        buf.writeNull();
        buf.writeFieldName("e");
        buf.writeStartArray();
        buf.writeNumber(1);
        buf.writeNumber(2);
        buf.writeEndArray();
        buf.writeEndObject();

        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.close();

        assertEquals("{\"a\":\"hello\",\"b\":42,\"c\":true,\"d\":null,\"e\":[1,2]}", sw.toString());
    }

    @Test
    public void testSerialize_serializableStringFieldAndValue() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName(new SerializedString("k"));
        buf.writeString(new SerializedString("v"));
        buf.writeEndObject();

        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.close();

        assertEquals("{\"k\":\"v\"}", sw.toString());
    }

    @Test
    public void testSerialize_bigIntegerLongShortScalar() throws IOException {
        // BigInteger branch
        assertSerializesTo(new BigInteger("123456789012345678901234567890"),
                "123456789012345678901234567890", 1);
        // Long branch
        assertSerializesTo(999999999999L, "999999999999", 2);
        // Short branch (writeNumber(short) stores Short instance)
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber((short) 5);
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        assertEquals("5", sw.toString());
    }

    private void assertSerializesTo(Object numberToWrite, String expected, int kind) throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        if (kind == 1) {
            buf.writeNumber((BigInteger) numberToWrite);
        } else {
            buf.writeNumber((Long) numberToWrite);
        }
        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testSerialize_floatDoubleBigDecimalStringScalar() throws IOException {
        // Double
        assertFloatSerialize(3.5, "double");
        // Float
        assertFloatSerialize(2.5f, "float");
        // BigDecimal
        assertFloatSerialize(new BigDecimal("1.10"), "bigdecimal");
        // encoded String -> VALUE_NUMBER_FLOAT with String payload
        assertFloatSerialize("9.99", "string");
    }

    private void assertFloatSerialize(Object val, String kind) throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        if ("double".equals(kind)) buf.writeNumber((Double) val);
        else if ("float".equals(kind)) buf.writeNumber((Float) val);
        else if ("bigdecimal".equals(kind)) buf.writeNumber((BigDecimal) val);
        else buf.writeNumber((String) val);

        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        assertFalse(sw.toString().isEmpty());
    }

    @Test
    public void testSerialize_embeddedObjectValue() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeObject(Integer.valueOf(7));

        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        buf.serialize(gen);
        gen.close();
        assertEquals("7", sw.toString());
    }

    // NOTE: สาขา `n==null` และ `else`(unrecognized type) ใน VALUE_NUMBER_FLOAT switch ของ serialize()
    // และสาขา else ใน VALUE_NUMBER_INT switch ไม่สามารถเกิดขึ้นได้ผ่าน public write* API
    // (เพราะ writeNumber(BigDecimal null)/writeNumber(BigInteger null) ถูก divert ไป writeNull() ก่อน)
    // จึงไม่เขียนเทสสำหรับสาขานี้ เพื่อไม่เดา behavior เพิ่มเติม

    @Test
    public void testSerialize_withNativeIds_usingMockGenerator() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, true); // mayHaveNativeIds = true
        buf.writeObjectId("obj1");
        buf.writeTypeId("type1");
        buf.writeString("val"); // token0: has both ids
        buf.writeBoolean(true); // token1: no ids (branch: id==null -> skip write*Id calls)

        JsonGenerator mockGen = mock(JsonGenerator.class);
        buf.serialize(mockGen);

        verify(mockGen, times(1)).writeObjectId("obj1");
        verify(mockGen, times(1)).writeTypeId("type1");
        verify(mockGen, times(1)).writeString("val");
        verify(mockGen, times(1)).writeBoolean(true);
    }

    // ---------------------------------------------------------------
    // deserialize(JsonParser, DeserializationContext)
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_copiesSingleValue() throws IOException {
        TokenBuffer source = new TokenBuffer(null, false);
        source.writeString("copyme");
        JsonParser sp = source.asParser();
        sp.nextToken(); // position at VALUE_STRING

        TokenBuffer dest = new TokenBuffer(null, false);
        dest.deserialize(sp, null); // ctxt unused in implementation

        JsonParser dp = dest.asParser();
        dp.nextToken();
        assertEquals("copyme", dp.getText());
    }

    // ---------------------------------------------------------------
    // append(TokenBuffer)
    // ---------------------------------------------------------------

    @Test
    public void testAppend_mergesContentAndNativeIdFlags() throws IOException {
        TokenBuffer a = new TokenBuffer(null, false);
        a.writeString("first");

        TokenBuffer b = new TokenBuffer(null, true); // has native ids capability
        b.writeString("second");

        a.append(b);

        assertTrue(a.canWriteTypeId());
        assertTrue(a.canWriteObjectId());

        JsonParser p = a.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("first", p.getText());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("second", p.getText());
        assertNull(p.nextToken());
    }

    // ---------------------------------------------------------------
    // copyCurrentEvent / copyCurrentStructure
    // ---------------------------------------------------------------

    @Test
    public void testCopyCurrentStructure_nestedObjectAndArray() throws IOException {
        TokenBuffer source = new TokenBuffer(null, false);
        source.writeStartObject();
        source.writeFieldName("arr");
        source.writeStartArray();
        source.writeNumber(1);
        source.writeNumber(2);
        source.writeEndArray();
        source.writeEndObject();

        JsonParser sp = source.asParser();
        sp.nextToken(); // START_OBJECT

        TokenBuffer dest = new TokenBuffer(null, false);
        dest.copyCurrentStructure(sp);

        JsonParser dp = dest.asParser();
        assertEquals(JsonToken.START_OBJECT, dp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, dp.nextToken());
        assertEquals("arr", dp.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, dp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, dp.nextToken());
        assertEquals(1, dp.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, dp.nextToken());
        assertEquals(2, dp.getIntValue());
        assertEquals(JsonToken.END_ARRAY, dp.nextToken());
        assertEquals(JsonToken.END_OBJECT, dp.nextToken());
        assertNull(dp.nextToken());
    }

    @Test
    public void testCopyCurrentEvent_simpleScalarTypes() throws IOException {
        TokenBuffer source = new TokenBuffer(null, false);
        source.writeNumber(10);
        source.writeBoolean(false);
        source.writeNull();

        JsonParser sp = source.asParser();
        TokenBuffer dest = new TokenBuffer(null, false);

        sp.nextToken();
        dest.copyCurrentEvent(sp);
        sp.nextToken();
        dest.copyCurrentEvent(sp);
        sp.nextToken();
        dest.copyCurrentEvent(sp);

        JsonParser dp = dest.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, dp.nextToken());
        assertEquals(10, dp.getIntValue());
        assertEquals(JsonToken.VALUE_FALSE, dp.nextToken());
        assertEquals(JsonToken.VALUE_NULL, dp.nextToken());
    }

    // ---------------------------------------------------------------
    // Segment overflow (>16 tokens forces new Segment)
    // ---------------------------------------------------------------

    @Test
    public void testSegmentOverflow_moreThan16Tokens() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        final int TOTAL = 20; // > Segment.TOKENS_PER_SEGMENT(16)
        for (int i = 0; i < TOTAL; i++) {
            buf.writeNumber(i);
        }
        JsonParser p = buf.asParser();
        for (int i = 0; i < TOTAL; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
        assertNull(p.nextToken());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_smallSequence() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("x");
        buf.writeString("y");
        buf.writeEndObject();
        String s = buf.toString();
        assertTrue(s.startsWith("[TokenBuffer: "));
        assertTrue(s.contains("FIELD_NAME(x)"));
        assertFalse(s.contains("truncated"));
    }

    @Test
    public void testToString_truncationBranch_over100Tokens() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        for (int i = 0; i < 150; i++) {
            buf.writeNumber(i);
        }
        String s = buf.toString();
        assertTrue(s.contains("truncated"));
        assertTrue(s.contains("(truncated 50 entries)"));
    }

    @Test
    public void testToString_withNativeIds() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, true); // _hasNativeTypeIds=_hasNativeObjectIds=true
        buf.writeTypeId("T1");
        buf.writeString("hello");
        String s = buf.toString();
        assertTrue(s.contains("[typeId=T1]"));
    }

    // NOTE: catch(IOException) ภายใน toString() ไม่สามารถ trigger ได้ผ่าน public API ปกติ
    // เพราะ TokenBuffer.Parser.nextToken() ไม่โยน IOException ในสถานการณ์ทั่วไป -> ข้ามการทดสอบสาขานี้

    // ---------------------------------------------------------------
    // asParser(JsonParser src) with location propagation
    // ---------------------------------------------------------------

    @Test
    public void testAsParser_withSourceParserLocation() throws IOException {
        JsonFactory jf = new JsonFactory();
        JsonParser srcParser = jf.createParser("123");
        srcParser.nextToken();
        JsonLocation loc = srcParser.getTokenLocation();

        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(5);
        JsonParser p = buf.asParser(srcParser);

        assertEquals(loc, p.getCurrentLocation());
        p.nextToken();
        assertEquals(5, p.getIntValue());
        srcParser.close();
    }

    // ---------------------------------------------------------------
    // Parser: peekNextToken
    // ---------------------------------------------------------------

    @Test
    public void testPeekNextToken_beforeAndAfterAdvance() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeBoolean(true);
        buf.writeBoolean(false);

        TokenBuffer.Parser p = (TokenBuffer.Parser) buf.asParser();
        assertEquals(JsonToken.VALUE_TRUE, p.peekNextToken());
        p.nextToken();
        assertEquals(JsonToken.VALUE_FALSE, p.peekNextToken());
        p.nextToken();
        assertNull(p.peekNextToken());
    }

    @Test
    public void testPeekNextToken_afterClose_returnsNull() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeBoolean(true);
        TokenBuffer.Parser p = (TokenBuffer.Parser) buf.asParser();
        p.close();
        assertNull(p.peekNextToken());
    }

    // ---------------------------------------------------------------
    // Parser: getText() variants
    // ---------------------------------------------------------------

    @Test
    public void testGetText_forValueString() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("abc");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("abc", p.getText());
        assertTrue(java.util.Arrays.equals("abc".toCharArray(), p.getTextCharacters()));
        assertEquals(3, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertFalse(p.hasTextCharacters());
    }

    @Test
    public void testGetText_forNumericToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(77);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("77", p.getText());
    }

    @Test
    public void testGetText_forNullToken_usesTokenAsString() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNull();
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(JsonToken.VALUE_NULL.asString(), p.getText());
    }

    @Test
    public void testGetTextCharacters_nullWhenTextNull() throws IOException {
        // START_OBJECT token -> getText() default branch returns token.asString(), not null;
        // there's no public path making getText() actually return null after a real token,
        // so we only assert non-null behavior here for a structural token.
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        assertNotNull(p.getText());
    }

    // ---------------------------------------------------------------
    // Parser: numeric accessors, getNumberType, checkIsNumber
    // ---------------------------------------------------------------

    @Test
    public void testGetBigIntegerValue_fromIntFallback() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(5);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(5), p.getBigIntegerValue());
    }

    @Test
    public void testGetBigIntegerValue_fromBigDecimal() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(new BigDecimal("7.9"));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigInteger.valueOf(7), p.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue_fromLong() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(123L);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigDecimal.valueOf(123L), p.getDecimalValue());
    }

    @Test
    public void testGetDecimalValue_fromBigInteger() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(BigInteger.valueOf(555));
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(new BigDecimal(BigInteger.valueOf(555)), p.getDecimalValue());
    }

    @Test
    public void testGetDecimalValue_fromDouble() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(3.14);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals(BigDecimal.valueOf(3.14), p.getDecimalValue());
    }

    @Test
    public void testCheckIsNumber_throwsWhenNotNumeric() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("notanumber");
        JsonParser p = buf.asParser();
        p.nextToken();
        try {
            p.getNumberValue();
            fail("Expected JsonParseException");
        } catch (JsonParseException expected) {
            // expected: current token not numeric
        }
    }

    // ---------------------------------------------------------------
    // Parser: getEmbeddedObject
    // ---------------------------------------------------------------

    @Test
    public void testGetEmbeddedObject_returnsValueWhenEmbedded() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeObject("payload");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertEquals("payload", p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObject_returnsNullWhenNotEmbedded() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("just text");
        JsonParser p = buf.asParser();
        p.nextToken();
        assertNull(p.getEmbeddedObject());
    }

    // ---------------------------------------------------------------
    // Parser: getBinaryValue / readBinaryValue
    // ---------------------------------------------------------------

    @Test
    public void testGetBinaryValue_fromEmbeddedByteArray() throws IOException {
        byte[] data = {1, 2, 3};
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        JsonParser p = buf.asParser();
        p.nextToken();
        assertArrayEquals(data, p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testGetBinaryValue_fromBase64String() throws IOException {
        // "AQID" == base64 of {1,2,3}
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("AQID");
        JsonParser p = buf.asParser();
        p.nextToken();
        byte[] decoded = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[]{1, 2, 3}, decoded);
    }

    @Test
    public void testGetBinaryValue_wrongTokenType_throws() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeNumber(5);
        JsonParser p = buf.asParser();
        p.nextToken();
        try {
            p.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected JsonParseException");
        } catch (JsonParseException expected) {
            // expected
        }
    }

    @Test
    public void testReadBinaryValue_writesToOutputStream() throws IOException {
        byte[] data = {9, 8, 7};
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        JsonParser p = buf.asParser();
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(3, len);
        assertArrayEquals(data, out.toByteArray());
    }

    // ---------------------------------------------------------------
    // Parser: overrideCurrentName
    // ---------------------------------------------------------------

    @Test
    public void testOverrideCurrentName_onFieldNameToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeFieldName("orig");
        buf.writeString("v");
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        p.overrideCurrentName("overridden"); // else-branch: ctxt == _parsingContext directly
        assertEquals("overridden", p.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName_onStartObjectToken_noException() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeStartObject();
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        p.nextToken(); // START_OBJECT: if-branch uses ctxt.getParent()
        p.overrideCurrentName("ignored"); // just verifying no exception is thrown
    }

    // ---------------------------------------------------------------
    // Parser: getParsingContext / getTokenLocation / getCurrentLocation
    // ---------------------------------------------------------------

    @Test
    public void testGetParsingContext_and_getTokenLocation_default() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("x");
        JsonParser p = buf.asParser();
        assertNotNull(p.getParsingContext());
        assertEquals(JsonLocation.NA, p.getTokenLocation());
        assertEquals(JsonLocation.NA, p.getCurrentLocation());
    }

    // ---------------------------------------------------------------
    // Parser: close / isClosed
    // ---------------------------------------------------------------

    @Test
    public void testParserCloseAndIsClosed() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, false);
        buf.writeString("x");
        JsonParser p = buf.asParser();
        assertFalse(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
        // nextToken() after close should return null (closed check branch)
        assertNull(p.nextToken());
    }
}
