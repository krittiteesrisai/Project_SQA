# JUnit 4 Test Suite: ObjectReaderTest

หมายเหตุสำคัญก่อนเริ่ม:
- `ObjectReader` มี constructor เป็น `protected` เข้าถึงได้ผ่าน `ObjectMapper` เท่านั้น (เช่น `mapper.reader()`, `mapper.readerFor(...)`, `mapper.readerForUpdating(...)`) จึงต้องทดสอบผ่าน public API ของ `ObjectMapper`
- บาง branch (เช่น `with(FormatSchema)` กรณี schema ใช้งานได้จริงกับ format, หรือ `FormatFeature` overloads) ไม่สามารถทดสอบได้อย่างปลอดภัยด้วย classpath ที่กำหนด (ไม่มี XML/CSV/Avro module) — ได้ใส่คอมเมนต์กำกับไว้ว่า "ข้าม/ไม่แน่ใจ" ตามข้อกำหนดข้อ 4
- ใช้ default `ObjectMapper` เพราะ POJO ที่มี public field จะถูก auto-detect เป็น property ได้โดยไม่ต้องมี annotation

```java
package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectReader; // explicit import per requirement

public class ObjectReaderTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    /* Simple POJO with public field -> auto-detected by Jackson default config */
    public static class SimpleBean {
        public String value;
    }

    /* ============================================================
     * 1. readValue(JsonParser) - _bind() branches
     * ============================================================ */

    @Test
    public void testReadValueSimpleString() throws Exception {
        ObjectReader reader = mapper.readerFor(String.class);
        String result = reader.readValue("\"hello\"");
        assertEquals("hello", result);
    }

    @Test
    public void testReadValueInteger() throws Exception {
        ObjectReader reader = mapper.readerFor(Integer.class);
        Integer result = reader.readValue("123");
        assertEquals(Integer.valueOf(123), result);
    }

    @Test(expected = JsonMappingException.class)
    public void testReadValueEmptyInputThrows() throws Exception {
        // _initForReading: t == null after nextToken() -> throws "No content to map"
        ObjectReader reader = mapper.readerFor(String.class);
        reader.readValue("");
    }

    @Test
    public void testReadValueNullTokenWithoutValueToUpdate() throws Exception {
        // t == VALUE_NULL, valueToUpdate == null -> deser.getNullValue(ctxt)
        ObjectReader reader = mapper.readerFor(String.class);
        String result = reader.readValue("null");
        assertNull(result);
    }

    @Test
    public void testReadValueNullTokenWithValueToUpdate() throws Exception {
        // t == VALUE_NULL, valueToUpdate != null -> result = valueToUpdate
        List<String> existing = new ArrayList<String>();
        existing.add("keep");
        ObjectReader reader = mapper.readerForUpdating(existing);
        JsonParser p = mapper.getFactory().createParser("null");
        List<String> result = reader.readValue(p);
        assertSame(existing, result);
    }

    @Test
    public void testReadValueEndArrayBranch() throws Exception {
        // t == END_ARRAY -> result = valueToUpdate (null here)
        ObjectReader reader = mapper.readerFor(Integer.class);
        JsonParser p = mapper.getFactory().createParser("[1,2]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // 1
        p.nextToken(); // 2
        p.nextToken(); // END_ARRAY
        Integer result = reader.readValue(p);
        assertNull(result);
    }

    @Test
    public void testReadValueEndObjectBranch() throws Exception {
        // t == END_OBJECT -> result = valueToUpdate (null here)
        ObjectReader reader = mapper.readerFor(Integer.class);
        JsonParser p = mapper.getFactory().createParser("{}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // END_OBJECT
        Integer result = reader.readValue(p);
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testReadValueWithoutTypeThrows() throws Exception {
        // _findRootDeserializer: t == null -> throws "No value type configured"
        ObjectReader reader = mapper.reader();
        reader.readValue("{\"a\":1}");
    }

    /* ============================================================
     * 2. withValueToUpdate - branches
     * ============================================================ */

    @Test(expected = IllegalArgumentException.class)
    public void testWithValueToUpdateNullThrows() {
        ObjectReader reader = mapper.reader();
        reader.withValueToUpdate(null);
    }

    @Test
    public void testWithValueToUpdateSameInstanceReturnsThis() {
        List<String> val = new ArrayList<String>();
        ObjectReader reader = mapper.readerForUpdating(val);
        ObjectReader r2 = reader.withValueToUpdate(val);
        assertSame(reader, r2);
    }

    @Test
    public void testWithValueToUpdateNewValueCreatesDifferentInstance() {
        List<String> val1 = new ArrayList<String>();
        List<String> val2 = new ArrayList<String>();
        ObjectReader reader = mapper.readerForUpdating(val1);
        ObjectReader r2 = reader.withValueToUpdate(val2);
        assertNotSame(reader, r2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorArrayValueToUpdateThrows() {
        // ObjectReader ctor: valueToUpdate != null && valueType.isArrayType() -> throw
        int[] arr = new int[]{1, 2, 3};
        mapper.readerForUpdating(arr);
    }

    /* ============================================================
     * 3. forType(...) - branches
     * ============================================================ */

    @Test
    public void testForTypeSameTypeReturnsThis() {
        ObjectReader reader = mapper.readerFor(String.class);
        ObjectReader r2 = reader.forType(reader.getConfig().constructType(String.class));
        assertSame(reader, r2);
    }

    @Test
    public void testForTypeDifferentTypeReturnsNew() {
        ObjectReader reader = mapper.readerFor(String.class);
        ObjectReader r2 = reader.forType(Integer.class);
        assertNotSame(reader, r2);
    }

    @Test
    public void testForTypeTypeReference() {
        ObjectReader reader = mapper.reader().forType(new TypeReference<List<String>>() {});
        assertNotNull(reader);
    }

    /* ============================================================
     * 4. with(JsonFactory) - branches
     * ============================================================ */

    @Test
    public void testWithSameFactoryReturnsThis() {
        ObjectReader reader = mapper.reader();
        ObjectReader r2 = reader.with(reader.getFactory());
        assertSame(reader, r2);
    }

    @Test
    public void testWithDifferentFactoryReturnsNew() {
        ObjectReader reader = mapper.reader();
        JsonFactory newFactory = new JsonFactory();
        ObjectReader r2 = reader.with(newFactory);
        assertNotSame(reader, r2);
        assertSame(newFactory, r2.getFactory());
    }

    /* ============================================================
     * 5. with(FormatSchema) - branches
     * ============================================================ */

    @Test
    public void testWithSameSchemaReturnsThis() {
        ObjectReader reader = mapper.reader();
        ObjectReader r2 = reader.with((FormatSchema) null);
        assertSame(reader, r2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIncompatibleSchemaThrows() {
        // plain JsonFactory.canUseSchema() always false -> _verifySchemaType throws
        ObjectReader reader = mapper.reader();
        FormatSchema fakeSchema = new FormatSchema() {
            @Override
            public String getSchemaType() {
                return "fake";
            }
        };
        reader.with(fakeSchema);
    }
    // NOTE: ไม่ทดสอบ branch ที่ schema ใช้งานได้จริง เพราะ classpath ที่กำหนด
    // ไม่มี JsonFactory/FormatSchema ที่ canUseSchema()==true (เช่น CSV/Avro)

    /* ============================================================
     * 6. DeserializationFeature toggles (_with branches)
     * ============================================================ */

    @Test
    public void testWithConfigSameReturnsThis() {
        ObjectReader reader = mapper.reader();
        ObjectReader r2 = reader.with(reader.getConfig());
        assertSame(reader, r2);
    }

    @Test
    public void testWithDeserializationFeature() {
        ObjectReader reader = mapper.reader();
        ObjectReader r2 = reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutDeserializationFeature() {
        ObjectReader reader = mapper.reader().with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader r2 = reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithFeaturesArray() {
        ObjectReader reader = mapper.reader();
        ObjectReader r2 = reader.withFeatures(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertTrue(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(r2.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
    }

    @Test
    public void testWithoutFeaturesArray() {
        ObjectReader reader = mapper.reader()
                .withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader r2 = reader.withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithJsonParserFeature() {
        ObjectReader reader = mapper.reader().with(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutJsonParserFeature() {
        ObjectReader reader = mapper.reader()
                .with(JsonParser.Feature.ALLOW_COMMENTS)
                .without(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }
    // NOTE: with(FormatFeature)/withFeatures(FormatFeature...) ไม่ทดสอบ
    // เพราะ classpath ไม่มี concrete FormatFeature implementation ที่ปลอดภัยต่อการ mock พฤติกรรมจริง

    /* ============================================================
     * 7. _prefetchRootDeserializer / _findRootDeserializer branches
     * ============================================================ */

    @Test
    public void testPrefetchDisabledStillWorksLazily() throws Exception {
        // EAGER_DESERIALIZER_FETCH disabled -> _prefetchRootDeserializer returns null early
        ObjectReader reader = mapper.reader()
                .without(DeserializationFeature.EAGER_DESERIALIZER_FETCH)
                .forType(SimpleBean.class);
        SimpleBean bean = reader.readValue("{\"value\":\"lazy\"}");
        assertEquals("lazy", bean.value);
    }

    @Test
    public void testFindRootDeserializerCacheHitBranch() throws Exception {
        // First call resolves+caches, second call hits _rootDeserializers.get(t) != null
        ObjectReader reader = mapper.reader()
                .without(DeserializationFeature.EAGER_DESERIALIZER_FETCH)
                .forType(SimpleBean.class);
        SimpleBean b1 = reader.readValue("{\"value\":\"one\"}");
        SimpleBean b2 = reader.readValue("{\"value\":\"two\"}");
        assertEquals("one", b1.value);
        assertEquals("two", b2.value);
    }

    /* ============================================================
     * 8. Root name unwrap - _unwrapAndDeserialize branches
     * ============================================================ */

    @Test
    public void testWithRootNameAndUnwrapSuccess() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withRootName("SimpleBean");
        String json = "{\"SimpleBean\":{\"value\":\"abc\"}}";
        SimpleBean bean = reader.readValue(json);
        assertEquals("abc", bean.value);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootNameMismatchThrows() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withRootName("SimpleBean");
        String json = "{\"WrongName\":{\"value\":\"abc\"}}";
        reader.readValue(json);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootNotStartObjectThrows() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withRootName("SimpleBean");
        String json = "[1,2,3]"; // current token not START_OBJECT
        reader.readValue(json);
    }

    @Test
    public void testWithoutRootNameDoesNotThrow() {
        ObjectReader reader = mapper.reader().withoutRootName();
        assertNotNull(reader);
    }

    /* ============================================================
     * 9. readTree - branches
     * ============================================================ */

    @Test
    public void testReadTreeFromString() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonNode node = reader.readTree("{\"a\":1}");
        assertTrue(node.isObject());
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testReadTreeNullInput() throws Exception {
        // _bindAsTree: t == VALUE_NULL -> NullNode.instance
        ObjectReader reader = mapper.reader();
        JsonNode node = reader.readTree("null");
        assertTrue(node.isNull());
    }

    @Test
    public void testReadTreeCacheHitBranch() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonNode n1 = reader.readTree("{\"a\":1}"); // resolves+caches tree deserializer
        JsonNode n2 = reader.readTree("{\"b\":2}"); // cache hit
        assertNotNull(n1);
        assertNotNull(n2);
    }

    @Test
    public void testReadTreeFromInputStream() throws Exception {
        ObjectReader reader = mapper.reader();
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes("UTF-8"));
        JsonNode node = reader.readTree(in);
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testReadTreeFromReader() throws Exception {
        ObjectReader reader = mapper.reader();
        Reader r = new StringReader("{\"a\":1}");
        JsonNode node = reader.readTree(r);
        assertEquals(1, node.get("a").asInt());
    }

    /* ============================================================
     * 10. writeTree / writeValue - unsupported
     * ============================================================ */

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteTreeThrowsUnsupported() {
        ObjectReader reader = mapper.reader();
        reader.writeTree(null, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteValueThrowsUnsupported() throws Exception {
        ObjectReader reader = mapper.reader();
        reader.writeValue(null, null);
    }

    /* ============================================================
     * 11. readValue from various sources (non-format-detect path)
     * ============================================================ */

    @Test
    public void testReadValueFromInputStream() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        InputStream in = new ByteArrayInputStream("{\"value\":\"instream\"}".getBytes("UTF-8"));
        SimpleBean bean = reader.readValue(in);
        assertEquals("instream", bean.value);
    }

    @Test
    public void testReadValueFromReader() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        Reader r = new StringReader("{\"value\":\"readerval\"}");
        SimpleBean bean = reader.readValue(r);
        assertEquals("readerval", bean.value);
    }

    @Test
    public void testReadValueFromByteArray() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        byte[] data = "{\"value\":\"bytesval\"}".getBytes("UTF-8");
        SimpleBean bean = reader.readValue(data);
        assertEquals("bytesval", bean.value);
    }

    @Test
    public void testReadValueByteArrayOffsetLength() throws Exception {
        String prefix = "XXX";
        String payload = "{\"value\":\"byteoff\"}";
        String suffix = "YYY";
        byte[] full = (prefix + payload + suffix).getBytes("UTF-8");
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue(full, prefix.length(), payload.length());
        assertEquals("byteoff", bean.value);
    }

    @Test
    public void testReadValueFromFile() throws Exception {
        File tmp = File.createTempFile("test2", ".json");
        tmp.deleteOnExit();
        Writer w = new FileWriter(tmp);
        w.write("{\"value\":\"filed\"}");
        w.close();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue(tmp);
        assertEquals("filed", bean.value);
    }

    @Test
    public void testReadValueFromURL() throws Exception {
        File tmp = File.createTempFile("test3", ".json");
        tmp.deleteOnExit();
        Writer w = new FileWriter(tmp);
        w.write("{\"value\":\"urled\"}");
        w.close();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue(tmp.toURI().toURL());
        assertEquals("urled", bean.value);
    }

    @Test
    public void testReadValueFromJsonNode() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        JsonNode node = mapper.readTree("{\"value\":\"fromnode\"}");
        SimpleBean bean = reader.readValue(node);
        assertEquals("fromnode", bean.value);
    }

    /* ============================================================
     * 12. readValue(JsonParser, X) overloads
     * ============================================================ */

    @Test
    public void testReadValueParserWithClass() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonParser p = mapper.getFactory().createParser("\"abc\"");
        String s = reader.readValue(p, String.class);
        assertEquals("abc", s);
    }

    @Test
    public void testReadValueParserWithTypeReference() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonParser p = mapper.getFactory().createParser("[\"a\",\"b\"]");
        List<String> list = reader.readValue(p, new TypeReference<List<String>>() {});
        assertEquals(Arrays.asList("a", "b"), list);
    }

    @Test
    public void testReadValueParserWithJavaType() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonParser p = mapper.getFactory().createParser("42");
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        Integer val = reader.readValue(p, type);
        assertEquals(Integer.valueOf(42), val);
    }

    @Test
    public void testReadValueParserWithResolvedType() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonParser p = mapper.getFactory().createParser("42");
        ResolvedType type = mapper.getTypeFactory().constructType(Integer.class);
        Integer val = reader.readValue(p, type);
        assertEquals(Integer.valueOf(42), val);
    }

    /* ============================================================
     * 13. readValues(JsonParser, X) overloads
     * ============================================================ */

    @Test
    public void testReadValuesParserWithClass() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        Iterator<Integer> it = reader.readValues(p, Integer.class);
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    @Test
    public void testReadValuesParserWithTypeReference() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        Iterator<Integer> it = reader.readValues(p, new TypeReference<Integer>() {});
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    @Test
    public void testReadValuesParserWithResolvedType() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        ResolvedType type = mapper.getTypeFactory().constructType(Integer.class);
        Iterator<Integer> it = reader.readValues(p, type);
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    @Test
    public void testReadValuesUnwrappedFromString() throws Exception {
        ObjectReader reader = mapper.readerFor(Integer.class);
        MappingIterator<Integer> it = reader.readValues("1 2 3");
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    @Test
    public void testReadValuesWrappedFromParser() throws Exception {
        // per javadoc: parser MUST point to token *following* START_ARRAY
        ObjectReader reader = mapper.readerFor(Integer.class);
        JsonParser p = mapper.getFactory().createParser("[1,2,3]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // '1' - first element token
        MappingIterator<Integer> it = reader.readValues(p);
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    @Test
    public void testReadValuesFromInputStream() throws Exception {
        ObjectReader reader = mapper.readerFor(Integer.class);
        InputStream in = new ByteArrayInputStream("1 2 3".getBytes("UTF-8"));
        MappingIterator<Integer> it = reader.readValues(in);
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    @Test
    public void testReadValuesFromFile() throws Exception {
        File tmp = File.createTempFile("valsfile", ".json");
        tmp.deleteOnExit();
        Writer w = new FileWriter(tmp);
        w.write("1 2 3");
        w.close();
        ObjectReader reader = mapper.readerFor(Integer.class);
        MappingIterator<Integer> it = reader.readValues(tmp);
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    /* ============================================================
     * 14. Format detection (_dataFormatReaders) branches
     * ============================================================ */

    @Test
    public void testWithFormatDetectionMatchSuccess() throws Exception {
        ObjectReader jsonReader = mapper.readerFor(SimpleBean.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        byte[] data = "{\"value\":\"x\"}".getBytes("UTF-8");
        SimpleBean bean = detecting.readValue(data);
        assertEquals("x", bean.value);
    }

    @Test(expected = JsonProcessingException.class)
    public void testWithFormatDetectionNoMatchThrows() throws Exception {
        ObjectReader jsonReader = mapper.readerFor(SimpleBean.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        byte[] garbage = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04};
        detecting.readValue(garbage);
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadValueReaderWithFormatDetectionThrows() throws Exception {
        // Reader source + _dataFormatReaders != null -> _reportUndetectableSource
        ObjectReader jsonReader = mapper.readerFor(SimpleBean.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readValue(new StringReader("{\"value\":\"x\"}"));
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadValueStringWithFormatDetectionThrows() throws Exception {
        ObjectReader jsonReader = mapper.readerFor(SimpleBean.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readValue("{\"value\":\"x\"}");
    }

    @Test
    public void testReadValueFileWithFormatDetection() throws Exception {
        File tmp = File.createTempFile("fmt", ".json");
        tmp.deleteOnExit();
        Writer w = new FileWriter(tmp);
        w.write("{\"value\":\"filefmt\"}");
        w.close();
        ObjectReader jsonReader = mapper.readerFor(SimpleBean.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        SimpleBean bean = detecting.readValue(tmp);
        assertEquals("filefmt", bean.value);
    }

    @Test
    public void testReadTreeWithFormatDetectionSuccess() throws Exception {
        ObjectReader baseReader = mapper.reader();
        ObjectReader detecting = baseReader.withFormatDetection(baseReader);
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes("UTF-8"));
        JsonNode node = detecting.readTree(in);
        assertEquals(1, node.get("a").asInt());
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadTreeWithFormatDetectionNoMatchThrows() throws Exception {
        ObjectReader baseReader = mapper.reader();
        ObjectReader detecting = baseReader.withFormatDetection(baseReader);
        InputStream in = new ByteArrayInputStream(new byte[]{0, 1, 2, 3, 4});
        detecting.readTree(in);
    }

    @Test
    public void testReadValuesInputStreamWithFormatDetection() throws Exception {
        ObjectReader baseReader = mapper.readerFor(Integer.class);
        ObjectReader detecting = baseReader.withFormatDetection(baseReader);
        InputStream in = new ByteArrayInputStream("1 2 3".getBytes("UTF-8"));
        MappingIterator<Integer> it = detecting.readValues(in);
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    @Test
    public void testReadValuesByteArrayWithFormatDetection() throws Exception {
        ObjectReader baseReader = mapper.readerFor(Integer.class);
        ObjectReader detecting = baseReader.withFormatDetection(baseReader);
        byte[] data = "1 2 3".getBytes("UTF-8");
        MappingIterator<Integer> it = detecting.readValues(data, 0, data.length);
        List<Integer> vals = new ArrayList<Integer>();
        while (it.hasNext()) vals.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), vals);
    }

    /* ============================================================
     * 15. at(String) / at(JsonPointer) filtering - _considerFilter branch
     * ============================================================ */

    @Test
    public void testAtStringPointerFilter() throws Exception {
        ObjectReader reader = mapper.readerFor(String.class).at("/a/b");
        String json = "{\"a\":{\"b\":\"found\"}}";
        String value = reader.readValue(json);
        assertEquals("found", value);
    }

    @Test
    public void testAtJsonPointerFilter() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/b");
        ObjectReader reader = mapper.readerFor(String.class).at(ptr);
        String json = "{\"a\":{\"b\":\"found2\"}}";
        String value = reader.readValue(json);
        assertEquals("found2", value);
    }

    /* ============================================================
     * 16. Simple accessors / misc
     * ============================================================ */

    @Test
    public void testIsEnabledMapperFeatureDefaultTrue() {
        ObjectReader reader = mapper.reader();
        assertTrue(reader.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testIsEnabledParserFeatureDefaultFalse() {
        ObjectReader reader = mapper.reader();
        assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testGetTypeFactoryNotNull() {
        assertNotNull(mapper.reader().getTypeFactory());
    }

    @Test
    public void testGetAttributesNotNull() {
        assertNotNull(mapper.reader().getAttributes());
    }

    @Test
    public void testGetInjectableValuesDefaultNull() {
        assertNull(mapper.reader().getInjectableValues());
    }

    @Test
    public void testWithInjectableValuesSameReturnsThis() {
        ObjectReader reader = mapper.reader();
        ObjectReader r2 = reader.with((InjectableValues) null);
        assertSame(reader, r2);
    }

    @Test
    public void testWithInjectableValuesDifferentReturnsNew() {
        ObjectReader reader = mapper.reader();
        InjectableValues values = new InjectableValues.Std();
        ObjectReader r2 = reader.with(values);
        assertNotSame(reader, r2);
        assertSame(values, r2.getInjectableValues());
    }

    @Test
    public void testTreeToValue() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonNode node = mapper.readTree("{\"value\":\"tv\"}");
        SimpleBean bean = reader.treeToValue(node, SimpleBean.class);
        assertEquals("tv", bean.value);
    }

    @Test
    public void testVersionNotNull() {
        assertNotNull(mapper.reader().version());
    }

    @Test
    public void testCreateArrayNode() {
        JsonNode node = mapper.reader().createArrayNode();
        assertTrue(node.isArray());
    }

    @Test
    public void testCreateObjectNode() {
        JsonNode node = mapper.reader().createObjectNode();
        assertTrue(node.isObject());
    }

    @Test
    public void testTreeAsTokens() throws Exception {
        ObjectReader reader = mapper.reader();
        JsonNode node = mapper.readTree("{\"a\":1}");
        JsonParser p = reader.treeAsTokens(node);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
    }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testReadValueSimpleString / testReadValueInteger | `_bind`: token ปกติ, `_unwrapRoot==false`, `valueToUpdate==null` → `deser.deserialize(p,ctxt)` |
| testReadValueEmptyInputThrows | `_initForReading`: `t==null` หลัง `nextToken()` → throw `JsonMappingException` |
| testReadValueNullTokenWithoutValueToUpdate | `_bind`: `t==VALUE_NULL`, `valueToUpdate==null` → `getNullValue` |
| testReadValueNullTokenWithValueToUpdate | `_bind`: `t==VALUE_NULL`, `valueToUpdate!=null` → return valueToUpdate |
| testReadValueEndArrayBranch | `_bind`: `t==END_ARRAY` |
| testReadValueEndObjectBranch | `_bind`: `t==END_OBJECT` |
| testReadValueWithoutTypeThrows | `_findRootDeserializer`: `t==null` → throw |
| testWithValueToUpdateNullThrows | `withValueToUpdate`: `value==null` → throw |
| testWithValueToUpdateSameInstanceReturnsThis | `withValueToUpdate`: `value==_valueToUpdate` → return this |
| testWithValueToUpdateNewValueCreatesDifferentInstance | `withValueToUpdate`: `_valueType==null` branch (คำนวณ type จาก value.getClass()) |
| testConstructorArrayValueToUpdateThrows | ctor: `valueToUpdate!=null && valueType.isArrayType()` → throw |
| testForTypeSameTypeReturnsThis / testForTypeDifferentTypeReturnsNew | `forType`: equals branch true/false |
| testForTypeTypeReference | `forType(TypeReference)` delegate |
| testWithSameFactoryReturnsThis / testWithDifferentFactoryReturnsNew | `with(JsonFactory)`: `f==_parserFactory` true/false |
| testWithSameSchemaReturnsThis / testWithIncompatibleSchemaThrows | `with(FormatSchema)`: `schema==_schema`; `_verifySchemaType` throw branch |
| testWithConfigSameReturnsThis | `_with`: `newConfig==_config` → return this |
| testWithDeserializationFeature / testWithoutDeserializationFeature / testWithFeaturesArray / testWithoutFeaturesArray | feature enable/disable (single & array) |
| testWithJsonParserFeature / testWithoutJsonParserFeature | `JsonParser.Feature` with/without |
| testPrefetchDisabledStillWorksLazily | `_prefetchRootDeserializer`: feature disabled → return null branch |
| testFindRootDeserializerCacheHitBranch | `_findRootDeserializer`: cache miss then cache hit |
| testWithRootNameAndUnwrapSuccess | `_unwrapAndDeserialize`: success path (matched name, END_OBJECT) |
| testUnwrapRootNameMismatchThrows | ชื่อ field ไม่ตรง → throw |
| testUnwrapRootNotStartObjectThrows | token แรกไม่ใช่ START_OBJECT → throw |
| testWithoutRootNameDoesNotThrow | `withoutRootName` delegate |
| testReadTreeFromString / testReadTreeNullInput / testReadTreeCacheHitBranch | `_bindAsTree`: ปกติ, VALUE_NULL, cache hit/miss ของ tree deserializer |
| testReadTreeFromInputStream / testReadTreeFromReader | readTree overload ต่าง source |
| testWriteTreeThrowsUnsupported / testWriteValueThrowsUnsupported | Unsupported methods |
| testReadValueFrom(InputStream/Reader/ByteArray/OffsetLength/File/URL/JsonNode) | readValue overloads เส้นทางไม่ detect format |
| testReadValueParserWith(Class/TypeReference/JavaType/ResolvedType) | overload readValue(JsonParser, X) |
| testReadValuesParserWith(Class/TypeReference/ResolvedType) | overload readValues(JsonParser, X) |
| testReadValuesUnwrappedFromString / testReadValuesWrappedFromParser | sequence unwrap/wrap เงื่อนไข parser position |
| testReadValuesFromInputStream / testReadValuesFromFile | readValues overload อื่น ๆ |
| testWithFormatDetectionMatchSuccess / testWithFormatDetectionNoMatchThrows | `_detectBindAndClose`: match/no-match branch |
| testReadValueReaderWithFormatDetectionThrows / testReadValueStringWithFormatDetectionThrows | `_reportUndetectableSource` branch |
| testReadValueFileWithFormatDetection | `_detectBindAndClose` forceClosing branch |
| testReadTreeWithFormatDetectionSuccess / testReadTreeWithFormatDetectionNoMatchThrows | `_detectBindAndCloseAsTree` match/no-match |
| testReadValuesInputStreamWithFormatDetection / testReadValuesByteArrayWithFormatDetection | `_detectBindAndReadValues` |
| testAtStringPointerFilter / testAtJsonPointerFilter | `_considerFilter`: filter != null branch, `at(String)/at(JsonPointer)` |
| testIsEnabled* / testGetTypeFactoryNotNull / testGetAttributesNotNull | simple accessor coverage |
| testGetInjectableValuesDefaultNull / testWithInjectableValuesSameReturnsThis / testWithInjectableValuesDifferentReturnsNew | `with(InjectableValues)` equality branch |
| testTreeToValue | `treeToValue` normal path |
| testVersionNotNull / testCreateArrayNode / testCreateObjectNode / testTreeAsTokens | TreeCodec/Versioned coverage |

**ข้อจำกัดที่ระบุไว้ (ตามข้อกำหนด #4):**
- `with(FormatFeature)`/`withFeatures(FormatFeature...)` — ไม่ทดสอบ เพราะไม่มี concrete `FormatFeature` implementation ที่ปลอดภัยใน classpath ที่กำหนด
- `with(FormatSchema)` branch ที่ schema ใช้งานได้จริง (ไม่ throw) — ไม่ทดสอบ เพราะ `JsonFactory` มาตรฐานของ JSON คืนค่า `canUseSchema()==false` เสมอ และไม่มี module อื่น (CSV/Avro) ในคลาสพาธ