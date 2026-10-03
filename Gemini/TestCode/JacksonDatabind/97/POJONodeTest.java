package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.core.JsonGenerator;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class POJONodeTest {

    @Test
    public void testNodeBasics() {
        POJONode node = new POJONode("test");
        assertEquals(JsonNodeType.POJO, node.getNodeType());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
        assertEquals("test", node.getPojo());
    }

    @Test
    public void testBinaryValue() throws IOException {
        byte[] bytes = new byte[]{1, 2, 3};
        POJONode nodeWithBytes = new POJONode(bytes);
        assertArrayEquals(bytes, nodeWithBytes.binaryValue());

        POJONode nodeWithoutBytes = new POJONode("not bytes");
        // super.binaryValue() returns null by default in ValueNode
        assertNull(nodeWithoutBytes.binaryValue());
    }

    @Test
    public void testAsText() {
        POJONode nullNode = new POJONode(null);
        assertEquals("null", nullNode.asText());
        assertEquals("default", nullNode.asText("default"));

        POJONode textNode = new POJONode("hello");
        assertEquals("hello", textNode.asText());
        assertEquals("hello", textNode.asText("default"));
    }

    @Test
    public void testAsBoolean() {
        POJONode trueNode = new POJONode(Boolean.TRUE);
        assertTrue(trueNode.asBoolean(false));

        POJONode falseNode = new POJONode(Boolean.FALSE);
        assertFalse(falseNode.asBoolean(true));

        POJONode nonBooleanNode = new POJONode("not a boolean");
        assertTrue(nonBooleanNode.asBoolean(true));
        assertFalse(nonBooleanNode.asBoolean(false));

        POJONode nullNode = new POJONode(null);
        assertTrue(nullNode.asBoolean(true));
    }

    @Test
    public void testAsNumberCoercions() {
        POJONode intNode = new POJONode(123);
        assertEquals(123, intNode.asInt(0));
        assertEquals(123L, intNode.asLong(0L));
        assertEquals(123.0, intNode.asDouble(0.0), 0.001);

        POJONode nonNumberNode = new POJONode("abc");
        assertEquals(99, nonNumberNode.asInt(99));
        assertEquals(99L, nonNumberNode.asLong(99L));
        assertEquals(99.0, nonNumberNode.asDouble(99.0), 0.001);
    }

    @Test
    public void testToString() {
        byte[] bytes = new byte[]{1, 2};
        POJONode byteNode = new POJONode(bytes);
        assertEquals("(binary value of 2 bytes)", byteNode.toString());

        POJONode rawNode = new POJONode(new RawValue("raw-json"));
        assertEquals("(raw value 'raw-json')", rawNode.toString());

        POJONode normalNode = new POJONode("plain-string");
        assertEquals("plain-string", normalNode.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        POJONode node1 = new POJONode("value");
        POJONode node2 = new POJONode("value");
        POJONode node3 = new POJONode("other");
        POJONode nullNode1 = new POJONode(null);
        POJONode nullNode2 = new POJONode(null);

        // Reflexive, symmetry, null checks, instance checks
        assertTrue(node1.equals(node1));
        assertTrue(node1.equals(node2));
        assertFalse(node1.equals(node3));
        assertFalse(node1.equals(null));
        assertFalse(node1.equals("some string"));

        // Null value comparisons inside _pojoEquals
        assertTrue(nullNode1.equals(nullNode2));
        assertFalse(nullNode1.equals(node1));
        assertFalse(node1.equals(nullNode1));

        // HashCode
        assertEquals(node1.hashCode(), node2.hashCode());
    }

    @Test
    public void testSerializeNullAndStandard() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        // Test null value serialization branch
        POJONode nullNode = new POJONode(null);
        String nullJson = mapper.writeValueAsString(nullNode);
        assertEquals("null", nullJson);

        // Test standard object serialization branch (writeObject)
        POJONode objNode = new POJONode("hello-json");
        String objJson = mapper.writeValueAsString(objNode);
        assertEquals("\"hello-json\"", objJson);
    }

    @Test
    public void testSerializeJsonSerializable() throws IOException {
        // Test JsonSerializable branch
        JsonSerializable serializable = new JsonSerializable() {
            @Override
            public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException {
                jgen.writeString("serialized-custom");
            }

            @Override
            public void serializeWithType(JsonGenerator jgen, SerializerProvider provider,
                    com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSer) throws IOException {
                serialize(jgen, provider);
            }
        };

        ObjectMapper mapper = new ObjectMapper();
        POJONode node = new POJONode(serializable);
        String json = mapper.writeValueAsString(node);
        assertEquals("\"serialized-custom\"", json);
    }
}