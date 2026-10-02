# ObjectNodeTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- วางคลาสทดสอบไว้ใน **package เดียวกัน** กับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.node`) เพื่อให้เข้าถึงเมธอด `protected` เช่น `_at()`, `_childrenEqual()` ได้โดยตรง ซึ่งเป็นวิธีที่ยอมรับได้สำหรับ Defects4J-style testing
- ไม่ได้เดา behavior ของเมธอดที่ base class เป็นผู้กำหนด (เช่น `JsonNode.at(String)`, `TextNode.appendQuoted`) จึงเลือกทดสอบผ่าน API ที่เห็น signature ตรงจากซอร์สที่ให้มาเท่านั้น
- ใช้ `JsonNodeFactory.instance` (จริงจาก jackson-databind ซึ่งเป็นคลาสที่ compile มาพร้อมกับ ObjectNode เอง ไม่ใช่ jar ภายนอกในลิสต์)

```java
package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ObjectNodeTest {

    private JsonNodeFactory factory;
    private ObjectNode node;

    @Before
    public void setUp() {
        factory = JsonNodeFactory.instance;
        node = new ObjectNode(factory);
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructorEmptyChildren() {
        assertEquals(0, node.size());
    }

    @Test
    public void testConstructorWithSuppliedMap() {
        Map<String, JsonNode> kids = new LinkedHashMap<String, JsonNode>();
        kids.put("a", factory.textNode("v"));
        ObjectNode n2 = new ObjectNode(factory, kids);
        assertEquals(1, n2.size());
        assertEquals("v", n2.get("a").asText());
    }

    // ---------- _at(JsonPointer) ----------

    @Test
    public void test_at_existingProperty() {
        node.put("name", "value");
        JsonPointer ptr = JsonPointer.compile("/name");
        assertSame(node.get("name"), node._at(ptr));
    }

    @Test
    public void test_at_missingProperty() {
        JsonPointer ptr = JsonPointer.compile("/missing");
        assertNull(node._at(ptr));
    }

    // ---------- deepCopy ----------

    @Test
    public void testDeepCopy() {
        node.put("a", "1");
        ObjectNode nested = node.putObject("nested");
        nested.put("b", 2);

        ObjectNode copy = node.deepCopy();
        assertEquals(node, copy);
        assertNotSame(node, copy);
        // nested node must be deep-copied (different reference)
        assertNotSame(node.get("nested"), copy.get("nested"));
        assertEquals(node.get("nested"), copy.get("nested"));
    }

    // ---------- basic node API ----------

    @Test
    public void testGetNodeType() {
        assertEquals(JsonNodeType.OBJECT, node.getNodeType());
    }

    @Test
    public void testAsToken() {
        assertEquals(com.fasterxml.jackson.core.JsonToken.START_OBJECT, node.asToken());
    }

    @Test
    public void testSize() {
        assertEquals(0, node.size());
        node.put("x", 1);
        assertEquals(1, node.size());
    }

    @Test
    public void testElementsIterator() {
        node.put("a", 1);
        node.put("b", 2);
        Iterator<JsonNode> it = node.elements();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetByIndexAlwaysNull() {
        node.put("a", 1);
        assertNull(node.get(0));
        assertNull(node.get(-1));
    }

    @Test
    public void testGetByFieldName_existingAndMissing() {
        node.put("k", "v");
        assertNotNull(node.get("k"));
        assertNull(node.get("missing"));
    }

    @Test
    public void testFieldNamesIterator() {
        node.put("a", 1);
        node.put("b", 2);
        Iterator<String> it = node.fieldNames();
        List<String> names = new ArrayList<String>();
        while (it.hasNext()) names.add(it.next());
        assertEquals(Arrays.asList("a", "b"), names);
    }

    @Test
    public void testPathByIndexAlwaysMissing() {
        assertTrue(node.path(0).isMissingNode());
        assertTrue(node.path(-5).isMissingNode());
    }

    @Test
    public void testPathByFieldName_existing() {
        node.put("k", "v");
        assertEquals("v", node.path("k").asText());
    }

    @Test
    public void testPathByFieldName_missing() {
        assertTrue(node.path("nope").isMissingNode());
    }

    @Test
    public void testFieldsIterator() {
        node.put("a", 1);
        node.put("b", 2);
        Iterator<Map.Entry<String, JsonNode>> it = node.fields();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    // ---------- with(String) ----------

    @Test
    public void testWith_createsNewObjectNodeWhenAbsent() {
        ObjectNode result = node.with("child");
        assertNotNull(result);
        assertSame(result, node.get("child"));
    }

    @Test
    public void testWith_returnsExistingObjectNode() {
        ObjectNode child = node.putObject("child");
        ObjectNode result = node.with("child");
        assertSame(child, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWith_throwsWhenExistingIsNotObjectNode() {
        node.put("child", "text-value");
        node.with("child");
    }

    // ---------- withArray(String) ----------

    @Test
    public void testWithArray_createsNewArrayNodeWhenAbsent() {
        ArrayNode result = node.withArray("arr");
        assertNotNull(result);
        assertSame(result, node.get("arr"));
    }

    @Test
    public void testWithArray_returnsExistingArrayNode() {
        ArrayNode arr = node.putArray("arr");
        ArrayNode result = node.withArray("arr");
        assertSame(arr, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithArray_throwsWhenExistingIsNotArrayNode() {
        node.put("arr", "text-value");
        node.withArray("arr");
    }

    // ---------- findValue ----------

    @Test
    public void testFindValue_foundAtTopLevel() {
        node.put("target", "found");
        JsonNode result = node.findValue("target");
        assertNotNull(result);
        assertEquals("found", result.asText());
    }

    @Test
    public void testFindValue_foundInNestedChild() {
        ObjectNode child = node.putObject("child");
        child.put("target", "deep");
        JsonNode result = node.findValue("target");
        assertNotNull(result);
        assertEquals("deep", result.asText());
    }

    @Test
    public void testFindValue_notFound() {
        node.put("other", "x");
        assertNull(node.findValue("target"));
    }

    // ---------- findValues ----------

    @Test
    public void testFindValues_foundSoFarNullCreatesNewList() {
        node.put("target", "v1");
        List<JsonNode> result = node.findValues("target", null);
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    public void testFindValues_foundSoFarNotNullAppends() {
        List<JsonNode> existing = new ArrayList<JsonNode>();
        existing.add(factory.textNode("preexisting"));
        node.put("target", "v1");
        List<JsonNode> result = node.findValues("target", existing);
        assertEquals(2, result.size());
    }

    @Test
    public void testFindValues_recurseIntoChildWhenKeyNotMatched() {
        ObjectNode child = node.putObject("child");
        child.put("target", "deepVal");
        List<JsonNode> result = node.findValues("target", null);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("deepVal", result.get(0).asText());
    }

    @Test
    public void testFindValues_notFoundReturnsNull() {
        node.put("other", "x");
        assertNull(node.findValues("target", null));
    }

    // ---------- findValuesAsText ----------

    @Test
    public void testFindValuesAsText_foundSoFarNullCreatesNewList() {
        node.put("target", "textVal");
        List<String> result = node.findValuesAsText("target", null);
        assertNotNull(result);
        assertEquals(Arrays.asList("textVal"), result);
    }

    @Test
    public void testFindValuesAsText_recurseIntoChild() {
        ObjectNode child = node.putObject("child");
        child.put("target", "childText");
        List<String> result = node.findValuesAsText("target", null);
        assertEquals(Arrays.asList("childText"), result);
    }

    // ---------- findParent ----------

    @Test
    public void testFindParent_foundAtTopLevel() {
        node.put("target", "v");
        ObjectNode result = node.findParent("target");
        assertSame(node, result);
    }

    @Test
    public void testFindParent_foundInNestedChild() {
        ObjectNode child = node.putObject("child");
        child.put("target", "v");
        ObjectNode result = node.findParent("target");
        assertSame(child, result);
    }

    @Test
    public void testFindParent_notFound() {
        node.put("other", "v");
        assertNull(node.findParent("target"));
    }

    // ---------- findParents ----------

    @Test
    public void testFindParents_foundSoFarNullCreatesNewList() {
        node.put("target", "v");
        List<JsonNode> result = node.findParents("target", null);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertSame(node, result.get(0));
    }

    @Test
    public void testFindParents_recurseIntoChild() {
        ObjectNode child = node.putObject("child");
        child.put("target", "v");
        List<JsonNode> result = node.findParents("target", null);
        assertEquals(1, result.size());
        assertSame(child, result.get(0));
    }

    // ---------- serialize ----------

    @Test
    public void testSerialize_emptyObject() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        node.serialize(gen, null); // provider unused by leaf serialize in this version
        gen.flush();
        assertEquals("{}", sw.toString());
    }

    @Test
    public void testSerialize_withFields() throws Exception {
        node.put("a", 1);
        node.put("b", "x");
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        node.serialize(gen, null);
        gen.flush();
        String out = sw.toString();
        assertTrue(out.contains("\"a\":1"));
        assertTrue(out.contains("\"b\":\"x\""));
    }

    // ---------- serializeWithType ----------

    @Test
    public void testSerializeWithType_callsPrefixAndSuffix() throws Exception {
        node.put("a", 1);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        SerializerProvider provider = mock(SerializerProvider.class);

        node.serializeWithType(gen, provider, typeSer);
        gen.flush();

        verify(typeSer).writeTypePrefixForObject(node, gen);
        verify(typeSer).writeTypeSuffixForObject(node, gen);
        // field should still be written between prefix/suffix calls
        assertTrue(sw.toString().contains("\"a\":1"));
    }

    // ---------- set(String, JsonNode) ----------

    @Test
    public void testSet_nonNullValue() {
        node.set("k", factory.textNode("v"));
        assertEquals("v", node.get("k").asText());
    }

    @Test
    public void testSet_nullValueConvertedToNullNode() {
        JsonNode returned = node.set("k", null);
        assertSame(node, returned);
        assertTrue(node.get("k").isNull());
    }

    // ---------- setAll(Map) ----------

    @Test
    public void testSetAllMap_withNullValueConvertedToNullNode() {
        Map<String, JsonNode> props = new LinkedHashMap<String, JsonNode>();
        props.put("a", factory.textNode("1"));
        props.put("b", null);
        node.setAll(props);
        assertEquals("1", node.get("a").asText());
        assertTrue(node.get("b").isNull());
    }

    // ---------- setAll(ObjectNode) ----------

    @Test
    public void testSetAllObjectNode_overridesExisting() {
        node.put("a", "old");
        ObjectNode other = new ObjectNode(factory);
        other.put("a", "new");
        other.put("b", "added");
        node.setAll(other);
        assertEquals("new", node.get("a").asText());
        assertEquals("added", node.get("b").asText());
    }

    // ---------- replace ----------

    @Test
    public void testReplace_newField_returnsNull() {
        JsonNode old = node.replace("k", factory.textNode("v"));
        assertNull(old);
        assertEquals("v", node.get("k").asText());
    }

    @Test
    public void testReplace_existingField_returnsOldValue() {
        node.put("k", "old");
        JsonNode old = node.replace("k", factory.textNode("new"));
        assertEquals("old", old.asText());
        assertEquals("new", node.get("k").asText());
    }

    @Test
    public void testReplace_nullValueConvertedToNullNode() {
        node.replace("k", null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- without(String) ----------

    @Test
    public void testWithoutString_removesField() {
        node.put("k", "v");
        JsonNode result = node.without("k");
        assertSame(node, result);
        assertNull(node.get("k"));
    }

    @Test
    public void testWithoutString_noOpWhenAbsent() {
        JsonNode result = node.without("missing");
        assertSame(node, result);
    }

    // ---------- without(Collection) ----------

    @Test
    public void testWithoutCollection_removesMultipleFields() {
        node.put("a", 1);
        node.put("b", 2);
        node.put("c", 3);
        ObjectNode result = node.without(Arrays.asList("a", "b"));
        assertSame(node, result);
        assertNull(node.get("a"));
        assertNull(node.get("b"));
        assertNotNull(node.get("c"));
    }

    // ---------- put(String, JsonNode) deprecated ----------

    @Test
    public void testPutDeprecated_nullValue() {
        JsonNode old = node.put("k", (JsonNode) null);
        assertNull(old);
        assertTrue(node.get("k").isNull());
    }

    @Test
    public void testPutDeprecated_returnsOldValue() {
        node.put("k", "old");
        JsonNode old = node.put("k", factory.textNode("new"));
        assertEquals("old", old.asText());
    }

    // ---------- remove(String) ----------

    @Test
    public void testRemoveString_existing() {
        node.put("k", "v");
        JsonNode removed = node.remove("k");
        assertNotNull(removed);
        assertNull(node.get("k"));
    }

    @Test
    public void testRemoveString_missingReturnsNull() {
        assertNull(node.remove("missing"));
    }

    // ---------- remove(Collection) ----------

    @Test
    public void testRemoveCollection() {
        node.put("a", 1);
        node.put("b", 2);
        ObjectNode result = node.remove(Arrays.asList("a"));
        assertSame(node, result);
        assertNull(node.get("a"));
        assertNotNull(node.get("b"));
    }

    // ---------- removeAll ----------

    @Test
    public void testRemoveAll() {
        node.put("a", 1);
        node.put("b", 2);
        ObjectNode result = node.removeAll();
        assertSame(node, result);
        assertEquals(0, node.size());
    }

    // ---------- putAll(Map) deprecated ----------

    @Test
    public void testPutAllMapDeprecated_delegatesToSetAll() {
        Map<String, JsonNode> props = new LinkedHashMap<String, JsonNode>();
        props.put("a", factory.textNode("1"));
        node.putAll(props);
        assertEquals("1", node.get("a").asText());
    }

    // ---------- putAll(ObjectNode) deprecated ----------

    @Test
    public void testPutAllObjectNodeDeprecated_delegatesToSetAll() {
        ObjectNode other = new ObjectNode(factory);
        other.put("x", "y");
        node.putAll(other);
        assertEquals("y", node.get("x").asText());
    }

    // ---------- retain(Collection) ----------

    @Test
    public void testRetainCollection() {
        node.put("a", 1);
        node.put("b", 2);
        node.put("c", 3);
        ObjectNode result = node.retain(Arrays.asList("b"));
        assertSame(node, result);
        assertNull(node.get("a"));
        assertNotNull(node.get("b"));
        assertNull(node.get("c"));
    }

    // ---------- retain(String...) ----------

    @Test
    public void testRetainVarargs() {
        node.put("a", 1);
        node.put("b", 2);
        ObjectNode result = node.retain("a");
        assertSame(node, result);
        assertNotNull(node.get("a"));
        assertNull(node.get("b"));
    }

    // ---------- putArray ----------

    @Test
    public void testPutArray_createsArrayNodeAndReplacesOld() {
        node.put("arr", "notAnArray");
        ArrayNode arr = node.putArray("arr");
        assertNotNull(arr);
        assertSame(arr, node.get("arr"));
    }

    // ---------- putObject ----------

    @Test
    public void testPutObject_createsObjectNode() {
        ObjectNode child = node.putObject("child");
        assertNotNull(child);
        assertSame(child, node.get("child"));
    }

    // ---------- putPOJO ----------

    @Test
    public void testPutPOJO() {
        Object pojo = new Object();
        ObjectNode result = node.putPOJO("pojo", pojo);
        assertSame(node, result);
        assertTrue(node.get("pojo") instanceof POJONode);
    }

    // ---------- putNull ----------

    @Test
    public void testPutNull() {
        ObjectNode result = node.putNull("k");
        assertSame(node, result);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, short) / (String, Short) ----------

    @Test
    public void testPutShortPrimitive() {
        node.put("k", (short) 5);
        assertTrue(node.get("k") instanceof ShortNode);
        assertEquals(5, node.get("k").shortValue());
    }

    @Test
    public void testPutShortWrapper_nonNull() {
        node.put("k", Short.valueOf((short) 7));
        assertTrue(node.get("k") instanceof ShortNode);
    }

    @Test
    public void testPutShortWrapper_null() {
        node.put("k", (Short) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, int) / (String, Integer) ----------

    @Test
    public void testPutIntPrimitive() {
        node.put("k", 42);
        assertTrue(node.get("k") instanceof IntNode);
    }

    @Test
    public void testPutIntegerWrapper_nonNull() {
        node.put("k", Integer.valueOf(99));
        assertTrue(node.get("k") instanceof IntNode);
    }

    @Test
    public void testPutIntegerWrapper_null() {
        node.put("k", (Integer) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, long) / (String, Long) ----------

    @Test
    public void testPutLongPrimitive() {
        node.put("k", 123456789012L);
        assertTrue(node.get("k") instanceof LongNode);
    }

    @Test
    public void testPutLongWrapper_nonNull() {
        node.put("k", Long.valueOf(1L));
        assertNotNull(node.get("k"));
    }

    @Test
    public void testPutLongWrapper_null() {
        node.put("k", (Long) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, float) / (String, Float) ----------

    @Test
    public void testPutFloatPrimitive() {
        node.put("k", 1.5f);
        assertTrue(node.get("k") instanceof FloatNode);
    }

    @Test
    public void testPutFloatWrapper_nonNull() {
        node.put("k", Float.valueOf(2.5f));
        assertNotNull(node.get("k"));
    }

    @Test
    public void testPutFloatWrapper_null() {
        node.put("k", (Float) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, double) / (String, Double) ----------

    @Test
    public void testPutDoublePrimitive() {
        node.put("k", 3.14);
        assertTrue(node.get("k") instanceof DoubleNode);
    }

    @Test
    public void testPutDoubleWrapper_nonNull() {
        node.put("k", Double.valueOf(2.0));
        assertNotNull(node.get("k"));
    }

    @Test
    public void testPutDoubleWrapper_null() {
        node.put("k", (Double) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, BigDecimal) ----------

    @Test
    public void testPutBigDecimal_nonNull() {
        node.put("k", new BigDecimal("1.23"));
        assertTrue(node.get("k") instanceof DecimalNode);
    }

    @Test
    public void testPutBigDecimal_null() {
        node.put("k", (BigDecimal) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, String) ----------

    @Test
    public void testPutString_nonNull() {
        node.put("k", "hello");
        assertTrue(node.get("k") instanceof TextNode);
    }

    @Test
    public void testPutString_null() {
        node.put("k", (String) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, boolean) / (String, Boolean) ----------

    @Test
    public void testPutBooleanPrimitive() {
        node.put("k", true);
        assertTrue(node.get("k") instanceof BooleanNode);
        assertTrue(node.get("k").booleanValue());
    }

    @Test
    public void testPutBooleanWrapper_nonNull() {
        node.put("k", Boolean.FALSE);
        assertFalse(node.get("k").booleanValue());
    }

    @Test
    public void testPutBooleanWrapper_null() {
        node.put("k", (Boolean) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- put(String, byte[]) ----------

    @Test
    public void testPutByteArray_nonNull() {
        node.put("k", new byte[]{1, 2, 3});
        assertTrue(node.get("k") instanceof BinaryNode);
    }

    @Test
    public void testPutByteArray_null() {
        node.put("k", (byte[]) null);
        assertTrue(node.get("k").isNull());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameReference() {
        assertTrue(node.equals(node));
    }

    @Test
    public void testEquals_null() {
        assertFalse(node.equals(null));
    }

    @Test
    public void testEquals_differentType() {
        assertFalse(node.equals(factory.textNode("x")));
    }

    @Test
    public void testEquals_equalObjectNodes() {
        node.put("a", 1);
        ObjectNode other = new ObjectNode(factory);
        other.put("a", 1);
        assertTrue(node.equals(other));
    }

    @Test
    public void testEquals_differentObjectNodes() {
        node.put("a", 1);
        ObjectNode other = new ObjectNode(factory);
        other.put("a", 2);
        assertFalse(node.equals(other));
    }

    // ---------- _childrenEqual (direct, protected) ----------

    @Test
    public void test_childrenEqual_direct() {
        node.put("a", 1);
        ObjectNode other = new ObjectNode(factory);
        other.put("a", 1);
        assertTrue(node._childrenEqual(other));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_consistentWithEquals() {
        node.put("a", 1);
        ObjectNode other = new ObjectNode(factory);
        other.put("a", 1);
        assertEquals(node.hashCode(), other.hashCode());
    }

    // ---------- toString ----------

    @Test
    public void testToString_empty() {
        assertEquals("{}", node.toString());
    }

    @Test
    public void testToString_singleField() {
        node.put("a", 1);
        String s = node.toString();
        assertTrue(s.startsWith("{"));
        assertTrue(s.endsWith("}"));
        assertTrue(s.contains("\"a\":1"));
    }

    @Test
    public void testToString_multipleFields_hasComma() {
        node.put("a", 1);
        node.put("b", 2);
        String s = node.toString();
        assertTrue(s.contains(","));
        assertTrue(s.contains("\"a\":1"));
        assertTrue(s.contains("\"b\":2"));
    }

    // ---------- _put (protected internal) ----------

    @Test
    public void test_put_direct() {
        JsonNode result = node._put("k", factory.textNode("v"));
        assertSame(node, result);
        assertEquals("v", node.get("k").asText());
    }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructorEmptyChildren / testConstructorWithSuppliedMap | ตัวสร้างทั้ง 2 แบบ |
| test_at_existingProperty / test_at_missingProperty | `_at()`: n != null / n == null |
| testDeepCopy | loop deepCopy, ตรวจ deep clone ของ nested node |
| testGetNodeType, testAsToken | ค่าคงที่ enum/token |
| testSize | ขอบเขต 0 และ >0 |
| testElementsIterator, testFieldNamesIterator, testFieldsIterator | loop iterator ปกติ |
| testGetByIndexAlwaysNull, testPathByIndexAlwaysMissing | สาขาที่ return ค่าคงที่เสมอ |
| testGetByFieldName_existingAndMissing, testPathByFieldName_existing/_missing | if (n != null) / else |
| testWith_createsNewObjectNodeWhenAbsent / _returnsExistingObjectNode / _throwsWhenExistingIsNotObjectNode | 3 สาขาของ `with()` |
| testWithArray_* (3 เทส) | 3 สาขาของ `withArray()` |
| testFindValue_foundAtTopLevel / _foundInNestedChild / _notFound | if match / recurse / not found |
| testFindValues_foundSoFarNullCreatesNewList / _NotNullAppends / _recurseIntoChildWhenKeyNotMatched / _notFoundReturnsNull | if(foundSoFar==null) / else / recursion |
| testFindValuesAsText_* | เหมือนกับ findValues แต่ asText |
| testFindParent_foundAtTopLevel / _foundInNestedChild / _notFound | 3 สาขาของ findParent |
| testFindParents_foundSoFarNullCreatesNewList / _recurseIntoChild | if/else ของ findParents |
| testSerialize_emptyObject / _withFields | loop serialize, 0 และ >0 children |
| testSerializeWithType_callsPrefixAndSuffix | เรียก prefix/suffix + loop field ระหว่างกลาง |
| testSet_nonNullValue / _nullValueConvertedToNullNode | if(value==null) ของ `set()` |
| testSetAllMap_withNullValueConvertedToNullNode | if(n==null) ภายใน loop `setAll(Map)` |
| testSetAllObjectNode_overridesExisting | `setAll(ObjectNode)` |
| testReplace_newField_returnsNull / _existingField_returnsOldValue / _nullValueConvertedToNullNode | if(value==null) + old value return |
| testWithoutString_removesField / _noOpWhenAbsent | `without(String)` ทั้ง 2 กรณี |
| testWithoutCollection_removesMultipleFields | `without(Collection)` |
| testPutDeprecated_nullValue / _returnsOldValue | if(value==null) ของ deprecated `put(String,JsonNode)` |
| testRemoveString_existing / _missingReturnsNull | `remove(String)` 2 กรณี |
| testRemoveCollection | `remove(Collection)` |
| testRemoveAll | `removeAll()` |
| testPutAllMapDeprecated_delegatesToSetAll / testPutAllObjectNodeDeprecated_* | deprecated delegation |
| testRetainCollection / testRetainVarargs | `retain(Collection)` และ `retain(String...)` |
| testPutArray_createsArrayNodeAndReplacesOld | `putArray()` |
| testPutObject_createsObjectNode | `putObject()` |
| testPutPOJO | `putPOJO()` |
| testPutNull | `putNull()` |
| testPutShortPrimitive/_Wrapper_nonNull/_Wrapper_null | short/Short: มี/ไม่มี null-check |
| testPutIntPrimitive/testPutIntegerWrapper_* | int/Integer |
| testPutLongPrimitive/testPutLongWrapper_* | long/Long |
| testPutFloatPrimitive/testPutFloatWrapper_* | float/Float |
| testPutDoublePrimitive/testPutDoubleWrapper_* | double/Double |
| testPutBigDecimal_nonNull/_null | BigDecimal null-check |
| testPutString_nonNull/_null | String null-check |
| testPutBooleanPrimitive/testPutBooleanWrapper_* | boolean/Boolean |
| testPutByteArray_nonNull/_null | byte[] null-check |
| testEquals_sameReference/_null/_differentType/_equalObjectNodes/_differentObjectNodes | ครบทุกสาขาของ `equals()` |
| test_childrenEqual_direct | `_childrenEqual()` โดยตรง |
| testHashCode_consistentWithEquals | `hashCode()` |
| testToString_empty/_singleField/_multipleFields_hasComma | loop toString, count==0 / count>0 (comma branch) |
| test_put_direct | `_put()` internal helper |

**ข้อควรระวัง/สิ่งที่ไม่ได้เดา:** ไม่ได้ทดสอบ public `at(String)`/`at(JsonPointer)` (มาจาก base class ที่ไม่มีซอร์สให้) โดยตรง — ทดสอบ `_at()` ที่เป็นเมธอดของ ObjectNode เองแทน เพื่อไม่ละเมิดข้อกำหนดที่ 4