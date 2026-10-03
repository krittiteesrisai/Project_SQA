package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.Assert.*;

public class ObjectNodeTest {

    private JsonNodeFactory nodeFactory;
    private ObjectNode objectNode;

    @Before
    public void setUp() {
        nodeFactory = JsonNodeFactory.instance;
        objectNode = new ObjectNode(nodeFactory);
    }

    @Test
    public void testConstructorsAndBasicApi() {
        assertNotNull(objectNode.getNodeType());
        assertEquals(JsonNodeType.OBJECT, objectNode.getNodeType());
        assertEquals(com.fasterxml.jackson.core.JsonToken.START_OBJECT, objectNode.asToken());
        assertEquals(0, objectNode.size());

        // Test Map constructor
        Map<String, JsonNode> map = new LinkedHashMap<String, JsonNode>();
        map.put("key", nodeFactory.textNode("val"));
        ObjectNode customNode = new ObjectNode(nodeFactory, map);
        assertEquals(1, customNode.size());
        assertEquals("val", customNode.get("key").asText());
    }

    @Test
    public void testGetAndPathMethods() {
        objectNode.put("strField", "hello");
        
        // get(int) & path(int)
        assertNull(objectNode.get(0));
        assertTrue(objectNode.path(0) instanceof MissingNode);

        // get(String) & path(String)
        assertNotNull(objectNode.get("strField"));
        assertEquals("hello", objectNode.get("strField").asText());
        assertNull(objectNode.get("nonExistent"));

        assertEquals("hello", objectNode.path("strField").asText());
        assertTrue(objectNode.path("nonExistent") instanceof MissingNode);
    }

