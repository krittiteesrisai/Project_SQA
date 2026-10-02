# ComplexFormatTest.java

```java
package org.apache.commons.math.complex;

import static org.junit.Assert.*;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

import org.junit.Test;

/**
 * JUnit4 test suite สำหรับ ComplexFormat (Defects4J: Math-101b)
 *
 * หมายเหตุ: เพื่อความ deterministic ของผลลัพธ์ format/parse เราบังคับใช้
 * NumberFormat.getInstance(Locale.US) อย่างชัดแจ้งในเคสที่ต้องการควบคุม
 * pattern ของตัวเลขเอง (แทนการพึ่ง default locale ของ JVM ที่รันเทส)
 */
public class ComplexFormatTest {

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        ComplexFormat f = new ComplexFormat();
        assertEquals("i", f.getImaginaryCharacter());
        assertNotNull(f.getRealFormat());
        assertNotNull(f.getImaginaryFormat());
        // default format ถูกตั้งค่า maxFractionDigits = 2
        assertEquals(2, f.getRealFormat().getMaximumFractionDigits());
        assertEquals(2, f.getImaginaryFormat().getMaximumFractionDigits());
    }

    @Test
    public void testConstructorSingleNumberFormat() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        ComplexFormat f = new ComplexFormat(nf);
        assertEquals("i", f.getImaginaryCharacter());
        assertSame(nf, f.getRealFormat());
        // imaginaryFormat ต้องเป็น clone คนละ instance กับ realFormat
        assertNotSame(f.getRealFormat(), f.getImaginaryFormat());
    }

    @Test
    public void testConstructorRealAndImaginaryFormat() {
        NumberFormat realFmt = NumberFormat.getInstance(Locale.US);
        NumberFormat imagFmt = NumberFormat.getInstance(Locale.US);
        ComplexFormat f = new ComplexFormat(realFmt, imagFmt);
        assertSame(realFmt, f.getRealFormat());
        assertSame(imagFmt, f.getImaginaryFormat());
        assertEquals("i", f.getImaginaryCharacter());
    }

    @Test
    public void testConstructorImaginaryCharacterOnly() {
        ComplexFormat f = new ComplexFormat("j");
        assertEquals("j", f.getImaginaryCharacter());
        assertNotNull(f.getRealFormat());
    }

    @Test
    public void testConstructorImaginaryCharacterAndSingleFormat() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        ComplexFormat f = new ComplexFormat("j", nf);
        assertEquals("j", f.getImaginaryCharacter());
        assertSame(nf, f.getRealFormat());
        assertNotSame(f.getRealFormat(), f.getImaginaryFormat());
    }

    @Test
    public void testConstructorFull() {
        NumberFormat realFmt = NumberFormat.getInstance(Locale.US);
        NumberFormat imagFmt = NumberFormat.getInstance(Locale.US);
        ComplexFormat f = new ComplexFormat("j", realFmt, imagFmt);
        assertEquals("j", f.getImaginaryCharacter());
        assertSame(realFmt, f.getRealFormat());
        assertSame(imagFmt, f.getImaginaryFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullImaginaryCharacterThrows() {
        new ComplexFormat((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyImaginaryCharacterThrows() {
        new ComplexFormat("");
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorSingleFormatNullThrowsNPE() {
        // ComplexFormat(String, NumberFormat) เรียก format.clone() ก่อนตรวจสอบ null
        // ผ่าน setter -> จะได้ NullPointerException ไม่ใช่ IllegalArgumentException
        new ComplexFormat("i", (NumberFormat) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullImaginaryFormatThrows() {
        NumberFormat realFmt = NumberFormat.getInstance(Locale.US);
        new ComplexFormat("i", realFmt, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullRealFormatThrows() {
        NumberFormat imagFmt = NumberFormat.getInstance(Locale.US);
        new ComplexFormat("i", null, imagFmt);
    }

    // ---------------------------------------------------------------
    // Setters
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacterNull() {
        new ComplexFormat().setImaginaryCharacter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacterEmpty() {
        new ComplexFormat().setImaginaryCharacter("");
    }

    @Test
    public void testSetImaginaryCharacterValid() {
        ComplexFormat f = new ComplexFormat();
        f.setImaginaryCharacter("j");
        assertEquals("j", f.getImaginaryCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryFormatNull() {
        new ComplexFormat().setImaginaryFormat(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRealFormatNull() {
        new ComplexFormat().setRealFormat(null);
    }

    // ---------------------------------------------------------------
    // format(Complex, StringBuffer, FieldPosition) branches
    // ---------------------------------------------------------------

    @Test
    public void testFormatComplexPositiveImaginary() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(5.0, 2.0);
        String expected = f.getRealFormat().format(5.0) + " + "
                + f.getImaginaryFormat().format(2.0) + "i";
        assertEquals(expected, f.format(c));
    }

    @Test
    public void testFormatComplexNegativeImaginary() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(5.0, -2.0);
        String expected = f.getRealFormat().format(5.0) + " - "
                + f.getImaginaryFormat().format(2.0) + "i";
        assertEquals(expected, f.format(c));
    }

    @Test
    public void testFormatComplexZeroImaginary() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(5.0, 0.0);
        String expected = f.getRealFormat().format(5.0);
        // เมื่อ im == 0 ต้องไม่มี " + "/" - "/ตัวอักษรจำนวนจินตภาพ ถูกเติมเข้าไป
        assertEquals(expected, f.format(c));
    }

    @Test
    public void testFormatComplexNaNImaginary() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(5.0, Double.NaN);
        String result = f.format(c);
        // branch: im > 0 || isNaN(im) -> true
        assertTrue(result.contains(" + "));
        assertTrue(result.contains("(NaN)"));
        assertTrue(result.endsWith("i"));
    }

    // ---------------------------------------------------------------
    // formatDouble branches (ผ่าน format(Complex,...))
    // ---------------------------------------------------------------

    @Test
    public void testFormatDoubleNaNReal() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(Double.NaN, 1.0);
        String result = f.format(c);
        assertTrue(result.startsWith("(NaN)"));
    }

    @Test
    public void testFormatDoublePositiveInfinityReal() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        String result = f.format(c);
        assertTrue(result.startsWith("(Infinity)"));
    }

    @Test
    public void testFormatDoubleNegativeInfinityReal() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(Double.NEGATIVE_INFINITY, 1.0);
        String result = f.format(c);
        assertTrue(result.startsWith("(-Infinity)"));
    }

    // ---------------------------------------------------------------
    // format(Object, StringBuffer, FieldPosition) branches
    // ---------------------------------------------------------------

    @Test
    public void testFormatObjectWithComplex() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(1.0, 1.0);
        StringBuffer sb = new StringBuffer();
        f.format((Object) c, sb, new FieldPosition(0));
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testFormatObjectWithNumber() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        StringBuffer sb = new StringBuffer();
        f.format((Object) new Double(3.0), sb, new FieldPosition(0));
        // Number -> treated as Complex(real, 0.0) -> ไม่มีส่วนจินตภาพถูกเติม
        assertEquals(f.getRealFormat().format(3.0), sb.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObjectWithInvalidTypeThrows() {
        ComplexFormat f = new ComplexFormat();
        f.format("not a number", new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testStaticFormatComplex() {
        Complex c = new Complex(1.0, 1.0);
        String result = ComplexFormat.formatComplex(c);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    // ---------------------------------------------------------------
    // Static helpers
    // ---------------------------------------------------------------

    @Test
    public void testGetAvailableLocales() {
        Locale[] locales = ComplexFormat.getAvailableLocales();
        assertNotNull(locales);
        assertTrue(locales.length > 0);
    }

    @Test
    public void testGetInstanceDefaultLocale() {
        ComplexFormat f = ComplexFormat.getInstance();
        assertNotNull(f);
        assertEquals(2, f.getRealFormat().getMaximumFractionDigits());
    }

    @Test
    public void testGetInstanceSpecificLocale() {
        ComplexFormat f = ComplexFormat.getInstance(Locale.US);
        assertNotNull(f);
        assertEquals(2, f.getRealFormat().getMaximumFractionDigits());
    }

    // ---------------------------------------------------------------
    // parse(String, ParsePosition) / parse(String) - success paths
    // ---------------------------------------------------------------

    @Test
    public void testParsePositiveSignRoundTrip() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex original = new Complex(3.0, 2.0);
        String s = f.format(original);
        ParsePosition pos = new ParsePosition(0);
        Complex parsed = f.parse(s, pos);
        assertNotNull(parsed);
        assertEquals(3.0, parsed.getReal(), 1e-9);
        assertEquals(2.0, parsed.getImaginary(), 1e-9);
        assertEquals(s.length(), pos.getIndex());
    }

    @Test
    public void testParseNegativeSignRoundTrip() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex original = new Complex(3.0, -2.0);
        String s = f.format(original);
        Complex parsed = f.parse(s, new ParsePosition(0));
        assertNotNull(parsed);
        assertEquals(3.0, parsed.getReal(), 1e-9);
        assertEquals(-2.0, parsed.getImaginary(), 1e-9);
    }

    @Test
    public void testParseNoSignRealOnlyRoundTrip() {
        // ครอบคลุม switch-case 0 (ไม่มีเครื่องหมาย, จบ string พอดี)
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex original = new Complex(7.0, 0.0);
        String s = f.format(original);
        Complex parsed = f.parse(s, new ParsePosition(0));
        assertNotNull(parsed);
        assertEquals(7.0, parsed.getReal(), 1e-9);
        assertEquals(0.0, parsed.getImaginary(), 1e-9);
    }

    @Test
    public void testParseCustomImaginaryCharacterRoundTrip() {
        ComplexFormat f = new ComplexFormat("j", NumberFormat.getInstance(Locale.US));
        Complex original = new Complex(1.0, 4.0);
        String s = f.format(original);
        assertTrue(s.endsWith("j"));
        Complex parsed = f.parse(s, new ParsePosition(0));
        assertNotNull(parsed);
        assertEquals(1.0, parsed.getReal(), 1e-9);
        assertEquals(4.0, parsed.getImaginary(), 1e-9);
    }

    @Test
    public void testParseSpecialValuesRoundTrip() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex original = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        String s = f.format(original);
        Complex parsed = f.parse(s, new ParsePosition(0));
        assertNotNull(parsed);
        assertTrue(Double.isNaN(parsed.getReal()));
        assertEquals(Double.POSITIVE_INFINITY, parsed.getImaginary(), 0.0);
    }

    @Test
    public void testParseNegativeInfinityImaginaryRoundTrip() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex original = new Complex(-5.0, Double.NEGATIVE_INFINITY);
        String s = f.format(original);
        Complex parsed = f.parse(s, new ParsePosition(0));
        assertNotNull(parsed);
        assertEquals(-5.0, parsed.getReal(), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, parsed.getImaginary(), 0.0);
    }

    @Test
    public void testParseLeadingWhitespaceSkipped() {
        // ครอบคลุม loop ของ parseNextCharacter กรณีพบ non-whitespace ก่อนจบ string
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        String s = "   3 + 2i";
        Complex parsed = f.parse(s, new ParsePosition(0));
        assertNotNull(parsed);
        assertEquals(3.0, parsed.getReal(), 1e-9);
        assertEquals(2.0, parsed.getImaginary(), 1e-9);
    }

    @Test
    public void testParseAllWhitespaceReturnsNull() {
        // ครอบคลุม loop ของ parseNextCharacter กรณี whitespace จนจบ string (ret = 0)
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        ParsePosition pos = new ParsePosition(0);
        Complex result = f.parse("   ", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
    }

    // ---------------------------------------------------------------
    // parse - failure paths
    // ---------------------------------------------------------------

    @Test
    public void testParseInvalidRealReturnsNull() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        ParsePosition pos = new ParsePosition(0);
        Complex result = f.parse("abc + 2i", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseInvalidSignReturnsNull() {
        // ครอบคลุม switch default-case (เครื่องหมายไม่ใช่ '+'/'-' และไม่ใช่ปลาย string)
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        ParsePosition pos = new ParsePosition(0);
        Complex result = f.parse("3 * 2i", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertTrue(pos.getErrorIndex() >= 0);
    }

    @Test
    public void testParseInvalidImaginaryReturnsNull() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        ParsePosition pos = new ParsePosition(0);
        Complex result = f.parse("3 + xyz", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseMismatchedImaginaryCharacterReturnsNull() {
        // default imaginaryCharacter = "i" แต่ string ใช้ "j"
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        ParsePosition pos = new ParsePosition(0);
        Complex result = f.parse("3 + 2j", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
    }

    /**
     * NOTE (potential fault / boundary ที่พบจากการไล่ซอร์ส):
     * ในเมธอด parse(String, ParsePosition) มีการเรียก
     * source.substring(startIndex, endIndex) โดยไม่ตรวจสอบว่า endIndex
     * เกินความยาวของ source หรือไม่ หากจำนวนจินตภาพอยู่ที่ปลาย string พอดี
     * (ไม่มีตัวอักษรจินตภาพต่อท้ายจริง) จะทำให้เกิด
     * StringIndexOutOfBoundsException แทนที่จะคืนค่า null อย่างเหมาะสม
     */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testParseImaginaryCharacterOutOfBoundsThrows() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        f.parse("3 + 2", new ParsePosition(0));
    }

    /**
     * NOTE (boundary condition ที่พบจากการไล่ซอร์ส):
     * private parseNumber(String, double, ParsePosition) ใช้เงื่อนไข
     * "endIndex < source.length()" (strict less-than) ในการตรวจสอบว่า
     * สามารถอ่าน special value (NaN/Infinity) ได้หรือไม่ ผลคือถ้า
     * special value อยู่ที่ปลาย string เป๊ะ (endIndex == source.length())
     * จะไม่ถูกจับ ทำให้ parse ล้มเหลวทั้งที่ตัว string ถูกต้องตาม pattern
     */
    @Test
    public void testParseSpecialValueExactlyAtEndOfStringFails() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        ParsePosition pos = new ParsePosition(0);
        Complex result = f.parse("(NaN)", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseStringSuccess() throws ParseException {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex original = new Complex(3.0, 2.0);
        String s = f.format(original);
        Complex parsed = f.parse(s);
        assertEquals(3.0, parsed.getReal(), 1e-9);
        assertEquals(2.0, parsed.getImaginary(), 1e-9);
    }

    @Test(expected = ParseException.class)
    public void testParseStringThrowsParseExceptionOnInvalidInput() throws ParseException {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        f.parse("not a complex number");
    }

    @Test
    public void testParseObjectDelegatesToParse() {
        ComplexFormat f = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        Complex original = new Complex(1.0, -1.0);
        String s = f.format(original);
        ParsePosition pos = new ParsePosition(0);
        Object result = f.parseObject(s, pos);
        assertTrue(result instanceof Complex);
        Complex c = (Complex) result;
        assertEquals(1.0, c.getReal(), 1e-9);
        assertEquals(-1.0, c.getImaginary(), 1e-9);
    }
}
```

