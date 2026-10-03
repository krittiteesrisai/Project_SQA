package com.fasterxml.jackson.databind.ser.std;

import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.Date;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.type.SimpleType;

import static org.junit.Assert.*;

public class StdKeySerializerTest {

    private StdKeySerializer serializer;
    private ObjectMapper objectMapper;
    private SerializerProvider serializers;

    @Before
    public void setUp() {
        serializer = new StdKeySerializer();
        objectMapper = new ObjectMapper();
        serializers = objectMapper.getSerializerProvider();
    }

    @Test
    public void testSerializeDateKey() throws Exception {
        // Branch 1: value instanceof Date -> true
        StringWriter sw = new StringWriter();
        JsonFactory f = new JsonFactory();
        JsonGenerator jgen = f.createGenerator(sw);
        
        Date date = new Date(0L); // Epoch time
        serializer.serialize(date, jgen, serializers);
        jgen.flush();
        
        // ตรวจสอบว่า Date ถูกซีเรียลไลซ์เป็นคีย์ (มักอยู่ในรูป ISO-8601 หรือ timestamp ตาม Provider config)
        assertTrue(sw.toString().length() > 0);
        jgen.close();
    }

    @Test
    public void testSerializeStringKey() throws Exception {
        // Branch 2: value instanceof Date -> false (String)
        StringWriter sw = new StringWriter();
        JsonFactory f = new JsonFactory();
        JsonGenerator jgen = f.createGenerator(sw);
        
        String key = "test-key";
        serializer.serialize(key, jgen, serializers);
        jgen.flush();
        
        assertEquals("\"test-key\"", sw.toString());
        jgen.close();
    }

    @Test
    public void testSerializeIntegerKey() throws Exception {
        // Branch 2: value instanceof Date -> false (Integer / Non-Date Object)
        StringWriter sw = new StringWriter();
        JsonFactory f = new JsonFactory();
        JsonGenerator jgen = f.createGenerator(sw);
        
        Integer key = 123;
        serializer.serialize(key, jgen, serializers);
        jgen.flush();
        
        assertEquals("\"123\"", sw.toString());
        jgen.close();
    }

    @Test(expected = NullPointerException.class)
    public void testSerializeNullKeyEdgeCase() throws Exception {
        // Edge Case: value เป็น null จะทำให้เกิด NullPointerException ที่ value.toString()
        // นี่คือ Fault ที่อาจแฝงอยู่หากไม่มีการดัก null check ใน StdKeySerializer
        StringWriter sw = new StringWriter();
        JsonFactory f = new JsonFactory();
        JsonGenerator jgen = f.createGenerator(sw);
        
        try {
            serializer.serialize(null, jgen, serializers);
        } finally {
            jgen.close();
        }
    }

    @Test
    public void testGetSchema() throws Exception {
        assertNotNull(serializer.getSchema(serializers, null));
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        // ตรวจสอบว่าไม่โยน Exception เมื่อเรียกใช้งาน Visitor
        JsonFormatVisitorWrapper visitor = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
        serializer.acceptJsonFormatVisitor(visitor, SimpleType.constructUnsafe(String.class));
        // Pass ถ้าไม่มี Exception เกิดขึ้น
        assertTrue(true);
    }
}