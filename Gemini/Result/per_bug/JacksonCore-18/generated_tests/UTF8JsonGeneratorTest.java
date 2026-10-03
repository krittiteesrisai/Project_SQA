package com.fasterxml.jackson.core.json;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8JsonGeneratorTest {

    private ByteArrayOutputStream outputStream;
    private UTF8JsonGenerator generator;
    private IOContext ioContext;

    @Before
    public void setUp() throws Exception {
        outputStream = new ByteArrayOutputStream();
        ioContext = new IOContext(new BufferRecycler(), null, false);
        // สร้าง UTF8JsonGenerator พร้อม Features เริ่มต้น (0 คือค่า default)
        generator = new UTF8JsonGenerator(ioContext, 0, null, outputStream);
    }

    @After
    public void tearDown() throws Exception {
        if (generator != null) {
            try {
                generator.close();
            } catch (IOException e) {
                // Ignore close errors on cleanup
            }
        }
    }

    @Test
    public void testGetOutputTargetAndBuffered() throws IOException {
        assertEquals(outputStream, generator.getOutputTarget());
        assertEquals(0, generator.getOutputBuffered());
        
        generator.writeStartObject();
        generator.writeFieldName("test");
        assertTrue(generator.getOutputBuffered() > 0);
    }

    @Test
    public void testWriteFieldNameExpectValue() {
        try {
            generator.writeStartObject();
            generator.writeFieldName("field1");
            // เขียน fieldName ซ้อนกันโดยไม่ใส่ value ควรพัง (STATUS_EXPECT_VALUE)
            generator.writeFieldName("field2");
            fail("Expected an exception for expecting a value");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Can not write a field name, expecting a value"));
        }
    }

    @Test
    public void testWriteFieldNameAfterCommaAndBufferFlush() throws IOException {
        generator.writeStartObject();
        generator.writeStringField("f1", "v1");
        // สร้างสถานะ STATUS_OK_AFTER_COMMA และบังคับ Buffer เต็มเพื่อเทส _flushBuffer()
        // โดยการเขียน Field ที่ชื่อยาวมากๆ
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000; i++) {
            sb.append("a");
        }
        generator.writeFieldName(sb.toString());
        generator.writeNumber(123);
        generator.writeEndObject();
        generator.flush();
        assertTrue(outputStream.size() > 0);
    }

    @Test
    public void testInvalidEndArrayContext() {
        try {
            generator.writeEndArray();
            fail("Expected exception when ending array in root context");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Current context not an ARRAY"));
        }
    }

    @Test
    public void testInvalidEndObjectContext() {
        try {
            generator.writeEndObject();
            fail("Expected exception when ending object in root context");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Current context not an object"));
        }
    }

    @Test
    public void testWriteStringNull() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("nullField");
        generator.writeString((String) null);
        generator.writeEndObject();
        generator.flush();
        assertEquals("{\"nullField\":null}", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteStringLongSegments() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000; i++) {
            sb.append("long_string_content_");
        }
        generator.writeStartObject();
        generator.writeFieldName("long");
        generator.writeString(sb.toString());
        generator.writeEndObject();
        generator.flush();
        assertTrue(outputStream.size() > 2000);
    }

    @Test
    public void testWriteRawStringAndChars() throws IOException {
        generator.writeRaw("Raw Text");
        generator.writeRaw("Long Raw Text Content That Exceeds Buffer Allocation Limits At Some Point...", 0, 30);
        generator.writeRaw('X');
        generator.flush();
        assertTrue(outputStream.toString("UTF-8").contains("Raw Text"));
    }

    @Test
    public void testWriteNumbersEdgeCases() throws IOException {
        generator.writeStartArray();
        generator.writeNumber((short) 10);
        generator.writeNumber(100);
        generator.writeNumber(1000L);
        generator.writeNumber(BigInteger.valueOf(123456789L));
        generator.writeNumber((BigInteger) null);
        generator.writeNumber(BigDecimal.TEN);
        generator.writeNumber((BigDecimal) null);
        generator.writeNumber(3.14);
        generator.writeNumber(2.71f);
        generator.writeNumber("999");
        generator.writeEndArray();
        generator.flush();
        assertTrue(outputStream.size() > 0);
    }

    @Test
    public void testWriteBooleanAndNull() throws IOException {
        generator.writeStartArray();
        generator.writeBoolean(true);
        generator.writeBoolean(false);
        generator.writeNull();
        generator.writeEndArray();
        generator.flush();
        assertEquals("[true,false,null]", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteBinaryWithKnownLengthMissingBytes() {
        byte[] data = new byte[] { 1, 2, 3 };
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        try {
            // บอกว่ามี 10 ไบต์ แต่จริงๆ ส่งมาแค่ 3 ไบต์
            generator.writeBinary(Base64Variants.MIME, bais, 10);
            fail("Expected exception for missing bytes");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Too few bytes available"));
        }
    }

    @Test
    public void testWriteBinaryUnknownLength() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        generator.writeBinary(Base64Variants.MIME, bais, -1);
        generator.flush();
        assertTrue(outputStream.size() > 0);
    }

    @Test
    public void testSplitSurrogateErrorOnWriteRaw() {
        char[] surr = new char[] { (char) 0xD800 }; // High surrogate without low surrogate
        try {
            generator.writeRaw(surr, 0, 1);
            fail("Expected split surrogate exception");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Split surrogate on writeRaw() input"));
        }
    }
}