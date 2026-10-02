# การวิเคราะห์ Branch/Condition ของโค้ดต้นฉบับ

ก่อนเขียนเทส ขอสรุปจุดแตกแขนง (branch) ที่พบในซอร์สโค้ด:

1. `input.charAt(index) == '&' && input.charAt(index + 1) == '#'` — เงื่อนไข AND 2 ตัว (ต้องทดสอบ false จากตัวแรก, false จากตัวที่สอง, true ทั้งคู่)
2. `firstChar == 'x' || firstChar == 'X'` — OR 2 ตัว (true จาก x, true จาก X, false)
3. `while(input.charAt(end) != ';')` — loop ที่ต้องทดสอบทั้งกรณี 0 รอบ (ตัวอักษรถัดจาก start คือ `;` ทันที) และหลายรอบ
4. `try/catch(NumberFormatException)` — ทั้ง hex/decimal ที่ parse สำเร็จ และ parse ล้มเหลว
5. จุดที่ไม่มีการป้องกัน (ตาม TODO comment) — `charAt(index+1)` และ loop `end++` อาจเกิน bound ทำให้เกิด exception (เป็น fault ที่ต้องดักจับผ่านเทส)

```java
package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

/**
 * Unit test สำหรับ NumericEntityUnescaper (Defects4J: Lang-28b)
 * ครอบคลุม branch/condition ทุกจุดที่วิเคราะห์ได้จาก source
 */
public class NumericEntityUnescaperTest {

    private final NumericEntityUnescaper unescaper = new NumericEntityUnescaper();

    // ---------- เงื่อนไขที่ 1: input.charAt(index)=='&' && input.charAt(index+1)=='#' ----------

    @Test
    public void testFirstCharNotAmpersandReturnsZero() throws IOException {
        // charAt(index) != '&' -> เงื่อนไขแรกเป็น false ทั้ง && จึง short-circuit
        StringWriter out = new StringWriter();
        int result = unescaper.translate("x&#65;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testSecondCharNotHashReturnsZero() throws IOException {
        // charAt(index)=='&' แต่ charAt(index+1) != '#'
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&x123;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- เงื่อนไขที่ 2: firstChar == 'x' || 'X' ----------

    @Test
    public void testHexLowercaseXSuccessful() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#x41;", 0, out);
        // start=2, 'x' -> start=3, isHex=true, end=5 (";")
        // entityValue = parseInt("41",16) = 65 ('A')
        assertEquals(6, result);
        assertEquals("A", out.toString());
    }

    @Test
    public void testHexUppercaseXSuccessful() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#X41;", 0, out);
        assertEquals(6, result);
        assertEquals("A", out.toString());
    }

    @Test
    public void testHexLowercaseDigitsSuccessful() throws IOException {
        // ทดสอบ hex digit ตัวพิมพ์เล็ก (a-f) ว่า parse ได้ถูกต้อง
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#xff;", 0, out);
        // parseInt("ff",16)=255
        assertEquals(6, result);
        assertEquals(String.valueOf((char) 255), out.toString());
    }

    @Test
    public void testDecimalNotHexSuccessful() throws IOException {
        // firstChar เป็นตัวเลข -> isHex=false (เงื่อนไข OR เป็น false ทั้งคู่)
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#65;", 0, out);
        // start=2, end=4, entityValue=parseInt("65",10)=65
        assertEquals(5, result);
        assertEquals("A", out.toString());
    }

    // ---------- while loop: 0 รอบ vs หลายรอบ ----------

    @Test
    public void testWhileLoopZeroIterationsHexEmptyEntity() throws IOException {
        // firstChar='x' แล้วตัวถัดไปเป็น ';' ทันที -> loop ไม่วนเลย (end=start)
        // entityValue string ว่าง -> parseInt("",16) -> NumberFormatException -> return 0
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#x;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testWhileLoopZeroIterationsDecimalEmptyEntity() throws IOException {
        // ไม่มี x/X และตัวถัดจาก start เป็น ';' ทันที -> loop ไม่วนเลย
        // parseInt("",10) -> NumberFormatException -> return 0
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testWhileLoopMultipleIterations() throws IOException {
        // ทดสอบ loop วนหลายรอบก่อนพบ ';'
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#12345;", 0, out);
        // start=2, end=7 (วน 5 รอบ), entityValue=parseInt("12345",10)
        int expectedValue = Integer.parseInt("12345", 10);
        assertEquals(8, result);
        assertEquals(String.valueOf((char) expectedValue), out.toString());
    }

    // ---------- try/catch NumberFormatException ----------

    @Test
    public void testHexInvalidNumberFormatReturnsZero() throws IOException {
        // 'G' ไม่ใช่ hex digit ที่ถูกต้อง -> NumberFormatException
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#xG;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testDecimalInvalidNumberFormatReturnsZero() throws IOException {
        // 'Z' ไม่ใช่ตัวเลข -> NumberFormatException
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#ZZ;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- ทดสอบ index ไม่เริ่มที่ 0 (ตำแหน่งกลาง string) ----------

    @Test
    public void testTranslateInMiddleOfLargerString() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("abc&#65;def", 3, out);
        assertEquals(5, result);
        assertEquals("A", out.toString());
    }

    // ---------- Edge case / Fault-detection: โค้ดไม่มีการป้องกัน index เกิน bound ----------
    // หมายเหตุ: ตาม TODO comment ในซอร์สโค้ด "Protect from ArrayIndexOutOfBounds"
    // ยังไม่ได้ implement ป้องกันจริง ดังนั้นกรณีนี้คาดว่าจะเกิด exception
    // (ไม่ได้ "เดา" behavior ใหม่ แต่เป็นผลลัพธ์ตรงจาก logic ที่ไม่มี bound check)

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testIndexAtLastCharacterThrowsException() throws IOException {
        // input มีความยาว 1 และ index คือตัวสุดท้าย -> charAt(index+1) เกิน bound
        StringWriter out = new StringWriter();
        unescaper.translate("&", 0, out);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testMissingSemicolonThrowsException() throws IOException {
        // ไม่มี ';' ในสตริง -> while loop จะวนเกิน bound ของ CharSequence
        StringWriter out = new StringWriter();
        unescaper.translate("&#65", 0, out);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testEmptyInputThrowsException() throws IOException {
        // input ว่างเปล่า -> charAt(0) เกิน bound ทันที
        StringWriter out = new StringWriter();
        unescaper.translate("", 0, out);
    }

    @Test(expected = NullPointerException.class)
    public void testNullInputThrowsNullPointerException() throws IOException {
        // input เป็น null -> charAt() บน null จะทำให้เกิด NullPointerException
        StringWriter out = new StringWriter();
        unescaper.translate((CharSequence) null, 0, out);
    }

    // ---------- ทดสอบความถูกต้องของค่า return เพิ่มเติม (ตรวจสอบ boundary ของผลลัพธ์) ----------

    @Test
    public void testReturnValueFormulaForHex() throws IOException {
        // ตรวจสอบสูตรการคำนวณ return value: 2 + (end-start) + (isHex?1:0) + 1
        StringWriter out = new StringWriter();
        String input = "&#x7A;"; // entity 2 ตัว, isHex=true
        int result = unescaper.translate(input, 0, out);
        assertEquals(input.length(), result);
    }

    @Test
    public void testReturnValueFormulaForDecimal() throws IOException {
        StringWriter out = new StringWriter();
        String input = "&#97;"; // decimal 'a'
        int result = unescaper.translate(input, 0, out);
        assertEquals(input.length(), result);
        assertEquals("a", out.toString());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testFirstCharNotAmpersandReturnsZero` | เงื่อนไข AND ตัวแรก = false (short-circuit) → return 0 |
