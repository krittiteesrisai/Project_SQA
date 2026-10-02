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
