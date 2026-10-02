# การวิเคราะห์ Branch/Condition ของ `NumericEntityUnescaper.translate()`

จากซอร์สโค้ด สามารถแยกเงื่อนไขที่ต้อง cover ได้ดังนี้:

1. `if(input.charAt(index) == '&' && index < seqEnd - 1 && input.charAt(index + 1) == '#')`
   - charAt(index) != '&' → false
   - charAt(index) == '&' แต่ index >= seqEnd-1 → false
   - charAt(index) == '&', index < seqEnd-1 แต่ charAt(index+1) != '#' → false
   - ทุกเงื่อนไขเป็น true → เข้า block
2. `if(firstChar == 'x' || firstChar == 'X')` → true('x'), true('X'), false
3. `while(input.charAt(end) != ';')` → loop 0 ครั้ง, loop หลายครั้ง, และกรณีไม่มี `;` เลย (จะเกิด `StringIndexOutOfBoundsException` เพราะไม่มีการตรวจสอบขอบเขต — นี่คือพฤติกรรมจริงของโค้ด ไม่ใช่การเดา)
4. `try { ... } catch(NumberFormatException nfe)` → parse สำเร็จ, parse ล้มเหลว (ทั้ง hex และ decimal)
5. `if(entityValue > 0xFFFF)` → true (surrogate pair), false (ตัวอักษรปกติ)
6. การคำนวณ return value: `isHex ? 1 : 0`

```java
package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class NumericEntityUnescaperTest {

    private final NumericEntityUnescaper unescaper = new NumericEntityUnescaper();

    // ---------- Branch 1: เงื่อนไขหลัก if(&...#) ----------

    @Test
    public void testCharAtIndexIsNotAmpersand_returnsZero() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("abc", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testAmpersandAtVeryEndOfString_returnsZero() throws IOException {
        // index == seqEnd-1 -> index < seqEnd-1 เป็น false
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testAmpersandNotFollowedByHash_returnsZero() throws IOException {
        // charAt(index+1) != '#'
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&x;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- Branch 2: firstChar == 'x' / 'X' / else ----------

    @Test
    public void testDecimalWithSemicolon_happyPath() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#65;", 0, out);
        assertEquals("A", out.toString());
        // return = 2 + (end-start) + (isHex?1:0) + 1 = 2+2+0+1 = 5
        assertEquals(5, result);
    }

    @Test
    public void testHexLowercase_x_happyPath() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#x41;", 0, out);
        assertEquals("A", out.toString());
        // 2 + (end-start=2) + 1(isHex) + 1 = 6
        assertEquals(6, result);
    }

    @Test
    public void testHexUppercase_X_happyPath() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#X41;", 0, out);
        assertEquals("A", out.toString());
        assertEquals(6, result);
    }

    // ---------- Branch 3: while loop หา ';' ----------

    @Test
    public void testLoopZeroIterations_semicolonImmediatelyAfterStart() throws IOException {
        // start == end ตั้งแต่แรก (ไม่มีตัวเลขเลย) -> NumberFormatException จาก parseInt("")
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testLoopMultipleIterations_multiDigitNumber() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#12345;", 0, out);
        char expected = (char) 12345;
        assertEquals(String.valueOf(expected), out.toString());
        assertEquals(8, result); // 2+(end-start=5)+0+1
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testNoSemicolonAtAll_throwsIndexOutOfBounds() throws IOException {
        // ไม่มี ';' ในสตริงเลย ทำให้ while loop วิ่งเกินขอบเขต -> ตรวจพบข้อบกพร่องจริงของโค้ด
        StringWriter out = new StringWriter();
        unescaper.translate("&#65", 0, out);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testNoCharAfterHash_throwsIndexOutOfBounds() throws IOException {
        // start = index+2 เกินความยาวสตริง -> charAt(start) throw exception
        StringWriter out = new StringWriter();
        unescaper.translate("&#", 0, out);
    }

    @Test
    public void testSemicolonFoundFarAwayInLargerText_capturesExtraCharsAndFails() throws IOException {
        // สาธิตพฤติกรรมจริง (อาจถือเป็น fault): loop ไม่สนใจว่าตัวอักษรระหว่างทางเป็นตัวเลขหรือไม่
        // ทำให้ parseInt("65 is A") ล้มเหลว -> return 0
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#65 is A;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- Branch 4: try/catch NumberFormatException ----------

    @Test
    public void testInvalidDecimalNumber_catchesNumberFormatException() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#abc;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testInvalidHexNumber_catchesNumberFormatException() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#xZZ;", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- Branch 5: entityValue > 0xFFFF (surrogate pair) ----------

    @Test
    public void testSurrogatePairForCodePointAbove0xFFFF() throws IOException {
        int codePoint = 128512; // U+1F600 (emoji) decimal
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#" + codePoint + ";", 0, out);

        char[] expectedChars = Character.toChars(codePoint);
        assertEquals(new String(expectedChars), out.toString());

        String entityStr = String.valueOf(codePoint);
        int expectedReturn = 2 + entityStr.length() + 0 + 1;
        assertEquals(expectedReturn, result);
    }

    @Test
    public void testNormalCodePointBelowOrEqual0xFFFF_writesSingleChar() throws IOException {
        StringWriter out = new StringWriter();
        int result = unescaper.translate("&#65535;", 0, out); // 0xFFFF boundary (ไม่เกิน)
        char expected = (char) 65535;
        assertEquals(String.valueOf(expected), out.toString());
        assertEquals(8, result); // 2+5+0+1
    }

    // ---------- ตำแหน่ง index > 0 ในสตริงที่ยาวขึ้น ----------

    @Test
    public void testTranslateAtNonZeroIndexWithinLargerString() throws IOException {
        StringWriter out = new StringWriter();
        String input = "prefix&#65;suffix";
        int index = 6; // ตำแหน่งของ '&'
        int result = unescaper.translate(input, index, out);
        assertEquals("A", out.toString());
        assertEquals(5, result);
    }
}
```

