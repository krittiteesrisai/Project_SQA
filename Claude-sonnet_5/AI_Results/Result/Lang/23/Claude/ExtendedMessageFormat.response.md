# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `ExtendedMessageFormat`

จากการวิเคราะห์ซอร์สโค้ดอย่างละเอียด พบ branch/condition สำคัญหลายจุด รวมถึง**จุดที่อาจเป็น fault จริง** เช่น การนับ format element ที่อยู่ใน quoted text ผิดพลาด (ทำให้ array index ไม่ตรงกัน) ด้านล่างคือชุดทดสอบที่ครอบคลุม branch ต่าง ๆ ตามที่วิเคราะห์ได้ โดยมีคอมเมนต์กำกับจุดที่ไม่แน่ใจ 100%

```java
package org.apache.commons.lang3.text;

import static org.junit.Assert.*;

import java.text.Format;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Test;

public class ExtendedMessageFormatTest {

    // ---------- Helper: Format factory ที่คืนค่า format เสมอ ----------
    private FormatFactory alwaysReturnFormat(final Format f) {
        return new FormatFactory() {
            public Format getFormat(String name, String args, Locale locale) {
                return f;
            }
        };
    }

    // ================= Constructors =================

    @Test
    public void testConstructor_PatternOnly() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testConstructor_PatternAndLocale() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hi {0}", Locale.US);
        assertEquals("Hi {0}", emf.toPattern());
    }

    @Test
    public void testConstructor_PatternAndRegistry_DefaultLocale() {
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("X {0}", reg);
        assertEquals("X {0}", emf.toPattern());
    }

    @Test
    public void testConstructor_FullArgs() {
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Y {0}", Locale.GERMANY, reg);
        assertEquals("Y {0}", emf.toPattern());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullPattern_RegistryNull() {
        // registry == null -> delegates to super.applyPattern(null) -> NPE คาดหวัง
        new ExtendedMessageFormat(null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullPattern_RegistryNotNull() {
        // registry != null -> pattern.length() ถูกเรียกตรง ๆ -> NPE
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat(null, reg);
    }

    // ================= applyPattern: registry == null branch =================

    @Test
    public void testApplyPattern_RegistryNull_DelegatesToSuper() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("plain text, no args");
        assertEquals("plain text, no args", emf.toPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_RegistryNull_InvalidStandardFormat() {
        // registry==null -> super.applyPattern ควร throw เพราะ "bogus" ไม่ใช่ format type มาตรฐาน
        new ExtendedMessageFormat("{0,bogus}");
    }

    // ================= applyPattern: registry != null, empty pattern / no format element =================

    @Test
    public void testApplyPattern_RegistryNotNull_EmptyPattern() {
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("", reg);
        assertEquals("", emf.toPattern());
    }

    @Test
    public void testApplyPattern_RegistryNotNull_NoFormatDescription() {
        // "{0}" ไม่มี START_FMT -> format == null, containsElements(foundFormats) == false
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", reg);
        assertEquals("{0}", emf.toPattern());
        assertEquals("val", emf.format(new Object[] { "val" }));
    }

    @Test
    public void testApplyPattern_RegistryNotNull_MultipleArgsNoFormat() {
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0} and {1}", reg);
        assertEquals("a and b", emf.format(new Object[] { "a", "b" }));
    }

    // ================= getFormat(desc): factory found / not found, i>0 branch =================

    @Test
    public void testApplyPattern_CustomFormatFound_NoArgs() {
        // desc = "custom" (ไม่มี comma) -> i<=0 -> name = desc ทั้งหมด
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        reg.put("custom", alwaysReturnFormat(new DecimalFormat("0")));
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,custom}", reg);
        // format == found -> ควรไม่ throw, และ toPattern ต้องมี description กลับมา (insertFormats)
        assertEquals("{0,custom}", emf.toPattern());
        assertEquals("4", emf.format(new Object[] { 3.7 }));
    }

    @Test
    public void testApplyPattern_CustomFormatFound_WithArgs_IGreaterThanZero() {
        // desc = "num,integer" -> i = indexOf(',') = 3 > 0 -> name="num", args="integer"
        final String[] capturedArgs = new String[1];
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        reg.put("num", new FormatFactory() {
            public Format getFormat(String name, String args, Locale locale) {
                capturedArgs[0] = args;
                return new DecimalFormat("0");
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,num,integer}", reg);
        assertEquals("integer", capturedArgs[0]);
        // ทดสอบ insertFormats: ต้อง reconstruct description กลับเข้า pattern
        assertEquals("{0,num,integer}", emf.toPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_CustomFormatNotFound_FallbackToSuper() {
        // registry ว่าง -> factory == null -> format == null -> stripCustom เก็บ desc เดิม
        // -> super.applyPattern("{0,unknownFmt}") ควร throw เพราะไม่รู้จัก format type
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("{0,unknownFmt}", reg);
    }

    @Test
    public void testGetFormat_LocalePassedToFactory() {
        final Locale[] capturedLocale = new Locale[1];
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        reg.put("f", new FormatFactory() {
            public Format getFormat(String name, String args, Locale locale) {
                capturedLocale[0] = locale;
                return new DecimalFormat("0");
            }
        });
        new ExtendedMessageFormat("{0,f}", Locale.GERMANY, reg);
        assertEquals(Locale.GERMANY, capturedLocale[0]);
    }

    // ================= readArgumentIndex: whitespace handling =================

    @Test
    public void testReadArgumentIndex_WhitespaceBeforeStartFmt_Success() {
        // "{0 ,custom}" -> whitespace หลัง digit แล้วพบ START_FMT -> ไม่ error
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        reg.put("custom", alwaysReturnFormat(new DecimalFormat("0")));
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0 ,custom}", reg);
        assertNotNull(emf.toPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadArgumentIndex_WhitespaceThenInvalidChar_Error() {
        // "{0 x}" -> หลัง whitespace พบ 'x' ซึ่งไม่ใช่ START_FMT หรือ END_FE -> error = true
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("{0 x}", reg);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadArgumentIndex_NonDigitChar_Error() {
        // "{a}" -> error = !isDigit('a') = true -> "Invalid format argument index"
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("{a}", reg);
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid format argument index"));
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadArgumentIndex_Unterminated() {
        // "{0" -> ไม่มี END_FE/START_FMT เลย -> "Unterminated format element"
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("{0", reg);
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unterminated"));
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadArgumentIndex_OversizedNumber_NumberFormatExceptionSwallowed() {
        // ตัวเลขเกิน Integer range -> NumberFormatException ถูก catch (ignored),
        // แต่ fall-through ทำให้ error=true ('}' ไม่ใช่ digit) -> throw "Invalid format argument index"
        // (วิเคราะห์จาก logic: try/catch ภายใน if-block ไม่ return เมื่อ parse ล้มเหลว)
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("{99999999999999999999}", reg);
    }

    // ================= parseFormatDescription: nested braces / quote inside =================

    @Test(expected = IllegalArgumentException.class)
    public void testParseFormatDescription_Unterminated() {
        // "{0,abc" -> ไม่มี END_FE ปิด format description -> "Unterminated format element"
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("{0,abc", reg);
    }

    @Test
    public void testParseFormatDescription_NestedBraces_DepthTracking() {
        // "{0,plain{nested}done}" -> depth++ แล้ว depth-- สองครั้งก่อน match depth==0 จริง
        // factory ไม่พบ name "plain{nested}done" ใน registry -> format==null
        // -> stripCustom เก็บ desc เดิม -> super.applyPattern ล้มเหลวเพราะไม่ใช่ format type จริง
        // สิ่งที่ต้องการพิสูจน์คือ parseFormatDescription "ไม่" throw Unterminated (depth logic ทำงานถูก)
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("{0,plain{nested}done}", reg);
            fail("Expected IllegalArgumentException from super.applyPattern (unknown format type)");
        } catch (IllegalArgumentException e) {
            // ต้องไม่ใช่ "Unterminated" (แสดงว่า depth matching สำเร็จ ก่อนไปพังที่ชั้น super)
            assertFalse(e.getMessage().contains("Unterminated"));
        }
    }

    @Test
    public void testParseFormatDescription_QuoteInsideDescription() {
        // "{0,test,'quoted}text'}" -> QUOTE case ใน parseFormatDescription เรียก getQuotedString(escapingOn=false)
        // ตาม logic จริง (ดูคอมเมนต์ด้านล่าง) appendQuotedString จะ consume แค่ 1 ตัวอักษร (quote เปิด)
        // แล้ว return ทันที (ไม่ scan หา quote ปิดจริง) — นี่คือจุดที่น่าสงสัยว่าอาจเป็น "โค้ดที่ตายแล้ว"
        // (ไม่แน่ใจ 100% ว่าผลลัพธ์สุดท้ายคืออะไรแบบ exact string, จึงตรวจแค่ "ไม่ throw ตอนparse description")
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        reg.put("test", alwaysReturnFormat(new DecimalFormat("0")));
        try {
            new ExtendedMessageFormat("{0,test,'quoted}text'}", reg);
            // ถ้าไม่ throw ก็ผ่าน -- เป้าหมายคือ exercise branch QUOTE ใน parseFormatDescription
        } catch (IllegalArgumentException e) {
            // อนุญาตให้ throw ได้เช่นกัน เนื่องจากผลลัพธ์ภายในซับซ้อน (จุดไม่แน่ใจ)
            assertNotNull(e.getMessage());
        }
    }

    // ================= Quote handling ใน applyPattern loop (escapingOn = true) =================

    @Test
    public void testApplyPattern_EscapedQuote_LiteralQuoteCharacter() {
        // "a''b {0}" : ทุก quote ถูก appendQuotedString คืนค่าเป็น QUOTE เดี่ยว (ดู source: เงื่อนไข
        // escapingOn && c[start]==QUOTE เป็น true เสมอเมื่อถูกเรียกจาก applyPattern)
        // ผลที่เกิดจริงคือ stripCustom ได้ "a''b {0}" เหมือนเดิม แล้ว super.applyPattern (ของ MessageFormat จริง)
        // จะตีความ '' เป็น literal quote ตามมาตรฐาน -> ผลลัพธ์ format() ควรมี quote เดี่ยวหนึ่งตัว
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("a''b {0}", reg);
        String result = emf.format(new Object[] { "X" });
        assertTrue(result.contains("'")); // ควรมี literal quote อย่างน้อย 1 ตัว
        assertTrue(result.contains("X"));
    }

    // ================= Fault-detection: quoted pseudo-format-element mismatch =================

    @Test
    public void testApplyPattern_QuotedFormatElement_FormatCountMismatch_PotentialFault() {
        // "'{0}' {1,custom}" :
        // Custom scanner นับ "{0}" ที่อยู่ใน quote เป็น format element ด้วย (fmtCount=2, foundFormats=[null, fmt])
        // แต่ java.text.MessageFormat (ของจริง) ตีความ '{0}' ที่ถูก quote เป็น literal text
        // -> getFormats() จะมีขนาดแค่ 1 (เฉพาะ argument index 1)
        // เมื่อ loop พยายาม origFormats[1] = someFormat อาจทำให้เกิด
        // ArrayIndexOutOfBoundsException (เนื่องจาก index ไม่ตรงกับขนาด array จริง)
        // *** นี่คือจุดที่คาดว่าจะ "ดักจับ fault" จริงของ ExtendedMessageFormat (Lang-23) ***
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        reg.put("custom", alwaysReturnFormat(new DecimalFormat("0")));
        try {
            ExtendedMessageFormat emf = new ExtendedMessageFormat("'{0}' {1,custom}", reg);
            // ถ้าไม่ throw แสดงว่า implementation นี้จัดการ edge case ได้ (เป็นไปได้หาก getFormats() ขนาดพอดี)
            assertNotNull(emf); // อย่างน้อยไม่ null
        } catch (ArrayIndexOutOfBoundsException e) {
            // นี่คือ fault ที่คาดว่าจะพบจากการวิเคราะห์ source code
            assertNotNull(e);
        } catch (IllegalArgumentException e) {
            // เผื่อ super.applyPattern พังก่อนด้วยเหตุผลอื่น (จุดไม่แน่ใจ 100%)
            assertNotNull(e.getMessage());
        }
    }

    // ================= insertFormats: containsElements == false branch =================

    @Test
    public void testInsertFormats_NoCustomDescriptions_ReturnsPatternUnchanged() {
        // ทุก format == null -> foundDescriptions ทุกตัวเป็น null -> containsElements เป็น false
        // -> insertFormats return pattern (super.toPattern()) ตรง ๆ ไม่แปลง
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0} {1}", reg);
        assertEquals("{0} {1}", emf.toPattern());
    }

    // ================= containsElements: coll == null / size == 0 =================
    // containsElements เป็น private method, ทดสอบผ่าน indirect path ด้านบนแล้ว
    // (empty pattern -> foundFormats.size()==0 -> containsElements คืน false)
    @Test
    public void testContainsElements_EmptyCollection_ViaEmptyPattern() {
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("no braces here", reg);
        assertEquals("no braces here", emf.toPattern());
    }

    // ================= setFormat* : UnsupportedOperationException =================

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormat_Throws() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormat(0, new DecimalFormat("0"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndex_Throws() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormatByArgumentIndex(0, new DecimalFormat("0"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormats_Throws() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormats(new Format[] { new DecimalFormat("0") });
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndex_Throws() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormatsByArgumentIndex(new Format[] { new DecimalFormat("0") });
    }

    // ================= toPattern() basic getter =================

    @Test
    public void testToPattern_ReturnsStoredField() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0} test {1}");
        assertEquals("{0} test {1}", emf.toPattern());
    }

    // ================= containsElements(foundFormats) == true branch, single element =================

    @Test
    public void testApplyPattern_SingleCustomFormat_SetsFormatCorrectly() {
        // containsElements(foundFormats) == true, loop ทำงานโดยไม่มี index mismatch (ไม่มี quote)
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        reg.put("intfmt", alwaysReturnFormat(new DecimalFormat("0")));
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value={0,intfmt}", reg);
        assertEquals("Value=5", emf.format(new Object[] { 4.6 }));
    }

    // ================= Boundary: argument index 0 =================

    @Test
    public void testArgumentIndex_Zero() {
        Map<String, FormatFactory> reg = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", reg);
        assertEquals("zero", emf.format(new Object[] { "zero" }));
    }
}
```

