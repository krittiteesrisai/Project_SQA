package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import java.io.FileWriter;
import org.apache.commons.lang3.text.StrBuilder;
import java.lang.reflect.Method;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.CoderMalfunctionError;
import java.io.BufferedWriter;
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hex(int)
    
    @Test
    public void testHex2() {
        String actual = CharSequenceTranslator.hex(128);
        
        String expected = "80";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex3() {
        String actual = CharSequenceTranslator.hex(32768);
        
        String expected = "8000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex4() {
        String actual = CharSequenceTranslator.hex(4);
        
        String expected = "4";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex5() {
        String actual = CharSequenceTranslator.hex(8388608);
        
        String expected = "800000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex6() {
        String actual = CharSequenceTranslator.hex(65536);
        
        String expected = "10000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex7() {
        String actual = CharSequenceTranslator.hex(1073741824);
        
        String expected = "40000000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex8() {
        String actual = CharSequenceTranslator.hex(536870912);
        
        String expected = "20000000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex9() {
        String actual = CharSequenceTranslator.hex(2048);
        
        String expected = "800";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHex10() {
        String actual = CharSequenceTranslator.hex(33554432);
        
        String expected = "2000000";
        
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
        NumericEntityUnescaper numericEntityUnescaper = ((NumericEntityUnescaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityUnescaper"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.with] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.with(CharSequenceTranslator.java:122) */
        numericEntityUnescaper.with(null);
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
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        numericEntityUnescaper.translate(null, fileWriter);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.invokes {@link java.lang.Character#codePointCount(java.lang.CharSequence,int,int)}
 *  */
    @Test
    public void testTranslate_InputNotEqualsNull() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        String string = "";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        aggregateTranslator.translate(string, fileWriter);
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
    ///     {@link java.lang.Character#codePointCount(java.lang.CharSequence,int,int)} once,
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
        String string = "\uE000";
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
        
        assertEquals('\uE000', finalStrBuilderWriterThis$0Buffer0);
        
        assertEquals(1, finalStrBuilderWriterThis$0Size);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 *  */
    @Test
    public void testTranslate_IterateWhileLoop_1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
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
        translateMethod.invoke(aggregateTranslator, translateMethodArguments);
        
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
        String string = "\u8000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        
        aggregateTranslator.translate(string, printWriter);
        
        Writer printWriterOut = ((Writer) getFieldValue(printWriter, "java.io.PrintWriter", "out"));
        boolean finalPrintWriterOutTrouble = ((Boolean) getFieldValue(printWriterOut, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterOutTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link CharSequenceTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code while(pos < len)} once
 *  */
    @Test
    public void testTranslate_IterateWhileLoop_3() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.write(c);
 *  */
    @Test
    public void testTranslate_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
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
        String string = "\uE000";
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
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: out.write(c);
 *  */
    @Test
    public void testTranslate_ThrowNegativeArraySizeException() throws Throwable  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
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
    public void testTranslate_ThrowNullPointerException() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: out.write(c);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTranslate_ThrowIllegalStateException() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
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
    public void testTranslate_ThrowCoderMalfunctionError() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uDC00";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
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
    public void testTranslate_ThrowCoderMalfunctionError_1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method translate(java.lang.CharSequence, java.io.Writer)
    
    @Test
    public void testTranslate1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[1] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000\uE000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate2() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator4 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator5 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators5[0] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator5, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators5);
        translators4[0] = ((CharSequenceTranslator) aggregateTranslator5);
        setField(aggregateTranslator4, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators4);
        translators3[0] = ((CharSequenceTranslator) aggregateTranslator4);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators1[1] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, printWriter);
    }
    
    @Test
    public void testTranslate3() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000\uE000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate4() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators2[0] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000\u8000";
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, bufferedWriter);
    }
    
    @Test
    public void testTranslate5() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator1);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[2] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uD800 ";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate6() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator1);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[2] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000\uE000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate7() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[1] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000\uE000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate8() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator2);
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator4 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators3[0] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator4, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators2[0] = ((CharSequenceTranslator) aggregateTranslator4);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators[2] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        BufferedWriter bufferedWriter = ((BufferedWriter) createInstance("java.io.BufferedWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedWriter.write(BufferedWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, bufferedWriter);
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
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators3[0] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators1[1] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000\uD800";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate10() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = {};
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators2[0] = ((CharSequenceTranslator) aggregateTranslator3);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators2[1] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000\uD800";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate11() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators2[0] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uD800\uD800";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, printWriter);
    }
    
    @Test
    public void testTranslate12() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[1] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000\u8000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate13() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator1);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[2] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000\u8000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    
    @Test
    public void testTranslate14() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator1);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[2] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000\uE000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:223)
            java.base/java.io.Writer.write(Writer.java:249)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(NumericEntityEscaper.java:117)
            org.apache.commons.lang3.text.translate.CodePointTranslator.translate(CodePointTranslator.java:41)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90) */
        aggregateTranslator.translate(string, fileWriter);
    }
    ///endregion
    
    ///region Errors report for translate
    
    public void testTranslate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 12 occurrences of:
        // Concrete execution failed
        
        // 10 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 8 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
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
    public void testTranslate_InputNotEqualsNull1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        String string = "";
        
        String actual = aggregateTranslator.translate(string);
        
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
    public void testTranslate_InputNotEqualsNull_1() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = {};
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
    public void testTranslate_InputNotEqualsNull_2() throws Exception  {
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
    public void testTranslate_InputNotEqualsNull_3() {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        String string = "\u8000";
        
        String actual = unicodeUnescaper.translate(string);
        
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
    public void testTranslate_InputNotEqualsNull_4() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators[0] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "\u8000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method translate(java.lang.CharSequence)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.CharSequenceTranslator#translate(java.lang.CharSequence)}
     */
    @Test
    public void testTranslateWithNonEmptyString() {
        UnicodeUnescaper unicodeUnescaper = new UnicodeUnescaper();
        
        String actual = unicodeUnescaper.translate("X");
        
        String expected = "X";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method translate(java.lang.CharSequence)
    
    @Test
    public void testTranslate15() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators2[0] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator2);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[2] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "&#32768;";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTranslate16() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators[0] = ((CharSequenceTranslator) unicodeUnescaper);
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators1[1] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\\";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "&#92;";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTranslate17() {
        NumericEntityEscaper numericEntityEscaper = new NumericEntityEscaper();
        String string = "\uE000\uE000\u8000";
        
        String actual = numericEntityEscaper.translate(string);
        
        String expected = "&#57344;&#57344;&#32768;";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTranslate18() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[9];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators[0] = ((CharSequenceTranslator) unicodeUnescaper);
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[1] = ((CharSequenceTranslator) aggregateTranslator1);
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators[2] = ((CharSequenceTranslator) aggregateTranslator2);
        NumericEntityEscaper numericEntityEscaper = ((NumericEntityEscaper) createInstance("org.apache.commons.lang3.text.translate.NumericEntityEscaper"));
        translators[3] = ((CharSequenceTranslator) numericEntityEscaper);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        
        String actual = aggregateTranslator.translate(string);
        
        String expected = "&#32768;";
        
        assertEquals(expected, actual);
        
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] aggregateTranslatorTranslators = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator[]) getFieldValue(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators"));
        CharSequenceTranslator finalAggregateTranslatorTranslators4 = ((CharSequenceTranslator) get(aggregateTranslatorTranslators, 4));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] aggregateTranslatorTranslators1 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator[]) getFieldValue(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators"));
        CharSequenceTranslator finalAggregateTranslatorTranslators5 = ((CharSequenceTranslator) get(aggregateTranslatorTranslators1, 5));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] aggregateTranslatorTranslators2 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator[]) getFieldValue(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators"));
        CharSequenceTranslator finalAggregateTranslatorTranslators6 = ((CharSequenceTranslator) get(aggregateTranslatorTranslators2, 6));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] aggregateTranslatorTranslators3 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator[]) getFieldValue(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators"));
        CharSequenceTranslator finalAggregateTranslatorTranslators7 = ((CharSequenceTranslator) get(aggregateTranslatorTranslators3, 7));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] aggregateTranslatorTranslators4 = ((org.apache.commons.lang3.text.translate.CharSequenceTranslator[]) getFieldValue(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators"));
        CharSequenceTranslator finalAggregateTranslatorTranslators8 = ((CharSequenceTranslator) get(aggregateTranslatorTranslators4, 8));
        
        assertNull(finalAggregateTranslatorTranslators4);
        
        assertNull(finalAggregateTranslatorTranslators5);
        
        assertNull(finalAggregateTranslatorTranslators6);
        
        assertNull(finalAggregateTranslatorTranslators7);
        
        assertNull(finalAggregateTranslatorTranslators8);
    }
    
    @Test
    public void testTranslate19() {
        NumericEntityEscaper numericEntityEscaper = new NumericEntityEscaper();
        String string = "\u8000\uE000\uE000";
        
        String actual = numericEntityEscaper.translate(string);
        
        String expected = "&#32768;&#57344;&#57344;";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method translate(java.lang.CharSequence)
    
    @Test
    public void testTranslate20() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        String string = "\uE000\uE000\u8000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        lookupTranslator.translate(string);
    }
    
    @Test
    public void testTranslate21() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        String string = "\u8000\uE000\uE000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        lookupTranslator.translate(string);
    }
    
    @Test
    public void testTranslate22() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        String string = "\u8000\uE000\u8000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        lookupTranslator.translate(string);
    }
    
    @Test
    public void testTranslate23() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[3];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
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
        String string = "\uD800\uDC00";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate24() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators1[0] = ((CharSequenceTranslator) unicodeUnescaper);
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[1] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate25() throws Exception  {
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
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators[2] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate26() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators2[0] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate27() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = {};
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators1[1] = ((CharSequenceTranslator) unicodeUnescaper);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\u8000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate28() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = {};
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators[1] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uD800\uD800";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77)
            org.apache.commons.lang3.text.translate.AggregateTranslator.translate(AggregateTranslator.java:55)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:90)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.translate(CharSequenceTranslator.java:64) */
        aggregateTranslator.translate(string);
    }
    
    @Test
    public void testTranslate29() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[2];
        UnicodeUnescaper unicodeUnescaper = ((UnicodeUnescaper) createInstance("org.apache.commons.lang3.text.translate.UnicodeUnescaper"));
        translators2[0] = ((CharSequenceTranslator) unicodeUnescaper);
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators3[0] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators2[1] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uE000";
        
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
    public void testTranslate30() throws Exception  {
        AggregateTranslator aggregateTranslator = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator1 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator2 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        AggregateTranslator aggregateTranslator3 = ((AggregateTranslator) createInstance("org.apache.commons.lang3.text.translate.AggregateTranslator"));
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[1];
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        translators3[0] = ((CharSequenceTranslator) lookupTranslator);
        setField(aggregateTranslator3, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators3);
        translators2[0] = ((CharSequenceTranslator) aggregateTranslator3);
        setField(aggregateTranslator2, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators2);
        translators1[0] = ((CharSequenceTranslator) aggregateTranslator2);
        setField(aggregateTranslator1, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators1);
        translators[0] = ((CharSequenceTranslator) aggregateTranslator1);
        setField(aggregateTranslator, "org.apache.commons.lang3.text.translate.AggregateTranslator", "translators", translators);
        String string = "\uD800 ";
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields627444905869200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields627444905869200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass627444905874100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields627444905869200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass627444905874100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields627444906192400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields627444906192400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass627444906194300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields627444906192400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass627444906194300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

