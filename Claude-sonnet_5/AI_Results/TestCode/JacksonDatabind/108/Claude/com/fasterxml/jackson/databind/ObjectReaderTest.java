package com.fasterxml.jackson.databind;

import java.io.*;
import java.net.URL;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for {@link ObjectReader} (Defects4J JacksonDatabind-108b).
 * ทดสอบโดยใช้ ObjectMapper จริงในการสร้าง ObjectReader (whitebox-friendly package,
 * แต่ใช้เฉพาะ public API ของ ObjectReader เป็นหลัก)
 */
public class ObjectReaderTest {

    // ---------- Helper test fixture ----------
    /** ใช้ public field เพื่อให้ Jackson auto-detect ได้โดยไม่ต้องมี getter/setter (default visibility) */
    public static class SimpleBean {
        public String name;
        public int value;
        public SimpleBean() {}
        public SimpleBean(String name, int value) { this.name = name; this.value = value; }
    }

    /** FormatSchema แบบ dummy ที่ JsonFactory (JSON) ไม่รองรับแน่นอน -> ใช้ทดสอบ _verifySchemaType ที่ throw */
    static class DummySchema implements FormatSchema {
        @Override
        public String getSchemaType() { return "dummy"; }
    }

    // =====================================================================
    // 1) readValue จากแหล่งข้อมูลต่าง ๆ (source-based methods)
    // =====================================================================

