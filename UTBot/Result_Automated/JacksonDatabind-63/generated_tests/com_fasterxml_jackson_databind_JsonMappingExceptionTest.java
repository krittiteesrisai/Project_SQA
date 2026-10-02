package com.fasterxml.jackson.databind;

import org.junit.Test;
import com.fasterxml.jackson.core.JsonLocation;
import java.util.LinkedList;
import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import java.util.List;
import java.io.Closeable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.util.Collection;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_JsonMappingExceptionTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#toString()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#getMessage()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return getClass().getName() + ": " + getMessage();}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        String actual = jsonMappingException.toString();
        
        String expected = "com.fasterxml.jackson.databind.JsonMappingException: N/A";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(jsonMappingException, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        String detailMessage = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException.toString();
        
        String expected = "com.fasterxml.jackson.databind.JsonMappingException: \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n at [Source: UNKNOWN; line: 0, column: 0]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(jsonMappingException, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        
        String actual = jsonMappingException.toString();
        
        String expected = "com.fasterxml.jackson.databind.JsonMappingException: N/A\n at [Source: UNKNOWN; line: 0, column: 0]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        jsonMappingException._path = _path;
        String detailMessage = "\u0000\u0000\u0000\u0000";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException.toString();
        
        String expected = "com.fasterxml.jackson.databind.JsonMappingException: \u0000\u0000\u0000\u0000 (through reference chain: )";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        jsonMappingException._path = _path;
        
        String actual = jsonMappingException.toString();
        
        String expected = "com.fasterxml.jackson.databind.JsonMappingException: N/A (through reference chain: )";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        String detailMessage = "";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException.toString();
        
        String expected = "com.fasterxml.jackson.databind.JsonMappingException: ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString6() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc(JsonMappingException.java:514)
            com.fasterxml.jackson.databind.JsonMappingException.getPathReference(JsonMappingException.java:413)
            com.fasterxml.jackson.databind.JsonMappingException._buildMessage(JsonMappingException.java:490)
            com.fasterxml.jackson.databind.JsonMappingException.getMessage(JsonMappingException.java:471)
            com.fasterxml.jackson.databind.JsonMappingException.toString(JsonMappingException.java:498) */
        jsonMappingException.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.from
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method from(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.returnsFrom {@code return new JsonMappingException(ctxt.getParser(), msg);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new JsonMappingException(ctxt.getParser(), msg);
 *  */
    @Test
    public void testFrom_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.from] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:288) */
        JsonMappingException.from(((DeserializationContext) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.from
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method from(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.returnsFrom {@code return new JsonMappingException(ctxt.getParser(), msg, t);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new JsonMappingException(ctxt.getParser(), msg, t);
 *  */
    @Test
    public void testFrom_ThrowNullPointerException1() {
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.from] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:295) */
        JsonMappingException.from(((DeserializationContext) null), ((String) null), ((Throwable) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.from
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method from(com.fasterxml.jackson.databind.SerializerProvider, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.databind.SerializerProvider,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getGenerator()}
 * @utbot.returnsFrom {@code return new JsonMappingException(ctxt.getGenerator(), msg);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new JsonMappingException(ctxt.getGenerator(), msg);
 *  */
    @Test
    public void testFrom_ThrowNullPointerException2() {
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.from] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:302) */
        JsonMappingException.from(((SerializerProvider) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.from
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method from(com.fasterxml.jackson.databind.SerializerProvider, java.lang.String, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.databind.SerializerProvider,java.lang.String,java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getGenerator()}
 * @utbot.returnsFrom {@code return new JsonMappingException(ctxt.getGenerator(), msg, problem);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new JsonMappingException(ctxt.getGenerator(), msg, problem);
 *  */
    @Test
    public void testFrom_ThrowNullPointerException3() {
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.from] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:312) */
        JsonMappingException.from(((SerializerProvider) null), ((String) null), ((Throwable) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.from
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method from(com.fasterxml.jackson.core.JsonParser, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonParser,java.lang.String)}
 * @utbot.returnsFrom {@code return new JsonMappingException(p, msg);}
 *  */
    @Test
    public void testFrom_Return() throws Exception  {
        JsonMappingException actual = JsonMappingException.from(((JsonParser) null), ((String) null));
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 11;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7405568;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2168543627920L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.from
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method from(com.fasterxml.jackson.core.JsonParser, java.lang.String, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Throwable)}
 * @utbot.returnsFrom {@code return new JsonMappingException(p, msg, problem);}
 *  */
    @Test
    public void testFrom_Return1() throws Exception  {
        JsonMappingException actual = JsonMappingException.from(((JsonParser) null), ((String) null), ((Throwable) null));
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 9;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2168543627920L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method from(com.fasterxml.jackson.core.JsonParser, java.lang.String, java.lang.Throwable)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Throwable)}
     */
    @Test
    public void testFromWithNonEmptyString() throws Exception  {
        Throwable throwable = new Throwable("#$\\\"'");
        java.lang.StackTraceElement[] stackTraceElementArray = new java.lang.StackTraceElement[2];
        StackTraceElement stackTraceElement = new StackTraceElement("10", "10", "", "-3", "abc", "10", Integer.MAX_VALUE);
        stackTraceElementArray[0] = stackTraceElement;
        StackTraceElement stackTraceElement1 = new StackTraceElement("10", "-3", "#$\\\"'", -1);
        stackTraceElementArray[1] = stackTraceElement1;
        throwable.setStackTrace(stackTraceElementArray);
        
        JsonMappingException actual = JsonMappingException.from(((JsonParser) null), "XZ\u008E", throwable);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 9;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2168543627920L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "XZ\u008E";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        Throwable cause = ((Throwable) createInstance("java.lang.Throwable"));
        java.lang.Object[] backtrace1 = new java.lang.Object[6];
        short[] shortArray1 = new short[32];
        shortArray1[0] = (short) 2;
        shortArray1[1] = (short) 3;
        shortArray1[2] = (short) 1;
        shortArray1[3] = (short) 39;
        shortArray1[4] = (short) 7;
        shortArray1[6] = (short) 1;
        shortArray1[11] = (short) 1;
        shortArray1[12] = (short) 8;
        shortArray1[13] = (short) 1;
        shortArray1[14] = (short) 3;
        shortArray1[15] = (short) 2;
        shortArray1[16] = (short) 4;
        shortArray1[18] = (short) 8;
        shortArray1[19] = (short) 11;
        shortArray1[20] = (short) 16;
        shortArray1[21] = (short) 12;
        shortArray1[22] = (short) 20;
        shortArray1[23] = (short) 5;
        shortArray1[25] = (short) 1;
        shortArray1[29] = (short) 1;
        shortArray1[30] = (short) 1;
        backtrace1[0] = ((Object) shortArray1);
        int[] intArray1 = new int[32];
        intArray1[0] = 1;
        intArray1[1] = 7733249;
        intArray1[2] = 327680;
        intArray1[3] = 4259846;
        intArray1[4] = 1966086;
        intArray1[5] = 2555904;
        intArray1[6] = 327680;
        intArray1[7] = 524288;
        intArray1[8] = 262144;
        intArray1[9] = 262144;
        intArray1[10] = 262144;
        intArray1[11] = 262144;
        intArray1[12] = 851976;
        intArray1[13] = 3997696;
        intArray1[14] = 7536640;
        intArray1[15] = 11993088;
        intArray1[16] = 3538944;
        intArray1[17] = 4128768;
        intArray1[18] = 1441792;
        intArray1[19] = 14024704;
        intArray1[20] = 1900544;
        intArray1[21] = 11534336;
        intArray1[22] = 6553600;
        intArray1[23] = 2097152;
        intArray1[24] = 917504;
        intArray1[25] = 327680;
        intArray1[26] = 3735552;
        intArray1[27] = 1310720;
        intArray1[28] = 2949120;
        intArray1[29] = 65536;
        intArray1[30] = 262144;
        backtrace1[1] = ((Object) intArray1);
        java.lang.Object[] objectArray1 = new java.lang.Object[32];
        Class class21 = Class.forName("jdk.internal.reflect.NativeConstructorAccessorImpl");
        objectArray1[0] = ((Object) class21);
        objectArray1[1] = ((Object) class21);
        Class class22 = Class.forName("jdk.internal.reflect.DelegatingConstructorAccessorImpl");
        objectArray1[2] = ((Object) class22);
        Class class23 = java.lang.reflect.Constructor.class;
        objectArray1[3] = ((Object) class23);
        objectArray1[4] = ((Object) class23);
        Class class24 = Class.forName("org.utbot.instrumentation.instrumentation.execution.constructors.InstrumentationContextAwareValueConstructor$call$2");
        objectArray1[5] = ((Object) class24);
        objectArray1[6] = ((Object) class24);
        objectArray1[7] = ((Object) class6);
        objectArray1[8] = ((Object) class7);
        objectArray1[9] = ((Object) class8);
        objectArray1[10] = ((Object) class9);
        objectArray1[11] = ((Object) class10);
        objectArray1[12] = ((Object) class11);
        objectArray1[13] = ((Object) class12);
        objectArray1[14] = ((Object) class12);
        objectArray1[15] = ((Object) class12);
        objectArray1[16] = ((Object) class12);
        objectArray1[17] = ((Object) class12);
        Class class25 = org.utbot.instrumentation.instrumentation.execution.constructors.InstrumentationContextAwareValueConstructor.class;
        objectArray1[18] = ((Object) class25);
        objectArray1[19] = ((Object) class25);
        objectArray1[20] = ((Object) class25);
        objectArray1[21] = ((Object) class25);
        objectArray1[22] = ((Object) class25);
        Class class26 = org.utbot.instrumentation.instrumentation.execution.phases.ValueConstructionPhase.class;
        objectArray1[23] = ((Object) class26);
        Class class27 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$applyPreprocessing$constructedData$1");
        objectArray1[24] = ((Object) class27);
        objectArray1[25] = ((Object) class27);
        objectArray1[26] = ((Object) class17);
        objectArray1[27] = ((Object) class18);
        objectArray1[28] = ((Object) class19);
        objectArray1[29] = ((Object) class19);
        objectArray1[30] = ((Object) class20);
        backtrace1[2] = objectArray1;
        long[] longArray1 = new long[32];
        longArray1[0] = 2168543592368L;
        longArray1[1] = 2168543633208L;
        longArray1[2] = 2168543633208L;
        longArray1[3] = 2168543734872L;
        longArray1[4] = 2168543633208L;
        longArray1[5] = 2168543584256L;
        longArray1[6] = 2168543584256L;
        longArray1[7] = 2168543584256L;
        longArray1[8] = 2168543584256L;
        longArray1[9] = 2168543584256L;
        longArray1[10] = 2168543584256L;
        longArray1[11] = 2168543591624L;
        longArray1[12] = 2168543632368L;
        longArray1[13] = 2168529966400L;
        longArray1[14] = 2168529966400L;
        longArray1[15] = 2168529966400L;
        longArray1[16] = 2168529966400L;
        longArray1[17] = 2168529966272L;
        longArray1[18] = 2168544395920L;
        longArray1[19] = 2169702032960L;
        longArray1[20] = 2169720074800L;
        longArray1[21] = 2169705401520L;
        longArray1[22] = 2169720075376L;
        longArray1[23] = 2169720075760L;
        longArray1[24] = 2168543584256L;
        longArray1[25] = 2168543584256L;
        longArray1[26] = 2168543584256L;
        longArray1[27] = 2168543584256L;
        longArray1[28] = 2168543584256L;
        longArray1[29] = 2168543584256L;
        longArray1[30] = 2168543591624L;
        backtrace1[3] = ((Object) longArray1);
        setField(cause, "java.lang.Throwable", "backtrace", backtrace1);
        String detailMessage1 = "#$\\\"'";
        setField(cause, "java.lang.Throwable", "detailMessage", detailMessage1);
        setField(cause, "java.lang.Throwable", "cause", cause);
        java.lang.StackTraceElement[] stackTrace = new java.lang.StackTraceElement[2];
        StackTraceElement stackTraceElement2 = ((StackTraceElement) createInstance("java.lang.StackTraceElement"));
        String classLoaderName = "10";
        setField(stackTraceElement2, "java.lang.StackTraceElement", "classLoaderName", classLoaderName);
        setField(stackTraceElement2, "java.lang.StackTraceElement", "moduleName", classLoaderName);
        String moduleVersion = "";
        setField(stackTraceElement2, "java.lang.StackTraceElement", "moduleVersion", moduleVersion);
        String declaringClass = "-3";
        setField(stackTraceElement2, "java.lang.StackTraceElement", "declaringClass", declaringClass);
        String methodName = "abc";
        setField(stackTraceElement2, "java.lang.StackTraceElement", "methodName", methodName);
        setField(stackTraceElement2, "java.lang.StackTraceElement", "fileName", classLoaderName);
        setField(stackTraceElement2, "java.lang.StackTraceElement", "lineNumber", Integer.MAX_VALUE);
        setField(stackTraceElement2, "java.lang.StackTraceElement", "format", (byte) 0);
        stackTrace[0] = stackTraceElement2;
        StackTraceElement stackTraceElement3 = ((StackTraceElement) createInstance("java.lang.StackTraceElement"));
        setField(stackTraceElement3, "java.lang.StackTraceElement", "declaringClass", classLoaderName);
        setField(stackTraceElement3, "java.lang.StackTraceElement", "methodName", declaringClass);
        setField(stackTraceElement3, "java.lang.StackTraceElement", "fileName", detailMessage1);
        setField(stackTraceElement3, "java.lang.StackTraceElement", "lineNumber", -1);
        setField(stackTraceElement3, "java.lang.StackTraceElement", "format", (byte) 0);
        stackTrace[1] = stackTraceElement3;
        cause.setStackTrace(stackTrace);
        setField(cause, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(cause, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        setField(expected, "java.lang.Throwable", "cause", cause);
        java.lang.StackTraceElement[] stackTrace1 = {};
        expected.setStackTrace(stackTrace1);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions1 = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions1);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object expectedCauseBacktrace = getFieldValue(expectedCause, "java.lang.Throwable", "backtrace");
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        int expectedCauseBacktraceSize = getArrayLength(expectedCauseBacktrace);
        assertEquals(expectedCauseBacktraceSize, getArrayLength(actualCauseBacktrace));
        assertTrue(deepEquals(expectedCauseBacktrace, actualCauseBacktrace));
        
        String expectedCauseDetailMessage = ((String) getFieldValue(expectedCause, "java.lang.Throwable", "detailMessage"));
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedCauseDetailMessage, actualCauseDetailMessage);
        
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.from
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method from(com.fasterxml.jackson.core.JsonGenerator, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonGenerator,java.lang.String)}
 * @utbot.returnsFrom {@code return new JsonMappingException(g, msg, (Throwable) null);}
 *  */
    @Test
    public void testFrom_Return2() throws Exception  {
        JsonMappingException actual = JsonMappingException.from(((JsonGenerator) null), ((String) null));
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 13;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 8585216;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2168543627920L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.from
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method from(com.fasterxml.jackson.core.JsonGenerator, java.lang.String, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonGenerator,java.lang.String,java.lang.Throwable)}
 * @utbot.returnsFrom {@code return new JsonMappingException(g, msg, problem);}
 *  */
    @Test
    public void testFrom_Return3() throws Exception  {
        JsonMappingException actual = JsonMappingException.from(((JsonGenerator) null), ((String) null), ((Throwable) null));
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 14;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2168543627920L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method from(com.fasterxml.jackson.core.JsonGenerator, java.lang.String, java.lang.Throwable)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonGenerator,java.lang.String,java.lang.Throwable)}
     */
    @Test
    public void testFromWithNonEmptyString1() throws Exception  {
        Throwable throwable = new Throwable("#$\\\"'");
        java.lang.StackTraceElement[] stackTraceElementArray = new java.lang.StackTraceElement[2];
        StackTraceElement stackTraceElement = new StackTraceElement("10", "10", "", "-3", "abc", "10", Integer.MAX_VALUE);
        stackTraceElementArray[0] = stackTraceElement;
        StackTraceElement stackTraceElement1 = new StackTraceElement("10", "-3", "#$\\\"'", -1);
        stackTraceElementArray[1] = stackTraceElement1;
        throwable.setStackTrace(stackTraceElementArray);
        
        JsonMappingException actual = JsonMappingException.from(((JsonGenerator) null), "XZ\u008E", throwable);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 14;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2168543627920L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "XZ\u008E";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        Throwable cause = ((Throwable) createInstance("java.lang.Throwable"));
        java.lang.Object[] backtrace1 = new java.lang.Object[6];
        short[] shortArray1 = new short[32];
        shortArray1[0] = (short) 2;
        shortArray1[1] = (short) 3;
        shortArray1[2] = (short) 1;
        shortArray1[3] = (short) 39;
        shortArray1[4] = (short) 7;
        shortArray1[6] = (short) 1;
        shortArray1[11] = (short) 1;
        shortArray1[12] = (short) 8;
        shortArray1[13] = (short) 1;
        shortArray1[14] = (short) 3;
        shortArray1[15] = (short) 2;
        shortArray1[16] = (short) 4;
        shortArray1[18] = (short) 8;
        shortArray1[19] = (short) 11;
        shortArray1[20] = (short) 16;
        shortArray1[21] = (short) 12;
        shortArray1[22] = (short) 20;
        shortArray1[23] = (short) 5;
        shortArray1[25] = (short) 1;
        shortArray1[29] = (short) 1;
        shortArray1[30] = (short) 1;
        backtrace1[0] = ((Object) shortArray1);
        int[] intArray1 = new int[32];
        intArray1[0] = 1;
        intArray1[1] = 7733249;
        intArray1[2] = 327680;
        intArray1[3] = 4259846;
        intArray1[4] = 1966086;
        intArray1[5] = 2555904;
        intArray1[6] = 327680;
        intArray1[7] = 524288;
        intArray1[8] = 262144;
        intArray1[9] = 262144;
        intArray1[10] = 262144;
        intArray1[11] = 262144;
        intArray1[12] = 851976;
        intArray1[13] = 3997696;
        intArray1[14] = 7536640;
        intArray1[15] = 11993088;
        intArray1[16] = 3538944;
        intArray1[17] = 4128768;
        intArray1[18] = 1441792;
        intArray1[19] = 14024704;
        intArray1[20] = 1900544;
        intArray1[21] = 11534336;
        intArray1[22] = 6553600;
        intArray1[23] = 2097152;
        intArray1[24] = 917504;
        intArray1[25] = 327680;
        intArray1[26] = 3735552;
        intArray1[27] = 1310720;
        intArray1[28] = 2949120;
        intArray1[29] = 65536;
        intArray1[30] = 262144;
        backtrace1[1] = ((Object) intArray1);
        java.lang.Object[] objectArray1 = new java.lang.Object[32];
        Class class21 = Class.forName("jdk.internal.reflect.NativeConstructorAccessorImpl");
        objectArray1[0] = ((Object) class21);
        objectArray1[1] = ((Object) class21);
        Class class22 = Class.forName("jdk.internal.reflect.DelegatingConstructorAccessorImpl");
        objectArray1[2] = ((Object) class22);
        Class class23 = java.lang.reflect.Constructor.class;
        objectArray1[3] = ((Object) class23);
        objectArray1[4] = ((Object) class23);
        Class class24 = Class.forName("org.utbot.instrumentation.instrumentation.execution.constructors.InstrumentationContextAwareValueConstructor$call$2");
        objectArray1[5] = ((Object) class24);
        objectArray1[6] = ((Object) class24);
        objectArray1[7] = ((Object) class6);
        objectArray1[8] = ((Object) class7);
        objectArray1[9] = ((Object) class8);
        objectArray1[10] = ((Object) class9);
        objectArray1[11] = ((Object) class10);
        objectArray1[12] = ((Object) class11);
        objectArray1[13] = ((Object) class12);
        objectArray1[14] = ((Object) class12);
        objectArray1[15] = ((Object) class12);
        objectArray1[16] = ((Object) class12);
        objectArray1[17] = ((Object) class12);
        Class class25 = org.utbot.instrumentation.instrumentation.execution.constructors.InstrumentationContextAwareValueConstructor.class;
        objectArray1[18] = ((Object) class25);
        objectArray1[19] = ((Object) class25);
        objectArray1[20] = ((Object) class25);
        objectArray1[21] = ((Object) class25);
        objectArray1[22] = ((Object) class25);
        Class class26 = org.utbot.instrumentation.instrumentation.execution.phases.ValueConstructionPhase.class;
        objectArray1[23] = ((Object) class26);
        Class class27 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$applyPreprocessing$constructedData$1");
        objectArray1[24] = ((Object) class27);
        objectArray1[25] = ((Object) class27);
        objectArray1[26] = ((Object) class17);
        objectArray1[27] = ((Object) class18);
        objectArray1[28] = ((Object) class19);
        objectArray1[29] = ((Object) class19);
        objectArray1[30] = ((Object) class20);
        backtrace1[2] = objectArray1;
        long[] longArray1 = new long[32];
        longArray1[0] = 2168543592368L;
        longArray1[1] = 2168543633208L;
        longArray1[2] = 2168543633208L;
        longArray1[3] = 2168543734872L;
        longArray1[4] = 2168543633208L;
        longArray1[5] = 2168543584256L;
        longArray1[6] = 2168543584256L;
        longArray1[7] = 2168543584256L;
        longArray1[8] = 2168543584256L;
        longArray1[9] = 2168543584256L;
        longArray1[10] = 2168543584256L;
        longArray1[11] = 2168543591624L;
        longArray1[12] = 2168543632368L;
        longArray1[13] = 2168529966400L;
        longArray1[14] = 2168529966400L;
        longArray1[15] = 2168529966400L;
        longArray1[16] = 2168529966400L;
        longArray1[17] = 2168529966272L;
        longArray1[18] = 2168544395920L;
        longArray1[19] = 2169702032960L;
        longArray1[20] = 2169720074800L;
        longArray1[21] = 2169705401520L;
        longArray1[22] = 2169720075376L;
        longArray1[23] = 2169720075760L;
        longArray1[24] = 2168543584256L;
        longArray1[25] = 2168543584256L;
        longArray1[26] = 2168543584256L;
        longArray1[27] = 2168543584256L;
        longArray1[28] = 2168543584256L;
        longArray1[29] = 2168543584256L;
        longArray1[30] = 2168543591624L;
        backtrace1[3] = ((Object) longArray1);
        setField(cause, "java.lang.Throwable", "backtrace", backtrace1);
        String detailMessage1 = "#$\\\"'";
        setField(cause, "java.lang.Throwable", "detailMessage", detailMessage1);
        setField(cause, "java.lang.Throwable", "cause", cause);
        java.lang.StackTraceElement[] stackTrace = new java.lang.StackTraceElement[2];
        StackTraceElement stackTraceElement2 = ((StackTraceElement) createInstance("java.lang.StackTraceElement"));
        String classLoaderName = "10";
        setField(stackTraceElement2, "java.lang.StackTraceElement", "classLoaderName", classLoaderName);
        setField(stackTraceElement2, "java.lang.StackTraceElement", "moduleName", classLoaderName);
        String moduleVersion = "";
        setField(stackTraceElement2, "java.lang.StackTraceElement", "moduleVersion", moduleVersion);
        String declaringClass = "-3";
        setField(stackTraceElement2, "java.lang.StackTraceElement", "declaringClass", declaringClass);
        String methodName = "abc";
        setField(stackTraceElement2, "java.lang.StackTraceElement", "methodName", methodName);
        setField(stackTraceElement2, "java.lang.StackTraceElement", "fileName", classLoaderName);
        setField(stackTraceElement2, "java.lang.StackTraceElement", "lineNumber", Integer.MAX_VALUE);
        setField(stackTraceElement2, "java.lang.StackTraceElement", "format", (byte) 0);
        stackTrace[0] = stackTraceElement2;
        StackTraceElement stackTraceElement3 = ((StackTraceElement) createInstance("java.lang.StackTraceElement"));
        setField(stackTraceElement3, "java.lang.StackTraceElement", "declaringClass", classLoaderName);
        setField(stackTraceElement3, "java.lang.StackTraceElement", "methodName", declaringClass);
        setField(stackTraceElement3, "java.lang.StackTraceElement", "fileName", detailMessage1);
        setField(stackTraceElement3, "java.lang.StackTraceElement", "lineNumber", -1);
        setField(stackTraceElement3, "java.lang.StackTraceElement", "format", (byte) 0);
        stackTrace[1] = stackTraceElement3;
        cause.setStackTrace(stackTrace);
        setField(cause, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(cause, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        setField(expected, "java.lang.Throwable", "cause", cause);
        java.lang.StackTraceElement[] stackTrace1 = {};
        expected.setStackTrace(stackTrace1);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions1 = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions1);
        
        LinkedList actual_path = actual._path;
        assertNull(actual_path);
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object expectedCauseBacktrace = getFieldValue(expectedCause, "java.lang.Throwable", "backtrace");
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        int expectedCauseBacktraceSize = getArrayLength(expectedCauseBacktrace);
        assertEquals(expectedCauseBacktraceSize, getArrayLength(actualCauseBacktrace));
        assertTrue(deepEquals(expectedCauseBacktrace, actualCauseBacktrace));
        
        String expectedCauseDetailMessage = ((String) getFieldValue(expectedCause, "java.lang.Throwable", "detailMessage"));
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedCauseDetailMessage, actualCauseDetailMessage);
        
        assertTrue(deepEquals(expectedCause, actualCause));
        java.lang.StackTraceElement[] expectedCauseStackTrace = expectedCause.getStackTrace();
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        int expectedCauseStackTraceSize = expectedCauseStackTrace.length;
        assertEquals(expectedCauseStackTraceSize, actualCauseStackTrace.length);
        assertTrue(deepEquals(expectedCauseStackTrace, actualCauseStackTrace));
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List expectedCauseSuppressedExceptions = ((List) getFieldValue(expectedCause, "java.lang.Throwable", "suppressedExceptions"));
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedCauseSuppressedExceptions, actualCauseSuppressedExceptions));
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.getMessage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMessage()
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#getMessage()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#_buildMessage()}
 * @utbot.returnsFrom {@code return _buildMessage();}
 *  */
    @Test
    public void testGetMessage_JsonMappingException_buildMessage() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        String detailMessage = "";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException.getMessage();
        
        assertEquals(detailMessage, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMessage()
    
    @Test
    public void testGetMessage1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(jsonMappingException, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        String detailMessage = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException.getMessage();
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n at [Source: UNKNOWN; line: 0, column: 0]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetMessage2() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(jsonMappingException, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        
        String actual = jsonMappingException.getMessage();
        
        String expected = "N/A\n at [Source: UNKNOWN; line: 0, column: 0]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetMessage3() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        jsonMappingException._path = _path;
        
        String actual = jsonMappingException.getMessage();
        
        String expected = "N/A (through reference chain: )";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetMessage4() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        String actual = jsonMappingException.getMessage();
        
        String expected = "N/A";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMessage()
    
    @Test
    public void testGetMessage5() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        String detailMessage = "";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.getMessage] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc(JsonMappingException.java:514)
            com.fasterxml.jackson.databind.JsonMappingException.getPathReference(JsonMappingException.java:413)
            com.fasterxml.jackson.databind.JsonMappingException._buildMessage(JsonMappingException.java:490)
            com.fasterxml.jackson.databind.JsonMappingException.getMessage(JsonMappingException.java:471) */
        jsonMappingException.getMessage();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.getLocalizedMessage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocalizedMessage()
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#getLocalizedMessage()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#_buildMessage()}
 * @utbot.returnsFrom {@code return _buildMessage();}
 *  */
    @Test
    public void testGetLocalizedMessage_JsonMappingException_buildMessage() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        String detailMessage = "";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException.getLocalizedMessage();
        
        assertEquals(detailMessage, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLocalizedMessage()
    
    @Test
    public void testGetLocalizedMessage1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(jsonMappingException, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        String detailMessage = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException.getLocalizedMessage();
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n at [Source: UNKNOWN; line: 0, column: 0]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetLocalizedMessage2() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(jsonMappingException, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        
        String actual = jsonMappingException.getLocalizedMessage();
        
        String expected = "N/A\n at [Source: UNKNOWN; line: 0, column: 0]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetLocalizedMessage3() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        jsonMappingException._path = _path;
        
        String actual = jsonMappingException.getLocalizedMessage();
        
        String expected = "N/A (through reference chain: )";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetLocalizedMessage4() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        String actual = jsonMappingException.getLocalizedMessage();
        
        String expected = "N/A";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLocalizedMessage()
    
    @Test
    public void testGetLocalizedMessage5() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        String detailMessage = "";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.getLocalizedMessage] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc(JsonMappingException.java:514)
            com.fasterxml.jackson.databind.JsonMappingException.getPathReference(JsonMappingException.java:413)
            com.fasterxml.jackson.databind.JsonMappingException._buildMessage(JsonMappingException.java:490)
            com.fasterxml.jackson.databind.JsonMappingException.getLocalizedMessage(JsonMappingException.java:462) */
        jsonMappingException.getLocalizedMessage();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.getPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPath()
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#getPath()}
 * @utbot.executesCondition {@code (_path == null): True}
 * @utbot.invokes {@link java.util.Collections#emptyList()}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testGetPath__pathEqualsNull() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        List actual = jsonMappingException.getPath();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#getPath()}
 * @utbot.executesCondition {@code (_path == null): False}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(_path);}
 *  */
    @Test
    public void testGetPath__pathNotEqualsNull() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        jsonMappingException._path = _path;
        
        List actual = jsonMappingException.getPath();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fromUnexpectedIOE(java.io.IOException)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#fromUnexpectedIOE(java.io.IOException)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.io.IOException#getMessage()}
 * @utbot.invokes {@link java.lang.String#format(java.lang.String,java.lang.Object[])}
 * @utbot.returnsFrom {@code return new JsonMappingException(null, String.format("Unexpected IOException (of type %s): %s", src.getClass().getName(), src.getMessage()));}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new JsonMappingException(null, String.format("Unexpected IOException (of type %s): %s", src.getClass().getName(), src.getMessage()));
 *  */
    @Test
    public void testFromUnexpectedIOE_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(JsonMappingException.java:325) */
        JsonMappingException.fromUnexpectedIOE(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.prependPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prependPath(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#prependPath(java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testPrependPath_1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        String string = "";
        
        jsonMappingException.prependPath(((Object) null), string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#prependPath(java.lang.Object,java.lang.String)}
 *  */
    @Test
    public void testPrependPath() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        String string = "";
        
        jsonMappingException.prependPath(((Object) null), string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependPath(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#prependPath(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Reference ref = new Reference(referrer, fieldName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPrependPath_ThrowNullPointerException() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        jsonMappingException.prependPath(((Object) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.prependPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prependPath(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#prependPath(java.lang.Object,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#prependPath(com.fasterxml.jackson.databind.JsonMappingException.Reference)}
 *  */
    @Test
    public void testPrependPath_JsonMappingExceptionPrependPath() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        jsonMappingException.prependPath(((Object) null), -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method prependPath(java.lang.Object, int)
    
    @Test
    public void testPrependPath1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        jsonMappingException._path = _path;
        Object object = new Object();
        
        jsonMappingException.prependPath(object, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.prependPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prependPath(com.fasterxml.jackson.databind.JsonMappingException$Reference)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#prependPath(com.fasterxml.jackson.databind.JsonMappingException.Reference)}
 * @utbot.executesCondition {@code (_path == null): True}
 * @utbot.executesCondition {@code (_path.size() < MAX_REFS_TO_LIST): True}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.invokes {@link java.util.LinkedList#addFirst(java.lang.Object)}
 *  */
    @Test
    public void testPrependPath__pathSizeLessThanMAX_REFS_TO_LIST() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        jsonMappingException.prependPath(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method prependPath(com.fasterxml.jackson.databind.JsonMappingException$Reference)
    
    @Test
    public void testPrependPath2() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        jsonMappingException._path = _path;
        JsonMappingException.Reference reference = new JsonMappingException.Reference();
        
        jsonMappingException.prependPath(reference);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrapWithPath(java.lang.Throwable, java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,int)}
 * @utbot.returnsFrom {@code return wrapWithPath(src, new Reference(refFrom, index));}
 *  */
    @Test
    public void testWrapWithPath_ReturnWrapWithPath_1() throws Exception  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        String detailMessage = "\u0000";
        setField(cloneNotSupportedException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(((Throwable) cloneNotSupportedException), ((Object) null), -255);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        JsonMappingException.Reference reference = ((JsonMappingException.Reference) createInstance("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        reference._index = -255;
        _path.add(reference);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 23;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 1;
        shortArray[15] = (short) 3;
        shortArray[16] = (short) 2;
        shortArray[17] = (short) 4;
        shortArray[19] = (short) 5;
        shortArray[20] = (short) 6;
        shortArray[21] = (short) 2;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 8585216;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        objectArray[1] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class2);
        objectArray[3] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[5] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class5);
        objectArray[7] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[13] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        objectArray[19] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class13);
        objectArray[21] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class16);
        objectArray[25] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class19);
        objectArray[29] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2169722540752L;
        longArray[2] = 2168544309424L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2168543584256L;
        longArray[6] = 2169728312784L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543584256L;
        longArray[12] = 2168543591624L;
        longArray[13] = 2168543632368L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966400L;
        longArray[18] = 2168529966272L;
        longArray[19] = 2168529966592L;
        longArray[20] = 2169714829456L;
        longArray[21] = 2168543584256L;
        longArray[22] = 2168532987024L;
        longArray[23] = 2169722584528L;
        longArray[24] = 2169728312784L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543584256L;
        longArray[30] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", cloneNotSupportedException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        assertTrue(deepEquals(expectedCause, actualCause));
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,int)}
 * @utbot.returnsFrom {@code return wrapWithPath(src, new Reference(refFrom, index));}
 *  */
    @Test
    public void testWrapWithPath_ReturnWrapWithPath_3() throws Exception  {
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(((Throwable) numberFormatException), ((Object) null), -255);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        JsonMappingException.Reference reference = ((JsonMappingException.Reference) createInstance("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        reference._index = -255;
        _path.add(reference);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 23;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 1;
        shortArray[15] = (short) 3;
        shortArray[16] = (short) 2;
        shortArray[17] = (short) 4;
        shortArray[19] = (short) 5;
        shortArray[20] = (short) 6;
        shortArray[21] = (short) 2;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 8585216;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        objectArray[1] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class2);
        objectArray[3] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[5] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class5);
        objectArray[7] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[13] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        objectArray[19] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class13);
        objectArray[21] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class16);
        objectArray[25] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class19);
        objectArray[29] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2169722540752L;
        longArray[2] = 2168544309424L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2168543584256L;
        longArray[6] = 2169728312784L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543584256L;
        longArray[12] = 2168543591624L;
        longArray[13] = 2168543632368L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966400L;
        longArray[18] = 2168529966272L;
        longArray[19] = 2168529966592L;
        longArray[20] = 2169714829456L;
        longArray[21] = 2168543584256L;
        longArray[22] = 2168532987024L;
        longArray[23] = 2169722584528L;
        longArray[24] = 2169728312784L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543584256L;
        longArray[30] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "(was java.lang.NumberFormatException)";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", numberFormatException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertNull(actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,int)}
 * @utbot.returnsFrom {@code return wrapWithPath(src, new Reference(refFrom, index));}
 *  */
    @Test
    public void testWrapWithPath_ReturnWrapWithPath_2() throws Exception  {
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        
        UnrecognizedPropertyException actual = ((UnrecognizedPropertyException) JsonMappingException.wrapWithPath(((Throwable) unrecognizedPropertyException), ((Object) null), -255));
        
        Class actual_referringClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_referringClass"));
        assertNull(actual_referringClass);
        
        String actual_propertyName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyName"));
        assertNull(actual_propertyName);
        
        Collection actual_propertyIds = ((Collection) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyIds"));
        assertNull(actual_propertyIds);
        
        String actual_propertiesAsString = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertiesAsString"));
        assertNull(actual_propertiesAsString);
        
        LinkedList unrecognizedPropertyException_path = unrecognizedPropertyException._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(unrecognizedPropertyException_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int unrecognizedPropertyExceptionDepth = ((Integer) getFieldValue(unrecognizedPropertyException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(unrecognizedPropertyExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,int)}
 * @utbot.returnsFrom {@code return wrapWithPath(src, new Reference(refFrom, index));}
 *  */
    @Test
    public void testWrapWithPath_ReturnWrapWithPath() throws Exception  {
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        unrecognizedPropertyException._path = _path;
        
        UnrecognizedPropertyException actual = ((UnrecognizedPropertyException) JsonMappingException.wrapWithPath(((Throwable) unrecognizedPropertyException), ((Object) null), -255));
        
        Class actual_referringClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_referringClass"));
        assertNull(actual_referringClass);
        
        String actual_propertyName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyName"));
        assertNull(actual_propertyName);
        
        Collection actual_propertyIds = ((Collection) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyIds"));
        assertNull(actual_propertyIds);
        
        String actual_propertiesAsString = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertiesAsString"));
        assertNull(actual_propertiesAsString);
        
        LinkedList unrecognizedPropertyException_path = unrecognizedPropertyException._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(unrecognizedPropertyException_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int unrecognizedPropertyExceptionDepth = ((Integer) getFieldValue(unrecognizedPropertyException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(unrecognizedPropertyExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method wrapWithPath(java.lang.Throwable, java.lang.Object, int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,int)}
     */
    @Test
    public void testWrapWithPathThrowsNPE() {
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:365)
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:350) */
        JsonMappingException.wrapWithPath(((Throwable) null), object, -3);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrapWithPath(java.lang.Throwable, java.lang.Object, int)
    
    @Test
    public void testWrapWithPath1() throws Exception  {
        com.sun.org.apache.xalan.internal.xsltc.compiler.util.InternalError internalError = ((com.sun.org.apache.xalan.internal.xsltc.compiler.util.InternalError) createInstance("com.sun.org.apache.xalan.internal.xsltc.compiler.util.InternalError"));
        String detailMessage = "";
        setField(internalError, "java.lang.Throwable", "detailMessage", detailMessage);
        Object object = new Object();
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(((Throwable) internalError), object, 0);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        JsonMappingException.Reference reference = ((JsonMappingException.Reference) createInstance("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object _from = createInstance("java.lang.Object");
        reference._from = _from;
        _path.add(reference);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 23;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 1;
        shortArray[15] = (short) 3;
        shortArray[16] = (short) 2;
        shortArray[17] = (short) 4;
        shortArray[19] = (short) 5;
        shortArray[20] = (short) 6;
        shortArray[21] = (short) 2;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 8585216;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        objectArray[1] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class2);
        objectArray[3] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[5] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class5);
        objectArray[7] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[13] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        objectArray[19] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class13);
        objectArray[21] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class16);
        objectArray[25] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class19);
        objectArray[29] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2169722540752L;
        longArray[2] = 2168544309424L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2168543584256L;
        longArray[6] = 2169728312784L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543584256L;
        longArray[12] = 2168543591624L;
        longArray[13] = 2168543632368L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966400L;
        longArray[18] = 2168529966272L;
        longArray[19] = 2168529966592L;
        longArray[20] = 2169714829456L;
        longArray[21] = 2168543584256L;
        longArray[22] = 2168532987024L;
        longArray[23] = 2169722584528L;
        longArray[24] = 2169728312784L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543584256L;
        longArray[30] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage1 = "(was com.sun.org.apache.xalan.internal.xsltc.compiler.util.InternalError)";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage1);
        setField(expected, "java.lang.Throwable", "cause", internalError);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String expectedCauseDetailMessage = ((String) getFieldValue(expectedCause, "java.lang.Throwable", "detailMessage"));
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedCauseDetailMessage, actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    ///endregion
    
    ///region Errors report for wrapWithPath
    
    public void testWrapWithPath_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrapWithPath(java.lang.Throwable, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return wrapWithPath(src, new Reference(refFrom, refFieldName));}
 *  */
    @Test
    public void testWrapWithPath_ReturnWrapWithPath_11() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        String string = "";
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(((Throwable) jsonMappingException), ((Object) null), string);
        
        LinkedList jsonMappingException_path = jsonMappingException._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(jsonMappingException_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int jsonMappingExceptionDepth = ((Integer) getFieldValue(jsonMappingException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(jsonMappingExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return wrapWithPath(src, new Reference(refFrom, refFieldName));}
 *  */
    @Test
    public void testWrapWithPath_ReturnWrapWithPath_21() throws Exception  {
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        String detailMessage = "\u0000";
        setField(interruptedException, "java.lang.Throwable", "detailMessage", detailMessage);
        String string = "";
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(((Throwable) interruptedException), ((Object) null), string);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        JsonMappingException.Reference reference = ((JsonMappingException.Reference) createInstance("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        reference._fieldName = string;
        reference._index = -1;
        _path.add(reference);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 24;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 1;
        shortArray[15] = (short) 3;
        shortArray[16] = (short) 2;
        shortArray[17] = (short) 4;
        shortArray[19] = (short) 5;
        shortArray[20] = (short) 6;
        shortArray[21] = (short) 2;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 8585216;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        objectArray[1] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class2);
        objectArray[3] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[5] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class5);
        objectArray[7] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[13] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        objectArray[19] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class13);
        objectArray[21] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class16);
        objectArray[25] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class19);
        objectArray[29] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2169722540752L;
        longArray[2] = 2168544309424L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2168543584256L;
        longArray[6] = 2169728312784L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543584256L;
        longArray[12] = 2168543591624L;
        longArray[13] = 2168543632368L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966400L;
        longArray[18] = 2168529966272L;
        longArray[19] = 2168529966592L;
        longArray[20] = 2169714829456L;
        longArray[21] = 2168543584256L;
        longArray[22] = 2168532987024L;
        longArray[23] = 2169722584528L;
        longArray[24] = 2169728312784L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543584256L;
        longArray[30] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", interruptedException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        assertTrue(deepEquals(expectedCause, actualCause));
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return wrapWithPath(src, new Reference(refFrom, refFieldName));}
 *  */
    @Test
    public void testWrapWithPath_ReturnWrapWithPath_31() throws Exception  {
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(((Throwable) interruptedException), ((Object) null), string);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        JsonMappingException.Reference reference = ((JsonMappingException.Reference) createInstance("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        reference._fieldName = string;
        reference._index = -1;
        _path.add(reference);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 24;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 1;
        shortArray[15] = (short) 3;
        shortArray[16] = (short) 2;
        shortArray[17] = (short) 4;
        shortArray[19] = (short) 5;
        shortArray[20] = (short) 6;
        shortArray[21] = (short) 2;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 8585216;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        objectArray[1] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class2);
        objectArray[3] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[5] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class5);
        objectArray[7] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[13] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        objectArray[19] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class13);
        objectArray[21] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class16);
        objectArray[25] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class19);
        objectArray[29] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2169722540752L;
        longArray[2] = 2168544309424L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2168543584256L;
        longArray[6] = 2169728312784L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543584256L;
        longArray[12] = 2168543591624L;
        longArray[13] = 2168543632368L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966400L;
        longArray[18] = 2168529966272L;
        longArray[19] = 2168529966592L;
        longArray[20] = 2169714829456L;
        longArray[21] = 2168543584256L;
        longArray[22] = 2168532987024L;
        longArray[23] = 2169722584528L;
        longArray[24] = 2169728312784L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543584256L;
        longArray[30] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "(was java.lang.InterruptedException)";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", interruptedException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertNull(actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return wrapWithPath(src, new Reference(refFrom, refFieldName));}
 *  */
    @Test
    public void testWrapWithPath_ReturnWrapWithPath1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        String string = "";
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(((Throwable) jsonMappingException), ((Object) null), string);
        
        LinkedList jsonMappingException_path = jsonMappingException._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(jsonMappingException_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int jsonMappingExceptionDepth = ((Integer) getFieldValue(jsonMappingException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(jsonMappingExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapWithPath(java.lang.Throwable, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return wrapWithPath(src, new Reference(refFrom, refFieldName));
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapWithPath_ThrowNullPointerException() {
        JsonMappingException.wrapWithPath(((Throwable) null), ((Object) null), ((String) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method wrapWithPath(java.lang.Throwable, java.lang.Object, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,java.lang.Object,java.lang.String)}
     */
    @Test
    public void testWrapWithPathThrowsNPEWithNonEmptyString() {
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:365)
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:338) */
        JsonMappingException.wrapWithPath(((Throwable) null), object, "-\uFFF43");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrapWithPath(java.lang.Throwable, java.lang.Object, java.lang.String)
    
    @Test
    public void testWrapWithPath2() throws Exception  {
        Throwable throwable = ((Throwable) createInstance("java.lang.Throwable"));
        String detailMessage = "";
        setField(throwable, "java.lang.Throwable", "detailMessage", detailMessage);
        Object object = new Object();
        String string = "";
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(throwable, object, string);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        JsonMappingException.Reference reference = ((JsonMappingException.Reference) createInstance("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object _from = createInstance("java.lang.Object");
        reference._from = _from;
        reference._fieldName = string;
        reference._index = -1;
        _path.add(reference);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 24;
        shortArray[2] = (short) 4;
        shortArray[6] = (short) 2;
        shortArray[12] = (short) 1;
        shortArray[13] = (short) 8;
        shortArray[14] = (short) 1;
        shortArray[15] = (short) 3;
        shortArray[16] = (short) 2;
        shortArray[17] = (short) 4;
        shortArray[19] = (short) 5;
        shortArray[20] = (short) 6;
        shortArray[21] = (short) 2;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[24] = (short) 2;
        shortArray[29] = (short) 1;
        shortArray[30] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 8585216;
        intArray[2] = 1;
        intArray[3] = 8716289;
        intArray[4] = 393216;
        intArray[5] = 3866632;
        intArray[6] = 4456448;
        intArray[7] = 327680;
        intArray[8] = 524288;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 851976;
        intArray[14] = 3997696;
        intArray[15] = 7536640;
        intArray[16] = 11993088;
        intArray[17] = 3538944;
        intArray[18] = 4128768;
        intArray[19] = 720896;
        intArray[20] = 28573696;
        intArray[21] = 393216;
        intArray[22] = 2097152;
        intArray[23] = 1900544;
        intArray[24] = 11927552;
        intArray[25] = 327680;
        intArray[26] = 3735552;
        intArray[27] = 1310720;
        intArray[28] = 2949120;
        intArray[29] = 65536;
        intArray[30] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        objectArray[1] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[2] = ((Object) class2);
        objectArray[3] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[4] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[5] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[6] = ((Object) class5);
        objectArray[7] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[8] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[9] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[10] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[11] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[12] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[13] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        objectArray[19] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[20] = ((Object) class13);
        objectArray[21] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[22] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[23] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[24] = ((Object) class16);
        objectArray[25] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[26] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[27] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[28] = ((Object) class19);
        objectArray[29] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[30] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2169722540752L;
        longArray[2] = 2168544309424L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2168543584256L;
        longArray[6] = 2169728312784L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543584256L;
        longArray[12] = 2168543591624L;
        longArray[13] = 2168543632368L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966400L;
        longArray[18] = 2168529966272L;
        longArray[19] = 2168529966592L;
        longArray[20] = 2169714829456L;
        longArray[21] = 2168543584256L;
        longArray[22] = 2168532987024L;
        longArray[23] = 2169722584528L;
        longArray[24] = 2169728312784L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543584256L;
        longArray[30] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage1 = "(was java.lang.Throwable)";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage1);
        setField(expected, "java.lang.Throwable", "cause", throwable);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 31);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String expectedCauseDetailMessage = ((String) getFieldValue(expectedCause, "java.lang.Throwable", "detailMessage"));
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedCauseDetailMessage, actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrapWithPath(java.lang.Throwable, com.fasterxml.jackson.databind.JsonMappingException$Reference)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,com.fasterxml.jackson.databind.JsonMappingException.Reference)}
 * @utbot.executesCondition {@code (src instanceof JsonMappingException): False}
 * @utbot.executesCondition {@code (msg == null): False}
 * @utbot.executesCondition {@code (msg.length() == 0): False}
 * @utbot.executesCondition {@code (src instanceof JsonProcessingException): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return jme;}
 *  */
    @Test
    public void testWrapWithPath_MsgLengthNotEqualsZero() throws Exception  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        String detailMessage = "\u0000";
        setField(cloneNotSupportedException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(cloneNotSupportedException, null);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", cloneNotSupportedException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        assertTrue(deepEquals(expectedCause, actualCause));
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,com.fasterxml.jackson.databind.JsonMappingException.Reference)}
 * @utbot.executesCondition {@code (src instanceof JsonMappingException): False}
 * @utbot.executesCondition {@code (msg == null): True}
 * @utbot.executesCondition {@code (src instanceof JsonProcessingException): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return jme;}
 *  */
    @Test
    public void testWrapWithPath_MsgEqualsNull() throws Exception  {
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(interruptedException, null);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "(was java.lang.InterruptedException)";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", interruptedException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertNull(actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,com.fasterxml.jackson.databind.JsonMappingException.Reference)}
 * @utbot.executesCondition {@code (src instanceof JsonMappingException): True}
 * @utbot.returnsFrom {@code return jme;}
 *  */
    @Test
    public void testWrapWithPath_SrcInstanceOfJsonMappingException_1() throws Exception  {
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        
        UnrecognizedPropertyException actual = ((UnrecognizedPropertyException) JsonMappingException.wrapWithPath(unrecognizedPropertyException, null));
        
        Class actual_referringClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_referringClass"));
        assertNull(actual_referringClass);
        
        String actual_propertyName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyName"));
        assertNull(actual_propertyName);
        
        Collection actual_propertyIds = ((Collection) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyIds"));
        assertNull(actual_propertyIds);
        
        String actual_propertiesAsString = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertiesAsString"));
        assertNull(actual_propertiesAsString);
        
        LinkedList unrecognizedPropertyException_path = unrecognizedPropertyException._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(unrecognizedPropertyException_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int unrecognizedPropertyExceptionDepth = ((Integer) getFieldValue(unrecognizedPropertyException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(unrecognizedPropertyExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,com.fasterxml.jackson.databind.JsonMappingException.Reference)}
 * @utbot.executesCondition {@code (src instanceof JsonMappingException): True}
 * @utbot.returnsFrom {@code return jme;}
 *  */
    @Test
    public void testWrapWithPath_SrcInstanceOfJsonMappingException() throws Exception  {
        UnrecognizedPropertyException unrecognizedPropertyException = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        unrecognizedPropertyException._path = _path;
        
        UnrecognizedPropertyException actual = ((UnrecognizedPropertyException) JsonMappingException.wrapWithPath(unrecognizedPropertyException, null));
        
        Class actual_referringClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_referringClass"));
        assertNull(actual_referringClass);
        
        String actual_propertyName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyName"));
        assertNull(actual_propertyName);
        
        Collection actual_propertyIds = ((Collection) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertyIds"));
        assertNull(actual_propertyIds);
        
        String actual_propertiesAsString = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.PropertyBindingException", "_propertiesAsString"));
        assertNull(actual_propertiesAsString);
        
        LinkedList unrecognizedPropertyException_path = unrecognizedPropertyException._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(unrecognizedPropertyException_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int unrecognizedPropertyExceptionDepth = ((Integer) getFieldValue(unrecognizedPropertyException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(unrecognizedPropertyExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrapWithPath(java.lang.Throwable, com.fasterxml.jackson.databind.JsonMappingException$Reference)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#wrapWithPath(java.lang.Throwable,com.fasterxml.jackson.databind.JsonMappingException.Reference)}
 * @utbot.executesCondition {@code (src instanceof JsonMappingException): False}
 * @utbot.invokes {@link java.lang.Throwable#getMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String msg = src.getMessage();
 *  */
    @Test
    public void testWrapWithPath_ThrowNullPointerException1() {
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(JsonMappingException.java:365) */
        JsonMappingException.wrapWithPath(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrapWithPath(java.lang.Throwable, com.fasterxml.jackson.databind.JsonMappingException$Reference)
    
    @Test
    public void testWrapWithPath3() throws Exception  {
        StreamCorruptedException streamCorruptedException = ((StreamCorruptedException) createInstance("java.io.StreamCorruptedException"));
        String detailMessage = "";
        setField(streamCorruptedException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        JsonMappingException actual = JsonMappingException.wrapWithPath(streamCorruptedException, null);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        expected._path = _path;
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 25;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 3;
        shortArray[15] = (short) 2;
        shortArray[16] = (short) 4;
        shortArray[18] = (short) 5;
        shortArray[19] = (short) 6;
        shortArray[20] = (short) 2;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 2;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 36634624;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = JsonMappingException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class2);
        objectArray[2] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class3);
        Class class4 = java.lang.reflect.Method.class;
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class5);
        objectArray[6] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[12] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class12);
        objectArray[14] = ((Object) class12);
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class13);
        objectArray[20] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class16);
        objectArray[24] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class19);
        objectArray[28] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2169722540752L;
        longArray[1] = 2168544309424L;
        longArray[2] = 2168543584256L;
        longArray[3] = 2168543584256L;
        longArray[4] = 2168543584256L;
        longArray[5] = 2169728312784L;
        longArray[6] = 2168543584256L;
        longArray[7] = 2168543584256L;
        longArray[8] = 2168543584256L;
        longArray[9] = 2168543584256L;
        longArray[10] = 2168543584256L;
        longArray[11] = 2168543591624L;
        longArray[12] = 2168543632368L;
        longArray[13] = 2168529966400L;
        longArray[14] = 2168529966400L;
        longArray[15] = 2168529966400L;
        longArray[16] = 2168529966400L;
        longArray[17] = 2168529966272L;
        longArray[18] = 2168529966592L;
        longArray[19] = 2169714829456L;
        longArray[20] = 2168543584256L;
        longArray[21] = 2168532987024L;
        longArray[22] = 2169722584528L;
        longArray[23] = 2169728312784L;
        longArray[24] = 2168543584256L;
        longArray[25] = 2168543584256L;
        longArray[26] = 2168543584256L;
        longArray[27] = 2168543584256L;
        longArray[28] = 2168543584256L;
        longArray[29] = 2168543591624L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage1 = "(was java.io.StreamCorruptedException)";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage1);
        setField(expected, "java.lang.Throwable", "cause", streamCorruptedException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList expected_path = expected._path;
        LinkedList actual_path = actual._path;
        assertTrue(deepEquals(expected_path, actual_path));
        
        Closeable actual_processor = actual._processor;
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String expectedCauseDetailMessage = ((String) getFieldValue(expectedCause, "java.lang.Throwable", "detailMessage"));
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedCauseDetailMessage, actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException._buildMessage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _buildMessage()
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#_buildMessage()}
 * @utbot.executesCondition {@code (_path == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonProcessingException#getMessage()}
 * @utbot.returnsFrom {@code return msg;}
 *  */
    @Test
    public void test_buildMessage__pathEqualsNull() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        String detailMessage = "";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException._buildMessage();
        
        assertEquals(detailMessage, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _buildMessage()
    
    @Test
    public void test_buildMessage1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(jsonMappingException, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        
        String actual = jsonMappingException._buildMessage();
        
        String expected = "N/A\n at [Source: UNKNOWN; line: 0, column: 0]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_buildMessage2() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(jsonMappingException, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        String detailMessage = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        String actual = jsonMappingException._buildMessage();
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n at [Source: UNKNOWN; line: 0, column: 0]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _buildMessage()
    
    @Test
    public void test_buildMessage3() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        String detailMessage = "";
        setField(jsonMappingException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException._buildMessage] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc(JsonMappingException.java:514)
            com.fasterxml.jackson.databind.JsonMappingException.getPathReference(JsonMappingException.java:413)
            com.fasterxml.jackson.databind.JsonMappingException._buildMessage(JsonMappingException.java:490) */
        jsonMappingException._buildMessage();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.getPathReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPathReference(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#getPathReference(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#_appendPathDesc(java.lang.StringBuilder)}
 * @utbot.returnsFrom {@code return sb;}
 *  */
    @Test
    public void testGetPathReference_JsonMappingException_appendPathDesc() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        StringBuilder actual = jsonMappingException.getPathReference(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPathReference(java.lang.StringBuilder)
    
    @Test
    public void testGetPathReference1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.getPathReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc(JsonMappingException.java:514)
            com.fasterxml.jackson.databind.JsonMappingException.getPathReference(JsonMappingException.java:413) */
        jsonMappingException.getPathReference(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.getPathReference
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPathReference()
    
    @Test
    public void testGetPathReference2() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        String actual = jsonMappingException.getPathReference();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPathReference()
    
    @Test
    public void testGetPathReference3() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException.getPathReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc(JsonMappingException.java:514)
            com.fasterxml.jackson.databind.JsonMappingException.getPathReference(JsonMappingException.java:413)
            com.fasterxml.jackson.databind.JsonMappingException.getPathReference(JsonMappingException.java:408) */
        jsonMappingException.getPathReference();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException.getProcessor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProcessor()
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#getProcessor()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetProcessor_Return() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        Object actual = jsonMappingException.getProcessor();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _appendPathDesc(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link JsonMappingException}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JsonMappingException#_appendPathDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_path == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_appendPathDesc__pathEqualsNull() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        jsonMappingException._appendPathDesc(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _appendPathDesc(java.lang.StringBuilder)
    
    @Test
    public void test_appendPathDesc1() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList _path = new LinkedList();
        _path.add(null);
        _path.add(null);
        _path.add(null);
        jsonMappingException._path = _path;
        
        /* This test fails because method [com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException._appendPathDesc(JsonMappingException.java:514) */
        jsonMappingException._appendPathDesc(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1079868669293399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1079868669293399.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1079868669297900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079868669293399.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079868669297900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1079868669663900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1079868669663900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1079868669665400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1079868669663900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1079868669665400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
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

