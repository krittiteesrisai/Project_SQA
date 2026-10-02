package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.JsonParser;
import java.io.ObjectInputStream;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import java.io.BufferedOutputStream;
import com.fasterxml.jackson.core.Base64Variant;
import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_core_filter_FilteringParserDelegateTest {
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate1, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176) */
        filteringParserDelegate.getCurrentLocation();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCurrentLocation()
    
    @Test
    public void testGetCurrentLocation1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate6 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetCurrentLocation2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate6 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate6, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate6, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCurrentLocation()
    
    @Test(expected = StackOverflowError.class)
    public void testGetCurrentLocation3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
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
    public void testGetTokenLocation_ReturnDelegateGetTokenLocation() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTokenLocation()}
 * @utbot.returnsFrom {@code return delegate.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_ReturnDelegateGetTokenLocation_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        byte[] _sourceRef = {};
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate1, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(_sourceRef, -1L, -1L, 0, -1);
        
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:894) */
        filteringParserDelegate.getTokenLocation();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTokenLocation()
    
    @Test
    public void testGetTokenLocation1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate8 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTokenLocation2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate6 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate6, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate6, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTokenLocation()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTokenLocation3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getTokenLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextValue()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextValue()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextValue_ReturnT() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        boolean finalFilteringParserDelegate_exposedContext_startHandled = filteringParserDelegate._exposedContext._startHandled;
        
        assertTrue(finalFilteringParserDelegate_exposedContext_startHandled);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextValue()}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testNextValue_ReturnT_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        assertNull(actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        assertNull(finalFilteringParserDelegate_currToken);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextValue()
    
    @Test
    public void testNextValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent._startHandled = true;
        _parent._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNextValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        boolean finalFilteringParserDelegate_exposedContext_startHandled = filteringParserDelegate._exposedContext._startHandled;
        
        assertFalse(initialFilteringParserDelegate_currToken == finalFilteringParserDelegate_currToken);
        
        assertTrue(finalFilteringParserDelegate_exposedContext_startHandled);
    }
    
    @Test
    public void testNextValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent._startHandled = true;
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNextValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent1 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent1._startHandled = true;
        _parent1._needToHandleName = true;
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent1);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent1;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNextValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent._startHandled = true;
        _parent._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        assertFalse(initialFilteringParserDelegate_currToken == finalFilteringParserDelegate_currToken);
    }
    
    @Test
    public void testNextValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent1 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _parent1._startHandled = true;
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent1);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _parent1;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
    }
    
    @Test
    public void testNextValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        assertNull(actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    
    @Test
    public void testNextValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        assertNull(actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextValue()
    
    @Test
    public void testNextValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:264)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:283)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:781) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:310)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:726)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 33554432);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue31() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:480)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:494)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2332)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:646)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:310)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue34() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:346)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue36() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue37() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:310)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue38() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:346)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:779) */
        filteringParserDelegate.nextValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method nextValue()
    
    @Test(expected = JsonParseException.class)
    public void testNextValue39() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.nextValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testNextValue40() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.nextValue();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method nextValue()
    
    @Test(timeout = 1000L)
    public void testNextValue41() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        filteringParserDelegate.nextValue();
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
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipChildren()
    
    @Test
    public void testSkipChildren1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:803) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:803) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:310)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:803) */
        filteringParserDelegate.skipChildren();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method skipChildren()
    
    @Test(timeout = 1000L)
    public void testSkipChildren4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        filteringParserDelegate.skipChildren();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.currentTokenId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method currentTokenId()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#currentTokenId()}
 * @utbot.executesCondition {@code ((t == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#id()}
 * @utbot.returnsFrom {@code return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();}
 *  */
    @Test
    public void testCurrentTokenId_TNotEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        
        int actual = filteringParserDelegate.currentTokenId();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#currentTokenId()}
 * @utbot.executesCondition {@code ((t == null)): True}
 * @utbot.returnsFrom {@code return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();}
 *  */
    @Test
    public void testCurrentTokenId_TEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        int actual = filteringParserDelegate.currentTokenId();
        
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:188) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:188) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191) */
        filteringParserDelegate.getCurrentName();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836) */
        filteringParserDelegate.getBigIntegerValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBigIntegerValue()
    
    @Test
    public void testGetBigIntegerValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 17L);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        BigInteger actual = filteringParserDelegate.getBigIntegerValue();
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(6, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetBigIntegerValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal", _numberBigDecimal);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        BigInteger actual = filteringParserDelegate.getBigIntegerValue();
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(20, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetBigIntegerValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        BigInteger actual = filteringParserDelegate.getBigIntegerValue();
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(5, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetBigIntegerValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        BigInteger actual = filteringParserDelegate.getBigIntegerValue();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBigIntegerValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        BigInteger actual = filteringParserDelegate.getBigIntegerValue();
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(5, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBigIntegerValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetBigIntegerValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBigIntegerValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBigIntegerValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBigIntegerValue9() throws Exception  {
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
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBigIntegerValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBigIntegerValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBigIntegerValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:670)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue14() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:670)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue15() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:670)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        NonBlockingJsonParser delegate3 = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:670)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:836) */
        filteringParserDelegate.getBigIntegerValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getBigIntegerValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 27);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        NonBlockingJsonParser delegate3 = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 20);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBigIntegerValue();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBigIntegerValue()
    
    @Test(expected = RuntimeException.class)
    public void testGetBigIntegerValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 32);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDecimalValue()
    
    @Test
    public void testGetDecimalValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", java.lang.Long.MIN_VALUE);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        BigDecimal actual = filteringParserDelegate.getDecimalValue();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(18, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetDecimalValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        BigDecimal actual = filteringParserDelegate.getDecimalValue();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetDecimalValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {'\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        BigDecimal actual = filteringParserDelegate.getDecimalValue();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(17, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetDecimalValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        BigDecimal actual = filteringParserDelegate.getDecimalValue();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(17, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDecimalValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue8() throws Exception  {
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
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue10() throws Exception  {
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
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue11() throws Exception  {
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
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDecimalValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue14() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:713)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:713)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue16() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:713)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        BigInteger _numberBigInt = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt", _numberBigInt);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compactValFor(BigDecimal.java:4422)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1084)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:984)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:716)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:982)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:716)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:289)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:982)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:716)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:984)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:716)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:982)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:716)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:830)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:713)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:289)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:982)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:716)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(NumberInput.java:289)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:982)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:716)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:713)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:848) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException] */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException] */
        filteringParserDelegate.getDecimalValue();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDecimalValue()
    
    @Test(expected = NumberFormatException.class)
    public void testGetDecimalValue29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testGetDecimalValue30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testGetDecimalValue31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getDecimalValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        NonBlockingJsonParser delegate3 = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
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
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue34() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", Integer.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        NonBlockingJsonParser delegate3 = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue36() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.getBooleanValue();
        
        assertFalse(actual);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBooleanValue(FilteringParserDelegate.java:839) */
        filteringParserDelegate.getBooleanValue();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBooleanValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue2() throws Exception  {
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
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBooleanValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetBooleanValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBooleanValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEmbeddedObject()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getEmbeddedObject()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getEmbeddedObject()}
 * @utbot.returnsFrom {@code return delegate.getEmbeddedObject();}
 *  */
    @Test
    public void testGetEmbeddedObject_JsonParserGetEmbeddedObject() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = filteringParserDelegate.getEmbeddedObject();
        
        assertNull(actual);
    }
    ///endregion
    
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:891) */
        filteringParserDelegate.getEmbeddedObject();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getEmbeddedObject()
    
    @Test
    public void testGetEmbeddedObject1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate7 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
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
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
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
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
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
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
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
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
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
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getEmbeddedObject();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
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
    public void testGetEmbeddedObject9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
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
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
    public void testGetEmbeddedObject12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
    public void testGetEmbeddedObject13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
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
    public void testGetEmbeddedObject15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
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
    public void testGetEmbeddedObject16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
    
    @Test
    public void testGetEmbeddedObject17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:212)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:891)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:212)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:212)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:212)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:891)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:891)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:891)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:891) */
        filteringParserDelegate.getEmbeddedObject();
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
        JsonToken _currToken = JsonToken.START_ARRAY;
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    @Test
    public void testReadBinaryValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        byte[] _binaryValue = {(byte) 0, (byte) 0, (byte) 0};
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = new byte[40];
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "buf", buf);
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "count", 6);
        
        int actual = filteringParserDelegate.readBinaryValue(null, bufferedOutputStream);
        
        assertEquals(3, actual);
        
        int finalBufferedOutputStreamCount = ((Integer) getFieldValue(bufferedOutputStream, "java.io.BufferedOutputStream", "count"));
        
        assertEquals(9, finalBufferedOutputStreamCount);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    @Test(expected = StackOverflowError.class)
    public void testReadBinaryValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.readBinaryValue(null, null);
    }
    
    @Test
    public void testReadBinaryValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "count", -1073741804);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1073741804 out of bounds for byte[32]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:129)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:423)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(base64Variant, bufferedOutputStream);
    }
    
    @Test
    public void testReadBinaryValue4() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        Object encOutputStream = createInstance("java.util.Base64$EncOutputStream");
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            java.base/java.util.Base64$EncOutputStream.checkNewline(Base64.java:918)
            java.base/java.util.Base64$EncOutputStream.write(Base64.java:961)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:423)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class base64VariantType = Class.forName("com.fasterxml.jackson.core.Base64Variant");
        Class encOutputStreamType = Class.forName("java.io.OutputStream");
        Method readBinaryValueMethod = filteringParserDelegateClazz.getDeclaredMethod("readBinaryValue", base64VariantType, encOutputStreamType);
        readBinaryValueMethod.setAccessible(true);
        java.lang.Object[] readBinaryValueMethodArguments = new java.lang.Object[2];
        readBinaryValueMethodArguments[0] = base64Variant;
        readBinaryValueMethodArguments[1] = encOutputStream;
        try {
            readBinaryValueMethod.invoke(filteringParserDelegate, readBinaryValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadBinaryValue5() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object encOutputStream = createInstance("java.util.Base64$EncOutputStream");
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            java.base/java.util.Base64$EncOutputStream.checkNewline(Base64.java:918)
            java.base/java.util.Base64$EncOutputStream.write(Base64.java:961)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:423)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class base64VariantType = Class.forName("com.fasterxml.jackson.core.Base64Variant");
        Class encOutputStreamType = Class.forName("java.io.OutputStream");
        Method readBinaryValueMethod = filteringParserDelegateClazz.getDeclaredMethod("readBinaryValue", base64VariantType, encOutputStreamType);
        readBinaryValueMethod.setAccessible(true);
        java.lang.Object[] readBinaryValueMethodArguments = new java.lang.Object[2];
        readBinaryValueMethodArguments[0] = ((Object) null);
        readBinaryValueMethodArguments[1] = encOutputStream;
        try {
            readBinaryValueMethod.invoke(filteringParserDelegate, readBinaryValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadBinaryValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        byte[] _binaryValue = new byte[32];
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        byte[] buf = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "buf", buf);
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "count", 1);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bufferedOutputStream, "java.io.FilterOutputStream", "out", out);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            java.base/java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:81)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:122)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:423)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(base64Variant, bufferedOutputStream);
    }
    
    @Test
    public void testReadBinaryValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:123)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:423)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(null, bufferedOutputStream);
    }
    
    @Test
    public void testReadBinaryValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.ByteArrayBuilder.reset(ByteArrayBuilder.java:64)
            com.fasterxml.jackson.core.base.ParserBase._getByteArrayBuilder(ParserBase.java:509)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2717)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:422)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(base64Variant, null);
    }
    
    @Test
    public void testReadBinaryValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "count", -2147483647);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bufferedOutputStream, "java.io.FilterOutputStream", "out", out);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:123)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:423)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(null, bufferedOutputStream);
    }
    
    @Test
    public void testReadBinaryValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        byte[] _binaryValue = new byte[40];
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        BufferedOutputStream bufferedOutputStream = ((BufferedOutputStream) createInstance("java.io.BufferedOutputStream"));
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "buf", _binaryValue);
        setField(bufferedOutputStream, "java.io.BufferedOutputStream", "count", 33);
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(out, "java.io.ObjectOutputStream", "bout", bout);
        setField(bufferedOutputStream, "java.io.FilterOutputStream", "out", out);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:81)
            java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:122)
            java.base/java.io.FilterOutputStream.write(FilterOutputStream.java:108)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:423)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(null, bufferedOutputStream);
    }
    
    @Test
    public void testReadBinaryValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:410)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:422)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(base64Variant, null);
    }
    
    @Test
    public void testReadBinaryValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        byte[] _binaryValue = new byte[17];
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:422)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(null, null);
    }
    
    @Test
    public void testReadBinaryValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder", _byteArrayBuilder);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:410)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.readBinaryValue(UTF8DataInputJsonParser.java:422)
            com.fasterxml.jackson.core.util.JsonParserDelegate.readBinaryValue(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:893) */
        filteringParserDelegate.readBinaryValue(null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    @Test(expected = JsonParseException.class)
    public void testReadBinaryValue14() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        Object nullOutputStream = createInstance("java.lang.ProcessBuilder$NullOutputStream");
        
        Class filteringParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate");
        Class base64VariantType = Class.forName("com.fasterxml.jackson.core.Base64Variant");
        Class nullOutputStreamType = Class.forName("java.io.OutputStream");
        Method readBinaryValueMethod = filteringParserDelegateClazz.getDeclaredMethod("readBinaryValue", base64VariantType, nullOutputStreamType);
        readBinaryValueMethod.setAccessible(true);
        java.lang.Object[] readBinaryValueMethodArguments = new java.lang.Object[2];
        readBinaryValueMethodArguments[0] = base64Variant;
        readBinaryValueMethodArguments[1] = nullOutputStream;
        try {
            readBinaryValueMethod.invoke(filteringParserDelegate, readBinaryValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:842) */
        filteringParserDelegate.getByteValue();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:860) */
        filteringParserDelegate.getLongValue();
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
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:875) */
        filteringParserDelegate.getValueAsInt(-255);
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt()}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt();}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:874) */
        filteringParserDelegate.getValueAsInt();
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
    public void testGetTextOffset_ReturnDelegateGetTextOffset_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetTextOffset_ReturnDelegateGetTextOffset() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
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
    public void testGetTextOffset_ReturnDelegateGetTextOffset_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextOffset(FilteringParserDelegate.java:827) */
        filteringParserDelegate.getTextOffset();
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
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong() throws Exception  {
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
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        long actual = filteringParserDelegate.getValueAsLong(-255L);
        
        assertEquals(0L, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsLong(long)}
 * @utbot.returnsFrom {@code return delegate.getValueAsLong(defaultValue);}
 *  */
    @Test
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong_1() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong(FilteringParserDelegate.java:877) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong(FilteringParserDelegate.java:876) */
        filteringParserDelegate.getValueAsLong();
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
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
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
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
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
    public void testGetValueAsDouble_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble(FilteringParserDelegate.java:879) */
        filteringParserDelegate.getValueAsDouble(java.lang.Double.NaN);
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
    public void testGetValueAsDouble_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble(FilteringParserDelegate.java:878) */
        filteringParserDelegate.getValueAsDouble();
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
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
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: @Override
 * public String getValueAsString() throws IOException {
 *     return delegate.getValueAsString();
 * }
 *  */
    @Test
    public void testGetValueAsString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:351)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:882) */
        filteringParserDelegate.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public String getValueAsString() throws IOException {
 *     return delegate.getValueAsString();
 * }
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:882) */
        filteringParserDelegate.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public String getValueAsString() throws IOException {
 *     return delegate.getValueAsString();
 * }
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:882) */
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_41() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public String getValueAsString(String defaultValue) throws IOException {
 *     return delegate.getValueAsString(defaultValue);
 * }
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:883) */
        filteringParserDelegate.getValueAsString(null);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsString(java.lang.String)}
 * @utbot.returnsFrom {@code return delegate.getValueAsString(defaultValue);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.getValueAsString(defaultValue);
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException_11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsString(ParserMinimalBase.java:485)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:244)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:204)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:883) */
        filteringParserDelegate.getValueAsString(null);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:854) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:857) */
        filteringParserDelegate.getIntValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean
    
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
    public void testGetValueAsBoolean_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean(FilteringParserDelegate.java:880) */
        filteringParserDelegate.getValueAsBoolean();
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
    public void testGetValueAsBoolean_ReturnDelegateGetValueAsBoolean_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
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
    public void testGetValueAsBoolean_ReturnDelegateGetValueAsBoolean() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
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
    public void testGetValueAsBoolean_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean(FilteringParserDelegate.java:881) */
        filteringParserDelegate.getValueAsBoolean(false);
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
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
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
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#hasTextCharacters()}
 * @utbot.returnsFrom {@code return delegate.hasTextCharacters();}
 *  */
    @Test
    public void testHasTextCharacters_ReturnDelegateHasTextCharacters_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
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
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = filteringParserDelegate.hasTextCharacters();
        
        assertTrue(actual);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters(FilteringParserDelegate.java:824) */
        filteringParserDelegate.hasTextCharacters();
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextCharacters(FilteringParserDelegate.java:825) */
        filteringParserDelegate.getTextCharacters();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getShortValue()
    
    @Test
    public void testGetShortValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        short actual = filteringParserDelegate.getShortValue();
        
        assertEquals((short) 0, actual);
    }
    
    @Test
    public void testGetShortValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        short actual = filteringParserDelegate.getShortValue();
        
        assertEquals((short) 0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(3, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetShortValue3() throws Exception  {
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
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        short actual = filteringParserDelegate.getShortValue();
        
        assertEquals((short) -48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetShortValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        short actual = filteringParserDelegate.getShortValue();
        
        assertEquals((short) 48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getShortValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetShortValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetShortValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetShortValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetShortValue8() throws Exception  {
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
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 10);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:41)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:812)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:642)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:42)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:812)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:642)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue11() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:803)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:642)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue12() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:803)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:642)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:892)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:645)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.315983132511506E77);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:292)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:888)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:645)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -4.328521728E9);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:888)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:645)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.6815615859885194E154);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:888)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:645)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:812)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:642)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:803)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:642)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    
    @Test
    public void testGetShortValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:406)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:812)
            com.fasterxml.jackson.core.base.ParserBase.getIntValue(ParserBase.java:642)
            com.fasterxml.jackson.core.JsonParser.getShortValue(JsonParser.java:1281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getShortValue(JsonParserDelegate.java:166)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:845) */
        filteringParserDelegate.getShortValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getShortValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetShortValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberInt", Integer.MIN_VALUE);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetShortValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 32768L);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetShortValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.315983132511506E77);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetShortValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.6815615859885194E154);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetShortValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetShortValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetShortValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getShortValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue
    
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNumberValue()
    
    @Test
    public void testGetNumberValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Long actual = ((Long) filteringParserDelegate.getNumberValue());
        
        Long expected = 0L;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Double actual = ((Double) filteringParserDelegate.getNumberValue());
        
        Double expected = java.lang.Double.NaN;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testGetNumberValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        Integer actual = ((Integer) filteringParserDelegate.getNumberValue());
        
        Integer expected = -48;
        
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483635);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Integer actual = ((Integer) filteringParserDelegate.getNumberValue());
        
        Integer expected = 48;
        
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetNumberValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Number actual = filteringParserDelegate.getNumberValue();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNumberValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 65552);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Number actual = filteringParserDelegate.getNumberValue();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNumberValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        Integer actual = ((Integer) filteringParserDelegate.getNumberValue());
        
        Integer expected = -48;
        
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNumberValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue10() throws Exception  {
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue12() throws Exception  {
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[39];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 37);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 5);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:33)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:848)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:778)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 536870912);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:362)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:406)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:406)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:351)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:406)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:580)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:866) */
        filteringParserDelegate.getNumberValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNumberValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 26);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getNumberValue();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNumberValue()
    
    @Test(expected = RuntimeException.class)
    public void testGetNumberValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2097152);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNumberType()
    
    @Test
    public void testGetNumberType1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8192);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonParser.NumberType actual = filteringParserDelegate.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.DOUBLE;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberType2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonParser.NumberType actual = filteringParserDelegate.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.BIG_DECIMAL;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberType3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        JsonParser.NumberType actual = filteringParserDelegate.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetNumberType4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        JsonParser.NumberType actual = filteringParserDelegate.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNumberType()
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType5() throws Exception  {
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
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberType16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test
    public void testGetNumberType17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:613)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    
    @Test
    public void testGetNumberType18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:613)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    
    @Test
    public void testGetNumberType19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:613)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    
    @Test
    public void testGetNumberType20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:613)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    
    @Test
    public void testGetNumberType21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    
    @Test
    public void testGetNumberType22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    
    @Test
    public void testGetNumberType23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 536870912);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:362)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:406)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:613)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    
    @Test
    public void testGetNumberType24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsDouble(TextBuffer.java:406)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getNumberType(ParserBase.java:613)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:184)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:863) */
        filteringParserDelegate.getNumberType();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNumberType()
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getNumberType();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberType();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851) */
        filteringParserDelegate.getDoubleValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDoubleValue()
    
    @Test
    public void testGetDoubleValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        double actual = filteringParserDelegate.getDoubleValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        JsonParser filteringParserDelegateDelegate1 = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegate1DelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate1DelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        double finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numberDouble = ((Double) getFieldValue(filteringParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble"));
        
        assertEquals(10, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
        
        org.junit.Assert.assertEquals(0.0, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numberDouble, 1.0E-6);
    }
    
    @Test
    public void testGetDoubleValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        double actual = filteringParserDelegate.getDoubleValue();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    @Test
    public void testGetDoubleValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", -4222120355690496L);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal", _numberBigDecimal);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        double actual = filteringParserDelegate.getDoubleValue();
        
        org.junit.Assert.assertEquals(-4.222120355690496E14, actual, 1.0E-6);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(24, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetDoubleValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        BigInteger _numberBigInt = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigInt", _numberBigInt);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        double actual = filteringParserDelegate.getDoubleValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(12, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetDoubleValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        double actual = filteringParserDelegate.getDoubleValue();
        
        org.junit.Assert.assertEquals(48.0, actual, 1.0E-6);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(9, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetDoubleValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        double actual = filteringParserDelegate.getDoubleValue();
        
        org.junit.Assert.assertEquals(-48.0, actual, 1.0E-6);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(9, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDoubleValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue10() throws Exception  {
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
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue12() throws Exception  {
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
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 1);
        String stringCache = "";
        setField(_numberBigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", 4503599627370496L);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal", _numberBigDecimal);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:957)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:702)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851) */
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDoubleValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue18() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:748)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:699)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851) */
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 2);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal", _numberBigDecimal);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:4000)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:957)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:702)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851) */
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:834)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:782)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:699)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851) */
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851) */
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851) */
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 10);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:754)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:699)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:851) */
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NullPointerException] */
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test
    public void testGetDoubleValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1073741824);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue] produces [java.lang.NullPointerException] */
        filteringParserDelegate.getDoubleValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getDoubleValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 43);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        NonBlockingJsonParser delegate3 = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
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
        
        filteringParserDelegate.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getDoubleValue();
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
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void testGetBinaryValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_byteArrayBuilder", _byteArrayBuilder);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        byte[] initialFilteringParserDelegateDelegateDelegate_binaryValue = ((byte[]) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        
        byte[] actual = filteringParserDelegate.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        JsonParser filteringParserDelegateDelegate1 = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegate1DelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        byte[] finalFilteringParserDelegateDelegateDelegate_binaryValue = ((byte[]) getFieldValue(filteringParserDelegateDelegate1DelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue"));
        
        assertFalse(initialFilteringParserDelegateDelegateDelegate_binaryValue == finalFilteringParserDelegateDelegateDelegate_binaryValue);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test(expected = StackOverflowError.class)
    public void testGetBinaryValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:213)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
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
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:213)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:213)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
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
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:213)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 440485904);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 68980997);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
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
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:213)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:213)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(UTF8DataInputJsonParser.java:2724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:398)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:213)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getBinaryValue(UTF8DataInputJsonParser.java:410)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBinaryValue(JsonParserDelegate.java:213)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:892) */
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        filteringParserDelegate.getBinaryValue(base64Variant);
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getBinaryValue(null);
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
    public void test_nextBuffered_ReturnT() throws Exception  {
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
        setField(_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
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
        
        JsonToken expected = JsonToken.START_ARRAY;
        
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
    public void test_nextBuffered_ReturnT_2() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:750) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:757) */
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
    public void test_nextBuffered_ThrowNullPointerException_3() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:757) */
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
    public void test_nextBuffered_ThrowNullPointerException_5() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        _parent._startHandled = true;
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:757) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt == null
 *  */
    @Test
    public void test_nextBuffered_ThrowNullPointerException_2() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        tokenFilterContext._startHandled = true;
        tokenFilterContext._needToHandleName = true;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:767) */
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
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextBuffered(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.executesCondition {@code (ctxt == _headContext): False}
 * @utbot.executesCondition {@code (ctxt == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt == null
 *  */
    @Test
    public void test_nextBuffered_ThrowNullPointerException_4() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(tokenFilterContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        tokenFilterContext._startHandled = true;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:767) */
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
    public void test_nextBuffered1() throws Throwable  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(tokenFilterContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", tokenFilterContext);
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextToken2()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void test_nextToken2_ThrowNullPointerException_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _nextToken2()
    
    @Test
    public void test_nextToken21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:342)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:561) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2835)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2828)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", -2147483640);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:480)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:494)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2236)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken210() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken211() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:516) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken212() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:726)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken213() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken214() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken215() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken216() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken217() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken218() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 8);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken219() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:481) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken220() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:481) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken221() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:516) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken222() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:466) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken223() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:516) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken224() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:481) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken225() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:481) */
        filteringParserDelegate._nextToken2();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _nextToken2()
    
    @Test(expected = JsonParseException.class)
    public void test_nextToken226() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate._nextToken2();
    }
    
    @Test(expected = StreamCorruptedException.class)
    public void test_nextToken227() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate._nextToken2();
    }
    
    @Test(expected = JsonParseException.class)
    public void test_nextToken228() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate._nextToken2();
    }
    ///endregion
    
    ///region Errors report for _nextToken2
    
    public void test_nextToken2_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#_nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void test_nextTokenWithBuffering_JsonParserNextToken() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    @Test
    public void test_nextTokenWithBuffering1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.JsonParser", "_features", 2);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipComment(UTF8DataInputJsonParser.java:2358)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSComment(UTF8DataInputJsonParser.java:2246)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2223)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:342)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:704) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:724)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:657) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:657) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:634) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:634) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3100)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 16);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", Integer.MIN_VALUE);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:480)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:494)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2236)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2835)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:726)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(_inputData, "java.io.ObjectInputStream", "defaultDataEnd", true);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:480)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:494)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2215)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:682) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:634) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 16);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2828)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:657) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:622) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        java.lang.Object[] _currentValue = createArray("[Ljava.io.ObjectInputStream$PeekInputStream;", 1);
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:657) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _parsingContext);
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:634) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    @Test(expected = JsonParseException.class)
    public void test_nextTokenWithBuffering27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_nextTokenWithBuffering28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_nextTokenWithBuffering29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
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
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): True}
 * @utbot.executesCondition {@code (_exposedContext == null): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextToken__exposedContextNotEqualsNull() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        filteringParserDelegate._currToken = _currToken;
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
        
        assertFalse(initialFilteringParserDelegate_currToken == finalFilteringParserDelegate_currToken);
        
        assertFalse(finalFilteringParserDelegate_exposedContext_needToHandleName);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): True}
 * @utbot.executesCondition {@code (_exposedContext == null): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextToken__exposedContextNotEqualsNull_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        assertEquals(_currToken, actual);
        
        boolean finalFilteringParserDelegate_exposedContext_startHandled = filteringParserDelegate._exposedContext._startHandled;
        
        assertTrue(finalFilteringParserDelegate_exposedContext_startHandled);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextToken__allowMultipleMatches() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        
        JsonToken initialFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        boolean finalFilteringParserDelegate_exposedContext_startHandled = filteringParserDelegate._exposedContext._startHandled;
        
        assertTrue(finalFilteringParserDelegate_exposedContext_startHandled);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): False}
 * @utbot.executesCondition {@code (ctxt != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): True}
 * @utbot.executesCondition {@code (_exposedContext == null): True}
 * @utbot.executesCondition {@code (_currToken.isStructEnd()): True}
 * @utbot.executesCondition {@code (_headContext.isStartHandled()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#isStructEnd()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.filter.TokenFilterContext#isStartHandled()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_currToken = null);
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): False}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt = _headContext.findChildOf(ctxt);
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:283) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): False}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t = delegate.getCurrentToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:264) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): False}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): False}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt = _headContext.findChildOf(ctxt);
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:283) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): False}
 * @utbot.executesCondition {@code (ctxt != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292) */
        filteringParserDelegate.nextToken();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextToken()
    
    @Test
    public void testNextToken1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:292) */
        filteringParserDelegate.nextToken();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method nextToken()
    
    @Test(timeout = 1000L)
    public void testNextToken2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
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
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 *  */
    @Test
    public void testGetTextLength_ReturnDelegateGetTextLength_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 *  */
    @Test
    public void testGetTextLength_ReturnDelegateGetTextLength_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 *  */
    @Test
    public void testGetTextLength_ReturnDelegateGetTextLength_3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 *  */
    @Test
    public void testGetTextLength_ReturnDelegateGetTextLength() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 *  */
    @Test
    public void testGetTextLength_ReturnDelegateGetTextLength_5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 *  */
    @Test
    public void testGetTextLength_ReturnDelegateGetTextLength_4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:826) */
        filteringParserDelegate.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.returnsFrom {@code return delegate.getTextLength();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.getTextLength();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextLength(UTF8DataInputJsonParser.java:358)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:826) */
        filteringParserDelegate.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public int getTextLength() throws IOException {
 *     return delegate.getTextLength();
 * }
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:257)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:594)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishString(UTF8DataInputJsonParser.java:1829)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextLength(UTF8DataInputJsonParser.java:347)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:826) */
        filteringParserDelegate.getTextLength();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTextLength()
    
    @Test
    public void testGetTextLength1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(4, actual);
    }
    
    @Test
    public void testGetTextLength2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetTextLength3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetTextLength4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetTextLength5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getTextLength();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTextLength()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTextLength6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getTextLength();
    }
    
    @Test
    public void testGetTextLength7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishString(UTF8DataInputJsonParser.java:1834)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextLength(UTF8DataInputJsonParser.java:347)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTextLength(JsonParserDelegate.java:146)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTextLength(JsonParserDelegate.java:146)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:826) */
        filteringParserDelegate.getTextLength();
    }
    
    @Test
    public void testGetTextLength8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextLength(UTF8DataInputJsonParser.java:352)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTextLength(JsonParserDelegate.java:146)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTextLength(JsonParserDelegate.java:146)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:826) */
        filteringParserDelegate.getTextLength();
    }
    
    @Test
    public void testGetTextLength9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishString(UTF8DataInputJsonParser.java:1834)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextLength(UTF8DataInputJsonParser.java:347)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:826) */
        filteringParserDelegate.getTextLength();
    }
    
    @Test
    public void testGetTextLength10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishString(UTF8DataInputJsonParser.java:1834)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextLength(UTF8DataInputJsonParser.java:347)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:826) */
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
    public void testGetText_ReturnDelegateGetText_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetText_ReturnDelegateGetText() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetText_ReturnDelegateGetText_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getText()
    
    @Test
    public void testGetText1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        String expected = "[";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetText2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getText()
    
    @Test(expected = StackOverflowError.class)
    public void testGetText4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:362)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:257)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:594)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:362)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getText();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.currentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method currentToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#currentToken()}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testCurrentToken_Return_currToken() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        JsonToken actual = filteringParserDelegate.currentToken();
        
        assertNull(actual);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1027112627684000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1027112627684000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1027112627735600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027112627684000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027112627735600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1027112628260200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1027112628260200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1027112628262600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027112628260200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027112628262600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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

