# UTF8JsonGeneratorTest.java

หมายเหตุก่อนเริ่ม:
- คลาส `UTF8JsonGenerator` ต้องพึ่ง `IOContext` ที่สร้างยาก จึงใช้ `JsonFactory.createGenerator(OutputStream, JsonEncoding.UTF8)` เป็นตัวสร้าง instance จริง แล้ว cast เป็น `UTF8JsonGenerator` (เพราะ factory จะ instantiate คลาสนี้เมื่อ encoding เป็น UTF8) — เป็นวิธีเดียวที่ทำได้จริงโดยไม่ mock private/final fields
- บาง behavior (เช่น ขนาด buffer default, การจัด format ของ `DefaultPrettyPrinter`, ผลของ `_asString()` สำหรับ BigDecimal, การคืนค่า -1 ของ `appendQuotedUTF8`) ไม่ได้ระบุไว้ตรงๆในซอร์สที่ให้มา แต่อ้างอิงจาก contract ที่สังเกตได้จากโค้ด — จะคอมเมนต์กำกับไว้ทุกจุด

```java
package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public class UTF8JsonGeneratorTest {

    private ByteArrayOutputStream out;
    private JsonFactory factory;

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        factory = new JsonFactory();
    }

    // ---------- helpers ----------

    private UTF8JsonGenerator newGenerator() throws IOException {
        return (UTF8JsonGenerator) factory.createGenerator(out, JsonEncoding.UTF8);
    }

    private static String repeat(char c, int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, c);
        return new String(arr);
    }

    /** Small OutputStream wrapper to detect flush() calls to underlying stream. */
    private static class FlushTrackingStream extends FilterOutputStream {
        boolean flushed = false;
        FlushTrackingStream(OutputStream out) { super(out); }
        @Override public void flush() throws IOException {
            flushed = true;
            super.flush();
        }
    }

    // =====================================================================
    // Structural: writeStartArray / writeEndArray / writeStartObject / writeEndObject
    // =====================================================================

    @Test
    public void testStartEndArray_noPrettyPrinter() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartArray();
        gen.writeEndArray();
        gen.close();
        assertEquals("[]", out.toString("UTF-8"));
    }

    @Test
    public void testStartEndObject_noPrettyPrinter() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeEndObject();
        gen.close();
        assertEquals("{}", out.toString("UTF-8"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArray_whenNotInArray_throws() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeEndArray(); // context is object -> error branch
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObject_whenNotInObject_throws() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartArray();
        gen.writeEndObject(); // context is array -> error branch
    }

    @Test
    public void testStartEndArray_withPrettyPrinter() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartArray();
        gen.writeEndArray();
        gen.close();
        String result = out.toString("UTF-8");
        assertTrue(result.contains("[") && result.contains("]"));
    }

    @Test
    public void testStartEndObject_withPrettyPrinter() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartObject();
        gen.writeEndObject();
        gen.close();
        String result = out.toString("UTF-8");
        assertTrue(result.contains("{") && result.contains("}"));
    }

    // =====================================================================
    // writeFieldName(String)
    // =====================================================================

    @Test
    public void testWriteFieldName_normal() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeFieldName("abc");
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"abc\":1}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldName_secondField_addsComma() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNumber(1);
        gen.writeFieldName("b"); // STATUS_OK_AFTER_COMMA branch
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"a\":1,\"b\":2}", out.toString("UTF-8"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName_whenExpectingValue_throws() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeFieldName("b"); // still expects a value for "a" -> STATUS_EXPECT_VALUE
    }

    @Test
    public void testWriteFieldName_longerThanCharBuffer_offlineSegments() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        String longName = repeat('a', 3000); // assumed > _charBufferLength (~2000 default)
        gen.writeFieldName(longName);
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"" + longName + "\":1}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldName_unquotedNames() throws IOException {
        factory.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES); // -> _cfgUnqNames == true
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeFieldName("abc");
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{abc:1}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldName_withPrettyPrinter_short() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartObject();
        gen.writeFieldName("x");
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertTrue(out.toString("UTF-8").contains("\"x\""));
    }

    @Test
    public void testWriteFieldName_withPrettyPrinter_longName() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartObject();
        String longName = repeat('b', 3000);
        gen.writeFieldName(longName);
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertTrue(out.toString("UTF-8").contains(longName));
    }

    @Test
    public void testWriteFieldName_withPrettyPrinter_unquoted() throws IOException {
        factory.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartObject();
        gen.writeFieldName("x");
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        String result = out.toString("UTF-8");
        // ไม่ยืนยัน spacing ที่แน่นอนของ pretty printer, ตรวจแค่ว่าไม่มี quote รอบชื่อ field
        assertFalse(result.contains("\"x\""));
    }

    // =====================================================================
    // writeFieldName(SerializableString)
    // =====================================================================

    @Test
    public void testWriteFieldNameSerializableString_normal() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("abc"));
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"abc\":1}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldNameSerializableString_unquoted() throws IOException {
        factory.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("abc"));
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{abc:1}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldNameSerializableString_withPrettyPrinter() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("x"));
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertTrue(out.toString("UTF-8").contains("\"x\""));
    }

    @Test
    public void testWriteFieldNameSerializableString_veryLong_fallbackWriteBytes() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        String longName = repeat('n', 9000); // สมมติเกินพื้นที่ buffer ทำให้ appendQuotedUTF8 คืน -1
        gen.writeFieldName(new SerializedString(longName));
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"" + longName + "\":1}", out.toString("UTF-8"));
        // NOTE: สมมติ behavior ของ appendQuotedUTF8 คืนค่า -1 เมื่อไม่พอที่ ทำให้ไป fallback _writeBytes
    }

    // =====================================================================
    // writeString(String)
    // =====================================================================

    @Test
    public void testWriteString_null() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartArray();
        gen.writeString((String) null);
        gen.writeEndArray();
        gen.close();
        assertEquals("[null]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_short() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeString("hello");
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_long_segmented() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        String longStr = repeat('x', 2000); // > _outputMaxContiguous (assumed ~1000)
        gen.writeString(longStr);
        gen.close();
        assertEquals("\"" + longStr + "\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_withEscapedCharacters() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeString("a\"b\\c\td\ne");
        gen.close();
        assertEquals("\"a\\\"b\\\\c\\td\\ne\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_multiByteUnescaped() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        // ไม่เปิด ESCAPE_NON_ASCII -> _maximumNonEscapedChar == 0 -> ไป _writeStringSegment2
        gen.writeString("caf\u00e9 \u4e2d\u6587"); // é = 2-byte, 中/文 = 3-byte
        gen.close();
        assertEquals("\"caf\u00e9 \u4e2d\u6587\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_surrogatePair_escaped() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        String emoji = new String(Character.toChars(0x1F600));
        gen.writeString("x" + emoji + "y");
        gen.close();
        String result = out.toString("UTF-8");
        // NOTE: implementation ปัจจุบันจะ escape surrogate half เป็น \\uXXXX เสมอ (ตาม comment ในซอร์ส)
        assertTrue(result.contains("\\u"));
    }

    @Test
    public void testWriteString_escapeNonAscii() throws IOException {
        factory.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII); // highestNonEscapedChar = 127
        UTF8JsonGenerator gen = newGenerator();
        gen.writeString("caf\u00e9");
        gen.close();
        assertTrue(out.toString("UTF-8").contains("\\u00e9"));
    }

    @Test
    public void testWriteString_customCharacterEscapes() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setCharacterEscapes(new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                int[] esc = CharacterEscapes.standardAsciiEscapesForJSON();
                esc['a'] = CharacterEscapes.ESCAPE_CUSTOM;
                return esc;
            }
            @Override
            public SerializableString getEscapeSequence(int ch) {
                if (ch == 'a') {
                    return new SerializedString("[A]");
                }
                return null;
            }
        });
        gen.writeString("abc");
        gen.close();
        assertEquals("\"[A]bc\"", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeString(char[], off, len)
    // =====================================================================

    @Test
    public void testWriteStringCharArray_short() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        char[] arr = "hello".toCharArray();
        gen.writeString(arr, 0, arr.length);
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringCharArray_long_segmented() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        char[] arr = repeat('y', 2000).toCharArray();
        gen.writeString(arr, 0, arr.length);
        gen.close();
        assertEquals("\"" + new String(arr) + "\"", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeString(SerializableString)
    // =====================================================================

    @Test
    public void testWriteStringSerializableString_short() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeString(new SerializedString("hello"));
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringSerializableString_veryLong_fallback() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        String longStr = repeat('t', 9000);
        gen.writeString(new SerializedString(longStr));
        gen.close();
        assertEquals("\"" + longStr + "\"", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeRawUTF8String / writeUTF8String
    // =====================================================================

    @Test
    public void testWriteRawUTF8String_basic() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] raw = "hello".getBytes("UTF-8");
        gen.writeRawUTF8String(raw, 0, raw.length);
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawUTF8String_veryLarge_directStreamWrite() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] raw = repeat('Q', 9000).getBytes("UTF-8"); // > MAX_BYTES_TO_BUFFER(512) และ > outputEnd
        gen.writeRawUTF8String(raw, 0, raw.length);
        gen.close();
        assertEquals("\"" + new String(raw, "UTF-8") + "\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteUTF8String_short_noEscape() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] raw = "hello".getBytes("UTF-8");
        gen.writeUTF8String(raw, 0, raw.length);
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteUTF8String_withEscaping() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] raw = "a\"b".getBytes("UTF-8");
        gen.writeUTF8String(raw, 0, raw.length);
        gen.close();
        assertEquals("\"a\\\"b\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteUTF8String_long_segmented() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] raw = repeat('z', 2000).getBytes("UTF-8");
        gen.writeUTF8String(raw, 0, raw.length);
        gen.close();
        assertEquals("\"" + new String(raw, "UTF-8") + "\"", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeRaw(...)
    // =====================================================================

    @Test
    public void testWriteRaw_string_short() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRaw("raw-text");
        gen.close();
        assertEquals("raw-text", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_string_exceedsCharBuffer() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        String raw = repeat('r', 3000); // > _charBuffer.length (assumed ~2000)
        gen.writeRaw(raw);
        gen.close();
        assertEquals(raw, out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_offsetLen_short() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRaw("XXhelloYY", 2, 5);
        gen.close();
        assertEquals("hello", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_offsetLen_longSegmented() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        String text = repeat('s', 5000);
        gen.writeRaw(text, 0, text.length());
        gen.close();
        assertEquals(text, out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_serializableString_empty() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRaw(new SerializedString(""));
        gen.close();
        assertEquals("", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_serializableString_nonEmpty() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRaw(new SerializedString("raw"));
        gen.close();
        assertEquals("raw", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawValue_serializableString_empty() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRawValue(new SerializedString(""));
        gen.close();
        assertEquals("", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawValue_serializableString_nonEmpty() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRawValue(new SerializedString("val"));
        gen.close();
        assertEquals("val", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_charArray_ascii() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        char[] cb = "abc".toCharArray();
        gen.writeRaw(cb, 0, cb.length);
        gen.close();
        assertEquals("abc", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_charArray_multiByte() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        char[] cb = "caf\u00e9\u4e2d".toCharArray(); // 2-byte + 3-byte
        gen.writeRaw(cb, 0, cb.length);
        gen.close();
        assertEquals("caf\u00e9\u4e2d", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_charArray_surrogatePair() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        char[] cb = Character.toChars(0x1F600);
        gen.writeRaw(cb, 0, cb.length);
        gen.close();
        assertEquals(new String(cb), out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_charArray_forcesSegmentedRawPath() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        char[] cb = repeat('m', 5000).toCharArray(); // len*3 > outputEnd (assumed ~8000)
        gen.writeRaw(cb, 0, cb.length);
        gen.close();
        assertEquals(new String(cb), out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawChar_ascii() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRaw('A');
        gen.close();
        assertEquals("A", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawChar_twoByte() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRaw('\u00e9');
        gen.close();
        assertEquals("\u00e9", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawChar_threeByte() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeRaw('\u4e2d');
        gen.close();
        assertEquals("\u4e2d", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeBinary(...)
    // =====================================================================

    @Test
    public void testWriteBinary_byteArray() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] data = {1, 2, 3, 4, 5};
        gen.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        gen.close();
        String result = out.toString("UTF-8");
        assertTrue(result.startsWith("\"") && result.endsWith("\""));
    }

    @Test
    public void testWriteBinary_inputStream_knownLength() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        int written = gen.writeBinary(Base64Variants.getDefaultVariant(), in, data.length);
        gen.close();
        assertEquals(data.length, written);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteBinary_inputStream_insufficientBytes_throws() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] data = new byte[10];
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        gen.writeBinary(Base64Variants.getDefaultVariant(), in, 100); // ขอมากกว่าที่มี
    }

    @Test
    public void testWriteBinary_inputStream_unknownLength() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        byte[] data = new byte[50];
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        int written = gen.writeBinary(Base64Variants.getDefaultVariant(), in, -1);
        gen.close();
        assertEquals(50, written);
    }

    // =====================================================================
    // writeNumber(short / int / long)
    // =====================================================================

    @Test
    public void testWriteNumberShort_normal() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber((short) 123);
        gen.close();
        assertEquals("123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberShort_asString() throws IOException {
        factory.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber((short) 123);
        gen.close();
        assertEquals("\"123\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberInt_normal() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(12345);
        gen.close();
        assertEquals("12345", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberInt_asString() throws IOException {
        factory.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(12345);
        gen.close();
        assertEquals("\"12345\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberLong_normal() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(123456789012345L);
        gen.close();
        assertEquals("123456789012345", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberLong_asString() throws IOException {
        factory.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(123456789012345L);
        gen.close();
        assertEquals("\"123456789012345\"", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeNumber(BigInteger)
    // =====================================================================

    @Test
    public void testWriteNumberBigInteger_null() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber((BigInteger) null);
        gen.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigInteger_asString() throws IOException {
        factory.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(BigInteger.valueOf(12345));
        gen.close();
        assertEquals("\"12345\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigInteger_normal() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(BigInteger.valueOf(12345));
        gen.close();
        assertEquals("12345", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeNumber(double)
    // =====================================================================

    @Test
    public void testWriteNumberDouble_normal() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        factory.disable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(3.14);
        gen.close();
        assertEquals("3.14", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberDouble_asString() throws IOException {
        factory.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(3.14);
        gen.close();
        assertEquals("\"3.14\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberDouble_NaN_withQuoteNonNumeric() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        factory.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(Double.NaN);
        gen.close();
        assertEquals("\"NaN\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberDouble_NaN_withoutQuoteFeature() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        factory.disable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(Double.NaN); // ตาม source ไม่ validate -> เขียน raw "NaN" (JSON ไม่ valid แต่เป็น behavior ตามซอร์ส)
        gen.close();
        assertEquals("NaN", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeNumber(float)
    // =====================================================================

    @Test
    public void testWriteNumberFloat_normal() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        factory.disable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(1.5f);
        gen.close();
        assertEquals("1.5", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberFloat_asString() throws IOException {
        factory.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(1.5f);
        gen.close();
        assertEquals("\"1.5\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberFloat_Infinite_withQuoteNonNumeric() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        factory.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(Float.POSITIVE_INFINITY);
        gen.close();
        assertEquals("\"Infinity\"", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeNumber(BigDecimal)
    // =====================================================================

    @Test
    public void testWriteNumberBigDecimal_null() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber((BigDecimal) null);
        gen.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimal_asString() throws IOException {
        factory.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        factory.disable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(new BigDecimal("1.50"));
        gen.close();
        assertEquals("\"1.50\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimal_asPlain() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        factory.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(new BigDecimal("1.50"));
        gen.close();
        assertEquals("1.50", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimal_normal() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        factory.disable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(new BigDecimal("1.50"));
        gen.close();
        // NOTE: ใช้ _asString(value) จาก base class; สมมติผลลัพธ์เท่ากับ value.toString() สำหรับค่าง่ายๆนี้
        assertEquals("1.50", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeNumber(String encodedValue)
    // =====================================================================

    @Test
    public void testWriteNumberString_asString() throws IOException {
        factory.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber("123.45");
        gen.close();
        assertEquals("\"123.45\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberString_normal() throws IOException {
        factory.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber("123.45");
        gen.close();
        assertEquals("123.45", out.toString("UTF-8"));
    }

    // =====================================================================
    // writeBoolean / writeNull
    // =====================================================================

    @Test
    public void testWriteBoolean_true() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeBoolean(true);
        gen.close();
        assertEquals("true", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBoolean_false() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeBoolean(false);
        gen.close();
        assertEquals("false", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNull() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNull();
        gen.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    // =====================================================================
    // _verifyValueWrite / _verifyPrettyValueWrite branches
    // =====================================================================

    @Test(expected = JsonGenerationException.class)
    public void testVerifyValueWrite_whenExpectingFieldName_throws() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartObject();
        gen.writeNumber(1); // STATUS_EXPECT_NAME
    }

    @Test
    public void testMultipleRootValues_rootSeparator() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeNumber(1);
        gen.writeNumber(2); // STATUS_OK_AFTER_SPACE, default separator = " "
        gen.close();
        assertEquals("1 2", out.toString("UTF-8"));
    }

    @Test
    public void testMultipleRootValues_withPrettyPrinter() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeNumber(1);
        gen.writeNumber(2); // _verifyPrettyValueWrite: STATUS_OK_AFTER_SPACE
        gen.close();
        String result = out.toString("UTF-8");
        assertTrue(result.contains("1") && result.contains("2"));
    }

    @Test
    public void testArrayValues_withPrettyPrinter() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartArray();
        gen.writeNumber(1); // STATUS_OK_AS_IS + inArray -> beforeArrayValues
        gen.writeNumber(2); // STATUS_OK_AFTER_COMMA -> writeArrayValueSeparator
        gen.writeEndArray();
        gen.close();
        String result = out.toString("UTF-8");
        assertTrue(result.contains("1") && result.contains("2"));
    }

    @Test
    public void testObjectFieldValue_withPrettyPrinter() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNumber(1); // STATUS_OK_AFTER_COLON -> writeObjectFieldValueSeparator
        gen.writeEndObject();
        gen.close();
        assertTrue(out.toString("UTF-8").contains("\"a\""));
    }

    // =====================================================================
    // flush()
    // =====================================================================

    @Test
    public void testFlush_flushPassedToStream_enabled() throws IOException {
        FlushTrackingStream fts = new FlushTrackingStream(out);
        factory.enable(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM);
        UTF8JsonGenerator gen = (UTF8JsonGenerator) factory.createGenerator(fts, JsonEncoding.UTF8);
        gen.writeStartArray();
        gen.writeEndArray();
        gen.flush();
        assertTrue(fts.flushed);
    }

    @Test
    public void testFlush_flushPassedToStream_disabled() throws IOException {
        FlushTrackingStream fts = new FlushTrackingStream(out);
        factory.disable(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM);
        UTF8JsonGenerator gen = (UTF8JsonGenerator) factory.createGenerator(fts, JsonEncoding.UTF8);
        gen.writeStartArray();
        gen.writeEndArray();
        gen.flush();
        assertFalse(fts.flushed);
    }

    // =====================================================================
    // close()
    // =====================================================================

    @Test
    public void testClose_autoCloseJsonContent_closesOpenContexts() throws IOException {
        UTF8JsonGenerator gen = newGenerator(); // AUTO_CLOSE_JSON_CONTENT enabled by default
        gen.writeStartObject();
        gen.writeFieldName("arr");
        gen.writeStartArray();
        gen.close(); // ต้อง auto-close array แล้วปิด object ตามลำดับ
        assertEquals("{\"arr\":[]}", out.toString("UTF-8"));
    }

    @Test
    public void testClose_autoCloseJsonContentDisabled_doesNotAutoClose() throws IOException {
        factory.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        UTF8JsonGenerator gen = (UTF8JsonGenerator) factory.createGenerator(out, JsonEncoding.UTF8);
        gen.writeStartObject();
        gen.close();
        assertEquals("{", out.toString("UTF-8"));
    }

    // =====================================================================
    // getOutputTarget / getOutputBuffered
    // =====================================================================

    @Test
    public void testGetOutputTarget() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        assertSame(out, gen.getOutputTarget());
        gen.close();
    }

    @Test
    public void testGetOutputBuffered() throws IOException {
        UTF8JsonGenerator gen = newGenerator();
        gen.writeStartArray(); // เขียน 1 byte ('[') ยังไม่ flush
        assertEquals(1, gen.getOutputBuffered());
        gen.close();
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอด | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Structural | testStartEndArray_noPrettyPrinter, testStartEndObject_noPrettyPrinter | `_cfgPrettyPrinter == null` path ของ writeStartArray/End, writeStartObject/End |
| Structural | testWriteEndArray_whenNotInArray_throws, testWriteEndObject_whenNotInObject_throws | `!_writeContext.inArray()/inObject()` → `_reportError` |
| Structural | testStartEndArray_withPrettyPrinter, testStartEndObject_withPrettyPrinter | `_cfgPrettyPrinter != null` path |
| writeFieldName(String) | testWriteFieldName_normal | path ปกติ, STATUS ปกติ |
| | testWriteFieldName_secondField_addsComma | `STATUS_OK_AFTER_COMMA` → insert comma |
| | testWriteFieldName_whenExpectingValue_throws | `STATUS_EXPECT_VALUE` → error |
| | testWriteFieldName_longerThanCharBuffer_offlineSegments | `len > _charBufferLength` → `_writeStringSegments(name,true)` |
| | testWriteFieldName_unquotedNames | `_cfgUnqNames == true` |
| | testWriteFieldName_withPrettyPrinter_short/_longName/_unquoted | `_writePPFieldName` ทุก branch (short/long/unquoted) |
| writeFieldName(SerializableString) | testWriteFieldNameSerializableString_* | quoted/unquoted/pretty/fallback (`len<0`) |
| writeString(String) | testWriteString_null | `text == null` → `_writeNull()` |
| | testWriteString_short/_long_segmented | `len <= _outputMaxContiguous` else branch |
| | testWriteString_withEscapedCharacters | escCodes 2-char escape + generic escape (ctrl chars) |
| | testWriteString_multiByteUnescaped | `_writeStringSegment2`: 2-byte & 3-byte non-surrogate |
| | testWriteString_surrogatePair_escaped | surrogate branch ของ `_outputMultiByteChar` |
| | testWriteString_escapeNonAscii | `_writeStringSegmentASCII2`: `ch > maxUnescaped` |
| | testWriteString_customCharacterEscapes | `_writeCustomStringSegment2`: `ESCAPE_CUSTOM` |
| writeString(char[]) | testWriteStringCharArray_short/_long_segmented | one-segment vs multi-segment |
| writeString(SerializableString) | testWriteStringSerializableString_short/_veryLong_fallback | `len<0` fallback vs normal |
| writeRawUTF8String | testWriteRawUTF8String_basic/_veryLarge_directStreamWrite | `_writeBytes` normal vs `len > MAX_BYTES_TO_BUFFER` |
| writeUTF8String | testWriteUTF8String_short/_withEscaping/_long_segmented | `_writeUTF8Segment` no-escape/escape, `_writeUTF8Segments` |
| writeRaw(String) | testWriteRaw_string_short/_exceedsCharBuffer | `len <= buf.length` else branch |
| writeRaw(String,off,len) | testWriteRaw_offsetLen_short/_longSegmented | short-copy vs `maxChunk` loop |
| writeRaw(SerializableString) | testWriteRaw_serializableString_empty/_nonEmpty | `raw.length > 0` |
| writeRawValue(SerializableString) | testWriteRawValue_*_empty/_nonEmpty | same, plus `_verifyValueWrite` |
| writeRaw(char[]) | testWriteRaw_charArray_ascii/_multiByte/_surrogatePair/_forcesSegmentedRawPath | ASCII fast loop, 2/3-byte, surrogate, `_writeSegmentedRaw` |
| writeRaw(char) | testWriteRawChar_ascii/_twoByte/_threeByte | 1-byte/2-byte/multibyte branch |
| writeBinary | testWriteBinary_byteArray, _inputStream_knownLength, _insufficientBytes_throws, _unknownLength | ทุก overload + error branch |
| writeNumber(short/int/long) | testWriteNumber*_normal/_asString | `_cfgNumbersAsStrings` true/false |
| writeNumber(BigInteger) | testWriteNumberBigInteger_null/_asString/_normal | null/asString/normal |
| writeNumber(double/float) | testWriteNumberDouble/Float_* | asString, NaN+feature, NaN-no-feature, normal, Infinity |
| writeNumber(BigDecimal) | testWriteNumberBigDecimal_* | null/asString/asPlain/normal |
| writeNumber(String) | testWriteNumberString_asString/_normal | asString vs normal |
| writeBoolean/writeNull | testWriteBoolean_*, testWriteNull | true/false, null |
| _verifyValueWrite/_verifyPrettyValueWrite | testVerifyValueWrite_whenExpectingFieldName_throws, testMultipleRootValues_*, testArrayValues_withPrettyPrinter, testObjectFieldValue_withPrettyPrinter | STATUS_EXPECT_NAME, STATUS_OK_AFTER_SPACE (มี/ไม่มี pretty), STATUS_OK_AS_IS/AFTER_COMMA (array), STATUS_OK_AFTER_COLON (object) |
| flush() | testFlush_flushPassedToStream_enabled/_disabled | `isEnabled(FLUSH_PASSED_TO_STREAM)` true/false |
| close() | testClose_autoCloseJsonContent_closesOpenContexts, testClose_autoCloseJsonContentDisabled_doesNotAutoClose | `AUTO_CLOSE_JSON_CONTENT` true/false, loop `inArray`/`inObject`/`break` |
| getOutputTarget/getOutputBuffered | testGetOutputTarget, testGetOutputBuffered | getter ตรง ๆ |

**ข้อจำกัดที่ควรทราบ:** บาง private helper (`_handleLongCustomEscape`, `_readMore` เมื่อ stream คืน -1 กลางทาง, `_writeCustomStringSegment2` กรณี `esc == null` ที่โยน error) ไม่สามารถทดสอบแยกได้ตรง ๆ เพราะเป็น `private` และต้องพึ่งพาเงื่อนไข edge-case ที่ควบคุมยากผ่าน public API เพียงอย่างเดียว — ระบุไว้เป็นข้อจำกัดของชุดทดสอบนี้