package com.fasterxml.jackson.core.util;

import org.junit.Test;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.core.json.JsonReadContext;
import java.io.DataInput;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import java.io.EOFException;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_core_util_JsonParserSequenceTest {
    ///region Test suites for executable com.fasterxml.jackson.core.util.JsonParserSequence.nextToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextToken()
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextToken_ReturnT() throws IOException, ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        JsonToken expected = JsonToken.FIELD_NAME;
        
        assertEquals(expected, actual);
        
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_nextToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        
        assertNull(finalJsonParserSequenceDelegate_nextToken);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextToken_ReturnT_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonParser jsonParser1 = jsonParserSequence.delegate;
        JsonReadContext jsonParser1Delegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        int finalJsonParserSequenceDelegate_parsingContext_type = ((Integer) getFieldValue(jsonParser1Delegate_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonParser jsonParser2 = jsonParserSequence.delegate;
        JsonReadContext jsonParser2Delegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser2, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        int finalJsonParserSequenceDelegate_parsingContext_index = ((Integer) getFieldValue(jsonParser2Delegate_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        JsonParser jsonParser3 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_nextToken = ((JsonToken) getFieldValue(jsonParser3, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        JsonParser jsonParser4 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
        
        assertEquals(1, finalJsonParserSequenceDelegate_parsingContext_type);
        
        assertEquals(-1, finalJsonParserSequenceDelegate_parsingContext_index);
        
        assertNull(finalJsonParserSequenceDelegate_nextToken);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextToken_ReturnT_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        JsonParser jsonParser1 = jsonParserSequence.delegate;
        JsonReadContext jsonParser1Delegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        int finalJsonParserSequenceDelegate_parsingContext_type = ((Integer) getFieldValue(jsonParser1Delegate_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonParser jsonParser2 = jsonParserSequence.delegate;
        JsonReadContext jsonParser2Delegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser2, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        int finalJsonParserSequenceDelegate_parsingContext_index = ((Integer) getFieldValue(jsonParser2Delegate_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        JsonParser jsonParser3 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_nextToken = ((JsonToken) getFieldValue(jsonParser3, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        JsonParser jsonParser4 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
        
        assertEquals(2, finalJsonParserSequenceDelegate_parsingContext_type);
        
        assertEquals(-1, finalJsonParserSequenceDelegate_parsingContext_index);
        
        assertNull(finalJsonParserSequenceDelegate_nextToken);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextToken_ReturnT_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        JsonToken expected = JsonToken.END_OBJECT;
        
        assertEquals(expected, actual);
        
        JsonParser jsonParser1 = jsonParserSequence.delegate;
        int finalJsonParserSequenceDelegate_nextByte = ((Integer) getFieldValue(jsonParser1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        JsonParser jsonParser2 = jsonParserSequence.delegate;
        JsonReadContext finalJsonParserSequenceDelegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser2, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        JsonParser jsonParser3 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
        
        assertEquals(-1, finalJsonParserSequenceDelegate_nextByte);
        
        assertNull(finalJsonParserSequenceDelegate_parsingContext);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextToken_ReturnT_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        JsonToken expected = JsonToken.VALUE_STRING;
        
        assertEquals(expected, actual);
        
        JsonParser jsonParser1 = jsonParserSequence.delegate;
        boolean finalJsonParserSequenceDelegate_tokenIncomplete = ((Boolean) getFieldValue(jsonParser1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        JsonParser jsonParser2 = jsonParserSequence.delegate;
        int finalJsonParserSequenceDelegate_nextByte = ((Integer) getFieldValue(jsonParser2, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        JsonParser jsonParser3 = jsonParserSequence.delegate;
        JsonReadContext jsonParser3Delegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser3, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        int finalJsonParserSequenceDelegate_parsingContext_index = ((Integer) getFieldValue(jsonParser3Delegate_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        JsonParser jsonParser4 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
        
        assertTrue(finalJsonParserSequenceDelegate_tokenIncomplete);
        
        assertEquals(-1, finalJsonParserSequenceDelegate_nextByte);
        
        assertEquals(1, finalJsonParserSequenceDelegate_parsingContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextToken_ReturnT_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        JsonToken expected = JsonToken.END_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonParser jsonParser1 = jsonParserSequence.delegate;
        DataInput jsonParser1Delegate_inputData = ((DataInput) getFieldValue(jsonParser1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object jsonParser1Delegate_inputDataDelegate_inputDataBin = getFieldValue(jsonParser1Delegate_inputData, "java.io.ObjectInputStream", "bin");
        Object jsonParser1Delegate_inputDataDelegate_inputDataBinDelegate_inputDataBinIn = getFieldValue(jsonParser1Delegate_inputDataDelegate_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "in");
        int finalJsonParserSequenceDelegate_inputDataBinInPeekb = ((Integer) getFieldValue(jsonParser1Delegate_inputDataDelegate_inputDataBinDelegate_inputDataBinIn, "java.io.ObjectInputStream$PeekInputStream", "peekb"));
        JsonParser jsonParser2 = jsonParserSequence.delegate;
        int finalJsonParserSequenceDelegate_nextByte = ((Integer) getFieldValue(jsonParser2, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        JsonParser jsonParser3 = jsonParserSequence.delegate;
        JsonReadContext finalJsonParserSequenceDelegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser3, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        JsonParser jsonParser4 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
        
        assertEquals(-1, finalJsonParserSequenceDelegate_inputDataBinInPeekb);
        
        assertEquals(-1, finalJsonParserSequenceDelegate_nextByte);
        
        assertNull(finalJsonParserSequenceDelegate_parsingContext);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextToken_ReturnT_6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        JsonToken expected = JsonToken.END_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonParser jsonParser1 = jsonParserSequence.delegate;
        DataInput jsonParser1Delegate_inputData = ((DataInput) getFieldValue(jsonParser1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        Object jsonParser1Delegate_inputDataDelegate_inputDataBin = getFieldValue(jsonParser1Delegate_inputData, "java.io.ObjectInputStream", "bin");
        Object jsonParser1Delegate_inputDataDelegate_inputDataBinDelegate_inputDataBinIn = getFieldValue(jsonParser1Delegate_inputDataDelegate_inputDataBin, "java.io.ObjectInputStream$BlockDataInputStream", "in");
        int finalJsonParserSequenceDelegate_inputDataBinInPeekb = ((Integer) getFieldValue(jsonParser1Delegate_inputDataDelegate_inputDataBinDelegate_inputDataBinIn, "java.io.ObjectInputStream$PeekInputStream", "peekb"));
        JsonParser jsonParser2 = jsonParserSequence.delegate;
        JsonReadContext finalJsonParserSequenceDelegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser2, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        JsonParser jsonParser3 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
        
        assertEquals(-1, finalJsonParserSequenceDelegate_inputDataBinInPeekb);
        
        assertNull(finalJsonParserSequenceDelegate_parsingContext);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextToken_ReturnT_7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        JsonToken expected = JsonToken.VALUE_STRING;
        
        assertEquals(expected, actual);
        
        JsonParser jsonParser1 = jsonParserSequence.delegate;
        boolean finalJsonParserSequenceDelegate_tokenIncomplete = ((Boolean) getFieldValue(jsonParser1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        JsonParser jsonParser2 = jsonParserSequence.delegate;
        int finalJsonParserSequenceDelegate_nextByte = ((Integer) getFieldValue(jsonParser2, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        JsonParser jsonParser3 = jsonParserSequence.delegate;
        JsonReadContext jsonParser3Delegate_parsingContext = ((JsonReadContext) getFieldValue(jsonParser3, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        int finalJsonParserSequenceDelegate_parsingContext_index = ((Integer) getFieldValue(jsonParser3Delegate_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        JsonParser jsonParser4 = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
        
        assertTrue(finalJsonParserSequenceDelegate_tokenIncomplete);
        
        assertEquals(-1, finalJsonParserSequenceDelegate_nextByte);
        
        assertEquals(0, finalJsonParserSequenceDelegate_parsingContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.JsonParserSequence#switchToNext()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNextToken_JsonParserSequenceSwitchToNext() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {null};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = jsonParserSequence.nextToken();
        
        assertNull(actual);
        
        JsonParser finalJsonParserSequence_parsers0 = jsonParserSequence._parsers[0];
        JsonParser jsonParser = jsonParserSequence.delegate;
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalJsonParserSequence_parsers0);
        
        assertNull(finalJsonParserSequenceDelegate_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextToken()
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testNextToken_ThrowIndexOutOfBoundsException() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testNextToken_ThrowIndexOutOfBoundsException_1() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowIndexOutOfBoundsException_2() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(switchToNext())
 *  */
    @Test
    public void testNextToken_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = -1;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:149)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:108) */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_1() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_2() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_3() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_4() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_5() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_6() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_7() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_8() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException] */
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_9() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {null, null};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:109) */
        jsonParserSequence.nextToken();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method nextToken()
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.io.EOFException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test(expected = EOFException.class)
    public void testNextToken_ThrowEOFException() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        jsonParserSequence.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#nextToken()}
 * @utbot.throwsException {@link java.io.EOFException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test(expected = EOFException.class)
    public void testNextToken_ThrowEOFException_1() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        jsonParserSequence.nextToken();
    }
    ///endregion
    
    ///region Errors report for nextToken
    
    public void testNextToken_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.JsonParserSequence.close
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#close()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#close()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.JsonParserSequence#switchToNext()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: do {
 *     delegate.close();
 * } while (switchToNext());
 *  */
    @Test
    public void testClose_ThrowIndexOutOfBoundsException() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.close] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        jsonParserSequence.close();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: do {
 *     delegate.close();
 * } while (switchToNext());
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws IOException  {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.close] produces [java.lang.NullPointerException] */
        jsonParserSequence.close();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method close()
    
    @Test
    public void testClose1() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {null, null, null, null, null, null, null, null, null};
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        delegate2._nextParser = 1073741824;
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_closed", true);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.close] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:146)
            com.fasterxml.jackson.core.util.JsonParserSequence.close(JsonParserSequence.java:100) */
        jsonParserSequence.close();
    }
    ///endregion
    
    ///region Errors report for close
    
    public void testClose_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaIOFileDescriptorAccess sun.nio.ch.FileChannelImpl.fdAccess accessible:
        module java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static java.util.concurrent.ConcurrentHashMap sun.nio.ch.FileLockTable.lockMap accessible: module
        java.base does not "opens sun.nio.ch" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addFlattenedActiveParsers(java.util.List)
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 *  */
    @Test
    public void testAddFlattenedActiveParsers() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        
        jsonParserSequence.addFlattenedActiveParsers(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = _nextParser - 1, len = _parsers.length; i < len; ++i)} once
 *  */
    @Test
    public void testAddFlattenedActiveParsers_PInstanceOfJsonParserSequence() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = new com.fasterxml.jackson.core.JsonParser[1];
        JsonParserSequence jsonParserSequence1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers1 = {null};
        setField(jsonParserSequence1, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers1);
        jsonParserSequence1._nextParser = 2;
        _parsers[0] = ((JsonParser) jsonParserSequence1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        
        jsonParserSequence.addFlattenedActiveParsers(null);
        
        JsonParser jsonParser = jsonParserSequence._parsers[0];
        com.fasterxml.jackson.core.JsonParser[] jsonParser_parsers0_parsers = ((com.fasterxml.jackson.core.JsonParser[]) getFieldValue(jsonParser, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers"));
        JsonParser finalJsonParserSequence_parsers0_parsers0 = ((JsonParser) get(jsonParser_parsers0_parsers, 0));
        
        assertNull(finalJsonParserSequence_parsers0_parsers0);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = _nextParser - 1, len = _parsers.length; i < len; ++i)} once
 *  */
    @Test
    public void testAddFlattenedActiveParsers_NotPNotInstanceOfJsonParserSequence() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {null};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        jsonParserSequence.addFlattenedActiveParsers(arrayList);
        
        JsonParser finalJsonParserSequence_parsers0 = jsonParserSequence._parsers[0];
        
        assertNull(finalJsonParserSequence_parsers0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addFlattenedActiveParsers(java.util.List)
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = _nextParser - 1, len = _parsers.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonParser p = _parsers[i];
 *  */
    @Test
    public void testAddFlattenedActiveParsers_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:82) */
        jsonParserSequence.addFlattenedActiveParsers(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = _nextParser - 1, len = _parsers.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonParserSequence) p).addFlattenedActiveParsers(result);
 *  */
    @Test
    public void testAddFlattenedActiveParsers_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = new com.fasterxml.jackson.core.JsonParser[2];
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        _parsers[0] = ((JsonParser) uTF8DataInputJsonParser);
        JsonParserSequence jsonParserSequence1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers1 = {};
        setField(jsonParserSequence1, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers1);
        _parsers[1] = ((JsonParser) jsonParserSequence1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 2;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:82)
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:84) */
        jsonParserSequence.addFlattenedActiveParsers(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = _nextParser - 1, len = _parsers.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.add(p);
 *  */
    @Test
    public void testAddFlattenedActiveParsers_ThrowNullPointerException_1() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {null};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:86) */
        jsonParserSequence.addFlattenedActiveParsers(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = _nextParser - 1, len = _parsers.length; i < len; ++i)
 *  */
    @Test
    public void testAddFlattenedActiveParsers_ThrowNullPointerException() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        jsonParserSequence._nextParser = -255;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:81) */
        jsonParserSequence.addFlattenedActiveParsers(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.JsonParserSequence.containedParsersCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containedParsersCount()
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#containedParsersCount()}
 * @utbot.returnsFrom {@code return _parsers.length;}
 *  */
    @Test
    public void testContainedParsersCount_Return_parsersLength() {
        com.fasterxml.jackson.core.JsonParser[] jsonParserArray = {null};
        JsonParserSequence jsonParserSequence = new JsonParserSequence(jsonParserArray);
        
        int actual = jsonParserSequence.containedParsersCount();
        
        assertEquals(1, actual);
        
        JsonParser finalJsonParserSequence_parsers0 = jsonParserSequence._parsers[0];
        
        assertNull(finalJsonParserSequence_parsers0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containedParsersCount()
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#containedParsersCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _parsers.length;
 *  */
    @Test
    public void testContainedParsersCount_ThrowNullPointerException() {
        JsonParserSequence jsonParserSequence = new JsonParserSequence(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.containedParsersCount] produces [java.lang.NullPointerException] */
        jsonParserSequence.containedParsersCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method switchToNext()
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#switchToNext()}
 * @utbot.executesCondition {@code (_nextParser >= _parsers.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testSwitchToNext__nextParserGreaterOrEqual_parsersLength() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {null};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        
        boolean actual = jsonParserSequence.switchToNext();
        
        assertFalse(actual);
        
        JsonParser finalJsonParserSequence_parsers0 = jsonParserSequence._parsers[0];
        
        assertNull(finalJsonParserSequence_parsers0);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#switchToNext()}
 * @utbot.executesCondition {@code (_nextParser >= _parsers.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSwitchToNext__nextParserLessThan_parsersLength() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {null, null};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        
        boolean actual = jsonParserSequence.switchToNext();
        
        assertTrue(actual);
        
        JsonParser finalJsonParserSequence_parsers0 = jsonParserSequence._parsers[0];
        JsonParser finalJsonParserSequence_parsers1 = jsonParserSequence._parsers[1];
        int finalJsonParserSequence_nextParser = jsonParserSequence._nextParser;
        
        assertNull(finalJsonParserSequence_parsers0);
        
        assertNull(finalJsonParserSequence_parsers1);
        
        assertEquals(2, finalJsonParserSequence_nextParser);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method switchToNext()
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#switchToNext()}
 * @utbot.executesCondition {@code (_nextParser >= _parsers.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delegate = _parsers[_nextParser++];
 *  */
    @Test
    public void testSwitchToNext_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = -1;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:149) */
        jsonParserSequence.switchToNext();
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#switchToNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _nextParser >= _parsers.length
 *  */
    @Test
    public void testSwitchToNext_ThrowNullPointerException() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        jsonParserSequence._nextParser = -255;
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:146) */
        jsonParserSequence.switchToNext();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFlattened(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#createFlattened(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (!(first instanceof JsonParserSequence || second instanceof JsonParserSequence)): True}
 * @utbot.returnsFrom {@code return new JsonParserSequence(new JsonParser[] { first, second });}
 *  */
    @Test
    public void testCreateFlattened_NotFirstInstanceOfJsonParserSequenceOrSecondInstanceOfJsonParserSequence() throws Exception  {
        JsonParserSequence actual = JsonParserSequence.createFlattened(null, null);
        
        JsonParserSequence expected = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {null, null};
        setField(expected, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        expected._nextParser = 1;
        
        com.fasterxml.jackson.core.JsonParser[] expected_parsers = expected._parsers;
        com.fasterxml.jackson.core.JsonParser[] actual_parsers = actual._parsers;
        int expected_parsersSize = expected_parsers.length;
        assertEquals(expected_parsersSize, actual_parsers.length);
        assertTrue(deepEquals(expected_parsers, actual_parsers));
        
        int expected_nextParser = expected._nextParser;
        int actual_nextParser = actual._nextParser;
        assertEquals(expected_nextParser, actual_nextParser);
        
        JsonParser actualDelegate = actual.delegate;
        assertNull(actualDelegate);
        
        int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(expected_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#createFlattened(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (!(first instanceof JsonParserSequence || second instanceof JsonParserSequence)): False}
 * @utbot.executesCondition {@code (first instanceof JsonParserSequence): True}
 * @utbot.executesCondition {@code (second instanceof JsonParserSequence): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return new JsonParserSequence(p.toArray(new JsonParser[p.size()]));}
 *  */
    @Test
    public void testCreateFlattened_NotSecondNotInstanceOfJsonParserSequence() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        
        JsonParserSequence actual = JsonParserSequence.createFlattened(jsonParserSequence, null);
        
        JsonParserSequence expected = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers1 = {null};
        setField(expected, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers1);
        expected._nextParser = 1;
        
        com.fasterxml.jackson.core.JsonParser[] expected_parsers = expected._parsers;
        com.fasterxml.jackson.core.JsonParser[] actual_parsers = actual._parsers;
        int expected_parsersSize = expected_parsers.length;
        assertEquals(expected_parsersSize, actual_parsers.length);
        assertTrue(deepEquals(expected_parsers, actual_parsers));
        
        int expected_nextParser = expected._nextParser;
        int actual_nextParser = actual._nextParser;
        assertEquals(expected_nextParser, actual_nextParser);
        
        JsonParser actualDelegate = actual.delegate;
        assertNull(actualDelegate);
        
        int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(expected_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#createFlattened(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (!(first instanceof JsonParserSequence || second instanceof JsonParserSequence)): True}
 * @utbot.executesCondition {@code (first instanceof JsonParserSequence): False}
 * @utbot.executesCondition {@code (second instanceof JsonParserSequence): True}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.JsonParserSequence#addFlattenedActiveParsers(java.util.List)}
 * @utbot.returnsFrom {@code return new JsonParserSequence(p.toArray(new JsonParser[p.size()]));}
 *  */
    @Test
    public void testCreateFlattened_SecondInstanceOfJsonParserSequence() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        
        JsonParserSequence actual = JsonParserSequence.createFlattened(null, jsonParserSequence);
        
        JsonParserSequence expected = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers1 = {null};
        setField(expected, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers1);
        expected._nextParser = 1;
        
        com.fasterxml.jackson.core.JsonParser[] expected_parsers = expected._parsers;
        com.fasterxml.jackson.core.JsonParser[] actual_parsers = actual._parsers;
        int expected_parsersSize = expected_parsers.length;
        assertEquals(expected_parsersSize, actual_parsers.length);
        assertTrue(deepEquals(expected_parsers, actual_parsers));
        
        int expected_nextParser = expected._nextParser;
        int actual_nextParser = actual._nextParser;
        assertEquals(expected_nextParser, actual_nextParser);
        
        JsonParser actualDelegate = actual.delegate;
        assertNull(actualDelegate);
        
        int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(expected_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFlattened(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#createFlattened(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (!(first instanceof JsonParserSequence || second instanceof JsonParserSequence)): False}
 * @utbot.executesCondition {@code (first instanceof JsonParserSequence): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonParserSequence) first).addFlattenedActiveParsers(p);
 *  */
    @Test
    public void testCreateFlattened_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:82)
            com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(JsonParserSequence.java:66) */
        JsonParserSequence.createFlattened(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#createFlattened(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (!(first instanceof JsonParserSequence || second instanceof JsonParserSequence)): True}
 * @utbot.executesCondition {@code (first instanceof JsonParserSequence): False}
 * @utbot.executesCondition {@code (second instanceof JsonParserSequence): True}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonParserSequence) second).addFlattenedActiveParsers(p);
 *  */
    @Test
    public void testCreateFlattened_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:82)
            com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(JsonParserSequence.java:71) */
        JsonParserSequence.createFlattened(null, jsonParserSequence);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#createFlattened(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (!(first instanceof JsonParserSequence || second instanceof JsonParserSequence)): False}
 * @utbot.executesCondition {@code (first instanceof JsonParserSequence): True}
 * @utbot.executesCondition {@code (second instanceof JsonParserSequence): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonParserSequence) second).addFlattenedActiveParsers(p);
 *  */
    @Test
    public void testCreateFlattened_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = new com.fasterxml.jackson.core.JsonParser[2];
        JsonParserSequence jsonParserSequence1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers1 = {};
        setField(jsonParserSequence1, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers1);
        jsonParserSequence1._nextParser = 1;
        _parsers[0] = ((JsonParser) jsonParserSequence1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        JsonParserSequence jsonParserSequence2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers2 = {};
        setField(jsonParserSequence2, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers2);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:82)
            com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(JsonParserSequence.java:71) */
        JsonParserSequence.createFlattened(jsonParserSequence, jsonParserSequence2);
    }
    
    /**
    @utbot.classUnderTest {@link JsonParserSequence}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.util.JsonParserSequence#createFlattened(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (!(first instanceof JsonParserSequence || second instanceof JsonParserSequence)): False}
 * @utbot.executesCondition {@code (first instanceof JsonParserSequence): True}
 * @utbot.executesCondition {@code (second instanceof JsonParserSequence): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ((JsonParserSequence) second).addFlattenedActiveParsers(p);
 *  */
    @Test
    public void testCreateFlattened_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        jsonParserSequence._nextParser = 1;
        JsonParserSequence jsonParserSequence1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence1, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        
        /* This test fails because method [com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.addFlattenedActiveParsers(JsonParserSequence.java:82)
            com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(JsonParserSequence.java:71) */
        JsonParserSequence.createFlattened(jsonParserSequence, jsonParserSequence1);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1025395278388800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1025395278388800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1025395278396300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025395278388800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025395278396300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1025395280933700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1025395280933700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1025395280935400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025395280933700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025395280935400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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