    @Test
    public void testIteratorsAndFields() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);

        Iterator<JsonNode> elements = objectNode.elements();
        assertTrue(elements.hasNext());

        Iterator<String> fieldNames = objectNode.fieldNames();
        assertTrue(fieldNames.hasNext());
        assertEquals("a", fieldNames.next());

        Iterator<Map.Entry<String, JsonNode>> fields = objectNode.fields();
        assertTrue(fields.hasNext());
        Map.Entry<String, JsonNode> entry = fields.next();
        assertEquals("a", entry.getKey());
    }

    @Test
    public void testWithObjectNode() {
        // Branch 1: Property does not exist -> creates new ObjectNode
        ObjectNode childObj = objectNode.with("childObj");
        assertNotNull(childObj);

        // Branch 2: Property exists and is ObjectNode -> returns it
        ObjectNode sameObj = objectNode.with("childObj");
        assertSame(childObj, sameObj);

        // Branch 3: Property exists but is NOT ObjectNode -> throws UnsupportedOperationException
        objectNode.put("notAnObj", "stringVal");
        try {
            objectNode.with("notAnObj");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("is not of type ObjectNode"));
        }
    }

    @Test
    public void testWithArrayNode() {
        // Branch 1: Property does not exist -> creates new ArrayNode
        ArrayNode childArr = objectNode.withArray("childArr");
        assertNotNull(childArr);

        // Branch 2: Property exists and is ArrayNode -> returns it
        ArrayNode sameArr = objectNode.withArray("childArr");
        assertSame(childArr, sameArr);

        // Branch 3: Property exists but is NOT ArrayNode -> throws UnsupportedOperationException
        objectNode.put("notAnArr", 123);
        try {
            objectNode.withArray("notAnArr");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("is not of type ArrayNode"));
        }
    }

    @Test
    public void testFindOperations() {
        objectNode.put("target", "value1");
        ObjectNode nested = objectNode.putObject("nested");
        nested.put("target", "value2");
        
        // findValue
        JsonNode foundValue = objectNode.findValue("target");
        assertNotNull(foundValue);
        assertEquals("value1", foundValue.asText()); // First match

        // findValues with null foundSoFar
        List<JsonNode> values = objectNode.findValues("target", null);
        assertEquals(2, values.size());

        // findValuesAsText with null foundSoFar
        List<String> texts = objectNode.findValuesAsText("target", null);
        assertEquals(2, texts.size());
        assertEquals("value1", texts.get(0));
        assertEquals("value2", texts.get(1));

        // findParent
        ObjectNode parent = objectNode.findParent("target");
        assertSame(objectNode, parent);

        ObjectNode nestedParent = nested.findParent("target");
        assertSame(nested, nestedParent);

        assertNull(objectNode.findParent("nonExistent"));

        // findParents with null foundSoFar
        List<JsonNode> parents = objectNode.findParents("target", null);
        assertEquals(2, parents.size());
    }

    @Test
    public void testMutatorsAndPutVariantsWithNullsAndPrimitives() {
        // Test set with null value
        objectNode.set("nullField", (JsonNode) null);
        assertTrue(objectNode.get("nullField") instanceof NullNode);

        // Test setAll(Map) & setAll(ObjectNode)
        Map<String, JsonNode> map = new HashMap<String, JsonNode>();
        map.put("mapField", null); // triggers null -> NullNode branch
        objectNode.setAll(map);
        assertTrue(objectNode.get("mapField") instanceof NullNode);

        ObjectNode other = new ObjectNode(nodeFactory);
        other.put("otherField", true);
        objectNode.setAll(other);
        assertTrue(objectNode.get("otherField").asBoolean());

        // Test replace
        objectNode.replace("replaceField", null); // null value branch
        assertTrue(objectNode.get("replaceField") instanceof NullNode);

        // Test put variants with Boxed types (null and non-null)
        objectNode.put("shortP", (short) 1);
        objectNode.put("shortB", (Short) null);
        objectNode.put("shortB2", Short.valueOf((short) 2));

        objectNode.put("intP", 10);
        objectNode.put("intB", (Integer) null);
        objectNode.put("intB2", Integer.valueOf(20));

        objectNode.put("longP", 100L);
        objectNode.put("longB", (Long) null);
        objectNode.put("longB2", Long.valueOf(200L));

        objectNode.put("floatP", 1.0f);
        objectNode.put("floatB", (Float) null);
        objectNode.put("floatB2", Float.valueOf(2.0f));

        objectNode.put("doubleP", 1.0d);
        objectNode.put("doubleB", (Double) null);
        objectNode.put("doubleB2", Double.valueOf(2.0d));

        objectNode.put("bigDec", (BigDecimal) null);
        objectNode.put("bigDec2", new BigDecimal("123.45"));

        objectNode.put("str", (String) null);
        objectNode.put("str2", "text");

        objectNode.put("boolP", true);
        objectNode.put("boolB", (Boolean) null);
        objectNode.put("boolB2", Boolean.FALSE);

        objectNode.put("bytes", (byte[]) null);
        objectNode.put("bytes2", new byte[]{1, 2, 3});

        objectNode.putNull("explicitNull");
        objectNode.putArray("arrField");
        objectNode.putObject("objField");
        objectNode.putPOJO("pojoField", "somePojo");

        assertNotNull(objectNode.get("shortP"));
        assertTrue(objectNode.get("shortB") instanceof NullNode);
        assertTrue(objectNode.get("intB") instanceof NullNode);
        assertTrue(objectNode.get("longB") instanceof NullNode);
        assertTrue(objectNode.get("floatB") instanceof NullNode);
        assertTrue(objectNode.get("doubleB") instanceof NullNode);
        assertTrue(objectNode.get("bigDec") instanceof NullNode);
        assertTrue(objectNode.get("str") instanceof NullNode);
        assertTrue(objectNode.get("boolB") instanceof NullNode);
        assertTrue(objectNode.get("bytes") instanceof NullNode);
    }

    @Test
    public void testRemovalAndRetainMethods() {
        objectNode.put("f1", 1);
        objectNode.put("f2", 2);
        objectNode.put("f3", 3);

        // without String
        objectNode.without("f1");
        assertNull(objectNode.get("f1"));

        // without Collection
        objectNode.without(Arrays.asList("f2"));
        assertNull(objectNode.get("f2"));

        objectNode.put("f1", 1);
        objectNode.put("f2", 2);

        // remove String
        objectNode.remove("f1");
        assertNull(objectNode.get("f1"));

        // remove Collection
        objectNode.remove(Arrays.asList("f2"));
        assertNull(objectNode.get("f2"));

        objectNode.put("f1", 1);
        objectNode.put("f2", 2);
        objectNode.put("f3", 3);

        // retain Collection & varargs
        objectNode.retain("f1", "f2");
        assertNotNull(objectNode.get("f1"));
        assertNotNull(objectNode.get("f2"));
        assertNull(objectNode.get("f3"));

        objectNode.retain(Arrays.asList("f1"));
        assertNotNull(objectNode.get("f1"));
        assertNull(objectNode.get("f2"));

        // removeAll
        objectNode.removeAll();
        assertEquals(0, objectNode.size());
    }

    @Test
    public void testEqualsAndHashCodeAndToString() {
        ObjectNode node1 = new ObjectNode(nodeFactory);
        node1.put("key", "val");

        ObjectNode node2 = new ObjectNode(nodeFactory);
        node2.put("key", "val");

        ObjectNode node3 = new ObjectNode(nodeFactory);
        node3.put("key", "different");

        // Equals branches
        assertTrue(node1.equals(node1)); // o == this
        assertFalse(node1.equals(null)); // o == null
        assertFalse(node1.equals("someString")); // not ObjectNode
        assertTrue(node1.equals(node2)); // children equal
        assertFalse(node1.equals(node3)); // children not equal

        // HashCode
        assertEquals(node1.hashCode(), node2.hashCode());

        // ToString
        String jsonStr = node1.toString();
        assertTrue(jsonStr.contains("\"key\""));
        assertTrue(jsonStr.contains("\"val\""));
    }

    @Test
    public void testDeepCopy() {
        objectNode.put("key", "val");
        ObjectNode copy = objectNode.deepCopy();
        assertNotSame(objectNode, copy);
        assertEquals(objectNode, copy);
    }
}