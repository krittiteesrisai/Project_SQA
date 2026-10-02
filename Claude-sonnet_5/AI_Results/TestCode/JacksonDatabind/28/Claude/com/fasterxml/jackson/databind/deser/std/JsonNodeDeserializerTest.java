package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class JsonNodeDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------------------------------------------------------------
    // 1. Factory method: getDeserializer(Class<?>)
    // ---------------------------------------------------------------

    @Test
    public void testGetDeserializer_ObjectNodeClass_ReturnsObjectDeserializer() {
        JsonDeserializer<? extends JsonNode> d =
                JsonNodeDeserializer.getDeserializer(ObjectNode.class);
        assertTrue(d instanceof JsonNodeDeserializer.ObjectDeserializer);
    }

    @Test
    public void testGetDeserializer_ArrayNodeClass_ReturnsArrayDeserializer() {
        JsonDeserializer<? extends JsonNode> d =
                JsonNodeDeserializer.getDeserializer(ArrayNode.class);
        assertTrue(d instanceof JsonNodeDeserializer.ArrayDeserializer);
    }

    @Test
    public void testGetDeserializer_OtherClass_ReturnsGenericSingletonInstance() {
        JsonDeserializer<? extends JsonNode> d1 =
                JsonNodeDeserializer.getDeserializer(TextNode.class);
        JsonDeserializer<? extends JsonNode> d2 =
                JsonNodeDeserializer.getDeserializer(JsonNode.class);

        assertFalse(d1 instanceof JsonNodeDeserializer.ObjectDeserializer);
        assertFalse(d1 instanceof JsonNodeDeserializer.ArrayDeserializer);
        // ต้องเป็น singleton instance เดียวกัน (default branch คืนค่า static field เดิม)
        assertSame(d1, d2);
    }

    // ---------------------------------------------------------------
    // 2. getNullValue()
    // ---------------------------------------------------------------

    @Test
    public void testGetNullValue_WithContext() {
        JsonNodeDeserializer deser = new JsonNodeDeserializer();
        JsonNode n = deser.getNullValue(null); // ctxt ไม่ถูกใช้งานภายในเมธอด
        assertTrue(n.isNull());
        assertSame(NullNode.getInstance(), n);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetNullValue_Deprecated_NoArg() {
        JsonNodeDeserializer deser = new JsonNodeDeserializer();
        JsonNode n = deser.getNullValue();
        assertSame(NullNode.getInstance(), n);
    }

    // ---------------------------------------------------------------
    // 3. deserialize(): top-level switch (START_OBJECT / START_ARRAY / default)
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_EmptyObject() throws IOException {
        JsonNode n = mapper.readTree("{}");
        assertTrue(n.isObject());
        assertEquals(0, n.size());
    }

    @Test
    public void testDeserialize_EmptyArray() throws IOException {
        JsonNode n = mapper.readTree("[]");
        assertTrue(n.isArray());
        assertEquals(0, n.size());
    }

    @Test
    public void testDeserialize_ScalarString() throws IOException {
        JsonNode n = mapper.readTree("\"hello\"");
        assertTrue(n.isTextual());
        assertEquals("hello", n.textValue());
    }

    @Test
    public void testDeserialize_ScalarInt() throws IOException {
        JsonNode n = mapper.readTree("42");
        assertTrue(n.isInt());
        assertEquals(42, n.intValue());
    }

    @Test
    public void testDeserialize_ScalarTrue() throws IOException {
        JsonNode n = mapper.readTree("true");
        assertTrue(n.isBoolean());
        assertTrue(n.booleanValue());
    }

    @Test
    public void testDeserialize_ScalarFalse() throws IOException {
        JsonNode n = mapper.readTree("false");
        assertTrue(n.isBoolean());
        assertFalse(n.booleanValue());
    }

    @Test
    public void testDeserialize_ScalarNull() throws IOException {
        JsonNode n = mapper.readTree("null");
        assertTrue(n.isNull());
    }

    // ---------------------------------------------------------------
    // 4. deserializeObject(): nested types + recursion + all switch cases
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeObject_AllFieldTypeBranches() throws IOException {
        String json = "{"
                + "\"obj\":{\"x\":1},"
                + "\"arr\":[1,2,3],"
                + "\"str\":\"text\","
                + "\"intVal\":123,"
                + "\"boolTrue\":true,"
                + "\"boolFalse\":false,"
                + "\"nul\":null"
                + "}";
        ObjectNode node = (ObjectNode) mapper.readTree(json);

        assertTrue(node.get("obj").isObject());
        assertEquals(1, node.get("obj").get("x").intValue());

        assertTrue(node.get("arr").isArray());
        assertEquals(3, node.get("arr").size());

        assertTrue(node.get("str").isTextual());
        assertEquals("text", node.get("str").textValue());

        assertTrue(node.get("intVal").isInt());
        assertTrue(node.get("boolTrue").booleanValue());
        assertFalse(node.get("boolFalse").booleanValue());
        assertTrue(node.get("nul").isNull());
    }

    @Test
    public void testDeserializeObject_EmptyObjectReturnsEmptyNode() throws IOException {
        // ทดสอบ branch: p.getCurrentToken()==END_OBJECT -> return node ทันที
        ObjectNode node = mapper.readValue("{}", ObjectNode.class);
        assertEquals(0, node.size());
    }

    @Test
    public void testDeserializeObject_DuplicateField_DefaultBehavior_LastWins() throws IOException {
        // ทดสอบ _handleDuplicateField เมื่อ FAIL_ON_READING_DUP_TREE_KEY ปิดอยู่ (default)
        JsonNode node = mapper.readTree("{\"a\":1,\"a\":2}");
        assertEquals(2, node.get("a").intValue());
    }

    @Test
    public void testDeserializeObject_DuplicateField_FailOnDup_ThrowsException() {
        mapper.configure(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY, true);
        try {
            mapper.readTree("{\"a\":1,\"a\":2}");
            fail("ควร throw JsonMappingException เมื่อ FAIL_ON_READING_DUP_TREE_KEY เปิดอยู่");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
        }
    }

    // ---------------------------------------------------------------
    // 5. ObjectDeserializer.deserialize(): branch ต่าง ๆ
    // ---------------------------------------------------------------

    @Test
    public void testObjectDeserializer_ValidObject() throws IOException {
        ObjectNode node = mapper.readValue("{\"x\":1}", ObjectNode.class);
        assertEquals(1, node.get("x").intValue());
    }

    @Test
    public void testObjectDeserializer_NonObjectInput_Throws() {
        try {
            mapper.readValue("123", ObjectNode.class);
            fail("ควร throw exception เมื่อ input ไม่ใช่ object");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
        }
    }

    // ---------------------------------------------------------------
    // 6. ArrayDeserializer.deserialize(): branch ต่าง ๆ
    // ---------------------------------------------------------------

    @Test
    public void testArrayDeserializer_ValidArray() throws IOException {
        ArrayNode node = mapper.readValue("[1,2,3]", ArrayNode.class);
        assertEquals(3, node.size());
    }

    @Test
    public void testArrayDeserializer_NonArrayInput_Throws() {
        try {
            mapper.readValue("123", ArrayNode.class);
            fail("ควร throw exception เมื่อ input ไม่ใช่ array");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserializeArray_TruncatedInput_ThrowsSomeIOException() {
        // ทดสอบ branch: t == null -> throw mappingException("Unexpected end-of-input...")
        // หมายเหตุ: ในทางปฏิบัติ JsonParser มักจะ throw JsonParseException ของตัวเองก่อน
        // ที่ nextToken() จะคืน null (เนื่องจากตรวจ context ปิด/เปิดวงเล็บ)
        // ดังนั้น test นี้ตรวจสอบเพียงว่ามี IOException เกิดขึ้นจริง ไม่ระบุ subtype ตายตัว
        try {
            mapper.readValue("[1,2", ArrayNode.class);
            fail("ควร throw IOException สำหรับ array ที่ไม่ปิด bracket");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // 7. **จุดสำคัญ**: บั๊กจริงของ Defects4J JacksonDatabind-28
    //    deserializeArray(): case ID_EMBEDDED_OBJECT ไม่มี break -> fallthrough ไป ID_STRING
    // ---------------------------------------------------------------

    @Test
    public void testArray_EmbeddedObject_NoFallthroughDuplicate() throws IOException {
        // สร้าง token stream: [ EMBEDDED_OBJECT(byte[]) ]
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartArray();
        buf.writeEmbeddedObject(new byte[] {1, 2, 3});
        buf.writeEndArray();

        JsonParser p = buf.asParser();
        p.nextToken(); // เข้าสู่ START_ARRAY

        ArrayNode result = mapper.readValue(p, ArrayNode.class);

        // ถ้าโค้ดมี bug (ไม่มี break) จะได้ size == 2
        // (1 = binary node จาก _fromEmbedded, 1 = text node เพิ่มมาจาก fallthrough)
        // โค้ดที่ถูกต้องต้องได้ size == 1 เท่านั้น
        assertEquals("ควรมีแค่ 1 element ไม่ใช่ fallthrough เพิ่ม text node", 1, result.size());
        assertTrue(result.get(0).isBinary());
        assertArrayEquals(new byte[] {1, 2, 3}, result.get(0).binaryValue());
    }

    // ---------------------------------------------------------------
    // 8. _fromInt(): branch ทั้งหมด (default / USE_BIG_INTEGER / USE_LONG)
    // ---------------------------------------------------------------

    @Test
    public void testFromInt_DefaultSmallInt_IsIntNode() throws IOException {
        JsonNode n = mapper.readTree("42");
        assertTrue(n.isInt());
    }

    @Test
    public void testFromInt_NaturalLong_IsLongNode() throws IOException {
        // ค่านี้เกิน int range แต่พอดี long -> NumberType ธรรมชาติคือ LONG
        JsonNode n = mapper.readTree("4294967296"); // 2^32
        assertTrue(n.isLong());
    }

    @Test
    public void testFromInt_NaturalBigInteger_IsBigIntegerNode() throws IOException {
        JsonNode n = mapper.readTree("123456789012345678901234567890");
        assertTrue(n.isBigInteger());
        assertEquals(new BigInteger("123456789012345678901234567890"), n.bigIntegerValue());
    }

    @Test
    public void testFromInt_UseBigIntegerForInts_ForcesBigIntegerEvenForSmallValue() throws IOException {
        mapper.configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true);
        JsonNode n = mapper.readTree("1");
        assertTrue(n.isBigInteger());
    }

    @Test
    public void testFromInt_UseLongForInts_ForcesLongEvenForSmallValue() throws IOException {
        mapper.configure(DeserializationFeature.USE_LONG_FOR_INTS, true);
        JsonNode n = mapper.readTree("1");
        assertTrue(n.isLong());
    }

    // ---------------------------------------------------------------
    // 9. _fromFloat(): branch (default double / USE_BIG_DECIMAL_FOR_FLOATS)
    // ---------------------------------------------------------------

    @Test
    public void testFromFloat_DefaultDouble() throws IOException {
        JsonNode n = mapper.readTree("1.5");
        assertTrue(n.isDouble());
        assertEquals(1.5, n.doubleValue(), 0.0001);
    }

    @Test
    public void testFromFloat_UseBigDecimalForFloats_ForcesDecimalNode() throws IOException {
        mapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        JsonNode n = mapper.readTree("1.5");
        assertTrue(n.isBigDecimal());
    }

    // หมายเหตุ: กรณี p.getNumberType()==NumberType.BIG_DECIMAL แบบธรรมชาติ (ไม่ผ่าน feature flag)
    // ขึ้นกับ parser internal ในการตัดสินใจ ซึ่งไม่สามารถยืนยัน literal ที่ trigger ได้แน่นอน
    // จากซอร์สที่ให้มา จึงไม่ทดสอบ branch นี้แยก เพื่อไม่ guess behavior (ข้อกำหนด #4)

    // ---------------------------------------------------------------
    // 10. _fromEmbedded(): branch ทั้งหมด
    // ---------------------------------------------------------------

    @Test
    public void testFromEmbedded_ByteArray_ReturnsBinaryNode() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject(new byte[] {9, 8, 7});
        JsonParser p = buf.asParser();
        p.nextToken();

        JsonNode n = mapper.readValue(p, JsonNode.class);
        assertTrue(n instanceof BinaryNode);
        assertArrayEquals(new byte[] {9, 8, 7}, n.binaryValue());
    }

    @Test
    public void testFromEmbedded_RawValue_PreservesRawContent() throws IOException {
        RawValue raw = new RawValue("RAWCONTENT");
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject(raw);
        JsonParser p = buf.asParser();
        p.nextToken();

        JsonNode n = mapper.readValue(p, JsonNode.class);
        assertNotNull(n);
        // RawValue ควรถูกเขียนออกมาแบบ raw โดยไม่มี quote/encode เพิ่ม
        String out = mapper.writeValueAsString(n);
        assertEquals("RAWCONTENT", out);
    }

    @Test
    public void testFromEmbedded_JsonNodeInstance_ReturnsSameReference() throws IOException {
        TextNode embedded = TextNode.valueOf("already-a-node");
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject(embedded);
        JsonParser p = buf.asParser();
        p.nextToken();

        JsonNode n = mapper.readValue(p, JsonNode.class);
        assertSame(embedded, n);
    }

    @Test
    public void testFromEmbedded_GenericPojo_ReturnsPojoNode() throws IOException {
        Object pojo = new Object() {
            @Override
            public String toString() { return "custom-pojo"; }
        };
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject(pojo);
        JsonParser p = buf.asParser();
        p.nextToken();

        JsonNode n = mapper.readValue(p, JsonNode.class);
        assertTrue(n instanceof POJONode);
        assertSame(pojo, ((POJONode) n).getPojo());
    }

    // หมายเหตุ: กรณี ob == null ใน _fromEmbedded ไม่ทดสอบ เนื่องจากไม่สามารถยืนยันได้แน่ชัด
    // ว่า TokenBuffer.writeEmbeddedObject(null) จะสร้าง token VALUE_EMBEDDED_OBJECT
    // ที่มี payload null จริง (อาจถูก JsonGenerator base class แปลงเป็น writeNull() แทน)
    // จึงข้ามเพื่อไม่ guess behavior (ข้อกำหนด #4)

    // ---------------------------------------------------------------
    // 11. deserializeAny(): ID_FIELD_NAME branch (เข้าทาง deserializeObject else-branch)
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeAny_FieldNameAsFirstToken() throws IOException {
        // จำลองพาร์เซอร์ที่ถูกวางตำแหน่งไว้ที่ FIELD_NAME ตั้งแต่ token แรก
        // (ทดสอบ branch: p.getCurrentTokenId()==ID_FIELD_NAME ในเมธอด deserializeAny
        //  และ branch "key = p.getCurrentName()" ใน deserializeObject)
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeFieldName("a");
        buf.writeNumber(1);
        JsonParser p = buf.asParser();
        p.nextToken(); // FIELD_NAME "a"

        JsonNode n = mapper.readValue(p, JsonNode.class);
        assertTrue(n.isObject());
        assertEquals(1, n.get("a").intValue());
    }

    // หมายเหตุ: branch ID_END_OBJECT ใน deserializeAny (เมื่อ token แรกคือ END_OBJECT เปล่า ๆ)
    // ไม่ได้ทดสอบ เนื่องจากการสร้าง token stream ที่มี writeEndObject() โดยไม่มี
    // writeStartObject() คู่กันอาจทำให้ TokenBuffer internal context ผิดพลาดหรือ throw
    // exception ที่ไม่เกี่ยวกับ class เป้าหมาย จึงข้ามเพื่อความปลอดภัยของผลทดสอบ (ข้อกำหนด #4)
}
