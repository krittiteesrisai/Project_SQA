# ExtendedMessageFormatTest.java

```java
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.apache.commons.lang.text.FormatFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for {@link ExtendedMessageFormat} (Defects4J Lang-43b).
 *
 * หมายเหตุสำคัญ:
 * จากการไล่อ่าน source ของ appendQuotedString(...) พบว่าเมื่อถูกเรียกด้วย escapingOn=true
 * (เส้นทางที่ใช้ใน applyPattern() หลัก เมื่อ registry != null และเจอ QUOTE)
 * มีความเป็นไปได้สูงที่จะเกิด infinite loop เนื่องจากเงื่อนไข
 * `if (escapingOn && c[start] == QUOTE)` จะเป็น true เสมอ (เพราะถูกเรียกตอนที่ตัวอักษร
 * ปัจจุบันคือ QUOTE อยู่แล้ว) และ method คืนค่าทันทีโดยไม่เลื่อน pos เลย ทำให้ loop
 * ใน applyPattern() วนซ้ำที่ตำแหน่งเดิมไม่จบ เราจึงไม่ "เดา" ผลลัพธ์ที่แน่นอน
 * แต่ใส่ timeout ป้องกันไม่ให้ชุดทดสอบค้าง (ดู test ที่มีคำว่า PotentialFault)
 */
public class ExtendedMessageFormatTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ---------- Helper FormatFactory implementations ----------

    /** Factory ที่ record ค่าที่ถูกเรียกไว้ และคืน Format ที่กำหนดไว้ล่วงหน้า (อาจเป็น null) */
    private static class RecordingFormatFactory implements FormatFactory {
        String lastName;
        String lastArgs;
        Locale lastLocale;
        final Format toReturn;

        RecordingFormatFactory(Format toReturn) {
            this.toReturn = toReturn;
        }

        public Format getFormat(String name, String args, Locale locale) {
            this.lastName = name;
            this.lastArgs = args;
            this.lastLocale = locale;
            return toReturn;
        }
    }

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test
    public void testConstructor_PatternOnly_NoRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testConstructor_PatternAndLocale_NoRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hi {0}", Locale.US);
        assertEquals(Locale.US, emf.getLocale());
        assertEquals("Hi {0}", emf.toPattern());
    }

    @Test
    public void testConstructor_PatternAndRegistry_DefaultLocale() {
        Map registry = new HashMap();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", registry);
        assertEquals("{0}", emf.toPattern());
    }

    @Test
    public void testConstructor_PatternLocaleRegistry() {
        Map registry = new HashMap();
        ExtendedMessageFormat emf =
                new ExtendedMessageFormat("{0}", Locale.US, registry);
        assertEquals(Locale.US, emf.getLocale());
        assertEquals("{0}", emf.toPattern());
    }

    // =====================================================================
    // applyPattern(): registry == null branch (delegates to super)
    // =====================================================================

    @Test
    public void testApplyPattern_NoRegistry_SimplePattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value={0}");
        assertEquals("Value={0}", emf.toPattern());
        assertEquals("Value=5", emf.format(new Object[] { "5" }));
    }

    @Test
    public void testApplyPattern_NoRegistry_EmptyPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("");
        assertEquals("", emf.toPattern());
    }

    /**
     * ใช้ path มาตรฐานของ java.text.MessageFormat (registry == null) ซึ่งเป็นโค้ด
     * ที่ได้รับการทดสอบมาอย่างดีแล้ว จึงปลอดภัยที่จะทดสอบการ quote อักขระพิเศษ
     * ("'{'0'}'" หมายถึง literal "{0}" ไม่ใช่ placeholder)
     */
    @Test
    public void testApplyPattern_NoRegistry_QuotedLiteralBraces() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{'0'}'");
        assertEquals("{0}", emf.format(new Object[0]));
    }

    // null pattern: Java semantics ธรรมดา (pattern.length()/toCharArray() บน null)
    // ไม่ใช่ custom behavior ของคลาสนี้ จึงไม่ถือว่าเป็นการเดา
    @Test(expected = NullPointerException.class)
    public void testApplyPattern_NullPattern_NoRegistry() {
        new ExtendedMessageFormat((String) null);
    }

    @Test(expected = NullPointerException.class)
    public void testApplyPattern_NullPattern_WithRegistry() {
        new ExtendedMessageFormat((String) null, new HashMap());
    }

    // =====================================================================
    // applyPattern(): registry != null branch - custom parsing
    // =====================================================================

    @Test
    public void testApplyPattern_WithRegistry_NoFormatElements_PlainText() {
        // ครอบคลุม containsElements(): coll.size() == 0 -> false
        Map registry = new HashMap();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello World", registry);
        assertEquals("Hello World", emf.toPattern());
    }

    @Test
    public void testApplyPattern_WithRegistry_FormatElementWithoutDescription() {
        // ครอบคลุม containsElements(): size > 0 แต่ loop หา non-null ไม่พบ -> false
        Map registry = new HashMap();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", registry);
        assertEquals("{0}", emf.toPattern());
        assertEquals("5", emf.format(new Object[] { "5" }));
    }

    @Test
    public void testApplyPattern_WithRegistry_NoMatchingFactory_StandardFormatPreserved() {
        // format == null branch: ไม่พบ factory ที่ตรงชื่อ -> append กลับเข้า stripCustom
        Map registry = new HashMap(); // ว่าง ไม่มี key "number"
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,number}", registry);
        assertEquals("{0,number}", emf.toPattern());

        MessageFormat std = new MessageFormat("{0,number}", Locale.getDefault());
        assertEquals(std.format(new Object[] { 1234 }), emf.format(new Object[] { 1234 }));
    }

    @Test
    public void testApplyPattern_WithRegistry_FactoryReturnsNull_TreatedAsNoCustomFormat() {
        // factory พบ แต่ getFormat() คืน null -> format == null branch เช่นกัน
        RecordingFormatFactory factory = new RecordingFormatFactory(null);
        Map registry = new HashMap();
        registry.put("custom", factory);
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,custom}", registry);
        assertEquals("custom", factory.lastName);
        assertEquals("{0,custom}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_WithRegistry_CustomFormatFound_RoundTripAndFormatting() {
        // format != null branch: ต้องถูกแทรกกลับใน toPattern() ผ่าน insertFormats()
        RecordingFormatFactory factory = new RecordingFormatFactory(new DecimalFormat("0000"));
        Map registry = new HashMap();
        registry.put("test", factory);

        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,test}", registry);
        assertEquals("{0,test}", emf.toPattern());
        assertEquals("0007", emf.format(new Object[] { 7 }));
    }

    @Test
    public void testApplyPattern_WithRegistry_FormatDescriptionWithArgs_CommaSplit() {
        // getFormat(): i > 0 branch -> name/args ถูก trim และ split ด้วย comma
        RecordingFormatFactory factory = new RecordingFormatFactory(new DecimalFormat("00"));
        Map registry = new HashMap();
        registry.put("custom", factory);

        new ExtendedMessageFormat("{0,custom, yyyy-MM-dd }", registry);
        assertEquals("custom", factory.lastName);
        assertEquals("yyyy-MM-dd", factory.lastArgs);
    }

    @Test
    public void testApplyPattern_WithRegistry_FormatDescriptionNoComma_ArgsNull() {
        // getFormat(): i <= 0 (ไม่มี comma เลย) -> name = desc ทั้งหมด, args = null
        RecordingFormatFactory factory = new RecordingFormatFactory(new DecimalFormat("00"));
        Map registry = new HashMap();
        registry.put("custom", factory);

        new ExtendedMessageFormat("{0,custom}", registry);
        assertEquals("custom", factory.lastName);
        assertEquals(null, factory.lastArgs);
    }

    @Test
    public void testApplyPattern_WithRegistry_FormatDescriptionTrailingComma_ArgsEmptyString() {
        // getFormat(): i > 0 แต่ args ที่ตัดได้กลายเป็น "" (ไม่ใช่ null)
        RecordingFormatFactory factory = new RecordingFormatFactory(new DecimalFormat("00"));
        Map registry = new HashMap();
        registry.put("custom", factory);

        new ExtendedMessageFormat("{0,custom,}", registry);
        assertEquals("custom", factory.lastName);
        assertEquals("", factory.lastArgs);
    }

    @Test
    public void testApplyPattern_WithRegistry_DescriptionStartsWithComma_NameNotSplit() {
        // getFormat(): i == 0 -> ไม่ถือเป็น i > 0 -> name = desc ทั้งหมด (รวม comma แรก)
        Map registry = new HashMap(); // ไม่มี key ตรงกันแน่นอน
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,,unknown}", registry);
        // ไม่มี factory จับคู่ -> format == null -> pattern ถูกคงไว้ตามเดิม
        assertEquals("{0,,unknown}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_WithRegistry_MultipleFormatElements_MixedNullAndCustom() {
        // ครอบคลุม loop การ map origFormats[i] สำหรับทั้งกรณี null (skip) และ non-null (assign)
        RecordingFormatFactory factory = new RecordingFormatFactory(new DecimalFormat("0000"));
        Map registry = new HashMap();
        registry.put("custom", factory);

        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}-{1,custom}", registry);
        assertEquals("{0}-{1,custom}", emf.toPattern());
        assertEquals("A-0007", emf.format(new Object[] { "A", 7 }));
    }

    @Test
    public void testApplyPattern_WithRegistry_WhitespaceAroundIndexAndFormatName() {
        // ครอบคลุม seekNonWs() และ branch whitespace ใน readArgumentIndex()
        RecordingFormatFactory factory = new RecordingFormatFactory(new DecimalFormat("00"));
        Map registry = new HashMap();
        registry.put("test", factory);

        ExtendedMessageFormat emf = new ExtendedMessageFormat("{ 0 , test }", registry);
        assertNotNull(emf.toPattern());
        assertEquals("test", factory.lastName);
    }

    @Test
    public void testApplyPattern_WithRegistry_MultiDigitArgumentIndex() {
        // ครอบคลุม branch ที่ result.length() > 0 แล้ว parse เป็นเลขหลายหลัก
        RecordingFormatFactory factory = new RecordingFormatFactory(new DecimalFormat("00"));
        Map registry = new HashMap();
        registry.put("test", factory);
        ExtendedMessageFormat emf =
                new ExtendedMessageFormat("{12,test}", registry);
        assertNotNull(emf.toPattern());
    }

    // =====================================================================
    // Exceptions
    // =====================================================================

    @Test
    public void testApplyPattern_WithRegistry_UnterminatedArgumentIndex_ThrowsException() {
        // readArgumentIndex(): loop จบโดยไม่พบ START_FMT/END_FE, error == false
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Unterminated format element");
        new ExtendedMessageFormat("{0", new HashMap());
    }

    @Test
    public void testApplyPattern_WithRegistry_InvalidArgumentIndex_NonDigit_ThrowsException() {
        // readArgumentIndex(): error == true -> "Invalid format argument index"
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Invalid format argument index");
        new ExtendedMessageFormat("{0a}", new HashMap());
    }

    @Test
    public void testApplyPattern_WithRegistry_UnterminatedFormatDescription_ThrowsException() {
        // parseFormatDescription(): depth ไม่ถึง 0 ก่อนจบ pattern
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Unterminated format element");
        new ExtendedMessageFormat("{0,abc", new HashMap());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_NoRegistry_InvalidStandardPattern_ThrowsException() {
        // ผ่าน super.applyPattern() ของ java.text.MessageFormat โดยตรง (registry == null)
        new ExtendedMessageFormat("{0,bogusType}");
    }

    /**
     * Test นี้มีไว้เพื่อพยายามดักจับ fault ที่น่าสงสัยใน appendQuotedString()
     * (ดูคอมเมนต์หัวไฟล์) เมื่อ registry != null และพบ QUOTE ตัวแรกในลูปหลัก
     * ใส่ timeout ป้องกันไม่ให้ชุดทดสอบค้างตลอดไปหากเกิด infinite loop จริง
     * เราไม่ assert ผลลัพธ์ที่แน่นอนของ format/toPattern เพราะไม่มั่นใจ behavior ที่ถูกต้อง
     * (ไม่ขอเดา) — หาก method ทำงานจบได้ภายในเวลาที่กำหนด ก็ถือว่าผ่าน
     */
    @Test(timeout = 3000)
    public void testApplyPattern_WithRegistry_ContainingQuoteCharacter_PotentialFaultTimeoutGuarded() {
        Map registry = new HashMap();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("plain 'quoted' text {0}", registry);
        assertNotNull(emf.toPattern());
    }

    // =====================================================================
    // setFormat* overrides must throw UnsupportedOperationException
    // =====================================================================

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormat_ThrowsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormat(0, new DecimalFormat("0"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndex_ThrowsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormatByArgumentIndex(0, new DecimalFormat("0"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormats_ThrowsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormats(new Format[] { new DecimalFormat("0") });
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndex_ThrowsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormatsByArgumentIndex(new Format[] { new DecimalFormat("0") });
    }

    // =====================================================================
    // sanity: inherited format() still works through normal MessageFormat API
    // =====================================================================

    @Test
    public void testFormat_InheritedBehavior_MultipleArguments() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0} and {1}");
        assertEquals("A and B", emf.format(new Object[] { "A", "B" }));
    }

    @Test
    public void testGetFormats_ArrayLengthMatchesArgumentCount() {
        Map registry = new HashMap();
        RecordingFormatFactory factory = new RecordingFormatFactory(new DecimalFormat("00"));
        registry.put("c", factory);
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,c}-{1}", registry);
        Format[] formats = emf.getFormats();
        assertTrue(formats.length >= 2);
    }
}
```

## สรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructor_* (4 เมธอด) | ตัว constructor ทั้ง 4 overload, การเซ็ต locale/registry |
| testApplyPattern_NoRegistry_SimplePattern / EmptyPattern | `registry == null` → delegate `super.applyPattern()` |
| testApplyPattern_NoRegistry_QuotedLiteralBraces | quote handling มาตรฐานของ MessageFormat (safe path) |
| testApplyPattern_NullPattern_* | NPE จาก `pattern.length()`/`toCharArray()` ทั้ง 2 เส้นทาง |
| testApplyPattern_WithRegistry_NoFormatElements_PlainText | `containsElements`: `coll.size()==0` → false |
| testApplyPattern_WithRegistry_FormatElementWithoutDescription | `containsElements`: list ไม่ว่างแต่ loop หา non-null ไม่พบ → false |
| testApplyPattern_WithRegistry_NoMatchingFactory_StandardFormatPreserved | `format == null` (ไม่มี key ตรง) → append กลับ stripCustom |
| testApplyPattern_WithRegistry_FactoryReturnsNull_TreatedAsNoCustomFormat | `factory != null` แต่ `getFormat()==null` → format==null branch |
| testApplyPattern_WithRegistry_CustomFormatFound_RoundTripAndFormatting | `format != null` → insertFormats() reinsertion + setFormats loop |
| testApplyPattern_WithRegistry_FormatDescriptionWithArgs_CommaSplit | `getFormat()`: `i > 0` (มี comma) branch |
| testApplyPattern_WithRegistry_FormatDescriptionNoComma_ArgsNull | `getFormat()`: `i <= 0` (ไม่มี comma) branch, args=null |
| testApplyPattern_WithRegistry_FormatDescriptionTrailingComma_ArgsEmptyString | `i > 0` แต่ args ตัดแล้วเป็น `""` |
| testApplyPattern_WithRegistry_DescriptionStartsWithComma_NameNotSplit | `i == 0` → ไม่ split (name=desc ทั้งหมด) |
| testApplyPattern_WithRegistry_MultipleFormatElements_MixedNullAndCustom | loop `for (... it.hasNext(); i++)` ทั้งกรณี skip(null) และ assign(non-null) |
| testApplyPattern_WithRegistry_WhitespaceAroundIndexAndFormatName | `seekNonWs()`, whitespace branch ใน `readArgumentIndex()` |
| testApplyPattern_WithRegistry_MultiDigitArgumentIndex | branch `result.length() > 0` ใน `readArgumentIndex()` |
| testApplyPattern_WithRegistry_UnterminatedArgumentIndex_ThrowsException | `readArgumentIndex()` throw "Unterminated format element" (error=false) |
| testApplyPattern_WithRegistry_InvalidArgumentIndex_NonDigit_ThrowsException | `readArgumentIndex()` throw "Invalid format argument index" (error=true) |
| testApplyPattern_WithRegistry_UnterminatedFormatDescription_ThrowsException | `parseFormatDescription()` throw เมื่อ depth ไม่ถึง 0 |
| testApplyPattern_NoRegistry_InvalidStandardPattern_ThrowsException | exception จาก `super.applyPattern()` มาตรฐาน |
| testApplyPattern_WithRegistry_ContainingQuoteCharacter_PotentialFaultTimeoutGuarded | เส้นทาง QUOTE ใน loop หลักเมื่อ `registry != null` (สงสัยว่าเป็น fault, ใส่ timeout ป้องกัน) |
| testSetFormat_* (4 เมธอด) | ทุก override ของ setFormat/setFormats ที่ต้อง throw `UnsupportedOperationException` |
| testFormat_InheritedBehavior_MultipleArguments | การทำงานปกติของ `format()` ที่สืบทอดมา |
| testGetFormats_ArrayLengthMatchesArgumentCount | ตรวจ `getFormats()` หลัง custom format ถูกฝัง |

**หมายเหตุที่ไม่กล้าเดา (ตามข้อกำหนดข้อ 4):**
- Branch `if (c[pos.getIndex()] != END_FE) throw "Unreadable format element..."` ใน `applyPattern()` วิเคราะห์แล้วพบว่า `readArgumentIndex()` จะหยุดที่ `START_FMT`/`END_FE` เสมอหากไม่ error ก่อน จึงดูเหมือน unreachable จาก public API — ไม่ได้เขียน test เฉพาะสำหรับ branch นี้
- พฤติกรรมของ `appendQuotedString()` เมื่อ `escapingOn=true` มีข้อสงสัยเรื่อง infinite loop ตามที่วิเคราะห์ในคอมเมนต์ จึงไม่ assert ผลลัพธ์ที่แน่ชัด ใช้ `timeout` แทนเพื่อดักจับ fault อย่างปลอดภัย