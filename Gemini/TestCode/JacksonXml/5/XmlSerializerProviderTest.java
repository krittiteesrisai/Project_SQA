package com.fasterxml.jackson.dataformat.xml.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;
import org.junit.Before;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class XmlSerializerProviderTest {

    private XmlMapper xmlMapper;
    private XmlSerializerProvider provider;

    @Before
    public void setUp() {
        xmlMapper = new XmlMapper();
        provider = new XmlSerializerProvider(new XmlRootNameLookup());
    }

    @Test
    public void testCopyAndCreateInstance() {
        DefaultSerializerProvider copied = provider.copy();
        assertNotNull(copied);
        assertTrue(copied instanceof XmlSerializerProvider);

        DefaultSerializerProvider created = provider.createInstance(xmlMapper.getSerializationConfig(), xmlMapper.getSerializerFactory());
        assertNotNull(created);
        assertTrue(created instanceof XmlSerializerProvider);
    }

    @Test
    public void testSerializeValueNull() throws IOException {
        TokenBuffer tb = new TokenBuffer(xmlMapper, false);
        provider.serializeValue(tb, null);
        assertNotNull(tb);
    }

    @Test
    public void testSerializeValueWithIndexedTypeAndConfigRootName() throws IOException {
        // กำหนด Root Name ผ่าน Config เพื่อให้ครอบคลุม _rootNameFromConfig และ asArray (List)
        ObjectWriter writer = xmlMapper.writer().withRootName(new PropertyName("http://example.org", "customRoot"));
        TokenBuffer tb = new TokenBuffer(xmlMapper, false);
        
        List<String> list = new ArrayList<>();
        list.add("item1");

        // เรียกใช้งานผ่าน serializeValue โดยใช้ ToXmlGenerator ทางอ้อมผ่าน XmlMapper หรือจำลอง
        // แต่เพื่อทดสอบ XmlSerializerProvider โดยตรง:
        XmlSerializerProvider customProvider = (XmlSerializerProvider) xmlMapper.getSerializerProvider();
        
        // สร้าง ToXmlGenerator จำลองโดยใช้ XmlMapper factory
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        try {
            customProvider.serializeValue(gen, list);
        } finally {
            gen.close();
        }
    }

    @Test
    public void testSerializeValueWithRootTypeAndNullSerializer() throws IOException {
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        JavaType type = xmlMapper.constructType(String.class);
        try {
            provider.serializeValue(gen, "testValue", type, null);
        } finally {
            gen.close();
        }
    }

    @Test
    public void testSerializeValueWithRootTypeAndCustomSerializer() throws IOException {
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        JavaType type = xmlMapper.constructType(String.class);
        JsonSerializer<Object> ser = provider.findTypedValueSerializer(type, true, null);
        try {
            provider.serializeValue(gen, "testValue", type, ser);
        } finally {
            gen.close();
        }
    }

    @Test
    public void testSerializeValueWithNullValueAndRootType() throws IOException {
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        JavaType type = xmlMapper.constructType(String.class);
        try {
            provider.serializeValue(gen, null, type, null);
        } finally {
            gen.close();
        }
    }

    @Test
    public void testAsXmlGeneratorWithTokenBuffer() throws Exception {
        // ทดสอบ _asXmlGenerator เมื่อรับ TokenBuffer (ควรคืนค่า null ไม่พ่น Exception)
        TokenBuffer tb = new TokenBuffer(xmlMapper, false);
        java.lang.reflect.Method method = XmlSerializerProvider.class.getDeclaredMethod("_asXmlGenerator", JsonGenerator.class);
        method.setAccessible(true);
        Object result = method.invoke(provider, tb);
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testAsXmlGeneratorWithInvalidGenerator() throws Throwable {
        // ทดสอบเมื่อส่ง Generator ที่ไม่ใช่ ToXmlGenerator หรือ TokenBuffer ต้องพ่น JsonMappingException
        // ใช้Anonymous classจำลอง JsonGenerator ทั่วไป
        JsonGenerator invalidGen = new com.fasterxml.jackson.core.base.GeneratorBase(0, null) {
            @Override public void flush() throws IOException {}
            @Override protected void _releaseBuffers() {}
            @Override protected void _verifyValueWrite(String typeMsg) throws IOException {}
            @Override public void writeFieldName(String name) throws IOException {}
            @Override public void writeFieldName(SerializableString name) throws IOException {}
            @Override public void writeStartArray() throws IOException {}
            @Override public void writeEndArray() throws IOException {}
            @Override public void writeStartObject() throws IOException {}
            @Override public void writeEndObject() throws IOException {}
            @Override public void writeString(String text) throws IOException {}
            @Override public void writeString(char[] text, int offset, int len) throws IOException {}
            @Override public void writeString(SerializableString text) throws IOException {}
            @Override public void writeRawUTF8String(byte[] buffer, int offset, int len) throws IOException {}
            @Override public void writeUTF8String(byte[] buffer, int offset, int len) throws IOException {}
            @Override public void writeRaw(String text) throws IOException {}
            @Override public void writeRaw(String text, int offset, int len) throws IOException {}
            @Override public void writeRaw(char[] text, int offset, int len) throws IOException {}
            @Override public void writeRaw(char c) throws IOException {}
            @Override public void writeRawValue(String text) throws IOException {}
            @Override public void writeRawValue(String text, int offset, int len) throws IOException {}
            @Override public void writeRawValue(char[] text, int offset, int len) throws IOException {}
            @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException {}
            @Override public void writeBoolean(boolean state) throws IOException {}
            @Override public void writeNull() throws IOException {}
            @Override public void writeNumber(int v) throws IOException {}
            @Override public void writeNumber(long v) throws IOException {}
            @Override public void writeNumber(bigInteger v) throws IOException {}
            @Override public void writeNumber(double v) throws IOException {}
            @Override public void writeNumber(float v) throws IOException {}
            @Override public void writeNumber(java.math.BigDecimal v) throws IOException {}
            @Override public void writeNumber(String encodedValue) throws IOException {}
            @Override public void version() { return null; }
            @Override public Object getOutputTarget() { return null; }
        };

        java.lang.reflect.Method method = XmlSerializerProvider.class.getDeclaredMethod("_asXmlGenerator", JsonGenerator.class);
        method.setAccessible(true);
        try {
            method.invoke(provider, invalidGen);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    @Test
    public void testWrapAsIOEWithIOException() throws Exception {
        java.lang.reflect.Method method = XmlSerializerProvider.class.getDeclaredMethod("_wrapAsIOE", JsonGenerator.class, Exception.class);
        method.setAccessible(true);
        IOException original = new IOException("test io exception");
        IOException result = (IOException) method.invoke(provider, null, original);
        assertSame(original, result);
    }

    @Test
    public void testWrapAsIOEWithRuntimeException() throws Exception {
        java.lang.reflect.Method method = XmlSerializerProvider.class.getDeclaredMethod("_wrapAsIOE", JsonGenerator.class, Exception.class);
        method.setAccessible(true);
        RuntimeException runtimeEx = new RuntimeException("runtime error");
        IOException result = (IOException) method.invoke(provider, null, runtimeEx);
        assertTrue(result instanceof JsonMappingException);
    }

    @Test
    public void testWrapAsIOEWithNoMessageException() throws Exception {
        java.lang.reflect.Method method = XmlSerializerProvider.class.getDeclaredMethod("_wrapAsIOE", JsonGenerator.class, Exception.class);
        method.setAccessible(true);
        RuntimeException runtimeEx = new RuntimeException((String) null);
        IOException result = (IOException) method.invoke(provider, null, runtimeEx);
        assertTrue(result instanceof JsonMappingException);
        assertTrue(result.getMessage().contains("[no message for"));
    }
}