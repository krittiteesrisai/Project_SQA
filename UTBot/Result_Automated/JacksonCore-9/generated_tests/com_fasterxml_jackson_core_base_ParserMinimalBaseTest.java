package com.fasterxml.jackson.core.base;

import org.junit.Test;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.DupDetector;
import java.io.InputStreamReader;
import java.io.FileReader;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import java.io.InputStream;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.io.Reader;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.BufferedReader;
import java.util.ArrayList;
import com.fasterxml.jackson.core.Base64Variant;
import java.util.LinkedList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_core_base_ParserMinimalBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.clearCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearCurrentToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#clearCurrentToken()}
 * @utbot.executesCondition {@code (_currToken != null): False}
 *  */
    @Test
    public void testClearCurrentToken__currTokenEqualsNull() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        uTF8StreamJsonParser.clearCurrentToken();
    }
    
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
        
        JsonToken initialUTF8StreamJsonParser_lastClearedToken = uTF8StreamJsonParser._lastClearedToken;
        
        uTF8StreamJsonParser.clearCurrentToken();
        
        JsonToken finalUTF8StreamJsonParser_currToken = uTF8StreamJsonParser._currToken;
        JsonToken finalUTF8StreamJsonParser_lastClearedToken = uTF8StreamJsonParser._lastClearedToken;
        
        assertNull(finalUTF8StreamJsonParser_currToken);
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        boolean actual = uTF8StreamJsonParser.hasCurrentToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextValue()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = -1;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1859)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\', 'u'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2057)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = -1;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1649)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\t'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1879)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowNullPointerException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._inputPtr = 1073741823;
        readerBasedJsonParser._inputEnd = 1073741824;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1859)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#nextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testNextValue_ThrowNullPointerException_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:704)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:566)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextValue()
    
    @Test
    public void testNextValue1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertNull(actual);
        
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertNull(finalReaderBasedJsonParser_currToken);
    }
    
    @Test
    public void testNextValue2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ']', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        readerBasedJsonParser._tokenInputTotal = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        JsonToken expected = JsonToken.END_ARRAY;
        
        assertEquals(expected, actual);
        
        int finalReaderBasedJsonParser_inputPtr = readerBasedJsonParser._inputPtr;
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertEquals(1, finalReaderBasedJsonParser_inputPtr);
        
        assertNull(finalReaderBasedJsonParser_parsingContext);
    }
    
    @Test
    public void testNextValue3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonReadContext initialReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_nextToken = readerBasedJsonParser._nextToken;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_parsingContext == finalReaderBasedJsonParser_parsingContext);
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    
    @Test
    public void testNextValue4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonReadContext initialReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_nextToken = readerBasedJsonParser._nextToken;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_parsingContext == finalReaderBasedJsonParser_parsingContext);
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    
    @Test
    public void testNextValue5() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonReadContext initialReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_nextToken = readerBasedJsonParser._nextToken;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_parsingContext == finalReaderBasedJsonParser_parsingContext);
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    
    @Test
    public void testNextValue6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonReadContext initialReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_nextToken = readerBasedJsonParser._nextToken;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_parsingContext == finalReaderBasedJsonParser_parsingContext);
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    
    @Test
    public void testNextValue7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonReadContext initialReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_nextToken = readerBasedJsonParser._nextToken;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_parsingContext == finalReaderBasedJsonParser_parsingContext);
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    
    @Test
    public void testNextValue8() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonReadContext initialReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_nextToken = readerBasedJsonParser._nextToken;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_parsingContext == finalReaderBasedJsonParser_parsingContext);
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    
    @Test
    public void testNextValue9() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonReadContext initialReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_nextToken = readerBasedJsonParser._nextToken;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_parsingContext == finalReaderBasedJsonParser_parsingContext);
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    
    @Test
    public void testNextValue10() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _nextToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonReadContext initialReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        JsonToken actual = readerBasedJsonParser.nextValue();
        
        assertEquals(_nextToken, actual);
        
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_nextToken = readerBasedJsonParser._nextToken;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_parsingContext == finalReaderBasedJsonParser_parsingContext);
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextValue()
    
    @Test
    public void testNextValue11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '}', '}', '}', '}', '}', '}', '}',
            '\\'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 8;
        readerBasedJsonParser._inputEnd = 11;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue12() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '}', '}', '}', '}', '}', '}', '}',
            '\r'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 8;
        readerBasedJsonParser._inputEnd = 11;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1687)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1872)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue13() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '\\';
        _inputBuffer[1] = '\\';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue14() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '\r';
        _inputBuffer[1] = '\n';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.VALUE_NULL;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue15() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\r';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.VALUE_NULL;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'b';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        readerBasedJsonParser._currInputProcessed = 0L;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue17() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\"';
        _inputBuffer[38] = '#';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '\"';
        _inputBuffer[1] = ' ';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 3;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue19() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\"';
        _inputBuffer[38] = '\n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue20() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\"';
        _inputBuffer[38] = '\u0001';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:514)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1874)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue21() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\"';
        _inputBuffer[38] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1937)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1863)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue22() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 't';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue23() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '?', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue24() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:527)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1668)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue25() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[37];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '\\';
        _inputBuffer[35] = 'u';
        _inputBuffer[36] = '\u0100';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 34;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue26() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[37];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '\\';
        _inputBuffer[35] = 'u';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 34;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue27() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '\"', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 1;
        readerBasedJsonParser._inputEnd = 3;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue28() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'r';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue29() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue30() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue31() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue32() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue33() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        InputStreamReader _reader = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '\\';
        _inputBuffer[1] = 'f';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 2;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1643)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue34() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:540)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2046)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue35() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        _inputBuffer[15] = '\t';
        _inputBuffer[16] = '\t';
        _inputBuffer[17] = '\t';
        _inputBuffer[18] = '\t';
        _inputBuffer[19] = '\t';
        _inputBuffer[20] = '\t';
        _inputBuffer[21] = '\t';
        _inputBuffer[22] = '\t';
        _inputBuffer[23] = '\t';
        _inputBuffer[24] = '\t';
        _inputBuffer[25] = '\t';
        _inputBuffer[26] = '\t';
        _inputBuffer[27] = '\t';
        _inputBuffer[28] = '\t';
        _inputBuffer[29] = '\t';
        _inputBuffer[30] = '\t';
        _inputBuffer[31] = '\t';
        _inputBuffer[32] = '\t';
        _inputBuffer[33] = '\t';
        _inputBuffer[34] = '\t';
        _inputBuffer[35] = '\t';
        _inputBuffer[36] = '\t';
        _inputBuffer[37] = '\t';
        _inputBuffer[38] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1937)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1883)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue36() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\n';
        _inputBuffer[38] = '\u0001';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:514)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1894)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue37() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\n';
        _inputBuffer[38] = '#';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue38() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\n';
        _inputBuffer[38] = '\r';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue39() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '#', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue40() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\r';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 2;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1686)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1892)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue41() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = ' ';
        _inputBuffer[38] = '\n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue42() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '/', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 2);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1941)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1863)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue43() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '#', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 4);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1863)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue44() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\n';
        _inputBuffer[38] = ' ';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue45() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._nextToken = _nextToken;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:702)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:566)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue46() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue47() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'u';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        readerBasedJsonParser._currInputProcessed = 0L;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2054)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue48() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\"', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1856)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue49() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._inputEnd = -2147483647;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2048);
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1856)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue50() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._inputEnd = -2147483647;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:485)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._releaseBuffers(ReaderBasedJsonParser.java:201)
            com.fasterxml.jackson.core.base.ParserBase.close(ParserBase.java:389)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:576)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue51() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        readerBasedJsonParser._tokenInputTotal = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._reportMismatchedEndMarker(ParserBase.java:520)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:600)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue52() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '!', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        readerBasedJsonParser._tokenInputTotal = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(ReaderBasedJsonParser.java:1462)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:683)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
    }
    
    @Test
    public void testNextValue53() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ']', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        readerBasedJsonParser._tokenInputTotal = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._reportMismatchedEndMarker(ParserBase.java:520)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.base.ParserMinimalBase.nextValue(ParserMinimalBase.java:127) */
        readerBasedJsonParser.nextValue();
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
        
        boolean actual = uTF8StreamJsonParser.hasTokenId(-255);
        
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
        
        boolean actual = uTF8StreamJsonParser.hasTokenId(-255);
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getCurrentToken()}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testGetCurrentToken_Return_currToken() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        JsonToken actual = uTF8StreamJsonParser.getCurrentToken();
        
        assertNull(actual);
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.hasToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasToken(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.returnsFrom {@code return (_currToken == t);}
 *  */
    @Test
    public void testHasToken__currTokenNotEqualsT() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.hasToken(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.returnsFrom {@code return (_currToken == t);}
 *  */
    @Test
    public void testHasToken__currTokenEqualsT() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        boolean actual = uTF8StreamJsonParser.hasToken(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipChildren()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#skipChildren()}
 * @utbot.executesCondition {@code (_currToken != JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (_currToken != JsonToken.START_ARRAY): True}
 *  */
    @Test
    public void testSkipChildren__currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        UTF8StreamJsonParser actual = ((UTF8StreamJsonParser) uTF8StreamJsonParser.skipChildren());
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        ByteQuadsCanonicalizer actual_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int[] actual_quadBuffer = ((int[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quadBuffer"));
        assertNull(actual_quadBuffer);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        int uTF8StreamJsonParser_quad1 = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        int actual_quad1 = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_quad1"));
        assertEquals(uTF8StreamJsonParser_quad1, actual_quad1);
        
        InputStream actual_inputStream = ((InputStream) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream"));
        assertNull(actual_inputStream);
        
        byte[] actual_inputBuffer = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer"));
        assertNull(actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int uTF8StreamJsonParser_inputPtr = uTF8StreamJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(uTF8StreamJsonParser_inputPtr, actual_inputPtr);
        
        int uTF8StreamJsonParser_inputEnd = uTF8StreamJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(uTF8StreamJsonParser_inputEnd, actual_inputEnd);
        
        long uTF8StreamJsonParser_currInputProcessed = uTF8StreamJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(uTF8StreamJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int uTF8StreamJsonParser_currInputRow = uTF8StreamJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(uTF8StreamJsonParser_currInputRow, actual_currInputRow);
        
        int uTF8StreamJsonParser_currInputRowStart = uTF8StreamJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(uTF8StreamJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long uTF8StreamJsonParser_tokenInputTotal = uTF8StreamJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(uTF8StreamJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int uTF8StreamJsonParser_tokenInputRow = uTF8StreamJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(uTF8StreamJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int uTF8StreamJsonParser_tokenInputCol = uTF8StreamJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(uTF8StreamJsonParser_tokenInputCol, actual_tokenInputCol);
        
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
        
        int uTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(uTF8StreamJsonParser_numTypesValid, actual_numTypesValid);
        
        int uTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(uTF8StreamJsonParser_numberInt, actual_numberInt);
        
        long uTF8StreamJsonParser_numberLong = uTF8StreamJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(uTF8StreamJsonParser_numberLong, actual_numberLong);
        
        double uTF8StreamJsonParser_numberDouble = uTF8StreamJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(uTF8StreamJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int uTF8StreamJsonParser_intLength = uTF8StreamJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(uTF8StreamJsonParser_intLength, actual_intLength);
        
        int uTF8StreamJsonParser_fractLength = uTF8StreamJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(uTF8StreamJsonParser_fractLength, actual_fractLength);
        
        int uTF8StreamJsonParser_expLength = uTF8StreamJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(uTF8StreamJsonParser_expLength, actual_expLength);
        
        JsonToken uTF8StreamJsonParser_currToken = uTF8StreamJsonParser._currToken;
        JsonToken actual_currToken = actual._currToken;
        assertEquals(uTF8StreamJsonParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int uTF8StreamJsonParser_features = ((Integer) getFieldValue(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(uTF8StreamJsonParser_features, actual_features);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipChildren()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#skipChildren()}
 * @utbot.executesCondition {@code (_currToken != JsonToken.START_OBJECT): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = nextToken();
 *  */
    @Test
    public void testSkipChildren_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 1073741823;
        readerBasedJsonParser._inputEnd = 1073741824;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1859)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method skipChildren()
    
    @Test
    public void testSkipChildren1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ']', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        readerBasedJsonParser._tokenInputTotal = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        JsonToken initialReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        ReaderBasedJsonParser actual = ((ReaderBasedJsonParser) readerBasedJsonParser.skipChildren());
        
        Reader actual_reader = ((Reader) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader"));
        assertNull(actual_reader);
        
        char[] readerBasedJsonParser_inputBuffer = ((char[]) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer"));
        char[] actual_inputBuffer = ((char[]) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer"));
        int readerBasedJsonParser_inputBufferSize = readerBasedJsonParser_inputBuffer.length;
        assertEquals(readerBasedJsonParser_inputBufferSize, actual_inputBuffer.length);
        assertArrayEquals(readerBasedJsonParser_inputBuffer, actual_inputBuffer);
        
        boolean actual_bufferRecyclable = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_bufferRecyclable"));
        assertFalse(actual_bufferRecyclable);
        
        ObjectCodec actual_objectCodec = ((ObjectCodec) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_objectCodec"));
        assertNull(actual_objectCodec);
        
        CharsToNameCanonicalizer actual_symbols = ((CharsToNameCanonicalizer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_symbols"));
        assertNull(actual_symbols);
        
        int readerBasedJsonParser_hashSeed = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        int actual_hashSeed = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        assertEquals(readerBasedJsonParser_hashSeed, actual_hashSeed);
        
        boolean actual_tokenIncomplete = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete"));
        assertFalse(actual_tokenIncomplete);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        int readerBasedJsonParser_inputPtr = readerBasedJsonParser._inputPtr;
        int actual_inputPtr = actual._inputPtr;
        assertEquals(readerBasedJsonParser_inputPtr, actual_inputPtr);
        
        int readerBasedJsonParser_inputEnd = readerBasedJsonParser._inputEnd;
        int actual_inputEnd = actual._inputEnd;
        assertEquals(readerBasedJsonParser_inputEnd, actual_inputEnd);
        
        long readerBasedJsonParser_currInputProcessed = readerBasedJsonParser._currInputProcessed;
        long actual_currInputProcessed = actual._currInputProcessed;
        assertEquals(readerBasedJsonParser_currInputProcessed, actual_currInputProcessed);
        
        int readerBasedJsonParser_currInputRow = readerBasedJsonParser._currInputRow;
        int actual_currInputRow = actual._currInputRow;
        assertEquals(readerBasedJsonParser_currInputRow, actual_currInputRow);
        
        int readerBasedJsonParser_currInputRowStart = readerBasedJsonParser._currInputRowStart;
        int actual_currInputRowStart = actual._currInputRowStart;
        assertEquals(readerBasedJsonParser_currInputRowStart, actual_currInputRowStart);
        
        long readerBasedJsonParser_tokenInputTotal = readerBasedJsonParser._tokenInputTotal;
        long actual_tokenInputTotal = actual._tokenInputTotal;
        assertEquals(readerBasedJsonParser_tokenInputTotal, actual_tokenInputTotal);
        
        int readerBasedJsonParser_tokenInputRow = readerBasedJsonParser._tokenInputRow;
        int actual_tokenInputRow = actual._tokenInputRow;
        assertEquals(readerBasedJsonParser_tokenInputRow, actual_tokenInputRow);
        
        int readerBasedJsonParser_tokenInputCol = readerBasedJsonParser._tokenInputCol;
        int actual_tokenInputCol = actual._tokenInputCol;
        assertEquals(readerBasedJsonParser_tokenInputCol, actual_tokenInputCol);
        
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
        
        int readerBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        int actual_numTypesValid = actual._numTypesValid;
        assertEquals(readerBasedJsonParser_numTypesValid, actual_numTypesValid);
        
        int readerBasedJsonParser_numberInt = readerBasedJsonParser._numberInt;
        int actual_numberInt = actual._numberInt;
        assertEquals(readerBasedJsonParser_numberInt, actual_numberInt);
        
        long readerBasedJsonParser_numberLong = readerBasedJsonParser._numberLong;
        long actual_numberLong = actual._numberLong;
        assertEquals(readerBasedJsonParser_numberLong, actual_numberLong);
        
        double readerBasedJsonParser_numberDouble = readerBasedJsonParser._numberDouble;
        double actual_numberDouble = actual._numberDouble;
        org.junit.Assert.assertEquals(readerBasedJsonParser_numberDouble, actual_numberDouble, 1.0E-6);
        
        BigInteger actual_numberBigInt = actual._numberBigInt;
        assertNull(actual_numberBigInt);
        
        BigDecimal actual_numberBigDecimal = actual._numberBigDecimal;
        assertNull(actual_numberBigDecimal);
        
        boolean actual_numberNegative = actual._numberNegative;
        assertFalse(actual_numberNegative);
        
        int readerBasedJsonParser_intLength = readerBasedJsonParser._intLength;
        int actual_intLength = actual._intLength;
        assertEquals(readerBasedJsonParser_intLength, actual_intLength);
        
        int readerBasedJsonParser_fractLength = readerBasedJsonParser._fractLength;
        int actual_fractLength = actual._fractLength;
        assertEquals(readerBasedJsonParser_fractLength, actual_fractLength);
        
        int readerBasedJsonParser_expLength = readerBasedJsonParser._expLength;
        int actual_expLength = actual._expLength;
        assertEquals(readerBasedJsonParser_expLength, actual_expLength);
        
        JsonToken readerBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        JsonToken actual_currToken = actual._currToken;
        assertEquals(readerBasedJsonParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        int readerBasedJsonParser_features = ((Integer) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(readerBasedJsonParser_features, actual_features);
        
        int finalReaderBasedJsonParser_inputPtr = readerBasedJsonParser._inputPtr;
        JsonReadContext finalReaderBasedJsonParser_parsingContext = readerBasedJsonParser._parsingContext;
        JsonToken finalReaderBasedJsonParser_currToken = readerBasedJsonParser._currToken;
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertEquals(1, finalReaderBasedJsonParser_inputPtr);
        
        assertNull(finalReaderBasedJsonParser_parsingContext);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipChildren()
    
    @Test
    public void testSkipChildren2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[37];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = ' ';
        _inputBuffer[35] = '\r';
        _inputBuffer[36] = '\n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 34;
        readerBasedJsonParser._inputEnd = 39;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1879)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\n';
        _inputBuffer[38] = '#';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '\n';
        _inputBuffer[1] = '\r';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren5() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\r';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        _inputBuffer[15] = '\t';
        _inputBuffer[16] = '\t';
        _inputBuffer[17] = '\t';
        _inputBuffer[18] = '\t';
        _inputBuffer[19] = '\t';
        _inputBuffer[20] = '\t';
        _inputBuffer[21] = '\t';
        _inputBuffer[22] = '\t';
        _inputBuffer[23] = '\t';
        _inputBuffer[24] = '\t';
        _inputBuffer[25] = '\t';
        _inputBuffer[26] = '\t';
        _inputBuffer[27] = '\t';
        _inputBuffer[28] = '\t';
        _inputBuffer[29] = '\t';
        _inputBuffer[30] = '\t';
        _inputBuffer[31] = '\t';
        _inputBuffer[32] = '\t';
        _inputBuffer[33] = '\t';
        _inputBuffer[34] = '\t';
        _inputBuffer[35] = '\t';
        _inputBuffer[36] = '\t';
        _inputBuffer[37] = '\t';
        _inputBuffer[38] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1937)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1883)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        _inputBuffer[15] = '\t';
        _inputBuffer[16] = '\t';
        _inputBuffer[17] = '\t';
        _inputBuffer[18] = '\t';
        _inputBuffer[19] = '\t';
        _inputBuffer[20] = '\t';
        _inputBuffer[21] = '\t';
        _inputBuffer[22] = '\t';
        _inputBuffer[23] = '\t';
        _inputBuffer[24] = '\t';
        _inputBuffer[25] = '\t';
        _inputBuffer[26] = '\t';
        _inputBuffer[27] = '\t';
        _inputBuffer[28] = '\t';
        _inputBuffer[29] = '\t';
        _inputBuffer[30] = '\t';
        _inputBuffer[31] = '\t';
        _inputBuffer[32] = '\t';
        _inputBuffer[33] = '\t';
        _inputBuffer[34] = '\t';
        _inputBuffer[35] = '\t';
        _inputBuffer[36] = '\t';
        _inputBuffer[37] = ' ';
        _inputBuffer[38] = '\u0001';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:514)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1894)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren8() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren9() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '\"', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 1;
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren10() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\"', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1856)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = ' ';
        _inputBuffer[1] = '\r';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren12() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '#', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren13() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = ' ';
        _inputBuffer[38] = '\u0001';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:514)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1894)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren14() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\n', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren15() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        _inputBuffer[15] = '\t';
        _inputBuffer[16] = '\t';
        _inputBuffer[17] = '\t';
        _inputBuffer[18] = '\t';
        _inputBuffer[19] = '\t';
        _inputBuffer[20] = '\t';
        _inputBuffer[21] = '\t';
        _inputBuffer[22] = '\t';
        _inputBuffer[23] = '\t';
        _inputBuffer[24] = '\t';
        _inputBuffer[25] = '\t';
        _inputBuffer[26] = '\t';
        _inputBuffer[27] = '\t';
        _inputBuffer[28] = '\t';
        _inputBuffer[29] = '\t';
        _inputBuffer[30] = '\t';
        _inputBuffer[31] = '\t';
        _inputBuffer[32] = '\t';
        _inputBuffer[33] = '\t';
        _inputBuffer[34] = '\t';
        _inputBuffer[35] = '\t';
        _inputBuffer[36] = '\t';
        _inputBuffer[37] = '\t';
        _inputBuffer[38] = '#';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '!', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        readerBasedJsonParser._tokenInputTotal = 0L;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren17() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '/', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1937)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1863)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t', '\t'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputPtr = 1;
        readerBasedJsonParser._inputEnd = 3;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren19() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren20() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[13];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '\\';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 4;
        readerBasedJsonParser._inputEnd = 21;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:540)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2046)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren21() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren22() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        BufferedReader _reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1686)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1872)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren23() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2017)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren24() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1686)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1872)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren25() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '?', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1643)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren26() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren27() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'u';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputPtr = 37;
        readerBasedJsonParser._inputEnd = 39;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2054)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren28() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren29() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ']', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren30() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ']', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        readerBasedJsonParser._tokenInputTotal = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._reportMismatchedEndMarker(ParserBase.java:520)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren31() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1686)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1872)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren32() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '!', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        readerBasedJsonParser._inputEnd = 1;
        readerBasedJsonParser._currInputProcessed = 0L;
        readerBasedJsonParser._tokenInputTotal = 0L;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        readerBasedJsonParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(ReaderBasedJsonParser.java:1462)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:683)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren33() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1856)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    
    @Test
    public void testSkipChildren34() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._currInputProcessed = 0L;
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147) */
        readerBasedJsonParser.skipChildren();
    }
    ///endregion
    
    ///region Errors report for skipChildren
    
    public void testSkipChildren_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsBoolean(boolean)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsBoolean(boolean)}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getIntValue()}
 * @utbot.activatesSwitch {@code switch(t.id()) case: ID_NUMBER_INT}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getIntValue() != 0;
 *  */
    @Test
    public void testGetValueAsBoolean_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsBoolean(boolean)
    
    @Test
    public void testGetValueAsBoolean1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int finalUTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
        
        assertEquals(-53328, finalUTF8StreamJsonParser_numberInt);
    }
    
    @Test
    public void testGetValueAsBoolean2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 36);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 2;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int finalUTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
        
        assertEquals(528, finalUTF8StreamJsonParser_numberInt);
    }
    
    @Test
    public void testGetValueAsBoolean3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 7;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int finalUTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
        
        assertEquals(-53333328, finalUTF8StreamJsonParser_numberInt);
    }
    
    @Test
    public void testGetValueAsBoolean4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[33];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 27);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsBoolean5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483638;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsBoolean6() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsBoolean7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    
    @Test
    public void testGetValueAsBoolean8() throws Exception  {
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
        
        boolean actual = readerBasedJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    
    @Test
    public void testGetValueAsBoolean9() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    
    @Test
    public void testGetValueAsBoolean10() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    
    @Test
    public void testGetValueAsBoolean11() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[13];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 6;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsBoolean12() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '0', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = -2147483646;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsBoolean13() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[11];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 3;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        int finalUTF8StreamJsonParser_numberInt = uTF8StreamJsonParser._numberInt;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
        
        assertEquals(5328, finalUTF8StreamJsonParser_numberInt);
    }
    
    @Test
    public void testGetValueAsBoolean14() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        boolean actual = uTF8StreamJsonParser.getValueAsBoolean(false);
        
        assertTrue(actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(1, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsBoolean15() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsBoolean(boolean)
    
    @Test
    public void testGetValueAsBoolean16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[33];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 27);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 7;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 33]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:47)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean17() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 4);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:39)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean19() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 36);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 3;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:49)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean20() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 2);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 8;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:51)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean21() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean22() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 8);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean23() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 10;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:41)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:826)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean24() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean25() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:51)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean26() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 3;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:49)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean27() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean28() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 2;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:47)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean29() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._intLength = 10;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:42)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:826)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean30() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 10;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:41)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:826)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean31() throws Exception  {
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        char[] prevNO_CHARS = ((char[]) getStaticFieldValue(textBufferClazz, "NO_CHARS"));
        try {
            char[] noChars = {};
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
            TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
            setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
            JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
            readerBasedJsonParser._currToken = _currToken;
            
            /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
                com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
                com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
                com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
            readerBasedJsonParser.getValueAsBoolean(false);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test
    public void testGetValueAsBoolean32() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 1;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1566)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:234) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean33() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 20;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:567)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:873)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:792)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:826)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean34() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 10;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:826)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean35() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 9);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:735)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:367)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:316)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:810)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:246) */
        uTF8StreamJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean36() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:235)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:234) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean37() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:235)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:234) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean38() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = -2147483647;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString2(ReaderBasedJsonParser.java:1598)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1585)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:234) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean39() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:235)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:234) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    
    @Test
    public void testGetValueAsBoolean40() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = -2147483647;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:204)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1583)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(ParserMinimalBase.java:234) */
        readerBasedJsonParser.getValueAsBoolean(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString
    
    ///region Errors report for getValueAsString
    
    public void testGetValueAsString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString
    
    ///region Errors report for getValueAsString
    
    public void testGetValueAsString_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getValueAsLong(long)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getLongValue()}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 2;
        readerBasedJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_INT() throws Exception  {
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
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_INT_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberLong = 0L;
        readerBasedJsonParser._numberDouble = -4.9E-324;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(-255L);
        
        assertEquals(0L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(10, finalReaderBasedJsonParser_numTypesValid);
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        long actual = readerBasedJsonParser.getValueAsLong(-255L);
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getValueAsLong(long)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (t == JsonToken.VALUE_NUMBER_INT): False},
    ///     {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False},
    ///     {@code (t != null): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.core.JsonToken#id()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.activatesSwitch {@code switch(t.id())}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsLong_ReturnDefaultValue() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(-255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.activatesSwitch {@code switch(t.id()) case: ID_NULL}
 *  */
    @Test
    public void testGetValueAsLong_ReturnZero() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(2L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong(long)}
 * @utbot.activatesSwitch {@code switch(t.id()) case: ID_TRUE}
 * @utbot.returnsFrom {@code return 1L;}
 *  */
    @Test
    public void testGetValueAsLong_Return1L() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(8L);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsLong(long)
    
    @Test
    public void testGetValueAsLong1() throws Exception  {
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
    public void testGetValueAsLong2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 67108872;
        uTF8StreamJsonParser._numberLong = 0L;
        uTF8StreamJsonParser._numberDouble = java.lang.Double.NaN;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
        
        int finalUTF8StreamJsonParser_numTypesValid = uTF8StreamJsonParser._numTypesValid;
        
        assertEquals(67108874, finalUTF8StreamJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 2;
        uTF8StreamJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        long actual = uTF8StreamJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetValueAsLong4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(53328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong5() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 3;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(-5328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = new char[14];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 6;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(5333328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = new char[14];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 9;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(1038366032L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong8() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(-53328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong9() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(-533328L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong10() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 36);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 2;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(528L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetValueAsLong12() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetValueAsLong13() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(-48L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    @Test
    public void testGetValueAsLong14() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong(0L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsLong(long)
    
    @Test
    public void testGetValueAsLong15() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 16;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong16() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 12;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:47)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong17() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 12;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:40)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong18() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 16;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong19() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 36);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 3;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:49)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:762)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong20() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 10;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:42)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong21() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 10;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong22() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 16;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:34)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong23() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = new char[11];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 12;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:41)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong24() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 11;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:40)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong25() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 12;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:47)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong26() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 10;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:42)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:768)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong27() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:762)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong28() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:762)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong29() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1073741824, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:399)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:848)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:796)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong30() throws Exception  {
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        char[] prevNO_CHARS = ((char[]) getStaticFieldValue(textBufferClazz, "NO_CHARS"));
        try {
            char[] noChars = {};
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
            JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
            uTF8StreamJsonParser._currToken = _currToken;
            
            /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
                com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:762)
                com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
                com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
            uTF8StreamJsonParser.getValueAsLong(0L);
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test
    public void testGetValueAsLong31() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberDouble = 2.68156158598852E154;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:375)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:289)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowLong(ParserBase.java:1033)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:930)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:673)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong32() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 8;
        uTF8StreamJsonParser._numberDouble = -1.8446744073709556E19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:375)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:289)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowLong(ParserBase.java:1033)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:930)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:673)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong33() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = 2;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1566)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:337) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong34() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 16;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:934)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:673)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong35() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 67108872;
        uTF8StreamJsonParser._numberDouble = -4.150517416584649E19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:375)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:289)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowLong(ParserBase.java:1033)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:930)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:673)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong36() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:922)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:673)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong37() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 4;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:922)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:673)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong38() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:848)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:796)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong39() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:567)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:853)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:796)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong40() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
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
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:567)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:873)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:792)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong41() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:567)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:873)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:792)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong42() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 19;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:862)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:792)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong43() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:567)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:853)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:796)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong44() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:567)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:853)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:796)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong45() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        uTF8StreamJsonParser._numberNegative = true;
        uTF8StreamJsonParser._intLength = 20;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:567)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:873)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:792)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong46() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:399)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:848)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:796)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong47() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:399)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:848)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:796)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong48() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:735)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:367)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:316)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:755)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong49() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:235)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:337) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong50() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = -2147483647;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:204)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1583)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:337) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong51() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:399)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:848)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:796)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:332) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong52() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.resultArray(TextBuffer.java:735)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsArray(TextBuffer.java:367)
            com.fasterxml.jackson.core.util.TextBuffer.getTextBuffer(TextBuffer.java:316)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:755)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:670)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:329) */
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    
    @Test
    public void testGetValueAsLong53() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        readerBasedJsonParser._inputEnd = -2147483647;
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:448)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1583)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong(ParserMinimalBase.java:337) */
        readerBasedJsonParser.getValueAsLong(0L);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValueAsLong(long)
    
    @Test(expected = RuntimeException.class)
    public void testGetValueAsLong54() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        uTF8StreamJsonParser._numTypesValid = 32;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        uTF8StreamJsonParser._currToken = _currToken;
        
        uTF8StreamJsonParser.getValueAsLong(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsLong()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.returnsFrom {@code return getValueAsLong(0L);}
 *  */
    @Test
    public void testGetValueAsLong_TNotEqualsJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
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
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_INT1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 2;
        readerBasedJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_INT_11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 1;
        readerBasedJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsLong()}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.returnsFrom {@code return getLongValue();}
 *  */
    @Test
    public void testGetValueAsLong_TEqualsJsonTokenVALUE_NUMBER_FLOAT1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 2;
        readerBasedJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberLong = 0L;
        readerBasedJsonParser._numberDouble = -4.9E-324;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        long actual = readerBasedJsonParser.getValueAsLong();
        
        assertEquals(0L, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(10, finalReaderBasedJsonParser_numTypesValid);
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsInt()
    
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
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getIntValue()}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_FLOAT() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 1;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
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
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT() throws Exception  {
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
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 2;
        readerBasedJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        int actual = readerBasedJsonParser.getValueAsInt();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsInt(int)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getIntValue()}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_FLOAT1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 1;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt(-255);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.executesCondition {@code (t != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.activatesSwitch {@code switch(t.id())}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsInt_TNotEqualsNull() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt(-255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 8;
        readerBasedJsonParser._numberDouble = -4.9E-324;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt(-255);
        
        assertEquals(0, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(9, finalReaderBasedJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT_11() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 2;
        readerBasedJsonParser._numberLong = 0L;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt(-255);
        
        assertEquals(0, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        
        assertEquals(3, finalReaderBasedJsonParser_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_FLOAT): False}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsNull() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        int actual = readerBasedJsonParser.getValueAsInt(-255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT_2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 1;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt(-255);
        
        assertEquals(-48, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        int finalReaderBasedJsonParser_numberInt = readerBasedJsonParser._numberInt;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
        
        assertEquals(-48, finalReaderBasedJsonParser_numberInt);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.returnsFrom {@code return getIntValue();}
 *  */
    @Test
    public void testGetValueAsInt_TEqualsJsonTokenVALUE_NUMBER_INT_3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _resultArray = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._intLength = 2;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        int actual = readerBasedJsonParser.getValueAsInt(-255);
        
        assertEquals(-528, actual);
        
        int finalReaderBasedJsonParser_numTypesValid = readerBasedJsonParser._numTypesValid;
        int finalReaderBasedJsonParser_numberInt = readerBasedJsonParser._numberInt;
        
        assertEquals(1, finalReaderBasedJsonParser_numTypesValid);
        
        assertEquals(-528, finalReaderBasedJsonParser_numberInt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsInt(int)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getIntValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetValueAsInt_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _resultArray = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        readerBasedJsonParser._numberNegative = true;
        readerBasedJsonParser._intLength = 5;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:817)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:656)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:282) */
        readerBasedJsonParser.getValueAsInt(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValueAsInt(int)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getValueAsInt(int)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getIntValue()}
 * @utbot.throwsException {@link java.lang.RuntimeException} 
 *  */
    @Test(expected = RuntimeException.class)
    public void testGetValueAsInt_ThrowRuntimeException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        readerBasedJsonParser._numTypesValid = 32;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        readerBasedJsonParser._currToken = _currToken;
        
        readerBasedJsonParser.getValueAsInt(-255);
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        double actual = uTF8StreamJsonParser.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._constructError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructError(java.lang.String, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_constructError(java.lang.String,java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#getCurrentLocation()}
 * @utbot.returnsFrom {@code return new JsonParseException(msg, getCurrentLocation(), t);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new JsonParseException(msg, getCurrentLocation(), t);
 *  */
    @Test
    public void test_constructError_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._constructError] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575) */
        uTF8StreamJsonParser._constructError(null, null);
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.isExpectedStartArrayToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isExpectedStartArrayToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_ARRAY;}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_Return_currTokenNotEqualsJsonTokenSTART_ARRAY_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        boolean actual = uTF8StreamJsonParser.isExpectedStartArrayToken();
        
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        JsonToken actual = uTF8StreamJsonParser.getLastClearedToken();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase.isExpectedStartObjectToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExpectedStartObjectToken()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isExpectedStartObjectToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_OBJECT;}
 *  */
    @Test
    public void testIsExpectedStartObjectToken_Return_currTokenNotEqualsJsonTokenSTART_OBJECT() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        readerBasedJsonParser._currToken = _currToken;
        
        boolean actual = readerBasedJsonParser.isExpectedStartObjectToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isExpectedStartObjectToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_OBJECT;}
 *  */
    @Test
    public void testIsExpectedStartObjectToken_Return_currTokenNotEqualsJsonTokenSTART_OBJECT_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        boolean actual = uTF8StreamJsonParser.isExpectedStartObjectToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportBase64EOF
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _reportBase64EOF()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportBase64EOF()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_constructError(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw _constructError("Unexpected end-of-String in base64 content");
 *  */
    @Test
    public void test_reportBase64EOF_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportBase64EOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportBase64EOF(ParserMinimalBase.java:459) */
        uTF8StreamJsonParser._reportBase64EOF();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _reportInvalidEOF(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportError(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _reportError("Unexpected end-of-input" + msg);
 *  */
    @Test
    public void test_reportInvalidEOF_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500) */
        uTF8StreamJsonParser._reportInvalidEOF(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _reportInvalidEOF()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _reportInvalidEOF(" in " + _currToken);
 *  */
    @Test
    public void test_reportInvalidEOF_ThrowNullPointerException1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:496) */
        uTF8StreamJsonParser._reportInvalidEOF();
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 *  */
    @Test
    public void test_decodeBase64_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = " ";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 *  */
    @Test
    public void test_decodeBase64_2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "  ";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
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
        byte[] _currBlock = {(byte) -127, (byte) -127};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", 1);
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
        
        readerBasedJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
        
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
    public void test_decodeBase64_4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "$\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        byte[] _currBlock = {(byte) -127};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", 1);
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
        _asciiToBase64[12] = -255;
        _asciiToBase64[13] = -255;
        _asciiToBase64[14] = -255;
        _asciiToBase64[15] = -255;
        _asciiToBase64[16] = -255;
        _asciiToBase64[17] = -255;
        _asciiToBase64[18] = 1;
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
        _asciiToBase64[35] = 1;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        byte[] initialByteArrayBuilder_currBlock = ((byte[]) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        
        uTF8StreamJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
        
        int finalByteArrayBuilder_pastLen = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        byte[] finalByteArrayBuilder_currBlock = ((byte[]) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        
        assertFalse(initialByteArrayBuilder_currBlock == finalByteArrayBuilder_currBlock);
        
        assertEquals(1, finalByteArrayBuilder_pastLen);
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "@ ";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = {-255};
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.ArrayIndexOutOfBoundsException: Index 64 out of bounds for length 1]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:211)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:465)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
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
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:211)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:475)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "$\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        byte[] _currBlock = {};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -1);
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
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.ByteArrayBuilder.append(ByteArrayBuilder.java:81)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:485)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
        uTF8StreamJsonParser._decodeBase64(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link java.lang.IllegalArgumentException#getMessage()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportError(java.lang.String)}
 * @utbot.caughtException {@code IllegalArgumentException e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _reportError(e.getMessage());
 *  */
    @Test
    public void test_decodeBase64_ThrowNullPointerException_2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "$\u0000";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[37];
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
        _asciiToBase64[33] = -254;
        _asciiToBase64[34] = -255;
        _asciiToBase64[35] = -255;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_usesPadding", true);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:422) */
        readerBasedJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowNullPointerException_1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "$\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", 1024);
        byte[] _currBlock = {(byte) -127};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", 1);
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
        _asciiToBase64[31] = 1;
        _asciiToBase64[32] = -255;
        _asciiToBase64[33] = -255;
        _asciiToBase64[34] = -255;
        _asciiToBase64[35] = -255;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.ByteArrayBuilder._allocMore(ByteArrayBuilder.java:238)
            com.fasterxml.jackson.core.util.ByteArrayBuilder.append(ByteArrayBuilder.java:79)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:485)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
        readerBasedJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: b64variant.decode(str, builder);
 *  */
    @Test
    public void test_decodeBase64_ThrowNullPointerException_3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "$$";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", 1073741833);
        byte[] _currBlock = {(byte) -127, (byte) -127};
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        setField(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", 2);
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
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.ByteArrayBuilder._allocMore(ByteArrayBuilder.java:238)
            com.fasterxml.jackson.core.util.ByteArrayBuilder.append(ByteArrayBuilder.java:79)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:485)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
        uTF8StreamJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _decodeBase64(java.lang.String, com.fasterxml.jackson.core.util.ByteArrayBuilder, com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void test_decodeBase641() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\u0001\u0000\u0000";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _decodeBase64(java.lang.String, com.fasterxml.jackson.core.util.ByteArrayBuilder, com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void test_decodeBase642() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\u0001\u0080\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '\u0080');
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:422) */
        uTF8StreamJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
    }
    
    @Test
    public void test_decodeBase643() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\"\u0002\u0000";
        ByteArrayBuilder byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[0] = Integer.MIN_VALUE;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:422) */
        uTF8StreamJsonParser._decodeBase64(string, byteArrayBuilder, base64Variant);
    }
    
    @Test
    public void test_decodeBase644() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\u0080\u0080";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '\u0080');
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:422) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    @Test
    public void test_decodeBase645() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\"\u0000\u0080";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[1] = 528;
        _asciiToBase64[2] = 528;
        _asciiToBase64[3] = 528;
        _asciiToBase64[4] = 528;
        _asciiToBase64[5] = 528;
        _asciiToBase64[6] = 528;
        _asciiToBase64[7] = 528;
        _asciiToBase64[8] = 528;
        _asciiToBase64[9] = 528;
        _asciiToBase64[10] = 528;
        _asciiToBase64[11] = 528;
        _asciiToBase64[12] = 528;
        _asciiToBase64[13] = 528;
        _asciiToBase64[14] = 528;
        _asciiToBase64[15] = 528;
        _asciiToBase64[16] = 528;
        _asciiToBase64[17] = 528;
        _asciiToBase64[18] = 528;
        _asciiToBase64[19] = 528;
        _asciiToBase64[20] = 528;
        _asciiToBase64[21] = 528;
        _asciiToBase64[22] = 528;
        _asciiToBase64[23] = 528;
        _asciiToBase64[24] = 528;
        _asciiToBase64[25] = 528;
        _asciiToBase64[26] = 528;
        _asciiToBase64[27] = 528;
        _asciiToBase64[28] = 528;
        _asciiToBase64[29] = 528;
        _asciiToBase64[30] = 528;
        _asciiToBase64[31] = 528;
        _asciiToBase64[32] = 528;
        _asciiToBase64[33] = 528;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:422) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    @Test
    public void test_decodeBase646() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\"!";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[33] = Integer.MIN_VALUE;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '!');
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:422) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    @Test
    public void test_decodeBase647() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\"\u0000\u0000";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:518)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    @Test
    public void test_decodeBase648() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\"\u0000\u0000\u0000\u0000\u0000\u0000";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:534)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    @Test
    public void test_decodeBase649() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\u0001!\u0000";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[34];
        _asciiToBase64[33] = Integer.MIN_VALUE;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '!');
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:422) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    @Test
    public void test_decodeBase6410() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\u0001\"\u0000";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        _asciiToBase64[34] = Integer.MIN_VALUE;
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '\u0000');
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:422) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    
    @Test
    public void test_decodeBase6411() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\u0001\"\u0000";
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[35];
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:485)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:420) */
        uTF8StreamJsonParser._decodeBase64(string, null, base64Variant);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace
    
    ///region OTHER: ERROR SUITE for method _throwInvalidSpace(int)
    
    @Test
    public void test_throwInvalidSpace1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:514) */
        uTF8StreamJsonParser._throwInvalidSpace(17);
    }
    
    @Test
    public void test_throwInvalidSpace2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:514) */
        readerBasedJsonParser._throwInvalidSpace(125);
    }
    
    @Test
    public void test_throwInvalidSpace3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:514) */
        readerBasedJsonParser._throwInvalidSpace(972);
    }
    
    @Test
    public void test_throwInvalidSpace4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:514) */
        uTF8StreamJsonParser._throwInvalidSpace(5772);
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _reportError(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportError(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_constructError(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw _constructError(msg);
 *  */
    @Test
    public void test_reportError_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportError] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563) */
        uTF8StreamJsonParser._reportError(null);
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._getCharDesc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _getCharDesc(int)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_getCharDesc(int)}
 * @utbot.invokes {@link java.lang.Character#isISOControl(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "(CTRL-CHAR, code " + ch + ")";}
 *  */
    @Test
    public void test_getCharDesc_StringBuilderToString() {
        String actual = ParserMinimalBase._getCharDesc(0);
        
        String expected = "(CTRL-CHAR, code 0)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _getCharDesc(int)
    
    @Test
    public void test_getCharDesc1() {
        String actual = ParserMinimalBase._getCharDesc(-137777);
        
        String expected = "'\uE5CF' (code -137777)";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_getCharDesc2() {
        String actual = ParserMinimalBase._getCharDesc(65640);
        
        String expected = "'h' (code 65640 / 0x10068)";
        
        assertEquals(expected, actual);
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
        
        org.junit.Assert.assertArrayEquals(expected, actual);
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
        
        org.junit.Assert.assertArrayEquals(expected, actual);
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
            com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes(ParserMinimalBase.java:579) */
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
        
        org.junit.Assert.assertArrayEquals(expected, actual);
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
            com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(ParserMinimalBase.java:588) */
        ParserMinimalBase._ascii(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _wrapError(java.lang.String, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_wrapError(java.lang.String,java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_constructError(java.lang.String,java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw _constructError(msg, t);
 *  */
    @Test
    public void test_wrapError_ThrowNullPointerException() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:575)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:567) */
        readerBasedJsonParser._wrapError(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleUnrecognizedCharacterEscape(char)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_handleUnrecognizedCharacterEscape(char)}
 *  */
    @Test
    public void test_handleUnrecognizedCharacterEscape_ReturnCh() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 64);
        
        char actual = uTF8StreamJsonParser._handleUnrecognizedCharacterEscape(' ');
        
        assertEquals(' ', actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_handleUnrecognizedCharacterEscape(char)}
 * @utbot.executesCondition {@code (ch == '\''): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isEnabled(com.fasterxml.jackson.core.JsonParser.Feature)}
 *  */
    @Test
    public void test_handleUnrecognizedCharacterEscape_ChEqualsChar() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 16);
        
        char actual = uTF8StreamJsonParser._handleUnrecognizedCharacterEscape('\'');
        
        assertEquals('\'', actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _handleUnrecognizedCharacterEscape(char)
    
    @Test
    public void test_handleUnrecognizedCharacterEscape1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:540) */
        readerBasedJsonParser._handleUnrecognizedCharacterEscape('\u0011');
    }
    
    @Test
    public void test_handleUnrecognizedCharacterEscape2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:540) */
        readerBasedJsonParser._handleUnrecognizedCharacterEscape('}');
    }
    
    @Test
    public void test_handleUnrecognizedCharacterEscape3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:540) */
        uTF8StreamJsonParser._handleUnrecognizedCharacterEscape('9');
    }
    
    @Test
    public void test_handleUnrecognizedCharacterEscape4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:540) */
        uTF8StreamJsonParser._handleUnrecognizedCharacterEscape('\u43B4');
    }
    
    @Test
    public void test_handleUnrecognizedCharacterEscape5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:540) */
        uTF8StreamJsonParser._handleUnrecognizedCharacterEscape('\'');
    }
    
    @Test
    public void test_handleUnrecognizedCharacterEscape6() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:540) */
        uTF8StreamJsonParser._handleUnrecognizedCharacterEscape('\u0001');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS
    
    ///region OTHER: ERROR SUITE for method _reportMissingRootWS(int)
    
    @Test
    public void test_reportMissingRootWS1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS(ParserMinimalBase.java:508) */
        uTF8StreamJsonParser._reportMissingRootWS(97737);
    }
    
    @Test
    public void test_reportMissingRootWS2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS(ParserMinimalBase.java:508) */
        uTF8StreamJsonParser._reportMissingRootWS(13762577);
    }
    
    @Test
    public void test_reportMissingRootWS3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS(ParserMinimalBase.java:508) */
        readerBasedJsonParser._reportMissingRootWS(65561);
    }
    
    @Test
    public void test_reportMissingRootWS4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS(ParserMinimalBase.java:508) */
        uTF8StreamJsonParser._reportMissingRootWS(97);
    }
    
    @Test
    public void test_reportMissingRootWS5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:496)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:486)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportMissingRootWS(ParserMinimalBase.java:508) */
        uTF8StreamJsonParser._reportMissingRootWS(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOFInValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _reportInvalidEOFInValue()
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOFInValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidEOF(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _reportInvalidEOF(" in a value");
 *  */
    @Test
    public void test_reportInvalidEOFInValue_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOFInValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOFInValue(ParserMinimalBase.java:504) */
        uTF8StreamJsonParser._reportInvalidEOFInValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidBase64
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _reportInvalidBase64(com.fasterxml.jackson.core.Base64Variant, char, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_reportInvalidBase64(com.fasterxml.jackson.core.Base64Variant,char,int,java.lang.String)}
 * @utbot.executesCondition {@code (ch <= INT_SPACE): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.Base64Variant#usesPaddingChar(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b64variant.usesPaddingChar(ch)
 *  */
    @Test
    public void test_reportInvalidBase64_ThrowNullPointerException() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidBase64(ParserMinimalBase.java:439) */
        uTF8StreamJsonParser._reportInvalidBase64(null, '!', -255, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _reportInvalidBase64(com.fasterxml.jackson.core.Base64Variant, char, int, java.lang.String)
    
    @Test
    public void test_reportInvalidBase641() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '!');
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidBase64(ParserMinimalBase.java:450) */
        uTF8StreamJsonParser._reportInvalidBase64(base64Variant, '!', 0, null);
    }
    
    @Test
    public void test_reportInvalidBase642() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidBase64(ParserMinimalBase.java:450) */
        readerBasedJsonParser._reportInvalidBase64(null, '\u0005', -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar
    
    ///region OTHER: ERROR SUITE for method _reportUnexpectedChar(int, java.lang.String)
    
    @Test
    public void test_reportUnexpectedChar1() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492) */
        readerBasedJsonParser._reportUnexpectedChar(196735, string);
    }
    
    @Test
    public void test_reportUnexpectedChar2() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492) */
        readerBasedJsonParser._reportUnexpectedChar(127, null);
    }
    
    @Test
    public void test_reportUnexpectedChar3() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492) */
        uTF8StreamJsonParser._reportUnexpectedChar(17760383, string);
    }
    
    @Test
    public void test_reportUnexpectedChar4() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492) */
        uTF8StreamJsonParser._reportUnexpectedChar(17, null);
    }
    
    @Test
    public void test_reportUnexpectedChar5() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492) */
        uTF8StreamJsonParser._reportUnexpectedChar(17777, null);
    }
    
    @Test
    public void test_reportUnexpectedChar6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492) */
        readerBasedJsonParser._reportUnexpectedChar(93, string);
    }
    
    @Test
    public void test_reportUnexpectedChar7() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:492) */
        readerBasedJsonParser._reportUnexpectedChar(177, null);
    }
    
    @Test
    public void test_reportUnexpectedChar8() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        uTF8StreamJsonParser._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:500)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:496)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:486) */
        uTF8StreamJsonParser._reportUnexpectedChar(Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _throwUnquotedSpace(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParserMinimalBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.base.ParserMinimalBase#_throwUnquotedSpace(int,java.lang.String)}
 * @utbot.executesCondition {@code (i > INT_SPACE): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.base.ParserMinimalBase#isEnabled(com.fasterxml.jackson.core.JsonParser.Feature)}
 *  */
    @Test
    public void test_throwUnquotedSpace_ILessOrEqualINT_SPACE() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        
        readerBasedJsonParser._throwUnquotedSpace(32, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _throwUnquotedSpace(int, java.lang.String)
    
    @Test
    public void test_throwUnquotedSpace1() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:527) */
        uTF8StreamJsonParser._throwUnquotedSpace(127, string);
    }
    
    @Test
    public void test_throwUnquotedSpace2() throws Exception  {
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:657)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:527) */
        uTF8StreamJsonParser._throwUnquotedSpace(65537, string);
    }
    
    @Test
    public void test_throwUnquotedSpace3() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:527) */
        readerBasedJsonParser._throwUnquotedSpace(33, string);
    }
    
    @Test
    public void test_throwUnquotedSpace4() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:527) */
        readerBasedJsonParser._throwUnquotedSpace(0, string);
    }
    
    @Test
    public void test_throwUnquotedSpace5() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:527) */
        readerBasedJsonParser._throwUnquotedSpace(160, string);
    }
    
    @Test
    public void test_throwUnquotedSpace6() throws Exception  {
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 32);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1525)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:563)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:527) */
        readerBasedJsonParser._throwUnquotedSpace(65536, string);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1023723500128700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1023723500128700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1023723500134200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023723500128700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023723500134200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1023723500467500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1023723500467500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1023723500469300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023723500467500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023723500469300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1023723500801500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1023723500801500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1023723500803100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023723500801500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023723500803100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1023723501461700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1023723501461700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1023723501463100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023723501461700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023723501463100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

