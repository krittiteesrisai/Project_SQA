package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import java.util.HashMap;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.apache.commons.lang3.text.StrBuilder;
import java.lang.reflect.Method;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_lang3_text_translate_LookupTranslatorTest {
    ///region Test suites for executable org.apache.commons.lang3.text.translate.LookupTranslator.translate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method translate(java.lang.CharSequence, int, java.io.Writer)
    
    /**
    @utbot.classUnderTest {@link LookupTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.returnsFrom {@code return 0;}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return 0;
 *  */
    @Test
    public void testTranslate_ThrowStringIndexOutOfBoundsException() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", -1);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 2, null);
    }
    
    /**
    @utbot.classUnderTest {@link LookupTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.returnsFrom {@code return 0;}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return 0;
 *  */
    @Test
    public void testTranslate_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", 1);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 1);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 0, null);
    }
    
    /**
    @utbot.classUnderTest {@link LookupTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code for(int i = max; i >= shortest; i--)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: final CharSequence subSeq = input.subSequence(index, index + i);
 *  */
    @Test
    public void testTranslate_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -122);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", -122);
        String string = "                 ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 139]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 139, null);
    }
    
    /**
    @utbot.classUnderTest {@link LookupTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index + longest > input.length()
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", -255);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link LookupTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code for(int i = max; i >= shortest; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final CharSequence result = lookupMap.get(subSeq);
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_1() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", 1);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 1);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 1, null);
    }
    
    /**
    @utbot.classUnderTest {@link LookupTranslator}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator#translate(java.lang.CharSequence,int,java.io.Writer)}
 * @utbot.iterates iterate the loop {@code for(int i = max; i >= shortest; i--)} once
 * @utbot.returnsFrom {@code return 0;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 0;
 *  */
    @Test
    public void testTranslate_ThrowNullPointerException_2() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", 1);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 1);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 1, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method translate(java.lang.CharSequence, int, java.io.Writer)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator#translate(java.lang.CharSequence,int,java.io.Writer)}
     */
    @Test
    public void testTranslateThrowsSIOOBEWithNonEmptyString() throws IOException  {
        java.lang.CharSequence[][] charSequenceArray = new java.lang.CharSequence[3][];
        java.lang.CharSequence[] charSequenceArray1 = {"XZ", "10", "\n\t\r"};
        charSequenceArray[0] = charSequenceArray1;
        java.lang.CharSequence[] charSequenceArray2 = {"XZ", "", "XZ"};
        charSequenceArray[1] = charSequenceArray2;
        java.lang.CharSequence[] charSequenceArray3 = {"abc", "", "#$\\\"'"};
        charSequenceArray[2] = charSequenceArray3;
        LookupTranslator lookupTranslator = new LookupTranslator(charSequenceArray);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 8388608]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate("-3", 8388608, null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.text.translate.LookupTranslator#translate(java.lang.CharSequence,int,java.io.Writer)}
     */
    @Test
    public void testTranslateThrowsNPEWithCornerCase() throws IOException  {
        java.lang.CharSequence[][] charSequenceArray = new java.lang.CharSequence[3][];
        java.lang.CharSequence[] charSequenceArray1 = {"XZ", "10", ""};
        charSequenceArray[0] = charSequenceArray1;
        java.lang.CharSequence[] charSequenceArray2 = {"XZ", "-3", "XZ"};
        charSequenceArray[1] = charSequenceArray2;
        java.lang.CharSequence[] charSequenceArray3 = {"-3", "\n\t\r", "10"};
        charSequenceArray[2] = charSequenceArray3;
        LookupTranslator lookupTranslator = new LookupTranslator(charSequenceArray);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(null, Integer.MAX_VALUE, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method translate(java.lang.CharSequence, int, java.io.Writer)
    
    @Test
    public void testTranslate1() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483647);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", -1073741824);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1073741823]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, -1073741823, null);
    }
    
    @Test
    public void testTranslate2() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", 1);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 2);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, -1, null);
    }
    
    @Test
    public void testTranslate3() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483615);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 32);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2147483619]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 2147483619, null);
    }
    
    @Test
    public void testTranslate4() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483647);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 1);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000";
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 6]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 6, outputStreamWriter);
    }
    
    @Test
    public void testTranslate5() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483647);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 14680080);
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 1, null);
    }
    
    @Test
    public void testTranslate6() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 0, null);
    }
    
    @Test
    public void testTranslate7() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 1, null);
    }
    
    @Test
    public void testTranslate8() throws Throwable  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        Object directCharBufferRU = createInstance("java.nio.DirectCharBufferRU");
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        lookupMap.put(directCharBufferRU, strBuilder);
        Object directCharBufferRU1 = createInstance("java.nio.DirectCharBufferRU");
        lookupMap.put(directCharBufferRU1, strBuilder);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483647);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.nio.Buffer.checkIndex(Buffer.java:749)
            java.base/java.nio.CharBuffer.charAt(CharBuffer.java:1908)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        Class lookupTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class directCharBufferRUType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class outputStreamWriterType = Class.forName("java.io.Writer");
        Method translateMethod = lookupTranslatorClazz.getDeclaredMethod("translate", directCharBufferRUType, intType, outputStreamWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[3];
        translateMethodArguments[0] = directCharBufferRU;
        translateMethodArguments[1] = 1;
        translateMethodArguments[2] = outputStreamWriter;
        try {
            translateMethod.invoke(lookupTranslator, translateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTranslate9() throws Throwable  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        Object directCharBufferRU = createInstance("java.nio.DirectCharBufferRU");
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        lookupMap.put(directCharBufferRU, strBuilder);
        lookupMap.put(null, strBuilder);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 1);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.nio.Buffer.checkIndex(Buffer.java:749)
            java.base/java.nio.CharBuffer.charAt(CharBuffer.java:1908)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        Class lookupTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class directCharBufferRUType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class outputStreamWriterType = Class.forName("java.io.Writer");
        Method translateMethod = lookupTranslatorClazz.getDeclaredMethod("translate", directCharBufferRUType, intType, outputStreamWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[3];
        translateMethodArguments[0] = directCharBufferRU;
        translateMethodArguments[1] = 27;
        translateMethodArguments[2] = outputStreamWriter;
        try {
            translateMethod.invoke(lookupTranslator, translateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTranslate10() throws Throwable  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        Object directCharBufferRU = createInstance("java.nio.DirectCharBufferRU");
        StrBuilder strBuilder = ((StrBuilder) createInstance("org.apache.commons.lang3.text.StrBuilder"));
        lookupMap.put(directCharBufferRU, strBuilder);
        Object directCharBufferRU1 = createInstance("java.nio.DirectCharBufferRU");
        lookupMap.put(directCharBufferRU1, null);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", 17);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 33);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.nio.Buffer.checkIndex(Buffer.java:749)
            java.base/java.nio.CharBuffer.charAt(CharBuffer.java:1908)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        Class lookupTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class directCharBufferRU1Type = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class outputStreamWriterType = Class.forName("java.io.Writer");
        Method translateMethod = lookupTranslatorClazz.getDeclaredMethod("translate", directCharBufferRU1Type, intType, outputStreamWriterType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[3];
        translateMethodArguments[0] = directCharBufferRU1;
        translateMethodArguments[1] = 0;
        translateMethodArguments[2] = outputStreamWriter;
        try {
            translateMethod.invoke(lookupTranslator, translateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTranslate11() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        Object heapCharBuffer = createInstance("java.nio.HeapCharBuffer");
        lookupMap.put(null, heapCharBuffer);
        StringBuilder stringBuilder = new StringBuilder("");
        lookupMap.put(stringBuilder, heapCharBuffer);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483586);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 32);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.StringIndexOutOfBoundsException: index 1, length 0]
            java.base/java.lang.String.checkIndex(String.java:4567)
            java.base/java.lang.AbstractStringBuilder.charAt(AbstractStringBuilder.java:351)
            java.base/java.lang.StringBuilder.charAt(StringBuilder.java:91)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(stringBuilder, 1, null);
    }
    
    @Test
    public void testTranslate12() throws Throwable  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        Object directCharBufferS = createInstance("java.nio.DirectCharBufferS");
        lookupMap.put(null, directCharBufferS);
        Object byteBufferAsCharBufferRL = createInstance("java.nio.ByteBufferAsCharBufferRL");
        lookupMap.put(byteBufferAsCharBufferRL, null);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", 31);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 32);
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.IndexOutOfBoundsException]
            java.base/java.nio.Buffer.checkIndex(Buffer.java:749)
            java.base/java.nio.CharBuffer.charAt(CharBuffer.java:1908)
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        Class lookupTranslatorClazz = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class byteBufferAsCharBufferRLType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class writerType = Class.forName("java.io.Writer");
        Method translateMethod = lookupTranslatorClazz.getDeclaredMethod("translate", byteBufferAsCharBufferRLType, intType, writerType);
        translateMethod.setAccessible(true);
        java.lang.Object[] translateMethodArguments = new java.lang.Object[3];
        translateMethodArguments[0] = byteBufferAsCharBufferRL;
        translateMethodArguments[1] = 0;
        translateMethodArguments[2] = ((Object) null);
        try {
            translateMethod.invoke(lookupTranslator, translateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTranslate13() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483613);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 35);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 0, fileWriter);
    }
    
    @Test
    public void testTranslate14() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 1);
        String string = "\u0000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 0, printWriter);
    }
    
    @Test
    public void testTranslate15() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483634);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 589856);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 29, fileWriter);
    }
    
    @Test
    public void testTranslate16() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483634);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 589856);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 29, fileWriter);
    }
    
    @Test
    public void testTranslate17() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        HashMap lookupMap = new HashMap();
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "lookupMap", lookupMap);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483633);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 8);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 25, printWriter);
    }
    
    @Test
    public void testTranslate18() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -2147483647);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 1, null);
    }
    
    @Test
    public void testTranslate19() throws Exception  {
        LookupTranslator lookupTranslator = ((LookupTranslator) createInstance("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "shortest", -1073741754);
        setField(lookupTranslator, "org.apache.commons.lang3.text.translate.LookupTranslator", "longest", 34);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.text.translate.LookupTranslator.translate] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.text.translate.LookupTranslator.translate(LookupTranslator.java:77) */
        lookupTranslator.translate(string, 0, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields621222696424700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields621222696424700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass621222696431200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields621222696424700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass621222696431200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

