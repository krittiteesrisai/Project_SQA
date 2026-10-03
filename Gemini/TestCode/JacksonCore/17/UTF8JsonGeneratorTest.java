package com.fasterxml.jackson.core.json;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class UTF8JsonGeneratorTest {

    private ByteArrayOutputStream outputStream;
    private UTF8JsonGenerator generator;
    private IOContext ioContext;

    @Before
    public void setUp() throws Exception {
        outputStream = new ByteArrayOutputStream();
        JsonFactory f = new JsonFactory();
        ioContext = new IOContext(new BufferRecycler(), f, false);
        generator = new UTF8JsonGenerator(ioContext, 0, null, outputStream);
    }

    @After
    public void tearDown() throws Exception {
        if (generator != null) {
            generator.close();
        }
    }

    @Test
    public void testWriteNumberDouble_NaN_Quoted() throws IOException {
        generator.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        generator.writeStartArray();
        generator.writeNumber(Double.NaN);
        generator.writeEndArray();
        generator.flush();
        assertEquals("[\"NaN\"]", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberDouble_Infinity_Raw() throws IOException {
        // Feature disabled by default, prints unquoted Infinity
        generator.writeStartArray();
        generator.writeNumber(Double.POSITIVE_INFINITY);
        generator.writeEndArray();
        generator.flush();
        assertEquals("[Infinity]", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberFloat_NaN_Quoted() throws IOException {
        generator.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        generator.writeStartArray();
        generator.writeNumber(Float.NaN);
        generator.writeEndArray();
        generator.flush();
        assertEquals("[\"NaN\"]", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberFloat_NegativeInfinity_Quoted() throws IOException {
        generator.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        generator.writeStartArray();
        generator.writeNumber(Float.NEGATIVE_INFINITY);
        generator.writeEndArray();
        generator.flush();
        assertEquals("[\"-Infinity\"]", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimal_Null() throws IOException {
        generator.writeStartArray();
        generator.writeNumber((BigDecimal) null);
        generator.writeEndArray();
        generator.flush();
        assertEquals("[null]", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimal_Plain() throws IOException {
        generator.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        generator.writeStartArray();
        generator.writeNumber(new BigDecimal("1E+2"));
        generator.writeEndArray();
        generator.flush();
        assertEquals("[100]", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigInteger_Null() throws IOException {
        generator.writeStartArray();
        generator.writeNumber((BigInteger) null);
        generator.writeEndArray();
        generator.flush();
        assertEquals("[null]", outputStream.toString("UTF-8"));
    }

    @Test
    public void testWriteRawChars_BoundaryAndMultibyte() throws IOException {
        // Trigger ASCII, 2-byte, and multi-byte/surrogate paths in writeRaw
        char[] chars = new char[] { 'A', (char) 0x0080, (char) 0x0800, '\uD800', '\uDC00' };
        generator.writeStartArray();
        generator.writeRaw(chars, 0, chars.length);
        generator.writeEndArray();
        generator.flush();
        assertTrue(outputStream.toString("UTF-8").contains("A"));
    }

    @Test(expected = IOException.class)
    public void testWriteRaw_SplitSurrogateError() throws IOException {
        // Edge case: Split surrogate where second half is missing
        char[] chars = new char[] { '\uD800' };
        generator.writeRaw(chars, 0, 1);
    }

    @Test
    public void testWriteBinary_InputStream_UnknownLength() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        generator.writeStartArray();
        generator.writeBinary(Base64Variants.MIME, bais, -1);
        generator.writeEndArray();
        generator.flush();
        assertTrue(outputStream.toString("UTF-8").length() > 2);
    }

    @Test
    public void testWriteBinary_InputStream_KnownLength() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        generator.writeStartArray();
        generator.writeBinary(Base64Variants.MIME, bais, 5);
        generator.writeEndArray();
        generator.flush();
        assertTrue(outputStream.toString("UTF-8").length() > 2);
    }

    @Test(expected = IOException.class)
    public void testWriteBinary_InputStream_MissingBytes() throws IOException {
        byte[] data = new byte[] { 1, 2 };
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        // Expecting 5 bytes, but InputStream only has 2 -> should throw IOException ("Too few bytes available...")
        generator.writeBinary(Base64Variants.MIME, bais, 5);
    }
}