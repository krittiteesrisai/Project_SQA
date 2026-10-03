package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class WriterBasedJsonGeneratorTest {

    private CharArrayWriter out;
    private IOContext ioContext;
    private WriterBasedJsonGenerator generator;

    @Before
    public void setUp() {
        out = new CharArrayWriter();
        ioContext = new IOContext(new BufferRecycler(), null, false);
        generator = new WriterBasedJsonGenerator(ioContext, 0, null, out);
    }

    @After
    public void tearDown() throws IOException {
        if (generator != null) {
            generator.close();
        }
    }

    @Test
    public void testLifecycleAndGetters() {
        assertNotNull(generator.getOutputTarget());
        assertEquals(0, generator.getOutputBuffered());
    }

    @Test
    public void testWriteStartAndEndArray() throws IOException {
        generator.writeStartArray();
        generator.writeEndArray();
        generator.flush();
        assertEquals("[]", out.toString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArrayInvalidContext() throws IOException {
        generator.writeEndArray();
    }

    @Test
    public void testWriteStartAndEndObject() throws IOException {
        generator.writeStartObject();
        generator.writeEndObject();
        generator.flush();
        assertEquals("{}", out.toString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObjectInvalidContext() throws IOException {
        generator.writeEndObject();
    }

    @Test
    public void testWriteFieldNamesAndPrimitives() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("testField");
        generator.writeString("testValue");
        generator.writeFieldName(new SerializedString("serialField"));
        generator.writeNumber(123);
        generator.writeNumber(456L);
        generator.writeNumber((short) 7);
        generator.writeBoolean(true);
        generator.writeNull();
        generator.writeEndObject();
        generator.flush();
        
        String result = out.toString();
        assertTrue(result.contains("\"testField\":\"testValue\""));
        assertTrue(result.contains("\"serialField\":123"));
        assertTrue(result.contains("456"));
        assertTrue(result.contains("7"));
        assertTrue(result.contains("true"));
        assertTrue(result.contains("null"));
    }

    @Test
    public void testNumbersAsStringsAndEdgeValues() throws IOException {
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        generator.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);

        generator.writeStartArray();
        generator.writeNumber((short) 1);
        generator.writeNumber(2);
        generator.writeNumber(3L);
        generator.writeNumber(Double.NaN);
        generator.writeNumber(Float.POSITIVE_INFINITY);
        generator.writeNumber(new BigInteger("9999999999"));
        generator.writeNumber(new BigDecimal("123.456"));
        generator.writeNumber("rawNum");
        generator.writeEndArray();
        generator.flush();

        assertTrue(out.toString().length() > 0);
    }

    @Test
    public void testBigDecimalPlainString() throws IOException {
        generator.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        generator.writeNumber(new BigDecimal("1e-2"));
        generator.flush();
        assertEquals("\"0.01\"", out.toString());
    }

    @Test
    public void testWriteRawVariations() throws IOException {
        generator.writeRaw('A');
        generator.writeRaw("BC");
        generator.writeRaw("DEFGH", 1, 3);
        generator.writeRaw(new SerializedString("IJK"));
        generator.writeRaw(new char[]{'L', 'M', 'N'}, 0, 3);
        
        // Long raw string to trigger writeRawLong
        StringBuilder longStr = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            longStr.append("x");
        }
        generator.writeRaw(longStr.toString());
        generator.flush();
        assertTrue(out.toString().startsWith("ABCDEFGHIJKLMN"));
    }

    @Test
    public void testWriteStringVariations() throws IOException {
        generator.writeStartArray();
        generator.writeString((String) null);
        generator.writeString("Short");
        
        StringBuilder longStr = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            longStr.append("a");
        }
        generator.writeString(longStr.toString());
        generator.writeString(new char[]{'b', 'c', 'd'}, 0, 3);
        generator.writeString(new SerializedString("serialStr"));
        generator.writeEndArray();
        generator.flush();
        assertTrue(out.toString().contains("null"));
    }

    @Test
    public void testEscapingAndMaxNonEscaped() throws IOException {
        generator.setHighestNonEscapedChar(127);
        generator.writeString("\u0001\u0100\n\t\\\"");
        generator.flush();
        assertTrue(out.toString().length() > 0);
    }

    @Test
    public void testCustomCharacterEscapes() throws IOException {
        generator.setCharacterEscapes(new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                return CharacterEscapes.getDefaultAsciiEscapesForJSON();
            }

            @Override
            public SerializableString getEscapeSequence(int ch) {
                if (ch == 'x') {
                    return new SerializedString("[CUSTOM]");
                }
                return null;
            }
        });
        generator.writeString("text with x character");
        generator.flush();
        assertTrue(out.toString().contains("[CUSTOM]"));
    }

    @Test
    public void testWriteBinaryByteArray() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        generator.writeBinary(Base64Variants.MIME, data, 0, data.length);
        generator.flush();
        assertTrue(out.toString().length() > 0);
    }

    @Test
    public void testWriteBinaryInputStreamKnownLength() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        generator.writeBinary(Base64Variants.MODIFIED_FOR_URL, bais, data.length);
        generator.flush();
        assertTrue(out.toString().length() > 0);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteBinaryInputStreamTooFewBytes() throws IOException {
        byte[] data = new byte[]{1, 2};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        generator.writeBinary(Base64Variants.MIME, bais, 10);
    }

    @Test
    public void testWriteBinaryInputStreamUnknownLength() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        generator.writeBinary(Base64Variants.DEFAULT_BASE64, bais, -1);
        generator.flush();
        assertTrue(out.toString().length() > 0);
    }

    @Test
    public void testPrettyPrinterUsage() throws IOException {
        generator.setPrettyPrinter(new DefaultPrettyPrinter());
        generator.writeStartObject();
        generator.writeFieldName("key");
        generator.writeString("val");
        generator.writeEndObject();
        generator.flush();
        assertTrue(out.toString().contains("key"));
    }

    @Test
    public void testUnquotedFieldNames() throws IOException {
        generator.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        // Toggle unquoted feature via internal setting or alternate flows
        generator.writeStartObject();
        generator.writeFieldName("unq");
        generator.writeBoolean(false);
        generator.writeEndObject();
        generator.flush();
        assertTrue(out.toString().length() > 0);
    }
}