package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

import static org.junit.Assert.*;

public class CharSequenceTranslatorTest {

    // Mock implementation สำหรับทดสอบพฤติกรรมการ translate
    private static class DummyTranslator extends CharSequenceTranslator {
        private final int customConsumed;
        private final String customTranslation;

        public DummyTranslator(int customConsumed, String customTranslation) {
            this.customConsumed = customConsumed;
            this.customTranslation = customTranslation;
        }

        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (customTranslation != null) {
                out.write(customTranslation);
            }
            return customConsumed;
        }
    }

    // Mock Writer ที่โยน IOException เพื่อทดสอบ Error handling
    private static class FaultyWriter extends Writer {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("Simulated IO Exception");
        }

        @Override
        public void flush() throws IOException {}

        @Override
        public void close() throws IOException {}
    }

    @Test
    public void testTranslateString_NullInput() {
        CharSequenceTranslator translator = new DummyTranslator(0, "");
        assertNull("Null input should return null", translator.translate((String) null));
    }

    @Test
    public void testTranslateString_ValidInput() {
        CharSequenceTranslator translator = new DummyTranslator(0, "A");
        String result = translator.translate("test");
        // "test" มีความยาว 4 ตัวอักษร, แต่ละตัว consumer=0 จะเขียน "A" ออกมา 4 ครั้ง
        assertEquals("AAAA", result);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateString_IoExceptionWrappedInRuntimeException() {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                throw new IOException("Trigger IO Exception");
            }
        };
        translator.translate("trigger");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateWriter_NullWriter() throws IOException {
        CharSequenceTranslator translator = new DummyTranslator(0, "");
        translator.translate("input", null);
    }

    @Test
    public void testTranslateWriter_NullInput() throws IOException {
        StringWriter writer = new StringWriter();
        CharSequenceTranslator translator = new DummyTranslator(0, "");
        translator.translate((CharSequence) null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_ConsumedZero() throws IOException {
        StringWriter writer = new StringWriter();
        // consumed = 0 จะทำให้โค้ดวิ่งเข้ากิ่งเขียนตัวอักษรปกติ
        CharSequenceTranslator translator = new DummyTranslator(0, null);
        translator.translate("a", writer);
        assertEquals("a", writer.toString());
    }

    @Test
    public void testTranslateWriter_ConsumedPositive() throws IOException {
        StringWriter writer = new StringWriter();
        // consumed = 1 แปลว่าตัว translator จัดการเขียนออก writer เรียบร้อยแล้ว
        CharSequenceTranslator translator = new DummyTranslator(1, "Translated");
        translator.translate("a", writer);
        assertEquals("Translated", writer.toString());
    }

    @Test
    public void testTranslateWriter_SurrogatePairHandlingLang6() throws IOException {
        StringWriter writer = new StringWriter();
        // Surrogate pair: ตัวอักษร Unicode นอก Basic Multilingual Plane (เช่น 이모จิ 𠮷)
        // ใช้ 2 char (High Surrogate และ Low Surrogate) แต่เป็น 1 Code Point
        String surrogatePair = "\uD842\uDFB7"; // 𠮷

        // Translator คืนค่า consumed = 1 (นับเป็น 1 code point แต่ใช้ char 2 ตัว)
        // นี่คือหัวใจของบั๊ก Lang-6 ที่ถ้าไม่ใช้ charCount จะคำนวณตำแหน่ง pos ผิดพลาด
        CharSequenceTranslator translator = new DummyTranslator(1, "[SURROGATE]");
        translator.translate(surrogatePair, writer);
        
        assertEquals("[SURROGATE]", writer.toString());
    }

    @Test
    public void testWithMethod() {
        CharSequenceTranslator t1 = new DummyTranslator(1, "1");
        CharSequenceTranslator t2 = new DummyTranslator(1, "2");
        CharSequenceTranslator combined = t1.with(t2);
        
        assertNotNull("Combined translator must not be null", combined);
        assertTrue("Combined translator should be AggregateTranslator", combined instanceof AggregateTranslator);
    }

    @Test
    public void testHexUtility() {
        assertEquals("A", CharSequenceTranslator.hex(10));
        assertEquals("FF", CharSequenceTranslator.hex(255));
        assertEquals("100", CharSequenceTranslator.hex(256));
    }
}