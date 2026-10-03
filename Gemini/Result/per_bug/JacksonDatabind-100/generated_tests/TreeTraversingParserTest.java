package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
    public void testConstructorAndBasicNavigation() throws IOException {
        // Test Array Node constructor and basic token iteration
        ArrayNode arrayNode = objectMapper.createArrayNode();
        arrayNode.add("test-value");

        TreeTraversingParser parser = new TreeTraversingParser(arrayNode, objectMapper.getCodec());
        assertFalse(parser.isClosed());
        assertNotNull(parser.version());
        assertEquals(objectMapper.getCodec(), parser.getCodec());

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("test-value", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        assertTrue(parser.isClosed());

        parser.close(); // idempotent close check
    }

    @Test
    public void testObjectNodeNavigationAndEmptyContainer() throws IOException {
        // Test Object Node constructor, empty container optimization, and field names
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("emptyObj", objectMapper.createObjectNode());
        objectNode.put("emptyArr", objectMapper.createArrayNode());

        TreeTraversingParser parser = new TreeTraversingParser(objectNode);
        
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("emptyObj", parser.getCurrentName());
        
        // Descend into empty object
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("emptyArr", parser.getCurrentName());

        // Descend into empty array
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSkipChildren() throws IOException {
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.putObject("childObj").put("a", 1);
        objectNode.putArray("childArr").add(2);

        TreeTraversingParser parser = new TreeTraversingParser(objectNode);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        // Skip children of childObj
        parser.skipChildren();
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());

        parser.close();
    }

    @Test
    public void testTextTokenVariations() throws IOException {
        ObjectNode node = objectMapper.createObjectNode();
        node.put("str", "hello");
        node.put("int", 123);
        node.put("float", 12.34);

        TreeTraversingParser parser = new TreeTraversingParser(node);
        
        parser.nextToken(); // START_OBJECT
        
        parser.nextToken(); // FIELD_NAME
        assertEquals("str", parser.getText());
        assertEquals("str", parser.getCurrentName());

        parser.nextToken(); // VALUE_STRING
        assertEquals("hello", parser.getText());
        assertEquals(5, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertNotNull(parser.getTextCharacters());
        assertFalse(parser.hasTextCharacters());

        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals("123", parser.getText());

        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals("12.34", parser.getText());

        parser.close();
        assertNull(parser.getText()); // closed state returns null
    }

    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNodeException() throws IOException {
        TextNode textNode = new TextNode("not-a-number");
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        parser.getIntValue(); // Should trigger exception because it's not numeric
    }

    @Test
    public void testNumericAccessors() throws IOException {
        ObjectNode node = objectMapper.createObjectNode();
        node.put("bigInt", BigInteger.valueOf(123456789L));
        node.put("decimal", new BigDecimal("123.456"));
        node.put("double", 1.23);
        node.put("float", 4.56f);
        node.put("long", 987654321L);
        node.put("int", 42);

        TreeTraversingParser parser = new TreeTraversingParser(node);
        parser.nextToken(); // START_OBJECT

        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // bigInt
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
        assertEquals(BigInteger.valueOf(123456789L), parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // decimal
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
        assertEquals(new BigDecimal("123.456"), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // double
        assertEquals(1.23, parser.getDoubleValue(), 0.001);

        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // float
        assertEquals(4.56f, parser.getFloatValue(), 0.001f);

        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // long
        assertEquals(987654321L, parser.getLongValue());

        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // int
        assertEquals(42, parser.getIntValue());
        assertNotNull(parser.getNumberValue());

        parser.close();
    }

    @Test
    def testEmbeddedObjectAndBinary() throws IOException {
        byte[] binaryData = new byte[]{1, 2, 3, 4};
        BinaryNode binaryNode = new BinaryNode(binaryData);
        POJONode pojoNode = new POJONode(binaryData);

        TreeTraversingParser parser1 = new TreeTraversingParser(binaryNode);
        parser1.nextToken();
        assertArrayEquals(binaryData, parser1.getBinaryValue());
        assertNotNull(parser1.getEmbeddedObject());
        assertFalse(parser1.isNaN());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(4, parser1.readBinaryValue(Base64Variants.MIME, out));
        assertArrayEquals(binaryData, out.toByteArray());
        parser1.close();

        TreeTraversingParser parser2 = new TreeTraversingParser(pojoNode);
        parser2.nextToken();
        assertArrayEquals(binaryData, parser2.getBinaryValue());
        assertEquals(binaryData, parser2.getEmbeddedObject());
        parser2.close();
    }

    @Test
    public void testLocationAndContext() throws IOException {
        JsonNode node = objectMapper.createObjectNode();
        TreeTraversingParser parser = new TreeTraversingParser(node);
        
        assertNotNull(parser.getTokenLocation());
        assertNotNull(parser.getCurrentLocation());
        assertNotNull(parser.getParsingContext());
        
        parser.overrideCurrentName("newName");
        parser.close();
    }
}