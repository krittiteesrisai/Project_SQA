# JUnit 4 Test Suite สำหรับ `POJONode`

## แนวคิดการทดสอบ

วิเคราะห์ branch/condition ที่พบในซอร์สโค้ด และออกแบบเทสให้ครอบคลุมทุกเส้นทางที่เป็นไปได้ พร้อมกรณี boundary, null, และ malformed input

**ข้อสังเกตสำคัญ (คอมเมนต์กำกับตามข้อ 4):**
- `hashCode()` เรียก `_value.hashCode()` โดยไม่ตรวจสอบ null ก่อน → หากสร้าง `POJONode(null)` แล้วเรียก `hashCode()` จะเกิด `NullPointerException` ซึ่งอาจเป็น fault ที่ต้องดักจับ จึงเขียนเทสไว้เพื่อยืนยัน behavior ตามซอร์สจริง (ไม่ได้เดา — อิงจาก code ที่ให้มาโดยตรง)
- `binaryValue()` เมื่อ `_value` ไม่ใช่ `byte[]` จะเรียก `super.binaryValue()` ซึ่งเป็นเมธอดจากคลาสฐาน `ValueNode`/`JsonNode` ที่ไม่ได้แสดงซอร์สมาให้ — จากความรู้ทั่วไปของ Jackson (BaseJsonNode) เมธอกนี้ throw `JsonMappingException` (เป็น subclass ของ `IOException`) จึงเขียนเทสโดยคอมเมนต์กำกับว่าเป็น "assumption based on known Jackson base implementation"

