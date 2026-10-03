package org.apache.commons.math.complex;

import org.junit.Before;
import org.junit.Test;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

import static org.junit.Assert.*;

public class ComplexFormatTest {

    private ComplexFormat complexFormat;
    private NumberFormat defaultNumberFormat;

    @Before
    public void setUp() {
        defaultNumberFormat = NumberFormat.getInstance(Locale.US);
        defaultNumberFormat.setMaximumFractionDigits(2);
        complexFormat = new ComplexFormat(defaultNumberFormat);
    }

    // ==========================================
    // 1. Constructor and Setter Validation Tests
    // ==========================================

    @Test
    public void testDefaultConstructor() {
        ComplexFormat format = new ComplexFormat();
        assertEquals("i", format.getImaginaryCharacter());
        assertNotNull(format.getRealFormat());
        assertNotNull(format.getImaginaryFormat());
    }

    @Test
    public void testCustomFormatConstructor() {
        NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH);
        ComplexFormat format = new ComplexFormat(nf);
        assertEquals("i", format.getImaginaryCharacter());
        assertEquals(nf, format.getRealFormat());
    }

    @Test
    public void testCustomRealAndImaginaryFormatConstructor() {
        NumberFormat rf = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat imf = NumberFormat.getInstance(Locale.US);
        ComplexFormat format = new ComplexFormat(rf, imf);
        assertEquals("i", format.getImaginaryCharacter());
        assertEquals(rf, format.getRealFormat());
        assertEquals(imf, format.getImaginaryFormat());
    }

    @Test
    public void testCustomImaginaryCharConstructor() {
        ComplexFormat format = new ComplexFormat("j");
        assertEquals("j", format.getImaginaryCharacter());
    }

    @Test
    public void testCustomCharAndFormatConstructor() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        ComplexFormat format = new ComplexFormat("j", nf);
        assertEquals("j", format.getImaginaryCharacter());
        assertEquals(nf, format.getRealFormat());
    }

    @Test
    public void testCustomCharRealAndImaginaryFormatConstructor() {
        NumberFormat rf = NumberFormat.getInstance(Locale.US);
        NumberFormat imf = NumberFormat.getInstance(Locale.US);
        ComplexFormat format = new ComplexFormat("j", rf, imf);
        assertEquals("j", format.getImaginaryCharacter());
        assertEquals(rf, format.getRealFormat());
        assertEquals(imf, format.getImaginaryFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacterNull() {
        complexFormat.setImaginaryCharacter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacterEmpty() {
        complexFormat.setImaginaryCharacter("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryFormatNull() {
        complexFormat.setImaginaryFormat(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRealFormatNull() {
        complexFormat.setRealFormat(null);
    }

    @Test
    public void testSetValidFormatsAndCharacter() {
        NumberFormat nf = NumberFormat.getIntegerInstance();
        complexFormat.setImaginaryCharacter("j");
        complexFormat.setRealFormat(nf);
        complexFormat.setImaginaryFormat(nf);

        assertEquals("j", complexFormat.getImaginaryCharacter());
        assertEquals(nf, complexFormat.getRealFormat());
        assertEquals(nf, complexFormat.getImaginaryFormat());
    }

    // ==========================================
    // 2. Format (Complex and Double values) Tests
    // ==========================================

    @Test
    public void testFormatPositiveImaginary() {
        Complex c = new Complex(1.23, 4.56);
        assertEquals("1.23 + 4.56i", complexFormat.format(c));
    }

    @Test
    public void testFormatNegativeImaginary() {
        Complex c = new Complex(1.23, -4.56);
        assertEquals("1.23 - 4.56i", complexFormat.format(c));
    }

    @Test
    public void testFormatZeroImaginary() {
        Complex c = new Complex(1.23, 0.0);
        assertEquals("1.23", complexFormat.format(c));
    }

    @Test
    public void testFormatNaN() {
        Complex c1 = new Complex(Double.NaN, 1.0);
        assertEquals("(NaN) + 1i", complexFormat.format(c1));

        Complex c2 = new Complex(1.0, Double.NaN);
        assertEquals("1 + (NaN)i", complexFormat.format(c2));

        Complex c3 = new Complex(Double.NaN, Double.NaN);
        assertEquals("(NaN) + (NaN)i", complexFormat.format(c3));
    }

    @Test
    public void testFormatInfinities() {
        Complex c1 = new Complex(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
        assertEquals("(Infinity) - (Infinity)i", complexFormat.format(c1));

        Complex c2 = new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals("(-Infinity) + (Infinity)i", complexFormat.format(c2));
    }

    @Test
    public void testFormatComplexStatic() {
        Complex c = new Complex(2.0, 3.0);
        String formatted = ComplexFormat.formatComplex(c);
        assertNotNull(formatted);
        assertTrue(formatted.contains("2") && formatted.contains("3"));
    }

    // ==========================================
    // 3. Format (Object type dispatch) Tests
    // ==========================================

    @Test
    public void testFormatObjectComplex() {
        Object obj = new Complex(2.0, -3.0);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        StringBuffer result = complexFormat.format(obj, sb, pos);
        assertEquals("2 - 3i", result.toString());
    }

    @Test
    public void testFormatObjectNumber() {
        Object obj = Double.valueOf(5.5);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        StringBuffer result = complexFormat.format(obj, sb, pos);
        assertEquals("5.5", result.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObjectInvalidType() {
        complexFormat.format("invalid object", new StringBuffer(), new FieldPosition(0));
    }

    // ==========================================
    // 4. Parse Tests
    // ==========================================

    @Test
    public void testParseStandardComplex() throws ParseException {
        Complex expected = new Complex(1.23, 4.56);
        Complex actual = complexFormat.parse("1.23 + 4.56i");
        assertEquals(expected, actual);
    }

    @Test
    public void testParseNegativeImaginary() throws ParseException {
        Complex expected = new Complex(1.23, -4.56);
        Complex actual = complexFormat.parse("1.23 - 4.56i");
        assertEquals(expected, actual);
    }

    @Test
    public void testParseRealOnly() throws ParseException {
        Complex expected = new Complex(1.23, 0.0);
        Complex actual = complexFormat.parse("1.23");
        assertEquals(expected, actual);
    }

    @Test
    public void testParseWithCustomImaginaryCharacter() throws ParseException {
        ComplexFormat format = new ComplexFormat("j", defaultNumberFormat);
        Complex expected = new Complex(1.0, 2.0);
        Complex actual = format.parse("1 + 2j");
        assertEquals(expected, actual);
    }

    @Test
    public void testParseSpecialValues() throws ParseException {
        Complex c1 = complexFormat.parse("(NaN) + (NaN)i");
        assertTrue(Double.isNaN(c1.getReal()));
        assertTrue(Double.isNaN(c1.getImaginary()));

        Complex c2 = complexFormat.parse("(Infinity) - (Infinity)i");
        assertEquals(Double.POSITIVE_INFINITY, c2.getReal(), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, c2.getImaginary(), 0.0);

        Complex c3 = complexFormat.parse("(-Infinity) + (-Infinity)i");
        assertEquals(Double.NEGATIVE_INFINITY, c3.getReal(), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, c3.getImaginary(), 0.0);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidRealPartThrowsException() throws ParseException {
        complexFormat.parse("invalid + 1i");
    }

    @Test
    public void testParseInvalidRealPartReturnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("invalid", pos);
        assertNull(c);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseInvalidSignReturnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("1.23 * 4.56i", pos);
        assertNull(c);
        assertEquals(0, pos.getIndex());
        assertTrue(pos.getErrorIndex() >= 0);
    }

    @Test
    public void testParseInvalidImaginaryPartReturnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("1.23 + invalid_i", pos);
        assertNull(c);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseMismatchedImaginaryCharacterReturnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("1.23 + 4.56j", pos); // expects 'i', got 'j'
        assertNull(c);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseTruncatedAfterImaginaryNumber() {
        // Edge Case for Defects4J Math-101: Source ends before imaginary character
        ParsePosition pos = new ParsePosition(0);
        try {
            Complex c = complexFormat.parse("1.23 + 4.56", pos);
            assertNull(c);
        } catch (StringIndexOutOfBoundsException e) {
            fail("Should not throw StringIndexOutOfBoundsException when imaginary character is missing");
        }
    }

    @Test
    public void testParseObject() {
        ParsePosition pos = new ParsePosition(0);
        Object obj = complexFormat.parseObject("1.23 + 4.56i", pos);
        assertNotNull(obj);
        assertTrue(obj instanceof Complex);
        assertEquals(new Complex(1.23, 4.56), obj);
    }

    // ==========================================
    // 5. Locale and Instance Utility Tests
    // ==========================================

    @Test
    public void testGetAvailableLocales() {
        Locale[] locales = ComplexFormat.getAvailableLocales();
        assertNotNull(locales);
        assertTrue(locales.length > 0);
    }

    @Test
    public void testGetInstance() {
        ComplexFormat defaultInstance = ComplexFormat.getInstance();
        assertNotNull(defaultInstance);

        ComplexFormat frenchInstance = ComplexFormat.getInstance(Locale.FRENCH);
        assertNotNull(frenchInstance);
    }
}