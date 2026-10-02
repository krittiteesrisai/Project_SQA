package org.apache.commons.lang3.text;

import org.junit.Test;
import java.text.ParsePosition;
import java.lang.reflect.Method;
import java.util.Locale;
import java.text.Format;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.text.MessageFormat;
import org.apache.commons.lang3.text.StrMatcher.CharSetMatcher;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.util.Collections.emptyMap;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_lang3_text_ExtendedMessageFormatTest {
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.next
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method next(java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#next(java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link java.text.ParsePosition#setIndex(int)}
 * @utbot.returnsFrom {@code return pos;}
 *  */
    @Test
    public void testNext_ParsePositionSetIndex() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method nextMethod = extendedMessageFormatClazz.getDeclaredMethod("next", parsePositionType);
        nextMethod.setAccessible(true);
        java.lang.Object[] nextMethodArguments = new java.lang.Object[1];
        nextMethodArguments[0] = parsePosition;
        ParsePosition actual = ((ParsePosition) nextMethod.invoke(extendedMessageFormat, nextMethodArguments));
        
        // java.text.ParsePosition has overridden equals method
        assertEquals(parsePosition, actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(-254, finalParsePositionIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method next(java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#next(java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pos.setIndex(pos.getIndex() + 1);
 *  */
    @Test
    public void testNext_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.next] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.next(ExtendedMessageFormat.java:462) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method nextMethod = extendedMessageFormatClazz.getDeclaredMethod("next", parsePositionType);
        nextMethod.setAccessible(true);
        java.lang.Object[] nextMethodArguments = new java.lang.Object[1];
        nextMethodArguments[0] = ((Object) null);
        try {
            nextMethod.invoke(extendedMessageFormat, nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method next(java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#next(java.text.ParsePosition)}
     */
    @Test
    public void testNext() throws Exception  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        ParsePosition parsePosition = new ParsePosition(Integer.MAX_VALUE);
        parsePosition.setIndex(Integer.MAX_VALUE);
        parsePosition.setErrorIndex(1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method nextMethod = extendedMessageFormatClazz.getDeclaredMethod("next", parsePositionType);
        nextMethod.setAccessible(true);
        java.lang.Object[] nextMethodArguments = new java.lang.Object[1];
        nextMethodArguments[0] = parsePosition;
        ParsePosition actual = ((ParsePosition) nextMethod.invoke(extendedMessageFormat, nextMethodArguments));
        
        ParsePosition expected = ((ParsePosition) createInstance("java.text.ParsePosition"));
        expected.setIndex(Integer.MIN_VALUE);
        expected.setErrorIndex(1);
        
        // java.text.ParsePosition has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyPattern(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testApplyPattern_Return() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "";
        
        extendedMessageFormat.applyPattern(string);
        
        Map finalExtendedMessageFormatRegistry = ((Map) getFieldValue(extendedMessageFormat, "org.apache.commons.lang3.text.ExtendedMessageFormat", "registry"));
        int finalExtendedMessageFormatMaxOffset = ((Integer) getFieldValue(extendedMessageFormat, "java.text.MessageFormat", "maxOffset"));
        
        assertNull(finalExtendedMessageFormatRegistry);
        
        assertEquals(-1, finalExtendedMessageFormatMaxOffset);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testApplyPattern_Return_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = " ";
        
        extendedMessageFormat.applyPattern(string);
        
        Map finalExtendedMessageFormatRegistry = ((Map) getFieldValue(extendedMessageFormat, "org.apache.commons.lang3.text.ExtendedMessageFormat", "registry"));
        int finalExtendedMessageFormatMaxOffset = ((Integer) getFieldValue(extendedMessageFormat, "java.text.MessageFormat", "maxOffset"));
        
        assertNull(finalExtendedMessageFormatRegistry);
        
        assertEquals(-1, finalExtendedMessageFormatMaxOffset);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testApplyPattern_Return_2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "'";
        
        extendedMessageFormat.applyPattern(string);
        
        Map finalExtendedMessageFormatRegistry = ((Map) getFieldValue(extendedMessageFormat, "org.apache.commons.lang3.text.ExtendedMessageFormat", "registry"));
        int finalExtendedMessageFormatMaxOffset = ((Integer) getFieldValue(extendedMessageFormat, "java.text.MessageFormat", "maxOffset"));
        
        assertNull(finalExtendedMessageFormatRegistry);
        
        assertEquals(-1, finalExtendedMessageFormatMaxOffset);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testApplyPattern_Return_3() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "''";
        
        extendedMessageFormat.applyPattern(string);
        
        Map finalExtendedMessageFormatRegistry = ((Map) getFieldValue(extendedMessageFormat, "org.apache.commons.lang3.text.ExtendedMessageFormat", "registry"));
        int finalExtendedMessageFormatMaxOffset = ((Integer) getFieldValue(extendedMessageFormat, "java.text.MessageFormat", "maxOffset"));
        
        assertNull(finalExtendedMessageFormatRegistry);
        
        assertEquals(-1, finalExtendedMessageFormatMaxOffset);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyPattern(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "{";
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: Unmatched braces in the pattern.]
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:521)
            org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:149) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = " {";
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: Unmatched braces in the pattern.]
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:521)
            org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:149) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException_2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "{'";
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: Unmatched braces in the pattern.]
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:521)
            org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:149) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException_3() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "{ ";
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: Unmatched braces in the pattern.]
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:521)
            org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:149) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException_4() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "{,";
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: Unmatched braces in the pattern.]
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:521)
            org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:149) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException_5() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "''{";
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: Unmatched braces in the pattern.]
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:521)
            org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:149) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException_6() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "{{}";
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: Unmatched braces in the pattern.]
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:521)
            org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:149) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException_7() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "{}";
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: can't parse argument number: ]
            java.base/java.text.MessageFormat.makeFormat(MessageFormat.java:1454)
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:492)
            org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:149) */
        extendedMessageFormat.applyPattern(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method applyPattern(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
     */
    @Test
    public void testApplyPatternWithNonEmptyString() {
        Locale locale = new Locale("\n\t\r", "");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("#$\\\"'");
        extendedMessageFormat.setLocale(locale1);
        
        extendedMessageFormat.applyPattern("'$\"\\#");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
     */
    @Test
    public void testApplyPatternWithNonEmptyString1() {
        Locale locale = new Locale("\n\t\r", "");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("\"\\#$'");
        extendedMessageFormat.setLocale(locale1);
        
        extendedMessageFormat.applyPattern("'$\"\\#");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
     */
    @Test
    public void testApplyPatternWithNonEmptyString2() {
        Locale locale = new Locale("\n\t\r", "");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("anbc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("\"\\#$'");
        extendedMessageFormat.setLocale(locale1);
        
        extendedMessageFormat.applyPattern("'$\"\\#");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.toPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPattern()
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#toPattern()}
 * @utbot.returnsFrom {@code return toPattern;}
 *  */
    @Test
    public void testToPattern_ReturnToPattern() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        String actual = extendedMessageFormat.toPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPattern()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#toPattern()}
     */
    @Test
    public void testToPattern() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        String actual = extendedMessageFormat.toPattern();
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#toPattern()}
     */
    @Test
    public void testToPattern1() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        
        String actual = extendedMessageFormat.toPattern();
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#toPattern()}
     */
    @Test
    public void testToPattern2() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        
        String actual = extendedMessageFormat.toPattern();
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#toPattern()}
     */
    @Test
    public void testToPattern3() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("bac", locale);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        
        String actual = extendedMessageFormat.toPattern();
        
        String expected = "bac";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setFormat(int, java.text.Format)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormat(int,java.text.Format)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test
    public void testSetFormat_ThrowUnsupportedOperationException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat(ExtendedMessageFormat.java:222) */
        extendedMessageFormat.setFormat(-255, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setFormat(int, java.text.Format)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormat(int,java.text.Format)}
     */
    @Test
    public void testSetFormatThrowsUOE() {
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("\n\t\r");
        Locale locale = new Locale("XZ");
        extendedMessageFormat.setLocale(locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("", "abc");
        MessageFormat messageFormat = new MessageFormat("XZ", locale1);
        java.text.Format[] formatArray1 = {};
        messageFormat.setFormats(formatArray1);
        Locale locale2 = new Locale("abc", "", "XZ");
        messageFormat.setLocale(locale2);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat(ExtendedMessageFormat.java:222) */
        extendedMessageFormat.setFormat(2146959359, messageFormat);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormat(int,java.text.Format)}
     */
    @Test
    public void testSetFormatThrowsUOE1() {
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("\n\t\r");
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale = new Locale("#$\\\"'", "10");
        extendedMessageFormat.setLocale(locale);
        CompositeFormat compositeFormat = new CompositeFormat(null, null);
        CompositeFormat compositeFormat1 = new CompositeFormat(null, null);
        CompositeFormat compositeFormat2 = new CompositeFormat(compositeFormat, compositeFormat1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat(ExtendedMessageFormat.java:222) */
        extendedMessageFormat.setFormat(-1610612736, compositeFormat2);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormat(int,java.text.Format)}
     */
    @Test
    public void testSetFormatThrowsUOEWithCornerCase() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        CompositeFormat compositeFormat = new CompositeFormat(null, null);
        CompositeFormat compositeFormat1 = new CompositeFormat(null, null);
        CompositeFormat compositeFormat2 = new CompositeFormat(compositeFormat, compositeFormat1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat(ExtendedMessageFormat.java:222) */
        extendedMessageFormat.setFormat(Integer.MAX_VALUE, compositeFormat2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.getFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFormat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#getFormat(java.lang.String)}
 * @utbot.executesCondition {@code (registry != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFormat_RegistryEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = ((Object) null);
        Format actual = ((Format) getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments));
        
        assertNull(actual);
        
        Map finalExtendedMessageFormatRegistry = ((Map) getFieldValue(extendedMessageFormat, "org.apache.commons.lang3.text.ExtendedMessageFormat", "registry"));
        
        assertNull(finalExtendedMessageFormatRegistry);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFormat(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#getFormat(java.lang.String)}
     */
    @Test
    public void testGetFormatWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = "acb";
        Format actual = ((Format) getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments));
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#getFormat(java.lang.String)}
     */
    @Test
    public void testGetFormatWithEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Map map = emptyMap();
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("", map);
        Locale locale = new Locale("");
        extendedMessageFormat.setLocale(locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = "";
        Format actual = ((Format) getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments));
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#getFormat(java.lang.String)}
     */
    @Test
    public void testGetFormatWithNonEmptyString1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = "acb";
        Format actual = ((Format) getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments));
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#getFormat(java.lang.String)}
     */
    @Test
    public void testGetFormatWithNonEmptyString2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = "cab";
        Format actual = ((Format) getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setFormatByArgumentIndex(int, java.text.Format)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormatByArgumentIndex(int,java.text.Format)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test
    public void testSetFormatByArgumentIndex_ThrowUnsupportedOperationException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex(ExtendedMessageFormat.java:234) */
        extendedMessageFormat.setFormatByArgumentIndex(-255, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setFormatByArgumentIndex(int, java.text.Format)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormatByArgumentIndex(int,java.text.Format)}
     */
    @Test
    public void testSetFormatByArgumentIndexThrowsUOE() {
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("\n\t\r");
        Locale locale = new Locale("XZ");
        extendedMessageFormat.setLocale(locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("", "abc");
        MessageFormat messageFormat = new MessageFormat("XZ", locale1);
        java.text.Format[] formatArray1 = {};
        messageFormat.setFormats(formatArray1);
        Locale locale2 = new Locale("abc", "", "XZ");
        messageFormat.setLocale(locale2);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex(ExtendedMessageFormat.java:234) */
        extendedMessageFormat.setFormatByArgumentIndex(2146959359, messageFormat);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormatByArgumentIndex(int,java.text.Format)}
     */
    @Test
    public void testSetFormatByArgumentIndexThrowsUOE1() {
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("\n\t\r");
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale = new Locale("#$\\\"'", "10");
        extendedMessageFormat.setLocale(locale);
        CompositeFormat compositeFormat = new CompositeFormat(null, null);
        CompositeFormat compositeFormat1 = new CompositeFormat(null, null);
        CompositeFormat compositeFormat2 = new CompositeFormat(compositeFormat, compositeFormat1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex(ExtendedMessageFormat.java:234) */
        extendedMessageFormat.setFormatByArgumentIndex(-1610612736, compositeFormat2);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormatByArgumentIndex(int,java.text.Format)}
     */
    @Test
    public void testSetFormatByArgumentIndexThrowsUOEWithCornerCase() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        CompositeFormat compositeFormat = new CompositeFormat(null, null);
        CompositeFormat compositeFormat1 = new CompositeFormat(null, null);
        CompositeFormat compositeFormat2 = new CompositeFormat(compositeFormat, compositeFormat1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex(ExtendedMessageFormat.java:234) */
        extendedMessageFormat.setFormatByArgumentIndex(Integer.MAX_VALUE, compositeFormat2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setFormatsByArgumentIndex([Ljava.text.Format;)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormatsByArgumentIndex(java.text.Format[])}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test
    public void testSetFormatsByArgumentIndex_ThrowUnsupportedOperationException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex(ExtendedMessageFormat.java:256) */
        extendedMessageFormat.setFormatsByArgumentIndex(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setFormatsByArgumentIndex([Ljava.text.Format;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormatsByArgumentIndex(java.text.Format[])}
     */
    @Test
    public void testSetFormatsByArgumentIndexThrowsUOEWithEmptyObjectArray() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray1 = {};
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex(ExtendedMessageFormat.java:256) */
        extendedMessageFormat.setFormatsByArgumentIndex(formatArray1);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormatsByArgumentIndex(java.text.Format[])}
     */
    @Test
    public void testSetFormatsByArgumentIndexThrowsUOEWithEmptyObjectArray1() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray1 = {};
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex(ExtendedMessageFormat.java:256) */
        extendedMessageFormat.setFormatsByArgumentIndex(formatArray1);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormatsByArgumentIndex(java.text.Format[])}
     */
    @Test
    public void testSetFormatsByArgumentIndexThrowsUOEWithEmptyObjectArray2() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray1 = {};
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex(ExtendedMessageFormat.java:256) */
        extendedMessageFormat.setFormatsByArgumentIndex(formatArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseFormatDescription(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return pattern.substring(text, pos.getIndex());}
 *  */
    @Test
    public void testParseFormatDescription_ReturnPatternSubstring() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "}";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            String actual = ((String) parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments));
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return pattern.substring(text, pos.getIndex());}
 *  */
    @Test
    public void testParseFormatDescription_ReturnPatternSubstring_1() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = " }                              ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(1);
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            String actual = ((String) parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments));
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseFormatDescription(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testParseFormatDescription_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = " ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(-256);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
                org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
                org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
                org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:371) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testParseFormatDescription_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "  ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(65);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
                org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
                org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
                org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:371) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testParseFormatDescription_ThrowIllegalArgumentException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\"\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(4);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.IllegalArgumentException: Unterminated format element at position 4]
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:392) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testParseFormatDescription_ThrowIllegalArgumentException_1() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\f";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.IllegalArgumentException: Unterminated format element at position 0]
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:392) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testParseFormatDescription_ThrowIllegalArgumentException_2() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\"";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.IllegalArgumentException: Unterminated format element at position 0]
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:392) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testParseFormatDescription_ThrowIllegalArgumentException_3() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\b";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.IllegalArgumentException: Unterminated format element at position 0]
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:392) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testParseFormatDescription_ThrowIllegalArgumentException_4() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = " {";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(1);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.IllegalArgumentException: Unterminated format element at position 1]
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:392) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testParseFormatDescription_ThrowIllegalArgumentException_5() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\b\"";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.IllegalArgumentException: Unterminated format element at position 0]
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:392) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; pos.getIndex() < pattern.length(); next(pos))} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testParseFormatDescription_ThrowIllegalArgumentException_6() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "{}";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.IllegalArgumentException: Unterminated format element at position 0]
                org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:392) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
            parseFormatDescriptionMethod.setAccessible(true);
            java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
            parseFormatDescriptionMethodArguments[0] = string;
            parseFormatDescriptionMethodArguments[1] = parsePosition;
            try {
                parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testParseFormatDescription_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:448)
            org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:371) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
        parseFormatDescriptionMethod.setAccessible(true);
        java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
        parseFormatDescriptionMethodArguments[0] = ((Object) null);
        parseFormatDescriptionMethodArguments[1] = parsePosition;
        try {
            parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int start = pos.getIndex();
 *  */
    @Test
    public void testParseFormatDescription_ThrowNullPointerException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:370) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
        parseFormatDescriptionMethod.setAccessible(true);
        java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
        parseFormatDescriptionMethodArguments[0] = ((Object) null);
        parseFormatDescriptionMethodArguments[1] = ((Object) null);
        try {
            parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseFormatDescription(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseFormatDescriptionThrowsNPEWithNonEmptyString() throws Throwable  {
        Locale locale = new Locale("\n\t\r", "");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("#$\\\"'");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:370) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
        parseFormatDescriptionMethod.setAccessible(true);
        java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
        parseFormatDescriptionMethodArguments[0] = "#$\\\"";
        parseFormatDescriptionMethodArguments[1] = ((Object) null);
        try {
            parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseFormatDescriptionThrowsNPEWithNonEmptyString1() throws Throwable  {
        Locale locale = new Locale("\n\t\r", "");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("#$\\\"'");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:370) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
        parseFormatDescriptionMethod.setAccessible(true);
        java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
        parseFormatDescriptionMethodArguments[0] = "#$^\\\"";
        parseFormatDescriptionMethodArguments[1] = ((Object) null);
        try {
            parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseFormatDescriptionThrowsNPEWithNonEmptyString2() throws Throwable  {
        Locale locale = new Locale("\n\t\r", "");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("#$\\\"'");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:370) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
        parseFormatDescriptionMethod.setAccessible(true);
        java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
        parseFormatDescriptionMethodArguments[0] = "#$^\\\"\u0004";
        parseFormatDescriptionMethodArguments[1] = ((Object) null);
        try {
            parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testParseFormatDescriptionThrowsNPEWithNonEmptyString3() throws Throwable  {
        Locale locale = new Locale("\n\t\r", "");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("#$\\\"'");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:370) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method parseFormatDescriptionMethod = extendedMessageFormatClazz.getDeclaredMethod("parseFormatDescription", stringType, parsePositionType);
        parseFormatDescriptionMethod.setAccessible(true);
        java.lang.Object[] parseFormatDescriptionMethodArguments = new java.lang.Object[2];
        parseFormatDescriptionMethodArguments[0] = "#$^\\\"\u0004";
        parseFormatDescriptionMethodArguments[1] = ((Object) null);
        try {
            parseFormatDescriptionMethod.invoke(extendedMessageFormat, parseFormatDescriptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setFormats([Ljava.text.Format;)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormats(java.text.Format[])}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test
    public void testSetFormats_ThrowUnsupportedOperationException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats(ExtendedMessageFormat.java:245) */
        extendedMessageFormat.setFormats(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setFormats([Ljava.text.Format;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormats(java.text.Format[])}
     */
    @Test
    public void testSetFormatsThrowsUOEWithEmptyObjectArray() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray1 = {};
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats(ExtendedMessageFormat.java:245) */
        extendedMessageFormat.setFormats(formatArray1);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormats(java.text.Format[])}
     */
    @Test
    public void testSetFormatsThrowsUOEWithEmptyObjectArray1() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray1 = {};
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats(ExtendedMessageFormat.java:245) */
        extendedMessageFormat.setFormats(formatArray1);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#setFormats(java.text.Format[])}
     */
    @Test
    public void testSetFormatsThrowsUOEWithEmptyObjectArray2() {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        java.text.Format[] formatArray1 = {};
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats] produces [java.lang.UnsupportedOperationException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats(ExtendedMessageFormat.java:245) */
        extendedMessageFormat.setFormats(formatArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insertFormats(java.lang.String, java.util.ArrayList)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
 * @utbot.returnsFrom {@code return pattern;}
 *  */
    @Test
    public void testInsertFormats_ReturnPattern() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = ((Object) null);
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
 * @utbot.returnsFrom {@code return pattern;}
 *  */
    @Test
    public void testInsertFormats_ReturnPattern_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = ((Object) null);
        insertFormatsMethodArguments[1] = ((Object) null);
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
 * @utbot.returnsFrom {@code return pattern;}
 *  */
    @Test
    public void testInsertFormats_ReturnPattern_2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = ((Object) null);
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertFormats(java.lang.String, java.util.ArrayList)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
 * @utbot.invokes org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringBuilder sb = new StringBuilder(pattern.length() * 2);
 *  */
    @Test
    public void testInsertFormats_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        String string = "";
        arrayList.add(string);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:407) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = ((Object) null);
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method insertFormats(java.lang.String, java.util.ArrayList)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
     */
    @Test
    public void testInsertFormatsWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = "ab";
        insertFormatsMethodArguments[1] = ((Object) null);
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
     */
    @Test
    public void testInsertFormatsWithNonEmptyString1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = "\u009Bab";
        insertFormatsMethodArguments[1] = ((Object) null);
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "\u009Bab";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
     */
    @Test
    public void testInsertFormatsWithNonEmptyString2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = "D\u009Bab";
        insertFormatsMethodArguments[1] = ((Object) null);
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "D\u009Bab";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
     */
    @Test
    public void testInsertFormatsWithNonEmptyString3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = "D\u009Bab";
        insertFormatsMethodArguments[1] = ((Object) null);
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "D\u009Bab";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insertFormats(java.lang.String, java.util.ArrayList)
    
    @Test
    public void testInsertFormats1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}}\u0000";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) string1);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "}}\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertFormats2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000}}";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) string1);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "\u0000}}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertFormats3() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}\u0000}";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) string1);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "}\u0000}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertFormats4() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}\u0000\u0000";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        String string2 = "";
        arrayList.add(string2);
        arrayList.add(string2);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "}\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertFormats5() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "''";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        String string2 = "";
        arrayList.add(string2);
        arrayList.add(string2);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "''";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertFormats6() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000\u0000}";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        String string2 = "";
        arrayList.add(string2);
        arrayList.add(string2);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "\u0000\u0000}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertFormats7() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000}\u0000";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        String string2 = "";
        arrayList.add(string2);
        arrayList.add(string2);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "\u0000}\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertFormats(java.lang.String, java.util.ArrayList)
    
    @Test
    public void testInsertFormats8() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000}{";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) string1);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats9() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}\u0000{";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) string1);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats10() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}{";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(extendedMessageFormat);
        arrayList.add(extendedMessageFormat);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats11() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000\u0000{";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) string1);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats12() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "'}{";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 1]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats13() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "'}}";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 1]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats14() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000'";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 2]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats15() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "'\u0000}";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 1]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats16() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}'\u0000";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 2]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats17() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "'\u0000\u0000";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 1]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats18() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}}'";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 3]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats19() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}\u0000'";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 3]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats20() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000}'";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 3]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats21() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000\u0000'";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 3]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats22() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "'";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.IllegalArgumentException: Unterminated quoted string at position 1]
            org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:497)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:415) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats23() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}}{";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats24() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000{";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats25() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "{";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        String string1 = "";
        arrayList.add(string1);
        String string2 = "";
        arrayList.add(string2);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats26() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "}{";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        String string1 = "";
        arrayList.add(string1);
        String string2 = "";
        arrayList.add(string2);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats27() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "{";
        ArrayList arrayList = new ArrayList();
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertFormats28() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        String string = "\u0000{";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        String string1 = "";
        arrayList.add(string1);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
            org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329)
            org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        try {
            insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method seekNonWs(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testSeekNonWs() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\b";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
            seekNonWsMethod.setAccessible(true);
            java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
            seekNonWsMethodArguments[0] = string;
            seekNonWsMethodArguments[1] = parsePosition;
            seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testSeekNonWs_1() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\f";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
            seekNonWsMethod.setAccessible(true);
            java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
            seekNonWsMethodArguments[0] = string;
            seekNonWsMethodArguments[1] = parsePosition;
            seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
            
            int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
            
            assertEquals(1, finalParsePositionIndex);
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testSeekNonWs_2() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\"";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
            seekNonWsMethod.setAccessible(true);
            java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
            seekNonWsMethodArguments[0] = string;
            seekNonWsMethodArguments[1] = parsePosition;
            seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method seekNonWs(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: len = StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
 *  */
    @Test
    public void testSeekNonWs_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "  ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(129);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
                org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
                org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
                org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
            seekNonWsMethod.setAccessible(true);
            java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
            seekNonWsMethodArguments[0] = string;
            seekNonWsMethodArguments[1] = parsePosition;
            try {
                seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: len = StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
 *  */
    @Test
    public void testSeekNonWs_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = " ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(-256);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
                org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
                org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
                org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
            seekNonWsMethod.setAccessible(true);
            java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
            seekNonWsMethodArguments[0] = string;
            seekNonWsMethodArguments[1] = parsePosition;
            try {
                seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char[] buffer = pattern.toCharArray();
 *  */
    @Test
    public void testSeekNonWs_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:448) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
        seekNonWsMethod.setAccessible(true);
        java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
        seekNonWsMethodArguments[0] = ((Object) null);
        seekNonWsMethodArguments[1] = ((Object) null);
        try {
            seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: len = StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
 *  */
    @Test
    public void testSeekNonWs_ThrowNullPointerException_1() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "";
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
                org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
            seekNonWsMethod.setAccessible(true);
            java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
            seekNonWsMethodArguments[0] = string;
            seekNonWsMethodArguments[1] = ((Object) null);
            try {
                seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method seekNonWs(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testSeekNonWsThrowsNPEWithNonEmptyString() throws Throwable  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
        seekNonWsMethod.setAccessible(true);
        java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
        seekNonWsMethodArguments[0] = "ab";
        seekNonWsMethodArguments[1] = ((Object) null);
        try {
            seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testSeekNonWsThrowsNPEWithNonEmptyString1() throws Throwable  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
        seekNonWsMethod.setAccessible(true);
        java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
        seekNonWsMethodArguments[0] = "\u009Bab";
        seekNonWsMethodArguments[1] = ((Object) null);
        try {
            seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testSeekNonWsThrowsNPEWithNonEmptyString2() throws Throwable  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
        seekNonWsMethod.setAccessible(true);
        java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
        seekNonWsMethodArguments[0] = "D\u009Bab";
        seekNonWsMethodArguments[1] = ((Object) null);
        try {
            seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testSeekNonWsThrowsNPEWithNonEmptyString3() throws Throwable  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method seekNonWsMethod = extendedMessageFormatClazz.getDeclaredMethod("seekNonWs", stringType, parsePositionType);
        seekNonWsMethod.setAccessible(true);
        java.lang.Object[] seekNonWsMethodArguments = new java.lang.Object[2];
        seekNonWsMethodArguments[0] = "D\u009Bab";
        seekNonWsMethodArguments[1] = ((Object) null);
        try {
            seekNonWsMethod.invoke(extendedMessageFormat, seekNonWsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readArgumentIndex(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = " ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(-256);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
                org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
                org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
                org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "  ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(65);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
                org.apache.commons.lang3.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:304)
                org.apache.commons.lang3.text.StrMatcher.isMatch(StrMatcher.java:271)
                org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:450)
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; !error && pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowIllegalArgumentException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\"\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(4);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 4:  ]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; !error && pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowIllegalArgumentException_1() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\f";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Unterminated format element at position 0]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:358) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowIllegalArgumentException_2() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\"";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 0: "]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; !error && pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: pattern.substring(start, pos.getIndex())
 *  */
    @Test
    public void testReadArgumentIndex_ThrowIllegalArgumentException_3() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 0:  ]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; !error && pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: pattern.substring(start, pos.getIndex())
 *  */
    @Test
    public void testReadArgumentIndex_ThrowIllegalArgumentException_4() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = ", ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 0: ,]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; !error && pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: pattern.substring(start, pos.getIndex())
 *  */
    @Test
    public void testReadArgumentIndex_ThrowIllegalArgumentException_5() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "} ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 0: }]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; !error && pos.getIndex() < pattern.length(); next(pos))} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowIllegalArgumentException_6() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "@2";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(1);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Unterminated format element at position 1]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:358) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:448)
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:329) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
        readArgumentIndexMethod.setAccessible(true);
        java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
        readArgumentIndexMethodArguments[0] = ((Object) null);
        readArgumentIndexMethodArguments[1] = parsePosition;
        try {
            readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int start = pos.getIndex();
 *  */
    @Test
    public void testReadArgumentIndex_ThrowNullPointerException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:328) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
        readArgumentIndexMethod.setAccessible(true);
        java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
        readArgumentIndexMethodArguments[0] = ((Object) null);
        readArgumentIndexMethodArguments[1] = ((Object) null);
        try {
            readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method readArgumentIndex(java.lang.String, java.text.ParsePosition)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testReadArgumentIndexThrowsNPEWithNonEmptyString() throws Throwable  {
        Locale locale = new Locale("\n\t\r", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("10", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("10");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:328) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
        readArgumentIndexMethod.setAccessible(true);
        java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
        readArgumentIndexMethodArguments[0] = "-";
        readArgumentIndexMethodArguments[1] = ((Object) null);
        try {
            readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testReadArgumentIndexThrowsNPEWithNonEmptyString1() throws Throwable  {
        Locale locale = new Locale("\n\t\r", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("10", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("10");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:328) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
        readArgumentIndexMethod.setAccessible(true);
        java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
        readArgumentIndexMethodArguments[0] = "g-";
        readArgumentIndexMethodArguments[1] = ((Object) null);
        try {
            readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testReadArgumentIndexThrowsNPEWithNonEmptyString2() throws Throwable  {
        Locale locale = new Locale("\n\t\r", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("10", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("10");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:328) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
        readArgumentIndexMethod.setAccessible(true);
        java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
        readArgumentIndexMethodArguments[0] = "g-\u000F";
        readArgumentIndexMethodArguments[1] = ((Object) null);
        try {
            readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testReadArgumentIndexThrowsNPEWithNonEmptyString3() throws Throwable  {
        Locale locale = new Locale("\n\t\r", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("10", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("10");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:328) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
        readArgumentIndexMethod.setAccessible(true);
        java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
        readArgumentIndexMethodArguments[0] = "g-\u000F";
        readArgumentIndexMethodArguments[1] = ((Object) null);
        try {
            readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method readArgumentIndex(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testReadArgumentIndex1() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"1,";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(30);
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            int actual = ((Integer) readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments));
            
            assertEquals(1, actual);
            
            int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
            
            assertEquals(31, finalParsePositionIndex);
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readArgumentIndex(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testReadArgumentIndex2() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\f\"";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(37);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 37: "]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    @Test
    public void testReadArgumentIndex3() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\f ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(37);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Unterminated format element at position 37]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:358) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    @Test
    public void testReadArgumentIndex4() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(3);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 3:  ]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    @Test
    public void testReadArgumentIndex5() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\u0000\u0000\u0000\u0000";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(1);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 1:  ]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    @Test
    public void testReadArgumentIndex6() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(3);
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.IllegalArgumentException: Invalid format argument index at position 3:  ]
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:356) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    @Test
    public void testReadArgumentIndex7() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "6\n";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:336) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    @Test
    public void testReadArgumentIndex8() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "6\f";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:336) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    @Test
    public void testReadArgumentIndex9() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "6\r";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:336) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    
    @Test
    public void testReadArgumentIndex10() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang3.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang3.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
            String string = "6 ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            /* This test fails because method [org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
                java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                java.base/java.lang.String.charAt(String.java:1519)
                org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:336) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
            Class stringType = Class.forName("java.lang.String");
            Class parsePositionType = Class.forName("java.text.ParsePosition");
            Method readArgumentIndexMethod = extendedMessageFormatClazz.getDeclaredMethod("readArgumentIndex", stringType, parsePositionType);
            readArgumentIndexMethod.setAccessible(true);
            java.lang.Object[] readArgumentIndexMethodArguments = new java.lang.Object[2];
            readArgumentIndexMethodArguments[0] = string;
            readArgumentIndexMethodArguments[1] = parsePosition;
            try {
                readArgumentIndexMethod.invoke(extendedMessageFormat, readArgumentIndexMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(StrMatcher.class, "SPLIT_MATCHER", prevSPLIT_MATCHER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString
    
    ///region Errors report for appendQuotedString
    
    public void testAppendQuotedString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 20 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.containsElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method containsElements(java.util.Collection)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (coll == null): False}
    /// invoke:
    ///     {@link java.util.Collection#size()} twice,
    ///     {@link java.util.Collection#iterator()} twice,
    ///     {@link java.util.Iterator#hasNext()} twice,
    ///     {@link java.util.Iterator#next()} twice
    /// return from: {@code return true;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testContainsElements_ReturnTrue() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        hashSet.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class hashSetType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", hashSetType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = hashSet;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testContainsElements_ReturnTrue_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        hashSet.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class hashSetType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", hashSetType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = hashSet;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testContainsElements_ReturnTrue_2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        Integer integer = 17;
        hashSet.add(integer);
        Integer integer1 = 0;
        hashSet.add(integer1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class hashSetType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", hashSetType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = hashSet;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method containsElements(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): True}
 *  */
    @Test
    public void testContainsElements_CollEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class collectionType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", collectionType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 *  */
    @Test
    public void testContainsElements_CollNotEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class arrayListType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", arrayListType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = arrayList;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 *  */
    @Test
    public void testContainsElements_CollNotEqualsNull_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class hashSetType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", hashSetType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = hashSet;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testContainsElements_CollNotEqualsNull_2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class hashSetType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", hashSetType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = hashSet;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 *  */
    @Test
    public void testContainsElements_ReturnFalse() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class arrayListType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", arrayListType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = arrayList;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testContainsElements_CollNotEqualsNull_3() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class hashSetType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", hashSetType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = hashSet;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testContainsElements_CollNotEqualsNull_4() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        Long long1 = 0L;
        hashSet.add(long1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class hashSetType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", hashSetType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = hashSet;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method containsElements(java.util.Collection)
    
    @Test
    public void testContainsElements1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class hashSetType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", hashSetType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = hashSet;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.ExtendedMessageFormat.getQuotedString
    
    ///region Errors report for getQuotedString
    
    public void testGetQuotedString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 29 occurrences of:
        // Concrete execution failed
        
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields628332631392900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields628332631392900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass628332631399100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields628332631392900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass628332631399100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields628332631600900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields628332631600900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass628332631601600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields628332631600900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass628332631601600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields628332631885900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields628332631885900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass628332631887500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields628332631885900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass628332631887500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields628332632404900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields628332632404900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass628332632406400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields628332632404900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass628332632406400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

