package com.google.gson.stream;

import org.junit.Test;
import java.io.Writer;
import java.io.StringWriter;
import java.io.PrintWriter;
import com.google.gson.internal.LazilyParsedNumber;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ReadOnlyBufferException;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;

public final class com_google_gson_stream_JsonWriterTest {
    ///region Test suites for executable com.google.gson.stream.JsonWriter.name
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method name(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#name(java.lang.String)}
 * @utbot.executesCondition {@code (name == null): False}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testName_StackSizeNotEqualsZero() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        String string = "";
        
        JsonWriter actual = jsonWriter.name(string);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack);
        
        int jsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String jsonWriterDeferredName = ((String) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName"));
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertEquals(jsonWriterDeferredName, actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method name(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#name(java.lang.String)}
 * @utbot.executesCondition {@code (name == null): False}
 * @utbot.executesCondition {@code (deferredName != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: deferredName != null
 *  */
    @Test
    public void testName_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.name] produces [java.lang.IllegalStateException]
            com.google.gson.stream.JsonWriter.name(JsonWriter.java:389) */
        jsonWriter.name(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#name(java.lang.String)}
 * @utbot.executesCondition {@code (name == null): False}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.executesCondition {@code (stackSize == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: stackSize == 0
 *  */
    @Test
    public void testName_ThrowIllegalStateException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.name] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.name(JsonWriter.java:392) */
        jsonWriter.name(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#name(java.lang.String)}
 * @utbot.executesCondition {@code (name == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: name == null
 *  */
    @Test
    public void testName_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.name] produces [java.lang.NullPointerException: name == null]
            com.google.gson.stream.JsonWriter.name(JsonWriter.java:386) */
        jsonWriter.name(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method value(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.returnsFrom {@code return nullValue();}
 *  */
    @Test
    public void testValue_ValueEqualsNull() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        JsonWriter actual = jsonWriter.value(((Boolean) null));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack);
        
        int jsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:479) */
        jsonWriter.value(boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:480) */
        jsonWriter.value(boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:479) */
        jsonWriter.value(boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:480) */
        jsonWriter.value(boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:479) */
        jsonWriter.value(boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:480) */
        jsonWriter.value(boolean1);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Boolean)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(java.lang.Boolean)
    
    @Test
    public void testValue1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            6, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        JsonWriter actual = jsonWriter.value(((Boolean) null));
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int[] jsonWriterStack1 = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack1, 0));
        
        assertEquals(7, finalJsonWriterStack0);
    }
    
    @Test
    public void testValue2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            6, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        JsonWriter actual = jsonWriter.value(((Boolean) null));
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int[] jsonWriterStack1 = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack1, 0));
        
        assertEquals(7, finalJsonWriterStack0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(java.lang.Boolean)
    
    @Test
    public void testValue3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    @Test
    public void testValue4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:479) */
        jsonWriter.value(boolean1);
    }
    
    @Test
    public void testValue5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    @Test
    public void testValue6() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            1, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:481) */
        jsonWriter.value(boolean1);
    }
    
    @Test
    public void testValue7() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    @Test
    public void testValue8() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            7, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:481) */
        jsonWriter.value(boolean1);
    }
    
    @Test
    public void testValue9() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            6, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:481) */
        jsonWriter.value(boolean1);
    }
    
    @Test
    public void testValue10() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            7, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    @Test
    public void testValue11() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            2, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:77)
            java.base/java.io.StringWriter.append(StringWriter.java:210)
            java.base/java.io.StringWriter.append(StringWriter.java:41)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:480) */
        jsonWriter.value(boolean1);
    }
    
    @Test
    public void testValue12() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    @Test
    public void testValue13() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:479) */
        jsonWriter.value(boolean1);
    }
    
    @Test
    public void testValue14() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            5, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    @Test
    public void testValue15() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setHtmlSafe(true);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    @Test
    public void testValue16() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            4, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "separator", separator);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:477) */
        jsonWriter.value(((Boolean) null));
    }
    
    @Test
    public void testValue17() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            5, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        Boolean boolean1 = false;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:479) */
        jsonWriter.value(boolean1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.value
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(double)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: Double.isNaN(value) || Double.isInfinite(value)
 *  */
    @Test
    public void testValue_ThrowIllegalArgumentException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalArgumentException: Numeric values must be finite, but was NaN]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:495) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: Double.isNaN(value) || Double.isInfinite(value)
 *  */
    @Test
    public void testValue_ThrowIllegalArgumentException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalArgumentException: Numeric values must be finite, but was -Infinity]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:495) */
        jsonWriter.value(java.lang.Double.NEGATIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:493) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_11() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_21() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:493) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_31() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_41() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_11() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:493) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_21() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_31() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:493) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(double)
    
    @Test
    public void testValue18() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        JsonWriter actual = jsonWriter.value(3.337610787760802E-308);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String jsonWriterIndent = ((String) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "indent"));
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertEquals(jsonWriterIndent, actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int[] jsonWriterStack1 = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack1, 0));
        
        assertEquals(2, finalJsonWriterStack0);
    }
    
    @Test
    public void testValue19() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647,
            -2147483647
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        JsonWriter actual = jsonWriter.value(3.337610787760802E-308);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String jsonWriterIndent = ((String) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "indent"));
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertEquals(jsonWriterIndent, actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int[] jsonWriterStack1 = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack1, 0));
        
        assertEquals(2, finalJsonWriterStack0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(double)
    
    @Test
    public void testValue20() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1073741825);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:493) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    @Test
    public void testValue21() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("\u0000");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            3, -1, -1, -1, -1, -1, -1, -1,
            -1
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalArgumentException: Numeric values must be finite, but was NaN]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:495) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    @Test
    public void testValue22() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            7, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:498) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    @Test
    public void testValue23() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            7, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:498) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    @Test
    public void testValue24() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            6, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:498) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    @Test
    public void testValue25() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            6, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:498) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    @Test
    public void testValue26() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647,
            -2147483647
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:493) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    @Test
    public void testValue27() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:493) */
        jsonWriter.value(java.lang.Double.NaN);
    }
    
    @Test
    public void testValue28() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    @Test
    public void testValue29() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            4, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "separator", separator);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    @Test
    public void testValue30() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:498) */
        jsonWriter.value(3.337610787760802E-308);
    }
    
    @Test
    public void testValue31() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:497) */
        jsonWriter.value(3.337610787760802E-308);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.value
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(long)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:508) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_12() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:508) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_22() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_32() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_42() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_51() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {16};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -256);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -257 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:508) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_32() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_41() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:508) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:508) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_6() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(Long.toString(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_7() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {6};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:510) */
        jsonWriter.value(java.lang.Long.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(Long.toString(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_8() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:510) */
        jsonWriter.value(0L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_12() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(Long.toString(value));
 *  */
    @Test
    public void testValue_ThrowNullPointerException_22() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:510) */
        jsonWriter.value(0L);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(long)
    
    @Test
    public void testValue32() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("\u0000");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            2, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        JsonWriter actual = jsonWriter.value(0L);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    
    @Test
    public void testValue33() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            7, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        JsonWriter actual = jsonWriter.value(0L);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertTrue(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(long)
    
    @Test
    public void testValue34() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -2147221504);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147221505 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(0L);
    }
    
    @Test
    public void testValue35() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            7, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:510) */
        jsonWriter.value(0L);
    }
    
    @Test
    public void testValue36() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            7, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:510) */
        jsonWriter.value(java.lang.Long.MIN_VALUE);
    }
    
    @Test
    public void testValue37() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            6, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:510) */
        jsonWriter.value(0L);
    }
    
    @Test
    public void testValue38() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647,
            -2147483647
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setHtmlSafe(true);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:508) */
        jsonWriter.value(0L);
    }
    
    @Test
    public void testValue39() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:508) */
        jsonWriter.value(0L);
    }
    
    @Test
    public void testValue40() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            4, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "separator", separator);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(0L);
    }
    
    @Test
    public void testValue41() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(0L);
    }
    
    @Test
    public void testValue42() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:77)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:509) */
        jsonWriter.value(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.value
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(boolean)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:464) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_13() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:464) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_23() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_33() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_43() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {16};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_52() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:464) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_33() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_42() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:464) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_51() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:464) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_61() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(value ? "true" : "false");
 *  */
    @Test
    public void testValue_ThrowNullPointerException_71() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {6};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:466) */
        jsonWriter.value(true);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(value ? "true" : "false");
 *  */
    @Test
    public void testValue_ThrowNullPointerException_81() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {6};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:466) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(value ? "true" : "false");
 *  */
    @Test
    public void testValue_ThrowNullPointerException_9() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:466) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(value ? "true" : "false");
 *  */
    @Test
    public void testValue_ThrowNullPointerException_13() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:466) */
        jsonWriter.value(true);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_23() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(boolean)
    
    @Test
    public void testValue43() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("\u0000");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            3, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        
        JsonWriter actual = jsonWriter.value(false);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String jsonWriterIndent = ((String) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "indent"));
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertEquals(jsonWriterIndent, actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int[] jsonWriterStack1 = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack1, 0));
        
        assertEquals(5, finalJsonWriterStack0);
    }
    
    @Test
    public void testValue44() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        JsonWriter actual = jsonWriter.value(false);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String jsonWriterIndent = ((String) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "indent"));
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertEquals(jsonWriterIndent, actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int[] jsonWriterStack1 = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack1, 0));
        
        assertEquals(2, finalJsonWriterStack0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(boolean)
    
    @Test
    public void testValue45() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -2147221504);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147221505 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    @Test
    public void testValue46() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:464) */
        jsonWriter.value(false);
    }
    
    @Test
    public void testValue47() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:466) */
        jsonWriter.value(true);
    }
    
    @Test
    public void testValue48() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            2, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    @Test
    public void testValue49() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    
    @Test
    public void testValue50() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            4, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "separator", separator);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:465) */
        jsonWriter.value(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method value(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.returnsFrom {@code return nullValue();}
 *  */
    @Test
    public void testValue_ValueEqualsNull1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        JsonWriter actual = jsonWriter.value(((String) null));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack);
        
        int jsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:416) */
        jsonWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_14() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_24() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_34() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:417) */
        jsonWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_44() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:416) */
        jsonWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_53() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:417) */
        jsonWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 128);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 2]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:417) */
        jsonWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_14() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_24() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:416) */
        jsonWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_34() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:417) */
        jsonWriter.value(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(java.lang.String)
    
    @Test
    public void testValue51() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            3, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        String string = "";
        
        JsonWriter actual = jsonWriter.value(string);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String jsonWriterIndent = ((String) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "indent"));
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertEquals(jsonWriterIndent, actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int[] jsonWriterStack1 = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack1, 0));
        
        assertEquals(5, finalJsonWriterStack0);
    }
    
    @Test
    public void testValue52() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            6, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        JsonWriter actual = jsonWriter.value(((String) null));
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int[] jsonWriterStack1 = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack1, 0));
        
        assertEquals(7, finalJsonWriterStack0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(java.lang.String)
    
    @Test
    public void testValue53() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue54() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:417) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue55() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            5, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue56() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue57() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue58() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:416) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue59() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue60() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1073741825);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:416) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue61() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            7, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:418) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue62() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            6, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:418) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue63() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            7, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue64() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue65() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setHtmlSafe(true);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue66() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue67() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue68() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            5, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue69() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            2, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    
    @Test
    public void testValue70() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setHtmlSafe(true);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:416) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue71() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:416) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue72() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            1, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:418) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue73() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            1, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:417) */
        jsonWriter.value(string);
    }
    
    @Test
    public void testValue74() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            4, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String separator = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "separator", separator);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:414) */
        jsonWriter.value(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method value(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.returnsFrom {@code return nullValue();}
 *  */
    @Test
    public void testValue_ValueEqualsNull2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        JsonWriter actual = jsonWriter.value(((Number) null));
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack);
        
        int jsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method value(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_15() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_25() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_35() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_45() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowIllegalStateException_54() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 256);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_15() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        Double double1 = 0.0;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:526) */
        jsonWriter.value(((Number) double1));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testValue_ThrowNullPointerException5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        Double double1 = 0.0;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:526) */
        jsonWriter.value(((Number) double1));
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#value(java.lang.Number)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testValue_ThrowNullPointerException_25() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method value(java.lang.Number)
    
    @Test
    public void testValue75() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            2, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        JsonWriter actual = jsonWriter.value(((Number) null));
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method value(java.lang.Number)
    
    @Test
    public void testValue76() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:532) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue77() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        Integer integer = 1;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:532) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue78() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        Integer integer = 17;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:532) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue79() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue80() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        jsonWriter.setLenient(true);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:532) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue81() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue82() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        Double double1 = 0.0;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:526) */
        jsonWriter.value(((Number) double1));
    }
    
    @Test
    public void testValue83() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1073741825);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue84() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        LazilyParsedNumber lazilyParsedNumber = new LazilyParsedNumber(null);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:526) */
        jsonWriter.value(lazilyParsedNumber);
    }
    
    @Test
    public void testValue85() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            6, 102, 102, 102, 102, 102, 102, 102,
            102
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:533) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue86() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            7, 102, 102, 102, 102, 102, 102, 102,
            102
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:533) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue87() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            1, 102, 102, 102, 102, 102, 102, 102,
            102
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:533) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue88() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            2, 102, 102, 102, 102, 102, 102, 102,
            102
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:532) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue89() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            6, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue90() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            7, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue91() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue92() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        Integer integer = 0;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:532) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue93() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue94() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            3, 610, 610, 610, 610, 610, 610, 610,
            610
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:401)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue95() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            4, 102, 102, 102, 102, 102, 102, 102,
            102
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:532) */
        jsonWriter.value(integer);
    }
    
    @Test
    public void testValue96() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            2, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue97() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {
            4, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:523) */
        jsonWriter.value(((Number) null));
    }
    
    @Test
    public void testValue98() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("\u0000");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {
            3, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        LazilyParsedNumber lazilyParsedNumber = new LazilyParsedNumber(null);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.value] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.value(JsonWriter.java:529) */
        jsonWriter.value(lazilyParsedNumber);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.flush
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flush()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#flush()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.invokes {@link java.io.Writer#flush()}
 *  */
    @Test
    public void testFlush_StackSizeNotEqualsZero() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object bb = createInstance("java.nio.DirectByteBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        jsonWriter.flush();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flush()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#flush()}
 * @utbot.executesCondition {@code (stackSize == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: stackSize == 0
 *  */
    @Test
    public void testFlush_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.flush] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.flush(JsonWriter.java:543) */
        jsonWriter.flush();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#flush()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.invokes {@link java.io.Writer#flush()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.flush();
 *  */
    @Test
    public void testFlush_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.flush] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.flush(JsonWriter.java:545) */
        jsonWriter.flush();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#flush()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFlush_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.flush] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.flush(PrintWriter.java:394)
            com.google.gson.stream.JsonWriter.flush(JsonWriter.java:545) */
        jsonWriter.flush();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#flush()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFlush_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.flush] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.flush(PrintWriter.java:394)
            com.google.gson.stream.JsonWriter.flush(JsonWriter.java:545) */
        jsonWriter.flush();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method flush()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#flush()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.invokes {@link java.io.Writer#flush()}
 * @utbot.throwsException {@link java.io.IOException} in: out.flush();
 *  */
    @Test(expected = IOException.class)
    public void testFlush_ThrowIOException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        jsonWriter.flush();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flush()
    
    @Test
    public void testFlush1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out2 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        setField(out1, "java.io.PrintWriter", "out", out2);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.flush] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.flush(PrintWriter.java:394)
            com.google.gson.stream.JsonWriter.flush(JsonWriter.java:545) */
        jsonWriter.flush();
    }
    ///endregion
    
    ///region Errors report for flush
    
    public void testFlush_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close(int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close(int,int,java.lang.String)}
 * @utbot.executesCondition {@code (context != nonempty): True}
 * @utbot.executesCondition {@code (context != empty): False}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.executesCondition {@code (context == nonempty): False}
 * @utbot.invokes com.google.gson.stream.JsonWriter#peek()
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testClose_ContextNotEqualsNonempty() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method closeMethod = jsonWriterClazz.getDeclaredMethod("close", intType, intType, stringType);
        closeMethod.setAccessible(true);
        java.lang.Object[] closeMethodArguments = new java.lang.Object[3];
        closeMethodArguments[0] = -255;
        closeMethodArguments[1] = -2;
        closeMethodArguments[2] = string;
        JsonWriter actual = ((JsonWriter) closeMethod.invoke(jsonWriter, closeMethodArguments));
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        Writer jsonWriterOutOut = ((Writer) getFieldValue(jsonWriterOut, "java.io.PrintWriter", "out"));
        Writer actualOutOut = ((Writer) getFieldValue(actualOut, "java.io.PrintWriter", "out"));
        StreamEncoder jsonWriterOutOutSe = ((StreamEncoder) getFieldValue(jsonWriterOutOut, "java.io.OutputStreamWriter", "se"));
        StreamEncoder actualOutOutSe = ((StreamEncoder) getFieldValue(actualOutOut, "java.io.OutputStreamWriter", "se"));
        boolean actualOutOutSeClosed = ((Boolean) getFieldValue(actualOutOutSe, "sun.nio.cs.StreamEncoder", "closed"));
        assertFalse(actualOutOutSeClosed);
        
        Object actualOutOutSeLock = getFieldValue(actualOutOutSe, "java.io.Writer", "lock");
        assertNull(actualOutOutSeLock);
        
        assertTrue(deepEquals(jsonWriterOut, actualOut));
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        int finalJsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        
        assertEquals(0, finalJsonWriterStackSize);
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Concrete execution failed
        
        // 14 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size == 1): False}
 *  */
    @Test
    public void testClose_SizeNotEquals1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size == 1): True}
 * @utbot.executesCondition {@code (stack[size - 1] != NONEMPTY_DOCUMENT): False}
 *  */
    @Test
    public void testClose_Size1OfStackEqualsNONEMPTY_DOCUMENT() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        jsonWriter.close();
        
        int finalJsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        
        assertEquals(0, finalJsonWriterStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size > 1): False}
 * @utbot.executesCondition {@code (size == 1): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: size > 1 || size == 1 && stack[size - 1] != NONEMPTY_DOCUMENT
 *  */
    @Test
    public void testClose_ThrowIndexOutOfBoundsException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:554) */
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size > 1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: size > 1 || size == 1 && stack[size - 1] != NONEMPTY_DOCUMENT
 *  */
    @Test
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.close(PrintWriter.java:412)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:554) */
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size > 1): False}
 * @utbot.executesCondition {@code (size == 1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: size > 1 || size == 1 && stack[size - 1] != NONEMPTY_DOCUMENT
 *  */
    @Test
    public void testClose_ThrowNullPointerException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.NullPointerException] */
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size > 1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: size > 1 || size == 1 && stack[size - 1] != NONEMPTY_DOCUMENT
 *  */
    @Test
    public void testClose_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.close(PrintWriter.java:412)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:554) */
        jsonWriter.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size > 1): True}
 * @utbot.throwsException {@link java.io.IOException} when: size > 1 || size == 1 && stack[size - 1] != NONEMPTY_DOCUMENT
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size > 1): False}
 * @utbot.executesCondition {@code (size == 1): True}
 * @utbot.executesCondition {@code (stack[size - 1] != NONEMPTY_DOCUMENT): True}
 * @utbot.throwsException {@link java.io.IOException} when: size > 1 || size == 1 && stack[size - 1] != NONEMPTY_DOCUMENT
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.executesCondition {@code (size > 1): True}
 * @utbot.throwsException {@link java.io.IOException} when: size > 1 || size == 1 && stack[size - 1] != NONEMPTY_DOCUMENT
 *  */
    @Test(expected = IOException.class)
    public void testClose_ThrowIOException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        jsonWriter.close();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: out.close();
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testClose_ThrowReadOnlyBufferException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: out.close();
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testClose_ThrowReadOnlyBufferException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        
        jsonWriter.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#close()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: out.close();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testClose_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 3);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lcb = createInstance("java.nio.HeapCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        
        jsonWriter.close();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method close()
    
    @Test
    public void testClose1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.close(PrintWriter.java:412)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:554) */
        jsonWriter.close();
    }
    
    @Test
    public void testClose2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.close(PrintWriter.java:412)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:554) */
        jsonWriter.close();
    }
    
    @Test
    public void testClose3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.close(PrintWriter.java:412)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:554) */
        jsonWriter.close();
    }
    
    @Test
    public void testClose4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.close] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.close(PrintWriter.java:412)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:554) */
        jsonWriter.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.open
    
    ///region Errors report for open
    
    public void testOpen_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 26 occurrences of:
        // Concrete execution failed
        
        // 15 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.peek
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method peek()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.returnsFrom {@code return stack[stackSize - 1];}
 *  */
    @Test
    public void testPeek_StackSizeNotEqualsZero() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method peekMethod = jsonWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) peekMethod.invoke(jsonWriter, peekMethodArguments));
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peek()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: stackSize == 0
 *  */
    @Test
    public void testPeek_ThrowIllegalStateException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.peek] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method peekMethod = jsonWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        try {
            peekMethod.invoke(jsonWriter, peekMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return stack[stackSize - 1];
 *  */
    @Test
    public void testPeek_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.peek] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method peekMethod = jsonWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        try {
            peekMethod.invoke(jsonWriter, peekMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return stack[stackSize - 1];
 *  */
    @Test
    public void testPeek_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.peek] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method peekMethod = jsonWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        try {
            peekMethod.invoke(jsonWriter, peekMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return stack[stackSize - 1];
 *  */
    @Test
    public void testPeek_ThrowNullPointerException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.peek] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method peekMethod = jsonWriterClazz.getDeclaredMethod("peek");
        peekMethod.setAccessible(true);
        java.lang.Object[] peekMethodArguments = new java.lang.Object[0];
        try {
            peekMethod.invoke(jsonWriter, peekMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.string
    
    ///region OTHER: ERROR SUITE for method string(java.lang.String)
    
    @Test
    public void testString1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        jsonWriter.setHtmlSafe(true);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.string] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class stringType = Class.forName("java.lang.String");
        Method stringMethod = jsonWriterClazz.getDeclaredMethod("string", stringType);
        stringMethod.setAccessible(true);
        java.lang.Object[] stringMethodArguments = new java.lang.Object[1];
        stringMethodArguments[0] = string;
        try {
            stringMethod.invoke(jsonWriter, stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testString2() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.string] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class stringType = Class.forName("java.lang.String");
        Method stringMethod = jsonWriterClazz.getDeclaredMethod("string", stringType);
        stringMethod.setAccessible(true);
        java.lang.Object[] stringMethodArguments = new java.lang.Object[1];
        stringMethodArguments[0] = string;
        try {
            stringMethod.invoke(jsonWriter, stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testString3() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.string] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class stringType = Class.forName("java.lang.String");
        Method stringMethod = jsonWriterClazz.getDeclaredMethod("string", stringType);
        stringMethod.setAccessible(true);
        java.lang.Object[] stringMethodArguments = new java.lang.Object[1];
        stringMethodArguments[0] = string;
        try {
            stringMethod.invoke(jsonWriter, stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testString4() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.string] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class stringType = Class.forName("java.lang.String");
        Method stringMethod = jsonWriterClazz.getDeclaredMethod("string", stringType);
        stringMethod.setAccessible(true);
        java.lang.Object[] stringMethodArguments = new java.lang.Object[1];
        stringMethodArguments[0] = string;
        try {
            stringMethod.invoke(jsonWriter, stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testString5() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        jsonWriter.setHtmlSafe(true);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.string] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.string(JsonWriter.java:565) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class stringType = Class.forName("java.lang.String");
        Method stringMethod = jsonWriterClazz.getDeclaredMethod("string", stringType);
        stringMethod.setAccessible(true);
        java.lang.Object[] stringMethodArguments = new java.lang.Object[1];
        stringMethodArguments[0] = string;
        try {
            stringMethod.invoke(jsonWriter, stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.push
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method push(int)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 *  */
    @Test
    public void testPush_StackSizeNotEqualsStackLength() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method pushMethod = jsonWriterClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        pushMethod.invoke(jsonWriter, pushMethodArguments);
        
        int finalJsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        
        assertEquals(2, finalJsonWriterStackSize);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testPush_StackSizeEqualsStackLength() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        int[] initialJsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method pushMethod = jsonWriterClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = 1;
        pushMethod.invoke(jsonWriter, pushMethodArguments);
        
        int[] finalJsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        
        assertFalse(initialJsonWriterStack == finalJsonWriterStack);
        
        assertEquals(2, finalJsonWriterStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method push(int)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[stackSize++] = newTop;
 *  */
    @Test
    public void testPush_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -256);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.push] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.push(JsonWriter.java:358) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method pushMethod = jsonWriterClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonWriter, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#push(int)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[stackSize++] = newTop;
 *  */
    @Test
    public void testPush_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 253);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.push] produces [java.lang.ArrayIndexOutOfBoundsException: Index 253 out of bounds for length 2]
            com.google.gson.stream.JsonWriter.push(JsonWriter.java:358) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method pushMethod = jsonWriterClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonWriter, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#push(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stackSize == stack.length
 *  */
    @Test
    public void testPush_ThrowNullPointerException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.push] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.push(JsonWriter.java:355) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method pushMethod = jsonWriterClazz.getDeclaredMethod("push", intType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = -255;
        try {
            pushMethod.invoke(jsonWriter, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.setLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLenient(boolean)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#setLenient(boolean)}
 *  */
    @Test
    public void testSetLenient() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        jsonWriter.setLenient(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.isLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLenient()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#isLenient()}
 * @utbot.returnsFrom {@code return lenient;}
 *  */
    @Test
    public void testIsLenient_ReturnLenient() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        boolean actual = jsonWriter.isLenient();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.newline
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newline()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#newline()}
 * @utbot.executesCondition {@code (indent == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testNewline_IndentEqualsNull() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method newlineMethod = jsonWriterClazz.getDeclaredMethod("newline");
        newlineMethod.setAccessible(true);
        java.lang.Object[] newlineMethodArguments = new java.lang.Object[0];
        newlineMethod.invoke(jsonWriter, newlineMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#newline()}
 * @utbot.executesCondition {@code (indent == null): False}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 *  */
    @Test
    public void testNewline_IndentNotEqualsNull() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method newlineMethod = jsonWriterClazz.getDeclaredMethod("newline");
        newlineMethod.setAccessible(true);
        java.lang.Object[] newlineMethodArguments = new java.lang.Object[0];
        newlineMethod.invoke(jsonWriter, newlineMethodArguments);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        boolean finalJsonWriterOutTrouble = ((Boolean) getFieldValue(jsonWriterOut, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalJsonWriterOutTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newline()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#newline()}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write("\n");
 *  */
    @Test
    public void testNewline_ThrowNullPointerException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.newline] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method newlineMethod = jsonWriterClazz.getDeclaredMethod("newline");
        newlineMethod.setAccessible(true);
        java.lang.Object[] newlineMethodArguments = new java.lang.Object[0];
        try {
            newlineMethod.invoke(jsonWriter, newlineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#newline()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testNewline_ThrowNullPointerException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.newline] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method newlineMethod = jsonWriterClazz.getDeclaredMethod("newline");
        newlineMethod.setAccessible(true);
        java.lang.Object[] newlineMethodArguments = new java.lang.Object[0];
        try {
            newlineMethod.invoke(jsonWriter, newlineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#newline()}
 * @utbot.iterates iterate the loop {@code for(int i = 1, size = stackSize; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testNewline_ThrowNullPointerException_2() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.newline] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method newlineMethod = jsonWriterClazz.getDeclaredMethod("newline");
        newlineMethod.setAccessible(true);
        java.lang.Object[] newlineMethodArguments = new java.lang.Object[0];
        try {
            newlineMethod.invoke(jsonWriter, newlineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#newline()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testNewline_ThrowNullPointerException_3() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.newline] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method newlineMethod = jsonWriterClazz.getDeclaredMethod("newline");
        newlineMethod.setAccessible(true);
        java.lang.Object[] newlineMethodArguments = new java.lang.Object[0];
        try {
            newlineMethod.invoke(jsonWriter, newlineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method newline()
    
    @Test
    public void testNewline1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method newlineMethod = jsonWriterClazz.getDeclaredMethod("newline");
        newlineMethod.setAccessible(true);
        java.lang.Object[] newlineMethodArguments = new java.lang.Object[0];
        newlineMethod.invoke(jsonWriter, newlineMethodArguments);
    }
    ///endregion
    
    ///region Errors report for newline
    
    public void testNewline_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.getSerializeNulls
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSerializeNulls()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#getSerializeNulls()}
 * @utbot.returnsFrom {@code return serializeNulls;}
 *  */
    @Test
    public void testGetSerializeNulls_ReturnSerializeNulls() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        boolean actual = jsonWriter.getSerializeNulls();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.endArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endArray()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.invokes com.google.gson.stream.JsonWriter#close(int,int,java.lang.String)
 * @utbot.returnsFrom {@code return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");}
 *  */
    @Test
    public void testEndArray_JsonWriterClose() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        JsonWriter actual = jsonWriter.endArray();
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int finalJsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        
        assertEquals(0, finalJsonWriterStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endArray()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:338)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:340)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:338)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:338)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.IllegalStateException: Dangling name: ]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:343)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.IllegalStateException: Dangling name: ]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:343)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:338)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:350)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:348)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:350)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.returnsFrom {@code return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {-255, 1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:350)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endArray()}
 * @utbot.returnsFrom {@code return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_ARRAY, NONEMPTY_ARRAY, "]");
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {-255, 1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endArray] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:350)
            com.google.gson.stream.JsonWriter.endArray(JsonWriter.java:298) */
        jsonWriter.endArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.beginObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beginObject()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:308) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {16};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:308) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:308) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginObject_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:308) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7, 610};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:328)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:308) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:308) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:328)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_6() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_7() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1, 610};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:328)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_8() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginObject()}
 * @utbot.invokes com.google.gson.stream.JsonWriter#open(int,java.lang.String)
 * @utbot.returnsFrom {@code return open(EMPTY_OBJECT, "{");}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_OBJECT, "{");
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException_9() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {7, 610};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginObject] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:328)
            com.google.gson.stream.JsonWriter.beginObject(JsonWriter.java:309) */
        jsonWriter.beginObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.setIndent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setIndent(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#setIndent(java.lang.String)}
 * @utbot.executesCondition {@code (indent.length() == 0): False}
 *  */
    @Test
    public void testSetIndent_IndentLengthNotEqualsZero() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String string = " ";
        
        jsonWriter.setIndent(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#setIndent(java.lang.String)}
 * @utbot.executesCondition {@code (indent.length() == 0): True}
 *  */
    @Test
    public void testSetIndent_IndentLengthEqualsZero() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String string = "";
        
        jsonWriter.setIndent(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setIndent(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#setIndent(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: indent.length() == 0
 *  */
    @Test
    public void testSetIndent_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.setIndent] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.setIndent(JsonWriter.java:214) */
        jsonWriter.setIndent(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.isHtmlSafe
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isHtmlSafe()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#isHtmlSafe()}
 * @utbot.returnsFrom {@code return htmlSafe;}
 *  */
    @Test
    public void testIsHtmlSafe_ReturnHtmlSafe() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        boolean actual = jsonWriter.isHtmlSafe();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.setSerializeNulls
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSerializeNulls(boolean)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#setSerializeNulls(boolean)}
 *  */
    @Test
    public void testSetSerializeNulls() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        jsonWriter.setSerializeNulls(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.setHtmlSafe
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setHtmlSafe(boolean)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#setHtmlSafe(boolean)}
 *  */
    @Test
    public void testSetHtmlSafe() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        jsonWriter.setHtmlSafe(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.beginArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beginArray()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:288) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {16};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:288) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:288) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:288) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7, 610};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:328)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:288) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {6, 610};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:328)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:288) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_6() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:326)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_7() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1, 610};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:328)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beginArray()}
 * @utbot.invokes com.google.gson.stream.JsonWriter#open(int,java.lang.String)
 * @utbot.returnsFrom {@code return open(EMPTY_ARRAY, "[");}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return open(EMPTY_ARRAY, "[");
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_8() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {7, 610};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beginArray] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.open(JsonWriter.java:328)
            com.google.gson.stream.JsonWriter.beginArray(JsonWriter.java:289) */
        jsonWriter.beginArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.endObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endObject()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.invokes com.google.gson.stream.JsonWriter#close(int,int,java.lang.String)
 * @utbot.returnsFrom {@code return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");}
 *  */
    @Test
    public void testEndObject_JsonWriterClose() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        JsonWriter actual = jsonWriter.endObject();
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        StringBuffer jsonWriterOutBuf = ((StringBuffer) getFieldValue(jsonWriterOut, "java.io.StringWriter", "buf"));
        StringBuffer actualOutBuf = ((StringBuffer) getFieldValue(actualOut, "java.io.StringWriter", "buf"));
        String actualOutBufToStringCache = ((String) getFieldValue(actualOutBuf, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutBufToStringCache);
        
        byte[] jsonWriterOutBufValue = ((byte[]) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutBufValue = ((byte[]) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "value"));
        int jsonWriterOutBufValueSize = jsonWriterOutBufValue.length;
        assertEquals(jsonWriterOutBufValueSize, actualOutBufValue.length);
        assertArrayEquals(jsonWriterOutBufValue, actualOutBufValue);
        
        byte jsonWriterOutBufCoder = ((Byte) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutBufCoder = ((Byte) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(jsonWriterOutBufCoder, actualOutBufCoder);
        
        int jsonWriterOutBufCount = ((Integer) getFieldValue(jsonWriterOutBuf, "java.lang.AbstractStringBuilder", "count"));
        int actualOutBufCount = ((Integer) getFieldValue(actualOutBuf, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(jsonWriterOutBufCount, actualOutBufCount);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        int jsonWriterStackSize = jsonWriterStack.length;
        assertEquals(jsonWriterStackSize, actualStack.length);
        org.junit.Assert.assertArrayEquals(jsonWriterStack, actualStack);
        
        int jsonWriterStackSize1 = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize1, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
        int finalJsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        
        assertEquals(0, finalJsonWriterStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endObject()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:338)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:340)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:338)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:338)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.IllegalStateException: Dangling name: ]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:343)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.IllegalStateException: Dangling name: ]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:343)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:338)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:350)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:348)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:350)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.returnsFrom {@code return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {-255, 3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:350)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#endObject()}
 * @utbot.returnsFrom {@code return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return close(EMPTY_OBJECT, NONEMPTY_OBJECT, "}");
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.endObject] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.close(JsonWriter.java:350)
            com.google.gson.stream.JsonWriter.endObject(JsonWriter.java:318) */
        jsonWriter.endObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.beforeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method beforeValue()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.activatesSwitch {@code switch(peek()) case: EMPTY_DOCUMENT}
 *  */
    @Test
    public void testBeforeValue_SwitchPeekCaseEMPTY_DOCUMENT() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {6};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack, 0));
        
        assertEquals(7, finalJsonWriterStack0);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.executesCondition {@code (!lenient): False}
 * @utbot.activatesSwitch {@code switch(peek()) case: NONEMPTY_DOCUMENT}
 *  */
    @Test
    public void testBeforeValue_Lenient() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 *  */
    @Test
    public void testBeforeValue() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack, 0));
        
        assertEquals(2, finalJsonWriterStack0);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 *  */
    @Test
    public void testBeforeValue_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack, 0));
        
        assertEquals(2, finalJsonWriterStack0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method beforeValue()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests activate {@code switch(peek()) case: NONEMPTY_ARRAY}, invoke:
    ///     {@link java.io.Writer#append(char)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.invokes com.google.gson.stream.JsonWriter#newline()
 *  */
    @Test
    public void testBeforeValue_JsonWriterNewline() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        StringBuffer buf = new StringBuffer("");
        setField(out, "java.io.StringWriter", "buf", buf);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 *  */
    @Test
    public void testBeforeValue_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(out, "java.io.Writer", "lock", lock);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {2, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        boolean finalJsonWriterOutTrouble = ((Boolean) getFieldValue(jsonWriterOut, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalJsonWriterOutTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 *  */
    @Test
    public void testBeforeValue_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(out1, "java.io.Writer", "lock", lock);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(out, "java.io.Writer", "lock", lock);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {-255, 2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        Writer jsonWriterOutOutOut = ((Writer) getFieldValue(jsonWriterOut, "java.io.PrintWriter", "out"));
        boolean finalJsonWriterOutOutTrouble = ((Boolean) getFieldValue(jsonWriterOutOutOut, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalJsonWriterOutOutTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beforeValue()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: switch(peek())
 *  */
    @Test
    public void testBeforeValue_ThrowIllegalStateException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.executesCondition {@code (!lenient): True}
 * @utbot.activatesSwitch {@code switch(peek()) case: NONEMPTY_DOCUMENT}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !lenient
 *  */
    @Test
    public void testBeforeValue_ThrowIllegalStateException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.activatesSwitch {@code switch(peek()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(peek()) case: default
 *  */
    @Test
    public void testBeforeValue_ThrowIllegalStateException_2() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.activatesSwitch {@code switch(peek()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(peek()) case: default
 *  */
    @Test
    public void testBeforeValue_ThrowIllegalStateException_3() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.activatesSwitch {@code switch(peek()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(peek()) case: default
 *  */
    @Test
    public void testBeforeValue_ThrowIllegalStateException_4() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(peek())
 *  */
    @Test
    public void testBeforeValue_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(peek())
 *  */
    @Test
    public void testBeforeValue_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(peek())
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.invokes {@link java.io.Writer#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(',');
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.invokes {@link java.io.Writer#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(separator);
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException_2() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newline();
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException_3() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.invokes {@link java.io.Writer#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException_4() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException_5() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException_6() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException_7() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {-254, 4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        String separator = " ";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "separator", separator);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeValue_ThrowNullPointerException_8() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeValueMethod = jsonWriterClazz.getDeclaredMethod("beforeValue");
        beforeValueMethod.setAccessible(true);
        java.lang.Object[] beforeValueMethodArguments = new java.lang.Object[0];
        try {
            beforeValueMethod.invoke(jsonWriter, beforeValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.beforeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method beforeName()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.invokes com.google.gson.stream.JsonWriter#replaceTop(int)
 *  */
    @Test
    public void testBeforeName_JsonWriterReplaceTop() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, 3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack1 = ((Integer) get(jsonWriterStack, 1));
        
        assertEquals(4, finalJsonWriterStack1);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 *  */
    @Test
    public void testBeforeName() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        
        Writer jsonWriterOut = ((Writer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "out"));
        boolean finalJsonWriterOutTrouble = ((Boolean) getFieldValue(jsonWriterOut, "java.io.PrintWriter", "trouble"));
        int[] jsonWriterStack = ((int[]) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stack"));
        int finalJsonWriterStack0 = ((Integer) get(jsonWriterStack, 0));
        
        assertTrue(finalJsonWriterOutTrouble);
        
        assertEquals(4, finalJsonWriterStack0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beforeName()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int context = peek();
 *  */
    @Test
    public void testBeforeName_ThrowIllegalStateException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.executesCondition {@code (context == NONEMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (context != EMPTY_OBJECT): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: context != EMPTY_OBJECT
 *  */
    @Test
    public void testBeforeName_ThrowIllegalStateException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int context = peek();
 *  */
    @Test
    public void testBeforeName_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int context = peek();
 *  */
    @Test
    public void testBeforeName_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int context = peek();
 *  */
    @Test
    public void testBeforeName_ThrowNullPointerException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.executesCondition {@code (context == NONEMPTY_OBJECT): True}
 * @utbot.invokes {@link java.io.Writer#write(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(',');
 *  */
    @Test
    public void testBeforeName_ThrowNullPointerException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, 5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.executesCondition {@code (context == NONEMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (context != EMPTY_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newline();
 *  */
    @Test
    public void testBeforeName_ThrowNullPointerException_2() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.executesCondition {@code (context == NONEMPTY_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeName_ThrowNullPointerException_3() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.executesCondition {@code (context == NONEMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (context != EMPTY_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeName_ThrowNullPointerException_4() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.executesCondition {@code (context == NONEMPTY_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeName_ThrowNullPointerException_5() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.executesCondition {@code (context == NONEMPTY_OBJECT): False}
 * @utbot.executesCondition {@code (context != EMPTY_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBeforeName_ThrowNullPointerException_6() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out1 = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.beforeName] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method beforeName()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#beforeName()}
 * @utbot.executesCondition {@code (context == NONEMPTY_OBJECT): True}
 * @utbot.invokes com.google.gson.stream.JsonWriter#peek()
 * @utbot.invokes {@link java.io.Writer#write(int)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(',');
 *  */
    @Test(expected = IOException.class)
    public void testBeforeName_ThrowIOException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method beforeNameMethod = jsonWriterClazz.getDeclaredMethod("beforeName");
        beforeNameMethod.setAccessible(true);
        java.lang.Object[] beforeNameMethodArguments = new java.lang.Object[0];
        try {
            beforeNameMethod.invoke(jsonWriter, beforeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.writeDeferredName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeDeferredName()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#writeDeferredName()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 *  */
    @Test
    public void testWriteDeferredName_DeferredNameEqualsNull() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method writeDeferredNameMethod = jsonWriterClazz.getDeclaredMethod("writeDeferredName");
        writeDeferredNameMethod.setAccessible(true);
        java.lang.Object[] writeDeferredNameMethodArguments = new java.lang.Object[0];
        writeDeferredNameMethod.invoke(jsonWriter, writeDeferredNameMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeDeferredName()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#writeDeferredName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeName();
 *  */
    @Test
    public void testWriteDeferredName_ThrowIllegalStateException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.writeDeferredName] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method writeDeferredNameMethod = jsonWriterClazz.getDeclaredMethod("writeDeferredName");
        writeDeferredNameMethod.setAccessible(true);
        java.lang.Object[] writeDeferredNameMethodArguments = new java.lang.Object[0];
        try {
            writeDeferredNameMethod.invoke(jsonWriter, writeDeferredNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#writeDeferredName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeName();
 *  */
    @Test
    public void testWriteDeferredName_ThrowIllegalStateException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.writeDeferredName] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method writeDeferredNameMethod = jsonWriterClazz.getDeclaredMethod("writeDeferredName");
        writeDeferredNameMethod.setAccessible(true);
        java.lang.Object[] writeDeferredNameMethodArguments = new java.lang.Object[0];
        try {
            writeDeferredNameMethod.invoke(jsonWriter, writeDeferredNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#writeDeferredName()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beforeName();
 *  */
    @Test
    public void testWriteDeferredName_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.writeDeferredName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method writeDeferredNameMethod = jsonWriterClazz.getDeclaredMethod("writeDeferredName");
        writeDeferredNameMethod.setAccessible(true);
        java.lang.Object[] writeDeferredNameMethodArguments = new java.lang.Object[0];
        try {
            writeDeferredNameMethod.invoke(jsonWriter, writeDeferredNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#writeDeferredName()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beforeName();
 *  */
    @Test
    public void testWriteDeferredName_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.writeDeferredName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method writeDeferredNameMethod = jsonWriterClazz.getDeclaredMethod("writeDeferredName");
        writeDeferredNameMethod.setAccessible(true);
        java.lang.Object[] writeDeferredNameMethodArguments = new java.lang.Object[0];
        try {
            writeDeferredNameMethod.invoke(jsonWriter, writeDeferredNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#writeDeferredName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeName();
 *  */
    @Test
    public void testWriteDeferredName_ThrowNullPointerException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.writeDeferredName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method writeDeferredNameMethod = jsonWriterClazz.getDeclaredMethod("writeDeferredName");
        writeDeferredNameMethod.setAccessible(true);
        java.lang.Object[] writeDeferredNameMethodArguments = new java.lang.Object[0];
        try {
            writeDeferredNameMethod.invoke(jsonWriter, writeDeferredNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#writeDeferredName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeName();
 *  */
    @Test
    public void testWriteDeferredName_ThrowNullPointerException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.writeDeferredName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method writeDeferredNameMethod = jsonWriterClazz.getDeclaredMethod("writeDeferredName");
        writeDeferredNameMethod.setAccessible(true);
        java.lang.Object[] writeDeferredNameMethodArguments = new java.lang.Object[0];
        try {
            writeDeferredNameMethod.invoke(jsonWriter, writeDeferredNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#writeDeferredName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeName();
 *  */
    @Test
    public void testWriteDeferredName_ThrowNullPointerException_2() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.writeDeferredName] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Method writeDeferredNameMethod = jsonWriterClazz.getDeclaredMethod("writeDeferredName");
        writeDeferredNameMethod.setAccessible(true);
        java.lang.Object[] writeDeferredNameMethodArguments = new java.lang.Object[0];
        try {
            writeDeferredNameMethod.invoke(jsonWriter, writeDeferredNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.nullValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nullValue()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): True}
 * @utbot.executesCondition {@code (serializeNulls): False}
 *  */
    @Test
    public void testNullValue_NotSerializeNulls() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        JsonWriter actual = jsonWriter.nullValue();
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack);
        
        int jsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nullValue()
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): True}
 * @utbot.executesCondition {@code (serializeNulls): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testNullValue_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowIllegalStateException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowIllegalStateException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowIllegalStateException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): True}
 * @utbot.executesCondition {@code (serializeNulls): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testNullValue_ThrowIllegalStateException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowIllegalStateException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): True}
 * @utbot.executesCondition {@code (serializeNulls): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testNullValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1073741825);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write("null");
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {6};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write("null");
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        jsonWriter.setLenient(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): True}
 * @utbot.executesCondition {@code (serializeNulls): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", indent);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:617)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): True}
 * @utbot.executesCondition {@code (serializeNulls): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write("null");
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_6() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_7() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_8() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {1};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String indent = "";
        jsonWriter.setIndent(indent);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.newline(JsonWriter.java:600)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:641)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453) */
        jsonWriter.nullValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.executesCondition {@code (deferredName != null): False}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.invokes {@link java.io.Writer#write(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testNullValue_ThrowNullPointerException_9() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "out", out);
        int[] stack = {6};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.nullValue] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:454) */
        jsonWriter.nullValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.replaceTop
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceTop(int)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#replaceTop(int)}
 *  */
    @Test
    public void testReplaceTop() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method replaceTopMethod = jsonWriterClazz.getDeclaredMethod("replaceTop", intType);
        replaceTopMethod.setAccessible(true);
        java.lang.Object[] replaceTopMethodArguments = new java.lang.Object[1];
        replaceTopMethodArguments[0] = -255;
        replaceTopMethod.invoke(jsonWriter, replaceTopMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceTop(int)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#replaceTop(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[stackSize - 1] = topOfStack;
 *  */
    @Test
    public void testReplaceTop_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.replaceTop] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.replaceTop(JsonWriter.java:375) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method replaceTopMethod = jsonWriterClazz.getDeclaredMethod("replaceTop", intType);
        replaceTopMethod.setAccessible(true);
        java.lang.Object[] replaceTopMethodArguments = new java.lang.Object[1];
        replaceTopMethodArguments[0] = -255;
        try {
            replaceTopMethod.invoke(jsonWriter, replaceTopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#replaceTop(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[stackSize - 1] = topOfStack;
 *  */
    @Test
    public void testReplaceTop_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.replaceTop] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 2]
            com.google.gson.stream.JsonWriter.replaceTop(JsonWriter.java:375) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method replaceTopMethod = jsonWriterClazz.getDeclaredMethod("replaceTop", intType);
        replaceTopMethod.setAccessible(true);
        java.lang.Object[] replaceTopMethodArguments = new java.lang.Object[1];
        replaceTopMethodArguments[0] = -255;
        try {
            replaceTopMethod.invoke(jsonWriter, replaceTopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#replaceTop(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stack[stackSize - 1] = topOfStack;
 *  */
    @Test
    public void testReplaceTop_ThrowNullPointerException() throws Throwable  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.replaceTop] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.replaceTop(JsonWriter.java:375) */
        Class jsonWriterClazz = Class.forName("com.google.gson.stream.JsonWriter");
        Class intType = int.class;
        Method replaceTopMethod = jsonWriterClazz.getDeclaredMethod("replaceTop", intType);
        replaceTopMethod.setAccessible(true);
        java.lang.Object[] replaceTopMethodArguments = new java.lang.Object[1];
        replaceTopMethodArguments[0] = -255;
        try {
            replaceTopMethod.invoke(jsonWriter, replaceTopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.stream.JsonWriter.jsonValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method jsonValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.returnsFrom {@code return nullValue();}
 *  */
    @Test
    public void testJsonValue_ValueEqualsNull() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        JsonWriter actual = jsonWriter.jsonValue(null);
        
        Writer actualOut = ((Writer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "out"));
        assertNull(actualOut);
        
        int[] actualStack = ((int[]) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stack"));
        assertNull(actualStack);
        
        int jsonWriterStackSize = ((Integer) getFieldValue(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize"));
        int actualStackSize = ((Integer) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "stackSize"));
        assertEquals(jsonWriterStackSize, actualStackSize);
        
        String actualIndent = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "indent"));
        assertNull(actualIndent);
        
        String actualSeparator = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "separator"));
        assertNull(actualSeparator);
        
        boolean actualLenient = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "lenient"));
        assertFalse(actualLenient);
        
        boolean actualHtmlSafe = ((Boolean) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "htmlSafe"));
        assertFalse(actualHtmlSafe);
        
        String actualDeferredName = ((String) getFieldValue(actual, "com.google.gson.stream.JsonWriter", "deferredName"));
        assertNull(actualDeferredName);
        
        boolean actualSerializeNulls = actual.getSerializeNulls();
        assertFalse(actualSerializeNulls);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method jsonValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testJsonValue_ThrowIllegalStateException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.IllegalStateException: JsonWriter is closed.]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:366)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:433) */
        jsonWriter.jsonValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testJsonValue_ThrowIllegalStateException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {7};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.IllegalStateException: JSON must have only one top-level value.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:631)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:431) */
        jsonWriter.jsonValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return nullValue();
 *  */
    @Test
    public void testJsonValue_ThrowIllegalStateException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:431) */
        jsonWriter.jsonValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testJsonValue_ThrowIllegalStateException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:434) */
        jsonWriter.jsonValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: writeDeferredName();
 *  */
    @Test
    public void testJsonValue_ThrowIllegalStateException_4() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:615)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:433) */
        jsonWriter.jsonValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: beforeValue();
 *  */
    @Test
    public void testJsonValue_ThrowIllegalStateException_5() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:434) */
        jsonWriter.jsonValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testJsonValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {-255, -255};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 128);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 2]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:431) */
        jsonWriter.jsonValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beforeValue();
 *  */
    @Test
    public void testJsonValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", -1073741824);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1073741825 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:434) */
        jsonWriter.jsonValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testJsonValue_ThrowNullPointerException() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        jsonWriter.setSerializeNulls(true);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:611)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:447)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:431) */
        jsonWriter.jsonValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeDeferredName();
 *  */
    @Test
    public void testJsonValue_ThrowNullPointerException_1() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {5};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeName(JsonWriter.java:613)
            com.google.gson.stream.JsonWriter.writeDeferredName(JsonWriter.java:400)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:433) */
        jsonWriter.jsonValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beforeValue();
 *  */
    @Test
    public void testJsonValue_ThrowNullPointerException_2() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        String string = "";
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:434) */
        jsonWriter.jsonValue(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriter}
 * @utbot.methodUnderTest {@link com.google.gson.stream.JsonWriter#jsonValue(java.lang.String)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nullValue();
 *  */
    @Test
    public void testJsonValue_ThrowNullPointerException_3() throws Exception  {
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {4};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.stream.JsonWriter.jsonValue] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:650)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.stream.JsonWriter.jsonValue(JsonWriter.java:431) */
        jsonWriter.jsonValue(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1016538179541200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1016538179541200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1016538179551500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016538179541200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016538179551500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1016538179942500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1016538179942500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1016538179945500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016538179942500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016538179945500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

