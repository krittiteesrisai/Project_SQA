package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Unit tests สำหรับ {@link JsonGeneratorImpl}
 *
 * หมายเหตุ: คลาสนี้เป็น abstract จึงต้องสร้าง TestableGenerator (concrete subclass)
 * เพื่อ implement เมธอด abstract ของ GeneratorBase/JsonGenerator (ไม่ได้อยู่ในซอร์สที่ให้มา)
 * โดย implement แบบง่ายที่สุด (no-op / เก็บค่าไว้ตรวจสอบ) เพื่อให้สามารถ instantiate ได้
 * และไม่ส่งผลต่อ logic ที่ทดสอบจริงใน JsonGeneratorImpl
 */
public class JsonGeneratorImplTest {

    /* ================= Test Double ================= */

    static class TestableGenerator extends JsonGeneratorImpl {

        final StringBuilder written = new StringBuilder();

        TestableGenerator(IOContext ctxt, int features, ObjectCodec codec) {
            super(ctxt, features, codec);
        }

        @Override public void writeStartArray() throws IOException { written.append("["); }
        @Override public void writeEndArray() throws IOException { written.append("]"); }
        @Override public void writeStartObject() throws IOException { written.append("{"); }
        @Override public void writeEndObject() throws IOException { written.append("}"); }
        @Override public void writeFieldName(String name) throws IOException { written.append(name); }
        @Override public void writeString(String text) throws IOException { written.append(text); }
        @Override public void writeString(char[] text, int offset, int len) throws IOException {
            written.append(text, offset, len);
        }
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeRaw(String text) throws IOException { written.append(text); }
        @Override public void writeRaw(String text, int offset, int len) throws IOException {
            written.append(text.substring(offset, offset + len));
        }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException {
            written.append(text, offset, len);
        }
        @Override public void writeRaw(char c) throws IOException { written.append(c); }
        @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len)
                throws IOException {}
        @Override public void writeNumber(int v) throws IOException { written.append(v); }
        @Override public void writeNumber(long v) throws IOException { written.append(v); }
        @Override public void writeNumber(BigInteger v) throws IOException { written.append(v); }
        @Override public void writeNumber(double d) throws IOException { written.append(d); }
        @Override public void writeNumber(float f) throws IOException { written.append(f); }
        @Override public void writeNumber(BigDecimal dec) throws IOException { written.append(dec); }
        @Override public void writeNumber(String encodedValue) throws IOException { written.append(encodedValue); }
        @Override public void writeBoolean(boolean state) throws IOException { written.append(state); }
        @Override public void writeNull() throws IOException { written.append("null"); }
        @Override public void flush() throws IOException {}
        @Override protected void _releaseBuffers() {}
        @Override protected void _verifyValueWrite(String typeMsg) throws IOException {}

