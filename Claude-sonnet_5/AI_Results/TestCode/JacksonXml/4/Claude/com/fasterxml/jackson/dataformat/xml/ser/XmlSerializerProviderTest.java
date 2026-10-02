package com.fasterxml.jackson.dataformat.xml.ser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
// คลาสเป้าหมาย
import com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderTest
{
    // ---------- Test fixtures / helper types ----------

    public static class SimpleBean {
        public String name = "foo";
        public int value = 42;
    }

    public static class IOExceptionThrowingSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            throw new IOException("boom-io");
        }
    }

    public static class RuntimeExceptionThrowingSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            throw new IllegalStateException("boom-runtime");
        }
    }

    public static class NoMessageRuntimeExceptionSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            throw new RuntimeException(); // null message -> covers msg==null branch
        }
    }

    public static class MarkerSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString("MARKER_VALUE");
        }
    }

    @JsonSerialize(using = IOExceptionThrowingSerializer.class)
    public static class IoThrowingBean { }

    @JsonSerialize(using = RuntimeExceptionThrowingSerializer.class)
    public static class RuntimeThrowingBean { }

    @JsonSerialize(using = NoMessageRuntimeExceptionSerializer.class)
    public static class NoMessageThrowingBean { }

    private XmlMapper mapper;
    private XmlSerializerProvider blueprint;
    private DefaultSerializerProvider instance;

    @Before
    public void setUp() {
        mapper = new XmlMapper();
        blueprint = new XmlSerializerProvider(new XmlRootNameLookup());
        SerializationConfig config = mapper.getSerializationConfig();
        SerializerFactory factory = BeanSerializerFactory.instance;
        // instance ที่สร้างผ่าน createInstance จะมี cache/คอนฟิกพร้อมใช้งานจริง
        instance = blueprint.createInstance(config, factory);
    }

    private ToXmlGenerator createXmlGenerator(StringWriter sw) throws IOException {
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        return (ToXmlGenerator) g;
    }

    // ---------- 1) Constructor / createInstance ----------

    @Test
    public void testCreateInstanceReturnsNewXmlSerializerProviderInstance() {
        DefaultSerializerProvider created = blueprint.createInstance(
                mapper.getSerializationConfig(), BeanSerializerFactory.instance);
        assertNotNull(created);
        assertTrue(created instanceof XmlSerializerProvider);
        assertNotSame(blueprint, created);
    }

    // ---------- 2) serializeValue(gen, value) : null branch ----------

    @Test
    public void testSerializeValueOverload1_NullValue_UsesNullRootName() throws Exception {
        String xml = mapper.writeValueAsString(null);
        assertNotNull(xml);
        assertTrue(xml.toLowerCase().contains("null"));
    }

    // ---------- 3) serializeValue(gen, value) : xgen != null, rootName จาก lookup, asArray=false ----------

    @Test
    public void testSerializeValueOverload1_SimpleBean_DefaultRootNameFromLookup() throws Exception {
        String xml = mapper.writeValueAsString(new SimpleBean());
        assertTrue(xml.contains("foo"));
        assertTrue(xml.contains("42"));
    }

    @Test
    public void testSerializeValueOverload1_ScalarStringRoot() throws Exception {
        // boundary: scalar (ไม่ใช่ indexed type) เป็น root value
        String xml = mapper.writeValueAsString("hello");
        assertNotNull(xml);
        assertTrue(xml.contains("hello"));
    }

    // ---------- 4) serializeValue(gen, value) : asArray = true branch ----------

    @Test
    public void testSerializeValueOverload1_ListAsRootArray() throws Exception {
        List<String> list = Arrays.asList("a", "b", "c");
        String xml = mapper.writeValueAsString(list);
        assertTrue(xml.contains("item"));
    }

    @Test
    public void testSerializeValueOverload1_EmptyListAsRootArray() throws Exception {
        // boundary: list ว่าง -> ยัง asArray=true แต่ไม่มี element
        List<String> empty = Collections.emptyList();
        String xml = mapper.writeValueAsString(empty);
        assertNotNull(xml);
    }

    @Test
    public void testSerializeValueOverload1_PrimitiveArrayAsRootArray() throws Exception {
        int[] arr = {1, 2, 3};
        String xml = mapper.writeValueAsString(arr);
        assertTrue(xml.contains("item"));
    }

    // ---------- 5) exception handling: IOException ผ่านตรง / RuntimeException ถูก wrap ----------

    @Test(expected = IOException.class)
    public void testSerializeValueOverload1_PropagatesIOExceptionAsIs() throws Exception {
        mapper.writeValueAsString(new IoThrowingBean());
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValueOverload1_WrapsRuntimeExceptionAsJsonMappingException() throws Exception {
        mapper.writeValueAsString(new RuntimeThrowingBean());
    }

    @Test
    public void testSerializeValueOverload1_WrapsRuntimeExceptionWithNullMessage() throws Exception {
        try {
            mapper.writeValueAsString(new NoMessageThrowingBean());
            fail("ควรได้ JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("no message for"));
        }
    }

    // ---------- 6) xgen == null (TokenBuffer) branch สำหรับ overload แรก ----------

    @Test
    public void testSerializeValueOverload1_withTokenBufferGenerator_NotXmlGenerator() throws Exception {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        instance.serializeValue(buf, new SimpleBean());
        buf.close();
        // ไม่ throw exception แสดงว่า path xgen==null (asArray=false) ทำงานถูกต้อง
    }

    @Test
    public void testSerializeXmlNullBranch_viaTokenBuffer_NotInitRootName() throws Exception {
        // gen ไม่ใช่ ToXmlGenerator -> _serializeXmlNull ข้าม _initWithRootName
        TokenBuffer buf = new TokenBuffer(mapper, false);
        instance.serializeValue(buf, null);
        buf.close();
    }

    // ---------- 7) _rootNameFromConfig() branches ----------

    @Test
    public void testSerializeValue_withExplicitRootName_noNamespace() throws Exception {
        ObjectWriter writer = mapper.writer().withRootName("MyRoot");
        String xml = writer.writeValueAsString(new SimpleBean());
        assertTrue(xml.contains("MyRoot"));
    }

    @Test
    public void testSerializeValue_withExplicitRootName_emptyNamespace() throws Exception {
        PropertyName pname = new PropertyName("MyRoot2", "");
        ObjectWriter writer = mapper.writer().withRootName(pname);
        String xml = writer.writeValueAsString(new SimpleBean());
        assertTrue(xml.contains("MyRoot2"));
    }

    @Test
    public void testSerializeValue_withExplicitRootName_withNamespace() throws Exception {
        PropertyName pname = new PropertyName("MyRoot3", "urn:test:ns");
        ObjectWriter writer = mapper.writer().withRootName(pname);
        String xml = writer.writeValueAsString(new SimpleBean());
        assertTrue(xml.contains("MyRoot3"));
        assertTrue(xml.contains("urn:test:ns"));
    }

    // ---------- 8) serializeValue(gen, value, rootType) ----------

    @Test
    public void testSerializeValueOverload2_WithExplicitRootType() throws Exception {
        String xml = mapper.writerFor(SimpleBean.class).writeValueAsString(new SimpleBean());
        assertTrue(xml.contains("foo"));
    }

    @Test
    public void testSerializeValueOverload2_ArrayRootType_AsArrayBranch() throws Exception {
        String[] arr = {"x", "y"};
        String xml = mapper.writerFor(String[].class).writeValueAsString(arr);
        assertTrue(xml.contains("item"));
    }

    @Test
    public void testSerializeValueOverload2_NullValue() throws Exception {
        String xml = mapper.writerFor(SimpleBean.class).writeValueAsString(null);
        assertTrue(xml.toLowerCase().contains("null"));
    }

    @Test(expected = IOException.class)
    public void testSerializeValueOverload2_PropagatesIOException() throws Exception {
        mapper.writerFor(IoThrowingBean.class).writeValueAsString(new IoThrowingBean());
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValueOverload2_WrapsRuntimeException() throws Exception {
        mapper.writerFor(RuntimeThrowingBean.class).writeValueAsString(new RuntimeThrowingBean());
    }

    // ---------- 9) serializeValue(gen, value, rootType, ser) : ser==null / ser!=null ----------

    @Test
    public void testSerializeValueOverload3_NullSerializer_FindsOwnSerializer() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createXmlGenerator(sw);
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);

        instance.serializeValue(gen, new SimpleBean(), type, null);
        gen.close();

        assertTrue(sw.toString().contains("foo"));
    }

    @Test
    public void testSerializeValueOverload3_ExplicitSerializerIsUsedDirectly() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createXmlGenerator(sw);
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);

        instance.serializeValue(gen, new SimpleBean(), type, new MarkerSerializer());
        gen.close();

        String xml = sw.toString();
        assertTrue(xml.contains("MARKER_VALUE"));
        assertFalse(xml.contains("foo")); // ยืนยันว่าไม่ได้ไปเรียก findTypedValueSerializer
    }

    @Test(expected = IOException.class)
    public void testSerializeValueOverload3_PropagatesIOException() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createXmlGenerator(sw);
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        instance.serializeValue(gen, new SimpleBean(), type, new IOExceptionThrowingSerializer());
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValueOverload3_WrapsRuntimeException() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createXmlGenerator(sw);
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        instance.serializeValue(gen, new SimpleBean(), type, new RuntimeExceptionThrowingSerializer());
    }

    @Test
    public void testSerializeValueOverload3_NullValue() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createXmlGenerator(sw);
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);

        instance.serializeValue(gen, null, type, null);
        gen.close();

        assertTrue(sw.toString().toLowerCase().contains("null"));
    }

    @Test
    public void testSerializeValueOverload3_ArrayRootType_AsArrayBranch() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createXmlGenerator(sw);
        JavaType type = mapper.getTypeFactory().constructType(String[].class);

        instance.serializeValue(gen, new String[]{"p", "q"}, type, null);
        gen.close();

        assertTrue(sw.toString().contains("item"));
    }

    // ---------- 10) convertValue -> ใช้ TokenBuffer ภายใน (xgen==null) ----------

    @Test
    public void testConvertValue_RoundTrip_UsesTokenBufferGenerator() {
        SimpleBean bean = new SimpleBean();
        SimpleBean copy = mapper.convertValue(bean, SimpleBean.class);
        assertEquals(bean.name, copy.name);
        assertEquals(bean.value, copy.value);
    }

    @Test
    public void testConvertValue_NullValue() {
        SimpleBean result = mapper.convertValue(null, SimpleBean.class);
        assertNull(result);
    }

    // ---------- 11) _asXmlGenerator : gen ไม่ใช่ ToXmlGenerator และไม่ใช่ TokenBuffer -> throw ----------

    @Test(expected = JsonMappingException.class)
    public void testAsXmlGenerator_ThrowsForUnsupportedGeneratorType() throws Exception {
        JsonGenerator plainJsonGen = new JsonFactory().createGenerator(new StringWriter());
        instance.serializeValue(plainJsonGen, new SimpleBean());
    }
}
