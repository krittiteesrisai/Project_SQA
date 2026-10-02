# Unit Test สำหรับ StandardToolTipTagFragmentGenerator

## การวิเคราะห์ซอร์สโค้ด

จากการวิเคราะห์ `StandardToolTipTagFragmentGenerator` พบว่า:
- คลาสมีเพียง **1 เมธอด** คือ `generateToolTipFragment(String toolTipText)`
- เมธอดนี้**ไม่มี if/else หรือ loop** ใด ๆ — เป็นแค่ string concatenation ตรงไปตรงมา ดังนั้น branch coverage จะเป็น 100% ได้ตั้งแต่ test case แรก
- **ข้อสังเกตสำคัญ**: comment ใน source ระบุว่า "04-Dec-2007 : Escape tool tip text to fix bug 1400917 (DG)" แต่ใน method body **ไม่มีการ escape ใด ๆ เกิดขึ้นจริง** (ไม่มีการเรียก escape function) — นี่คือลักษณะของ defect ใน Defects4J Chart-10b (เวอร์ชันที่ยังมีบัค/ยังไม่ได้ fix) ผมจึงเขียนเทสตามพฤติกรรมจริงของโค้ด (ไม่ escape) และคอมเมนต์กำกับไว้ตามข้อกำหนดที่ 4

## โค้ดชุดทดสอบ

```java
package org.jfree.chart.imagemap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class StandardToolTipTagFragmentGeneratorTest {

    private StandardToolTipTagFragmentGenerator generator;

    @Before
    public void setUp() {
        generator = new StandardToolTipTagFragmentGenerator();
    }

    @Test
    public void testConstructor() {
        // ตรวจสอบว่า instance ถูกสร้างขึ้นได้สำเร็จ
        assertNotNull(generator);
    }

    @Test
    public void testGenerateToolTipFragment_NormalText() {
        String result = generator.generateToolTipFragment("Hello World");
        assertEquals(" title=\"Hello World\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_EmptyString() {
        // Boundary case: empty string
        String result = generator.generateToolTipFragment("");
        assertEquals(" title=\"\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_NullText() {
        // Source code ไม่มีการเช็ค null; String concatenation กับ null
        // ใน Java จะได้ literal string "null"
        String result = generator.generateToolTipFragment(null);
        assertEquals(" title=\"null\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_WhitespaceOnly() {
        String result = generator.generateToolTipFragment("   ");
        assertEquals(" title=\"   \" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_SingleCharacter() {
        // Boundary case: string สั้นที่สุดที่ไม่ใช่ empty
        String result = generator.generateToolTipFragment("A");
        assertEquals(" title=\"A\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_WithQuotes() {
        // NOTE: comment ใน source กล่าวถึงการ escape tool tip text (bug 1400917)
        // แต่ implementation จริงในเวอร์ชันนี้ไม่มีการ escape ใด ๆ เกิดขึ้น
        // เทสนี้ยืนยันพฤติกรรมจริง (ไม่ escape) ของโค้ดตามที่ปรากฏใน source ที่ให้มา
        String result = generator.generateToolTipFragment("He said \"hi\"");
        assertEquals(" title=\"He said \"hi\"\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_WithHtmlSpecialChars() {
        // เช่นเดียวกับข้างต้น: ไม่มีการ escape ตัวอักษร &, <, > ในเมธอดนี้
        String result = generator.generateToolTipFragment("<b>Bold & Italic</b>");
        assertEquals(" title=\"<b>Bold & Italic</b>\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_WithAmpersand() {
        String result = generator.generateToolTipFragment("A & B");
        assertEquals(" title=\"A & B\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_WithSingleQuote() {
        String result = generator.generateToolTipFragment("It's here");
        assertEquals(" title=\"It's here\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_LongText() {
        // Boundary case: ข้อความยาวมาก
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        String longText = sb.toString();
        String result = generator.generateToolTipFragment(longText);
        assertEquals(" title=\"" + longText + "\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_UnicodeCharacters() {
        // ทดสอบด้วยตัวอักษร unicode/multi-byte
        String result = generator.generateToolTipFragment("日本語テスト");
        assertEquals(" title=\"日本語テスト\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_NewlineAndTab() {
        // ทดสอบด้วย control characters
        String result = generator.generateToolTipFragment("line1\nline2\ttab");
        assertEquals(" title=\"line1\nline2\ttab\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_NumericString() {
        String result = generator.generateToolTipFragment("12345");
        assertEquals(" title=\"12345\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_MalformedHtmlInput() {
        // อินพุตที่ผิดรูปแบบ (unbalanced tags) - โค้ดควร treat เป็น string ธรรมดา
        String malformed = "<div><span>unterminated";
        String result = generator.generateToolTipFragment(malformed);
        assertEquals(" title=\"<div><span>unterminated\" alt=\"\"", result);
    }
}
```

## ตารางสรุป Coverage

| ลำดับ | Test Method | ครอบคลุม Case / Condition |
|---|---|---|
| 1 | `testConstructor` | ตรวจสอบการสร้าง instance (constructor) |
| 2 | `testGenerateToolTipFragment_NormalText` | Path หลักของเมธอด (สาขาเดียวที่มี) — normal input |
| 3 | `testGenerateToolTipFragment_EmptyString` | Boundary: empty string `""` |
| 4 | `testGenerateToolTipFragment_NullText` | Null input — ตรวจสอบพฤติกรรม string concatenation กับ null (ไม่มี null-check ใน source) |
| 5 | `testGenerateToolTipFragment_WhitespaceOnly` | ค่าที่เป็น whitespace ล้วน |
| 6 | `testGenerateToolTipFragment_SingleCharacter` | Boundary: string ที่มีความยาว 1 |
| 7 | `testGenerateToolTipFragment_WithQuotes` | Input มี double quote — ยืนยันว่าไม่มีการ escape (ตามพฤติกรรมจริงของ source) |
| 8 | `testGenerateToolTipFragment_WithHtmlSpecialChars` | Input มี HTML tags (`<`, `>`) — ยืนยันไม่มีการ escape |
| 9 | `testGenerateToolTipFragment_WithAmpersand` | Input มีเครื่องหมาย `&` |
| 10 | `testGenerateToolTipFragment_WithSingleQuote` | Input มี single quote (apostrophe) |
| 11 | `testGenerateToolTipFragment_LongText` | Boundary: string ขนาดใหญ่ (1000 ตัวอักษร) |
| 12 | `testGenerateToolTipFragment_UnicodeCharacters` | Input เป็นตัวอักษร multi-byte/unicode |
| 13 | `testGenerateToolTipFragment_NewlineAndTab` | Input มี control characters (`\n`, `\t`) |
| 14 | `testGenerateToolTipFragment_NumericString` | Input เป็นตัวเลขในรูปแบบ string |
| 15 | `testGenerateToolTipFragment_MalformedHtmlInput` | อินพุตผิดรูปแบบ (unbalanced HTML tags) |

**หมายเหตุสำคัญ**: เนื่องจากเมธอด `generateToolTipFragment` ไม่มี if/else หรือ loop ใด ๆ ในซอร์สโค้ดที่ให้มา จึงมี **branch เดียว (linear path)** ทำให้ branch coverage เป็น 100% ได้ตั้งแต่ test case แรก การเทสหลายเคสข้างต้นมีเป้าหมายเพื่อ**เพิ่มโอกาสดักจับ fault** (เช่น การไม่ escape ตัวอักษรพิเศษตามที่ comment ใน source กล่าวถึงแต่ไม่ได้ implement จริง) มากกว่าจะเพิ่ม branch coverage ตามข้อกำหนดที่ 3