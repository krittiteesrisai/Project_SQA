package com.google.gson.stream;

import org.junit.Test;
import java.lang.reflect.Method;
import java.io.InputStreamReader;
import sun.nio.cs.StreamDecoder;
import java.io.Reader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.zip.ZipInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class com_google_gson_stream_JsonReaderTest {
    ///region Test suites for executable com.google.gson.stream.JsonReader.syntaxError
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method syntaxError(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#syntaxError(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} in: throw new MalformedJsonException(message + locationString());
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testSyntaxError_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method syntaxErrorMethod = jsonReaderClazz.getDeclaredMethod("syntaxError", stringType);
        syntaxErrorMethod.setAccessible(true);
        java.lang.Object[] syntaxErrorMethodArguments = new java.lang.Object[1];
        syntaxErrorMethodArguments[0] = ((Object) null);
        try {
            syntaxErrorMethod.invoke(jsonReader, syntaxErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.checkLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkLenient()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#checkLenient()}
 * @utbot.executesCondition {@code (!lenient): False}
 *  */
    @Test
    public void testCheckLenient_Lenient() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method checkLenientMethod = jsonReaderClazz.getDeclaredMethod("checkLenient");
        checkLenientMethod.setAccessible(true);
        java.lang.Object[] checkLenientMethodArguments = new java.lang.Object[0];
        checkLenientMethod.invoke(jsonReader, checkLenientMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method checkLenient()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#checkLenient()}
 * @utbot.executesCondition {@code (!lenient): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#syntaxError(java.lang.String)
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} when: !lenient
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testCheckLenient_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method checkLenientMethod = jsonReaderClazz.getDeclaredMethod("checkLenient");
        checkLenientMethod.setAccessible(true);
        java.lang.Object[] checkLenientMethodArguments = new java.lang.Object[0];
        try {
            checkLenientMethod.invoke(jsonReader, checkLenientMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.skipToEndOfLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipToEndOfLine()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 *  */
    @Test
    public void testSkipToEndOfLine_CEqualsChar() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\r', '\u0000', '@', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 4);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(2, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 *  */
    @Test
    public void testSkipToEndOfLine_CEqualsChar_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[17];
        buffer[0] = '\n';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", -255);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        int finalJsonReaderLineNumber = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber"));
        int finalJsonReaderLineStart = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "lineStart"));
        
        assertEquals(1, finalJsonReaderPos);
        
        assertEquals(-254, finalJsonReaderLineNumber);
        
        assertEquals(1, finalJsonReaderLineStart);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 *  */
    @Test
    public void testSkipToEndOfLine_CEqualsChar_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\r');
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        
        Reader jsonReaderIn = ((Reader) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "in"));
        StreamDecoder jsonReaderInInSd = ((StreamDecoder) getFieldValue(jsonReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalJsonReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(jsonReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        char[] jsonReaderBuffer = ((char[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "buffer"));
        char finalJsonReaderBuffer0 = ((Character) get(jsonReaderBuffer, 0));
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        int finalJsonReaderLimit = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "limit"));
        int finalJsonReaderLineStart = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "lineStart"));
        
        assertFalse(finalJsonReaderInSdHaveLeftoverChar);
        
        assertEquals('\r', finalJsonReaderBuffer0);
        
        assertEquals(1, finalJsonReaderPos);
        
        assertEquals(1, finalJsonReaderLimit);
        
        assertEquals(255, finalJsonReaderLineStart);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 *  */
    @Test
    public void testSkipToEndOfLine_CEqualsChar_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "leftoverChar", '\r');
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        
        Reader jsonReaderIn = ((Reader) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "in"));
        StreamDecoder jsonReaderInInSd = ((StreamDecoder) getFieldValue(jsonReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalJsonReaderInSdHaveLeftoverChar = ((Boolean) getFieldValue(jsonReaderInInSd, "sun.nio.cs.StreamDecoder", "haveLeftoverChar"));
        char[] jsonReaderBuffer = ((char[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "buffer"));
        char finalJsonReaderBuffer0 = ((Character) get(jsonReaderBuffer, 0));
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        int finalJsonReaderLimit = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "limit"));
        
        assertFalse(finalJsonReaderInSdHaveLeftoverChar);
        
        assertEquals('\r', finalJsonReaderBuffer0);
        
        assertEquals(1, finalJsonReaderPos);
        
        assertEquals(1, finalJsonReaderLimit);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipToEndOfLine()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[pos++];
 *  */
    @Test
    public void testSkipToEndOfLine_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipToEndOfLine] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1414) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[pos++];
 *  */
    @Test
    public void testSkipToEndOfLine_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipToEndOfLine] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1414) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(pos < limit || fillBuffer(1))
 *  */
    @Test
    public void testSkipToEndOfLine_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipToEndOfLine] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(pos < limit || fillBuffer(1))
 *  */
    @Test
    public void testSkipToEndOfLine_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2147483645);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -252);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipToEndOfLine] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 4294967044 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = buffer[pos++];
 *  */
    @Test
    public void testSkipToEndOfLine_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipToEndOfLine] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1414) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(pos < limit || fillBuffer(1))
 *  */
    @Test
    public void testSkipToEndOfLine_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipToEndOfLine] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(pos < limit || fillBuffer(1))
 *  */
    @Test
    public void testSkipToEndOfLine_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipToEndOfLine] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(pos < limit || fillBuffer(1))
 *  */
    @Test
    public void testSkipToEndOfLine_ThrowNullPointerException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipToEndOfLine] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skipToEndOfLine()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipToEndOfLine()}
 * @utbot.iterates iterate the loop {@code while(pos < limit || fillBuffer(1))} once
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testSkipToEndOfLine_ThrowIOException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipToEndOfLineMethod = jsonReaderClazz.getDeclaredMethod("skipToEndOfLine");
        skipToEndOfLineMethod.setAccessible(true);
        java.lang.Object[] skipToEndOfLineMethodArguments = new java.lang.Object[0];
        try {
            skipToEndOfLineMethod.invoke(jsonReader, skipToEndOfLineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for skipToEndOfLine
    
    public void testSkipToEndOfLine_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.skipTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 *  */
    @Test
    public void testSkipTo_PosOfBufferNotEqualsChar() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        String string = "";
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        boolean actual = ((Boolean) skipToMethod.invoke(jsonReader, skipToMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipTo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[pos] == '\n'
 *  */
    @Test
    public void testSkipTo_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -256);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        String string = " ";
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1432) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[pos] == '\n'
 *  */
    @Test
    public void testSkipTo_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 129);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 131);
        String string = "  ";
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1432) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer[pos] == '\n'
 *  */
    @Test
    public void testSkipTo_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\n'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        String string = " ";
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1432) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)
 *  */
    @Test
    public void testSkipTo_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1429) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = ((Object) null);
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer[pos] == '\n'
 *  */
    @Test
    public void testSkipTo_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1432) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)
 *  */
    @Test
    public void testSkipTo_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -66);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -65);
        String string = "  ";
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1431) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)
 *  */
    @Test
    public void testSkipTo_ThrowNullPointerException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        String string = " ";
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1431) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)
 *  */
    @Test
    public void testSkipTo_ThrowNullPointerException_4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        String string = "  ";
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1431) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipTo(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++)
 *  */
    @Test
    public void testSkipTo_ThrowNullPointerException_5() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        String string = " ";
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipTo] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1431) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class stringType = Class.forName("java.lang.String");
        Method skipToMethod = jsonReaderClazz.getDeclaredMethod("skipTo", stringType);
        skipToMethod.setAccessible(true);
        java.lang.Object[] skipToMethodArguments = new java.lang.Object[1];
        skipToMethodArguments[0] = string;
        try {
            skipToMethod.invoke(jsonReader, skipToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for skipTo
    
    public void testSkipTo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.endArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endArray()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): True}
 *  */
    @Test
    public void testEndArray_PEqualsPEEKED_END_ARRAY() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 4;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        jsonReader.endArray();
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(1, finalJsonReaderStackSize);
        
        assertEquals(-254, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endArray()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): False}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p == PEEKED_END_ARRAY
 *  */
    @Test
    public void testEndArray_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:367) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 4;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -257 out of bounds for length 1]
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:364) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 4;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 130);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:364) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:360) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:360) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: p = doPeek();
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {8};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.IllegalStateException: JsonReader is closed]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:545)
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:360) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -2147483394);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        int[] stack = {2};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483394 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:360) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 4;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:364) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p == PEEKED_END_ARRAY
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '['};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        int[] stack = {1};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:367) */
        jsonReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p = doPeek();
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 254);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        int[] stack = {2};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.endArray(JsonReader.java:360) */
        jsonReader.endArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextQuotedValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextQuotedValue(char)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextQuotedValue_BuilderEqualsNull() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[17];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = ' ';
        String actual = ((String) nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextQuotedValue(char)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextQuotedValue_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:994) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = ' ';
        try {
            nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextQuotedValue_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:994) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = ' ';
        try {
            nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextQuotedValue_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\n'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:994) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = ' ';
        try {
            nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextQuotedValue_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:994) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = '_';
        try {
            nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: builder.append(readEscapeCharacter());
 *  */
    @Test
    public void testNextQuotedValue_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '\\'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 254);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1502)
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:1013) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = ' ';
        try {
            nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !fillBuffer(1)
 *  */
    @Test
    public void testNextQuotedValue_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:1029) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = ' ';
        try {
            nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextQuotedValue_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:994) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = ' ';
        try {
            nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method nextQuotedValue(char)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} in: builder.append(readEscapeCharacter());
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testNextQuotedValue_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\\', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 254);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method nextQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextQuotedValue", charType);
        nextQuotedValueMethod.setAccessible(true);
        java.lang.Object[] nextQuotedValueMethodArguments = new java.lang.Object[1];
        nextQuotedValueMethodArguments[0] = ' ';
        try {
            nextQuotedValueMethod.invoke(jsonReader, nextQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.skipUnquotedValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipUnquotedValue()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCaser() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\r', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCase() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCase_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {']'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCaset() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\t', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCase_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {':'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCasef() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\f', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCase_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {','};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCase_4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'['};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCase_5() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'}'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCase_6() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'{'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 *  */
    @Test
    public void testSkipUnquotedValue_SwitchBufferposiCasen() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\n', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipUnquotedValue()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(buffer[pos + i])
 *  */
    @Test
    public void testSkipUnquotedValue_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipUnquotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.skipUnquotedValue(JsonReader.java:1125) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(buffer[pos + i])
 *  */
    @Test
    public void testSkipUnquotedValue_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipUnquotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            com.google.gson.stream.JsonReader.skipUnquotedValue(JsonReader.java:1125) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: fillBuffer(1)
 *  */
    @Test
    public void testSkipUnquotedValue_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipUnquotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipUnquotedValue(JsonReader.java:1148) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(buffer[pos + i])
 *  */
    @Test
    public void testSkipUnquotedValue_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipUnquotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipUnquotedValue(JsonReader.java:1125) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fillBuffer(1)
 *  */
    @Test
    public void testSkipUnquotedValue_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipUnquotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipUnquotedValue(JsonReader.java:1148) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fillBuffer(1)
 *  */
    @Test
    public void testSkipUnquotedValue_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipUnquotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipUnquotedValue(JsonReader.java:1148) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skipUnquotedValue()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} in: checkLenient();
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testSkipUnquotedValue_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'#'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method skipUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipUnquotedValue");
        skipUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] skipUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            skipUnquotedValueMethod.invoke(jsonReader, skipUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for skipUnquotedValue
    
    public void testSkipUnquotedValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.fillBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fillBuffer(int)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (lineNumber == 0): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testFillBuffer_LineNumberNotEqualsZero() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = 0;
        boolean actual = ((Boolean) fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments));
        
        assertTrue(actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        int finalJsonReaderLimit = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "limit"));
        int finalJsonReaderLineStart = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "lineStart"));
        
        assertEquals(0, finalJsonReaderPos);
        
        assertEquals(0, finalJsonReaderLimit);
        
        assertEquals(0, finalJsonReaderLineStart);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (lineNumber == 0): True}
 * @utbot.executesCondition {@code (lineStart == 0): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testFillBuffer_LineStartNotEqualsZero() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = 0;
        boolean actual = ((Boolean) fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments));
        
        assertTrue(actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        int finalJsonReaderLimit = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "limit"));
        int finalJsonReaderLineStart = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "lineStart"));
        
        assertEquals(0, finalJsonReaderPos);
        
        assertEquals(0, finalJsonReaderLimit);
        
        assertEquals(-253, finalJsonReaderLineStart);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (lineNumber == 0): True}
 * @utbot.executesCondition {@code (lineStart == 0): True}
 * @utbot.executesCondition {@code (limit > 0): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testFillBuffer_LimitLessOrEqualZero() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = 0;
        boolean actual = ((Boolean) fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments));
        
        assertTrue(actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        int finalJsonReaderLimit = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "limit"));
        int finalJsonReaderLineStart = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "lineStart"));
        
        assertEquals(0, finalJsonReaderPos);
        
        assertEquals(0, finalJsonReaderLimit);
        
        assertEquals(0, finalJsonReaderLineStart);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fillBuffer(int)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, pos, buffer, 0, limit);
 *  */
    @Test
    public void testFillBuffer_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for char[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, pos, buffer, 0, limit);
 *  */
    @Test
    public void testFillBuffer_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, pos, buffer, 0, limit);
 *  */
    @Test
    public void testFillBuffer_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 254);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((total = in.read(buffer, limit, buffer.length - limit)) != -1)
 *  */
    @Test
    public void testFillBuffer_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((total = in.read(buffer, limit, buffer.length - limit)) != -1)
 *  */
    @Test
    public void testFillBuffer_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((total = in.read(buffer, limit, buffer.length - limit)) != -1)
 *  */
    @Test
    public void testFillBuffer_ThrowNullPointerException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): False}
 * @utbot.executesCondition {@code (lineNumber == 0): False}
 * @utbot.executesCondition {@code (limit >= minimum): True}
 * @utbot.returnsFrom {@code return true;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return true;
 *  */
    @Test
    public void testFillBuffer_ThrowNullPointerException_4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        setField(in, "java.io.BufferedReader", "in", in1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = 0;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((total = in.read(buffer, limit, buffer.length - limit)) != -1)
 *  */
    @Test
    public void testFillBuffer_ThrowNullPointerException_5() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        FileReader in1 = ((FileReader) createInstance("java.io.FileReader"));
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {' '};
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nextChar", -1);
        setField(in, "java.io.BufferedReader", "skipLF", true);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", cb);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((total = in.read(buffer, limit, buffer.length - limit)) != -1)
 *  */
    @Test
    public void testFillBuffer_ThrowNullPointerException_6() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.fillBuffer] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method fillBuffer(int)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#fillBuffer(int)}
 * @utbot.executesCondition {@code (limit != pos): False}
 * @utbot.invokes {@link java.io.Reader#read(char[],int,int)}
 * @utbot.throwsException {@link java.io.IOException} in: while((total = in.read(buffer, limit, buffer.length - limit)) != -1)
 *  */
    @Test(expected = IOException.class)
    public void testFillBuffer_ThrowIOException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method fillBufferMethod = jsonReaderClazz.getDeclaredMethod("fillBuffer", intType);
        fillBufferMethod.setAccessible(true);
        java.lang.Object[] fillBufferMethodArguments = new java.lang.Object[1];
        fillBufferMethodArguments[0] = -255;
        try {
            fillBufferMethod.invoke(jsonReader, fillBufferMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for fillBuffer
    
    public void testFillBuffer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextNull()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNull()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_NULL): True}
 *  */
    @Test
    public void testNextNull_PEqualsPEEKED_NULL() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 7;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        jsonReader.nextNull();
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(-254, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextNull()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNull()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_NULL): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p == PEEKED_NULL
 *  */
    @Test
    public void testNextNull_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:871) */
        jsonReader.nextNull();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNull()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_NULL): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextNull_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 7;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:869) */
        jsonReader.nextNull();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNull()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_NULL): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextNull_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 7;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:869) */
        jsonReader.nextNull();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNull()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testNextNull_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNull()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_NULL): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextNull_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 7;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:869) */
        jsonReader.nextNull();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextNull()
    
    @Test
    public void testNextNull1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1574)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        buffer[11] = '\t';
        buffer[12] = '\t';
        buffer[13] = '\t';
        buffer[14] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 3);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 4);
        int[] stack = {
            4, 4, 4, 4, 4, 4, 4, 4,
            4
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:518)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1354)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[2] = ',';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:592)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull5() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        buffer[11] = '\t';
        buffer[12] = '\t';
        buffer[13] = '\t';
        buffer[14] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 3);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 4);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull6() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[40];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        buffer[17] = ' ';
        buffer[18] = ' ';
        buffer[19] = ' ';
        buffer[20] = ' ';
        buffer[21] = ' ';
        buffer[22] = ' ';
        buffer[23] = ' ';
        buffer[24] = ' ';
        buffer[25] = ' ';
        buffer[26] = ' ';
        buffer[27] = ' ';
        buffer[28] = ' ';
        buffer[29] = ' ';
        buffer[30] = ' ';
        buffer[31] = ' ';
        buffer[32] = ' ';
        buffer[33] = ' ';
        buffer[34] = ' ';
        buffer[35] = ' ';
        buffer[36] = ' ';
        buffer[37] = ' ';
        buffer[38] = ' ';
        buffer[39] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 32);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull7() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[2] = ';';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:471)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull8() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1354)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull9() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:490)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull10() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[40];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        buffer[17] = ' ';
        buffer[18] = ' ';
        buffer[19] = ' ';
        buffer[20] = ' ';
        buffer[21] = ' ';
        buffer[22] = ' ';
        buffer[23] = ' ';
        buffer[24] = ' ';
        buffer[25] = ' ';
        buffer[26] = ' ';
        buffer[27] = ' ';
        buffer[28] = ' ';
        buffer[29] = ' ';
        buffer[30] = ' ';
        buffer[31] = ' ';
        buffer[32] = ' ';
        buffer[33] = ' ';
        buffer[34] = ' ';
        buffer[35] = ' ';
        buffer[36] = ' ';
        buffer[37] = ' ';
        buffer[38] = ' ';
        buffer[39] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 32);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull11() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1385)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull12() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[40];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        buffer[11] = '/';
        buffer[12] = '/';
        buffer[13] = '/';
        buffer[14] = '/';
        buffer[15] = '/';
        buffer[16] = '/';
        buffer[17] = '/';
        buffer[18] = '/';
        buffer[19] = '/';
        buffer[20] = '/';
        buffer[21] = '/';
        buffer[22] = '/';
        buffer[23] = '/';
        buffer[24] = '/';
        buffer[25] = '/';
        buffer[26] = '/';
        buffer[27] = '/';
        buffer[28] = '/';
        buffer[29] = '/';
        buffer[30] = '/';
        buffer[31] = '/';
        buffer[32] = '/';
        buffer[33] = '/';
        buffer[34] = '/';
        buffer[35] = '/';
        buffer[36] = '/';
        buffer[37] = '/';
        buffer[38] = '/';
        buffer[39] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 32);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1347)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    
    @Test
    public void testNextNull13() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[40];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        buffer[17] = ' ';
        buffer[18] = ' ';
        buffer[19] = ' ';
        buffer[20] = ' ';
        buffer[21] = ' ';
        buffer[22] = ' ';
        buffer[23] = ' ';
        buffer[24] = ' ';
        buffer[25] = ' ';
        buffer[26] = ' ';
        buffer[27] = ' ';
        buffer[28] = ' ';
        buffer[29] = ' ';
        buffer[30] = ' ';
        buffer[31] = ' ';
        buffer[32] = ' ';
        buffer[33] = ' ';
        buffer[34] = ' ';
        buffer[35] = ' ';
        buffer[36] = ' ';
        buffer[37] = ' ';
        buffer[38] = ' ';
        buffer[39] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 32);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNull] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.nextNull(JsonReader.java:865) */
        jsonReader.nextNull();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method nextNull()
    
    @Test(expected = MalformedJsonException.class)
    public void testNextNull14() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.nextNull();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testNextNull15() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.nextNull();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testNextNull16() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.nextNull();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextNonWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextNonWhitespace(boolean)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.executesCondition {@code (c == '/'): False}
 * @utbot.executesCondition {@code (c == '#'): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextNonWhitespace_CNotEqualsChar() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '!'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        int actual = ((Integer) nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments));
        
        assertEquals(33, actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(2, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.executesCondition {@code (c == '/'): True}
 * @utbot.executesCondition {@code (p == l): False}
 * @utbot.invokes com.google.gson.stream.JsonReader#checkLenient()
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.activatesSwitch {@code switch(peek) case: default}
 *  */
    @Test
    public void testNextNonWhitespace_PNotEqualsL() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {'/', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -124);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        int actual = ((Integer) nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments));
        
        assertEquals(47, actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextNonWhitespace(boolean)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextNonWhitespace_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 129);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -130);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextNonWhitespace_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'@'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -253);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index -253 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.executesCondition {@code (c == ' '): False}
 * @utbot.executesCondition {@code (c == '\r'): False}
 * @utbot.executesCondition {@code (c == '\t'): False}
 * @utbot.executesCondition {@code (c == '/'): True}
 * @utbot.executesCondition {@code (p == l): False}
 * @utbot.invokes com.google.gson.stream.JsonReader#checkLenient()
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char peek = buffer[pos];
 *  */
    @Test
    public void testNextNonWhitespace_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {'/'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1355) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.executesCondition {@code (c == ' '): False}
 * @utbot.executesCondition {@code (c == '\r'): False}
 * @utbot.executesCondition {@code (c == '\t'): False}
 * @utbot.executesCondition {@code (c == '/'): False}
 * @utbot.executesCondition {@code (c == '#'): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#checkLenient()
 * @utbot.invokes com.google.gson.stream.JsonReader#skipToEndOfLine()
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: skipToEndOfLine();
 *  */
    @Test
    public void testNextNonWhitespace_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {' ', '#'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1414)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1386) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.iterates iterate the loop {@code } twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextNonWhitespace_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\n'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int c = buffer[p++];
 *  */
    @Test
    public void testNextNonWhitespace_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 254);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !fillBuffer(1)
 *  */
    @Test
    public void testNextNonWhitespace_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.executesCondition {@code (c == ' '): False}
 * @utbot.executesCondition {@code (c == '\r'): False}
 * @utbot.executesCondition {@code (c == '\t'): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !fillBuffer(1)
 *  */
    @Test
    public void testNextNonWhitespace_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\t', '\u0000', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method nextNonWhitespace(boolean)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.executesCondition {@code (c == '/'): True}
 * @utbot.executesCondition {@code (p == l): False}
 * @utbot.invokes com.google.gson.stream.JsonReader#checkLenient()
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} in: checkLenient();
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testNextNonWhitespace_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '/'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)}
 * @utbot.executesCondition {@code (c == '/'): False}
 * @utbot.executesCondition {@code (c == '#'): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#checkLenient()
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} in: checkLenient();
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testNextNonWhitespace_ThrowMalformedJsonException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '#'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextNonWhitespace(boolean)
    
    @Test
    public void testNextNonWhitespace1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[15];
        buffer[5] = '#';
        buffer[6] = '\r';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 5);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741825);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        int actual = ((Integer) nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments));
        
        assertEquals(0, actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(8, finalJsonReaderPos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextNonWhitespace(boolean)
    
    @Test
    public void testNextNonWhitespace2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2147483645);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2147483647 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1370) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace5() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\r';
        buffer[1] = '\r';
        buffer[2] = '\r';
        buffer[3] = '\r';
        buffer[4] = '\r';
        buffer[5] = '\r';
        buffer[6] = '\r';
        buffer[7] = '\r';
        buffer[8] = '\r';
        buffer[9] = '\r';
        buffer[10] = '\r';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace6() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[29];
        buffer[26] = '/';
        buffer[27] = '*';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 26);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 268435456);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 29]
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1432)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1360) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace7() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[15];
        buffer[13] = '/';
        buffer[14] = '*';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 13);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 268435456);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1432)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1360) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace8() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[39];
        buffer[37] = '/';
        buffer[38] = '*';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", Integer.MIN_VALUE);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483648 out of bounds for char[39]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipTo(JsonReader.java:1431)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1360) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace9() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {
            '\u0000', '#', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1386) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace10() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[37];
        buffer[34] = '/';
        buffer[35] = '/';
        buffer[36] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 34);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 37);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace11() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[37];
        buffer[34] = '/';
        buffer[35] = '/';
        buffer[36] = '\r';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 34);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 37);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace12() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[15];
        buffer[4] = '/';
        buffer[5] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 4);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 7);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1370) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace13() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[39];
        buffer[37] = '#';
        buffer[38] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 39);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace14() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[39];
        buffer[37] = '#';
        buffer[38] = '\r';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 39);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace15() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[40];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        buffer[11] = '\n';
        buffer[12] = '\n';
        buffer[13] = '\n';
        buffer[14] = '\n';
        buffer[15] = '\n';
        buffer[16] = '\n';
        buffer[17] = '\n';
        buffer[18] = '\n';
        buffer[19] = '\n';
        buffer[20] = '\n';
        buffer[21] = '\n';
        buffer[22] = '\n';
        buffer[23] = '\n';
        buffer[24] = '\n';
        buffer[25] = '\n';
        buffer[26] = '\n';
        buffer[27] = '\n';
        buffer[28] = '\n';
        buffer[29] = '\n';
        buffer[30] = '\n';
        buffer[31] = '\n';
        buffer[32] = '\n';
        buffer[33] = '\n';
        buffer[34] = '\n';
        buffer[35] = '\n';
        buffer[36] = '\n';
        buffer[37] = '\n';
        buffer[38] = '\n';
        buffer[39] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 32);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextNonWhitespace16() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {
            '#', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextNonWhitespace] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1386) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class booleanType = boolean.class;
        Method nextNonWhitespaceMethod = jsonReaderClazz.getDeclaredMethod("nextNonWhitespace", booleanType);
        nextNonWhitespaceMethod.setAccessible(true);
        java.lang.Object[] nextNonWhitespaceMethodArguments = new java.lang.Object[1];
        nextNonWhitespaceMethodArguments[0] = false;
        try {
            nextNonWhitespaceMethod.invoke(jsonReader, nextNonWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for nextNonWhitespace
    
    public void testNextNonWhitespace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.isLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLiteral(char)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '\f'}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCasef() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = '\f';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '\t'}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCaset() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = '\t';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '{'}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCase() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = '{';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '['}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCase_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = '[';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '}'}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCase_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = '}';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: ']'}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCase_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = ']';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '\r'}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCaser() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = '\r';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '\n'}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCasen() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = '\n';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: ':'}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCase_4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = ':';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: ','}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCase_5() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = ',';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.activatesSwitch {@code switch(c) case: ' '}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLiteral_SwitchCCase_6() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = ' ';
        boolean actual = ((Boolean) isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method isLiteral(char)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLiteral(char)}
 * @utbot.invokes com.google.gson.stream.JsonReader#checkLenient()
 * @utbot.activatesSwitch {@code switch(c) case: ';'}
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} in: checkLenient();
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testIsLiteral_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method isLiteralMethod = jsonReaderClazz.getDeclaredMethod("isLiteral", charType);
        isLiteralMethod.setAccessible(true);
        java.lang.Object[] isLiteralMethodArguments = new java.lang.Object[1];
        isLiteralMethodArguments[0] = ';';
        try {
            isLiteralMethod.invoke(jsonReader, isLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.endObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endObject()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): True}
 *  */
    @Test
    public void testEndObject_PEqualsPEEKED_END_OBJECT() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        java.lang.String[] pathNames = {null, null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        int[] pathIndices = {1};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        jsonReader.endObject();
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        java.lang.String[] jsonReaderPathNames = ((java.lang.String[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathNames"));
        String finalJsonReaderPathNames0 = ((String) get(jsonReaderPathNames, 0));
        java.lang.String[] jsonReaderPathNames1 = ((java.lang.String[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathNames"));
        String finalJsonReaderPathNames1 = ((String) get(jsonReaderPathNames1, 1));
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(1, finalJsonReaderStackSize);
        
        assertNull(finalJsonReaderPathNames0);
        
        assertNull(finalJsonReaderPathNames1);
        
        assertEquals(2, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endObject()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p == PEEKED_END_OBJECT
 *  */
    @Test
    public void testEndObject_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:403) */
        jsonReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathNames[stackSize] = null;
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        java.lang.String[] pathNames = {null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:399) */
        jsonReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathNames[stackSize] = null;
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        java.lang.String[] pathNames = {null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:399) */
        jsonReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: p = doPeek();
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {8};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.IllegalStateException: JsonReader is closed]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:545)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        java.lang.String[] pathNames = {null, null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        int[] pathIndices = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:400) */
        jsonReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        java.lang.String[] pathNames = {null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:400) */
        jsonReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathNames[stackSize] = null;
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:399) */
        jsonReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#endObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        java.lang.String[] pathNames = {null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:400) */
        jsonReader.endObject();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method endObject()
    
    @Test
    public void testEndObject1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -4 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1370)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:493)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject5() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject6() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1574)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject7() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject8() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        buffer[11] = '\t';
        buffer[12] = '\t';
        buffer[13] = '\t';
        buffer[14] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 3);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 4);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject9() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1354)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject10() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1385)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:493)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject11() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[40];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        buffer[17] = ' ';
        buffer[18] = ' ';
        buffer[19] = ' ';
        buffer[20] = ' ';
        buffer[21] = ' ';
        buffer[22] = ' ';
        buffer[23] = ' ';
        buffer[24] = ' ';
        buffer[25] = ' ';
        buffer[26] = ' ';
        buffer[27] = ' ';
        buffer[28] = ' ';
        buffer[29] = ' ';
        buffer[30] = ' ';
        buffer[31] = ' ';
        buffer[32] = ' ';
        buffer[33] = ' ';
        buffer[34] = ' ';
        buffer[35] = ' ';
        buffer[36] = ' ';
        buffer[37] = ' ';
        buffer[38] = ' ';
        buffer[39] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 15);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 16);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject12() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '/', '/', '/', '/', '/', '/', '/', '/',
            '/'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1347)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject13() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\r';
        buffer[1] = '\r';
        buffer[2] = '\r';
        buffer[3] = '\r';
        buffer[4] = '\r';
        buffer[5] = '\r';
        buffer[6] = '\r';
        buffer[7] = '\r';
        buffer[8] = '\r';
        buffer[9] = '\r';
        buffer[10] = '\r';
        buffer[11] = '\r';
        buffer[12] = '\r';
        buffer[13] = '\r';
        buffer[14] = '\r';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 3);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 4);
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:493)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject14() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1385)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject15() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1385)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject16() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[40];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        buffer[17] = ' ';
        buffer[18] = ' ';
        buffer[19] = ' ';
        buffer[20] = ' ';
        buffer[21] = ' ';
        buffer[22] = ' ';
        buffer[23] = ' ';
        buffer[24] = ' ';
        buffer[25] = ' ';
        buffer[26] = ' ';
        buffer[27] = ' ';
        buffer[28] = ' ';
        buffer[29] = ' ';
        buffer[30] = ' ';
        buffer[31] = ' ';
        buffer[32] = ' ';
        buffer[33] = ' ';
        buffer[34] = ' ';
        buffer[35] = ' ';
        buffer[36] = ' ';
        buffer[37] = ' ';
        buffer[38] = ' ';
        buffer[39] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 15);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 16);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject17() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:490)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject18() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '/', '/', '/', '/', '/', '/', '/', '/',
            '/'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1347)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:493)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject19() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '/', '/', '/', '/', '/', '/', '/', '/',
            '/'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1347)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    
    @Test
    public void testEndObject20() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        int[] stack = {
            4, 4, 4, 4, 4, 4, 4, 4,
            4
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:518)
            com.google.gson.stream.JsonReader.endObject(JsonReader.java:395) */
        jsonReader.endObject();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method endObject()
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject21() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject22() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject23() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject24() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject25() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject26() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject27() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject28() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testEndObject29() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.endObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.peekKeyword
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method peekKeyword()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.executesCondition {@code (c == 't'): False}
 * @utbot.executesCondition {@code (c == 'T'): False}
 * @utbot.executesCondition {@code (c == 'f'): False}
 * @utbot.executesCondition {@code (c == 'F'): False}
 * @utbot.executesCondition {@code (c == 'n'): False}
 * @utbot.executesCondition {@code (c == 'N'): False}
 *  */
    @Test
    public void testPeekKeyword_CNotEqualsN() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peekKeyword()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[pos];
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:598) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[pos];
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:598) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.executesCondition {@code (c == 't'): False}
 * @utbot.executesCondition {@code (c == 'T'): False}
 * @utbot.executesCondition {@code (c == 'f'): False}
 * @utbot.executesCondition {@code (c == 'F'): False}
 * @utbot.executesCondition {@code (c == 'n'): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: c = buffer[pos + i];
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'n'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:624) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.executesCondition {@code (c == 't'): False}
 * @utbot.executesCondition {@code (c == 'T'): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: c = buffer[pos + i];
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', 'T'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:624) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.executesCondition {@code (c == 't'): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: c = buffer[pos + i];
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', 't'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:624) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.executesCondition {@code (c == 't'): False}
 * @utbot.executesCondition {@code (c == 'T'): False}
 * @utbot.executesCondition {@code (c == 'f'): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: c = buffer[pos + i];
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', 'f'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:624) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.executesCondition {@code (c == 't'): False}
 * @utbot.executesCondition {@code (c == 'T'): False}
 * @utbot.executesCondition {@code (c == 'f'): False}
 * @utbot.executesCondition {@code (c == 'F'): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: c = buffer[pos + i];
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', 'F'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:624) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.executesCondition {@code (c == 't'): False}
 * @utbot.executesCondition {@code (c == 'T'): False}
 * @utbot.executesCondition {@code (c == 'f'): False}
 * @utbot.executesCondition {@code (c == 'F'): False}
 * @utbot.executesCondition {@code (c == 'n'): False}
 * @utbot.executesCondition {@code (c == 'N'): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: c = buffer[pos + i];
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', 'N'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:624) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.executesCondition {@code (c == 't'): False}
 * @utbot.executesCondition {@code (c == 'T'): False}
 * @utbot.executesCondition {@code (c == 'f'): False}
 * @utbot.executesCondition {@code (c == 'F'): False}
 * @utbot.executesCondition {@code (c == 'n'): True}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: pos + i >= limit && !fillBuffer(i + 1)
 *  */
    @Test
    public void testPeekKeyword_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[33];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        buffer[12] = ' ';
        buffer[13] = ' ';
        buffer[14] = ' ';
        buffer[15] = ' ';
        buffer[16] = ' ';
        buffer[17] = ' ';
        buffer[18] = ' ';
        buffer[19] = ' ';
        buffer[20] = ' ';
        buffer[21] = ' ';
        buffer[22] = ' ';
        buffer[23] = ' ';
        buffer[24] = ' ';
        buffer[25] = ' ';
        buffer[26] = ' ';
        buffer[27] = ' ';
        buffer[28] = ' ';
        buffer[29] = ' ';
        buffer[30] = ' ';
        buffer[31] = ' ';
        buffer[32] = 'n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 32);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekKeyword()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = buffer[pos];
 *  */
    @Test
    public void testPeekKeyword_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:598) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method peekKeyword()
    
    @Test
    public void testPeekKeyword1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', 'N', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testPeekKeyword2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', 'f', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testPeekKeyword3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', 'F', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testPeekKeyword4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', 'n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testPeekKeyword5() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[37] = 'T';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 39);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testPeekKeyword6() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', 't', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method peekKeyword()
    
    @Test
    public void testPeekKeyword7() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', 'F', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2147483645);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2147483646 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword8() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[37];
        buffer[36] = 't';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 36);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2147483646);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483650 out of bounds for char[37]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword9() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', 'n'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 6);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 7);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword10() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[0] = 'L';
        buffer[1] = 'L';
        buffer[2] = 'L';
        buffer[3] = 'L';
        buffer[4] = 'L';
        buffer[5] = 'L';
        buffer[6] = 'L';
        buffer[7] = 'L';
        buffer[8] = 'L';
        buffer[9] = 'L';
        buffer[10] = 'L';
        buffer[11] = 'L';
        buffer[12] = 'L';
        buffer[13] = 'L';
        buffer[14] = 'L';
        buffer[15] = 'L';
        buffer[16] = 'L';
        buffer[17] = 'L';
        buffer[18] = 'L';
        buffer[19] = 'L';
        buffer[20] = 'L';
        buffer[21] = 'L';
        buffer[22] = 'L';
        buffer[23] = 'L';
        buffer[24] = 'L';
        buffer[25] = 'L';
        buffer[26] = 'L';
        buffer[27] = 'L';
        buffer[28] = 'L';
        buffer[29] = 'L';
        buffer[30] = 'L';
        buffer[31] = 'L';
        buffer[32] = 'L';
        buffer[33] = 'L';
        buffer[34] = 'L';
        buffer[35] = 'L';
        buffer[36] = 'L';
        buffer[37] = 'n';
        buffer[38] = 'u';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 39);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword11() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {
            'N', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword12() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {
            'F', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword13() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {
            'f', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword14() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n',
            'n'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword15() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            't', 't', 't', 't', 't', 't', 't', 't',
            't'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword16() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            'T', 'T', 'T', 'T', 'T', 'T', 'T', 'T',
            'T'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword17() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f',
            'f'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekKeyword18() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F',
            'F'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekKeyword] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekKeyword(JsonReader.java:621) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekKeywordMethod = jsonReaderClazz.getDeclaredMethod("peekKeyword");
        peekKeywordMethod.setAccessible(true);
        java.lang.Object[] peekKeywordMethodArguments = new java.lang.Object[0];
        try {
            peekKeywordMethod.invoke(jsonReader, peekKeywordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for peekKeyword
    
    public void testPeekKeyword_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.peekNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method peekNumber()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (p + i == l): False}
    /// activate {@code switch(c) case: default}, invoke:
    ///     com.google.gson.stream.JsonReader#isLiteral(char) twice
    /// execute conditions:
    ///     {@code (last == NUMBER_CHAR_DIGIT): False},
    ///     {@code (last == NUMBER_CHAR_DIGIT): False},
    ///     {@code (last == NUMBER_CHAR_FRACTION_DIGIT): False},
    ///     {@code (last == NUMBER_CHAR_EXP_DIGIT): False}
    /// return from: {@code return PEEKED_NONE;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_CGreaterThan9() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '{'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_CLessThan0() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\f', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_CGreaterThan9_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {' ', ';'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_CLessThan0_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\n', '\u0000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_CGreaterThan9_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ']'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method peekNumber()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_IEqualsBufferLength() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_LastNotEqualsNUMBER_CHAR_EXP_E() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '+'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_SwitchCCasee() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', 'e'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_SwitchCCaseE() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', 'E'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_LastNotEqualsNUMBER_CHAR_DIGIT() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '.'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testPeekNumber_CLessThan0_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '!'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peekNumber()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[p + i];
 *  */
    @Test
    public void testPeekNumber_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'@'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -253);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -253 out of bounds for length 1]
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:668) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[p + i];
 *  */
    @Test
    public void testPeekNumber_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 65);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -66);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:668) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: i == buffer.length
 *  */
    @Test
    public void testPeekNumber_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:656) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = buffer[p + i];
 *  */
    @Test
    public void testPeekNumber_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 254);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:668) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !fillBuffer(i + 1)
 *  */
    @Test
    public void testPeekNumber_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:661) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method peekNumber()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peekNumber()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} when: !isLiteral(c)
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testPeekNumber_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '\\'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method peekNumber()
    
    @Test
    public void testPeekNumber1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[0] = '2';
        buffer[1] = '2';
        buffer[2] = '2';
        buffer[3] = '2';
        buffer[4] = '2';
        buffer[5] = '2';
        buffer[6] = '2';
        buffer[7] = '2';
        buffer[8] = '2';
        buffer[9] = '2';
        buffer[10] = '2';
        buffer[11] = '2';
        buffer[12] = '2';
        buffer[13] = '2';
        buffer[14] = '2';
        buffer[15] = '2';
        buffer[16] = '2';
        buffer[17] = '2';
        buffer[18] = '2';
        buffer[19] = '2';
        buffer[20] = '2';
        buffer[21] = '2';
        buffer[22] = '2';
        buffer[23] = '2';
        buffer[24] = '2';
        buffer[25] = '2';
        buffer[26] = '2';
        buffer[27] = '2';
        buffer[28] = '2';
        buffer[29] = '2';
        buffer[30] = '2';
        buffer[31] = '2';
        buffer[32] = '2';
        buffer[33] = '2';
        buffer[34] = '2';
        buffer[35] = '2';
        buffer[36] = '2';
        buffer[37] = '2';
        buffer[38] = 'E';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", Integer.MIN_VALUE);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:668) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekNumber2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[0] = '2';
        buffer[1] = '2';
        buffer[2] = '2';
        buffer[3] = '2';
        buffer[4] = '2';
        buffer[5] = '2';
        buffer[6] = '2';
        buffer[7] = '2';
        buffer[8] = '2';
        buffer[9] = '2';
        buffer[10] = '2';
        buffer[11] = '2';
        buffer[12] = '2';
        buffer[13] = '2';
        buffer[14] = '2';
        buffer[15] = '2';
        buffer[16] = '2';
        buffer[17] = '2';
        buffer[18] = '2';
        buffer[19] = '2';
        buffer[20] = '2';
        buffer[21] = '2';
        buffer[22] = '2';
        buffer[23] = '2';
        buffer[24] = '2';
        buffer[25] = '2';
        buffer[26] = '2';
        buffer[27] = '2';
        buffer[28] = '2';
        buffer[29] = '2';
        buffer[30] = '2';
        buffer[31] = '2';
        buffer[32] = '2';
        buffer[33] = '2';
        buffer[34] = '2';
        buffer[35] = '2';
        buffer[36] = '2';
        buffer[37] = '2';
        buffer[38] = '.';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", Integer.MIN_VALUE);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:668) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekNumber3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[0] = '2';
        buffer[1] = '2';
        buffer[2] = '2';
        buffer[3] = '2';
        buffer[4] = '2';
        buffer[5] = '2';
        buffer[6] = '2';
        buffer[7] = '2';
        buffer[8] = '2';
        buffer[9] = '2';
        buffer[10] = '2';
        buffer[11] = '2';
        buffer[12] = '2';
        buffer[13] = '2';
        buffer[14] = '2';
        buffer[15] = '2';
        buffer[16] = '2';
        buffer[17] = '2';
        buffer[18] = '2';
        buffer[19] = '2';
        buffer[20] = '2';
        buffer[21] = '2';
        buffer[22] = '2';
        buffer[23] = '2';
        buffer[24] = '2';
        buffer[25] = '2';
        buffer[26] = '2';
        buffer[27] = '2';
        buffer[28] = '2';
        buffer[29] = '2';
        buffer[30] = '2';
        buffer[31] = '2';
        buffer[32] = '2';
        buffer[33] = '2';
        buffer[34] = '2';
        buffer[35] = '2';
        buffer[36] = '2';
        buffer[37] = '2';
        buffer[38] = 'e';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", Integer.MIN_VALUE);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:668) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekNumber4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '2';
        buffer[1] = '2';
        buffer[2] = '2';
        buffer[3] = '2';
        buffer[4] = '2';
        buffer[5] = '2';
        buffer[6] = '2';
        buffer[7] = '2';
        buffer[8] = '2';
        buffer[9] = '2';
        buffer[10] = '2';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:668) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPeekNumber5() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '2', '2', '2', '2', '2', '2', '2', '2',
            '2', '2'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peekNumber] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.peekNumber(JsonReader.java:661) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method peekNumber()
    
    @Test(expected = MalformedJsonException.class)
    public void testPeekNumber6() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[2] = '=';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testPeekNumber7() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[2] = ';';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testPeekNumber8() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[2] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method peekNumberMethod = jsonReaderClazz.getDeclaredMethod("peekNumber");
        peekNumberMethod.setAccessible(true);
        java.lang.Object[] peekNumberMethodArguments = new java.lang.Object[0];
        try {
            peekNumberMethod.invoke(jsonReader, peekNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for peekNumber
    
    public void testPeekNumber_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.beginObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method beginObject()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#push(int)
 *  */
    @Test
    public void testBeginObject_PEqualsPEEKED_BEGIN_OBJECT() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 1;
        int[] stack = {0, 0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        
        jsonReader.beginObject();
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderStack = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stack"));
        int finalJsonReaderStack0 = ((Integer) get(jsonReaderStack, 0));
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(3, finalJsonReaderStack0);
        
        assertEquals(1, finalJsonReaderStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beginObject()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: p == PEEKED_BEGIN_OBJECT
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.IllegalStateException: Expected BEGIN_OBJECT but was END_OBJECT at line 1 column 1 path $]
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:384) */
        jsonReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testBeginObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginObject()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#push(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: push(JsonScope.EMPTY_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 1;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.push(JsonReader.java:1263)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:381) */
        jsonReader.beginObject();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method beginObject()
    
    @Test
    public void testBeginObject1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {
            '/', '/', '/', '/', '/', '/', '/', '/',
            '/'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", Integer.MIN_VALUE);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483648 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1370)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:537)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -4 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1370)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -3 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1386)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject5() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1574)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject6() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject7() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject8() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject9() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:537)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject10() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject11() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:537)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject12() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 1;
        int[] stack = {0, 0, 0, 0, 0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3586)
            com.google.gson.stream.JsonReader.push(JsonReader.java:1266)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:381) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject13() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '/', '/', '/', '/', '/', '/', '/', '/',
            '/'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1347)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:537)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject14() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1354)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject15() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1354)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject16() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[40];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        buffer[11] = '\n';
        buffer[12] = '\n';
        buffer[13] = '\n';
        buffer[14] = '\n';
        buffer[15] = '\n';
        buffer[16] = '\n';
        buffer[17] = '\n';
        buffer[18] = '\n';
        buffer[19] = '\n';
        buffer[20] = '\n';
        buffer[21] = '\n';
        buffer[22] = '\n';
        buffer[23] = '\n';
        buffer[24] = '\n';
        buffer[25] = '\n';
        buffer[26] = '\n';
        buffer[27] = '\n';
        buffer[28] = '\n';
        buffer[29] = '\n';
        buffer[30] = '\n';
        buffer[31] = '\n';
        buffer[32] = '\n';
        buffer[33] = '\n';
        buffer[34] = '\n';
        buffer[35] = '\n';
        buffer[36] = '\n';
        buffer[37] = '\n';
        buffer[38] = '\n';
        buffer[39] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 32);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject17() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[2] = ';';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:486)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject18() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1385)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject19() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[40];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        buffer[11] = '/';
        buffer[12] = '/';
        buffer[13] = '/';
        buffer[14] = '/';
        buffer[15] = '/';
        buffer[16] = '/';
        buffer[17] = '/';
        buffer[18] = '/';
        buffer[19] = '/';
        buffer[20] = '/';
        buffer[21] = '/';
        buffer[22] = '/';
        buffer[23] = '/';
        buffer[24] = '/';
        buffer[25] = '/';
        buffer[26] = '/';
        buffer[27] = '/';
        buffer[28] = '/';
        buffer[29] = '/';
        buffer[30] = '/';
        buffer[31] = '/';
        buffer[32] = '/';
        buffer[33] = '/';
        buffer[34] = '/';
        buffer[35] = '/';
        buffer[36] = '/';
        buffer[37] = '/';
        buffer[38] = '/';
        buffer[39] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 32);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1347)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject20() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject21() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[40];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        buffer[11] = '\t';
        buffer[12] = '\t';
        buffer[13] = '\t';
        buffer[14] = '\t';
        buffer[15] = '\t';
        buffer[16] = '\t';
        buffer[17] = '\t';
        buffer[18] = '\t';
        buffer[19] = '\t';
        buffer[20] = '\t';
        buffer[21] = '\t';
        buffer[22] = '\t';
        buffer[23] = '\t';
        buffer[24] = '\t';
        buffer[25] = '\t';
        buffer[26] = '\t';
        buffer[27] = '\t';
        buffer[28] = '\t';
        buffer[29] = '\t';
        buffer[30] = '\t';
        buffer[31] = '\t';
        buffer[32] = '\t';
        buffer[33] = '\t';
        buffer[34] = '\t';
        buffer[35] = '\t';
        buffer[36] = '\t';
        buffer[37] = '\t';
        buffer[38] = '\t';
        buffer[39] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 31);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 32);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject22() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject23() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '/', '/', '/', '/', '/', '/', '/', '/',
            '/'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1347)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    
    @Test
    public void testBeginObject24() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.beginObject(JsonReader.java:378) */
        jsonReader.beginObject();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method beginObject()
    
    @Test(expected = MalformedJsonException.class)
    public void testBeginObject25() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.beginObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testBeginObject26() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.beginObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testBeginObject27() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.beginObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testBeginObject28() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.beginObject();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testBeginObject29() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.beginObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextName()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextName()}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED_NAME): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p == PEEKED_DOUBLE_QUOTED_NAME
 *  */
    @Test
    public void testNextName_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:788) */
        jsonReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextName()}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED_NAME): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#nextUnquotedValue()
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result = nextUnquotedValue();
 *  */
    @Test
    public void testNextName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000', '\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1073741823);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741824);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1046)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:782) */
        jsonReader.nextName();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextName()
    
    @Test
    public void testNextName1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2147483647);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2147483647 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1070)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:782) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\r';
        buffer[1] = '\r';
        buffer[2] = '\r';
        buffer[3] = '\r';
        buffer[4] = '\r';
        buffer[5] = '\r';
        buffer[6] = '\r';
        buffer[7] = '\r';
        buffer[8] = '\r';
        buffer[9] = '\r';
        buffer[10] = '\r';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName5() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName6() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:493)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName7() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName8() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName9() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName10() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = ' ';
        buffer[1] = ' ';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName11() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 12;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:1029)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:784) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName12() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {
            '#', '#', '#', '#', '#', '#', '#', '#',
            '#'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName13() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\n', '\n', '\n', '\n', '\n', '\n', '\n', '\n',
            '\n'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 13;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:1029)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:786) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName14() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\n', '\n', '\n', '\n', '\n', '\n', '\n', '\n',
            '\n'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName15() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '{', '{', '{', '{', '{', '{', '{', '{',
            '{'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName16() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\f', '\f', '\f', '\f', '\f', '\f', '\f', '\f',
            '\f'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName17() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ':', ':', ':', ':', ':', ':', ':', ':',
            ':'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName18() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '}', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName19() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName20() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1070)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:782) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName21() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName22() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ',', ',', ',', ',', ',', ',', ',', ',',
            ','
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:791) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName23() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1069)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:782) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName24() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1046)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:782) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName25() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:475)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName26() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 13;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:994)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:786) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName27() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2147483647);
        jsonReader.peeked = 12;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:1027)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:784) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName28() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:507)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    
    @Test
    public void testNextName29() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:537)
            com.google.gson.stream.JsonReader.nextName(JsonReader.java:778) */
        jsonReader.nextName();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method nextName()
    
    @Test(expected = MalformedJsonException.class)
    public void testNextName30() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '#', '#', '#', '#', '#', '#', '#', '#',
            '#'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        jsonReader.nextName();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testNextName31() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        jsonReader.nextName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.beginArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method beginArray()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#push(int)
 *  */
    @Test
    public void testBeginArray_PEqualsPEEKED_BEGIN_ARRAY() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 3;
        int[] stack = {0, 0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255, -255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        jsonReader.beginArray();
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderStack = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stack"));
        int finalJsonReaderStack1 = ((Integer) get(jsonReaderStack, 1));
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices1 = ((Integer) get(jsonReaderPathIndices, 1));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(1, finalJsonReaderStack1);
        
        assertEquals(2, finalJsonReaderStackSize);
        
        assertEquals(0, finalJsonReaderPathIndices1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beginArray()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p == PEEKED_BEGIN_ARRAY
 *  */
    @Test
    public void testBeginArray_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginArray] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.beginArray(JsonReader.java:349) */
        jsonReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: push(JsonScope.EMPTY_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 3;
        int[] stack = {0, 0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2147483645);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483645 out of bounds for length 2]
            com.google.gson.stream.JsonReader.push(JsonReader.java:1269)
            com.google.gson.stream.JsonReader.beginArray(JsonReader.java:345) */
        jsonReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.beginArray(JsonReader.java:342) */
        jsonReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: push(JsonScope.EMPTY_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 3;
        int[] stack = {0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", Integer.MIN_VALUE);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.google.gson.stream.JsonReader.push(JsonReader.java:1269)
            com.google.gson.stream.JsonReader.beginArray(JsonReader.java:345) */
        jsonReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1] = 0;
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 3;
        int[] stack = {0, 0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.beginArray(JsonReader.java:346) */
        jsonReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: push(JsonScope.EMPTY_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 3;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.push(JsonReader.java:1263)
            com.google.gson.stream.JsonReader.beginArray(JsonReader.java:345) */
        jsonReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#beginArray()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1] = 0;
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 3;
        int[] stack = {0, 0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.beginArray(JsonReader.java:346) */
        jsonReader.beginArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.skipValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipValue()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipValue()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.executesCondition {@code (count != 0): False}
 *  */
    @Test
    public void testSkipValue_CountEqualsZero() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        java.lang.String[] pathNames = {null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        jsonReader.skipValue();
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(-254, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipValue()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipValue()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipValue()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.executesCondition {@code (count != 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipValue()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.executesCondition {@code (count != 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipValue()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#skipQuotedValue(char)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: skipQuotedValue('"');
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000', '\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1073741823);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741824);
        jsonReader.peeked = 9;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1102)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1251) */
        jsonReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipValue()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.executesCondition {@code (count != 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathNames[stackSize - 1] = "null";
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        java.lang.String[] pathNames = {null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        int[] pathIndices = {-255, -255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1259) */
        jsonReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipValue()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#push(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: push(JsonScope.EMPTY_OBJECT);
 *  */
    @Test
    public void testSkipValue_ThrowNullPointerException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 1;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.push(JsonReader.java:1263)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1238) */
        jsonReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipValue()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_BEGIN_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_ARRAY): False}
 * @utbot.executesCondition {@code (p == PEEKED_END_OBJECT): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED_NAME): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.executesCondition {@code (count != 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathNames[stackSize - 1] = "null";
 *  */
    @Test
    public void testSkipValue_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1259) */
        jsonReader.skipValue();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipValue()
    
    @Test
    public void testSkipValue1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\t';
        buffer[1] = '\t';
        buffer[2] = '\t';
        buffer[3] = '\t';
        buffer[4] = '\t';
        buffer[5] = '\t';
        buffer[6] = '\t';
        buffer[7] = '\t';
        buffer[8] = '\t';
        buffer[9] = '\t';
        buffer[10] = '\t';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\n';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            6, 6, 6, 6, 6, 6, 6, 6,
            6
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1574)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:533)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipUnquotedValue(JsonReader.java:1148)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1247) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue5() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 4;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue6() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue7() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ':', ':', ':', ':', ':', ':', ':', ':',
            ':'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue8() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 3;
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue9() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 1;
        int[] stack = {0, 0, 0, 0, 0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3586)
            com.google.gson.stream.JsonReader.push(JsonReader.java:1266)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1238) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue10() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ',', ',', ',', ',', ',', ',', ',', ',',
            ','
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue11() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\n', '\n', '\n', '\n', '\n', '\n', '\n', '\n',
            '\n'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue12() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '{', '{', '{', '{', '{', '{', '{', '{',
            '{'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue13() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '[', '[', '[', '[', '[', '[', '[', '[',
            '['
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue14() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ']', ']', ']', ']', ']', ']', ']', ']',
            ']'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue15() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '}', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue16() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1258) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue17() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 10;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipUnquotedValue(JsonReader.java:1125)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1247) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue18() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 12;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1102)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1249) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue19() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:507)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue20() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '/';
        buffer[1] = '/';
        buffer[2] = '/';
        buffer[3] = '/';
        buffer[4] = '/';
        buffer[5] = '/';
        buffer[6] = '/';
        buffer[7] = '/';
        buffer[8] = '/';
        buffer[9] = '/';
        buffer[10] = '/';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1354)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    
    @Test
    public void testSkipValue21() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        int[] stack = {
            1, 1, 1, 1, 1, 1, 1, 1,
            1
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548)
            com.google.gson.stream.JsonReader.skipValue(JsonReader.java:1231) */
        jsonReader.skipValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method skipValue()
    
    @Test(expected = MalformedJsonException.class)
    public void testSkipValue22() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\',
            '\\'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        jsonReader.skipValue();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testSkipValue23() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '/', '/', '/', '/', '/', '/', '/', '/',
            '/'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        jsonReader.skipValue();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testSkipValue24() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '#', '#', '#', '#', '#', '#', '#', '#',
            '#'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        jsonReader.skipValue();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testSkipValue25() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ';', ';', ';', ';', ';', ';', ';', ';',
            ';'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        jsonReader.skipValue();
    }
    
    @Test(expected = MalformedJsonException.class)
    public void testSkipValue26() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '=', '=', '=', '=', '=', '=', '=', '=',
            '='
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        jsonReader.peeked = 14;
        
        jsonReader.skipValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.skipQuotedValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipQuotedValue(char)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code while(p < l)} once
 *  */
    @Test
    public void testSkipQuotedValue_CEqualsQuote() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = ' ';
        skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipQuotedValue(char)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code while(p < l)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testSkipQuotedValue_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1102) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = ' ';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code while(p < l)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testSkipQuotedValue_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1102) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = ' ';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code while(p < l)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: readEscapeCharacter();
 *  */
    @Test
    public void testSkipQuotedValue_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\\', 'u'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 6);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1511)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = ' ';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code while(p < l)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = buffer[p++];
 *  */
    @Test
    public void testSkipQuotedValue_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\\', '/'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1102) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = ' ';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipQuotedValue(char)}
 * @utbot.iterates iterate the loop {@code while(p < l)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int c = buffer[p++];
 *  */
    @Test
    public void testSkipQuotedValue_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1102) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = ' ';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#skipQuotedValue(char)}
 * @utbot.invokes com.google.gson.stream.JsonReader#fillBuffer(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fillBuffer(1)
 *  */
    @Test
    public void testSkipQuotedValue_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 129);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 126);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1117) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = ' ';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipQuotedValue(char)
    
    @Test
    public void testSkipQuotedValue1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = '\\';
        buffer[15] = '\\';
        buffer[16] = '\\';
        buffer[17] = '\\';
        buffer[18] = '\\';
        buffer[19] = '\\';
        buffer[20] = '\\';
        buffer[21] = '\\';
        buffer[22] = '\\';
        buffer[23] = '\\';
        buffer[24] = '\\';
        buffer[25] = '\\';
        buffer[26] = '\\';
        buffer[27] = '\\';
        buffer[28] = '\\';
        buffer[29] = '\\';
        buffer[30] = '\\';
        buffer[31] = '\\';
        buffer[32] = '\\';
        buffer[33] = '\\';
        buffer[34] = '\\';
        buffer[35] = '\\';
        buffer[36] = '\\';
        buffer[37] = '\\';
        buffer[38] = 'r';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1102) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[37];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = '\\';
        buffer[15] = '\\';
        buffer[16] = '\\';
        buffer[17] = '\\';
        buffer[18] = '\\';
        buffer[19] = '\\';
        buffer[20] = '\\';
        buffer[21] = '\\';
        buffer[22] = '\\';
        buffer[23] = '\\';
        buffer[24] = '\\';
        buffer[25] = '\\';
        buffer[26] = '\\';
        buffer[27] = '\\';
        buffer[28] = '\\';
        buffer[29] = '\\';
        buffer[30] = '\\';
        buffer[31] = '\\';
        buffer[32] = '\\';
        buffer[33] = '\\';
        buffer[34] = '\\';
        buffer[35] = 'u';
        buffer[36] = 'C';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 34);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1511)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = 'u';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 13);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 16);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 16 out of bounds for char[15]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1505)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = '\\';
        buffer[15] = '\\';
        buffer[16] = '\\';
        buffer[17] = '\\';
        buffer[18] = '\\';
        buffer[19] = '\\';
        buffer[20] = '\\';
        buffer[21] = '\\';
        buffer[22] = '\\';
        buffer[23] = '\\';
        buffer[24] = '\\';
        buffer[25] = '\\';
        buffer[26] = '\\';
        buffer[27] = '\\';
        buffer[28] = '\\';
        buffer[29] = '\\';
        buffer[30] = '\\';
        buffer[31] = '\\';
        buffer[32] = '\\';
        buffer[33] = '\\';
        buffer[34] = '\\';
        buffer[35] = '\\';
        buffer[36] = '\\';
        buffer[37] = '\\';
        buffer[38] = 't';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1102) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue5() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\',
            '\\'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1502)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue6() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[37];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = '\\';
        buffer[15] = '\\';
        buffer[16] = '\\';
        buffer[17] = '\\';
        buffer[18] = '\\';
        buffer[19] = '\\';
        buffer[20] = '\\';
        buffer[21] = '\\';
        buffer[22] = '\\';
        buffer[23] = '\\';
        buffer[24] = '\\';
        buffer[25] = '\\';
        buffer[26] = '\\';
        buffer[27] = '\\';
        buffer[28] = '\\';
        buffer[29] = '\\';
        buffer[30] = '\\';
        buffer[31] = '\\';
        buffer[32] = '\\';
        buffer[33] = '\\';
        buffer[34] = '\\';
        buffer[35] = 'u';
        buffer[36] = 'c';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 34);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1511)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue7() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[37];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = '\\';
        buffer[15] = '\\';
        buffer[16] = '\\';
        buffer[17] = '\\';
        buffer[18] = '\\';
        buffer[19] = '\\';
        buffer[20] = '\\';
        buffer[21] = '\\';
        buffer[22] = '\\';
        buffer[23] = '\\';
        buffer[24] = '\\';
        buffer[25] = '\\';
        buffer[26] = '\\';
        buffer[27] = '\\';
        buffer[28] = '\\';
        buffer[29] = '\\';
        buffer[30] = '\\';
        buffer[31] = '\\';
        buffer[32] = '\\';
        buffer[33] = '\\';
        buffer[34] = '\\';
        buffer[35] = 'u';
        buffer[36] = '2';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 34);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1511)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue8() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = 'n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 13);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 15);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1117) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue9() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = '\"';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 13);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 15);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1117) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue10() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = 'r';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 13);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 15);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1117) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue11() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = 'b';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 13);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 15);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1117) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue12() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001', '\u0001',
            '\u0001'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1117) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue13() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = 'u';
        buffer[10] = '\\';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 8);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 10);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1505)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue14() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1117) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue15() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\',
            '\\'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1498)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue16() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\n', '\n', '\n', '\n', '\n', '\n', '\n', '\n',
            '\n'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1117) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSkipQuotedValue17() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = new char[15];
        buffer[0] = '\\';
        buffer[1] = '\\';
        buffer[2] = '\\';
        buffer[3] = '\\';
        buffer[4] = '\\';
        buffer[5] = '\\';
        buffer[6] = '\\';
        buffer[7] = '\\';
        buffer[8] = '\\';
        buffer[9] = '\\';
        buffer[10] = '\\';
        buffer[11] = '\\';
        buffer[12] = '\\';
        buffer[13] = '\\';
        buffer[14] = 'u';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 13);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 15);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.skipQuotedValue] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1505)
            com.google.gson.stream.JsonReader.skipQuotedValue(JsonReader.java:1108) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class charType = char.class;
        Method skipQuotedValueMethod = jsonReaderClazz.getDeclaredMethod("skipQuotedValue", charType);
        skipQuotedValueMethod.setAccessible(true);
        java.lang.Object[] skipQuotedValueMethodArguments = new java.lang.Object[1];
        skipQuotedValueMethodArguments[0] = '\u0000';
        try {
            skipQuotedValueMethod.invoke(jsonReader, skipQuotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for skipQuotedValue
    
    public void testSkipQuotedValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.doPeek
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doPeek()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int peekStack = stack[stackSize - 1];
 *  */
    @Test
    public void testDoPeek_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255, -255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.doPeek] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 2]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461) */
        jsonReader.doPeek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int peekStack = stack[stackSize - 1];
 *  */
    @Test
    public void testDoPeek_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.doPeek] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461) */
        jsonReader.doPeek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_ARRAY): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_ARRAY): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.DANGLING_NAME): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_DOCUMENT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_DOCUMENT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.CLOSED): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: peekStack == JsonScope.CLOSED
 *  */
    @Test
    public void testDoPeek_ThrowIllegalStateException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {8};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.doPeek] produces [java.lang.IllegalStateException: JsonReader is closed]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:545) */
        jsonReader.doPeek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_ARRAY): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_ARRAY): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.DANGLING_NAME): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_DOCUMENT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_DOCUMENT): True}
 * @utbot.invokes com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = nextNonWhitespace(false);
 *  */
    @Test
    public void testDoPeek_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1073741824);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1073741825);
        int[] stack = {7};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.doPeek] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:537) */
        jsonReader.doPeek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_ARRAY): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_ARRAY): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int c = nextNonWhitespace(true);
 *  */
    @Test
    public void testDoPeek_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 129);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -130);
        int[] stack = {2};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.doPeek] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466) */
        jsonReader.doPeek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int peekStack = stack[stackSize - 1];
 *  */
    @Test
    public void testDoPeek_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.doPeek] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461) */
        jsonReader.doPeek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_ARRAY): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int c = nextNonWhitespace(true);
 *  */
    @Test
    public void testDoPeek_ThrowNullPointerException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        int[] stack = {2};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.doPeek] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466) */
        jsonReader.doPeek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_ARRAY): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_ARRAY): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.DANGLING_NAME): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.EMPTY_DOCUMENT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.NONEMPTY_DOCUMENT): False}
 * @utbot.executesCondition {@code (peekStack == JsonScope.CLOSED): False}
 * @utbot.invokes com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int c = nextNonWhitespace(true);
 *  */
    @Test
    public void testDoPeek_ThrowNullPointerException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        int[] stack = {-255, -255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.doPeek] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:548) */
        jsonReader.doPeek();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextUnquotedValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextUnquotedValue()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNextUnquotedValue_SwitchBufferposiCasen() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\n', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method nextUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextUnquotedValue");
        nextUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] nextUnquotedValueMethodArguments = new java.lang.Object[0];
        String actual = ((String) nextUnquotedValueMethod.invoke(jsonReader, nextUnquotedValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNextUnquotedValue_SwitchBufferposiCase() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[12];
        buffer[0] = ' ';
        buffer[1] = ']';
        buffer[2] = ' ';
        buffer[3] = ' ';
        buffer[4] = ' ';
        buffer[5] = ' ';
        buffer[6] = ' ';
        buffer[7] = ' ';
        buffer[8] = ' ';
        buffer[9] = ' ';
        buffer[10] = ' ';
        buffer[11] = ' ';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method nextUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextUnquotedValue");
        nextUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] nextUnquotedValueMethodArguments = new java.lang.Object[0];
        String actual = ((String) nextUnquotedValueMethod.invoke(jsonReader, nextUnquotedValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNextUnquotedValue_SwitchBufferposiCasef() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\f', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method nextUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextUnquotedValue");
        nextUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] nextUnquotedValueMethodArguments = new java.lang.Object[0];
        String actual = ((String) nextUnquotedValueMethod.invoke(jsonReader, nextUnquotedValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextUnquotedValue()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(buffer[pos + i])
 *  */
    @Test
    public void testNextUnquotedValue_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextUnquotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1046) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method nextUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextUnquotedValue");
        nextUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] nextUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            nextUnquotedValueMethod.invoke(jsonReader, nextUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(buffer[pos + i])
 *  */
    @Test
    public void testNextUnquotedValue_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextUnquotedValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1046) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method nextUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextUnquotedValue");
        nextUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] nextUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            nextUnquotedValueMethod.invoke(jsonReader, nextUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(buffer[pos + i])
 *  */
    @Test
    public void testNextUnquotedValue_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextUnquotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1046) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method nextUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextUnquotedValue");
        nextUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] nextUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            nextUnquotedValueMethod.invoke(jsonReader, nextUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: i < buffer.length
 *  */
    @Test
    public void testNextUnquotedValue_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextUnquotedValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextUnquotedValue(JsonReader.java:1069) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method nextUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextUnquotedValue");
        nextUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] nextUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            nextUnquotedValueMethod.invoke(jsonReader, nextUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method nextUnquotedValue()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextUnquotedValue()}
 * @utbot.iterates iterate the loop {@code for(; pos + i < limit; i++)} once
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} in: checkLenient();
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testNextUnquotedValue_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'='};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method nextUnquotedValueMethod = jsonReaderClazz.getDeclaredMethod("nextUnquotedValue");
        nextUnquotedValueMethod.setAccessible(true);
        java.lang.Object[] nextUnquotedValueMethodArguments = new java.lang.Object[0];
        try {
            nextUnquotedValueMethod.invoke(jsonReader, nextUnquotedValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextString()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextString()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_BUFFERED): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNextString_PEqualsPEEKED_BUFFERED() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 11;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        String actual = jsonReader.nextString();
        
        assertNull(actual);
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(-254, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextString()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextString()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_BUFFERED): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p == PEEKED_NUMBER
 *  */
    @Test
    public void testNextString_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextString] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:824) */
        jsonReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextString()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testNextString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:806) */
        jsonReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextString()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testNextString_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:806) */
        jsonReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextString()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_BUFFERED): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextString_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 11;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:827) */
        jsonReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextString()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_BUFFERED): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextString_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 11;
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:827) */
        jsonReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextString()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_BUFFERED): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextString_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 11;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextString] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:827) */
        jsonReader.nextString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.consumeNonExecutePrefix
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeNonExecutePrefix()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#consumeNonExecutePrefix()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: nextNonWhitespace(true);
 *  */
    @Test
    public void testConsumeNonExecutePrefix_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.consumeNonExecutePrefix] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method consumeNonExecutePrefixMethod = jsonReaderClazz.getDeclaredMethod("consumeNonExecutePrefix");
        consumeNonExecutePrefixMethod.setAccessible(true);
        java.lang.Object[] consumeNonExecutePrefixMethodArguments = new java.lang.Object[0];
        try {
            consumeNonExecutePrefixMethod.invoke(jsonReader, consumeNonExecutePrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#consumeNonExecutePrefix()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: nextNonWhitespace(true);
 *  */
    @Test
    public void testConsumeNonExecutePrefix_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 129);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -130);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.consumeNonExecutePrefix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method consumeNonExecutePrefixMethod = jsonReaderClazz.getDeclaredMethod("consumeNonExecutePrefix");
        consumeNonExecutePrefixMethod.setAccessible(true);
        java.lang.Object[] consumeNonExecutePrefixMethodArguments = new java.lang.Object[0];
        try {
            consumeNonExecutePrefixMethod.invoke(jsonReader, consumeNonExecutePrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#consumeNonExecutePrefix()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: nextNonWhitespace(true);
 *  */
    @Test
    public void testConsumeNonExecutePrefix_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {' ', '#'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 3);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.consumeNonExecutePrefix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1414)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1386)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method consumeNonExecutePrefixMethod = jsonReaderClazz.getDeclaredMethod("consumeNonExecutePrefix");
        consumeNonExecutePrefixMethod.setAccessible(true);
        java.lang.Object[] consumeNonExecutePrefixMethodArguments = new java.lang.Object[0];
        try {
            consumeNonExecutePrefixMethod.invoke(jsonReader, consumeNonExecutePrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#consumeNonExecutePrefix()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: nextNonWhitespace(true);
 *  */
    @Test
    public void testConsumeNonExecutePrefix_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = {'/'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.consumeNonExecutePrefix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1355)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method consumeNonExecutePrefixMethod = jsonReaderClazz.getDeclaredMethod("consumeNonExecutePrefix");
        consumeNonExecutePrefixMethod.setAccessible(true);
        java.lang.Object[] consumeNonExecutePrefixMethodArguments = new java.lang.Object[0];
        try {
            consumeNonExecutePrefixMethod.invoke(jsonReader, consumeNonExecutePrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#consumeNonExecutePrefix()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nextNonWhitespace(true);
 *  */
    @Test
    public void testConsumeNonExecutePrefix_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 254);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.consumeNonExecutePrefix] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method consumeNonExecutePrefixMethod = jsonReaderClazz.getDeclaredMethod("consumeNonExecutePrefix");
        consumeNonExecutePrefixMethod.setAccessible(true);
        java.lang.Object[] consumeNonExecutePrefixMethodArguments = new java.lang.Object[0];
        try {
            consumeNonExecutePrefixMethod.invoke(jsonReader, consumeNonExecutePrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#consumeNonExecutePrefix()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nextNonWhitespace(true);
 *  */
    @Test
    public void testConsumeNonExecutePrefix_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\n', '\u0000', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.consumeNonExecutePrefix] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method consumeNonExecutePrefixMethod = jsonReaderClazz.getDeclaredMethod("consumeNonExecutePrefix");
        consumeNonExecutePrefixMethod.setAccessible(true);
        java.lang.Object[] consumeNonExecutePrefixMethodArguments = new java.lang.Object[0];
        try {
            consumeNonExecutePrefixMethod.invoke(jsonReader, consumeNonExecutePrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#consumeNonExecutePrefix()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nextNonWhitespace(true);
 *  */
    @Test
    public void testConsumeNonExecutePrefix_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            '\u0000', '\t', '\u0000', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.consumeNonExecutePrefix] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.consumeNonExecutePrefix(JsonReader.java:1570) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method consumeNonExecutePrefixMethod = jsonReaderClazz.getDeclaredMethod("consumeNonExecutePrefix");
        consumeNonExecutePrefixMethod.setAccessible(true);
        java.lang.Object[] consumeNonExecutePrefixMethodArguments = new java.lang.Object[0];
        try {
            consumeNonExecutePrefixMethod.invoke(jsonReader, consumeNonExecutePrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method consumeNonExecutePrefix()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#consumeNonExecutePrefix()}
 * @utbot.invokes com.google.gson.stream.JsonReader#nextNonWhitespace(boolean)
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} in: nextNonWhitespace(true);
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testConsumeNonExecutePrefix_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', '#'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method consumeNonExecutePrefixMethod = jsonReaderClazz.getDeclaredMethod("consumeNonExecutePrefix");
        consumeNonExecutePrefixMethod.setAccessible(true);
        java.lang.Object[] consumeNonExecutePrefixMethodArguments = new java.lang.Object[0];
        try {
            consumeNonExecutePrefixMethod.invoke(jsonReader, consumeNonExecutePrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.readEscapeCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method readEscapeCharacter()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (pos == limit): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: 'r'}
 * @utbot.returnsFrom {@code return '\r';}
 *  */
    @Test
    public void testReadEscapeCharacter_ReturnChar() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'r'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\r', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: '\\'}
 * @utbot.returnsFrom {@code return escaped;}
 *  */
    @Test
    public void testReadEscapeCharacter_SwitchEscapedCase() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\\'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\\', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: '/'}
 * @utbot.returnsFrom {@code return escaped;}
 *  */
    @Test
    public void testReadEscapeCharacter_SwitchEscapedCase_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'/'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('/', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: '\''}
 * @utbot.returnsFrom {@code return escaped;}
 *  */
    @Test
    public void testReadEscapeCharacter_SwitchEscapedCase_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\''};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\'', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: 'b'}
 * @utbot.returnsFrom {@code return '\b';}
 *  */
    @Test
    public void testReadEscapeCharacter_ReturnChar_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'b'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\b', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: '"'}
 * @utbot.returnsFrom {@code return escaped;}
 *  */
    @Test
    public void testReadEscapeCharacter_SwitchEscapedCase_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\"'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\"', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: 'n'}
 * @utbot.returnsFrom {@code return '\n';}
 *  */
    @Test
    public void testReadEscapeCharacter_ReturnChar_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'n'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\n', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: 't'}
 * @utbot.returnsFrom {@code return '\t';}
 *  */
    @Test
    public void testReadEscapeCharacter_ReturnChar_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'t'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\t', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.activatesSwitch {@code switch(escaped) case: 'f'}
 * @utbot.returnsFrom {@code return '\f';}
 *  */
    @Test
    public void testReadEscapeCharacter_ReturnChar_4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'f'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\f', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        
        assertEquals(1, finalJsonReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method readEscapeCharacter()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.activatesSwitch {@code switch(escaped) case: '\n'}
 * @utbot.returnsFrom {@code return escaped;}
 *  */
    @Test
    public void testReadEscapeCharacter_PosNotEqualsLimit() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\n'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber", -255);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        char actual = ((Character) readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments));
        
        assertEquals('\n', actual);
        
        int finalJsonReaderPos = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pos"));
        int finalJsonReaderLineNumber = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "lineNumber"));
        int finalJsonReaderLineStart = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "lineStart"));
        
        assertEquals(1, finalJsonReaderPos);
        
        assertEquals(-254, finalJsonReaderLineNumber);
        
        assertEquals(1, finalJsonReaderLineStart);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readEscapeCharacter()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char escaped = buffer[pos++];
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 129);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -130);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1502) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char escaped = buffer[pos++];
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 1]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1502) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos, end = i + 4; i < end; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[i];
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'u'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1511) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos, end = i + 4; i < end; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[i];
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'u', '0'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1511) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos, end = i + 4; i < end; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[i];
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'u', 'F'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1511) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: pos + 4 > limit && !fillBuffer(4)
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            'u'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 8);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 12);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 12 out of bounds for char[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1505) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos, end = i + 4; i < end; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: char c = buffer[i];
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'u', 'a'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1511) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos, end = i + 4; i < end; i++)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: c >= 'A' && c <= 'F'
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'u', ':'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 4, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1520) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos, end = i + 4; i < end; i++)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: c >= 'A' && c <= 'F'
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'u', 'G'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 4, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1520) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos, end = i + 4; i < end; i++)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: c >= 'A' && c <= 'F'
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowStringIndexOutOfBoundsException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'u', '/'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 4, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1520) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): False}
 * @utbot.iterates iterate the loop {@code for(int i = pos, end = i + 4; i < end; i++)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: c >= 'A' && c <= 'F'
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowStringIndexOutOfBoundsException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'u', 'g'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 5);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 4, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1520) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char escaped = buffer[pos++];
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -2);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1502) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.executesCondition {@code (pos + 4 > limit): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: pos + 4 > limit && !fillBuffer(4)
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            'u'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 8);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 9);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1505) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: pos == limit && !fillBuffer(1)
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1498) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: pos == limit && !fillBuffer(1)
 *  */
    @Test
    public void testReadEscapeCharacter_ThrowNullPointerException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -255);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "lineStart", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.readEscapeCharacter] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.readEscapeCharacter(JsonReader.java:1498) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readEscapeCharacter()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#readEscapeCharacter()}
 * @utbot.executesCondition {@code (pos == limit): False}
 * @utbot.invokes com.google.gson.stream.JsonReader#syntaxError(java.lang.String)
 * @utbot.activatesSwitch {@code switch(escaped) case: default}
 * @utbot.throwsException {@link com.google.gson.stream.MalformedJsonException} when: switch(escaped) case: default
 *  */
    @Test(expected = MalformedJsonException.class)
    public void testReadEscapeCharacter_ThrowMalformedJsonException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {' ', ' '};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -2);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Method readEscapeCharacterMethod = jsonReaderClazz.getDeclaredMethod("readEscapeCharacter");
        readEscapeCharacterMethod.setAccessible(true);
        java.lang.Object[] readEscapeCharacterMethodArguments = new java.lang.Object[0];
        try {
            readEscapeCharacterMethod.invoke(jsonReader, readEscapeCharacterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readEscapeCharacter
    
    public void testReadEscapeCharacter_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#toString()}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 *  */
    @Test
    public void testToString_ClassGetSimpleName() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        String actual = jsonReader.toString();
        
        String expected = "JsonReader at line 1 column 1 path $";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.hasNext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasNext()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#hasNext()}
 * @utbot.returnsFrom {@code return p != PEEKED_END_OBJECT && p != PEEKED_END_ARRAY;}
 *  */
    @Test
    public void testHasNext_PEqualsPEEKED_END_OBJECTAndPEqualsPEEKED_END_ARRAY() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 4;
        
        boolean actual = jsonReader.hasNext();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#hasNext()}
 * @utbot.returnsFrom {@code return p != PEEKED_END_OBJECT && p != PEEKED_END_ARRAY;}
 *  */
    @Test
    public void testHasNext_PNotEqualsPEEKED_END_OBJECTAndPNotEqualsPEEKED_END_ARRAY() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        boolean actual = jsonReader.hasNext();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#hasNext()}
 * @utbot.returnsFrom {@code return p != PEEKED_END_OBJECT && p != PEEKED_END_ARRAY;}
 *  */
    @Test
    public void testHasNext_PEqualsPEEKED_END_OBJECTAndPEqualsPEEKED_END_ARRAY_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 2;
        
        boolean actual = jsonReader.hasNext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasNext()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#hasNext()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: p = doPeek();
 *  */
    @Test
    public void testHasNext_ThrowIllegalStateException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {8};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.hasNext] produces [java.lang.IllegalStateException: JsonReader is closed]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:545)
            com.google.gson.stream.JsonReader.hasNext(JsonReader.java:413) */
        jsonReader.hasNext();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#hasNext()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testHasNext_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.hasNext] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.hasNext(JsonReader.java:413) */
        jsonReader.hasNext();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        jsonReader.peeked = -255;
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        jsonReader.close();
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderStack = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stack"));
        int finalJsonReaderStack0 = ((Integer) get(jsonReaderStack, 0));
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(8, finalJsonReaderStack0);
        
        assertEquals(1, finalJsonReaderStackSize);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(sd, "sun.nio.cs.StreamDecoder", "in", in1);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        jsonReader.peeked = -255;
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        jsonReader.close();
        
        Reader jsonReaderIn = ((Reader) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "in"));
        StreamDecoder jsonReaderInInSd = ((StreamDecoder) getFieldValue(jsonReaderIn, "java.io.InputStreamReader", "sd"));
        boolean finalJsonReaderInSdClosed = ((Boolean) getFieldValue(jsonReaderInInSd, "sun.nio.cs.StreamDecoder", "closed"));
        Reader jsonReaderIn1 = ((Reader) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "in"));
        StreamDecoder jsonReaderIn1InSd = ((StreamDecoder) getFieldValue(jsonReaderIn1, "java.io.InputStreamReader", "sd"));
        InputStream jsonReaderIn1InSdInSdIn = ((InputStream) getFieldValue(jsonReaderIn1InSd, "sun.nio.cs.StreamDecoder", "in"));
        boolean finalJsonReaderInSdInClosed = ((Boolean) getFieldValue(jsonReaderIn1InSdInSdIn, "java.util.zip.ZipInputStream", "closed"));
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderStack = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stack"));
        int finalJsonReaderStack0 = ((Integer) get(jsonReaderStack, 0));
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        
        assertTrue(finalJsonReaderInSdClosed);
        
        assertTrue(finalJsonReaderInSdInClosed);
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(8, finalJsonReaderStack0);
        
        assertEquals(1, finalJsonReaderStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#close()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[0] = JsonScope.CLOSED;
 *  */
    @Test
    public void testClose_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        int[] stack = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.close] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.stream.JsonReader.close(JsonReader.java:1216) */
        jsonReader.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stack[0] = JsonScope.CLOSED;
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.close] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.close(JsonReader.java:1216) */
        jsonReader.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#close()}
 * @utbot.invokes {@link java.io.Reader#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.close] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.close(JsonReader.java:1218) */
        jsonReader.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.getPath
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPath()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, size = stackSize; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(stack[i])
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1464) */
        jsonReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, size = stackSize; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(stack[i])
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-246};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1464) */
        jsonReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, size = stackSize; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(stack[i])
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {7};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1464) */
        jsonReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, size = stackSize; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(stack[i])
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {6};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1464) */
        jsonReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, size = stackSize; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(stack[i])
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {8};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1464) */
        jsonReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, size = stackSize; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(stack[i])
 *  */
    @Test
    public void testGetPath_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.getPath] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1464) */
        jsonReader.getPath();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.peek
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method peek()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_BEGIN_OBJECT}
 * @utbot.returnsFrom {@code return JsonToken.BEGIN_OBJECT;}
 *  */
    @Test
    public void testPeek_ReturnJsonTokenBEGIN_OBJECT() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 1;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.BEGIN_OBJECT;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_NUMBER}
 * @utbot.returnsFrom {@code return JsonToken.NUMBER;}
 *  */
    @Test
    public void testPeek_SwitchPCasePEEKED_NUMBER() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.NUMBER;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_FALSE}
 * @utbot.returnsFrom {@code return JsonToken.BOOLEAN;}
 *  */
    @Test
    public void testPeek_ReturnJsonTokenBOOLEAN() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 6;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.BOOLEAN;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_BEGIN_ARRAY}
 * @utbot.returnsFrom {@code return JsonToken.BEGIN_ARRAY;}
 *  */
    @Test
    public void testPeek_ReturnJsonTokenBEGIN_ARRAY() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 3;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.BEGIN_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_NUMBER}
 * @utbot.returnsFrom {@code return JsonToken.NUMBER;}
 *  */
    @Test
    public void testPeek_SwitchPCasePEEKED_NUMBER_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 16;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.NUMBER;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method peek()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return JsonToken.STRING;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_BUFFERED}
 * @utbot.returnsFrom {@code return JsonToken.STRING;}
 *  */
    @Test
    public void testPeek_SwitchPCasePEEKED_BUFFERED() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 8;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.STRING;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_BUFFERED}
 * @utbot.returnsFrom {@code return JsonToken.STRING;}
 *  */
    @Test
    public void testPeek_SwitchPCasePEEKED_BUFFERED_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 11;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.STRING;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_BUFFERED}
 * @utbot.returnsFrom {@code return JsonToken.STRING;}
 *  */
    @Test
    public void testPeek_SwitchPCasePEEKED_BUFFERED_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 9;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.STRING;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method peek()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return JsonToken.NAME;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_UNQUOTED_NAME}
 * @utbot.returnsFrom {@code return JsonToken.NAME;}
 *  */
    @Test
    public void testPeek_SwitchPCasePEEKED_UNQUOTED_NAME() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 12;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.NAME;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_UNQUOTED_NAME}
 * @utbot.returnsFrom {@code return JsonToken.NAME;}
 *  */
    @Test
    public void testPeek_SwitchPCasePEEKED_UNQUOTED_NAME_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 14;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.NAME;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.activatesSwitch {@code switch(p) case: PEEKED_UNQUOTED_NAME}
 * @utbot.returnsFrom {@code return JsonToken.NAME;}
 *  */
    @Test
    public void testPeek_SwitchPCasePEEKED_UNQUOTED_NAME_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 13;
        
        JsonToken actual = jsonReader.peek();
        
        JsonToken expected = JsonToken.NAME;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peek()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.activatesSwitch {@code switch(p) case: default}
 * @utbot.throwsException {@link java.lang.AssertionError} when: switch(p) case: default
 *  */
    @Test
    public void testPeek_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -236;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peek] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456) */
        jsonReader.peek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testPeek_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peek] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424) */
        jsonReader.peek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testPeek_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peek] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424) */
        jsonReader.peek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: p = doPeek();
 *  */
    @Test
    public void testPeek_ThrowIllegalStateException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {8};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.peek] produces [java.lang.IllegalStateException: JsonReader is closed]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:545)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424) */
        jsonReader.peek();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextDouble()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextDouble()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.returnsFrom {@code return (double) peekedLong;}
 *  */
    @Test
    public void testNextDouble_PEqualsPEEKED_LONG() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peekedLong", -255L);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        double actual = jsonReader.nextDouble();
        
        org.junit.Assert.assertEquals(-255.0, actual, 1.0E-6);
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(-254, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextDouble()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextDouble()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.executesCondition {@code (p != PEEKED_BUFFERED): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p != PEEKED_BUFFERED
 *  */
    @Test
    public void testNextDouble_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextDouble] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.nextDouble(JsonReader.java:904) */
        jsonReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextDouble()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextDouble(JsonReader.java:892) */
        jsonReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextDouble()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextDouble(JsonReader.java:892) */
        jsonReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextDouble()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.nextDouble(JsonReader.java:887) */
        jsonReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextDouble()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.nextDouble(JsonReader.java:887) */
        jsonReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextDouble()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextDouble_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextDouble] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextDouble(JsonReader.java:892) */
        jsonReader.nextDouble();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextInt()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextInt()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.executesCondition {@code (peekedLong != result): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNextInt_PeekedLongEqualsResult() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peekedLong", -255L);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        int actual = jsonReader.nextInt();
        
        assertEquals(-255, actual);
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(-254, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextInt()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextInt()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.executesCondition {@code (peekedLong != result): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: peekedLong != result
 *  */
    @Test
    public void testNextInt_ThrowNumberFormatException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peekedLong", 4294967296L);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextInt] produces [java.lang.NumberFormatException: Expected an int but was 4294967296 at line 1 column 1 path $]
            com.google.gson.stream.JsonReader.nextInt(JsonReader.java:1171) */
        jsonReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextInt()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p == PEEKED_SINGLE_QUOTED || p == PEEKED_DOUBLE_QUOTED || p == PEEKED_UNQUOTED
 *  */
    @Test
    public void testNextInt_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextInt] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.nextInt(JsonReader.java:1196) */
        jsonReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextInt()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.executesCondition {@code (peekedLong != result): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peekedLong", -255L);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextInt(JsonReader.java:1174) */
        jsonReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextInt()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.executesCondition {@code (peekedLong != result): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peekedLong", -255L);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextInt(JsonReader.java:1174) */
        jsonReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextInt()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.nextInt(JsonReader.java:1164) */
        jsonReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextInt()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.executesCondition {@code (peekedLong != result): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextInt_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peekedLong", -255L);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextInt] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextInt(JsonReader.java:1174) */
        jsonReader.nextInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.push
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method push(int)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 *  */
    @Test
    public void testPush_StackSizeNotEqualsStackLength() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255, -255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        pushMethod.invoke(jsonReader, pushMethodArguments);
        
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        
        assertEquals(2, finalJsonReaderStackSize);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 *  */
    @Test
    public void testPush_StackSizeEqualsStackLength() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {256};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        java.lang.String[] pathNames = {null};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        int[] initialJsonReaderStack = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stack"));
        java.lang.String[] initialJsonReaderPathNames = ((java.lang.String[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathNames"));
        int[] initialJsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        pushMethod.invoke(jsonReader, pushMethodArguments);
        
        int[] finalJsonReaderStack = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stack"));
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        java.lang.String[] finalJsonReaderPathNames = ((java.lang.String[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathNames"));
        int[] finalJsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        
        assertFalse(initialJsonReaderStack == finalJsonReaderStack);
        
        assertFalse(initialJsonReaderPathNames == finalJsonReaderPathNames);
        
        assertFalse(initialJsonReaderPathIndices == finalJsonReaderPathIndices);
        
        assertEquals(2, finalJsonReaderStackSize);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 *  */
    @Test
    public void testPush_StackSizeEqualsStackLength_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {256};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        java.lang.String[] pathNames = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathNames", pathNames);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        int[] initialJsonReaderStack = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stack"));
        java.lang.String[] initialJsonReaderPathNames = ((java.lang.String[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathNames"));
        int[] initialJsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        pushMethod.invoke(jsonReader, pushMethodArguments);
        
        int[] finalJsonReaderStack = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stack"));
        int finalJsonReaderStackSize = ((Integer) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "stackSize"));
        java.lang.String[] finalJsonReaderPathNames = ((java.lang.String[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathNames"));
        int[] finalJsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        
        assertFalse(initialJsonReaderStack == finalJsonReaderStack);
        
        assertFalse(initialJsonReaderPathNames == finalJsonReaderPathNames);
        
        assertFalse(initialJsonReaderPathIndices == finalJsonReaderPathIndices);
        
        assertEquals(2, finalJsonReaderStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method push(int)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[stackSize++] = newTop;
 *  */
    @Test
    public void testPush_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -256);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.push] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonReader.push(JsonReader.java:1269) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[stackSize++] = newTop;
 *  */
    @Test
    public void testPush_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255, -255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 253);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.push] produces [java.lang.ArrayIndexOutOfBoundsException: Index 253 out of bounds for length 2]
            com.google.gson.stream.JsonReader.push(JsonReader.java:1269) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stackSize == stack.length
 *  */
    @Test
    public void testPush_ThrowNullPointerException() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.push] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.push(JsonReader.java:1263) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(pathIndices, 0, newPathIndices, 0, stackSize);
 *  */
    @Test
    public void testPush_ThrowNullPointerException_1() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {1};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.push] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3481)
            com.google.gson.stream.JsonReader.push(JsonReader.java:1267) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(pathIndices, 0, newPathIndices, 0, stackSize);
 *  */
    @Test
    public void testPush_ThrowNullPointerException_2() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.push] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3586)
            com.google.gson.stream.JsonReader.push(JsonReader.java:1266) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(pathNames, 0, newPathNames, 0, stackSize);
 *  */
    @Test
    public void testPush_ThrowNullPointerException_3() throws Throwable  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", stack);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.push] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3481)
            com.google.gson.stream.JsonReader.push(JsonReader.java:1267) */
        Class jsonReaderClazz = Class.forName("com.google.gson.stream.JsonReader");
        Class intType = int.class;
        Method pushMethod = jsonReaderClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextLong()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextLong()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.returnsFrom {@code return peekedLong;}
 *  */
    @Test
    public void testNextLong_PEqualsPEEKED_LONG() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peekedLong", -255L);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        long actual = jsonReader.nextLong();
        
        assertEquals(-255L, actual);
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(-254, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextLong()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextLong()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): False}
 * @utbot.executesCondition {@code (p == PEEKED_NUMBER): False}
 * @utbot.executesCondition {@code (p == PEEKED_SINGLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_DOUBLE_QUOTED): False}
 * @utbot.executesCondition {@code (p == PEEKED_UNQUOTED): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: p == PEEKED_SINGLE_QUOTED || p == PEEKED_DOUBLE_QUOTED || p == PEEKED_UNQUOTED
 *  */
    @Test
    public void testNextLong_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextLong] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.nextLong(JsonReader.java:959) */
        jsonReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextLong()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextLong(JsonReader.java:937) */
        jsonReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextLong()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextLong(JsonReader.java:937) */
        jsonReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextLong()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#doPeek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.nextLong(JsonReader.java:932) */
        jsonReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextLong()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_LONG): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextLong_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 15;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextLong] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextLong(JsonReader.java:937) */
        jsonReader.nextLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.nextBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextBoolean()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testNextBoolean_PEqualsPEEKED_TRUE() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 5;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        boolean actual = jsonReader.nextBoolean();
        
        assertTrue(actual);
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(1, finalJsonReaderPathIndices0);
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): False}
 * @utbot.executesCondition {@code (p == PEEKED_FALSE): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testNextBoolean_PEqualsPEEKED_FALSE() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 6;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        boolean actual = jsonReader.nextBoolean();
        
        assertFalse(actual);
        
        int finalJsonReaderPeeked = jsonReader.peeked;
        int[] jsonReaderPathIndices = ((int[]) getFieldValue(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices"));
        int finalJsonReaderPathIndices0 = ((Integer) get(jsonReaderPathIndices, 0));
        
        assertEquals(0, finalJsonReaderPeeked);
        
        assertEquals(-254, finalJsonReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextBoolean()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): False}
 * @utbot.executesCondition {@code (p == PEEKED_FALSE): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.stream.JsonReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: throw new IllegalStateException("Expected a boolean but was " + peek() + locationString());
 *  */
    @Test
    public void testNextBoolean_ThrowAssertionError() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = -255;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:852) */
        jsonReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): False}
 * @utbot.executesCondition {@code (p == PEEKED_FALSE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 6;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -254);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:849) */
        jsonReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): False}
 * @utbot.executesCondition {@code (p == PEEKED_FALSE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 6;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 129);
        int[] pathIndices = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:849) */
        jsonReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 5;
        int[] pathIndices = {0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:845) */
        jsonReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 5;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        int[] pathIndices = {0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:845) */
        jsonReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: p = doPeek();
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {-255};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:841) */
        jsonReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: p = doPeek();
 *  */
    @Test
    public void testNextBoolean_ThrowIllegalStateException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {8};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.IllegalStateException: JsonReader is closed]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:545)
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:841) */
        jsonReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): False}
 * @utbot.executesCondition {@code (p == PEEKED_FALSE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextBoolean_ThrowNullPointerException() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 6;
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:849) */
        jsonReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#nextBoolean()}
 * @utbot.executesCondition {@code (p == PEEKED_NONE): False}
 * @utbot.executesCondition {@code (p == PEEKED_TRUE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextBoolean_ThrowNullPointerException_1() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.peeked = 5;
        
        /* This test fails because method [com.google.gson.stream.JsonReader.nextBoolean] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextBoolean(JsonReader.java:845) */
        jsonReader.nextBoolean();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.setLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLenient(boolean)
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#setLenient(boolean)}
 *  */
    @Test
    public void testSetLenient() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        jsonReader.setLenient(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonReader.isLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLenient()
    
    /**
    @utbot.classUnderTest {@link JsonReader}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonReader#isLenient()}
 * @utbot.returnsFrom {@code return lenient;}
 *  */
    @Test
    public void testIsLenient_ReturnLenient() throws Exception  {
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        
        boolean actual = jsonReader.isLenient();
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1016330143452200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1016330143452200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1016330143474000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016330143452200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016330143474000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1016330145591100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1016330145591100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1016330145654400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016330145591100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016330145654400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

