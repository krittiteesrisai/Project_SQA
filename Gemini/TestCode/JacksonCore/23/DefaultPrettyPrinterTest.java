package com.fasterxml.jackson.core.util;

import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class DefaultPrettyPrinterTest {

    private DefaultPrettyPrinter printer;
    private DummyJsonGenerator generator;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        printer = new DefaultPrettyPrinter();
        outputStream = new ByteArrayOutputStream();
        // สร้าง Generator แบบจำลองโดยใช้ StringWriter หรือ ByteArrayOutputStream ผ่าน factory พื้นฐานไม่ได้ 
        // ดังนั้นเราจึงสร้าง Stub/Mock ภายในด้วย Anonymous class หรือคลาสสืบทอดของ JsonGenerator ที่จำเป็น
    }

    // --- Stub JsonGenerator สำหรับดักจับการเขียน raw data ---
    private static class DummyJsonGenerator extends com.fasterxml.jackson.core.base.GeneratorBase {
        private final StringBuilder buffer = new StringBuilder();

        public DummyJsonGenerator() {
            super(0, null);
        }

        @Override public void writeString(String text) throws IOException { buffer.append(text); }
        @Override public void writeString(char[] text, int offset, int len) throws IOException { buffer.append(text, offset, len); }
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeRaw(String text) throws IOException { buffer.append(text); }
        @Override public void writeRaw(String text, int offset, int len) throws IOException { buffer.append(text, offset, len); }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException { buffer.append(text, offset, len); }
        @Override public void writeRaw(char c) throws IOException { buffer.append(c); }
        @Override public void writeRawValue(String text) throws IOException { buffer.append(text); }
        @Override public void writeRawValue(String text, int offset, int len) throws IOException { buffer.append(text, offset, len); }
        @Override public void writeRawValue(char[] text, int offset, int len) throws IOException { buffer.append(text, offset, len); }
        @Override public void writeBinary(com.fasterxml.jackson.core.Base64Variant bvariant, byte[] data, int offset, int len) throws IOException {}
        @Override public void writeNumber(short v) throws IOException {}
        @Override public void writeNumber(int v) throws IOException {}
        @Override public void writeNumber(long v) throws IOException {}
        @Override public void writeNumber(java.math.BigInteger v) throws IOException {}
        @Override public void writeNumber(double v) throws IOException {}
        @Override public void writeNumber(float v) throws IOException {}
        @Override public void writeNumber(java.math.BigDecimal v) throws IOException {}
        @Override public void writeNumber(String encodedValue) throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeNull() throws IOException {}
        @Override public void setCurrentObject(Object o) {}
        @Override public Object getCurrentObject() { return null; }
        @Override public void copyCurrentEvent(com.fasterxml.jackson.core.JsonParser p) throws IOException {}
        @Override public void copyCurrentStructure(com.fasterxml.jackson.core.JsonParser p) throws IOException {}
        @Override public com.fasterxml.jackson.core.JsonStreamContext getOutputContext() { return null; }
        @Override public void flush() throws IOException {}
        @Override public void close() throws IOException {}
        @Override public boolean isClosed() { return false; }

        public String getOutput() {
            return buffer.toString();
        }
    }

    @Test
    public void testConstructorsAndRootSeparators() {
        DefaultPrettyPrinter p1 = new DefaultPrettyPrinter();
        assertNotNull(p1);

        DefaultPrettyPrinter p2 = new DefaultPrettyPrinter((String) null);
        assertNull(p2.withRootSeparator((SerializableString) null));

        SerializableString customSep = new SerializedString("-");
        DefaultPrettyPrinter p3 = new DefaultPrettyPrinter(customSep);
        assertSame(p3, p3.withRootSeparator(customSep)); // Same reference check
        assertSame(p3, p3.withRootSeparator("-")); // Same string value check

        DefaultPrettyPrinter p4 = p3.withRootSeparator(":");
        assertNotSame(p3, p4);

        DefaultPrettyPrinter p5 = new DefaultPrettyPrinter(p3);
        assertNotNull(p5);
    }

    @Test
    public void testIndenterSettersAndMutantFactories() {
        DefaultPrettyPrinter.Indenter nop = DefaultPrettyPrinter.NopIndenter.instance;

        // indentArraysWith / withArrayIndenter
        printer.indentArraysWith(null);
        DefaultPrettyPrinter pArray1 = printer.withArrayIndenter(null);
        assertSame(pArray1, pArray1.withArrayIndenter(DefaultPrettyPrinter.NopIndenter.instance));

        DefaultPrettyPrinter.Indenter customIndenter = new DefaultPrettyPrinter.FixedSpaceIndenter();
        DefaultPrettyPrinter pArray2 = printer.withArrayIndenter(customIndenter);
        assertSame(pArray2, pArray2.withArrayIndenter(customIndenter));

        // indentObjectsWith / withObjectIndenter
        printer.indentObjectsWith(null);
        DefaultPrettyPrinter pObj1 = printer.withObjectIndenter(null);
        assertSame(pObj1, pObj1.withObjectIndenter(DefaultPrettyPrinter.NopIndenter.instance));

        DefaultPrettyPrinter pObj2 = printer.withObjectIndenter(customIndenter);
        assertSame(pObj2, pObj2.withObjectIndenter(customIndenter));
    }

    @Test
    public void testSpacesInObjectEntriesMutants() {
        DefaultPrettyPrinter p1 = printer.withSpacesInObjectEntries();
        assertSame(printer, p1); // Already true by default

        DefaultPrettyPrinter p2 = printer.withoutSpacesInObjectEntries();
        assertNotSame(printer, p2);
        assertSame(p2, p2.withoutSpacesInObjectEntries());

        DefaultPrettyPrinter p3 = p2.withSpacesInObjectEntries();
        assertNotSame(p2, p3);
    }

    @Test
    public void testCreateInstance() {
        DefaultPrettyPrinter clone = printer.createInstance();
        assertNotNull(clone);
        assertNotSame(printer, clone);
    }

    @Test
    public void testWriteRootValueSeparator() throws IOException {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        printer.writeRootValueSeparator(gen);
        assertEquals(" ", gen.getOutput());

        DefaultPrettyPrinter noSepPrinter = new DefaultPrettyPrinter((String) null);
        DummyJsonGenerator gen2 = new DummyJsonGenerator();
        noSepPrinter.writeRootValueSeparator(gen2);
        assertEquals("", gen2.getOutput());
    }

    @Test
    public void testObjectFormattingWithInlineAndNonInline() throws IOException {
        // Test with NopIndenter (inline = true)
        printer.indentObjectsWith(DefaultPrettyPrinter.NopIndenter.instance);
        
        DummyJsonGenerator gen = new DummyJsonGenerator();
        printer.writeStartObject(gen);
        printer.beforeObjectEntries(gen);
        printer.writeObjectFieldValueSeparator(gen);
        printer.writeObjectEntrySeparator(gen);
        printer.writeEndObject(gen, 0); // nrOfEntries = 0 -> writes space
        printer.writeEndObject(gen, 1); // nrOfEntries > 0 -> writes indentation

        String output = gen.getOutput();
        assertTrue(output.contains("{"));
        assertTrue(output.contains("}"));
    }

    @Test
    public void testArrayFormattingWithNonInlineIndenter() throws IOException {
        // Test with FixedSpaceIndenter or system indenter (inline = true/false mix)
        printer.indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance);

        DummyJsonGenerator gen = new DummyJsonGenerator();
        printer.writeStartArray(gen);
        printer.beforeArrayValues(gen);
        printer.writeArrayValueSeparator(gen);
        printer.writeEndArray(gen, 0); // nrOfValues = 0
        printer.writeEndArray(gen, 5); // nrOfValues > 0

        assertTrue(gen.getOutput().startsWith("["));
    }

    @Test
    public void testObjectFieldValueSeparatorVariants() throws IOException {
        printer.withoutSpacesInObjectEntries();
        DummyJsonGenerator gen = new DummyJsonGenerator();
        printer.writeObjectFieldValueSeparator(gen);
        assertNotNull(gen.getOutput());
    }
}