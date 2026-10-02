package com.fasterxml.jackson.dataformat.xml.ser;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

/**
 * Test class ถูกทำให้ "extends XmlSerializerProvider" โดยเจตนา
 * เพื่อให้สามารถเรียก protected method ของคลาสเป้าหมายได้โดยตรง
 * ตามกฎการเข้าถึง protected member ข้าม package ของ Java (ผ่าน reference
 * ที่มี static type เป็น subclass เอง) โดยไม่ต้องใช้ reflection หรือ mocking library
 */
public class XmlSerializerProviderTest extends XmlSerializerProvider
{
    // ----- constructors -----

    /** JUnit ต้องการ public no-arg constructor สำหรับรัน test */
    public XmlSerializerProviderTest() {
        super(new XmlRootNameLookup());
    }

    /**
     * Constructor เสริม ใช้เพื่อสร้าง instance ที่มี _config ถูกตั้งค่าจริง
     * (ผ่าน constructor แบบ copy ของ superclass) สำหรับทดสอบ method ที่ต้องใช้ _config
     * เช่น _rootNameFromConfig(), _serializeXmlNull()
     */
    public XmlSerializerProviderTest(XmlSerializerProvider src,
            SerializationConfig config, SerializerFactory f) {
        super(src, config, f);
    }

    private XmlSerializerProviderTest configuredHelper(XmlMapper om) {
        SerializationConfig config = om.getSerializationConfig();
        return new XmlSerializerProviderTest(this, config, BeanSerializerFactory.instance);
    }

    static class SimpleBean {
        public String name = "foo";
        public int value = 42;
    }

    // =====================================================================
    // 1) High-level black-box tests ผ่าน XmlMapper (ใช้ public API เท่านั้น)
    // =====================================================================

    @Test
    public void testSerializeNullValueUsesDefaultRootName() throws IOException {
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writeValueAsString(null);
        assertNotNull(xml);
        // ROOT_NAME_FOR_NULL = new QName("null")
        assertTrue("expected default <null> root, got: " + xml, xml.contains("null"));
    }

    @Test
    public void testSerializeNullValueWithExplicitRootName() throws IOException {
        // [dataformat-xml#213]: ถ้ามีการตั้งค่า root name ไว้ ต้อง override ค่า default
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writer().withRootName("custom").writeValueAsString(null);
        assertTrue("expected <custom> root for null value, got: " + xml, xml.contains("custom"));
    }

    @Test
    public void testSerializeSimplePojoDefaultRootName() throws IOException {
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writeValueAsString(new SimpleBean());
        assertTrue(xml.contains("SimpleBean"));
        assertTrue(xml.contains("<name>foo</name>"));
    }

    @Test
    public void testSerializeWithExplicitRootNameOverridesLookup() throws IOException {
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writer().withRootName("myRoot").writeValueAsString(new SimpleBean());
        assertTrue(xml.contains("myRoot"));
    }

    @Test
    public void testSerializeArrayTypeUsesItemWrapper() throws IOException {
        // asArray == true branch -> TypeUtil.isIndexedType(cls) true สำหรับ List
        XmlMapper mapper = new XmlMapper();
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        String xml = mapper.writeValueAsString(list);
        assertTrue("expected 'item' wrapper element, got: " + xml, xml.contains("item"));
    }

    @Test
    public void testSerializeWithNamespaceSetsDefaultNamespace() throws IOException {
        // branch: ns != null && ns.length() > 0 ใน _initWithRootName
        XmlMapper mapper = new XmlMapper();
        PropertyName rootName = PropertyName.construct("root", "urn:test");
        String xml = mapper.writer().withRootName(rootName).writeValueAsString(new SimpleBean());
        assertTrue("expected namespace in output, got: " + xml, xml.contains("urn:test"));
    }

    @Test
    public void testConvertValueUsesTokenBufferPath() throws IOException {
        // convertValue() ภายในใช้ TokenBuffer เป็น generator -> _asXmlGenerator คืน null -> asArray=false
        XmlMapper mapper = new XmlMapper();
        SimpleBean bean = new SimpleBean();
        Map<?, ?> map = mapper.convertValue(bean, Map.class);
        assertEquals("foo", map.get("name"));
    }

    @Test
    public void testSerializeValueWithRootTypeOverload() throws IOException {
        // เพื่อ exercise overload serializeValue(gen, value, rootType, ser)
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writerFor(SimpleBean.class).writeValueAsString(new SimpleBean());
        assertTrue(xml.contains("<name>foo</name>"));
    }

    @Test
    public void testSerializeValueWithRootTypeOverloadNullValue() throws IOException {
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writerFor(SimpleBean.class).writeValueAsString(null);
        assertTrue(xml.contains("null"));
    }

    @Test
    public void testSerializeValueWithRootTypeOverloadArray() throws IOException {
        XmlMapper mapper = new XmlMapper();
        List<String> list = new ArrayList<String>();
        list.add("x");
        String xml = mapper.writerFor(new TypeReference<List<String>>() {})
                .writeValueAsString(list);
        assertTrue(xml.contains("item"));
    }