## ตารางสรุป Test Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor / testConstructorSingleNumberFormat / ...Full | Constructor overloads ทั้ง 7 แบบ, การ clone NumberFormat |
| testConstructorNullImaginaryCharacterThrows / Empty | `setImaginaryCharacter`: null, empty string |
| testConstructorSingleFormatNullThrowsNPE | `format.clone()` บน null ก่อนถึง setter (NPE ไม่ใช่ IAE) |
| testConstructorNull(Imaginary/Real)FormatThrows | `setImaginaryFormat`/`setRealFormat`: null branch |
| testSetImaginaryCharacterNull/Empty/Valid | if/else ของ `setImaginaryCharacter` |
| testSetImaginaryFormatNull / testSetRealFormatNull | null-check ของ setter ทั้งสอง |
| testFormatComplexPositiveImaginary | branch `im > 0.0` |
| testFormatComplexNegativeImaginary | branch `im < 0.0` |
| testFormatComplexZeroImaginary | branch else (im == 0, ไม่เติมอะไร) |
| testFormatComplexNaNImaginary | branch `isNaN(im)` ภายใน `im>0 \|\| isNaN` |
| testFormatDouble(NaN/PosInf/NegInf)Real | if-branch ของ `formatDouble` (isNaN/isInfinite) |
| testFormatObjectWithComplex/Number/InvalidType | if/else if/else ของ `format(Object,...)` รวม throw IAE |
| testStaticFormatComplex | static `formatComplex` + `getInstance` |
| testGetAvailableLocales / testGetInstance(Default/Specific)Locale | static helper methods |
| testParsePositiveSignRoundTrip | switch-case `'+'` |
| testParseNegativeSignRoundTrip | switch-case `'-'` |
| testParseNoSignRealOnlyRoundTrip | switch-case `0` (จบ string พอดี) |
| testParseCustomImaginaryCharacterRoundTrip | ตัวอักษรจินตภาพแบบกำหนดเอง (`n>1` path logic) |
| testParseSpecialValuesRoundTrip / NegInfinity | loop ใน `parseNumber(source,format,pos)` หา special value + `break` |
| testParseLeadingWhitespaceSkipped | loop `parseNextCharacter` พบ non-whitespace ก่อนจบ |
| testParseAllWhitespaceReturnsNull | loop `parseNextCharacter` จนจบ string, ret=0 |
| testParseInvalidRealReturnsNull | `re == null` branch |
| testParseInvalidSignReturnsNull | switch `default` case |
| testParseInvalidImaginaryReturnsNull | `im == null` branch |
| testParseMismatchedImaginaryCharacterReturnsNull | `substring(...).compareTo(...) != 0` branch |
| testParseImaginaryCharacterOutOfBoundsThrows | **Fault**: ไม่เช็ค bound ก่อน `substring` |
| testParseSpecialValueExactlyAtEndOfStringFails | **Boundary bug**: `endIndex < source.length()` strict-less-than |
| testParseStringSuccess / ThrowsParseException | if/else ของ `parse(String)` (index==0 → throw) |
| testParseObjectDelegatesToParse | `parseObject` wrapper |

**หมายเหตุสำคัญ:** เทส `testParseImaginaryCharacterOutOfBoundsThrows` และ `testParseSpecialValueExactlyAtEndOfStringFails` เป็นการทดสอบพฤติกรรมจริงที่ไล่ตามลอจิกของซอร์สโค้ด (ไม่ใช่การเดา) ซึ่งเผยให้เห็น edge-case/fault ที่อาจเกิดขึ้นได้จริงในโค้ดต้นฉบับ — มีประโยชน์สำหรับการ regression testing หากมีการแก้ไขบั๊กในอนาคต