```java
package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;

public class POJONodeTest {

    // ---------- getNodeType() ----------
    @Test
    public void testGetNodeType() {
        POJONode node = new POJONode("hello");
        assertEquals(JsonNodeType.POJO, node.getNodeType());
    }

    // ---------- asToken() ----------
    @Test
    public void testAsToken() {
        POJONode node = new POJONode("hello");
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
    }

    // ---------- binaryValue() ----------
    @Test
    public void testBinaryValue_ByteArray() throws IOException {
        byte[] data = {1, 2, 3};
        POJONode node = new POJONode(data);
        assertArrayEquals(data, node.binaryValue());
    }

    @Test
    public void testBinaryValue_NonByteArray_ThrowsException() {
        // NOTE: assumption based on known Jackson JsonNode base implementation
        // (super.binaryValue() throws JsonMappingException for non-binary nodes)
        POJONode node = new POJONode("not a byte array");
        try {
            node.binaryValue();
            fail("Expected an exception to be thrown for non-binary POJO value");
        } catch (IOException e) {
            // expected - assumption documented above
            assertTrue(e instanceof JsonMappingException || e instanceof IOException);
        }
    }

    // ---------- asText() ----------
    @Test
    public void testAsText_NullValue() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.asText());
    }

    @Test
    public void testAsText_NonNullValue() {
        POJONode node = new POJONode(123);
        assertEquals("123", node.asText());
    }

    // ---------- asText(String defaultValue) ----------
    @Test
    public void testAsTextDefault_NullValue() {
        POJONode node = new POJONode(null);
        assertEquals("default", node.asText("default"));
    }

    @Test
    public void testAsTextDefault_NonNullValue() {
        POJONode node = new POJONode("actual");
        assertEquals("actual", node.asText("default"));
    }

    // ---------- asBoolean(boolean defaultValue) ----------
    @Test
    public void testAsBoolean_TrueValue() {
        POJONode node = new POJONode(Boolean.TRUE);
        assertTrue(node.asBoolean(false));
    }

    @Test
    public void testAsBoolean_FalseValue() {
        POJONode node = new POJONode(Boolean.FALSE);
        assertFalse(node.asBoolean(true));
    }

    @Test
    public void testAsBoolean_NonBooleanValue_ReturnsDefault() {
        POJONode node = new POJONode("not boolean");
        assertTrue(node.asBoolean(true));
        assertFalse(node.asBoolean(false));
    }

    @Test
    public void testAsBoolean_NullValue_ReturnsDefault() {
        POJONode node = new POJONode(null);
        assertTrue(node.asBoolean(true));
    }

    // ---------- asInt(int defaultValue) ----------
    @Test
    public void testAsInt_NumberValue() {
        POJONode node = new POJONode(Integer.valueOf(42));
        assertEquals(42, node.asInt(-1));
    }

    @Test
    public void testAsInt_NonNumberValue_ReturnsDefault() {
        POJONode node = new POJONode("not a number");
        assertEquals(-1, node.asInt(-1));
    }

    @Test
    public void testAsInt_NullValue_ReturnsDefault() {
        POJONode node = new POJONode(null);
        assertEquals(99, node.asInt(99));
    }

    // ---------- asLong(long defaultValue) ----------
    @Test
    public void testAsLong_NumberValue() {
        POJONode node = new POJONode(Long.valueOf(123456789L));
        assertEquals(123456789L, node.asLong(-1L));
    }

    @Test
    public void testAsLong_NonNumberValue_ReturnsDefault() {
        POJONode node = new POJONode("not a number");
        assertEquals(-1L, node.asLong(-1L));
    }

    // ---------- asDouble(double defaultValue) ----------
    @Test
    public void testAsDouble_NumberValue() {
        POJONode node = new POJONode(Double.valueOf(3.14));
        assertEquals(3.14, node.asDouble(-1.0), 0.0001);
    }

    @Test
    public void testAsDouble_NonNumberValue_ReturnsDefault() {
        POJONode node = new POJONode("not a number");
        assertEquals(-1.0, node.asDouble(-1.0), 0.0001);
    }

    // ---------- serialize() ----------
    @Test
    public void testSerialize_NullValue_CallsDefaultSerializeNull() throws IOException {
        POJONode node = new POJONode(null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider ctxt = mock(SerializerProvider.class);

        node.serialize(gen, ctxt);

        verify(ctxt, times(1)).defaultSerializeNull(gen);
        verify(gen, never()).writeObject(any());
    }

    @Test
    public void testSerialize_JsonSerializableValue_DelegatesSerialize() throws IOException {
        JsonSerializable serializableValue = mock(JsonSerializable.class);
        POJONode node = new POJONode(serializableValue);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider ctxt = mock(SerializerProvider.class);

        node.serialize(gen, ctxt);

        verify(serializableValue, times(1)).serialize(gen, ctxt);
        verify(ctxt, never()).defaultSerializeNull(any());
        verify(gen, never()).writeObject(any());
    }

    @Test
    public void testSerialize_OtherValue_CallsWriteObject() throws IOException {
        String plainValue = "plainPojo";
        POJONode node = new POJONode(plainValue);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider ctxt = mock(SerializerProvider.class);

        node.serialize(gen, ctxt);

        verify(gen, times(1)).writeObject(plainValue);
        verify(ctxt, never()).defaultSerializeNull(any());
    }

    // ---------- getPojo() ----------
    @Test
    public void testGetPojo() {
        Object value = new Object();
        POJONode node = new POJONode(value);
        assertSame(value, node.getPojo());
    }

    @Test
    public void testGetPojo_NullValue() {
        POJONode node = new POJONode(null);
        assertNull(node.getPojo());
    }

    // ---------- equals() ----------
    @Test
    public void testEquals_SameInstance() {
        POJONode node = new POJONode("x");
        assertTrue(node.equals(node));
    }

    @Test
    public void testEquals_Null() {
        POJONode node = new POJONode("x");
        assertFalse(node.equals(null));
    }

    @Test
    public void testEquals_DifferentType() {
        POJONode node = new POJONode("x");
        assertFalse(node.equals(new Object()));
        assertFalse(node.equals("x")); // plain String, not POJONode
    }

    @Test
    public void testEquals_BothValuesNull() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(null);
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEquals_ThisNullOtherNotNull() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode("value");
        assertFalse(node1.equals(node2));
    }

    @Test
    public void testEquals_SameValue() {
        POJONode node1 = new POJONode("sameValue");
        POJONode node2 = new POJONode("sameValue");
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEquals_DifferentValue() {
        POJONode node1 = new POJONode("valueA");
        POJONode node2 = new POJONode("valueB");
        assertFalse(node1.equals(node2));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_NonNullValue() {
        POJONode node = new POJONode("hashMe");
        assertEquals("hashMe".hashCode(), node.hashCode());
    }

    @Test(expected = NullPointerException.class)
    public void testHashCode_NullValue_ThrowsNPE() {
        // NOTE: ตามซอร์สโค้ดจริง hashCode() ไม่มีการตรวจสอบ null ก่อนเรียก
        // _value.hashCode() ดังนั้นหาก _value เป็น null จะเกิด NPE
        // ถือเป็นพฤติกรรมที่ตรงกับซอร์สที่ให้มา (อาจเป็น fault ที่ควรดักจับได้)
        POJONode node = new POJONode(null);
        node.hashCode();
    }

    // ---------- toString() ----------
    @Test
    public void testToString_ByteArray() {
        byte[] data = {1, 2, 3, 4, 5};
        POJONode node = new POJONode(data);
        assertEquals("(binary value of 5 bytes)", node.toString());
    }

    @Test
    public void testToString_EmptyByteArray() {
        byte[] data = {};
        POJONode node = new POJONode(data);
        assertEquals("(binary value of 0 bytes)", node.toString());
    }

    @Test
    public void testToString_RawValue() {
        RawValue rawValue = new RawValue("rawContent");
        POJONode node = new POJONode(rawValue);
        assertEquals("(raw value 'rawContent')", node.toString());
    }

    @Test
    public void testToString_OtherValue() {
        POJONode node = new POJONode("plainString");
        assertEquals("plainString", node.toString());
    }

    @Test
    public void testToString_NullValue() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.toString());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Method ภายใต้ทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| testGetNodeType | getNodeType() | คืนค่า JsonNodeType.POJO (ไม่มี branch) |
| testAsToken | asToken() | คืนค่า JsonToken.VALUE_EMBEDDED_OBJECT |
| testBinaryValue_ByteArray | binaryValue() | `_value instanceof byte[]` = true |
| testBinaryValue_NonByteArray_ThrowsException | binaryValue() | `_value instanceof byte[]` = false → super.binaryValue() |
| testAsText_NullValue | asText() | `_value == null` = true |
| testAsText_NonNullValue | asText() | `_value == null` = false |
| testAsTextDefault_NullValue | asText(String) | `_value == null` = true |
| testAsTextDefault_NonNullValue | asText(String) | `_value == null` = false |
| testAsBoolean_TrueValue | asBoolean(boolean) | both condition true, returns true |
| testAsBoolean_FalseValue | asBoolean(boolean) | both condition true, returns false |
| testAsBoolean_NonBooleanValue_ReturnsDefault | asBoolean(boolean) | `instanceof Boolean` = false |
| testAsBoolean_NullValue_ReturnsDefault | asBoolean(boolean) | `_value != null` = false |
| testAsInt_NumberValue | asInt(int) | `instanceof Number` = true |
| testAsInt_NonNumberValue_ReturnsDefault | asInt(int) | `instanceof Number` = false |
| testAsInt_NullValue_ReturnsDefault | asInt(int) | null value branch |
| testAsLong_NumberValue | asLong(long) | `instanceof Number` = true |
| testAsLong_NonNumberValue_ReturnsDefault | asLong(long) | `instanceof Number` = false |
| testAsDouble_NumberValue | asDouble(double) | `instanceof Number` = true |
| testAsDouble_NonNumberValue_ReturnsDefault | asDouble(double) | `instanceof Number` = false |
| testSerialize_NullValue_CallsDefaultSerializeNull | serialize() | `_value == null` = true |
| testSerialize_JsonSerializableValue_DelegatesSerialize | serialize() | `_value instanceof JsonSerializable` = true |
| testSerialize_OtherValue_CallsWriteObject | serialize() | else branch: gen.writeObject |
| testGetPojo / testGetPojo_NullValue | getPojo() | ไม่มี branch, boundary (null) |
| testEquals_SameInstance | equals() | `o == this` = true |
| testEquals_Null | equals() | `o == null` = true |
| testEquals_DifferentType | equals() | `o instanceof POJONode` = false |
| testEquals_BothValuesNull | equals()/_pojoEquals | `_value == null`→`other._value == null` = true |
| testEquals_ThisNullOtherNotNull | equals()/_pojoEquals | `_value == null`→`other._value == null` = false |
| testEquals_SameValue | equals()/_pojoEquals | `_value.equals(other._value)` = true |
| testEquals_DifferentValue | equals()/_pojoEquals | `_value.equals(other._value)` = false |
| testHashCode_NonNullValue | hashCode() | ค่าปกติ (ไม่มี branch) |
| testHashCode_NullValue_ThrowsNPE | hashCode() | edge case: null value → NPE (fault-detection) |
| testToString_ByteArray / _EmptyByteArray | toString() | `_value instanceof byte[]` = true |
| testToString_RawValue | toString() | `_value instanceof RawValue` = true |
| testToString_OtherValue | toString() | else branch |
| testToString_NullValue | toString() | else branch (null → "null") |

## หมายเหตุสำคัญ
1. `testBinaryValue_NonByteArray_ThrowsException` และ `testHashCode_NullValue_ThrowsNPE` เป็นเทสที่อิงพฤติกรรมของคลาสฐาน/behavior ที่ไม่ได้แสดงในซอร์สที่ให้มาทั้งหมด จึงมีคอมเมนต์กำกับตามข้อกำหนดข้อ 4
2. การทดสอบ `serialize()` ใช้ Mockito เพื่อ mock `JsonGenerator`, `SerializerProvider`, และ `JsonSerializable` แทนการสร้าง instance จริงเพื่อแยก unit การทดสอบให้ชัดเจน
3. ครอบคลุมทุก if/else branch ที่ตรวจพบในซอร์สโค้ด รวมถึง compound condition ใน `asBoolean()`