    // =====================================================================
    // 2) Constructor / copy / createInstance
    // =====================================================================

    @Test
    public void testCopyCreatesNewInstanceOfSameType() {
        DefaultSerializerProvider copy = this.copy();
        assertNotSame(this, copy);
        assertTrue(copy instanceof XmlSerializerProvider);
    }

    @Test
    public void testCreateInstanceReturnsNewXmlSerializerProvider() {
        XmlMapper om = new XmlMapper();
        SerializationConfig config = om.getSerializationConfig();
        DefaultSerializerProvider created = this.createInstance(config, BeanSerializerFactory.instance);
        assertNotSame(this, created);
        assertTrue(created instanceof XmlSerializerProvider);
    }

    // =====================================================================
    // 3) _asXmlGenerator(gen) : 3 branch (ToXmlGenerator / TokenBuffer / other-throws)
    // =====================================================================

    @Test
    public void test_asXmlGenerator_WithToXmlGenerator() throws Exception {
        XmlFactory factory = new XmlFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        try {
            ToXmlGenerator result = this._asXmlGenerator(gen);
            assertNotNull(result);
            assertSame(gen, result);
        } finally {
            try { gen.close(); } catch (Exception ignore) { /* ไม่เกี่ยวกับจุดทดสอบนี้ */ }
        }
    }

    @Test
    public void test_asXmlGenerator_WithTokenBuffer() throws Exception {
        TokenBuffer buffer = new TokenBuffer(new ObjectMapper(), false);
        try {
            ToXmlGenerator result = this._asXmlGenerator(buffer);
            assertNull(result); // ถูกใช้เมื่อเรียกผ่าน convertValue()
        } finally {
            buffer.close();
        }
    }