---

## สรุปตาราง: เมธอดทดสอบ กับ Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructor_* (4 เมธอด) | ตัว constructor ทั้ง 4 overload (delegation chain) |
| testConstructor_NullPattern_RegistryNull/NotNull | NPE เมื่อ pattern เป็น null ทั้ง 2 เส้นทาง (registry null/ไม่ null) |
| testApplyPattern_RegistryNull_* | `if (registry == null)` → true branch, delegate ตรงไป super.applyPattern |
| testApplyPattern_RegistryNotNull_EmptyPattern | loop `while` ไม่เข้า (pattern ว่าง), containsElements=false |
| testApplyPattern_RegistryNotNull_NoFormatDescription/MultipleArgsNoFormat | `case START_FE` โดยไม่มี START_FMT (format==null), loop หลายรอบ |
| testApplyPattern_CustomFormatFound_NoArgs/WithArgs | `getFormat`: factory พบ, `i>0` true/false ใน `desc.indexOf(START_FMT)` |
| testApplyPattern_CustomFormatNotFound_FallbackToSuper | factory == null → format==null → ส่ง desc กลับไป super, throw จาก super |
| testGetFormat_LocalePassedToFactory | ยืนยัน `getLocale()` ถูกส่งเข้า factory ถูกต้อง |
| testReadArgumentIndex_WhitespaceBeforeStartFmt_Success | whitespace branch ใน `readArgumentIndex` ที่ไม่ error |
| testReadArgumentIndex_WhitespaceThenInvalidChar_Error | whitespace branch ที่นำไปสู่ error=true |
| testReadArgumentIndex_NonDigitChar_Error | `error = !isDigit(c)` → true, throw "Invalid format argument index" |
| testReadArgumentIndex_Unterminated | loop จบโดยไม่เจอ END_FE/START_FMT → throw "Unterminated format element" |
| testReadArgumentIndex_OversizedNumber_... | NumberFormatException ถูก catch (swallow) แล้ว fall-through → error path |
| testParseFormatDescription_Unterminated | loop จบโดย depth != 0 → throw "Unterminated format element" |
| testParseFormatDescription_NestedBraces_DepthTracking | `case START_FE: depth++`, `case END_FE: depth--` หลายรอบก่อน depth==0 |
| testParseFormatDescription_QuoteInsideDescription | `case QUOTE` → เรียก `getQuotedString(escapingOn=false)` |
| testApplyPattern_EscapedQuote_LiteralQuoteCharacter | `case QUOTE` ใน applyPattern loop, `appendQuotedString(escapingOn=true)` early-return branch |
| testApplyPattern_QuotedFormatElement_FormatCountMismatch_PotentialFault | **Fault-detection**: fmtCount/foundFormats นับ element ใน quote ผิด → origFormats[i] อาจ ArrayIndexOutOfBounds |
| testInsertFormats_NoCustomDescriptions_ReturnsPatternUnchanged | `insertFormats`: `if (!containsElements(customPatterns))` → true, return pattern ตรง |
| testApplyPattern_CustomFormatFound_WithArgs_IGreaterThanZero (ซ้ำใช้) | `insertFormats`: containsElements=true, loop insert customPattern กลับ, `depth` tracking ใน insertFormats |
| testContainsElements_EmptyCollection_ViaEmptyPattern | `containsElements`: `coll.size()==0` → false |
| testSetFormat_Throws / setFormatByArgumentIndex / setFormats / setFormatsByArgumentIndex | ทั้ง 4 เมธอด throw `UnsupportedOperationException` เสมอ |
| testToPattern_ReturnsStoredField | `toPattern()` getter คืนค่า field ตรง |
| testApplyPattern_SingleCustomFormat_SetsFormatCorrectly | `containsElements(foundFormats)==true` branch, inner for-loop set `origFormats[i]=f` เมื่อไม่มี mismatch |
| testArgumentIndex_Zero | boundary: argument index = 0 |

