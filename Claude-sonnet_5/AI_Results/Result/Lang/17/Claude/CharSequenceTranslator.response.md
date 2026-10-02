# คำอธิบายแนวทางการทดสอบ

เนื่องจาก `CharSequenceTranslator` เป็น abstract class ผมจึงสร้าง **test-double subclasses** ภายในไฟล์ทดสอบ (anonymous/private static inner class) เพื่อควบคุมค่า `consumed` ที่คืนจาก `translate(CharSequence, int, Writer)` ให้ตรงกับ branch ที่ต้องการทดสอบในเมธอด `translate(CharSequence, Writer)` (ลูปหลักและลูปซ้อนด้านใน)

สำหรับ `with()` เนื่องจาก `AggregateTranslator` ไม่มีซอร์สโค้ดให้ จึงทดสอบเฉพาะ **structural correctness** (ไม่เดา behavior ภายใน) ตามข้อกำหนดที่ 4

```java
package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link CharSequenceTranslator}.
 * Target class: Defects4J Lang-17b (org.apache.commons.lang3.text.translate.CharSequenceTranslator)
 */
public class CharSequenceTranslatorTest {

    // ---------------------------------------------------------------------
    // Test-double translators used to drive specific branches of the
    // package-private algorithm in translate(CharSequence, Writer).
    // ---------------------------------------------------------------------

    /** Always returns 0 -> forces the "consumed == 0" branch (writes original char). */
    private static class IdentityTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    /** Always throws IOException -> used to verify wrapping into RuntimeException. */
    private static class ThrowingTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("boom");
        }
    }

    /**
     * Writes {@code writeStr} and returns {@code consumedCount} ONLY when
     * {@code index == triggerIndex}; otherwise returns 0 (pass-through).
     * Used to control exactly when the "consumed != 0" branch (inner for-loop)
     * is entered, and with what value, to hit both true/false branches of
     * "pos < len - 2".
     */
    private static class MultiConsumeAtIndexTranslator extends CharSequenceTranslator {
        private final int triggerIndex;
        private final int consumedCount;
        private final String writeStr;

        MultiConsumeAtIndexTranslator(int triggerIndex, int consumedCount, String writeStr) {
            this.triggerIndex = triggerIndex;
            this.consumedCount = consumedCount;
            this.writeStr = writeStr;
        }

        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index == triggerIndex) {
                out.write(writeStr);
                return consumedCount;
            }
            return 0;
        }
    }

    // =====================================================================
    // translate(CharSequence) - final helper method
    // =====================================================================

    @Test
    public void testTranslateCharSequence_nullInput_returnsNull() {
        CharSequenceTranslator t = new IdentityTranslator();
        assertNull(t.translate((CharSequence) null));
    }

    @Test
    public void testTranslateCharSequence_emptyInput_returnsEmptyString() {
        CharSequenceTranslator t = new IdentityTranslator();
        assertEquals("", t.translate(""));
    }

    @Test
    public void testTranslateCharSequence_normalInput_passThrough() {
        CharSequenceTranslator t = new IdentityTranslator();
        assertEquals("abc", t.translate("abc"));
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateCharSequence_ioExceptionIsWrappedAsRuntimeException() {
        CharSequenceTranslator t = new ThrowingTranslator();
        t.translate("x"); // underlying translate() throws IOException -> caught & rethrown
    }

    @Test
    public void testTranslateCharSequence_ioExceptionCauseIsPreserved() {
        CharSequenceTranslator t = new ThrowingTranslator();
        try {
            t.translate("x");
            fail("Expected RuntimeException");
        } catch (RuntimeException re) {
            assertTrue(re.getCause() instanceof IOException);
        }
    }

    // =====================================================================
    // translate(CharSequence, Writer) - final core algorithm
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        CharSequenceTranslator t = new IdentityTranslator();
        t.translate("abc", (Writer) null);
    }

    @Test
    public void testTranslateWriter_nullInput_doesNothingWritesNothing() throws IOException {
        CharSequenceTranslator t = new IdentityTranslator();
        StringWriter writer = new StringWriter();
        t.translate((CharSequence) null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_emptyInput_loopBodyNeverEntered() throws IOException {
        CharSequenceTranslator t = new IdentityTranslator();
        StringWriter writer = new StringWriter();
        t.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedZeroBranch_writesOriginalChars() throws IOException {
        // consumed == 0 for every call -> exercises Character.toChars()/out.write(c) branch
        CharSequenceTranslator t = new IdentityTranslator();
        StringWriter writer = new StringWriter();
        t.translate("abc", writer);
        assertEquals("abc", writer.toString());
    }

    @Test
    public void testTranslateWriter_multiConsume_bothBranchesOfInnerLoopCondition() throws IOException {
        // "abcde" -> len=5
        // pos=0,1: consumed=0 -> write 'a','b'
        // pos=2: consumed=3 (writes "X") -> inner for-loop runs 3 times:
        //   pt=0: pos(2) < len-2(3) -> TRUE  branch -> pos += charCount = 3
        //   pt=1: pos(3) < 3        -> FALSE branch -> pos++ = 4
        //   pt=2: pos(4) < 3        -> FALSE branch -> pos++ = 5
        // pos-- -> 4 ; outer pos++ -> 5 == len -> loop ends
        CharSequenceTranslator t = new MultiConsumeAtIndexTranslator(2, 3, "X");
        StringWriter writer = new StringWriter();
        t.translate("abcde", writer);
        assertEquals("abX", writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedWholeStringAtIndexZero() throws IOException {
        // "abc" -> len=3
        // pos=0: consumed=3 (writes "Y") -> inner loop:
        //   pt=0: pos(0) < len-2(1) -> TRUE -> pos += charCount = 1
        //   pt=1: pos(1) < 1        -> FALSE -> pos++ = 2
        //   pt=2: pos(2) < 1        -> FALSE -> pos++ = 3
        // pos-- -> 2 ; outer pos++ -> 3 == len -> loop ends
        CharSequenceTranslator t = new MultiConsumeAtIndexTranslator(0, 3, "Y");
        StringWriter writer = new StringWriter();
        t.translate("abc", writer);
        assertEquals("Y", writer.toString());
    }

    @Test
    public void testTranslateWriter_shortInput_negativeLenMinusTwo_alwaysFalseBranch() throws IOException {
        // "a" -> len=1, len-2 = -1 (negative) -> "pos < len-2" is always FALSE
        // ensures the else-branch (pos++) of the inner condition is exercised
        // when len-2 is negative (boundary case not covered by longer strings)
        CharSequenceTranslator t = new MultiConsumeAtIndexTranslator(0, 1, "");
        StringWriter writer = new StringWriter();
        t.translate("a", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_supplementaryCharacter_consumedZeroBranch() throws IOException {
        // Boundary: supplementary character (surrogate pair) with consumed==0
        // exercises Character.toChars(Character.codePointAt(...)) correctly
        // reproducing both surrogate chars via out.write(char[]).
        CharSequenceTranslator t = new IdentityTranslator();
        String emoji = "\uD83D\uDE00"; // one codepoint, 2 chars
        StringWriter writer = new StringWriter();
        t.translate(emoji, writer);
        assertEquals(emoji, writer.toString());
    }

    @Test
    public void testTranslateWriter_multipleSupplementaryCharacters_lenMinusTwoZeroBranch() throws IOException {
        // Two supplementary characters (4 chars, 2 codepoints) -> len=2, len-2=0
        // so "pos < len-2" (pos < 0) is ALWAYS false inside inner loop,
        // regardless of consumed value. Captures this specific boundary
        // derived strictly from tracing the given algorithm (not external spec).
        String twoSupplementary = "\uD800\uDC00\uD800\uDC01";
        CharSequenceTranslator t = new MultiConsumeAtIndexTranslator(0, 2, "Z");
        StringWriter writer = new StringWriter();
        t.translate(twoSupplementary, writer);
        assertEquals("Z", writer.toString());
    }

    // =====================================================================
    // with(CharSequenceTranslator...) - final method
    // =====================================================================

    @Test
    public void testWith_returnsNonNullCharSequenceTranslatorInstance() {
        CharSequenceTranslator a = new IdentityTranslator();
        CharSequenceTranslator b = new IdentityTranslator();
        CharSequenceTranslator merged = a.with(b);
        assertNotNull(merged);
        assertTrue(merged instanceof CharSequenceTranslator);
        // NOTE: exact internal merge/translate behavior of AggregateTranslator
        // is NOT part of the given source, so only structural checks are made.
    }

    @Test
    public void testWith_noAdditionalTranslators_stillReturnsInstance() {
        CharSequenceTranslator a = new IdentityTranslator();
        CharSequenceTranslator merged = a.with(); // zero-length varargs array
        assertNotNull(merged);
    }

    @Test(expected = NullPointerException.class)
    public void testWith_nullArray_throwsNullPointerException() {
        CharSequenceTranslator a = new IdentityTranslator();
        // translators.length dereference on null array -> NPE (direct consequence
        // of given source, not an external guess)
        a.with((CharSequenceTranslator[]) null);
    }

    // =====================================================================
    // hex(int) - static helper
    // =====================================================================

    @Test
    public void testHex_zero() {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHex_digitsOnly_noLetters() {
        assertEquals("41", CharSequenceTranslator.hex(0x41));
    }

    @Test
    public void testHex_lowerHexConvertedToUpperCase() {
        assertEquals("AB", CharSequenceTranslator.hex(0xAB));
    }

    @Test
    public void testHex_largeValue() {
        assertEquals("FFFF", CharSequenceTranslator.hex(0xFFFF));
    }

    @Test
    public void testHex_negativeCodepoint_boundaryInput() {
        // Not a valid Unicode codepoint, but method has no validation - 
        // behavior derived directly from Integer.toHexString(-1) semantics.
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testTranslateCharSequence_nullInput_returnsNull` | `translate(CharSequence)`: `if (input == null)` = true |
| `testTranslateCharSequence_emptyInput_returnsEmptyString` | `input == null` = false, loop ไม่ถูกเข้า (empty string) |
| `testTranslateCharSequence_normalInput_passThrough` | เส้นทาง normal, ไม่มี exception |
| `testTranslateCharSequence_ioExceptionIsWrappedAsRuntimeException` | `catch (IOException ioe)` branch |
| `testTranslateCharSequence_ioExceptionCauseIsPreserved` | ตรวจ cause ของ RuntimeException ที่ wrap |
| `testTranslateWriter_nullWriter_throwsIllegalArgumentException` | `if (out == null)` = true |
| `testTranslateWriter_nullInput_doesNothingWritesNothing` | `out == null` false, `if (input == null) return;` = true |
| `testTranslateWriter_emptyInput_loopBodyNeverEntered` | `while (pos < len)` = false ตั้งแต่แรก (len=0) |
| `testTranslateWriter_consumedZeroBranch_writesOriginalChars` | `if (consumed == 0)` = true (หลายรอบ loop) |
| `testTranslateWriter_multiConsume_bothBranchesOfInnerLoopCondition` | `consumed != 0` (else), inner `for`, `pos < len-2` ทั้ง true และ false ในครั้งเดียว |
| `testTranslateWriter_consumedWholeStringAtIndexZero` | consumed ครอบคุมทั้ง string ตั้งแต่ pos=0, inner loop true→false→false |
| `testTranslateWriter_shortInput_negativeLenMinusTwo_alwaysFalseBranch` | boundary: `len-2` เป็นค่าลบ → `pos < len-2` false เสมอ |
| `testTranslateWriter_supplementaryCharacter_consumedZeroBranch` | `consumed==0` กับ surrogate pair (Character.toChars/codePointAt) |
| `testTranslateWriter_multipleSupplementaryCharacters_lenMinusTwoZeroBranch` | boundary: `len-2 == 0` → inner condition false เสมอ แม้ consumed>1 |
| `testWith_returnsNonNullCharSequenceTranslatorInstance` | `with(translators...)` ปกติ, ตรวจ type เท่าที่ source ยืนยันได้ |
| `testWith_noAdditionalTranslators_stillReturnsInstance` | varargs length = 0 |
| `testWith_nullArray_throwsNullPointerException` | NPE จาก `translators.length` เมื่อ array null |
| `testHex_zero` / `testHex_digitsOnly_noLetters` / `testHex_lowerHexConvertedToUpperCase` / `testHex_largeValue` / `testHex_negativeCodepoint_boundaryInput` | ค่าขอบเขตและการแปลงตัวพิมพ์ของ `hex(int)` |

**หมายเหตุ:** เนื่องจาก `AggregateTranslator` ไม่มีซอร์สโค้ดให้ในโจทย์ จึงไม่มีการเดา behavior การ merge/translate ภายใน ทดสอบเฉพาะ contract ที่ยืนยันได้จาก `CharSequenceTranslator.with()` เท่านั้น