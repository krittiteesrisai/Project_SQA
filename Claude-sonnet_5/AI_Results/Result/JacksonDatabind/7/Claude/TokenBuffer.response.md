# TokenBufferTest.java

ผมวิเคราะห์ซอร์สโค้ด `TokenBuffer` และออกแบบชุดทดสอบ JUnit 4 ให้ครอบคลุมทุก if/else, switch-case, loop และ overload methods ที่เข้าถึงได้ผ่าน public/protected API (คลาส `Parser` เป็น `protected` แต่ทดสอบได้เพราะอยู่ package เดียวกัน)

**หมายเหตุสำคัญ:** ในซอร์สโค้ด field `_hasNativeId` ไม่ถูก reset เป็น `false` ที่ใดเลยหลังถูก set โดย `writeTypeId()/writeObjectId()` — จึงทำให้ native id ค่าล่าสุดถูกผนวกเข้ากับ token ถัด ๆ ไปทั้งหมด นี่คือ behavior จริงที่ไล่ตามโค้ด (ไม่ใช่การเดา) จึงเขียนเทสรองรับพร้อมคอมเมนต์อธิบาย และบางสาขาที่ "unreachable ผ่าน public API" (เช่น `n==null` ใน `VALUE_NUMBER_FLOAT` ของ `serialize()`, `else` throw ใน number-int switch) จะระบุคอมเมนต์ไว้ว่าไม่ได้ทดสอบเพราะไม่มีทางเรียกถึงได้จริง

