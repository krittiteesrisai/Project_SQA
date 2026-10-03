package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class GeneratorBaseTest {

    private DummyGenerator generator;

    // Concrete implementation สำหรับทดสอบ Abstract Class
    private static class DummyGenerator extends GeneratorBase {
        private PrettyPrinter prettyPrinter;
        private int highestNonEscapedChar = -1;
        private boolean simpleObjectWritten = false;
        private boolean nullWritten = false;

        protected DummyGenerator(int features, ObjectCodec codec) {
            super(features, codec);
        }

        protected DummyGenerator(int features, ObjectCodec codec, JsonWriteContext ctxt) {
            super(features, codec, ctxt);
        }

        @Override
        public JsonGenerator setHighestNonEscapedChar(int charCode) {
            this.highestNonEscapedChar = charCode;
            return this;
        }

        @Override
        public int getHighestNonEscapedChar() {
            return this.highestNonEscapedChar;
        }

        @Override
        public JsonGenerator setPrettyPrinter(PrettyPrinter pp) {
            this.prettyPrinter = pp;
            return this;
        }

        @Override
        public PrettyPrinter getPrettyPrinter() {
            return this.prettyPrinter;
        }

        @Override
        public void writeString(String text) throws IOException {}

        @Override
        public void writeString(char[] text, int offset, int len) throws IOException {}

        @Override
        public void writeRaw(String text) throws IOException {}

        @Override
        public void writeRaw(char[] text, int offset, int len) throws IOException {}

        @Override
        public void writeRaw(SerializableString text) throws IOException {}

        @Override
        public void writeNumber(int i) throws IOException {}

        @Override
        public void writeNumber(long l) throws IOException {}

        @Override
        public void writeNumber(double d) throws IOException {}

        @Override
        public void writeNumber(float f) throws IOException {}

        @Override
        public void writeNumber(BigDecimal dec) throws IOException {}

        @Override
        public void writeBoolean(boolean state) throws IOException {}

        @Override
        public void writeNull() throws IOException {
            nullWritten = true;
        }

        @Override
        public void flush() throws IOException {}

        @Override
        protected void _releaseBuffers() {}

        @Override
        protected void _verifyValueWrite(String typeMsg) throws IOException {}

        @Override
        protected void _writeSimpleObject(Object value) throws IOException {
            simpleObjectWritten = true;
        }
    }

    private static class DummyObjectCodec extends ObjectCodec {
        private boolean writeValueCalled = false;

        @Override
        public Version version() { return Version.unknownVersion(); }
        @Override
        public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
        @Override
        public <T> T readValue(JsonParser p, TypeReference<?> valueTypeRef) throws IOException { return null; }
        @Override
        public <T> T readValue(JsonParser p, ResolvedType valueType) throws IOException { return null; }
        @Override
        public <T> Iterator<T> readValues(JsonParser p, Class<T> valueType) throws IOException { return null; }
        @Override
        public <T> Iterator<T> readValues(JsonParser p, TypeReference<?> valueTypeRef) throws IOException { return null; }
        @Override
        public <T> Iterator<T> readValues(JsonParser p, ResolvedType valueType) throws IOException { return null; }
        @Override
        public void writeValue(JsonGenerator g, Object value) throws IOException {
            writeValueCalled = true;
        }
        @Override
        public <T extends TreeNode> T readTree(JsonParser p) throws IOException { return null; }
        @Override
        public void writeTree(JsonGenerator g, TreeNode treeNode) throws IOException {}
        @Override
        public TreeNode createObjectNode() { return null; }
        @Override
        public TreeNode createArrayNode() { return null; }
        @Override
        public JsonParser treeAsTokens(TreeNode n0) { return null; }
        @Override
        public <T> T treeToValue(TreeNode n0, Class<T> clazz) throws IOException { return null; }
    }

    @Before
    public void setUp() {
        generator = new DummyGenerator(0, null);
    }

    @Test
    public void testLifeCycleAndBasicAccessors() {
        assertFalse(generator.isClosed());
        assertNotNull(generator.version());
        assertNotNull(generator.getOutputContext());
        
        generator.setCurrentValue("test-value");
        assertEquals("test-value", generator.getCurrentValue());

        try {
            generator.close();
        } catch (IOException e) {
            fail("Close should not throw IOException");
        }
        assertTrue(generator.isClosed());
    }

    @Test
    public void testFeatureEnableAndDisableDerived() {
        // Test WRITE_NUMBERS_AS_STRINGS
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertTrue(generator.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));

        generator.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertFalse(generator.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));

        // Test ESCAPE_NON_ASCII
        generator.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(127, generator.getHighestNonEscapedChar());

        generator.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(0, generator.getHighestNonEscapedChar());

        // Test STRICT_DUPLICATE_DETECTION
        generator.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(generator.getOutputContext().getDupDetector());

        generator.disable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testSetFeatureMaskAndOverride() {
        int mask = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        generator.setFeatureMask(mask);
        assertEquals(mask, generator.getFeatureMask());
        assertEquals(127, generator.getHighestNonEscapedChar());

        // Override std features
        generator.overrideStdFeatures(0, mask);
        assertEquals(0, generator.getFeatureMask());
        assertEquals(0, generator.getHighestNonEscapedChar());
    }

    @Test
    public void testUseDefaultPrettyPrinter() {
        assertNull(generator.getPrettyPrinter());
        
        // First call should set default pretty printer
        JsonGenerator res1 = generator.useDefaultPrettyPrinter();
        assertNotNull(generator.getPrettyPrinter());
        assertSame(generator, res1);

        // Second call should return existing one without overwriting
        PrettyPrinter existingPp = generator.getPrettyPrinter();
        JsonGenerator res2 = generator.useDefaultPrettyPrinter();
        assertSame(existingPp, generator.getPrettyPrinter());
        assertSame(generator, res2);
    }

    @Test
    public void testCodecAndTreeWrite() throws IOException {
        DummyObjectCodec codec = new DummyObjectCodec();
        generator.setCodec(codec);
        assertSame(codec, generator.getCodec());

        // writeObject with null
        generator.writeObject(null);
        assertTrue(generator.nullWritten);

        // writeObject with codec present
        generator.writeObject("some-object");
        assertTrue(codec.writeValueCalled);

        // writeObject without codec (calls _writeSimpleObject)
        generator.setCodec(null);
        generator.writeObject("another-object");
        assertTrue(generator.simpleObjectWritten);

        // writeTree with null
        generator.nullWritten = false;
        generator.writeTree(null);
        assertTrue(generator.nullWritten);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteTreeWithoutCodecThrowsException() throws IOException {
        generator.setCodec(null);
        // TreeNode stub or mock-less dummy if possible, but since interface requires TreeNode, 
        // we can pass a dummy or null check first. Wait, writeTree checks null first, 
        // then checks codec == null and throws IllegalStateException.
        generator.writeTree(new TreeNode() {
            @Override public JsonTokenasAsText asToken() { return null; }
            @Override public JsonToken asToken() { return null; }
            @Override public int size() { return 0; }
            @Override public boolean isValueNode() { return false; }
            @Override public boolean isContainerNode() { return false; }
            @Override public boolean isMissingNode() { return false; }
            @Override public boolean isArray() { return false; }
            @Override public boolean isObject() { return false; }
            @Override public JsonNode get(String fieldName) { return null; }
            @Override public JsonNode get(int index) { return null; }
            @Override public JsonNode path(String fieldName) { return null; }
            @Override public JsonNode path(int index) { return null; }
            @Override public Iterator<String> fieldNames() { return null; }
            @Override public JsonNode findValue(String fieldName) { return null; }
            @Override public List<JsonNode> findValues(String fieldName) { return null; }
            @Override public List<String> findValuesAsText(String fieldName) { return null; }
            @Override public JsonNode findParent(String fieldName) { return null; }
            @Override public List<JsonNode> findPath(String fieldName) { return null; }
            @Override public JsonNode findParents(String fieldName) { return null; }
            @Override public void serialize(JsonGenerator g, SerializerProvider provider) {}
            @Override public void serializeWithType(JsonGenerator g, SerializerProvider provider, TypeSerializer typeSer) {}
            @Override public Iterator<JsonNode> elements() { return null; }
            @Override public Iterator<TreeNode> iterator() { return null; }
        });
    }

    @Test
    public void testUnsupportedOperations() {
        try {
            generator.writeBinary(null, InputStream.nullInputStream(), 10);
            fail("Expected UnsupportedOperationException");
        } catch (Exception e) {
            // Expected
        }
    }

    @Test
    public void testDecodeSurrogateValid() throws IOException {
        // Valid surrogate pair range: SURR1 (0xD800-0xDBFF), SURR2 (0xDC00-0xDFFF)
        int decoded = generator._decodeSurrogate(GeneratorBase.SURR1_FIRST, GeneratorBase.SURR2_FIRST);
        assertEquals(0x10000, decoded);
    }

    @Test(expected = IOException.class)
    public void testDecodeSurrogateInvalidSecond() throws IOException {
        // Trigger invalid second surrogate to test Exception branch
        generator._decodeSurrogate(GeneratorBase.SURR1_FIRST, 0x0000);
    }

    @Test
    public void testRawValueWrites() throws IOException {
        // Just ensuring methods execute without error against Stubs
        generator.writeRawValue("data");
        generator.writeRawValue("data", 0, 4);
        generator.writeRawValue(new char[]{'d'}, 0, 1);
        generator.writeRawValue(new SerializableString() {
            @Override public String getValue() { return "val"; }
            @Override public int charLength() { return 3; }
            @Override public char[] asQuotedChars() { return new char[0]; }
            @Override public byte[] asQuotedUTF8() { return new byte[0]; }
            @Override public byte[] asUnserializedUTF8() { return new byte[0]; }
            @Override public int writeQuotedUTF8(OutputStream out) { return 0; }
            @Override public int writeUnserializedUTF8(OutputStream out) { return 0; }
            @Override public int putQuotedUTF8(ByteBuffer buffer) { return 0; }
            @Override public int putUnserializedUTF8(ByteBuffer buffer) { return 0; }
        });
    }
}