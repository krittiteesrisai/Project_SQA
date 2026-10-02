package org.apache.commons.math.complex;

import org.junit.Test;
import java.text.FieldPosition;
import java.lang.reflect.Method;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.ChoiceFormat;
import java.text.DecimalFormatSymbols;
import java.text.CompactNumberFormat;
import java.text.ParseException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_complex_ComplexFormatTest {
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.format
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (obj instanceof Complex): False}
 * @utbot.executesCondition {@code (obj instanceof Number): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: obj instanceof Number
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFormat_ThrowIllegalArgumentException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        complexFormat.format(((Object) null), ((StringBuffer) null), ((FieldPosition) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ret = format((Complex) obj, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, 0.0);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:212)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:144)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:180) */
        complexFormat.format(((Object) complex), ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ret = format((Complex) obj, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(-2.0000000000000004, 0.0);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:216)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:144)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:180) */
        complexFormat.format(((Object) complex), ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ret = format((Complex) obj, toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:212)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:144)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:180) */
        complexFormat.format(((Object) complex), ((StringBuffer) null), fieldPosition);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)
    
    @Test
    public void testFormat1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY, 0.0);
        StringBuffer stringBuffer = new StringBuffer("");
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        
        StringBuffer actual = complexFormat.format(((Object) complex), stringBuffer, fieldPosition);
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        value[0] = (byte) 40;
        value[1] = (byte) 73;
        value[2] = (byte) 110;
        value[3] = (byte) 102;
        value[4] = (byte) 105;
        value[5] = (byte) 110;
        value[6] = (byte) 105;
        value[7] = (byte) 116;
        value[8] = (byte) 121;
        value[9] = (byte) 41;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 10);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
    }
    
    @Test
    public void testFormat2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        StringBuffer stringBuffer = new StringBuffer("");
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        
        StringBuffer actual = complexFormat.format(((Object) complex), stringBuffer, fieldPosition);
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        value[0] = (byte) 40;
        value[1] = (byte) 78;
        value[2] = (byte) 97;
        value[3] = (byte) 78;
        value[4] = (byte) 41;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 5);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(org.apache.commons.math.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double re = complex.getReal();
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_11() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:143) */
        complexFormat.format(((Complex) null), ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pos.setBeginIndex(0);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:139) */
        complexFormat.format(((Complex) null), ((StringBuffer) null), ((FieldPosition) null));
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatDouble(re, getRealFormat(), toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_21() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:212)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:144) */
        complexFormat.format(complex, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatDouble(re, getRealFormat(), toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, 0.0);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:212)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:144) */
        complexFormat.format(complex, ((StringBuffer) null), fieldPosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#format(org.apache.commons.math.complex.Complex,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formatDouble(re, getRealFormat(), toAppendTo, pos);
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_4() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(-2.0000000000000004, 0.0);
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        fieldPosition.setEndIndex(-255);
        fieldPosition.setBeginIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:216)
            org.apache.commons.math.complex.ComplexFormat.format(ComplexFormat.java:144) */
        complexFormat.format(complex, ((StringBuffer) null), fieldPosition);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method format(org.apache.commons.math.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)
    
    @Test
    public void testFormat3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        StringBuffer stringBuffer = new StringBuffer("");
        Object dontCareFieldPosition = createInstance("java.text.DontCareFieldPosition");
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class complexType = Class.forName("org.apache.commons.math.complex.Complex");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class dontCareFieldPositionType = Class.forName("java.text.FieldPosition");
        Method formatMethod = complexFormatClazz.getDeclaredMethod("format", complexType, stringBufferType, dontCareFieldPositionType);
        formatMethod.setAccessible(true);
        java.lang.Object[] formatMethodArguments = new java.lang.Object[3];
        formatMethodArguments[0] = complex;
        formatMethodArguments[1] = stringBuffer;
        formatMethodArguments[2] = dontCareFieldPosition;
        StringBuffer actual = ((StringBuffer) formatMethod.invoke(complexFormat, formatMethodArguments));
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        value[0] = (byte) 40;
        value[1] = (byte) 78;
        value[2] = (byte) 97;
        value[3] = (byte) 78;
        value[4] = (byte) 41;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 5);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
    }
    
    @Test
    public void testFormat4() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, 0.0);
        StringBuffer stringBuffer = new StringBuffer("");
        FieldPosition fieldPosition = ((FieldPosition) createInstance("java.text.FieldPosition"));
        
        StringBuffer actual = complexFormat.format(complex, stringBuffer, fieldPosition);
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        value[0] = (byte) 40;
        value[1] = (byte) 45;
        value[2] = (byte) 73;
        value[3] = (byte) 110;
        value[4] = (byte) 102;
        value[5] = (byte) 105;
        value[6] = (byte) 110;
        value[7] = (byte) 105;
        value[8] = (byte) 116;
        value[9] = (byte) 121;
        value[10] = (byte) 41;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 11);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.getInstance
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance(java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.ComplexFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#getInstance(java.util.Locale)}
     */
    @Test
    public void testGetInstance() throws Exception  {
        Locale locale = new Locale("ab");
        
        ComplexFormat actual = ComplexFormat.getInstance(locale);
        
        ComplexFormat expected = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String imaginaryCharacter = "i";
        expected.setImaginaryCharacter(imaginaryCharacter);
        DecimalFormat imaginaryFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        expected.setImaginaryFormat(imaginaryFormat);
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        expected.setRealFormat(realFormat);
        
        String expectedImaginaryCharacter = expected.getImaginaryCharacter();
        String actualImaginaryCharacter = actual.getImaginaryCharacter();
        assertEquals(expectedImaginaryCharacter, actualImaginaryCharacter);
        
        NumberFormat expectedImaginaryFormat = expected.getImaginaryFormat();
        NumberFormat actualImaginaryFormat = actual.getImaginaryFormat();
        // java.text.NumberFormat has overridden equals method
        assertEquals(expectedImaginaryFormat, actualImaginaryFormat);
        
        NumberFormat expectedRealFormat = expected.getRealFormat();
        NumberFormat actualRealFormat = actual.getRealFormat();
        // java.text.NumberFormat has overridden equals method
        assertEquals(expectedRealFormat, actualRealFormat);
        
    }
    ///endregion
    
    ///region Errors report for getInstance
    
    public void testGetInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.getInstance
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstance()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.ComplexFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#getInstance()}
     */
    @Test
    public void testGetInstance1() throws Exception  {
        ComplexFormat actual = ComplexFormat.getInstance();
        
        ComplexFormat expected = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String imaginaryCharacter = "i";
        expected.setImaginaryCharacter(imaginaryCharacter);
        DecimalFormat imaginaryFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        expected.setImaginaryFormat(imaginaryFormat);
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        expected.setRealFormat(realFormat);
        
        String expectedImaginaryCharacter = expected.getImaginaryCharacter();
        String actualImaginaryCharacter = actual.getImaginaryCharacter();
        assertEquals(expectedImaginaryCharacter, actualImaginaryCharacter);
        
        NumberFormat expectedImaginaryFormat = expected.getImaginaryFormat();
        NumberFormat actualImaginaryFormat = actual.getImaginaryFormat();
        // java.text.NumberFormat has overridden equals method
        assertEquals(expectedImaginaryFormat, actualImaginaryFormat);
        
        NumberFormat expectedRealFormat = expected.getRealFormat();
        NumberFormat actualRealFormat = actual.getRealFormat();
        // java.text.NumberFormat has overridden equals method
        assertEquals(expectedRealFormat, actualRealFormat);
        
    }
    ///endregion
    
    ///region Errors report for getInstance
    
    public void testGetInstance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: parseAndIgnoreWhitespace(source, pos);
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:418)
            org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(ComplexFormat.java:399)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:324) */
        complexFormat.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseAndIgnoreWhitespace(source, pos);
 *  */
    @Test
    public void testParse_ThrowNullPointerException_1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:412)
            org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(ComplexFormat.java:399)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:324) */
        complexFormat.parse(null, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int initialIndex = pos.getIndex();
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:321) */
        complexFormat.parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number re = parseNumber(source, getRealFormat(), pos);
 *  */
    @Test
    public void testParse_ThrowNullPointerException_2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number re = parseNumber(source, getRealFormat(), pos);
 *  */
    @Test
    public void testParse_ThrowNullPointerException_3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\f";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParse1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1073741824);
        
        Complex actual = complexFormat.parse(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1073741823, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\f";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setErrorIndex(-255);
        
        Complex actual = complexFormat.parse(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(0, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(37);
        
        Complex actual = complexFormat.parse(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(37, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse4() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(10);
        
        Complex actual = complexFormat.parse(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(11, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse5() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\r\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Complex actual = complexFormat.parse(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse6() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\t\t";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Complex actual = complexFormat.parse(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParse7() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Complex actual = complexFormat.parse(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void testParse8() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = " ";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Complex actual = complexFormat.parse(naN, parsePosition);
        
        Complex expected = new Complex(java.lang.Double.NaN, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    
    @Test
    public void testParse9() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Complex actual = complexFormat.parse(naN, parsePosition);
        
        Complex expected = new Complex(java.lang.Double.NaN, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParse10() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse11() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "\t\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse12() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\r";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(30);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:439)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse13() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "\t\f";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2143)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse14() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1073741824);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse15() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\f";
        choiceFormats[0] = string;
        String string1 = "";
        choiceFormats[1] = string1;
        choiceFormats[2] = string1;
        choiceFormats[3] = string1;
        choiceFormats[4] = string1;
        choiceFormats[5] = string1;
        choiceFormats[6] = string1;
        choiceFormats[7] = string1;
        choiceFormats[8] = string1;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse16() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(37);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(string, parsePosition);
    }
    
    @Test
    public void testParse17() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\r\r";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2295)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(naN, parsePosition);
    }
    
    @Test
    public void testParse18() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "\u0000";
        realFormat.setPositivePrefix(positivePrefix);
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        symbols.setNaN(positivePrefix);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1073741824);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2297)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327) */
        complexFormat.parse(positivePrefix, parsePosition);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Complex result = parse(source, parsePosition);
 *  */
    @Test
    public void testParse_ThrowNullPointerException1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:412)
            org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(ComplexFormat.java:399)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:324)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(null);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Complex result = parse(source, parsePosition);
 *  */
    @Test
    public void testParse_ThrowNullPointerException_11() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Complex result = parse(source, parsePosition);
 *  */
    @Test
    public void testParse_ThrowNullPointerException_21() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "! ";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Complex result = parse(source, parsePosition);
 *  */
    @Test
    public void testParse_ThrowNullPointerException_31() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String)
    
    @Test
    public void testParse19() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\r";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        
        Complex actual = complexFormat.parse(naN);
        
        Complex expected = new Complex(java.lang.Double.NaN, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testParse20() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        
        Complex actual = complexFormat.parse(naN);
        
        Complex expected = new Complex(java.lang.Double.NaN, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testParse21() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000\u0000";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        
        Complex actual = complexFormat.parse(naN);
        
        Complex expected = new Complex(java.lang.Double.NaN, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String)
    
    @Test
    public void testParse22() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\n\r";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse23() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse24() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "! ";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse25() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "\r";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse26() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = " ! ";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse27() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = " ! ";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:439)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse28() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "!";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse29() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[10];
        String string = "";
        choiceFormats[0] = string;
        String string1 = "";
        choiceFormats[1] = string1;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse30() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse31() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\t";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse32() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string1 = "\f";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string1);
    }
    
    @Test
    public void testParse33() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string1 = "\t\t";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string1);
    }
    
    @Test
    public void testParse34() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {null};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\t\n";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse35() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse36() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse37() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string1 = "\u0000";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string1);
    }
    
    @Test
    public void testParse38() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        java.lang.String[] compactPatterns = {null, null, null, null, null, null, null, null, null};
        setField(realFormat, "java.text.CompactNumberFormat", "compactPatterns", compactPatterns);
        complexFormat.setRealFormat(realFormat);
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1469)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse39() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\t\t";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2295)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(naN);
    }
    
    @Test
    public void testParse40() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        String string = " \u0000\u0000";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2143)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse41() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        realFormat.setPositivePrefix(positivePrefix);
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        symbols.setNaN(positivePrefix);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        String string = "";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2297)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse42() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        realFormat.setPositivePrefix(positivePrefix);
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        symbols.setNaN(positivePrefix);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2297)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    
    @Test
    public void testParse43() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "\u0000\u0000";
        realFormat.setPositivePrefix(positivePrefix);
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        symbols.setNaN(positivePrefix);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parse] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2297)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:305) */
        complexFormat.parse(string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method parse(java.lang.String)
    
    @Test(expected = ParseException.class)
    public void testParse44() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = " ";
        
        complexFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse45() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\t\u0000";
        
        complexFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse46() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\t\t";
        
        complexFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse47() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "";
        
        complexFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse48() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "!";
        
        complexFormat.parse(string);
    }
    
    @Test(expected = ParseException.class)
    public void testParse49() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000";
        
        complexFormat.parse(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.getAvailableLocales
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getAvailableLocales()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.ComplexFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#getAvailableLocales()}
     */
    @Test
    public void testGetAvailableLocales() throws Exception  {
    /* This block of code is 2041 lines long and could lead to compilation error
        java.util.Locale[] actual = ComplexFormat.getAvailableLocales();
        
        java.util.Locale[] expected = new java.util.Locale[1017];
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        expected[0] = locale;
        Locale locale1 = ((Locale) createInstance("java.util.Locale"));
        expected[1] = locale1;
        Locale locale2 = ((Locale) createInstance("java.util.Locale"));
        expected[2] = locale2;
        Locale locale3 = ((Locale) createInstance("java.util.Locale"));
        expected[3] = locale3;
        Locale locale4 = ((Locale) createInstance("java.util.Locale"));
        expected[4] = locale4;
        Locale locale5 = ((Locale) createInstance("java.util.Locale"));
        expected[5] = locale5;
        Locale locale6 = ((Locale) createInstance("java.util.Locale"));
        expected[6] = locale6;
        Locale locale7 = ((Locale) createInstance("java.util.Locale"));
        expected[7] = locale7;
        Locale locale8 = ((Locale) createInstance("java.util.Locale"));
        expected[8] = locale8;
        Locale locale9 = ((Locale) createInstance("java.util.Locale"));
        expected[9] = locale9;
        Locale locale10 = ((Locale) createInstance("java.util.Locale"));
        expected[10] = locale10;
        Locale locale11 = ((Locale) createInstance("java.util.Locale"));
        expected[11] = locale11;
        Locale locale12 = ((Locale) createInstance("java.util.Locale"));
        expected[12] = locale12;
        Locale locale13 = ((Locale) createInstance("java.util.Locale"));
        expected[13] = locale13;
        Locale locale14 = ((Locale) createInstance("java.util.Locale"));
        expected[14] = locale14;
        Locale locale15 = ((Locale) createInstance("java.util.Locale"));
        expected[15] = locale15;
        Locale locale16 = ((Locale) createInstance("java.util.Locale"));
        expected[16] = locale16;
        Locale locale17 = ((Locale) createInstance("java.util.Locale"));
        expected[17] = locale17;
        Locale locale18 = ((Locale) createInstance("java.util.Locale"));
        expected[18] = locale18;
        Locale locale19 = ((Locale) createInstance("java.util.Locale"));
        expected[19] = locale19;
        Locale locale20 = ((Locale) createInstance("java.util.Locale"));
        expected[20] = locale20;
        Locale locale21 = ((Locale) createInstance("java.util.Locale"));
        expected[21] = locale21;
        Locale locale22 = ((Locale) createInstance("java.util.Locale"));
        expected[22] = locale22;
        Locale locale23 = ((Locale) createInstance("java.util.Locale"));
        expected[23] = locale23;
        Locale locale24 = ((Locale) createInstance("java.util.Locale"));
        expected[24] = locale24;
        Locale locale25 = ((Locale) createInstance("java.util.Locale"));
        expected[25] = locale25;
        Locale locale26 = ((Locale) createInstance("java.util.Locale"));
        expected[26] = locale26;
        Locale locale27 = ((Locale) createInstance("java.util.Locale"));
        expected[27] = locale27;
        Locale locale28 = ((Locale) createInstance("java.util.Locale"));
        expected[28] = locale28;
        Locale locale29 = ((Locale) createInstance("java.util.Locale"));
        expected[29] = locale29;
        Locale locale30 = ((Locale) createInstance("java.util.Locale"));
        expected[30] = locale30;
        Locale locale31 = ((Locale) createInstance("java.util.Locale"));
        expected[31] = locale31;
        Locale locale32 = ((Locale) createInstance("java.util.Locale"));
        expected[32] = locale32;
        Locale locale33 = ((Locale) createInstance("java.util.Locale"));
        expected[33] = locale33;
        Locale locale34 = ((Locale) createInstance("java.util.Locale"));
        expected[34] = locale34;
        Locale locale35 = ((Locale) createInstance("java.util.Locale"));
        expected[35] = locale35;
        Locale locale36 = ((Locale) createInstance("java.util.Locale"));
        expected[36] = locale36;
        Locale locale37 = ((Locale) createInstance("java.util.Locale"));
        expected[37] = locale37;
        Locale locale38 = ((Locale) createInstance("java.util.Locale"));
        expected[38] = locale38;
        Locale locale39 = ((Locale) createInstance("java.util.Locale"));
        expected[39] = locale39;
        Locale locale40 = ((Locale) createInstance("java.util.Locale"));
        expected[40] = locale40;
        Locale locale41 = ((Locale) createInstance("java.util.Locale"));
        expected[41] = locale41;
        Locale locale42 = ((Locale) createInstance("java.util.Locale"));
        expected[42] = locale42;
        Locale locale43 = ((Locale) createInstance("java.util.Locale"));
        expected[43] = locale43;
        Locale locale44 = ((Locale) createInstance("java.util.Locale"));
        expected[44] = locale44;
        Locale locale45 = ((Locale) createInstance("java.util.Locale"));
        expected[45] = locale45;
        Locale locale46 = ((Locale) createInstance("java.util.Locale"));
        expected[46] = locale46;
        Locale locale47 = ((Locale) createInstance("java.util.Locale"));
        expected[47] = locale47;
        Locale locale48 = ((Locale) createInstance("java.util.Locale"));
        expected[48] = locale48;
        Locale locale49 = ((Locale) createInstance("java.util.Locale"));
        expected[49] = locale49;
        Locale locale50 = ((Locale) createInstance("java.util.Locale"));
        expected[50] = locale50;
        Locale locale51 = ((Locale) createInstance("java.util.Locale"));
        expected[51] = locale51;
        Locale locale52 = ((Locale) createInstance("java.util.Locale"));
        expected[52] = locale52;
        Locale locale53 = ((Locale) createInstance("java.util.Locale"));
        expected[53] = locale53;
        Locale locale54 = ((Locale) createInstance("java.util.Locale"));
        expected[54] = locale54;
        Locale locale55 = ((Locale) createInstance("java.util.Locale"));
        expected[55] = locale55;
        Locale locale56 = ((Locale) createInstance("java.util.Locale"));
        expected[56] = locale56;
        Locale locale57 = ((Locale) createInstance("java.util.Locale"));
        expected[57] = locale57;
        Locale locale58 = ((Locale) createInstance("java.util.Locale"));
        expected[58] = locale58;
        Locale locale59 = ((Locale) createInstance("java.util.Locale"));
        expected[59] = locale59;
        Locale locale60 = ((Locale) createInstance("java.util.Locale"));
        expected[60] = locale60;
        Locale locale61 = ((Locale) createInstance("java.util.Locale"));
        expected[61] = locale61;
        Locale locale62 = ((Locale) createInstance("java.util.Locale"));
        expected[62] = locale62;
        Locale locale63 = ((Locale) createInstance("java.util.Locale"));
        expected[63] = locale63;
        Locale locale64 = ((Locale) createInstance("java.util.Locale"));
        expected[64] = locale64;
        Locale locale65 = ((Locale) createInstance("java.util.Locale"));
        expected[65] = locale65;
        Locale locale66 = ((Locale) createInstance("java.util.Locale"));
        expected[66] = locale66;
        Locale locale67 = ((Locale) createInstance("java.util.Locale"));
        expected[67] = locale67;
        Locale locale68 = ((Locale) createInstance("java.util.Locale"));
        expected[68] = locale68;
        Locale locale69 = ((Locale) createInstance("java.util.Locale"));
        expected[69] = locale69;
        Locale locale70 = ((Locale) createInstance("java.util.Locale"));
        expected[70] = locale70;
        Locale locale71 = ((Locale) createInstance("java.util.Locale"));
        expected[71] = locale71;
        Locale locale72 = ((Locale) createInstance("java.util.Locale"));
        expected[72] = locale72;
        Locale locale73 = ((Locale) createInstance("java.util.Locale"));
        expected[73] = locale73;
        Locale locale74 = ((Locale) createInstance("java.util.Locale"));
        expected[74] = locale74;
        Locale locale75 = ((Locale) createInstance("java.util.Locale"));
        expected[75] = locale75;
        Locale locale76 = ((Locale) createInstance("java.util.Locale"));
        expected[76] = locale76;
        Locale locale77 = ((Locale) createInstance("java.util.Locale"));
        expected[77] = locale77;
        Locale locale78 = ((Locale) createInstance("java.util.Locale"));
        expected[78] = locale78;
        Locale locale79 = ((Locale) createInstance("java.util.Locale"));
        expected[79] = locale79;
        Locale locale80 = ((Locale) createInstance("java.util.Locale"));
        expected[80] = locale80;
        Locale locale81 = ((Locale) createInstance("java.util.Locale"));
        expected[81] = locale81;
        Locale locale82 = ((Locale) createInstance("java.util.Locale"));
        expected[82] = locale82;
        Locale locale83 = ((Locale) createInstance("java.util.Locale"));
        expected[83] = locale83;
        Locale locale84 = ((Locale) createInstance("java.util.Locale"));
        expected[84] = locale84;
        Locale locale85 = ((Locale) createInstance("java.util.Locale"));
        expected[85] = locale85;
        Locale locale86 = ((Locale) createInstance("java.util.Locale"));
        expected[86] = locale86;
        Locale locale87 = ((Locale) createInstance("java.util.Locale"));
        expected[87] = locale87;
        Locale locale88 = ((Locale) createInstance("java.util.Locale"));
        expected[88] = locale88;
        Locale locale89 = ((Locale) createInstance("java.util.Locale"));
        expected[89] = locale89;
        Locale locale90 = ((Locale) createInstance("java.util.Locale"));
        expected[90] = locale90;
        Locale locale91 = ((Locale) createInstance("java.util.Locale"));
        expected[91] = locale91;
        Locale locale92 = ((Locale) createInstance("java.util.Locale"));
        expected[92] = locale92;
        Locale locale93 = ((Locale) createInstance("java.util.Locale"));
        expected[93] = locale93;
        Locale locale94 = ((Locale) createInstance("java.util.Locale"));
        expected[94] = locale94;
        Locale locale95 = ((Locale) createInstance("java.util.Locale"));
        expected[95] = locale95;
        Locale locale96 = ((Locale) createInstance("java.util.Locale"));
        expected[96] = locale96;
        Locale locale97 = ((Locale) createInstance("java.util.Locale"));
        expected[97] = locale97;
        Locale locale98 = ((Locale) createInstance("java.util.Locale"));
        expected[98] = locale98;
        Locale locale99 = ((Locale) createInstance("java.util.Locale"));
        expected[99] = locale99;
        Locale locale100 = ((Locale) createInstance("java.util.Locale"));
        expected[100] = locale100;
        Locale locale101 = ((Locale) createInstance("java.util.Locale"));
        expected[101] = locale101;
        Locale locale102 = ((Locale) createInstance("java.util.Locale"));
        expected[102] = locale102;
        Locale locale103 = ((Locale) createInstance("java.util.Locale"));
        expected[103] = locale103;
        Locale locale104 = ((Locale) createInstance("java.util.Locale"));
        expected[104] = locale104;
        Locale locale105 = ((Locale) createInstance("java.util.Locale"));
        expected[105] = locale105;
        Locale locale106 = ((Locale) createInstance("java.util.Locale"));
        expected[106] = locale106;
        Locale locale107 = ((Locale) createInstance("java.util.Locale"));
        expected[107] = locale107;
        Locale locale108 = ((Locale) createInstance("java.util.Locale"));
        expected[108] = locale108;
        Locale locale109 = ((Locale) createInstance("java.util.Locale"));
        expected[109] = locale109;
        Locale locale110 = ((Locale) createInstance("java.util.Locale"));
        expected[110] = locale110;
        Locale locale111 = ((Locale) createInstance("java.util.Locale"));
        expected[111] = locale111;
        Locale locale112 = ((Locale) createInstance("java.util.Locale"));
        expected[112] = locale112;
        Locale locale113 = ((Locale) createInstance("java.util.Locale"));
        expected[113] = locale113;
        Locale locale114 = ((Locale) createInstance("java.util.Locale"));
        expected[114] = locale114;
        Locale locale115 = ((Locale) createInstance("java.util.Locale"));
        expected[115] = locale115;
        Locale locale116 = ((Locale) createInstance("java.util.Locale"));
        expected[116] = locale116;
        Locale locale117 = ((Locale) createInstance("java.util.Locale"));
        expected[117] = locale117;
        Locale locale118 = ((Locale) createInstance("java.util.Locale"));
        expected[118] = locale118;
        Locale locale119 = ((Locale) createInstance("java.util.Locale"));
        expected[119] = locale119;
        Locale locale120 = ((Locale) createInstance("java.util.Locale"));
        expected[120] = locale120;
        Locale locale121 = ((Locale) createInstance("java.util.Locale"));
        expected[121] = locale121;
        Locale locale122 = ((Locale) createInstance("java.util.Locale"));
        expected[122] = locale122;
        Locale locale123 = ((Locale) createInstance("java.util.Locale"));
        expected[123] = locale123;
        Locale locale124 = ((Locale) createInstance("java.util.Locale"));
        expected[124] = locale124;
        Locale locale125 = ((Locale) createInstance("java.util.Locale"));
        expected[125] = locale125;
        Locale locale126 = ((Locale) createInstance("java.util.Locale"));
        expected[126] = locale126;
        Locale locale127 = ((Locale) createInstance("java.util.Locale"));
        expected[127] = locale127;
        Locale locale128 = ((Locale) createInstance("java.util.Locale"));
        expected[128] = locale128;
        Locale locale129 = ((Locale) createInstance("java.util.Locale"));
        expected[129] = locale129;
        Locale locale130 = ((Locale) createInstance("java.util.Locale"));
        expected[130] = locale130;
        Locale locale131 = ((Locale) createInstance("java.util.Locale"));
        expected[131] = locale131;
        Locale locale132 = ((Locale) createInstance("java.util.Locale"));
        expected[132] = locale132;
        Locale locale133 = ((Locale) createInstance("java.util.Locale"));
        expected[133] = locale133;
        Locale locale134 = ((Locale) createInstance("java.util.Locale"));
        expected[134] = locale134;
        Locale locale135 = ((Locale) createInstance("java.util.Locale"));
        expected[135] = locale135;
        Locale locale136 = ((Locale) createInstance("java.util.Locale"));
        expected[136] = locale136;
        Locale locale137 = ((Locale) createInstance("java.util.Locale"));
        expected[137] = locale137;
        Locale locale138 = ((Locale) createInstance("java.util.Locale"));
        expected[138] = locale138;
        Locale locale139 = ((Locale) createInstance("java.util.Locale"));
        expected[139] = locale139;
        Locale locale140 = ((Locale) createInstance("java.util.Locale"));
        expected[140] = locale140;
        Locale locale141 = ((Locale) createInstance("java.util.Locale"));
        expected[141] = locale141;
        Locale locale142 = ((Locale) createInstance("java.util.Locale"));
        expected[142] = locale142;
        Locale locale143 = ((Locale) createInstance("java.util.Locale"));
        expected[143] = locale143;
        Locale locale144 = ((Locale) createInstance("java.util.Locale"));
        expected[144] = locale144;
        Locale locale145 = ((Locale) createInstance("java.util.Locale"));
        expected[145] = locale145;
        Locale locale146 = ((Locale) createInstance("java.util.Locale"));
        expected[146] = locale146;
        Locale locale147 = ((Locale) createInstance("java.util.Locale"));
        expected[147] = locale147;
        Locale locale148 = ((Locale) createInstance("java.util.Locale"));
        expected[148] = locale148;
        Locale locale149 = ((Locale) createInstance("java.util.Locale"));
        expected[149] = locale149;
        Locale locale150 = ((Locale) createInstance("java.util.Locale"));
        expected[150] = locale150;
        Locale locale151 = ((Locale) createInstance("java.util.Locale"));
        expected[151] = locale151;
        Locale locale152 = ((Locale) createInstance("java.util.Locale"));
        expected[152] = locale152;
        Locale locale153 = ((Locale) createInstance("java.util.Locale"));
        expected[153] = locale153;
        Locale locale154 = ((Locale) createInstance("java.util.Locale"));
        expected[154] = locale154;
        Locale locale155 = ((Locale) createInstance("java.util.Locale"));
        expected[155] = locale155;
        Locale locale156 = ((Locale) createInstance("java.util.Locale"));
        expected[156] = locale156;
        Locale locale157 = ((Locale) createInstance("java.util.Locale"));
        expected[157] = locale157;
        Locale locale158 = ((Locale) createInstance("java.util.Locale"));
        expected[158] = locale158;
        Locale locale159 = ((Locale) createInstance("java.util.Locale"));
        expected[159] = locale159;
        Locale locale160 = ((Locale) createInstance("java.util.Locale"));
        expected[160] = locale160;
        Locale locale161 = ((Locale) createInstance("java.util.Locale"));
        expected[161] = locale161;
        Locale locale162 = ((Locale) createInstance("java.util.Locale"));
        expected[162] = locale162;
        Locale locale163 = ((Locale) createInstance("java.util.Locale"));
        expected[163] = locale163;
        Locale locale164 = ((Locale) createInstance("java.util.Locale"));
        expected[164] = locale164;
        Locale locale165 = ((Locale) createInstance("java.util.Locale"));
        expected[165] = locale165;
        Locale locale166 = ((Locale) createInstance("java.util.Locale"));
        expected[166] = locale166;
        Locale locale167 = ((Locale) createInstance("java.util.Locale"));
        expected[167] = locale167;
        Locale locale168 = ((Locale) createInstance("java.util.Locale"));
        expected[168] = locale168;
        Locale locale169 = ((Locale) createInstance("java.util.Locale"));
        expected[169] = locale169;
        Locale locale170 = ((Locale) createInstance("java.util.Locale"));
        expected[170] = locale170;
        Locale locale171 = ((Locale) createInstance("java.util.Locale"));
        expected[171] = locale171;
        Locale locale172 = ((Locale) createInstance("java.util.Locale"));
        expected[172] = locale172;
        Locale locale173 = ((Locale) createInstance("java.util.Locale"));
        expected[173] = locale173;
        Locale locale174 = ((Locale) createInstance("java.util.Locale"));
        expected[174] = locale174;
        Locale locale175 = ((Locale) createInstance("java.util.Locale"));
        expected[175] = locale175;
        Locale locale176 = ((Locale) createInstance("java.util.Locale"));
        expected[176] = locale176;
        Locale locale177 = ((Locale) createInstance("java.util.Locale"));
        expected[177] = locale177;
        Locale locale178 = ((Locale) createInstance("java.util.Locale"));
        expected[178] = locale178;
        Locale locale179 = ((Locale) createInstance("java.util.Locale"));
        expected[179] = locale179;
        Locale locale180 = ((Locale) createInstance("java.util.Locale"));
        expected[180] = locale180;
        Locale locale181 = ((Locale) createInstance("java.util.Locale"));
        expected[181] = locale181;
        Locale locale182 = ((Locale) createInstance("java.util.Locale"));
        expected[182] = locale182;
        Locale locale183 = ((Locale) createInstance("java.util.Locale"));
        expected[183] = locale183;
        Locale locale184 = ((Locale) createInstance("java.util.Locale"));
        expected[184] = locale184;
        Locale locale185 = ((Locale) createInstance("java.util.Locale"));
        expected[185] = locale185;
        Locale locale186 = ((Locale) createInstance("java.util.Locale"));
        expected[186] = locale186;
        Locale locale187 = ((Locale) createInstance("java.util.Locale"));
        expected[187] = locale187;
        Locale locale188 = ((Locale) createInstance("java.util.Locale"));
        expected[188] = locale188;
        Locale locale189 = ((Locale) createInstance("java.util.Locale"));
        expected[189] = locale189;
        Locale locale190 = ((Locale) createInstance("java.util.Locale"));
        expected[190] = locale190;
        Locale locale191 = ((Locale) createInstance("java.util.Locale"));
        expected[191] = locale191;
        Locale locale192 = ((Locale) createInstance("java.util.Locale"));
        expected[192] = locale192;
        Locale locale193 = ((Locale) createInstance("java.util.Locale"));
        expected[193] = locale193;
        Locale locale194 = ((Locale) createInstance("java.util.Locale"));
        expected[194] = locale194;
        Locale locale195 = ((Locale) createInstance("java.util.Locale"));
        expected[195] = locale195;
        Locale locale196 = ((Locale) createInstance("java.util.Locale"));
        expected[196] = locale196;
        Locale locale197 = ((Locale) createInstance("java.util.Locale"));
        expected[197] = locale197;
        Locale locale198 = ((Locale) createInstance("java.util.Locale"));
        expected[198] = locale198;
        Locale locale199 = ((Locale) createInstance("java.util.Locale"));
        expected[199] = locale199;
        Locale locale200 = ((Locale) createInstance("java.util.Locale"));
        expected[200] = locale200;
        Locale locale201 = ((Locale) createInstance("java.util.Locale"));
        expected[201] = locale201;
        Locale locale202 = ((Locale) createInstance("java.util.Locale"));
        expected[202] = locale202;
        Locale locale203 = ((Locale) createInstance("java.util.Locale"));
        expected[203] = locale203;
        Locale locale204 = ((Locale) createInstance("java.util.Locale"));
        expected[204] = locale204;
        Locale locale205 = ((Locale) createInstance("java.util.Locale"));
        expected[205] = locale205;
        Locale locale206 = ((Locale) createInstance("java.util.Locale"));
        expected[206] = locale206;
        Locale locale207 = ((Locale) createInstance("java.util.Locale"));
        expected[207] = locale207;
        Locale locale208 = ((Locale) createInstance("java.util.Locale"));
        expected[208] = locale208;
        Locale locale209 = ((Locale) createInstance("java.util.Locale"));
        expected[209] = locale209;
        Locale locale210 = ((Locale) createInstance("java.util.Locale"));
        expected[210] = locale210;
        Locale locale211 = ((Locale) createInstance("java.util.Locale"));
        expected[211] = locale211;
        Locale locale212 = ((Locale) createInstance("java.util.Locale"));
        expected[212] = locale212;
        Locale locale213 = ((Locale) createInstance("java.util.Locale"));
        expected[213] = locale213;
        Locale locale214 = ((Locale) createInstance("java.util.Locale"));
        expected[214] = locale214;
        Locale locale215 = ((Locale) createInstance("java.util.Locale"));
        expected[215] = locale215;
        Locale locale216 = ((Locale) createInstance("java.util.Locale"));
        expected[216] = locale216;
        Locale locale217 = ((Locale) createInstance("java.util.Locale"));
        expected[217] = locale217;
        Locale locale218 = ((Locale) createInstance("java.util.Locale"));
        expected[218] = locale218;
        Locale locale219 = ((Locale) createInstance("java.util.Locale"));
        expected[219] = locale219;
        Locale locale220 = ((Locale) createInstance("java.util.Locale"));
        expected[220] = locale220;
        Locale locale221 = ((Locale) createInstance("java.util.Locale"));
        expected[221] = locale221;
        Locale locale222 = ((Locale) createInstance("java.util.Locale"));
        expected[222] = locale222;
        Locale locale223 = ((Locale) createInstance("java.util.Locale"));
        expected[223] = locale223;
        Locale locale224 = ((Locale) createInstance("java.util.Locale"));
        expected[224] = locale224;
        Locale locale225 = ((Locale) createInstance("java.util.Locale"));
        expected[225] = locale225;
        Locale locale226 = ((Locale) createInstance("java.util.Locale"));
        expected[226] = locale226;
        Locale locale227 = ((Locale) createInstance("java.util.Locale"));
        expected[227] = locale227;
        Locale locale228 = ((Locale) createInstance("java.util.Locale"));
        expected[228] = locale228;
        Locale locale229 = ((Locale) createInstance("java.util.Locale"));
        expected[229] = locale229;
        Locale locale230 = ((Locale) createInstance("java.util.Locale"));
        expected[230] = locale230;
        Locale locale231 = ((Locale) createInstance("java.util.Locale"));
        expected[231] = locale231;
        Locale locale232 = ((Locale) createInstance("java.util.Locale"));
        expected[232] = locale232;
        Locale locale233 = ((Locale) createInstance("java.util.Locale"));
        expected[233] = locale233;
        Locale locale234 = ((Locale) createInstance("java.util.Locale"));
        expected[234] = locale234;
        Locale locale235 = ((Locale) createInstance("java.util.Locale"));
        expected[235] = locale235;
        Locale locale236 = ((Locale) createInstance("java.util.Locale"));
        expected[236] = locale236;
        Locale locale237 = ((Locale) createInstance("java.util.Locale"));
        expected[237] = locale237;
        Locale locale238 = ((Locale) createInstance("java.util.Locale"));
        expected[238] = locale238;
        Locale locale239 = ((Locale) createInstance("java.util.Locale"));
        expected[239] = locale239;
        Locale locale240 = ((Locale) createInstance("java.util.Locale"));
        expected[240] = locale240;
        Locale locale241 = ((Locale) createInstance("java.util.Locale"));
        expected[241] = locale241;
        Locale locale242 = ((Locale) createInstance("java.util.Locale"));
        expected[242] = locale242;
        Locale locale243 = ((Locale) createInstance("java.util.Locale"));
        expected[243] = locale243;
        Locale locale244 = ((Locale) createInstance("java.util.Locale"));
        expected[244] = locale244;
        Locale locale245 = ((Locale) createInstance("java.util.Locale"));
        expected[245] = locale245;
        Locale locale246 = ((Locale) createInstance("java.util.Locale"));
        expected[246] = locale246;
        Locale locale247 = ((Locale) createInstance("java.util.Locale"));
        expected[247] = locale247;
        Locale locale248 = ((Locale) createInstance("java.util.Locale"));
        expected[248] = locale248;
        Locale locale249 = ((Locale) createInstance("java.util.Locale"));
        expected[249] = locale249;
        Locale locale250 = ((Locale) createInstance("java.util.Locale"));
        expected[250] = locale250;
        Locale locale251 = ((Locale) createInstance("java.util.Locale"));
        expected[251] = locale251;
        Locale locale252 = ((Locale) createInstance("java.util.Locale"));
        expected[252] = locale252;
        Locale locale253 = ((Locale) createInstance("java.util.Locale"));
        expected[253] = locale253;
        Locale locale254 = ((Locale) createInstance("java.util.Locale"));
        expected[254] = locale254;
        Locale locale255 = ((Locale) createInstance("java.util.Locale"));
        expected[255] = locale255;
        Locale locale256 = ((Locale) createInstance("java.util.Locale"));
        expected[256] = locale256;
        Locale locale257 = ((Locale) createInstance("java.util.Locale"));
        expected[257] = locale257;
        Locale locale258 = ((Locale) createInstance("java.util.Locale"));
        expected[258] = locale258;
        Locale locale259 = ((Locale) createInstance("java.util.Locale"));
        expected[259] = locale259;
        Locale locale260 = ((Locale) createInstance("java.util.Locale"));
        expected[260] = locale260;
        Locale locale261 = ((Locale) createInstance("java.util.Locale"));
        expected[261] = locale261;
        Locale locale262 = ((Locale) createInstance("java.util.Locale"));
        expected[262] = locale262;
        Locale locale263 = ((Locale) createInstance("java.util.Locale"));
        expected[263] = locale263;
        Locale locale264 = ((Locale) createInstance("java.util.Locale"));
        expected[264] = locale264;
        Locale locale265 = ((Locale) createInstance("java.util.Locale"));
        expected[265] = locale265;
        Locale locale266 = ((Locale) createInstance("java.util.Locale"));
        expected[266] = locale266;
        Locale locale267 = ((Locale) createInstance("java.util.Locale"));
        expected[267] = locale267;
        Locale locale268 = ((Locale) createInstance("java.util.Locale"));
        expected[268] = locale268;
        Locale locale269 = ((Locale) createInstance("java.util.Locale"));
        expected[269] = locale269;
        Locale locale270 = ((Locale) createInstance("java.util.Locale"));
        expected[270] = locale270;
        Locale locale271 = ((Locale) createInstance("java.util.Locale"));
        expected[271] = locale271;
        Locale locale272 = ((Locale) createInstance("java.util.Locale"));
        expected[272] = locale272;
        Locale locale273 = ((Locale) createInstance("java.util.Locale"));
        expected[273] = locale273;
        Locale locale274 = ((Locale) createInstance("java.util.Locale"));
        expected[274] = locale274;
        Locale locale275 = ((Locale) createInstance("java.util.Locale"));
        expected[275] = locale275;
        Locale locale276 = ((Locale) createInstance("java.util.Locale"));
        expected[276] = locale276;
        Locale locale277 = ((Locale) createInstance("java.util.Locale"));
        expected[277] = locale277;
        Locale locale278 = ((Locale) createInstance("java.util.Locale"));
        expected[278] = locale278;
        Locale locale279 = ((Locale) createInstance("java.util.Locale"));
        expected[279] = locale279;
        Locale locale280 = ((Locale) createInstance("java.util.Locale"));
        expected[280] = locale280;
        Locale locale281 = ((Locale) createInstance("java.util.Locale"));
        expected[281] = locale281;
        Locale locale282 = ((Locale) createInstance("java.util.Locale"));
        expected[282] = locale282;
        Locale locale283 = ((Locale) createInstance("java.util.Locale"));
        expected[283] = locale283;
        Locale locale284 = ((Locale) createInstance("java.util.Locale"));
        expected[284] = locale284;
        Locale locale285 = ((Locale) createInstance("java.util.Locale"));
        expected[285] = locale285;
        Locale locale286 = ((Locale) createInstance("java.util.Locale"));
        expected[286] = locale286;
        Locale locale287 = ((Locale) createInstance("java.util.Locale"));
        expected[287] = locale287;
        Locale locale288 = ((Locale) createInstance("java.util.Locale"));
        expected[288] = locale288;
        Locale locale289 = ((Locale) createInstance("java.util.Locale"));
        expected[289] = locale289;
        Locale locale290 = ((Locale) createInstance("java.util.Locale"));
        expected[290] = locale290;
        Locale locale291 = ((Locale) createInstance("java.util.Locale"));
        expected[291] = locale291;
        Locale locale292 = ((Locale) createInstance("java.util.Locale"));
        expected[292] = locale292;
        Locale locale293 = ((Locale) createInstance("java.util.Locale"));
        expected[293] = locale293;
        Locale locale294 = ((Locale) createInstance("java.util.Locale"));
        expected[294] = locale294;
        Locale locale295 = ((Locale) createInstance("java.util.Locale"));
        expected[295] = locale295;
        Locale locale296 = ((Locale) createInstance("java.util.Locale"));
        expected[296] = locale296;
        Locale locale297 = ((Locale) createInstance("java.util.Locale"));
        expected[297] = locale297;
        Locale locale298 = ((Locale) createInstance("java.util.Locale"));
        expected[298] = locale298;
        Locale locale299 = ((Locale) createInstance("java.util.Locale"));
        expected[299] = locale299;
        Locale locale300 = ((Locale) createInstance("java.util.Locale"));
        expected[300] = locale300;
        Locale locale301 = ((Locale) createInstance("java.util.Locale"));
        expected[301] = locale301;
        Locale locale302 = ((Locale) createInstance("java.util.Locale"));
        expected[302] = locale302;
        Locale locale303 = ((Locale) createInstance("java.util.Locale"));
        expected[303] = locale303;
        Locale locale304 = ((Locale) createInstance("java.util.Locale"));
        expected[304] = locale304;
        Locale locale305 = ((Locale) createInstance("java.util.Locale"));
        expected[305] = locale305;
        Locale locale306 = ((Locale) createInstance("java.util.Locale"));
        expected[306] = locale306;
        Locale locale307 = ((Locale) createInstance("java.util.Locale"));
        expected[307] = locale307;
        Locale locale308 = ((Locale) createInstance("java.util.Locale"));
        expected[308] = locale308;
        Locale locale309 = ((Locale) createInstance("java.util.Locale"));
        expected[309] = locale309;
        Locale locale310 = ((Locale) createInstance("java.util.Locale"));
        expected[310] = locale310;
        Locale locale311 = ((Locale) createInstance("java.util.Locale"));
        expected[311] = locale311;
        Locale locale312 = ((Locale) createInstance("java.util.Locale"));
        expected[312] = locale312;
        Locale locale313 = ((Locale) createInstance("java.util.Locale"));
        expected[313] = locale313;
        Locale locale314 = ((Locale) createInstance("java.util.Locale"));
        expected[314] = locale314;
        Locale locale315 = ((Locale) createInstance("java.util.Locale"));
        expected[315] = locale315;
        Locale locale316 = ((Locale) createInstance("java.util.Locale"));
        expected[316] = locale316;
        Locale locale317 = ((Locale) createInstance("java.util.Locale"));
        expected[317] = locale317;
        Locale locale318 = ((Locale) createInstance("java.util.Locale"));
        expected[318] = locale318;
        Locale locale319 = ((Locale) createInstance("java.util.Locale"));
        expected[319] = locale319;
        Locale locale320 = ((Locale) createInstance("java.util.Locale"));
        expected[320] = locale320;
        Locale locale321 = ((Locale) createInstance("java.util.Locale"));
        expected[321] = locale321;
        Locale locale322 = ((Locale) createInstance("java.util.Locale"));
        expected[322] = locale322;
        Locale locale323 = ((Locale) createInstance("java.util.Locale"));
        expected[323] = locale323;
        Locale locale324 = ((Locale) createInstance("java.util.Locale"));
        expected[324] = locale324;
        Locale locale325 = ((Locale) createInstance("java.util.Locale"));
        expected[325] = locale325;
        Locale locale326 = ((Locale) createInstance("java.util.Locale"));
        expected[326] = locale326;
        Locale locale327 = ((Locale) createInstance("java.util.Locale"));
        expected[327] = locale327;
        Locale locale328 = ((Locale) createInstance("java.util.Locale"));
        expected[328] = locale328;
        Locale locale329 = ((Locale) createInstance("java.util.Locale"));
        expected[329] = locale329;
        Locale locale330 = ((Locale) createInstance("java.util.Locale"));
        expected[330] = locale330;
        Locale locale331 = ((Locale) createInstance("java.util.Locale"));
        expected[331] = locale331;
        Locale locale332 = ((Locale) createInstance("java.util.Locale"));
        expected[332] = locale332;
        Locale locale333 = ((Locale) createInstance("java.util.Locale"));
        expected[333] = locale333;
        Locale locale334 = ((Locale) createInstance("java.util.Locale"));
        expected[334] = locale334;
        Locale locale335 = ((Locale) createInstance("java.util.Locale"));
        expected[335] = locale335;
        Locale locale336 = ((Locale) createInstance("java.util.Locale"));
        expected[336] = locale336;
        Locale locale337 = ((Locale) createInstance("java.util.Locale"));
        expected[337] = locale337;
        Locale locale338 = ((Locale) createInstance("java.util.Locale"));
        expected[338] = locale338;
        Locale locale339 = ((Locale) createInstance("java.util.Locale"));
        expected[339] = locale339;
        Locale locale340 = ((Locale) createInstance("java.util.Locale"));
        expected[340] = locale340;
        Locale locale341 = ((Locale) createInstance("java.util.Locale"));
        expected[341] = locale341;
        Locale locale342 = ((Locale) createInstance("java.util.Locale"));
        expected[342] = locale342;
        Locale locale343 = ((Locale) createInstance("java.util.Locale"));
        expected[343] = locale343;
        Locale locale344 = ((Locale) createInstance("java.util.Locale"));
        expected[344] = locale344;
        Locale locale345 = ((Locale) createInstance("java.util.Locale"));
        expected[345] = locale345;
        Locale locale346 = ((Locale) createInstance("java.util.Locale"));
        expected[346] = locale346;
        Locale locale347 = ((Locale) createInstance("java.util.Locale"));
        expected[347] = locale347;
        Locale locale348 = ((Locale) createInstance("java.util.Locale"));
        expected[348] = locale348;
        Locale locale349 = ((Locale) createInstance("java.util.Locale"));
        expected[349] = locale349;
        Locale locale350 = ((Locale) createInstance("java.util.Locale"));
        expected[350] = locale350;
        Locale locale351 = ((Locale) createInstance("java.util.Locale"));
        expected[351] = locale351;
        Locale locale352 = ((Locale) createInstance("java.util.Locale"));
        expected[352] = locale352;
        Locale locale353 = ((Locale) createInstance("java.util.Locale"));
        expected[353] = locale353;
        Locale locale354 = ((Locale) createInstance("java.util.Locale"));
        expected[354] = locale354;
        Locale locale355 = ((Locale) createInstance("java.util.Locale"));
        expected[355] = locale355;
        Locale locale356 = ((Locale) createInstance("java.util.Locale"));
        expected[356] = locale356;
        Locale locale357 = ((Locale) createInstance("java.util.Locale"));
        expected[357] = locale357;
        Locale locale358 = ((Locale) createInstance("java.util.Locale"));
        expected[358] = locale358;
        Locale locale359 = ((Locale) createInstance("java.util.Locale"));
        expected[359] = locale359;
        Locale locale360 = ((Locale) createInstance("java.util.Locale"));
        expected[360] = locale360;
        Locale locale361 = ((Locale) createInstance("java.util.Locale"));
        expected[361] = locale361;
        Locale locale362 = ((Locale) createInstance("java.util.Locale"));
        expected[362] = locale362;
        Locale locale363 = ((Locale) createInstance("java.util.Locale"));
        expected[363] = locale363;
        Locale locale364 = ((Locale) createInstance("java.util.Locale"));
        expected[364] = locale364;
        Locale locale365 = ((Locale) createInstance("java.util.Locale"));
        expected[365] = locale365;
        Locale locale366 = ((Locale) createInstance("java.util.Locale"));
        expected[366] = locale366;
        Locale locale367 = ((Locale) createInstance("java.util.Locale"));
        expected[367] = locale367;
        Locale locale368 = ((Locale) createInstance("java.util.Locale"));
        expected[368] = locale368;
        Locale locale369 = ((Locale) createInstance("java.util.Locale"));
        expected[369] = locale369;
        Locale locale370 = ((Locale) createInstance("java.util.Locale"));
        expected[370] = locale370;
        Locale locale371 = ((Locale) createInstance("java.util.Locale"));
        expected[371] = locale371;
        Locale locale372 = ((Locale) createInstance("java.util.Locale"));
        expected[372] = locale372;
        Locale locale373 = ((Locale) createInstance("java.util.Locale"));
        expected[373] = locale373;
        Locale locale374 = ((Locale) createInstance("java.util.Locale"));
        expected[374] = locale374;
        Locale locale375 = ((Locale) createInstance("java.util.Locale"));
        expected[375] = locale375;
        Locale locale376 = ((Locale) createInstance("java.util.Locale"));
        expected[376] = locale376;
        Locale locale377 = ((Locale) createInstance("java.util.Locale"));
        expected[377] = locale377;
        Locale locale378 = ((Locale) createInstance("java.util.Locale"));
        expected[378] = locale378;
        Locale locale379 = ((Locale) createInstance("java.util.Locale"));
        expected[379] = locale379;
        Locale locale380 = ((Locale) createInstance("java.util.Locale"));
        expected[380] = locale380;
        Locale locale381 = ((Locale) createInstance("java.util.Locale"));
        expected[381] = locale381;
        Locale locale382 = ((Locale) createInstance("java.util.Locale"));
        expected[382] = locale382;
        Locale locale383 = ((Locale) createInstance("java.util.Locale"));
        expected[383] = locale383;
        Locale locale384 = ((Locale) createInstance("java.util.Locale"));
        expected[384] = locale384;
        Locale locale385 = ((Locale) createInstance("java.util.Locale"));
        expected[385] = locale385;
        Locale locale386 = ((Locale) createInstance("java.util.Locale"));
        expected[386] = locale386;
        Locale locale387 = ((Locale) createInstance("java.util.Locale"));
        expected[387] = locale387;
        Locale locale388 = ((Locale) createInstance("java.util.Locale"));
        expected[388] = locale388;
        Locale locale389 = ((Locale) createInstance("java.util.Locale"));
        expected[389] = locale389;
        Locale locale390 = ((Locale) createInstance("java.util.Locale"));
        expected[390] = locale390;
        Locale locale391 = ((Locale) createInstance("java.util.Locale"));
        expected[391] = locale391;
        Locale locale392 = ((Locale) createInstance("java.util.Locale"));
        expected[392] = locale392;
        Locale locale393 = ((Locale) createInstance("java.util.Locale"));
        expected[393] = locale393;
        Locale locale394 = ((Locale) createInstance("java.util.Locale"));
        expected[394] = locale394;
        Locale locale395 = ((Locale) createInstance("java.util.Locale"));
        expected[395] = locale395;
        Locale locale396 = ((Locale) createInstance("java.util.Locale"));
        expected[396] = locale396;
        Locale locale397 = ((Locale) createInstance("java.util.Locale"));
        expected[397] = locale397;
        Locale locale398 = ((Locale) createInstance("java.util.Locale"));
        expected[398] = locale398;
        Locale locale399 = ((Locale) createInstance("java.util.Locale"));
        expected[399] = locale399;
        Locale locale400 = ((Locale) createInstance("java.util.Locale"));
        expected[400] = locale400;
        Locale locale401 = ((Locale) createInstance("java.util.Locale"));
        expected[401] = locale401;
        Locale locale402 = ((Locale) createInstance("java.util.Locale"));
        expected[402] = locale402;
        Locale locale403 = ((Locale) createInstance("java.util.Locale"));
        expected[403] = locale403;
        Locale locale404 = ((Locale) createInstance("java.util.Locale"));
        expected[404] = locale404;
        Locale locale405 = ((Locale) createInstance("java.util.Locale"));
        expected[405] = locale405;
        Locale locale406 = ((Locale) createInstance("java.util.Locale"));
        expected[406] = locale406;
        Locale locale407 = ((Locale) createInstance("java.util.Locale"));
        expected[407] = locale407;
        Locale locale408 = ((Locale) createInstance("java.util.Locale"));
        expected[408] = locale408;
        Locale locale409 = ((Locale) createInstance("java.util.Locale"));
        expected[409] = locale409;
        Locale locale410 = ((Locale) createInstance("java.util.Locale"));
        expected[410] = locale410;
        Locale locale411 = ((Locale) createInstance("java.util.Locale"));
        expected[411] = locale411;
        Locale locale412 = ((Locale) createInstance("java.util.Locale"));
        expected[412] = locale412;
        Locale locale413 = ((Locale) createInstance("java.util.Locale"));
        expected[413] = locale413;
        Locale locale414 = ((Locale) createInstance("java.util.Locale"));
        expected[414] = locale414;
        Locale locale415 = ((Locale) createInstance("java.util.Locale"));
        expected[415] = locale415;
        Locale locale416 = ((Locale) createInstance("java.util.Locale"));
        expected[416] = locale416;
        Locale locale417 = ((Locale) createInstance("java.util.Locale"));
        expected[417] = locale417;
        Locale locale418 = ((Locale) createInstance("java.util.Locale"));
        expected[418] = locale418;
        Locale locale419 = ((Locale) createInstance("java.util.Locale"));
        expected[419] = locale419;
        Locale locale420 = ((Locale) createInstance("java.util.Locale"));
        expected[420] = locale420;
        Locale locale421 = ((Locale) createInstance("java.util.Locale"));
        expected[421] = locale421;
        Locale locale422 = ((Locale) createInstance("java.util.Locale"));
        expected[422] = locale422;
        Locale locale423 = ((Locale) createInstance("java.util.Locale"));
        expected[423] = locale423;
        Locale locale424 = ((Locale) createInstance("java.util.Locale"));
        expected[424] = locale424;
        Locale locale425 = ((Locale) createInstance("java.util.Locale"));
        expected[425] = locale425;
        Locale locale426 = ((Locale) createInstance("java.util.Locale"));
        expected[426] = locale426;
        Locale locale427 = ((Locale) createInstance("java.util.Locale"));
        expected[427] = locale427;
        Locale locale428 = ((Locale) createInstance("java.util.Locale"));
        expected[428] = locale428;
        Locale locale429 = ((Locale) createInstance("java.util.Locale"));
        expected[429] = locale429;
        Locale locale430 = ((Locale) createInstance("java.util.Locale"));
        expected[430] = locale430;
        Locale locale431 = ((Locale) createInstance("java.util.Locale"));
        expected[431] = locale431;
        Locale locale432 = ((Locale) createInstance("java.util.Locale"));
        expected[432] = locale432;
        Locale locale433 = ((Locale) createInstance("java.util.Locale"));
        expected[433] = locale433;
        Locale locale434 = ((Locale) createInstance("java.util.Locale"));
        expected[434] = locale434;
        Locale locale435 = ((Locale) createInstance("java.util.Locale"));
        expected[435] = locale435;
        Locale locale436 = ((Locale) createInstance("java.util.Locale"));
        expected[436] = locale436;
        Locale locale437 = ((Locale) createInstance("java.util.Locale"));
        expected[437] = locale437;
        Locale locale438 = ((Locale) createInstance("java.util.Locale"));
        expected[438] = locale438;
        Locale locale439 = ((Locale) createInstance("java.util.Locale"));
        expected[439] = locale439;
        Locale locale440 = ((Locale) createInstance("java.util.Locale"));
        expected[440] = locale440;
        Locale locale441 = ((Locale) createInstance("java.util.Locale"));
        expected[441] = locale441;
        Locale locale442 = ((Locale) createInstance("java.util.Locale"));
        expected[442] = locale442;
        Locale locale443 = ((Locale) createInstance("java.util.Locale"));
        expected[443] = locale443;
        Locale locale444 = ((Locale) createInstance("java.util.Locale"));
        expected[444] = locale444;
        Locale locale445 = ((Locale) createInstance("java.util.Locale"));
        expected[445] = locale445;
        Locale locale446 = ((Locale) createInstance("java.util.Locale"));
        expected[446] = locale446;
        Locale locale447 = ((Locale) createInstance("java.util.Locale"));
        expected[447] = locale447;
        Locale locale448 = ((Locale) createInstance("java.util.Locale"));
        expected[448] = locale448;
        Locale locale449 = ((Locale) createInstance("java.util.Locale"));
        expected[449] = locale449;
        Locale locale450 = ((Locale) createInstance("java.util.Locale"));
        expected[450] = locale450;
        Locale locale451 = ((Locale) createInstance("java.util.Locale"));
        expected[451] = locale451;
        Locale locale452 = ((Locale) createInstance("java.util.Locale"));
        expected[452] = locale452;
        Locale locale453 = ((Locale) createInstance("java.util.Locale"));
        expected[453] = locale453;
        Locale locale454 = ((Locale) createInstance("java.util.Locale"));
        expected[454] = locale454;
        Locale locale455 = ((Locale) createInstance("java.util.Locale"));
        expected[455] = locale455;
        Locale locale456 = ((Locale) createInstance("java.util.Locale"));
        expected[456] = locale456;
        Locale locale457 = ((Locale) createInstance("java.util.Locale"));
        expected[457] = locale457;
        Locale locale458 = ((Locale) createInstance("java.util.Locale"));
        expected[458] = locale458;
        Locale locale459 = ((Locale) createInstance("java.util.Locale"));
        expected[459] = locale459;
        Locale locale460 = ((Locale) createInstance("java.util.Locale"));
        expected[460] = locale460;
        Locale locale461 = ((Locale) createInstance("java.util.Locale"));
        expected[461] = locale461;
        Locale locale462 = ((Locale) createInstance("java.util.Locale"));
        expected[462] = locale462;
        Locale locale463 = ((Locale) createInstance("java.util.Locale"));
        expected[463] = locale463;
        Locale locale464 = ((Locale) createInstance("java.util.Locale"));
        expected[464] = locale464;
        Locale locale465 = ((Locale) createInstance("java.util.Locale"));
        expected[465] = locale465;
        Locale locale466 = ((Locale) createInstance("java.util.Locale"));
        expected[466] = locale466;
        Locale locale467 = ((Locale) createInstance("java.util.Locale"));
        expected[467] = locale467;
        Locale locale468 = ((Locale) createInstance("java.util.Locale"));
        expected[468] = locale468;
        Locale locale469 = ((Locale) createInstance("java.util.Locale"));
        expected[469] = locale469;
        Locale locale470 = ((Locale) createInstance("java.util.Locale"));
        expected[470] = locale470;
        Locale locale471 = ((Locale) createInstance("java.util.Locale"));
        expected[471] = locale471;
        Locale locale472 = ((Locale) createInstance("java.util.Locale"));
        expected[472] = locale472;
        Locale locale473 = ((Locale) createInstance("java.util.Locale"));
        expected[473] = locale473;
        Locale locale474 = ((Locale) createInstance("java.util.Locale"));
        expected[474] = locale474;
        Locale locale475 = ((Locale) createInstance("java.util.Locale"));
        expected[475] = locale475;
        Locale locale476 = ((Locale) createInstance("java.util.Locale"));
        expected[476] = locale476;
        Locale locale477 = ((Locale) createInstance("java.util.Locale"));
        expected[477] = locale477;
        Locale locale478 = ((Locale) createInstance("java.util.Locale"));
        expected[478] = locale478;
        Locale locale479 = ((Locale) createInstance("java.util.Locale"));
        expected[479] = locale479;
        Locale locale480 = ((Locale) createInstance("java.util.Locale"));
        expected[480] = locale480;
        Locale locale481 = ((Locale) createInstance("java.util.Locale"));
        expected[481] = locale481;
        Locale locale482 = ((Locale) createInstance("java.util.Locale"));
        expected[482] = locale482;
        Locale locale483 = ((Locale) createInstance("java.util.Locale"));
        expected[483] = locale483;
        Locale locale484 = ((Locale) createInstance("java.util.Locale"));
        expected[484] = locale484;
        Locale locale485 = ((Locale) createInstance("java.util.Locale"));
        expected[485] = locale485;
        Locale locale486 = ((Locale) createInstance("java.util.Locale"));
        expected[486] = locale486;
        Locale locale487 = ((Locale) createInstance("java.util.Locale"));
        expected[487] = locale487;
        Locale locale488 = ((Locale) createInstance("java.util.Locale"));
        expected[488] = locale488;
        Locale locale489 = ((Locale) createInstance("java.util.Locale"));
        expected[489] = locale489;
        Locale locale490 = ((Locale) createInstance("java.util.Locale"));
        expected[490] = locale490;
        Locale locale491 = ((Locale) createInstance("java.util.Locale"));
        expected[491] = locale491;
        Locale locale492 = ((Locale) createInstance("java.util.Locale"));
        expected[492] = locale492;
        Locale locale493 = ((Locale) createInstance("java.util.Locale"));
        expected[493] = locale493;
        Locale locale494 = ((Locale) createInstance("java.util.Locale"));
        expected[494] = locale494;
        Locale locale495 = ((Locale) createInstance("java.util.Locale"));
        expected[495] = locale495;
        Locale locale496 = ((Locale) createInstance("java.util.Locale"));
        expected[496] = locale496;
        Locale locale497 = ((Locale) createInstance("java.util.Locale"));
        expected[497] = locale497;
        Locale locale498 = ((Locale) createInstance("java.util.Locale"));
        expected[498] = locale498;
        Locale locale499 = ((Locale) createInstance("java.util.Locale"));
        expected[499] = locale499;
        Locale locale500 = ((Locale) createInstance("java.util.Locale"));
        expected[500] = locale500;
        Locale locale501 = ((Locale) createInstance("java.util.Locale"));
        expected[501] = locale501;
        Locale locale502 = ((Locale) createInstance("java.util.Locale"));
        expected[502] = locale502;
        Locale locale503 = ((Locale) createInstance("java.util.Locale"));
        expected[503] = locale503;
        Locale locale504 = ((Locale) createInstance("java.util.Locale"));
        expected[504] = locale504;
        Locale locale505 = ((Locale) createInstance("java.util.Locale"));
        expected[505] = locale505;
        Locale locale506 = ((Locale) createInstance("java.util.Locale"));
        expected[506] = locale506;
        Locale locale507 = ((Locale) createInstance("java.util.Locale"));
        expected[507] = locale507;
        Locale locale508 = ((Locale) createInstance("java.util.Locale"));
        expected[508] = locale508;
        Locale locale509 = ((Locale) createInstance("java.util.Locale"));
        expected[509] = locale509;
        Locale locale510 = ((Locale) createInstance("java.util.Locale"));
        expected[510] = locale510;
        Locale locale511 = ((Locale) createInstance("java.util.Locale"));
        expected[511] = locale511;
        Locale locale512 = ((Locale) createInstance("java.util.Locale"));
        expected[512] = locale512;
        Locale locale513 = ((Locale) createInstance("java.util.Locale"));
        expected[513] = locale513;
        Locale locale514 = ((Locale) createInstance("java.util.Locale"));
        expected[514] = locale514;
        Locale locale515 = ((Locale) createInstance("java.util.Locale"));
        expected[515] = locale515;
        Locale locale516 = ((Locale) createInstance("java.util.Locale"));
        expected[516] = locale516;
        Locale locale517 = ((Locale) createInstance("java.util.Locale"));
        expected[517] = locale517;
        Locale locale518 = ((Locale) createInstance("java.util.Locale"));
        expected[518] = locale518;
        Locale locale519 = ((Locale) createInstance("java.util.Locale"));
        expected[519] = locale519;
        Locale locale520 = ((Locale) createInstance("java.util.Locale"));
        expected[520] = locale520;
        Locale locale521 = ((Locale) createInstance("java.util.Locale"));
        expected[521] = locale521;
        Locale locale522 = ((Locale) createInstance("java.util.Locale"));
        expected[522] = locale522;
        Locale locale523 = ((Locale) createInstance("java.util.Locale"));
        expected[523] = locale523;
        Locale locale524 = ((Locale) createInstance("java.util.Locale"));
        expected[524] = locale524;
        Locale locale525 = ((Locale) createInstance("java.util.Locale"));
        expected[525] = locale525;
        Locale locale526 = ((Locale) createInstance("java.util.Locale"));
        expected[526] = locale526;
        Locale locale527 = ((Locale) createInstance("java.util.Locale"));
        expected[527] = locale527;
        Locale locale528 = ((Locale) createInstance("java.util.Locale"));
        expected[528] = locale528;
        Locale locale529 = ((Locale) createInstance("java.util.Locale"));
        expected[529] = locale529;
        Locale locale530 = ((Locale) createInstance("java.util.Locale"));
        expected[530] = locale530;
        Locale locale531 = ((Locale) createInstance("java.util.Locale"));
        expected[531] = locale531;
        Locale locale532 = ((Locale) createInstance("java.util.Locale"));
        expected[532] = locale532;
        Locale locale533 = ((Locale) createInstance("java.util.Locale"));
        expected[533] = locale533;
        Locale locale534 = ((Locale) createInstance("java.util.Locale"));
        expected[534] = locale534;
        Locale locale535 = ((Locale) createInstance("java.util.Locale"));
        expected[535] = locale535;
        Locale locale536 = ((Locale) createInstance("java.util.Locale"));
        expected[536] = locale536;
        Locale locale537 = ((Locale) createInstance("java.util.Locale"));
        expected[537] = locale537;
        Locale locale538 = ((Locale) createInstance("java.util.Locale"));
        expected[538] = locale538;
        Locale locale539 = ((Locale) createInstance("java.util.Locale"));
        expected[539] = locale539;
        Locale locale540 = ((Locale) createInstance("java.util.Locale"));
        expected[540] = locale540;
        Locale locale541 = ((Locale) createInstance("java.util.Locale"));
        expected[541] = locale541;
        Locale locale542 = ((Locale) createInstance("java.util.Locale"));
        expected[542] = locale542;
        Locale locale543 = ((Locale) createInstance("java.util.Locale"));
        expected[543] = locale543;
        Locale locale544 = ((Locale) createInstance("java.util.Locale"));
        expected[544] = locale544;
        Locale locale545 = ((Locale) createInstance("java.util.Locale"));
        expected[545] = locale545;
        Locale locale546 = ((Locale) createInstance("java.util.Locale"));
        expected[546] = locale546;
        Locale locale547 = ((Locale) createInstance("java.util.Locale"));
        expected[547] = locale547;
        Locale locale548 = ((Locale) createInstance("java.util.Locale"));
        expected[548] = locale548;
        Locale locale549 = ((Locale) createInstance("java.util.Locale"));
        expected[549] = locale549;
        Locale locale550 = ((Locale) createInstance("java.util.Locale"));
        expected[550] = locale550;
        Locale locale551 = ((Locale) createInstance("java.util.Locale"));
        expected[551] = locale551;
        Locale locale552 = ((Locale) createInstance("java.util.Locale"));
        expected[552] = locale552;
        Locale locale553 = ((Locale) createInstance("java.util.Locale"));
        expected[553] = locale553;
        Locale locale554 = ((Locale) createInstance("java.util.Locale"));
        expected[554] = locale554;
        Locale locale555 = ((Locale) createInstance("java.util.Locale"));
        expected[555] = locale555;
        Locale locale556 = ((Locale) createInstance("java.util.Locale"));
        expected[556] = locale556;
        Locale locale557 = ((Locale) createInstance("java.util.Locale"));
        expected[557] = locale557;
        Locale locale558 = ((Locale) createInstance("java.util.Locale"));
        expected[558] = locale558;
        Locale locale559 = ((Locale) createInstance("java.util.Locale"));
        expected[559] = locale559;
        Locale locale560 = ((Locale) createInstance("java.util.Locale"));
        expected[560] = locale560;
        Locale locale561 = ((Locale) createInstance("java.util.Locale"));
        expected[561] = locale561;
        Locale locale562 = ((Locale) createInstance("java.util.Locale"));
        expected[562] = locale562;
        Locale locale563 = ((Locale) createInstance("java.util.Locale"));
        expected[563] = locale563;
        Locale locale564 = ((Locale) createInstance("java.util.Locale"));
        expected[564] = locale564;
        Locale locale565 = ((Locale) createInstance("java.util.Locale"));
        expected[565] = locale565;
        Locale locale566 = ((Locale) createInstance("java.util.Locale"));
        expected[566] = locale566;
        Locale locale567 = ((Locale) createInstance("java.util.Locale"));
        expected[567] = locale567;
        Locale locale568 = ((Locale) createInstance("java.util.Locale"));
        expected[568] = locale568;
        Locale locale569 = ((Locale) createInstance("java.util.Locale"));
        expected[569] = locale569;
        Locale locale570 = ((Locale) createInstance("java.util.Locale"));
        expected[570] = locale570;
        Locale locale571 = ((Locale) createInstance("java.util.Locale"));
        expected[571] = locale571;
        Locale locale572 = ((Locale) createInstance("java.util.Locale"));
        expected[572] = locale572;
        Locale locale573 = ((Locale) createInstance("java.util.Locale"));
        expected[573] = locale573;
        Locale locale574 = ((Locale) createInstance("java.util.Locale"));
        expected[574] = locale574;
        Locale locale575 = ((Locale) createInstance("java.util.Locale"));
        expected[575] = locale575;
        Locale locale576 = ((Locale) createInstance("java.util.Locale"));
        expected[576] = locale576;
        Locale locale577 = ((Locale) createInstance("java.util.Locale"));
        expected[577] = locale577;
        Locale locale578 = ((Locale) createInstance("java.util.Locale"));
        expected[578] = locale578;
        Locale locale579 = ((Locale) createInstance("java.util.Locale"));
        expected[579] = locale579;
        Locale locale580 = ((Locale) createInstance("java.util.Locale"));
        expected[580] = locale580;
        Locale locale581 = ((Locale) createInstance("java.util.Locale"));
        expected[581] = locale581;
        Locale locale582 = ((Locale) createInstance("java.util.Locale"));
        expected[582] = locale582;
        Locale locale583 = ((Locale) createInstance("java.util.Locale"));
        expected[583] = locale583;
        Locale locale584 = ((Locale) createInstance("java.util.Locale"));
        expected[584] = locale584;
        Locale locale585 = ((Locale) createInstance("java.util.Locale"));
        expected[585] = locale585;
        Locale locale586 = ((Locale) createInstance("java.util.Locale"));
        expected[586] = locale586;
        Locale locale587 = ((Locale) createInstance("java.util.Locale"));
        expected[587] = locale587;
        Locale locale588 = ((Locale) createInstance("java.util.Locale"));
        expected[588] = locale588;
        Locale locale589 = ((Locale) createInstance("java.util.Locale"));
        expected[589] = locale589;
        Locale locale590 = ((Locale) createInstance("java.util.Locale"));
        expected[590] = locale590;
        Locale locale591 = ((Locale) createInstance("java.util.Locale"));
        expected[591] = locale591;
        Locale locale592 = ((Locale) createInstance("java.util.Locale"));
        expected[592] = locale592;
        Locale locale593 = ((Locale) createInstance("java.util.Locale"));
        expected[593] = locale593;
        Locale locale594 = ((Locale) createInstance("java.util.Locale"));
        expected[594] = locale594;
        Locale locale595 = ((Locale) createInstance("java.util.Locale"));
        expected[595] = locale595;
        Locale locale596 = ((Locale) createInstance("java.util.Locale"));
        expected[596] = locale596;
        Locale locale597 = ((Locale) createInstance("java.util.Locale"));
        expected[597] = locale597;
        Locale locale598 = ((Locale) createInstance("java.util.Locale"));
        expected[598] = locale598;
        Locale locale599 = ((Locale) createInstance("java.util.Locale"));
        expected[599] = locale599;
        Locale locale600 = ((Locale) createInstance("java.util.Locale"));
        expected[600] = locale600;
        Locale locale601 = ((Locale) createInstance("java.util.Locale"));
        expected[601] = locale601;
        Locale locale602 = ((Locale) createInstance("java.util.Locale"));
        expected[602] = locale602;
        Locale locale603 = ((Locale) createInstance("java.util.Locale"));
        expected[603] = locale603;
        Locale locale604 = ((Locale) createInstance("java.util.Locale"));
        expected[604] = locale604;
        Locale locale605 = ((Locale) createInstance("java.util.Locale"));
        expected[605] = locale605;
        Locale locale606 = ((Locale) createInstance("java.util.Locale"));
        expected[606] = locale606;
        Locale locale607 = ((Locale) createInstance("java.util.Locale"));
        expected[607] = locale607;
        Locale locale608 = ((Locale) createInstance("java.util.Locale"));
        expected[608] = locale608;
        Locale locale609 = ((Locale) createInstance("java.util.Locale"));
        expected[609] = locale609;
        Locale locale610 = ((Locale) createInstance("java.util.Locale"));
        expected[610] = locale610;
        Locale locale611 = ((Locale) createInstance("java.util.Locale"));
        expected[611] = locale611;
        Locale locale612 = ((Locale) createInstance("java.util.Locale"));
        expected[612] = locale612;
        Locale locale613 = ((Locale) createInstance("java.util.Locale"));
        expected[613] = locale613;
        Locale locale614 = ((Locale) createInstance("java.util.Locale"));
        expected[614] = locale614;
        Locale locale615 = ((Locale) createInstance("java.util.Locale"));
        expected[615] = locale615;
        Locale locale616 = ((Locale) createInstance("java.util.Locale"));
        expected[616] = locale616;
        Locale locale617 = ((Locale) createInstance("java.util.Locale"));
        expected[617] = locale617;
        Locale locale618 = ((Locale) createInstance("java.util.Locale"));
        expected[618] = locale618;
        Locale locale619 = ((Locale) createInstance("java.util.Locale"));
        expected[619] = locale619;
        Locale locale620 = ((Locale) createInstance("java.util.Locale"));
        expected[620] = locale620;
        Locale locale621 = ((Locale) createInstance("java.util.Locale"));
        expected[621] = locale621;
        Locale locale622 = ((Locale) createInstance("java.util.Locale"));
        expected[622] = locale622;
        Locale locale623 = ((Locale) createInstance("java.util.Locale"));
        expected[623] = locale623;
        Locale locale624 = ((Locale) createInstance("java.util.Locale"));
        expected[624] = locale624;
        Locale locale625 = ((Locale) createInstance("java.util.Locale"));
        expected[625] = locale625;
        Locale locale626 = ((Locale) createInstance("java.util.Locale"));
        expected[626] = locale626;
        Locale locale627 = ((Locale) createInstance("java.util.Locale"));
        expected[627] = locale627;
        Locale locale628 = ((Locale) createInstance("java.util.Locale"));
        expected[628] = locale628;
        Locale locale629 = ((Locale) createInstance("java.util.Locale"));
        expected[629] = locale629;
        Locale locale630 = ((Locale) createInstance("java.util.Locale"));
        expected[630] = locale630;
        Locale locale631 = ((Locale) createInstance("java.util.Locale"));
        expected[631] = locale631;
        Locale locale632 = ((Locale) createInstance("java.util.Locale"));
        expected[632] = locale632;
        Locale locale633 = ((Locale) createInstance("java.util.Locale"));
        expected[633] = locale633;
        Locale locale634 = ((Locale) createInstance("java.util.Locale"));
        expected[634] = locale634;
        Locale locale635 = ((Locale) createInstance("java.util.Locale"));
        expected[635] = locale635;
        Locale locale636 = ((Locale) createInstance("java.util.Locale"));
        expected[636] = locale636;
        Locale locale637 = ((Locale) createInstance("java.util.Locale"));
        expected[637] = locale637;
        Locale locale638 = ((Locale) createInstance("java.util.Locale"));
        expected[638] = locale638;
        Locale locale639 = ((Locale) createInstance("java.util.Locale"));
        expected[639] = locale639;
        Locale locale640 = ((Locale) createInstance("java.util.Locale"));
        expected[640] = locale640;
        Locale locale641 = ((Locale) createInstance("java.util.Locale"));
        expected[641] = locale641;
        Locale locale642 = ((Locale) createInstance("java.util.Locale"));
        expected[642] = locale642;
        Locale locale643 = ((Locale) createInstance("java.util.Locale"));
        expected[643] = locale643;
        Locale locale644 = ((Locale) createInstance("java.util.Locale"));
        expected[644] = locale644;
        Locale locale645 = ((Locale) createInstance("java.util.Locale"));
        expected[645] = locale645;
        Locale locale646 = ((Locale) createInstance("java.util.Locale"));
        expected[646] = locale646;
        Locale locale647 = ((Locale) createInstance("java.util.Locale"));
        expected[647] = locale647;
        Locale locale648 = ((Locale) createInstance("java.util.Locale"));
        expected[648] = locale648;
        Locale locale649 = ((Locale) createInstance("java.util.Locale"));
        expected[649] = locale649;
        Locale locale650 = ((Locale) createInstance("java.util.Locale"));
        expected[650] = locale650;
        Locale locale651 = ((Locale) createInstance("java.util.Locale"));
        expected[651] = locale651;
        Locale locale652 = ((Locale) createInstance("java.util.Locale"));
        expected[652] = locale652;
        Locale locale653 = ((Locale) createInstance("java.util.Locale"));
        expected[653] = locale653;
        Locale locale654 = ((Locale) createInstance("java.util.Locale"));
        expected[654] = locale654;
        Locale locale655 = ((Locale) createInstance("java.util.Locale"));
        expected[655] = locale655;
        Locale locale656 = ((Locale) createInstance("java.util.Locale"));
        expected[656] = locale656;
        Locale locale657 = ((Locale) createInstance("java.util.Locale"));
        expected[657] = locale657;
        Locale locale658 = ((Locale) createInstance("java.util.Locale"));
        expected[658] = locale658;
        Locale locale659 = ((Locale) createInstance("java.util.Locale"));
        expected[659] = locale659;
        Locale locale660 = ((Locale) createInstance("java.util.Locale"));
        expected[660] = locale660;
        Locale locale661 = ((Locale) createInstance("java.util.Locale"));
        expected[661] = locale661;
        Locale locale662 = ((Locale) createInstance("java.util.Locale"));
        expected[662] = locale662;
        Locale locale663 = ((Locale) createInstance("java.util.Locale"));
        expected[663] = locale663;
        Locale locale664 = ((Locale) createInstance("java.util.Locale"));
        expected[664] = locale664;
        Locale locale665 = ((Locale) createInstance("java.util.Locale"));
        expected[665] = locale665;
        Locale locale666 = ((Locale) createInstance("java.util.Locale"));
        expected[666] = locale666;
        Locale locale667 = ((Locale) createInstance("java.util.Locale"));
        expected[667] = locale667;
        Locale locale668 = ((Locale) createInstance("java.util.Locale"));
        expected[668] = locale668;
        Locale locale669 = ((Locale) createInstance("java.util.Locale"));
        expected[669] = locale669;
        Locale locale670 = ((Locale) createInstance("java.util.Locale"));
        expected[670] = locale670;
        Locale locale671 = ((Locale) createInstance("java.util.Locale"));
        expected[671] = locale671;
        Locale locale672 = ((Locale) createInstance("java.util.Locale"));
        expected[672] = locale672;
        Locale locale673 = ((Locale) createInstance("java.util.Locale"));
        expected[673] = locale673;
        Locale locale674 = ((Locale) createInstance("java.util.Locale"));
        expected[674] = locale674;
        Locale locale675 = ((Locale) createInstance("java.util.Locale"));
        expected[675] = locale675;
        Locale locale676 = ((Locale) createInstance("java.util.Locale"));
        expected[676] = locale676;
        Locale locale677 = ((Locale) createInstance("java.util.Locale"));
        expected[677] = locale677;
        Locale locale678 = ((Locale) createInstance("java.util.Locale"));
        expected[678] = locale678;
        Locale locale679 = ((Locale) createInstance("java.util.Locale"));
        expected[679] = locale679;
        Locale locale680 = ((Locale) createInstance("java.util.Locale"));
        expected[680] = locale680;
        Locale locale681 = ((Locale) createInstance("java.util.Locale"));
        expected[681] = locale681;
        Locale locale682 = ((Locale) createInstance("java.util.Locale"));
        expected[682] = locale682;
        Locale locale683 = ((Locale) createInstance("java.util.Locale"));
        expected[683] = locale683;
        Locale locale684 = ((Locale) createInstance("java.util.Locale"));
        expected[684] = locale684;
        Locale locale685 = ((Locale) createInstance("java.util.Locale"));
        expected[685] = locale685;
        Locale locale686 = ((Locale) createInstance("java.util.Locale"));
        expected[686] = locale686;
        Locale locale687 = ((Locale) createInstance("java.util.Locale"));
        expected[687] = locale687;
        Locale locale688 = ((Locale) createInstance("java.util.Locale"));
        expected[688] = locale688;
        Locale locale689 = ((Locale) createInstance("java.util.Locale"));
        expected[689] = locale689;
        Locale locale690 = ((Locale) createInstance("java.util.Locale"));
        expected[690] = locale690;
        Locale locale691 = ((Locale) createInstance("java.util.Locale"));
        expected[691] = locale691;
        Locale locale692 = ((Locale) createInstance("java.util.Locale"));
        expected[692] = locale692;
        Locale locale693 = ((Locale) createInstance("java.util.Locale"));
        expected[693] = locale693;
        Locale locale694 = ((Locale) createInstance("java.util.Locale"));
        expected[694] = locale694;
        Locale locale695 = ((Locale) createInstance("java.util.Locale"));
        expected[695] = locale695;
        Locale locale696 = ((Locale) createInstance("java.util.Locale"));
        expected[696] = locale696;
        Locale locale697 = ((Locale) createInstance("java.util.Locale"));
        expected[697] = locale697;
        Locale locale698 = ((Locale) createInstance("java.util.Locale"));
        expected[698] = locale698;
        Locale locale699 = ((Locale) createInstance("java.util.Locale"));
        expected[699] = locale699;
        Locale locale700 = ((Locale) createInstance("java.util.Locale"));
        expected[700] = locale700;
        Locale locale701 = ((Locale) createInstance("java.util.Locale"));
        expected[701] = locale701;
        Locale locale702 = ((Locale) createInstance("java.util.Locale"));
        expected[702] = locale702;
        Locale locale703 = ((Locale) createInstance("java.util.Locale"));
        expected[703] = locale703;
        Locale locale704 = ((Locale) createInstance("java.util.Locale"));
        expected[704] = locale704;
        Locale locale705 = ((Locale) createInstance("java.util.Locale"));
        expected[705] = locale705;
        Locale locale706 = ((Locale) createInstance("java.util.Locale"));
        expected[706] = locale706;
        Locale locale707 = ((Locale) createInstance("java.util.Locale"));
        expected[707] = locale707;
        Locale locale708 = ((Locale) createInstance("java.util.Locale"));
        expected[708] = locale708;
        Locale locale709 = ((Locale) createInstance("java.util.Locale"));
        expected[709] = locale709;
        Locale locale710 = ((Locale) createInstance("java.util.Locale"));
        expected[710] = locale710;
        Locale locale711 = ((Locale) createInstance("java.util.Locale"));
        expected[711] = locale711;
        Locale locale712 = ((Locale) createInstance("java.util.Locale"));
        expected[712] = locale712;
        Locale locale713 = ((Locale) createInstance("java.util.Locale"));
        expected[713] = locale713;
        Locale locale714 = ((Locale) createInstance("java.util.Locale"));
        expected[714] = locale714;
        Locale locale715 = ((Locale) createInstance("java.util.Locale"));
        expected[715] = locale715;
        Locale locale716 = ((Locale) createInstance("java.util.Locale"));
        expected[716] = locale716;
        Locale locale717 = ((Locale) createInstance("java.util.Locale"));
        expected[717] = locale717;
        Locale locale718 = ((Locale) createInstance("java.util.Locale"));
        expected[718] = locale718;
        Locale locale719 = ((Locale) createInstance("java.util.Locale"));
        expected[719] = locale719;
        Locale locale720 = ((Locale) createInstance("java.util.Locale"));
        expected[720] = locale720;
        Locale locale721 = ((Locale) createInstance("java.util.Locale"));
        expected[721] = locale721;
        Locale locale722 = ((Locale) createInstance("java.util.Locale"));
        expected[722] = locale722;
        Locale locale723 = ((Locale) createInstance("java.util.Locale"));
        expected[723] = locale723;
        Locale locale724 = ((Locale) createInstance("java.util.Locale"));
        expected[724] = locale724;
        Locale locale725 = ((Locale) createInstance("java.util.Locale"));
        expected[725] = locale725;
        Locale locale726 = ((Locale) createInstance("java.util.Locale"));
        expected[726] = locale726;
        Locale locale727 = ((Locale) createInstance("java.util.Locale"));
        expected[727] = locale727;
        Locale locale728 = ((Locale) createInstance("java.util.Locale"));
        expected[728] = locale728;
        Locale locale729 = ((Locale) createInstance("java.util.Locale"));
        expected[729] = locale729;
        Locale locale730 = ((Locale) createInstance("java.util.Locale"));
        expected[730] = locale730;
        Locale locale731 = ((Locale) createInstance("java.util.Locale"));
        expected[731] = locale731;
        Locale locale732 = ((Locale) createInstance("java.util.Locale"));
        expected[732] = locale732;
        Locale locale733 = ((Locale) createInstance("java.util.Locale"));
        expected[733] = locale733;
        Locale locale734 = ((Locale) createInstance("java.util.Locale"));
        expected[734] = locale734;
        Locale locale735 = ((Locale) createInstance("java.util.Locale"));
        expected[735] = locale735;
        Locale locale736 = ((Locale) createInstance("java.util.Locale"));
        expected[736] = locale736;
        Locale locale737 = ((Locale) createInstance("java.util.Locale"));
        expected[737] = locale737;
        Locale locale738 = ((Locale) createInstance("java.util.Locale"));
        expected[738] = locale738;
        Locale locale739 = ((Locale) createInstance("java.util.Locale"));
        expected[739] = locale739;
        Locale locale740 = ((Locale) createInstance("java.util.Locale"));
        expected[740] = locale740;
        Locale locale741 = ((Locale) createInstance("java.util.Locale"));
        expected[741] = locale741;
        Locale locale742 = ((Locale) createInstance("java.util.Locale"));
        expected[742] = locale742;
        Locale locale743 = ((Locale) createInstance("java.util.Locale"));
        expected[743] = locale743;
        Locale locale744 = ((Locale) createInstance("java.util.Locale"));
        expected[744] = locale744;
        Locale locale745 = ((Locale) createInstance("java.util.Locale"));
        expected[745] = locale745;
        Locale locale746 = ((Locale) createInstance("java.util.Locale"));
        expected[746] = locale746;
        Locale locale747 = ((Locale) createInstance("java.util.Locale"));
        expected[747] = locale747;
        Locale locale748 = ((Locale) createInstance("java.util.Locale"));
        expected[748] = locale748;
        Locale locale749 = ((Locale) createInstance("java.util.Locale"));
        expected[749] = locale749;
        Locale locale750 = ((Locale) createInstance("java.util.Locale"));
        expected[750] = locale750;
        Locale locale751 = ((Locale) createInstance("java.util.Locale"));
        expected[751] = locale751;
        Locale locale752 = ((Locale) createInstance("java.util.Locale"));
        expected[752] = locale752;
        Locale locale753 = ((Locale) createInstance("java.util.Locale"));
        expected[753] = locale753;
        Locale locale754 = ((Locale) createInstance("java.util.Locale"));
        expected[754] = locale754;
        Locale locale755 = ((Locale) createInstance("java.util.Locale"));
        expected[755] = locale755;
        Locale locale756 = ((Locale) createInstance("java.util.Locale"));
        expected[756] = locale756;
        Locale locale757 = ((Locale) createInstance("java.util.Locale"));
        expected[757] = locale757;
        Locale locale758 = ((Locale) createInstance("java.util.Locale"));
        expected[758] = locale758;
        Locale locale759 = ((Locale) createInstance("java.util.Locale"));
        expected[759] = locale759;
        Locale locale760 = ((Locale) createInstance("java.util.Locale"));
        expected[760] = locale760;
        Locale locale761 = ((Locale) createInstance("java.util.Locale"));
        expected[761] = locale761;
        Locale locale762 = ((Locale) createInstance("java.util.Locale"));
        expected[762] = locale762;
        Locale locale763 = ((Locale) createInstance("java.util.Locale"));
        expected[763] = locale763;
        Locale locale764 = ((Locale) createInstance("java.util.Locale"));
        expected[764] = locale764;
        Locale locale765 = ((Locale) createInstance("java.util.Locale"));
        expected[765] = locale765;
        Locale locale766 = ((Locale) createInstance("java.util.Locale"));
        expected[766] = locale766;
        Locale locale767 = ((Locale) createInstance("java.util.Locale"));
        expected[767] = locale767;
        Locale locale768 = ((Locale) createInstance("java.util.Locale"));
        expected[768] = locale768;
        Locale locale769 = ((Locale) createInstance("java.util.Locale"));
        expected[769] = locale769;
        Locale locale770 = ((Locale) createInstance("java.util.Locale"));
        expected[770] = locale770;
        Locale locale771 = ((Locale) createInstance("java.util.Locale"));
        expected[771] = locale771;
        Locale locale772 = ((Locale) createInstance("java.util.Locale"));
        expected[772] = locale772;
        Locale locale773 = ((Locale) createInstance("java.util.Locale"));
        expected[773] = locale773;
        Locale locale774 = ((Locale) createInstance("java.util.Locale"));
        expected[774] = locale774;
        Locale locale775 = ((Locale) createInstance("java.util.Locale"));
        expected[775] = locale775;
        Locale locale776 = ((Locale) createInstance("java.util.Locale"));
        expected[776] = locale776;
        Locale locale777 = ((Locale) createInstance("java.util.Locale"));
        expected[777] = locale777;
        Locale locale778 = ((Locale) createInstance("java.util.Locale"));
        expected[778] = locale778;
        Locale locale779 = ((Locale) createInstance("java.util.Locale"));
        expected[779] = locale779;
        Locale locale780 = ((Locale) createInstance("java.util.Locale"));
        expected[780] = locale780;
        Locale locale781 = ((Locale) createInstance("java.util.Locale"));
        expected[781] = locale781;
        Locale locale782 = ((Locale) createInstance("java.util.Locale"));
        expected[782] = locale782;
        Locale locale783 = ((Locale) createInstance("java.util.Locale"));
        expected[783] = locale783;
        Locale locale784 = ((Locale) createInstance("java.util.Locale"));
        expected[784] = locale784;
        Locale locale785 = ((Locale) createInstance("java.util.Locale"));
        expected[785] = locale785;
        Locale locale786 = ((Locale) createInstance("java.util.Locale"));
        expected[786] = locale786;
        Locale locale787 = ((Locale) createInstance("java.util.Locale"));
        expected[787] = locale787;
        Locale locale788 = ((Locale) createInstance("java.util.Locale"));
        expected[788] = locale788;
        Locale locale789 = ((Locale) createInstance("java.util.Locale"));
        expected[789] = locale789;
        Locale locale790 = ((Locale) createInstance("java.util.Locale"));
        expected[790] = locale790;
        Locale locale791 = ((Locale) createInstance("java.util.Locale"));
        expected[791] = locale791;
        Locale locale792 = ((Locale) createInstance("java.util.Locale"));
        expected[792] = locale792;
        Locale locale793 = ((Locale) createInstance("java.util.Locale"));
        expected[793] = locale793;
        Locale locale794 = ((Locale) createInstance("java.util.Locale"));
        expected[794] = locale794;
        Locale locale795 = ((Locale) createInstance("java.util.Locale"));
        expected[795] = locale795;
        Locale locale796 = ((Locale) createInstance("java.util.Locale"));
        expected[796] = locale796;
        Locale locale797 = ((Locale) createInstance("java.util.Locale"));
        expected[797] = locale797;
        Locale locale798 = ((Locale) createInstance("java.util.Locale"));
        expected[798] = locale798;
        Locale locale799 = ((Locale) createInstance("java.util.Locale"));
        expected[799] = locale799;
        Locale locale800 = ((Locale) createInstance("java.util.Locale"));
        expected[800] = locale800;
        Locale locale801 = ((Locale) createInstance("java.util.Locale"));
        expected[801] = locale801;
        Locale locale802 = ((Locale) createInstance("java.util.Locale"));
        expected[802] = locale802;
        Locale locale803 = ((Locale) createInstance("java.util.Locale"));
        expected[803] = locale803;
        Locale locale804 = ((Locale) createInstance("java.util.Locale"));
        expected[804] = locale804;
        Locale locale805 = ((Locale) createInstance("java.util.Locale"));
        expected[805] = locale805;
        Locale locale806 = ((Locale) createInstance("java.util.Locale"));
        expected[806] = locale806;
        Locale locale807 = ((Locale) createInstance("java.util.Locale"));
        expected[807] = locale807;
        Locale locale808 = ((Locale) createInstance("java.util.Locale"));
        expected[808] = locale808;
        Locale locale809 = ((Locale) createInstance("java.util.Locale"));
        expected[809] = locale809;
        Locale locale810 = ((Locale) createInstance("java.util.Locale"));
        expected[810] = locale810;
        Locale locale811 = ((Locale) createInstance("java.util.Locale"));
        expected[811] = locale811;
        Locale locale812 = ((Locale) createInstance("java.util.Locale"));
        expected[812] = locale812;
        Locale locale813 = ((Locale) createInstance("java.util.Locale"));
        expected[813] = locale813;
        Locale locale814 = ((Locale) createInstance("java.util.Locale"));
        expected[814] = locale814;
        Locale locale815 = ((Locale) createInstance("java.util.Locale"));
        expected[815] = locale815;
        Locale locale816 = ((Locale) createInstance("java.util.Locale"));
        expected[816] = locale816;
        Locale locale817 = ((Locale) createInstance("java.util.Locale"));
        expected[817] = locale817;
        Locale locale818 = ((Locale) createInstance("java.util.Locale"));
        expected[818] = locale818;
        Locale locale819 = ((Locale) createInstance("java.util.Locale"));
        expected[819] = locale819;
        Locale locale820 = ((Locale) createInstance("java.util.Locale"));
        expected[820] = locale820;
        Locale locale821 = ((Locale) createInstance("java.util.Locale"));
        expected[821] = locale821;
        Locale locale822 = ((Locale) createInstance("java.util.Locale"));
        expected[822] = locale822;
        Locale locale823 = ((Locale) createInstance("java.util.Locale"));
        expected[823] = locale823;
        Locale locale824 = ((Locale) createInstance("java.util.Locale"));
        expected[824] = locale824;
        Locale locale825 = ((Locale) createInstance("java.util.Locale"));
        expected[825] = locale825;
        Locale locale826 = ((Locale) createInstance("java.util.Locale"));
        expected[826] = locale826;
        Locale locale827 = ((Locale) createInstance("java.util.Locale"));
        expected[827] = locale827;
        Locale locale828 = ((Locale) createInstance("java.util.Locale"));
        expected[828] = locale828;
        Locale locale829 = ((Locale) createInstance("java.util.Locale"));
        expected[829] = locale829;
        Locale locale830 = ((Locale) createInstance("java.util.Locale"));
        expected[830] = locale830;
        Locale locale831 = ((Locale) createInstance("java.util.Locale"));
        expected[831] = locale831;
        Locale locale832 = ((Locale) createInstance("java.util.Locale"));
        expected[832] = locale832;
        Locale locale833 = ((Locale) createInstance("java.util.Locale"));
        expected[833] = locale833;
        Locale locale834 = ((Locale) createInstance("java.util.Locale"));
        expected[834] = locale834;
        Locale locale835 = ((Locale) createInstance("java.util.Locale"));
        expected[835] = locale835;
        Locale locale836 = ((Locale) createInstance("java.util.Locale"));
        expected[836] = locale836;
        Locale locale837 = ((Locale) createInstance("java.util.Locale"));
        expected[837] = locale837;
        Locale locale838 = ((Locale) createInstance("java.util.Locale"));
        expected[838] = locale838;
        Locale locale839 = ((Locale) createInstance("java.util.Locale"));
        expected[839] = locale839;
        Locale locale840 = ((Locale) createInstance("java.util.Locale"));
        expected[840] = locale840;
        Locale locale841 = ((Locale) createInstance("java.util.Locale"));
        expected[841] = locale841;
        Locale locale842 = ((Locale) createInstance("java.util.Locale"));
        expected[842] = locale842;
        Locale locale843 = ((Locale) createInstance("java.util.Locale"));
        expected[843] = locale843;
        Locale locale844 = ((Locale) createInstance("java.util.Locale"));
        expected[844] = locale844;
        Locale locale845 = ((Locale) createInstance("java.util.Locale"));
        expected[845] = locale845;
        Locale locale846 = ((Locale) createInstance("java.util.Locale"));
        expected[846] = locale846;
        Locale locale847 = ((Locale) createInstance("java.util.Locale"));
        expected[847] = locale847;
        Locale locale848 = ((Locale) createInstance("java.util.Locale"));
        expected[848] = locale848;
        Locale locale849 = ((Locale) createInstance("java.util.Locale"));
        expected[849] = locale849;
        Locale locale850 = ((Locale) createInstance("java.util.Locale"));
        expected[850] = locale850;
        Locale locale851 = ((Locale) createInstance("java.util.Locale"));
        expected[851] = locale851;
        Locale locale852 = ((Locale) createInstance("java.util.Locale"));
        expected[852] = locale852;
        Locale locale853 = ((Locale) createInstance("java.util.Locale"));
        expected[853] = locale853;
        Locale locale854 = ((Locale) createInstance("java.util.Locale"));
        expected[854] = locale854;
        Locale locale855 = ((Locale) createInstance("java.util.Locale"));
        expected[855] = locale855;
        Locale locale856 = ((Locale) createInstance("java.util.Locale"));
        expected[856] = locale856;
        Locale locale857 = ((Locale) createInstance("java.util.Locale"));
        expected[857] = locale857;
        Locale locale858 = ((Locale) createInstance("java.util.Locale"));
        expected[858] = locale858;
        Locale locale859 = ((Locale) createInstance("java.util.Locale"));
        expected[859] = locale859;
        Locale locale860 = ((Locale) createInstance("java.util.Locale"));
        expected[860] = locale860;
        Locale locale861 = ((Locale) createInstance("java.util.Locale"));
        expected[861] = locale861;
        Locale locale862 = ((Locale) createInstance("java.util.Locale"));
        expected[862] = locale862;
        Locale locale863 = ((Locale) createInstance("java.util.Locale"));
        expected[863] = locale863;
        Locale locale864 = ((Locale) createInstance("java.util.Locale"));
        expected[864] = locale864;
        Locale locale865 = ((Locale) createInstance("java.util.Locale"));
        expected[865] = locale865;
        Locale locale866 = ((Locale) createInstance("java.util.Locale"));
        expected[866] = locale866;
        Locale locale867 = ((Locale) createInstance("java.util.Locale"));
        expected[867] = locale867;
        Locale locale868 = ((Locale) createInstance("java.util.Locale"));
        expected[868] = locale868;
        Locale locale869 = ((Locale) createInstance("java.util.Locale"));
        expected[869] = locale869;
        Locale locale870 = ((Locale) createInstance("java.util.Locale"));
        expected[870] = locale870;
        Locale locale871 = ((Locale) createInstance("java.util.Locale"));
        expected[871] = locale871;
        Locale locale872 = ((Locale) createInstance("java.util.Locale"));
        expected[872] = locale872;
        Locale locale873 = ((Locale) createInstance("java.util.Locale"));
        expected[873] = locale873;
        Locale locale874 = ((Locale) createInstance("java.util.Locale"));
        expected[874] = locale874;
        Locale locale875 = ((Locale) createInstance("java.util.Locale"));
        expected[875] = locale875;
        Locale locale876 = ((Locale) createInstance("java.util.Locale"));
        expected[876] = locale876;
        Locale locale877 = ((Locale) createInstance("java.util.Locale"));
        expected[877] = locale877;
        Locale locale878 = ((Locale) createInstance("java.util.Locale"));
        expected[878] = locale878;
        Locale locale879 = ((Locale) createInstance("java.util.Locale"));
        expected[879] = locale879;
        Locale locale880 = ((Locale) createInstance("java.util.Locale"));
        expected[880] = locale880;
        Locale locale881 = ((Locale) createInstance("java.util.Locale"));
        expected[881] = locale881;
        Locale locale882 = ((Locale) createInstance("java.util.Locale"));
        expected[882] = locale882;
        Locale locale883 = ((Locale) createInstance("java.util.Locale"));
        expected[883] = locale883;
        Locale locale884 = ((Locale) createInstance("java.util.Locale"));
        expected[884] = locale884;
        Locale locale885 = ((Locale) createInstance("java.util.Locale"));
        expected[885] = locale885;
        Locale locale886 = ((Locale) createInstance("java.util.Locale"));
        expected[886] = locale886;
        Locale locale887 = ((Locale) createInstance("java.util.Locale"));
        expected[887] = locale887;
        Locale locale888 = ((Locale) createInstance("java.util.Locale"));
        expected[888] = locale888;
        Locale locale889 = ((Locale) createInstance("java.util.Locale"));
        expected[889] = locale889;
        Locale locale890 = ((Locale) createInstance("java.util.Locale"));
        expected[890] = locale890;
        Locale locale891 = ((Locale) createInstance("java.util.Locale"));
        expected[891] = locale891;
        Locale locale892 = ((Locale) createInstance("java.util.Locale"));
        expected[892] = locale892;
        Locale locale893 = ((Locale) createInstance("java.util.Locale"));
        expected[893] = locale893;
        Locale locale894 = ((Locale) createInstance("java.util.Locale"));
        expected[894] = locale894;
        Locale locale895 = ((Locale) createInstance("java.util.Locale"));
        expected[895] = locale895;
        Locale locale896 = ((Locale) createInstance("java.util.Locale"));
        expected[896] = locale896;
        Locale locale897 = ((Locale) createInstance("java.util.Locale"));
        expected[897] = locale897;
        Locale locale898 = ((Locale) createInstance("java.util.Locale"));
        expected[898] = locale898;
        Locale locale899 = ((Locale) createInstance("java.util.Locale"));
        expected[899] = locale899;
        Locale locale900 = ((Locale) createInstance("java.util.Locale"));
        expected[900] = locale900;
        Locale locale901 = ((Locale) createInstance("java.util.Locale"));
        expected[901] = locale901;
        Locale locale902 = ((Locale) createInstance("java.util.Locale"));
        expected[902] = locale902;
        Locale locale903 = ((Locale) createInstance("java.util.Locale"));
        expected[903] = locale903;
        Locale locale904 = ((Locale) createInstance("java.util.Locale"));
        expected[904] = locale904;
        Locale locale905 = ((Locale) createInstance("java.util.Locale"));
        expected[905] = locale905;
        Locale locale906 = ((Locale) createInstance("java.util.Locale"));
        expected[906] = locale906;
        Locale locale907 = ((Locale) createInstance("java.util.Locale"));
        expected[907] = locale907;
        Locale locale908 = ((Locale) createInstance("java.util.Locale"));
        expected[908] = locale908;
        Locale locale909 = ((Locale) createInstance("java.util.Locale"));
        expected[909] = locale909;
        Locale locale910 = ((Locale) createInstance("java.util.Locale"));
        expected[910] = locale910;
        Locale locale911 = ((Locale) createInstance("java.util.Locale"));
        expected[911] = locale911;
        Locale locale912 = ((Locale) createInstance("java.util.Locale"));
        expected[912] = locale912;
        Locale locale913 = ((Locale) createInstance("java.util.Locale"));
        expected[913] = locale913;
        Locale locale914 = ((Locale) createInstance("java.util.Locale"));
        expected[914] = locale914;
        Locale locale915 = ((Locale) createInstance("java.util.Locale"));
        expected[915] = locale915;
        Locale locale916 = ((Locale) createInstance("java.util.Locale"));
        expected[916] = locale916;
        Locale locale917 = ((Locale) createInstance("java.util.Locale"));
        expected[917] = locale917;
        Locale locale918 = ((Locale) createInstance("java.util.Locale"));
        expected[918] = locale918;
        Locale locale919 = ((Locale) createInstance("java.util.Locale"));
        expected[919] = locale919;
        Locale locale920 = ((Locale) createInstance("java.util.Locale"));
        expected[920] = locale920;
        Locale locale921 = ((Locale) createInstance("java.util.Locale"));
        expected[921] = locale921;
        Locale locale922 = ((Locale) createInstance("java.util.Locale"));
        expected[922] = locale922;
        Locale locale923 = ((Locale) createInstance("java.util.Locale"));
        expected[923] = locale923;
        Locale locale924 = ((Locale) createInstance("java.util.Locale"));
        expected[924] = locale924;
        Locale locale925 = ((Locale) createInstance("java.util.Locale"));
        expected[925] = locale925;
        Locale locale926 = ((Locale) createInstance("java.util.Locale"));
        expected[926] = locale926;
        Locale locale927 = ((Locale) createInstance("java.util.Locale"));
        expected[927] = locale927;
        Locale locale928 = ((Locale) createInstance("java.util.Locale"));
        expected[928] = locale928;
        Locale locale929 = ((Locale) createInstance("java.util.Locale"));
        expected[929] = locale929;
        Locale locale930 = ((Locale) createInstance("java.util.Locale"));
        expected[930] = locale930;
        Locale locale931 = ((Locale) createInstance("java.util.Locale"));
        expected[931] = locale931;
        Locale locale932 = ((Locale) createInstance("java.util.Locale"));
        expected[932] = locale932;
        Locale locale933 = ((Locale) createInstance("java.util.Locale"));
        expected[933] = locale933;
        Locale locale934 = ((Locale) createInstance("java.util.Locale"));
        expected[934] = locale934;
        Locale locale935 = ((Locale) createInstance("java.util.Locale"));
        expected[935] = locale935;
        Locale locale936 = ((Locale) createInstance("java.util.Locale"));
        expected[936] = locale936;
        Locale locale937 = ((Locale) createInstance("java.util.Locale"));
        expected[937] = locale937;
        Locale locale938 = ((Locale) createInstance("java.util.Locale"));
        expected[938] = locale938;
        Locale locale939 = ((Locale) createInstance("java.util.Locale"));
        expected[939] = locale939;
        Locale locale940 = ((Locale) createInstance("java.util.Locale"));
        expected[940] = locale940;
        Locale locale941 = ((Locale) createInstance("java.util.Locale"));
        expected[941] = locale941;
        Locale locale942 = ((Locale) createInstance("java.util.Locale"));
        expected[942] = locale942;
        Locale locale943 = ((Locale) createInstance("java.util.Locale"));
        expected[943] = locale943;
        Locale locale944 = ((Locale) createInstance("java.util.Locale"));
        expected[944] = locale944;
        Locale locale945 = ((Locale) createInstance("java.util.Locale"));
        expected[945] = locale945;
        Locale locale946 = ((Locale) createInstance("java.util.Locale"));
        expected[946] = locale946;
        Locale locale947 = ((Locale) createInstance("java.util.Locale"));
        expected[947] = locale947;
        Locale locale948 = ((Locale) createInstance("java.util.Locale"));
        expected[948] = locale948;
        Locale locale949 = ((Locale) createInstance("java.util.Locale"));
        expected[949] = locale949;
        Locale locale950 = ((Locale) createInstance("java.util.Locale"));
        expected[950] = locale950;
        Locale locale951 = ((Locale) createInstance("java.util.Locale"));
        expected[951] = locale951;
        Locale locale952 = ((Locale) createInstance("java.util.Locale"));
        expected[952] = locale952;
        Locale locale953 = ((Locale) createInstance("java.util.Locale"));
        expected[953] = locale953;
        Locale locale954 = ((Locale) createInstance("java.util.Locale"));
        expected[954] = locale954;
        Locale locale955 = ((Locale) createInstance("java.util.Locale"));
        expected[955] = locale955;
        Locale locale956 = ((Locale) createInstance("java.util.Locale"));
        expected[956] = locale956;
        Locale locale957 = ((Locale) createInstance("java.util.Locale"));
        expected[957] = locale957;
        Locale locale958 = ((Locale) createInstance("java.util.Locale"));
        expected[958] = locale958;
        Locale locale959 = ((Locale) createInstance("java.util.Locale"));
        expected[959] = locale959;
        Locale locale960 = ((Locale) createInstance("java.util.Locale"));
        expected[960] = locale960;
        Locale locale961 = ((Locale) createInstance("java.util.Locale"));
        expected[961] = locale961;
        Locale locale962 = ((Locale) createInstance("java.util.Locale"));
        expected[962] = locale962;
        Locale locale963 = ((Locale) createInstance("java.util.Locale"));
        expected[963] = locale963;
        Locale locale964 = ((Locale) createInstance("java.util.Locale"));
        expected[964] = locale964;
        Locale locale965 = ((Locale) createInstance("java.util.Locale"));
        expected[965] = locale965;
        Locale locale966 = ((Locale) createInstance("java.util.Locale"));
        expected[966] = locale966;
        Locale locale967 = ((Locale) createInstance("java.util.Locale"));
        expected[967] = locale967;
        Locale locale968 = ((Locale) createInstance("java.util.Locale"));
        expected[968] = locale968;
        Locale locale969 = ((Locale) createInstance("java.util.Locale"));
        expected[969] = locale969;
        Locale locale970 = ((Locale) createInstance("java.util.Locale"));
        expected[970] = locale970;
        Locale locale971 = ((Locale) createInstance("java.util.Locale"));
        expected[971] = locale971;
        Locale locale972 = ((Locale) createInstance("java.util.Locale"));
        expected[972] = locale972;
        Locale locale973 = ((Locale) createInstance("java.util.Locale"));
        expected[973] = locale973;
        Locale locale974 = ((Locale) createInstance("java.util.Locale"));
        expected[974] = locale974;
        Locale locale975 = ((Locale) createInstance("java.util.Locale"));
        expected[975] = locale975;
        Locale locale976 = ((Locale) createInstance("java.util.Locale"));
        expected[976] = locale976;
        Locale locale977 = ((Locale) createInstance("java.util.Locale"));
        expected[977] = locale977;
        Locale locale978 = ((Locale) createInstance("java.util.Locale"));
        expected[978] = locale978;
        Locale locale979 = ((Locale) createInstance("java.util.Locale"));
        expected[979] = locale979;
        Locale locale980 = ((Locale) createInstance("java.util.Locale"));
        expected[980] = locale980;
        Locale locale981 = ((Locale) createInstance("java.util.Locale"));
        expected[981] = locale981;
        Locale locale982 = ((Locale) createInstance("java.util.Locale"));
        expected[982] = locale982;
        Locale locale983 = ((Locale) createInstance("java.util.Locale"));
        expected[983] = locale983;
        Locale locale984 = ((Locale) createInstance("java.util.Locale"));
        expected[984] = locale984;
        Locale locale985 = ((Locale) createInstance("java.util.Locale"));
        expected[985] = locale985;
        Locale locale986 = ((Locale) createInstance("java.util.Locale"));
        expected[986] = locale986;
        Locale locale987 = ((Locale) createInstance("java.util.Locale"));
        expected[987] = locale987;
        Locale locale988 = ((Locale) createInstance("java.util.Locale"));
        expected[988] = locale988;
        Locale locale989 = ((Locale) createInstance("java.util.Locale"));
        expected[989] = locale989;
        Locale locale990 = ((Locale) createInstance("java.util.Locale"));
        expected[990] = locale990;
        Locale locale991 = ((Locale) createInstance("java.util.Locale"));
        expected[991] = locale991;
        Locale locale992 = ((Locale) createInstance("java.util.Locale"));
        expected[992] = locale992;
        Locale locale993 = ((Locale) createInstance("java.util.Locale"));
        expected[993] = locale993;
        Locale locale994 = ((Locale) createInstance("java.util.Locale"));
        expected[994] = locale994;
        Locale locale995 = ((Locale) createInstance("java.util.Locale"));
        expected[995] = locale995;
        Locale locale996 = ((Locale) createInstance("java.util.Locale"));
        expected[996] = locale996;
        Locale locale997 = ((Locale) createInstance("java.util.Locale"));
        expected[997] = locale997;
        Locale locale998 = ((Locale) createInstance("java.util.Locale"));
        expected[998] = locale998;
        Locale locale999 = ((Locale) createInstance("java.util.Locale"));
        expected[999] = locale999;
        Locale locale1000 = ((Locale) createInstance("java.util.Locale"));
        expected[1000] = locale1000;
        Locale locale1001 = ((Locale) createInstance("java.util.Locale"));
        expected[1001] = locale1001;
        Locale locale1002 = ((Locale) createInstance("java.util.Locale"));
        expected[1002] = locale1002;
        Locale locale1003 = ((Locale) createInstance("java.util.Locale"));
        expected[1003] = locale1003;
        Locale locale1004 = ((Locale) createInstance("java.util.Locale"));
        expected[1004] = locale1004;
        Locale locale1005 = ((Locale) createInstance("java.util.Locale"));
        expected[1005] = locale1005;
        Locale locale1006 = ((Locale) createInstance("java.util.Locale"));
        expected[1006] = locale1006;
        Locale locale1007 = ((Locale) createInstance("java.util.Locale"));
        expected[1007] = locale1007;
        Locale locale1008 = ((Locale) createInstance("java.util.Locale"));
        expected[1008] = locale1008;
        Locale locale1009 = ((Locale) createInstance("java.util.Locale"));
        expected[1009] = locale1009;
        Locale locale1010 = ((Locale) createInstance("java.util.Locale"));
        expected[1010] = locale1010;
        Locale locale1011 = ((Locale) createInstance("java.util.Locale"));
        expected[1011] = locale1011;
        Locale locale1012 = ((Locale) createInstance("java.util.Locale"));
        expected[1012] = locale1012;
        Locale locale1013 = ((Locale) createInstance("java.util.Locale"));
        expected[1013] = locale1013;
        Locale locale1014 = ((Locale) createInstance("java.util.Locale"));
        expected[1014] = locale1014;
        Locale locale1015 = ((Locale) createInstance("java.util.Locale"));
        expected[1015] = locale1015;
        Locale locale1016 = ((Locale) createInstance("java.util.Locale"));
        expected[1016] = locale1016;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    */
    }
    ///endregion
    
    ///region Errors report for getAvailableLocales
    
    public void testGetAvailableLocales_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleServiceProviderPool.poolOfPools accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.parseNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNumber(java.lang.String,java.text.NumberFormat,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link java.text.NumberFormat#parse(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number number = format.parse(source, pos);
 *  */
    @Test
    public void testParseNumber_ThrowNullPointerException_1() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNumber] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class numberFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, numberFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = ((Object) null);
        parseNumberMethodArguments[1] = ((Object) null);
        parseNumberMethodArguments[2] = parsePosition;
        try {
            parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNumber(java.lang.String,java.text.NumberFormat,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int startIndex = pos.getIndex();
 *  */
    @Test
    public void testParseNumber_ThrowNullPointerException() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNumber] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:471) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class numberFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, numberFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = ((Object) null);
        parseNumberMethodArguments[1] = ((Object) null);
        parseNumberMethodArguments[2] = ((Object) null);
        try {
            parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)
    
    @Test
    public void testParseNumber1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\u0000\u0000";
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[1];
        String string1 = "";
        choiceFormats[0] = string1;
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(3);
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class choiceFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, choiceFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = string;
        parseNumberMethodArguments[1] = choiceFormat;
        parseNumberMethodArguments[2] = parsePosition;
        Number actual = ((Number) parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments));
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(3, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParseNumber2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[1];
        choiceFormats[0] = string;
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class choiceFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, choiceFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = string;
        parseNumberMethodArguments[1] = choiceFormat;
        parseNumberMethodArguments[2] = parsePosition;
        Number actual = ((Number) parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments));
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParseNumber3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\u0000";
        DecimalFormat decimalFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        symbols.setNaN(string);
        setField(decimalFormat, "java.text.DecimalFormat", "symbols", symbols);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class decimalFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, decimalFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = string;
        parseNumberMethodArguments[1] = decimalFormat;
        parseNumberMethodArguments[2] = parsePosition;
        Double actual = ((Double) parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments));
        
        Double expected = java.lang.Double.NaN;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)
    
    @Test
    public void testParseNumber4() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        parsePosition.setErrorIndex(-252);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNumber] produces [java.lang.StringIndexOutOfBoundsException: begin -255, end -250, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:451)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:480) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class choiceFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, choiceFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = string;
        parseNumberMethodArguments[1] = choiceFormat;
        parseNumberMethodArguments[2] = parsePosition;
        try {
            parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseNumber5() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string1 = "";
        choiceFormats[0] = string1;
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNumber] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class choiceFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, choiceFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = string;
        parseNumberMethodArguments[1] = choiceFormat;
        parseNumberMethodArguments[2] = parsePosition;
        try {
            parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseNumber6() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\u0000\u0000";
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string1 = "";
        choiceFormats[0] = string1;
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(3);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNumber] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class choiceFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, choiceFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = string;
        parseNumberMethodArguments[1] = choiceFormat;
        parseNumberMethodArguments[2] = parsePosition;
        try {
            parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseNumber7() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\u0000\u0000";
        DecimalFormat decimalFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        decimalFormat.setPositivePrefix(positivePrefix);
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        symbols.setNaN(positivePrefix);
        setField(decimalFormat, "java.text.DecimalFormat", "symbols", symbols);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(3);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNumber] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2297)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class decimalFormatType = Class.forName("java.text.NumberFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, decimalFormatType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = string;
        parseNumberMethodArguments[1] = decimalFormat;
        parseNumberMethodArguments[2] = parsePosition;
        try {
            parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.parseNumber
    
    ///region OTHER: ERROR SUITE for method parseNumber(java.lang.String, double, java.text.ParsePosition)
    
    @Test
    public void testParseNumber8() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNumber] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:448) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class doubleType = double.class;
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNumberMethod = complexFormatClazz.getDeclaredMethod("parseNumber", stringType, doubleType, parsePositionType);
        parseNumberMethod.setAccessible(true);
        java.lang.Object[] parseNumberMethodArguments = new java.lang.Object[3];
        parseNumberMethodArguments[0] = string;
        parseNumberMethodArguments[1] = java.lang.Double.NaN;
        parseNumberMethodArguments[2] = ((Object) null);
        try {
            parseNumberMethod.invoke(complexFormat, parseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.parseObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseObject(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowStringIndexOutOfBoundsException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:418)
            org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(ComplexFormat.java:399)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:324)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowNullPointerException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:412)
            org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(ComplexFormat.java:399)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:324)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(null, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowNullPointerException_1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowNullPointerException_2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "! ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseObject(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parse(source, pos);
 *  */
    @Test
    public void testParseObject_ThrowNullPointerException_3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\r";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseObject(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParseObject1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1073741824);
        
        Object actual = complexFormat.parseObject(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1073741823, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParseObject2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\n ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Object actual = complexFormat.parseObject(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParseObject3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\n";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Object actual = complexFormat.parseObject(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void testParseObject4() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Object actual = complexFormat.parseObject(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(1, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParseObject5() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(10);
        
        Object actual = complexFormat.parseObject(string, parsePosition);
        
        assertNull(actual);
        
        int finalParsePositionErrorIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "errorIndex"));
        
        assertEquals(11, finalParsePositionErrorIndex);
    }
    
    @Test
    public void testParseObject6() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = {};
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Object actual = complexFormat.parseObject(string, parsePosition);
        
        assertNull(actual);
    }
    
    @Test
    public void testParseObject7() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = " ";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Complex actual = ((Complex) complexFormat.parseObject(naN, parsePosition));
        
        Complex expected = new Complex(java.lang.Double.NaN, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testParseObject8() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\t";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Complex actual = ((Complex) complexFormat.parseObject(naN, parsePosition));
        
        Complex expected = new Complex(java.lang.Double.NaN, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    
    @Test
    public void testParseObject9() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000\u0000";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Complex actual = ((Complex) complexFormat.parseObject(naN, parsePosition));
        
        Complex expected = new Complex(java.lang.Double.NaN, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(2, finalParsePositionIndex);
    }
    
    @Test
    public void testParseObject10() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\r\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(8);
        
        Object actual = complexFormat.parseObject(string, parsePosition);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseObject(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParseObject11() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject12() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "$";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject13() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        CompactNumberFormat realFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "                               ` ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(30);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.CompactNumberFormat.expandAffixPatterns(CompactNumberFormat.java:1464)
            java.base/java.text.CompactNumberFormat.parse(CompactNumberFormat.java:1544)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject14() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        complexFormat.setRealFormat(realFormat);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\t";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(30);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:439)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject15() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "";
        choiceFormats[0] = string;
        String string1 = "";
        choiceFormats[1] = string1;
        choiceFormats[2] = string1;
        choiceFormats[3] = string1;
        choiceFormats[4] = string1;
        choiceFormats[5] = string1;
        choiceFormats[6] = string1;
        choiceFormats[7] = string1;
        choiceFormats[8] = string1;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject16() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1073741824);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject17() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject18() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(8);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject19() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\f";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:443)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject20() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat realFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        java.lang.String[] choiceFormats = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n";
        choiceFormats[0] = string;
        setField(realFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(8);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.ChoiceFormat.parse(ChoiceFormat.java:441)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject21() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(8);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2295)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(naN, parsePosition);
    }
    
    @Test
    public void testParseObject22() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 ";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(8);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2295)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(naN, parsePosition);
    }
    
    @Test
    public void testParseObject23() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        String string = "\n\n";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2143)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject24() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        realFormat.setPositivePrefix(positivePrefix);
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        symbols.setNaN(positivePrefix);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2297)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(string, parsePosition);
    }
    
    @Test
    public void testParseObject25() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        DecimalFormat realFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        String positivePrefix = "";
        realFormat.setPositivePrefix(positivePrefix);
        DecimalFormatSymbols symbols = ((DecimalFormatSymbols) createInstance("java.text.DecimalFormatSymbols"));
        String naN = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\t";
        symbols.setNaN(naN);
        setField(realFormat, "java.text.DecimalFormat", "symbols", symbols);
        complexFormat.setRealFormat(realFormat);
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(8);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseObject] produces [java.lang.NullPointerException]
            java.base/java.text.DecimalFormat.subparse(DecimalFormat.java:2297)
            java.base/java.text.DecimalFormat.parse(DecimalFormat.java:2149)
            org.apache.commons.math.complex.ComplexFormat.parseNumber(ComplexFormat.java:472)
            org.apache.commons.math.complex.ComplexFormat.parse(ComplexFormat.java:327)
            org.apache.commons.math.complex.ComplexFormat.parseObject(ComplexFormat.java:499) */
        complexFormat.parseObject(naN, parsePosition);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.formatComplex
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method formatComplex(org.apache.commons.math.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.ComplexFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#formatComplex(org.apache.commons.math.complex.Complex)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatComplexThrowsIAE() {
        ComplexFormat.formatComplex(null);
    }
    ///endregion
    
    ///region Errors report for formatComplex
    
    public void testFormatComplex_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.formatDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatDouble(double, java.text.NumberFormat, java.lang.StringBuffer, java.text.FieldPosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#formatDouble(double,java.text.NumberFormat,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (Double.isNaN(value) || Double.isInfinite(value)): True}
 * @utbot.executesCondition {@code (if (Double.isNaN(value) || Double.isInfinite(value)) {
 *     toAppendTo.append('(');
 *     toAppendTo.append(value);
 *     toAppendTo.append(')');
 * } else {
 *     format.format(value, toAppendTo, pos);
 * }): False}
 * @utbot.invokes {@link java.text.NumberFormat#format(double,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: format.format(value, toAppendTo, pos);
 *  */
    @Test
    public void testFormatDouble_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        double[] choiceLimits = {3.953254392215444E-307};
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceLimits", choiceLimits);
        java.lang.String[] choiceFormats = {};
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.formatDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.ChoiceFormat.format(ChoiceFormat.java:415)
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:216) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class doubleType = double.class;
        Class choiceFormatType = Class.forName("java.text.NumberFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class fieldPositionType = Class.forName("java.text.FieldPosition");
        Method formatDoubleMethod = complexFormatClazz.getDeclaredMethod("formatDouble", doubleType, choiceFormatType, stringBufferType, fieldPositionType);
        formatDoubleMethod.setAccessible(true);
        java.lang.Object[] formatDoubleMethodArguments = new java.lang.Object[4];
        formatDoubleMethodArguments[0] = -7.787926419594255E-154;
        formatDoubleMethodArguments[1] = choiceFormat;
        formatDoubleMethodArguments[2] = ((Object) null);
        formatDoubleMethodArguments[3] = ((Object) null);
        try {
            formatDoubleMethod.invoke(complexFormat, formatDoubleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#formatDouble(double,java.text.NumberFormat,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (Double.isNaN(value) || Double.isInfinite(value)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: toAppendTo.append('(');
 *  */
    @Test
    public void testFormatDouble_ThrowNullPointerException() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.formatDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:212) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class doubleType = double.class;
        Class numberFormatType = Class.forName("java.text.NumberFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class fieldPositionType = Class.forName("java.text.FieldPosition");
        Method formatDoubleMethod = complexFormatClazz.getDeclaredMethod("formatDouble", doubleType, numberFormatType, stringBufferType, fieldPositionType);
        formatDoubleMethod.setAccessible(true);
        java.lang.Object[] formatDoubleMethodArguments = new java.lang.Object[4];
        formatDoubleMethodArguments[0] = java.lang.Double.NaN;
        formatDoubleMethodArguments[1] = ((Object) null);
        formatDoubleMethodArguments[2] = ((Object) null);
        formatDoubleMethodArguments[3] = ((Object) null);
        try {
            formatDoubleMethod.invoke(complexFormat, formatDoubleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#formatDouble(double,java.text.NumberFormat,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (Double.isNaN(value) || Double.isInfinite(value)): True}
 * @utbot.executesCondition {@code (if (Double.isNaN(value) || Double.isInfinite(value)) {
 *     toAppendTo.append('(');
 *     toAppendTo.append(value);
 *     toAppendTo.append(')');
 * } else {
 *     format.format(value, toAppendTo, pos);
 * }): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: toAppendTo.append('(');
 *  */
    @Test
    public void testFormatDouble_ThrowNullPointerException_1() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.formatDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:212) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class doubleType = double.class;
        Class numberFormatType = Class.forName("java.text.NumberFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class fieldPositionType = Class.forName("java.text.FieldPosition");
        Method formatDoubleMethod = complexFormatClazz.getDeclaredMethod("formatDouble", doubleType, numberFormatType, stringBufferType, fieldPositionType);
        formatDoubleMethod.setAccessible(true);
        java.lang.Object[] formatDoubleMethodArguments = new java.lang.Object[4];
        formatDoubleMethodArguments[0] = java.lang.Double.POSITIVE_INFINITY;
        formatDoubleMethodArguments[1] = ((Object) null);
        formatDoubleMethodArguments[2] = ((Object) null);
        formatDoubleMethodArguments[3] = ((Object) null);
        try {
            formatDoubleMethod.invoke(complexFormat, formatDoubleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#formatDouble(double,java.text.NumberFormat,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.executesCondition {@code (Double.isNaN(value) || Double.isInfinite(value)): True}
 * @utbot.executesCondition {@code (if (Double.isNaN(value) || Double.isInfinite(value)) {
 *     toAppendTo.append('(');
 *     toAppendTo.append(value);
 *     toAppendTo.append(')');
 * } else {
 *     format.format(value, toAppendTo, pos);
 * }): False}
 * @utbot.invokes {@link java.text.NumberFormat#format(double,java.lang.StringBuffer,java.text.FieldPosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: format.format(value, toAppendTo, pos);
 *  */
    @Test
    public void testFormatDouble_ThrowNullPointerException_2() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.formatDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.formatDouble(ComplexFormat.java:216) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class doubleType = double.class;
        Class numberFormatType = Class.forName("java.text.NumberFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class fieldPositionType = Class.forName("java.text.FieldPosition");
        Method formatDoubleMethod = complexFormatClazz.getDeclaredMethod("formatDouble", doubleType, numberFormatType, stringBufferType, fieldPositionType);
        formatDoubleMethod.setAccessible(true);
        java.lang.Object[] formatDoubleMethodArguments = new java.lang.Object[4];
        formatDoubleMethodArguments[0] = 2.2946074165855514E-308;
        formatDoubleMethodArguments[1] = ((Object) null);
        formatDoubleMethodArguments[2] = ((Object) null);
        formatDoubleMethodArguments[3] = ((Object) null);
        try {
            formatDoubleMethod.invoke(complexFormat, formatDoubleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatDouble(double, java.text.NumberFormat, java.lang.StringBuffer, java.text.FieldPosition)
    
    @Test
    public void testFormatDouble1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        StringBuffer stringBuffer = new StringBuffer("");
        Object dontCareFieldPosition = createInstance("java.text.DontCareFieldPosition");
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class doubleType = double.class;
        Class choiceFormatType = Class.forName("java.text.NumberFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class dontCareFieldPositionType = Class.forName("java.text.FieldPosition");
        Method formatDoubleMethod = complexFormatClazz.getDeclaredMethod("formatDouble", doubleType, choiceFormatType, stringBufferType, dontCareFieldPositionType);
        formatDoubleMethod.setAccessible(true);
        java.lang.Object[] formatDoubleMethodArguments = new java.lang.Object[4];
        formatDoubleMethodArguments[0] = java.lang.Double.NEGATIVE_INFINITY;
        formatDoubleMethodArguments[1] = choiceFormat;
        formatDoubleMethodArguments[2] = stringBuffer;
        formatDoubleMethodArguments[3] = dontCareFieldPosition;
        StringBuffer actual = ((StringBuffer) formatDoubleMethod.invoke(complexFormat, formatDoubleMethodArguments));
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        value[0] = (byte) 40;
        value[1] = (byte) 45;
        value[2] = (byte) 73;
        value[3] = (byte) 110;
        value[4] = (byte) 102;
        value[5] = (byte) 105;
        value[6] = (byte) 110;
        value[7] = (byte) 105;
        value[8] = (byte) 116;
        value[9] = (byte) 121;
        value[10] = (byte) 41;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 11);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
    }
    
    @Test
    public void testFormatDouble2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        StringBuffer stringBuffer = new StringBuffer("");
        Object dontCareFieldPosition = createInstance("java.text.DontCareFieldPosition");
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class doubleType = double.class;
        Class numberFormatType = Class.forName("java.text.NumberFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class dontCareFieldPositionType = Class.forName("java.text.FieldPosition");
        Method formatDoubleMethod = complexFormatClazz.getDeclaredMethod("formatDouble", doubleType, numberFormatType, stringBufferType, dontCareFieldPositionType);
        formatDoubleMethod.setAccessible(true);
        java.lang.Object[] formatDoubleMethodArguments = new java.lang.Object[4];
        formatDoubleMethodArguments[0] = java.lang.Double.NaN;
        formatDoubleMethodArguments[1] = ((Object) null);
        formatDoubleMethodArguments[2] = stringBuffer;
        formatDoubleMethodArguments[3] = dontCareFieldPosition;
        StringBuffer actual = ((StringBuffer) formatDoubleMethod.invoke(complexFormat, formatDoubleMethodArguments));
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        value[0] = (byte) 40;
        value[1] = (byte) 78;
        value[2] = (byte) 97;
        value[3] = (byte) 78;
        value[4] = (byte) 41;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 5);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
    }
    
    @Test
    public void testFormatDouble3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        double[] choiceLimits = {};
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceLimits", choiceLimits);
        java.lang.String[] choiceFormats = {null};
        setField(choiceFormat, "java.text.ChoiceFormat", "choiceFormats", choiceFormats);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class doubleType = double.class;
        Class choiceFormatType = Class.forName("java.text.NumberFormat");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class fieldPositionType = Class.forName("java.text.FieldPosition");
        Method formatDoubleMethod = complexFormatClazz.getDeclaredMethod("formatDouble", doubleType, choiceFormatType, stringBufferType, fieldPositionType);
        formatDoubleMethod.setAccessible(true);
        java.lang.Object[] formatDoubleMethodArguments = new java.lang.Object[4];
        formatDoubleMethodArguments[0] = 7.291122019556399E-304;
        formatDoubleMethodArguments[1] = choiceFormat;
        formatDoubleMethodArguments[2] = stringBuffer;
        formatDoubleMethodArguments[3] = ((Object) null);
        StringBuffer actual = ((StringBuffer) formatDoubleMethod.invoke(complexFormat, formatDoubleMethodArguments));
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[17];
        value[1] = (byte) 110;
        value[2] = (byte) 117;
        value[3] = (byte) 108;
        value[4] = (byte) 108;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 5);
        
        String actualToStringCache = ((String) getFieldValue(actual, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualToStringCache);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
        java.lang.String[] choiceFormatChoiceFormats = ((java.lang.String[]) getFieldValue(choiceFormat, "java.text.ChoiceFormat", "choiceFormats"));
        String finalChoiceFormatChoiceFormats0 = ((String) get(choiceFormatChoiceFormats, 0));
        
        assertNull(finalChoiceFormatChoiceFormats0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.setRealFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRealFormat(java.text.NumberFormat)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#setRealFormat(java.text.NumberFormat)}
 * @utbot.executesCondition {@code (realFormat == null): False}
 *  */
    @Test
    public void testSetRealFormat_RealFormatNotEqualsNull() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        
        NumberFormat initialComplexFormatRealFormat = ((NumberFormat) getFieldValue(complexFormat, "org.apache.commons.math.complex.ComplexFormat", "realFormat"));
        
        complexFormat.setRealFormat(choiceFormat);
        
        NumberFormat finalComplexFormatRealFormat = ((NumberFormat) getFieldValue(complexFormat, "org.apache.commons.math.complex.ComplexFormat", "realFormat"));
        
        assertFalse(initialComplexFormatRealFormat == finalComplexFormatRealFormat);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRealFormat(java.text.NumberFormat)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#setRealFormat(java.text.NumberFormat)}
 * @utbot.executesCondition {@code (realFormat == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: realFormat == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRealFormat_ThrowIllegalArgumentException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        complexFormat.setRealFormat(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.setImaginaryFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setImaginaryFormat(java.text.NumberFormat)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#setImaginaryFormat(java.text.NumberFormat)}
 * @utbot.executesCondition {@code (imaginaryFormat == null): False}
 *  */
    @Test
    public void testSetImaginaryFormat_ImaginaryFormatNotEqualsNull() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ChoiceFormat choiceFormat = ((ChoiceFormat) createInstance("java.text.ChoiceFormat"));
        
        NumberFormat initialComplexFormatImaginaryFormat = ((NumberFormat) getFieldValue(complexFormat, "org.apache.commons.math.complex.ComplexFormat", "imaginaryFormat"));
        
        complexFormat.setImaginaryFormat(choiceFormat);
        
        NumberFormat finalComplexFormatImaginaryFormat = ((NumberFormat) getFieldValue(complexFormat, "org.apache.commons.math.complex.ComplexFormat", "imaginaryFormat"));
        
        assertFalse(initialComplexFormatImaginaryFormat == finalComplexFormatImaginaryFormat);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setImaginaryFormat(java.text.NumberFormat)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#setImaginaryFormat(java.text.NumberFormat)}
 * @utbot.executesCondition {@code (imaginaryFormat == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: imaginaryFormat == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryFormat_ThrowIllegalArgumentException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        complexFormat.setImaginaryFormat(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.parseNextCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method parseNextCharacter(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNextCharacter(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (index < n): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testParseNextCharacter_IndexGreaterOrEqualN() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNextCharacterMethod = complexFormatClazz.getDeclaredMethod("parseNextCharacter", stringType, parsePositionType);
        parseNextCharacterMethod.setAccessible(true);
        java.lang.Object[] parseNextCharacterMethodArguments = new java.lang.Object[2];
        parseNextCharacterMethodArguments[0] = string;
        parseNextCharacterMethodArguments[1] = parsePosition;
        char actual = ((Character) parseNextCharacterMethod.invoke(complexFormat, parseNextCharacterMethodArguments));
        
        assertEquals('\u0000', actual);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNextCharacter(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (index < n): True}
 * @utbot.executesCondition {@code (Character.isWhitespace(c) && index < n): True}
 * @utbot.executesCondition {@code (Character.isWhitespace(c) && index < n): False}
 * @utbot.executesCondition {@code (Character.isWhitespace(c) && index < n): False}
 * @utbot.executesCondition {@code (index < n): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.Character#isWhitespace(char)}
 * @utbot.invokes {@link java.text.ParsePosition#setIndex(int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testParseNextCharacter_IndexGreaterOrEqualN_1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\f!";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNextCharacterMethod = complexFormatClazz.getDeclaredMethod("parseNextCharacter", stringType, parsePositionType);
        parseNextCharacterMethod.setAccessible(true);
        java.lang.Object[] parseNextCharacterMethodArguments = new java.lang.Object[2];
        parseNextCharacterMethodArguments[0] = string;
        parseNextCharacterMethodArguments[1] = parsePosition;
        char actual = ((Character) parseNextCharacterMethod.invoke(complexFormat, parseNextCharacterMethodArguments));
        
        assertEquals('\u0000', actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(2, finalParsePositionIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method parseNextCharacter(java.lang.String, java.text.ParsePosition)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (index < n): True}
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} once,
    ///     {@link java.lang.Character#isWhitespace(char)} once,
    ///     {@link java.text.ParsePosition#setIndex(int)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNextCharacter(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (Character.isWhitespace(c) && index < n): True}
 * @utbot.executesCondition {@code (Character.isWhitespace(c) && index < n): True}
 * @utbot.executesCondition {@code (index < n): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testParseNextCharacter_CharacterIsWhitespaceAndIndexGreaterOrEqualN() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\t";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNextCharacterMethod = complexFormatClazz.getDeclaredMethod("parseNextCharacter", stringType, parsePositionType);
        parseNextCharacterMethod.setAccessible(true);
        java.lang.Object[] parseNextCharacterMethodArguments = new java.lang.Object[2];
        parseNextCharacterMethodArguments[0] = string;
        parseNextCharacterMethodArguments[1] = parsePosition;
        char actual = ((Character) parseNextCharacterMethod.invoke(complexFormat, parseNextCharacterMethodArguments));
        
        assertEquals('\u0000', actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNextCharacter(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (Character.isWhitespace(c) && index < n): False}
 * @utbot.executesCondition {@code (index < n): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testParseNextCharacter_IndexGreaterOrEqualN_2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "$";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNextCharacterMethod = complexFormatClazz.getDeclaredMethod("parseNextCharacter", stringType, parsePositionType);
        parseNextCharacterMethod.setAccessible(true);
        java.lang.Object[] parseNextCharacterMethodArguments = new java.lang.Object[2];
        parseNextCharacterMethodArguments[0] = string;
        parseNextCharacterMethodArguments[1] = parsePosition;
        char actual = ((Character) parseNextCharacterMethod.invoke(complexFormat, parseNextCharacterMethodArguments));
        
        assertEquals('\u0000', actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNextCharacter(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (Character.isWhitespace(c) && index < n): False}
 * @utbot.executesCondition {@code (index < n): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testParseNextCharacter_IndexLessThanN() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "! ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNextCharacterMethod = complexFormatClazz.getDeclaredMethod("parseNextCharacter", stringType, parsePositionType);
        parseNextCharacterMethod.setAccessible(true);
        java.lang.Object[] parseNextCharacterMethodArguments = new java.lang.Object[2];
        parseNextCharacterMethodArguments[0] = string;
        parseNextCharacterMethodArguments[1] = parsePosition;
        char actual = ((Character) parseNextCharacterMethod.invoke(complexFormat, parseNextCharacterMethodArguments));
        
        assertEquals('!', actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseNextCharacter(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNextCharacter(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (index < n): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: c = source.charAt(index++);
 *  */
    @Test
    public void testParseNextCharacter_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNextCharacter] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:418) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNextCharacterMethod = complexFormatClazz.getDeclaredMethod("parseNextCharacter", stringType, parsePositionType);
        parseNextCharacterMethod.setAccessible(true);
        java.lang.Object[] parseNextCharacterMethodArguments = new java.lang.Object[2];
        parseNextCharacterMethodArguments[0] = string;
        parseNextCharacterMethodArguments[1] = parsePosition;
        try {
            parseNextCharacterMethod.invoke(complexFormat, parseNextCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNextCharacter(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int n = source.length();
 *  */
    @Test
    public void testParseNextCharacter_ThrowNullPointerException_1() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNextCharacter] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:412) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNextCharacterMethod = complexFormatClazz.getDeclaredMethod("parseNextCharacter", stringType, parsePositionType);
        parseNextCharacterMethod.setAccessible(true);
        java.lang.Object[] parseNextCharacterMethodArguments = new java.lang.Object[2];
        parseNextCharacterMethodArguments[0] = ((Object) null);
        parseNextCharacterMethodArguments[1] = parsePosition;
        try {
            parseNextCharacterMethod.invoke(complexFormat, parseNextCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseNextCharacter(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int index = pos.getIndex();
 *  */
    @Test
    public void testParseNextCharacter_ThrowNullPointerException() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseNextCharacter] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:411) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseNextCharacterMethod = complexFormatClazz.getDeclaredMethod("parseNextCharacter", stringType, parsePositionType);
        parseNextCharacterMethod.setAccessible(true);
        java.lang.Object[] parseNextCharacterMethodArguments = new java.lang.Object[2];
        parseNextCharacterMethodArguments[0] = ((Object) null);
        parseNextCharacterMethodArguments[1] = ((Object) null);
        try {
            parseNextCharacterMethod.invoke(complexFormat, parseNextCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.getRealFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRealFormat()
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#getRealFormat()}
 * @utbot.returnsFrom {@code return realFormat;}
 *  */
    @Test
    public void testGetRealFormat_ReturnRealFormat() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        NumberFormat actual = complexFormat.getRealFormat();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.getImaginaryFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImaginaryFormat()
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#getImaginaryFormat()}
 * @utbot.returnsFrom {@code return imaginaryFormat;}
 *  */
    @Test
    public void testGetImaginaryFormat_ReturnImaginaryFormat() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        NumberFormat actual = complexFormat.getImaginaryFormat();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getDefaultNumberFormat(java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.ComplexFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#getDefaultNumberFormat(java.util.Locale)}
     */
    @Test
    public void testGetDefaultNumberFormat() throws Exception  {
        Locale locale = new Locale("ab");
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class localeType = Class.forName("java.util.Locale");
        Method getDefaultNumberFormatMethod = complexFormatClazz.getDeclaredMethod("getDefaultNumberFormat", localeType);
        getDefaultNumberFormatMethod.setAccessible(true);
        java.lang.Object[] getDefaultNumberFormatMethodArguments = new java.lang.Object[1];
        getDefaultNumberFormatMethodArguments[0] = locale;
        DecimalFormat actual = ((DecimalFormat) getDefaultNumberFormatMethod.invoke(null, getDefaultNumberFormatMethodArguments));
        
        DecimalFormat expected = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        
        // java.text.DecimalFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getDefaultNumberFormat
    
    public void testGetDefaultNumberFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getDefaultNumberFormat()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.ComplexFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#getDefaultNumberFormat()}
     */
    @Test
    public void testGetDefaultNumberFormat1() throws Exception  {
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Method getDefaultNumberFormatMethod = complexFormatClazz.getDeclaredMethod("getDefaultNumberFormat");
        getDefaultNumberFormatMethod.setAccessible(true);
        java.lang.Object[] getDefaultNumberFormatMethodArguments = new java.lang.Object[0];
        DecimalFormat actual = ((DecimalFormat) getDefaultNumberFormatMethod.invoke(null, getDefaultNumberFormatMethodArguments));
        
        DecimalFormat expected = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        
        // java.text.DecimalFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getDefaultNumberFormat
    
    public void testGetDefaultNumberFormat_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.setImaginaryCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setImaginaryCharacter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#setImaginaryCharacter(java.lang.String)}
 * @utbot.executesCondition {@code (imaginaryCharacter == null): False}
 * @utbot.executesCondition {@code (imaginaryCharacter.length() == 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testSetImaginaryCharacter_ImaginaryCharacterLengthNotEqualsZero() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = " ";
        
        complexFormat.setImaginaryCharacter(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setImaginaryCharacter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#setImaginaryCharacter(java.lang.String)}
 * @utbot.executesCondition {@code (imaginaryCharacter == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: imaginaryCharacter == null || imaginaryCharacter.length() == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacter_ThrowIllegalArgumentException() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        complexFormat.setImaginaryCharacter(null);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#setImaginaryCharacter(java.lang.String)}
 * @utbot.executesCondition {@code (imaginaryCharacter == null): False}
 * @utbot.executesCondition {@code (imaginaryCharacter.length() == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: imaginaryCharacter == null || imaginaryCharacter.length() == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacter_ThrowIllegalArgumentException_1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        
        complexFormat.setImaginaryCharacter(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.getImaginaryCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImaginaryCharacter()
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#getImaginaryCharacter()}
 * @utbot.returnsFrom {@code return imaginaryCharacter;}
 *  */
    @Test
    public void testGetImaginaryCharacter_ReturnImaginaryCharacter() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        String actual = complexFormat.getImaginaryCharacter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseAndIgnoreWhitespace(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testParseAndIgnoreWhitespace() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseAndIgnoreWhitespaceMethod = complexFormatClazz.getDeclaredMethod("parseAndIgnoreWhitespace", stringType, parsePositionType);
        parseAndIgnoreWhitespaceMethod.setAccessible(true);
        java.lang.Object[] parseAndIgnoreWhitespaceMethodArguments = new java.lang.Object[2];
        parseAndIgnoreWhitespaceMethodArguments[0] = string;
        parseAndIgnoreWhitespaceMethodArguments[1] = parsePosition;
        parseAndIgnoreWhitespaceMethod.invoke(complexFormat, parseAndIgnoreWhitespaceMethodArguments);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(0, finalParsePositionIndex);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseAndIgnoreWhitespace(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testParseAndIgnoreWhitespace_1() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\f ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseAndIgnoreWhitespaceMethod = complexFormatClazz.getDeclaredMethod("parseAndIgnoreWhitespace", stringType, parsePositionType);
        parseAndIgnoreWhitespaceMethod.setAccessible(true);
        java.lang.Object[] parseAndIgnoreWhitespaceMethodArguments = new java.lang.Object[2];
        parseAndIgnoreWhitespaceMethodArguments[0] = string;
        parseAndIgnoreWhitespaceMethodArguments[1] = parsePosition;
        parseAndIgnoreWhitespaceMethod.invoke(complexFormat, parseAndIgnoreWhitespaceMethodArguments);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.String#charAt(int)} twice,
    ///     {@link java.lang.Character#isWhitespace(char)} twice,
    ///     {@link java.text.ParsePosition#setIndex(int)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseAndIgnoreWhitespace(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testParseAndIgnoreWhitespace_2() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "\t";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseAndIgnoreWhitespaceMethod = complexFormatClazz.getDeclaredMethod("parseAndIgnoreWhitespace", stringType, parsePositionType);
        parseAndIgnoreWhitespaceMethod.setAccessible(true);
        java.lang.Object[] parseAndIgnoreWhitespaceMethodArguments = new java.lang.Object[2];
        parseAndIgnoreWhitespaceMethodArguments[0] = string;
        parseAndIgnoreWhitespaceMethodArguments[1] = parsePosition;
        parseAndIgnoreWhitespaceMethod.invoke(complexFormat, parseAndIgnoreWhitespaceMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseAndIgnoreWhitespace(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testParseAndIgnoreWhitespace_3() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "$";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseAndIgnoreWhitespaceMethod = complexFormatClazz.getDeclaredMethod("parseAndIgnoreWhitespace", stringType, parsePositionType);
        parseAndIgnoreWhitespaceMethod.setAccessible(true);
        java.lang.Object[] parseAndIgnoreWhitespaceMethodArguments = new java.lang.Object[2];
        parseAndIgnoreWhitespaceMethodArguments[0] = string;
        parseAndIgnoreWhitespaceMethodArguments[1] = parsePosition;
        parseAndIgnoreWhitespaceMethod.invoke(complexFormat, parseAndIgnoreWhitespaceMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseAndIgnoreWhitespace(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testParseAndIgnoreWhitespace_4() throws Exception  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "! ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseAndIgnoreWhitespaceMethod = complexFormatClazz.getDeclaredMethod("parseAndIgnoreWhitespace", stringType, parsePositionType);
        parseAndIgnoreWhitespaceMethod.setAccessible(true);
        java.lang.Object[] parseAndIgnoreWhitespaceMethodArguments = new java.lang.Object[2];
        parseAndIgnoreWhitespaceMethodArguments[0] = string;
        parseAndIgnoreWhitespaceMethodArguments[1] = parsePosition;
        parseAndIgnoreWhitespaceMethod.invoke(complexFormat, parseAndIgnoreWhitespaceMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseAndIgnoreWhitespace(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: parseNextCharacter(source, pos);
 *  */
    @Test
    public void testParseAndIgnoreWhitespace_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:418)
            org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(ComplexFormat.java:399) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseAndIgnoreWhitespaceMethod = complexFormatClazz.getDeclaredMethod("parseAndIgnoreWhitespace", stringType, parsePositionType);
        parseAndIgnoreWhitespaceMethod.setAccessible(true);
        java.lang.Object[] parseAndIgnoreWhitespaceMethodArguments = new java.lang.Object[2];
        parseAndIgnoreWhitespaceMethodArguments[0] = string;
        parseAndIgnoreWhitespaceMethodArguments[1] = parsePosition;
        try {
            parseAndIgnoreWhitespaceMethod.invoke(complexFormat, parseAndIgnoreWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseAndIgnoreWhitespace(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseNextCharacter(source, pos);
 *  */
    @Test
    public void testParseAndIgnoreWhitespace_ThrowNullPointerException_1() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:412)
            org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(ComplexFormat.java:399) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseAndIgnoreWhitespaceMethod = complexFormatClazz.getDeclaredMethod("parseAndIgnoreWhitespace", stringType, parsePositionType);
        parseAndIgnoreWhitespaceMethod.setAccessible(true);
        java.lang.Object[] parseAndIgnoreWhitespaceMethodArguments = new java.lang.Object[2];
        parseAndIgnoreWhitespaceMethodArguments[0] = ((Object) null);
        parseAndIgnoreWhitespaceMethodArguments[1] = parsePosition;
        try {
            parseAndIgnoreWhitespaceMethod.invoke(complexFormat, parseAndIgnoreWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ComplexFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.ComplexFormat#parseAndIgnoreWhitespace(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseNextCharacter(source, pos);
 *  */
    @Test
    public void testParseAndIgnoreWhitespace_ThrowNullPointerException() throws Throwable  {
        ComplexFormat complexFormat = ((ComplexFormat) createInstance("org.apache.commons.math.complex.ComplexFormat"));
        
        /* This test fails because method [org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(ComplexFormat.java:411)
            org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(ComplexFormat.java:399) */
        Class complexFormatClazz = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseAndIgnoreWhitespaceMethod = complexFormatClazz.getDeclaredMethod("parseAndIgnoreWhitespace", stringType, parsePositionType);
        parseAndIgnoreWhitespaceMethod.setAccessible(true);
        java.lang.Object[] parseAndIgnoreWhitespaceMethodArguments = new java.lang.Object[2];
        parseAndIgnoreWhitespaceMethodArguments[0] = ((Object) null);
        parseAndIgnoreWhitespaceMethodArguments[1] = ((Object) null);
        try {
            parseAndIgnoreWhitespaceMethod.invoke(complexFormat, parseAndIgnoreWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields788718333662200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields788718333662200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass788718333671900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields788718333662200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass788718333671900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields788718334154900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields788718334154900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass788718334156300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields788718334154900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass788718334156300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