| `testSecondCharNotHashReturnsZero` | เงื่อนไข AND ตัวแรก=true, ตัวที่สอง=false → return 0 |
| `testHexLowercaseXSuccessful` | `firstChar=='x'` true, try-block parse hex สำเร็จ |
| `testHexUppercaseXSuccessful` | `firstChar=='X'` true (ครอบ OR อีกด้าน) |
| `testHexLowercaseDigitsSuccessful` | hex digit a-f, parse สำเร็จ |
| `testDecimalNotHexSuccessful` | `firstChar=='x'/'X'` false ทั้งคู่ (isHex=false), decimal parse สำเร็จ |
| `testWhileLoopZeroIterationsHexEmptyEntity` | while loop 0 รอบ (hex), catch NumberFormatException |
| `testWhileLoopZeroIterationsDecimalEmptyEntity` | while loop 0 รอบ (decimal), catch NumberFormatException |
| `testWhileLoopMultipleIterations` | while loop วนหลายรอบก่อนพบ `;` |
| `testHexInvalidNumberFormatReturnsZero` | catch NumberFormatException กรณี hex ผิดรูปแบบ |
| `testDecimalInvalidNumberFormatReturnsZero` | catch NumberFormatException กรณี decimal ผิดรูปแบบ |
| `testTranslateInMiddleOfLargerString` | ทดสอบ index ไม่เริ่มต้นที่ 0 (ตำแหน่งกลาง string) |
| `testIndexAtLastCharacterThrowsException` | Fault: ไม่มี bound check สำหรับ `charAt(index+1)` |
| `testMissingSemicolonThrowsException` | Fault: while loop ไม่มี bound check เมื่อไม่พบ `;` |
| `testEmptyInputThrowsException` | Boundary: input ว่างเปล่า |
| `testNullInputThrowsNullPointerException` | Boundary: input เป็น null |
| `testReturnValueFormulaForHex` / `testReturnValueFormulaForDecimal` | ตรวจสอบความถูกต้องของสูตรคำนวณค่า return (`2 + (end-start) + (isHex?1:0) + 1`) |

**หมายเหตุสำคัญ:** เทสกรณี `testIndexAtLastCharacterThrowsException`, `testMissingSemicolonThrowsException`, และ `testEmptyInputThrowsException` เป็นการตรวจจับ **fault ที่มีอยู่จริงในโค้ด** (ตาม comment `// TODO: Protect from ArrayIndexOutOfBounds`) โดยไม่ได้เดา behavior ใหม่ แต่เป็นผลจาก logic ที่ไม่มีการป้องกัน index เกิน bound ซึ่งเทสเหล่านี้จะช่วยยืนยันว่าหากมีการแก้ไข (patch) โค้ดในอนาคต เทสจะ fail และต้องปรับปรุงให้สอดคล้องกับ behavior ใหม่