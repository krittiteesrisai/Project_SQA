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
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class XmlSerializerProviderTest {

    private XmlMapper xmlMapper;
    private XmlSerializerProvider serializerProvider;

    @Before
    public void setUp() {
        xmlMapper = new XmlMapper();
        serializerProvider = new XmlSerializerProvider(new XmlRootNameLookup());
    }

    @Test
    public void testSerializeValueNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(xmlMapper, false);
        serializerProvider.serializeValue(buffer, null);
        assertNotNull(buffer);
    }

    @Test
    public void testSerializeValueWithIndexedType() throws Exception {
        ToXmlGenerator xgen = (ToXmlGenerator) xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        List<String> list = Arrays.asList("a", "b");
        
        // Use createInstance to get proper configured provider
        DefaultSerializerProvider provider = serializerProvider.createInstance(xmlMapper.getSerializationConfig(), xmlMapper.getSerializerFactory());
        
        provider.serializeValue(xgen, list);
        xgen.close();
    }

    @Test
    public void testSerializeValueWithRootType() throws Exception {
        ToXmlGenerator xgen = (ToXmlGenerator) xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        JavaType type = xmlMapper.constructType(String.class);
        
        DefaultSerializerProvider provider = serializerProvider.createInstance(xmlMapper.getSerializationConfig(), xmlMapper.getSerializerFactory());
        provider.serializeValue(xgen, "test-string", type);
        xgen.close();
    }

    @Test
    public void testSerializeValueWithRootTypeAndCustomSerializer() throws Exception {
        ToXmlGenerator xgen = (ToXmlGenerator) xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        JavaType type = xmlMapper.constructType(String.class);
        
        JsonSerializer<Object> customSer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString("custom-" + value);
            }
        };

        DefaultSerializerProvider provider = serializerProvider.createInstance(xmlMapper.getSerializationConfig(), xmlMapper.getSerializerFactory());
        provider.serializeValue(xgen, "value", type, customSer);
        xgen.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testAsXmlGeneratorInvalidGenerator() throws Exception {
        // Pass a standard JsonGenerator that is neither ToXmlGenerator nor TokenBuffer
        JsonGenerator invalidGen = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(
                new com.fasterxml.jackson.core.io.IOContext(new com.fasterxml.jackson.core.util.BufferRecycler(), this, false),
                0, null, new java.io.StringWriter()
        );
        
        serializerProvider.serializeValue(invalidGen, "test");
    }

    @Test
    public void testSerializeValueWithTokenBuffer() throws Exception {
        TokenBuffer buffer = new TokenBuffer(xmlMapper, false);
        // TokenBuffer triggers xgen == null branch in _asXmlGenerator
        serializerProvider.serializeValue(buffer, "token-buffer-test");
        assertNotNull(buffer);
    }

    @Test(expected = IOException.class)
    public void testSerializeValueIOExceptionHandling() throws Exception {
        ToXmlGenerator xgen = (ToXmlGenerator) xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        JsonSerializer<Object> failingSerializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                throw new IOException("Simulated IO Exception");
            }
        };

        DefaultSerializerProvider provider = serializerProvider.createInstance(xmlMapper.getSerializationConfig(), xmlMapper.getSerializerFactory());
        provider.serializeValue(xgen, "any", xmlMapper.constructType(String.class), failingSerializer);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValueRuntimeRuntimeExceptionWrapping() throws Exception {
        ToXmlGenerator xgen = (ToXmlGenerator) xmlMapper.getFactory().createGenerator(new java.io.StringWriter());
        JsonSerializer<Object> failingSerializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                throw new RuntimeException("Simulated Runtime Exception");
            }
        };

        DefaultSerializerProvider provider = serializerProvider.createInstance(xmlMapper.getSerializationConfig(), xmlMapper.getSerializerFactory());
        provider.serializeValue(xgen, "any", xmlMapper.constructType(String.class), failingSerializer);
    }
}