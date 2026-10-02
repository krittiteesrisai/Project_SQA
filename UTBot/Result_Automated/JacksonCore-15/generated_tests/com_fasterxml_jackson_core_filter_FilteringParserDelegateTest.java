package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import java.io.Reader;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.Base64Variant;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import sun.security.util.DerOutputStream;
import java.io.FilterOutputStream;
import java.util.LinkedList;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.io.BufferedReader;
import jdk.internal.util.xml.impl.ReaderUTF8;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_core_filter_FilteringParserDelegateTest {
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.isExpectedStartArrayToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExpectedStartArrayToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#isExpectedStartArrayToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_ARRAY;}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_Return_currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        
        boolean actual = filteringParserDelegate.isExpectedStartArrayToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#isExpectedStartArrayToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_ARRAY;}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_Return_currTokenNotEqualsJsonTokenSTART_ARRAY_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        boolean actual = filteringParserDelegate.isExpectedStartArrayToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.isExpectedStartObjectToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExpectedStartObjectToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#isExpectedStartObjectToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_OBJECT;}
 *  */
    @Test
    public void testIsExpectedStartObjectToken_Return_currTokenNotEqualsJsonTokenSTART_OBJECT() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        
        boolean actual = filteringParserDelegate.isExpectedStartObjectToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#isExpectedStartObjectToken()}
 * @utbot.returnsFrom {@code return _currToken == JsonToken.START_OBJECT;}
 *  */
    @Test
    public void testIsExpectedStartObjectToken_Return_currTokenNotEqualsJsonTokenSTART_OBJECT_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        boolean actual = filteringParserDelegate.isExpectedStartObjectToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLastClearedToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLastClearedToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getLastClearedToken()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetLastClearedToken_Return() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        JsonToken actual = filteringParserDelegate.getLastClearedToken();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.overrideCurrentName
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method overrideCurrentName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#overrideCurrentName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Can not currently override name during filtering read");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentName_ThrowUnsupportedOperationException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        filteringParserDelegate.overrideCurrentName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.clearCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearCurrentToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#clearCurrentToken()}
 * @utbot.executesCondition {@code (_currToken != null): False}
 *  */
    @Test
    public void testClearCurrentToken__currTokenEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        filteringParserDelegate.clearCurrentToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#clearCurrentToken()}
 * @utbot.executesCondition {@code (_currToken != null): True}
 *  */
    @Test
    public void testClearCurrentToken__currTokenNotEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        
        JsonToken initialFilteringParserDelegate_lastClearedToken = filteringParserDelegate._lastClearedToken;
        
        filteringParserDelegate.clearCurrentToken();
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        JsonToken finalFilteringParserDelegate_lastClearedToken = filteringParserDelegate._lastClearedToken;
        
        assertNull(finalFilteringParserDelegate_currToken);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getParsingContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParsingContext()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getParsingContext()}
 * @utbot.returnsFrom {@code return _filterContext();}
 *  */
    @Test
    public void testGetParsingContext_Return_filterContext() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        JsonStreamContext actual = filteringParserDelegate.getParsingContext();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getParsingContext()}
 * @utbot.returnsFrom {@code return _filterContext();}
 *  */
    @Test
    public void testGetParsingContext_Return_filterContext_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        
        TokenFilterContext actual = ((TokenFilterContext) filteringParserDelegate.getParsingContext());
        
        TokenFilterContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        TokenFilterContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        TokenFilter actual_filter = actual._filter;
        assertNull(actual_filter);
        
        boolean actual_startHandled = actual._startHandled;
        assertFalse(actual_startHandled);
        
        boolean actual_needToHandleName = actual._needToHandleName;
        assertFalse(actual_needToHandleName);
        
        int _exposedContext_type = ((Integer) getFieldValue(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(_exposedContext_type, actual_type);
        
        int _exposedContext_index = ((Integer) getFieldValue(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(_exposedContext_index, actual_index);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasCurrentToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasCurrentToken()}
 * @utbot.returnsFrom {@code return _currToken != null;}
 *  */
    @Test
    public void testHasCurrentToken_Return_currTokenEqualsNull_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        
        boolean actual = filteringParserDelegate.hasCurrentToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasCurrentToken()}
 * @utbot.returnsFrom {@code return _currToken != null;}
 *  */
    @Test
    public void testHasCurrentToken_Return_currTokenEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        boolean actual = filteringParserDelegate.hasCurrentToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasToken(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.returnsFrom {@code return (_currToken == t);}
 *  */
    @Test
    public void testHasToken__currTokenNotEqualsT() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        
        boolean actual = filteringParserDelegate.hasToken(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.returnsFrom {@code return (_currToken == t);}
 *  */
    @Test
    public void testHasToken__currTokenEqualsT() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        boolean actual = filteringParserDelegate.hasToken(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipChildren()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#skipChildren()}
 * @utbot.executesCondition {@code (_currToken != JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (_currToken != JsonToken.START_ARRAY): True}
 *  */
    @Test
    public void testSkipChildren__currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        
        FilteringParserDelegate actual = ((FilteringParserDelegate) filteringParserDelegate.skipChildren());
        
        TokenFilter actualRootFilter = actual.rootFilter;
        assertNull(actualRootFilter);
        
        boolean actual_allowMultipleMatches = actual._allowMultipleMatches;
        assertFalse(actual_allowMultipleMatches);
        
        boolean actual_includePath = actual._includePath;
        assertFalse(actual_includePath);
        
        boolean actual_includeImmediateParent = actual._includeImmediateParent;
        assertFalse(actual_includeImmediateParent);
        
        JsonToken filteringParserDelegate_currToken = filteringParserDelegate._currToken;
        JsonToken actual_currToken = actual._currToken;
        assertEquals(filteringParserDelegate_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        TokenFilterContext actual_headContext = actual._headContext;
        assertNull(actual_headContext);
        
        TokenFilterContext actual_exposedContext = actual._exposedContext;
        assertNull(actual_exposedContext);
        
        TokenFilter actual_itemFilter = actual._itemFilter;
        assertNull(actual_itemFilter);
        
        int filteringParserDelegate_matchCount = filteringParserDelegate._matchCount;
        int actual_matchCount = actual._matchCount;
        assertEquals(filteringParserDelegate_matchCount, actual_matchCount);
        
        JsonParser actualDelegate = ((JsonParser) getFieldValue(actual, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        assertNull(actualDelegate);
        
        int filteringParserDelegate_features = ((Integer) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(filteringParserDelegate_features, actual_features);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method skipChildren()
    
    @Test
    public void testSkipChildren1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        FilteringParserDelegate actual = ((FilteringParserDelegate) filteringParserDelegate.skipChildren());
        
        TokenFilter actualRootFilter = actual.rootFilter;
        assertNull(actualRootFilter);
        
        boolean actual_allowMultipleMatches = actual._allowMultipleMatches;
        assertFalse(actual_allowMultipleMatches);
        
        boolean actual_includePath = actual._includePath;
        assertFalse(actual_includePath);
        
        boolean actual_includeImmediateParent = actual._includeImmediateParent;
        assertFalse(actual_includeImmediateParent);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        TokenFilterContext actual_headContext = actual._headContext;
        assertNull(actual_headContext);
        
        TokenFilterContext actual_exposedContext = actual._exposedContext;
        assertNull(actual_exposedContext);
        
        TokenFilter actual_itemFilter = actual._itemFilter;
        assertNull(actual_itemFilter);
        
        int filteringParserDelegate_matchCount = filteringParserDelegate._matchCount;
        int actual_matchCount = actual._matchCount;
        assertEquals(filteringParserDelegate_matchCount, actual_matchCount);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser actualDelegate = ((JsonParser) getFieldValue(actual, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        Reader actualDelegate_reader = ((Reader) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader"));
        assertNull(actualDelegate_reader);
        
        char[] actualDelegate_inputBuffer = ((char[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer"));
        assertNull(actualDelegate_inputBuffer);
        
        boolean actualDelegate_bufferRecyclable = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_bufferRecyclable"));
        assertFalse(actualDelegate_bufferRecyclable);
        
        ObjectCodec actualDelegate_objectCodec = ((ObjectCodec) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_objectCodec"));
        assertNull(actualDelegate_objectCodec);
        
        CharsToNameCanonicalizer actualDelegate_symbols = ((CharsToNameCanonicalizer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_symbols"));
        assertNull(actualDelegate_symbols);
        
        int filteringParserDelegateDelegate_hashSeed = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        int actualDelegate_hashSeed = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        assertEquals(filteringParserDelegateDelegate_hashSeed, actualDelegate_hashSeed);
        
        boolean actualDelegate_tokenIncomplete = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete"));
        assertFalse(actualDelegate_tokenIncomplete);
        
        long filteringParserDelegateDelegate_nameStartOffset = ((Long) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        long actualDelegate_nameStartOffset = ((Long) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        assertEquals(filteringParserDelegateDelegate_nameStartOffset, actualDelegate_nameStartOffset);
        
        int filteringParserDelegateDelegate_nameStartRow = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        int actualDelegate_nameStartRow = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        assertEquals(filteringParserDelegateDelegate_nameStartRow, actualDelegate_nameStartRow);
        
        int filteringParserDelegateDelegate_nameStartCol = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        int actualDelegate_nameStartCol = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        assertEquals(filteringParserDelegateDelegate_nameStartCol, actualDelegate_nameStartCol);
        
        IOContext actualDelegate_ioContext = ((IOContext) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext"));
        assertNull(actualDelegate_ioContext);
        
        boolean actualDelegate_closed = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_closed"));
        assertFalse(actualDelegate_closed);
        
        int filteringParserDelegateDelegate_inputPtr = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr"));
        int actualDelegate_inputPtr = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr"));
        assertEquals(filteringParserDelegateDelegate_inputPtr, actualDelegate_inputPtr);
        
        int filteringParserDelegateDelegate_inputEnd = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd"));
        int actualDelegate_inputEnd = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd"));
        assertEquals(filteringParserDelegateDelegate_inputEnd, actualDelegate_inputEnd);
        
        long filteringParserDelegateDelegate_currInputProcessed = ((Long) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed"));
        long actualDelegate_currInputProcessed = ((Long) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed"));
        assertEquals(filteringParserDelegateDelegate_currInputProcessed, actualDelegate_currInputProcessed);
        
        int filteringParserDelegateDelegate_currInputRow = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRow"));
        int actualDelegate_currInputRow = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRow"));
        assertEquals(filteringParserDelegateDelegate_currInputRow, actualDelegate_currInputRow);
        
        int filteringParserDelegateDelegate_currInputRowStart = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart"));
        int actualDelegate_currInputRowStart = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart"));
        assertEquals(filteringParserDelegateDelegate_currInputRowStart, actualDelegate_currInputRowStart);
        
        long filteringParserDelegateDelegate_tokenInputTotal = ((Long) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal"));
        long actualDelegate_tokenInputTotal = ((Long) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal"));
        assertEquals(filteringParserDelegateDelegate_tokenInputTotal, actualDelegate_tokenInputTotal);
        
        int filteringParserDelegateDelegate_tokenInputRow = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputRow"));
        int actualDelegate_tokenInputRow = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputRow"));
        assertEquals(filteringParserDelegateDelegate_tokenInputRow, actualDelegate_tokenInputRow);
        
        int filteringParserDelegateDelegate_tokenInputCol = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol"));
        int actualDelegate_tokenInputCol = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol"));
        assertEquals(filteringParserDelegateDelegate_tokenInputCol, actualDelegate_tokenInputCol);
        
        JsonReadContext actualDelegate_parsingContext = ((JsonReadContext) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        assertNull(actualDelegate_parsingContext);
        
        JsonToken actualDelegate_nextToken = ((JsonToken) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        assertNull(actualDelegate_nextToken);
        
        TextBuffer actualDelegate_textBuffer = ((TextBuffer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer"));
        assertNull(actualDelegate_textBuffer);
        
        char[] actualDelegate_nameCopyBuffer = ((char[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopyBuffer"));
        assertNull(actualDelegate_nameCopyBuffer);
        
        boolean actualDelegate_nameCopied = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopied"));
        assertFalse(actualDelegate_nameCopied);
        
        ByteArrayBuilder actualDelegate_byteArrayBuilder = ((ByteArrayBuilder) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder"));
        assertNull(actualDelegate_byteArrayBuilder);
        
        byte[] actualDelegate_binaryValue = ((byte[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        assertNull(actualDelegate_binaryValue);
        
        int filteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        int actualDelegate_numTypesValid = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        assertEquals(filteringParserDelegateDelegate_numTypesValid, actualDelegate_numTypesValid);
        
        int filteringParserDelegateDelegate_numberInt = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        int actualDelegate_numberInt = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        assertEquals(filteringParserDelegateDelegate_numberInt, actualDelegate_numberInt);
        
        long filteringParserDelegateDelegate_numberLong = ((Long) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        long actualDelegate_numberLong = ((Long) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        assertEquals(filteringParserDelegateDelegate_numberLong, actualDelegate_numberLong);
        
        double filteringParserDelegateDelegate_numberDouble = ((Double) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        double actualDelegate_numberDouble = ((Double) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        org.junit.Assert.assertEquals(filteringParserDelegateDelegate_numberDouble, actualDelegate_numberDouble, 1.0E-6);
        
        BigInteger actualDelegate_numberBigInt = ((BigInteger) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt"));
        assertNull(actualDelegate_numberBigInt);
        
        BigDecimal actualDelegate_numberBigDecimal = ((BigDecimal) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal"));
        assertNull(actualDelegate_numberBigDecimal);
        
        boolean actualDelegate_numberNegative = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative"));
        assertFalse(actualDelegate_numberNegative);
        
        int filteringParserDelegateDelegate_intLength = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        int actualDelegate_intLength = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        assertEquals(filteringParserDelegateDelegate_intLength, actualDelegate_intLength);
        
        int filteringParserDelegateDelegate_fractLength = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        int actualDelegate_fractLength = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        assertEquals(filteringParserDelegateDelegate_fractLength, actualDelegate_fractLength);
        
        int filteringParserDelegateDelegate_expLength = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        int actualDelegate_expLength = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        assertEquals(filteringParserDelegateDelegate_expLength, actualDelegate_expLength);
        
        JsonToken actualDelegate_currToken = ((JsonToken) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actualDelegate_currToken);
        
        JsonToken actualDelegate_lastClearedToken = ((JsonToken) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actualDelegate_lastClearedToken);
        
        int filteringParserDelegateDelegate_features = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actualDelegate_features = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(filteringParserDelegateDelegate_features, actualDelegate_features);
        
        assertTrue(deepEquals(filteringParserDelegate, actual));
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        JsonParser filteringParserDelegateDelegate1 = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegate_currToken);
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    
    @Test
    public void testSkipChildren2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        FilteringParserDelegate actual = ((FilteringParserDelegate) filteringParserDelegate.skipChildren());
        
        TokenFilter actualRootFilter = actual.rootFilter;
        assertNull(actualRootFilter);
        
        boolean actual_allowMultipleMatches = actual._allowMultipleMatches;
        assertFalse(actual_allowMultipleMatches);
        
        boolean actual_includePath = actual._includePath;
        assertFalse(actual_includePath);
        
        boolean actual_includeImmediateParent = actual._includeImmediateParent;
        assertFalse(actual_includeImmediateParent);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        TokenFilterContext actual_headContext = actual._headContext;
        assertNull(actual_headContext);
        
        TokenFilterContext actual_exposedContext = actual._exposedContext;
        assertNull(actual_exposedContext);
        
        TokenFilter actual_itemFilter = actual._itemFilter;
        assertNull(actual_itemFilter);
        
        int filteringParserDelegate_matchCount = filteringParserDelegate._matchCount;
        int actual_matchCount = actual._matchCount;
        assertEquals(filteringParserDelegate_matchCount, actual_matchCount);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser actualDelegate = ((JsonParser) getFieldValue(actual, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        Reader actualDelegate_reader = ((Reader) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader"));
        assertNull(actualDelegate_reader);
        
        char[] actualDelegate_inputBuffer = ((char[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer"));
        assertNull(actualDelegate_inputBuffer);
        
        boolean actualDelegate_bufferRecyclable = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_bufferRecyclable"));
        assertFalse(actualDelegate_bufferRecyclable);
        
        ObjectCodec actualDelegate_objectCodec = ((ObjectCodec) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_objectCodec"));
        assertNull(actualDelegate_objectCodec);
        
        CharsToNameCanonicalizer actualDelegate_symbols = ((CharsToNameCanonicalizer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_symbols"));
        assertNull(actualDelegate_symbols);
        
        int filteringParserDelegateDelegate_hashSeed = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        int actualDelegate_hashSeed = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hashSeed"));
        assertEquals(filteringParserDelegateDelegate_hashSeed, actualDelegate_hashSeed);
        
        boolean actualDelegate_tokenIncomplete = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete"));
        assertFalse(actualDelegate_tokenIncomplete);
        
        long filteringParserDelegateDelegate_nameStartOffset = ((Long) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        long actualDelegate_nameStartOffset = ((Long) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset"));
        assertEquals(filteringParserDelegateDelegate_nameStartOffset, actualDelegate_nameStartOffset);
        
        int filteringParserDelegateDelegate_nameStartRow = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        int actualDelegate_nameStartRow = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartRow"));
        assertEquals(filteringParserDelegateDelegate_nameStartRow, actualDelegate_nameStartRow);
        
        int filteringParserDelegateDelegate_nameStartCol = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        int actualDelegate_nameStartCol = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartCol"));
        assertEquals(filteringParserDelegateDelegate_nameStartCol, actualDelegate_nameStartCol);
        
        IOContext actualDelegate_ioContext = ((IOContext) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext"));
        assertNull(actualDelegate_ioContext);
        
        boolean actualDelegate_closed = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_closed"));
        assertFalse(actualDelegate_closed);
        
        int filteringParserDelegateDelegate_inputPtr = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr"));
        int actualDelegate_inputPtr = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr"));
        assertEquals(filteringParserDelegateDelegate_inputPtr, actualDelegate_inputPtr);
        
        int filteringParserDelegateDelegate_inputEnd = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd"));
        int actualDelegate_inputEnd = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd"));
        assertEquals(filteringParserDelegateDelegate_inputEnd, actualDelegate_inputEnd);
        
        long filteringParserDelegateDelegate_currInputProcessed = ((Long) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed"));
        long actualDelegate_currInputProcessed = ((Long) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed"));
        assertEquals(filteringParserDelegateDelegate_currInputProcessed, actualDelegate_currInputProcessed);
        
        int filteringParserDelegateDelegate_currInputRow = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRow"));
        int actualDelegate_currInputRow = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRow"));
        assertEquals(filteringParserDelegateDelegate_currInputRow, actualDelegate_currInputRow);
        
        int filteringParserDelegateDelegate_currInputRowStart = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart"));
        int actualDelegate_currInputRowStart = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart"));
        assertEquals(filteringParserDelegateDelegate_currInputRowStart, actualDelegate_currInputRowStart);
        
        long filteringParserDelegateDelegate_tokenInputTotal = ((Long) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal"));
        long actualDelegate_tokenInputTotal = ((Long) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal"));
        assertEquals(filteringParserDelegateDelegate_tokenInputTotal, actualDelegate_tokenInputTotal);
        
        int filteringParserDelegateDelegate_tokenInputRow = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputRow"));
        int actualDelegate_tokenInputRow = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputRow"));
        assertEquals(filteringParserDelegateDelegate_tokenInputRow, actualDelegate_tokenInputRow);
        
        int filteringParserDelegateDelegate_tokenInputCol = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol"));
        int actualDelegate_tokenInputCol = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol"));
        assertEquals(filteringParserDelegateDelegate_tokenInputCol, actualDelegate_tokenInputCol);
        
        JsonReadContext actualDelegate_parsingContext = ((JsonReadContext) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext"));
        assertNull(actualDelegate_parsingContext);
        
        JsonToken actualDelegate_nextToken = ((JsonToken) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        assertNull(actualDelegate_nextToken);
        
        TextBuffer actualDelegate_textBuffer = ((TextBuffer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer"));
        assertNull(actualDelegate_textBuffer);
        
        char[] actualDelegate_nameCopyBuffer = ((char[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopyBuffer"));
        assertNull(actualDelegate_nameCopyBuffer);
        
        boolean actualDelegate_nameCopied = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_nameCopied"));
        assertFalse(actualDelegate_nameCopied);
        
        ByteArrayBuilder actualDelegate_byteArrayBuilder = ((ByteArrayBuilder) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder"));
        assertNull(actualDelegate_byteArrayBuilder);
        
        byte[] actualDelegate_binaryValue = ((byte[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        assertNull(actualDelegate_binaryValue);
        
        int filteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        int actualDelegate_numTypesValid = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        assertEquals(filteringParserDelegateDelegate_numTypesValid, actualDelegate_numTypesValid);
        
        int filteringParserDelegateDelegate_numberInt = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        int actualDelegate_numberInt = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt"));
        assertEquals(filteringParserDelegateDelegate_numberInt, actualDelegate_numberInt);
        
        long filteringParserDelegateDelegate_numberLong = ((Long) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        long actualDelegate_numberLong = ((Long) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong"));
        assertEquals(filteringParserDelegateDelegate_numberLong, actualDelegate_numberLong);
        
        double filteringParserDelegateDelegate_numberDouble = ((Double) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        double actualDelegate_numberDouble = ((Double) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        org.junit.Assert.assertEquals(filteringParserDelegateDelegate_numberDouble, actualDelegate_numberDouble, 1.0E-6);
        
        BigInteger actualDelegate_numberBigInt = ((BigInteger) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt"));
        assertNull(actualDelegate_numberBigInt);
        
        BigDecimal actualDelegate_numberBigDecimal = ((BigDecimal) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal"));
        assertNull(actualDelegate_numberBigDecimal);
        
        boolean actualDelegate_numberNegative = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative"));
        assertFalse(actualDelegate_numberNegative);
        
        int filteringParserDelegateDelegate_intLength = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        int actualDelegate_intLength = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength"));
        assertEquals(filteringParserDelegateDelegate_intLength, actualDelegate_intLength);
        
        int filteringParserDelegateDelegate_fractLength = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        int actualDelegate_fractLength = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_fractLength"));
        assertEquals(filteringParserDelegateDelegate_fractLength, actualDelegate_fractLength);
        
        int filteringParserDelegateDelegate_expLength = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        int actualDelegate_expLength = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_expLength"));
        assertEquals(filteringParserDelegateDelegate_expLength, actualDelegate_expLength);
        
        JsonToken actualDelegate_currToken = ((JsonToken) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actualDelegate_currToken);
        
        JsonToken actualDelegate_lastClearedToken = ((JsonToken) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actualDelegate_lastClearedToken);
        
        int filteringParserDelegateDelegate_features = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actualDelegate_features = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(filteringParserDelegateDelegate_features, actualDelegate_features);
        
        assertTrue(deepEquals(filteringParserDelegate, actual));
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        JsonParser filteringParserDelegateDelegate1 = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegate_currToken);
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipChildren()
    
    @Test
    public void testSkipChildren3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2010)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:244)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent._startHandled = true;
        _parent._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:395)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:373)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2427)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\"', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '?', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ']', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:732)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:730)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '#', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', ' ', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:623)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:485)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2029)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2427)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '\r', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:623)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t', '\t'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '/', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:450)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:2346)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2321)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2272)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren34() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\n', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\"', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren36() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0001', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:472)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2283)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren37() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '!', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren38() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '?', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren39() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren40() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ']', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren41() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[37] = '\r';
        _inputBuffer[38] = '\n';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren42() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren43() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren44() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren45() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:730)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren46() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:732)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren47() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren48() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren49() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren50() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        String _currentName = "";
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        Object _currentValue = createInstance("java.lang.Object");
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren51() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:781) */
        filteringParserDelegate.skipChildren();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextCharacters()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextCharacters()}
 * @utbot.returnsFrom {@code return delegate.getTextCharacters();}
 *  */
    @Test
    public void testGetTextCharacters_ReturnDelegateGetTextCharacters() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        char[] actual = filteringParserDelegate.getTextCharacters();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextCharacters()}
 * @utbot.returnsFrom {@code return delegate.getTextCharacters();}
 *  */
    @Test
    public void testGetTextCharacters_ReturnDelegateGetTextCharacters_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        char[] actual = filteringParserDelegate.getTextCharacters();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTextCharacters()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextCharacters()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public char[] getTextCharacters() throws IOException {
 *     return delegate.getTextCharacters();
 * }
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextCharacters(FilteringParserDelegate.java:803) */
        filteringParserDelegate.getTextCharacters();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTextCharacters()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTextCharacters1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getTextCharacters();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_filterContext()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonStreamContext#getCurrentName()}
 * @utbot.returnsFrom {@code return ctxt.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName__currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        
        String actual = filteringParserDelegate.getCurrentName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getCurrentName()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_filterContext()} once,
    ///     {@link com.fasterxml.jackson.core.JsonStreamContext#getParent()} once
    /// return from: {@code return (parent == null) ? null : parent.getCurrentName();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code ((parent == null)): True}
 * @utbot.returnsFrom {@code return (parent == null) ? null : parent.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName__currTokenEqualsJsonTokenSTART_OBJECT() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        
        String actual = filteringParserDelegate.getCurrentName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.executesCondition {@code ((parent == null)): True}
 * @utbot.returnsFrom {@code return (parent == null) ? null : parent.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName_ParentEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        
        String actual = filteringParserDelegate.getCurrentName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.executesCondition {@code ((parent == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonStreamContext#getCurrentName()}
 * @utbot.returnsFrom {@code return (parent == null) ? null : parent.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName_ParentNotEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        
        String actual = filteringParserDelegate.getCurrentName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonStreamContext parent = ctxt.getParent();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:183) */
        filteringParserDelegate.getCurrentName();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonStreamContext parent = ctxt.getParent();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:183) */
        filteringParserDelegate.getCurrentName();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonStreamContext#getCurrentName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.getCurrentName();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186) */
        filteringParserDelegate.getCurrentName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextOffset()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextOffset()}
 * @utbot.returnsFrom {@code return delegate.getTextOffset();}
 *  */
    @Test
    public void testGetTextOffset_ReturnDelegateGetTextOffset() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextOffset();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextOffset()}
 * @utbot.returnsFrom {@code return delegate.getTextOffset();}
 *  */
    @Test
    public void testGetTextOffset_ReturnDelegateGetTextOffset_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextOffset();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextOffset()}
 * @utbot.returnsFrom {@code return delegate.getTextOffset();}
 *  */
    @Test
    public void testGetTextOffset_ReturnDelegateGetTextOffset_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextOffset();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTextOffset()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextOffset()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTextOffset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public int getTextOffset() throws IOException {
 *     return delegate.getTextOffset();
 * }
 *  */
    @Test
    public void testGetTextOffset_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextOffset] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextOffset(FilteringParserDelegate.java:805) */
        filteringParserDelegate.getTextOffset();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTextOffset()
    
    @Test
    public void testGetTextOffset1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextOffset();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetTextOffset2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextOffset();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTextOffset()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTextOffset3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getTextOffset();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentTokenId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentTokenId()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentTokenId()}
 * @utbot.executesCondition {@code ((t == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.returnsFrom {@code return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();}
 *  */
    @Test
    public void testGetCurrentTokenId_TNotEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        
        int actual = filteringParserDelegate.getCurrentTokenId();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentTokenId()}
 * @utbot.executesCondition {@code ((t == null)): True}
 * @utbot.returnsFrom {@code return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();}
 *  */
    @Test
    public void testGetCurrentTokenId_TEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        int actual = filteringParserDelegate.getCurrentTokenId();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentToken()}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testGetCurrentToken_Return_currToken() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        JsonToken actual = filteringParserDelegate.getCurrentToken();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTokenId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasTokenId(int)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasTokenId(int)}
 * @utbot.executesCondition {@code (t == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.returnsFrom {@code return t.id() == id;}
 *  */
    @Test
    public void testHasTokenId_TIdNotEqualsId() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        
        boolean actual = filteringParserDelegate.hasTokenId(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasTokenId(int)}
 * @utbot.executesCondition {@code (t == null): True}
 * @utbot.returnsFrom {@code return (JsonTokenId.ID_NO_TOKEN == id);}
 *  */
    @Test
    public void testHasTokenId_JsonTokenIdID_NO_TOKENNotEqualsId() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        boolean actual = filteringParserDelegate.hasTokenId(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasTokenId(int)}
 * @utbot.executesCondition {@code (t == null): True}
 * @utbot.returnsFrom {@code return (JsonTokenId.ID_NO_TOKEN == id);}
 *  */
    @Test
    public void testHasTokenId_JsonTokenIdID_NO_TOKENEqualsId() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        boolean actual = filteringParserDelegate.hasTokenId(0);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextValue()}
 * @utbot.executesCondition {@code (t == JsonToken.FIELD_NAME): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextValue_TNotEqualsJsonTokenFIELD_NAME() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        boolean finalFilteringParserDelegate_exposedContext_startHandled = filteringParserDelegate._exposedContext._startHandled;
        
        assertTrue(finalFilteringParserDelegate_exposedContext_startHandled);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextValue()
    
    @Test
    public void testNextValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[40];
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
        _inputBuffer[37] = '}';
        _inputBuffer[38] = '}';
        _inputBuffer[39] = '}';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 49);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 51);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 49 out of bounds for length 40]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[40];
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
        _inputBuffer[37] = '}';
        _inputBuffer[38] = '}';
        _inputBuffer[39] = '}';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 49);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 51);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 49 out of bounds for length 40]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2010)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:110)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:110)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:244)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'}', '\r', '}', '}', '}', '}'};
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:623)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\t', '\t', '\t', '\t', '\t', '\t'};
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = ' ';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\n';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '#';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\r';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '/';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:450)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:2346)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2321)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2272)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\\';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 5);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:498)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2455)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\\';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2427)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\u001D';
        _inputBuffer[1] = '\u001D';
        _inputBuffer[2] = '\u001D';
        _inputBuffer[3] = '\u001D';
        _inputBuffer[4] = '\u001D';
        _inputBuffer[5] = '\u001D';
        _inputBuffer[6] = '\u001D';
        _inputBuffer[7] = '\u001D';
        _inputBuffer[8] = '\u001D';
        _inputBuffer[9] = '\u001D';
        _inputBuffer[10] = '\u001D';
        _inputBuffer[11] = '\u001D';
        _inputBuffer[12] = '\u001D';
        _inputBuffer[13] = '\u001D';
        _inputBuffer[14] = '\u001D';
        _inputBuffer[15] = '\u001D';
        _inputBuffer[16] = '\u001D';
        _inputBuffer[17] = '\u001D';
        _inputBuffer[18] = '\u001D';
        _inputBuffer[19] = '\u001D';
        _inputBuffer[20] = '\u001D';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:485)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2029)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\"';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = ' ';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:757) */
        filteringParserDelegate.nextValue();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method nextValue()
    
    @Test(timeout = 1000L)
    public void testNextValue30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        filteringParserDelegate.nextValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentLocation()}
 * @utbot.returnsFrom {@code return delegate.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_ReturnDelegateGetCurrentLocation() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -4);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", -9223372036854775807L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", -2);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 9223372036854775805L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentLocation()}
 * @utbot.returnsFrom {@code return delegate.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_ReturnDelegateGetCurrentLocation_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -4);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", -9223372036854775807L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", -2);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, 9223372036854775805L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentLocation()}
 * @utbot.returnsFrom {@code return delegate.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_ReturnDelegateGetCurrentLocation_5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -4);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", -9223372036854775807L);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", 2147483645);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 9223372036854775805L, 0, Integer.MIN_VALUE);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentLocation()}
 * @utbot.returnsFrom {@code return delegate.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_ReturnDelegateGetCurrentLocation_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -4);
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", -9223372036854775807L);
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", -2);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 9223372036854775805L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentLocation()}
 * @utbot.returnsFrom {@code return delegate.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_ReturnDelegateGetCurrentLocation_4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate6 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        byte[] _sourceRef = {};
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
        setField(delegate6, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate6, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -4);
        setField(delegate6, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", -9223372036854775807L);
        setField(delegate6, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", -2);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(_sourceRef, -1L, 9223372036854775805L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentLocation()}
 * @utbot.returnsFrom {@code return delegate.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_ReturnDelegateGetCurrentLocation_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate10 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate10, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate10, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 2130422780);
        setField(delegate10, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 1L);
        setField(delegate10, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", -17060867);
        setField(delegate9, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate10);
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate9);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, 2130422781L, -1L, 0, Integer.MIN_VALUE);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getCurrentLocation()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentLocation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public JsonLocation getCurrentLocation() {
 *     return delegate.getCurrentLocation();
 * }
 *  */
    @Test
    public void testGetCurrentLocation_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171) */
        filteringParserDelegate.getCurrentLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTokenLocation()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTokenLocation()}
 * @utbot.returnsFrom {@code return delegate.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_ReturnDelegateGetTokenLocation_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", java.lang.Long.MIN_VALUE);
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        int[] _sourceRef = {};
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(_sourceRef, -1L, java.lang.Long.MAX_VALUE, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTokenLocation()}
 * @utbot.returnsFrom {@code return delegate.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_ReturnDelegateGetTokenLocation() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", java.lang.Long.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, java.lang.Long.MAX_VALUE, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTokenLocation()}
 * @utbot.returnsFrom {@code return delegate.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_ReturnDelegateGetTokenLocation_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", java.lang.Long.MIN_VALUE);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, java.lang.Long.MAX_VALUE, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTokenLocation()}
 * @utbot.returnsFrom {@code return delegate.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_ReturnDelegateGetTokenLocation_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", java.lang.Long.MIN_VALUE);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, java.lang.Long.MAX_VALUE, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTokenLocation()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTokenLocation()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTokenLocation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public JsonLocation getTokenLocation() {
 *     return delegate.getTokenLocation();
 * }
 *  */
    @Test
    public void testGetTokenLocation_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:872) */
        filteringParserDelegate.getTokenLocation();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTokenLocation()
    
    @Test
    public void testGetTokenLocation1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate8 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate8, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate8, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate8, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate8, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTokenLocation2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate8 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate8, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate8, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTokenLocation()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTokenLocation3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getTokenLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException {
 *     return delegate.readBinaryValue(b64variant, out);
 * }
 *  */
    @Test
    public void testReadBinaryValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:871) */
        filteringParserDelegate.readBinaryValue(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    @Test
    public void testReadBinaryValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        byte[] _binaryValue = new byte[13];
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[32];
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "buf", buf);
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "count", -2147483628);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483628 out of bounds for byte[32]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:129)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.readBinaryValue(ReaderBasedJsonParser.java:437)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:208)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:871) */
        filteringParserDelegate.readBinaryValue(base64Variant, bufferedOutputStream);
    }
    
    @Test
    public void testReadBinaryValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder", _byteArrayBuilder);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        OutputStream anonymousOutputStream = ((OutputStream) createInstance("java.io.OutputStream$1"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.ByteArrayBuilder.reset(ByteArrayBuilder.java:59)
            com.fasterxml.jackson.core.base.ParserBase._getByteArrayBuilder(ParserBase.java:583)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeBase64(ReaderBasedJsonParser.java:2573)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:412)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.readBinaryValue(ReaderBasedJsonParser.java:436)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:208)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:871) */
        filteringParserDelegate.readBinaryValue(base64Variant, anonymousOutputStream);
    }
    
    @Test
    public void testReadBinaryValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:405)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.readBinaryValue(ReaderBasedJsonParser.java:436)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:208)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:871) */
        filteringParserDelegate.readBinaryValue(base64Variant, null);
    }
    
    @Test
    public void testReadBinaryValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:454)
            com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed(ParserBase.java:507)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeBase64(ReaderBasedJsonParser.java:2581)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:412)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.readBinaryValue(ReaderBasedJsonParser.java:436)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:208)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:871) */
        filteringParserDelegate.readBinaryValue(base64Variant, objectOutputStream);
    }
    
    @Test
    public void testReadBinaryValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        byte[] _binaryValue = new byte[32];
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "buf", buf);
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "count", 1);
        DerOutputStream out = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(bufferedOutputStream, "java.io.FilterOutputStream", "out", out);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            java.base/java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:81)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:122)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.readBinaryValue(ReaderBasedJsonParser.java:437)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:208)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:871) */
        filteringParserDelegate.readBinaryValue(null, bufferedOutputStream);
    }
    
    @Test
    public void testReadBinaryValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        byte[] _binaryValue = new byte[32];
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "buf", buf);
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "count", 1);
        DerOutputStream out = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        setField(bufferedOutputStream, "java.io.FilterOutputStream", "out", out);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            java.base/java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:81)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:122)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.readBinaryValue(ReaderBasedJsonParser.java:437)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:208)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:871) */
        filteringParserDelegate.readBinaryValue(null, bufferedOutputStream);
    }
    
    @Test
    public void testReadBinaryValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        FilterOutputStream filterOutputStream = new FilterOutputStream(null);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:405)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.readBinaryValue(ReaderBasedJsonParser.java:436)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:208)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:871) */
        filteringParserDelegate.readBinaryValue(null, filterOutputStream);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getShortValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getShortValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getShortValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetShortValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getShortValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsBoolean(boolean)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsBoolean(boolean)}
 * @utbot.returnsFrom {@code return delegate.getValueAsBoolean(defaultValue);}
 *  */
    @Test
    public void testGetValueAsBoolean_ReturnDelegateGetValueAsBoolean() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsBoolean(boolean)}
 * @utbot.returnsFrom {@code return delegate.getValueAsBoolean(defaultValue);}
 *  */
    @Test
    public void testGetValueAsBoolean_ReturnDelegateGetValueAsBoolean_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.getValueAsBoolean(false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsBoolean(boolean)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsBoolean(boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsBoolean(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public boolean getValueAsBoolean(boolean defaultValue) throws IOException {
 *     return delegate.getValueAsBoolean(defaultValue);
 * }
 *  */
    @Test
    public void testGetValueAsBoolean_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean(FilteringParserDelegate.java:859) */
        filteringParserDelegate.getValueAsBoolean(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsBoolean()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsBoolean()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsBoolean()}
 * @utbot.returnsFrom {@code return delegate.getValueAsBoolean();}
 *  */
    @Test
    public void testGetValueAsBoolean_JsonParserGetValueAsBoolean() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.getValueAsBoolean();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsBoolean()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsBoolean()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsBoolean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public boolean getValueAsBoolean() throws IOException {
 *     return delegate.getValueAsBoolean();
 * }
 *  */
    @Test
    public void testGetValueAsBoolean_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean(FilteringParserDelegate.java:858) */
        filteringParserDelegate.getValueAsBoolean();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsDouble()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsDouble()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public double getValueAsDouble() throws IOException {
 *     return delegate.getValueAsDouble();
 * }
 *  */
    @Test
    public void testGetValueAsDouble_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble(FilteringParserDelegate.java:856) */
        filteringParserDelegate.getValueAsDouble();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsDouble(double)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsDouble(double)}
 * @utbot.returnsFrom {@code return delegate.getValueAsDouble(defaultValue);}
 *  */
    @Test
    public void testGetValueAsDouble_ReturnDelegateGetValueAsDouble() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        double actual = filteringParserDelegate.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsDouble(double)}
 * @utbot.returnsFrom {@code return delegate.getValueAsDouble(defaultValue);}
 *  */
    @Test
    public void testGetValueAsDouble_ReturnDelegateGetValueAsDouble_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        double actual = filteringParserDelegate.getValueAsDouble(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsDouble(double)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsDouble(double)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsDouble(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public double getValueAsDouble(double defaultValue) throws IOException {
 *     return delegate.getValueAsDouble(defaultValue);
 * }
 *  */
    @Test
    public void testGetValueAsDouble_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble(FilteringParserDelegate.java:857) */
        filteringParserDelegate.getValueAsDouble(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDoubleValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getDoubleValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getDoubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetDoubleValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:829) */
        filteringParserDelegate.getDoubleValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumberType()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getNumberType()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getNumberType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetNumberType_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:841) */
        filteringParserDelegate.getNumberType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumberValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getNumberValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getNumberValue()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetNumberValue_JsonParserGetNumberValue() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Number actual = filteringParserDelegate.getNumberValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumberValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getNumberValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getNumberValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetNumberValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getNumberValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFloatValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getFloatValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getFloatValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetFloatValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:832) */
        filteringParserDelegate.getFloatValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIntValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getIntValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getIntValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetIntValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:835) */
        filteringParserDelegate.getIntValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBigIntegerValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getBigIntegerValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getBigIntegerValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetBigIntegerValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:814) */
        filteringParserDelegate.getBigIntegerValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDecimalValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getDecimalValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getDecimalValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetDecimalValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:826) */
        filteringParserDelegate.getDecimalValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBooleanValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBooleanValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getBooleanValue()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetBooleanValue_Return() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.getBooleanValue();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getBooleanValue()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetBooleanValue_Return_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.getBooleanValue();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBooleanValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getBooleanValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getBooleanValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetBooleanValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBooleanValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBooleanValue(FilteringParserDelegate.java:817) */
        filteringParserDelegate.getBooleanValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsLong(long)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsLong(long)}
 * @utbot.returnsFrom {@code return delegate.getValueAsLong(defaultValue);}
 *  */
    @Test
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getValueAsLong(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsLong(long)}
 * @utbot.returnsFrom {@code return delegate.getValueAsLong(defaultValue);}
 *  */
    @Test
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getValueAsLong(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsLong(long)}
 * @utbot.returnsFrom {@code return delegate.getValueAsLong(defaultValue);}
 *  */
    @Test
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getValueAsLong(-255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsLong(long)}
 * @utbot.returnsFrom {@code return delegate.getValueAsLong(defaultValue);}
 *  */
    @Test
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getValueAsLong(-255L);
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsLong(long)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsLong(long)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsLong(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public long getValueAsLong(long defaultValue) throws IOException {
 *     return delegate.getValueAsLong(defaultValue);
 * }
 *  */
    @Test
    public void testGetValueAsLong_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong(FilteringParserDelegate.java:855) */
        filteringParserDelegate.getValueAsLong(-255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsLong()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsLong()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsLong()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public long getValueAsLong() throws IOException {
 *     return delegate.getValueAsLong();
 * }
 *  */
    @Test
    public void testGetValueAsLong_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong(FilteringParserDelegate.java:854) */
        filteringParserDelegate.getValueAsLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasTextCharacters()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasTextCharacters()}
 * @utbot.returnsFrom {@code return delegate.hasTextCharacters();}
 *  */
    @Test
    public void testHasTextCharacters_ReturnDelegateHasTextCharacters() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.hasTextCharacters();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasTextCharacters()}
 * @utbot.returnsFrom {@code return delegate.hasTextCharacters();}
 *  */
    @Test
    public void testHasTextCharacters_ReturnDelegateHasTextCharacters_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.hasTextCharacters();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasTextCharacters()}
 * @utbot.returnsFrom {@code return delegate.hasTextCharacters();}
 *  */
    @Test
    public void testHasTextCharacters_ReturnDelegateHasTextCharacters_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.hasTextCharacters();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasTextCharacters()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasTextCharacters()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public boolean hasTextCharacters() {
 *     return delegate.hasTextCharacters();
 * }
 *  */
    @Test
    public void testHasTextCharacters_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters(FilteringParserDelegate.java:802) */
        filteringParserDelegate.hasTextCharacters();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getByteValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getByteValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getByteValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetByteValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getByteValue()
    
    @Test
    public void testGetByteValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2056);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        byte actual = filteringParserDelegate.getByteValue();
        
        assertEquals((byte) 0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(2057, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetByteValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        byte actual = filteringParserDelegate.getByteValue();
        
        assertEquals((byte) 0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetByteValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        byte actual = filteringParserDelegate.getByteValue();
        
        assertEquals((byte) -48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetByteValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        byte actual = filteringParserDelegate.getByteValue();
        
        assertEquals((byte) 48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getByteValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetByteValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getByteValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetByteValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getByteValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetByteValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 10);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:42)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:816)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:704)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:704)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:704)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:942)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:707)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 256L);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1053)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2056);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -4.294967296000001E9);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowInt(ParserBase.java:1077)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:950)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:707)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt", Integer.MIN_VALUE);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1053)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:847)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:704)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 34);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:44)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:525)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:921)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:840)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:704)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:896)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:704)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:704)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    
    @Test
    public void testGetByteValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:44)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:525)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:901)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:704)
            com.fasterxml.jackson.core.JsonParser.getByteValue(JsonParser.java:1048)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getByteValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:820) */
        filteringParserDelegate.getByteValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEmbeddedObject()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getEmbeddedObject()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getEmbeddedObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: /*
 *     /**********************************************************
 *     /* Public API, access to token values, other
 *     /**********************************************************
 *      */
 * @Override
 * public Object getEmbeddedObject() throws IOException {
 *     return delegate.getEmbeddedObject();
 * }
 *  */
    @Test
    public void testGetEmbeddedObject_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:869) */
        filteringParserDelegate.getEmbeddedObject();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getEmbeddedObject()
    
    @Test
    public void testGetEmbeddedObject1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate6 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = filteringParserDelegate.getEmbeddedObject();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getEmbeddedObject()
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate8 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getEmbeddedObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return delegate.getBinaryValue(b64variant);}
 *  */
    @Test
    public void testGetBinaryValue_ReturnDelegateGetBinaryValue() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        byte[] _binaryValue = {(byte) 0};
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        byte[] actual = filteringParserDelegate.getBinaryValue(null);
        
        assertArrayEquals(_binaryValue, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return delegate.getBinaryValue(b64variant);}
 *  */
    @Test
    public void testGetBinaryValue_ReturnDelegateGetBinaryValue_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        byte[] _binaryValue = {(byte) 0};
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        byte[] actual = filteringParserDelegate.getBinaryValue(null);
        
        assertArrayEquals(_binaryValue, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public byte[] getBinaryValue(Base64Variant b64variant) throws IOException {
 *     return delegate.getBinaryValue(b64variant);
 * }
 *  */
    @Test
    public void testGetBinaryValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test(expected = StackOverflowError.class)
    public void testGetBinaryValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:405)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:454)
            com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed(ParserBase.java:507)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeBase64(ReaderBasedJsonParser.java:2581)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:412)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:405)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:454)
            com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed(ParserBase.java:507)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeBase64(ReaderBasedJsonParser.java:2581)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:412)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder", _byteArrayBuilder);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:454)
            com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed(ParserBase.java:507)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeBase64(ReaderBasedJsonParser.java:2581)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:412)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder", _byteArrayBuilder);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeBase64(ReaderBasedJsonParser.java:2583)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:412)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder", _byteArrayBuilder);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:454)
            com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed(ParserBase.java:507)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeBase64(ReaderBasedJsonParser.java:2581)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:412)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder", _byteArrayBuilder);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:454)
            com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed(ParserBase.java:507)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeBase64(ReaderBasedJsonParser.java:2581)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:412)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder", _byteArrayBuilder);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:262)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getBinaryValue(ReaderBasedJsonParser.java:424)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:207)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsInt(int)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt(int)}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt(defaultValue);}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(-255);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt(int)}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt(defaultValue);}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(-255);
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt(int)}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt(defaultValue);}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(-255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsInt(int)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsInt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public int getValueAsInt(int defaultValue) throws IOException {
 *     return delegate.getValueAsInt(defaultValue);
 * }
 *  */
    @Test
    public void testGetValueAsInt_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsInt(int)
    
    @Test
    public void testGetValueAsInt1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 268435464);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(268435465, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4194312);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(4194313, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGetValueAsInt6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(-48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsInt(int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetValueAsInt9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:390)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:390)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:390)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:454)
            com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed(ParserBase.java:507)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._finishAndReturnString(UTF8StreamJsonParser.java:2407)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:318)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:284)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:320)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:284)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.68156158598852E154);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowInt(ParserBase.java:1077)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:950)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:954)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:942)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 268435464);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -8.589934592003906E9);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowInt(ParserBase.java:1077)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:950)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.68156158598852E154);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowInt(ParserBase.java:1077)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:950)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4194312);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -2.3158417847464555E77);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowInt(ParserBase.java:1077)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:950)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", -9223372034707292160L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:938)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:954)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:393)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:896)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:390)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 10);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:816)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:390)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 18);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:816)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:390)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:44)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:525)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:901)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:390)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:190)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getValueAsInt(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsInt()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt()}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt();}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt()}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt();}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt()}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt();}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt()}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt();}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsInt()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsInt()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: /*
 *     /**********************************************************
 *     /* Public API, access to token information, coercion/conversion
 *     /**********************************************************
 *      */
 * @Override
 * public int getValueAsInt() throws IOException {
 *     return delegate.getValueAsInt();
 * }
 *  */
    @Test
    public void testGetValueAsInt_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsInt()
    
    @Test
    public void testGetValueAsInt27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16392);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(16393, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4194312);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(4194313, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGetValueAsInt31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(-48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt34() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt36() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(-48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsInt()
    
    @Test(expected = StackOverflowError.class)
    public void testGetValueAsInt37() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt38() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:370)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt39() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:370)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt40() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:942)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:373)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt41() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.68156158598852E154);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowInt(ParserBase.java:1077)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:950)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:373)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt42() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4194312);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -1.4757395368918804E20);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowInt(ParserBase.java:1077)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:950)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:373)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt43() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:942)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:373)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt44() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16392);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -8.507059173023462E38);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.reportOverflowInt(ParserBase.java:1077)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:950)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:373)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt45() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:954)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:373)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt46() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:454)
            com.fasterxml.jackson.core.base.ParserBase.loadMoreGuaranteed(ParserBase.java:507)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._finishAndReturnString(UTF8StreamJsonParser.java:2407)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:318)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:284)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:378)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt47() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", -9223372034707292160L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._getText2(UTF8StreamJsonParser.java:414)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:322)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:938)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:373)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt48() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 2);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._finishAndReturnString(UTF8StreamJsonParser.java:2417)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getText(UTF8StreamJsonParser.java:318)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:284)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:378)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt49() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:896)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:370)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt50() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:865)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:370)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt51() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:44)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:525)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:901)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:370)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt52() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:44)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:525)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:901)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:874)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getValueAsInt(UTF8StreamJsonParser.java:370)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:852) */
        filteringParserDelegate.getValueAsInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsString()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.returnsFrom {@code return delegate.getValueAsString();}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.returnsFrom {@code return delegate.getValueAsString();}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.returnsFrom {@code return delegate.getValueAsString();}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.returnsFrom {@code return delegate.getValueAsString();}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.returnsFrom {@code return delegate.getValueAsString();}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        assertEquals(_resultString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.returnsFrom {@code return delegate.getValueAsString();}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.returnsFrom {@code return delegate.getValueAsString();}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsString()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public String getValueAsString() throws IOException {
 *     return delegate.getValueAsString();
 * }
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:860) */
        filteringParserDelegate.getValueAsString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsString()
    
    @Test
    public void testGetValueAsString1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        String expected = "true";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetValueAsString2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetValueAsString3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString();
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsString()
    
    @Test(expected = StackOverflowError.class)
    public void testGetValueAsString4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsString();
    }
    
    @Test
    public void testGetValueAsString5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1073741827);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.StringIndexOutOfBoundsException: offset 1073741827, count 1073741824, length 2]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:278)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:860) */
        filteringParserDelegate.getValueAsString();
    }
    
    @Test
    public void testGetValueAsString6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString2(ReaderBasedJsonParser.java:1959)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1946)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:276)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:860) */
        filteringParserDelegate.getValueAsString();
    }
    
    @Test
    public void testGetValueAsString7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:204)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1944)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:276)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:860) */
        filteringParserDelegate.getValueAsString();
    }
    
    @Test
    public void testGetValueAsString8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:278)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:860) */
        filteringParserDelegate.getValueAsString();
    }
    
    @Test
    public void testGetValueAsString9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
            com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:206)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1944)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:276)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:860) */
        filteringParserDelegate.getValueAsString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString(java.lang.String)}
 * @utbot.returnsFrom {@code return delegate.getValueAsString(defaultValue);}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString(java.lang.String)}
 * @utbot.returnsFrom {@code return delegate.getValueAsString(defaultValue);}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString(java.lang.String)}
 * @utbot.returnsFrom {@code return delegate.getValueAsString(defaultValue);}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString(java.lang.String)}
 * @utbot.returnsFrom {@code return delegate.getValueAsString(defaultValue);}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        assertEquals(_resultString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString(java.lang.String)}
 * @utbot.returnsFrom {@code return delegate.getValueAsString(defaultValue);}
 *  */
    @Test
    public void testGetValueAsString_ReturnDelegateGetValueAsString_41() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public String getValueAsString(String defaultValue) throws IOException {
 *     return delegate.getValueAsString(defaultValue);
 * }
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:861) */
        filteringParserDelegate.getValueAsString(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsString(java.lang.String)
    
    @Test
    public void testGetValueAsString10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        String expected = "true";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetValueAsString11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        String string = "";
        
        String actual = filteringParserDelegate.getValueAsString(string);
        
        assertEquals(string, actual);
    }
    
    @Test
    public void testGetValueAsString12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        String string = "";
        
        String actual = filteringParserDelegate.getValueAsString(string);
        
        assertEquals(_resultString, actual);
    }
    
    @Test
    public void testGetValueAsString13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetValueAsString14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        String string = "";
        
        String actual = filteringParserDelegate.getValueAsString(string);
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetValueAsString15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsString(java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testGetValueAsString16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        String string = "";
        
        filteringParserDelegate.getValueAsString(string);
    }
    
    @Test
    public void testGetValueAsString17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:294)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:198)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:861) */
        filteringParserDelegate.getValueAsString(null);
    }
    
    @Test
    public void testGetValueAsString18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:337)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:294)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:198)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:861) */
        filteringParserDelegate.getValueAsString(null);
    }
    
    @Test
    public void testGetValueAsString19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:204)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1944)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:292)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:198)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:861) */
        filteringParserDelegate.getValueAsString(null);
    }
    
    @Test
    public void testGetValueAsString20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:294)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:198)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:861) */
        filteringParserDelegate.getValueAsString(null);
    }
    
    @Test
    public void testGetValueAsString21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:448)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1944)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:292)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:198)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:861) */
        filteringParserDelegate.getValueAsString(string);
    }
    
    @Test
    public void testGetValueAsString22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:445)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1944)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getValueAsString(ReaderBasedJsonParser.java:292)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:198)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:861) */
        filteringParserDelegate.getValueAsString(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLongValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getLongValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getLongValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetLongValue_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLongValue()
    
    @Test
    public void testGetLongValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2056);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getLongValue();
        
        assertEquals(0L, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(2058, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetLongValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getLongValue();
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testGetLongValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483635);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getLongValue();
        
        assertEquals(-48L, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetLongValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getLongValue();
        
        assertEquals(-48L, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetLongValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getLongValue();
        
        assertEquals(-48L, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLongValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetLongValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue24() throws Exception  {
        Class textBufferClazz = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        char[] prevNO_CHARS = ((char[]) getStaticFieldValue(textBufferClazz, "NO_CHARS"));
        try {
            char[] noChars = {};
            setStaticField(textBufferClazz, "NO_CHARS", noChars);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
            setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
            JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
            setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
            setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
                com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:810)
                com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:718)
                com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
                com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
            filteringParserDelegate.getLongValue();
        } finally {
            setStaticField(TextBuffer.class, "NO_CHARS", prevNO_CHARS);
        }
    }
    
    @Test
    public void testGetLongValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:970)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:721)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToLong(ParserBase.java:982)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:721)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:847)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:718)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:896)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:718)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:3649)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:44)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:525)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:901)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:718)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:44)
            com.fasterxml.jackson.core.base.ParserMinimalBase._constructError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._wrapError(ParserMinimalBase.java:525)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:901)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:718)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2048);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:399)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:896)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:718)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    
    @Test
    public void testGetLongValue34() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:399)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:896)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:844)
            com.fasterxml.jackson.core.base.ParserBase.getLongValue(ParserBase.java:718)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getLongValue();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLongValue()
    
    @Test(expected = RuntimeException.class)
    public void testGetLongValue35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 32);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getLongValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _nextToken2()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextToken2()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void test_nextToken2_JsonParserNextToken() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = filteringParserDelegate._nextToken2();
        
        assertNull(actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _nextToken2()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextToken2()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void test_nextToken2_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _nextToken2()
    
    @Test
    public void test_nextToken21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:395)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:539) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '\r', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:623)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t', '\t'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\n', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:472)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2303)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[38] = '/';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:450)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:2346)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2321)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2292)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[38] = '#';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '#', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken210() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '/', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:450)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:2346)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2321)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2272)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken211() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0001', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:472)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2283)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken212() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken213() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken214() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[38] = '\\';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken215() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[38] = 'f';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken216() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken217() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2463)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken218() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\"', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken219() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken220() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken221() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken222() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:494) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken223() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:732)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken224() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken225() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:730)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken226() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '!', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken227() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2427)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken228() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '?', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken229() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:494) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken230() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:445) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken231() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:494) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken232() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:459) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken233() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        Object _currentValue = createInstance("java.lang.Object");
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:459) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken234() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:459) */
        filteringParserDelegate._nextToken2();
    }
    ///endregion
    
    ///region Errors report for _nextToken2
    
    public void test_nextToken2_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate._filterContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _filterContext()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_filterContext()}
 * @utbot.executesCondition {@code (_exposedContext != null): False}
 * @utbot.returnsFrom {@code return _headContext;}
 *  */
    @Test
    public void test_filterContext__exposedContextEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        JsonStreamContext actual = filteringParserDelegate._filterContext();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_filterContext()}
 * @utbot.executesCondition {@code (_exposedContext != null): True}
 * @utbot.returnsFrom {@code return _exposedContext;}
 *  */
    @Test
    public void test_filterContext__exposedContextNotEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        
        TokenFilterContext actual = ((TokenFilterContext) filteringParserDelegate._filterContext());
        
        TokenFilterContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        TokenFilterContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        TokenFilter actual_filter = actual._filter;
        assertNull(actual_filter);
        
        boolean actual_startHandled = actual._startHandled;
        assertFalse(actual_startHandled);
        
        boolean actual_needToHandleName = actual._needToHandleName;
        assertFalse(actual_needToHandleName);
        
        int _exposedContext_type = ((Integer) getFieldValue(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(_exposedContext_type, actual_type);
        
        int _exposedContext_index = ((Integer) getFieldValue(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(_exposedContext_index, actual_index);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getMatchCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMatchCount()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getMatchCount()}
 * @utbot.returnsFrom {@code return _matchCount;}
 *  */
    @Test
    public void testGetMatchCount_Return_matchCount() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._matchCount = -255;
        
        int actual = filteringParserDelegate.getMatchCount();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void test_nextBuffered_ReturnT_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        tokenFilterContext._startHandled = true;
        tokenFilterContext._needToHandleName = true;
        setField(tokenFilterContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        
        TokenFilterContext initialFilteringParserDelegate_exposedContext = filteringParserDelegate._exposedContext;
        
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = tokenFilterContext;
        JsonToken actual = ((JsonToken) _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments));
        
        JsonToken expected = JsonToken.FIELD_NAME;
        
        assertEquals(expected, actual);
        
        TokenFilterContext finalFilteringParserDelegate_exposedContext = filteringParserDelegate._exposedContext;
        
        boolean finalTokenFilterContext_needToHandleName = tokenFilterContext._needToHandleName;
        
        assertFalse(initialFilteringParserDelegate_exposedContext == finalFilteringParserDelegate_exposedContext);
        
        assertFalse(finalTokenFilterContext_needToHandleName);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.executesCondition {@code (ctxt == _headContext): False}
 * @utbot.executesCondition {@code (ctxt == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.filter.TokenFilterContext#findChildOf(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.filter.TokenFilterContext#nextTokenToRead()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void test_nextBuffered_CtxtNotEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", tokenFilterContext);
        setField(_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(tokenFilterContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        tokenFilterContext._startHandled = true;
        tokenFilterContext._needToHandleName = true;
        
        TokenFilterContext initialFilteringParserDelegate_exposedContext = filteringParserDelegate._exposedContext;
        
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = tokenFilterContext;
        JsonToken actual = ((JsonToken) _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments));
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        TokenFilterContext finalFilteringParserDelegate_exposedContext = filteringParserDelegate._exposedContext;
        
        boolean finalTokenFilterContext_parent_startHandled = tokenFilterContext._parent._startHandled;
        
        assertFalse(initialFilteringParserDelegate_exposedContext == finalFilteringParserDelegate_exposedContext);
        
        assertTrue(finalTokenFilterContext_parent_startHandled);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void test_nextBuffered_ReturnT_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        TokenFilterContext tokenFilterContext = new TokenFilterContext(2, null, null, false);
        
        TokenFilterContext initialFilteringParserDelegate_exposedContext = filteringParserDelegate._exposedContext;
        
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = tokenFilterContext;
        JsonToken actual = ((JsonToken) _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments));
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        TokenFilterContext finalFilteringParserDelegate_exposedContext = filteringParserDelegate._exposedContext;
        
        boolean finalTokenFilterContext_startHandled = tokenFilterContext._startHandled;
        
        assertFalse(initialFilteringParserDelegate_exposedContext == finalFilteringParserDelegate_exposedContext);
        
        assertTrue(finalTokenFilterContext_startHandled);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void test_nextBuffered_ReturnT() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext tokenFilterContext = new TokenFilterContext(-255, null, null, false);
        
        TokenFilterContext initialFilteringParserDelegate_exposedContext = filteringParserDelegate._exposedContext;
        
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = tokenFilterContext;
        JsonToken actual = ((JsonToken) _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments));
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
        
        TokenFilterContext finalFilteringParserDelegate_exposedContext = filteringParserDelegate._exposedContext;
        
        boolean finalTokenFilterContext_startHandled = tokenFilterContext._startHandled;
        
        assertFalse(initialFilteringParserDelegate_exposedContext == finalFilteringParserDelegate_exposedContext);
        
        assertTrue(finalTokenFilterContext_startHandled);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = ctxt.nextTokenToRead();
 *  */
    @Test
    public void test_nextBuffered_ThrowNullPointerException() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:728) */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = ((Object) null);
        try {
            _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.executesCondition {@code (ctxt == _headContext): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt == _headContext
 *  */
    @Test
    public void test_nextBuffered_ThrowNullPointerException_1() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:735) */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class _headContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", _headContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = _headContext;
        try {
            _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.executesCondition {@code (ctxt == _headContext): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt == _headContext
 *  */
    @Test
    public void test_nextBuffered_ThrowNullPointerException_4() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:735) */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class _headContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", _headContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = _headContext;
        try {
            _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.executesCondition {@code (ctxt == _headContext): False}
 * @utbot.executesCondition {@code (ctxt == null): False}
 * @utbot.executesCondition {@code (ctxt == _headContext): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.filter.TokenFilterContext#nextTokenToRead()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt == _headContext
 *  */
    @Test
    public void test_nextBuffered_ThrowNullPointerException_3() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        _parent._startHandled = true;
        _parent._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:735) */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class _parentType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", _parentType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = _parent;
        try {
            _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.executesCondition {@code (ctxt == _headContext): False}
 * @utbot.executesCondition {@code (ctxt == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_constructError(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt == null
 *  */
    @Test
    public void test_nextBuffered_ThrowNullPointerException_2() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(tokenFilterContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        tokenFilterContext._startHandled = true;
        tokenFilterContext._needToHandleName = true;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:745) */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = tokenFilterContext;
        try {
            _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    @Test
    public void test_nextBuffered1() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent1 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent1);
        setField(tokenFilterContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        tokenFilterContext._startHandled = true;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:745) */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = tokenFilterContext;
        try {
            _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method _nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    @Test(timeout = 1000L)
    public void test_nextBuffered2() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        setField(tokenFilterContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        tokenFilterContext._startHandled = true;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = tokenFilterContext;
        try {
            _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void test_nextBuffered3() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent1 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_parent1, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent1);
        setField(tokenFilterContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        tokenFilterContext._startHandled = true;
        tokenFilterContext._needToHandleName = true;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class tokenFilterContextType = Class.forName("com.fasterxml.jackson.core.filter.TokenFilterContext");
        Method _nextBufferedMethod = filteringParserDelegateClazz.getDeclaredMethod("_nextBuffered", tokenFilterContextType);
        _nextBufferedMethod.setAccessible(true);
        java.lang.Object[] _nextBufferedMethodArguments = new java.lang.Object[1];
        _nextBufferedMethodArguments[0] = tokenFilterContext;
        try {
            _nextBufferedMethod.invoke(filteringParserDelegate, _nextBufferedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void test_nextTokenWithBuffering_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    @Test
    public void test_nextTokenWithBuffering1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = filteringParserDelegate._nextTokenWithBuffering(null);
        
        assertNull(actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    @Test
    public void test_nextTokenWithBuffering2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[38] = '#';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[38] = '\r';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[38] = '/';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:450)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:2346)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2321)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2292)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:472)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2303)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\n', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        _inputBuffer[37] = '\r';
        _inputBuffer[38] = '\n';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0001', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:472)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2283)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '#', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:498)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2455)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2427)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\"', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '?', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:732)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:730)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '!', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t', '\t'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '\r', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:623)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:635) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:635) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:612) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:612) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        BufferedReader _reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:180)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2004)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:600) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:635) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:612) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        Object _currentValue = createInstance("java.lang.Object");
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:612) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    ///endregion
    
    ///region Errors report for _nextTokenWithBuffering
    
    public void test_nextTokenWithBuffering_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextToken_ReturnT() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        boolean finalFilteringParserDelegate_exposedContext_startHandled = filteringParserDelegate._exposedContext._startHandled;
        
        assertTrue(finalFilteringParserDelegate_exposedContext_startHandled);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextToken_ReturnT_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        boolean finalFilteringParserDelegate_exposedContext_startHandled = filteringParserDelegate._exposedContext._startHandled;
        
        assertTrue(finalFilteringParserDelegate_exposedContext_startHandled);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextToken_ReturnT_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.FIELD_NAME;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        boolean finalFilteringParserDelegate_exposedContext_needToHandleName = filteringParserDelegate._exposedContext._needToHandleName;
        
        assertFalse(finalFilteringParserDelegate_exposedContext_needToHandleName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt = _headContext.findChildOf(ctxt);
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t = delegate.getCurrentToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:244) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt = _headContext.findChildOf(ctxt);
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:263) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (ctxt != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt == null
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266) */
        filteringParserDelegate.nextToken();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextToken()
    
    @Test
    public void testNextToken1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent._startHandled = true;
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNextToken2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent._startHandled = true;
        _parent._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNextToken3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent1 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent1._startHandled = true;
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent1);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent1;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNextToken4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent1 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent2 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent2._startHandled = true;
        _parent2._needToHandleName = true;
        setField(_parent1, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent2);
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent1);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent2;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNextToken5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        assertNull(actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    
    @Test
    public void testNextToken6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        assertNull(actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextToken()
    
    @Test
    public void testNextToken7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[40];
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
        _inputBuffer[37] = '}';
        _inputBuffer[38] = '}';
        _inputBuffer[39] = '}';
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 49);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 51);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.ArrayIndexOutOfBoundsException: Index 49 out of bounds for length 40]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2010)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:244) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'}', ' ', '}', '}', '}', '}'};
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:623)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[29];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '\\';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 8);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 11);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:498)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2455)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\"';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\\';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2427)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2019)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '?';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[23];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = ' ';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 7);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:2005)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\n';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '/';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:450)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:2346)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2321)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2272)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '#';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2315)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2307)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '!';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:631)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[21];
        _inputBuffer[0] = '\u0001';
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
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getCurrentLocation(ReaderBasedJsonParser.java:2701)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:472)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2283)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:732)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:730)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:593)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:548)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2268)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        ReaderUTF8 _reader = ((ReaderUTF8) createInstance("jdk.internal.util.xml.impl.ReaderUTF8"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_nameStartOffset", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:180)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2264)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:272) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken34() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken36() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken37() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:289) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken38() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken39() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        java.util.HashSet[][] _currentValue = {null};
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:549)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:557)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2265)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:601)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:325) */
        filteringParserDelegate.nextToken();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method nextToken()
    
    @Test(timeout = 1000L)
    public void testNextToken40() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        filteringParserDelegate.nextToken();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFilter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFilter()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getFilter()}
 * @utbot.returnsFrom {@code return rootFilter;}
 *  */
    @Test
    public void testGetFilter_ReturnRootFilter() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        TokenFilter actual = filteringParserDelegate.getFilter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextLength()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTextLength()}
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 *  */
    @Test
    public void testGetTextLength_JsonParserGetTextLength() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTextLength()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public int getTextLength() throws IOException {
 *     return delegate.getTextLength();
 * }
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:804) */
        filteringParserDelegate.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTextLength()}
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.getTextLength();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextLength(ReaderBasedJsonParser.java:371)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:804) */
        filteringParserDelegate.getTextLength();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTextLength()
    
    @Test
    public void testGetTextLength1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTextLength()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTextLength2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getTextLength();
    }
    
    @Test
    public void testGetTextLength3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextLength(ReaderBasedJsonParser.java:371)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTextLength(JsonParserDelegate.java:141)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTextLength(JsonParserDelegate.java:141)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:804) */
        filteringParserDelegate.getTextLength();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getText()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getText()}
 * @utbot.returnsFrom {@code return delegate.getText();}
 *  */
    @Test
    public void testGetText_ReturnDelegateGetText() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getText()}
 * @utbot.returnsFrom {@code return delegate.getText();}
 *  */
    @Test
    public void testGetText_ReturnDelegateGetText_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        assertEquals(_resultString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getText()}
 * @utbot.returnsFrom {@code return delegate.getText();}
 *  */
    @Test
    public void testGetText_ReturnDelegateGetText_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getText()}
 * @utbot.returnsFrom {@code return delegate.getText();}
 *  */
    @Test
    public void testGetText_ReturnDelegateGetText_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getText()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getText()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: /*
 *     /**********************************************************
 *     /* Public API, access to token information, text
 *     /**********************************************************
 *      */
 * @Override
 * public String getText() throws IOException {
 *     return delegate.getText();
 * }
 *  */
    @Test
    public void testGetText_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:801) */
        filteringParserDelegate.getText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getText()
    
    @Test
    public void testGetText1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        String expected = "true";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetText2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetText3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getText()
    
    @Test(expected = StackOverflowError.class)
    public void testGetText4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:262)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:801) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:262)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:801) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:204)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1944)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:260)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:801) */
        filteringParserDelegate.getText();
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1025195901448400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1025195901448400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1025195901455500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025195901448400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025195901455500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1025195901726700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1025195901726700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1025195901727600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025195901726700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025195901727600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1025195905364800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1025195905364800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1025195905366800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025195905364800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025195905366800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1025195906052900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1025195906052900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1025195906054700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1025195906052900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1025195906054700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

