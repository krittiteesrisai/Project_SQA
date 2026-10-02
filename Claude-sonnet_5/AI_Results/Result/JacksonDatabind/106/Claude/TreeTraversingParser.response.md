# JUnit 4 Test Suite: TreeTraversingParserTest

ด้านล่างเป็นชุดทดสอบ JUnit 4 สำหรับ `TreeTraversingParser` โดยวางคลาสทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.node`) เพื่อให้เข้าถึง protected method (เช่น `currentNode()`, `currentNumericNode()`, `_handleEOF()`) ได้โดยตรงตามกฎ Java package-level access โดยไม่ต้องใช้ reflection

```java
package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Unit tests for {@link TreeTraversingParser} (Defects4J JacksonDatabind-106b).
 *
 * หมายเหตุ: บางเมธอดภายใน (เช่น _handleEOF -> _throwInternal) ไม่มี source
 * ของ base class ให้ในโจทย์ จึงทดสอบแบบ "ต้องเกิด exception บางชนิด"
 * โดยไม่ระบุชนิดตายตัว เพื่อไม่เดา behavior ที่ไม่มีในซอร์สที่ให้มา
 */
public class TreeTraversingParserTest
{
    // ------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------

    @Test
    public void testConstructor_ArrayNode_FirstTokenIsStartArray() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
    }

    @Test
    public void testConstructor_ObjectNode_FirstTokenIsStartObject() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        TreeTraversingParser p = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
    }

    @Test
    public void testConstructor_ValueNode_NoPresetNextToken() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("hello");
        TreeTraversingParser p = new TreeTraversingParser(node);
        // else-branch: _nextToken ไม่ถูกตั้งค่า -> ไปทาง RootCursor.nextToken()
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullNode_ThrowsNPE() {
        // n.isArray() บน null -> NPE (boundary: null input)
        new TreeTraversingParser(null);
    }

    @Test
    public void testConstructor_WithCodec() {
        Object fakeCodec = null; // ObjectCodec เป็น abstract; ทดสอบผ่าน null codec ก็ยังคงตรวจ getCodec ได้
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node, null);
        assertNull(p.getCodec());
    }

    @Test
    public void testConstructor_WithoutCodec_DefaultsNull() {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        assertNull(p.getCodec());
    }

    @Test
    public void testSetCodec_UpdatesCodec() {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        com.fasterxml.jackson.databind.ObjectMapper mapper =
                new com.fasterxml.jackson.databind.ObjectMapper();
        p.setCodec(mapper);
        assertSame(mapper, p.getCodec());
    }

    @Test
    public void testVersion_NotNull() {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        assertNotNull(p.version());
    }

    // ------------------------------------------------------------------
    // close() / isClosed()
    // ------------------------------------------------------------------

    @Test
    public void testClose_SetsClosedAndClearsState() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertFalse(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
        assertNull(p.getCurrentName()); // _nodeCursor ถูกตั้งเป็น null แล้ว
    }

    @Test
    public void testClose_CalledTwice_Idempotent() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.close();
        p.close(); // ไม่ควร throw ซ้ำ (if (!_closed) guard)
        assertTrue(p.isClosed());
    }

    // ------------------------------------------------------------------
    // nextToken() - หลากหลาย branch
    // ------------------------------------------------------------------

    @Test
    public void testNextToken_TopLevelEmptyArray() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
        assertTrue(p.isClosed());
    }

    @Test
    public void testNextToken_TopLevelEmptyObject() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        TreeTraversingParser p = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextToken_ArrayWithElements() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        arr.add(1);
        arr.add(2);
        TreeTraversingParser p = new TreeTraversingParser(arr);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextToken_ObjectWithFields() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        obj.put("a", 1);
        TreeTraversingParser p = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextToken_NestedNonEmptyArray_UsesIterateChildren() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        ArrayNode inner = obj.putArray("list");
        inner.add(1);
        inner.add(2);
        TreeTraversingParser p = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());   // _startContainer = true ถูกตั้ง
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken()); // ผ่าน iterateChildren()
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextToken_NestedEmptyArray_SkipOptimization() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        obj.putArray("list"); // ลูกว่าง
        TreeTraversingParser p = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        // currentHasChildren()==false -> ทางลัด END_ARRAY (ternary else branch)
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextToken_NestedEmptyObject_SkipOptimization() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        obj.putObject("inner"); // object ลูกว่าง
        TreeTraversingParser p = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        // currentHasChildren()==false, _currToken==START_OBJECT -> ternary then-branch END_OBJECT
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextToken_ValueNode_SingleTokenThenNull() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("solo");
        TreeTraversingParser p = new TreeTraversingParser(node);
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertNull(p.nextToken());
        assertTrue(p.isClosed());
    }

    // ------------------------------------------------------------------
    // skipChildren()
    // ------------------------------------------------------------------

    @Test
    public void testSkipChildren_FromStartObject() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        obj.put("a", 1);
        TreeTraversingParser p = new TreeTraversingParser(obj);
        p.nextToken(); // START_OBJECT
        JsonParser r = p.skipChildren();
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        assertSame(p, r);
    }

    @Test
    public void testSkipChildren_FromStartArray() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        arr.add(1);
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken(); // START_ARRAY
        p.skipChildren();
        assertEquals(JsonToken.END_ARRAY, p.getCurrentToken());
    }

    @Test
    public void testSkipChildren_OtherToken_NoChange() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken(); // VALUE_STRING
        p.skipChildren();
        assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken());
    }

    // ------------------------------------------------------------------
    // getCurrentName() / overrideCurrentName() / getParsingContext()
    // ------------------------------------------------------------------

    @Test
    public void testGetCurrentName_NullCursor() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken();
        p.nextToken(); // _nodeCursor -> null
        assertNull(p.getCurrentName());
    }

    @Test
    public void testGetCurrentName_WithCursor() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        obj.put("foo", "bar");
        TreeTraversingParser p = new TreeTraversingParser(obj);
        p.nextToken();
        p.nextToken(); // FIELD_NAME foo
        assertEquals("foo", p.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName_NullCursor_NoException() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken();
        p.nextToken(); // cursor null
        p.overrideCurrentName("test"); // ไม่ควร throw (if (_nodeCursor != null))
    }

    @Test
    public void testOverrideCurrentName_WithCursor() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        obj.put("foo", "bar");
        TreeTraversingParser p = new TreeTraversingParser(obj);
        p.nextToken();
        p.nextToken(); // FIELD_NAME foo
        p.overrideCurrentName("baz");
        assertEquals("baz", p.getCurrentName());
    }

    @Test
    public void testGetParsingContext_NotNull() {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        assertNotNull(p.getParsingContext());
    }

    @Test
    public void testGetLocations_AlwaysNA() {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        assertEquals(JsonLocation.NA, p.getTokenLocation());
        assertEquals(JsonLocation.NA, p.getCurrentLocation());
    }

    // ------------------------------------------------------------------
    // getText() - switch ทุก case
    // ------------------------------------------------------------------

    @Test
    public void testGetText_Closed_ReturnsNull() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        p.close();
        assertNull(p.getText());
    }

    @Test(expected = NullPointerException.class)
    public void testGetText_NullCurrentToken_ThrowsNPE() {
        // FAULT-CANDIDATE: switch(_currToken) กับ _currToken == null (ยังไม่เรียก nextToken)
        // จะทำให้เกิด NullPointerException จาก switch บน enum null แทนที่จะ return null อย่างปลอดภัย
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.getText();
    }

    @Test
    public void testGetText_FieldName() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        obj.put("key", "value");
        TreeTraversingParser p = new TreeTraversingParser(obj);
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        assertEquals("key", p.getText());
    }

    @Test
    public void testGetText_ValueString() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("hello");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals("hello", p.getText());
    }

    @Test
    public void testGetText_ValueNumberInt() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(42);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals("42", p.getText());
    }

    @Test
    public void testGetText_ValueNumberFloat() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(3.14);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(String.valueOf(3.14), p.getText());
    }

    @Test
    public void testGetText_EmbeddedObject_Binary() throws IOException {
        byte[] data = { 1, 2, 3 };
        JsonNode node = JsonNodeFactory.instance.binaryNode(data);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertNotNull(p.getText()); // base64 string จาก n.asText()
    }

    @Test
    public void testGetText_EmbeddedObject_NonBinary_FallsThroughToDefault() throws IOException {
        // ไม่มี break ใน case VALUE_EMBEDDED_OBJECT เมื่อไม่ใช่ binary -> fallthrough ไป default
        JsonNode node = JsonNodeFactory.instance.pojoNode(new Object());
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.getCurrentToken());
        assertNull(p.getText()); // VALUE_EMBEDDED_OBJECT.asString() == null
    }

    @Test
    public void testGetText_Default_ValueNull() throws IOException {
        JsonNode node = JsonNodeFactory.instance.nullNode();
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals("null", p.getText());
    }

    @Test
    public void testGetText_Default_ValueTrue() throws IOException {
        JsonNode node = JsonNodeFactory.instance.booleanNode(true);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals("true", p.getText());
    }

    @Test
    public void testGetText_Default_StartObjectToken() throws IOException {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        TreeTraversingParser p = new TreeTraversingParser(obj);
        p.nextToken(); // START_OBJECT
        assertEquals("{", p.getText());
    }

    @Test
    public void testGetTextCharactersLengthOffset_HasTextCharacters() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("abc");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertArrayEquals("abc".toCharArray(), p.getTextCharacters());
        assertEquals(3, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertFalse(p.hasTextCharacters());
    }

    // ------------------------------------------------------------------
    // getNumberType() - รวม dead-code null-check (fault-candidate)
    // ------------------------------------------------------------------

    @Test
    public void testGetNumberType_ValidNumeric() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(42);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(JsonParser.NumberType.INT, p.getNumberType());
    }

    @Test(expected = JsonParseException.class)
    public void testGetNumberType_NonNumericToken_ThrowsInsteadOfNull() throws IOException {
        // FAULT-CANDIDATE: currentNumericNode() ไม่เคย return null (throw เสมอเมื่อไม่ใช่ตัวเลข)
        // ทำให้ (n == null) ? null : ... เป็น dead code; getNumberType() จึง throw
        // แทนที่จะคืน null อย่างที่ signature ตั้งใจไว้
        JsonNode node = JsonNodeFactory.instance.textNode("abc");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        p.getNumberType();
    }

    @Test(expected = JsonParseException.class)
    public void testGetNumberType_NullCurrentNode_ThrowsInsteadOfNull() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken();
        p.nextToken(); // cursor -> null, currentNode() == null
        p.getNumberType();
    }

    // ------------------------------------------------------------------
    // numeric accessors (BigInteger/Decimal/Double/Float/Int/Long/Number)
    // ------------------------------------------------------------------

    @Test
    public void testGetBigIntegerValue_Valid() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(new BigInteger("123456789012345"));
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(new BigInteger("123456789012345"), p.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue_Valid() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(new BigDecimal("3.14159"));
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(new BigDecimal("3.14159"), p.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue_Valid() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(2.5d);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(2.5d, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testGetFloatValue_Valid() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(2.5f);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(2.5f, p.getFloatValue(), 0.0001f);
    }

    @Test
    public void testGetIntValue_Valid() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(123);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(123, p.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testGetIntValue_NonNumeric_Throws() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("abc");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        p.getIntValue();
    }

    @Test
    public void testGetLongValue_Valid() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(123456789L);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(123456789L, p.getLongValue());
    }

    @Test
    public void testGetNumberValue_Valid() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(7);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertEquals(7, p.getNumberValue());
    }

    // ------------------------------------------------------------------
    // getEmbeddedObject()
    // ------------------------------------------------------------------

    @Test
    public void testGetEmbeddedObject_Closed_ReturnsNull() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        p.close();
        assertNull(p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObject_NullCurrentNode() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken();
        p.nextToken(); // cursor null -> currentNode() null
        assertNull(p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObject_Pojo() throws IOException {
        Object pojo = new Object();
        JsonNode node = JsonNodeFactory.instance.pojoNode(pojo);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertSame(pojo, p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObject_Binary() throws IOException {
        byte[] data = { 9, 9, 9 };
        JsonNode node = JsonNodeFactory.instance.binaryNode(data);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertArrayEquals(data, (byte[]) p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObject_NeitherPojoNorBinary_ReturnsNull() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("plain");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertNull(p.getEmbeddedObject());
    }

    // ------------------------------------------------------------------
    // isNaN()
    // ------------------------------------------------------------------

    @Test
    public void testIsNaN_Closed_ReturnsFalse() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(Double.NaN);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        p.close();
        assertFalse(p.isNaN());
    }

    @Test
    public void testIsNaN_NotNumericNode_ReturnsFalse() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("abc");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertFalse(p.isNaN());
    }

    @Test
    public void testIsNaN_NumericNode_IsNaN_True() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(Double.NaN);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertTrue(p.isNaN());
    }

    @Test
    public void testIsNaN_NumericNode_NotNaN_False() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(1.5);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertFalse(p.isNaN());
    }

    // ------------------------------------------------------------------
    // getBinaryValue() / readBinaryValue()
    // ------------------------------------------------------------------

    @Test
    public void testGetBinaryValue_NullCurrentNode_ReturnsNull() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken();
        p.nextToken(); // cursor null
        assertNull(p.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testGetBinaryValue_TextNode_DecodesBase64() throws IOException {
        String encoded = Base64Variants.getDefaultVariant().encode("hello".getBytes());
        JsonNode node = JsonNodeFactory.instance.textNode(encoded);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        byte[] result = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("hello".getBytes(), result);
    }

    @Test
    public void testGetBinaryValue_BinaryNode_ReturnsRawBytes() throws IOException {
        byte[] data = { 1, 2, 3 };
        JsonNode node = JsonNodeFactory.instance.binaryNode(data);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        byte[] result = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(data, result);
    }

    @Test
    public void testReadBinaryValue_WithData_WritesAndReturnsLength() throws IOException {
        byte[] data = { 5, 6, 7 };
        JsonNode node = JsonNodeFactory.instance.binaryNode(data);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(3, len);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testReadBinaryValue_NoData_ReturnsZero() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken();
        p.nextToken(); // cursor null -> data null
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(0, len);
        assertEquals(0, out.size());
    }

    // ------------------------------------------------------------------
    // internal: currentNode() / currentNumericNode() (same-package access)
    // ------------------------------------------------------------------

    @Test
    public void testCurrentNode_Closed_ReturnsNull() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        p.close();
        assertNull(p.currentNode());
    }

    @Test
    public void testCurrentNode_NullCursor_ReturnsNull() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken();
        p.nextToken(); // cursor -> null
        assertNull(p.currentNode());
    }

    @Test
    public void testCurrentNode_Active_ReturnsNode() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertSame(node, p.currentNode());
    }

    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode_NullNode_Throws() throws IOException {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        TreeTraversingParser p = new TreeTraversingParser(arr);
        p.nextToken();
        p.nextToken(); // cursor null
        p.currentNumericNode();
    }

    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode_NotNumber_Throws() throws IOException {
        JsonNode node = JsonNodeFactory.instance.textNode("abc");
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        p.currentNumericNode();
    }

    @Test
    public void testCurrentNumericNode_Valid_ReturnsSameNode() throws IOException {
        JsonNode node = JsonNodeFactory.instance.numberNode(5);
        TreeTraversingParser p = new TreeTraversingParser(node);
        p.nextToken();
        assertSame(node, p.currentNumericNode());
    }

    // ------------------------------------------------------------------
    // _handleEOF() - พฤติกรรมจริงของ base class ไม่ปรากฎในซอร์สที่ให้มา
    // ------------------------------------------------------------------

    @Test
    public void testHandleEOF_ThrowsSomeException() throws IOException {
        // _handleEOF() เรียก _throwInternal() ซึ่งมาจาก base class ที่ไม่ได้ให้ source มา
        // จึงทดสอบแค่ว่าเกิด exception จริง โดยไม่ระบุชนิดที่แน่นอน (ป้องกันการเดา behavior)
        JsonNode node = JsonNodeFactory.instance.textNode("x");
        TreeTraversingParser p = new TreeTraversingParser(node);
        try {
            p._handleEOF();
            fail("Expected an exception from _handleEOF()/_throwInternal()");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_ArrayNode_FirstTokenIsStartArray | constructor: `n.isArray()==true` |
| testConstructor_ObjectNode_FirstTokenIsStartObject | constructor: `n.isObject()==true` |
| testConstructor_ValueNode_NoPresetNextToken | constructor: else (value node) |
| testConstructor_NullNode_ThrowsNPE | boundary: null input -> NPE |
| testConstructor_WithCodec / WithoutCodec / SetCodec | getCodec/setCodec |
| testVersion_NotNull | version() |
| testClose_SetsClosedAndClearsState | close(): `!_closed==true` |
| testClose_CalledTwice_Idempotent | close(): `!_closed==false` |
| testNextToken_TopLevelEmptyArray/Object | nextToken: cursor.nextToken()==null -> endToken()+getParent() |
| testNextToken_ArrayWithElements | nextToken: currToken!=null, ไม่ใช่ START_* |
| testNextToken_ObjectWithFields | FIELD_NAME + VALUE branch |
| testNextToken_NestedNonEmptyArray_UsesIterateChildren | `_startContainer==true`, `currentHasChildren()==true` -> iterateChildren() |
| testNextToken_NestedEmptyArray_SkipOptimization | `_startContainer==true`, `currentHasChildren()==false`, ternary else (END_ARRAY) |
| testNextToken_NestedEmptyObject_SkipOptimization | ternary then (END_OBJECT) |
| testNextToken_ValueNode_SingleTokenThenNull | `_nodeCursor==null` branch -> return null, `_closed=true` |
| testSkipChildren_FromStartObject/Array/OtherToken | skipChildren(): if/else if/no-match |
| testGetCurrentName_NullCursor / WithCursor | getCurrentName(): null-check |
| testOverrideCurrentName_NullCursor / WithCursor | overrideCurrentName(): null-check |
| testGetParsingContext_NotNull, testGetLocations_AlwaysNA | getParsingContext/getTokenLocation/getCurrentLocation |
| testGetText_Closed_ReturnsNull | getText(): `_closed==true` |
| testGetText_NullCurrentToken_ThrowsNPE | **FAULT**: switch(null) -> NPE ก่อนถึง default check |
| testGetText_FieldName/ValueString/ValueNumberInt/ValueNumberFloat | switch cases ตามลำดับ |
| testGetText_EmbeddedObject_Binary | VALUE_EMBEDDED_OBJECT + isBinary true |
| testGetText_EmbeddedObject_NonBinary_FallsThroughToDefault | VALUE_EMBEDDED_OBJECT ไม่ binary -> fallthrough (no break) |
| testGetText_Default_ValueNull/True/StartObjectToken | default case หลากหลาย token |
| testGetTextCharactersLengthOffset_HasTextCharacters | getTextCharacters/Length/Offset/hasTextCharacters |
| testGetNumberType_ValidNumeric | getNumberType() ปกติ |
| testGetNumberType_NonNumericToken_ThrowsInsteadOfNull | **FAULT**: dead-code null check, throw แทน null |
| testGetNumberType_NullCurrentNode_ThrowsInsteadOfNull | เหมือนด้านบน กรณี node null |
| testGetBigIntegerValue/Decimal/Double/Float/Int/Long/NumberValue_Valid | numeric getters ปกติ |
| testGetIntValue_NonNumeric_Throws | currentNumericNode() throw ผ่าน getIntValue |
| testGetEmbeddedObject_Closed/NullCurrentNode/Pojo/Binary/NeitherPojoNorBinary | isPojo/isBinary/else ทุกสาขา |
| testIsNaN_Closed/NotNumericNode/IsNaN_True/NotNaN_False | isNaN() ทุกสาขา |
| testGetBinaryValue_NullCurrentNode/TextNode/BinaryNode | getBinaryValue() ทุกสาขา |
| testReadBinaryValue_WithData/NoData | readBinaryValue(): data!=null/null |
| testCurrentNode_Closed/NullCursor/Active | currentNode(): `_closed || _nodeCursor==null` ทุก operand |
| testCurrentNumericNode_NullNode/NotNumber/Valid | currentNumericNode(): ทุกสาขา |
| testHandleEOF_ThrowsSomeException | _handleEOF() ถูกเรียกจริง (ไม่เดา exception type) |

**หมายเหตุสำคัญ:** เทสสองกลุ่ม `testGetText_NullCurrentToken_ThrowsNPE` และ `testGetNumberType_*_ThrowsInsteadOfNull` ถูกออกแบบมาเพื่อดักจับพฤติกรรมที่ดูเหมือนเป็น **fault** จริงในเวอร์ชัน buggy (106b) — คือ `getNumberType()` มี null-check ที่ตายแล้ว (`currentNumericNode()` ไม่เคย return null) และ `getText()` เกิด NPE จาก `switch(null)` แทนที่จะคืนค่า null อย่างปลอดภัย