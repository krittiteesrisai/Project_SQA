package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/**
 * Unit tests for {@link GeneratorBase}.
 *
 * หมายเหตุสำคัญ (ASSUMPTIONS):
 * เนื่องจาก source ของ JsonGenerator (superclass), ObjectCodec, และ TreeNode
 * ไม่ได้ถูกให้มาในโจทย์ จึงต้องสมมติ signature ของ abstract method บางตัว
 * โดยอ้างอิงจาก Jackson-core API มาตรฐาน (จุดที่สมมติจะมีคอมเมนต์กำกับ)
 * การทดสอบทั้งหมดจะเน้นเฉพาะ logic ที่ "ปรากฏอยู่จริง" ใน source ของ
 * GeneratorBase ที่ให้มาเท่านั้น
 */
public class GeneratorBaseTest {

    // ------------------------------------------------------------------
    // Stub ObjectCodec: implement เท่าที่ทราบแน่ชัดว่าเป็น abstract methods
    // ของ com.fasterxml.jackson.core.ObjectCodec (สมมติ ตาม API มาตรฐาน)
    // ------------------------------------------------------------------
    private static class StubCodec extends ObjectCodec {
        boolean writeValueCalled = false;
        Object lastValue;
        JsonGenerator lastGen;

        @Override
        public void writeValue(JsonGenerator gen, Object value) throws IOException {
            writeValueCalled = true;
            lastGen = gen;
            lastValue = value;
        }

        @Override
        public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException {
            throw new UnsupportedOperationException();
        }
        @Override
        public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException {
            throw new UnsupportedOperationException();
        }
        @Override
        public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException {
            throw new UnsupportedOperationException();
        }
        @Override
        public <T> Iterator<T> readValues(JsonParser p, Class<T> valueType) throws IOException {
            throw new UnsupportedOperationException();
        }
        @Override
        public <T> Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException {
            throw new UnsupportedOperationException();
        }
        @Override
        public <T> Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException {
            throw new UnsupportedOperationException();
        }
        @Override
        public <T extends TreeNode> T readTree(JsonParser p) throws IOException {
            throw new UnsupportedOperationException();
        }
        @Override
        public void writeTree(JsonGenerator gen, TreeNode tree) throws IOException {
            throw new UnsupportedOperationException();
        }
        @Override
        public TreeNode createArrayNode() { throw new UnsupportedOperationException(); }
        @Override
        public TreeNode createObjectNode() { throw new UnsupportedOperationException(); }
        @Override
        public JsonParser treeAsTokens(TreeNode n) { throw new UnsupportedOperationException(); }
    }

    // ------------------------------------------------------------------
    // Stub GeneratorBase: ทำ minimal concrete implementation
    // เมธอดที่ "แน่นอน" ว่าเป็น abstract (ปรากฏชัดใน source ที่ให้มา):
    //   flush(), _releaseBuffers(), _verifyValueWrite(String)
    // เมธอดอื่น (writeStartArray, writeString, setPrettyPrinter,
    // setHighestNonEscapedChar, _writeSimpleObject, writeRaw(SerializableString) ฯลฯ)
    // เป็นการ "สมมติ" signature ตาม Jackson-core API มาตรฐาน
    // ------------------------------------------------------------------
    private static class StubGenerator extends GeneratorBase {

        boolean flushed = false;
        boolean released = false;
        String lastVerifyMsg = null;
        boolean nullWritten = false;
        boolean simpleObjectCalled = false;
        Object lastSimpleObjectValue = null;
        int lastHighestNonEscaped = Integer.MIN_VALUE;
        PrettyPrinter prettyPrinter;
        String lastFieldName;
        String lastWrittenString;
        String lastRaw;

        StubGenerator(int features, ObjectCodec codec) {
            super(features, codec);
        }

        StubGenerator(int features, ObjectCodec codec, JsonWriteContext ctxt) {
            super(features, codec, ctxt);
        }

        @Override public void flush() throws IOException { flushed = true; }
        @Override protected void _releaseBuffers() { released = true; }
        @Override protected void _verifyValueWrite(String typeMsg) throws IOException {
            lastVerifyMsg = typeMsg;
        }

        @Override public void writeStartArray() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}

        @Override public void writeFieldName(String name) throws IOException { lastFieldName = name; }

