package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

// Test class อยู่ package เดียวกับคลาสเป้าหมาย เพื่อเข้าถึง abstract method ได้สะดวก
public class CharSequenceTranslatorTest {

    // ---------- Stub translators สำหรับควบคุม branch ของ translate(CharSequence, Writer) ----------

    /** translate() คืนค่า 0 เสมอ -> ใช้ทดสอบ branch "consumed == 0" */
    private static class NoOpTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    /** consume ทีละ 1 codepoint เสมอ โดยเขียน 'X' แทนที่ -> ทดสอบ branch "consumed > 0" (1 รอบ) */
    private static class SingleConsumeTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            out.write('X');
            return 1;
        }
    }

    /** consume 2 codepoint ในครั้งเดียวที่ index==0 เท่านั้น เพื่อทดสอบ for-loop หลายรอบ */
    private static class DoubleConsumeTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index == 0) {
                out.write('Y');
                return 2;
            }
            return 0;
        }
    }

    /** translate() throw IOException เสมอ -> ทดสอบการ wrap เป็น RuntimeException */
    private static class ThrowingTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("boom");
        }
    }

    // ================= translate(CharSequence) =================

    @Test
    public void testTranslateCharSequence_nullInput_returnsNull() {
        CharSequenceTranslator t = new NoOpTranslator();
        assertNull(t.translate((CharSequence) null));
    }

    @Test
    public void testTranslateCharSequence_emptyInput_returnsEmptyString() {
        CharSequenceTranslator t = new NoOpTranslator();
        assertEquals("", t.translate(""));
    }

    @Test
    public void testTranslateCharSequence_normalInput_consumesEachChar() {
        CharSequenceTranslator t = new SingleConsumeTranslator();
        assertEquals("XX", t.translate("ab"));
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateCharSequence_ioExceptionWrappedAsRuntimeException() {
        // IOException จาก translate(...) ต้องถูก wrap เป็น RuntimeException ตามซอร์ส
        CharSequenceTranslator t = new ThrowingTranslator();
        t.translate("a");
    }

    // ================= translate(CharSequence, Writer) =================

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        CharSequenceTranslator t = new NoOpTranslator();
        t.translate("abc", (Writer) null);
    }

    @Test
    public void testTranslateWriter_nullInput_doesNothing() throws IOException {
        CharSequenceTranslator t = new NoOpTranslator();
        StringWriter writer = new StringWriter();
        t.translate((CharSequence) null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_emptyInput_writesNothing() throws IOException {
        // while(pos<len) ไม่ถูกเข้าเลย เพราะ len==0
        CharSequenceTranslator t = new NoOpTranslator();
        StringWriter writer = new StringWriter();
        t.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedZero_writesOriginalChar() throws IOException {
        // branch consumed==0: เขียน char เดิมกลับไปที่ out
        CharSequenceTranslator t = new NoOpTranslator();
        StringWriter writer = new StringWriter();
        t.translate("abc", writer);
        assertEquals("abc", writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedZero_withSupplementaryCodepoint() throws IOException {
        // ทดสอบ consumed==0 กับ surrogate pair (codepoint นอก BMP, c.length==2)
        CharSequenceTranslator t = new NoOpTranslator();
        StringWriter writer = new StringWriter();
        String supplementary = new String(Character.toChars(0x1F600)); // emoji 2 chars
        t.translate(supplementary, writer);
        assertEquals(supplementary, writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedOne_perCharacter() throws IOException {
        // branch consumed>0, for loop วิ่ง 1 รอบต่อการเรียก
        CharSequenceTranslator t = new SingleConsumeTranslator();
        StringWriter writer = new StringWriter();
        t.translate("ab", writer);
        assertEquals("XX", writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedTwo_multipleCodepointsPerCall() throws IOException {
        // consumed==2: for loop วิ่ง 2 รอบในครั้งเดียว แล้ว while loop ทำงานต่อสำหรับที่เหลือ (consumed==0)
        DoubleConsumeTranslator t = new DoubleConsumeTranslator();
        StringWriter writer = new StringWriter();
        t.translate("abcd", writer);
        // pos0: consume 2 (a,b) -> write 'Y'; pos2: consume0 -> write 'c'; pos3: consume0 -> write 'd'
        assertEquals("Ycd", writer.toString());
    }

    @Test
    public void testTranslateWriter_loopRunsMultipleTimesUntilEnd() throws IOException {
        // ทดสอบ while loop วนหลายรอบจนครบ length
        CharSequenceTranslator t = new SingleConsumeTranslator();
        StringWriter writer = new StringWriter();
        t.translate("abcdef", writer);
        assertEquals("XXXXXX", writer.toString());
    }

    // ================= with() =================

    @Test
    public void testWith_noAdditionalTranslators_returnsNonNullTranslator() {
        CharSequenceTranslator base = new NoOpTranslator();
        CharSequenceTranslator merged = base.with(); // varargs ขนาด 0
        assertNotNull(merged);
        // ไม่ทราบรายละเอียดภายในของ AggregateTranslator จากซอร์สที่ให้มา
        // จึงทดสอบเพียงว่าการ merge สำเร็จและคืนค่าเป็น CharSequenceTranslator
        assertTrue(merged instanceof CharSequenceTranslator);
    }

    @Test
    public void testWith_multipleTranslators_returnsNonNullTranslator() {
        CharSequenceTranslator base = new NoOpTranslator();
        CharSequenceTranslator other1 = new SingleConsumeTranslator();
        CharSequenceTranslator other2 = new NoOpTranslator();
        CharSequenceTranslator merged = base.with(other1, other2);
        assertNotNull(merged);
        assertTrue(merged instanceof CharSequenceTranslator);
    }

    // ================= hex() =================

    @Test
    public void testHex_zero() {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHex_letterUppercase() {
        // 65 = 0x41 ('A')
        assertEquals("41", CharSequenceTranslator.hex(65));
    }

    @Test
    public void testHex_largeValue() {
        assertEquals("FFFF", CharSequenceTranslator.hex(0xFFFF));
    }

    @Test
    public void testHex_negativeValue() {
        // ค่า negative ถูกตีความแบบ unsigned 32-bit โดย Integer.toHexString
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
    }
}
