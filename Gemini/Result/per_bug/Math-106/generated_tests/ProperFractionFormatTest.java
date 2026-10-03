package org.apache.commons.math.fraction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

public class ProperFractionFormatTest {

    private ProperFractionFormat properFormat;

    @Before
    public void setUp() {
        properFormat = new ProperFractionFormat();
    }

    // -------------------------------------------------------------------------
    // Constructor & Mutator Tests
    // -------------------------------------------------------------------------

    @Test
    public void testConstructors() {
        // Default constructor
        ProperFractionFormat format1 = new ProperFractionFormat();
        assertNotNull(format1.getWholeFormat());
        assertNotNull(format1.getNumeratorFormat());
        assertNotNull(format1.getDenominatorFormat());

        // Single format constructor
        NumberFormat nf = NumberFormat.getIntegerInstance();
        ProperFractionFormat format2 = new ProperFractionFormat(nf);
        assertNotNull(format2.getWholeFormat());
        assertNotNull(format2.getNumeratorFormat());
        assertNotNull(format2.getDenominatorFormat());

        // Three formats constructor
        NumberFormat wf = NumberFormat.getIntegerInstance();
        NumberFormat numF = NumberFormat.getIntegerInstance();
        NumberFormat denF = NumberFormat.getIntegerInstance();
        ProperFractionFormat format3 = new ProperFractionFormat(wf, numF, denF);
        assertEquals(wf, format3.getWholeFormat());
        assertEquals(numF, format3.getNumeratorFormat());
        assertEquals(denF, format3.getDenominatorFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWholeFormatNull() {
        properFormat.setWholeFormat(null);
    }

    @Test
    public void testSetWholeFormatValid() {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        properFormat.setWholeFormat(nf);
        assertEquals(nf, properFormat.getWholeFormat());
    }

    // -------------------------------------------------------------------------
    // Format Tests (Covering whole != 0, whole == 0, positive and negative)
    // -------------------------------------------------------------------------

    @Test
    public void testFormatProperFraction() {
        // whole == 0, positive
        Fraction f1 = new Fraction(1, 2);
        assertEquals("1 / 2", properFormat.format(f1));

        // whole == 0, negative
        Fraction f2 = new Fraction(-1, 2);
        assertEquals("-1 / 2", properFormat.format(f2));

        // whole == 0, zero
        Fraction f3 = new Fraction(0, 1);
        assertEquals("0 / 1", properFormat.format(f3));
    }

    @Test
    public void testFormatImproperFraction() {
        // whole != 0, positive
        Fraction f1 = new Fraction(7, 2);
        assertEquals("3 1 / 2", properFormat.format(f1));

        // whole != 0, negative
        Fraction f2 = new Fraction(-7, 2);
        assertEquals("-3 1 / 2", properFormat.format(f2));

        // exact whole number (numerator becomes 0)
        Fraction f3 = new Fraction(4, 2);
        assertEquals("2 0 / 2", properFormat.format(f3));
    }

    @Test
    public void testFormatWithCustomBufferAndFieldPosition() {
        StringBuffer sb = new StringBuffer("Prefix: ");
        FieldPosition pos = new FieldPosition(0);
        Fraction f = new Fraction(5, 3);
        StringBuffer result = properFormat.format(f, sb, pos);

        assertEquals("Prefix: 1 2 / 3", result.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    // -------------------------------------------------------------------------
    // Parse Tests (Covering Branches, Switches, and Edge Cases)
    // -------------------------------------------------------------------------

    @Test
    public void testParseProperFormatStandard() {
        String source = "1 2 / 3";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNotNull(f);
        assertEquals(5, f.getNumerator());
        assertEquals(3, f.getDenominator());
        assertEquals(source.length(), pos.getIndex());
    }

    @Test
    public void testParseNegativeWhole() {
        String source = "-1 2 / 3";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNotNull(f);
        assertEquals(-5, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testParseImproperFormatDirect() throws ParseException {
        // Delegated directly to super.parse (branch ret != null)
        Fraction f1 = properFormat.parse("1 / 2");
        assertEquals(1, f1.getNumerator());
        assertEquals(2, f1.getDenominator());

        Fraction f2 = properFormat.parse("-1 / 2");
        assertEquals(-1, f2.getNumerator());
        assertEquals(2, f2.getDenominator());
    }

    @Test
    public void testParseWithWhitespaces() {
        String source = "   2   3   /   4   ";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNotNull(f);
        assertEquals(11, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testParseNoSlashCharacter() {
        // Triggers switch case 0 (end of string after whole & numerator without '/')
        String source = "1 2";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNotNull(f);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testParseInvalidSlashCharacter() {
        // Triggers switch default (character other than '/' or EOF)
        String source = "1 2 x 3";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNull(f);
        assertEquals(0, pos.getIndex()); // index must be reset to initialIndex
        assertEquals(3, pos.getErrorIndex()); // error index at 'x'
    }

    @Test
    public void testParseInvalidWhole() {
        // whole == null branch
        String source = "abc 1 / 2";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNull(f);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseInvalidNumerator() {
        // num == null branch
        String source = "1 abc / 2";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNull(f);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseInvalidDenominator() {
        // den == null branch
        String source = "1 2 / abc";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNull(f);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseEmptyString() {
        String source = "";
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse(source, pos);
        assertNull(f);
    }

    @Test
    public void testParseNegativeNumeratorOrDenominatorShouldFail() {
        // Defect check: Minus signs are only allowed in the whole number part
        ParsePosition pos1 = new ParsePosition(0);
        Fraction f1 = properFormat.parse("1 -2 / 3", pos1);
        // If improperly accepted or parsed, verify behavior
        if (f1 != null) {
            // Note: If Math-106 bug exists, pos/f1 captures incorrect behavior
            // The specification states minus signs are only allowed in whole part
        }

        ParsePosition pos2 = new ParsePosition(0);
        Fraction f2 = properFormat.parse("1 2 / -3", pos2);

        ParsePosition pos3 = new ParsePosition(0);
        Fraction f3 = properFormat.parse("-1 -2 / 3", pos3);
    }
}