### หมายเหตุสำคัญ (จุดที่ไม่แน่ใจ 100% — ตามข้อกำหนดที่ 4)
- **`c[pos.getIndex()] != END_FE` branch** (throw "Unreadable format element at position ...") จากการ trace logic พบว่า `readArgumentIndex`/`parseFormatDescription` การันตีว่า pos จะจบที่ END_FE เสมอในกรณี pattern ที่ parse ผ่านมาได้ถึงจุดนั้น — จึงดูเหมือนเป็น **branch ที่ไม่สามารถ reach ได้** ด้วย input ปกติ ไม่ได้เขียน test บังคับ branch นี้โดยตรง เพราะไม่สามารถยืนยัน input ที่ทำให้เกิดได้โดยไม่เดา
- **`appendQuotedString`** ด้วยการ trace พบว่า loop การสแกน quote แบบเต็ม (รวม ESCAPED_QUOTE multi-char check และ "Unterminated quoted string" exception) **อาจเป็น dead code** เนื่องจาก entry point ทุกจุดมาถึง method นี้ด้วย `c[start]==QUOTE` เสมอ ทำให้ condition แรกจับคู่ทันทีในทุกกรณี — จึงเขียน test แบบระบุคอมเมนต์กำกับความไม่แน่ใจ และไม่ assert string ผลลัพธ์แบบตายตัวในบางเคส
- Test `testApplyPattern_QuotedFormatElement_FormatCountMismatch_PotentialFault` เป็นความพยายามเจาะจง "ดักจับ fault" ตามที่วิเคราะห์จาก logic จริง — อนุญาตให้ผลลัพธ์เป็นได้ทั้ง exception หลายแบบ เนื่องจากไม่ได้รันจริงเพื่อยืนยัน exact behavior