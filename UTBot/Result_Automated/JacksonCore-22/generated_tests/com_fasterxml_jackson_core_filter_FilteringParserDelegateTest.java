package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import java.io.ObjectInputStream;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.util.RequestPayload;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import java.io.DataInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import java.io.StreamCorruptedException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_core_filter_FilteringParserDelegateTest {
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
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testNextToken__allowMultipleMatches_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextToken()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): False}
 * @utbot.executesCondition {@code (ctxt != null): True}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = delegate.nextToken();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:278) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:259) */
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
    public void testNextToken_ThrowNullPointerException_4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:278) */
        filteringParserDelegate.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#nextToken()}
 * @utbot.executesCondition {@code (!_allowMultipleMatches): True}
 * @utbot.executesCondition {@code (_currToken != null): True}
 * @utbot.executesCondition {@code (_exposedContext == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#isScalarValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.filter.TokenFilterContext#isStartHandled()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _currToken.isScalarValue() && !_headContext.isStartHandled() && !_includePath && (_itemFilter == TokenFilter.INCLUDE_ALL)
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextToken()
    
    @Test
    public void testNextToken1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
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
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        assertFalse(initialFilteringParserDelegate_currToken == finalFilteringParserDelegate_currToken);
    }
    
    @Test
    public void testNextToken3() throws Exception  {
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
        
        JsonToken actual = filteringParserDelegate.nextToken();
        
        JsonToken expected = JsonToken.START_ARRAY;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNextToken4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testNextToken5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:259) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:259) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:259) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:278) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:341) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken16() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:305) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2828)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    
    @Test
    public void testNextToken21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287) */
        filteringParserDelegate.nextToken();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method nextToken()
    
    @Test(expected = JsonParseException.class)
    public void testNextToken22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.nextToken();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method nextToken()
    
    @Test(timeout = 1000L)
    public void testNextToken23() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:822) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:822) */
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
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishString(UTF8DataInputJsonParser.java:1829)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextLength(UTF8DataInputJsonParser.java:347)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:822) */
        filteringParserDelegate.getTextLength();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTextLength()
    
    @Test
    public void testGetTextLength1() throws Exception  {
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
    public void testGetTextLength4() throws Exception  {
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
    
    @Test
    public void testGetTextLength5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextLength(UTF8DataInputJsonParser.java:356)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTextLength(JsonParserDelegate.java:146)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTextLength(JsonParserDelegate.java:146)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:822) */
        filteringParserDelegate.getTextLength();
    }
    
    @Test
    public void testGetTextLength8() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:822) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:822) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextLength(FilteringParserDelegate.java:822) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:819) */
        filteringParserDelegate.getText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getText()
    
    @Test
    public void testGetText1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getText();
        
        assertNull(actual);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:819) */
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:819) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = new char[12];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:819) */
        filteringParserDelegate.getText();
    }
    
    @Test
    public void testGetText8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:819) */
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:819) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:819) */
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:890) */
        filteringParserDelegate.getTokenLocation();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTokenLocation()
    
    @Test
    public void testGetTokenLocation1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate6 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate5 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate5, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate5, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextValue()
    
    @Test
    public void testNextValue1() throws Exception  {
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
    
    @Test
    public void testNextValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        assertNull(actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegate_currToken);
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    
    @Test
    public void testNextValue3() throws Exception  {
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
    public void testNextValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonToken actual = filteringParserDelegate.nextValue();
        
        assertNull(actual);
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegate_currToken);
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    
    @Test
    public void testNextValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
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
    public void testNextValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:259)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue7() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:259)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue16() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:726)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:305)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._headContext = _headContext;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue30() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    
    @Test
    public void testNextValue31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:726)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:564)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextValue(FilteringParserDelegate.java:775) */
        filteringParserDelegate.nextValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method nextValue()
    
    @Test(expected = JsonParseException.class)
    public void testNextValue32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.nextValue();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method nextValue()
    
    @Test(timeout = 1000L)
    public void testNextValue33() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextCharacters(FilteringParserDelegate.java:821) */
        filteringParserDelegate.getTextCharacters();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTextCharacters()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTextCharacters1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getTextCharacters();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTextOffset(FilteringParserDelegate.java:823) */
        filteringParserDelegate.getTextOffset();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTextOffset()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTextOffset1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getTextOffset();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters(FilteringParserDelegate.java:820) */
        filteringParserDelegate.hasTextCharacters();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasTextCharacters()
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters3() throws Exception  {
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
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters7() throws Exception  {
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
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasTextCharacters12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.hasTextCharacters();
    }
    
    @Test
    public void testHasTextCharacters13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.hasTextCharacters(JsonParserDelegate.java:144)
            com.fasterxml.jackson.core.util.JsonParserDelegate.hasTextCharacters(JsonParserDelegate.java:144)
            com.fasterxml.jackson.core.util.JsonParserDelegate.hasTextCharacters(JsonParserDelegate.java:144)
            com.fasterxml.jackson.core.util.JsonParserDelegate.hasTextCharacters(JsonParserDelegate.java:144)
            com.fasterxml.jackson.core.util.JsonParserDelegate.hasTextCharacters(JsonParserDelegate.java:144)
            com.fasterxml.jackson.core.util.JsonParserDelegate.hasTextCharacters(JsonParserDelegate.java:144)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters(FilteringParserDelegate.java:820)
            com.fasterxml.jackson.core.util.JsonParserDelegate.hasTextCharacters(JsonParserDelegate.java:144)
            com.fasterxml.jackson.core.util.JsonParserDelegate.hasTextCharacters(JsonParserDelegate.java:144)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.hasTextCharacters(FilteringParserDelegate.java:820) */
        filteringParserDelegate.hasTextCharacters();
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
    public void testGetCurrentLocation_ReturnDelegateGetCurrentLocation_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        short[] _sourceRef = {};
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate1, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonLocation actual = filteringParserDelegate.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(_sourceRef, -1L, -1L, 0, -1);
        
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
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate7 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
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
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate7 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate7, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate7, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method skipChildren()
    
    @Test
    public void testSkipChildren1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        FilteringParserDelegate actual = ((FilteringParserDelegate) filteringParserDelegate.skipChildren());
        
        TokenFilter actualRootFilter = actual.rootFilter;
        assertNull(actualRootFilter);
        
        boolean actual_allowMultipleMatches = actual._allowMultipleMatches;
        assertTrue(actual_allowMultipleMatches);
        
        boolean actual_includePath = actual._includePath;
        assertFalse(actual_includePath);
        
        boolean actual_includeImmediateParent = actual._includeImmediateParent;
        assertFalse(actual_includeImmediateParent);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        TokenFilterContext filteringParserDelegate_headContext = filteringParserDelegate._headContext;
        TokenFilterContext actual_headContext = actual._headContext;
        TokenFilterContext actual_headContext_parent = actual_headContext._parent;
        assertNull(actual_headContext_parent);
        
        TokenFilterContext actual_headContext_child = actual_headContext._child;
        assertNull(actual_headContext_child);
        
        String actual_headContext_currentName = actual_headContext._currentName;
        assertNull(actual_headContext_currentName);
        
        TokenFilter actual_headContext_filter = actual_headContext._filter;
        assertNull(actual_headContext_filter);
        
        boolean actual_headContext_startHandled = actual_headContext._startHandled;
        assertTrue(actual_headContext_startHandled);
        
        boolean actual_headContext_needToHandleName = actual_headContext._needToHandleName;
        assertFalse(actual_headContext_needToHandleName);
        
        int filteringParserDelegate_headContext_type = ((Integer) getFieldValue(filteringParserDelegate_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_headContext_type = ((Integer) getFieldValue(actual_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(filteringParserDelegate_headContext_type, actual_headContext_type);
        
        int filteringParserDelegate_headContext_index = ((Integer) getFieldValue(filteringParserDelegate_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_headContext_index = ((Integer) getFieldValue(actual_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(filteringParserDelegate_headContext_index, actual_headContext_index);
        
        TokenFilterContext actual_exposedContext = actual._exposedContext;
        assertNull(actual_exposedContext);
        
        TokenFilter actual_itemFilter = actual._itemFilter;
        assertNull(actual_itemFilter);
        
        int filteringParserDelegate_matchCount = filteringParserDelegate._matchCount;
        int actual_matchCount = actual._matchCount;
        assertEquals(filteringParserDelegate_matchCount, actual_matchCount);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser actualDelegate = ((JsonParser) getFieldValue(actual, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser actualDelegateDelegate = ((JsonParser) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        assertTrue(deepEquals(filteringParserDelegateDelegateDelegate, actualDelegateDelegate));
        boolean actualDelegateDelegate_allowMultipleMatches = ((Boolean) getFieldValue(actualDelegateDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_allowMultipleMatches"));
        assertFalse(actualDelegateDelegate_allowMultipleMatches);
        
        assertTrue(deepEquals(filteringParserDelegateDelegateDelegate, actualDelegateDelegate));
        assertTrue(deepEquals(filteringParserDelegateDelegateDelegate, actualDelegateDelegate));
        assertTrue(deepEquals(filteringParserDelegateDelegateDelegate, actualDelegateDelegate));
        assertTrue(deepEquals(filteringParserDelegateDelegateDelegate, actualDelegateDelegate));
        TokenFilterContext actualDelegateDelegate_headContext = ((TokenFilterContext) getFieldValue(actualDelegateDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext"));
        assertNull(actualDelegateDelegate_headContext);
        
        assertTrue(deepEquals(filteringParserDelegateDelegateDelegate, actualDelegateDelegate));
        assertTrue(deepEquals(filteringParserDelegateDelegateDelegate, actualDelegateDelegate));
        assertTrue(deepEquals(filteringParserDelegateDelegateDelegate, actualDelegateDelegate));
        JsonParser actualDelegateDelegateDelegate = ((JsonParser) getFieldValue(actualDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        assertNull(actualDelegateDelegateDelegate);
        
        int filteringParserDelegateDelegateDelegate_features = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegate, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actualDelegateDelegate_features = ((Integer) getFieldValue(actualDelegateDelegate, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(filteringParserDelegateDelegateDelegate_features, actualDelegateDelegate_features);
        
        RequestPayload actualDelegateDelegate_requestPayload = ((RequestPayload) getFieldValue(actualDelegateDelegate, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actualDelegateDelegate_requestPayload);
        
        assertTrue(deepEquals(filteringParserDelegateDelegate, actualDelegate));
        assertTrue(deepEquals(filteringParserDelegateDelegate, actualDelegate));
        
        assertTrue(deepEquals(filteringParserDelegate, actual));
        assertTrue(deepEquals(filteringParserDelegate, actual));
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        
        assertNull(finalFilteringParserDelegate_currToken);
    }
    
    @Test
    public void testSkipChildren2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
        ObjectCodec actualDelegate_objectCodec = ((ObjectCodec) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actualDelegate_objectCodec);
        
        ByteQuadsCanonicalizer actualDelegate_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actualDelegate_symbols);
        
        int[] actualDelegate_quadBuffer = ((int[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actualDelegate_quadBuffer);
        
        boolean actualDelegate_tokenIncomplete = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actualDelegate_tokenIncomplete);
        
        int filteringParserDelegateDelegate_quad1 = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actualDelegate_quad1 = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(filteringParserDelegateDelegate_quad1, actualDelegate_quad1);
        
        DataInput actualDelegate_inputData = ((DataInput) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actualDelegate_inputData);
        
        int filteringParserDelegateDelegate_nextByte = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actualDelegate_nextByte = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(filteringParserDelegateDelegate_nextByte, actualDelegate_nextByte);
        
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
        
        RequestPayload actualDelegate_requestPayload = ((RequestPayload) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actualDelegate_requestPayload);
        
        assertTrue(deepEquals(filteringParserDelegate, actual));
        assertTrue(deepEquals(filteringParserDelegate, actual));
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        JsonParser filteringParserDelegateDelegate1 = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegate_currToken);
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    
    @Test
    public void testSkipChildren3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        FilteringParserDelegate actual = ((FilteringParserDelegate) filteringParserDelegate.skipChildren());
        
        TokenFilter actualRootFilter = actual.rootFilter;
        assertNull(actualRootFilter);
        
        boolean actual_allowMultipleMatches = actual._allowMultipleMatches;
        assertTrue(actual_allowMultipleMatches);
        
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
        ObjectCodec actualDelegate_objectCodec = ((ObjectCodec) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actualDelegate_objectCodec);
        
        ByteQuadsCanonicalizer actualDelegate_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actualDelegate_symbols);
        
        int[] actualDelegate_quadBuffer = ((int[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actualDelegate_quadBuffer);
        
        boolean actualDelegate_tokenIncomplete = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actualDelegate_tokenIncomplete);
        
        int filteringParserDelegateDelegate_quad1 = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actualDelegate_quad1 = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(filteringParserDelegateDelegate_quad1, actualDelegate_quad1);
        
        DataInput actualDelegate_inputData = ((DataInput) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actualDelegate_inputData);
        
        int filteringParserDelegateDelegate_nextByte = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actualDelegate_nextByte = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(filteringParserDelegateDelegate_nextByte, actualDelegate_nextByte);
        
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
        
        RequestPayload actualDelegate_requestPayload = ((RequestPayload) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actualDelegate_requestPayload);
        
        assertTrue(deepEquals(filteringParserDelegate, actual));
        assertTrue(deepEquals(filteringParserDelegate, actual));
        
        JsonToken finalFilteringParserDelegate_currToken = filteringParserDelegate._currToken;
        JsonParser filteringParserDelegateDelegate1 = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalFilteringParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegateDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFilteringParserDelegate_currToken);
        
        assertNull(finalFilteringParserDelegateDelegate_currToken);
    }
    
    @Test
    public void testSkipChildren4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        FilteringParserDelegate actual = ((FilteringParserDelegate) filteringParserDelegate.skipChildren());
        
        TokenFilter actualRootFilter = actual.rootFilter;
        assertNull(actualRootFilter);
        
        boolean actual_allowMultipleMatches = actual._allowMultipleMatches;
        assertTrue(actual_allowMultipleMatches);
        
        boolean actual_includePath = actual._includePath;
        assertFalse(actual_includePath);
        
        boolean actual_includeImmediateParent = actual._includeImmediateParent;
        assertFalse(actual_includeImmediateParent);
        
        JsonToken actual_currToken = actual._currToken;
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = actual._lastClearedToken;
        assertNull(actual_lastClearedToken);
        
        TokenFilterContext filteringParserDelegate_headContext = filteringParserDelegate._headContext;
        TokenFilterContext actual_headContext = actual._headContext;
        TokenFilterContext actual_headContext_parent = actual_headContext._parent;
        assertNull(actual_headContext_parent);
        
        TokenFilterContext actual_headContext_child = actual_headContext._child;
        assertNull(actual_headContext_child);
        
        String actual_headContext_currentName = actual_headContext._currentName;
        assertNull(actual_headContext_currentName);
        
        TokenFilter actual_headContext_filter = actual_headContext._filter;
        assertNull(actual_headContext_filter);
        
        boolean actual_headContext_startHandled = actual_headContext._startHandled;
        assertTrue(actual_headContext_startHandled);
        
        boolean actual_headContext_needToHandleName = actual_headContext._needToHandleName;
        assertTrue(actual_headContext_needToHandleName);
        
        int filteringParserDelegate_headContext_type = ((Integer) getFieldValue(filteringParserDelegate_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_headContext_type = ((Integer) getFieldValue(actual_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(filteringParserDelegate_headContext_type, actual_headContext_type);
        
        int filteringParserDelegate_headContext_index = ((Integer) getFieldValue(filteringParserDelegate_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_headContext_index = ((Integer) getFieldValue(actual_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(filteringParserDelegate_headContext_index, actual_headContext_index);
        
        TokenFilterContext actual_exposedContext = actual._exposedContext;
        assertNull(actual_exposedContext);
        
        TokenFilter actual_itemFilter = actual._itemFilter;
        assertNull(actual_itemFilter);
        
        int filteringParserDelegate_matchCount = filteringParserDelegate._matchCount;
        int actual_matchCount = actual._matchCount;
        assertEquals(filteringParserDelegate_matchCount, actual_matchCount);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser actualDelegate = ((JsonParser) getFieldValue(actual, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        ObjectCodec actualDelegate_objectCodec = ((ObjectCodec) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec"));
        assertNull(actualDelegate_objectCodec);
        
        ByteQuadsCanonicalizer actualDelegate_symbols = ((ByteQuadsCanonicalizer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_symbols"));
        assertNull(actualDelegate_symbols);
        
        int[] actualDelegate_quadBuffer = ((int[]) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quadBuffer"));
        assertNull(actualDelegate_quadBuffer);
        
        boolean actualDelegate_tokenIncomplete = ((Boolean) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete"));
        assertFalse(actualDelegate_tokenIncomplete);
        
        int filteringParserDelegateDelegate_quad1 = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        int actualDelegate_quad1 = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_quad1"));
        assertEquals(filteringParserDelegateDelegate_quad1, actualDelegate_quad1);
        
        DataInput actualDelegate_inputData = ((DataInput) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData"));
        assertNull(actualDelegate_inputData);
        
        int filteringParserDelegateDelegate_nextByte = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        int actualDelegate_nextByte = ((Integer) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte"));
        assertEquals(filteringParserDelegateDelegate_nextByte, actualDelegate_nextByte);
        
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
        
        RequestPayload actualDelegate_requestPayload = ((RequestPayload) getFieldValue(actualDelegate, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actualDelegate_requestPayload);
        
        assertTrue(deepEquals(filteringParserDelegate, actual));
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
    public void testSkipChildren5() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:259)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:259)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _exposedContext._startHandled = true;
        _exposedContext._needToHandleName = true;
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:278)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:278)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:278)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        filteringParserDelegate._exposedContext = _exposedContext;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:278)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren14() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        _headContext._startHandled = true;
        _headContext._needToHandleName = true;
        filteringParserDelegate._headContext = _headContext;
        filteringParserDelegate._exposedContext = _headContext;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1953)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:341)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:305)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:341)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:305)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren31() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:305)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:305)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren34() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:305)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:341)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
    }
    
    @Test
    public void testSkipChildren36() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        filteringParserDelegate._allowMultipleMatches = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        filteringParserDelegate._currToken = _currToken;
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:305)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:799) */
        filteringParserDelegate.skipChildren();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble(FilteringParserDelegate.java:874) */
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
    public void testGetValueAsDouble_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsDouble(FilteringParserDelegate.java:875) */
        filteringParserDelegate.getValueAsDouble(java.lang.Double.NaN);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:859) */
        filteringParserDelegate.getNumberType();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBinaryValue(FilteringParserDelegate.java:888) */
        filteringParserDelegate.getBinaryValue(null);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getShortValue(FilteringParserDelegate.java:841) */
        filteringParserDelegate.getShortValue();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:887) */
        filteringParserDelegate.getEmbeddedObject();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getByteValue(FilteringParserDelegate.java:838) */
        filteringParserDelegate.getByteValue();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:853) */
        filteringParserDelegate.getIntValue();
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:223)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:878) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:878) */
        filteringParserDelegate.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsString()}
 * @utbot.returnsFrom {@code return delegate.getValueAsString();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegate.getValueAsString();
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException_1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:343)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:226)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:878) */
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
    public void testGetValueAsString_ThrowNullPointerException_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:878) */
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_51() throws Exception  {
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
    public void testGetValueAsString_ReturnDelegateGetValueAsString_6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        String actual = filteringParserDelegate.getValueAsString(null);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:879) */
        filteringParserDelegate.getValueAsString(null);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBooleanValue(FilteringParserDelegate.java:835) */
        filteringParserDelegate.getBooleanValue();
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
    public void testGetValueAsBoolean_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean(FilteringParserDelegate.java:877) */
        filteringParserDelegate.getValueAsBoolean(false);
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
    public void testGetValueAsBoolean_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsBoolean(FilteringParserDelegate.java:876) */
        filteringParserDelegate.getValueAsBoolean();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:856) */
        filteringParserDelegate.getLongValue();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.readBinaryValue(FilteringParserDelegate.java:889) */
        filteringParserDelegate.readBinaryValue(null, null);
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
    public void testGetValueAsLong_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong(FilteringParserDelegate.java:872) */
        filteringParserDelegate.getValueAsLong();
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
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong_1() throws Exception  {
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
    public void testGetValueAsLong_ReturnDelegateGetValueAsLong_2() throws Exception  {
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
    public void testGetValueAsLong_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsLong(FilteringParserDelegate.java:873) */
        filteringParserDelegate.getValueAsLong(-255L);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:847) */
        filteringParserDelegate.getDoubleValue();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getDecimalValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDecimalValue()
    
    @Test
    public void testGetDecimalValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    public void testGetDecimalValue2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    public void testGetDecimalValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    
    @Test
    public void testGetDecimalValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 32]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:714)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:745)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:714)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:714)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue7() throws Exception  {
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
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigDecimal(ParserBase.java:973)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:717)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:714)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:714)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test
    public void testGetDecimalValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        NonBlockingJsonParser delegate3 = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:745)
            com.fasterxml.jackson.core.base.ParserBase.getDecimalValue(ParserBase.java:714)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDecimalValue(JsonParserDelegate.java:169)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDecimalValue(FilteringParserDelegate.java:844) */
        filteringParserDelegate.getDecimalValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getDecimalValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
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
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
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
    public void testGetDecimalValue13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
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
    public void testGetDecimalValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
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
    public void testGetDecimalValue15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDecimalValue()
    
    @Test(expected = NumberFormatException.class)
    public void testGetDecimalValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getDecimalValue();
    }
    
    @Test(expected = NumberFormatException.class)
    public void testGetDecimalValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862) */
        filteringParserDelegate.getNumberValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNumberValue()
    
    @Test
    public void testGetNumberValue1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
    public void testGetNumberValue4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2097152);
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
    public void testGetNumberValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    public void testGetNumberValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    public void testGetNumberValue7() throws Exception  {
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
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue13() throws Exception  {
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
    public void testGetNumberValue14() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue17() throws Exception  {
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue18() throws Exception  {
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue19() throws Exception  {
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue20() throws Exception  {
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNumberValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
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
    public void testGetNumberValue22() throws Exception  {
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
        
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException] */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 139);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:830)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:581)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue27() throws Exception  {
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
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:819)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:776)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:581)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException] */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:745)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:581)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862) */
        filteringParserDelegate.getNumberValue();
    }
    
    @Test
    public void testGetNumberValue30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getNumberValue(ParserBase.java:581)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberValue(JsonParserDelegate.java:187)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberValue(FilteringParserDelegate.java:862) */
        filteringParserDelegate.getNumberValue();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNumberValue()
    
    @Test(expected = RuntimeException.class)
    public void testGetNumberValue31() throws Exception  {
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
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNumberValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue32() throws Exception  {
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
    public void testGetNumberValue33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsInt()
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt()}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt();}
 *  */
    @Test
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt() throws Exception  {
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
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_1() throws Exception  {
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
    public void testGetValueAsInt_ReturnDelegateGetValueAsInt_2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
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
    public void testGetValueAsInt_ThrowNullPointerException() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsInt()
    
    @Test
    public void testGetValueAsInt1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsInt2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8388616);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", java.lang.Double.NaN);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(8388617, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt3() throws Exception  {
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
    
    @Test
    public void testGetValueAsInt4() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsInt5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    public void testGetValueAsInt7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(48, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(1038366032, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(5328, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(-533328, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(-528, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt12() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(-53328, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsInt14() throws Exception  {
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
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt15() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsInt()
    
    @Test(expected = StackOverflowError.class)
    public void testGetValueAsInt16() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:871)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:258)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:883)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:258)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4194312);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -2.6815615859885194E154);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:879)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:258)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.68156158598852E154);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:879)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:258)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:883)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:258)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8388616);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -2.3158594532169717E77);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:879)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:258)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:871)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:258)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", -9223372034707292160L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:867)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:258)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:255)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:372)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:263)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 27);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:830)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:255)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:819)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:776)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:255)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:255)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:255)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    
    @Test
    public void testGetValueAsInt31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:790)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:255)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:870) */
        filteringParserDelegate.getValueAsInt();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getValueAsInt()
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsInt(int)
    
    /**
    @utbot.classUnderTest {@link FilteringParserDelegate}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.filter.FilteringParserDelegate#getValueAsInt(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getValueAsInt(int)}
 * @utbot.returnsFrom {@code return delegate.getValueAsInt(defaultValue);}
 *  */
    @Test
    public void testGetValueAsInt_JsonParserGetValueAsInt() throws Exception  {
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
    public void testGetValueAsInt_ThrowNullPointerException1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValueAsInt(int)
    
    @Test
    public void testGetValueAsInt33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 131080);
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
        
        assertEquals(131081, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt34() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
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
    public void testGetValueAsInt36() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2097160);
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
        
        assertEquals(2097161, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt37() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", 0L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
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
    public void testGetValueAsInt38() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 1);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt39() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt40() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    public void testGetValueAsInt41() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    
    @Test
    public void testGetValueAsInt42() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", Integer.MIN_VALUE);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(1038366032, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt43() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(5328, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt44() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(-533328, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt45() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(-53328, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt46() throws Exception  {
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
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetValueAsInt47() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    public void testGetValueAsInt48() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(-53328, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt49() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(-533328, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(1, finalFilteringParserDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetValueAsInt50() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        int actual = filteringParserDelegate.getValueAsInt(0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValueAsInt(int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetValueAsInt51() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt52() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 9]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:274)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt53() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 2.68156158598852E154);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:879)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:277)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt54() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:871)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:277)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt55() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 131080);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -3.777893186323204E22);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:879)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:277)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt56() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberLong", -9223372034707292160L);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:867)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:277)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt57() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 4);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.compareTo(BigInteger.java:3795)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:871)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:277)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt58() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 8);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", 4.022342378982779E154);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:879)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:277)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt59() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compareTo(BigDecimal.java:3124)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:883)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:277)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt60() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 2097160);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberDouble", -2.6815615859885194E154);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:298)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.base.ParserMinimalBase.reportOverflowInt(ParserMinimalBase.java:542)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToInt(ParserBase.java:879)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:277)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt61() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1856)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:372)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:282)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt62() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:819)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:776)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:274)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt63() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsInt(ParserMinimalBase.java:372)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:282)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt64() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 27);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:830)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:274)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt65() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:274)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt66() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:274)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt67() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:274)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test
    public void testGetValueAsInt68() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase._parseIntValue(ParserBase.java:797)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsInt(UTF8DataInputJsonParser.java:274)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsInt(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsInt(FilteringParserDelegate.java:871) */
        filteringParserDelegate.getValueAsInt(0);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getValueAsInt(int)
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt69() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt70() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsInt(0);
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetValueAsInt71() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getValueAsInt(0);
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832) */
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
    public void testGetBigIntegerValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal", _numberBigDecimal);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        BigInteger actual = filteringParserDelegate.getBigIntegerValue();
        
        // java.math.BigInteger has overridden equals method
        assertEquals(intVal, actual);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(20, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBigIntegerValue()
    
    @Test
    public void testGetBigIntegerValue5() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.NumberFormatException: Character N is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            java.base/java.math.BigDecimal.valueOf(BigDecimal.java:1368)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToBigInteger(ParserBase.java:932)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:674)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 8);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:671)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:745)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:671)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:671)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:482)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:671)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832) */
        filteringParserDelegate.getBigIntegerValue();
    }
    
    @Test
    public void testGetBigIntegerValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getBigIntegerValue(ParserBase.java:671)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getBigIntegerValue(FilteringParserDelegate.java:832) */
        filteringParserDelegate.getBigIntegerValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getBigIntegerValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
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
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue12() throws Exception  {
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
        
        filteringParserDelegate.getBigIntegerValue();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFloatValue()
    
    @Test
    public void testGetFloatValue1() throws Exception  {
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
        
        float actual = filteringParserDelegate.getFloatValue();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
        
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
    public void testGetFloatValue2() throws Exception  {
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
        
        float actual = filteringParserDelegate.getFloatValue();
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    @Test
    public void testGetFloatValue3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", -9223372036854775296L);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal", _numberBigDecimal);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        float actual = filteringParserDelegate.getFloatValue();
        
        org.junit.Assert.assertEquals(-9.2233722E17f, actual, 1.0E-6f);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(24, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetFloatValue4() throws Exception  {
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
        
        float actual = filteringParserDelegate.getFloatValue();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(12, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetFloatValue5() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 5);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        float actual = filteringParserDelegate.getFloatValue();
        
        org.junit.Assert.assertEquals(-533328.0f, actual, 1.0E-6f);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(9, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetFloatValue6() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        float actual = filteringParserDelegate.getFloatValue();
        
        org.junit.Assert.assertEquals(48.0f, actual, 1.0E-6f);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(9, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetFloatValue7() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[16];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        float actual = filteringParserDelegate.getFloatValue();
        
        org.junit.Assert.assertEquals(48.0f, actual, 1.0E-6f);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(9, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    
    @Test
    public void testGetFloatValue8() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 4);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        float actual = filteringParserDelegate.getFloatValue();
        
        org.junit.Assert.assertEquals(-53328.0f, actual, 1.0E-6f);
        
        JsonParser filteringParserDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        int finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid = ((Integer) getFieldValue(filteringParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid"));
        
        assertEquals(9, finalFilteringParserDelegateDelegateDelegateDelegateDelegate_numTypesValid);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFloatValue()
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue9() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue12() throws Exception  {
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
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue13() throws Exception  {
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
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue14() throws Exception  {
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
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue15() throws Exception  {
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
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue16() throws Exception  {
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
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue18() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "";
        setField(_numberBigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal", _numberBigDecimal);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:948)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue19() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -2147483640);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:35)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:487)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue20() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:484)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 11);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -9 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:120)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:482)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue22() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 5);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:36)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:468)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:745)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetFloatValue23() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue24() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numTypesValid", 16);
        BigDecimal _numberBigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(_numberBigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberBigDecimal", _numberBigDecimal);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:948)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue25() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:4000)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            com.fasterxml.jackson.core.base.ParserBase.convertNumberToDouble(ParserBase.java:948)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:703)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowFloat(ParserBase.java:819)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:776)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 20);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:830)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000', '\u0000', '\u0000', '\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue31() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 2097152);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:830)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue32() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:119)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsLong(TextBuffer.java:489)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:751)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue33() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_numberNegative", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", -2147483638);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:30)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsInt(TextBuffer.java:466)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:745)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    
    @Test
    public void testGetFloatValue34() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_intLength", 19);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.io.NumberInput.inLongRange(NumberInput.java:154)
            com.fasterxml.jackson.core.base.ParserBase._parseSlowInt(ParserBase.java:839)
            com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(ParserBase.java:772)
            com.fasterxml.jackson.core.base.ParserBase.getDoubleValue(ParserBase.java:700)
            com.fasterxml.jackson.core.base.ParserBase.getFloatValue(ParserBase.java:683)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getFloatValue(JsonParserDelegate.java:175)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getFloatValue(FilteringParserDelegate.java:850) */
        filteringParserDelegate.getFloatValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getFloatValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetFloatValue35() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        NonBlockingJsonParser delegate3 = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getFloatValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetFloatValue36() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate.getFloatValue();
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    @Test
    public void test_nextTokenWithBuffering1() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 35);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:589)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering2() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.JsonParser", "_features", 2);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipComment(UTF8DataInputJsonParser.java:2358)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSComment(UTF8DataInputJsonParser.java:2246)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2223)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering3() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:343)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:699) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering4() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
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
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:629) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:629) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering7() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:652) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering8() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:652) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering9() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering10() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 4);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", Integer.MIN_VALUE);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:481)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:495)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2236)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering11() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering12() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering13() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2213)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
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
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:481)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:495)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2215)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
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
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering17() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:677) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering18() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:629) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering19() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering20() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering21() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2835)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:652) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering25() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:617) */
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test
    public void test_nextTokenWithBuffering26() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _parsingContext);
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:629) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test
    public void test_nextTokenWithBuffering27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        Object _currentValue = createInstance("java.lang.Object");
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextTokenWithBuffering(FilteringParserDelegate.java:652) */
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _nextTokenWithBuffering(com.fasterxml.jackson.core.filter.TokenFilterContext)
    
    @Test(expected = JsonParseException.class)
    public void test_nextTokenWithBuffering28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate._nextTokenWithBuffering(null);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_nextTokenWithBuffering29() throws Exception  {
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
    public void test_nextTokenWithBuffering30() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 32);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenFilterContext tokenFilterContext = new TokenFilterContext(0, null, null, false);
        
        filteringParserDelegate._nextTokenWithBuffering(tokenFilterContext);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_nextTokenWithBuffering31() throws Exception  {
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
    
    ///region Test suites for executable com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2
    
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _nextToken2()
    
    @Test
    public void test_nextToken21() throws Exception  {
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
    
    ///region OTHER: ERROR SUITE for method _nextToken2()
    
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
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken23() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken27() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 16);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken28() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2835)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken29() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2828)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken210() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", -2147483632);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:481)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:495)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2236)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken211() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken212() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:511) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken215() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken217() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken218() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken219() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:511) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken220() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:235)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:511) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken221() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:476) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken222() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:476) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken223() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2234)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:461) */
        filteringParserDelegate._nextToken2();
    }
    
    @Test
    public void test_nextToken224() throws Exception  {
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:476) */
        filteringParserDelegate._nextToken2();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _nextToken2()
    
    @Test(expected = JsonParseException.class)
    public void test_nextToken225() throws Exception  {
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        filteringParserDelegate._nextToken2();
    }
    
    @Test(expected = StreamCorruptedException.class)
    public void test_nextToken226() throws Exception  {
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
    public void test_nextToken227() throws Exception  {
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
        // 2 occurrences of:
        // Concrete execution failed
        
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:745) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:752) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:752) */
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
        RequestPayload _requestPayload = ((RequestPayload) createInstance("com.fasterxml.jackson.core.util.RequestPayload"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.JsonParser", "_requestPayload", _requestPayload);
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:752) */
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
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:762) */
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
        TokenFilterContext tokenFilterContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(tokenFilterContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        tokenFilterContext._startHandled = true;
        
        /* This test fails because method [com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:176)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:49)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1798)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextBuffered(FilteringParserDelegate.java:762) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1027340228430100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1027340228430100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1027340228434600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027340228430100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027340228434600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1027340228725100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1027340228725100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1027340228726100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1027340228725100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1027340228726100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

