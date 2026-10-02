package com.google.gson.internal.bind;

import org.junit.Test;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonNull;
import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ListIterator;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class com_google_gson_internal_bind_JsonTreeReaderTest {
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#toString()}
 * @utbot.returnsFrom {@code return getClass().getSimpleName();}
 *  */
    @Test
    public void testToString_ReturnGetClassGetSimpleName() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#toString()}
 *  */
    @Test
    public void testToString() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#toString()}
 * @utbot.returnsFrom {@code return getClass().getSimpleName();}
 *  */
    @Test
    public void testToString_ReturnGetClassGetSimpleName_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#toString()}
 *  */
    @Test
    public void testToString_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString7() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        String actual = jsonTreeReader.toString();
        
        String expected = "JsonTreeReader at path $";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.hasNext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasNext()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.returnsFrom {@code return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;}
 *  */
    @Test
    public void testHasNext_ReturnTokenEqualsJsonTokenEND_OBJECTAndTokenEqualsJsonTokenEND_ARRAY() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        boolean actual = jsonTreeReader.hasNext();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.returnsFrom {@code return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;}
 *  */
    @Test
    public void testHasNext_ReturnTokenEqualsJsonTokenEND_OBJECTAndTokenEqualsJsonTokenEND_ARRAY_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[8];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[1] = ((Object) jsonToken);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        boolean actual = jsonTreeReader.hasNext();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.returnsFrom {@code return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;}
 *  */
    @Test
    public void testHasNext_ReturnTokenEqualsJsonTokenEND_OBJECTAndTokenEqualsJsonTokenEND_ARRAY_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        boolean actual = jsonTreeReader.hasNext();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.returnsFrom {@code return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;}
 *  */
    @Test
    public void testHasNext_ReturnTokenEqualsJsonTokenEND_OBJECTAndTokenEqualsJsonTokenEND_ARRAY_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[4];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[1] = ((Object) jsonToken);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        boolean actual = jsonTreeReader.hasNext();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.returnsFrom {@code return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;}
 *  */
    @Test
    public void testHasNext_ReturnTokenEqualsJsonTokenEND_OBJECTAndTokenEqualsJsonTokenEND_ARRAY_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        boolean actual = jsonTreeReader.hasNext();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.returnsFrom {@code return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;}
 *  */
    @Test
    public void testHasNext_ReturnTokenEqualsJsonTokenEND_OBJECTAndTokenEqualsJsonTokenEND_ARRAY_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        boolean actual = jsonTreeReader.hasNext();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.returnsFrom {@code return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;}
 *  */
    @Test
    public void testHasNext_ReturnTokenEqualsJsonTokenEND_OBJECTAndTokenEqualsJsonTokenEND_ARRAY_6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Float value = 0.0f;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        boolean actual = jsonTreeReader.hasNext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasNext()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testHasNext_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.hasNext] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.hasNext(JsonTreeReader.java:103) */
        jsonTreeReader.hasNext();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testHasNext_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.hasNext] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.hasNext(JsonTreeReader.java:103) */
        jsonTreeReader.hasNext();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testHasNext_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object listItr = createInstance("java.util.ImmutableCollections$ListItr");
        stack[0] = listItr;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.hasNext] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.hasNext(JsonTreeReader.java:103) */
        jsonTreeReader.hasNext();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testHasNext_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.hasNext] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.hasNext(JsonTreeReader.java:103) */
        jsonTreeReader.hasNext();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testHasNext_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.hasNext] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.hasNext(JsonTreeReader.java:103) */
            jsonTreeReader.hasNext();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testHasNext_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            Object object = createInstance("java.lang.Object");
            stack[0] = object;
            Object object1 = createInstance("java.lang.Object");
            stack[1] = object1;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.hasNext] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.hasNext(JsonTreeReader.java:103) */
            jsonTreeReader.hasNext();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken token = peek();
 *  */
    @Test
    public void testHasNext_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.hasNext] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.hasNext(JsonTreeReader.java:103) */
        jsonTreeReader.hasNext();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasNext()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#hasNext()}
     */
    @Test
    public void testHasNextReturnsTrue() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        boolean actual = jsonTreeReader.hasNext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
            
            java.lang.Object[] initialJsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
            
            jsonTreeReader.close();
            
            java.lang.Object[] finalJsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
            int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
            
            assertFalse(initialJsonTreeReaderStack == finalJsonTreeReaderStack);
            
            assertEquals(1, finalJsonTreeReaderStackSize);
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method close()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#close()}
     */
    @Test
    public void testClose1() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        jsonTreeReader.close();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.getPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPath()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < stackSize; i++)} once
 *  */
    @Test
    public void testGetPath_StackiInstanceOfJsonArray() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[1];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < stackSize; i++)} once
 *  */
    @Test
    public void testGetPath_StackiInstanceOfJsonObject() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[1];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#getPath()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < stackSize; i++)} once
 * @utbot.returnsFrom {@code return result.toString();}
 *  */
    @Test
    public void testGetPath_NotStackiNotInstanceOfJsonObject() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPath()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < stackSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: stack[i] instanceof JsonArray
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.internal.bind.JsonTreeReader.getPath(JsonTreeReader.java:310) */
        jsonTreeReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < stackSize; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: stack[i] instanceof JsonArray
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.getPath(JsonTreeReader.java:310) */
        jsonTreeReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < stackSize; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: stack[i] instanceof JsonArray
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[2];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.internal.bind.JsonTreeReader.getPath(JsonTreeReader.java:310) */
        jsonTreeReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < stackSize; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: stack[i] instanceof JsonArray
 *  */
    @Test
    public void testGetPath_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[2];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.getPath] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.google.gson.internal.bind.JsonTreeReader.getPath(JsonTreeReader.java:310) */
        jsonTreeReader.getPath();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#getPath()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < stackSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack[i] instanceof JsonArray
 *  */
    @Test
    public void testGetPath_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.getPath] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.getPath(JsonTreeReader.java:310) */
        jsonTreeReader.getPath();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPath()
    
    @Test
    public void testGetPath1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        JsonArray jsonArray1 = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray1);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[2] = ((Object) jsonObject);
        Object emptyListIterator = createInstance("java.util.Collections$EmptyListIterator");
        stack[3] = emptyListIterator;
        stack[4] = ((Object) jsonObject);
        stack[5] = ((Object) jsonObject);
        stack[6] = ((Object) jsonObject);
        stack[7] = ((Object) jsonObject);
        stack[8] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPath2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        Object emptyListIterator = createInstance("java.util.Collections$EmptyListIterator");
        stack[1] = emptyListIterator;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPath3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        JsonArray jsonArray1 = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray1);
        JsonArray jsonArray2 = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[2] = ((Object) jsonArray2);
        Object emptyListIterator = createInstance("java.util.Collections$EmptyListIterator");
        stack[3] = emptyListIterator;
        stack[4] = ((Object) jsonArray2);
        stack[5] = ((Object) jsonArray2);
        stack[6] = ((Object) jsonArray2);
        stack[7] = ((Object) jsonArray2);
        stack[8] = ((Object) jsonArray2);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPath4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        Object object1 = createInstance("java.lang.Object");
        stack[2] = object1;
        stack[3] = object;
        stack[4] = object1;
        stack[5] = object1;
        stack[6] = object1;
        stack[7] = object1;
        stack[8] = object1;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 4);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPath5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        JsonArray jsonArray1 = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[2] = ((Object) jsonArray1);
        Object emptyListIterator = createInstance("java.util.Collections$EmptyListIterator");
        stack[3] = emptyListIterator;
        stack[4] = ((Object) jsonArray1);
        stack[5] = ((Object) jsonArray1);
        stack[6] = ((Object) jsonArray1);
        stack[7] = ((Object) jsonArray1);
        stack[8] = ((Object) jsonArray1);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPath6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[11];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        Object object = createInstance("java.lang.Object");
        stack[1] = object;
        Object object1 = createInstance("java.lang.Object");
        stack[2] = object1;
        Object object2 = createInstance("java.lang.Object");
        stack[3] = object2;
        stack[4] = object2;
        stack[5] = object2;
        stack[6] = object2;
        stack[7] = object2;
        stack[8] = object2;
        stack[9] = object2;
        stack[10] = object2;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 7);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPath7() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        Object object = createInstance("java.lang.Object");
        stack[1] = object;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[2] = ((Object) jsonArray);
        Object object1 = createInstance("java.lang.Object");
        stack[3] = object1;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 7);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPath8() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        java.lang.Object[] entryIteratorArray = createArray("java.util.concurrent.ConcurrentSkipListMap$EntryIterator", 0);
        stack[0] = entryIteratorArray;
        Object object = createInstance("java.lang.Object");
        stack[1] = object;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[2] = ((Object) jsonArray);
        Object asIterator = createInstance("java.lang.invoke.AbstractConstantGroup$AsIterator");
        stack[3] = asIterator;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        String actual = jsonTreeReader.getPath();
        
        String expected = "$";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.peek
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method peek()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): True}
 * @utbot.returnsFrom {@code return JsonToken.END_DOCUMENT;}
 *  */
    @Test
    public void testPeek_StackSizeEqualsZero() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        JsonToken actual = jsonTreeReader.peek();
        
        JsonToken expected = JsonToken.END_DOCUMENT;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): True}
 * @utbot.returnsFrom {@code return JsonToken.BEGIN_OBJECT;}
 *  */
    @Test
    public void testPeek_OInstanceOfJsonObject() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[4];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        JsonToken actual = jsonTreeReader.peek();
        
        JsonToken expected = JsonToken.BEGIN_OBJECT;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): False}
 * @utbot.executesCondition {@code (o instanceof JsonArray): False}
 * @utbot.executesCondition {@code (o instanceof JsonPrimitive): False}
 * @utbot.executesCondition {@code (o instanceof JsonNull): True}
 * @utbot.returnsFrom {@code return JsonToken.NULL;}
 *  */
    @Test
    public void testPeek_OInstanceOfJsonNull() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        JsonToken actual = jsonTreeReader.peek();
        
        JsonToken expected = JsonToken.NULL;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): False}
 * @utbot.executesCondition {@code (o instanceof JsonArray): True}
 * @utbot.returnsFrom {@code return JsonToken.BEGIN_ARRAY;}
 *  */
    @Test
    public void testPeek_OInstanceOfJsonArray() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[20];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        JsonToken actual = jsonTreeReader.peek();
        
        JsonToken expected = JsonToken.BEGIN_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): False}
 * @utbot.executesCondition {@code (o instanceof JsonArray): False}
 * @utbot.executesCondition {@code (o instanceof JsonPrimitive): True}
 * @utbot.executesCondition {@code (primitive.isString()): True}
 * @utbot.returnsFrom {@code return JsonToken.STRING;}
 *  */
    @Test
    public void testPeek_PrimitiveIsString() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        JsonToken actual = jsonTreeReader.peek();
        
        JsonToken expected = JsonToken.STRING;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): False}
 * @utbot.executesCondition {@code (o instanceof JsonArray): False}
 * @utbot.executesCondition {@code (o instanceof JsonPrimitive): True}
 * @utbot.executesCondition {@code (primitive.isString()): False}
 * @utbot.executesCondition {@code (primitive.isBoolean()): True}
 * @utbot.returnsFrom {@code return JsonToken.BOOLEAN;}
 *  */
    @Test
    public void testPeek_PrimitiveIsBoolean() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        Boolean boolean1 = false;
        stack[0] = ((Object) boolean1);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", boolean1);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        JsonToken actual = jsonTreeReader.peek();
        
        JsonToken expected = JsonToken.BOOLEAN;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (stackSize == 0): False}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): False}
 * @utbot.executesCondition {@code (o instanceof JsonArray): False}
 * @utbot.executesCondition {@code (o instanceof JsonPrimitive): True}
 * @utbot.executesCondition {@code (primitive.isString()): False}
 * @utbot.executesCondition {@code (primitive.isBoolean()): False}
 * @utbot.executesCondition {@code (primitive.isNumber()): True}
 * @utbot.invokes {@link com.google.gson.JsonPrimitive#isNumber()}
 * @utbot.returnsFrom {@code return JsonToken.NUMBER;}
 *  */
    @Test
    public void testPeek_PrimitiveIsNumber() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        Integer integer = 0;
        stack[0] = ((Object) integer);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", integer);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        JsonToken actual = jsonTreeReader.peek();
        
        JsonToken expected = JsonToken.NUMBER;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peek()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (o instanceof Iterator): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boolean isObject = stack[stackSize - 2] instanceof JsonObject;
 *  */
    @Test
    public void testPeek_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object keyIterator = createInstance("java.util.HashMap$KeyIterator");
        stack[0] = keyIterator;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peek] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114) */
        jsonTreeReader.peek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object o = peekStack();
 *  */
    @Test
    public void testPeek_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peek] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112) */
        jsonTreeReader.peek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object o = peekStack();
 *  */
    @Test
    public void testPeek_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peek] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112) */
        jsonTreeReader.peek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): False}
 * @utbot.executesCondition {@code (o instanceof JsonArray): False}
 * @utbot.executesCondition {@code (o instanceof JsonPrimitive): True}
 * @utbot.executesCondition {@code (primitive.isString()): False}
 * @utbot.executesCondition {@code (primitive.isBoolean()): False}
 * @utbot.executesCondition {@code (primitive.isNumber()): False}
 * @utbot.invokes {@link com.google.gson.JsonPrimitive#isString()}
 * @utbot.invokes {@link com.google.gson.JsonPrimitive#isBoolean()}
 * @utbot.invokes {@link com.google.gson.JsonPrimitive#isNumber()}
 * @utbot.throwsException {@link java.lang.AssertionError} when: primitive.isNumber()
 *  */
    @Test
    public void testPeek_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peek] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139) */
        jsonTreeReader.peek();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): False}
 * @utbot.executesCondition {@code (o instanceof JsonArray): False}
 * @utbot.executesCondition {@code (o instanceof JsonPrimitive): False}
 * @utbot.executesCondition {@code (o instanceof JsonNull): False}
 * @utbot.executesCondition {@code (o == SENTINEL_CLOSED): False}
 * @utbot.throwsException {@link java.lang.AssertionError} when: o == SENTINEL_CLOSED
 *  */
    @Test
    public void testPeek_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null, null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peek] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146) */
            jsonTreeReader.peek();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.executesCondition {@code (o instanceof Iterator): False}
 * @utbot.executesCondition {@code (o instanceof JsonObject): False}
 * @utbot.executesCondition {@code (o instanceof JsonArray): False}
 * @utbot.executesCondition {@code (o instanceof JsonPrimitive): False}
 * @utbot.executesCondition {@code (o instanceof JsonNull): False}
 * @utbot.executesCondition {@code (o == SENTINEL_CLOSED): True}
 * @utbot.throwsException {@link java.lang.AssertionError} when: o == SENTINEL_CLOSED
 *  */
    @Test
    public void testPeek_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            Object object = createInstance("java.lang.Object");
            stack[0] = object;
            Object object1 = createInstance("java.lang.Object");
            stack[1] = object1;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peek] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146) */
            jsonTreeReader.peek();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object o = peekStack();
 *  */
    @Test
    public void testPeek_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peek] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112) */
        jsonTreeReader.peek();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method peek()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
     */
    @Test
    public void testPeek() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        JsonToken actual = jsonTreeReader.peek();
        
        JsonToken expected = JsonToken.NULL;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.nextDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextDouble()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextDouble_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.IllegalStateException: Expected NUMBER but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:211) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextDouble_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.IllegalStateException: Expected NUMBER but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:211) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextDouble_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.IllegalStateException: Expected NUMBER but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:211) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextDouble_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.IllegalStateException: Expected NUMBER but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:211) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextDouble_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[20];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.IllegalStateException: Expected NUMBER but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:211) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:208) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Iterator anonymousIterator = ((Iterator) createInstance("java.util.AbstractMap$2$1"));
        stack[0] = ((Object) anonymousIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:208) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:208) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextDouble_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:208) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): False}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: double result = ((JsonPrimitive) peekStack()).getAsDouble();
 *  */
    @Test
    public void testNextDouble_ThrowNumberFormatException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        stack[6] = ((Object) jsonToken);
        JsonToken jsonToken1 = JsonToken.BOOLEAN;
        stack[9] = ((Object) jsonToken1);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.google.gson.JsonPrimitive.getAsDouble(JsonPrimitive.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:213) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextDouble_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null, null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:208) */
            jsonTreeReader.nextDouble();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextDouble_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            Object object = createInstance("java.lang.Object");
            stack[0] = object;
            Object object1 = createInstance("java.lang.Object");
            stack[1] = object1;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:208) */
            jsonTreeReader.nextDouble();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double result = ((JsonPrimitive) peekStack()).getAsDouble();
 *  */
    @Test
    public void testNextDouble_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Long value = 0L;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        JsonToken jsonToken = JsonToken.BEGIN_OBJECT;
        stack[3] = ((Object) jsonToken);
        JsonToken jsonToken1 = JsonToken.END_ARRAY;
        stack[4] = ((Object) jsonToken1);
        stack[6] = ((Object) jsonToken);
        stack[7] = ((Object) jsonToken1);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:219) */
        jsonTreeReader.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextDouble_ThrowNullPointerException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:208) */
        jsonTreeReader.nextDouble();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method nextDouble()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextDouble()}
     */
    @Test
    public void testNextDoubleThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.IllegalStateException: Expected NUMBER but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:211) */
        jsonTreeReader.nextDouble();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextDouble()
    
    @Test
    public void testNextDouble1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[14];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        stack[1] = object;
        stack[2] = object;
        stack[3] = object;
        stack[4] = object;
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[5] = ((Object) jsonPrimitive);
        stack[6] = object;
        stack[7] = object;
        stack[8] = object;
        stack[9] = object;
        stack[10] = object;
        stack[11] = object;
        stack[12] = object;
        stack[13] = object;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 6);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:219) */
        jsonTreeReader.nextDouble();
    }
    
    @Test
    public void testNextDouble2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        stack[1] = object;
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[2] = ((Object) jsonPrimitive);
        stack[3] = object;
        stack[4] = object;
        stack[5] = object;
        stack[6] = object;
        stack[7] = object;
        stack[8] = object;
        stack[9] = object;
        stack[10] = object;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        jsonTreeReader.setLenient(true);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextDouble] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.nextDouble(JsonTreeReader.java:219) */
        jsonTreeReader.nextDouble();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.nextInt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextInt()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextInt_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.IllegalStateException: Expected NUMBER but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:242) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextInt_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.IllegalStateException: Expected NUMBER but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:242) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextInt_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.IllegalStateException: Expected NUMBER but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:242) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextInt_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.IllegalStateException: Expected NUMBER but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:242) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextInt_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[20];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.IllegalStateException: Expected NUMBER but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:242) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:239) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object listItr = createInstance("java.util.ImmutableCollections$ListItr");
        stack[0] = listItr;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:239) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:239) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextInt_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:239) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): False}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: int result = ((JsonPrimitive) peekStack()).getAsInt();
 *  */
    @Test
    public void testNextInt_ThrowNumberFormatException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        JsonToken jsonToken = JsonToken.END_ARRAY;
        stack[5] = ((Object) jsonToken);
        JsonToken jsonToken1 = JsonToken.BOOLEAN;
        stack[6] = ((Object) jsonToken1);
        stack[8] = ((Object) value);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.google.gson.JsonPrimitive.getAsInt(JsonPrimitive.java:228)
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:244) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextInt_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:239) */
            jsonTreeReader.nextInt();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int result = ((JsonPrimitive) peekStack()).getAsInt();
 *  */
    @Test
    public void testNextInt_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        AtomicInteger value = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        stack[4] = ((Object) jsonToken);
        stack[8] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:247) */
        jsonTreeReader.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextInt_ThrowNullPointerException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:239) */
        jsonTreeReader.nextInt();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method nextInt()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextInt()}
     */
    @Test
    public void testNextIntThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.IllegalStateException: Expected NUMBER but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:242) */
        jsonTreeReader.nextInt();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextInt()
    
    @Test
    public void testNextInt1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        stack[1] = ((Object) jsonTreeReader);
        stack[2] = ((Object) jsonTreeReader);
        stack[3] = ((Object) jsonTreeReader);
        stack[4] = ((Object) jsonTreeReader);
        stack[5] = ((Object) jsonTreeReader);
        stack[6] = ((Object) jsonTreeReader);
        stack[7] = ((Object) jsonTreeReader);
        stack[8] = ((Object) jsonTreeReader);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        int actual = jsonTreeReader.nextInt();
        
        assertEquals(0, actual);
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextInt()
    
    @Test
    public void testNextInt2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        stack[1] = ((Object) jsonTreeReader);
        stack[2] = ((Object) jsonTreeReader);
        stack[3] = ((Object) jsonTreeReader);
        stack[4] = ((Object) jsonTreeReader);
        stack[5] = ((Object) jsonTreeReader);
        stack[6] = ((Object) jsonTreeReader);
        stack[7] = ((Object) jsonTreeReader);
        stack[8] = ((Object) jsonTreeReader);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextInt] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.google.gson.JsonPrimitive.getAsInt(JsonPrimitive.java:228)
            com.google.gson.internal.bind.JsonTreeReader.nextInt(JsonTreeReader.java:244) */
        jsonTreeReader.nextInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.push
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method push(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 *  */
    @Test
    public void testPush_StackSizeNotEqualsStackLength() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null, null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertEquals(2, finalJsonTreeReaderStackSize);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 *  */
    @Test
    public void testPush_StackSizeEqualsStackLength() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        java.lang.String[] pathNames = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames", pathNames);
        int[] pathIndices = {-255};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        java.lang.Object[] initialJsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        java.lang.String[] initialJsonTreeReaderPathNames = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        int[] initialJsonTreeReaderPathIndices = ((int[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices"));
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        
        java.lang.Object[] finalJsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        java.lang.String[] finalJsonTreeReaderPathNames = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        int[] finalJsonTreeReaderPathIndices = ((int[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices"));
        
        assertFalse(initialJsonTreeReaderStack == finalJsonTreeReaderStack);
        
        assertFalse(initialJsonTreeReaderPathNames == finalJsonTreeReaderPathNames);
        
        assertFalse(initialJsonTreeReaderPathIndices == finalJsonTreeReaderPathIndices);
        
        assertEquals(2, finalJsonTreeReaderStackSize);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 *  */
    @Test
    public void testPush_StackSizeEqualsStackLength_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        java.lang.String[] pathNames = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames", pathNames);
        int[] pathIndices = {-255};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        java.lang.Object[] initialJsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        java.lang.String[] initialJsonTreeReaderPathNames = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        int[] initialJsonTreeReaderPathIndices = ((int[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices"));
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        
        java.lang.Object[] finalJsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        java.lang.String[] finalJsonTreeReaderPathNames = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        int[] finalJsonTreeReaderPathIndices = ((int[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices"));
        
        assertFalse(initialJsonTreeReaderStack == finalJsonTreeReaderStack);
        
        assertFalse(initialJsonTreeReaderPathNames == finalJsonTreeReaderPathNames);
        
        assertFalse(initialJsonTreeReaderPathIndices == finalJsonTreeReaderPathIndices);
        
        assertEquals(2, finalJsonTreeReaderStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method push(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[stackSize++] = newTop;
 *  */
    @Test
    public void testPush_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -256);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.push] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.push(JsonTreeReader.java:304) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.executesCondition {@code (stackSize == stack.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stack[stackSize++] = newTop;
 *  */
    @Test
    public void testPush_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null, null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 253);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.push] produces [java.lang.ArrayIndexOutOfBoundsException: Index 253 out of bounds for length 2]
            com.google.gson.internal.bind.JsonTreeReader.push(JsonTreeReader.java:304) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stackSize == stack.length
 *  */
    @Test
    public void testPush_ThrowNullPointerException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.push] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.push(JsonTreeReader.java:298) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(pathIndices, 0, newPathIndices, 0, stackSize);
 *  */
    @Test
    public void testPush_ThrowNullPointerException_1() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        int[] pathIndices = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.push] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3481)
            com.google.gson.internal.bind.JsonTreeReader.push(JsonTreeReader.java:302) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(pathIndices, 0, newPathIndices, 0, stackSize);
 *  */
    @Test
    public void testPush_ThrowNullPointerException_2() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.push] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3586)
            com.google.gson.internal.bind.JsonTreeReader.push(JsonTreeReader.java:301) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.executesCondition {@code (stackSize == stack.length): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(pathNames, 0, newPathNames, 0, stackSize);
 *  */
    @Test
    public void testPush_ThrowNullPointerException_3() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        int[] pathIndices = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.push] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3481)
            com.google.gson.internal.bind.JsonTreeReader.push(JsonTreeReader.java:302) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method push(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: System.arraycopy(stack, 0, newStack, 0, stackSize);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testPush_ThrowArrayStoreException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        boolean[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: System.arraycopy(stack, 0, newStack, 0, stackSize);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testPush_ThrowArrayStoreException_1() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        char[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: System.arraycopy(stack, 0, newStack, 0, stackSize);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testPush_ThrowArrayStoreException_2() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        long[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: System.arraycopy(stack, 0, newStack, 0, stackSize);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testPush_ThrowArrayStoreException_3() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        float[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: System.arraycopy(stack, 0, newStack, 0, stackSize);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testPush_ThrowArrayStoreException_4() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        int[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: System.arraycopy(stack, 0, newStack, 0, stackSize);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testPush_ThrowArrayStoreException_5() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        byte[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: System.arraycopy(stack, 0, newStack, 0, stackSize);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testPush_ThrowArrayStoreException_6() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        double[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: System.arraycopy(stack, 0, newStack, 0, stackSize);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testPush_ThrowArrayStoreException_7() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        short[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = ((Object) null);
        try {
            pushMethod.invoke(jsonTreeReader, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method push(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)}
     */
    @Test
    public void testPush() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        Object object = new Object();
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class objectType = Class.forName("java.lang.Object");
        Method pushMethod = jsonTreeReaderClazz.getDeclaredMethod("push", objectType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[1];
        pushMethodArguments[0] = object;
        pushMethod.invoke(jsonTreeReader, pushMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.expect
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expect(com.google.gson.stream.JsonToken)
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 *  */
    @Test
    public void testExpect() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = jsonToken;
        expectMethod.invoke(jsonTreeReader, expectMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 *  */
    @Test
    public void testExpect_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[16];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        JsonToken jsonToken1 = JsonToken.NULL;
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonToken1Type = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonToken1Type);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = jsonToken1;
        expectMethod.invoke(jsonTreeReader, expectMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 *  */
    @Test
    public void testExpect_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[4];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        JsonToken jsonToken1 = JsonToken.BEGIN_ARRAY;
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonToken1Type = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonToken1Type);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = jsonToken1;
        expectMethod.invoke(jsonTreeReader, expectMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 *  */
    @Test
    public void testExpect_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[32];
        JsonToken jsonToken = JsonToken.BOOLEAN;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        JsonToken jsonToken1 = JsonToken.BEGIN_OBJECT;
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonToken1Type = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonToken1Type);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = jsonToken1;
        expectMethod.invoke(jsonTreeReader, expectMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 *  */
    @Test
    public void testExpect_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[4];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        JsonToken jsonToken = JsonToken.STRING;
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = jsonToken;
        expectMethod.invoke(jsonTreeReader, expectMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 *  */
    @Test
    public void testExpect_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        JsonToken jsonToken1 = JsonToken.BOOLEAN;
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonToken1Type = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonToken1Type);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = jsonToken1;
        expectMethod.invoke(jsonTreeReader, expectMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 *  */
    @Test
    public void testExpect_6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[8];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Byte value = (byte) 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        JsonToken jsonToken = JsonToken.NUMBER;
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = jsonToken;
        expectMethod.invoke(jsonTreeReader, expectMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expect(com.google.gson.stream.JsonToken)
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeReader#locationString()
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + expected + " but was " + peek() + locationString()
 *  */
    @Test
    public void testExpect_ThrowIllegalStateException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.IllegalStateException: Expected null but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = ((Object) null);
        try {
            expectMethod.invoke(jsonTreeReader, expectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: peek() != expected
 *  */
    @Test
    public void testExpect_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object listItr = createInstance("java.util.ImmutableCollections$ListItr");
        stack[0] = listItr;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = ((Object) null);
        try {
            expectMethod.invoke(jsonTreeReader, expectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: peek() != expected
 *  */
    @Test
    public void testExpect_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = ((Object) null);
        try {
            expectMethod.invoke(jsonTreeReader, expectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: peek() != expected
 *  */
    @Test
    public void testExpect_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = ((Object) null);
        try {
            expectMethod.invoke(jsonTreeReader, expectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 * @utbot.throwsException {@link java.lang.AssertionError} when: peek() != expected
 *  */
    @Test
    public void testExpect_ThrowAssertionError() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = ((Object) null);
        try {
            expectMethod.invoke(jsonTreeReader, expectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 * @utbot.throwsException {@link java.lang.AssertionError} when: peek() != expected
 *  */
    @Test
    public void testExpect_ThrowAssertionError_1() throws Throwable  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null, null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161) */
            Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
            Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
            expectMethod.setAccessible(true);
            java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
            expectMethodArguments[0] = ((Object) null);
            try {
                expectMethod.invoke(jsonTreeReader, expectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 * @utbot.throwsException {@link java.lang.AssertionError} when: peek() != expected
 *  */
    @Test
    public void testExpect_ThrowAssertionError_2() throws Throwable  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            JsonToken jsonToken = JsonToken.END_DOCUMENT;
            stack[0] = ((Object) jsonToken);
            Object object = createInstance("java.lang.Object");
            stack[1] = object;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161) */
            Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
            Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
            expectMethod.setAccessible(true);
            java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
            expectMethodArguments[0] = ((Object) null);
            try {
                expectMethod.invoke(jsonTreeReader, expectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: peek() != expected
 *  */
    @Test
    public void testExpect_ThrowNullPointerException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = ((Object) null);
        try {
            expectMethod.invoke(jsonTreeReader, expectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method expect(com.google.gson.stream.JsonToken)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)}
     */
    @Test
    public void testExpectThrowsISE() throws Throwable  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.expect] produces [java.lang.IllegalStateException: Expected BEGIN_ARRAY but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class jsonTokenType = Class.forName("com.google.gson.stream.JsonToken");
        Method expectMethod = jsonTreeReaderClazz.getDeclaredMethod("expect", jsonTokenType);
        expectMethod.setAccessible(true);
        java.lang.Object[] expectMethodArguments = new java.lang.Object[1];
        expectMethodArguments[0] = jsonToken;
        try {
            expectMethod.invoke(jsonTreeReader, expectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.nextLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextLong()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextLong_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.IllegalStateException: Expected NUMBER but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:228) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextLong_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.IllegalStateException: Expected NUMBER but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:228) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextLong_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.IllegalStateException: Expected NUMBER but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:228) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextLong_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.IllegalStateException: Expected NUMBER but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:228) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.NUMBER + " but was " + token + locationString()
 *  */
    @Test
    public void testNextLong_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[20];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.IllegalStateException: Expected NUMBER but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:228) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:225) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object listItr = createInstance("java.util.ImmutableCollections$ListItr");
        stack[0] = listItr;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:225) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:225) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextLong_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:225) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): False}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: long result = ((JsonPrimitive) peekStack()).getAsLong();
 *  */
    @Test
    public void testNextLong_ThrowNumberFormatException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.BOOLEAN;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        JsonToken jsonToken1 = JsonToken.END_DOCUMENT;
        stack[4] = ((Object) jsonToken1);
        JsonToken jsonToken2 = JsonToken.STRING;
        stack[7] = ((Object) jsonToken2);
        stack[8] = ((Object) jsonToken2);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:721)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.google.gson.JsonPrimitive.getAsLong(JsonPrimitive.java:206)
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:230) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextLong_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:225) */
            jsonTreeReader.nextLong();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long result = ((JsonPrimitive) peekStack()).getAsLong();
 *  */
    @Test
    public void testNextLong_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        AtomicInteger atomicInteger = ((AtomicInteger) createInstance("java.util.concurrent.atomic.AtomicInteger"));
        stack[0] = ((Object) atomicInteger);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", atomicInteger);
        stack[1] = ((Object) jsonPrimitive);
        stack[3] = ((Object) jsonPrimitive);
        stack[4] = ((Object) atomicInteger);
        stack[6] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:233) */
        jsonTreeReader.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextLong_ThrowNullPointerException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:225) */
        jsonTreeReader.nextLong();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method nextLong()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextLong()}
     */
    @Test
    public void testNextLongThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.IllegalStateException: Expected NUMBER but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:228) */
        jsonTreeReader.nextLong();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextLong()
    
    @Test
    public void testNextLong1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        stack[1] = ((Object) jsonTreeReader);
        stack[2] = ((Object) jsonTreeReader);
        stack[3] = ((Object) jsonTreeReader);
        stack[4] = ((Object) jsonTreeReader);
        stack[5] = ((Object) jsonTreeReader);
        stack[6] = ((Object) jsonTreeReader);
        stack[7] = ((Object) jsonTreeReader);
        stack[8] = ((Object) jsonTreeReader);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        long actual = jsonTreeReader.nextLong();
        
        assertEquals(0L, actual);
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextLong()
    
    @Test
    public void testNextLong2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        stack[1] = ((Object) jsonTreeReader);
        stack[2] = ((Object) jsonTreeReader);
        stack[3] = ((Object) jsonTreeReader);
        stack[4] = ((Object) jsonTreeReader);
        stack[5] = ((Object) jsonTreeReader);
        stack[6] = ((Object) jsonTreeReader);
        stack[7] = ((Object) jsonTreeReader);
        stack[8] = ((Object) jsonTreeReader);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextLong] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:721)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.google.gson.JsonPrimitive.getAsLong(JsonPrimitive.java:206)
            com.google.gson.internal.bind.JsonTreeReader.nextLong(JsonTreeReader.java:230) */
        jsonTreeReader.nextLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.nextBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextBoolean()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.executesCondition {@code (stackSize > 0): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNextBoolean_StackSizeLessOrEqualZero() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[1];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        boolean actual = jsonTreeReader.nextBoolean();
        
        assertFalse(actual);
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.executesCondition {@code (stackSize > 0): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNextBoolean_StackSizeGreaterThanZero() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        int[] pathIndices = {-255};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        boolean actual = jsonTreeReader.nextBoolean();
        
        assertFalse(actual);
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack1 = get(jsonTreeReaderStack, 1);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        int[] jsonTreeReaderPathIndices = ((int[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices"));
        int finalJsonTreeReaderPathIndices0 = ((Integer) get(jsonTreeReaderPathIndices, 0));
        
        assertNull(finalJsonTreeReaderStack1);
        
        assertEquals(1, finalJsonTreeReaderStackSize);
        
        assertEquals(-254, finalJsonTreeReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextBoolean()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.IllegalStateException: Expected BOOLEAN but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.IllegalStateException: Expected BOOLEAN but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.IllegalStateException: Expected BOOLEAN but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.IllegalStateException: Expected BOOLEAN but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.IllegalStateException: Expected BOOLEAN but was STRING at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowIllegalStateException_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.IllegalStateException: Expected BOOLEAN but was NUMBER at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        ListIterator anonymousListIterator = ((ListIterator) createInstance("java.util.ArrayList$SubList$1"));
        stack[0] = ((Object) anonymousListIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.executesCondition {@code (stackSize > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        int[] pathIndices = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:194) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null, null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
            jsonTreeReader.nextBoolean();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            JsonToken jsonToken = JsonToken.END_DOCUMENT;
            stack[0] = ((Object) jsonToken);
            Object object = createInstance("java.lang.Object");
            stack[1] = object;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
            jsonTreeReader.nextBoolean();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expect(JsonToken.BOOLEAN);
 *  */
    @Test
    public void testNextBoolean_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
 * @utbot.executesCondition {@code (stackSize > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextBoolean_ThrowNullPointerException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:194) */
        jsonTreeReader.nextBoolean();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method nextBoolean()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextBoolean()}
     */
    @Test
    public void testNextBooleanThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextBoolean] produces [java.lang.IllegalStateException: Expected BOOLEAN but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextBoolean(JsonTreeReader.java:191) */
        jsonTreeReader.nextBoolean();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.beginArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method beginArray()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeReader#peekStack()
 * @utbot.invokes {@link com.google.gson.JsonArray#iterator()}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeReader#push(java.lang.Object)
 *  */
    @Test
    public void testBeginArray_JsonTreeReaderPush() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        elements.add(null);
        elements.add(null);
        elements.add(null);
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack[0] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        int[] pathIndices = new int[18];
        pathIndices[0] = -255;
        pathIndices[1] = -255;
        pathIndices[2] = -255;
        pathIndices[3] = -255;
        pathIndices[4] = -255;
        pathIndices[5] = -255;
        pathIndices[6] = -255;
        pathIndices[7] = -255;
        pathIndices[8] = -255;
        pathIndices[9] = -255;
        pathIndices[10] = -255;
        pathIndices[11] = -255;
        pathIndices[12] = -255;
        pathIndices[13] = -255;
        pathIndices[14] = -255;
        pathIndices[15] = -255;
        pathIndices[16] = -255;
        pathIndices[17] = -255;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object initialJsonTreeReaderStack1 = get(jsonTreeReaderStack, 1);
        
        jsonTreeReader.beginArray();
        
        java.lang.Object[] jsonTreeReaderStack1 = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack1 = get(jsonTreeReaderStack1, 1);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        int[] jsonTreeReaderPathIndices = ((int[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices"));
        int finalJsonTreeReaderPathIndices1 = ((Integer) get(jsonTreeReaderPathIndices, 1));
        
        assertFalse(initialJsonTreeReaderStack1 == finalJsonTreeReaderStack1);
        
        assertEquals(2, finalJsonTreeReaderStackSize);
        
        assertEquals(0, finalJsonTreeReaderPathIndices1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beginArray()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.IllegalStateException: Expected BEGIN_ARRAY but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.IllegalStateException: Expected BEGIN_ARRAY but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.IllegalStateException: Expected BEGIN_ARRAY but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.IllegalStateException: Expected BEGIN_ARRAY but was STRING at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.IllegalStateException: Expected BEGIN_ARRAY but was NUMBER at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowIllegalStateException_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.IllegalStateException: Expected BEGIN_ARRAY but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Iterator anonymousIterator = ((Iterator) createInstance("java.util.AbstractMap$2$1"));
        stack[0] = ((Object) anonymousIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1] = 0;
 *  */
    @Test
    public void testBeginArray_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[34];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        elements.add(null);
        elements.add(null);
        elements.add(null);
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack[0] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        int[] pathIndices = {-255};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:75) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
            jsonTreeReader.beginArray();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            JsonToken jsonToken = JsonToken.END_DOCUMENT;
            stack[0] = ((Object) jsonToken);
            Object object = createInstance("java.lang.Object");
            stack[1] = object;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
            jsonTreeReader.beginArray();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expect(JsonToken.BEGIN_ARRAY);
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1] = 0;
 *  */
    @Test
    public void testBeginArray_ThrowNullPointerException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[21];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        elements.add(null);
        elements.add(null);
        elements.add(null);
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack[0] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:75) */
        jsonTreeReader.beginArray();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method beginArray()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginArray()}
     */
    @Test
    public void testBeginArrayThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.IllegalStateException: Expected BEGIN_ARRAY but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:72) */
        jsonTreeReader.beginArray();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method beginArray()
    
    @Test
    public void testBeginArray1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[5];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        ArrayList elements = new ArrayList();
        elements.add(null);
        elements.add(null);
        elements.add(null);
        setField(jsonArray, "com.google.gson.JsonArray", "elements", elements);
        stack[4] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 5);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginArray] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.copyOf(Arrays.java:3586)
            com.google.gson.internal.bind.JsonTreeReader.push(JsonTreeReader.java:301)
            com.google.gson.internal.bind.JsonTreeReader.beginArray(JsonTreeReader.java:74) */
        jsonTreeReader.beginArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.endObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endObject()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.IllegalStateException: Expected END_OBJECT but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.IllegalStateException: Expected END_OBJECT but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.IllegalStateException: Expected END_OBJECT but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.IllegalStateException: Expected END_OBJECT but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.IllegalStateException: Expected END_OBJECT but was STRING at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.IllegalStateException: Expected END_OBJECT but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowIllegalStateException_6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.IllegalStateException: Expected END_OBJECT but was NUMBER at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        ListIterator anonymousListIterator = ((ListIterator) createInstance("java.util.ArrayList$SubList$1"));
        stack[0] = ((Object) anonymousListIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null, null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
            jsonTreeReader.endObject();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            JsonToken jsonToken = JsonToken.END_DOCUMENT;
            stack[0] = ((Object) jsonToken);
            Object object = createInstance("java.lang.Object");
            stack[1] = object;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
            jsonTreeReader.endObject();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expect(JsonToken.END_OBJECT);
 *  */
    @Test
    public void testEndObject_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method endObject()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endObject()}
     */
    @Test
    public void testEndObjectThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endObject] produces [java.lang.IllegalStateException: Expected END_OBJECT but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endObject(JsonTreeReader.java:94) */
        jsonTreeReader.endObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.endArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endArray()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.IllegalStateException: Expected END_ARRAY but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.IllegalStateException: Expected END_ARRAY but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.IllegalStateException: Expected END_ARRAY but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.IllegalStateException: Expected END_ARRAY but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.IllegalStateException: Expected END_ARRAY but was STRING at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.IllegalStateException: Expected END_ARRAY but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowIllegalStateException_6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.IllegalStateException: Expected END_ARRAY but was NUMBER at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        ListIterator anonymousListIterator = ((ListIterator) createInstance("java.util.ArrayList$SubList$1"));
        stack[0] = ((Object) anonymousListIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
            jsonTreeReader.endArray();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            JsonToken jsonToken = JsonToken.END_DOCUMENT;
            stack[0] = ((Object) jsonToken);
            Object object = createInstance("java.lang.Object");
            stack[1] = object;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
            jsonTreeReader.endArray();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expect(JsonToken.END_ARRAY);
 *  */
    @Test
    public void testEndArray_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method endArray()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#endArray()}
     */
    @Test
    public void testEndArrayThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.endArray] produces [java.lang.IllegalStateException: Expected END_ARRAY but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.endArray(JsonTreeReader.java:79) */
        jsonTreeReader.endArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.beginObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beginObject()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.IllegalStateException: Expected BEGIN_OBJECT but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.IllegalStateException: Expected BEGIN_OBJECT but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.IllegalStateException: Expected BEGIN_OBJECT but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.IllegalStateException: Expected BEGIN_OBJECT but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowIllegalStateException_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.IllegalStateException: Expected BEGIN_OBJECT but was NUMBER at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Iterator anonymousIterator = ((Iterator) createInstance("java.util.AbstractMap$2$1"));
        stack[0] = ((Object) anonymousIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
            jsonTreeReader.beginObject();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            JsonToken jsonToken = JsonToken.END_DOCUMENT;
            stack[0] = ((Object) jsonToken);
            Object object = createInstance("java.lang.Object");
            stack[1] = object;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
            jsonTreeReader.beginObject();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expect(JsonToken.BEGIN_OBJECT);
 *  */
    @Test
    public void testBeginObject_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method beginObject()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#beginObject()}
     */
    @Test
    public void testBeginObjectThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.beginObject] produces [java.lang.IllegalStateException: Expected BEGIN_OBJECT but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.beginObject(JsonTreeReader.java:88) */
        jsonTreeReader.beginObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.popStack
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method popStack()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#popStack()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testPopStack_ReturnResult() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method popStackMethod = jsonTreeReaderClazz.getDeclaredMethod("popStack");
        popStackMethod.setAccessible(true);
        java.lang.Object[] popStackMethodArguments = new java.lang.Object[0];
        Object actual = popStackMethod.invoke(jsonTreeReader, popStackMethodArguments);
        
        assertNull(actual);
        
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStack()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#popStack()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object result = stack[--stackSize];
 *  */
    @Test
    public void testPopStack_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.popStack] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.popStack(JsonTreeReader.java:155) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method popStackMethod = jsonTreeReaderClazz.getDeclaredMethod("popStack");
        popStackMethod.setAccessible(true);
        java.lang.Object[] popStackMethodArguments = new java.lang.Object[0];
        try {
            popStackMethod.invoke(jsonTreeReader, popStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#popStack()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object result = stack[--stackSize];
 *  */
    @Test
    public void testPopStack_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.popStack] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.popStack(JsonTreeReader.java:155) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method popStackMethod = jsonTreeReaderClazz.getDeclaredMethod("popStack");
        popStackMethod.setAccessible(true);
        java.lang.Object[] popStackMethodArguments = new java.lang.Object[0];
        try {
            popStackMethod.invoke(jsonTreeReader, popStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#popStack()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object result = stack[--stackSize];
 *  */
    @Test
    public void testPopStack_ThrowNullPointerException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.popStack] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.popStack(JsonTreeReader.java:155) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method popStackMethod = jsonTreeReaderClazz.getDeclaredMethod("popStack");
        popStackMethod.setAccessible(true);
        java.lang.Object[] popStackMethodArguments = new java.lang.Object[0];
        try {
            popStackMethod.invoke(jsonTreeReader, popStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method popStack()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#popStack()}
     */
    @Test
    public void testPopStack() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method popStackMethod = jsonTreeReaderClazz.getDeclaredMethod("popStack");
        popStackMethod.setAccessible(true);
        java.lang.Object[] popStackMethodArguments = new java.lang.Object[0];
        JsonNull actual = ((JsonNull) popStackMethod.invoke(jsonTreeReader, popStackMethodArguments));
        
        // com.google.gson.JsonNull has overridden equals method
        assertEquals(jsonNull, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.nextName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextName()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.IllegalStateException: Expected NAME but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.IllegalStateException: Expected NAME but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.IllegalStateException: Expected NAME but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.IllegalStateException: Expected NAME but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.IllegalStateException: Expected NAME but was STRING at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowIllegalStateException_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.IllegalStateException: Expected NAME but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowIllegalStateException_6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.IllegalStateException: Expected NAME but was NUMBER at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        ListIterator anonymousListIterator = ((ListIterator) createInstance("java.util.ArrayList$SubList$1"));
        stack[0] = ((Object) anonymousListIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null, null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
            jsonTreeReader.nextName();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            JsonToken jsonToken = JsonToken.END_DOCUMENT;
            stack[0] = ((Object) jsonToken);
            Object object = createInstance("java.lang.Object");
            stack[1] = object;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
            jsonTreeReader.nextName();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testNextName_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method nextName()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextName()}
     */
    @Test
    public void testNextNameThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextName] produces [java.lang.IllegalStateException: Expected NAME but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.nextName(JsonTreeReader.java:168) */
        jsonTreeReader.nextName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.skipValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipValue()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 *  */
    @Test
    public void testSkipValue() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[1];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        java.lang.String[] pathNames = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames", pathNames);
        
        jsonTreeReader.skipValue();
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        java.lang.String[] jsonTreeReaderPathNames = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames0 = ((String) get(jsonTreeReaderPathNames, 0));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
        
        assertNull(finalJsonTreeReaderPathNames0);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 *  */
    @Test
    public void testSkipValue_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[3];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        JsonToken jsonToken = JsonToken.NULL;
        stack[1] = ((Object) jsonToken);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        jsonTreeReader.skipValue();
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 *  */
    @Test
    public void testSkipValue_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[2];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        java.lang.String[] pathNames = {null, null, null, null, null, null, null, null, null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames", pathNames);
        int[] pathIndices = {
            -255, 1, -255, -255, -255, -255, -255, -255,
            -255
        };
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        jsonTreeReader.skipValue();
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack1 = get(jsonTreeReaderStack, 1);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        java.lang.String[] jsonTreeReaderPathNames = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames1 = ((String) get(jsonTreeReaderPathNames, 1));
        java.lang.String[] jsonTreeReaderPathNames1 = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames2 = ((String) get(jsonTreeReaderPathNames1, 2));
        java.lang.String[] jsonTreeReaderPathNames2 = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames3 = ((String) get(jsonTreeReaderPathNames2, 3));
        java.lang.String[] jsonTreeReaderPathNames3 = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames4 = ((String) get(jsonTreeReaderPathNames3, 4));
        java.lang.String[] jsonTreeReaderPathNames4 = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames5 = ((String) get(jsonTreeReaderPathNames4, 5));
        java.lang.String[] jsonTreeReaderPathNames5 = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames6 = ((String) get(jsonTreeReaderPathNames5, 6));
        java.lang.String[] jsonTreeReaderPathNames6 = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames7 = ((String) get(jsonTreeReaderPathNames6, 7));
        java.lang.String[] jsonTreeReaderPathNames7 = ((java.lang.String[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames"));
        String finalJsonTreeReaderPathNames8 = ((String) get(jsonTreeReaderPathNames7, 8));
        int[] jsonTreeReaderPathIndices = ((int[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices"));
        int finalJsonTreeReaderPathIndices0 = ((Integer) get(jsonTreeReaderPathIndices, 0));
        
        assertNull(finalJsonTreeReaderStack1);
        
        assertEquals(1, finalJsonTreeReaderStackSize);
        
        assertNull(finalJsonTreeReaderPathNames1);
        
        assertNull(finalJsonTreeReaderPathNames2);
        
        assertNull(finalJsonTreeReaderPathNames3);
        
        assertNull(finalJsonTreeReaderPathNames4);
        
        assertNull(finalJsonTreeReaderPathNames5);
        
        assertNull(finalJsonTreeReaderPathNames6);
        
        assertNull(finalJsonTreeReaderPathNames7);
        
        assertNull(finalJsonTreeReaderPathNames8);
        
        assertEquals(-254, finalJsonTreeReaderPathIndices0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipValue()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: peek() == JsonToken.NAME
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.skipValue(JsonTreeReader.java:271) */
        jsonTreeReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: peek() == JsonToken.NAME
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object keyIterator = createInstance("java.util.HashMap$KeyIterator");
        stack[0] = keyIterator;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.skipValue(JsonTreeReader.java:271) */
        jsonTreeReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: peek() == JsonToken.NAME
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.skipValue(JsonTreeReader.java:271) */
        jsonTreeReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 * @utbot.executesCondition {@code (peek() == JsonToken.NAME): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathNames[stackSize - 1] = "null";
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[2] = ((Object) jsonToken);
        stack[5] = ((Object) jsonToken);
        stack[6] = ((Object) jsonToken);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        java.lang.String[] pathNames = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames", pathNames);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.internal.bind.JsonTreeReader.skipValue(JsonTreeReader.java:277) */
        jsonTreeReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 * @utbot.executesCondition {@code (peek() == JsonToken.NAME): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testSkipValue_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        java.lang.String[] pathNames = new java.lang.String[12];
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames", pathNames);
        int[] pathIndices = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.skipValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.internal.bind.JsonTreeReader.skipValue(JsonTreeReader.java:281) */
        jsonTreeReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: peek() == JsonToken.NAME
 *  */
    @Test
    public void testSkipValue_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.skipValue(JsonTreeReader.java:271) */
        jsonTreeReader.skipValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
 * @utbot.executesCondition {@code (peek() == JsonToken.NAME): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testSkipValue_ThrowNullPointerException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[13];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        java.lang.String[] pathNames = {null, null, null, null, null, null, null, null, null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathNames", pathNames);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.skipValue(JsonTreeReader.java:281) */
        jsonTreeReader.skipValue();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method skipValue()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#skipValue()}
     */
    @Test
    public void testSkipValue1() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        jsonTreeReader.skipValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method skipValue()
    
    @Test
    public void testSkipValue2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        stack[1] = ((Object) jsonTreeReader);
        stack[2] = ((Object) jsonTreeReader);
        stack[3] = ((Object) jsonTreeReader);
        stack[4] = ((Object) jsonTreeReader);
        stack[5] = ((Object) jsonTreeReader);
        stack[6] = ((Object) jsonTreeReader);
        stack[7] = ((Object) jsonTreeReader);
        stack[8] = ((Object) jsonTreeReader);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        jsonTreeReader.skipValue();
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    
    @Test
    public void testSkipValue3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[0] = ((Object) jsonNull);
        stack[1] = ((Object) jsonTreeReader);
        stack[2] = ((Object) jsonTreeReader);
        stack[3] = ((Object) jsonTreeReader);
        stack[4] = ((Object) jsonTreeReader);
        stack[5] = ((Object) jsonTreeReader);
        stack[6] = ((Object) jsonTreeReader);
        stack[7] = ((Object) jsonTreeReader);
        stack[8] = ((Object) jsonTreeReader);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        jsonTreeReader.skipValue();
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    
    @Test
    public void testSkipValue4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        stack[1] = ((Object) jsonTreeReader);
        stack[2] = ((Object) jsonTreeReader);
        stack[3] = ((Object) jsonTreeReader);
        stack[4] = ((Object) jsonTreeReader);
        stack[5] = ((Object) jsonTreeReader);
        stack[6] = ((Object) jsonTreeReader);
        stack[7] = ((Object) jsonTreeReader);
        stack[8] = ((Object) jsonTreeReader);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        jsonTreeReader.skipValue();
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipValue()
    
    @Test
    public void testSkipValue5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.skipValue] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.popStack(JsonTreeReader.java:155)
            com.google.gson.internal.bind.JsonTreeReader.skipValue(JsonTreeReader.java:275) */
        jsonTreeReader.skipValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.locationString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method locationString()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#locationString()}
 *  */
    @Test
    public void testLocationString() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[1];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#locationString()}
 *  */
    @Test
    public void testLocationString_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[1];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#locationString()}
 *  */
    @Test
    public void testLocationString_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[3];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[2] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#locationString()}
 *  */
    @Test
    public void testLocationString_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[3];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[2] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method locationString()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#locationString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return " at path " + getPath();
 *  */
    @Test
    public void testLocationString_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.locationString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.internal.bind.JsonTreeReader.getPath(JsonTreeReader.java:310)
            com.google.gson.internal.bind.JsonTreeReader.locationString(JsonTreeReader.java:327) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        try {
            locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#locationString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return " at path " + getPath();
 *  */
    @Test
    public void testLocationString_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.locationString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.getPath(JsonTreeReader.java:310)
            com.google.gson.internal.bind.JsonTreeReader.locationString(JsonTreeReader.java:327) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        try {
            locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method locationString()
    
    @Test
    public void testLocationString1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -2147483647);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLocationString2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        Object object = createInstance("java.lang.Object");
        stack[1] = object;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLocationString3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[0] = ((Object) jsonObject);
        Object object = createInstance("java.lang.Object");
        stack[1] = object;
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[2] = ((Object) jsonArray);
        ListIterator anonymousListIterator = ((ListIterator) createInstance("java.util.ArrayList$SubList$1"));
        stack[3] = ((Object) anonymousListIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLocationString4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[13];
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[0] = ((Object) jsonArray);
        Object object = createInstance("java.lang.Object");
        stack[1] = object;
        Object object1 = createInstance("java.lang.Object");
        stack[2] = object1;
        stack[3] = object1;
        stack[4] = object1;
        stack[5] = object1;
        stack[6] = object1;
        stack[7] = object1;
        stack[8] = object1;
        stack[9] = object1;
        stack[10] = object1;
        stack[11] = object1;
        stack[12] = object1;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 3);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLocationString5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        stack[2] = object;
        stack[3] = object;
        stack[4] = object;
        stack[5] = object;
        stack[6] = object;
        stack[7] = object;
        stack[8] = object;
        stack[9] = object;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLocationString6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        Object object1 = createInstance("java.lang.Object");
        stack[1] = object1;
        stack[2] = object1;
        stack[3] = object1;
        stack[4] = object1;
        stack[5] = object1;
        stack[6] = object1;
        stack[7] = object1;
        stack[8] = object1;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLocationString7() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        stack[0] = object;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method locationStringMethod = jsonTreeReaderClazz.getDeclaredMethod("locationString");
        locationStringMethod.setAccessible(true);
        java.lang.Object[] locationStringMethodArguments = new java.lang.Object[0];
        String actual = ((String) locationStringMethod.invoke(jsonTreeReader, locationStringMethodArguments));
        
        String expected = " at path $";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for locationString
    
    public void testLocationString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.nextNull
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextNull()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextNull()}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeReader#expect(com.google.gson.stream.JsonToken)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.NULL);
 *  */
    @Test
    public void testNextNull_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.nextNull(JsonTreeReader.java:200) */
        jsonTreeReader.nextNull();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextNull()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextNull()}
     */
    @Test
    public void testNextNull() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        jsonTreeReader.nextNull();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method promoteNameToValue()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.IllegalStateException: Expected NAME but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.IllegalStateException: Expected NAME but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.IllegalStateException: Expected NAME but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.IllegalStateException: Expected NAME but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.IllegalStateException: Expected NAME but was STRING at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowIllegalStateException_5() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.IllegalStateException: Expected NAME but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowIllegalStateException_6() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.IllegalStateException: Expected NAME but was NUMBER at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        ListIterator anonymousListIterator = ((ListIterator) createInstance("java.util.ArrayList$SubList$1"));
        stack[0] = ((Object) anonymousListIterator);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
            jsonTreeReader.promoteNameToValue();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            JsonToken jsonToken = JsonToken.END_DOCUMENT;
            stack[0] = ((Object) jsonToken);
            Object object = createInstance("java.lang.Object");
            stack[1] = object;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
                com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
            jsonTreeReader.promoteNameToValue();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expect(JsonToken.NAME);
 *  */
    @Test
    public void testPromoteNameToValue_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:161)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method promoteNameToValue()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#promoteNameToValue()}
     */
    @Test
    public void testPromoteNameToValueThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue] produces [java.lang.IllegalStateException: Expected NAME but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.expect(JsonTreeReader.java:163)
            com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue(JsonTreeReader.java:290) */
        jsonTreeReader.promoteNameToValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.peekStack
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method peekStack()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peekStack()}
 * @utbot.returnsFrom {@code return stack[stackSize - 1];}
 *  */
    @Test
    public void testPeekStack_ReturnStackSize1OfStack() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method peekStackMethod = jsonTreeReaderClazz.getDeclaredMethod("peekStack");
        peekStackMethod.setAccessible(true);
        java.lang.Object[] peekStackMethodArguments = new java.lang.Object[0];
        Object actual = peekStackMethod.invoke(jsonTreeReader, peekStackMethodArguments);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method peekStack()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peekStack()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return stack[stackSize - 1];
 *  */
    @Test
    public void testPeekStack_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peekStack] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method peekStackMethod = jsonTreeReaderClazz.getDeclaredMethod("peekStack");
        peekStackMethod.setAccessible(true);
        java.lang.Object[] peekStackMethodArguments = new java.lang.Object[0];
        try {
            peekStackMethod.invoke(jsonTreeReader, peekStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peekStack()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return stack[stackSize - 1];
 *  */
    @Test
    public void testPeekStack_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peekStack] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method peekStackMethod = jsonTreeReaderClazz.getDeclaredMethod("peekStack");
        peekStackMethod.setAccessible(true);
        java.lang.Object[] peekStackMethodArguments = new java.lang.Object[0];
        try {
            peekStackMethod.invoke(jsonTreeReader, peekStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peekStack()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return stack[stackSize - 1];
 *  */
    @Test
    public void testPeekStack_ThrowNullPointerException() throws Throwable  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.peekStack] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151) */
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method peekStackMethod = jsonTreeReaderClazz.getDeclaredMethod("peekStack");
        peekStackMethod.setAccessible(true);
        java.lang.Object[] peekStackMethodArguments = new java.lang.Object[0];
        try {
            peekStackMethod.invoke(jsonTreeReader, peekStackMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method peekStack()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#peekStack()}
     */
    @Test
    public void testPeekStack() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Method peekStackMethod = jsonTreeReaderClazz.getDeclaredMethod("peekStack");
        peekStackMethod.setAccessible(true);
        java.lang.Object[] peekStackMethodArguments = new java.lang.Object[0];
        JsonNull actual = ((JsonNull) peekStackMethod.invoke(jsonTreeReader, peekStackMethodArguments));
        
        // com.google.gson.JsonNull has overridden equals method
        assertEquals(jsonNull, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonTreeReader.nextString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextString()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): False}
 * @utbot.executesCondition {@code (stackSize > 0): False}
 * @utbot.invokes {@link com.google.gson.internal.bind.JsonTreeReader#peek()}
 * @utbot.invokes com.google.gson.internal.bind.JsonTreeReader#popStack()
 * @utbot.invokes {@link com.google.gson.JsonPrimitive#getAsString()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNextString_StackSizeLessOrEqualZero() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[2];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        String actual = jsonTreeReader.nextString();
        
        assertEquals(value, actual);
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextString()
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.STRING + " but was " + token + locationString()
 *  */
    @Test
    public void testNextString_ThrowIllegalStateException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.IllegalStateException: Expected STRING but was END_DOCUMENT at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:181) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.STRING + " but was " + token + locationString()
 *  */
    @Test
    public void testNextString_ThrowIllegalStateException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonObject jsonObject = ((JsonObject) createInstance("com.google.gson.JsonObject"));
        stack[1] = ((Object) jsonObject);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.IllegalStateException: Expected STRING but was BEGIN_OBJECT at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:181) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.STRING + " but was " + token + locationString()
 *  */
    @Test
    public void testNextString_ThrowIllegalStateException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[4];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonNull jsonNull = ((JsonNull) createInstance("com.google.gson.JsonNull"));
        stack[1] = ((Object) jsonNull);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.IllegalStateException: Expected STRING but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:181) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.STRING + " but was " + token + locationString()
 *  */
    @Test
    public void testNextString_ThrowIllegalStateException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonArray jsonArray = ((JsonArray) createInstance("com.google.gson.JsonArray"));
        stack[1] = ((Object) jsonArray);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.IllegalStateException: Expected STRING but was BEGIN_ARRAY at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:181) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): True}
 * @utbot.executesCondition {@code (token != JsonToken.NUMBER): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: "Expected " + JsonToken.STRING + " but was " + token + locationString()
 *  */
    @Test
    public void testNextString_ThrowIllegalStateException_4() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonToken jsonToken = JsonToken.END_DOCUMENT;
        stack[0] = ((Object) jsonToken);
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Boolean value = false;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.IllegalStateException: Expected STRING but was BOOLEAN at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:181) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 129);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:178) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextString_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[9];
        Object listItr = createInstance("java.util.ImmutableCollections$ListItr");
        stack[0] = listItr;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:178) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextString_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -254);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:178) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextString_ThrowAssertionError() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:178) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): False}
 * @utbot.executesCondition {@code (stackSize > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextString_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        int[] pathIndices = {};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "pathIndices", pathIndices);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:185) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextString_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:178) */
            jsonTreeReader.nextString();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.throwsException {@link java.lang.AssertionError} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextString_ThrowAssertionError_2() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            Object sentinelClosed = new Object();
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = new java.lang.Object[12];
            Object object = createInstance("java.lang.Object");
            stack[0] = object;
            Object object1 = createInstance("java.lang.Object");
            stack[1] = object1;
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
            
            /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:178) */
            jsonTreeReader.nextString();
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken token = peek();
 *  */
    @Test
    public void testNextString_ThrowNullPointerException() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", -255);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:178) */
        jsonTreeReader.nextString();
    }
    
    /**
    @utbot.classUnderTest {@link JsonTreeReader}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
 * @utbot.executesCondition {@code (token != JsonToken.STRING): False}
 * @utbot.executesCondition {@code (stackSize > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pathIndices[stackSize - 1]++;
 *  */
    @Test
    public void testNextString_ThrowNullPointerException_1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[10];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        String value = "";
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:185) */
        jsonTreeReader.nextString();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method nextString()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.JsonTreeReader}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonTreeReader#nextString()}
     */
    @Test
    public void testNextStringThrowsISE() throws IOException  {
        JsonNull jsonNull = new JsonNull();
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonNull);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonTreeReader.nextString] produces [java.lang.IllegalStateException: Expected STRING but was NULL at path $]
            com.google.gson.internal.bind.JsonTreeReader.nextString(JsonTreeReader.java:181) */
        jsonTreeReader.nextString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextString()
    
    @Test
    public void testNextString1() throws Exception  {
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[1];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Integer value = 0;
        setField(jsonPrimitive, "com.google.gson.JsonPrimitive", "value", value);
        stack[0] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        String actual = jsonTreeReader.nextString();
        
        String expected = "0";
        
        assertEquals(expected, actual);
        
        java.lang.Object[] jsonTreeReaderStack = ((java.lang.Object[]) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack"));
        Object finalJsonTreeReaderStack0 = get(jsonTreeReaderStack, 0);
        int finalJsonTreeReaderStackSize = ((Integer) getFieldValue(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize"));
        
        assertNull(finalJsonTreeReaderStack0);
        
        assertEquals(0, finalJsonTreeReaderStackSize);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1016129955102000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1016129955102000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1016129955114600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016129955102000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016129955114600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1016129968346700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1016129968346700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1016129968351700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016129968346700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016129968351700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1016129969598000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1016129969598000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1016129969601600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016129969598000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016129969601600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1016129970155300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1016129970155300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1016129970157700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016129970155300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016129970157700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

