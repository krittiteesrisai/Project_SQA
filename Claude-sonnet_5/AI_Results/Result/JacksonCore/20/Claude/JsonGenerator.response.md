# JsonGeneratorTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- `JsonGenerator` เป็น abstract class จึงต้องสร้าง concrete subclass (`DummyGenerator`) เพื่อ implement abstract method ทั้งหมด (44 เมธอด) และใช้ "บันทึกเหตุการณ์" (events list) เพื่อตรวจสอบว่า default/concrete method ใน `JsonGenerator` เรียก abstract method ที่ถูกต้องหรือไม่
- เมธอด `copyCurrentEvent(JsonParser)` และ `copyCurrentStructure(JsonParser)` **ไม่ได้ทดสอบ** เนื่องจาก `JsonParser` เป็น abstract class ที่มี abstract method จำนวนมากซึ่งไม่มีซอร์สให้ในโจทย์ และไม่มี mocking framework (เช่น Mockito) อยู่ใน classpath ที่กำหนด การเขียน fake ทั้งหมดจะเป็นการ "เดา" signature ที่ไม่ปลอดภัย จึงขอ skip พร้อมคอมเมนต์กำกับในโค้ด
- ใช้ `SerializedString` (concrete implementation มาตรฐานของ `SerializableString` ที่อยู่ใน jackson-core module เดียวกัน) เพื่อทดสอบ default method ที่รับ `SerializableString`
- ค่า mask default (31) คำนวณจาก `Feature` enum ตาม default state ที่ระบุใน source: AUTO_CLOSE_TARGET, AUTO_CLOSE_JSON_CONTENT, FLUSH_PASSED_TO_STREAM, QUOTE_FIELD_NAMES, QUOTE_NON_NUMERIC_NUMBERS = true (bit 0-4) => 0b11111 = 31

