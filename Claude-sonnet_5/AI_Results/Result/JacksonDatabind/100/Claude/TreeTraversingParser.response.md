# วิเคราะห์โค้ดและแผนการทดสอบ

ผมวิเคราะห์ `TreeTraversingParser` แล้วแบ่ง branch สำคัญที่ต้องครอบคลุม:

- Constructor: array / object / value node
- `nextToken()`: buffered `_nextToken`, `_startContainer` (empty container ทั้ง START_OBJECT/START_ARRAY, non-empty), `_nodeCursor==null`, cursor return null→endToken/getParent
- `skipChildren()`: START_OBJECT / START_ARRAY / อื่น ๆ
- `getText()`: switch-case ทุก case รวม fallthrough ของ VALUE_EMBEDDED_OBJECT, closed, และ NPE เมื่อ `_currToken==null`
- `currentNode()` / `currentNumericNode()`: closed, cursor null, non-numeric
- `getEmbeddedObject()`, `isNaN()`, `getBinaryValue()`, `readBinaryValue()`
- `getCurrentName()`, `overrideCurrentName()`, `getParsingContext()`, location/codec/version getters

```java
package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.node.TreeTraversingParser; // explicit import ตามข้อกำหนด

public class TreeTraversingParserTest {

    private final JsonNodeFactory f = JsonNodeFactory.instance;

    // ---------- Constructor ----------

    @Test
    public void testConstructor_ArrayNode_FirstTokenIsStartArray() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.arrayNode());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
    }

    @Test
    public void testConstructor_ObjectNode_FirstTokenIsStartObject() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.objectNode());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
    }

    @Test
    public void testConstructor_ValueNode_UsesRootCursor_NoBufferedToken() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(5));
        // ไม่มี _nextToken บัฟเฟอร์ ต้องไปตามทาง _nodeCursor.nextToken()
        JsonToken t = p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
    }

    // ---------- nextToken() top-level empty/non-empty ----------

    @Test
    public void testTopLevelEmptyArray_Traversal() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.arrayNode());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
        assertTrue(p.isClosed());
    }

    @Test
    public void testTopLevelEmptyObject_Traversal() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.objectNode());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        assertTrue(p.isClosed());
    }

    @Test
    public void testTopLevelNonEmptyArrayOfScalars() throws Exception {
        ArrayNode an = f.arrayNode();
        an.add(1);
        an.add(2);
        TreeTraversingParser p = new TreeTraversingParser(an);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testTopLevelNonEmptyObjectWithScalarField() throws Exception {
        ObjectNode on = f.objectNode();
        on.put("field1", "value1");
        TreeTraversingParser p = new TreeTraversingParser(on);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("field1", p.getCurrentName());
        assertEquals("field1", p.getText());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value1", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    // ---------- nested containers -> _startContainer branches ----------

    @Test
    public void testNestedEmptyObjectInArray_QuickReturn_EndObjectBranch() throws Exception {
        ArrayNode an = f.arrayNode();
        an.add(f.objectNode()); // empty object nested
        TreeTraversingParser p = new TreeTraversingParser(an);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken()); // sets _startContainer = true
        assertEquals(JsonToken.END_OBJECT, p.nextToken());   // quick-return: currToken==START_OBJECT
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNestedEmptyArrayInArray_QuickReturn_EndArrayBranch() throws Exception {
        ArrayNode an = f.arrayNode();
        an.add(f.arrayNode()); // empty array nested
        TreeTraversingParser p = new TreeTraversingParser(an);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken()); // sets _startContainer = true
        assertEquals(JsonToken.END_ARRAY, p.nextToken());   // quick-return: else branch
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNestedNonEmptyObjectInArray_IterateChildrenBranch() throws Exception {
        ArrayNode an = f.arrayNode();
        ObjectNode inner = f.objectNode();
        inner.put("k", "v");
        an.add(inner);
        TreeTraversingParser p = new TreeTraversingParser(an);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("k", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("v", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    // ---------- state: cursor null แต่ยังไม่ closed (บรรทัดสุดท้ายก่อน close จริง) ----------

    @Test
    public void testStateAfterLastEndToken_NotYetClosedButCursorNull() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.arrayNode());
        p.nextToken(); // START_ARRAY
        p.nextToken(); // END_ARRAY -> _nodeCursor = null, _closed ยังเป็น false ตรงจุดนี้
        assertFalse(p.isClosed());
        assertNull(p.getCurrentName()); // ตรวจผ่าน _nodeCursor==null check
        assertNull(p.getEmbeddedObject()); // currentNode() คืน null เพราะ cursor null
        assertNull(p.nextToken()); // ตอนนี้ค่อย set _closed = true
        assertTrue(p.isClosed());
    }

    // ---------- skipChildren() ----------

    @Test
    public void testSkipChildren_FromStartObject_SkipsNestedFields() throws Exception {
        ArrayNode an = f.arrayNode();
        ObjectNode inner = f.objectNode();
        inner.put("a", 1);
        inner.put("b", 2);
        an.add(inner);
        an.add(99);
        TreeTraversingParser p = new TreeTraversingParser(an);
        p.nextToken(); // START_ARRAY
        assertEquals(JsonToken.START_OBJECT, p.nextToken()); // _startContainer=true
        JsonParser ignore = p.skipChildren();
        assertSame(p, ignore);
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        // ควร skip เนื้อหาใน object แล้วไปยัง sibling ถัดไปในระดับ array
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(99, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testSkipChildren_FromStartArray_SkipsNestedElements() throws Exception {
        ArrayNode outer = f.arrayNode();
        ArrayNode inner = f.arrayNode();
        inner.add(1);
        inner.add(2);
        outer.add(inner);
        outer.add("after");
        TreeTraversingParser p = new TreeTraversingParser(outer);
        p.nextToken(); // START_ARRAY
        assertEquals(JsonToken.START_ARRAY, p.nextToken()); // inner, _startContainer=true
        p.skipChildren();
        assertEquals(JsonToken.END_ARRAY, p.getCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("after", p.getText());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testSkipChildren_OnScalarToken_NoEffect() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("hello"));
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        JsonParser ret = p.skipChildren();
        assertSame(p, ret);
        assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken()); // ไม่เปลี่ยน
    }

    // ---------- close() / isClosed() ----------

    @Test
    public void testIsClosed_InitiallyFalse() {
        TreeTraversingParser p = new TreeTraversingParser(f.objectNode());
        assertFalse(p.isClosed());
    }

    @Test
    public void testClose_SetsClosedAndClearsState() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.objectNode());
        p.nextToken();
        p.close();
        assertTrue(p.isClosed());
        assertNull(p.getCurrentName());
        assertNull(p.getParsingContext());
        // เรียกซ้ำต้องไม่ throw (idempotent, if(!_closed) guard)
        p.close();
        assertTrue(p.isClosed());
    }

    // ---------- getText() ----------

    @Test
    public void testGetText_FieldName() throws Exception {
        ObjectNode on = f.objectNode();
        on.put("myField", "x");
        TreeTraversingParser p = new TreeTraversingParser(on);
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        assertEquals("myField", p.getText());
    }

    @Test
    public void testGetText_ValueString() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("abc"));
        p.nextToken();
        assertEquals("abc", p.getText());
    }

    @Test
    public void testGetText_ValueNumberInt() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(42));
        p.nextToken();
        assertEquals(String.valueOf(42), p.getText());
    }

    @Test
    public void testGetText_ValueNumberFloat() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(3.14));
        p.nextToken();
        assertEquals(String.valueOf(3.14), p.getText());
    }

    @Test
    public void testGetText_ValueEmbeddedObject_Binary() throws Exception {
        BinaryNode bn = f.binaryNode(new byte[]{1, 2, 3});
        TreeTraversingParser p = new TreeTraversingParser(bn);
        JsonToken t = p.nextToken();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, t);
        // isBinary() -> true -> ใช้ n.asText() (base64)
        assertEquals(bn.asText(), p.getText());
    }

    @Test
    public void testGetText_ValueEmbeddedObject_NonBinary_FallsThroughToDefault() throws Exception {
        POJONode pn = f.pojoNode("some-pojo");
        TreeTraversingParser p = new TreeTraversingParser(pn);
        JsonToken t = p.nextToken();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, t);
        // ไม่ isBinary -> fallthrough ไป default: currToken.asString()
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT.asString(), p.getText());
    }

    @Test
    public void testGetText_DefaultCase_StartObjectToken() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.objectNode());
        p.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT.asString(), p.getText());
    }

    @Test
    public void testGetText_WhenClosed_ReturnsNull() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("x"));
        p.nextToken();
        p.close();
        assertNull(p.getText());
    }

    // หมายเหตุ: พฤติกรรมนี้มาจากการวิเคราะห์ source ตรง ๆ
    // (switch บนตัวแปร enum ที่เป็น null จะ throw NullPointerException ตาม semantic ของ Java)
    @Test(expected = NullPointerException.class)
    public void testGetText_BeforeAnyNextTokenCall_ThrowsNPE() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("x"));
        // ยังไม่เรียก nextToken() -> _currToken == null, _closed == false
        p.getText();
    }

    @Test
    public void testGetTextCharacters_Length_Offset_HasTextCharacters() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("abcdef"));
        p.nextToken();
        assertArrayEquals("abcdef".toCharArray(), p.getTextCharacters());
        assertEquals(6, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertFalse(p.hasTextCharacters());
    }

    // ---------- getNumberType() / numeric accessors ----------

    @Test
    public void testGetNumberType_Int() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(7));
        p.nextToken();
        assertEquals(NumberType.INT, p.getNumberType());
    }

    @Test
    public void testGetNumberType_Float() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(1.5));
        p.nextToken();
        assertEquals(NumberType.DOUBLE, p.getNumberType());
    }

    // หมายเหตุ: สาขา (n == null) ใน getNumberType() ดูจาก source แล้วไม่ reachable จริง
    // เพราะ currentNumericNode() จะ throw ก่อนที่จะ return null เสมอเมื่อ n == null
    // จึงไม่สามารถเขียนเทสต์เพื่อ cover สาขานี้ได้โดยไม่ขัดกับ behavior จริงของโค้ด

    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode_ThrowsWhenNonNumeric() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("not-a-number"));
        p.nextToken();
        p.getNumberType();
    }

    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode_ThrowsWhenCursorNullOrClosed() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(1));
        p.nextToken();
        p.close(); // currentNode() จะ return null เพราะ _closed == true
        p.getNumberType();
    }

    @Test
    public void testNumericAccessors_AllReturnConsistentValues() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(42));
        p.nextToken();
        assertEquals(42, p.getIntValue());
        assertEquals(42L, p.getLongValue());
        assertEquals(42.0d, p.getDoubleValue(), 0.0001);
        assertEquals(42f, p.getFloatValue(), 0.0001f);
        assertEquals(0, p.getBigIntegerValue().compareTo(BigInteger.valueOf(42)));
        assertEquals(0, p.getDecimalValue().compareTo(BigDecimal.valueOf(42)));
        assertEquals(Integer.valueOf(42), p.getNumberValue());
    }

    // ---------- getEmbeddedObject() ----------

    @Test
    public void testGetEmbeddedObject_Pojo() throws Exception {
        Object pojo = new Object();
        TreeTraversingParser p = new TreeTraversingParser(f.pojoNode(pojo));
        p.nextToken();
        assertSame(pojo, p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObject_Binary() throws Exception {
        byte[] data = new byte[]{9, 8, 7};
        TreeTraversingParser p = new TreeTraversingParser(f.binaryNode(data));
        p.nextToken();
        assertArrayEquals(data, (byte[]) p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObject_OtherNodeType_ReturnsNull() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("plain"));
        p.nextToken();
        assertNull(p.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObject_WhenClosed_ReturnsNull() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.pojoNode(new Object()));
        p.nextToken();
        p.close();
        assertNull(p.getEmbeddedObject());
    }

    // ---------- isNaN() ----------

    @Test
    public void testIsNaN_True() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(Double.NaN));
        p.nextToken();
        assertTrue(p.isNaN());
    }

    @Test
    public void testIsNaN_FalseForNonNaNDouble() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(1.23));
        p.nextToken();
        assertFalse(p.isNaN());
    }

    @Test
    public void testIsNaN_FalseForNonNumericNode() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("x"));
        p.nextToken();
        assertFalse(p.isNaN());
    }

    @Test
    public void testIsNaN_WhenClosed_ReturnsFalse() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.numberNode(Double.NaN));
        p.nextToken();
        p.close();
        assertFalse(p.isNaN());
    }

    // ---------- getBinaryValue() / readBinaryValue() ----------

    @Test
    public void testGetBinaryValue_WithBinaryNode() throws Exception {
        byte[] data = new byte[]{1, 2, 3, 4};
        TreeTraversingParser p = new TreeTraversingParser(f.binaryNode(data));
        p.nextToken();
        byte[] result = p.getBinaryValue(null);
        assertArrayEquals(data, result);
    }

    @Test
    public void testGetBinaryValue_NodeNull_WhenClosed_ReturnsNull() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.binaryNode(new byte[]{1}));
        p.nextToken();
        p.close();
        assertNull(p.getBinaryValue(null));
    }

    @Test
    public void testReadBinaryValue_WithData_WritesAndReturnsLength() throws Exception {
        byte[] data = new byte[]{5, 6, 7};
        TreeTraversingParser p = new TreeTraversingParser(f.binaryNode(data));
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(null, out);
        assertEquals(3, len);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testReadBinaryValue_NoData_ReturnsZero() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.binaryNode(new byte[]{1}));
        p.nextToken();
        p.close(); // ทำให้ currentNode() == null -> getBinaryValue == null
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(null, out);
        assertEquals(0, len);
        assertEquals(0, out.size());
    }

    // ---------- getCurrentName() / overrideCurrentName() ----------

    @Test
    public void testGetCurrentName_NullWhenCursorNull() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.objectNode());
        p.nextToken();
        p.close(); // _nodeCursor = null
        assertNull(p.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName_NoExceptionWhenCursorNull() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.objectNode());
        p.nextToken();
        p.close();
        p.overrideCurrentName("ignored"); // ต้องไม่ throw (no-op branch)
    }

    @Test
    public void testOverrideCurrentName_UpdatesName() throws Exception {
        ObjectNode on = f.objectNode();
        on.put("orig", "v");
        TreeTraversingParser p = new TreeTraversingParser(on);
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        assertEquals("orig", p.getCurrentName());
        p.overrideCurrentName("overridden");
        assertEquals("overridden", p.getCurrentName());
    }

    // ---------- misc public API ----------

    @Test
    public void testGetParsingContext_NotNullThenNullAfterClose() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.arrayNode());
        assertNotNull(p.getParsingContext());
        p.close();
        assertNull(p.getParsingContext());
    }

    @Test
    public void testGetTokenLocation_And_CurrentLocation_ReturnNA() throws Exception {
        TreeTraversingParser p = new TreeTraversingParser(f.arrayNode());
        assertEquals(com.fasterxml.jackson.core.JsonLocation.NA, p.getTokenLocation());
        assertEquals(com.fasterxml.jackson.core.JsonLocation.NA, p.getCurrentLocation());
    }

    @Test
    public void testSetCodec_GetCodec() {
        TreeTraversingParser p = new TreeTraversingParser(f.arrayNode());
        ObjectCodec codec = mock(ObjectCodec.class);
        p.setCodec(codec);
        assertSame(codec, p.getCodec());
    }

    @Test
    public void testConstructor_WithCodecArgument() {
        ObjectCodec codec = mock(ObjectCodec.class);
        TreeTraversingParser p = new TreeTraversingParser(f.textNode("x"), codec);
        assertSame(codec, p.getCodec());
    }

    @Test
    public void testVersion_NotNull() {
        TreeTraversingParser p = new TreeTraversingParser(f.arrayNode());
        assertNotNull(p.version());
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_ArrayNode/ObjectNode/ValueNode | if/else if/else ใน constructor (3 กรณี node type) |
| testTopLevelEmptyArray/Object_Traversal | nextToken: `_nextToken!=null`, cursor.nextToken()==null→endToken+getParent, `_nodeCursor==null`→closed |
| testTopLevelNonEmptyArrayOfScalars/ObjectWithScalarField | nextToken: cursor.nextToken()!=null (ไม่ใช่ container token) |
| testNestedEmptyObjectInArray/EmptyArrayInArray | `_startContainer` true + `!currentHasChildren()` ทั้ง 2 ฝั่ง ternary (START_OBJECT/START_ARRAY) |
| testNestedNonEmptyObjectInArray | `_startContainer` true + มี children → iterateChildren(), set `_startContainer=true` ซ้อน |
| testStateAfterLastEndToken_NotYetClosedButCursorNull | สถานะ `_closed=false` แต่ `_nodeCursor=null` (edge case) |
| testSkipChildren_FromStartObject/StartArray/OnScalarToken | if/else if/else ทั้ง 3 สาขาของ skipChildren |
| testIsClosed_InitiallyFalse, testClose_SetsClosedAndClearsState | close(): `if(!_closed)` true/false (idempotent) |
| testGetText_* (FieldName, ValueString, Int, Float, EmbeddedBinary, EmbeddedNonBinary, DefaultStartObject, WhenClosed, BeforeAnyNextToken) | switch-case ทุก case ของ getText() รวม fallthrough และ closed-check, NPE จาก currToken null |
| testGetTextCharacters_Length_Offset_HasTextCharacters | getTextCharacters/Length/Offset/hasTextCharacters |
| testGetNumberType_Int/Float | getNumberType() กรณีปกติ 2 ประเภท |
| testCurrentNumericNode_ThrowsWhenNonNumeric/WhenCursorNullOrClosed | currentNumericNode(): `n==null`, `!n.isNumber()` → throw |
| testNumericAccessors_AllReturnConsistentValues | getBigIntegerValue/getDecimalValue/getDoubleValue/getFloatValue/getLongValue/getIntValue/getNumberValue |
| testGetEmbeddedObject_Pojo/Binary/OtherNodeType/WhenClosed | getEmbeddedObject(): closed check, isPojo, isBinary, else-null |
| testIsNaN_True/FalseForNonNaNDouble/FalseForNonNumericNode/WhenClosed | isNaN(): closed check, instanceof NumericNode, isNaN() true/false |
| testGetBinaryValue_WithBinaryNode/NodeNull | getBinaryValue(): `n!=null`&&`data!=null`, `n==null`→null |
| testReadBinaryValue_WithData/NoData | readBinaryValue(): `data!=null` true/false |
| testGetCurrentName_NullWhenCursorNull, testOverrideCurrentName_* | getCurrentName/overrideCurrentName: cursor null/not-null |
| testGetParsingContext_NotNullThenNullAfterClose | getParsingContext() ก่อน/หลัง close |
| testGetTokenLocation_And_CurrentLocation_ReturnNA | getTokenLocation/getCurrentLocation |
| testSetCodec_GetCodec, testConstructor_WithCodecArgument | setCodec/getCodec, constructor overload พร้อม codec |
| testVersion_NotNull | version() |

**หมายเหตุสำคัญ:** branch `(n == null)` ใน `getNumberType()` ไม่สามารถเขียนทดสอบให้ครอบคลุมได้ เนื่องจากจากการวิเคราะห์ source พบว่า `currentNumericNode()` จะ throw `JsonParseException` ก่อนเสมอเมื่อ `n == null` จึงไม่มีทางที่ `getNumberType()` จะได้รับค่า `n == null` กลับมาโดยไม่ throw — จึงไม่ได้เขียนเทสต์เดาเพื่อบังคับ branch นี้ตามข้อกำหนดที่ 4