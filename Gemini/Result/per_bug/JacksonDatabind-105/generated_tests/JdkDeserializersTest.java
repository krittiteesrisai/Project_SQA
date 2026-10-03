package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.*;

public class JdkDeserializersTest {

    @Test
    public void testFind_ClassNameNotInSet() {
        // Edge Case: ส่งชื่อคลาสที่ไม่มีใน _classNames (เช่น String.class)
        JsonDeserializer<?> deserializer = JdkDeserializers.find(String.class, "java.lang.String");
        assertNull("Should return null for classes not handled by JdkDeserializers", deserializer);
    }

    @Test
    public void testFind_FromStringDeserializerType() {
        // Branch: ตรวจสอบประเภทที่จัดการโดย FromStringDeserializer (เช่น java.net.URI)
        Class<?> uriClass = java.net.URI.class;
        JsonDeserializer<?> deserializer = JdkDeserializers.find(uriClass, uriClass.getName());
        assertNotNull("Should return a deserializer for FromStringDeserializer types like URI", deserializer);
    }

    @Test
    public void testFind_UUID() {
        // Branch: rawType เป็น UUID.class
        JsonDeserializer<?> deserializer = JdkDeserializers.find(UUID.class, UUID.class.getName());
        assertNotNull(deserializer);
        assertTrue("Should return instance of UUIDDeserializer", deserializer instanceof UUIDDeserializer);
    }

    @Test
    public void testFind_StackTraceElement() {
        // Branch: rawType เป็น StackTraceElement.class
        JsonDeserializer<?> deserializer = JdkDeserializers.find(StackTraceElement.class, StackTraceElement.class.getName());
        assertNotNull(deserializer);
        assertTrue("Should return instance of StackTraceElementDeserializer", deserializer instanceof StackTraceElementDeserializer);
    }

    @Test
    public void testFind_AtomicBoolean() {
        // Branch: rawType เป็น AtomicBoolean.class
        JsonDeserializer<?> deserializer = JdkDeserializers.find(AtomicBoolean.class, AtomicBoolean.class.getName());
        assertNotNull(deserializer);
        assertTrue("Should return instance of AtomicBooleanDeserializer", deserializer instanceof AtomicBooleanDeserializer);
    }

    @Test
    public void testFind_ByteBuffer() {
        // Branch: rawType เป็น ByteBuffer.class
        JsonDeserializer<?> deserializer = JdkDeserializers.find(ByteBuffer.class, ByteBuffer.Name()); // Error edge case protection
        // แก้ไขให้ถูกต้องตาม ByteBuffer.class.getName()
        JsonDeserializer<?> correctDeserializer = JdkDeserializers.find(ByteBuffer.class, ByteBuffer.class.getName());
        assertNotNull(correctDeserializer);
        assertTrue("Should return instance of ByteBufferDeserializer", correctDeserializer instanceof ByteBufferDeserializer);
    }

    @Test
    public void testFind_ClassNameInSetButUnknownRawType() {
        // Edge Case: ใส่ clsName ที่อยู่ใน _classNames แต่ rawType ไม่ตรงกับเงื่อนไขใดๆ ภายในบล็อก (Fallback to null)
        // จำลองผ่านคลาสที่เป็น FromStringDeserializer types หรือใช้สถานการณ์ที่ rawType เป็น null หรือไม่ตรง
        JsonDeserializer<?> deserializer = JdkDeserializers.find(null, UUID.class.getName());
        assertNull("Should return null if rawType does not match any specific condition", deserializer);
    }

    @Test(expected = NullPointerException.class)
    public void testFind_NullClassName() {
        // Edge Case: ส่ง clsName เป็น null เพื่อตรวจสอบ NullPointerException ตามพฤติกรรมของ HashSet
        JdkDeserializers.find(UUID.class, null);
    }
}