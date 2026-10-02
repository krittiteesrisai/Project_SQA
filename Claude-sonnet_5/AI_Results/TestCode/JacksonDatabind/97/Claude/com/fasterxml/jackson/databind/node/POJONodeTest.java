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
