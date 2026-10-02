# ObjectReaderTest.java

หมายเหตุก่อนเริ่ม: เนื่องจาก `ObjectReader` มี constructor เป็น `protected` และต้องพึ่งพา `ObjectMapper` ในการสร้าง instance จริง จึงเลือกใช้วิธี **black-box testing ผ่าน public API** โดยใช้ `ObjectMapper().reader()` เป็นจุดเริ่มต้น เพื่อให้ครอบคลุม branch ต่าง ๆ ของ fluent methods, read methods, และ internal binding logic (ผ่านการเรียกใช้จริงแทนการ mock ซึ่งจะซับซ้อนเกินไปสำหรับ IO/Parser chain)

จุดที่ไม่แน่ใจ behavior หรือทดสอบได้ยากในสภาพแวดล้อมที่มีเฉพาะ jackson-core/databind (ไม่มี multi-format module เช่น smile/cbor) จะมีคอมเมนต์กำกับไว้และ**ไม่เดา** behavior

```java
package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.*;
import java.net.URL;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class ObjectReaderTest {

    private ObjectMapper mapper;
    private ObjectReader READER;

    static class SimpleBean {
        public String value;
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        READER = mapper.reader();
    }

    /* ============================================================
     * DeserializationFeature fluent methods
     * ============================================================ */

    @Test
    public void testWithDeserializationFeature() {
        ObjectReader r = READER.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithDeserializationFeatures_varargs() {
        ObjectReader r = READER.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(r.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testWithFeaturesArray_deser() {
        ObjectReader r = READER.withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutDeserializationFeature() {
        ObjectReader base = READER.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader r = base.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutDeserializationFeatures_varargs() {
        ObjectReader base = READER.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader r = base.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertFalse(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(r.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testWithoutFeaturesArray_deser() {
        ObjectReader base = READER.withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader r = base.withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    /* ============================================================
     * JsonParser.Feature fluent methods
     * ============================================================ */

    @Test
    public void testWithJsonParserFeature() {
        ObjectReader r = READER.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(r.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithFeaturesArray_parser() {
        ObjectReader r = READER.withFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(r.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutJsonParserFeature() {
        ObjectReader base = READER.with(JsonParser.Feature.ALLOW_COMMENTS);
        ObjectReader r = base.without(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(r.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutFeaturesArray_parser() {
        ObjectReader base = READER.withFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        ObjectReader r = base.withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(r.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    /* ============================================================
     * Other fluent "with" methods
     * ============================================================ */

    @Test
    public void testWithDeserializationConfig() {
        DeserializationConfig cfg = READER.getConfig().with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader r = READER.with(cfg);
        assertTrue(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithSameConfig_returnsSameInstance() {
        ObjectReader r = READER.with(READER.getConfig());
        assertSame(READER, r);
    }

    @Test
    public void testWithConfigChange_propagatesFormatDetection() {
        // covers _with(): branch when _dataFormatReaders != null
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr);
        ObjectReader r2 = r.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithSameInjectableValues_returnsSame() {
        InjectableValues iv = new InjectableValues.Std();
        ObjectReader r1 = READER.with(iv);
        ObjectReader r2 = r1.with(iv);
        assertSame(r1, r2);
    }

    @Test
    public void testWithDifferentInjectableValues() {
        InjectableValues iv1 = new InjectableValues.Std();
        InjectableValues iv2 = new InjectableValues.Std();
        ObjectReader r1 = READER.with(iv1);
        ObjectReader r2 = r1.with(iv2);
        assertNotSame(r1, r2);
    }

    @Test
    public void testWithJsonNodeFactory() {
        JsonNodeFactory f = JsonNodeFactory.withExactBigDecimals(true);
        ObjectReader r = READER.with(f);
        assertNotNull(r);
    }

    @Test
    public void testWithSameJsonFactory_returnsSame() {
        JsonFactory f = READER.getFactory();
        ObjectReader r = READER.with(f);
        assertSame(READER, r);
    }

    @Test
    public void testWithDifferentJsonFactory() {
        JsonFactory f = new JsonFactory();
        ObjectReader r = READER.with(f);
        assertNotSame(READER, r);
        assertSame(f, r.getFactory());
    }

    @Test
    public void testWithRootName() {
        ObjectReader r = READER.withRootName("root");
        assertEquals("root", r.getConfig().getRootName());
    }

    @Test
    public void testWithSameSchema_bothNull_returnsSame() {
        ObjectReader r = READER.with((FormatSchema) null);
        assertSame(READER, r);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithInvalidSchemaType_throws() {
        FormatSchema fakeSchema = new FormatSchema() {
            @Override
            public String getSchemaType() {
                return "fake";
            }
        };
        READER.with(fakeSchema);
    }

    /* ============================================================
     * forType()/withType() family
     * ============================================================ */

    @Test
    public void testForTypeSameType_returnsSame() {
        ObjectReader r1 = READER.forType(String.class);
        ObjectReader r2 = r1.forType(r1.getConfig().constructType(String.class));
        assertSame(r1, r2);
    }

    @Test
    public void testForTypeDifferentType() {
        ObjectReader r1 = READER.forType(String.class);
        ObjectReader r2 = r1.forType(Integer.class);
        assertNotSame(r1, r2);
    }

    @Test
    public void testForTypeTypeReference() {
        ObjectReader r = READER.forType(new TypeReference<List<String>>() {});
        assertNotNull(r);
    }

    @Test
    public void testForType_withFormatDetection_propagatesType() throws IOException {
        // covers forType(): branch "if (det != null) det = det.withType(valueType)"
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(String.class);
        byte[] src = "\"abc\"".getBytes("UTF-8");
        String result = r.readValue(src);
        assertEquals("abc", result);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedWithType_JavaType() {
        JavaType t = READER.getConfig().constructType(String.class);
        assertNotNull(READER.withType(t));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedWithType_Class() {
        assertNotNull(READER.withType(String.class));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedWithType_ReflectType() {
        java.lang.reflect.Type t = String.class;
        assertNotNull(READER.withType(t));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedWithType_TypeReference() {
        assertNotNull(READER.withType(new TypeReference<String>() {}));
    }

    /* ============================================================
     * withValueToUpdate()
     * ============================================================ */

    @Test(expected = IllegalArgumentException.class)
    public void testWithValueToUpdate_null_throws() {
        READER.withValueToUpdate(null);
    }

    @Test
    public void testWithValueToUpdate_sameValue_returnsSame() {
        List<String> list = new ArrayList<String>();
        ObjectReader r1 = READER.withValueToUpdate(list);
        ObjectReader r2 = r1.withValueToUpdate(list);
        assertSame(r1, r2);
    }

    @Test
    public void testWithValueToUpdate_inferTypeFromValue() {
        // _valueType == null branch -> infer from value.getClass()
        List<String> list = new ArrayList<String>();
        ObjectReader r = READER.withValueToUpdate(list);
        assertNotNull(r);
    }

    @Test
    public void testWithValueToUpdate_existingType() {
        // _valueType != null branch
        List<String> list = new ArrayList<String>();
        ObjectReader typed = READER.forType(ArrayList.class);
        ObjectReader r = typed.withValueToUpdate(list);
        assertNotNull(r);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithValueToUpdate_arrayType_throws() {
        int[] arr = new int[] {1, 2, 3};
        READER.withValueToUpdate(arr);
    }

    /* ============================================================
     * withView / Locale / TimeZone / Handler / Base64
     * ============================================================ */

    @Test
    public void testWithView() {
        assertNotNull(READER.withView(Object.class));
    }

    @Test
    public void testWithLocale() {
        assertNotNull(READER.with(Locale.US));
    }

    @Test
    public void testWithTimeZone() {
        assertNotNull(READER.with(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testWithHandler() {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        assertNotNull(READER.withHandler(handler));
    }

    @Test
    public void testWithBase64Variant() {
        assertNotNull(READER.with(Base64Variants.MIME));
    }

    /* ============================================================
     * Format detection factory methods
     * ============================================================ */

    @Test
    public void testWithFormatDetection_varargs() {
        ObjectReader r = READER.withFormatDetection(mapper.reader());
        assertNotNull(r);
    }

    @Test
    public void testWithFormatDetection_dataFormatReaders() {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr);
        assertNotNull(r);
    }

    /* ============================================================
     * Context attributes
     * ============================================================ */

    @Test
    public void testWithContextAttributes() {
        assertNotNull(READER.with(ContextAttributes.getEmpty()));
    }

    @Test
    public void testWithAttributesMap() {
        Map<Object, Object> attrs = new HashMap<Object, Object>();
        attrs.put("k", "v");
        ObjectReader r = READER.withAttributes(attrs);
        assertEquals("v", r.getAttributes().getAttribute("k"));
    }

    @Test
    public void testWithAttribute() {
        ObjectReader r = READER.withAttribute("k", "v");
        assertEquals("v", r.getAttributes().getAttribute("k"));
    }

    @Test
    public void testWithoutAttribute() {
        ObjectReader r = READER.withAttribute("k", "v").withoutAttribute("k");
        assertNull(r.getAttributes().getAttribute("k"));
    }

    /* ============================================================
     * Simple accessors
     * ============================================================ */

    @Test
    public void testIsEnabledDeserializationFeature() {
        assertFalse(READER.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testIsEnabledMapperFeature() {
        assertTrue(READER.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testIsEnabledJsonParserFeature() {
        assertFalse(READER.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testGetConfig() {
        assertNotNull(READER.getConfig());
    }

    @Test
    public void testGetFactory() {
        assertNotNull(READER.getFactory());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetJsonFactoryDeprecated() {
        assertSame(READER.getFactory(), READER.getJsonFactory());
    }

    @Test
    public void testGetTypeFactory() {
        assertNotNull(READER.getTypeFactory());
    }

    @Test
    public void testGetAttributes() {
        assertNotNull(READER.getAttributes());
    }

    /* ============================================================
     * readValue(JsonParser, ...) family
     * ============================================================ */

    @Test
    public void testReadValue_JsonParser() throws IOException {
        JsonParser p = mapper.getFactory().createParser("\"hello\"");
        String result = READER.forType(String.class).readValue(p);
        assertEquals("hello", result);
        p.close();
    }

    @Test
    public void testReadValue_JsonParser_Class() throws IOException {
        JsonParser p = mapper.getFactory().createParser("123");
        Integer result = READER.readValue(p, Integer.class);
        assertEquals(Integer.valueOf(123), result);
        p.close();
    }

    @Test
    public void testReadValue_JsonParser_TypeReference() throws IOException {
        JsonParser p = mapper.getFactory().createParser("[\"a\",\"b\"]");
        List<String> result = READER.readValue(p, new TypeReference<List<String>>() {});
        assertEquals(Arrays.asList("a", "b"), result);
        p.close();
    }

    @Test
    public void testReadValue_JsonParser_JavaType() throws IOException {
        JsonParser p = mapper.getFactory().createParser("\"hi\"");
        JavaType t = READER.getTypeFactory().constructType(String.class);
        String result = READER.readValue(p, t);
        assertEquals("hi", result);
        p.close();
    }

    @Test
    public void testReadValues_JsonParser_Class() throws IOException {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        Iterator<Integer> it = READER.readValues(p, Integer.class);
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(1), it.next());
        p.close();
    }

    @Test
    public void testReadValues_JsonParser_TypeReference() throws IOException {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        Iterator<Integer> it = READER.readValues(p, new TypeReference<Integer>() {});
        assertTrue(it.hasNext());
        p.close();
    }

    @Test
    public void testReadValues_JsonParser_JavaType() throws IOException {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        JavaType t = READER.getTypeFactory().constructType(Integer.class);
        Iterator<Integer> it = READER.readValues(p, t);
        assertTrue(it.hasNext());
        p.close();
    }

    /* ============================================================
     * Tree / TreeCodec methods
     * ============================================================ */

    @Test
    public void testCreateArrayNode() {
        assertTrue(READER.createArrayNode().isArray());
    }

    @Test
    public void testCreateObjectNode() {
        assertTrue(READER.createObjectNode().isObject());
    }

    @Test
    public void testTreeAsTokens() throws IOException {
        JsonNode node = mapper.readTree("{\"a\":1}");
        assertNotNull(READER.treeAsTokens(node));
    }

    @Test
    public void testReadTree_JsonParser() throws IOException {
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        JsonNode n = READER.readTree(p);
        assertTrue(n.isObject());
        p.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteTree_throws() {
        READER.writeTree(null, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteValue_throws() throws IOException {
        READER.writeValue(null, null);
    }

    /* ============================================================
     * readValue(...) without format detection
     * ============================================================ */

    @Test
    public void testReadValue_InputStream() throws IOException {
        InputStream in = new ByteArrayInputStream("\"abc\"".getBytes("UTF-8"));
        assertEquals("abc", READER.forType(String.class).readValue(in));
    }

    @Test
    public void testReadValue_Reader() throws IOException {
        assertEquals("abc", READER.forType(String.class).readValue(new StringReader("\"abc\"")));
    }

    @Test
    public void testReadValue_String() throws IOException {
        assertEquals("abc", READER.forType(String.class).readValue("\"abc\""));
    }

    @Test
    public void testReadValue_ByteArray() throws IOException {
        byte[] src = "\"abc\"".getBytes("UTF-8");
        assertEquals("abc", READER.forType(String.class).readValue(src));
    }

    @Test
    public void testReadValue_ByteArray_OffsetLength() throws IOException {
        byte[] src = "XX\"abc\"YY".getBytes("UTF-8");
        assertEquals("abc", READER.forType(String.class).readValue(src, 2, 5));
    }

    @Test
    public void testReadValue_File() throws IOException {
        File tmp = writeTemp("\"abc\"");
        assertEquals("abc", READER.forType(String.class).readValue(tmp));
    }

    @Test
    public void testReadValue_URL() throws IOException {
        File tmp = writeTemp("\"abc\"");
        assertEquals("abc", READER.forType(String.class).readValue(tmp.toURI().toURL()));
    }

    @Test
    public void testReadValue_JsonNode() throws IOException {
        JsonNode node = mapper.readTree("\"abc\"");
        assertEquals("abc", READER.forType(String.class).readValue(node));
    }

    /* ============================================================
     * readValue(...) WITH format detection (Reader/String/JsonNode -> exception)
     * ============================================================ */

    @Test(expected = JsonProcessingException.class)
    public void testReadValue_Reader_withFormatDetection_throws() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        READER.withFormatDetection(dfr).readValue(new StringReader("\"abc\""));
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadValue_String_withFormatDetection_throws() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        READER.withFormatDetection(dfr).readValue("\"abc\"");
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadValue_JsonNode_withFormatDetection_throws() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        JsonNode node = mapper.readTree("\"abc\"");
        READER.withFormatDetection(dfr).readValue(node);
    }

    @Test
    public void testReadValue_InputStream_withFormatDetection() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(String.class);
        InputStream in = new ByteArrayInputStream("\"abc\"".getBytes("UTF-8"));
        assertEquals("abc", r.readValue(in));
    }

    @Test
    public void testReadValue_ByteArray_withFormatDetection() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(String.class);
        byte[] src = "\"abc\"".getBytes("UTF-8");
        assertEquals("abc", r.readValue(src));
    }

    @Test
    public void testReadValue_ByteArray_OffsetLength_withFormatDetection() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(String.class);
        byte[] src = "XX\"abc\"YY".getBytes("UTF-8");
        assertEquals("abc", r.readValue(src, 2, 5));
    }

    @Test
    public void testReadValue_File_withFormatDetection() throws IOException {
        File tmp = writeTemp("\"abc\"");
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(String.class);
        assertEquals("abc", r.readValue(tmp));
    }

    @Test
    public void testReadValue_URL_withFormatDetection() throws IOException {
        File tmp = writeTemp("\"abc\"");
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(String.class);
        assertEquals("abc", r.readValue(tmp.toURI().toURL()));
    }

    /* ============================================================
     * readTree(...)
     * ============================================================ */

    @Test
    public void testReadTree_InputStream() throws IOException {
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes("UTF-8"));
        assertTrue(READER.readTree(in).isObject());
    }

    @Test
    public void testReadTree_Reader() throws IOException {
        assertTrue(READER.readTree(new StringReader("{\"a\":1}")).isObject());
    }

    @Test
    public void testReadTree_String() throws IOException {
        assertTrue(READER.readTree("{\"a\":1}").isObject());
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadTree_Reader_withFormatDetection_throws() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        READER.withFormatDetection(dfr).readTree(new StringReader("{\"a\":1}"));
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadTree_String_withFormatDetection_throws() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        READER.withFormatDetection(dfr).readTree("{\"a\":1}");
    }

    @Test
    public void testReadTree_InputStream_withFormatDetection() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr);
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes("UTF-8"));
        assertTrue(r.readTree(in).isObject());
    }

    /* ============================================================
     * readValues(JsonParser) / readValues(...) sequence methods
     * ============================================================ */

    @Test
    public void testReadValues_JsonParser() throws IOException {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        p.nextToken();
        MappingIterator<Integer> it = READER.forType(Integer.class).readValues(p);
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(1), it.next());
        p.close();
    }

    @Test
    public void testReadValues_InputStream() throws IOException {
        InputStream in = new ByteArrayInputStream("1 2 3".getBytes("UTF-8"));
        MappingIterator<Integer> it = READER.forType(Integer.class).readValues(in);
        assertTrue(it.hasNext());
    }

    @Test
    public void testReadValues_InputStream_withFormatDetection() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(Integer.class);
        InputStream in = new ByteArrayInputStream("1 2 3".getBytes("UTF-8"));
        MappingIterator<Integer> it = r.readValues(in);
        assertTrue(it.hasNext());
    }

    @Test
    public void testReadValues_Reader() throws IOException {
        MappingIterator<Integer> it = READER.forType(Integer.class).readValues(new StringReader("1 2 3"));
        assertTrue(it.hasNext());
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadValues_Reader_withFormatDetection_throws() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(Integer.class);
        r.readValues(new StringReader("1 2 3"));
    }

    @Test
    public void testReadValues_String() throws IOException {
        MappingIterator<Integer> it = READER.forType(Integer.class).readValues("1 2 3");
        assertTrue(it.hasNext());
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadValues_String_withFormatDetection_throws() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(Integer.class);
        r.readValues("1 2 3");
    }

    @Test
    public void testReadValues_ByteArray_OffsetLength() throws IOException {
        byte[] src = "XX1 2 3YY".getBytes("UTF-8");
        MappingIterator<Integer> it = READER.forType(Integer.class).readValues(src, 2, 5);
        assertTrue(it.hasNext());
    }

    @Test
    public void testReadValues_ByteArray_OffsetLength_withFormatDetection() throws IOException {
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(Integer.class);
        byte[] src = "1 2 3".getBytes("UTF-8");
        MappingIterator<Integer> it = r.readValues(src, 0, src.length);
        assertTrue(it.hasNext());
    }

    @Test
    public void testReadValues_ByteArray() throws IOException {
        byte[] src = "1 2 3".getBytes("UTF-8");
        MappingIterator<Integer> it = READER.forType(Integer.class).readValues(src);
        assertTrue(it.hasNext());
    }

    @Test
    public void testReadValues_File() throws IOException {
        File tmp = writeTemp("1 2 3");
        MappingIterator<Integer> it = READER.forType(Integer.class).readValues(tmp);
        assertTrue(it.hasNext());
    }

    @Test
    public void testReadValues_File_withFormatDetection() throws IOException {
        File tmp = writeTemp("1 2 3");
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(Integer.class);
        MappingIterator<Integer> it = r.readValues(tmp);
        assertTrue(it.hasNext());
    }

    @Test
    public void testReadValues_URL() throws IOException {
        File tmp = writeTemp("1 2 3");
        MappingIterator<Integer> it = READER.forType(Integer.class).readValues(tmp.toURI().toURL());
        assertTrue(it.hasNext());
    }

    @Test
    public void testReadValues_URL_withFormatDetection() throws IOException {
        File tmp = writeTemp("1 2 3");
        DataFormatReaders dfr = new DataFormatReaders(mapper.reader());
        ObjectReader r = READER.withFormatDetection(dfr).forType(Integer.class);
        MappingIterator<Integer> it = r.readValues(tmp.toURI().toURL());
        assertTrue(it.hasNext());
    }

    /* ============================================================
     * treeToValue
     * ============================================================ */

    @Test
    public void testTreeToValue_success() throws IOException {
        JsonNode node = mapper.readTree("\"hello\"");
        assertEquals("hello", READER.treeToValue(node, String.class));
    }

    @Test(expected = JsonProcessingException.class)
    public void testTreeToValue_mismatchType_throwsJsonProcessingException() throws IOException {
        JsonNode node = mapper.readTree("{\"a\":1}");
        READER.treeToValue(node, Integer.class);
    }
    // NOTE: catch(IOException) -> IllegalArgumentException branch inside treeToValue
    // is not exercised: it would require a non-JsonProcessingException IOException from
    // an in-memory TreeTraversingParser, which is not achievable without further
    // internal mocking that is out of scope (avoiding guessed behavior per requirement #4).

    /* ============================================================
     * _bind / _bindAndClose branch coverage (VALUE_NULL / END_ARRAY / END_OBJECT / unwrap)
     * ============================================================ */

    @Test
    public void testBind_nullValue_noUpdate_returnsDeserializerNullValue() throws IOException {
        assertNull(READER.forType(String.class).readValue("null"));
    }

    @Test
    public void testBind_nullValue_withUpdate_returnsUpdateValue() throws IOException {
        List<String> list = new ArrayList<String>();
        Object result = READER.withValueToUpdate(list).readValue("null");
        assertSame(list, result);
    }

    @Test
    public void testBind_endArray_returnsValueToUpdate() throws IOException {
        JsonParser p = mapper.getFactory().createParser("[]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // END_ARRAY -> current token when _bind is called
        List<String> list = new ArrayList<String>();
        Object result = READER.withValueToUpdate(list).readValue(p);
        assertSame(list, result);
        p.close();
    }

    @Test
    public void testBind_endObject_returnsValueToUpdate() throws IOException {
        JsonParser p = mapper.getFactory().createParser("{}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // END_OBJECT -> current token when _bind is called
        List<String> list = new ArrayList<String>();
        Object result = READER.withValueToUpdate(list).readValue(p);
        assertSame(list, result);
        p.close();
    }

    @Test
    public void testBind_deserializeNewInstance_noUpdate() throws IOException {
        String result = READER.forType(String.class).readValue("\"plain\"");
        assertEquals("plain", result);
    }

    @Test
    public void testBind_deserializeIntoExistingValue_withUpdate() throws IOException {
        SimpleBean bean = new SimpleBean();
        ObjectReader r = mapper.reader().forType(SimpleBean.class).withValueToUpdate(bean);
        Object result = r.readValue("{\"value\":\"upd\"}");
        assertSame(bean, result);
        assertEquals("upd", bean.value);
    }

    @Test
    public void testBind_withRootUnwrapping_noUpdate() throws IOException {
        ObjectReader r = mapper.reader().forType(SimpleBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        SimpleBean bean = r.readValue("{\"SimpleBean\":{\"value\":\"x\"}}");
        assertEquals("x", bean.value);
    }

    @Test
    public void testBind_withRootUnwrapping_withUpdate() throws IOException {
        SimpleBean bean = new SimpleBean();
        ObjectReader r = mapper.reader().forType(SimpleBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withValueToUpdate(bean);
        Object result = r.readValue("{\"SimpleBean\":{\"value\":\"y\"}}");
        assertSame(bean, result);
        assertEquals("y", bean.value);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRoot_notStartObject_throws() throws IOException {
        ObjectReader r = mapper.reader().forType(SimpleBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        r.readValue("\"just a string\"");
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRoot_mismatchName_throws() throws IOException {
        ObjectReader r = mapper.reader().forType(SimpleBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        r.readValue("{\"WrongName\":{\"value\":\"x\"}}");
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapRoot_missingEndObject_throws() throws IOException {
        ObjectReader r = mapper.reader().forType(SimpleBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        r.readValue("{\"SimpleBean\":{\"value\":\"x\"},\"extra\":1}");
    }

    @Test(expected = JsonMappingException.class)
    public void testInitForReading_noContent_throws() throws IOException {
        READER.forType(String.class).readValue("");
    }

    /* ============================================================
     * _findRootDeserializer / _prefetchRootDeserializer
     * ============================================================ */

    @Test(expected = JsonMappingException.class)
    public void testFindRootDeserializer_noTypeConfigured_throws() throws IOException {
        JsonParser p = mapper.getFactory().createParser("\"abc\"");
        READER.readValue(p); // _valueType is null, _rootDeserializer is null
        p.close();
    }

    @Test
    public void testPrefetchRootDeserializer_eagerFetchEnabled() throws IOException {
        ObjectReader r = mapper.reader()
                .with(DeserializationFeature.EAGER_DESERIALIZER_FETCH)
                .forType(String.class);
        assertEquals("abc", r.readValue("\"abc\""));
    }

    @Test
    public void testPrefetchRootDeserializer_eagerFetchDisabled() throws IOException {
        ObjectReader r = mapper.reader()
                .without(DeserializationFeature.EAGER_DESERIALIZER_FETCH)
                .forType(String.class);
        assertEquals("abc", r.readValue("\"abc\""));
    }

    /* ============================================================
     * helpers
     * ============================================================ */

    private static File writeTemp(String content) throws IOException {
        File tmp = File.createTempFile("objectreadertest", ".json");
        tmp.deleteOnExit();
        FileWriter fw = new FileWriter(tmp);
        fw.write(content);
        fw.close();
        return tmp;
    }
}
```

