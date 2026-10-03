package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class TreeTraversingParserTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
        objectMapper = null;
    }

    @Test
    public void testConstructorArrayNode() throws Exception {
        ArrayNode arrayNode = objectMapper.createArrayNode();
        arrayNode.add("test");
        
        try (TreeTraversingParser parser = new TreeTraversingParser(arrayNode, objectMapper)) {
            assertNotNull(parser.getCodec());
            assertEquals(Version.unknownVersion(), parser.version());
            assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        }
    }

    @Test
    public void testConstructorObjectNode() throws Exception {
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("key", "value");

        try (TreeTraversingParser parser = new TreeTraversingParser(objectNode)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        }
    }

    @Test
    public void testConstructorValueNode() throws Exception {
        JsonNode valueNode = objectMapper.getNodeFactory().textNode("hello");

        try (TreeTraversingParser parser = new TreeTraversingParser(valueNode)) {
            assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
            assertEquals("hello", parser.getText());
        }
    }

    @Test
    public void testEmptyContainerSkipping() throws Exception {
        ObjectNode objectNode = objectMapper.createObjectNode(); // Empty object
        try (TreeTraversingParser parser = new TreeTraversingParser(objectNode)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            // Next token should trigger empty container check -> END_OBJECT
            assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        }

        ArrayNode arrayNode = objectMapper.createArrayNode(); // Empty array
        try (TreeTraversingParser parser = new TreeTraversingParser(arrayNode)) {
            assertEquals(JsonToken.START_ARRAY, parser.nextToken());
            assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        }
    }

    @Test
    public void testNestedContainersTraversal() throws Exception {
        ObjectNode root = objectMapper.createObjectNode();
        ArrayNode arr = root.putArray("arr");
        arr.add(10);

        try (TreeTraversingParser parser = new TreeTraversingParser(root)) {
            assertNotNull(parser.getParsingContext());
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            assertEquals("arr", parser.getCurrentName());
            
            parser.overrideCurrentName("newArr");
            assertEquals("newArr", parser.getCurrentName());

            assertEquals(JsonToken.START_ARRAY, parser.nextToken());
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertEquals(10, parser.getIntValue());
            assertEquals(10L, parser.getLongValue());
            
            assertEquals(JsonToken.END_ARRAY, parser.nextToken());
            assertEquals(JsonToken.END_OBJECT, parser.nextToken());
            assertNull(parser.nextToken());
            assertTrue(parser.isClosed());
        }
    }

    @Test
    public void testSkipChildrenObject() throws Exception {
        ObjectNode root = objectMapper.createObjectNode();
        root.put("a", 1);

        try (TreeTraversingParser parser = new TreeTraversingParser(root)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            parser.skipChildren();
            assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        }
    }

    @Test
    public void testSkipChildrenArray() throws Exception {
        ArrayNode root = objectMapper.createArrayNode();
        root.add(1);

        try (TreeTraversingParser parser = new TreeTraversingParser(root)) {
            assertEquals(JsonToken.START_ARRAY, parser.nextToken());
            parser.skipChildren();
            assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        }
    }

    @Test
    public void testGetTextVariations() throws Exception {
        ObjectNode root = objectMapper.createObjectNode();
        root.put("str", "textVal");
        root.put("int", 123);
        root.put("float", 12.34);

        try (TreeTraversingParser parser = new TreeTraversingParser(root)) {
            parser.nextToken(); // START_OBJECT
            assertNull(parser.getText()); // START_OBJECT text is null/asString

            parser.nextToken(); // FIELD_NAME
            assertEquals("str", parser.getText());

            parser.nextToken(); // VALUE_STRING
            assertEquals("textVal", parser.getText());
            assertNotNull(parser.getTextCharacters());
            assertEquals(7, parser.getTextLength());
            assertEquals(0, parser.getTextOffset());
            assertFalse(parser.hasTextCharacters());

            parser.nextToken(); // FIELD_NAME
            parser.nextToken(); // VALUE_NUMBER_INT
            assertEquals("123", parser.getText());

            parser.nextToken(); // FIELD_NAME
            parser.nextToken(); // VALUE_NUMBER_FLOAT
            assertEquals("12.34", parser.getText());
        }
    }

    @Test
    public void testGetTextClosedParser() throws Exception {
        JsonNode node = objectMapper.getNodeFactory().textNode("test");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        parser.close();
        assertNull(parser.getText());
    }

    @Test
    public void testNumericGettersAndTypes() throws Exception {
        ObjectNode root = objectMapper.createObjectNode();
        root.put("bigInt", new BigInteger("12345678901234567890"));
        root.put("decimal", new BigDecimal("123.456"));
        root.put("double", 12.34d);
        root.put("float", 5.67f);

        try (TreeTraversingParser parser = new TreeTraversingParser(root)) {
            parser.nextToken(); // START_OBJECT

            parser.nextToken(); // FIELD_NAME
            parser.nextToken(); // bigInt
            assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
            assertEquals(new BigInteger("12345678901234567890"), parser.getBigIntegerValue());
            assertEquals(new BigInteger("12345678901234567890"), parser.getNumberValue());

            parser.nextToken(); // FIELD_NAME
            parser.nextToken(); // decimal
            assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
            assertEquals(new BigDecimal("123.456"), parser.getDecimalValue());

            parser.nextToken(); // FIELD_NAME
            parser.nextToken(); // double
            assertEquals(12.34d, parser.getDoubleValue(), 0.001);

            parser.nextToken(); // FIELD_NAME
            parser.nextToken(); // float
            assertEquals(5.67f, parser.getFloatValue(), 0.001f);
        }
    }

    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNodeThrowsExceptionWhenNotNumeric() throws Exception {
        JsonNode node = objectMapper.getNodeFactory().textNode("not-a-number");
        try (TreeTraversingParser parser = new TreeTraversingParser(node)) {
            parser.nextToken();
            parser.getIntValue(); // Should throw JsonParseException
        }
    }

    @Test
    public void testEmbeddedObjectAndBinaryAndNaN() throws Exception {
        ObjectNode root = objectMapper.createObjectNode();
        byte[] binaryData = new byte[]{1, 2, 3, 4};
        root.set("bin", objectMapper.getNodeFactory().binaryNode(binaryData));
        root.set("pojo", new POJONode("custom-pojo"));

        try (TreeTraversingParser parser = new TreeTraversingParser(root)) {
            parser.nextToken(); // START_OBJECT

            parser.nextToken(); // FIELD_NAME
            parser.nextToken(); // BINARY
            assertArrayEquals(binaryData, parser.getBinaryValue());
            assertArrayEquals(binaryData, parser.getBinaryValue(Base64Variants.MIME));
            
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int written = parser.readBinaryValue(Base64Variants.MIME, out);
            assertEquals(4, written);

            assertNotNull(parser.getEmbeddedObject());

            parser.nextToken(); // FIELD_NAME
            parser.nextToken(); // POJO
            assertEquals("custom-pojo", parser.getEmbeddedObject());

            assertFalse(parser.isNaN());
            assertEquals(JsonLocation.NA, parser.getTokenLocation());
            assertEquals(JsonLocation.NA, parser.getCurrentLocation());
        }
    }

    @Test
    public void testTextNodeBinaryCoercion() throws Exception {
        JsonNode node = objectMapper.getNodeFactory().textNode("AQIDBA=="); // Base64 for {1, 2, 3, 4}
        try (TreeTraversingParser parser = new TreeTraversingParser(node)) {
            parser.nextToken(); // VALUE_STRING
            byte[] bytes = parser.getBinaryValue(Base64Variants.MIME);
            assertNotNull(bytes);
            assertArrayEquals(new byte[]{1, 2, 3, 4}, bytes);
        }
    }
}