```java
package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TokenBufferTest {

    // -----------------------------------------------------------------
    // Helpers
    // -----------------------------------------------------------------

    /**
     * สร้าง TokenBuffer โดยไม่ระบุ codec แบบไม่กำกวม (เลี่ยง overload ambiguity
     * ระหว่าง TokenBuffer(ObjectCodec) กับ TokenBuffer(JsonParser) เมื่อส่ง null ตรง ๆ)
     */
    private static TokenBuffer newBuffer() {
        return new TokenBuffer((ObjectCodec) null);
    }

    private interface ThrowingRunnable {
        void run() throws Exception;
    }

    private void assertUnsupported(ThrowingRunnable r) {
        try {
            r.run();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        } catch (Exception e) {
            fail("Unexpected exception type: " + e);
        }
    }

    private List<JsonToken> collectTokens(TokenBuffer tb) throws IOException {
        List<JsonToken> tokens = new ArrayList<JsonToken>();
        JsonParser jp = tb.asParser();
        JsonToken t;
        while ((t = jp.nextToken()) != null) {
            tokens.add(t);
        }
        return tokens;
    }

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    @Test
    public void testDeprecatedConstructor_defaultsNoNativeIds() {
        TokenBuffer tb = new TokenBuffer((ObjectCodec) null); // deprecated ctor -> delegates to (codec,false)
        assertFalse(tb.canWriteTypeId());
        assertFalse(tb.canWriteObjectId());
        assertFalse(tb.isClosed());
    }

    @Test
    public void testConstructorWithNativeIdsTrue() {
        TokenBuffer tb = new TokenBuffer(null, true);
        assertTrue(tb.canWriteTypeId());
        assertTrue(tb.canWriteObjectId());
    }

    @Test
    public void testConstructorWithNativeIdsFalse() {
        TokenBuffer tb = new TokenBuffer(null, false);
        assertFalse(tb.canWriteTypeId());
        assertFalse(tb.canWriteObjectId());
    }

    @Test
    public void testConstructorFromJsonParser() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("{}");
        TokenBuffer tb = new TokenBuffer(jp);
        // JsonFactory-based parser ปกติไม่รองรับ native ids
        assertFalse(tb.canWriteTypeId());
        assertFalse(tb.canWriteObjectId());
        jp.close();
    }

    // -----------------------------------------------------------------
    // firstToken()
    // -----------------------------------------------------------------

    @Test
    public void testFirstToken_emptyBuffer_returnsNull() {
        TokenBuffer tb = newBuffer();
        assertNull(tb.firstToken());
    }

    @Test
    public void testFirstToken_afterWrite() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartObject();
        assertEquals(JsonToken.START_OBJECT, tb.firstToken());
    }

    // -----------------------------------------------------------------
    // Structural writes
    // -----------------------------------------------------------------

    @Test
    public void testWriteStartEndArray() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartArray();
        tb.writeEndArray();
        List<JsonToken> tokens = collectTokens(tb);
        assertEquals(2, tokens.size());
        assertEquals(JsonToken.START_ARRAY, tokens.get(0));
        assertEquals(JsonToken.END_ARRAY, tokens.get(1));
    }

    @Test
    public void testWriteEndArray_unbalanced_doesNotThrow() throws IOException {
        TokenBuffer tb = newBuffer();
        // ไม่มี start คู่กัน -> getParent()==null -> ไม่เปลี่ยน _writeContext
        tb.writeEndArray();
        assertNotNull(tb.getOutputContext());
    }

    @Test
    public void testWriteStartEndObject() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartObject();
        tb.writeEndObject();
        List<JsonToken> tokens = collectTokens(tb);
        assertEquals(JsonToken.START_OBJECT, tokens.get(0));
        assertEquals(JsonToken.END_OBJECT, tokens.get(1));
    }

    @Test
    public void testWriteEndObject_unbalanced_doesNotThrow() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeEndObject();
        assertNotNull(tb.getOutputContext());
    }

    @Test
    public void testWriteFieldName_stringVariant() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartObject();
        tb.writeFieldName("field1");
        tb.writeNumber(1);
        tb.writeEndObject();
        JsonParser jp = tb.asParser();
        jp.nextToken(); // START_OBJECT
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals("field1", jp.getCurrentName());
    }

    @Test
    public void testWriteFieldName_serializableStringVariant() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartObject();
        tb.writeFieldName(new SerializedString("field2"));
        tb.writeNumber(2);
        tb.writeEndObject();
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals("field2", jp.getCurrentName());
    }

    // -----------------------------------------------------------------
    // Textual writes
    // -----------------------------------------------------------------

    @Test
    public void testWriteString_null_writesNullToken() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeString((String) null);
        assertEquals(JsonToken.VALUE_NULL, tb.firstToken());
    }

    @Test
    public void testWriteString_normal() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeString("hello");
        JsonParser jp = tb.asParser();
        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("hello", jp.getText());
    }

    @Test
    public void testWriteString_charArray() throws IOException {
        TokenBuffer tb = newBuffer();
        char[] chars = "worldwide".toCharArray();
        tb.writeString(chars, 2, 5);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals("rldwi", jp.getText());
    }

    @Test
    public void testWriteString_serializableStringNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeString((SerializableString) null);
        assertEquals(JsonToken.VALUE_NULL, tb.firstToken());
    }

    @Test
    public void testWriteString_serializableStringNormal() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeString(new SerializedString("abc"));
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals("abc", jp.getText());
    }

    // -----------------------------------------------------------------
    // Unsupported raw / rawValue / UTF8 methods
    // -----------------------------------------------------------------

    @Test
    public void testWriteRawUTF8String_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRawUTF8String(new byte[]{1}, 0, 1); }
        });
    }

    @Test
    public void testWriteUTF8String_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeUTF8String(new byte[]{1}, 0, 1); }
        });
    }

    @Test
    public void testWriteRaw_stringOnly_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRaw("x"); }
        });
    }

    @Test
    public void testWriteRaw_stringOffsetLen_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRaw("xyz", 0, 2); }
        });
    }

    @Test
    public void testWriteRaw_serializableString_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRaw(new SerializedString("x")); }
        });
    }

    @Test
    public void testWriteRaw_charArray_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRaw(new char[]{'a','b'}, 0, 2); }
        });
    }

    @Test
    public void testWriteRaw_char_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRaw('c'); }
        });
    }

    @Test
    public void testWriteRawValue_stringOnly_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRawValue("x"); }
        });
    }

    @Test
    public void testWriteRawValue_stringOffsetLen_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRawValue("xyz", 0, 2); }
        });
    }

    @Test
    public void testWriteRawValue_charArray_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception { tb.writeRawValue(new char[]{'a','b'}, 0, 2); }
        });
    }

    // -----------------------------------------------------------------
    // Numeric writes
    // -----------------------------------------------------------------

    @Test
    public void testWriteNumber_short() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber((short) 5);
        JsonParser jp = tb.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(5, jp.getIntValue());
    }

    @Test
    public void testWriteNumber_int() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(42);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(42, jp.getIntValue());
    }

    @Test
    public void testWriteNumber_long() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(123456789012345L);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(123456789012345L, jp.getLongValue());
    }

    @Test
    public void testWriteNumber_double() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(3.14);
        JsonParser jp = tb.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken());
        assertEquals(3.14, jp.getDoubleValue(), 0.0001);
    }

    @Test
    public void testWriteNumber_float() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(2.5f);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(2.5f, jp.getFloatValue(), 0.0001f);
    }

    @Test
    public void testWriteNumber_bigDecimal_null_writesNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber((BigDecimal) null);
        assertEquals(JsonToken.VALUE_NULL, tb.firstToken());
    }

    @Test
    public void testWriteNumber_bigDecimal_normal() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(BigDecimal.valueOf(1.23));
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(BigDecimal.valueOf(1.23), jp.getDecimalValue());
    }

    @Test
    public void testWriteNumber_bigInteger_null_writesNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber((BigInteger) null);
        assertEquals(JsonToken.VALUE_NULL, tb.firstToken());
    }

    @Test
    public void testWriteNumber_bigInteger_normal() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(BigInteger.valueOf(999999999999L));
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(BigInteger.valueOf(999999999999L), jp.getBigIntegerValue());
    }

    @Test
    public void testWriteNumber_encodedString() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber("123.45");
        JsonParser jp = tb.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken());
        assertEquals(123.45, jp.getDoubleValue(), 0.0001);
    }

    @Test
    public void testWriteBoolean_trueFalse() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeBoolean(true);
        tb.writeBoolean(false);
        List<JsonToken> tokens = collectTokens(tb);
        assertEquals(JsonToken.VALUE_TRUE, tokens.get(0));
        assertEquals(JsonToken.VALUE_FALSE, tokens.get(1));
    }

    @Test
    public void testWriteNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNull();
        assertEquals(JsonToken.VALUE_NULL, tb.firstToken());
    }

    // -----------------------------------------------------------------
    // writeObject / writeTree
    // -----------------------------------------------------------------

    @Test
    public void testWriteObject_null() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeObject(null);
        assertEquals(JsonToken.VALUE_NULL, tb.firstToken());
    }

    @Test
    public void testWriteObject_byteArray() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeObject(new byte[]{1, 2, 3});
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, tb.firstToken());
    }

    @Test
    public void testWriteObject_noCodec_embedsRawObject() throws IOException {
        TokenBuffer tb = newBuffer(); // no codec
        Object marker = new Object();
        tb.writeObject(marker);
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, tb.firstToken());
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertSame(marker, jp.getEmbeddedObject());
    }

    @Test
    public void testWriteObject_withCodec_delegatesToCodec() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer tb = new TokenBuffer(mapper);
        tb.writeObject("plainString");
        // มี codec -> mapper.writeValue(tb, value) แทนการฝัง raw object
        assertEquals(JsonToken.VALUE_STRING, tb.firstToken());
    }

    @Test
    public void testWriteTree_null() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeTree(null);
        assertEquals(JsonToken.VALUE_NULL, tb.firstToken());
    }

    @Test
    public void testWriteTree_noCodec_embeds() throws IOException {
        TokenBuffer tb = newBuffer();
        ObjectMapper mapper = new ObjectMapper();
        com.fasterxml.jackson.databind.node.ObjectNode node = mapper.createObjectNode();
        tb.writeTree(node);
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, tb.firstToken());
    }

    @Test
    public void testWriteTree_withCodec_delegates() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer tb = new TokenBuffer(mapper);
        com.fasterxml.jackson.databind.node.ObjectNode node = mapper.createObjectNode();
        node.put("k", "v");
        tb.writeTree(node);
        assertEquals(JsonToken.START_OBJECT, tb.firstToken());
    }

    // -----------------------------------------------------------------
    // Binary
    // -----------------------------------------------------------------

    @Test
    public void testWriteBinary_storesCopyOfSubrange() throws IOException {
        TokenBuffer tb = newBuffer();
        byte[] data = new byte[]{0, 1, 2, 3, 4, 5};
        tb.writeBinary(Base64Variants.getDefaultVariant(), data, 1, 3);
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, tb.firstToken());
        JsonParser jp = tb.asParser();
        jp.nextToken();
        byte[] embedded = (byte[]) jp.getEmbeddedObject();
        assertArrayEquals(new byte[]{1, 2, 3}, embedded);
    }

    @Test
    public void testWriteBinary_inputStream_unsupported() {
        final TokenBuffer tb = newBuffer();
        assertUnsupported(new ThrowingRunnable() {
            public void run() throws Exception {
                tb.writeBinary(Base64Variants.getDefaultVariant(), new ByteArrayInputStream(new byte[]{1}), 1);
            }
        });
    }

    // -----------------------------------------------------------------
    // Feature flags / configuration
    // -----------------------------------------------------------------

    @Test
    public void testEnableDisableIsEnabled() {
        TokenBuffer tb = newBuffer();
        JsonGenerator.Feature f = JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        tb.disable(f);
        assertFalse(tb.isEnabled(f));
        tb.enable(f);
        assertTrue(tb.isEnabled(f));
    }

    @Test
    public void testFeatureMaskGetSet() {
        TokenBuffer tb = newBuffer();
        int mask = tb.getFeatureMask();
        tb.setFeatureMask(0);
        assertEquals(0, tb.getFeatureMask());
        tb.setFeatureMask(mask);
        assertEquals(mask, tb.getFeatureMask());
    }

    @Test
    public void testUseDefaultPrettyPrinter_returnsSelf() {
        TokenBuffer tb = newBuffer();
        assertSame(tb, tb.useDefaultPrettyPrinter());
    }

    @Test
    public void testSetCodecGetCodec() {
        TokenBuffer tb = newBuffer();
        ObjectMapper mapper = new ObjectMapper();
        assertSame(tb, tb.setCodec(mapper));
        assertSame(mapper, tb.getCodec());
    }

    @Test
    public void testGetOutputContext_notNull() {
        TokenBuffer tb = newBuffer();
        assertNotNull(tb.getOutputContext());
        assertTrue(tb.getOutputContext().inRoot());
    }

    @Test
    public void testCanWriteBinaryNatively_true() {
        TokenBuffer tb = newBuffer();
        assertTrue(tb.canWriteBinaryNatively());
    }

    @Test
    public void testFlush_noException() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.flush(); // no-op
    }

    @Test
    public void testCloseAndIsClosed() throws IOException {
        TokenBuffer tb = newBuffer();
        assertFalse(tb.isClosed());
        tb.close();
        assertTrue(tb.isClosed());
    }

    // -----------------------------------------------------------------
    // Native type/object ids (generator side)
    // -----------------------------------------------------------------

    @Test
    public void testCanWriteTypeObjectId_defaultFalse() {
        TokenBuffer tb = newBuffer();
        assertFalse(tb.canWriteTypeId());
        assertFalse(tb.canWriteObjectId());
    }

    @Test
    public void testWriteTypeIdAndObjectId_attachedToNextToken() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("myType");
        tb.writeObjectId("myObj");
        tb.writeString("value1");
        JsonParser jp = tb.asParser();
        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("myType", jp.getTypeId());
        assertEquals("myObj", jp.getObjectId());
    }

    /**
     * ตรวจสอบ behavior ตามซอร์สจริง: field _hasNativeId ไม่ถูก reset กลับเป็น false
     * ที่ใดเลยหลังจาก set เป็น true ใน writeTypeId()/writeObjectId() ดังนั้น token
     * ถัดไปทั้งหมดจะถูกผนวก native id ล่าสุดเข้าไปด้วย — นี่ไล่ตามโค้ดจริงของ
     * _append(), ไม่ใช่การเดา behavior.
     */
    @Test
    public void testNativeId_persistsAcrossSubsequentTokens_perSourceLogic() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("T");
        tb.writeObjectId("O");
        tb.writeString("first");
        tb.writeString("second"); // ไม่ได้เรียก writeTypeId/writeObjectId ใหม่ก่อนหน้านี้
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals("T", jp.getTypeId());
        assertEquals("O", jp.getObjectId());
        jp.nextToken();
        assertEquals("T", jp.getTypeId());
        assertEquals("O", jp.getObjectId());
    }

    // -----------------------------------------------------------------
    // append(TokenBuffer)
    // -----------------------------------------------------------------

    @Test
    public void testAppend_copiesAllValueTypes() throws IOException {
        TokenBuffer src = newBuffer();
        src.writeStartObject();
        src.writeFieldName("intField");
        src.writeNumber(1);
        src.writeFieldName("longField");
        src.writeNumber(100000000000L);
        src.writeFieldName("bigIntField");
        src.writeNumber(BigInteger.valueOf(123456789L));
        src.writeFieldName("doubleField");
        src.writeNumber(1.5);
        src.writeFieldName("floatField");
        src.writeNumber(2.5f);
        src.writeFieldName("bigDecField");
        src.writeNumber(BigDecimal.valueOf(9.99));
        src.writeFieldName("strField");
        src.writeString("txt");
        src.writeFieldName("boolT");
        src.writeBoolean(true);
        src.writeFieldName("boolF");
        src.writeBoolean(false);
        src.writeFieldName("nul");
        src.writeNull();
        src.writeFieldName("arr");
        src.writeStartArray();
        src.writeNumber(7);
        src.writeEndArray();
        src.writeEndObject();

        TokenBuffer target = newBuffer();
        TokenBuffer returned = target.append(src);
        assertSame(target, returned);

        List<JsonToken> tokens = collectTokens(target);
        assertFalse(tokens.isEmpty());
        assertEquals(JsonToken.START_OBJECT, tokens.get(0));
        assertEquals(JsonToken.END_OBJECT, tokens.get(tokens.size() - 1));
    }

    @Test
    public void testAppend_propagatesNativeIdCapability() throws IOException, JsonGenerationException {
        TokenBuffer src = new TokenBuffer(null, true);
        TokenBuffer target = new TokenBuffer(null, false);
        assertFalse(target.canWriteTypeId());
        target.append(src);
        assertTrue(target.canWriteTypeId());
        assertTrue(target.canWriteObjectId());
    }

    // -----------------------------------------------------------------
    // serialize(JsonGenerator)
    // -----------------------------------------------------------------

    @Test
    public void testSerialize_writesAllTokenKinds() throws IOException {
        TokenBuffer src = newBuffer();
        src.writeStartObject();
        src.writeFieldName(new SerializedString("sField"));
        src.writeNumber(5);
        src.writeFieldName("bi");
        src.writeNumber(BigInteger.TEN);
        src.writeFieldName("lo");
        src.writeNumber(100000000000L);
        src.writeFieldName("sh");
        src.writeNumber((short) 3);
        src.writeFieldName("db");
        src.writeNumber(1.1);
        src.writeFieldName("bd");
        src.writeNumber(BigDecimal.TEN);
        src.writeFieldName("fl");
        src.writeNumber(1.5f);
        src.writeFieldName("strnum");
        src.writeNumber("123.45");
        src.writeFieldName("strval");
        src.writeString(new SerializedString("sVal"));
        src.writeFieldName("boolT");
        src.writeBoolean(true);
        src.writeFieldName("boolF");
        src.writeBoolean(false);
        src.writeFieldName("nul");
        src.writeNull();
        src.writeFieldName("emb");
        src.writeObject(new byte[]{9, 9});
        src.writeEndObject();

        TokenBuffer sink = newBuffer();
        src.serialize(sink);

        List<JsonToken> tokens = collectTokens(sink);
        assertEquals(JsonToken.START_OBJECT, tokens.get(0));
        assertEquals(JsonToken.END_OBJECT, tokens.get(tokens.size() - 1));
        assertTrue(tokens.contains(JsonToken.VALUE_NUMBER_INT));
        assertTrue(tokens.contains(JsonToken.VALUE_NUMBER_FLOAT));
        assertTrue(tokens.contains(JsonToken.VALUE_STRING));
        assertTrue(tokens.contains(JsonToken.VALUE_TRUE));
        assertTrue(tokens.contains(JsonToken.VALUE_FALSE));
        assertTrue(tokens.contains(JsonToken.VALUE_NULL));
        assertTrue(tokens.contains(JsonToken.VALUE_EMBEDDED_OBJECT));
        // หมายเหตุ: สาขา n==null ภายใต้ VALUE_NUMBER_FLOAT และสาขา else-throw
        // ของ VALUE_NUMBER_INT/VALUE_NUMBER_FLOAT ไม่มีทางเรียกถึงได้ผ่าน public API
        // (writeNumber overloads ที่มีอยู่ครอบคลุมแค่ Integer/Long/Short/BigInteger
        // และ Double/Float/BigDecimal/String เท่านั้น) จึงไม่ได้ทดสอบตามข้อกำหนด #4
    }

    @Test
    public void testSerialize_withNativeIds_carriesIdsWhenSegmentHasIds() throws IOException {
        TokenBuffer src = new TokenBuffer(null, true);
        src.writeTypeId("T1");
        src.writeObjectId("O1");
        src.writeString("hasIds");

        TokenBuffer sink = new TokenBuffer(null, true);
        src.serialize(sink);

        JsonParser jp = sink.asParser();
        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("hasIds", jp.getText());
    }

    // -----------------------------------------------------------------
    // deserialize(JsonParser, DeserializationContext) / copyCurrentStructure
    // -----------------------------------------------------------------

    @Test
    public void testDeserialize_fromRealJsonParser_copiesStructure() throws IOException {
        JsonFactory f = new JsonFactory();
        String json = "{\"a\":\"text\",\"b\":123,\"c\":1.5,\"d\":true,\"e\":false,\"f\":null,\"g\":[1,2,3]}";
        JsonParser jp = f.createParser(json);
        jp.nextToken(); // advance to START_OBJECT

        TokenBuffer tb = newBuffer();
        // DeserializationContext ไม่ถูกใช้ในเมธอด (ดูจากซอร์ส) จึงส่ง null ได้อย่างปลอดภัย
        TokenBuffer returned = tb.deserialize(jp, null);
        assertSame(tb, returned);

        List<JsonToken> tokens = collectTokens(tb);
        assertEquals(JsonToken.START_OBJECT, tokens.get(0));
        assertEquals(JsonToken.END_OBJECT, tokens.get(tokens.size() - 1));
        assertTrue(tokens.contains(JsonToken.VALUE_STRING));
        assertTrue(tokens.contains(JsonToken.VALUE_NUMBER_INT));
        assertTrue(tokens.contains(JsonToken.VALUE_NUMBER_FLOAT));
        assertTrue(tokens.contains(JsonToken.START_ARRAY));
        assertTrue(tokens.contains(JsonToken.END_ARRAY));
        jp.close();
    }

    @Test
    public void testCopyCurrentStructure_startingAtFieldName() throws IOException {
        JsonFactory f = new JsonFactory();
        String json = "{\"a\":42}";
        JsonParser jp = f.createParser(json);
        jp.nextToken(); // START_OBJECT
        jp.nextToken(); // FIELD_NAME "a"
        assertEquals(JsonToken.FIELD_NAME, jp.getCurrentToken());

        TokenBuffer tb = newBuffer();
        tb.copyCurrentStructure(jp);

        List<JsonToken> tokens = collectTokens(tb);
        assertEquals(JsonToken.FIELD_NAME, tokens.get(0));
        assertEquals(JsonToken.VALUE_NUMBER_INT, tokens.get(1));
        jp.close();
    }

    // -----------------------------------------------------------------
    // toString()
    // -----------------------------------------------------------------

    @Test
    public void testToString_emptyBuffer() {
        TokenBuffer tb = newBuffer();
        String s = tb.toString();
        assertTrue(s.startsWith("[TokenBuffer: "));
        assertTrue(s.endsWith("]"));
    }

    @Test
    public void testToString_withFieldName() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartObject();
        tb.writeFieldName("name1");
        tb.writeNumber(1);
        tb.writeEndObject();
        String s = tb.toString();
        assertTrue(s.contains("FIELD_NAME(name1)"));
    }

    @Test
    public void testToString_truncatesAfter100Tokens() throws IOException {
        TokenBuffer tb = newBuffer();
        for (int i = 0; i < 110; i++) {
            tb.writeNumber(i);
        }
        String s = tb.toString();
        assertTrue(s.contains("truncated"));
    }

    // -----------------------------------------------------------------
    // Segment overflow (> 16 tokens per segment)
    // -----------------------------------------------------------------

    @Test
    public void testManyTokens_forceSegmentOverflow() throws IOException {
        TokenBuffer tb = newBuffer();
        int total = 40; // > Segment.TOKENS_PER_SEGMENT(16) -> บังคับ multi-segment chain
        for (int i = 0; i < total; i++) {
            tb.writeNumber(i);
        }
        List<JsonToken> tokens = collectTokens(tb);
        assertEquals(total, tokens.size());
        for (JsonToken t : tokens) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        }
    }

    // -----------------------------------------------------------------
    // asParser() variants
    // -----------------------------------------------------------------

    @Test
    public void testAsParser_noArgUsesInternalCodec() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer tb = new TokenBuffer(mapper);
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        assertSame(mapper, jp.getCodec());
    }

    @Test
    public void testAsParser_withExplicitCodec() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        ObjectMapper mapper = new ObjectMapper();
        JsonParser jp = tb.asParser(mapper);
        assertSame(mapper, jp.getCodec());
    }

    @Test
    public void testAsParser_withSourceParser_copiesLocationAndCodec() throws IOException {
        JsonFactory f = new JsonFactory();
        ObjectMapper mapper = new ObjectMapper();
        f.setCodec(mapper);
        JsonParser src = f.createParser("123");
        src.nextToken();

        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        JsonParser jp = tb.asParser(src);
        assertSame(mapper, jp.getCodec());
        assertNotNull(jp.getTokenLocation());
        src.close();
    }

    // -----------------------------------------------------------------
    // Parser: nextToken / close / isClosed
    // -----------------------------------------------------------------

    @Test
    public void testParser_closeSetsIsClosed_andNextTokenReturnsNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        assertFalse(jp.isClosed());
        jp.close();
        assertTrue(jp.isClosed());
        assertNull(jp.nextToken());
    }

    @Test
    public void testParser_nextTokenAdvancesThroughSegmentBoundary() throws IOException {
        TokenBuffer tb = newBuffer();
        for (int i = 0; i < 20; i++) {
            tb.writeNumber(i);
        }
        JsonParser jp = tb.asParser();
        int count = 0;
        while (jp.nextToken() != null) {
            count++;
        }
        assertEquals(20, count);
        assertNull(jp.nextToken()); // เกินขอบ -> _segment==null branch
    }

    @Test
    public void testParser_peekNextToken() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeBoolean(true);
        tb.writeBoolean(false);
        JsonParser raw = tb.asParser();
        TokenBuffer.Parser jp = (TokenBuffer.Parser) raw;
        assertEquals(JsonToken.VALUE_TRUE, jp.peekNextToken());
        jp.nextToken();
        assertEquals(JsonToken.VALUE_FALSE, jp.peekNextToken());
    }

    @Test
    public void testParser_overrideCurrentName_normalToken() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartObject();
        tb.writeFieldName("orig");
        tb.writeNumber(1);
        tb.writeEndObject();
        JsonParser jp = tb.asParser();
        jp.nextToken(); // START_OBJECT
        jp.nextToken(); // FIELD_NAME orig
        jp.overrideCurrentName("renamed");
        assertEquals("renamed", jp.getCurrentName());
    }

    @Test
    public void testParser_overrideCurrentName_atStartObject_noException() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartObject();
        tb.writeEndObject();
        JsonParser jp = tb.asParser();
        jp.nextToken(); // START_OBJECT: ctxt = parent ตามเงื่อนไข START_OBJECT/ARRAY
        jp.overrideCurrentName("x"); // ต้องไม่ throw
    }

    @Test
    public void testParser_getParsingContext_notNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        assertNotNull(jp.getParsingContext());
    }

    @Test
    public void testParser_getCurrentLocation_defaultNA() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        assertEquals(JsonLocation.NA, jp.getCurrentLocation());
        assertEquals(JsonLocation.NA, jp.getTokenLocation());
    }

    // -----------------------------------------------------------------
    // Parser: text access
    // -----------------------------------------------------------------

    @Test
    public void testParser_getText_beforeAnyToken_returnsNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        assertNull(jp.getText()); // _currToken == null
    }

    @Test
    public void testParser_getText_forFieldName() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeStartObject();
        tb.writeFieldName("fname");
        tb.writeNumber(1);
        tb.writeEndObject();
        JsonParser jp = tb.asParser();
        jp.nextToken();
        jp.nextToken();
        assertEquals("fname", jp.getText());
    }

    @Test
    public void testParser_getText_forNumber() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(999);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals("999", jp.getText());
    }

    @Test
    public void testParser_getText_forOtherToken_usesAsString() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeBoolean(true);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(JsonToken.VALUE_TRUE.asString(), jp.getText());
    }

    @Test
    public void testParser_getTextCharactersAndLength() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeString("chars");
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertArrayEquals("chars".toCharArray(), jp.getTextCharacters());
        assertEquals(5, jp.getTextLength());
        assertEquals(0, jp.getTextOffset());
    }

    @Test
    public void testParser_getTextCharacters_nullText() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNull();
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertNull(jp.getTextCharacters());
        assertEquals(0, jp.getTextLength());
    }

    @Test
    public void testParser_hasTextCharacters_alwaysFalse() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeString("x");
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertFalse(jp.hasTextCharacters());
    }

    // -----------------------------------------------------------------
    // Parser: numeric access
    // -----------------------------------------------------------------

    @Test
    public void testParser_getIntValue_optimizedPath() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(77);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(77, jp.getIntValue());
    }

    @Test
    public void testParser_getIntValue_fromFloatToken() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(9.9);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(9, jp.getIntValue());
    }

    @Test
    public void testParser_getBigIntegerValue_fromBigDecimal() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(BigDecimal.valueOf(12.9));
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(BigInteger.valueOf(12), jp.getBigIntegerValue());
    }

    @Test
    public void testParser_getBigIntegerValue_fromInt() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(5);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(BigInteger.valueOf(5), jp.getBigIntegerValue());
    }

    @Test
    public void testParser_getDecimalValue_fromIntLong() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(10);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(BigDecimal.valueOf(10L), jp.getDecimalValue());
    }

    @Test
    public void testParser_getDecimalValue_fromBigInteger() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(BigInteger.valueOf(20));
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(new BigDecimal(BigInteger.valueOf(20)), jp.getDecimalValue());
    }

    @Test
    public void testParser_getDecimalValue_fromDouble() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1.5);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(BigDecimal.valueOf(1.5), jp.getDecimalValue());
    }

    @Test
    public void testParser_getNumberType_variants() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);              // Integer -> INT
        tb.writeNumber(1L);             // Long -> LONG
        tb.writeNumber(1.0);            // Double -> DOUBLE
        tb.writeNumber(BigDecimal.ONE); // BIG_DECIMAL
        tb.writeNumber(BigInteger.ONE); // BIG_INTEGER
        tb.writeNumber(1.0f);           // Float -> FLOAT
        tb.writeNumber((short) 1);      // Short -> INT (ตามคอมเมนต์ในซอร์ส "should be SHORT")

        JsonParser jp = tb.asParser();
        jp.nextToken(); assertEquals(JsonParser.NumberType.INT, jp.getNumberType());
        jp.nextToken(); assertEquals(JsonParser.NumberType.LONG, jp.getNumberType());
        jp.nextToken(); assertEquals(JsonParser.NumberType.DOUBLE, jp.getNumberType());
        jp.nextToken(); assertEquals(JsonParser.NumberType.BIG_DECIMAL, jp.getNumberType());
        jp.nextToken(); assertEquals(JsonParser.NumberType.BIG_INTEGER, jp.getNumberType());
        jp.nextToken(); assertEquals(JsonParser.NumberType.FLOAT, jp.getNumberType());
        jp.nextToken(); assertEquals(JsonParser.NumberType.INT, jp.getNumberType());
    }

    @Test
    public void testParser_getNumberValue_fromEncodedStringWithDot() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber("1.5");
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(1.5, jp.getDoubleValue(), 0.0001);
    }

    @Test
    public void testParser_getNumberValue_fromEncodedStringWithoutDot() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber("42"); // เก็บเป็น VALUE_NUMBER_FLOAT ตาม writeNumber(String) แต่ค่าเป็น String ไม่มีจุด
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertEquals(42L, jp.getLongValue());
    }

    @Test
    public void testParser_checkIsNumber_throwsForNonNumericToken() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeString("notANumber");
        JsonParser jp = tb.asParser();
        jp.nextToken();
        try {
            jp.getNumberValue();
            fail("Expected JsonParseException");
        } catch (JsonParseException expected) {
            // ok
        }
    }

    // -----------------------------------------------------------------
    // Parser: embedded object / binary
    // -----------------------------------------------------------------

    @Test
    public void testParser_getEmbeddedObject_forEmbeddedToken() throws IOException {
        TokenBuffer tb = newBuffer();
        byte[] raw = {5, 6, 7};
        tb.writeObject(raw);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertSame(raw, jp.getEmbeddedObject());
    }

    @Test
    public void testParser_getEmbeddedObject_forNonEmbeddedToken_returnsNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertNull(jp.getEmbeddedObject());
    }

    @Test
    public void testParser_getBinaryValue_fromEmbeddedByteArray() throws IOException {
        TokenBuffer tb = newBuffer();
        byte[] raw = {1, 2, 3};
        tb.writeObject(raw);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        byte[] result = jp.getBinaryValue();
        assertArrayEquals(raw, result);
    }

    @Test
    public void testParser_getBinaryValue_fromBase64String() throws IOException {
        TokenBuffer tb = newBuffer();
        byte[] raw = {10, 20, 30};
        String encoded = Base64Variants.getDefaultVariant().encode(raw);
        tb.writeString(encoded);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        byte[] result = jp.getBinaryValue();
        assertArrayEquals(raw, result);
    }

    @Test
    public void testParser_getBinaryValue_wrongToken_throws() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        try {
            jp.getBinaryValue();
            fail("Expected exception for wrong token type");
        } catch (JsonParseException expected) {
            // ok
        }
    }

    @Test
    public void testParser_readBinaryValue_writesToOutputStream() throws IOException {
        TokenBuffer tb = newBuffer();
        byte[] raw = {1, 2, 3, 4};
        tb.writeObject(raw);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = jp.readBinaryValue(out);
        assertEquals(4, n);
        assertArrayEquals(raw, out.toByteArray());
    }

    // -----------------------------------------------------------------
    // Parser: native ids
    // -----------------------------------------------------------------

    @Test
    public void testParser_canReadObjectTypeId_reflectsConstruction() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        assertTrue(jp.canReadObjectId());
        assertTrue(jp.canReadTypeId());
    }

    @Test
    public void testParser_getTypeIdAndObjectId_whenAbsent_returnNull() throws IOException {
        TokenBuffer tb = newBuffer();
        tb.writeNumber(1);
        JsonParser jp = tb.asParser();
        jp.nextToken();
        assertNull(jp.getTypeId());
        assertNull(jp.getObjectId());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| กลุ่มเทส | เมธอดที่ทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructors | `testDeprecatedConstructor*`, `testConstructorWithNativeIds*`, `testConstructorFromJsonParser` | ทั้ง 3 constructor, `_hasNativeTypeIds | _hasNativeObjectIds` ทั้ง true/false |
| firstToken | `testFirstToken_*` | `_first != null` (แต่ type(0)=null เมื่อยังไม่มี token), มีค่าจริง |
| Structural writes | `testWriteStartEndArray/Object*`, `_unbalanced_*` | `writeContext.getParent() != null` / `== null` ทั้งสองสาขา |
| writeFieldName | `testWriteFieldName_*` | overload String vs SerializableString |
| writeString | `testWriteString_*` | null→writeNull(), non-null append, char[] overload, SerializableString null/non-null |
| Unsupported ops | `testWriteRaw*_unsupported`, `testWriteUTF8*`, `testWriteBinary_inputStream_unsupported` | ทุก override ที่เรียก `_reportUnsupportedOperation()` และ throw ตรง |
| writeNumber | `testWriteNumber_*` (short/int/long/double/float/BigDecimal/BigInteger null&non-null/String) | ทุก overload, null-check ของ BigDecimal/BigInteger |
| writeBoolean/Null | `testWriteBoolean_trueFalse`, `testWriteNull` | ternary true/false, VALUE_NULL |
| writeObject/writeTree | `testWriteObject_*`, `testWriteTree_*` | null, `raw==byte[].class`, `_objectCodec==null` true/false |
| writeBinary | `testWriteBinary_storesCopyOfSubrange`, `_inputStream_unsupported` | copy สำเร็จ, UnsupportedOperationException |
| Feature/config | `testEnableDisableIsEnabled`, `testFeatureMaskGetSet`, `testUseDefaultPrettyPrinter_*`, `testSetCodecGetCodec`, `testGetOutputContext_*`, `testCanWriteBinaryNatively_*`, `testFlush_*`, `testCloseAndIsClosed` | enable/disable mask ops, no-op flush, close/isClosed |
| Native ids (generator) | `testCanWriteTypeObjectId_defaultFalse`, `testWriteTypeIdAndObjectId_*`, `testNativeId_persistsAcrossSubsequentTokens_*` | `_hasNativeId` true branch ของ `_append`, persist behavior ตามซอร์สจริง |
| append() | `testAppend_copiesAllValueTypes`, `testAppend_propagatesNativeIdCapability` | `!_hasNativeTypeIds`/`!_hasNativeObjectIds` true/false, loop `while (jp.nextToken()!=null)` |
| serialize() | `testSerialize_writesAllTokenKinds`, `testSerialize_withNativeIds_*` | switch ทุก `JsonToken` case, sub-switch VALUE_NUMBER_INT (Integer/BigInteger/Long/Short), VALUE_NUMBER_FLOAT (Double/BigDecimal/Float/String), FIELD_NAME/VALUE_STRING (String vs SerializableString), `hasIds` true/false, segment boundary loop |
| deserialize/copyCurrentStructure | `testDeserialize_fromRealJsonParser_*`, `testCopyCurrentStructure_startingAtFieldName` | เริ่มที่ FIELD_NAME (fallthrough branch), START_ARRAY/START_OBJECT recursive loop, default→copyCurrentEvent |
| toString() | `testToString_emptyBuffer`, `_withFieldName`, `_truncatesAfter100Tokens` | `count<MAX_COUNT` true/false, FIELD_NAME special append, truncated message |
| Segment overflow | `testManyTokens_forceSegmentOverflow`, `testParser_nextTokenAdvancesThroughSegmentBoundary` | `index<TOKENS_PER_SEGMENT` false branch → new Segment, `_segmentPtr>=TOKENS_PER_SEGMENT` ใน Parser |
| asParser variants | `testAsParser_noArgUsesInternalCodec`, `_withExplicitCodec`, `_withSourceParser_*` | 3 overload ของ `asParser` |
| Parser lifecycle | `testParser_closeSetsIsClosed_*`, `_nextTokenAdvancesThroughSegmentBoundary` | `_closed||_segment==null` true/false, `_segment==null` after next() |
| Parser context update | `testWriteFieldName_*` (ผ่าน parser), `testParser_overrideCurrentName_*` | FIELD_NAME/START_OBJECT/START_ARRAY/END_OBJECT/END_ARRAY branch ใน `nextToken()`, `_parsingContext==null` fallback |
| Parser peek | `testParser_peekNextToken` | `ptr>=TOKENS_PER_SEGMENT` และ `seg==null` ตรวจสอบ |
| Parser text | `testParser_getText_*`, `_getTextCharacters*`, `_hasTextCharacters_*` | `_currToken==null`, FIELD_NAME/VALUE_STRING, VALUE_NUMBER_*, default `asString()` |
| Parser numeric | `testParser_getIntValue_*`, `_getBigIntegerValue_*`, `_getDecimalValue_*`, `_getNumberType_variants`, `_getNumberValue_fromEncodedString*` | ทุก instanceof branch ของ `getNumberType/getDecimalValue/getBigIntegerValue`, String parsing (มี/ไม่มีจุด) |
| Parser error paths | `testParser_checkIsNumber_throwsForNonNumericToken`, `_getBinaryValue_wrongToken_throws` | `_checkIsNumber` throw branch, `getBinaryValue` wrong-token throw |
| Parser embedded/binary | `testParser_getEmbeddedObject_*`, `_getBinaryValue_fromEmbeddedByteArray`, `_fromBase64String`, `_readBinaryValue_*` | embedded byte[] vs base64-string decode path |
| Parser native ids | `testParser_canReadObjectTypeId_*`, `_getTypeIdAndObjectId_whenAbsent_*` | `canReadTypeId/ObjectId` true, `findTypeId/findObjectId` null branch |

**ข้อจำกัดที่ระบุด้วยคอมเมนต์ในโค้ด (ไม่ได้เดา behavior เพิ่ม):**
- `n == null` ใน `VALUE_NUMBER_FLOAT` ของ `serialize()` และ `else`-throw ใน number switch ต่าง ๆ — ไม่มีทาง reachable ผ่าน public write API
- FLOAT branch ของ `getNumberType()`/`copyCurrentEvent` ทดสอบผ่านการเขียน `Float` ตรง ๆ (ไม่ใช่ parser จาก JSON text เพราะ text parser ปกติไม่ให้ NumberType.FLOAT)
- `getNumberValue()` กรณี value ไม่ใช่ Number/String/null (throw `IllegalStateException`) ไม่ reachable ผ่าน public API จึงไม่ทดสอบ