    @Test
    public void test_asXmlGenerator_WithOtherGeneratorThrows() throws Exception {
        JsonFactory plainFactory = new JsonFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = plainFactory.createGenerator(sw);
        try {
            this._asXmlGenerator(gen);
            fail("ควร throw JsonMappingException เมื่อ generator ไม่ใช่ ToXmlGenerator/TokenBuffer");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("XmlMapper does not with generators"));
        } finally {
            try { gen.close(); } catch (Exception ignore) {}
        }
    }

    // =====================================================================
    // 4) _wrapAsIOE(gen, e) : branch IOException-passthrough / wrap-with-message / wrap-null-message
    // =====================================================================

    @Test
    public void test_wrapAsIOE_PassesThroughIOException() throws Exception {
        XmlFactory factory = new XmlFactory();
        JsonGenerator gen = factory.createGenerator(new StringWriter());
        IOException original = new IOException("boom");
        IOException wrapped = this._wrapAsIOE(gen, original);
        assertSame(original, wrapped);
        try { gen.close(); } catch (Exception ignore) {}
    }

    @Test
    public void test_wrapAsIOE_WrapsRuntimeExceptionWithMessage() throws Exception {
        XmlFactory factory = new XmlFactory();
        JsonGenerator gen = factory.createGenerator(new StringWriter());
        RuntimeException re = new RuntimeException("custom-message");
        IOException wrapped = this._wrapAsIOE(gen, re);
        assertTrue(wrapped instanceof JsonMappingException);
        assertEquals("custom-message", wrapped.getMessage());
        try { gen.close(); } catch (Exception ignore) {}
    }

    @Test
    public void test_wrapAsIOE_WrapsExceptionWithNullMessage() throws Exception {
        XmlFactory factory = new XmlFactory();
        JsonGenerator gen = factory.createGenerator(new StringWriter());
        RuntimeException re = new RuntimeException((String) null);
        IOException wrapped = this._wrapAsIOE(gen, re);
        assertTrue(wrapped instanceof JsonMappingException);
        assertTrue(wrapped.getMessage().contains("no message for"));
        assertTrue(wrapped.getMessage().contains("RuntimeException"));
        try { gen.close(); } catch (Exception ignore) {}
    }

    // =====================================================================
    // 5) _rootNameFromConfig() : branch null / no-namespace / with-namespace / empty-namespace
    // =====================================================================

    @Test
    public void test_rootNameFromConfig_NullWhenNotConfigured() throws Exception {
        XmlMapper om = new XmlMapper();
        XmlSerializerProviderTest helper = configuredHelper(om);
        assertNull(helper._rootNameFromConfig());
    }

    @Test
    public void test_rootNameFromConfig_WithoutNamespace() throws Exception {
        XmlMapper om = new XmlMapper();
        ObjectWriter writer = om.writer().withRootName("abc");
        XmlSerializerProviderTest helper =
                new XmlSerializerProviderTest(this, writer.getConfig(), BeanSerializerFactory.instance);
        QName name = helper._rootNameFromConfig();
        assertNotNull(name);
        assertEquals("abc", name.getLocalPart());
        assertEquals("", name.getNamespaceURI());
    }

    @Test
    public void test_rootNameFromConfig_WithNamespace() throws Exception {
        XmlMapper om = new XmlMapper();
        PropertyName pn = PropertyName.construct("abc", "urn:ns");
        ObjectWriter writer = om.writer().withRootName(pn);
        XmlSerializerProviderTest helper =
                new XmlSerializerProviderTest(this, writer.getConfig(), BeanSerializerFactory.instance);
        QName name = helper._rootNameFromConfig();
        assertNotNull(name);
        assertEquals("abc", name.getLocalPart());
        assertEquals("urn:ns", name.getNamespaceURI());
    }

    @Test
    public void test_rootNameFromConfig_EmptyNamespaceTreatedAsNoNamespace() throws Exception {
        // แยกทดสอบ sub-condition ns.isEmpty() โดยเฉพาะ (ns != null แต่ว่าง)
        XmlMapper om = new XmlMapper();
        PropertyName pn = PropertyName.construct("abc", "");
        ObjectWriter writer = om.writer().withRootName(pn);
        XmlSerializerProviderTest helper =
                new XmlSerializerProviderTest(this, writer.getConfig(), BeanSerializerFactory.instance);
        QName name = helper._rootNameFromConfig();
        assertNotNull(name);
        assertEquals("abc", name.getLocalPart());
        assertEquals("", name.getNamespaceURI());
    }

    // =====================================================================
    // 6) _serializeXmlNull(jgen) : branch instanceof ToXmlGenerator / not
    // =====================================================================

    @Test
    public void test_serializeXmlNull_WithToXmlGenerator() throws Exception {
        XmlMapper om = new XmlMapper();
        XmlSerializerProviderTest helper = configuredHelper(om);
        XmlFactory factory = (XmlFactory) om.getFactory();
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = (ToXmlGenerator) factory.createGenerator(sw);
        helper._serializeXmlNull(gen);
        try { gen.close(); } catch (Exception ignore) {}
        // ตรวจเพียงว่าไม่เกิด exception; รูปแบบ output ขึ้นกับ implementation ของ super.serializeValue
    }

    @Test
    public void test_serializeXmlNull_WithNonToXmlGenerator() throws Exception {
        XmlMapper om = new XmlMapper();
        XmlSerializerProviderTest helper = configuredHelper(om);
        TokenBuffer buffer = new TokenBuffer(om, false);
        // branch: jgen ไม่ใช่ ToXmlGenerator -> ข้าม _initWithRootName
        helper._serializeXmlNull(buffer);
        buffer.close();
    }

    // =====================================================================
    // 7) _initWithRootName(xgen, rootName) : branch setNextNameIfMissing true/false + namespace
    // =====================================================================

    @Test
    public void test_initWithRootName_SetsNameWhenMissing() throws Exception {
        XmlFactory factory = new XmlFactory();
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = (ToXmlGenerator) factory.createGenerator(sw);
        QName root = new QName("rootElem");
        this._initWithRootName(gen, root);
        try {
            gen.writeStartObject();
            gen.writeEndObject();
        } finally {
            try { gen.close(); } catch (Exception ignore) {}
        }
        assertTrue(sw.toString().contains("rootElem"));
    }

    @Test
    public void test_initWithRootName_OverridesWhenAlreadySetAndInRoot() throws Exception {
        XmlFactory factory = new XmlFactory();
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = (ToXmlGenerator) factory.createGenerator(sw);
        gen.setNextName(new QName("other")); // ทำให้ setNextNameIfMissing คืน false
        QName forced = new QName("forced");
        this._initWithRootName(gen, forced); // inRoot() == true -> ต้อง setNextName บังคับ
        try {
            gen.writeStartObject();
            gen.writeEndObject();
        } finally {
            try { gen.close(); } catch (Exception ignore) {}
        }
        assertTrue("expected forced root name to override, got: " + sw.toString(),
                sw.toString().contains("forced"));
    }

    @Test
    public void test_initWithRootName_WithNamespaceSetsDefaultNamespace() throws Exception {
        XmlFactory factory = new XmlFactory();
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = (ToXmlGenerator) factory.createGenerator(sw);
        QName root = new QName("urn:test-ns", "rootElem");
        this._initWithRootName(gen, root);
        try {
            gen.writeStartObject();
            gen.writeEndObject();
        } finally {
            try { gen.close(); } catch (Exception ignore) {}
        }
        assertTrue(sw.toString().contains("urn:test-ns"));
    }

    // =====================================================================
    // 8) _startRootArray(xgen, rootName)
    // =====================================================================

    @Test
    public void test_startRootArray_WritesItemFieldName() throws Exception {
        XmlFactory factory = new XmlFactory();
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = (ToXmlGenerator) factory.createGenerator(sw);
        QName root = new QName("root");
        this._initWithRootName(gen, root);
        this._startRootArray(gen, root);
        try {
            gen.writeString("value1");
            gen.writeEndObject();
        } finally {
            try { gen.close(); } catch (Exception ignore) {}
        }
        assertTrue(sw.toString().contains("item"));
    }
}
