package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

public class UTF8JsonGeneratorTest {

    private ByteArrayOutputStream out;
    private JsonFactory factory;

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        factory = new JsonFactory();
    }

    private UTF8JsonGenerator newGenerator() throws IOException {
        return (UTF8JsonGenerator) factory.createGenerator(out, JsonEncoding.UTF8);
    }

    private String result() throws IOException {
        return out.toString("UTF-8");
    }

    // ==================== structural: array/object ====================

    @Test
    public void testWriteStartEndArray() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartArray();
        g.writeEndArray();
        g.flush();
        assertEquals("[]", result());
    }

    @Test
    public void testWriteStartEndObject() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartObject();
        g.writeEndObject();
        g.flush();
        assertEquals("{}", result());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArrayWrongContext() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartObject();
        g.writeEndArray(); // context เป็น object ไม่ใช่ array -> _reportError
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObjectWrongContext() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartArray();
        g.writeEndObject(); // context เป็น array ไม่ใช่ object -> _reportError
    }

    @Test
    public void testNestedArraysWithComma() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartArray();
        g.writeStartArray();
        g.writeEndArray();
        g.writeStartArray(); // element ที่สอง -> ต้องมี comma แทรก
        g.writeEndArray();
        g.writeEndArray();
        g.flush();
        assertEquals("[[],[]]", result());
    }

    // ==================== field name ====================

    @Test
    public void testWriteFieldNameStringNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartObject();
        g.writeFieldName("abc");
        g.writeNumber(1);
        g.writeEndObject();
        g.flush();
        assertEquals("{\"abc\":1}", result());
    }

    @Test
    public void testWriteFieldNameStringLongOffline() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6000; i++) sb.append('a');
        String longName = sb.toString();
        g.writeStartObject();
        g.writeFieldName(longName); // len > _charBufferLength -> _writeStringSegments offline
        g.writeNumber(1);
        g.writeEndObject();
        g.flush();
        assertEquals("{\"" + longName + "\":1}", result());
    }

    @Test
    public void testWriteFieldNameCommaBetweenFields() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeFieldName("b"); // STATUS_OK_AFTER_COMMA branch
        g.writeNumber(2);
        g.writeEndObject();
        g.flush();
        assertEquals("{\"a\":1,\"b\":2}", result());
    }

    // สมมติฐาน: การเรียก writeFieldName ซ้ำโดยยังไม่ writeValue ให้ status STATUS_EXPECT_VALUE
    // ตามที่คอมเมนต์ในซอร์สระบุไว้ ("Can not write a field name, expecting a value")
    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldNameExpectingValueError() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeFieldName("b");
    }

    // สมมติฐาน: ปิด Feature.QUOTE_FIELD_NAMES ทำให้ _cfgUnqNames = true -> ไม่ใส่ quote รอบชื่อฟิลด์
    @Test
    public void testWriteFieldNameUnquoted() throws IOException {
        factory.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        UTF8JsonGenerator g = newGenerator();
        g.writeStartObject();
        g.writeFieldName("abc");
        g.writeNumber(1);
        g.writeEndObject();
        g.flush();
        assertEquals("{abc:1}", result());
    }

    @Test
    public void testWriteFieldNameSerializableStringNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        SerializableString name = new SerializedString("field");
        g.writeStartObject();
        g.writeFieldName(name);
        g.writeNumber(5);
        g.writeEndObject();
        g.flush();
        assertEquals("{\"field\":5}", result());
    }

    // ==================== string ====================

    @Test
    public void testWriteStringNull() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeString((String) null);
        g.flush();
        assertEquals("null", result());
    }

    @Test
    public void testWriteStringNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeString("hello");
        g.flush();
        assertEquals("\"hello\"", result());
    }

    @Test
    public void testWriteStringLongOffline() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) sb.append('x');
        String longStr = sb.toString();
        g.writeString(longStr); // len > _outputMaxContiguous -> _writeStringSegments offline
        g.flush();
        assertEquals("\"" + longStr + "\"", result());
    }

    @Test
    public void testWriteStringWithStandardEscapes() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeString("a\"b\\c\nd");
        g.flush();
        assertEquals("\"a\\\"b\\\\c\\nd\"", result());
    }

    @Test
    public void testWriteStringCharArray() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        char[] buf = "hello".toCharArray();
        g.writeString(buf, 0, buf.length);
        g.flush();
        assertEquals("\"hello\"", result());
    }

    @Test
    public void testWriteStringCharArrayLongOffline() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        char[] buf = new char[20000];
        java.util.Arrays.fill(buf, 'y');
        g.writeString(buf, 0, buf.length); // len > _outputMaxContiguous -> _writeStringSegments(char[])
        g.flush();
        assertEquals("\"" + new String(buf) + "\"", result());
    }

    @Test
    public void testWriteStringSerializableString() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeString(new SerializedString("hi"));
        g.flush();
        assertEquals("\"hi\"", result());
    }

    @Test
    public void testWriteStringEscapeNonAscii() throws IOException {
        factory.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
        UTF8JsonGenerator g = newGenerator();
        g.writeString("\u00e9"); // é -> ทำให้ _maximumNonEscapedChar != 0 -> _writeStringSegmentASCII2
        g.flush();
        assertEquals("\"\\u00e9\"", result());
    }

    // สมมติฐาน: setCharacterEscapes() อัปเดต _outputEscapes = esc.getEscapeCodesForAscii()
    // (พฤติกรรมมาตรฐานของ GeneratorBase ใน jackson-core)
    @Test
    public void testWriteStringCustomEscape() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        CharacterEscapes escapes = new CharacterEscapes() {
            private final int[] esc = CharacterEscapes.standardAsciiEscapesForJSON();
            {
                esc['a'] = CharacterEscapes.ESCAPE_CUSTOM;
            }
            @Override
            public int[] getEscapeCodesForAscii() {
                return esc;
            }
            @Override
            public SerializableString getEscapeSequence(int ch) {
                return (ch == 'a') ? new SerializedString("[A]") : null;
            }
        };
        g.setCharacterEscapes(escapes);
        g.writeString("abc");
        g.flush();
        assertEquals("\"[A]bc\"", result());
    }

    // ==================== raw utf8 / utf8 string ====================

    @Test
    public void testWriteRawUTF8String() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        byte[] raw = "hello".getBytes("UTF-8");
        g.writeRawUTF8String(raw, 0, raw.length);
        g.flush();
        assertEquals("\"hello\"", result());
    }

    @Test
    public void testWriteUTF8StringNoEscape() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        byte[] raw = "hello".getBytes("UTF-8");
        g.writeUTF8String(raw, 0, raw.length);
        g.flush();
        assertEquals("\"hello\"", result());
    }

    @Test
    public void testWriteUTF8StringWithEscape() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        byte[] raw = "a\"b".getBytes("UTF-8");
        g.writeUTF8String(raw, 0, raw.length); // ต้อง route ไป _writeUTF8Segment2
        g.flush();
        assertEquals("\"a\\\"b\"", result());
    }

    @Test
    public void testWriteUTF8StringLongSegmented() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) sb.append('z');
        byte[] raw = sb.toString().getBytes("UTF-8");
        g.writeUTF8String(raw, 0, raw.length); // len > _outputMaxContiguous -> _writeUTF8Segments
        g.flush();
        assertEquals("\"" + sb + "\"", result());
    }

    // ==================== raw ====================

    @Test
    public void testWriteRawString() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeRaw("<raw>");
        g.flush();
        assertEquals("<raw>", result());
    }

    @Test
    public void testWriteRawStringOffsetLenLongSegmented() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) sb.append('r');
        String s = sb.toString();
        g.writeRaw(s, 0, s.length()); // ทดสอบ while(len>0) loop หลายรอบ
        g.flush();
        assertEquals(s, result());
    }

    @Test
    public void testWriteRawSerializableString() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeRaw(new SerializedString("rawtext"));
        g.flush();
        assertEquals("rawtext", result());
    }

    @Test
    public void testWriteRawSerializableStringEmpty() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeRaw(new SerializedString("")); // raw.length == 0 -> ไม่เขียนอะไร
        g.flush();
        assertEquals("", result());
    }

    @Test
    public void testWriteRawValueSerializableString() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeRawValue(new SerializedString("123"));
        g.flush();
        assertEquals("123", result());
    }

    @Test
    public void testWriteRawCharArrayAsciiOnly() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        char[] buf = "abc".toCharArray();
        g.writeRaw(buf, 0, buf.length);
        g.flush();
        assertEquals("abc", result());
    }

    @Test
    public void testWriteRawCharArrayMultiByte() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        char[] buf = "a\u20ACb".toCharArray(); // euro sign (3-byte, ไม่ใช่ surrogate)
        g.writeRaw(buf, 0, buf.length);
        g.flush();
        assertEquals("a\u20ACb", result());
    }

    @Test
    public void testWriteRawCharArraySegmented() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        char[] buf = new char[50000];
        java.util.Arrays.fill(buf, 'q');
        g.writeRaw(buf, 0, buf.length); // len3 เกิน buffer -> _writeSegmentedRaw
        g.flush();
        assertEquals(new String(buf), result());
    }

    @Test
    public void testWriteRawCharAscii() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeRaw('x');
        g.flush();
        assertEquals("x", result());
    }

    @Test
    public void testWriteRawCharTwoByte() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeRaw('\u00e9');
        g.flush();
        assertEquals("\u00e9", result());
    }

    @Test
    public void testWriteRawCharThreeByte() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeRaw('\u20AC'); // exercise _outputRawMultiByteChar (non-surrogate branch)
        g.flush();
        assertEquals("\u20AC", result());
    }

    // ==================== binary ====================

    @Test
    public void testWriteBinaryByteArray() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        byte[] data = { 1, 2, 3, 4, 5 };
        g.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        g.flush();
        String expected = "\"" + Base64Variants.getDefaultVariant().encode(data) + "\"";
        assertEquals(expected, result());
    }

    @Test
    public void testWriteBinaryInputStreamKnownLength() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        byte[] data = { 10, 20, 30, 40, 50, 60 };
        int written = g.writeBinary(Base64Variants.getDefaultVariant(),
                new ByteArrayInputStream(data), data.length);
        g.flush();
        assertEquals(data.length, written);
        String expected = "\"" + Base64Variants.getDefaultVariant().encode(data) + "\"";
        assertEquals(expected, result());
    }

    @Test
    public void testWriteBinaryInputStreamUnknownLength() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        byte[] data = { 7, 8, 9 };
        int written = g.writeBinary(Base64Variants.getDefaultVariant(),
                new ByteArrayInputStream(data), -1);
        g.flush();
        assertEquals(data.length, written);
        String expected = "\"" + Base64Variants.getDefaultVariant().encode(data) + "\"";
        assertEquals(expected, result());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteBinaryInputStreamTooFewBytes() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        byte[] data = { 1, 2, 3 };
        g.writeBinary(Base64Variants.getDefaultVariant(),
                new ByteArrayInputStream(data), 10); // ขอ 10 ไบต์ แต่มีจริง 3 -> reportError
    }

    // ==================== numbers ====================

    @Test
    public void testWriteNumberShortNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber((short) 123);
        g.flush();
        assertEquals("123", result());
    }

    @Test
    public void testWriteNumberShortAsString() throws IOException {
        factory.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber((short) 123);
        g.flush();
        assertEquals("\"123\"", result());
    }

    @Test
    public void testWriteNumberIntNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(42);
        g.flush();
        assertEquals("42", result());
    }

    @Test
    public void testWriteNumberIntAsString() throws IOException {
        factory.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(42);
        g.flush();
        assertEquals("\"42\"", result());
    }

    @Test
    public void testWriteNumberLongNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(123456789012L);
        g.flush();
        assertEquals("123456789012", result());
    }

    @Test
    public void testWriteNumberLongAsString() throws IOException {
        factory.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(123456789012L);
        g.flush();
        assertEquals("\"123456789012\"", result());
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber((BigInteger) null);
        g.flush();
        assertEquals("null", result());
    }

    @Test
    public void testWriteNumberBigIntegerNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(BigInteger.valueOf(999));
        g.flush();
        assertEquals("999", result());
    }

    @Test
    public void testWriteNumberBigIntegerAsString() throws IOException {
        factory.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(BigInteger.valueOf(999));
        g.flush();
        assertEquals("\"999\"", result());
    }

    @Test
    public void testWriteNumberDoubleNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(3.14);
        g.flush();
        assertEquals("3.14", result());
    }

    @Test
    public void testWriteNumberDoubleNaNQuoted() throws IOException {
        // ค่า default ของ QUOTE_NON_NUMERIC_NUMBERS คือ true
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(Double.NaN);
        g.flush();
        assertEquals("\"NaN\"", result());
    }

    @Test
    public void testWriteNumberDoubleAsString() throws IOException {
        factory.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(1.5);
        g.flush();
        assertEquals("\"1.5\"", result());
    }

    @Test
    public void testWriteNumberFloatNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(2.5f);
        g.flush();
        assertEquals("2.5", result());
    }

    @Test
    public void testWriteNumberFloatNaNQuoted() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber(Float.NaN);
        g.flush();
        assertEquals("\"NaN\"", result());
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber((BigDecimal) null);
        g.flush();
        assertEquals("null", result());
    }

    @Test
    public void testWriteNumberBigDecimalNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        BigDecimal bd = new BigDecimal("1.230");
        g.writeNumber(bd);
        g.flush();
        assertEquals(bd.toString(), result());
    }

    @Test
    public void testWriteNumberBigDecimalAsString() throws IOException {
        factory.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        UTF8JsonGenerator g = newGenerator();
        BigDecimal bd = new BigDecimal("1.230");
        g.writeNumber(bd);
        g.flush();
        assertEquals("\"" + bd.toString() + "\"", result());
    }

    @Test
    public void testWriteNumberBigDecimalAsPlain() throws IOException {
        factory.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);
        UTF8JsonGenerator g = newGenerator();
        BigDecimal bd = new BigDecimal("1.23E+3");
        g.writeNumber(bd);
        g.flush();
        assertEquals(bd.toPlainString(), result());
    }

    @Test
    public void testWriteNumberStringEncodedNormal() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber("12345");
        g.flush();
        assertEquals("12345", result());
    }

    @Test
    public void testWriteNumberStringEncodedAsString() throws IOException {
        factory.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        UTF8JsonGenerator g = newGenerator();
        g.writeNumber("12345");
        g.flush();
        assertEquals("\"12345\"", result());
    }

    // ==================== boolean / null ====================

    @Test
    public void testWriteBooleanTrue() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeBoolean(true);
        g.flush();
        assertEquals("true", result());
    }

    @Test
    public void testWriteBooleanFalse() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeBoolean(false);
        g.flush();
        assertEquals("false", result());
    }

    @Test
    public void testWriteNull() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNull();
        g.flush();
        assertEquals("null", result());
    }

    // ==================== flush / close ====================

    static class TrackingOutputStream extends OutputStream {
        final ByteArrayOutputStream delegate = new ByteArrayOutputStream();
        boolean flushed = false;
        boolean closed = false;
        @Override public void write(int b) throws IOException { delegate.write(b); }
        @Override public void write(byte[] b, int off, int len) throws IOException { delegate.write(b, off, len); }
        @Override public void flush() throws IOException { flushed = true; }
        @Override public void close() throws IOException { closed = true; }
        String content() throws IOException { return delegate.toString("UTF-8"); }
    }

    @Test
    public void testFlushPassedToStreamEnabled() throws IOException {
        TrackingOutputStream tracker = new TrackingOutputStream();
        factory.configure(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM, true);
        JsonGenerator g = factory.createGenerator(tracker, JsonEncoding.UTF8);
        g.writeStartArray();
        g.writeEndArray();
        g.flush();
        assertTrue(tracker.flushed);
        assertEquals("[]", tracker.content());
    }

    @Test
    public void testFlushPassedToStreamDisabled() throws IOException {
        TrackingOutputStream tracker = new TrackingOutputStream();
        factory.configure(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM, false);
        JsonGenerator g = factory.createGenerator(tracker, JsonEncoding.UTF8);
        g.writeStartArray();
        g.writeEndArray();
        g.flush();
        assertFalse(tracker.flushed);
        assertEquals("[]", tracker.content());
    }

    @Test
    public void testCloseAutoClosesOpenArray() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartArray();
        g.writeNumber(1);
        g.close(); // AUTO_CLOSE_JSON_CONTENT default true
        assertEquals("[1]", result());
    }

    @Test
    public void testCloseAutoClosesOpenObject() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.close();
        assertEquals("{\"a\":1}", result());
    }

    @Test
    public void testCloseWithoutAutoCloseJsonContent() throws IOException {
        factory.configure(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT, false);
        UTF8JsonGenerator g = newGenerator();
        g.writeStartArray();
        g.writeNumber(1);
        g.close(); // ไม่ปิด context อัตโนมัติ
        assertEquals("[1", result());
    }

    @Test
    public void testCloseTargetAutoCloseTargetEnabled() throws IOException {
        TrackingOutputStream tracker = new TrackingOutputStream();
        // default AUTO_CLOSE_TARGET = true
        JsonGenerator g = factory.createGenerator(tracker, JsonEncoding.UTF8);
        g.writeStartArray();
        g.writeEndArray();
        g.close();
        assertTrue(tracker.closed);
    }

    @Test
    public void testCloseTargetAutoCloseTargetDisabled() throws IOException {
        TrackingOutputStream tracker = new TrackingOutputStream();
        factory.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        JsonGenerator g = factory.createGenerator(tracker, JsonEncoding.UTF8);
        g.writeStartArray();
        g.writeEndArray();
        g.close();
        assertFalse(tracker.closed);
    }

    // ==================== misc getters ====================

    @Test
    public void testGetOutputTarget() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        assertSame(out, g.getOutputTarget());
    }

    @Test
    public void testGetOutputBuffered() throws IOException {
        UTF8JsonGenerator g = newGenerator();
        g.writeNull(); // เขียน 4 ไบต์ลง buffer โดยไม่ flush
        assertEquals(4, g.getOutputBuffered());
        g.flush();
        assertEquals(0, g.getOutputBuffered());
    }
}
