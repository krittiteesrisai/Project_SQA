package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public class WriterBasedJsonGeneratorTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    /** helper: JsonFactory.createGenerator(Writer) จะสร้าง WriterBasedJsonGenerator ภายใน */
    private WriterBasedJsonGenerator newGenerator(Writer w) throws IOException {
        JsonGenerator g = factory.createGenerator(w);
        assertTrue("expected WriterBasedJsonGenerator", g instanceof WriterBasedJsonGenerator);
        return (WriterBasedJsonGenerator) g;
    }

    // =====================================================================
    // Structural: writeStartArray/EndArray/StartObject/EndObject
    // =====================================================================

    @Test
    public void testEmptyObject() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartObject();
        g.writeEndObject();
        g.close();
        assertEquals("{}", sw.toString());
    }

    @Test
    public void testEmptyArray() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeEndArray();
        g.close();
        assertEquals("[]", sw.toString());
    }

    @Test
    public void testNestedObjectArray() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeStartArray();
        g.writeNumber(1);
        g.writeNumber(2);
        g.writeEndArray();
        g.writeEndObject();
        g.close();
        assertEquals("{\"a\":[1,2]}", sw.toString());
    }

    @Test
    public void testWriteEndArrayWithoutStart_throws() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        try {
            g.writeEndArray();
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("Current context not an ARRAY"));
        }
        g.close();
    }

    @Test
    public void testWriteEndObjectWithoutStart_throws() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        try {
            g.writeEndObject();
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("Current context not an object"));
        }
        g.close();
    }

    @Test
    public void testMultipleFieldsCommaBefore() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeFieldName("b");
        g.writeNumber(2);
        g.writeEndObject();
        g.close();
        assertEquals("{\"a\":1,\"b\":2}", sw.toString());
    }

    @Test
    public void testManyFieldsForcesBufferFlush() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartObject();
        for (int i = 0; i < 2000; i++) {
            g.writeFieldName("f" + i);
            g.writeNumber(i);
        }
        g.writeEndObject();
        g.close();
        String out = sw.toString();
        assertTrue(out.startsWith("{\"f0\":0,"));
        assertTrue(out.endsWith("\"f1999\":1999}"));
    }

    // =====================================================================
    // writeFieldName(String) / writeFieldName(SerializableString)
    // =====================================================================

    @Test
    public void testFieldNameExpectingValueError() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartObject();
        g.writeFieldName("first");
        try {
            g.writeFieldName("second");
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("expecting a value"));
        }
        g.close();
    }

    @Test
    public void testFieldNameSerializableStringExpectingValueError() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartObject();
        g.writeFieldName(new SerializedString("first"));
        try {
            g.writeFieldName(new SerializedString("second"));
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("expecting a value"));
        }
        g.close();
    }

    @Test
    public void testUnquotedFieldNames() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeFieldName("b");
        g.writeNumber(2);
        g.writeEndObject();
        g.close();
        assertEquals("{a:1,b:2}", sw.toString());
    }

    @Test
    public void testUnquotedFieldNamesSerializableString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        g.writeStartObject();
        g.writeFieldName(new SerializedString("a"));
        g.writeNumber(1);
        g.writeEndObject();
        g.close();
        assertEquals("{a:1}", sw.toString());
    }

    @Test
    public void testFieldNameSerializableStringLong_forcesNonInlineBranch() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) sb.append('f');
        String longName = sb.toString();
        g.writeStartObject();
        g.writeFieldName(new SerializedString(longName));
        g.writeNumber(1);
        g.writeEndObject();
        g.close();
        assertEquals("{\"" + longName + "\":1}", sw.toString());
    }

    // =====================================================================
    // writeString(...)
    // =====================================================================

    @Test
    public void testWriteStringNull() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeString((String) null);
        g.writeEndArray();
        g.close();
        assertEquals("[null]", sw.toString());
    }

    @Test
    public void testWriteStringNormal() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeString("hello");
        g.writeEndArray();
        g.close();
        assertEquals("[\"hello\"]", sw.toString());
    }

    @Test
    public void testWriteStringWithStandardEscapes() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeString("a\"b\\c\nd");
        g.writeEndArray();
        g.close();
        assertEquals("[\"a\\\"b\\\\c\\nd\"]", sw.toString());
    }

    @Test
    public void testWriteLongString_triggersWriteLongStringPath() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) sb.append('x');
        String longStr = sb.toString();
        g.writeStartArray();
        g.writeString(longStr);
        g.writeEndArray();
        g.close();
        assertEquals("[\"" + longStr + "\"]", sw.toString());
    }

    @Test
    public void testWriteLongStringWithEscapes() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) sb.append("a\"");
        String longStr = sb.toString();
        g.writeStartArray();
        g.writeString(longStr);
        g.writeEndArray();
        g.close();
        assertTrue(sw.toString().startsWith("[\"a\\\"a\\\""));
    }

    @Test
    public void testWriteStringCharArray() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        char[] chars = "hi there".toCharArray();
        g.writeStartArray();
        g.writeString(chars, 0, chars.length);
        g.writeEndArray();
        g.close();
        assertEquals("[\"hi there\"]", sw.toString());
    }

    @Test
    public void testWriteStringSerializableStringShort() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeString(new SerializedString("short"));
        g.writeEndArray();
        g.close();
        assertEquals("[\"short\"]", sw.toString());
    }

    @Test
    public void testWriteStringSerializableStringLong_triggersFlushBranch() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50; i++) sb.append('y'); // >= SHORT_WRITE(32)
        g.writeStartArray();
        g.writeString(new SerializedString(sb.toString()));
        g.writeEndArray();
        g.close();
        assertEquals("[\"" + sb.toString() + "\"]", sw.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8StringUnsupported() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeRawUTF8String(new byte[]{1, 2, 3}, 0, 3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8StringUnsupported() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeUTF8String(new byte[]{1, 2, 3}, 0, 3);
    }

    // ---- ASCII-limited (_maximumNonEscapedChar) ----

    @Test
    public void testWriteStringWithMaxNonEscapedChar_short() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.setHighestNonEscapedChar(127);
        g.writeStartArray();
        g.writeString("caf\u00e9"); // 'é' > 127
        g.writeEndArray();
        g.close();
        String out = sw.toString();
        assertTrue(out.toLowerCase().contains("\\u00e9"));
    }

    @Test
    public void testWriteLongStringWithMaxNonEscapedChar() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.setHighestNonEscapedChar(127);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) sb.append(i % 100 == 0 ? '\u00e9' : 'x');
        g.writeString(sb.toString());
        g.close();
        assertTrue(sw.toString().toLowerCase().contains("\\u00e9"));
    }

    @Test
    public void testWriteStringCharArrayWithMaxNonEscapedChar() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.setHighestNonEscapedChar(127);
        char[] chars = "caf\u00e9".toCharArray();
        g.writeString(chars, 0, chars.length);
        g.close();
        assertTrue(sw.toString().toLowerCase().contains("\\u00e9"));
    }

    // ---- Custom escapes (_characterEscapes) ----

    @Test
    public void testWriteStringWithCustomEscapes_short() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        final int[] esc = CharacterEscapes.standardAsciiEscapesForJSON();
        esc['X'] = CharacterEscapes.ESCAPE_CUSTOM;
        CharacterEscapes custom = new CharacterEscapes() {
            @Override public int[] getEscapeCodesForAscii() { return esc; }
            @Override public SerializableString getEscapeSequence(int ch) {
                return (ch == 'X') ? new SerializedString("_X_") : null;
            }
        };
        g.setCharacterEscapes(custom);
        g.writeStartArray();
        g.writeString("aXb");
        g.writeEndArray();
        g.close();
        assertEquals("[\"a_X_b\"]", sw.toString());
    }

    @Test
    public void testWriteLongStringWithCustomEscapes() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        final int[] esc = CharacterEscapes.standardAsciiEscapesForJSON();
        esc['Q'] = CharacterEscapes.ESCAPE_CUSTOM;
        CharacterEscapes custom = new CharacterEscapes() {
            @Override public int[] getEscapeCodesForAscii() { return esc; }
            @Override public SerializableString getEscapeSequence(int ch) {
                return (ch == 'Q') ? new SerializedString("_Q_") : null;
            }
        };
        g.setCharacterEscapes(custom);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) sb.append(i % 50 == 0 ? 'Q' : 'x');
        g.writeString(sb.toString());
        g.close();
        assertTrue(sw.toString().contains("_Q_"));
    }

    @Test
    public void testWriteStringCharArrayWithCustomEscapes() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        final int[] esc = CharacterEscapes.standardAsciiEscapesForJSON();
        esc['Z'] = CharacterEscapes.ESCAPE_CUSTOM;
        CharacterEscapes custom = new CharacterEscapes() {
            @Override public int[] getEscapeCodesForAscii() { return esc; }
            @Override public SerializableString getEscapeSequence(int ch) {
                return (ch == 'Z') ? new SerializedString("_Z_") : null;
            }
        };
        g.setCharacterEscapes(custom);
        char[] chars = "aZb".toCharArray();
        g.writeString(chars, 0, chars.length);
        g.close();
        assertEquals("\"a_Z_b\"", sw.toString());
    }

    @Test
    public void testArrayManyStringsWithMixedEscapes() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        for (int i = 0; i < 500; i++) {
            if (i % 2 == 0) {
                g.writeString("plain" + i);
            } else {
                g.writeString("esc\"ape" + i + "\n");
            }
        }
        g.writeEndArray();
        g.close();
        String out = sw.toString();
        assertTrue(out.startsWith("[\"plain0\","));
        assertTrue(out.contains("\\\""));
        assertTrue(out.contains("\\n"));
    }

    // =====================================================================
    // writeRaw(...)
    // =====================================================================

    @Test
    public void testWriteRawStringShort() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeRaw("abc");
        g.close();
        assertEquals("abc", sw.toString());
    }

    @Test
    public void testWriteRawStringLong_triggersWriteRawLong() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) sb.append('z');
        String s = sb.toString();
        g.writeRaw(s);
        g.close();
        assertEquals(s, sw.toString());
    }

    @Test
    public void testWriteRawStringStartLen() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeRaw("hello world", 6, 5);
        g.close();
        assertEquals("world", sw.toString());
    }

    @Test
    public void testWriteRawStringStartLenLong() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        StringBuilder sb = new StringBuilder("PAD");
        for (int i = 0; i < 20000; i++) sb.append('w');
        String full = sb.toString();
        g.writeRaw(full, 3, full.length() - 3);
        g.close();
        assertEquals(full.substring(3), sw.toString());
    }

    @Test
    public void testWriteRawSerializableString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeRaw(new SerializedString("rawtext"));
        g.close();
        assertEquals("rawtext", sw.toString());
    }

    @Test
    public void testWriteRawCharArrayShort() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        char[] chars = "short".toCharArray();
        g.writeRaw(chars, 0, chars.length);
        g.close();
        assertEquals("short", sw.toString());
    }

    @Test
    public void testWriteRawCharArrayLong() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) chars[i] = 'L';
        g.writeRaw(chars, 0, chars.length); // len(100) >= SHORT_WRITE(32)
        g.close();
        assertEquals(new String(chars), sw.toString());
    }

    @Test
    public void testWriteRawChar() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeRaw('X');
        g.close();
        assertEquals("X", sw.toString());
    }

    // =====================================================================
    // writeBinary(...)
    // =====================================================================

    @Test
    public void testWriteBinaryByteArray() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        byte[] data = "Hello".getBytes("UTF-8");
        g.writeBinary(data);
        g.close();
        String out = sw.toString();
        assertTrue(out.startsWith("\""));
        assertTrue(out.endsWith("\""));
    }

    @Test
    public void testWriteBinaryByteArrayLarge_triggersLineBreak() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        byte[] data = new byte[200];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        g.writeBinary(Base64Variants.MIME, data, 0, data.length);
        g.close();
        assertTrue(sw.toString().contains("\\n"));
    }

    @Test
    public void testWriteBinaryInputStreamKnownLength() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        byte[] data = "abcdef".getBytes("UTF-8");
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int written = g.writeBinary(Base64Variants.getDefaultVariant(), bis, data.length);
        g.close();
        assertEquals(data.length, written);
        assertTrue(sw.toString().startsWith("\""));
    }

    @Test
    public void testWriteBinaryInputStreamUnknownLength() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        byte[] data = "abcdefgh".getBytes("UTF-8");
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int written = g.writeBinary(Base64Variants.getDefaultVariant(), bis, -1);
        g.close();
        assertEquals(data.length, written);
    }

    @Test
    public void testWriteBinaryInputStreamMissingBytes_throws() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        byte[] data = "abc".getBytes("UTF-8");
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        try {
            g.writeBinary(Base64Variants.getDefaultVariant(), bis, 10);
            fail("Expected JsonGenerationException (missing bytes)");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("Too few bytes available"));
        }
        g.close();
    }

    // =====================================================================
    // writeNumber(...)
    // =====================================================================

    @Test
    public void testWriteNumberShort() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber((short) 123);
        g.writeEndArray();
        g.close();
        assertEquals("[123]", sw.toString());
    }

    @Test
    public void testWriteNumberShortAsString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.writeStartArray();
        g.writeNumber((short) 42);
        g.writeEndArray();
        g.close();
        assertEquals("[\"42\"]", sw.toString());
    }

    @Test
    public void testWriteNumberInt() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber(123456);
        g.writeEndArray();
        g.close();
        assertEquals("[123456]", sw.toString());
    }

    @Test
    public void testWriteNumberIntAsString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.writeStartArray();
        g.writeNumber(7);
        g.writeEndArray();
        g.close();
        assertEquals("[\"7\"]", sw.toString());
    }

    @Test
    public void testWriteNumberLong() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber(123456789012345L);
        g.writeEndArray();
        g.close();
        assertEquals("[123456789012345]", sw.toString());
    }

    @Test
    public void testWriteNumberLongAsString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.writeStartArray();
        g.writeNumber(99L);
        g.writeEndArray();
        g.close();
        assertEquals("[\"99\"]", sw.toString());
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber((BigInteger) null);
        g.writeEndArray();
        g.close();
        assertEquals("[null]", sw.toString());
    }

    @Test
    public void testWriteNumberBigIntegerNormal() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber(BigInteger.valueOf(12345));
        g.writeEndArray();
        g.close();
        assertEquals("[12345]", sw.toString());
    }

    @Test
    public void testWriteNumberBigIntegerAsString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.writeStartArray();
        g.writeNumber(BigInteger.valueOf(555));
        g.writeEndArray();
        g.close();
        assertEquals("[\"555\"]", sw.toString());
    }

    @Test
    public void testWriteNumberDoubleNormal() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber(3.14d);
        g.writeEndArray();
        g.close();
        assertEquals("[3.14]", sw.toString());
    }

    @Test
    public void testWriteNumberDoubleAsString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.writeStartArray();
        g.writeNumber(2.5d);
        g.writeEndArray();
        g.close();
        assertEquals("[\"2.5\"]", sw.toString());
    }

    @Test
    public void testWriteNumberDoubleNaNQuoted() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS, true);
        g.writeStartArray();
        g.writeNumber(Double.NaN);
        g.writeEndArray();
        g.close();
        assertEquals("[\"NaN\"]", sw.toString());
    }

    @Test
    public void testWriteNumberDoubleInfiniteQuoted() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS, true);
        g.writeStartArray();
        g.writeNumber(Double.POSITIVE_INFINITY);
        g.writeEndArray();
        g.close();
        assertEquals("[\"Infinity\"]", sw.toString());
    }

    @Test
    public void testWriteNumberFloatNormal() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber(1.5f);
        g.writeEndArray();
        g.close();
        assertEquals("[1.5]", sw.toString());
    }

    @Test
    public void testWriteNumberFloatAsString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.writeStartArray();
        g.writeNumber(1.25f);
        g.writeEndArray();
        g.close();
        assertEquals("[\"1.25\"]", sw.toString());
    }

    @Test
    public void testWriteNumberFloatNaNQuoted() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS, true);
        g.writeStartArray();
        g.writeNumber(Float.NaN);
        g.writeEndArray();
        g.close();
        assertEquals("[\"NaN\"]", sw.toString());
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber((BigDecimal) null);
        g.writeEndArray();
        g.close();
        assertEquals("[null]", sw.toString());
    }

    @Test
    public void testWriteNumberBigDecimalNormal() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber(new BigDecimal("1.230"));
        g.writeEndArray();
        g.close();
        assertTrue(sw.toString().contains("1.23"));
    }

    @Test
    public void testWriteNumberBigDecimalAsPlain() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);
        g.writeStartArray();
        g.writeNumber(new BigDecimal("1E+2"));
        g.writeEndArray();
        g.close();
        assertEquals("[100]", sw.toString());
    }

    @Test
    public void testWriteNumberBigDecimalAsStringPlain() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);
        g.writeStartArray();
        g.writeNumber(new BigDecimal("1E+2"));
        g.writeEndArray();
        g.close();
        assertEquals("[\"100\"]", sw.toString());
    }

    @Test
    public void testWriteNumberBigDecimalAsStringNonPlain() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.writeStartArray();
        g.writeNumber(new BigDecimal("12.34"));
        g.writeEndArray();
        g.close();
        assertTrue(sw.toString().startsWith("[\""));
    }

    @Test
    public void testWriteNumberStringEncodedNormal() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNumber("12345");
        g.writeEndArray();
        g.close();
        assertEquals("[12345]", sw.toString());
    }

    @Test
    public void testWriteNumberStringEncodedAsString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        g.writeStartArray();
        g.writeNumber("6789");
        g.writeEndArray();
        g.close();
        assertEquals("[\"6789\"]", sw.toString());
    }

    // =====================================================================
    // writeBoolean / writeNull
    // =====================================================================

    @Test
    public void testWriteBooleanTrue() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeBoolean(true);
        g.writeEndArray();
        g.close();
        assertEquals("[true]", sw.toString());
    }

    @Test
    public void testWriteBooleanFalse() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeBoolean(false);
        g.writeEndArray();
        g.close();
        assertEquals("[false]", sw.toString());
    }

    @Test
    public void testWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        g.writeNull();
        g.writeEndArray();
        g.close();
        assertEquals("[null]", sw.toString());
    }

    // =====================================================================
    // _verifyValueWrite: root separator / comma / colon
    // =====================================================================

    @Test
    public void testMultipleRootValuesDefaultSeparator() throws IOException {
        // สมมติ: root value separator เริ่มต้นคือ " " (ค่ามาตรฐานของ Jackson)
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeNumber(1);
        g.writeNumber(2);
        g.close();
        assertEquals("1 2", sw.toString());
    }

    // =====================================================================
    // Pretty printer paths
    // =====================================================================

    @Test
    public void testPrettyPrinterObjectArray() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.setPrettyPrinter(new DefaultPrettyPrinter());
        g.writeStartObject();
        g.writeFieldName("arr");
        g.writeStartArray();
        g.writeNumber(1);
        g.writeNumber(2);
        g.writeEndArray();
        g.writeEndObject();
        g.close();
        String out = sw.toString();
        assertTrue(out.contains("arr"));
        assertTrue(out.contains("1"));
        assertTrue(out.contains("2"));
    }

    @Test
    public void testPrettyPrinterUnquotedFieldName() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.setPrettyPrinter(new DefaultPrettyPrinter());
        g.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        g.writeStartObject();
        g.writeFieldName("k");
        g.writeNumber(1);
        g.writeFieldName("k2");
        g.writeNumber(2);
        g.writeEndObject();
        g.close();
        String out = sw.toString();
        assertTrue(out.contains("k"));
        assertTrue(out.contains("k2"));
    }

    @Test
    public void testPrettyPrinterFieldNameSerializable() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.setPrettyPrinter(new DefaultPrettyPrinter());
        g.writeStartObject();
        g.writeFieldName(new SerializedString("k1"));
        g.writeNumber(1);
        g.writeFieldName(new SerializedString("k2"));
        g.writeNumber(2);
        g.writeEndObject();
        g.close();
        String out = sw.toString();
        assertTrue(out.contains("k1"));
        assertTrue(out.contains("k2"));
    }

    // =====================================================================
    // close()/flush() behaviors
    // =====================================================================

    @Test
    public void testAutoCloseJsonContentEnabled_closesOpenScopes() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        assertTrue(g.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeStartArray();
        g.writeNumber(1);
        // ตั้งใจไม่ปิด array/object เอง
        g.close();
        assertEquals("{\"a\":[1]}", sw.toString());
    }

    @Test
    public void testAutoCloseJsonContentDisabled_doesNotClose() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.configure(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT, false);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.close();
        assertEquals("{\"a\":1", sw.toString());
    }

    @Test
    public void testFlushPassedToStreamEnabled() throws IOException {
        final boolean[] flushed = {false};
        Writer w = new StringWriter() {
            @Override
            public void flush() {
                flushed[0] = true;
            }
        };
        WriterBasedJsonGenerator g = newGenerator(w);
        g.writeStartArray();
        g.writeEndArray();
        g.flush();
        assertTrue(flushed[0]);
        g.close();
    }

    @Test
    public void testFlushPassedToStreamDisabled() throws IOException {
        final boolean[] flushed = {false};
        Writer w = new StringWriter() {
            @Override
            public void flush() {
                flushed[0] = true;
            }
        };
        WriterBasedJsonGenerator g = newGenerator(w);
        g.configure(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM, false);
        g.writeStartArray();
        g.writeEndArray();
        g.flush();
        assertFalse(flushed[0]);
        g.close();
    }

    // =====================================================================
    // getOutputTarget / getOutputBuffered
    // =====================================================================

    @Test
    public void testGetOutputTarget() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        assertSame(sw, g.getOutputTarget());
        g.close();
    }

    @Test
    public void testGetOutputBufferedInitiallyZero() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        assertEquals(0, g.getOutputBuffered());
        g.close();
    }

    @Test
    public void testGetOutputBufferedAfterWrite() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator g = newGenerator(sw);
        g.writeStartArray();
        assertTrue(g.getOutputBuffered() > 0);
        g.writeEndArray();
        g.close();
    }
}