# ตารางสรุปการครอบคลุม Branch/Condition (แบบย่อ)

| กลุ่มเทส | เมธอด/บรานช์ที่ครอบคลุมในซอร์ส |
|---|---|
| `testWith*DeserializationFeature*` | `with(feature)`, `with(first,other...)`, `withFeatures(...)`, `without(...)`, `without(first,other...)`, `withoutFeatures(...)` |
| `testWith*JsonParserFeature*` | `with(JsonParser.Feature)`, `withFeatures(...)`, `without(...)`, `withoutFeatures(...)` |
| `testWithDeserializationConfig`, `testWithSameConfig_returnsSameInstance` | `with(DeserializationConfig)`, `_with()` — branch `newConfig == _config` true/false |
| `testWithConfigChange_propagatesFormatDetection` | `_with()` — branch `_dataFormatReaders != null` |
| `testWithSameInjectableValues_returnsSame` / `testWithDifferentInjectableValues` | `with(InjectableValues)` — เงื่อนไข `_injectableValues == injectableValues` |
| `testWithJsonNodeFactory` | `with(JsonNodeFactory)` |
| `testWithSameJsonFactory_returnsSame` / `testWithDifferentJsonFactory` | `with(JsonFactory)` — เงื่อนไข `f == _parserFactory`, `f.getCodec()==null` |
| `testWithRootName` | `withRootName(String)` |
| `testWithSameSchema_bothNull_returnsSame` / `testWithInvalidSchemaType_throws` | `with(FormatSchema)` — เงื่อนไข `_schema == schema`, `_verifySchemaType` (`canUseSchema` false → throw) |
| `testForType*` | `forType(JavaType)` — `valueType != null && equals`, `det != null` branch, `forType(Class)`, `forType(TypeReference)` |
| `testDeprecatedWithType_*` | deprecated `withType(...)` overloads |
| `testWithValueToUpdate_*` | `withValueToUpdate` — null check, same value, `_valueType==null` infer, existing type, array type exception |
| `testWithView/Locale/TimeZone/Handler/Base64Variant` | fluent wrapper methods |
| `testWithFormatDetection_*` | `withFormatDetection(ObjectReader...)`, `withFormatDetection(DataFormatReaders)` |
| `testWithContextAttributes/Attributes*` | `with(ContextAttributes)`, `withAttributes`, `withAttribute`, `withoutAttribute` |
| `testIsEnabled*`, `testGet*` | accessor methods ทั้งหมด |
| `testReadValue_JsonParser*` / `testReadValues_JsonParser*` | `readValue(jp[,type])`, `readValues(jp,type)` overloads |
| `testCreateArrayNode/ObjectNode`, `testTreeAsTokens`, `testReadTree_JsonParser` | TreeCodec methods |
| `testWriteTree_throws`, `testWriteValue_throws` | `UnsupportedOperationException` branch |
| `testReadValue_InputStream/Reader/String/ByteArray*/File/URL/JsonNode` (ไม่มี format detection) | เงื่อนไข `_dataFormatReaders != null` = false ในแต่ละ overload |
| `testReadValue_*_withFormatDetection*` / `*_throws` | เงื่อนไข `_dataFormatReaders != null` = true; `_reportUndetectableSource` สำหรับ Reader/String/JsonNode |
| `testReadTree_*` (with/without detection) | `readTree(InputStream/Reader/String)` ทั้งสองสาขา |
| `testReadValues_*` (with/without detection) | `readValues(InputStream/Reader/String/byte[]/File/URL)` ทั้งสองสาขา |
| `testTreeToValue_success` / `_mismatchType_throwsJsonProcessingException` | `treeToValue` — try success, catch `JsonProcessingException` rethrow |
| `testBind_nullValue_*` | `_bind`: `t==VALUE_NULL` × (`valueToUpdate==null` / `!=null`) |
| `testBind_endArray_*` / `testBind_endObject_*` | `_bind`: เงื่อนไข `t==END_ARRAY \|\| t==END_OBJECT` ทั้งสองด้าน |
| `testBind_deserializeNewInstance_noUpdate` / `_withUpdate` | `_bind`: else-branch, `_unwrapRoot=false` × (`valueToUpdate==null`/`!=null`) |
| `testBind_withRootUnwrapping_*` | `_bind`: `_unwrapRoot=true`, `_unwrapAndDeserialize` (`_valueToUpdate==null`/`!=null`) |
| `testUnwrapRoot_notStartObject_throws` | `_unwrapAndDeserialize` — ตรวจ START_OBJECT ล้มเหลว |
| `testUnwrapRoot_mismatchName_throws` | ตรวจชื่อ root ไม่ตรง |
| `testUnwrapRoot_missingEndObject_throws` | ตรวจ END_OBJECT ปิดท้ายล้มเหลว |
| `testInitForReading_noContent_throws` | `_initForReading` — `t==null` หลัง `nextToken()` → throw |
| `testFindRootDeserializer_noTypeConfigured_throws` | `_findRootDeserializer` — `valueType==null` → throw |
| `testPrefetchRootDeserializer_eagerFetch*` | `_prefetchRootDeserializer` — `EAGER_DESERIALIZER_FETCH` enabled/disabled |

**ข้อจำกัดที่ระบุไว้ (ไม่เดา behavior):**
- Branch `catch (IOException e)` ภายใน `treeToValue` (ที่ไม่ใช่ `JsonProcessingException`) ไม่ได้ถูกทดสอบ เนื่องจากไม่มีวิธี trigger ได้อย่างสมเหตุสมผลจาก `TreeTraversingParser` โดยไม่ mock internal state
- Branch “ตรวจไม่พบ format ที่ตรงกัน” ใน `_reportUnkownFormat` (ผ่าน `DataFormatReaders.Match.hasMatch()==false`) ไม่ได้ทดสอบ เนื่องจาก classpath มีเพียง JSON factory เดียว ทำให้ไม่สามารถจำลองสถานการณ์ตรวจจับ format ล้มเหลวได้อย่างน่าเชื่อถือ