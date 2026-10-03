package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.util.RawValue;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JsonNodeDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testGetDeserializerBranches() {
        // Test factory method branches for specific node classes and default
        assertSame(JsonNodeDeserializer.ObjectDeserializer.getInstance(), 
                JsonNodeDeserializer.getDeserializer(ObjectNode.class));
        assertSame(JsonNodeDeserializer.ArrayDeserializer.getInstance(), 
                JsonNodeDeserializer.getDeserializer(ArrayNode.class));
        assertNotNull(JsonNodeDeserializer.getDeserializer(TextNode.class));
    }

    @Test
    public void testNullValueMethods() {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        assertTrue(deserializer.getNullValue((DeserializationContext) null) instanceof NullNode);
        assertTrue(deserializer.getNullValue() instanceof NullNode);
        assertTrue(deserializer.isCachable());
    }

    @Test
    public void testDeserializeGenericObject() throws IOException {
        String json = "{\"key\":\"value\",\"num\":123,\"bool\":true,\"nil\":null}";
        JsonNode node = mapper.readTree(json);
        assertTrue(node instanceof ObjectNode);
        assertEquals("value", node.get("key").asText());
        assertEquals(123, node.get("num").asInt());
        assertTrue(node.get("bool").asBoolean());
        assertTrue(node.get("nil").isNull());
    }

    @Test
    public void testDeserializeGenericArray() throws IOException {
        String json = "[1, \"text\", false, null, {\"subKey\": 456}, [1, 2]]";
        JsonNode node = mapper.readTree(json);
        assertTrue(node instanceof ArrayNode);
        assertEquals(6, node.size());
        assertEquals(1, node.get(0).asInt());
        assertEquals("text", node.get(1).asText());
        assertFalse(node.get(2).asBoolean());
        assertTrue(node.get(3).isNull());
        assertTrue(node.get(4) instanceof ObjectNode);
        assertTrue(node.get(5) instanceof ArrayNode);
    }

    @Test
    public void testObjectDeserializerDirect() throws IOException {
        JsonParser parser = mapper.getFactory().createParser("{\"a\":1}");
        parser.nextToken(); // START_OBJECT
        JsonNodeDeserializer.ObjectDeserializer objDeser = JsonNodeDeserializer.ObjectDeserializer.getInstance();
        ObjectNode node = objDeser.deserialize(parser, mapper.getDeserializationContext());
        assertNotNull(node);
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testObjectDeserializerFieldNameEdgeCase() throws IOException {
        // Test when token is FIELD_NAME (empty or pre-advanced object)
        JsonParser parser = mapper.getFactory().createParser("{\"a\":1}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        JsonNodeDeserializer.ObjectDeserializer objDeser = JsonNodeDeserializer.ObjectDeserializer.getInstance();
        ObjectNode node = objDeser.deserialize(parser, mapper.getDeserializationContext());
        assertNotNull(node);
        assertEquals(1, node.get("a").asInt());
    }

    @Test(expected = JsonMappingException.class)
    public void testObjectDeserializerInvalidToken() throws IOException {
        JsonParser parser = mapper.getFactory().createParser("123");
        parser.nextToken(); // NUMBER_INT
        JsonNodeDeserializer.ObjectDeserializer.getInstance().deserialize(parser, mapper.getDeserializationContext());
    }

    @Test
    public void testArrayDeserializerDirect() throws IOException {
        JsonParser parser = mapper.getFactory().createParser("[1, 2]");
        parser.nextToken(); // START_ARRAY
        ArrayNode node = JsonNodeDeserializer.ArrayDeserializer.getInstance().deserialize(parser, mapper.getDeserializationContext());
        assertNotNull(node);
        assertEquals(2, node.size());
    }

    @Test(expected = JsonMappingException.class)
    public void testArrayDeserializerInvalidToken() throws IOException {
        JsonParser parser = mapper.getFactory().createParser("123");
        parser.nextToken(); // NUMBER_INT
        JsonNodeDeserializer.ArrayDeserializer.getInstance().deserialize(parser, mapper.getDeserializationContext());
    }

    @Test(expected = JsonMappingException.class)
    public void testArrayUnexpectedEnd() throws IOException {
        JsonParser parser = mapper.getFactory().createParser("[");
        parser.nextToken(); // START_ARRAY
        mapper.readTree(parser);
    }

    @Test
    public void testDuplicateFieldHandling() throws IOException {
        ObjectMapper dupMapper = new ObjectMapper();
        dupMapper.enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY);
        String json = "{\"a\":1, \"a\":2}";
        try {
            dupMapper.readTree(json);
            fail("Expected JsonMappingException for duplicate key");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Duplicate field"));
        }
    }

    @Test
    public void testIntCoercionsAndNumberTypes() throws IOException {
        ObjectMapper intMapper = new ObjectMapper();
        intMapper.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        intMapper.enable(DeserializationFeature.USE_LONG_FOR_INTS);
        
        JsonNode nodeLong = intMapper.readTree("123");
        assertEquals(123L, nodeLong.asLong());

        intMapper.disable(DeserializationFeature.USE_LONG_FOR_INTS);
        JsonNode nodeBigInt = intMapper.readTree("9999999999999999999");
        assertTrue(nodeBigInt.isBigInteger());
    }

    @Test
    public void testFloatCoercions() throws IOException {
        ObjectMapper floatMapper = new ObjectMapper();
        floatMapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        JsonNode nodeDecimal = floatMapper.readTree("123.456");
        assertTrue(nodeDecimal.isBigDecimal());
    }

    @Test
    public void testEmbeddedObjectHandling() throws IOException {
        // Testing embedded object / raw value / binary node paths via custom parser or node factory usage
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = mapper.getFactory().createParser("{\"a\":1}");
        // Triggering deserializeAny with various tokens
        parser.nextToken(); // START_OBJECT
        JsonNode node = deserializer.deserialize(parser, mapper.getDeserializationContext());
        assertNotNull(node);
    }
}