        // ให้เข้าถึง field protected ได้ง่าย (test อยู่ package เดียวกัน จึงเข้าถึง protected field ได้ตรง ๆ)
    }

    /* ================= Helper ================= */

    private IOContext createIOContext() {
        BufferRecycler br = new BufferRecycler();
        return new IOContext(br, new ByteArrayOutputStream(), true);
    }

    private TestableGenerator createGenerator(int features) {
        return new TestableGenerator(createIOContext(), features, null);
    }

    /* ================= Constructor: ESCAPE_NON_ASCII branch ================= */

    @Test
    public void testConstructor_escapeNonAsciiEnabled_setsMaxNonEscapedChar127() {
        int features = Feature.ESCAPE_NON_ASCII.getMask();
        TestableGenerator gen = createGenerator(features);
        assertEquals(127, gen.getHighestEscapedChar());
    }

    @Test
    public void testConstructor_escapeNonAsciiDisabled_maxNonEscapedCharDefaultZero() {
        int features = 0; // ESCAPE_NON_ASCII ไม่ถูก enable
        TestableGenerator gen = createGenerator(features);
        assertEquals(0, gen.getHighestEscapedChar());
    }

    /* ================= Constructor: QUOTE_FIELD_NAMES branch (_cfgUnqNames) ================= */

    @Test
    public void testConstructor_quoteFieldNamesEnabled_cfgUnqNamesFalse() {
        int features = Feature.QUOTE_FIELD_NAMES.getMask();
        TestableGenerator gen = createGenerator(features);
        assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void testConstructor_quoteFieldNamesDisabled_cfgUnqNamesTrue() {
        int features = 0; // ไม่ enable QUOTE_FIELD_NAMES
        TestableGenerator gen = createGenerator(features);
        assertTrue(gen._cfgUnqNames);
    }

    /* ================= enable(Feature) ================= */

    @Test
    public void testEnable_quoteFieldNames_setsCfgUnqNamesFalseAndReturnsThis() {
        TestableGenerator gen = createGenerator(0); // เริ่มด้วย _cfgUnqNames = true
        assertTrue(gen._cfgUnqNames);
        JsonGenerator result = gen.enable(Feature.QUOTE_FIELD_NAMES);
        assertFalse(gen._cfgUnqNames);
        assertSame(gen, result); // ตรวจ chainability
    }

    @Test
    public void testEnable_otherFeature_doesNotChangeCfgUnqNames() {
        TestableGenerator gen = createGenerator(0); // _cfgUnqNames = true ตั้งต้น
        gen.enable(Feature.ESCAPE_NON_ASCII); // f != QUOTE_FIELD_NAMES -> ไม่ควรเปลี่ยน
        assertTrue(gen._cfgUnqNames);
    }

    /* ================= configure(...) -> _checkStdFeatureChanges ================= */

    @Test
    public void testConfigure_disableQuoteFieldNames_setsCfgUnqNamesTrue() {
        TestableGenerator gen = createGenerator(Feature.QUOTE_FIELD_NAMES.getMask());
        assertFalse(gen._cfgUnqNames);
        gen.configure(Feature.QUOTE_FIELD_NAMES, false);
        assertTrue(gen._cfgUnqNames);
    }

    @Test
    public void testConfigure_enableQuoteFieldNames_setsCfgUnqNamesFalse() {
        TestableGenerator gen = createGenerator(0);
        assertTrue(gen._cfgUnqNames);
        gen.configure(Feature.QUOTE_FIELD_NAMES, true);
        assertFalse(gen._cfgUnqNames);
    }

    /* ================= setHighestNonEscapedChar / getHighestEscapedChar ================= */

    @Test
    public void testSetHighestNonEscapedChar_negative_clampsToZero() {
        TestableGenerator gen = createGenerator(0);
        JsonGenerator result = gen.setHighestNonEscapedChar(-100);
        assertEquals(0, gen.getHighestEscapedChar());
        assertSame(gen, result);
    }

    @Test
    public void testSetHighestNonEscapedChar_zero_boundary() {
        TestableGenerator gen = createGenerator(0);
        gen.setHighestNonEscapedChar(0);
        assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestNonEscapedChar_positiveValue() {
        TestableGenerator gen = createGenerator(0);
        gen.setHighestNonEscapedChar(255);
        assertEquals(255, gen.getHighestEscapedChar());
    }

    @Test
    public void testGetHighestEscapedChar_defaultZeroWhenNotSet() {
        TestableGenerator gen = createGenerator(0);
        assertEquals(0, gen.getHighestEscapedChar());
    }

    /* ================= setCharacterEscapes / getCharacterEscapes ================= */

    @Test
    public void testSetCharacterEscapes_null_resetsToDefaultEscapesAndGetterReturnsNull() {
        TestableGenerator gen = createGenerator(0);
        // ตั้งค่า custom ก่อน แล้วค่อย reset เป็น null เพื่อดู branch else -> if(null)
        CharacterEscapes custom = new CharacterEscapes() {
            private final int[] codes = new int[128];
            @Override public int[] getEscapeCodesForAscii() { return codes; }
            @Override public SerializableString getEscapeSequence(int ch) { return null; }
        };
        gen.setCharacterEscapes(custom);
        assertSame(custom, gen.getCharacterEscapes());

        JsonGenerator result = gen.setCharacterEscapes(null);
        assertNull(gen.getCharacterEscapes());
        // _outputEscapes ต้องกลับไปเป็น sOutputEscapes (static default)
        assertSame(JsonGeneratorImpl.sOutputEscapes, gen._outputEscapes);
        assertSame(gen, result);
    }

    @Test
    public void testSetCharacterEscapes_custom_updatesOutputEscapesAndGetter() {
        TestableGenerator gen = createGenerator(0);
        final int[] customCodes = new int[128];
        customCodes[0] = 99; // ค่าทดสอบเพื่อยืนยันว่าถูกนำไปใช้จริง
        CharacterEscapes custom = new CharacterEscapes() {
            @Override public int[] getEscapeCodesForAscii() { return customCodes; }
            @Override public SerializableString getEscapeSequence(int ch) { return null; }
        };
        gen.setCharacterEscapes(custom);
        assertSame(custom, gen.getCharacterEscapes());
        assertSame(customCodes, gen._outputEscapes);
    }

    /* ================= setRootValueSeparator ================= */

    @Test
    public void testSetRootValueSeparator_customValue() {
        TestableGenerator gen = createGenerator(0);
        SerializableString sep = new SerializedString(",");
        JsonGenerator result = gen.setRootValueSeparator(sep);
        assertSame(sep, gen._rootValueSeparator);
        assertSame(gen, result);
    }

    @Test
    public void testSetRootValueSeparator_null() {
        TestableGenerator gen = createGenerator(0);
        // ซอร์สโค้ดไม่มี null-check จึงอนุญาตให้ตั้งค่าเป็น null ได้ตรง ๆ (ตาม logic ที่ให้มา)
        gen.setRootValueSeparator(null);
        assertNull(gen._rootValueSeparator);
    }

    @Test
    public void testConstructor_defaultRootValueSeparator_notNull() {
        TestableGenerator gen = createGenerator(0);
        assertNotNull(gen._rootValueSeparator);
    }

    /* ================= version() ================= */

    @Test
    public void testVersion_notNull() {
        TestableGenerator gen = createGenerator(0);
        Version v = gen.version();
        assertNotNull(v);
    }

    /* ================= writeStringField(...) ================= */

    @Test
    public void testWriteStringField_normalValues() throws IOException {
        TestableGenerator gen = createGenerator(0);
        gen.writeStringField("name", "value");
        assertEquals("namevalue", gen.written.toString());
    }

    @Test
    public void testWriteStringField_emptyFieldNameAndValue() throws IOException {
        TestableGenerator gen = createGenerator(0);
        gen.writeStringField("", "");
        assertEquals("", gen.written.toString());
    }

    @Test
    public void testWriteStringField_nullValue() throws IOException {
        TestableGenerator gen = createGenerator(0);
        // writeString(null) ใน TestableGenerator แค่ append -> StringBuilder.append((String)null) = "null"
        gen.writeStringField("key", null);
        assertEquals("keynull", gen.written.toString());
    }
}
