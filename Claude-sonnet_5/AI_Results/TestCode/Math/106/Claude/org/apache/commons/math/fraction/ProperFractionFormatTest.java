package org.apache.commons.math.fraction;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

import org.junit.Before;
import org.junit.Test;

public class ProperFractionFormatTest {

    private ProperFractionFormat pff;

    @Before
    public void setUp() {
        // ใช้ pattern "0" เพื่อให้ parse/format เป็นเลขจำนวนเต็มล้วน ไม่ติด locale (grouping, decimal symbol)
        pff = new ProperFractionFormat(new DecimalFormat("0"));
    }

    // ----------------------------------------------------------------
    // Constructor tests
    // ----------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        ProperFractionFormat f = new ProperFractionFormat();
        assertNotNull(f.getWholeFormat());
        assertNotNull(f.getNumeratorFormat());
        assertNotNull(f.getDenominatorFormat());
    }

    @Test
    public void testSingleFormatConstructorClonesNumeratorDenominator() {
        NumberFormat nfmt = new DecimalFormat("0");
        ProperFractionFormat f = new ProperFractionFormat(nfmt);

        // ตาม source: this(format, format.clone(), format.clone())
        assertSame(nfmt, f.getWholeFormat());
        assertNotSame(nfmt, f.getNumeratorFormat());
        assertNotSame(nfmt, f.getDenominatorFormat());
        assertNotSame(f.getNumeratorFormat(), f.getDenominatorFormat());
    }

    @Test
    public void testThreeArgConstructorUsesExactInstances() {
        NumberFormat wf = new DecimalFormat("0");
        NumberFormat nf = new DecimalFormat("0");
        NumberFormat df = new DecimalFormat("0");
        ProperFractionFormat f = new ProperFractionFormat(wf, nf, df);

        assertSame(wf, f.getWholeFormat());
        assertSame(nf, f.getNumeratorFormat());
        assertSame(df, f.getDenominatorFormat());
    }

    // ----------------------------------------------------------------
    // setWholeFormat / getWholeFormat
    // ----------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetWholeFormatNullThrows() {
        pff.setWholeFormat(null);
    }

    @Test
    public void testSetWholeFormatValid() {
        NumberFormat newFormat = new DecimalFormat("0");
        pff.setWholeFormat(newFormat);
        assertSame(newFormat, pff.getWholeFormat());
    }

    // ----------------------------------------------------------------
    // format() : branch "whole != 0" (true/false), ทั้งบวก/ลบ/ศูนย์
    // ----------------------------------------------------------------

    @Test
    public void testFormatImproperFractionPositive() {
        // 7/2 -> whole=3, remainder=1 -> whole != 0 (true branch, positive)
        Fraction fraction = new Fraction(7, 2);
        StringBuffer sb = pff.format(fraction, new StringBuffer(), new FieldPosition(0));
        assertEquals("3 1 / 2", sb.toString());
    }

    @Test
    public void testFormatFractionLessThanOne() {
        // 1/2 -> whole=0 -> whole != 0 (false branch) -> ไม่พิมพ์ whole, ไม่เรียก Math.abs
        Fraction fraction = new Fraction(1, 2);
        StringBuffer sb = pff.format(fraction, new StringBuffer(), new FieldPosition(0));
        assertEquals("1 / 2", sb.toString());
    }

    @Test
    public void testFormatNegativeImproperFraction() {
        // -7/2 -> whole = -3 (truncation), remainder = -1 -> whole != 0 (true branch, negative)
        // num = Math.abs(-1) = 1
        Fraction fraction = new Fraction(-7, 2);
        StringBuffer sb = pff.format(fraction, new StringBuffer(), new FieldPosition(0));
        assertEquals("-3 1 / 2", sb.toString());
    }

    @Test
    public void testFormatZeroNumerator() {
        // 0/1 -> whole = 0 -> false branch, num คงเป็น 0
        Fraction fraction = new Fraction(0, 1);
        StringBuffer sb = pff.format(fraction, new StringBuffer(), new FieldPosition(0));
        assertEquals("0 / 1", sb.toString());
    }

    @Test
    public void testFormatWholeNumberWithZeroRemainder() {
        // 3/1 -> whole=3, remainder=0 -> whole != 0 (true), num=abs(0)=0
        Fraction fraction = new Fraction(3, 1);
        StringBuffer sb = pff.format(fraction, new StringBuffer(), new FieldPosition(0));
        assertEquals("3 0 / 1", sb.toString());
    }

    // ----------------------------------------------------------------
    // parse() : branch "ret != null" (improper fraction ผ่าน super.parse ตรง ๆ)
    // ----------------------------------------------------------------

    @Test
    public void testParseImproperFractionViaSuper() {
        // ตาม comment ในซอร์ส: "try to parse improper fraction" ก่อน
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("7 / 2", pos);
        assertEquals(new Fraction(7, 2), result);
    }

    // ----------------------------------------------------------------
    // parse() proper fraction : whole != null, num != null, '/' case, den != null
    // ----------------------------------------------------------------

    @Test
    public void testParseProperFractionPositiveWhole() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("3 1 / 2", pos);
        assertEquals(new Fraction(7, 2), result);
    }

    @Test
    public void testParseProperFractionNegativeWhole() {
        // ตาม javadoc: "-3 1/2" หมายถึง -7/2
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("-3 1 / 2", pos);
        assertEquals(new Fraction(-7, 2), result);
    }

    @Test
    public void testParseProperFractionWithLeadingWhitespace() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("   3 1 / 2", pos);
        assertEquals(new Fraction(7, 2), result);
    }

    /**
     * เทสนี้ตั้งใจดักจับ "known defect" ของ Math-106:
     * เมื่อ whole = 0 สูตร ((Math.abs(w)*d)+n) * MathUtils.sign(w)
     * จะคูณด้วย sign(0) = 0 เสมอ ทำให้ผลลัพธ์ผิดเป็น 0 แทนที่จะเป็น n/d จริง (1/2)
     * -> คาดว่าเทสนี้จะ "ล้มเหลว" บนโค้ด buggy (Math-106b) และควร "ผ่าน" หลัง fix
     */
    @Test
    public void testParseZeroWholeKnownDefect() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("0 1 / 2", pos);
        // ค่าที่ถูกต้องทางคณิตศาสตร์ของ "0 1/2" คือ 1/2
        assertEquals(new Fraction(1, 2), result);
    }

    @Test
    public void testParseNoSlashReturnsNumeratorOverOne() {
        // ตาม source: case 0 (ไม่มี '/') -> return new Fraction(num.intValue(), 1)
        // สังเกตว่าค่า whole ที่ parse ไปแล้วจะถูก "ละทิ้ง" ไปเฉย ๆ ตาม logic จริงของโค้ด
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("3 1", pos);
        assertEquals(new Fraction(1, 1), result);
    }

    @Test
    public void testParseInvalidCharacterInsteadOfSlash() {
        // default case ของ switch -> คืน null, pos ถูก reset กลับ initialIndex
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("3 1 x 2", pos);
        assertNull(result);
    }

    @Test
    public void testParseInvalidDenominator() {
        // den == null -> คืน null
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("3 1 / abc", pos);
        assertNull(result);
    }

    @Test
    public void testParseInvalidNumerator() {
        // num == null (หลัง whole parse สำเร็จ) -> คืน null
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("3 abc", pos);
        assertNull(result);
    }

    @Test
    public void testParseInvalidWhole() {
        // whole == null -> คืน null (ทั้ง super.parse และ whole parse ล้มเหลว)
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("abc", pos);
        assertNull(result);
    }

    @Test
    public void testParseEmptyString() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = pff.parse("", pos);
        assertNull(result);
    }
}
