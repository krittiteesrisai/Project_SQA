package org.apache.commons.lang3.builder;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang3_builder_ToStringStyleTest {
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setSummaryObjectEndText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSummaryObjectEndText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSummaryObjectEndText(java.lang.String)}
 * @utbot.executesCondition {@code (summaryObjectEndText == null): False}
 *  */
    @Test
    public void testSetSummaryObjectEndText_SummaryObjectEndTextNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setSummaryObjectEndText(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSummaryObjectEndText(java.lang.String)}
 * @utbot.executesCondition {@code (summaryObjectEndText == null): True}
 *  */
    @Test
    public void testSetSummaryObjectEndText_SummaryObjectEndTextEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setSummaryObjectEndText(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isFieldSeparatorAtStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFieldSeparatorAtStart()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isFieldSeparatorAtStart()}
 * @utbot.returnsFrom {@code return fieldSeparatorAtStart;}
 *  */
    @Test
    public void testIsFieldSeparatorAtStart_ReturnFieldSeparatorAtStart() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        boolean actual = (((ToStringStyle) defaultToStringStyle)).isFieldSeparatorAtStart();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendIdentityHashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendIdentityHashCode(java.lang.StringBuffer, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendIdentityHashCode(java.lang.StringBuffer,java.lang.Object)}
 *  */
    @Test
    public void testAppendIdentityHashCode() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        standardToStringStyle.appendIdentityHashCode(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendIdentityHashCode(java.lang.StringBuffer,java.lang.Object)}
 * @utbot.executesCondition {@code (object != null): False}
 *  */
    @Test
    public void testAppendIdentityHashCode_ObjectEqualsNull() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseIdentityHashCode(true);
        
        standardToStringStyle.appendIdentityHashCode(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendIdentityHashCode(java.lang.StringBuffer,java.lang.Object)}
 *  */
    @Test
    public void testAppendIdentityHashCode_1() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendIdentityHashCode(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendIdentityHashCode(java.lang.StringBuffer, java.lang.Object)
    
    @Test
    public void testAppendIdentityHashCode1() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseIdentityHashCode(true);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        (((ToStringStyle) multiLineToStringStyle)).appendIdentityHashCode(stringBuffer, object);
    }
    
    @Test
    public void testAppendIdentityHashCode2() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseIdentityHashCode(true);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendIdentityHashCode(stringBuffer, object);
    }
    
    @Test
    public void testAppendIdentityHashCode3() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseIdentityHashCode(true);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        (((ToStringStyle) multiLineToStringStyle)).appendIdentityHashCode(stringBuffer, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setDefaultFullDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefaultFullDetail(boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setDefaultFullDetail(boolean)}
 *  */
    @Test
    public void testSetDefaultFullDetail() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        (((ToStringStyle) defaultToStringStyle)).setDefaultFullDetail(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setDefaultFullDetail(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setDefaultFullDetail(boolean)}
     */
    @Test
    public void testSetDefaultFullDetail1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setDefaultFullDetail(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setArrayContentDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setArrayContentDetail(boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArrayContentDetail(boolean)}
 *  */
    @Test
    public void testSetArrayContentDetail() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        (((ToStringStyle) defaultToStringStyle)).setArrayContentDetail(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setArrayContentDetail(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArrayContentDetail(boolean)}
     */
    @Test
    public void testSetArrayContentDetail1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setArrayContentDetail(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setFieldNameValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFieldNameValueSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldNameValueSeparator(java.lang.String)}
 * @utbot.executesCondition {@code (fieldNameValueSeparator == null): False}
 *  */
    @Test
    public void testSetFieldNameValueSeparator_FieldNameValueSeparatorNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setFieldNameValueSeparator(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldNameValueSeparator(java.lang.String)}
 * @utbot.executesCondition {@code (fieldNameValueSeparator == null): True}
 *  */
    @Test
    public void testSetFieldNameValueSeparator_FieldNameValueSeparatorEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setFieldNameValueSeparator(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFieldNameValueSeparator(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldNameValueSeparator(java.lang.String)}
     */
    @Test
    public void testSetFieldNameValueSeparatorWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setFieldNameValueSeparator("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isArrayContentDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isArrayContentDetail()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isArrayContentDetail()}
 * @utbot.returnsFrom {@code return arrayContentDetail;}
 *  */
    @Test
    public void testIsArrayContentDetail_ReturnArrayContentDetail() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        boolean actual = (((ToStringStyle) defaultToStringStyle)).isArrayContentDetail();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isArrayContentDetail()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isArrayContentDetail()}
     */
    @Test
    public void testIsArrayContentDetailReturnsTrue() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        boolean actual = standardToStringStyle.isArrayContentDetail();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparatorAtStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFieldSeparatorAtStart(boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldSeparatorAtStart(boolean)}
 *  */
    @Test
    public void testSetFieldSeparatorAtStart() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        (((ToStringStyle) defaultToStringStyle)).setFieldSeparatorAtStart(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFieldSeparatorAtStart(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldSeparatorAtStart(boolean)}
     */
    @Test
    public void testSetFieldSeparatorAtStart1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setFieldSeparatorAtStart(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isFieldSeparatorAtEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFieldSeparatorAtEnd()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isFieldSeparatorAtEnd()}
 * @utbot.returnsFrom {@code return fieldSeparatorAtEnd;}
 *  */
    @Test
    public void testIsFieldSeparatorAtEnd_ReturnFieldSeparatorAtEnd() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        boolean actual = (((ToStringStyle) defaultToStringStyle)).isFieldSeparatorAtEnd();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isFieldSeparatorAtEnd()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isFieldSeparatorAtEnd()}
     */
    @Test
    public void testIsFieldSeparatorAtEndReturnsFalse() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        boolean actual = standardToStringStyle.isFieldSeparatorAtEnd();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reflectionAppendArrayDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#reflectionAppendArrayDetail(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testReflectionAppendArrayDetail_ThrowNullPointerException() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail(ToStringStyle.java:970) */
        standardToStringStyle.reflectionAppendArrayDetail(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#reflectionAppendArrayDetail(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.Array#getLength(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testReflectionAppendArrayDetail_ThrowNullPointerException_1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayEnd = "";
        standardToStringStyle.setArrayEnd(arrayEnd);
        StringBuffer stringBuffer = new StringBuffer("     @     @@                  ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail(ToStringStyle.java:971) */
        standardToStringStyle.reflectionAppendArrayDetail(stringBuffer, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reflectionAppendArrayDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    @Test
    public void testReflectionAppendArrayDetail1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail] produces [java.lang.IllegalArgumentException: Argument is not an array]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail(ToStringStyle.java:971) */
        standardToStringStyle.reflectionAppendArrayDetail(stringBuffer, null, object);
    }
    
    @Test
    public void testReflectionAppendArrayDetail2() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail] produces [java.lang.IllegalArgumentException: Argument is not an array]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail(ToStringStyle.java:971) */
        standardToStringStyle.reflectionAppendArrayDetail(stringBuffer, null, object);
    }
    
    @Test
    public void testReflectionAppendArrayDetail3() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail] produces [java.lang.IllegalArgumentException: Argument is not an array]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail(ToStringStyle.java:971) */
        (((ToStringStyle) simpleToStringStyle)).reflectionAppendArrayDetail(stringBuffer, string, object);
    }
    
    @Test
    public void testReflectionAppendArrayDetail4() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail] produces [java.lang.IllegalArgumentException: Argument is not an array]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail(ToStringStyle.java:971) */
        standardToStringStyle.reflectionAppendArrayDetail(stringBuffer, null, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isUseShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUseShortClassName()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isUseShortClassName()}
 * @utbot.returnsFrom {@code return useShortClassName;}
 *  */
    @Test
    public void testIsUseShortClassName_ReturnUseShortClassName() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        boolean actual = (((ToStringStyle) defaultToStringStyle)).isUseShortClassName();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isUseShortClassName()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isUseShortClassName()}
     */
    @Test
    public void testIsUseShortClassNameReturnsFalse() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        boolean actual = standardToStringStyle.isUseShortClassName();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isUseIdentityHashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUseIdentityHashCode()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isUseIdentityHashCode()}
 * @utbot.returnsFrom {@code return useIdentityHashCode;}
 *  */
    @Test
    public void testIsUseIdentityHashCode_ReturnUseIdentityHashCode() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        boolean actual = (((ToStringStyle) defaultToStringStyle)).isUseIdentityHashCode();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isUseIdentityHashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isUseIdentityHashCode()}
     */
    @Test
    public void testIsUseIdentityHashCodeReturnsTrue() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        boolean actual = standardToStringStyle.isUseIdentityHashCode();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setUseIdentityHashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUseIdentityHashCode(boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setUseIdentityHashCode(boolean)}
 *  */
    @Test
    public void testSetUseIdentityHashCode() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setUseIdentityHashCode(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setUseIdentityHashCode(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setUseIdentityHashCode(boolean)}
     */
    @Test
    public void testSetUseIdentityHashCode1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setUseIdentityHashCode(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isDefaultFullDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDefaultFullDetail()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isDefaultFullDetail()}
 * @utbot.returnsFrom {@code return defaultFullDetail;}
 *  */
    @Test
    public void testIsDefaultFullDetail_ReturnDefaultFullDetail() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        boolean actual = (((ToStringStyle) shortPrefixToStringStyle)).isDefaultFullDetail();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isDefaultFullDetail()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isDefaultFullDetail()}
     */
    @Test
    public void testIsDefaultFullDetailReturnsTrue() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        boolean actual = standardToStringStyle.isDefaultFullDetail();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.removeLastFieldSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method removeLastFieldSeparator(java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#removeLastFieldSeparator(java.lang.StringBuffer)}
 * @utbot.invokes {@link java.lang.StringBuffer#length()}
 *  */
    @Test
    public void testRemoveLastFieldSeparator_StringBufferLength() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.removeLastFieldSeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#removeLastFieldSeparator(java.lang.StringBuffer)}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testRemoveLastFieldSeparator_StringLength() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        standardToStringStyle.removeLastFieldSeparator(stringBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#removeLastFieldSeparator(java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.executesCondition {@code (sepLen > 0): False}
 *  */
    @Test
    public void testRemoveLastFieldSeparator_SepLenLessOrEqualZero() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        standardToStringStyle.removeLastFieldSeparator(stringBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#removeLastFieldSeparator(java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (len > 0): False}
 *  */
    @Test
    public void testRemoveLastFieldSeparator_LenLessOrEqualZero() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.removeLastFieldSeparator(stringBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#removeLastFieldSeparator(java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.executesCondition {@code (sepLen > 0): True}
 * @utbot.executesCondition {@code (len >= sepLen): False}
 *  */
    @Test
    public void testRemoveLastFieldSeparator_LenLessThanSepLen() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String fieldSeparator = "   ";
        (((ToStringStyle) simpleToStringStyle)).setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("  ");
        
        (((ToStringStyle) simpleToStringStyle)).removeLastFieldSeparator(stringBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method removeLastFieldSeparator(java.lang.StringBuffer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.StringBuffer#length()} once,
    ///     {@link java.lang.String#length()} once
    /// execute conditions:
    ///     {@code (len > 0): True},
    ///     {@code (sepLen > 0): True},
    ///     {@code (len >= sepLen): True}
    /// invoke:
    ///     {@link java.lang.StringBuffer#charAt(int)} once,
    ///     {@link java.lang.String#charAt(int)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#removeLastFieldSeparator(java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (match): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sepLen; i++)} once
 *  */
    @Test
    public void testRemoveLastFieldSeparator_NotMatch() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = " ";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("!");
        
        standardToStringStyle.removeLastFieldSeparator(stringBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#removeLastFieldSeparator(java.lang.StringBuffer)}
 * @utbot.executesCondition {@code (match): True}
 * @utbot.invokes {@link java.lang.StringBuffer#setLength(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sepLen; i++)} once
 *  */
    @Test
    public void testRemoveLastFieldSeparator_Match() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = " ";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("  ");
        
        standardToStringStyle.removeLastFieldSeparator(stringBuffer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getFieldNameValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldNameValueSeparator()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getFieldNameValueSeparator()}
 * @utbot.returnsFrom {@code return fieldNameValueSeparator;}
 *  */
    @Test
    public void testGetFieldNameValueSeparator_ReturnFieldNameValueSeparator() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        String actual = (((ToStringStyle) shortPrefixToStringStyle)).getFieldNameValueSeparator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFieldNameValueSeparator()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getFieldNameValueSeparator()}
     */
    @Test
    public void testGetFieldNameValueSeparator() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getFieldNameValueSeparator();
        
        String expected = "=";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparatorAtEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFieldSeparatorAtEnd(boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldSeparatorAtEnd(boolean)}
 *  */
    @Test
    public void testSetFieldSeparatorAtEnd() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setFieldSeparatorAtEnd(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFieldSeparatorAtEnd(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldSeparatorAtEnd(boolean)}
     */
    @Test
    public void testSetFieldSeparatorAtEnd1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setFieldSeparatorAtEnd(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendFieldSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFieldSeparator(java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldSeparator(java.lang.StringBuffer)}
 *  */
    @Test
    public void testAppendFieldSeparator() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        (((ToStringStyle) simpleToStringStyle)).appendFieldSeparator(stringBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldSeparator(java.lang.StringBuffer)}
 *  */
    @Test
    public void testAppendFieldSeparator_1() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String fieldSeparator = "";
        (((ToStringStyle) simpleToStringStyle)).setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        (((ToStringStyle) simpleToStringStyle)).appendFieldSeparator(stringBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendFieldSeparator(java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldSeparator(java.lang.StringBuffer)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(fieldSeparator);
 *  */
    @Test
    public void testAppendFieldSeparator_ThrowNullPointerException() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendFieldSeparator] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendFieldSeparator(ToStringStyle.java:1549) */
        standardToStringStyle.appendFieldSeparator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getSummaryObjectStartText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSummaryObjectStartText()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getSummaryObjectStartText()}
 * @utbot.returnsFrom {@code return summaryObjectStartText;}
 *  */
    @Test
    public void testGetSummaryObjectStartText_ReturnSummaryObjectStartText() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        String actual = (((ToStringStyle) shortPrefixToStringStyle)).getSummaryObjectStartText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getSummaryObjectStartText()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getSummaryObjectStartText()}
     */
    @Test
    public void testGetSummaryObjectStartText() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getSummaryObjectStartText();
        
        String expected = "<";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setSummaryObjectStartText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSummaryObjectStartText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSummaryObjectStartText(java.lang.String)}
 * @utbot.executesCondition {@code (summaryObjectStartText == null): False}
 *  */
    @Test
    public void testSetSummaryObjectStartText_SummaryObjectStartTextNotEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String string = "";
        
        (((ToStringStyle) shortPrefixToStringStyle)).setSummaryObjectStartText(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSummaryObjectStartText(java.lang.String)}
 * @utbot.executesCondition {@code (summaryObjectStartText == null): True}
 *  */
    @Test
    public void testSetSummaryObjectStartText_SummaryObjectStartTextEqualsNull() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        
        (((ToStringStyle) simpleToStringStyle)).setSummaryObjectStartText(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSummaryObjectStartText(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSummaryObjectStartText(java.lang.String)}
     */
    @Test
    public void testSetSummaryObjectStartTextWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setSummaryObjectStartText("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getSummaryObjectEndText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSummaryObjectEndText()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getSummaryObjectEndText()}
 * @utbot.returnsFrom {@code return summaryObjectEndText;}
 *  */
    @Test
    public void testGetSummaryObjectEndText_ReturnSummaryObjectEndText() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        String actual = (((ToStringStyle) shortPrefixToStringStyle)).getSummaryObjectEndText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getSummaryObjectEndText()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getSummaryObjectEndText()}
     */
    @Test
    public void testGetSummaryObjectEndText() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getSummaryObjectEndText();
        
        String expected = ">";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setUseShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUseShortClassName(boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setUseShortClassName(boolean)}
 *  */
    @Test
    public void testSetUseShortClassName() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setUseShortClassName(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setUseShortClassName(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setUseShortClassName(boolean)}
     */
    @Test
    public void testSetUseShortClassName1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setUseShortClassName(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [Z)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,boolean[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1457) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((boolean[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,boolean[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_1() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1458) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((boolean[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,boolean[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_2() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1458) */
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((boolean[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [Z)
    
    @Test
    public void testAppendDetail1() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            true, false, false, false, false, false,
            false, false, false
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendDetail2() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {
            false, true, true, true, true, true,
            true, true, true
        };
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendDetail3() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {
            true, false, false, false, false, false,
            false, false, false
        };
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendDetail4() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {
            false, true, true, true, true, true,
            true, true, true
        };
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendDetail5() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayEnd = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayEnd(arrayEnd);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        boolean[] booleanArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, booleanArray);
    }
    
    @Test
    public void testAppendDetail6() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayEnd = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayEnd(arrayEnd);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        boolean[] booleanArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, booleanArray);
    }
    
    @Test
    public void testAppendDetail7() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        boolean[] booleanArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, booleanArray);
    }
    
    @Test
    public void testAppendDetail8() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {};
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), booleanArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,boolean)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(boolean)}
 *  */
    @Test
    public void testAppendDetail_StringBufferAppend() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("                         ");
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,boolean)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:890) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException2() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:931) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((java.lang.Object[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_11() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:932) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((java.lang.Object[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_21() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:932) */
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((java.lang.Object[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testAppendDetail9() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayEnd(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), objectArray);
    }
    
    @Test
    public void testAppendDetail10() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, objectArray);
    }
    
    @Test
    public void testAppendDetail11() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        (((ToStringStyle) noFieldNameToStringStyle)).setNullText(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, objectArray);
    }
    
    @Test
    public void testAppendDetail12() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, objectArray);
    }
    
    @Test
    public void testAppendDetail13() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String nullText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), objectArray);
    }
    
    @Test
    public void testAppendDetail14() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayEnd = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayEnd(arrayEnd);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        java.lang.Object[] objectArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, objectArray);
    }
    
    @Test
    public void testAppendDetail15() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), objectArray);
    }
    
    @Test
    public void testAppendDetail16() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        java.lang.Object[] objectArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, objectArray);
    }
    
    @Test
    public void testAppendDetail17() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), objectArray);
    }
    
    @Test
    public void testAppendDetail18() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        java.lang.Object[] objectArray = {null};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [D)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException3() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1335) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,double[])}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_12() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1336) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((double[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [D)
    
    @Test
    public void testAppendDetail19() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail20() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail21() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail22() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail23() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail24() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail25() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail26() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail27() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail28() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendDetail29() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [C)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,char[])}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 *  */
    @Test
    public void testAppendDetail_StringBufferAppend1() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String arrayEnd = "";
        (((ToStringStyle) simpleToStringStyle)).setArrayEnd(arrayEnd);
        StringBuffer stringBuffer = new StringBuffer("   @                         ");
        char[] charArray = {};
        
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), charArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [C)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException4() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1274) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((char[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_13() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1275) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((char[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_22() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1275) */
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((char[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [C)
    
    @Test
    public void testAppendDetail30() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayEnd(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        char[] charArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), charArray);
    }
    
    @Test
    public void testAppendDetail31() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "";
        char[] charArray = {'\u0000'};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, charArray);
    }
    
    @Test
    public void testAppendDetail32() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "";
        char[] charArray = {'\u0000'};
        
        (((ToStringStyle) multiLineToStringStyle)).appendDetail(stringBuffer, string, charArray);
    }
    
    @Test
    public void testAppendDetail33() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) multiLineToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "";
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        
        (((ToStringStyle) multiLineToStringStyle)).appendDetail(stringBuffer, string, charArray);
    }
    
    @Test
    public void testAppendDetail34() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "";
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, charArray);
    }
    
    @Test
    public void testAppendDetail35() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        char[] charArray = {};
        
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, string, charArray);
    }
    
    @Test
    public void testAppendDetail36() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        char[] charArray = {};
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, string, charArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [B)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException5() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1213) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((byte[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_14() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1214) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((byte[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_23() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) simpleToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1214) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((byte[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [B)
    
    @Test
    public void testAppendDetail37() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        byte[] byteArray = {
            (byte) 17, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        standardToStringStyle.appendDetail(stringBuffer, string, byteArray);
    }
    
    @Test
    public void testAppendDetail38() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        byte[] byteArray = {
            (byte) 17, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), byteArray);
    }
    
    @Test
    public void testAppendDetail39() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        byte[] byteArray = {
            (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        standardToStringStyle.appendDetail(stringBuffer, string, byteArray);
    }
    
    @Test
    public void testAppendDetail40() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), byteArray);
    }
    
    @Test
    public void testAppendDetail41() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        byte[] byteArray = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, byteArray);
    }
    
    @Test
    public void testAppendDetail42() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "";
        byte[] byteArray = {
            (byte) 117, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, byteArray);
    }
    
    @Test
    public void testAppendDetail43() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), byteArray);
    }
    
    @Test
    public void testAppendDetail44() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String arrayEnd = "";
        (((ToStringStyle) simpleToStringStyle)).setArrayEnd(arrayEnd);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        byte[] byteArray = {};
        
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), byteArray);
    }
    
    @Test
    public void testAppendDetail45() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        byte[] byteArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, byteArray);
    }
    
    @Test
    public void testAppendDetail46() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        byte[] byteArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [S)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,short[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException6() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1152) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((short[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,short[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_15() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1153) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((short[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,short[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_24() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1153) */
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((short[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [S)
    
    @Test
    public void testAppendDetail47() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        short[] shortArray = {
            (short) 17, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, shortArray);
    }
    
    @Test
    public void testAppendDetail48() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        short[] shortArray = {
            (short) 1, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, shortArray);
    }
    
    @Test
    public void testAppendDetail49() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 17, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendDetail50() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendDetail51() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {
            (short) 177, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendDetail52() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        short[] shortArray = {
            (short) -1, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, shortArray);
    }
    
    @Test
    public void testAppendDetail53() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {};
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendDetail54() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        short[] shortArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, shortArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [I)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException7() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1091) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((int[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_16() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1092) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((int[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_25() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1092) */
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((int[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [I)
    
    @Test
    public void testAppendDetail55() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 71, 71, 71, 71, 71, 71, 71,
            71
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendDetail56() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        int[] intArray = {
            1, 71, 71, 71, 71, 71, 71, 71,
            71
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, intArray);
    }
    
    @Test
    public void testAppendDetail57() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            Integer.MIN_VALUE, 71, 71, 71, 71, 71, 71, 71,
            71
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendDetail58() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = {
            17, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendDetail59() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            17, 71, 71, 71, 71, 71, 71, 71,
            71
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendDetail60() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = {
            Integer.MIN_VALUE, 20, 20, 20, 20, 20, 20, 20,
            20
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendDetail61() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayEnd(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendDetail62() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendDetail63() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0000\u0000";
        int[] intArray = {
            -1, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623, -2147482623,
            -2147482623
        };
        
        standardToStringStyle.appendDetail(stringBuffer, string, intArray);
    }
    
    @Test
    public void testAppendDetail64() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = {
            177, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendDetail65() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayEnd = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayEnd(arrayEnd);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        int[] intArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [J)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException8() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1030) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((long[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_17() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1031) */
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ((long[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_26() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1031) */
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((long[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [J)
    
    @Test
    public void testAppendDetail66() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendDetail67() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String arrayStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        (((ToStringStyle) simpleToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "";
        long[] longArray = {
            2L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, string, longArray);
    }
    
    @Test
    public void testAppendDetail68() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, longArray);
    }
    
    @Test
    public void testAppendDetail69() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {
            -92L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L, 0L
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendDetail70() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {
            java.lang.Long.MIN_VALUE, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendDetail71() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        long[] longArray = {
            17L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, longArray);
    }
    
    @Test
    public void testAppendDetail72() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayEnd(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendDetail73() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {
            177L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendDetail74() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        long[] longArray = {
            2L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        standardToStringStyle.appendDetail(stringBuffer, string, longArray);
    }
    
    @Test
    public void testAppendDetail75() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String arrayStart = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        long[] longArray = {
            java.lang.Long.MIN_VALUE, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, string, longArray);
    }
    
    @Test
    public void testAppendDetail76() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendDetail(stringBuffer, ((String) null), longArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,int)}
 *  */
    @Test
    public void testAppendDetail() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), -1);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,int)}
 *  */
    @Test
    public void testAppendDetail_1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("                             ");
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,int)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException9() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:722) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, long)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,long)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(long)}
 *  */
    @Test
    public void testAppendDetail_StringBufferAppend2() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), 0L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, long)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,long)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException10() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:694) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), -255L);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, long)
    
    @Test
    public void testAppendDetail77() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, string, -7L);
    }
    
    @Test
    public void testAppendDetail78() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Long.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.util.Map)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.Object)}
 *  */
    @Test
    public void testAppendDetail_StringBufferAppend3() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((Map) linkedHashMap));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.util.Map)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(map);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException11() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:651) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((Map) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.util.Collection)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.Object)}
 *  */
    @Test
    public void testAppendDetail_StringBufferAppend4() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        ArrayList arrayList = new ArrayList();
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((Collection) arrayList));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.util.Collection)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(coll);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException12() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:639) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((Collection) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 *  */
    @Test
    public void testAppendDetail79() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                             ");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), ((Object) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 *  */
    @Test
    public void testAppendDetail_11() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Integer integer = Integer.MIN_VALUE;
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), ((Object) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException13() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:617) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    @Test
    public void testAppendDetail80() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        Integer integer = 17;
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), ((Object) integer));
    }
    
    @Test
    public void testAppendDetail81() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        Character character = '\u0000';
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), ((Object) character));
    }
    
    @Test
    public void testAppendDetail82() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Integer integer = -6;
        
        standardToStringStyle.appendDetail(stringBuffer, string, ((Object) integer));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, [F)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,float[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(arrayStart);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException14() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1396) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ((float[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,float[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_18() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1397) */
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((float[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,float[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < array.length; i++)
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException_27() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:1397) */
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), ((float[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, [F)
    
    @Test
    public void testAppendDetail83() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail84() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail85() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail86() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail87() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail88() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail89() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail90() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail91() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail92() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendDetail93() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), floatArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,double)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException15() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:834) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, double)
    
    @Test
    public void testAppendDetail94() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail95() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail96() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail97() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail98() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail99() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail100() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail101() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail102() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail103() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppendDetail104() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, char)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,char)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 *  */
    @Test
    public void testAppendDetail_StringBufferAppend5() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), ' ');
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, char)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,char)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException16() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:806) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), ' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, byte)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,byte)}
 *  */
    @Test
    public void testAppendDetail105() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), (byte) 0);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,byte)}
 *  */
    @Test
    public void testAppendDetail_12() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.appendDetail(stringBuffer, ((String) null), (byte) -1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, byte)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,byte)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException17() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:778) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), (byte) -127);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, short)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,short)}
 *  */
    @Test
    public void testAppendDetail106() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), (short) 0);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,short)}
 *  */
    @Test
    public void testAppendDetail_13() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        (((ToStringStyle) simpleToStringStyle)).appendDetail(stringBuffer, ((String) null), (short) -1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, short)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,short)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException18() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:750) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), (short) -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendDetail
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDetail(java.lang.StringBuffer, java.lang.String, float)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendDetail(java.lang.StringBuffer,java.lang.String,float)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(float)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(value);
 *  */
    @Test
    public void testAppendDetail_ThrowNullPointerException19() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendDetail] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendDetail(ToStringStyle.java:862) */
        standardToStringStyle.appendDetail(((StringBuffer) null), ((String) null), java.lang.Float.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDetail(java.lang.StringBuffer, java.lang.String, float)
    
    @Test
    public void testAppendDetail107() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail108() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail109() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail110() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail111() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail112() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail113() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail114() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail115() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail116() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppendDetail117() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendDetail(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendToString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendToString(java.lang.StringBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendToString(java.lang.StringBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (toString != null): False}
 *  */
    @Test
    public void testAppendToString_ToStringEqualsNull() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.appendToString(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendToString(java.lang.StringBuffer, java.lang.String)
    
    @Test
    public void testAppendToString1() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String contentStart = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentStart(contentStart);
        (((ToStringStyle) shortPrefixToStringStyle)).setContentEnd(contentStart);
        String string = "";
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendToString(null, string);
    }
    
    @Test
    public void testAppendToString2() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String contentStart = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentStart(contentStart);
        String contentEnd = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentEnd(contentEnd);
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendToString(null, contentStart);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendToString(java.lang.StringBuffer, java.lang.String)
    
    @Test
    public void testAppendToString3() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String contentStart = "\u0000\u0000\u0000\u0000";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentStart(contentStart);
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        (((ToStringStyle) shortPrefixToStringStyle)).appendToString(null, contentStart);
    }
    
    @Test
    public void testAppendToString4() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        (((ToStringStyle) noFieldNameToStringStyle)).setContentStart(contentStart);
        String string = "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        (((ToStringStyle) noFieldNameToStringStyle)).appendToString(null, string);
    }
    
    @Test
    public void testAppendToString5() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        standardToStringStyle.appendToString(stringBuffer, string);
    }
    
    @Test
    public void testAppendToString6() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        standardToStringStyle.appendToString(null, string);
    }
    
    @Test
    public void testAppendToString7() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        standardToStringStyle.appendToString(null, string);
    }
    
    @Test
    public void testAppendToString8() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        (((ToStringStyle) noFieldNameToStringStyle)).setContentStart(contentStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        (((ToStringStyle) noFieldNameToStringStyle)).appendToString(stringBuffer, string);
    }
    
    @Test
    public void testAppendToString9() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        standardToStringStyle.appendToString(null, string);
    }
    
    @Test
    public void testAppendToString10() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0001\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0001\u0000\u0001\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        standardToStringStyle.appendToString(null, string);
    }
    
    @Test
    public void testAppendToString11() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        (((ToStringStyle) noFieldNameToStringStyle)).setContentStart(contentStart);
        String string = "\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        (((ToStringStyle) noFieldNameToStringStyle)).appendToString(null, string);
    }
    
    @Test
    public void testAppendToString12() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        standardToStringStyle.appendToString(null, string);
    }
    
    @Test
    public void testAppendToString13() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendToString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392) */
        standardToStringStyle.appendToString(null, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSuper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSuper(java.lang.StringBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSuper(java.lang.StringBuffer,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.ToStringStyle#appendToString(java.lang.StringBuffer,java.lang.String)}
 *  */
    @Test
    public void testAppendSuper_ToStringStyleAppendToString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.appendSuper(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSuper(java.lang.StringBuffer, java.lang.String)
    
    @Test
    public void testAppendSuper1() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String contentStart = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentStart(contentStart);
        (((ToStringStyle) shortPrefixToStringStyle)).setContentEnd(contentStart);
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendSuper(null, contentStart);
    }
    
    @Test
    public void testAppendSuper2() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "";
        standardToStringStyle.setContentStart(contentStart);
        standardToStringStyle.setContentEnd(contentStart);
        String string = "";
        
        standardToStringStyle.appendSuper(null, string);
    }
    
    @Test
    public void testAppendSuper3() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String contentStart = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentStart(contentStart);
        String contentEnd = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentEnd(contentEnd);
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendSuper(null, contentStart);
    }
    
    @Test
    public void testAppendSuper4() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String contentStart = "\u0000";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentStart(contentStart);
        String contentEnd = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentEnd(contentEnd);
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendSuper(null, contentStart);
    }
    
    @Test
    public void testAppendSuper5() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String contentStart = "\u0000\u0000\u0000";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentStart(contentStart);
        String contentEnd = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setContentEnd(contentEnd);
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendSuper(null, contentStart);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendSuper(java.lang.StringBuffer, java.lang.String)
    
    @Test
    public void testAppendSuper6() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(null, string);
    }
    
    @Test
    public void testAppendSuper7() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(stringBuffer, string);
    }
    
    @Test
    public void testAppendSuper8() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(null, string);
    }
    
    @Test
    public void testAppendSuper9() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(stringBuffer, string);
    }
    
    @Test
    public void testAppendSuper10() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        (((ToStringStyle) multiLineToStringStyle)).setContentStart(contentStart);
        String string = "\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        (((ToStringStyle) multiLineToStringStyle)).appendSuper(null, string);
    }
    
    @Test
    public void testAppendSuper11() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(null, string);
    }
    
    @Test
    public void testAppendSuper12() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(null, string);
    }
    
    @Test
    public void testAppendSuper13() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        String string = "\u0002\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(null, string);
    }
    
    @Test
    public void testAppendSuper14() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String contentStart = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        (((ToStringStyle) noFieldNameToStringStyle)).setContentStart(contentStart);
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        (((ToStringStyle) noFieldNameToStringStyle)).appendSuper(null, string);
    }
    
    @Test
    public void testAppendSuper15() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000";
        standardToStringStyle.setContentStart(contentStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(stringBuffer, string);
    }
    
    @Test
    public void testAppendSuper16() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        standardToStringStyle.setContentStart(contentStart);
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSuper] produces [java.lang.NullPointerException]
            java.base/java.lang.String.lastIndexOf(String.java:2636)
            java.base/java.lang.String.lastIndexOf(String.java:2620)
            java.base/java.lang.String.lastIndexOf(String.java:2599)
            org.apache.commons.lang3.builder.ToStringStyle.appendToString(ToStringStyle.java:392)
            org.apache.commons.lang3.builder.ToStringStyle.appendSuper(ToStringStyle.java:376) */
        standardToStringStyle.appendSuper(stringBuffer, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [B)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:1233) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((byte[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [B)
    
    @Test
    public void testAppendSummary1() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {(byte) 0};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), byteArray);
    }
    
    @Test
    public void testAppendSummary2() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        byte[] byteArray = new byte[17];
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, ((String) null), byteArray);
    }
    
    @Test
    public void testAppendSummary3() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        byte[] byteArray = {(byte) 0};
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, ((String) null), byteArray);
    }
    
    @Test
    public void testAppendSummary4() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = new byte[17];
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), byteArray);
    }
    
    @Test
    public void testAppendSummary5() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        byte[] byteArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [C)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,char[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:1294) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((char[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [C)
    
    @Test
    public void testAppendSummary6() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        char[] charArray = {'\u0000'};
        
        (((ToStringStyle) defaultToStringStyle)).appendSummary(stringBuffer, ((String) null), charArray);
    }
    
    @Test
    public void testAppendSummary7() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        char[] charArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), charArray);
    }
    
    @Test
    public void testAppendSummary8() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        char[] charArray = new char[17];
        
        (((ToStringStyle) defaultToStringStyle)).appendSummary(stringBuffer, ((String) null), charArray);
    }
    
    @Test
    public void testAppendSummary9() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        char[] charArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), charArray);
    }
    
    @Test
    public void testAppendSummary10() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        char[] charArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), charArray);
    }
    
    @Test
    public void testAppendSummary11() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        char[] charArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), charArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [Z)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,boolean[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException2() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:1477) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((boolean[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [Z)
    
    @Test
    public void testAppendSummary12() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {false};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendSummary13() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = new boolean[17];
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendSummary14() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendSummary15() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = new boolean[17];
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendSummary16() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {false};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendSummary17() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendSummary18() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), booleanArray);
    }
    
    @Test
    public void testAppendSummary19() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        boolean[] booleanArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), booleanArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [D)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException3() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:1355) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((double[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [D)
    
    @Test
    public void testAppendSummary20() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        double[] doubleArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, string, doubleArray);
    }
    
    @Test
    public void testAppendSummary21() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        double[] doubleArray = new double[40];
        
        standardToStringStyle.appendSummary(stringBuffer, string, doubleArray);
    }
    
    @Test
    public void testAppendSummary22() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = new double[40];
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendSummary23() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) defaultToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        double[] doubleArray = {0.0};
        
        (((ToStringStyle) defaultToStringStyle)).appendSummary(stringBuffer, string, doubleArray);
    }
    
    @Test
    public void testAppendSummary24() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {0.0};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendSummary25() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendSummary26() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), doubleArray);
    }
    
    @Test
    public void testAppendSummary27() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        double[] doubleArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [I)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException4() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:1111) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((int[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [I)
    
    @Test
    public void testAppendSummary28() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = {0};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendSummary29() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = new int[17];
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendSummary30() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendSummary31() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        int[] intArray = new int[17];
        
        standardToStringStyle.appendSummary(stringBuffer, string, intArray);
    }
    
    @Test
    public void testAppendSummary32() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = {0};
        
        (((ToStringStyle) simpleToStringStyle)).appendSummary(stringBuffer, ((String) null), intArray);
    }
    
    @Test
    public void testAppendSummary33() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        int[] intArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, string, intArray);
    }
    
    @Test
    public void testAppendSummary34() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        int[] intArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, string, intArray);
    }
    
    @Test
    public void testAppendSummary35() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) simpleToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        int[] intArray = {};
        
        (((ToStringStyle) simpleToStringStyle)).appendSummary(stringBuffer, ((String) null), intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(summaryObjectStartText);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException5() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:664) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((Object) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(getShortClassName(value.getClass()));
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException_1() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("               @         ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:665) */
        (((ToStringStyle) simpleToStringStyle)).appendSummary(stringBuffer, ((String) null), ((Object) null));
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(getShortClassName(value.getClass()));
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException_2() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String summaryObjectStartText = "";
        standardToStringStyle.setSummaryObjectStartText(summaryObjectStartText);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:665) */
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), ((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    @Test
    public void testAppendSummary36() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String summaryObjectStartText = "";
        (((ToStringStyle) simpleToStringStyle)).setSummaryObjectStartText(summaryObjectStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        (((ToStringStyle) simpleToStringStyle)).appendSummary(stringBuffer, ((String) null), object);
    }
    
    @Test
    public void testAppendSummary37() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        String summaryObjectStartText = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        (((ToStringStyle) simpleToStringStyle)).setSummaryObjectStartText(summaryObjectStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        (((ToStringStyle) simpleToStringStyle)).appendSummary(stringBuffer, ((String) null), object);
    }
    
    @Test
    public void testAppendSummary38() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        Object object = new Object();
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendSummary(stringBuffer, string, object);
    }
    
    @Test
    public void testAppendSummary39() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        Object object = new Object();
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, string, object);
    }
    
    @Test
    public void testAppendSummary40() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String summaryObjectStartText = "";
        standardToStringStyle.setSummaryObjectStartText(summaryObjectStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), object);
    }
    
    @Test
    public void testAppendSummary41() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        Object object = new Object();
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendSummary(stringBuffer, string, object);
    }
    
    @Test
    public void testAppendSummary42() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        Object object = new Object();
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendSummary(stringBuffer, string, object);
    }
    
    @Test
    public void testAppendSummary43() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String summaryObjectStartText = "\u0000";
        standardToStringStyle.setSummaryObjectStartText(summaryObjectStartText);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), object);
    }
    
    @Test
    public void testAppendSummary44() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String summaryObjectStartText = "";
        standardToStringStyle.setSummaryObjectStartText(summaryObjectStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), object);
    }
    
    @Test
    public void testAppendSummary45() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String summaryObjectStartText = "";
        standardToStringStyle.setSummaryObjectStartText(summaryObjectStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [J)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException6() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:1050) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((long[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [J)
    
    @Test
    public void testAppendSummary46() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = new long[17];
        
        (((ToStringStyle) simpleToStringStyle)).appendSummary(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendSummary47() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {0L};
        
        (((ToStringStyle) simpleToStringStyle)).appendSummary(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendSummary48() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendSummary49() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = new long[17];
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendSummary50() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {0L};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendSummary51() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), longArray);
    }
    
    @Test
    public void testAppendSummary52() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeEndText = "";
        standardToStringStyle.setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        long[] longArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), longArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException7() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:989) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((java.lang.Object[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [Ljava.lang.Object;)
    
    @Test
    public void testAppendSummary53() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        java.lang.Object[] objectArray = {null};
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, ((String) null), objectArray);
    }
    
    @Test
    public void testAppendSummary54() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) defaultToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        java.lang.Object[] objectArray = {};
        
        (((ToStringStyle) defaultToStringStyle)).appendSummary(stringBuffer, ((String) null), objectArray);
    }
    
    @Test
    public void testAppendSummary55() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        java.lang.Object[] objectArray = new java.lang.Object[17];
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, ((String) null), objectArray);
    }
    
    @Test
    public void testAppendSummary56() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        java.lang.Object[] objectArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, string, objectArray);
    }
    
    @Test
    public void testAppendSummary57() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        java.lang.Object[] objectArray = {};
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, string, objectArray);
    }
    
    @Test
    public void testAppendSummary58() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) multiLineToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        java.lang.Object[] objectArray = {};
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, string, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [S)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,short[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException8() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:1172) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((short[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [S)
    
    @Test
    public void testAppendSummary59() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendSummary60() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = new short[17];
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendSummary61() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = new short[17];
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendSummary62() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {(short) 0};
        
        (((ToStringStyle) multiLineToStringStyle)).appendSummary(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendSummary63() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {(short) 0};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendSummary64() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeEndText = "";
        standardToStringStyle.setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendSummary65() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeEndText = "";
        standardToStringStyle.setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendSummary66() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), shortArray);
    }
    
    @Test
    public void testAppendSummary67() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeEndText = "";
        standardToStringStyle.setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        short[] shortArray = {};
        
        standardToStringStyle.appendSummary(stringBuffer, ((String) null), shortArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummary(java.lang.StringBuffer, java.lang.String, [F)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummary(java.lang.StringBuffer,java.lang.String,float[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendSummarySize(buffer, fieldName, array.length);
 *  */
    @Test
    public void testAppendSummary_ThrowNullPointerException9() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummary] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:1416) */
        standardToStringStyle.appendSummary(((StringBuffer) null), ((String) null), ((float[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummary(java.lang.StringBuffer, java.lang.String, [F)
    
    @Test
    public void testAppendSummary68() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {0.0f};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendSummary69() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeStartText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendSummary70() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = new float[17];
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendSummary71() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendSummary72() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), floatArray);
    }
    
    @Test
    public void testAppendSummary73() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String sizeEndText = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setSizeEndText(sizeEndText);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        float[] floatArray = {};
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendSummary(stringBuffer, ((String) null), floatArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendEnd(java.lang.StringBuffer, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendEnd(java.lang.StringBuffer,java.lang.Object)}
 *  */
    @Test
    public void testAppendEnd() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setFieldSeparatorAtEnd(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.appendEnd(stringBuffer, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendEnd(java.lang.StringBuffer,java.lang.Object)}
 *  */
    @Test
    public void testAppendEnd_1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentEnd = "";
        standardToStringStyle.setContentEnd(contentEnd);
        standardToStringStyle.setFieldSeparatorAtEnd(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000");
        
        standardToStringStyle.appendEnd(stringBuffer, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendEnd(java.lang.StringBuffer, java.lang.Object)
    
    @Test
    public void testAppendEnd1() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setFieldSeparatorAtEnd(true);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        (((ToStringStyle) multiLineToStringStyle)).appendEnd(stringBuffer, object);
    }
    
    @Test
    public void testAppendEnd2() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        String fieldSeparator = "\u0000\u0000";
        (((ToStringStyle) noFieldNameToStringStyle)).setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000");
        Object object = new Object();
        
        (((ToStringStyle) noFieldNameToStringStyle)).appendEnd(stringBuffer, object);
    }
    
    @Test
    public void testAppendEnd3() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentEnd = "";
        standardToStringStyle.setContentEnd(contentEnd);
        standardToStringStyle.setFieldSeparator(contentEnd);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendEnd(stringBuffer, object);
    }
    
    @Test
    public void testAppendEnd4() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentEnd = "";
        standardToStringStyle.setContentEnd(contentEnd);
        standardToStringStyle.setFieldSeparator(contentEnd);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendEnd(stringBuffer, object);
    }
    
    @Test
    public void testAppendEnd5() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentEnd = "\u0000\u0000\u0000";
        standardToStringStyle.setContentEnd(contentEnd);
        standardToStringStyle.setFieldSeparator(contentEnd);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendEnd(stringBuffer, object);
    }
    
    @Test
    public void testAppendEnd6() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = "\u0000";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendEnd(stringBuffer, object);
    }
    
    @Test
    public void testAppendEnd7() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendEnd(stringBuffer, object);
    }
    
    @Test
    public void testAppendEnd8() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendEnd(stringBuffer, object);
    }
    
    @Test
    public void testAppendEnd9() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        String contentEnd = "";
        (((ToStringStyle) multiLineToStringStyle)).setContentEnd(contentEnd);
        String fieldSeparator = "\u0000\u0000\u0000";
        (((ToStringStyle) multiLineToStringStyle)).setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000");
        Object object = new Object();
        
        (((ToStringStyle) multiLineToStringStyle)).appendEnd(stringBuffer, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendStart(java.lang.StringBuffer, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendStart(java.lang.StringBuffer,java.lang.Object)}
 * @utbot.executesCondition {@code (object != null): False}
 *  */
    @Test
    public void testAppendStart_ObjectEqualsNull() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.appendStart(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendStart(java.lang.StringBuffer,java.lang.Object)}
 * @utbot.executesCondition {@code (object != null): True}
 * @utbot.executesCondition {@code (fieldSeparatorAtStart): False}
 *  */
    @Test
    public void testAppendStart_NotFieldSeparatorAtStart() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("                               ");
        short[] shortArray = {};
        
        standardToStringStyle.appendStart(stringBuffer, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendStart(java.lang.StringBuffer,java.lang.Object)}
 * @utbot.executesCondition {@code (object != null): True}
 * @utbot.executesCondition {@code (fieldSeparatorAtStart): False}
 *  */
    @Test
    public void testAppendStart_NotFieldSeparatorAtStart_1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "";
        standardToStringStyle.setContentStart(contentStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        byte[] byteArray = {};
        
        standardToStringStyle.appendStart(stringBuffer, byteArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendStart(java.lang.StringBuffer, java.lang.Object)
    
    @Test
    public void testAppendStart1() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseIdentityHashCode(true);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        (((ToStringStyle) multiLineToStringStyle)).appendStart(stringBuffer, object);
    }
    
    @Test
    public void testAppendStart2() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setFieldSeparatorAtStart(true);
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendStart(stringBuffer, object);
    }
    
    @Test
    public void testAppendStart3() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setFieldSeparatorAtStart(true);
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendStart(stringBuffer, object);
    }
    
    @Test
    public void testAppendStart4() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "";
        standardToStringStyle.setContentStart(contentStart);
        standardToStringStyle.setFieldSeparatorAtStart(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendStart(stringBuffer, object);
    }
    
    @Test
    public void testAppendStart5() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setFieldSeparatorAtStart(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Object object = new Object();
        
        standardToStringStyle.appendStart(stringBuffer, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendCyclicObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendCyclicObject(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendCyclicObject(java.lang.StringBuffer,java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.lang3.ObjectUtils#identityToString(java.lang.StringBuffer,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectUtils.identityToString(buffer, value);
 *  */
    @Test
    public void testAppendCyclicObject_ThrowNullPointerException() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendCyclicObject] produces [java.lang.NullPointerException: Cannot get the toString of a null object]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.ObjectUtils.identityToString(ObjectUtils.java:894)
            org.apache.commons.lang3.builder.ToStringStyle.appendCyclicObject(ToStringStyle.java:604) */
        standardToStringStyle.appendCyclicObject(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendCyclicObject(java.lang.StringBuffer, java.lang.String, java.lang.Object)
    
    @Test
    public void testAppendCyclicObject1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject2() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject3() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject4() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject5() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject6() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject7() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject8() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject9() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject10() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    
    @Test
    public void testAppendCyclicObject11() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendCyclicObject(stringBuffer, null, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getRegistry
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRegistry()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getRegistry()}
     */
    @Test
    public void testGetRegistry() {
        Map actual = ToStringStyle.getRegistry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRegistry()
    
    @Test
    public void testGetRegistry1() {
        Map actual = ToStringStyle.getRegistry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendContentEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendContentEnd(java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendContentEnd(java.lang.StringBuffer)}
 *  */
    @Test
    public void testAppendContentEnd() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        standardToStringStyle.appendContentEnd(stringBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendContentEnd(java.lang.StringBuffer)}
 *  */
    @Test
    public void testAppendContentEnd_1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentEnd = "";
        standardToStringStyle.setContentEnd(contentEnd);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        standardToStringStyle.appendContentEnd(stringBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendContentEnd(java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendContentEnd(java.lang.StringBuffer)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(contentEnd);
 *  */
    @Test
    public void testAppendContentEnd_ThrowNullPointerException() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendContentEnd] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendContentEnd(ToStringStyle.java:1528) */
        standardToStringStyle.appendContentEnd(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setUseFieldNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUseFieldNames(boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setUseFieldNames(boolean)}
 *  */
    @Test
    public void testSetUseFieldNames() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        (((ToStringStyle) defaultToStringStyle)).setUseFieldNames(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setUseFieldNames(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setUseFieldNames(boolean)}
     */
    @Test
    public void testSetUseFieldNames1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setUseFieldNames(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendFieldEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFieldEnd(java.lang.StringBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldEnd(java.lang.StringBuffer,java.lang.String)}
 *  */
    @Test
    public void testAppendFieldEnd() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        standardToStringStyle.appendFieldEnd(stringBuffer, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldEnd(java.lang.StringBuffer,java.lang.String)}
 *  */
    @Test
    public void testAppendFieldEnd_1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        standardToStringStyle.appendFieldEnd(stringBuffer, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendClassName(java.lang.StringBuffer, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendClassName(java.lang.StringBuffer,java.lang.Object)}
 * @utbot.executesCondition {@code (useClassName): False}
 *  */
    @Test
    public void testAppendClassName_NotUseClassName() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        standardToStringStyle.appendClassName(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendClassName(java.lang.StringBuffer,java.lang.Object)}
 * @utbot.executesCondition {@code (useClassName): True}
 * @utbot.executesCondition {@code (object != null): False}
 *  */
    @Test
    public void testAppendClassName_ObjectEqualsNull() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseClassName(true);
        
        standardToStringStyle.appendClassName(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendClassName(java.lang.StringBuffer, java.lang.Object)
    
    @Test
    public void testAppendClassName1() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseClassName(true);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        (((ToStringStyle) multiLineToStringStyle)).appendClassName(stringBuffer, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isUseClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUseClassName()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isUseClassName()}
 * @utbot.returnsFrom {@code return useClassName;}
 *  */
    @Test
    public void testIsUseClassName_ReturnUseClassName() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        boolean actual = (((ToStringStyle) defaultToStringStyle)).isUseClassName();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isUseClassName()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isUseClassName()}
     */
    @Test
    public void testIsUseClassNameReturnsTrue() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        boolean actual = standardToStringStyle.isUseClassName();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendSummarySize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSummarySize(java.lang.StringBuffer, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendSummarySize(java.lang.StringBuffer,java.lang.String,int)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(sizeStartText);
 *  */
    @Test
    public void testAppendSummarySize_ThrowNullPointerException() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendSummarySize] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummarySize(ToStringStyle.java:1591) */
        standardToStringStyle.appendSummarySize(null, null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSummarySize(java.lang.StringBuffer, java.lang.String, int)
    
    @Test
    public void testAppendSummarySize1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.appendSummarySize(stringBuffer, null, Integer.MIN_VALUE);
    }
    
    @Test
    public void testAppendSummarySize2() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        
        (((ToStringStyle) simpleToStringStyle)).appendSummarySize(stringBuffer, string, 17);
    }
    
    @Test
    public void testAppendSummarySize3() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.appendSummarySize(stringBuffer, null, 17);
    }
    
    @Test
    public void testAppendSummarySize4() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.appendSummarySize(stringBuffer, null, 0);
    }
    
    @Test
    public void testAppendSummarySize5() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "\u0000\u0000\u0000";
        
        (((ToStringStyle) simpleToStringStyle)).appendSummarySize(stringBuffer, string, -1);
    }
    
    @Test
    public void testAppendSummarySize6() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.appendSummarySize(stringBuffer, null, Integer.MIN_VALUE);
    }
    
    @Test
    public void testAppendSummarySize7() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.appendSummarySize(stringBuffer, null, 1);
    }
    
    @Test
    public void testAppendSummarySize8() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        String string = "";
        
        (((ToStringStyle) simpleToStringStyle)).appendSummarySize(stringBuffer, string, 177);
    }
    
    @Test
    public void testAppendSummarySize9() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String sizeStartText = "";
        standardToStringStyle.setSizeStartText(sizeStartText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.appendSummarySize(stringBuffer, null, 177);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendNullText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendNullText(java.lang.StringBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendNullText(java.lang.StringBuffer,java.lang.String)}
 *  */
    @Test
    public void testAppendNullText() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        (((ToStringStyle) simpleToStringStyle)).appendNullText(stringBuffer, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendNullText(java.lang.StringBuffer,java.lang.String)}
 *  */
    @Test
    public void testAppendNullText_1() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String nullText = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendNullText(stringBuffer, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendNullText(java.lang.StringBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendNullText(java.lang.StringBuffer,java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(nullText);
 *  */
    @Test
    public void testAppendNullText_ThrowNullPointerException() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendNullText] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendNullText(ToStringStyle.java:1540) */
        standardToStringStyle.appendNullText(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getShortClassName(java.lang.Class)}
 * @utbot.returnsFrom {@code return ClassUtils.getShortClassName(cls);}
 *  */
    @Test
    public void testGetShortClassName_ReturnClassUtilsGetShortClassName() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        Class class1 = Object.class;
        
        String actual = standardToStringStyle.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getShortClassName(java.lang.Class)}
 * @utbot.returnsFrom {@code return ClassUtils.getShortClassName(cls);}
 *  */
    @Test
    public void testGetShortClassName_ReturnClassUtilsGetShortClassName_1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getShortClassName(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.Class)
    
    @Test
    public void testGetShortClassName1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        Class class1 = Object.class;
        
        String actual = standardToStringStyle.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetShortClassName2() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        Class class1 = Object.class;
        
        String actual = standardToStringStyle.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetShortClassName3() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        Class class1 = Object.class;
        
        String actual = standardToStringStyle.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetShortClassName4() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        Class class1 = Object.class;
        
        String actual = standardToStringStyle.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendFieldStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFieldStart(java.lang.StringBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldStart(java.lang.StringBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (useFieldNames): False}
 *  */
    @Test
    public void testAppendFieldStart_NotUseFieldNames() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        standardToStringStyle.appendFieldStart(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldStart(java.lang.StringBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (useFieldNames): True}
 * @utbot.executesCondition {@code (fieldName != null): False}
 *  */
    @Test
    public void testAppendFieldStart_FieldNameEqualsNull() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        
        standardToStringStyle.appendFieldStart(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldStart(java.lang.StringBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (useFieldNames): True}
 * @utbot.executesCondition {@code (fieldName != null): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 *  */
    @Test
    public void testAppendFieldStart_FieldNameNotEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        (((ToStringStyle) shortPrefixToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("         ");
        String string = "";
        
        (((ToStringStyle) shortPrefixToStringStyle)).appendFieldStart(stringBuffer, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendFieldStart(java.lang.StringBuffer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendFieldStart(java.lang.StringBuffer,java.lang.String)}
 * @utbot.executesCondition {@code (useFieldNames): True}
 * @utbot.executesCondition {@code (fieldName != null): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(fieldName);
 *  */
    @Test
    public void testAppendFieldStart_ThrowNullPointerException() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendFieldStart] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendFieldStart(ToStringStyle.java:1560) */
        standardToStringStyle.appendFieldStart(null, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isUseFieldNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUseFieldNames()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isUseFieldNames()}
 * @utbot.returnsFrom {@code return useFieldNames;}
 *  */
    @Test
    public void testIsUseFieldNames_ReturnUseFieldNames() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        boolean actual = (((ToStringStyle) defaultToStringStyle)).isUseFieldNames();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isUseFieldNames()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isUseFieldNames()}
     */
    @Test
    public void testIsUseFieldNamesReturnsTrue() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        boolean actual = standardToStringStyle.isUseFieldNames();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getArrayStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArrayStart()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getArrayStart()}
 * @utbot.returnsFrom {@code return arrayStart;}
 *  */
    @Test
    public void testGetArrayStart_ReturnArrayStart() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getArrayStart();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getArrayStart()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getArrayStart()}
     */
    @Test
    public void testGetArrayStart() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getArrayStart();
        
        String expected = "{";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setArrayStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setArrayStart(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArrayStart(java.lang.String)}
 * @utbot.executesCondition {@code (arrayStart == null): False}
 *  */
    @Test
    public void testSetArrayStart_ArrayStartNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setArrayStart(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArrayStart(java.lang.String)}
 * @utbot.executesCondition {@code (arrayStart == null): True}
 *  */
    @Test
    public void testSetArrayStart_ArrayStartEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setArrayStart(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setArrayStart(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArrayStart(java.lang.String)}
     */
    @Test
    public void testSetArrayStartWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setArrayStart("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getArrayEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArrayEnd()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getArrayEnd()}
 * @utbot.returnsFrom {@code return arrayEnd;}
 *  */
    @Test
    public void testGetArrayEnd_ReturnArrayEnd() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getArrayEnd();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getArrayEnd()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getArrayEnd()}
     */
    @Test
    public void testGetArrayEnd() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getArrayEnd();
        
        String expected = "}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isFullDetail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFullDetail(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isFullDetail(java.lang.Boolean)}
 * @utbot.executesCondition {@code (fullDetailRequest == null): True}
 * @utbot.returnsFrom {@code return defaultFullDetail;}
 *  */
    @Test
    public void testIsFullDetail_FullDetailRequestEqualsNull() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        boolean actual = standardToStringStyle.isFullDetail(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isFullDetail(java.lang.Boolean)}
 * @utbot.executesCondition {@code (fullDetailRequest == null): False}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.returnsFrom {@code return fullDetailRequest.booleanValue();}
 *  */
    @Test
    public void testIsFullDetail_FullDetailRequestNotEqualsNull() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        Boolean boolean1 = false;
        
        boolean actual = standardToStringStyle.isFullDetail(boolean1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isFullDetail(java.lang.Boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isFullDetail(java.lang.Boolean)}
     */
    @Test
    public void testIsFullDetailReturnsFalse() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        boolean actual = standardToStringStyle.isFullDetail(false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setUseClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUseClassName(boolean)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setUseClassName(boolean)}
 *  */
    @Test
    public void testSetUseClassName() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        (((ToStringStyle) defaultToStringStyle)).setUseClassName(false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setUseClassName(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setUseClassName(boolean)}
     */
    @Test
    public void testSetUseClassName1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setUseClassName(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendContentStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendContentStart(java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendContentStart(java.lang.StringBuffer)}
 *  */
    @Test
    public void testAppendContentStart() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("                               ");
        
        standardToStringStyle.appendContentStart(stringBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendContentStart(java.lang.StringBuffer)}
 *  */
    @Test
    public void testAppendContentStart_1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String contentStart = "";
        standardToStringStyle.setContentStart(contentStart);
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        standardToStringStyle.appendContentStart(stringBuffer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendContentStart(java.lang.StringBuffer)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#appendContentStart(java.lang.StringBuffer)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(contentStart);
 *  */
    @Test
    public void testAppendContentStart_ThrowNullPointerException() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.appendContentStart] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendContentStart(ToStringStyle.java:1519) */
        standardToStringStyle.appendContentStart(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setArraySeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setArraySeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArraySeparator(java.lang.String)}
 * @utbot.executesCondition {@code (arraySeparator == null): False}
 *  */
    @Test
    public void testSetArraySeparator_ArraySeparatorNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setArraySeparator(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArraySeparator(java.lang.String)}
 * @utbot.executesCondition {@code (arraySeparator == null): True}
 *  */
    @Test
    public void testSetArraySeparator_ArraySeparatorEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setArraySeparator(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setArraySeparator(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArraySeparator(java.lang.String)}
     */
    @Test
    public void testSetArraySeparatorWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setArraySeparator("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setSizeStartText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSizeStartText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSizeStartText(java.lang.String)}
 * @utbot.executesCondition {@code (sizeStartText == null): False}
 *  */
    @Test
    public void testSetSizeStartText_SizeStartTextNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setSizeStartText(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSizeStartText(java.lang.String)}
 * @utbot.executesCondition {@code (sizeStartText == null): True}
 *  */
    @Test
    public void testSetSizeStartText_SizeStartTextEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setSizeStartText(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSizeStartText(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSizeStartText(java.lang.String)}
     */
    @Test
    public void testSetSizeStartTextWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setSizeStartText("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setContentStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setContentStart(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setContentStart(java.lang.String)}
 * @utbot.executesCondition {@code (contentStart == null): False}
 *  */
    @Test
    public void testSetContentStart_ContentStartNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setContentStart(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setContentStart(java.lang.String)}
 * @utbot.executesCondition {@code (contentStart == null): True}
 *  */
    @Test
    public void testSetContentStart_ContentStartEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setContentStart(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setContentStart(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setContentStart(java.lang.String)}
     */
    @Test
    public void testSetContentStartWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setContentStart("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getSizeStartText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSizeStartText()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getSizeStartText()}
 * @utbot.returnsFrom {@code return sizeStartText;}
 *  */
    @Test
    public void testGetSizeStartText_ReturnSizeStartText() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getSizeStartText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getSizeStartText()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getSizeStartText()}
     */
    @Test
    public void testGetSizeStartText() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getSizeStartText();
        
        String expected = "<size=";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setSizeEndText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSizeEndText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSizeEndText(java.lang.String)}
 * @utbot.executesCondition {@code (sizeEndText == null): False}
 *  */
    @Test
    public void testSetSizeEndText_SizeEndTextNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setSizeEndText(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSizeEndText(java.lang.String)}
 * @utbot.executesCondition {@code (sizeEndText == null): True}
 *  */
    @Test
    public void testSetSizeEndText_SizeEndTextEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setSizeEndText(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSizeEndText(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setSizeEndText(java.lang.String)}
     */
    @Test
    public void testSetSizeEndTextWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setSizeEndText("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setArrayEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setArrayEnd(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArrayEnd(java.lang.String)}
 * @utbot.executesCondition {@code (arrayEnd == null): False}
 *  */
    @Test
    public void testSetArrayEnd_ArrayEndNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setArrayEnd(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArrayEnd(java.lang.String)}
 * @utbot.executesCondition {@code (arrayEnd == null): True}
 *  */
    @Test
    public void testSetArrayEnd_ArrayEndEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setArrayEnd(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setArrayEnd(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setArrayEnd(java.lang.String)}
     */
    @Test
    public void testSetArrayEndWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setArrayEnd("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getContentEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentEnd()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getContentEnd()}
 * @utbot.returnsFrom {@code return contentEnd;}
 *  */
    @Test
    public void testGetContentEnd_ReturnContentEnd() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getContentEnd();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getContentEnd()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getContentEnd()}
     */
    @Test
    public void testGetContentEnd() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getContentEnd();
        
        String expected = "]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setNullText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNullText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setNullText(java.lang.String)}
 * @utbot.executesCondition {@code (nullText == null): False}
 *  */
    @Test
    public void testSetNullText_NullTextNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setNullText(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setNullText(java.lang.String)}
 * @utbot.executesCondition {@code (nullText == null): True}
 *  */
    @Test
    public void testSetNullText_NullTextEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setNullText(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setNullText(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setNullText(java.lang.String)}
     */
    @Test
    public void testSetNullTextWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setNullText("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getContentStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentStart()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getContentStart()}
 * @utbot.returnsFrom {@code return contentStart;}
 *  */
    @Test
    public void testGetContentStart_ReturnContentStart() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getContentStart();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getContentStart()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getContentStart()}
     */
    @Test
    public void testGetContentStart() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getContentStart();
        
        String expected = "[";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getArraySeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArraySeparator()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getArraySeparator()}
 * @utbot.returnsFrom {@code return arraySeparator;}
 *  */
    @Test
    public void testGetArraySeparator_ReturnArraySeparator() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getArraySeparator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getArraySeparator()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getArraySeparator()}
     */
    @Test
    public void testGetArraySeparator() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getArraySeparator();
        
        String expected = ",";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFieldSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldSeparator(java.lang.String)}
 * @utbot.executesCondition {@code (fieldSeparator == null): False}
 *  */
    @Test
    public void testSetFieldSeparator_FieldSeparatorNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setFieldSeparator(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldSeparator(java.lang.String)}
 * @utbot.executesCondition {@code (fieldSeparator == null): True}
 *  */
    @Test
    public void testSetFieldSeparator_FieldSeparatorEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setFieldSeparator(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFieldSeparator(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setFieldSeparator(java.lang.String)}
     */
    @Test
    public void testSetFieldSeparatorWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setFieldSeparator("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.setContentEnd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setContentEnd(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setContentEnd(java.lang.String)}
 * @utbot.executesCondition {@code (contentEnd == null): False}
 *  */
    @Test
    public void testSetContentEnd_ContentEndNotEqualsNull() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).setContentEnd(string);
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setContentEnd(java.lang.String)}
 * @utbot.executesCondition {@code (contentEnd == null): True}
 *  */
    @Test
    public void testSetContentEnd_ContentEndEqualsNull() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        
        (((ToStringStyle) shortPrefixToStringStyle)).setContentEnd(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setContentEnd(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#setContentEnd(java.lang.String)}
     */
    @Test
    public void testSetContentEndWithNonEmptyString() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        standardToStringStyle.setContentEnd("X\u001FZ");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getFieldSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldSeparator()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getFieldSeparator()}
 * @utbot.returnsFrom {@code return fieldSeparator;}
 *  */
    @Test
    public void testGetFieldSeparator_ReturnFieldSeparator() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getFieldSeparator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFieldSeparator()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getFieldSeparator()}
     */
    @Test
    public void testGetFieldSeparator() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getFieldSeparator();
        
        String expected = ",";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getNullText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNullText()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getNullText()}
 * @utbot.returnsFrom {@code return nullText;}
 *  */
    @Test
    public void testGetNullText_ReturnNullText() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getNullText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNullText()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getNullText()}
     */
    @Test
    public void testGetNullText() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getNullText();
        
        String expected = "<null>";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.getSizeEndText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSizeEndText()
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getSizeEndText()}
 * @utbot.returnsFrom {@code return sizeEndText;}
 *  */
    @Test
    public void testGetSizeEndText_ReturnSizeEndText() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        
        String actual = (((ToStringStyle) defaultToStringStyle)).getSizeEndText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getSizeEndText()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#getSizeEndText()}
     */
    @Test
    public void testGetSizeEndText() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        
        String actual = standardToStringStyle.getSizeEndText();
        
        String expected = ">";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [B, java.lang.Boolean)
    
    @Test
    public void testAppend1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), byteArray, boolean1);
    }
    
    @Test
    public void testAppend2() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), byteArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend3() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        (((ToStringStyle) shortPrefixToStringStyle)).setUseFieldNames(true);
        String arrayStart = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setArrayStart(arrayStart);
        (((ToStringStyle) shortPrefixToStringStyle)).setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        (((ToStringStyle) shortPrefixToStringStyle)).append(stringBuffer, ((String) null), byteArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend4() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), byteArray, boolean1);
    }
    
    @Test
    public void testAppend5() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), byteArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend6() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), byteArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend7() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), byteArray, boolean1);
    }
    
    @Test
    public void testAppend8() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        Boolean boolean1 = false;
        
        standardToStringStyle.append(stringBuffer, ((String) null), byteArray, boolean1);
    }
    
    @Test
    public void testAppend9() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((byte[]) null), ((Boolean) null));
    }
    
    @Test
    public void testAppend10() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((byte[]) null), ((Boolean) null));
    }
    
    @Test
    public void testAppend11() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        (((ToStringStyle) shortPrefixToStringStyle)).setUseFieldNames(true);
        String nullText = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        (((ToStringStyle) shortPrefixToStringStyle)).append(stringBuffer, ((String) null), ((byte[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, java.lang.Object, java.lang.Boolean)
    
    @Test
    public void testAppend12() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.append(stringBuffer, ((String) null), object, ((Boolean) null));
    }
    
    @Test
    public void testAppend13() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        (((ToStringStyle) noFieldNameToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, ((String) null), object, ((Boolean) null));
    }
    
    @Test
    public void testAppend14() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((Object) null), ((Boolean) null));
    }
    
    @Test
    public void testAppend15() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        Object object = new Object();
        
        standardToStringStyle.append(stringBuffer, string, object, ((Boolean) null));
    }
    
    @Test
    public void testAppend16() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((Object) null), ((Boolean) null));
    }
    
    @Test
    public void testAppend17() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((Object) null), ((Boolean) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(java.lang.StringBuffer, java.lang.String, java.lang.Object, java.lang.Boolean)
    
    @Test
    public void testAppend18() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        Object object = new Object();
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.append] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:664)
            org.apache.commons.lang3.builder.ToStringStyle.appendInternal(ToStringStyle.java:583)
            org.apache.commons.lang3.builder.ToStringStyle.append(ToStringStyle.java:467) */
        standardToStringStyle.append(((StringBuffer) null), ((String) null), object, boolean1);
    }
    
    @Test
    public void testAppend19() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        Object object = new Object();
        Boolean boolean1 = false;
        
        /* This test fails because method [org.apache.commons.lang3.builder.ToStringStyle.append] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.builder.ToStringStyle.appendSummary(ToStringStyle.java:664)
            org.apache.commons.lang3.builder.ToStringStyle.appendInternal(ToStringStyle.java:583)
            org.apache.commons.lang3.builder.ToStringStyle.append(ToStringStyle.java:467) */
        standardToStringStyle.append(((StringBuffer) null), ((String) null), object, boolean1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [Ljava.lang.Object;, java.lang.Boolean)
    
    @Test
    public void testAppend20() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        standardToStringStyle.append(stringBuffer, string, objectArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend21() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), objectArray, boolean1);
    }
    
    @Test
    public void testAppend22() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        standardToStringStyle.append(stringBuffer, ((String) null), objectArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend23() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        standardToStringStyle.append(stringBuffer, ((String) null), objectArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend24() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), objectArray, boolean1);
    }
    
    @Test
    public void testAppend25() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        Boolean boolean1 = false;
        
        (((ToStringStyle) shortPrefixToStringStyle)).append(stringBuffer, ((String) null), objectArray, boolean1);
    }
    
    @Test
    public void testAppend26() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        standardToStringStyle.append(stringBuffer, ((String) null), objectArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend27() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        standardToStringStyle.append(stringBuffer, ((String) null), objectArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend28() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        standardToStringStyle.append(stringBuffer, ((String) null), objectArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend29() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        Boolean boolean1 = true;
        
        (((ToStringStyle) shortPrefixToStringStyle)).append(stringBuffer, ((String) null), objectArray, boolean1);
    }
    
    @Test
    public void testAppend30() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((java.lang.Object[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, int)
    
    @Test
    public void testAppend31() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, ((String) null), -1);
    }
    
    @Test
    public void testAppend32() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 0);
    }
    
    @Test
    public void testAppend33() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), Integer.MIN_VALUE);
    }
    
    @Test
    public void testAppend34() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 17);
    }
    
    @Test
    public void testAppend35() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 1);
    }
    
    @Test
    public void testAppend36() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 17);
    }
    
    @Test
    public void testAppend37() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 177);
    }
    
    @Test
    public void testAppend38() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 177);
    }
    
    @Test
    public void testAppend39() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), Integer.MIN_VALUE);
    }
    
    @Test
    public void testAppend40() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        
        standardToStringStyle.append(stringBuffer, string, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, long)
    
    @Test
    public void testAppend41() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        (((ToStringStyle) simpleToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) simpleToStringStyle)).append(stringBuffer, ((String) null), 1L);
    }
    
    @Test
    public void testAppend42() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 0L);
    }
    
    @Test
    public void testAppend43() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) simpleToStringStyle)).append(stringBuffer, ((String) null), -41L);
    }
    
    @Test
    public void testAppend44() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Long.MIN_VALUE);
    }
    
    @Test
    public void testAppend45() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, ((String) null), 8L);
    }
    
    @Test
    public void testAppend46() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 0L);
    }
    
    @Test
    public void testAppend47() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), 17L);
    }
    
    @Test
    public void testAppend48() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        (((ToStringStyle) noFieldNameToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000");
        String string = "";
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, string, 0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, float)
    
    @Test
    public void testAppend49() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend50() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend51() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend52() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend53() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend54() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend55() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend56() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend57() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend58() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    
    @Test
    public void testAppend59() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Float.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, double)
    
    @Test
    public void testAppend60() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend61() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend62() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend63() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend64() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend65() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend66() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend67() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend68() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend69() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    
    @Test
    public void testAppend70() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, char)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#append(java.lang.StringBuffer,java.lang.String,char)}
 *  */
    @Test
    public void testAppend() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ' ');
    }
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#append(java.lang.StringBuffer,java.lang.String,char)}
 *  */
    @Test
    public void testAppend_1() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ' ');
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, char)
    
    @Test
    public void testAppend71() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String fieldNameValueSeparator = "";
        standardToStringStyle.setFieldNameValueSeparator(fieldNameValueSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        
        standardToStringStyle.append(stringBuffer, string, '\u0000');
    }
    
    @Test
    public void testAppend72() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String fieldNameValueSeparator = "";
        standardToStringStyle.setFieldNameValueSeparator(fieldNameValueSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        
        standardToStringStyle.append(stringBuffer, string, '\u0000');
    }
    
    @Test
    public void testAppend73() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String fieldNameValueSeparator = "";
        standardToStringStyle.setFieldNameValueSeparator(fieldNameValueSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, fieldNameValueSeparator, '\u0000');
    }
    
    @Test
    public void testAppend74() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), '\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [F, java.lang.Boolean)
    
    @Test
    public void testAppend75() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        (((ToStringStyle) noFieldNameToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        Boolean boolean1 = true;
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, ((String) null), floatArray, boolean1);
    }
    
    @Test
    public void testAppend76() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), floatArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend77() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), floatArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend78() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), floatArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend79() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), floatArray, boolean1);
    }
    
    @Test
    public void testAppend80() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), floatArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend81() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), floatArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend82() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), floatArray, boolean1);
    }
    
    @Test
    public void testAppend83() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        float[] floatArray = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        Boolean boolean1 = false;
        
        standardToStringStyle.append(stringBuffer, ((String) null), floatArray, boolean1);
    }
    
    @Test
    public void testAppend84() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        (((ToStringStyle) shortPrefixToStringStyle)).setUseFieldNames(true);
        String nullText = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        (((ToStringStyle) shortPrefixToStringStyle)).append(stringBuffer, ((String) null), ((float[]) null), ((Boolean) null));
    }
    
    @Test
    public void testAppend85() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((float[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, boolean)
    
    @Test
    public void testAppend86() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        (((ToStringStyle) defaultToStringStyle)).append(stringBuffer, ((String) null), true);
    }
    
    @Test
    public void testAppend87() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseFieldNames(true);
        String fieldSeparator = "";
        (((ToStringStyle) multiLineToStringStyle)).setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000");
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, ((String) null), false);
    }
    
    @Test
    public void testAppend88() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), true);
    }
    
    @Test
    public void testAppend89() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseFieldNames(true);
        String fieldSeparator = "";
        (((ToStringStyle) multiLineToStringStyle)).setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000");
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, ((String) null), false);
    }
    
    @Test
    public void testAppend90() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String fieldSeparator = "";
        standardToStringStyle.setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), false);
    }
    
    @Test
    public void testAppend91() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), false);
    }
    
    @Test
    public void testAppend92() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        
        standardToStringStyle.append(stringBuffer, string, false);
    }
    
    @Test
    public void testAppend93() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        String fieldSeparator = "";
        (((ToStringStyle) shortPrefixToStringStyle)).setFieldSeparator(fieldSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        (((ToStringStyle) shortPrefixToStringStyle)).append(stringBuffer, ((String) null), true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [D, java.lang.Boolean)
    
    @Test
    public void testAppend94() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        standardToStringStyle.append(stringBuffer, string, doubleArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend95() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        Boolean boolean1 = false;
        
        standardToStringStyle.append(stringBuffer, ((String) null), doubleArray, boolean1);
    }
    
    @Test
    public void testAppend96() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        (((ToStringStyle) noFieldNameToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        Boolean boolean1 = true;
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, ((String) null), doubleArray, boolean1);
    }
    
    @Test
    public void testAppend97() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), doubleArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend98() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), doubleArray, boolean1);
    }
    
    @Test
    public void testAppend99() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        Boolean boolean1 = false;
        
        standardToStringStyle.append(stringBuffer, ((String) null), doubleArray, boolean1);
    }
    
    @Test
    public void testAppend100() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), doubleArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend101() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), doubleArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend102() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), doubleArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend103() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), doubleArray, boolean1);
    }
    
    @Test
    public void testAppend104() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((double[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [C, java.lang.Boolean)
    
    @Test
    public void testAppend105() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        standardToStringStyle.append(stringBuffer, string, charArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend106() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), charArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend107() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), charArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend108() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        Boolean boolean1 = false;
        
        standardToStringStyle.append(stringBuffer, ((String) null), charArray, boolean1);
    }
    
    @Test
    public void testAppend109() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), charArray, boolean1);
    }
    
    @Test
    public void testAppend110() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseFieldNames(true);
        String arrayStart = "";
        (((ToStringStyle) multiLineToStringStyle)).setArrayStart(arrayStart);
        (((ToStringStyle) multiLineToStringStyle)).setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, ((String) null), charArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend111() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), charArray, boolean1);
    }
    
    @Test
    public void testAppend112() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), charArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend113() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), charArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend114() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String nullText = "\u0000";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((char[]) null), ((Boolean) null));
    }
    
    @Test
    public void testAppend115() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((char[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [I, java.lang.Boolean)
    
    @Test
    public void testAppend116() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        (((ToStringStyle) noFieldNameToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        Boolean boolean1 = true;
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, ((String) null), intArray, boolean1);
    }
    
    @Test
    public void testAppend117() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), intArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend118() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), intArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend119() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), intArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend120() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        Boolean boolean1 = true;
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, ((String) null), intArray, boolean1);
    }
    
    @Test
    public void testAppend121() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), intArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend122() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), intArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend123() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), intArray, boolean1);
    }
    
    @Test
    public void testAppend124() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        Boolean boolean1 = false;
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, ((String) null), intArray, boolean1);
    }
    
    @Test
    public void testAppend125() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((int[]) null), ((Boolean) null));
    }
    
    @Test
    public void testAppend126() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((int[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [S, java.lang.Boolean)
    
    @Test
    public void testAppend127() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        standardToStringStyle.append(stringBuffer, string, shortArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend128() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), shortArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend129() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        (((ToStringStyle) noFieldNameToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        Boolean boolean1 = true;
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, ((String) null), shortArray, boolean1);
    }
    
    @Test
    public void testAppend130() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        (((ToStringStyle) multiLineToStringStyle)).setUseFieldNames(true);
        String arrayStart = "";
        (((ToStringStyle) multiLineToStringStyle)).setArrayStart(arrayStart);
        (((ToStringStyle) multiLineToStringStyle)).setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, ((String) null), shortArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend131() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        Boolean boolean1 = false;
        
        standardToStringStyle.append(stringBuffer, ((String) null), shortArray, boolean1);
    }
    
    @Test
    public void testAppend132() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), shortArray, boolean1);
    }
    
    @Test
    public void testAppend133() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), shortArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend134() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), shortArray, boolean1);
    }
    
    @Test
    public void testAppend135() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), shortArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend136() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), shortArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend137() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String nullText = "\u0000";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((short[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, byte)
    
    @Test
    public void testAppend138() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (byte) 0);
    }
    
    @Test
    public void testAppend139() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (byte) 17);
    }
    
    @Test
    public void testAppend140() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (byte) 17);
    }
    
    @Test
    public void testAppend141() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (byte) 0);
    }
    
    @Test
    public void testAppend142() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, string, (byte) -1);
    }
    
    @Test
    public void testAppend143() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (byte) 117);
    }
    
    @Test
    public void testAppend144() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "";
        
        (((ToStringStyle) defaultToStringStyle)).append(stringBuffer, string, (byte) 105);
    }
    
    @Test
    public void testAppend145() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        (((ToStringStyle) noFieldNameToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, string, (byte) 0);
    }
    
    @Test
    public void testAppend146() throws Exception  {
        Object noFieldNameToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
        (((ToStringStyle) noFieldNameToStringStyle)).setUseFieldNames(true);
        String fieldNameValueSeparator = "";
        (((ToStringStyle) noFieldNameToStringStyle)).setFieldNameValueSeparator(fieldNameValueSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        
        (((ToStringStyle) noFieldNameToStringStyle)).append(stringBuffer, string, (byte) 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, short)
    
    @Test
    public void testAppend147() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (short) 97);
    }
    
    @Test
    public void testAppend148() throws Exception  {
        Object defaultToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle");
        (((ToStringStyle) defaultToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) defaultToStringStyle)).append(stringBuffer, ((String) null), (short) -1);
    }
    
    @Test
    public void testAppend149() throws Exception  {
        Object multiLineToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        (((ToStringStyle) multiLineToStringStyle)).append(stringBuffer, string, (short) -1);
    }
    
    @Test
    public void testAppend150() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (short) 97);
    }
    
    @Test
    public void testAppend151() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (short) 177);
    }
    
    @Test
    public void testAppend152() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (short) 137);
    }
    
    @Test
    public void testAppend153() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        
        standardToStringStyle.append(stringBuffer, string, (short) 0);
    }
    
    @Test
    public void testAppend154() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), (short) 0);
    }
    
    @Test
    public void testAppend155() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String fieldNameValueSeparator = "";
        standardToStringStyle.setFieldNameValueSeparator(fieldNameValueSeparator);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        
        standardToStringStyle.append(stringBuffer, string, (short) 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [Z, java.lang.Boolean)
    
    @Test
    public void testAppend156() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        standardToStringStyle.append(stringBuffer, string, booleanArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend157() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), booleanArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend158() throws Exception  {
        Object simpleToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
        (((ToStringStyle) simpleToStringStyle)).setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        Boolean boolean1 = true;
        
        (((ToStringStyle) simpleToStringStyle)).append(stringBuffer, ((String) null), booleanArray, boolean1);
    }
    
    @Test
    public void testAppend159() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), booleanArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend160() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        Boolean boolean1 = false;
        
        standardToStringStyle.append(stringBuffer, ((String) null), booleanArray, boolean1);
    }
    
    @Test
    public void testAppend161() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), booleanArray, boolean1);
    }
    
    @Test
    public void testAppend162() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), booleanArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend163() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), booleanArray, boolean1);
    }
    
    @Test
    public void testAppend164() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), booleanArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend165() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), booleanArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend166() throws Exception  {
        Object shortPrefixToStringStyle = createInstance("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
        (((ToStringStyle) shortPrefixToStringStyle)).setUseFieldNames(true);
        String nullText = "\u0000";
        (((ToStringStyle) shortPrefixToStringStyle)).setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("");
        
        (((ToStringStyle) shortPrefixToStringStyle)).append(stringBuffer, ((String) null), ((boolean[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.append
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(java.lang.StringBuffer, java.lang.String, [J, java.lang.Boolean)
    
    @Test
    public void testAppend167() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        String string = "";
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        standardToStringStyle.append(stringBuffer, string, longArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend168() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), longArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend169() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), longArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend170() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), longArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend171() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), longArray, boolean1);
    }
    
    @Test
    public void testAppend172() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String arrayStart = "";
        standardToStringStyle.setArrayStart(arrayStart);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        Boolean boolean1 = true;
        
        standardToStringStyle.append(stringBuffer, ((String) null), longArray, boolean1);
    }
    
    @Test
    public void testAppend173() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), longArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend174() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        Boolean boolean1 = false;
        
        standardToStringStyle.append(stringBuffer, ((String) null), longArray, boolean1);
    }
    
    @Test
    public void testAppend175() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        standardToStringStyle.setDefaultFullDetail(true);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        standardToStringStyle.append(stringBuffer, ((String) null), longArray, ((Boolean) null));
    }
    
    @Test
    public void testAppend176() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        standardToStringStyle.setUseFieldNames(true);
        String nullText = "\u0000";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((long[]) null), ((Boolean) null));
    }
    
    @Test
    public void testAppend177() throws Exception  {
        StandardToStringStyle standardToStringStyle = ((StandardToStringStyle) createInstance("org.apache.commons.lang3.builder.StandardToStringStyle"));
        String nullText = "";
        standardToStringStyle.setNullText(nullText);
        StringBuffer stringBuffer = new StringBuffer("\u0000");
        
        standardToStringStyle.append(stringBuffer, ((String) null), ((long[]) null), ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.isRegistered
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isRegistered(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#isRegistered(java.lang.Object)}
     */
    @Test
    public void testIsRegisteredReturnsFalse() {
        boolean actual = ToStringStyle.isRegistered(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isRegistered(java.lang.Object)
    
    @Test
    public void testIsRegistered1() {
        Object object = new Object();
        
        boolean actual = ToStringStyle.isRegistered(object);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsRegistered2() {
        Object object = new Object();
        
        boolean actual = ToStringStyle.isRegistered(object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.register
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method register(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#register(java.lang.Object)}
 * @utbot.executesCondition {@code (value != null): False}
 *  */
    @Test
    public void testRegister_ValueEqualsNull() {
        ToStringStyle.register(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method register(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#register(java.lang.Object)}
     */
    @Test
    public void testRegister() {
        ToStringStyle.register(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method register(java.lang.Object)
    
    @Test
    public void testRegister1() {
        Object object = new Object();
        
        ToStringStyle.register(object);
    }
    
    @Test
    public void testRegister2() {
        Object object = new Object();
        
        ToStringStyle.register(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.unregister
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unregister(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ToStringStyle}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#unregister(java.lang.Object)}
 * @utbot.executesCondition {@code (value != null): False}
 *  */
    @Test
    public void testUnregister_ValueEqualsNull() {
        ToStringStyle.unregister(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unregister(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.ToStringStyle#unregister(java.lang.Object)}
     */
    @Test
    public void testUnregister() {
        ToStringStyle.unregister(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unregister(java.lang.Object)
    
    @Test
    public void testUnregister1() {
        Object object = new Object();
        
        ToStringStyle.unregister(object);
    }
    
    @Test
    public void testUnregister2() {
        Object object = new Object();
        
        ToStringStyle.unregister(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.ToStringStyle.appendInternal
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendInternal(java.lang.StringBuffer, java.lang.String, java.lang.Object, boolean)
    
    @Test
    public void testAppendInternal1() {
        StandardToStringStyle standardToStringStyle = new StandardToStringStyle();
        StringBuffer stringBuffer = new StringBuffer("");
        Object object = new Object();
        
        standardToStringStyle.appendInternal(stringBuffer, null, object, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

