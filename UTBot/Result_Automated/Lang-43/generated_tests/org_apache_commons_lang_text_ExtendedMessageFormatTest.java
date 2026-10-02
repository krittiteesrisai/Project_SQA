package org.apache.commons.lang.text;

import org.junit.Test;
import java.text.ParsePosition;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.text.Format;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.text.StrMatcher.CharSetMatcher;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_lang_text_ExtendedMessageFormatTest {
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.next
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method next(java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#next(java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link java.text.ParsePosition#setIndex(int)}
 * @utbot.returnsFrom {@code return pos;}
 *  */
    @Test
    public void testNext_ParsePositionSetIndex() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#next(java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pos.setIndex(pos.getIndex() + 1);
 *  */
    @Test
    public void testNext_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.next] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.next(ExtendedMessageFormat.java:403) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyPattern(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.executesCondition {@code (registry == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.invokes {@link java.text.MessageFormat#applyPattern(java.lang.String)}
 * @utbot.invokes {@link java.text.MessageFormat#toPattern()}
 * @utbot.invokes org.apache.commons.lang.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)
 * @utbot.invokes org.apache.commons.lang.text.ExtendedMessageFormat#containsElements(java.util.Collection)
 * @utbot.iterates iterate the loop {@code while(pos.getIndex() < pattern.length())} once
 *  */
    @Test
    public void testApplyPattern_RegistryNotEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "";
        
        extendedMessageFormat.applyPattern(string);
        
        int finalExtendedMessageFormatMaxOffset = ((Integer) getFieldValue(extendedMessageFormat, "java.text.MessageFormat", "maxOffset"));
        
        assertEquals(-1, finalExtendedMessageFormatMaxOffset);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyPattern(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.executesCondition {@code (registry == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "{";
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: Unmatched braces in the pattern.]
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:521)
            org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:144) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.executesCondition {@code (registry == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.applyPattern(pattern);
 *  */
    @Test
    public void testApplyPattern_ThrowIllegalArgumentException_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        setField(extendedMessageFormat, "java.text.MessageFormat", "maxOffset", -255);
        String string = "{}";
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern] produces [java.lang.IllegalArgumentException: can't parse argument number: ]
            java.base/java.text.MessageFormat.makeFormat(MessageFormat.java:1454)
            java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:492)
            org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:144) */
        extendedMessageFormat.applyPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
 * @utbot.executesCondition {@code (registry == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringBuffer stripCustom = new StringBuffer(pattern.length());
 *  */
    @Test
    public void testApplyPattern_ThrowNullPointerException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:150) */
        extendedMessageFormat.applyPattern(null);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method applyPattern(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#applyPattern(java.lang.String)}
     */
    @Test(timeout = 1000L)
    public void testApplyPatternWithNonEmptyString() {
        HashMap hashMap = new HashMap();
        Object object = new Object();
        Object object1 = new Object();
        hashMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        hashMap.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        hashMap.put(object4, object5);
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("#$\\\"'", hashMap);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale = new Locale("abc", "", "-3");
        extendedMessageFormat.setLocale(locale);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedMessageFormat.applyPattern("-3");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method applyPattern(java.lang.String)
    
    @Test
    public void testApplyPattern1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "\u0000'\u0000";
        
        extendedMessageFormat.applyPattern(string);
        
        Map finalExtendedMessageFormatRegistry = ((Map) getFieldValue(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry"));
        int finalExtendedMessageFormatMaxOffset = ((Integer) getFieldValue(extendedMessageFormat, "java.text.MessageFormat", "maxOffset"));
        
        assertNull(finalExtendedMessageFormatRegistry);
        
        assertEquals(-1, finalExtendedMessageFormatMaxOffset);
    }
    
    @Test
    public void testApplyPattern2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "\u0000\u0000\u0000";
        
        extendedMessageFormat.applyPattern(string);
    }
    
    @Test
    public void testApplyPattern3() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "\u0000\u0000";
        
        extendedMessageFormat.applyPattern(string);
        
        int finalExtendedMessageFormatMaxOffset = ((Integer) getFieldValue(extendedMessageFormat, "java.text.MessageFormat", "maxOffset"));
        
        assertEquals(-1, finalExtendedMessageFormatMaxOffset);
    }
    
    @Test
    public void testApplyPattern4() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "\u0000";
        
        extendedMessageFormat.applyPattern(string);
        
        int finalExtendedMessageFormatMaxOffset = ((Integer) getFieldValue(extendedMessageFormat, "java.text.MessageFormat", "maxOffset"));
        
        assertEquals(-1, finalExtendedMessageFormatMaxOffset);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method applyPattern(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testApplyPattern5() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "\u0000\u0000'";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedMessageFormat.applyPattern(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method applyPattern(java.lang.String)
    
    @Test
    public void testApplyPattern6() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "\u0000\u0000{";
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
            org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391)
            org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:272)
            org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern(ExtendedMessageFormat.java:164) */
        extendedMessageFormat.applyPattern(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method applyPattern(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern7() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "{\u0000";
        
        extendedMessageFormat.applyPattern(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.toPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPattern()
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#toPattern()}
 * @utbot.returnsFrom {@code return toPattern;}
 *  */
    @Test
    public void testToPattern_ReturnToPattern() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        String actual = extendedMessageFormat.toPattern();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.setFormat
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setFormat(int, java.text.Format)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#setFormat(int,java.text.Format)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormat_ThrowUnsupportedOperationException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        extendedMessageFormat.setFormat(-255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.getFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFormat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getFormat(java.lang.String)}
 * @utbot.executesCondition {@code (registry != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFormat_RegistryEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = ((Object) null);
        Format actual = ((Format) getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments));
        
        assertNull(actual);
        
        Map finalExtendedMessageFormatRegistry = ((Map) getFieldValue(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry"));
        
        assertNull(finalExtendedMessageFormatRegistry);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getFormat(java.lang.String)}
 * @utbot.executesCondition {@code (registry != null): True}
 * @utbot.executesCondition {@code (i > 0): False}
 * @utbot.executesCondition {@code (factory != null): False}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFormat_FactoryEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "";
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = string;
        Format actual = ((Format) getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFormat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getFormat(java.lang.String)}
 * @utbot.executesCondition {@code (registry != null): True}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = desc.indexOf(START_FMT);
 *  */
    @Test
    public void testGetFormat_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.getFormat] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.getFormat(ExtendedMessageFormat.java:250) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = ((Object) null);
        try {
            getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFormat(java.lang.String)
    
    @Test
    public void testGetFormat1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        LinkedHashMap registry = new LinkedHashMap();
        setField(extendedMessageFormat, "org.apache.commons.lang.text.ExtendedMessageFormat", "registry", registry);
        String string = "\u0000,\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Method getFormatMethod = extendedMessageFormatClazz.getDeclaredMethod("getFormat", stringType);
        getFormatMethod.setAccessible(true);
        java.lang.Object[] getFormatMethodArguments = new java.lang.Object[1];
        getFormatMethodArguments[0] = string;
        Format actual = ((Format) getFormatMethod.invoke(extendedMessageFormat, getFormatMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readArgumentIndex(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrMatcher#isMatch(char[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = " ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(-256);
            
            /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
                org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
                org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
                org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391)
                org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:272) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testReadArgumentIndex_ThrowNullPointerException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:389)
            org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:272) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int start = pos.getIndex();
 *  */
    @Test
    public void testReadArgumentIndex_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:271) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readArgumentIndex(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.iterates iterate the loop {@code for(; !error && pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadArgumentIndex_ThrowIllegalArgumentException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "\"\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(16);
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#readArgumentIndex(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.iterates iterate the loop {@code for(; !error && pos.getIndex() < pattern.length(); next(pos))} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadArgumentIndex_ThrowIllegalArgumentException_1() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "\f";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.setFormats
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setFormats([Ljava.text.Format;)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#setFormats(java.text.Format[])}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormats_ThrowUnsupportedOperationException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        extendedMessageFormat.setFormats(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.containsElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsElements(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): True}
 *  */
    @Test
    public void testContainsElements_CollEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.executesCondition {@code (coll.size() == 0): True}
 *  */
    @Test
    public void testContainsElements_CollSizeEqualsZero() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.executesCondition {@code (coll.size() == 0): False}
 * @utbot.executesCondition {@code (iter.next() != null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testContainsElements_IterNextNotEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#containsElements(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.executesCondition {@code (coll.size() == 0): False}
 * @utbot.executesCondition {@code (iter.next() != null): False}
 *  */
    @Test
    public void testContainsElements_IterNextEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class arrayListType = Class.forName("java.util.Collection");
        Method containsElementsMethod = extendedMessageFormatClazz.getDeclaredMethod("containsElements", arrayListType);
        containsElementsMethod.setAccessible(true);
        java.lang.Object[] containsElementsMethodArguments = new java.lang.Object[1];
        containsElementsMethodArguments[0] = arrayList;
        boolean actual = ((Boolean) containsElementsMethod.invoke(extendedMessageFormat, containsElementsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuffer, boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): True}
 * @utbot.executesCondition {@code (c[start] == QUOTE): True}
 * @utbot.executesCondition {@code (appendTo == null): True}
 * @utbot.returnsFrom {@code return appendTo == null ? null : appendTo.append(QUOTE);}
 *  */
    @Test
    public void testAppendQuotedString_AppendToEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = true;
        StringBuffer actual = ((StringBuffer) appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos.getIndex(); i < pattern.length(); i++)} once
 *  */
    @Test
    public void testAppendQuotedString_AppendToEqualsNull_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = false;
        StringBuffer actual = ((StringBuffer) appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments));
        
        assertNull(actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): True}
 * @utbot.executesCondition {@code (c[start] == QUOTE): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos.getIndex(); i < pattern.length(); i++)} twice
 *  */
    @Test
    public void testAppendQuotedString_EscapingOnAndPatternSubstringIStartsWith() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " '";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = true;
        StringBuffer actual = ((StringBuffer) appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments));
        
        assertNull(actual);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(2, finalParsePositionIndex);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): True}
 * @utbot.executesCondition {@code (c[start] == QUOTE): True}
 * @utbot.executesCondition {@code (appendTo == null): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.returnsFrom {@code return appendTo == null ? null : appendTo.append(QUOTE);}
 *  */
    @Test
    public void testAppendQuotedString_AppendToNotEqualsNull() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = stringBuffer;
        appendQuotedStringMethodArguments[3] = true;
        StringBuffer actual = ((StringBuffer) appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments));
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        value[0] = (byte) 39;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 1);
        
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
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos.getIndex(); i < pattern.length(); i++)} once
 *  */
    @Test
    public void testAppendQuotedString_AppendToNotEqualsNull_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = stringBuffer;
        appendQuotedStringMethodArguments[3] = false;
        StringBuffer actual = ((StringBuffer) appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments));
        
        StringBuffer expected = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[17];
        value[1] = (byte) 39;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 2);
        
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
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuffer, boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: escapingOn && c[start] == QUOTE
 *  */
    @Test
    public void testAppendQuotedString_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "  ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(129);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:421) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = true;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos.getIndex(); i < pattern.length(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(c[pos.getIndex()])
 *  */
    @Test
    public void testAppendQuotedString_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:433) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = false;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): True}
 * @utbot.executesCondition {@code (c[start] == QUOTE): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos.getIndex(); i < pattern.length(); i++)} 3 times
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(c[pos.getIndex()])
 *  */
    @Test
    public void testAppendQuotedString_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " ''";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:433) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = stringBuffer;
        appendQuotedStringMethodArguments[3] = true;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char[] c = pattern.toCharArray();
 *  */
    @Test
    public void testAppendQuotedString_ThrowNullPointerException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:420) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = ((Object) null);
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = false;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): True}
 * @utbot.executesCondition {@code (c[start] == QUOTE): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos.getIndex(); i < pattern.length(); i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendTo.append(c, lastHold, pos.getIndex() - lastHold).append(QUOTE);
 *  */
    @Test
    public void testAppendQuotedString_ThrowNullPointerException_2() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " ''           ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:427) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = true;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int start = pos.getIndex();
 *  */
    @Test
    public void testAppendQuotedString_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString] produces [java.lang.NullPointerException] */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = ((Object) null);
        appendQuotedStringMethodArguments[1] = ((Object) null);
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = false;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuffer, boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated quoted string at position " + start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendQuotedString_ThrowIllegalArgumentException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = false;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos.getIndex(); i < pattern.length(); i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated quoted string at position " + start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendQuotedString_ThrowIllegalArgumentException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "  ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = false;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#appendQuotedString(java.lang.String,java.text.ParsePosition,java.lang.StringBuffer,boolean)}
 * @utbot.executesCondition {@code (escapingOn): True}
 * @utbot.executesCondition {@code (c[start] == QUOTE): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos.getIndex(); i < pattern.length(); i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated quoted string at position " + start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendQuotedString_ThrowIllegalArgumentException_2() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = string;
        appendQuotedStringMethodArguments[1] = parsePosition;
        appendQuotedStringMethodArguments[2] = ((Object) null);
        appendQuotedStringMethodArguments[3] = true;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuffer, boolean)
    
    @Test
    public void testAppendQuotedStringByFuzzer() throws Throwable  {
        Locale locale = new Locale("''", "");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("#$\\\"'", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("\n\t\r");
        extendedMessageFormat.setLocale(locale1);
        StringBuffer stringBuffer = new StringBuffer();
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:419) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class booleanType = boolean.class;
        Method appendQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("appendQuotedString", stringType, parsePositionType, stringBufferType, booleanType);
        appendQuotedStringMethod.setAccessible(true);
        java.lang.Object[] appendQuotedStringMethodArguments = new java.lang.Object[4];
        appendQuotedStringMethodArguments[0] = "-3";
        appendQuotedStringMethodArguments[1] = ((Object) null);
        appendQuotedStringMethodArguments[2] = stringBuffer;
        appendQuotedStringMethodArguments[3] = false;
        try {
            appendQuotedStringMethod.invoke(extendedMessageFormat, appendQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQuotedString(java.lang.String, java.text.ParsePosition, boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 *  */
    @Test
    public void testGetQuotedString() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = true;
        getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 *  */
    @Test
    public void testGetQuotedString_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = false;
        getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(1, finalParsePositionIndex);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 *  */
    @Test
    public void testGetQuotedString_2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " '";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = true;
        getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        
        int finalParsePositionIndex = ((Integer) getFieldValue(parsePosition, "java.text.ParsePosition", "index"));
        
        assertEquals(2, finalParsePositionIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getQuotedString(java.lang.String, java.text.ParsePosition, boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendQuotedString(pattern, pos, null, escapingOn);
 *  */
    @Test
    public void testGetQuotedString_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-256);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:421)
            org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString(ExtendedMessageFormat.java:455) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = true;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendQuotedString(pattern, pos, null, escapingOn);
 *  */
    @Test
    public void testGetQuotedString_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-1);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:433)
            org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString(ExtendedMessageFormat.java:455) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = false;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendQuotedString(pattern, pos, null, escapingOn);
 *  */
    @Test
    public void testGetQuotedString_ThrowNullPointerException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:420)
            org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString(ExtendedMessageFormat.java:455) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = ((Object) null);
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = false;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendQuotedString(pattern, pos, null, escapingOn);
 *  */
    @Test
    public void testGetQuotedString_ThrowNullPointerException_2() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " ''           ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:427)
            org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString(ExtendedMessageFormat.java:455) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = true;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendQuotedString(pattern, pos, null, escapingOn);
 *  */
    @Test
    public void testGetQuotedString_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.appendQuotedString(ExtendedMessageFormat.java:419)
            org.apache.commons.lang.text.ExtendedMessageFormat.getQuotedString(ExtendedMessageFormat.java:455) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = ((Object) null);
        getQuotedStringMethodArguments[1] = ((Object) null);
        getQuotedStringMethodArguments[2] = false;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getQuotedString(java.lang.String, java.text.ParsePosition, boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: appendQuotedString(pattern, pos, null, escapingOn);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQuotedString_ThrowIllegalArgumentException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "  ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(2);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = false;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: appendQuotedString(pattern, pos, null, escapingOn);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQuotedString_ThrowIllegalArgumentException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "  ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(1);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = false;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#getQuotedString(java.lang.String,java.text.ParsePosition,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: appendQuotedString(pattern, pos, null, escapingOn);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQuotedString_ThrowIllegalArgumentException_2() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = " ";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = true;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getQuotedString(java.lang.String, java.text.ParsePosition, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetQuotedString1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = true;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetQuotedString2() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(24);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class parsePositionType = Class.forName("java.text.ParsePosition");
        Class booleanType = boolean.class;
        Method getQuotedStringMethod = extendedMessageFormatClazz.getDeclaredMethod("getQuotedString", stringType, parsePositionType, booleanType);
        getQuotedStringMethod.setAccessible(true);
        java.lang.Object[] getQuotedStringMethodArguments = new java.lang.Object[3];
        getQuotedStringMethodArguments[0] = string;
        getQuotedStringMethodArguments[1] = parsePosition;
        getQuotedStringMethodArguments[2] = false;
        try {
            getQuotedStringMethod.invoke(extendedMessageFormat, getQuotedStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method seekNonWs(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 *  */
    @Test
    public void testSeekNonWs() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "\b";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testSeekNonWs_StringLength() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "\f";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method seekNonWs(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrMatcher#isMatch(char[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: len = StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
 *  */
    @Test
    public void testSeekNonWs_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "  ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(129);
            
            /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
                org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
                org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
                org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char[] buffer = pattern.toCharArray();
 *  */
    @Test
    public void testSeekNonWs_ThrowNullPointerException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:389) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: len = StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
 *  */
    @Test
    public void testSeekNonWs_ThrowNullPointerException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "";
            
            /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
                org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
     * @utbot.classUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#seekNonWs(java.lang.String,java.text.ParsePosition)}
     */
    @Test
    public void testSeekNonWsThrowsNPEWithNonEmptyString() throws Throwable  {
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        ExtendedMessageFormat extendedMessageFormat = new ExtendedMessageFormat("abc", locale);
        java.text.Format[] formatArray = {};
        extendedMessageFormat.setFormats(formatArray);
        Locale locale1 = new Locale("");
        extendedMessageFormat.setLocale(locale1);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insertFormats(java.lang.String, java.util.ArrayList)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
 * @utbot.returnsFrom {@code return pattern;}
 *  */
    @Test
    public void testInsertFormats_ReturnPattern() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
 * @utbot.returnsFrom {@code return pattern;}
 *  */
    @Test
    public void testInsertFormats_ReturnPattern_1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
 * @utbot.returnsFrom {@code return pattern;}
 *  */
    @Test
    public void testInsertFormats_ReturnPattern_2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#insertFormats(java.lang.String,java.util.ArrayList)}
 * @utbot.invokes org.apache.commons.lang.text.ExtendedMessageFormat#containsElements(java.util.Collection)
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StringBuffer sb = new StringBuffer(pattern.length() * 2);
 *  */
    @Test
    public void testInsertFormats_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:348) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insertFormats(java.lang.String, java.util.ArrayList)
    
    @Test
    public void testInsertFormats1() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "\u0000\u0000";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(extendedMessageFormat);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertFormats2() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "'";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertFormats3() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'}\u0000";
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class stringType = Class.forName("java.lang.String");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Method insertFormatsMethod = extendedMessageFormatClazz.getDeclaredMethod("insertFormats", stringType, arrayListType);
        insertFormatsMethod.setAccessible(true);
        java.lang.Object[] insertFormatsMethodArguments = new java.lang.Object[2];
        insertFormatsMethodArguments[0] = string;
        insertFormatsMethodArguments[1] = arrayList;
        String actual = ((String) insertFormatsMethod.invoke(extendedMessageFormat, insertFormatsMethodArguments));
        
        String expected = "'}\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertFormats(java.lang.String, java.util.ArrayList)
    
    @Test
    public void testInsertFormats4() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "{";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
            org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391)
            org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:272)
            org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:363) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    public void testInsertFormats5() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "\u0000}{";
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
            org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391)
            org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:272)
            org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:363) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    public void testInsertFormats6() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "{";
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
            org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391)
            org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:272)
            org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:363) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    public void testInsertFormats7() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "}{";
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
            org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391)
            org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:272)
            org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:363) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    public void testInsertFormats8() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        String string = "'{";
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
            org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391)
            org.apache.commons.lang.text.ExtendedMessageFormat.readArgumentIndex(ExtendedMessageFormat.java:272)
            org.apache.commons.lang.text.ExtendedMessageFormat.insertFormats(ExtendedMessageFormat.java:363) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.setFormatByArgumentIndex
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setFormatByArgumentIndex(int, java.text.Format)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#setFormatByArgumentIndex(int,java.text.Format)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndex_ThrowUnsupportedOperationException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        extendedMessageFormat.setFormatByArgumentIndex(-255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.setFormatsByArgumentIndex
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setFormatsByArgumentIndex([Ljava.text.Format;)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#setFormatsByArgumentIndex(java.text.Format[])}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndex_ThrowUnsupportedOperationException() throws Exception  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        extendedMessageFormat.setFormatsByArgumentIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.text.ExtendedMessageFormat.parseFormatDescription
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseFormatDescription(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link org.apache.commons.lang.text.StrMatcher#isMatch(char[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testParseFormatDescription_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = " ";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(-256);
            
            /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
                org.apache.commons.lang.text.StrMatcher$CharSetMatcher.isMatch(StrMatcher.java:299)
                org.apache.commons.lang.text.StrMatcher.isMatch(StrMatcher.java:267)
                org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:391)
                org.apache.commons.lang.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:314) */
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: seekNonWs(pattern, pos);
 *  */
    @Test
    public void testParseFormatDescription_ThrowNullPointerException_1() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
        parsePosition.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.seekNonWs(ExtendedMessageFormat.java:389)
            org.apache.commons.lang.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:314) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int start = pos.getIndex();
 *  */
    @Test
    public void testParseFormatDescription_ThrowNullPointerException() throws Throwable  {
        ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
        
        /* This test fails because method [org.apache.commons.lang.text.ExtendedMessageFormat.parseFormatDescription] produces [java.lang.NullPointerException]
            org.apache.commons.lang.text.ExtendedMessageFormat.parseFormatDescription(ExtendedMessageFormat.java:313) */
        Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFormatDescription(java.lang.String, java.text.ParsePosition)
    
    /**
    @utbot.classUnderTest {@link ExtendedMessageFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFormatDescription_ThrowIllegalArgumentException() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "\"\"\u0000";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(2);
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang.text.ExtendedMessageFormat#parseFormatDescription(java.lang.String,java.text.ParsePosition)}
 * @utbot.invokes {@link java.text.ParsePosition#getIndex()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Unterminated format element at position " + start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFormatDescription_ThrowIllegalArgumentException_1() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "\f";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseFormatDescription(java.lang.String, java.text.ParsePosition)
    
    @Test
    public void testParseFormatDescription1() throws Exception  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "}\"";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFormatDescription(java.lang.String, java.text.ParsePosition)
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseFormatDescription2() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\f\"";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(37);
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseFormatDescription3() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\r\f";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            parsePosition.setIndex(37);
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseFormatDescription4() throws Throwable  {
        Class strMatcherClazz = Class.forName("org.apache.commons.lang.text.StrMatcher");
        StrMatcher prevSPLIT_MATCHER = ((StrMatcher) getStaticFieldValue(strMatcherClazz, "SPLIT_MATCHER"));
        try {
            StrMatcher.CharSetMatcher splitMatcher = ((StrMatcher.CharSetMatcher) createInstance("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
            char[] chars = {'\t', '\n', '\f', '\r', ' '};
            setField(splitMatcher, "org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "chars", chars);
            setStaticField(strMatcherClazz, "SPLIT_MATCHER", splitMatcher);
            ExtendedMessageFormat extendedMessageFormat = ((ExtendedMessageFormat) createInstance("org.apache.commons.lang.text.ExtendedMessageFormat"));
            String string = "{\"";
            ParsePosition parsePosition = ((ParsePosition) createInstance("java.text.ParsePosition"));
            
            Class extendedMessageFormatClazz = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
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
        
            java.lang.reflect.Method methodForGetDeclaredFields658597905674100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields658597905674100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass658597905694200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields658597905674100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass658597905694200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields658597906648300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields658597906648300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass658597906655100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields658597906648300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass658597906655100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields658597918098400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields658597918098400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass658597918106200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields658597918098400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass658597918106200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields658597938775200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields658597938775200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass658597938784700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields658597938775200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass658597938784700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

