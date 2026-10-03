import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.Assert.*;

public class JsonGeneratorTest {

    private TestJsonGenerator generator;

    // Concrete subclass of JsonGenerator for testing abstract and protected methods
    private static class TestJsonGenerator extends JsonGenerator {
        private ObjectCodec codec;
        private boolean closed = false;
        private FormatSchema schema;

        @Override public JsonGenerator setCodec(ObjectCodec oc) { this.codec = oc; return this; }
        @Override public ObjectCodec getCodec() { return codec; }
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public JsonGenerator enable(Feature f) { return this; }
        @Override public JsonGenerator disable(Feature f) { return this; }
        @Override public boolean isEnabled(Feature f) { return false; }
        @Override public int getFeatureMask() { return 0; }
        @Override public JsonGenerator setFeatureMask(int values) { return this; }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override public void writeStartArray() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeFieldName(String name) throws IOException {}
        @Override public void writeFieldName(SerializableString name) throws IOException {}
        @Override public void writeString(String text) throws IOException {}
        @Override public void writeString(char[] text, int offset, int len) throws IOException {}
        @Override public void writeString(SerializableString text) throws IOException {}
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeRaw(String text) throws IOException {}
        @Override public void writeRaw(String text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char c) throws IOException {}
        @Override public void writeRawValue(String text) throws IOException {}
        @Override public void writeRawValue(String text, int offset, int len) throws IOException {}
        @Override public void writeRawValue(char[] text, int offset, int len) throws IOException {}
        @Override public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) throws IOException {}
        @Override public int writeBinary(Base64Variant bv, InputStream data, int dataLength) throws IOException { return 0; }
        @Override public void writeNumber(int v) throws IOException {}
        @Override public void writeNumber(long v) throws IOException {}
        @Override public void writeNumber(BigInteger v) throws IOException {}
        @Override public void writeNumber(double v) throws IOException {}
        @Override public void writeNumber(float v) throws IOException {}
        @Override public void writeNumber(BigDecimal v) throws IOException {}
        @Override public void writeNumber(String encodedValue) throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeNull() throws IOException {}
        @Override public void writeObject(Object pojo) throws IOException {}
        @Override public void writeTree(TreeNode rootNode) throws IOException {}
        @Override public JsonStreamContext getOutputContext() { return null; }
        @Override public void flush() throws IOException {}
        @Override public boolean isClosed() { return closed; }
        @Override public void close() throws IOException { closed = true; }

        // Expose protected methods for testing
        public void publicVerifyOffsets(int arrayLength, int offset, int length) {
            _verifyOffsets(arrayLength, offset, length);
        }

        public void publicWriteSimpleObject(Object value) throws IOException {
            _writeSimpleObject(value);
        }
    }

    @Before
    public void setUp() {
        generator = new TestJsonGenerator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyOffsetsNegativeOffset() {
        generator.publicVerifyOffsets(10, -1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyOffsetsExceedLength() {
        generator.publicVerifyOffsets(10, 5, 6);
    }

    @Test
    public void testVerifyOffsetsValid() {
        // Should not throw exception
        generator.publicVerifyOffsets(10, 2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteIntArrayNull() throws IOException {
        generator.writeArray((int[]) null, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteLongArrayNull() throws IOException {
        generator.writeArray((long[]) null, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteDoubleArrayNull() throws IOException {
        generator.writeArray((double[]) null, 0, 0);
    }

    @Test
    public void testWriteIntArrayValid() throws IOException {
        int[] arr = {1, 2, 3};
        generator.writeArray(arr, 0, 3);
    }

    @Test
    public void testWriteLongArrayValid() throws IOException {
        long[] arr = {1L, 2L, 3L};
        generator.writeArray(arr, 0, 3);
    }

    @Test
    public void testWriteDoubleArrayValid() throws IOException {
        double[] arr = {1.0, 2.0, 3.0};
        generator.writeArray(arr, 0, 3);
    }

    @Test
    public void testSimpleObjectNull() throws IOException {
        generator.publicWriteSimpleObject(null);
    }

    @Test
    public void testSimpleObjectString() throws IOException {
        generator.publicWriteSimpleObject("test-string");
    }

    @Test
    public void testSimpleObjectNumbers() throws IOException {
        generator.publicWriteSimpleObject(Integer.valueOf(10));
        generator.publicWriteSimpleObject(Long.valueOf(20L));
        generator.publicWriteSimpleObject(Double.valueOf(30.0));
        generator.publicWriteSimpleObject(Float.valueOf(40.0f));
        generator.publicWriteSimpleObject(Short.valueOf((short) 50));
        generator.publicWriteSimpleObject(Byte.valueOf((byte) 60));
        generator.publicWriteSimpleObject(BigInteger.valueOf(70L));
        generator.publicWriteSimpleObject(BigDecimal.valueOf(80.0));
        generator.publicWriteSimpleObject(new AtomicInteger(90));
        generator.publicWriteSimpleObject(new AtomicLong(100L));
    }

    @Test
    public void testSimpleObjectByteArray() throws IOException {
        generator.publicWriteSimpleObject(new byte[]{1, 2, 3});
    }

    @Test
    public void testSimpleObjectBoolean() throws IOException {
        generator.publicWriteSimpleObject(Boolean.TRUE);
        generator.publicWriteSimpleObject(new AtomicBoolean(false));
    }

    @Test(expected = IllegalStateException.class)
    public void testSimpleObjectUnsupportedThrowsException() throws IOException {
        generator.publicWriteSimpleObject(new Object());
    }

    @Test
    public void testDefaultConfigurationsAndOverrides() {
        assertEquals(0, generator.getFormatFeatures());
        assertNull(generator.getSchema());
        assertNull(generator.getCharacterEscapes());
        assertNull(generator.getOutputTarget());
        assertEquals(-1, generator.getOutputBuffered());
        assertFalse(generator.canUseSchema(null));
        assertFalse(generator.canWriteObjectId());
        assertFalse(generator.canWriteTypeId());
        assertFalse(generator.canWriteBinaryNatively());
        assertTrue(generator.canOmitFields());
        assertFalse(generator.canWriteFormattedNumbers());

        // Test configuration / overrides
        JsonGenerator configured = generator.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true);
        assertNotNull(configured);

        JsonGenerator overridden = generator.overrideStdFeatures(1, 1);
        assertNotNull(overridden);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideFormatFeaturesException() {
        generator.overrideFormatFeatures(0, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetSchemaException() {
        generator.setSchema(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetRootValueSeparatorException() {
        generator.setRootValueSeparator(null);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEmbeddedObjectException() throws IOException {
        generator.writeEmbeddedObject(new Object());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteObjectIdException() throws IOException {
        generator.writeObjectId("id");
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteObjectRefException() throws IOException {
        generator.writeObjectRef("id");
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteTypeIdException() throws IOException {
        generator.writeTypeId("id");
    }
}