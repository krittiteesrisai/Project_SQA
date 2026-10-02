package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION;
import java.io.PrintWriter;
import java.io.FileWriter;
import org.apache.commons.lang3.text.StrBuilder;
import java.lang.reflect.Method;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.CoderMalfunctionError;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang3_text_translate_CharSequenceTranslatorTest {
    ///region Test suites for executable org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hex(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex() {
        String actual = CharSequenceTranslator.hex(2147483645);
        
        String expected = "7FFFFFFD";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex1() {
        String actual = CharSequenceTranslator.hex(1073741821);
        
        String expected = "3FFFFFFD";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex2() {
        String actual = CharSequenceTranslator.hex(-1073741827);
        
        String expected = "BFFFFFFD";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex3() {
        String actual = CharSequenceTranslator.hex(-2147483644);
        
        String expected = "80000004";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex4() {
        String actual = CharSequenceTranslator.hex(-2146959356);
        
        String expected = "80080004";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex5() {
        String actual = CharSequenceTranslator.hex(-2143289340);
        
        String expected = "80400004";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex6() {
        String actual = CharSequenceTranslator.hex(4194308);
        
        String expected = "400004";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex7() {
        String actual = CharSequenceTranslator.hex(4);
        
        String expected = "4";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#hex(int)}
     */
    @Test
    public void testHex8() {
        String actual = CharSequenceTranslator.hex(6);
        
        String expected = "6";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hex(int)
    
    @Test
    public void testHex9() {
        String actual = CharSequenceTranslator.hex(4);
        
        String expected = "4";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex10() {
        String actual = CharSequenceTranslator.hex(32768);
        
        String expected = "8000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.translate.CharSequenceTranslator.with
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method with([Lorg.apache.commons.lang3.text.translate.CharSequenceTranslator;)
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return new AggregateTranslator(newArray);}
 *  */
    @Test
    public void testWith_SystemArraycopy() throws Exception  {
        NumericEntityUnescaper numericEntityUnescaper = ((NumericEntityUnescaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityUnescaper"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) numericEntityUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method with([Lorg.apache.commons.lang3.text.translate.CharSequenceTranslator;)
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CharSequenceTranslator[] newArray = new CharSequenceTranslator[translators.length + 1];
 *  */
    @Test
    public void testWith_ThrowNullPointerException() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.with] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.with(CharSequenceTranslator.java:122) */
        aggregateTranslator.with(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method with([Lorg.apache.commons.lang3.text.translate.CharSequenceTranslator;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray() throws Exception  {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) unicodeUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray1() throws Exception  {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) unicodeUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray2() throws Exception  {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) unicodeUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray3() throws Exception  {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) unicodeUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray4() throws Exception  {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[0] = option;
        oPTIONArray[1] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[2] = option1;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) numericEntityUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray5() throws Exception  {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[0] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[1] = option1;
        oPTIONArray[2] = option;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option1;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) numericEntityUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray6() throws Exception  {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[0] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[1] = option1;
        oPTIONArray[2] = option1;
        oPTIONArray[3] = option;
        oPTIONArray[4] = option;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) numericEntityUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray7() throws Exception  {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[0] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[1] = option1;
        oPTIONArray[2] = option;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option1;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        
        AggregateTranslator actual = ((AggregateTranslator) numericEntityUnescaper.with(charSequenceTranslatorArray));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#with(org.apache.commons.lang3.text.translate.CharSequenceTranslator[])}
     */
    @Test
    public void testWithWithEmptyObjectArray8() throws Exception  {
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray = {};
        AggregateTranslator aggregateTranslator = new AggregateTranslator(charSequenceTranslatorArray);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = {};
        
        AggregateTranslator actual = ((AggregateTranslator) aggregateTranslator.with(charSequenceTranslatorArray1));
        
        AggregateTranslator expected = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method translate(java.lang.CharSequence, java.io.Writer)
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (input == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTranslate_InputEqualsNull() throws Exception  {
        NumericEntityUnescaper numericEntityUnescaper = ((NumericEntityUnescaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityUnescaper"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        numericEntityUnescaper.translate(null, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull() throws Exception  {
        NumericEntityUnescaper numericEntityUnescaper = ((NumericEntityUnescaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityUnescaper"));
        String string = "";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        numericEntityUnescaper.translate(string, fileWriter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method translate(java.lang.CharSequence, java.io.Writer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (input == null): False}
    /// invoke:
    ///     {@link java.lang.CharSequence#length()} once,
    ///     {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,int,java.io.Writer)} once
    /// execute conditions:
    ///     {@code (consumed == 0): True}
    /// invoke:
    ///     {@link java.lang.Character#codePointAt(java.lang.CharSequence,int)} once,
    ///     {@link java.lang.Character#toChars(int)} once,
    ///     {@link java.io.Writer#write(char[])} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 *  */
    @Test
    public void testTranslate_IterateWhileLoop() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        Object strBuilderWriter = createInstance("org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter");
        StrBuilder this$0 = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        char[] buffer = {'\u0000'};
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "buffer", buffer);
        setField(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0", this$0);
        
        Class charSequenceTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.CharSequenceTranslator");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class strBuilderWriterType = Class.forName("java.io.Writer");
        Method translateMethod = charSequenceTranslatorClazz.getDeclaredMethod("translate", stringType, strBuilderWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[2];
        translateMethodArguments[0] = string;
        translateMethodArguments[1] = strBuilderWriter;
        translateMethod.invoke(aggregateTranslator, translateMethodArguments);
        
        StrBuilder strBuilderWriterThis$0 = ((StrBuilder) getFieldValue(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0"));
        char[] strBuilderWriterThis$0This$0Buffer = ((char[]) getFieldValue(strBuilderWriterThis$0, "org.apache.commons.lang3.text.StrBuilder", "buffer"));
        char finalStrBuilderWriterThis$0Buffer0 = ((Character) get(strBuilderWriterThis$0This$0Buffer, 0));
        StrBuilder strBuilderWriterThis$01 = ((StrBuilder) getFieldValue(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0"));
        int finalStrBuilderWriterThis$0Size = ((Integer) getFieldValue(strBuilderWriterThis$01, "org.apache.commons.lang3.text.StrBuilder", "size"));
        
        assertEquals('\u8000', finalStrBuilderWriterThis$0Buffer0);
        
        assertEquals(1, finalStrBuilderWriterThis$0Size);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 *  */
    @Test
    public void testTranslate_IterateWhileLoop_1() throws Exception  {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        String string = "\uE000";
        Object strBuilderWriter = createInstance("org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter");
        StrBuilder this$0 = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        char[] buffer = {};
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "buffer", buffer);
        setField(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0", this$0);
        
        StrBuilder strBuilderWriterThis$0 = ((StrBuilder) getFieldValue(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0"));
        char[] initialStrBuilderWriterThis$0Buffer = ((char[]) getFieldValue(strBuilderWriterThis$0, "org.apache.commons.lang3.text.StrBuilder", "buffer"));
        
        Class charSequenceTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.CharSequenceTranslator");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class strBuilderWriterType = Class.forName("java.io.Writer");
        Method translateMethod = charSequenceTranslatorClazz.getDeclaredMethod("translate", stringType, strBuilderWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[2];
        translateMethodArguments[0] = string;
        translateMethodArguments[1] = strBuilderWriter;
        translateMethod.invoke(unicodeUnescaper, translateMethodArguments);
        
        StrBuilder strBuilderWriterThis$01 = ((StrBuilder) getFieldValue(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0"));
        char[] finalStrBuilderWriterThis$0Buffer = ((char[]) getFieldValue(strBuilderWriterThis$01, "org.apache.commons.lang3.text.StrBuilder", "buffer"));
        StrBuilder strBuilderWriterThis$02 = ((StrBuilder) getFieldValue(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0"));
        int finalStrBuilderWriterThis$0Size = ((Integer) getFieldValue(strBuilderWriterThis$02, "org.apache.commons.lang3.text.StrBuilder", "size"));
        
        assertFalse(initialStrBuilderWriterThis$0Buffer == finalStrBuilderWriterThis$0Buffer);
        
        assertEquals(1, finalStrBuilderWriterThis$0Size);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 *  */
    @Test
    public void testTranslate_IterateWhileLoop_2() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        aggregateTranslator.translate(string, printWriter);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method translate(java.lang.CharSequence, java.io.Writer)
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: out == null
 *  */
    @Test
    public void testTranslate_ThrowIllegalArgumentException() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.IllegalArgumentException: The Writer must not be null]
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:82) */
        aggregateTranslator.translate(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: out.write(c);
 *  */
    @Test
    public void testTranslate_ThrowNegativeArraySizeException() throws Throwable  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        Object strBuilderWriter = createInstance("org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter");
        StrBuilder this$0 = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "buffer", buffer);
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "size", 2147483646);
        setField(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0", this$0);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.lang3.text.StrBuilder.ensureCapacity(StrBuilder.java:242)
            org.apache.commons.lang3.text.StrBuilder.append(StrBuilder.java:916)
            org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter.write(StrBuilder.java:3075)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        Class charSequenceTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.CharSequenceTranslator");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class strBuilderWriterType = Class.forName("java.io.Writer");
        Method translateMethod = charSequenceTranslatorClazz.getDeclaredMethod("translate", stringType, strBuilderWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[2];
        translateMethodArguments[0] = string;
        translateMethodArguments[1] = strBuilderWriter;
        try {
            translateMethod.invoke(aggregateTranslator, translateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: out.write(c);
 *  */
    @Test
    public void testTranslate_ThrowNegativeArraySizeException_1() throws Throwable  {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        String string = "\uE000";
        Object strBuilderWriter = createInstance("org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter");
        StrBuilder this$0 = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        char[] buffer = {'\u0000', '\u0000'};
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "buffer", buffer);
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "size", 2147483646);
        setField(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0", this$0);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.lang3.text.StrBuilder.ensureCapacity(StrBuilder.java:242)
            org.apache.commons.lang3.text.StrBuilder.append(StrBuilder.java:916)
            org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter.write(StrBuilder.java:3075)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        Class charSequenceTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.CharSequenceTranslator");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class strBuilderWriterType = Class.forName("java.io.Writer");
        Method translateMethod = charSequenceTranslatorClazz.getDeclaredMethod("translate", stringType, strBuilderWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[2];
        translateMethodArguments[0] = string;
        translateMethodArguments[1] = strBuilderWriter;
        try {
            translateMethod.invoke(unicodeUnescaper, translateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(c);
 *  */
    @Test
    public void testTranslate_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        Object strBuilderWriter = createInstance("org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter");
        StrBuilder this$0 = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        char[] buffer = {};
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "buffer", buffer);
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "size", -1);
        setField(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0", this$0);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.lang3.text.StrBuilder.append(StrBuilder.java:917)
            org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter.write(StrBuilder.java:3075)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        Class charSequenceTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.CharSequenceTranslator");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class strBuilderWriterType = Class.forName("java.io.Writer");
        Method translateMethod = charSequenceTranslatorClazz.getDeclaredMethod("translate", stringType, strBuilderWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[2];
        translateMethodArguments[0] = string;
        translateMethodArguments[1] = strBuilderWriter;
        try {
            translateMethod.invoke(aggregateTranslator, translateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(c);
 *  */
    @Test
    public void testTranslate_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        Object strBuilderWriter = createInstance("org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter");
        StrBuilder this$0 = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        char[] buffer = {};
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "buffer", buffer);
        setField(this$0, "org.apache.commons.lang3.text.StrBuilder", "size", 5);
        setField(strBuilderWriter, "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter", "this$0", this$0);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 5 out of bounds for char[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang3.text.StrBuilder.ensureCapacity(StrBuilder.java:243)
            org.apache.commons.lang3.text.StrBuilder.append(StrBuilder.java:916)
            org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter.write(StrBuilder.java:3075)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        Class charSequenceTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.CharSequenceTranslator");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class strBuilderWriterType = Class.forName("java.io.Writer");
        Method translateMethod = charSequenceTranslatorClazz.getDeclaredMethod("translate", stringType, strBuilderWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[2];
        translateMethodArguments[0] = string;
        translateMethodArguments[1] = strBuilderWriter;
        try {
            translateMethod.invoke(aggregateTranslator, translateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_2() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uD800";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_3() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_4() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators[1] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(c);
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_5() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:131)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, bufferedWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(c);
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_6() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(bufferedWriter, "java.io.BufferedWriter", "out", out);
        char[] cb = {'\u0000'};
        setField(bufferedWriter, "java.io.BufferedWriter", "cb", cb);
        setField(bufferedWriter, "java.io.BufferedWriter", "nChars", 2049);
        setField(bufferedWriter, "java.io.BufferedWriter", "nextChar", 2147481598);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:131)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, bufferedWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_7() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uDBE2\uDC00";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_8() throws Exception  {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        String string = "\\";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        unicodeUnescaper.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(bufferedWriter, "java.io.BufferedWriter", "out", out);
        setField(bufferedWriter, "java.io.BufferedWriter", "nChars", 1);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:131)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, bufferedWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_9() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (out == null): False}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_10() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators[0] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        BufferedWriter out = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:95) */
        aggregateTranslator.translate(string, printWriter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method translate(java.lang.CharSequence, java.io.Writer)
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write(c);
 *  */
    @Test(expected = IOException.class)
    public void testTranslate_ThrowIOException() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        
        aggregateTranslator.translate(string, fileWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write(c);
 *  */
    @Test(expected = IOException.class)
    public void testTranslate_ThrowIOException_1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(bufferedWriter, "java.io.BufferedWriter", "out", out);
        setField(bufferedWriter, "java.io.BufferedWriter", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(bufferedWriter, "java.io.Writer", "lock", lock);
        
        aggregateTranslator.translate(string, bufferedWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write(c);
 *  */
    @Test(expected = IOException.class)
    public void testTranslate_ThrowIOException_2() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(bufferedWriter, "java.io.BufferedWriter", "out", out);
        char[] cb = {'\u0000'};
        setField(bufferedWriter, "java.io.BufferedWriter", "cb", cb);
        setField(bufferedWriter, "java.io.BufferedWriter", "nChars", 1);
        setField(bufferedWriter, "java.io.BufferedWriter", "nextChar", 1);
        Object lock = createInstance("java.lang.Object");
        setField(bufferedWriter, "java.io.Writer", "lock", lock);
        
        aggregateTranslator.translate(string, bufferedWriter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method translate(java.lang.CharSequence, java.io.Writer)
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: out.write(c);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testTranslate_ThrowReadOnlyBufferException() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: out.write(c);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testTranslate_ThrowReadOnlyBufferException_1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: out.write(c);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testTranslate_ThrowCoderMalfunctionError() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 2147483646);
        setField(bb, "java.nio.Buffer", "limit", -2147483646);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: out.write(c);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testTranslate_ThrowCoderMalfunctionError_1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: out.write(c);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testTranslate_ThrowCoderMalfunctionError_2() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: out.write(c);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTranslate_ThrowIllegalStateException() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uDC00";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: out.write(c);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testTranslate_ThrowCoderMalfunctionError_3() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uDC00";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", -2110165382);
        setField(bb, "java.nio.Buffer", "position", -1111060090);
        setField(bb, "java.nio.Buffer", "limit", 126666785);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        aggregateTranslator.translate(string, printWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: out.write(c);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testTranslate_ThrowCoderMalfunctionError_4() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", 1);
        setField(bb, "java.nio.Buffer", "position", -2079842304);
        setField(bb, "java.nio.Buffer", "limit", -2078264294);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        aggregateTranslator.translate(string, printWriter);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method translate(java.lang.CharSequence, java.io.Writer)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
     */
    @Test
    public void testTranslateWithNonEmptyString() throws IOException  {
        java.lang.CharSequence[][] charSequenceArray = {};
        LookupTranslator lookupTranslator = new LookupTranslator(charSequenceArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
        
        lookupTranslator.translate("bac", outputStreamWriter);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
     */
    @Test
    public void testTranslateWithNonEmptyString1() throws IOException  {
        java.lang.CharSequence[][] charSequenceArray = {};
        LookupTranslator lookupTranslator = new LookupTranslator(charSequenceArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
        
        lookupTranslator.translate("bac\u0099", outputStreamWriter);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
     */
    @Test
    public void testTranslateWithNonEmptyString2() throws IOException  {
        java.lang.CharSequence[][] charSequenceArray = {};
        LookupTranslator lookupTranslator = new LookupTranslator(charSequenceArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
        
        lookupTranslator.translate("bac", outputStreamWriter);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method translate(java.lang.CharSequence, java.io.Writer)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
     */
    @Test
    public void testTranslateThrowsIAE() throws IOException  {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[0] = option;
        oPTIONArray[1] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[2] = option1;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        StrBuilder strBuilder = new StrBuilder(Integer.MIN_VALUE);
        strBuilder.setNullText("#$\\\"'");
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.IllegalArgumentException: The Writer must not be null]
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:82) */
        numericEntityUnescaper.translate(strBuilder, null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
     */
    @Test
    public void testTranslateThrowsIAE1() throws IOException  {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[0] = option;
        oPTIONArray[1] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[2] = option1;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        StrBuilder strBuilder = new StrBuilder(-2147482624);
        strBuilder.setNullText("#$\\\"'");
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.IllegalArgumentException: The Writer must not be null]
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:82) */
        numericEntityUnescaper.translate(strBuilder, null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
     */
    @Test
    public void testTranslateThrowsIAE2() throws IOException  {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[0] = option;
        oPTIONArray[1] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[2] = option1;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        StrBuilder strBuilder = new StrBuilder(-2147482624);
        strBuilder.setNullText("#$\"'");
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.IllegalArgumentException: The Writer must not be null]
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:82) */
        numericEntityUnescaper.translate(strBuilder, null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
     */
    @Test
    public void testTranslateThrowsIAE3() throws IOException  {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[0] = option;
        oPTIONArray[1] = option;
        oPTIONArray[2] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option1;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        StrBuilder strBuilder = new StrBuilder(-2147482624);
        strBuilder.setNullText("#$\\\"'");
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.IllegalArgumentException: The Writer must not be null]
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:82) */
        numericEntityUnescaper.translate(strBuilder, null);
    }
    ///endregion
    
    ///region Errors report for translate
    
    public void testTranslate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 34 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 22 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 6 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaLangAccess sun.nio.cs.SingleByte.JLA accessible:
        module java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method translate(java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull_1() throws Exception  {
        NumericEntityUnescaper numericEntityUnescaper = ((NumericEntityUnescaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityUnescaper"));
        String string = "";
        
        String actual = numericEntityUnescaper.translate(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTranslate_InputEqualsNull1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        
        String actual = aggregateTranslator.translate(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators1[0] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "\\";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull_2() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "\uE000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull_3() {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        String string = "\uE000";
        
        String actual = unicodeUnescaper.translate(string);
        
        String expected = "\uE000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull_4() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators[0] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "\uE000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull_5() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "\u8000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull_6() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uD800";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "\uD800";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return writer.toString();}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull_7() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uDBE0\uDC00";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "\uDBE0\uDC00";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method translate(java.lang.CharSequence)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
     */
    @Test
    public void testTranslateWithNonEmptyString3() {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        
        String actual = unicodeUnescaper.translate("#$\\\u0094\"'");
        
        String expected = "#$\\\u0094\"'";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
     */
    @Test
    public void testTranslateWithNonEmptyString4() {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[0] = option;
        oPTIONArray[1] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[2] = option1;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        
        String actual = numericEntityUnescaper.translate("bac");
        
        String expected = "bac";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
     */
    @Test
    public void testTranslateWithNonEmptyString5() {
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[5];
        NumericEntityUnescaper.OPTION option = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        oPTIONArray[0] = option;
        oPTIONArray[1] = option;
        NumericEntityUnescaper.OPTION option1 = NumericEntityUnescaper.OPTION.semiColonOptional;
        oPTIONArray[2] = option1;
        oPTIONArray[3] = option1;
        oPTIONArray[4] = option;
        NumericEntityUnescaper numericEntityUnescaper = new NumericEntityUnescaper(oPTIONArray);
        
        String actual = numericEntityUnescaper.translate("\u0099bac");
        
        String expected = "\u0099bac";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method translate(java.lang.CharSequence)
    
    @Test
    public void testTranslate1() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        lookupTranslator.translate(string);
    }
    
    @Test
    public void testTranslate2() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators[0] = ((CharSequenceTranslator) unicodeUnescaper);
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators1[0] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate3() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[9];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators1[1] = ((CharSequenceTranslator) unicodeUnescaper);
        translators1[2] = ((CharSequenceTranslator) aggregateTranslator2);
        NumericEntityUnescaper numericEntityUnescaper = ((NumericEntityUnescaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityUnescaper"));
        translators1[3] = ((CharSequenceTranslator) numericEntityUnescaper);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate4() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators1[0] = ((CharSequenceTranslator) unicodeUnescaper);
        translators1[1] = ((CharSequenceTranslator) unicodeUnescaper);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators1[2] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate5() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators1[0] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator2);
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators3[0] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators[2] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\ ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate6() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        translators1[1] = ((CharSequenceTranslator) aggregateTranslator2);
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators3[0] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators1[2] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate7() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator4 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators4 = {};
        setField(aggregateTranslator4, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators4);
        translators3[0] = ((CharSequenceTranslator) aggregateTranslator4);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators2[0] = ((CharSequenceTranslator) aggregateTranslator3);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators2[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate8() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators[0] = ((CharSequenceTranslator) unicodeUnescaper);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\ ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate9() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        translators3[0] = ((CharSequenceTranslator) aggregateTranslator2);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators3[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators1[1] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate10() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators1[0] = ((CharSequenceTranslator) unicodeUnescaper);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators1[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate11() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators1[1] = ((CharSequenceTranslator) unicodeUnescaper);
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator4 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators4[0] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator4, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators4);
        translators3[0] = ((CharSequenceTranslator) aggregateTranslator4);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators1[2] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate12() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = {};
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators2[0] = ((CharSequenceTranslator) aggregateTranslator3);
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators2[1] = ((CharSequenceTranslator) unicodeUnescaper);
        AggregateTranslator aggregateTranslator4 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators4[0] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator4, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators4);
        translators2[2] = ((CharSequenceTranslator) aggregateTranslator4);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields622018053539600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields622018053539600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass622018053544700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields622018053539600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass622018053544700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields622018053866500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields622018053866500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass622018053868600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields622018053866500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass622018053868600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

