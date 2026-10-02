package org.apache.commons.math.fraction;

import org.junit.Test;
import java.text.FieldPosition;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.math.RoundingMode;
import java.text.CompactNumberFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_fraction_ProperFractionFormatTest {
    ///region Test suites for executable org.apache.commons.math.fraction.ProperFractionFormat.format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(org.apache.commons.math.fraction.Fraction, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int whole = num / den;
 *  */
    @Test
    public void testFormat_ThrowArithmeticException() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:94) */
        properFractionFormat.format(fraction, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (whole != 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getNumeratorFormat().format(num, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        double[] choiceLimits = {};
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceLimits", choiceLimits);
        java.lang.String[] choiceFormats = {};
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -193);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -128);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.ChoiceFormat.format(ChoiceFormat.java:415)
            java.base/java.text.ChoiceFormat.format(ChoiceFormat.java:391)
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:102) */
        properFractionFormat.format(fraction, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (whole != 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getNumeratorFormat().format(num, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        Object digitList = createInstance("java.text.DigitList");
        char[] digits = {};
        setField(digitList, "java.text.DigitList", "digits", digits);
        setField(numeratorFormat, "java.text.DecimalFormat", "digitList", digitList);
        numeratorFormat.setMultiplier(1);
        setField(numeratorFormat, "java.text.DecimalFormat", "useExponentialNotation", true);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -4);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -3);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 0]
            java.base/java.text.DigitList.set(DigitList.java:640)
            java.base/java.text.DecimalFormat.format(DecimalFormat.java:777)
            java.base/java.text.DecimalFormat.format(DecimalFormat.java:714)
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:102) */
        properFractionFormat.format(fraction, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (whole != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getWholeFormat().format(whole, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat wholeFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        double[] choiceLimits = {-2.0};
        setField(wholeFormat, "java.text.ChoiceFormat", "choiceLimits", choiceLimits);
        java.lang.String[] choiceFormats = {};
        setField(wholeFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setWholeFormat(wholeFormat);
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 2);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.ChoiceFormat.format(ChoiceFormat.java:415)
            java.base/java.text.ChoiceFormat.format(ChoiceFormat.java:391)
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:98) */
        properFractionFormat.format(fraction, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (whole != 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getWholeFormat().format(whole, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat wholeFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        Object digitList = createInstance("java.text.DigitList");
        char[] digits = {};
        setField(digitList, "java.text.DigitList", "digits", digits);
        setField(wholeFormat, "java.text.DecimalFormat", "digitList", digitList);
        wholeFormat.setMultiplier(-56272847);
        properFractionFormat.setWholeFormat(wholeFormat);
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 250);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 0]
            java.base/java.text.DigitList.set(DigitList.java:640)
            java.base/java.text.DecimalFormat.format(DecimalFormat.java:777)
            java.base/java.text.DecimalFormat.format(DecimalFormat.java:714)
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:98) */
        properFractionFormat.format(fraction, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int num = fraction.getNumerator();
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_1() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:92) */
        properFractionFormat.format(((Fraction) null), ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.invokes {@link java.text.FieldPosition#setBeginIndex(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pos.setBeginIndex(0);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:89) */
        properFractionFormat.format(((Fraction) null), ((StringBuffer) null), ((FieldPosition) null));
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (whole != 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getNumeratorFormat().format(num, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_2() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -193);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -128);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:102) */
        properFractionFormat.format(fraction, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (whole != 0): True}
 * @utbot.invokes {@link java.text.NumberFormat#format(long,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getWholeFormat().format(whole, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_4() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -65);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -128);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:98) */
        properFractionFormat.format(fraction, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (whole != 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getNumeratorFormat().format(num, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_3() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        Object digitList = createInstance("java.text.DigitList");
        setField(numeratorFormat, "java.text.DecimalFormat", "digitList", digitList);
        String positivePrefix = "";
        numeratorFormat.setPositivePrefix(positivePrefix);
        java.text.FieldPosition[] positivePrefixFieldPositions = {null};
        setField(numeratorFormat, "java.text.DecimalFormat", "positivePrefixFieldPositions", positivePrefixFieldPositions);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -66);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.append(DecimalFormat.java:2065)
            java.base/java.text.DecimalFormat.subformat(DecimalFormat.java:1742)
            java.base/java.text.DecimalFormat.format(DecimalFormat.java:780)
            java.base/java.text.DecimalFormat.format(DecimalFormat.java:714)
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:102) */
        properFractionFormat.format(fraction, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#format(org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (whole != 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.invokes {@link java.lang.Math#abs(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getNumeratorFormat().format(num, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_5() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat wholeFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        double[] choiceLimits = {1.1842171326028735E77};
        setField(wholeFormat, "java.text.ChoiceFormat", "choiceLimits", choiceLimits);
        java.lang.String[] choiceFormats = new java.lang.String[1];
        String string = "";
        choiceFormats[0] = string;
        setField(wholeFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setWholeFormat(wholeFormat);
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -64);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 64);
        StringBuffer stringBuffer = new StringBuffer("");
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.ProperFractionFormat.format(ProperFractionFormat.java:102) */
        properFractionFormat.format(fraction, stringBuffer, fieldPosition);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.ProperFractionFormat.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.FractionFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: Fraction ret = super.parse(source, pos);
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.math.fraction.FractionFormat.parseNextCharacter(FractionFormat.java:377)
            org.apache.commons.math.fraction.FractionFormat.parseAndIgnoreWhitespace(FractionFormat.java:359)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:263)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#parse(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseWithBlankString() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setMultiplier(1);
        decimalFormat.setPositiveSuffix("#$\\\"'");
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        decimalFormat.setMinimumFractionDigits(1);
        decimalFormat.setMinimumIntegerDigits(Integer.MAX_VALUE);
        decimalFormat.setMaximumIntegerDigits(48);
        decimalFormat.setMaximumFractionDigits(0);
        decimalFormat.setPositivePrefix("-3");
        decimalFormat.setMinimumIntegerDigits(0);
        ProperFractionFormat properFractionFormat = new ProperFractionFormat(decimalFormat);
        DecimalFormat decimalFormat1 = new DecimalFormat("\n\t\r", null);
        decimalFormat1.setMaximumIntegerDigits(1);
        decimalFormat1.setNegativePrefix("");
        decimalFormat1.setMaximumIntegerDigits(-1);
        decimalFormat1.setMaximumFractionDigits(Integer.MAX_VALUE);
        decimalFormat1.setNegativeSuffix("10");
        decimalFormat1.setMaximumFractionDigits(0);
        decimalFormat1.setMultiplier(1);
        decimalFormat1.setMinimumIntegerDigits(48);
        decimalFormat1.setMinimumFractionDigits(1);
        decimalFormat1.setMinimumFractionDigits(0);
        properFractionFormat.setWholeFormat(decimalFormat1);
        DecimalFormat decimalFormat2 = new DecimalFormat("XZ", null);
        decimalFormat2.setMaximumFractionDigits(1);
        decimalFormat2.setMaximumIntegerDigits(1);
        decimalFormat2.setMinimumIntegerDigits(1);
        decimalFormat2.setMaximumIntegerDigits(0);
        decimalFormat2.setNegativePrefix("#$\\\"'");
        decimalFormat2.setNegativeSuffix("#$\\\"'");
        decimalFormat2.setMinimumFractionDigits(1);
        decimalFormat2.setMultiplier(Integer.MAX_VALUE);
        decimalFormat2.setMaximumFractionDigits(47);
        decimalFormat2.setMinimumIntegerDigits(48);
        properFractionFormat.setDenominatorFormat(decimalFormat2);
        java.lang.String[] stringArray = {};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("\n\t\r", null, stringArray, "\n\t\r");
        compactNumberFormat.setMaximumIntegerDigits(48);
        compactNumberFormat.setMaximumFractionDigits(47);
        compactNumberFormat.setMinimumIntegerDigits(47);
        RoundingMode roundingMode1 = RoundingMode.HALF_EVEN;
        compactNumberFormat.setRoundingMode(roundingMode1);
        compactNumberFormat.setMinimumFractionDigits(1);
        properFractionFormat.setNumeratorFormat(compactNumberFormat);
        ParsePosition parsePosition = new ParsePosition(Integer.MIN_VALUE);
        parsePosition.setIndex(0);
        parsePosition.setErrorIndex(-2147483600);
        
        Fraction actual = properFractionFormat.parse("\n\t\r", parsePosition);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#parse(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseThrowsNPEWithNonEmptyString() {
        ProperFractionFormat properFractionFormat = new ProperFractionFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(null);
        decimalFormatSymbols.setDecimalSeparator('\u0001');
        decimalFormatSymbols.setCurrencySymbol("abc");
        decimalFormatSymbols.setPercent('0');
        decimalFormatSymbols.setNaN("10");
        decimalFormatSymbols.setZeroDigit('?');
        decimalFormatSymbols.setMinusSign('\u0001');
        decimalFormatSymbols.setMonetaryGroupingSeparator('\u0000');
        decimalFormatSymbols.setGroupingSeparator('/');
        decimalFormatSymbols.setDigit('@');
        decimalFormatSymbols.setPatternSeparator('\u0001');
        java.lang.String[] stringArray = {"\n\t\r", "10", "#$\\\"'", "10"};
        CompactNumberFormat compactNumberFormat = new CompactNumberFormat("\n\t\r", decimalFormatSymbols, stringArray);
        compactNumberFormat.setMinimumFractionDigits(1);
        compactNumberFormat.setMaximumIntegerDigits(0);
        compactNumberFormat.setMinimumIntegerDigits(1);
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        compactNumberFormat.setRoundingMode(roundingMode);
        compactNumberFormat.setMaximumFractionDigits(0);
        properFractionFormat.setNumeratorFormat(compactNumberFormat);
        java.lang.String[] stringArray1 = {"\n\t\r"};
        CompactNumberFormat compactNumberFormat1 = new CompactNumberFormat("", null, stringArray1, "");
        RoundingMode roundingMode1 = RoundingMode.HALF_EVEN;
        compactNumberFormat1.setRoundingMode(roundingMode1);
        compactNumberFormat1.setMaximumFractionDigits(1);
        compactNumberFormat1.setMinimumIntegerDigits(1);
        compactNumberFormat1.setMinimumFractionDigits(1);
        compactNumberFormat1.setMaximumIntegerDigits(Integer.MIN_VALUE);
        properFractionFormat.setDenominatorFormat(compactNumberFormat1);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setNegativeSuffix("\n\t\r");
        RoundingMode roundingMode2 = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode2);
        decimalFormat.setNegativePrefix("#$\\\"'");
        decimalFormat.setMinimumIntegerDigits(1);
        decimalFormat.setPositiveSuffix("10");
        decimalFormat.setMinimumIntegerDigits(-1);
        decimalFormat.setMaximumFractionDigits(Integer.MAX_VALUE);
        decimalFormat.setPositivePrefix("\n\t\r");
        decimalFormat.setMinimumFractionDigits(1);
        decimalFormat.setMinimumFractionDigits(0);
        properFractionFormat.setWholeFormat(decimalFormat);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:260)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse("'$\\\"#", null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParse1() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = "\t\n";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Fraction actual = properFractionFormat.parse(string, parsePosition);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(2, finalParsePositionIndex);
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse2() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = "\f\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Fraction actual = properFractionFormat.parse(string, parsePosition);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(2, finalParsePositionIndex);
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse3() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(10);
        
        Fraction actual = properFractionFormat.parse(string, parsePosition);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(12, finalParsePositionIndex);
        
        assertEquals(11, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse4() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "";
        symbols.setNaN(naN);
        setField(numeratorFormat, "java.text.DecimalFormat", "symbols", symbols);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Fraction actual = properFractionFormat.parse(string, parsePosition);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testParse5() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\f";
        symbols.setNaN(naN);
        setField(numeratorFormat, "java.text.DecimalFormat", "symbols", symbols);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Fraction actual = properFractionFormat.parse(naN, parsePosition);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    
    @Test
    public void testParse6() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000\u0000\u0000";
        symbols.setNaN(naN);
        setField(numeratorFormat, "java.text.DecimalFormat", "symbols", symbols);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Fraction actual = properFractionFormat.parse(naN, parsePosition);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(3, finalParsePositionIndex);
    }
    
    @Test
    public void testParse7() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000";
        symbols.setNaN(naN);
        setField(numeratorFormat, "java.text.DecimalFormat", "symbols", symbols);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Fraction actual = properFractionFormat.parse(naN, parsePosition);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParse8() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[1];
        String string = "";
        choiceFormats[0] = string;
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.math.fraction.FractionFormat.parseNextCharacter(FractionFormat.java:377)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:277)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse9() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f \u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(10);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse10() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        CompactNumberFormat numeratorFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = "\r\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse11() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = "\r ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:439)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse12() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        CompactNumberFormat numeratorFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse13() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        CompactNumberFormat numeratorFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = "$";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse14() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[10];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f";
        choiceFormats[0] = string;
        String string1 = "";
        choiceFormats[1] = string1;
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(10);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse15() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\f";
        choiceFormats[0] = string;
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(8);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse16() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        setField(numeratorFormat, "java.text.DecimalFormat", "symbols", symbols);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        String string = "\f\t";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2143)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse17() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "";
        choiceFormats[0] = string;
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse18() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[10];
        String string = "\u0000";
        choiceFormats[0] = string;
        String string1 = "";
        choiceFormats[1] = string1;
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1073741824);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse19() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000";
        choiceFormats[0] = string;
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse20() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        ChoiceFormat numeratorFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[2];
        String string = "  (          ";
        choiceFormats[0] = string;
        setField(numeratorFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(2);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse21() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000";
        symbols.setNaN(naN);
        setField(numeratorFormat, "java.text.DecimalFormat", "symbols", symbols);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1073741824);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2295)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(naN, parsePosition);
    }
    
    @Test
    public void testParse22() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "  `          ";
        symbols.setNaN(naN);
        setField(numeratorFormat, "java.text.DecimalFormat", "symbols", symbols);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(2);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2295)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(naN, parsePosition);
    }
    
    @Test
    public void testParse23() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat numeratorFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f";
        numeratorFormat.setPositivePrefix(positivePrefix);
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        symbols.setNaN(positivePrefix);
        setField(numeratorFormat, "java.text.DecimalFormat", "symbols", symbols);
        properFractionFormat.setNumeratorFormat(numeratorFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(10);
        
        /* This test fails because method [org.apache.commons.math.fraction.ProperFractionFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2297)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.fraction.FractionFormat.parse(FractionFormat.java:266)
            org.apache.commons.math.fraction.ProperFractionFormat.parse(ProperFractionFormat.java:132) */
        properFractionFormat.parse(positivePrefix, parsePosition);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.ProperFractionFormat.setWholeFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setWholeFormat(java.text.NumberFormat)
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#setWholeFormat(java.text.NumberFormat)}
 * @utbot.executesCondition {@code (format == null): False}
 *  */
    @Test
    public void testSetWholeFormat_FormatNotEqualsNull() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        DecimalFormat decimalFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        
        NumberFormat initialProperFractionFormatWholeFormat = ((NumberFormat) getFieldValue(properFractionFormat, "org.apache.commons.math.fraction.ProperFractionFormat", "wholeFormat"));
        
        properFractionFormat.setWholeFormat(decimalFormat);
        
        NumberFormat finalProperFractionFormatWholeFormat = ((NumberFormat) getFieldValue(properFractionFormat, "org.apache.commons.math.fraction.ProperFractionFormat", "wholeFormat"));
        
        assertFalse(initialProperFractionFormatWholeFormat == finalProperFractionFormatWholeFormat);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setWholeFormat(java.text.NumberFormat)
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#setWholeFormat(java.text.NumberFormat)}
 * @utbot.executesCondition {@code (format == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: format == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetWholeFormat_ThrowIllegalArgumentException() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        
        properFractionFormat.setWholeFormat(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.ProperFractionFormat.getWholeFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWholeFormat()
    
    /**
    @utbot.classUnderTest {@link ProperFractionFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.ProperFractionFormat#getWholeFormat()}
 * @utbot.returnsFrom {@code return wholeFormat;}
 *  */
    @Test
    public void testGetWholeFormat_ReturnWholeFormat() throws Exception  {
        ProperFractionFormat properFractionFormat = ((ProperFractionFormat) createInstance("org.apache.commons.math.fraction.ProperFractionFormat"));
        
        NumberFormat actual = properFractionFormat.getWholeFormat();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields789436427498600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields789436427498600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass789436427504800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields789436427498600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass789436427504800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields789436427960800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields789436427960800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass789436427963600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields789436427960800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass789436427963600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

