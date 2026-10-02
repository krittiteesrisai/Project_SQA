package com.fasterxml.jackson.core.base;

import org.junit.Test;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import java.io.DataInput;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.util.RequestPayload;
import com.fasterxml.jackson.core.json.DupDetector;
import java.io.ObjectInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.StreamCorruptedException;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import java.util.ArrayList;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.JsonLocation;
import java.util.List;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.Base64Variant;
import java.util.LinkedList;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_core_base_ParserMinimalBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.isExpectedStartObjectToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExpectedStartObjectToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isExpectedStartObjectToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_OBJECT;}
 *  */
    @Test
    public void testIsExpectedStartObjectToken_Return_currTokenNotEqualsJsonTokenSTART_OBJECT() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.isExpectedStartObjectToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isExpectedStartObjectToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_OBJECT;}
 *  */
    @Test
    public void testIsExpectedStartObjectToken_Return_currTokenNotEqualsJsonTokenSTART_OBJECT_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        boolean actual = uTF8DataInputJsonParser.isExpectedStartObjectToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getLastClearedToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLastClearedToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getLastClearedToken()}
 * @utbot.returnsFrom {@code return _lastClearedToken;}
 *  */
    @Test
    public void testGetLastClearedToken_Return_lastClearedToken() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        JsonToken actual = uTF8DataInputJsonParser.getLastClearedToken();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.isExpectedStartArrayToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExpectedStartArrayToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isExpectedStartArrayToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_ARRAY;}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_Return_currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.isExpectedStartArrayToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isExpectedStartArrayToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_ARRAY;}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_Return_currTokenNotEqualsJsonTokenSTART_ARRAY_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        boolean actual = uTF8DataInputJsonParser.isExpectedStartArrayToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.currentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method currentToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#currentToken()}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testCurrentToken_Return_currToken() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        JsonToken actual = uTF8DataInputJsonParser.currentToken();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.clearCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearCurrentToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#clearCurrentToken()}
 * @utbot.executesCondition {@code (_currToken != null): True}
 *  */
    @Test
    public void testClearCurrentToken__currTokenNotEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        uTF8StreamJsonParser._lastClearedToken = _currToken;
        
        uTF8StreamJsonParser.clearCurrentToken();
        
        JsonToken finalUTF8StreamJsonParser_currToken = uTF8StreamJsonParser._currToken;
        
        assertNull(finalUTF8StreamJsonParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#clearCurrentToken()}
 * @utbot.executesCondition {@code (_currToken != null): False}
 *  */
    @Test
    public void testClearCurrentToken__currTokenEqualsNull() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        uTF8DataInputJsonParser.clearCurrentToken();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getCurrentToken()}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testGetCurrentToken_Return_currToken() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        JsonToken actual = uTF8DataInputJsonParser.getCurrentToken();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.hasCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasCurrentToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasCurrentToken()}
 * @utbot.returnsFrom {@code return _currToken != null;}
 *  */
    @Test
    public void testHasCurrentToken_Return_currTokenEqualsNull_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.hasCurrentToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasCurrentToken()}
 * @utbot.returnsFrom {@code return _currToken != null;}
 *  */
    @Test
    public void testHasCurrentToken_Return_currTokenEqualsNull() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        boolean actual = uTF8DataInputJsonParser.hasCurrentToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.hasTokenId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasTokenId(int)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasTokenId(int)}
 * @utbot.executesCondition {@code (t == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.returnsFrom {@code return t.id() == id;}
 *  */
    @Test
    public void testHasTokenId_TIdNotEqualsId() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.hasTokenId(-254);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasTokenId(int)}
 * @utbot.executesCondition {@code (t == null): True}
 * @utbot.returnsFrom {@code return (JsonTokenId.ID_NO_TOKEN == id);}
 *  */
    @Test
    public void testHasTokenId_JsonTokenIdID_NO_TOKENNotEqualsId() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        boolean actual = uTF8StreamJsonParser.hasTokenId(-248);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasTokenId(int)}
 * @utbot.executesCondition {@code (t == null): True}
 * @utbot.returnsFrom {@code return (JsonTokenId.ID_NO_TOKEN == id);}
 *  */
    @Test
    public void testHasTokenId_JsonTokenIdID_NO_TOKENEqualsId() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        boolean actual = uTF8StreamJsonParser.hasTokenId(0);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.hasToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasToken(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.returnsFrom {@code return (_currToken == t);}
 *  */
    @Test
    public void testHasToken__currTokenNotEqualsT() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        boolean actual = uTF8DataInputJsonParser.hasToken(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.returnsFrom {@code return (_currToken == t);}
 *  */
    @Test
    public void testHasToken__currTokenEqualsT() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        boolean actual = readerBasedJsonParser.hasToken(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipChildren()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#skipChildren()}
 * @utbot.executesCondition {@code (_currToken != JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testSkipChildren_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:484)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:498)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2944)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:702)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8StreamJsonParser.skipChildren();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#skipChildren()}
 * @utbot.executesCondition {@code (_currToken != JsonToken.START_ARRAY): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testSkipChildren_ThrowNullPointerException_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", -1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#skipChildren()}
 * @utbot.executesCondition {@code (_currToken != JsonToken.START_ARRAY): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testSkipChildren_ThrowNullPointerException_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method skipChildren()
    
    @Test
    public void testSkipChildren1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        JsonToken initialUTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.skipChildren());
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken uTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        JsonToken actual_currToken = actual._currToken;
        assertEquals(uTF8DataInputJsonParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        int finalUTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        JsonReadContext finalUTF8DataInputJsonParser_parsingContext = uTF8DataInputJsonParser._parsingContext;
        JsonToken finalUTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        
        assertFalse(initialUTF8DataInputJsonParser_currToken == finalUTF8DataInputJsonParser_currToken);
        
        assertEquals(-1, finalUTF8DataInputJsonParser_nextByte);
        
        assertNull(finalUTF8DataInputJsonParser_parsingContext);
    }
    
    @Test
    public void testSkipChildren2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        JsonToken initialUTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.skipChildren());
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken uTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        JsonToken actual_currToken = actual._currToken;
        assertEquals(uTF8DataInputJsonParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        int finalUTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        JsonReadContext finalUTF8DataInputJsonParser_parsingContext = uTF8DataInputJsonParser._parsingContext;
        JsonToken finalUTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        
        assertFalse(initialUTF8DataInputJsonParser_currToken == finalUTF8DataInputJsonParser_currToken);
        
        assertEquals(-1, finalUTF8DataInputJsonParser_nextByte);
        
        assertNull(finalUTF8DataInputJsonParser_parsingContext);
    }
    
    @Test
    public void testSkipChildren3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._closed = true;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.skipChildren());
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertTrue(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8DataInputJsonParser_parsingContext = uTF8DataInputJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        assertNull(actual_parsingContext_dups);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8DataInputJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8DataInputJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8DataInputJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8DataInputJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_index, actual_parsingContext_index);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken uTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        JsonToken actual_currToken = actual._currToken;
        assertEquals(uTF8DataInputJsonParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    
    @Test
    public void testSkipChildren4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._closed = true;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        UTF8DataInputJsonParser actual = ((UTF8DataInputJsonParser) uTF8DataInputJsonParser.skipChildren());
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8DataInputJsonParser_quad1 = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(uTF8DataInputJsonParser_quad1, actual_quad1);
        
        DataInput actual_inputData = ((DataInput) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_inputData);
        
        int uTF8DataInputJsonParser_nextByte = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_nextByte = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(uTF8DataInputJsonParser_nextByte, actual_nextByte);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertTrue(actual_closed);
        
        int uTF8DataInputJsonParser_inputPtr = uTF8DataInputJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8DataInputJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8DataInputJsonParser_inputEnd = uTF8DataInputJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8DataInputJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8DataInputJsonParser_currInputProcessed = uTF8DataInputJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8DataInputJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8DataInputJsonParser_currInputRow = uTF8DataInputJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8DataInputJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8DataInputJsonParser_currInputRowStart = uTF8DataInputJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8DataInputJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8DataInputJsonParser_tokenInputTotal = uTF8DataInputJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8DataInputJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8DataInputJsonParser_tokenInputRow = uTF8DataInputJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8DataInputJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8DataInputJsonParser_tokenInputCol = uTF8DataInputJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8DataInputJsonParser_tokenInputCol, actual_tokenInputCol);
        
        JsonReadContext uTF8DataInputJsonParser_parsingContext = uTF8DataInputJsonParser._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        assertNull(actual_parsingContext_dups);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        Object actual_parsingContext_currentValue = getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue");
        assertNull(actual_parsingContext_currentValue);
        
        int uTF8DataInputJsonParser_parsingContext_lineNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int uTF8DataInputJsonParser_parsingContext_columnNr = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        int uTF8DataInputJsonParser_parsingContext_type = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_type, actual_parsingContext_type);
        
        int uTF8DataInputJsonParser_parsingContext_index = ((Integer) getFieldValue(uTF8DataInputJsonParser_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(uTF8DataInputJsonParser_parsingContext_index, actual_parsingContext_index);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        TextBuffer actual_textBuffer = actual._textBuffer;
        assertNull(actual_textBuffer);
        
        char[] actual_nameCopyBuffer = actual._nameCopyBuffer;
        assertNull(actual_nameCopyBuffer);
        
        boolean actual_nameCopied = actual._nameCopied;
        assertFalse(actual_nameCopied);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        int uTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8DataInputJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8DataInputJsonParser_numberInt = uTF8DataInputJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8DataInputJsonParser_numberInt, actual_numberInt);
        
        long uTF8DataInputJsonParser_numberLong = uTF8DataInputJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8DataInputJsonParser_numberLong, actual_numberLong);
        
        double uTF8DataInputJsonParser_numberDouble = uTF8DataInputJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8DataInputJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8DataInputJsonParser_intLength = uTF8DataInputJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8DataInputJsonParser_intLength, actual_intLength);
        
        int uTF8DataInputJsonParser_fractLength = uTF8DataInputJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8DataInputJsonParser_fractLength, actual_fractLength);
        
        int uTF8DataInputJsonParser_expLength = uTF8DataInputJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8DataInputJsonParser_expLength, actual_expLength);
        
        JsonToken uTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        JsonToken actual_currToken = actual._currToken;
        assertEquals(uTF8DataInputJsonParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8DataInputJsonParser_features = ((Integer) getFieldValue(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8DataInputJsonParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipChildren()
    
    @Test
    public void testSkipChildren5() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren6() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "buf", buf);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren7() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:614)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren8() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1978)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:595)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren9() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1978)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:595)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren10() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        DataInputStream _inputData = ((DataInputStream) createInstance("java.io.DataInputStream"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.DataInputStream.readUnsignedByte(DataInputStream.java:294)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren11() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(_inputData, "java.io.ObjectInputStream", "defaultDataEnd", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:484)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:498)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren12() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(_inputData, "java.io.ObjectInputStream", "defaultDataEnd", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:484)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:498)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2261)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren13() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3100)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren14() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren15() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", -2147467264);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:484)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:498)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2261)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren16() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2869)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:609)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren17() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren18() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(_inputData, "java.io.ObjectInputStream", "defaultDataEnd", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:484)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:498)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren19() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren20() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren21() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren22() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren23() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", 121);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.clear(ObjectInputStream.java:1667)
            java.base/java.io.ObjectInputStream.handleReset(ObjectInputStream.java:2565)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3130)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren24() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren25() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2869)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:609)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren26() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2862)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:609)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren27() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 16384);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren28() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2862)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:609)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren29() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        FilterInputStream in1 = ((FilterInputStream) createInstance("java.io.FilterInputStream"));
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", Integer.MIN_VALUE);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.FilterInputStream.read(FilterInputStream.java:82)
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren30() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1025);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2912)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren31() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1025);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2912)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren32() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1025);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2912)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren33() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren34() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1025);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren35() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 2049);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren36() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2238)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:237) */
        uTF8DataInputJsonParser.skipChildren();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method skipChildren()
    
    @Test(expected = JsonParseException.class)
    public void testSkipChildren37() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonEOFException.class)
    public void testSkipChildren38() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._closed = true;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 67108864);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonEOFException.class)
    public void testSkipChildren39() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._closed = true;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1073741824);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = StreamCorruptedException.class)
    public void testSkipChildren40() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = StreamCorruptedException.class)
    public void testSkipChildren41() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = StreamCorruptedException.class)
    public void testSkipChildren42() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonParseException.class)
    public void testSkipChildren43() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1024);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -732390246);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonParseException.class)
    public void testSkipChildren44() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonParseException.class)
    public void testSkipChildren45() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1024);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonParseException.class)
    public void testSkipChildren46() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonParseException.class)
    public void testSkipChildren47() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonParseException.class)
    public void testSkipChildren48() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -509881825);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    
    @Test(expected = JsonParseException.class)
    public void testSkipChildren49() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.skipChildren();
    }
    ///endregion
    
    ///region Errors report for skipChildren
    
    public void testSkipChildren_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.currentTokenId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method currentTokenId()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#currentTokenId()}
 * @utbot.executesCondition {@code ((t == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.returnsFrom {@code return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();}
 *  */
    @Test
    public void testCurrentTokenId_TNotEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        int actual = uTF8StreamJsonParser.currentTokenId();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#currentTokenId()}
 * @utbot.executesCondition {@code ((t == null)): True}
 * @utbot.returnsFrom {@code return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();}
 *  */
    @Test
    public void testCurrentTokenId_TEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        int actual = uTF8StreamJsonParser.currentTokenId();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getCurrentTokenId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentTokenId()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getCurrentTokenId()}
 * @utbot.executesCondition {@code ((t == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.returnsFrom {@code return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();}
 *  */
    @Test
    public void testGetCurrentTokenId_TNotEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        int actual = uTF8StreamJsonParser.getCurrentTokenId();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getCurrentTokenId()}
 * @utbot.executesCondition {@code ((t == null)): True}
 * @utbot.returnsFrom {@code return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();}
 *  */
    @Test
    public void testGetCurrentTokenId_TEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        int actual = uTF8StreamJsonParser.getCurrentTokenId();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextValue()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextValue_ReturnT() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._closed = true;
        
        JsonToken actual = uTF8DataInputJsonParser.nextValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextValue_ReturnT_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        uTF8DataInputJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        JsonToken actual = uTF8DataInputJsonParser.nextValue();
        
        assertNull(actual);
        
        JsonToken finalUTF8DataInputJsonParser_nextToken = uTF8DataInputJsonParser._nextToken;
        JsonToken finalUTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        
        assertNull(finalUTF8DataInputJsonParser_nextToken);
        
        assertNull(finalUTF8DataInputJsonParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextValue_ReturnT_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _parsingContext);
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_OBJECT;
        uTF8DataInputJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        JsonToken initialUTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        
        JsonToken actual = uTF8DataInputJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext jsonReadContext = uTF8DataInputJsonParser._parsingContext;
        int finalUTF8DataInputJsonParser_parsingContext_type = ((Integer) getFieldValue(jsonReadContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonReadContext jsonReadContext1 = uTF8DataInputJsonParser._parsingContext;
        int finalUTF8DataInputJsonParser_parsingContext_index = ((Integer) getFieldValue(jsonReadContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        JsonToken finalUTF8DataInputJsonParser_nextToken = uTF8DataInputJsonParser._nextToken;
        JsonToken finalUTF8DataInputJsonParser_currToken = uTF8DataInputJsonParser._currToken;
        
        assertFalse(initialUTF8DataInputJsonParser_currToken == finalUTF8DataInputJsonParser_currToken);
        
        assertEquals(2, finalUTF8DataInputJsonParser_parsingContext_type);
        
        assertEquals(-1, finalUTF8DataInputJsonParser_parsingContext_index);
        
        assertNull(finalUTF8DataInputJsonParser_nextToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextValue()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowNullPointerException_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:218) */
        uTF8DataInputJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowNullPointerException_3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2259)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:597)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:218) */
        uTF8DataInputJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowNullPointerException_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:749)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:218) */
        uTF8DataInputJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2862)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:609)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:218) */
        uTF8DataInputJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowNullPointerException_4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2869)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:609)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:218) */
        uTF8DataInputJsonParser.nextValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsString()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): False}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString__currTokenNotEqualsJsonTokenFIELD_NAME() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): False}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString__currTokenNotEqualsJsonTokenFIELD_NAME_2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): False}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString__currTokenNotEqualsJsonTokenFIELD_NAME_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        assertEquals(_resultString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getCurrentName()}
 * @utbot.returnsFrom {@code return getCurrentName();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenFIELD_NAME() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        nonBlockingJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_3() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_4() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsString()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText();
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getValueAsString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsString()
    
    @Test
    public void testGetValueAsString1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString();
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsString()
    
    @Test
    public void testGetValueAsString2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2147483645);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 2147483645, length 0] */
        nonBlockingJsonParser.getValueAsString();
    }
    
    @Test
    public void testGetValueAsString3() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getValueAsString();
    }
    
    @Test
    public void testGetValueAsString4() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getValueAsString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): False}
 * @utbot.executesCondition {@code (_currToken == null): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NULL): True}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_NULL() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): False}
 * @utbot.executesCondition {@code (_currToken == null): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_NULL): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#isScalarValue()}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsString__currTokenNotEqualsJsonTokenVALUE_NULL() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): False}
 * @utbot.executesCondition {@code (_currToken == null): True}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsNull() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.FIELD_NAME): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getCurrentName()}
 * @utbot.returnsFrom {@code return getCurrentName();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenFIELD_NAME1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        nonBlockingJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        assertEquals(_resultString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_51() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_11() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_31() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_21() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return getText();}
 *  */
    @Test
    public void testGetValueAsString__currTokenEqualsJsonTokenVALUE_STRING_41() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        String actual = nonBlockingJsonParser.getValueAsString(null);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return getText();
 *  */
    @Test
    public void testGetValueAsString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0] */
        nonBlockingJsonParser.getValueAsString(null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return getText();
 *  */
    @Test
    public void testGetValueAsString_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0] */
        nonBlockingJsonParser.getValueAsString(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsString(java.lang.String)
    
    @Test
    public void testGetValueAsString5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getValueAsString(string);
    }
    
    @Test
    public void testGetValueAsString6() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getValueAsString(string);
    }
    
    @Test
    public void testGetValueAsString7() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        nonBlockingJsonParser._currToken = _currToken;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getValueAsString(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsDouble(double)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsDouble(double)}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.activatesSwitch {@code switch(t.id()) case: ID_NULL}
 *  */
    @Test
    public void testGetValueAsDouble_TNotEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        double actual = uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsDouble(double)}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsDouble_TEqualsNull() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        double actual = uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsDouble(double)
    
    @Test
    public void testGetValueAsDouble1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numberNegative = true;
        uTF8DataInputJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        double actual = uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(48.0, actual, 1.0E-6);
        
        int finalUTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        
        assertEquals(9, finalUTF8DataInputJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsDouble2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        double actual = uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(-48.0, actual, 1.0E-6);
        
        int finalUTF8DataInputJsonParser_numTypesValid = uTF8DataInputJsonParser._numTypesValid;
        
        assertEquals(9, finalUTF8DataInputJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsDouble3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        double actual = uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    @Test
    public void testGetValueAsDouble4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        double actual = uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    @Test
    public void testGetValueAsDouble5() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        double actual = uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    @Test
    public void testGetValueAsDouble6() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        double actual = uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getValueAsDouble(double)
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsDouble7() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsDouble8() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsDouble9() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsDouble(double)
    
    @Test
    public void testGetValueAsDouble10() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble11() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble12() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._intLength = 27;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble13() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble14() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:448) */
        uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble15() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble16() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble17() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble18() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble19() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble20() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 4096);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble21() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:455) */
        uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble22() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:448) */
        uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    
    @Test
    public void testGetValueAsDouble23() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsDouble(ParserMinimalBase.java:448) */
        uTF8DataInputJsonParser.getValueAsDouble(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsLong()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 2;
        uTF8StreamJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_INT() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 2;
        uTF8StreamJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.returnsFrom {@code return getValueAsLong(0L);}
 *  */
    @Test
    public void testGetValueAsLong_TNotEqualsJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        long actual = uTF8DataInputJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_FLOAT_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 1;
        uTF8StreamJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_FLOAT_2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberLong = 0L;
        uTF8StreamJsonParser._numberDouble = -4.9E-324;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(10, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.returnsFrom {@code return getValueAsLong(0L);}
 *  */
    @Test
    public void testGetValueAsLong_TNotEqualsJsonTokenVALUE_NUMBER_FLOAT_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsLong()
    
    @Test
    public void testGetValueAsLong1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(-533328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(-528L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(-533328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(1038366032L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong5() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(-5328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(-5328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getValueAsLong()
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsLong7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getValueAsLong();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsLong()
    
    @Test
    public void testGetValueAsLong8() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 10]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:406) */
        readerBasedJsonParser.getValueAsLong();
    }
    
    @Test
    public void testGetValueAsLong9() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:41)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:406) */
        readerBasedJsonParser.getValueAsLong();
    }
    
    @Test
    public void testGetValueAsLong10() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:406) */
        readerBasedJsonParser.getValueAsLong();
    }
    
    @Test
    public void testGetValueAsLong11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 13);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:39)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:406) */
        readerBasedJsonParser.getValueAsLong();
    }
    
    @Test
    public void testGetValueAsLong12() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[16];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1073741824, length 16]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:195)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:408) */
        uTF8DataInputJsonParser.getValueAsLong();
    }
    
    @Test
    public void testGetValueAsLong13() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:408) */
        uTF8DataInputJsonParser.getValueAsLong();
    }
    
    @Test
    public void testGetValueAsLong14() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:195)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:408) */
        uTF8DataInputJsonParser.getValueAsLong();
    }
    
    @Test
    public void testGetValueAsLong15() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:408) */
        uTF8DataInputJsonParser.getValueAsLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsLong(long)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_FLOAT1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 2;
        uTF8StreamJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.activatesSwitch {@code switch(t.id()) case: ID_NULL}
 *  */
    @Test
    public void testGetValueAsLong_SwitchTIdCaseID_NULL() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(-254L);
        
        assertEquals(-254L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.activatesSwitch {@code switch(t.id()) case: ID_NULL}
 *  */
    @Test
    public void testGetValueAsLong_SwitchTIdCaseID_NULL_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(-254L);
        
        assertEquals(1L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_INT1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 2;
        uTF8StreamJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_INT_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 1;
        uTF8StreamJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(-255L);
        
        assertEquals(0L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        long actual = uTF8StreamJsonParser.getValueAsLong(-255L);
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsLong(long)
    
    @Test
    public void testGetValueAsLong16() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16392;
        uTF8StreamJsonParser._numberLong = 0L;
        uTF8StreamJsonParser._numberDouble = java.lang.Double.NaN;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(16394, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong17() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 72;
        uTF8StreamJsonParser._numberLong = 0L;
        uTF8StreamJsonParser._numberDouble = java.lang.Double.NaN;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(74, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong18() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 1;
        uTF8StreamJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong19() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        long actual = uTF8DataInputJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetValueAsLong20() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(-533328L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong21() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(-53328L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong22() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 3);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(528L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong23() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(1038366032L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong24() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(-528L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong25() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(-533328L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong26() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(48L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong27() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        long actual = uTF8DataInputJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetValueAsLong28() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(-53328L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong29() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(1038366032L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(3, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong30() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = new char[11];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(5328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong31() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        long actual = uTF8DataInputJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsLong(long)
    
    @Test
    public void testGetValueAsLong32() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 12);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:40)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong33() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:482)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong34() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:41)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong35() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[11];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 12);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:42)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong36() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 13);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:39)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong37() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 4);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numberNegative = true;
        uTF8DataInputJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:47)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:461)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong38() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[13];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 10);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 4);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:51)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:463)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong39() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 3);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:49)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:463)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong40() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:461)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong41() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong42() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 10]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong43() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:931)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong44() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 16392;
        uTF8DataInputJsonParser._numberDouble = -1.844674517322118E19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:311)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:197)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong45() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberDouble = 1.8446744073709556E19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._getText2(ReaderBasedJsonParser.java:374)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:297)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong46() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:403)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:284)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong47() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:919)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong48() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:919)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong49() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 16;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:931)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong50() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        uTF8DataInputJsonParser._numTypesValid = 72;
        uTF8DataInputJsonParser._numberDouble = -3.689348814755332E19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:311)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:197)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong51() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:403)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:284)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:927)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:663)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong52() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._intLength = 74;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong53() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong54() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong55() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong56() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:660)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:416) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong57() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException] */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong58() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:195)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong59() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException] */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong60() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong61() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong62() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1881)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong63() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
            com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:283)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:677)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:421) */
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getValueAsLong(long)
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsLong64() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8DataInputJsonParser._numTypesValid = 8;
        uTF8DataInputJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsLong65() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsLong66() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsLong67() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.getValueAsLong(0L);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValueAsLong(long)
    
    @Test(expected = RuntimeException.class)
    public void testGetValueAsLong68() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 32;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getValueAsInt(int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (t == JsonToken.VALUE_NUMBER_INT): False},
    ///     {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
    /// return from: {@code return defaultValue;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.activatesSwitch {@code switch(t.id())}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsInt_TNotEqualsNull() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt(8);
        
        assertEquals(8, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsNull() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        int actual = nonBlockingJsonParser.getValueAsInt(-255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getValueAsInt(int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getIntValue()} once
    /// return from: {@code return getIntValue();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 1;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt(-255);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 8;
        nonBlockingJsonParser._numberDouble = -4.9E-324;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt(-255);
        
        assertEquals(0, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(9, finalNonBlockingJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_FLOAT_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 2;
        nonBlockingJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt(-255);
        
        assertEquals(0, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(3, finalNonBlockingJsonParser_numTypesValid);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsInt()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_FLOAT1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 1;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 1;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.returnsFrom {@code return getValueAsInt(0);}
 *  */
    @Test
    public void testGetValueAsInt_TNotEqualsJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 2;
        nonBlockingJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(3, finalNonBlockingJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT_2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberDouble = -4.9E-324;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(9, finalReaderBasedJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.returnsFrom {@code return getValueAsInt(0);}
 *  */
    @Test
    public void testGetValueAsInt_TNotEqualsJsonTokenVALUE_NUMBER_FLOAT_1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsInt()
    
    @Test
    public void testGetValueAsInt1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 136;
        nonBlockingJsonParser._numberDouble = java.lang.Double.NaN;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(137, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 2;
        nonBlockingJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(3, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt3() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._numberNegative = true;
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(48, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        int finalNonBlockingJsonParser_numberInt = nonBlockingJsonParser._numberInt;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
        
        assertEquals(48, finalNonBlockingJsonParser_numberInt);
    }
    
    @Test
    public void testGetValueAsInt4() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(-533328, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 2);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(-528, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt6() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(-53328, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt7() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(-533328, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt8() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._numberNegative = true;
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(1038366032, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt9() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(5328, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt10() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(-528, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt12() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._numberNegative = true;
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(5328, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt13() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(-53328, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt14() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._numberNegative = true;
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        int actual = nonBlockingJsonParser.getValueAsInt();
        
        assertEquals(1038366032, actual);
        
        int finalNonBlockingJsonParser_numTypesValid = nonBlockingJsonParser._numTypesValid;
        
        assertEquals(1, finalNonBlockingJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt15() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsInt()
    
    @Test
    public void testGetValueAsInt17() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 3);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:49)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:463)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:793)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:47)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:461)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:793)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt19() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", Integer.MIN_VALUE);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._numberNegative = true;
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:461)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:793)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt20() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:793)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt21() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt22() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 16;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:903)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt23() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 24;
        readerBasedJsonParser._numberDouble = -6.805647439830817E38;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._getText2(ReaderBasedJsonParser.java:374)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:297)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt24() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 8;
        nonBlockingJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase._getText2(NonBlockingJsonParserBase.java:392)
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase.getText(NonBlockingJsonParserBase.java:375)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt25() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:293)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:380)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:367) */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt26() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:891)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt27() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 136;
        nonBlockingJsonParser._numberDouble = -6.805647338418769E38;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase._getText2(NonBlockingJsonParserBase.java:392)
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase.getText(NonBlockingJsonParserBase.java:375)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt28() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 16;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:903)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt29() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:891)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt30() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        nonBlockingJsonParser._numTypesValid = 8;
        nonBlockingJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase._getText2(NonBlockingJsonParserBase.java:392)
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase.getText(NonBlockingJsonParserBase.java:375)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:899)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt31() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 2;
        readerBasedJsonParser._numberLong = -9223372034707292160L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._getText2(ReaderBasedJsonParser.java:374)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:297)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:887)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:649)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt32() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._intLength = 27;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt33() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt34() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._numberNegative = true;
        nonBlockingJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt35() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt36() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = -2147483647;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:577)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:229)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:2036)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:293)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:380)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:367) */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt37() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:842)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt38() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 67108864);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:833)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:775)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt39() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._numberNegative = true;
        nonBlockingJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt40() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 32);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:295)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:380)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:367) */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt41() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 8388608);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:447)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:822)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:779)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:800)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:646)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:365) */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt42() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException] */
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt43() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException] */
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt44() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.NullPointerException] */
        readerBasedJsonParser.getValueAsInt();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getValueAsInt()
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt45() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt46() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt47() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt48() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberDouble = -4.294967296000001E9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt49() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        nonBlockingJsonParser._currToken = _currToken;
        
        nonBlockingJsonParser.getValueAsInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt50() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberDouble = -4.294967296000001E9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getValueAsInt();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt51() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[17];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(nonBlockingJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        nonBlockingJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        nonBlockingJsonParser._currToken = _currToken;
        
        nonBlockingJsonParser.getValueAsInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsBoolean(boolean)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsBoolean(boolean)}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.activatesSwitch {@code switch(t.id()) case: ID_NULL}
 *  */
    @Test
    public void testGetValueAsBoolean_TNotEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsBoolean(boolean)}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsBoolean_TEqualsNull() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        boolean actual = uTF8DataInputJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._constructError
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _constructError(java.lang.String, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_constructError(java.lang.String,java.lang.Throwable)}
 * @utbot.returnsFrom {@code return new JsonParseException(this, msg, t);}
 *  */
    @Test
    public void test_constructError_Return() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        JsonParseException actual = uTF8DataInputJsonParser._constructError(null, null);
        
        JsonParseException expected = ((JsonParseException) createInstance("com.fasterxml.jackson.core.JsonParseException"));
        setField(expected, "com.fasterxml.jackson.core.exc.StreamReadException", "_processor", uTF8DataInputJsonParser);
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalBytes", -1L);
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalChars", -1L);
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_columnNr", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonProcessingException", "_location", _location);
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 50;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 4;
        shortArray[14] = (short) 2;
        shortArray[15] = (short) 3;
        shortArray[16] = (short) 5;
        shortArray[17] = (short) 1;
        shortArray[18] = (short) 6;
        shortArray[19] = (short) 6;
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
        Class class1 = ParserMinimalBase.class;
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
        longArray[0] = 1973714599680L;
        longArray[1] = 1972519317680L;
        longArray[2] = 1972518592512L;
        longArray[3] = 1972518592512L;
        longArray[4] = 1972518592512L;
        longArray[5] = 1973711027904L;
        longArray[6] = 1972518592512L;
        longArray[7] = 1972518592512L;
        longArray[8] = 1972518592512L;
        longArray[9] = 1972518592512L;
        longArray[10] = 1972518592512L;
        longArray[11] = 1972518599880L;
        longArray[12] = 1972518640624L;
        longArray[13] = 1973611145312L;
        longArray[14] = 1973611145312L;
        longArray[15] = 1973611145312L;
        longArray[16] = 1973611145312L;
        longArray[17] = 1973611144992L;
        longArray[18] = 1973611147328L;
        longArray[19] = 1973703501808L;
        longArray[20] = 1972518592512L;
        longArray[21] = 1973613336192L;
        longArray[22] = 1973711009840L;
        longArray[23] = 1973711027904L;
        longArray[24] = 1972518592512L;
        longArray[25] = 1972518592512L;
        longArray[26] = 1972518592512L;
        longArray[27] = 1972518592512L;
        longArray[28] = 1972518592512L;
        longArray[29] = 1972518599880L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "cause", expected);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JsonParser expected_processor = ((JsonParser) getFieldValue(expected, "com.fasterxml.jackson.core.exc.StreamReadException", "_processor"));
        JsonParser actual_processor = ((JsonParser) getFieldValue(actual, "com.fasterxml.jackson.core.exc.StreamReadException", "_processor"));
        ObjectCodec actual_processor_objectCodec = ((ObjectCodec) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actual_processor_objectCodec);
        
        ByteQuadsCanonicalizer actual_processor_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actual_processor_symbols);
        
        int[] actual_processor_quadBuffer = ((int[]) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actual_processor_quadBuffer);
        
        boolean actual_processor_tokenIncomplete = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actual_processor_tokenIncomplete);
        
        int expected_processor_quad1 = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actual_processor_quad1 = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(expected_processor_quad1, actual_processor_quad1);
        
        DataInput actual_processor_inputData = ((DataInput) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actual_processor_inputData);
        
        int expected_processor_nextByte = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actual_processor_nextByte = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(expected_processor_nextByte, actual_processor_nextByte);
        
        IOContext actual_processor_ioContext = ((IOContext) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext"));
        assertNull(actual_processor_ioContext);
        
        boolean actual_processor_closed = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_closed"));
        assertFalse(actual_processor_closed);
        
        int expected_processor_inputPtr = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr"));
        int actual_processor_inputPtr = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr"));
        assertEquals(expected_processor_inputPtr, actual_processor_inputPtr);
        
        int expected_processor_inputEnd = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd"));
        int actual_processor_inputEnd = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd"));
        assertEquals(expected_processor_inputEnd, actual_processor_inputEnd);
        
        long expected_processor_currInputProcessed = ((Long) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed"));
        long actual_processor_currInputProcessed = ((Long) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed"));
        assertEquals(expected_processor_currInputProcessed, actual_processor_currInputProcessed);
        
        int expected_processor_currInputRow = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRow"));
        int actual_processor_currInputRow = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRow"));
        assertEquals(expected_processor_currInputRow, actual_processor_currInputRow);
        
        int expected_processor_currInputRowStart = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart"));
        int actual_processor_currInputRowStart = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart"));
        assertEquals(expected_processor_currInputRowStart, actual_processor_currInputRowStart);
        
        long expected_processor_tokenInputTotal = ((Long) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal"));
        long actual_processor_tokenInputTotal = ((Long) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal"));
        assertEquals(expected_processor_tokenInputTotal, actual_processor_tokenInputTotal);
        
        int expected_processor_tokenInputRow = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputRow"));
        int actual_processor_tokenInputRow = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputRow"));
        assertEquals(expected_processor_tokenInputRow, actual_processor_tokenInputRow);
        
        int expected_processor_tokenInputCol = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol"));
        int actual_processor_tokenInputCol = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol"));
        assertEquals(expected_processor_tokenInputCol, actual_processor_tokenInputCol);
        
        JsonReadContext actual_processor_parsingContext = ((JsonReadContext) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        assertNull(actual_processor_parsingContext);
        
        JsonToken actual_processor_nextToken = ((JsonToken) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        assertNull(actual_processor_nextToken);
        
        TextBuffer actual_processor_textBuffer = ((TextBuffer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer"));
        assertNull(actual_processor_textBuffer);
        
        char[] actual_processor_nameCopyBuffer = ((char[]) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopyBuffer"));
        assertNull(actual_processor_nameCopyBuffer);
        
        boolean actual_processor_nameCopied = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopied"));
        assertFalse(actual_processor_nameCopied);
        
        ByteArrayBuilder actual_processor_byteArrayBuilder = ((ByteArrayBuilder) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder"));
        assertNull(actual_processor_byteArrayBuilder);
        
        byte[] actual_processor_binaryValue = ((byte[]) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        assertNull(actual_processor_binaryValue);
        
        int expected_processor_numTypesValid = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        int actual_processor_numTypesValid = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        assertEquals(expected_processor_numTypesValid, actual_processor_numTypesValid);
        
        int expected_processor_numberInt = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        int actual_processor_numberInt = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        assertEquals(expected_processor_numberInt, actual_processor_numberInt);
        
        long expected_processor_numberLong = ((Long) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        long actual_processor_numberLong = ((Long) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        assertEquals(expected_processor_numberLong, actual_processor_numberLong);
        
        double expected_processor_numberDouble = ((Double) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        double actual_processor_numberDouble = ((Double) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        org.junit.Assert.assertEquals(expected_processor_numberDouble, actual_processor_numberDouble, 1.0E-6);
        
        BigInteger actual_processor_numberBigInt = ((BigInteger) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt"));
        assertNull(actual_processor_numberBigInt);
        
        BigDecimal actual_processor_numberBigDecimal = ((BigDecimal) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal"));
        assertNull(actual_processor_numberBigDecimal);
        
        boolean actual_processor_numberNegative = ((Boolean) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative"));
        assertFalse(actual_processor_numberNegative);
        
        int expected_processor_intLength = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        int actual_processor_intLength = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        assertEquals(expected_processor_intLength, actual_processor_intLength);
        
        int expected_processor_fractLength = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        int actual_processor_fractLength = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        assertEquals(expected_processor_fractLength, actual_processor_fractLength);
        
        int expected_processor_expLength = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        int actual_processor_expLength = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        assertEquals(expected_processor_expLength, actual_processor_expLength);
        
        JsonToken actual_processor_currToken = ((JsonToken) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_processor_currToken);
        
        JsonToken actual_processor_lastClearedToken = ((JsonToken) getFieldValue(actual_processor, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_processor_lastClearedToken);
        
        int expected_processor_features = ((Integer) getFieldValue(expected_processor, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_processor_features = ((Integer) getFieldValue(actual_processor, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(expected_processor_features, actual_processor_features);
        
        RequestPayload actual_processor_requestPayload = ((RequestPayload) getFieldValue(actual_processor, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_processor_requestPayload);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.exc.StreamReadException", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        JsonLocation expected_location = ((JsonLocation) getFieldValue(expected, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected_location, actual_location);
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.reportUnexpectedNumberChar
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportUnexpectedNumberChar(int, java.lang.String)
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "";
        
        readerBasedJsonParser.reportUnexpectedNumberChar(-1769459, string);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "";
        
        uTF8StreamJsonParser.reportUnexpectedNumberChar(73, string);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser.reportUnexpectedNumberChar(1769601, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        String string = "";
        
        uTF8DataInputJsonParser.reportUnexpectedNumberChar(-65377, string);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser.reportUnexpectedNumberChar(-65416, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser.reportUnexpectedNumberChar(17777, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser.reportUnexpectedNumberChar(177, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar8() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        String string = "";
        
        nonBlockingJsonParser.reportUnexpectedNumberChar(196609, string);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar9() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        uTF8DataInputJsonParser.reportUnexpectedNumberChar(-589672, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar10() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        String string = "";
        
        nonBlockingJsonParser.reportUnexpectedNumberChar(-1777, string);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar11() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        String string = "";
        
        nonBlockingJsonParser.reportUnexpectedNumberChar(977, string);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar12() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        uTF8StreamJsonParser.reportUnexpectedNumberChar(2, string);
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar13() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        String string = "";
        
        uTF8DataInputJsonParser.reportUnexpectedNumberChar(-1, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportMissingRootWS(int)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportMissingRootWS(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportUnexpectedChar(int,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: _reportUnexpectedChar(ch, "Expected space separating root-level values");
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportMissingRootWS_ThrowJsonEOFException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser._reportMissingRootWS(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportUnexpectedChar(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportUnexpectedChar(int,java.lang.String)}
 * @utbot.executesCondition {@code (ch < 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF()}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: _reportInvalidEOF();
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportUnexpectedChar_ThrowJsonEOFException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser._reportUnexpectedChar(-1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOFInValue
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportInvalidEOFInValue(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOFInValue(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_STRING): True}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: _reportInvalidEOF(msg, type);
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportInvalidEOFInValue_ThrowJsonEOFException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        
        uTF8DataInputJsonParser._reportInvalidEOFInValue(jsonToken);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOFInValue(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: _reportInvalidEOF(msg, type);
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportInvalidEOFInValue_ThrowJsonEOFException_1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        
        uTF8DataInputJsonParser._reportInvalidEOFInValue(jsonToken);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOFInValue(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: _reportInvalidEOF(msg, type);
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportInvalidEOFInValue_ThrowJsonEOFException_2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        
        uTF8StreamJsonParser._reportInvalidEOFInValue(jsonToken);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOFInValue(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (type == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: _reportInvalidEOF(msg, type);
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportInvalidEOFInValue_ThrowJsonEOFException_3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser._reportInvalidEOFInValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOFInValue
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportInvalidEOFInValue()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOFInValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF(java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: _reportInvalidEOF(" in a value");
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportInvalidEOFInValue_ThrowJsonEOFException1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser._reportInvalidEOFInValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInputCoercion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportInputCoercion(java.lang.String, com.fasterxml.jackson.core.JsonToken, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInputCoercion(java.lang.String,com.fasterxml.jackson.core.JsonToken,java.lang.Class)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.exc.InputCoercionException} in: throw new InputCoercionException(this, msg, inputType, targetType);
 *  */
    @Test(expected = InputCoercionException.class)
    public void test_reportInputCoercion_ThrowInputCoercionException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        uTF8DataInputJsonParser._reportInputCoercion(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.reportInvalidNumber
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reportInvalidNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#reportInvalidNumber(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportError(java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonParseException} in: _reportError("Invalid numeric value: " + msg);
 *  */
    @Test(expected = JsonParseException.class)
    public void testReportInvalidNumber_ThrowJsonParseException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser.reportInvalidNumber(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _longIntegerDesc(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_longIntegerDesc(java.lang.String)}
 * @utbot.executesCondition {@code (rawLen < 1000): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return rawNum;}
 *  */
    @Test
    public void test_longIntegerDesc_RawLenLessThan1000() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "  ";
        
        String actual = readerBasedJsonParser._longIntegerDesc(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _longIntegerDesc(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_longIntegerDesc(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int rawLen = rawNum.length();
 *  */
    @Test
    public void test_longIntegerDesc_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longIntegerDesc(ParserMinimalBase.java:598) */
        uTF8DataInputJsonParser._longIntegerDesc(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._longNumberDesc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _longNumberDesc(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_longNumberDesc(java.lang.String)}
 * @utbot.executesCondition {@code (rawLen < 1000): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return rawNum;}
 *  */
    @Test
    public void test_longNumberDesc_RawLenLessThan1000() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "  ";
        
        String actual = readerBasedJsonParser._longNumberDesc(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _longNumberDesc(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_longNumberDesc(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int rawLen = rawNum.length();
 *  */
    @Test
    public void test_longNumberDesc_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._longNumberDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._longNumberDesc(ParserMinimalBase.java:610) */
        uTF8DataInputJsonParser._longNumberDesc(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _decodeBase64(java.lang.String, com.fasterxml.jackson.core.util.ByteArrayBuilder, com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 *  */
    @Test
    public void test_decodeBase64() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        readerBasedJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 *  */
    @Test
    public void test_decodeBase64_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = " ";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        readerBasedJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 *  */
    @Test
    public void test_decodeBase64_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        String string = "!\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        byte[] _currBlock = {(byte) -127, (byte) -127};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", 1);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[34];
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = 1;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = -255;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        uTF8DataInputJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
        
        byte[] byteArrayBuilder_currBlock = ((byte[]) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        byte finalByteArrayBuilder_currBlock1 = ((Byte) get(byteArrayBuilder_currBlock, 1));
        int finalByteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        
        assertEquals((byte) 0, finalByteArrayBuilder_currBlock1);
        
        assertEquals(2, finalByteArrayBuilder_currBlockPtr);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 *  */
    @Test
    public void test_decodeBase64_3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "$\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", 2049);
        byte[] _currBlock = {};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[37];
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = -255;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = 1;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = -255;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        _asciiToBase64[33] = -254;
        _asciiToBase64[34] = -255;
        _asciiToBase64[35] = -255;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        byte[] initialByteArrayBuilder_currBlock = ((byte[]) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        
        readerBasedJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
        
        byte[] finalByteArrayBuilder_currBlock = ((byte[]) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        int finalByteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        
        assertFalse(initialByteArrayBuilder_currBlock == finalByteArrayBuilder_currBlock);
        
        assertEquals(1, finalByteArrayBuilder_currBlockPtr);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _decodeBase64(java.lang.String, com.fasterxml.jackson.core.util.ByteArrayBuilder, com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "@";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = {-255};
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.ArrayIndexOutOfBoundsException: Index 64 out of bounds for length 1]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:213)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:471)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:509) */
        readerBasedJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "$";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[37];
        _asciiToBase64[0] = -255;
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = -255;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = -255;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        _asciiToBase64[33] = -254;
        _asciiToBase64[34] = -255;
        _asciiToBase64[35] = -255;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 37]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:213)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:481)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:509) */
        readerBasedJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "\"\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        byte[] _currBlock = {};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -1);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = -255;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = -255;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        _asciiToBase64[33] = -254;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.ByteArrayBuilder.append(ByteArrayBuilder.java:93)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:491)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:509) */
        readerBasedJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.Base64Variant#decode(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:509) */
        uTF8DataInputJsonParser._decodeBase64(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowNullPointerException_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "\"\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", 513);
        byte[] _currBlock = {(byte) -127, (byte) -127};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", 2);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = -255;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = 1;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        _asciiToBase64[33] = -254;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.ByteArrayBuilder._allocMore(ByteArrayBuilder.java:274)
            com.fasterxml.jackson.core.util.ByteArrayBuilder.append(ByteArrayBuilder.java:91)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:491)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:509) */
        readerBasedJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowNullPointerException_2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        String string = "!!";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", 8388865);
        byte[] _currBlock = new byte[36];
        _currBlock[0] = (byte) -127;
        _currBlock[1] = (byte) -127;
        _currBlock[2] = (byte) -127;
        _currBlock[3] = (byte) -127;
        _currBlock[4] = (byte) -127;
        _currBlock[5] = (byte) -127;
        _currBlock[6] = (byte) -127;
        _currBlock[7] = (byte) -127;
        _currBlock[8] = (byte) -127;
        _currBlock[9] = (byte) -127;
        _currBlock[10] = (byte) -127;
        _currBlock[11] = (byte) -127;
        _currBlock[12] = (byte) -127;
        _currBlock[13] = (byte) -127;
        _currBlock[14] = (byte) -127;
        _currBlock[15] = (byte) -127;
        _currBlock[16] = (byte) -127;
        _currBlock[17] = (byte) -127;
        _currBlock[18] = (byte) -127;
        _currBlock[19] = (byte) -127;
        _currBlock[20] = (byte) -127;
        _currBlock[21] = (byte) -127;
        _currBlock[22] = (byte) -127;
        _currBlock[23] = (byte) -127;
        _currBlock[24] = (byte) -127;
        _currBlock[25] = (byte) -127;
        _currBlock[26] = (byte) -127;
        _currBlock[27] = (byte) -127;
        _currBlock[28] = (byte) -127;
        _currBlock[29] = (byte) -127;
        _currBlock[30] = (byte) -127;
        _currBlock[31] = (byte) -127;
        _currBlock[32] = (byte) -127;
        _currBlock[33] = (byte) -127;
        _currBlock[34] = (byte) -127;
        _currBlock[35] = (byte) -127;
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", 36);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[34];
        _asciiToBase64[0] = -255;
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = -255;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = -255;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.ByteArrayBuilder._allocMore(ByteArrayBuilder.java:274)
            com.fasterxml.jackson.core.util.ByteArrayBuilder.append(ByteArrayBuilder.java:91)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:491)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:509) */
        uTF8DataInputJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _decodeBase64(java.lang.String, com.fasterxml.jackson.core.util.ByteArrayBuilder, com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.caughtException {@code IllegalArgumentException e}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonParseException} in: _reportError(e.getMessage());
 *  */
    @Test(expected = JsonParseException.class)
    public void test_decodeBase64_ThrowJsonParseException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "!";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[34];
        _asciiToBase64[0] = -255;
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = -255;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = -255;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        readerBasedJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.caughtException {@code IllegalArgumentException e}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonParseException} in: _reportError(e.getMessage());
 *  */
    @Test(expected = JsonParseException.class)
    public void test_decodeBase64_ThrowJsonParseException_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\"\u0000";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = -255;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = -255;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        _asciiToBase64[33] = -254;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_usesPadding", true);
        
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _decodeBase64(java.lang.String, com.fasterxml.jackson.core.util.ByteArrayBuilder, com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.Base64Variant#decode(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: b64variant.decode(str, builder);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_decodeBase64_ThrowIllegalStateException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        String string = "\"\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -1);
        byte[] _currBlock = {};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[1] = -255;
        _asciiToBase64[2] = -255;
        _asciiToBase64[3] = -255;
        _asciiToBase64[4] = -255;
        _asciiToBase64[5] = -255;
        _asciiToBase64[6] = -255;
        _asciiToBase64[7] = -255;
        _asciiToBase64[8] = -255;
        _asciiToBase64[9] = -255;
        _asciiToBase64[10] = -255;
        _asciiToBase64[11] = -255;
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = -255;
        _asciiToBase64[19] = -255;
        _asciiToBase64[20] = -255;
        _asciiToBase64[21] = -255;
        _asciiToBase64[22] = -255;
        _asciiToBase64[23] = -255;
        _asciiToBase64[24] = -255;
        _asciiToBase64[25] = -255;
        _asciiToBase64[26] = -255;
        _asciiToBase64[27] = -255;
        _asciiToBase64[28] = -255;
        _asciiToBase64[29] = -255;
        _asciiToBase64[30] = -255;
        _asciiToBase64[31] = -255;
        _asciiToBase64[32] = -255;
        _asciiToBase64[33] = 2;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        uTF8DataInputJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportInvalidEOF(java.lang.String, com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF(java.lang.String,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: throw new JsonEOFException(this, currToken, "Unexpected end-of-input" + msg);
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportInvalidEOF_ThrowJsonEOFException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        uTF8DataInputJsonParser._reportInvalidEOF(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportInvalidEOF(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: throw new JsonEOFException(this, null, "Unexpected end-of-input" + msg);
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportInvalidEOF_ThrowJsonEOFException1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        uTF8DataInputJsonParser._reportInvalidEOF(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportInvalidEOF()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF(java.lang.String,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.io.JsonEOFException} in: _reportInvalidEOF(" in " + _currToken, _currToken);
 *  */
    @Test(expected = JsonEOFException.class)
    public void test_reportInvalidEOF_ThrowJsonEOFException2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser._reportInvalidEOF();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._hasTextualNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _hasTextualNull(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_hasTextualNull(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return "null".equals(value);}
 *  */
    @Test
    public void test_hasTextualNull_StringEquals() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        boolean actual = uTF8StreamJsonParser._hasTextualNull(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportOverflowInt()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#reportOverflowInt()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reportOverflowInt(getText());
 *  */
    @Test
    public void testReportOverflowInt_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:560) */
        uTF8DataInputJsonParser.reportOverflowInt();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportOverflowInt()
    
    @Test(expected = JsonParseException.class)
    public void testReportOverflowInt1() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        uTF8DataInputJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.reportOverflowInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportOverflowInt(java.lang.String)
    
    @Test(expected = JsonParseException.class)
    public void testReportOverflowInt2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        String string = "";
        
        nonBlockingJsonParser.reportOverflowInt(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace
    
    ///region OTHER: CHECKED EXCEPTIONS for method _throwInvalidSpace(int)
    
    @Test(expected = JsonParseException.class)
    public void test_throwInvalidSpace1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._throwInvalidSpace(125);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwInvalidSpace2() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        nonBlockingJsonParser._throwInvalidSpace(1776);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwInvalidSpace3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._throwInvalidSpace(17);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwInvalidSpace4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser._throwInvalidSpace(17776);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwInvalidSpace5() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        
        nonBlockingJsonParser._throwInvalidSpace(177);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwInvalidSpace6() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        uTF8DataInputJsonParser._throwInvalidSpace(976);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_throwInvalidSpace7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        readerBasedJsonParser._throwInvalidSpace(127);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportOverflowLong(java.lang.String)
    
    @Test(expected = JsonParseException.class)
    public void testReportOverflowLong1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        String string = "";
        
        nonBlockingJsonParser.reportOverflowLong(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportOverflowLong()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#reportOverflowLong()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reportOverflowLong(getText());
 *  */
    @Test
    public void testReportOverflowLong_ThrowNullPointerException() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577) */
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportOverflowLong()
    
    @Test
    public void testReportOverflowLong2() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2048);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:195)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577) */
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    
    @Test
    public void testReportOverflowLong3() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:385)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:195)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577) */
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    
    @Test
    public void testReportOverflowLong4() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483647);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:195)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577) */
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    
    @Test
    public void testReportOverflowLong5() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577) */
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    
    @Test
    public void testReportOverflowLong6() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
            com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:283)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:677)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1876)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:193)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowLong(ParserMinimalBase.java:577) */
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method reportOverflowLong()
    
    @Test(expected = JsonParseException.class)
    public void testReportOverflowLong7() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportOverflowLong8() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportOverflowLong9() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportOverflowLong10() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    
    @Test(expected = JsonParseException.class)
    public void testReportOverflowLong11() throws Exception  {
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        uTF8DataInputJsonParser._currToken = _currToken;
        
        uTF8DataInputJsonParser.reportOverflowLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._getCharDesc
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _getCharDesc(int)
    
    @Test
    public void test_getCharDesc1() {
        String actual = ParserMinimalBase._getCharDesc(Integer.MIN_VALUE);
        
        String expected = "(CTRL-CHAR, code -2147483648)";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_getCharDesc2() {
        String actual = ParserMinimalBase._getCharDesc(-1777);
        
        String expected = "'\uF90F' (code -1777)";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_getCharDesc3() {
        String actual = ParserMinimalBase._getCharDesc(1777);
        
        String expected = "'\u06F1' (code 1777 / 0x6f1)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._throwInternal
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwInternal()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_throwInternal()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.VersionUtil#throwInternal()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: VersionUtil.throwInternal();
 *  */
    @Test(expected = RuntimeException.class)
    public void test_throwInternal_ThrowRuntimeException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._throwInternal();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _wrapError(java.lang.String, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_wrapError(java.lang.String,java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_constructError(java.lang.String,java.lang.Throwable)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonParseException} in: throw _constructError(msg, t);
 *  */
    @Test(expected = JsonParseException.class)
    public void test_wrapError_ThrowJsonParseException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._wrapError(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _asciiBytes(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_asciiBytes(java.lang.String)}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void test_asciiBytes_ReturnB() {
        String string = "";
        
        byte[] actual = ParserMinimalBase._asciiBytes(string);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_asciiBytes(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = str.length(); i < len; ++i)} once
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void test_asciiBytes_StringCharAt() {
        String string = " ";
        
        byte[] actual = ParserMinimalBase._asciiBytes(string);
        
        byte[] expected = {(byte) 32};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _asciiBytes(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_asciiBytes(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: byte[] b = new byte[str.length()];
 *  */
    @Test
    public void test_asciiBytes_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes(ParserMinimalBase.java:730) */
        ParserMinimalBase._asciiBytes(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _asciiBytes(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_asciiBytes(java.lang.String)}
     */
    @Test
    public void test_asciiBytesWithNonEmptyString() {
        byte[] actual = ParserMinimalBase._asciiBytes("\u0014\n\t\r");
        
        byte[] expected = {(byte) 20, (byte) 10, (byte) 9, (byte) 13};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportError
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _reportError(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportError(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_constructError(java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonParseException} in: throw _constructError(msg);
 *  */
    @Test(expected = JsonParseException.class)
    public void test_reportError_ThrowJsonParseException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser._reportError(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportError
    
    ///region OTHER: ERROR SUITE for method _reportError(java.lang.String, java.lang.Object, java.lang.Object)
    
    @Test
    public void test_reportError1() throws Exception  {
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportError] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:714) */
        nonBlockingJsonParser._reportError(null, object, object);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _reportError(java.lang.String, java.lang.Object, java.lang.Object)
    
    @Test(expected = JsonParseException.class)
    public void test_reportError2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "";
        Object object = new Object();
        
        readerBasedJsonParser._reportError(string, object, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportError
    
    ///region OTHER: CHECKED EXCEPTIONS for method _reportError(java.lang.String, java.lang.Object)
    
    @Test(expected = JsonParseException.class)
    public void test_reportError3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "";
        Object object = new Object();
        
        uTF8StreamJsonParser._reportError(string, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _reportError(java.lang.String, java.lang.Object)
    
    @Test
    public void test_reportError4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportError] produces [java.lang.NullPointerException]
            java.base/java.util.Formatter.parse(Formatter.java:2717)
            java.base/java.util.Formatter.format(Formatter.java:2671)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:709) */
        uTF8StreamJsonParser._reportError(null, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._ascii
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _ascii([B)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_ascii(byte[])}
     */
    @Test
    public void test_asciiWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = ParserMinimalBase._ascii(byteArray);
        
        String expected = "\uFFFD\uFFFD\uFFFD";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _ascii([B)
    
    @Test
    public void test_ascii1() {
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._ascii] produces [java.lang.NullPointerException]
            java.base/java.lang.String.<init>(String.java:1365)
            com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(ParserMinimalBase.java:739) */
        ParserMinimalBase._ascii(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1027883015474700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1027883015474700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1027883015487300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027883015474700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027883015487300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1027883015999800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1027883015999800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1027883016001600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027883015999800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027883016001600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

