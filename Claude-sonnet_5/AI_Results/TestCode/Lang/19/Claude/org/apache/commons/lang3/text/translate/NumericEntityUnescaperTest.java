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