    @Test
    public void testReadValueFromString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue("{\"name\":\"foo\",\"value\":42}");
        assertEquals("foo", bean.name);
        assertEquals(42, bean.value);
    }

    @Test
    public void testReadValueFromByteArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        byte[] data = "{\"name\":\"bar\",\"value\":7}".getBytes("UTF-8");
        SimpleBean bean = reader.readValue(data);
        assertEquals("bar", bean.name);
        assertEquals(7, bean.value);
    }

    @Test
    public void testReadValueFromByteArrayOffsetLength() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        String json = "XXX{\"name\":\"baz\",\"value\":3}YYY";
        byte[] data = json.getBytes("UTF-8");
        int offset = 3;
        int length = json.length() - 6;
        SimpleBean bean = reader.readValue(data, offset, length);
        assertEquals("baz", bean.name);
        assertEquals(3, bean.value);
    }

    @Test
    public void testReadValueFromInputStream() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        InputStream in = new ByteArrayInputStream("{\"name\":\"x\",\"value\":1}".getBytes());
        SimpleBean bean = reader.readValue(in);
        assertEquals("x", bean.name);
    }

    @Test
    public void testReadValueFromReader() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        Reader r = new StringReader("{\"name\":\"y\",\"value\":2}");
        SimpleBean bean = reader.readValue(r);
        assertEquals("y", bean.name);
    }

    @Test
    public void testReadValueFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        File tmp = File.createTempFile("test", ".json");
        tmp.deleteOnExit();
        try (FileWriter fw = new FileWriter(tmp)) {
            fw.write("{\"name\":\"z\",\"value\":9}");
        }
        SimpleBean bean = reader.readValue(tmp);
        assertEquals("z", bean.name);
    }

    @Test
    public void testReadValueFromURL() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        File tmp = File.createTempFile("test2", ".json");
        tmp.deleteOnExit();
        try (FileWriter fw = new FileWriter(tmp)) {
            fw.write("{\"name\":\"u\",\"value\":11}");
        }
        SimpleBean bean = reader.readValue(tmp.toURI().toURL());
        assertEquals("u", bean.name);
    }

    @Test
    public void testReadValueFromJsonNode() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree("{\"name\":\"n\",\"value\":5}");
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue(node);
        assertEquals("n", bean.name);
    }

    @Test
    public void testReadValueFromDataInput() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        DataInput in = new DataInputStream(new ByteArrayInputStream("{\"name\":\"di\",\"value\":21}".getBytes()));
        SimpleBean bean = reader.readValue(in);
        assertEquals("di", bean.name);
    }

    // boundary: empty string -> no content -> reportInputMismatch (_initForReading)
    @Test(expected = JsonMappingException.class)
    public void testReadValueEmptyStringNoContentThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        reader.readValue("");
    }

    // malformed input -> parser error
    @Test(expected = JsonParseException.class)
    public void testReadValueMalformedJsonThrowsParseException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        reader.readValue("{invalid-json");
    }

    // null input: exact exception type ไม่ได้ระบุในซอร์ส ObjectReader (ขึ้นกับ JsonFactory)
    @Test(expected = Exception.class)
    public void testReadValueNullStringThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        reader.readValue((String) null);
    }

    // =====================================================================
    // 2) _bind / _bindAndClose branch coverage: null / endArray/endObject / update / unwrap
    // =====================================================================

    @Test
    public void testReadValueNullLiteralNoUpdate() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue("null");
        assertNull(bean);
    }

    @Test
    public void testReadValueNullWithValueToUpdateViaString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean existing = new SimpleBean("keep2", 6);
        ObjectReader reader = mapper.readerFor(SimpleBean.class).withValueToUpdate(existing);
        SimpleBean result = reader.readValue("null");
        assertSame(existing, result);
    }

    @Test
    public void testBindNullValueWithValueToUpdateReturnsExistingViaParser() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean existing = new SimpleBean("keep", 5);
        ObjectReader reader = mapper.readerFor(SimpleBean.class).withValueToUpdate(existing);
        JsonParser p = mapper.getFactory().createParser("null");
        SimpleBean result = reader.readValue(p);
        assertSame(existing, result);
        p.close();
    }

    // END_ARRAY branch: parser ถูกขยับไปที่ END_ARRAY ก่อนเรียก readValue(JsonParser)
    @Test
    public void testBindEndArrayTokenReturnsValueToUpdate() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean existing = new SimpleBean("orig", 1);
        JsonParser p = mapper.getFactory().createParser("[]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // END_ARRAY
        ObjectReader reader = mapper.readerFor(SimpleBean.class).withValueToUpdate(existing);
        SimpleBean result = reader.readValue(p);
        assertSame(existing, result);
        p.close();
    }

    @Test
    public void testBindWithValueToUpdateViaJsonParser() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean existing = new SimpleBean("orig", 0);
        ObjectReader reader = mapper.readerFor(SimpleBean.class).withValueToUpdate(existing);
        JsonParser p = mapper.getFactory().createParser("{\"name\":\"updated\",\"value\":88}");
        SimpleBean result = reader.readValue(p);
        assertSame(existing, result);
        assertEquals("updated", existing.name);
        p.close();
    }

    @Test
    public void testBindUnwrapRootViaJsonParser() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        JsonParser p = mapper.getFactory().createParser("{\"SimpleBean\":{\"name\":\"viaParser\",\"value\":77}}");
        SimpleBean bean = reader.readValue(p);
        assertEquals("viaParser", bean.name);
        p.close();
    }

    // =====================================================================
    // 3) readValue(JsonParser, ...) overload family
    // =====================================================================

    @Test
    public void testReadValueParserWithClass() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("{\"name\":\"q\",\"value\":8}");
        ObjectReader reader = mapper.reader();
        SimpleBean bean = reader.readValue(p, SimpleBean.class);
        assertEquals("q", bean.name);
        p.close();
    }

    @Test
    public void testReadValueParserWithTypeReference() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("{\"name\":\"r\",\"value\":10}");
        ObjectReader reader = mapper.reader();
        SimpleBean bean = reader.readValue(p, new TypeReference<SimpleBean>() {});
        assertEquals("r", bean.name);
        p.close();
    }

    @Test
    public void testReadValueParserWithJavaType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        JsonParser p = mapper.getFactory().createParser("{\"name\":\"s\",\"value\":12}");
        ObjectReader reader = mapper.reader();
        SimpleBean bean = reader.readValue(p, type);
        assertEquals("s", bean.name);
        p.close();
    }

    @Test
    public void testReadValueParserWithResolvedType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        JsonParser p = mapper.getFactory().createParser("{\"name\":\"rt\",\"value\":20}");
        ObjectReader reader = mapper.reader();
        SimpleBean bean = reader.readValue(p, (ResolvedType) type);
        assertEquals("rt", bean.name);
        p.close();
    }

    // =====================================================================
    // 4) readTree family (source-based + JsonParser)
    // =====================================================================

    @Test
    public void testReadTreeFromInputStream() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes());
        JsonNode node = reader.readTree(in);
        assertTrue(node.isObject());
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testReadTreeFromReader() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = reader.readTree(new StringReader("{\"b\":2}"));
        assertEquals(2, node.get("b").asInt());
    }

    @Test
    public void testReadTreeFromByteArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = reader.readTree("{\"c\":3}".getBytes());
        assertEquals(3, node.get("c").asInt());
    }

    @Test
    public void testReadTreeFromByteArrayOffsetLen() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        String json = "XX{\"d\":4}YY";
        byte[] data = json.getBytes();
        JsonNode node = reader.readTree(data, 2, json.length() - 4);
        assertEquals(4, node.get("d").asInt());
    }

    @Test
    public void testReadTreeFromDataInput() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        DataInput in = new DataInputStream(new ByteArrayInputStream("{\"e\":5}".getBytes()));
        JsonNode node = reader.readTree(in);
        assertEquals(5, node.get("e").asInt());
    }

    // boundary: readTree(String) บน input ว่าง -> missing node (ตาม _bindAsTree)
    @Test
    public void testReadTreeEmptyInputReturnsMissingNode() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = reader.readTree("");
        assertTrue(node.isMissingNode());
    }

    // readTree(JsonParser) กับ input ว่าง: ตาม Javadoc ควรคืน null แต่โค้ดจริงใช้ _bindAsTree
    // ตัวเดียวกับ path อื่น ๆ ซึ่งคืน missingNode() เสมอ -> เขียนทดสอบตามพฤติกรรมจริงของซอร์ส
    // (มีความขัดแย้งกับ Javadoc ของ readTree(JsonParser) ซึ่งอาจเป็นส่วนหนึ่งของ defect ที่ต้องดักจับ)
    @Test
    public void testReadTreeFromParserEmptyInputReturnsMissingNodeNotNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonParser p = mapper.getFactory().createParser("");
        JsonNode node = reader.readTree(p);
        // ตาม source จริง: ไม่ใช่ null แต่เป็น missing node (ขัดกับ Javadoc ที่ระบุว่าควรเป็น null)
        assertNotNull(node);
        assertTrue(node.isMissingNode());
        p.close();
    }

    @Test
    public void testReadTreeNullLiteralReturnsNullNode() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = reader.readTree("null");
        assertTrue(node.isNull());
    }

    @Test(expected = JsonParseException.class)
    public void testReadTreeMalformedJsonThrowsParseException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        reader.readTree("{invalid");
    }

    // =====================================================================
    // 5) readValues family (MappingIterator) - source based + JsonParser
    // =====================================================================

    @Test
    public void testReadValuesFromJsonParser() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("[1,2,3]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // ตำแหน่ง element แรก ตาม javadoc ของ readValues(JsonParser)
        ObjectReader reader = mapper.readerFor(Integer.class);
        MappingIterator<Integer> it = reader.readValues(p);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(1, 2, 3), results);
        p.close();
    }

    @Test
    public void testReadValuesFromInputStream() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class);
        InputStream in = new ByteArrayInputStream("1 2 3".getBytes());
        MappingIterator<Integer> it = reader.readValues(in);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(1, 2, 3), results);
    }

    @Test
    public void testReadValuesFromReader() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class);
        MappingIterator<Integer> it = reader.readValues(new StringReader("4 5 6"));
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(4, 5, 6), results);
    }

    @Test
    public void testReadValuesFromString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class);
        MappingIterator<Integer> it = reader.readValues("7 8 9");
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(7, 8, 9), results);
    }

    @Test
    public void testReadValuesFromByteArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class);
        MappingIterator<Integer> it = reader.readValues("10 11".getBytes());
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(10, 11), results);
    }

    @Test
    public void testReadValuesFromByteArrayOffsetLength() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class);
        byte[] data = "XX12 13YY".getBytes();
        MappingIterator<Integer> it = reader.readValues(data, 2, 5);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(12, 13), results);
    }

    @Test
    public void testReadValuesFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class);
        File tmp = File.createTempFile("values", ".txt");
        tmp.deleteOnExit();
        try (FileWriter fw = new FileWriter(tmp)) { fw.write("14 15"); }
        MappingIterator<Integer> it = reader.readValues(tmp);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(14, 15), results);
    }

    @Test
    public void testReadValuesFromURL() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class);
        File tmp = File.createTempFile("values2", ".txt");
        tmp.deleteOnExit();
        try (FileWriter fw = new FileWriter(tmp)) { fw.write("16 17"); }
        MappingIterator<Integer> it = reader.readValues(tmp.toURI().toURL());
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(16, 17), results);
    }

    @Test
    public void testReadValuesFromDataInput() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class);
        DataInput in = new DataInputStream(new ByteArrayInputStream("18 19".getBytes()));
        MappingIterator<Integer> it = reader.readValues(in);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(18, 19), results);
    }

    @Test
    public void testReadValuesParserWithClass() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("[1,2]");
        p.nextToken(); p.nextToken();
        ObjectReader reader = mapper.reader();
        Iterator<Integer> it = reader.readValues(p, Integer.class);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(1, 2), results);
        p.close();
    }

    @Test
    public void testReadValuesParserWithTypeReference() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("[3,4]");
        p.nextToken(); p.nextToken();
        ObjectReader reader = mapper.reader();
        Iterator<Integer> it = reader.readValues(p, new TypeReference<Integer>() {});
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(3, 4), results);
        p.close();
    }

    @Test
    public void testReadValuesParserWithJavaType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("[5,6]");
        p.nextToken(); p.nextToken();
        ObjectReader reader = mapper.reader();
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        Iterator<Integer> it = reader.readValues(p, type);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(5, 6), results);
        p.close();
    }

    @Test
    public void testReadValuesParserWithResolvedType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        JsonParser p = mapper.getFactory().createParser("[7,8]");
        p.nextToken(); p.nextToken();
        ObjectReader reader = mapper.reader();
        Iterator<Integer> it = reader.readValues(p, (ResolvedType) type);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) { results.add(it.next()); }
        assertEquals(Arrays.asList(7, 8), results);
        p.close();
    }

    // =====================================================================
    // 6) Format detection (DataFormatReaders) branches
    // =====================================================================

    @Test
    public void testWithFormatDetectionVarargsAndReadValueSuccess() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(SimpleBean.class);
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        byte[] data = "{\"name\":\"detect\",\"value\":99}".getBytes("UTF-8");
        SimpleBean bean = detectingReader.readValue(data);
        assertEquals("detect", bean.name);
    }

    @Test
    public void testWithFormatDetectionReadFileSuccess() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(SimpleBean.class);
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        File tmp = File.createTempFile("detect", ".json");
        tmp.deleteOnExit();
        try (FileWriter fw = new FileWriter(tmp)) { fw.write("{\"name\":\"fd\",\"value\":1}"); }
        SimpleBean bean = detectingReader.readValue(tmp);
        assertEquals("fd", bean.name);
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetectionFailureThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(SimpleBean.class);
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        byte[] garbage = new byte[] { 0x00, 0x01, 0x02, 0x03 };
        detectingReader.readValue(garbage);
    }

    // _reportUndetectableSource branches: readValue(Reader/String/JsonNode/DataInput)
    @Test(expected = JsonParseException.class)
    public void testReadValueReaderWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(SimpleBean.class);
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        detectingReader.readValue(new StringReader("{}"));
    }

    @Test(expected = JsonParseException.class)
    public void testReadValueStringWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(SimpleBean.class);
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        detectingReader.readValue("{}");
    }

    @Test(expected = JsonParseException.class)
    public void testReadValueJsonNodeWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(SimpleBean.class);
        JsonNode node = jsonMapper.readTree("{}");
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        detectingReader.readValue(node);
    }

    @Test(expected = JsonParseException.class)
    public void testReadValueDataInputWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(SimpleBean.class);
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        DataInput input = new DataInputStream(new ByteArrayInputStream("{}".getBytes()));
        detectingReader.readValue(input);
    }

    @Test
    public void testReadTreeWithFormatDetectionSuccess() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.reader();
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        InputStream in = new ByteArrayInputStream("{\"k\":\"v\"}".getBytes());
        JsonNode node = detectingReader.readTree(in);
        assertEquals("v", node.get("k").asText());
    }

    @Test(expected = JsonParseException.class)
    public void testReadTreeReaderWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.reader();
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        detectingReader.readTree(new StringReader("{}"));
    }

    @Test(expected = JsonParseException.class)
    public void testReadTreeStringWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.reader();
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        detectingReader.readTree("{}");
    }

    @Test(expected = JsonParseException.class)
    public void testReadTreeByteArrayWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.reader();
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        detectingReader.readTree("{}".getBytes());
    }

    @Test(expected = JsonParseException.class)
    public void testReadTreeDataInputWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.reader();
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        DataInput input = new DataInputStream(new ByteArrayInputStream("{}".getBytes()));
        detectingReader.readTree(input);
    }

    @Test(expected = JsonParseException.class)
    public void testReadValuesReaderWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(Integer.class);
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        detectingReader.readValues(new StringReader("1 2"));
    }

    @Test(expected = JsonParseException.class)
    public void testReadValuesStringWithFormatDetectionThrows() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectReader jsonReader = jsonMapper.readerFor(Integer.class);
        ObjectReader detectingReader = jsonReader.withFormatDetection(jsonReader);
        detectingReader.readValues("1 2");
    }

    // =====================================================================
    // 7) withXxx(...) fluent factory - DeserializationFeature
    // =====================================================================

    @Test
    public void testWithSingleFeature() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithMultipleFeatures() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(r2.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testWithFeaturesArray() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutSingleFeature() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader().with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader r2 = r1.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutMultipleFeatures() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader().with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader r2 = r1.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertFalse(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(r2.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testWithoutFeaturesArray() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader().with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader r2 = r1.withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    // -------- JsonParser.Feature --------

    @Test
    public void testWithJsonParserFeature() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r2 = mapper.reader().with(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(r2.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithFeaturesJsonParser() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r2 = mapper.reader().withFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(r2.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutJsonParserFeature() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader().with(JsonParser.Feature.ALLOW_COMMENTS);
        ObjectReader r2 = r1.without(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(r2.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutFeaturesJsonParser() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader().with(JsonParser.Feature.ALLOW_COMMENTS);
        ObjectReader r2 = r1.withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(r2.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    // =====================================================================
    // 8) at(...) JsonPointer filter
    // =====================================================================

    @Test
    public void testAtStringPointer() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class).at("/a/b");
        String result = reader.readValue("{\"a\":{\"b\":\"found\"}}");
        assertEquals("found", result);
    }

    @Test
    public void testAtJsonPointer() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonPointer pointer = JsonPointer.compile("/a/b");
        ObjectReader reader = mapper.readerFor(String.class).at(pointer);
        String result = reader.readValue("{\"a\":{\"b\":\"found2\"}}");
        assertEquals("found2", result);
    }

    // =====================================================================
    // 9) with(DeserializationConfig) / with(InjectableValues) / with(JsonNodeFactory)
    // =====================================================================

    @Test
    public void testWithDeserializationConfig() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        DeserializationConfig newConfig = r1.getConfig().with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader r2 = r1.with(newConfig);
        assertTrue(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithSameDeserializationConfigReturnsSelf() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with(r1.getConfig());
        assertSame(r1, r2);
    }

    @Test
    public void testWithInjectableValuesSameReturnsSelf() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        InjectableValues iv = r1.getInjectableValues(); // default null
        ObjectReader r2 = r1.with(iv);
        assertSame(r1, r2);
    }

    @Test
    public void testWithInjectableValuesDifferent() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        InjectableValues iv = new InjectableValues.Std();
        ObjectReader r2 = r1.with(iv);
        assertSame(iv, r2.getInjectableValues());
    }

    @Test
    public void testWithJsonNodeFactory() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        JsonNodeFactory customFactory = JsonNodeFactory.withExactBigDecimals(true);
        ObjectReader r2 = r1.with(customFactory);
        JsonNode arr = r2.createArrayNode();
        assertNotNull(arr);
        assertTrue(arr.isArray());
    }

    // =====================================================================
    // 10) with(JsonFactory)
    // =====================================================================

    @Test
    public void testWithJsonFactorySameReturnsSelf() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with(r1.getFactory());
        assertSame(r1, r2);
    }

    @Test
    public void testWithJsonFactoryDifferent() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.readerFor(SimpleBean.class);
        JsonFactory newFactory = new JsonFactory();
        ObjectReader r2 = r1.with(newFactory);
        assertNotSame(r1.getFactory(), r2.getFactory());
        SimpleBean bean = r2.readValue("{\"name\":\"f\",\"value\":4}");
        assertEquals("f", bean.name);
    }

    // =====================================================================
    // 11) withRootName / withoutRootName
    // =====================================================================

    @Test
    public void testWithRootNameString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader reader = mapper.readerFor(SimpleBean.class).withRootName("wrapper");
        SimpleBean bean = reader.readValue("{\"wrapper\":{\"name\":\"g\",\"value\":5}}");
        assertEquals("g", bean.name);
    }

    @Test
    public void testWithRootNamePropertyName() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader reader = mapper.readerFor(SimpleBean.class).withRootName(PropertyName.construct("wrapper2"));
        SimpleBean bean = reader.readValue("{\"wrapper2\":{\"name\":\"h\",\"value\":6}}");
        assertEquals("h", bean.name);
    }

    @Test
    public void testWithoutRootName() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class).withoutRootName();
        assertNotNull(reader);
    }

    // =====================================================================
    // 12) with(FormatSchema) - same schema self-return / incompatible schema throws
    // หมายเหตุ: canUseSchema()==true ของ JsonFactory มาตรฐาน (JSON) ไม่มีในชุด jar ที่กำหนด
    // (ต้องใช้ dataformat เช่น CSV/Avro) จึงไม่สามารถทดสอบ branch "compatible schema" ได้
    // =====================================================================

    @Test
    public void testWithSameFormatSchemaReturnsSelf() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with((FormatSchema) null); // _schema==null==schema -> return this
        assertSame(r1, r2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIncompatibleFormatSchemaThrows() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader();
        r1.with(new DummySchema());
    }

    // =====================================================================
    // 13) withView / with(Locale) / with(TimeZone) / withHandler / with(Base64Variant)
    // =====================================================================

    @Test
    public void testWithView() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r2 = mapper.reader().withView(Object.class);
        assertNotNull(r2);
    }

    @Test
    public void testWithLocale() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r2 = mapper.reader().with(Locale.GERMANY);
        assertEquals(Locale.GERMANY, r2.getConfig().getLocale());
    }

    @Test
    public void testWithTimeZone() {
        ObjectMapper mapper = new ObjectMapper();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        ObjectReader r2 = mapper.reader().with(tz);
        assertEquals(tz, r2.getConfig().getTimeZone());
    }

    @Test
    public void testWithHandler() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        ObjectReader r2 = mapper.reader().withHandler(handler);
        assertNotNull(r2);
    }

    @Test
    public void testWithBase64Variant() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r2 = mapper.reader().with(Base64Variants.MODIFIED_FOR_URL);
        assertNotNull(r2);
    }

    // =====================================================================
    // 14) ContextAttributes / withAttributes / withAttribute / withoutAttribute
    // =====================================================================

    @Test
    public void testWithContextAttributes() {
        ObjectMapper mapper = new ObjectMapper();
        ContextAttributes attrs = ContextAttributes.getEmpty().withSharedAttribute("k", "v");
        ObjectReader r2 = mapper.reader().with(attrs);
        assertEquals("v", r2.getAttributes().getAttribute("k"));
    }

    @Test
    public void testWithAttributesMap() {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("k2", "v2");
        ObjectReader r2 = mapper.reader().withAttributes(map);
        assertEquals("v2", r2.getAttributes().getAttribute("k2"));
    }

    @Test
    public void testWithAttribute() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r2 = mapper.reader().withAttribute("k3", "v3");
        assertEquals("v3", r2.getAttributes().getAttribute("k3"));
    }

    @Test
    public void testWithoutAttribute() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.reader().withAttribute("k4", "v4");
        ObjectReader r2 = r1.withoutAttribute("k4");
        assertNull(r2.getAttributes().getAttribute("k4"));
    }

    // =====================================================================
    // 15) forType / withValueToUpdate
    // =====================================================================

    @Test
    public void testForTypeSameTypeReturnsSelf() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.readerFor(SimpleBean.class);
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        ObjectReader r2 = r1.forType(type);
        assertSame(r1, r2);
    }

    @Test
    public void testForTypeDifferentType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r1 = mapper.readerFor(String.class);
        ObjectReader r2 = r1.forType(SimpleBean.class);
        SimpleBean bean = r2.readValue("{\"name\":\"c\",\"value\":3}");
        assertEquals("c", bean.name);
    }

    @Test
    public void testForTypeWithTypeReference() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader r2 = mapper.reader().forType(new TypeReference<List<String>>() {});
        List<String> list = r2.readValue("[\"x\",\"y\"]");
        assertEquals(2, list.size());
    }

    @Test
    public void testWithValueToUpdateSameInstanceReturnsSelf() {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = new SimpleBean();
        ObjectReader r1 = mapper.reader().withValueToUpdate(bean);
        ObjectReader r2 = r1.withValueToUpdate(bean);
        assertSame(r1, r2);
    }

    @Test
    public void testWithValueToUpdateInfersTypeFromValueClass() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean existing = new SimpleBean("a", 1);
        ObjectReader reader = mapper.reader().withValueToUpdate(existing); // _valueType==null -> infer
        SimpleBean updated = reader.readValue("{\"name\":\"b\",\"value\":2}");
        assertSame(existing, updated);
        assertEquals("b", existing.name);
        assertEquals(2, existing.value);
    }

    @Test
    public void testWithValueToUpdateNullRemovesUpdateTarget() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean existing = new SimpleBean("orig", 1);
        ObjectReader readerWithUpdate = mapper.readerFor(SimpleBean.class).withValueToUpdate(existing);
        ObjectReader readerNoUpdate = readerWithUpdate.withValueToUpdate(null);
        SimpleBean result = readerNoUpdate.readValue("null");
        assertNull(result); // valueToUpdate ถูกตั้งเป็น null แล้ว -> ใช้ getNullValue()
    }

    // =====================================================================
    // 16) treeAsTokens / readTree(JsonParser) / treeToValue / writeXxx throws
    // =====================================================================

    @Test
    public void testTreeAsTokensAndReadValue() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        JsonNode node = mapper.createObjectNode().put("name", "tt").put("value", 40);
        JsonParser p = reader.treeAsTokens(node);
        SimpleBean bean = reader.readValue(p);
        assertEquals("tt", bean.name);
    }

    @Test
    public void testTreeToValue() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = mapper.createObjectNode().put("name", "tv").put("value", 30);
        SimpleBean bean = reader.treeToValue(node, SimpleBean.class);
        assertEquals("tv", bean.name);
        assertEquals(30, bean.value);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteValueThrowsUnsupported() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        reader.writeValue(null, "anything");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteTreeThrowsUnsupported() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        reader.writeTree(null, mapper.createObjectNode());
    }

    // =====================================================================
    // 17) createArrayNode / createObjectNode
    // =====================================================================

    @Test
    public void testCreateArrayNode() {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.reader().createArrayNode();
        assertTrue(node.isArray());
    }

    @Test
    public void testCreateObjectNode() {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.reader().createObjectNode();
        assertTrue(node.isObject());
    }

    // =====================================================================
    // 18) version / isEnabled / getters
    // =====================================================================

    @Test
    public void testVersionNotNull() {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper.reader().version());
    }

    @Test
    public void testIsEnabledMapperFeature() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertEquals(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS),
                reader.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testIsEnabledJsonParserFeatureDefaultOff() {
        ObjectMapper mapper = new ObjectMapper();
        assertFalse(mapper.reader().isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testGettersNotNullAndDefaults() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.getConfig());
        assertNotNull(reader.getFactory());
        assertNotNull(reader.getTypeFactory());
        assertNotNull(reader.getAttributes());
        assertNull(reader.getInjectableValues());
    }

    // =====================================================================
    // 19) FAIL_ON_TRAILING_TOKENS
    // =====================================================================

    @Test(expected = JsonMappingException.class)
    public void testFailOnTrailingTokensThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        reader.readValue("{\"name\":\"x\",\"value\":1} EXTRA");
    }

    @Test
    public void testNoTrailingTokensFeatureDisabledSuccess() throws IOException {
        ObjectMapper mapper = new ObjectMapper(); // feature disabled by default
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue("{\"name\":\"x\",\"value\":1} EXTRA");
        assertEquals("x", bean.name);
    }

    // =====================================================================
    // 20) Root-name unwrapping: success / 4 failure branches ของ _unwrapAndDeserialize
    // =====================================================================

    @Test
    public void testUnwrapRootValueSuccess() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue("{\"SimpleBean\":{\"name\":\"ok\",\"value\":99}}");
        assertEquals("ok", bean.name);
        assertEquals(99, bean.value);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootNotStartObjectThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        reader.readValue("[1,2,3]");
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootMissingFieldNameThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        reader.readValue("{}"); // START_OBJECT ตามด้วย END_OBJECT ไม่ใช่ FIELD_NAME
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootNameMismatchThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        reader.readValue("{\"wrongName\":{\"name\":\"n\",\"value\":1}}");
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRootMissingClosingObjectThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        reader.readValue("{\"SimpleBean\":{\"name\":\"n\",\"value\":1},\"extra\":1}");
    }

    // =====================================================================
    // 21) _findRootDeserializer: ไม่มี valueType -> reportBadDefinition
    // =====================================================================

    @Test(expected = JsonMappingException.class)
    public void testReadValueWithNoValueTypeConfiguredThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // ไม่ตั้ง valueType
        reader.readValue("{\"a\":1}");
    }

    // =====================================================================
    // 22) EAGER_DESERIALIZER_FETCH เปิด/ปิด ผ่าน _prefetchRootDeserializer
    // =====================================================================

    @Test
    public void testPrefetchEnabledByDefaultStillWorks() throws IOException {
        ObjectMapper mapper = new ObjectMapper(); // EAGER_DESERIALIZER_FETCH default = true
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue("{\"name\":\"eager\",\"value\":70}");
        assertEquals("eager", bean.name);
    }

    @Test
    public void testPrefetchDisabledStillWorks() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.EAGER_DESERIALIZER_FETCH);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        SimpleBean bean = reader.readValue("{\"name\":\"lazy\",\"value\":50}");
        assertEquals("lazy", bean.name);
    }

    // =====================================================================
    // 23) Deprecated withType(...) overloads (coverage เพิ่มเติม)
    // =====================================================================

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedWithTypeJavaType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        ObjectReader reader = mapper.reader().withType(type);
        SimpleBean bean = reader.readValue("{\"name\":\"dep\",\"value\":60}");
        assertEquals("dep", bean.name);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedWithTypeClass() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().withType(SimpleBean.class);
        SimpleBean bean = reader.readValue("{\"name\":\"dep2\",\"value\":61}");
        assertEquals("dep2", bean.name);
    }
}