## ตารางสรุปความครอบคลุม Branch/Condition

| ชื่อเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCharAtIndexIsNotAmpersand_returnsZero` | if เงื่อนไขหลัก → false (charAt(index) != '&') |
| `testAmpersandAtVeryEndOfString_returnsZero` | if เงื่อนไขหลัก → false (index >= seqEnd-1) |
| `testAmpersandNotFollowedByHash_returnsZero` | if เงื่อนไขหลัก → false (charAt(index+1) != '#') |
| `testDecimalWithSemicolon_happyPath` | if หลัก=true, firstChar ไม่ใช่ x/X (else), while loop ปกติ, try สำเร็จ, entityValue<=0xFFFF, return formula isHex=false |
| `testHexLowercase_x_happyPath` | firstChar=='x' (isHex=true), try hex parse สำเร็จ, return formula isHex=true |
| `testHexUppercase_X_happyPath` | firstChar=='X' (isHex=true) |
| `testLoopZeroIterations_semicolonImmediatelyAfterStart` | while loop 0 รอบ (start==end ตั้งแต่แรก), catch NumberFormatException (empty string) |
| `testLoopMultipleIterations_multiDigitNumber` | while loop หลายรอบ, try สำเร็จ |
| `testNoSemicolonAtAll_throwsIndexOutOfBounds` | while loop วิ่งเกินขอบเขต (ไม่มี `;`) → ดักจับ fault จริงของโค้ด |
| `testNoCharAfterHash_throwsIndexOutOfBounds` | charAt(start) เกินขอบเขตหลัง '#' (ไม่มีตัวอักษรตามมา) |
| `testSemicolonFoundFarAwayInLargerText_capturesExtraCharsAndFails` | while loop วิ่งผ่านตัวอักษรที่ไม่ใช่เลข, catch NumberFormatException จากข้อมูลปนเปื้อน |
| `testInvalidDecimalNumber_catchesNumberFormatException` | catch(NumberFormatException) กรณี decimal ผิดรูปแบบ |
| `testInvalidHexNumber_catchesNumberFormatException` | catch(NumberFormatException) กรณี hex ผิดรูปแบบ |
| `testSurrogatePairForCodePointAbove0xFFFF` | entityValue > 0xFFFF → true (เขียน surrogate pair 2 chars) |
| `testNormalCodePointBelowOrEqual0xFFFF_writesSingleChar` | entityValue > 0xFFFF → false (ค่าขอบเขต 0xFFFF พอดี) |
| `testTranslateAtNonZeroIndexWithinLargerString` | ทดสอบ index > 0 ในบริบทสตริงที่มีข้อความอื่นรอบ ๆ |

**หมายเหตุสำคัญ**: เคส `testNoSemicolonAtAll_throwsIndexOutOfBounds`, `testNoCharAfterHash_throwsIndexOutOfBounds` และ `testSemicolonFoundFarAwayInLargerText_capturesExtraCharsAndFails` เขียนขึ้นจากการวิเคราะห์ซอร์สโค้ดจริง (ไม่มีการตรวจสอบขอบเขต/การตรวจสอบตัวอักษรระหว่าง digit กับ `;`) เพื่อดักจับพฤติกรรมที่อาจเป็น fault ของคลาสนี้ตามที่ปรากฏในซอร์สที่ให้มา ไม่ได้เป็นการเดา behavior เพิ่มเติม