```java
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;

public class JsonGeneratorTest {

    /* ============================================================
     * Dummy concrete implementation ของ JsonGenerator
     * ใช้บันทึก event เพื่อตรวจสอบ delegation ของ default method
     * ============================================================ */
    static class DummyGenerator extends JsonGenerator {
        List<String> events = new ArrayList<String>();
        int featureMask = Feature.collectDefaults();
        boolean closed = false;
        ObjectCodec codec;
        JsonStreamContext ctx = null; // default null -> ทดสอบ branch ctx==null

        // สำหรับตรวจสอบ writeBinary(byte[]...) delegation
        Base64Variant lastVariant;
        byte[] lastData;
        int lastOffset;
        int lastLen;

        // สำหรับตรวจสอบ writeBinary(InputStream...) delegation
        Base64Variant lastStreamVariant;
        int lastStreamLength;

        @Override public JsonGenerator setCodec(ObjectCodec oc) { this.codec = oc; return this; }
        @Override public ObjectCodec getCodec() { return codec; }
        @Override public Version version() { return Version.unknownVersion(); }

        @Override public JsonGenerator enable(Feature f) { featureMask |= f.getMask(); return this; }
        @Override public JsonGenerator disable(Feature f) { featureMask &= ~f.getMask(); return this; }
        @Override public boolean isEnabled(Feature f) { return f.enabledIn(featureMask); }
        @Override public int getFeatureMask() { return featureMask; }
        @Override public JsonGenerator setFeatureMask(int values) { this.featureMask = values; return this; }

        @Override public JsonGenerator useDefaultPrettyPrinter() { events.add("useDefaultPP"); return this; }

        @Override public void writeStartArray() throws IOException { events.add("startArray"); }
        @Override public void writeEndArray() throws IOException { events.add("endArray"); }
        @Override public void writeStartObject() throws IOException { events.add("startObject"); }
        @Override public void writeEndObject() throws IOException { events.add("endObject"); }

        @Override public void writeFieldName(String name) throws IOException { events.add("fieldName:" + name); }
        @Override public void writeFieldName(SerializableString name) throws IOException {
            events.add("fieldNameSS:" + name.getValue());
        }

        @Override public void writeString(String text) throws IOException { events.add("string:" + text); }
        @Override public void writeString(char[] text, int offset, int len) throws IOException {
            events.add("stringChars:" + new String(text, offset, len));
        }
        @Override public void writeString(SerializableString text) throws IOException {
            events.add("stringSS:" + text.getValue());
        }
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {
            events.add("rawUtf8");
        }
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException {
            events.add("utf8String");
        }

        @Override public void writeRaw(String text) throws IOException { events.add("raw:" + text); }
        @Override public void writeRaw(String text, int offset, int len) throws IOException { events.add("rawOffset"); }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException { events.add("rawChars"); }
        @Override public void writeRaw(char c) throws IOException { events.add("rawChar:" + c); }

        @Override public void writeRawValue(String text) throws IOException { events.add("rawValue:" + text); }
        @Override public void writeRawValue(String text, int offset, int len) throws IOException { events.add("rawValueOffset"); }
        @Override public void writeRawValue(char[] text, int offset, int len) throws IOException { events.add("rawValueChars"); }

        @Override public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) throws IOException {
            events.add("binary");
            lastVariant = bv; lastData = data; lastOffset = offset; lastLen = len;
        }
        @Override public int writeBinary(Base64Variant bv, InputStream data, int dataLength) throws IOException {
            events.add("binaryStream");
            lastStreamVariant = bv; lastStreamLength = dataLength;
            return dataLength;
        }

        @Override public void writeNumber(int v) throws IOException { events.add("int:" + v); }
        @Override public void writeNumber(long v) throws IOException { events.add("long:" + v); }
        @Override public void writeNumber(BigInteger v) throws IOException { events.add("bigint:" + v); }
        @Override public void writeNumber(double v) throws IOException { events.add("double:" + v); }
        @Override public void writeNumber(float v) throws IOException { events.add("float:" + v); }
        @Override public void writeNumber(BigDecimal v) throws IOException { events.add("bigdec:" + v); }
        @Override public void writeNumber(String encodedValue) throws IOException { events.add("numstr:" + encodedValue); }

        @Override public void writeBoolean(boolean state) throws IOException { events.add("bool:" + state); }
        @Override public void writeNull() throws IOException { events.add("null"); }

        @Override public void writeObject(Object pojo) throws IOException { events.add("object:" + pojo); }
        @Override public void writeTree(TreeNode rootNode) throws IOException { events.add("tree"); }

        @Override public JsonStreamContext getOutputContext() { return ctx; }

        @Override public void flush() throws IOException { events.add("flush"); }
        @Override public boolean isClosed() { return closed; }
        @Override public void close() throws IOException { closed = true; events.add("close"); }

        // ---- wrapper สำหรับเข้าถึง protected method เพื่อทดสอบตรง ----
        void callVerifyOffsets(int len, int off, int l) { _verifyOffsets(len, off, l); }
        void callWriteSimpleObject(Object v) throws IOException { _writeSimpleObject(v); }
        void callReportError(String msg) throws JsonGenerationException { _reportError(msg); }
        void callReportUnsupported() { _reportUnsupportedOperation(); }
    }

    // เลขนำ Number ที่ไม่ตรงกับ subtype ใดๆ ที่ _writeSimpleObject รู้จัก
    static class WeirdNumber extends Number {
        @Override public int intValue() { return 0; }
        @Override public long longValue() { return 0; }
        @Override public float floatValue() { return 0; }
        @Override public double doubleValue() { return 0; }
    }

    private DummyGenerator gen;

    @Before
    public void setUp() {
        gen = new DummyGenerator();
    }

    /* ============================================================
     * Feature enum
     * ============================================================ */

    @Test
    public void testCollectDefaults() {
        // AUTO_CLOSE_TARGET, AUTO_CLOSE_JSON_CONTENT, FLUSH_PASSED_TO_STREAM,
        // QUOTE_FIELD_NAMES, QUOTE_NON_NUMERIC_NUMBERS = true (bit0..bit4)
        assertEquals(0b11111, JsonGenerator.Feature.collectDefaults());
    }

    @Test
    public void testFeatureEnabledByDefault_trueCase() {
        assertTrue(JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledByDefault());
    }

    @Test
    public void testFeatureEnabledByDefault_falseCase() {
        assertFalse(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledByDefault());
        assertFalse(JsonGenerator.Feature.IGNORE_UNKNOWN.enabledByDefault());
    }

    @Test
    public void testFeatureGetMask() {
        assertEquals(1, JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask());
        assertEquals(1 << JsonGenerator.Feature.IGNORE_UNKNOWN.ordinal(),
                JsonGenerator.Feature.IGNORE_UNKNOWN.getMask());
    }

    @Test
    public void testFeatureEnabledIn_trueAndFalse() {
        int mask = JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask();
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledIn(mask));
        assertFalse(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledIn(0));
    }

    /* ============================================================
     * configure() / enable/disable/isEnabled
     * ============================================================ */

    @Test
    public void testConfigure_enableBranch() {
        gen.disable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        JsonGenerator ret = gen.configure(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION, true);
        assertSame(gen, ret); // chaining
        assertTrue(gen.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testConfigure_disableBranch() {
        gen.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        gen.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        assertFalse(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    /* ============================================================
     * overrideStdFeatures / getFormatFeatures / overrideFormatFeatures
     * ============================================================ */

    @Test
    public void testOverrideStdFeatures() {
        gen.setFeatureMask(0); // ปิดทุก feature
        int values = JsonGenerator.Feature.IGNORE_UNKNOWN.getMask();
        int mask = JsonGenerator.Feature.IGNORE_UNKNOWN.getMask() | JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        gen.overrideStdFeatures(values, mask);
        assertTrue(gen.isEnabled(JsonGenerator.Feature.IGNORE_UNKNOWN));
        assertFalse(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testGetFormatFeatures_defaultZero() {
        assertEquals(0, gen.getFormatFeatures());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOverrideFormatFeatures_throws() {
        gen.overrideFormatFeatures(1, 1);
    }

    /* ============================================================
     * Schema
     * ============================================================ */

    @Test(expected = UnsupportedOperationException.class)
    public void testSetSchema_throwsUnsupported() {
        FormatSchema schema = new FormatSchema() {
            @Override public String getSchemaType() { return "dummy-schema"; }
        };
        gen.setSchema(schema);
    }

    @Test
    public void testGetSchema_defaultNull() {
        assertNull(gen.getSchema());
    }

    /* ============================================================
     * Pretty printer
     * ============================================================ */

    @Test
    public void testSetGetPrettyPrinter() {
        assertNull(gen.getPrettyPrinter());
        PrettyPrinter pp = new MinimalPrettyPrinter(); // concrete class ที่มีอยู่ใน jackson-core
        JsonGenerator ret = gen.setPrettyPrinter(pp);
        assertSame(gen, ret);
        assertSame(pp, gen.getPrettyPrinter());
    }

    /* ============================================================
     * Escaping-related default methods
     * ============================================================ */

    @Test
    public void testSetHighestNonEscapedChar_returnsThis() {
        JsonGenerator ret = gen.setHighestNonEscapedChar(127);
        assertSame(gen, ret);
    }

    @Test
    public void testGetHighestEscapedChar_defaultZero() {
        assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testCharacterEscapes_defaultNullAndChain() {
        assertNull(gen.getCharacterEscapes());
        JsonGenerator ret = gen.setCharacterEscapes(null);
        assertSame(gen, ret);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetRootValueSeparator_throws() {
        gen.setRootValueSeparator(new SerializedString(","));
    }

    /* ============================================================
     * Output state accessors
     * ============================================================ */

    @Test
    public void testGetOutputTarget_defaultNull() {
        assertNull(gen.getOutputTarget());
    }

    @Test
    public void testGetOutputBuffered_defaultMinusOne() {
        assertEquals(-1, gen.getOutputBuffered());
    }

    @Test
    public void testGetCurrentValue_ctxNull() {
        // branch: ctxt == null -> null
        assertNull(gen.getCurrentValue());
    }

    @Test
    public void testSetCurrentValue_ctxNull_noException() {
        // branch: ctxt == null -> ไม่ทำอะไร ไม่ throw
        gen.setCurrentValue("value");
        // ไม่มี exception ถือว่า pass
    }
    // หมายเหตุ: กรณี ctxt != null ไม่ได้ทดสอบ เพราะ JsonStreamContext เป็น abstract class
    // ที่ไม่มีซอร์สโค้ดให้ในโจทย์ จึงไม่สามารถสร้าง fake ได้อย่างปลอดภัยโดยไม่เดา

    /* ============================================================
     * Capability introspection (default values)
     * ============================================================ */

    @Test
    public void testCapabilityDefaults() {
        FormatSchema schema = new FormatSchema() {
            @Override public String getSchemaType() { return "x"; }
        };
        assertFalse(gen.canUseSchema(schema));
        assertFalse(gen.canWriteObjectId());
        assertFalse(gen.canWriteTypeId());
        assertFalse(gen.canWriteBinaryNatively());
        assertTrue(gen.canOmitFields());
        assertFalse(gen.canWriteFormattedNumbers());
    }

    /* ============================================================
     * writeStartArray(int) / writeStartObject(Object)
     * ============================================================ */

    @Test
    public void testWriteStartArrayWithSize_delegates() throws IOException {
        gen.writeStartArray(5);
        assertEquals(1, gen.events.size());
        assertEquals("startArray", gen.events.get(0));
    }

    @Test
    public void testWriteStartArrayWithNegativeSize_noValidation() throws IOException {
        // ไม่มีการตรวจสอบค่า size ในซอร์ส -> เรียก writeStartArray() ตรงๆ ไม่ throw
        gen.writeStartArray(-1);
        assertEquals("startArray", gen.events.get(0));
    }

    @Test
    public void testWriteStartObjectWithForValue_ctxNull() throws IOException {
        gen.writeStartObject("payload");
        assertTrue(gen.events.contains("startObject"));
        // setCurrentValue ภายในถูกเรียกแต่ ctx เป็น null จึงไม่มี side-effect เพิ่ม
    }

    /* ============================================================
     * writeArray(int[]/long[]/double[])
     * ============================================================ */

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArrayInt_nullArray() throws IOException {
        gen.writeArray((int[]) null, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArrayLong_nullArray() throws IOException {
        gen.writeArray((long[]) null, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArrayDouble_nullArray() throws IOException {
        gen.writeArray((double[]) null, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArrayInt_invalidOffset() throws IOException {
        gen.writeArray(new int[]{1, 2, 3}, -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArrayInt_lengthTooLarge() throws IOException {
        gen.writeArray(new int[]{1, 2, 3}, 1, 3); // 1+3 > 3
    }

    @Test
    public void testWriteArrayInt_normal() throws IOException {
        gen.writeArray(new int[]{10, 20, 30}, 0, 3);
        assertEquals("startArray", gen.events.get(0));
        assertEquals("int:10", gen.events.get(1));
        assertEquals("int:20", gen.events.get(2));
        assertEquals("int:30", gen.events.get(3));
        assertEquals("endArray", gen.events.get(4));
    }

    @Test
    public void testWriteArrayInt_zeroLength_boundary() throws IOException {
        gen.writeArray(new int[]{10, 20, 30}, 1, 0); // loop ไม่ทำงาน
        assertEquals("startArray", gen.events.get(0));
        assertEquals("endArray", gen.events.get(1));
        assertEquals(2, gen.events.size());
    }

    @Test
    public void testWriteArrayLong_normal() throws IOException {
        gen.writeArray(new long[]{1L, 2L}, 0, 2);
        assertEquals("long:1", gen.events.get(1));
        assertEquals("long:2", gen.events.get(2));
    }

    @Test
    public void testWriteArrayDouble_normal() throws IOException {
        gen.writeArray(new double[]{1.5, 2.5}, 0, 2);
        assertEquals("double:1.5", gen.events.get(1));
        assertEquals("double:2.5", gen.events.get(2));
    }

    /* ============================================================
     * writeFieldId
     * ============================================================ */

    @Test
    public void testWriteFieldId_delegatesToWriteFieldName() throws IOException {
        gen.writeFieldId(123L);
        assertEquals("fieldName:123", gen.events.get(0));
    }

    /* ============================================================
     * writeBinary defaults
     * ============================================================ */

    @Test
    public void testWriteBinary_offsetLen_defaultVariant() throws IOException {
        byte[] data = {1, 2, 3, 4};
        gen.writeBinary(data, 1, 2);
        assertSame(Base64Variants.getDefaultVariant(), gen.lastVariant);
        assertSame(data, gen.lastData);
        assertEquals(1, gen.lastOffset);
        assertEquals(2, gen.lastLen);
    }

    @Test
    public void testWriteBinary_wholeArray_defaultVariant() throws IOException {
        byte[] data = {1, 2, 3};
        gen.writeBinary(data);
        assertEquals(0, gen.lastOffset);
        assertEquals(data.length, gen.lastLen);
    }

    @Test
    public void testWriteBinary_stream_defaultVariant() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        int result = gen.writeBinary(in, 3);
        assertSame(Base64Variants.getDefaultVariant(), gen.lastStreamVariant);
        assertEquals(3, gen.lastStreamLength);
        assertEquals(3, result);
    }

    /* ============================================================
     * writeNumber(short) default
     * ============================================================ */

    @Test
    public void testWriteNumberShort_delegatesToInt() throws IOException {
        gen.writeNumber((short) 7);
        assertEquals("int:7", gen.events.get(0));
    }

    /* ============================================================
     * writeEmbeddedObject / writeObjectId / writeObjectRef / writeTypeId
     * ============================================================ */

    @Test(expected = JsonGenerationException.class)
    public void testWriteEmbeddedObject_throws() throws IOException {
        gen.writeEmbeddedObject(new Object());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteObjectId_throws() throws IOException {
        gen.writeObjectId(new Object());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteObjectRef_throws() throws IOException {
        gen.writeObjectRef(new Object());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteTypeId_throws() throws IOException {
        gen.writeTypeId(new Object());
    }

    /* ============================================================
     * Convenience field-write methods
     * ============================================================ */

    @Test
    public void testWriteStringField() throws IOException {
        gen.writeStringField("k", "v");
        assertEquals("fieldName:k", gen.events.get(0));
        assertEquals("string:v", gen.events.get(1));
    }

    @Test
    public void testWriteBooleanField() throws IOException {
        gen.writeBooleanField("k", true);
        assertEquals("fieldName:k", gen.events.get(0));
        assertEquals("bool:true", gen.events.get(1));
    }

    @Test
    public void testWriteNullField() throws IOException {
        gen.writeNullField("k");
        assertEquals("fieldName:k", gen.events.get(0));
        assertEquals("null", gen.events.get(1));
    }

    @Test
    public void testWriteNumberField_int() throws IOException {
        gen.writeNumberField("k", 5);
        assertEquals("int:5", gen.events.get(1));
    }

    @Test
    public void testWriteNumberField_long() throws IOException {
        gen.writeNumberField("k", 5L);
        assertEquals("long:5", gen.events.get(1));
    }

    @Test
    public void testWriteNumberField_double() throws IOException {
        gen.writeNumberField("k", 5.0);
        assertEquals("double:5.0", gen.events.get(1));
    }

    @Test
    public void testWriteNumberField_float() throws IOException {
        gen.writeNumberField("k", 5.0f);
        assertEquals("float:5.0", gen.events.get(1));
    }

    @Test
    public void testWriteNumberField_bigDecimal() throws IOException {
        gen.writeNumberField("k", BigDecimal.TEN);
        assertEquals("bigdec:10", gen.events.get(1));
    }

    @Test
    public void testWriteBinaryField() throws IOException {
        byte[] data = {9, 9};
        gen.writeBinaryField("k", data);
        assertEquals("fieldName:k", gen.events.get(0));
        assertEquals("binary", gen.events.get(1));
        assertEquals(0, gen.lastOffset);
        assertEquals(2, gen.lastLen);
    }

    @Test
    public void testWriteArrayFieldStart() throws IOException {
        gen.writeArrayFieldStart("k");
        assertEquals("fieldName:k", gen.events.get(0));
        assertEquals("startArray", gen.events.get(1));
    }

    @Test
    public void testWriteObjectFieldStart() throws IOException {
        gen.writeObjectFieldStart("k");
        assertEquals("fieldName:k", gen.events.get(0));
        assertEquals("startObject", gen.events.get(1));
    }

    @Test
    public void testWriteObjectField() throws IOException {
        gen.writeObjectField("k", "pojo");
        assertEquals("fieldName:k", gen.events.get(0));
        assertEquals("object:pojo", gen.events.get(1));
    }

    @Test
    public void testWriteOmittedField_noop() throws IOException {
        gen.writeOmittedField("k");
        assertTrue(gen.events.isEmpty());
    }

    /* ============================================================
     * SerializableString-based default methods (writeRaw / writeRawValue)
     * ============================================================ */

    @Test
    public void testWriteRaw_serializableString_delegates() throws IOException {
        gen.writeRaw(new SerializedString("abc"));
        assertEquals("raw:abc", gen.events.get(0));
    }

    @Test
    public void testWriteRawValue_serializableString_delegates() throws IOException {
        gen.writeRawValue(new SerializedString("xyz"));
        assertEquals("rawValue:xyz", gen.events.get(0));
    }

    /* ============================================================
     * _verifyOffsets (protected, boundary tests)
     * ============================================================ */

    @Test
    public void testVerifyOffsets_validExact() {
        gen.callVerifyOffsets(5, 0, 5); // offset+length == arrayLength (boundary, valid)
    }

    @Test
    public void testVerifyOffsets_validPartial() {
        gen.callVerifyOffsets(5, 2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyOffsets_negativeOffset() {
        gen.callVerifyOffsets(5, -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyOffsets_lengthExceeds() {
        gen.callVerifyOffsets(5, 3, 3); // 3+3 > 5
    }

    /* ============================================================
     * _writeSimpleObject (protected, ทุก branch)
     * ============================================================ */

    @Test
    public void testWriteSimpleObject_null() throws IOException {
        gen.callWriteSimpleObject(null);
        assertEquals("null", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_string() throws IOException {
        gen.callWriteSimpleObject("hi");
        assertEquals("string:hi", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_integer() throws IOException {
        gen.callWriteSimpleObject(Integer.valueOf(1));
        assertEquals("int:1", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_long() throws IOException {
        gen.callWriteSimpleObject(Long.valueOf(1L));
        assertEquals("long:1", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_double() throws IOException {
        gen.callWriteSimpleObject(Double.valueOf(1.0));
        assertEquals("double:1.0", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_float() throws IOException {
        gen.callWriteSimpleObject(Float.valueOf(1.0f));
        assertEquals("float:1.0", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_short() throws IOException {
        gen.callWriteSimpleObject(Short.valueOf((short) 1));
        assertEquals("int:1", gen.events.get(0)); // short -> default method -> int
    }

    @Test
    public void testWriteSimpleObject_byte() throws IOException {
        gen.callWriteSimpleObject(Byte.valueOf((byte) 1));
        assertEquals("int:1", gen.events.get(0)); // byte -> writeNumber(short) -> int
    }

    @Test
    public void testWriteSimpleObject_bigInteger() throws IOException {
        gen.callWriteSimpleObject(BigInteger.ONE);
        assertEquals("bigint:1", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_bigDecimal() throws IOException {
        gen.callWriteSimpleObject(BigDecimal.ONE);
        assertEquals("bigdec:1", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_atomicInteger() throws IOException {
        gen.callWriteSimpleObject(new AtomicInteger(9));
        assertEquals("int:9", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_atomicLong() throws IOException {
        gen.callWriteSimpleObject(new AtomicLong(9L));
        assertEquals("long:9", gen.events.get(0));
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteSimpleObject_unrecognizedNumber_fallsThrough() throws IOException {
        // Number ที่ไม่ตรง subtype ใดๆ ที่ระบุใน if-else chain -> fall-through -> throw
        gen.callWriteSimpleObject(new WeirdNumber());
    }

    @Test
    public void testWriteSimpleObject_byteArray() throws IOException {
        byte[] data = {1, 2};
        gen.callWriteSimpleObject(data);
        assertEquals("binary", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_boolean() throws IOException {
        gen.callWriteSimpleObject(Boolean.TRUE);
        assertEquals("bool:true", gen.events.get(0));
    }

    @Test
    public void testWriteSimpleObject_atomicBoolean() throws IOException {
        gen.callWriteSimpleObject(new AtomicBoolean(true));
        assertEquals("bool:true", gen.events.get(0));
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteSimpleObject_unsupportedType() throws IOException {
        gen.callWriteSimpleObject(new Object());
    }

    /* ============================================================
     * _reportError / _reportUnsupportedOperation
     * ============================================================ */

    @Test
    public void testReportError_throwsWithMessage() {
        try {
            gen.callReportError("boom");
            fail("expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testReportUnsupportedOperation_throws() {
        gen.callReportUnsupported();
    }

    // หมายเหตุ: _throwInternal() ไม่ได้ทดสอบ เพราะพึ่งพา VersionUtil.throwInternal()
    // ซึ่งไม่มีซอร์สโค้ดให้ในโจทย์ ไม่สามารถยืนยัน exception type ที่แน่นอนได้โดยไม่เดา

    // หมายเหตุ: copyCurrentEvent(JsonParser) และ copyCurrentStructure(JsonParser)
    // ไม่ได้ทดสอบ เพราะ JsonParser เป็น abstract class ที่มี abstract method จำนวนมาก
    // ซึ่งไม่มีซอร์สโค้ดให้ในโจทย์ และไม่มี mocking library (เช่น Mockito) ใน classpath
    // ที่กำหนด การสร้าง fake ทั้งหมดจะเป็นการเดา behavior/สัญญาของคลาสที่ไม่มีอยู่ในซอร์ส
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testCollectDefaults | `Feature.collectDefaults()` วนลูปรวม default mask |
| testFeatureEnabledByDefault_* | `enabledByDefault()` true/false case |
| testFeatureGetMask | `getMask()` คำนวณ bit shift ตาม ordinal |
| testFeatureEnabledIn_* | `enabledIn()` true/false branch |
| testConfigure_enableBranch/disableBranch | if(state) enable else disable ทั้งสอง branch |
| testOverrideStdFeatures | คำนวณ bitmask ผสม values/mask |
| testGetFormatFeatures_defaultZero | default return 0 |
| testOverrideFormatFeatures_throws | throw IllegalArgumentException |
| testSetSchema_throwsUnsupported | throw UnsupportedOperationException + เรียก schema.getSchemaType() |
| testGetSchema_defaultNull | default null |
| testSetGetPrettyPrinter | set/get pretty printer, chaining |
| testSetHighestNonEscapedChar_returnsThis | chaining return this |
| testGetHighestEscapedChar_defaultZero | default 0 |
| testCharacterEscapes_defaultNullAndChain | default null + chaining |
| testSetRootValueSeparator_throws | throw UnsupportedOperationException |
| testGetOutputTarget_defaultNull / testGetOutputBuffered_defaultMinusOne | default values |
| testGetCurrentValue_ctxNull / testSetCurrentValue_ctxNull_noException | branch ctxt==null |
| testCapabilityDefaults | default boolean ของ can* methods ทั้งหมด |
| testWriteStartArrayWithSize_delegates / negative | default delegate, ไม่มี validation |
| testWriteStartObjectWithForValue_ctxNull | default delegate + setCurrentValue branch |
| testWriteArray*_nullArray | null-check branch (int/long/double) |
| testWriteArray*_invalidOffset/lengthTooLarge | `_verifyOffsets` fail branch |
| testWriteArrayInt_normal/zeroLength_boundary | loop ปกติ และ loop 0 ครั้ง (boundary) |
| testWriteArrayLong_normal / testWriteArrayDouble_normal | ชนิดข้อมูลอื่น ของ loop เดียวกัน |
| testWriteFieldId_delegatesToWriteFieldName | default delegate Long.toString |
| testWriteBinary_* | default delegate ไปยัง Base64Variants.getDefaultVariant() ทั้ง 3 overload |
| testWriteNumberShort_delegatesToInt | default overload resolution |
| testWrite(EmbeddedObject/ObjectId/ObjectRef/TypeId)_throws | throw JsonGenerationException ทุก default method |
| testWrite*Field (String/Boolean/Null/Number*/Binary/ArrayStart/ObjectStart/ObjectField) | convenience method เรียง fieldName + value ตามลำดับ |
| testWriteOmittedField_noop | default no-op |
| testWriteRaw/RawValue_serializableString_delegates | default delegate ผ่าน `SerializableString.getValue()` |
| testVerifyOffsets_validExact/validPartial | branch ปกติ (ไม่ throw), boundary offset+length==len |
| testVerifyOffsets_negativeOffset/lengthExceeds | branch throw IllegalArgumentException |
| testWriteSimpleObject_null/string/integer/long/double/float/short/byte/bigInteger/bigDecimal/atomicInteger/atomicLong | ทุก branch ของ `_writeSimpleObject` สำหรับ Number subtype |
| testWriteSimpleObject_unrecognizedNumber_fallsThrough | branch fall-through ของ Number ที่ไม่ตรง subtype ใด ๆ |
| testWriteSimpleObject_byteArray/boolean/atomicBoolean | branch byte[]/Boolean/AtomicBoolean |
| testWriteSimpleObject_unsupportedType | branch สุดท้าย throw IllegalStateException |
| testReportError_throwsWithMessage | `_reportError` throw + message ตรง |
| testReportUnsupportedOperation_throws | `_reportUnsupportedOperation` throw |

**Skip (พร้อมคอมเมนต์ในโค้ด):** `_throwInternal()`, `copyCurrentEvent(JsonParser)`, `copyCurrentStructure(JsonParser)`, และกรณี `getOutputContext()` คืนค่า non-null (เนื่องจากไม่มีซอร์สของ `JsonParser`/`JsonStreamContext` ให้ยืนยัน API ที่แน่นอน)