        @Override public void writeString(String text) throws IOException { lastWrittenString = text; }
        @Override public void writeString(char[] text, int offset, int len) throws IOException {
            lastWrittenString = new String(text, offset, len);
        }
        public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
        public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}

        @Override public void writeRaw(String text) throws IOException { lastRaw = text; }
        @Override public void writeRaw(String text, int offset, int len) throws IOException {
            lastRaw = text.substring(offset, offset + len);
        }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException {
            lastRaw = new String(text, offset, len);
        }
        @Override public void writeRaw(char c) throws IOException { lastRaw = String.valueOf(c); }
        // ASSUMPTION: writeRaw(SerializableString) is abstract in JsonGenerator
        public void writeRaw(SerializableString text) throws IOException { lastRaw = text.getValue(); }

        @Override
        public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException {
            return super.writeBinary(b64variant, data, dataLength);
        }
        public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException {}

        public void writeNumber(int v) throws IOException {}
        public void writeNumber(long v) throws IOException {}
        public void writeNumber(BigInteger v) throws IOException {}
        public void writeNumber(double v) throws IOException {}
        public void writeNumber(float v) throws IOException {}
        public void writeNumber(BigDecimal v) throws IOException {}
        public void writeNumber(String encodedValue) throws IOException {}
        public void writeBoolean(boolean state) throws IOException {}
        public void writeNull() throws IOException { nullWritten = true; }

        // ASSUMPTION: JsonGenerator declares abstract setPrettyPrinter/getPrettyPrinter
        public JsonGenerator setPrettyPrinter(PrettyPrinter pp) { prettyPrinter = pp; return this; }
        public PrettyPrinter getPrettyPrinter() { return prettyPrinter; }

        // ASSUMPTION: JsonGenerator declares abstract setHighestNonEscapedChar/getHighestNonEscapedChar
        public JsonGenerator setHighestNonEscapedChar(int charCode) {
            lastHighestNonEscaped = charCode;
            return this;
        }
        public int getHighestNonEscapedChar() { return lastHighestNonEscaped; }

        // ASSUMPTION: _writeSimpleObject(Object) is abstract protected method in JsonGenerator
        protected void _writeSimpleObject(Object value) throws IOException {
            simpleObjectCalled = true;
            lastSimpleObjectValue = value;
        }
    }

    // Helper: dynamic proxy สำหรับ TreeNode (ไม่ต้องรู้ signature ที่แน่นอน)
    private TreeNode dummyTreeNode() {
        return (TreeNode) Proxy.newProxyInstance(
                TreeNode.class.getClassLoader(),
                new Class<?>[] { TreeNode.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        return null; // ไม่ถูกเรียกใช้จริงใน GeneratorBase.writeTree()
                    }
                });
    }

    // =====================================================================
    // Constructor tests
    // =====================================================================

    @Test
    public void testConstructor_plainFeatures_noDupDetector() {
        StubGenerator gen = new StubGenerator(0, null);
        assertEquals(0, gen.getFeatureMask());
        assertNull(gen.getOutputContext().getDupDetector());
        assertFalse(gen._cfgNumbersAsStrings);
        assertNull(gen.getCodec());
    }

    @Test
    public void testConstructor_withStrictDuplicateDetection() {
        int features = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        StubGenerator gen = new StubGenerator(features, null);
        assertNotNull(gen.getOutputContext().getDupDetector());
    }

    @Test
    public void testConstructor_withWriteNumbersAsStrings() {
        int features = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        StubGenerator gen = new StubGenerator(features, null);
        assertTrue(gen._cfgNumbersAsStrings);
    }

    @Test
    public void testConstructor_withCustomWriteContext() {
        JsonWriteContext ctxt = JsonWriteContext.createRootContext(null);
        StubCodec codec = new StubCodec();
        StubGenerator gen = new StubGenerator(0, codec, ctxt);
        assertSame(ctxt, gen.getOutputContext());
        assertSame(codec, gen.getCodec());
    }

    // =====================================================================
    // version()
    // =====================================================================

    @Test
    public void testVersion_notNull() {
        StubGenerator gen = new StubGenerator(0, null);
        assertNotNull(gen.version());
    }

    // =====================================================================
    // getCurrentValue / setCurrentValue
    // =====================================================================

    @Test
    public void testGetSetCurrentValue() {
        StubGenerator gen = new StubGenerator(0, null);
        Object val = "myValue";
        gen.setCurrentValue(val);
        assertSame(val, gen.getCurrentValue());
    }

    // =====================================================================
    // isEnabled / getFeatureMask
    // =====================================================================

    @Test
    public void testIsEnabled_true() {
        int mask = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        StubGenerator gen = new StubGenerator(mask, null);
        assertTrue(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        assertEquals(mask, gen.getFeatureMask());
    }

    @Test
    public void testIsEnabled_false() {
        StubGenerator gen = new StubGenerator(0, null);
        assertFalse(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    // =====================================================================
    // enable(Feature)
    // =====================================================================

    @Test
    public void testEnable_nonDerivedFeature_returnsThis_noSideEffects() {
        StubGenerator gen = new StubGenerator(0, null);
        JsonGenerator ret = gen.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertSame(gen, ret);
        assertTrue(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        // outer-if (mask & DERIVED_FEATURES_MASK)==0 -> no derived side-effects
        assertFalse(gen._cfgNumbersAsStrings);
        assertEquals(Integer.MIN_VALUE, gen.lastHighestNonEscaped);
    }

    @Test
    public void testEnable_writeNumbersAsStrings() {
        StubGenerator gen = new StubGenerator(0, null);
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertTrue(gen._cfgNumbersAsStrings);
    }

    @Test
    public void testEnable_escapeNonAscii() {
        StubGenerator gen = new StubGenerator(0, null);
        gen.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(127, gen.lastHighestNonEscaped);
    }

    @Test
    public void testEnable_strictDuplicateDetection_whenCurrentlyNull() {
        StubGenerator gen = new StubGenerator(0, null);
        assertNull(gen.getOutputContext().getDupDetector());
        gen.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(gen.getOutputContext().getDupDetector());
    }

    @Test
    public void testEnable_strictDuplicateDetection_whenAlreadySet_notReplaced() {
        int features = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        StubGenerator gen = new StubGenerator(features, null);
        DupDetector before = gen.getOutputContext().getDupDetector();
        assertNotNull(before);
        gen.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION); // already enabled -> branch "getDupDetector()==null" false
        DupDetector after = gen.getOutputContext().getDupDetector();
        assertNotNull(after);
        // context object itself may or may not be same instance, but detector should not be nulled
    }

    // =====================================================================
    // disable(Feature)
    // =====================================================================

    @Test
    public void testDisable_nonDerivedFeature_returnsThis() {
        int mask = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        StubGenerator gen = new StubGenerator(mask, null);
        JsonGenerator ret = gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertSame(gen, ret);
        assertFalse(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testDisable_writeNumbersAsStrings() {
        int mask = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        StubGenerator gen = new StubGenerator(mask, null);
        gen.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertFalse(gen._cfgNumbersAsStrings);
    }

    @Test
    public void testDisable_escapeNonAscii() {
        int mask = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        StubGenerator gen = new StubGenerator(mask, null);
        gen.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(0, gen.lastHighestNonEscaped);
    }

    @Test
    public void testDisable_strictDuplicateDetection() {
        int mask = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        StubGenerator gen = new StubGenerator(mask, null);
        assertNotNull(gen.getOutputContext().getDupDetector());
        gen.disable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(gen.getOutputContext().getDupDetector());
    }

    // =====================================================================
    // setFeatureMask (deprecated)
    // =====================================================================

    @Test
    public void testSetFeatureMask_noChange() {
        int mask = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        StubGenerator gen = new StubGenerator(mask, null);
        gen.setFeatureMask(mask); // changed == 0
        assertEquals(mask, gen.getFeatureMask());
    }

    @Test
    public void testSetFeatureMask_changeInsideDerivedMask_enableEscape() {
        StubGenerator gen = new StubGenerator(0, null);
        int newMask = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        gen.setFeatureMask(newMask);
        assertEquals(newMask, gen.getFeatureMask());
        assertEquals(127, gen.lastHighestNonEscaped);
    }

    @Test
    public void testSetFeatureMask_changeOutsideDerivedMask_noDerivedEffect() {
        StubGenerator gen = new StubGenerator(0, null);
        int newMask = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        gen.setFeatureMask(newMask);
        assertEquals(newMask, gen.getFeatureMask());
        assertEquals(Integer.MIN_VALUE, gen.lastHighestNonEscaped);
        assertFalse(gen._cfgNumbersAsStrings);
    }

    // =====================================================================
    // overrideStdFeatures
    // =====================================================================

    @Test
    public void testOverrideStdFeatures_noChange() {
        int initial = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        StubGenerator gen = new StubGenerator(initial, null);
        gen.overrideStdFeatures(initial, JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());
        assertEquals(initial, gen.getFeatureMask());
    }

    @Test
    public void testOverrideStdFeatures_enableStrictDup() {
        StubGenerator gen = new StubGenerator(0, null);
        int dupMask = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        gen.overrideStdFeatures(dupMask, dupMask);
        assertTrue(gen.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        assertNotNull(gen.getOutputContext().getDupDetector());
    }

    @Test
    public void testOverrideStdFeatures_disableStrictDup() {
        int dupMask = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        StubGenerator gen = new StubGenerator(dupMask, null);
        assertNotNull(gen.getOutputContext().getDupDetector());
        gen.overrideStdFeatures(0, dupMask); // disable
        assertNull(gen.getOutputContext().getDupDetector());
    }

    // =====================================================================
    // useDefaultPrettyPrinter
    // =====================================================================

    @Test
    public void testUseDefaultPrettyPrinter_whenNoneSet() {
        StubGenerator gen = new StubGenerator(0, null);
        assertNull(gen.getPrettyPrinter());
        JsonGenerator ret = gen.useDefaultPrettyPrinter();
        assertSame(gen, ret);
        assertTrue(gen.getPrettyPrinter() instanceof DefaultPrettyPrinter);
    }

    @Test
    public void testUseDefaultPrettyPrinter_whenAlreadySet_notOverridden() {
        StubGenerator gen = new StubGenerator(0, null);
        PrettyPrinter custom = new DefaultPrettyPrinter();
        gen.setPrettyPrinter(custom);
        gen.useDefaultPrettyPrinter();
        assertSame(custom, gen.getPrettyPrinter());
    }

    // =====================================================================
    // setCodec / getCodec
    // =====================================================================

    @Test
    public void testSetGetCodec() {
        StubGenerator gen = new StubGenerator(0, null);
        StubCodec codec = new StubCodec();
        JsonGenerator ret = gen.setCodec(codec);
        assertSame(gen, ret);
        assertSame(codec, gen.getCodec());
    }

    @Test
    public void testSetCodec_null() {
        StubGenerator gen = new StubGenerator(0, new StubCodec());
        gen.setCodec(null);
        assertNull(gen.getCodec());
    }

    // =====================================================================
    // getOutputContext
    // =====================================================================

    @Test
    public void testGetOutputContext_defaultConstructor() {
        StubGenerator gen = new StubGenerator(0, null);
        assertNotNull(gen.getOutputContext());
    }

    // =====================================================================
    // writeFieldName(SerializableString) / writeString(SerializableString)
    // =====================================================================

    @Test
    public void testWriteFieldName_SerializableString() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeFieldName(new SerializedString("foo"));
        assertEquals("foo", gen.lastFieldName);
    }

    @Test
    public void testWriteString_SerializableString() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeString(new SerializedString("bar"));
        assertEquals("bar", gen.lastWrittenString);
    }

    // =====================================================================
    // writeRawValue overloads
    // =====================================================================

    @Test
    public void testWriteRawValue_String() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeRawValue("abc");
        assertEquals("write raw value", gen.lastVerifyMsg);
        assertEquals("abc", gen.lastRaw);
    }

    @Test
    public void testWriteRawValue_StringOffsetLen() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeRawValue("abcdef", 1, 3);
        assertEquals("write raw value", gen.lastVerifyMsg);
        assertEquals("bcd", gen.lastRaw);
    }

    @Test
    public void testWriteRawValue_charArray() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        char[] arr = "abcdef".toCharArray();
        gen.writeRawValue(arr, 2, 3);
        assertEquals("write raw value", gen.lastVerifyMsg);
        assertEquals("cde", gen.lastRaw);
    }

    @Test
    public void testWriteRawValue_SerializableString() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeRawValue(new SerializedString("xyz"));
        assertEquals("write raw value", gen.lastVerifyMsg);
        assertEquals("xyz", gen.lastRaw);
    }

    // =====================================================================
    // writeBinary(Base64Variant, InputStream, int) -> unsupported
    // =====================================================================

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinary_InputStream_throwsUnsupported() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        InputStream in = new ByteArrayInputStream(new byte[] {1, 2, 3});
        gen.writeBinary(Base64Variants.getDefaultVariant(), in, 3);
    }

    // =====================================================================
    // writeObject
    // =====================================================================

    @Test
    public void testWriteObject_null_callsWriteNull() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeObject(null);
        assertTrue(gen.nullWritten);
        assertFalse(gen.simpleObjectCalled);
    }

    @Test
    public void testWriteObject_nonNull_withCodec_delegatesToCodec() throws IOException {
        StubCodec codec = new StubCodec();
        StubGenerator gen = new StubGenerator(0, codec);
        gen.writeObject("hello");
        assertTrue(codec.writeValueCalled);
        assertSame(gen, codec.lastGen);
        assertEquals("hello", codec.lastValue);
        // ต้อง return ทันทีหลัง codec.writeValue -> ไม่ไปเรียก _writeSimpleObject
        assertFalse(gen.simpleObjectCalled);
        assertFalse(gen.nullWritten);
    }

    @Test
    public void testWriteObject_nonNull_withoutCodec_callsWriteSimpleObject() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeObject("hello");
        assertTrue(gen.simpleObjectCalled);
        assertEquals("hello", gen.lastSimpleObjectValue);
        assertFalse(gen.nullWritten);
    }

    // =====================================================================
    // writeTree
    // =====================================================================

    @Test
    public void testWriteTree_null_callsWriteNull() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeTree(null);
        assertTrue(gen.nullWritten);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteTree_nonNull_noCodec_throwsISE() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        gen.writeTree(dummyTreeNode());
    }

    @Test
    public void testWriteTree_nonNull_withCodec_delegates() throws IOException {
        StubCodec codec = new StubCodec();
        StubGenerator gen = new StubGenerator(0, codec);
        TreeNode node = dummyTreeNode();
        gen.writeTree(node);
        // ObjectCodec.writeTree ถูกเรียก ไม่ใช่ writeValue เพราะ source เรียก
        // _objectCodec.writeValue(this, rootNode) ตาม given source (writeTree ใช้ writeValue)
        assertTrue(codec.writeValueCalled);
        assertSame(node, codec.lastValue);
    }

    // =====================================================================
    // close() / isClosed()
    // =====================================================================

    @Test
    public void testCloseAndIsClosed() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        assertFalse(gen.isClosed());
        gen.close();
        assertTrue(gen.isClosed());
        // ตาม source: close() ตั้งค่า _closed=true เท่านั้น ไม่ได้เรียก _releaseBuffers()
        assertFalse(gen.released);
    }

    // =====================================================================
    // _decodeSurrogate (protected, same package -> เข้าถึงได้ตรง)
    // =====================================================================

    @Test
    public void testDecodeSurrogate_validBoundaryLow() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        int result = gen._decodeSurrogate(GeneratorBase.SURR1_FIRST, GeneratorBase.SURR2_FIRST);
        assertEquals(0x10000, result);
    }

    @Test
    public void testDecodeSurrogate_validBoundaryHigh() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        int surr1 = GeneratorBase.SURR1_LAST;
        int surr2 = GeneratorBase.SURR2_LAST;
        int expected = 0x10000 + ((surr1 - GeneratorBase.SURR1_FIRST) << 10) + (surr2 - GeneratorBase.SURR2_FIRST);
        int result = gen._decodeSurrogate(surr1, surr2);
        assertEquals(expected, result);
    }

    @Test
    public void testDecodeSurrogate_invalidSecond_belowRange() {
        StubGenerator gen = new StubGenerator(0, null);
        try {
            gen._decodeSurrogate(GeneratorBase.SURR1_FIRST, GeneratorBase.SURR2_FIRST - 1);
            fail("Expected exception for invalid second surrogate");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Incomplete surrogate pair"));
        }
    }

    @Test
    public void testDecodeSurrogate_invalidSecond_aboveRange() {
        StubGenerator gen = new StubGenerator(0, null);
        try {
            gen._decodeSurrogate(GeneratorBase.SURR1_FIRST, GeneratorBase.SURR2_LAST + 1);
            fail("Expected exception for invalid second surrogate");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Incomplete surrogate pair"));
        }
    }

    // =====================================================================
    // _asString(BigDecimal)  (protected, same package -> เข้าถึงได้ตรง)
    // =====================================================================

    @Test
    public void testAsString_BigDecimal() throws IOException {
        StubGenerator gen = new StubGenerator(0, null);
        BigDecimal bd = new BigDecimal("123.456");
        assertEquals(bd.toString(), gen._asString(bd));
    }
}
