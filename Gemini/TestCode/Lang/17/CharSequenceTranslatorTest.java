package org.apache.commons.lang3.text.translate;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

/**
 * Unit test for {@link CharSequenceTranslator}.
 */
public class CharSequenceTranslatorTest {

    // Concrete translator ที่ไม่ทำการแปลใดๆ (consumed = 0 เสมอ)
    private static final CharSequenceTranslator PASS_THROUGH_TRANSLATOR = new CharSequenceTranslator() {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    };

    // Concrete translator ที่จำลองการ Consume ตัวอักษรตามจำนวนที่กำหนด
    private static class FixedConsumeTranslator extends CharSequenceTranslator {
        private final int consumeCount;

        public FixedConsumeTranslator(int consumeCount) {
            this.consumeCount = consumeCount;
        }

        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index == 0) {
                out.write("[MATCH]");
                return consumeCount;
            }
            return 0;
        }
    }

    // --- Tests for translate(CharSequence) ---

    @Test
    public void testTranslateString_NullInput() {
        assertNull(PASS_THROUGH_TRANSLATOR.translate(null));
    }

    @Test
    public void testTranslateString_EmptyInput() {
        assertEquals("", PASS_THROUGH_TRANSLATOR.translate(""));
    }

    @Test
    public void testTranslateString_ValidInput() {
        assertEquals("Hello World", PASS_THROUGH_TRANSLATOR.translate("Hello World"));
    }

    @Test
    public void testTranslateString_IOExceptionWrapped() {
        CharSequenceTranslator throwingTranslator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                throw new IOException("Simulated IO failure");
            }
        };

        try {
            throwingTranslator.translate("test");
            fail("Expected RuntimeException wrapping IOException");
        } catch (RuntimeException e) {
            assertNotNull(e.getCause());
            assertEquals("Simulated IO failure", e.getCause().getMessage());
        }
    }

    // --- Tests for translate(CharSequence, Writer) ---

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateWriter_NullWriter() throws IOException {
        PASS_THROUGH_TRANSLATOR.translate("test", null);
    }

    @Test
    public void testTranslateWriter_NullInput() throws IOException {
        StringWriter writer = new StringWriter();
        PASS_THROUGH_TRANSLATOR.translate(null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_EmptyInput() throws IOException {
        StringWriter writer = new StringWriter();
        PASS_THROUGH_TRANSLATOR.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_ConsumedZero() throws IOException {
        StringWriter writer = new StringWriter();
        PASS_THROUGH_TRANSLATOR.translate("ABC", writer);
        assertEquals("ABC", writer.toString());
    }

    @Test
    public void testTranslateWriter_ConsumedGreaterThanZero_PosLessThanLenMinusTwo() throws IOException {
        // len = 6, consumed = 2 ที่ index 0 -> pos < len - 2 (0 < 4) เป็นจริง
        CharSequenceTranslator translator = new FixedConsumeTranslator(2);
        StringWriter writer = new StringWriter();
        translator.translate("ABCDEF", writer);
        assertEquals("[MATCH]CDEF", writer.toString());
    }

    @Test
    public void testTranslateWriter_ConsumedGreaterThanZero_PosAtEnd_PosGreaterOrEqualLenMinusTwo() throws IOException {
        // Translator แปลงที่ตำแหน่งท้ายๆ เพื่อเข้า Branch else (pos >= len - 2)
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (index == 2) { // ที่ตำแหน่ง len - 1 (สำหรับ "ABC")
                    out.write("[END]");
                    return 1;
                }
                return 0;
            }
        };

        StringWriter writer = new StringWriter();
        translator.translate("ABC", writer);
        assertEquals("AB[END]", writer.toString());
    }

    @Test
    public void testTranslateWriter_SupplementaryCharacters_SurrogatePair() throws IOException {
        // อักขระเสริม Unicode (Surrogate Pair: Code point 0x1F600 = 😀)
        // input = "😀" (ความยาว char คือ 2 แต่ codePointCount คือ 1)
        String supplementary = "\uD83D\uDE00";
        StringWriter writer = new StringWriter();
        PASS_THROUGH_TRANSLATOR.translate(supplementary, writer);
        assertEquals(supplementary, writer.toString());
    }

    @Test
    public void testTranslateWriter_SupplementaryWithSubsequentChars() throws IOException {
        // ทดสอบ Surrogate Pair ร่วมกับตัวอักษรธรรมดาและ Translator ทำงาน
        String input = "\uD83D\uDE00Hello\uD83D\uDE02";
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                int codePoint = Character.codePointAt(input, index);
                if (codePoint == 0x1F600) {
                    out.write("[SMILE]");
                    return 1;
                }
                return 0;
            }
        };

        StringWriter writer = new StringWriter();
        translator.translate(input, writer);
        assertEquals("[SMILE]Hello\uD83D\uDE02", writer.toString());
    }

    // --- Tests for with(CharSequenceTranslator...) ---

    @Test
    public void testWith_SingleTranslator() {
        CharSequenceTranslator t1 = new FixedConsumeTranslator(1);
        CharSequenceTranslator combined = PASS_THROUGH_TRANSLATOR.with(t1);
        assertNotNull(combined);
    }

    @Test
    public void testWith_MultipleTranslators() {
        CharSequenceTranslator t1 = new FixedConsumeTranslator(1);
        CharSequenceTranslator t2 = new FixedConsumeTranslator(2);
        CharSequenceTranslator combined = PASS_THROUGH_TRANSLATOR.with(t1, t2);
        assertNotNull(combined);
    }

    @Test
    public void testWith_EmptyTranslators() {
        CharSequenceTranslator combined = PASS_THROUGH_TRANSLATOR.with();
        assertNotNull(combined);
    }

    // --- Tests for hex(int) ---

    @Test
    public void testHex_Zero() {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHex_LowerCaseConversionToUpperCase() {
        // 171 ในฐาน 16 คือ 'ab' -> ต้องแปลงเป็น 'AB'
        assertEquals("AB", CharSequenceTranslator.hex(171));
        assertEquals("1A", CharSequenceTranslator.hex(26));
        assertEquals("FFFF", CharSequenceTranslator.hex(65535));
    }

    @Test
    public void testHex_HighCodePoint() {
        // ขอบเขต Code Point สูงสุดใน Unicode
        assertEquals("10FFFF", CharSequenceTranslator.hex(0x10FFFF));
    }
}