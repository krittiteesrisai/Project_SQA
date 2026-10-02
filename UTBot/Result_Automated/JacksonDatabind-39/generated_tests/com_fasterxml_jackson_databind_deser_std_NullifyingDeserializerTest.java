package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import java.io.IOException;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilterContext;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import java.io.CharArrayReader;
import java.io.StringReader;
import java.io.BufferedReader;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.DupDetector;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import java.util.TreeMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_std_NullifyingDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserialize_ReturnNull_2() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        Object actual = nullifyingDeserializer.deserialize(treeTraversingParser, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserialize_ReturnNull() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        JsonParser jsonParserDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate, null);
        
        assertNull(actual);
        
        JsonParser jsonParserDelegateDelegate1 = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegateDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserDelegateDelegate_currToken == finalJsonParserDelegateDelegate_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserialize_ReturnNull_1() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.core.JsonParser#skipChildren()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserialize_ReturnNull_3() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
        
        JsonParser jsonParserSequenceDelegate1 = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegate_currToken == finalJsonParserSequenceDelegate_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserialize_ReturnNull_4() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserSequenceDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
        
        JsonParser jsonParserSequenceDelegate1 = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegate1DelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegate1DelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserSequenceDelegateDelegate_currToken == finalJsonParserSequenceDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#skipChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.skipChildren();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws IOException  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
     */
    @Test
    public void testDeserializeThrowsNPE() throws IOException  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserialize1() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        Object actual = nullifyingDeserializer.deserialize(readerBasedJsonParser, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        Object actual = nullifyingDeserializer.deserialize(filteringParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize3() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize4() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize5() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize6() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize7() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize8() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize9() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        UTF8StreamJsonParser delegate4 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        
        assertNull(finalJsonParserSequenceDelegateDelegateDelegateDelegate_currToken);
    }
    
    @Test
    public void testDeserialize10() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate2 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JsonParser jsonParserDelegate1Delegate = ((JsonParser) getFieldValue(jsonParserDelegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate1DelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate1Delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate1DelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate1DelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate1DelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken initialJsonParserDelegate1DelegateDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate1, impl);
        
        assertNull(actual);
        
        JsonParser jsonParserDelegate1Delegate1 = ((JsonParser) getFieldValue(jsonParserDelegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate1Delegate1DelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate1Delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate1Delegate1DelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate1Delegate1DelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate1Delegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate1Delegate1DelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate1Delegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate1Delegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserDelegate1DelegateDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegate1Delegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialJsonParserDelegate1DelegateDelegateDelegateDelegateDelegate_currToken == finalJsonParserDelegate1DelegateDelegateDelegateDelegateDelegate_currToken);
    }
    
    @Test
    public void testDeserialize11() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate4 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize12() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TreeTraversingParser delegate4 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        
        assertNull(finalJsonParserSequenceDelegateDelegateDelegateDelegate_currToken);
    }
    
    @Test
    public void testDeserialize13() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate5 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        
        assertNull(finalJsonParserSequenceDelegateDelegateDelegateDelegate_currToken);
    }
    
    @Test
    public void testDeserialize14() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserSequence, null);
        
        assertNull(actual);
        
        JsonParser jsonParserSequenceDelegate = ((JsonParser) getFieldValue(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserSequenceDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserSequenceDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        
        assertNull(finalJsonParserSequenceDelegateDelegateDelegateDelegate_currToken);
    }
    
    @Test
    public void testDeserialize15() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate5, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize16() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate5, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserialize17() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        UTF8StreamJsonParser delegate3 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate, null);
        
        assertNull(actual);
        
        JsonParser jsonParserDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserDelegateDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        JsonParser jsonParserDelegateDelegate1 = ((JsonParser) getFieldValue(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegate1DelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegate1DelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserDelegateDelegateDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegateDelegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalJsonParserDelegateDelegateDelegateDelegateDelegate_currToken);
        
        assertNull(finalJsonParserDelegateDelegateDelegateDelegateDelegateDelegate_currToken);
    }
    
    @Test
    public void testDeserialize18() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        Object actual = nullifyingDeserializer.deserialize(jsonParserDelegate2, null);
        
        assertNull(actual);
        
        JsonParser jsonParserDelegate2Delegate = ((JsonParser) getFieldValue(jsonParserDelegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate2DelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate2Delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate2DelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate2DelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate2DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate2DelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserDelegate2DelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegate2DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        JsonParser jsonParserDelegate2Delegate1 = ((JsonParser) getFieldValue(jsonParserDelegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate2Delegate1DelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate2Delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate2Delegate1DelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate2Delegate1DelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate2Delegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate2Delegate1DelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonParser jsonParserDelegate2Delegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate = ((JsonParser) getFieldValue(jsonParserDelegate2Delegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        JsonToken finalJsonParserDelegate2DelegateDelegateDelegateDelegateDelegate_currToken = ((JsonToken) getFieldValue(jsonParserDelegate2Delegate1DelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegateDelegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalJsonParserDelegate2DelegateDelegateDelegateDelegate_currToken);
        
        assertNull(finalJsonParserDelegate2DelegateDelegateDelegateDelegateDelegate_currToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    /// Actual number of generated tests (84) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize19() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        nullifyingDeserializer.deserialize(jsonParserDelegate2, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize20() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize21() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize22() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize23() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize24() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize25() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        nullifyingDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize26() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        nullifyingDeserializer.deserialize(jsonParserDelegate3, null);
    }
    
    @Test
    public void testDeserialize27() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741824);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741825);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize28() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\n', ' '};
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2041)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize29() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\', 't'};
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1811)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize30() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {' ', '\\'};
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2183)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1820)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize31() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\r'};
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 11);
        JsonToken _currToken1 = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1849)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2034)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate3, null);
    }
    
    @Test
    public void testDeserialize32() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 0};
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -2139095041);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2139095040);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2139095041 out of bounds for length 1]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2860)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate3, null);
    }
    
    @Test
    public void testDeserialize33() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_exposedContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:257)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize34() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:257)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize35() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize36() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:238)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize37() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent1 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent2 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_parent2, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_parent1, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent2);
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent1);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _parent2);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize38() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:362)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:367)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize39() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize40() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent1 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        TokenFilterContext _parent2 = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_parent1, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent2);
        setField(_parent, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent1);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _parent);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentLocation(FilteringParserDelegate.java:171)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:260)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize41() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize42() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        UTF8StreamJsonParser delegate4 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2860)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserialize43() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:710)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize44() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'}', '\u001F'};
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 2);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:497)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1830)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize45() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\', '\u0000'};
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:510)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2208)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1820)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize46() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize47() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize48() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'#'};
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:613)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize49() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize50() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize51() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        UTF8StreamJsonParser delegate4 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._nextAfterName(UTF8StreamJsonParser.java:851)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:687)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize52() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        CharArrayReader _reader = ((CharArrayReader) createInstance("java.io.CharArrayReader"));
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {'\r'};
        setField(delegate4, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.io.CharArrayReader.read(CharArrayReader.java:132)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1848)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2034)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize53() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._nextAfterName(ReaderBasedJsonParser.java:708)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:572)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize54() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.VALUE_STRING;
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate._nextToken2(FilteringParserDelegate.java:439)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:426)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize55() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        UTF8StreamJsonParser delegate2 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._nextAfterName(UTF8StreamJsonParser.java:853)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:687)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserialize56() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0001'};
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:484)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2036)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize57() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        StringReader _reader = ((StringReader) createInstance("java.io.StringReader"));
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {'#'};
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate3, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1805)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize58() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken1 = JsonToken.VALUE_NULL;
        setField(delegate2, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate1, null);
    }
    
    @Test
    public void testDeserialize59() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate2, null);
    }
    
    @Test
    public void testDeserialize60() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        ReaderBasedJsonParser delegate4 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.END_ARRAY;
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate4, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:358)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize61() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        setField(delegate1, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:484)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2056)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate2, impl);
    }
    
    @Test
    public void testDeserialize62() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        BufferedReader _reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {'\u0000'};
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 62);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 62);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1805)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate3, null);
    }
    
    @Test
    public void testDeserialize63() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        Object _currentValue = createInstance("java.lang.Object");
        setField(_child, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:319)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize64() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'}', '\n', '}', '}', '}', '}'};
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:605)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate3, null);
    }
    
    @Test
    public void testDeserialize65() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
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
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate3, impl);
    }
    
    @Test
    public void testDeserialize66() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _headContext);
        ReaderBasedJsonParser delegate3 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _currToken);
        JsonToken _currToken1 = JsonToken.FIELD_NAME;
        setField(delegate3, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken1);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.base.ParserMinimalBase.skipChildren(ParserMinimalBase.java:147)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:319)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize67() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1073741824);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate2, impl);
    }
    
    @Test
    public void testDeserialize68() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:485)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._releaseBuffers(ReaderBasedJsonParser.java:201)
            com.fasterxml.jackson.core.base.ParserBase.close(ParserBase.java:389)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:582)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.skipChildren(FilteringParserDelegate.java:775)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.skipChildren(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35) */
        nullifyingDeserializer.deserialize(jsonParserDelegate2, impl);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(timeout = 1000L)
    public void testDeserialize69() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test(timeout = 1000L)
    public void testDeserialize70() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_exposedContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nullifyingDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test(timeout = 1000L)
    public void testDeserialize71() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_headContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_parent", _headContext);
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(_exposedContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_startHandled", true);
        setField(_exposedContext, "com.fasterxml.jackson.core.filter.TokenFilterContext", "_needToHandleName", true);
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nullifyingDeserializer.deserialize(jsonParserDelegate1, impl);
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.TypeDeserializer#deserializeTypedFromAny(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_FIELD_NAME}
 *  */
    @Test
    public void testDeserializeWithType_TypeDeserializerDeserializeTypedFromAny() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserSequence, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeWithType_ReturnNull_1() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        Object actual = nullifyingDeserializer.deserializeWithType(filteringParserDelegate, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDeserializeWithType_ReturnNull() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link NullifyingDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentTokenId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(p.getCurrentTokenId())
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws IOException  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:45) */
        nullifyingDeserializer.deserializeWithType(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
     */
    @Test
    public void testDeserializeWithTypeThrowsNPE() throws IOException  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentTokenId(JsonParserDelegate.java:98)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentTokenId(JsonParserDelegate.java:98)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:45) */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate1, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test
    public void testDeserializeWithType1() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        
        Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class typeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = nullifyingDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, typeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = ((Object) null);
        Object actual = deserializeWithTypeMethod.invoke(nullifyingDeserializer, deserializeWithTypeMethodArguments);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType2() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        Object actual = nullifyingDeserializer.deserializeWithType(filteringParserDelegate, null, asWrapperTypeDeserializer);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType3() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserSequence, impl, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType4() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType5() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserSequence, impl, asWrapperTypeDeserializer);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType6() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserDelegate1, null, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType7() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserDelegate2, impl, asWrapperTypeDeserializer);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType8() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate5 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserSequence, null, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType9() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserDelegate2, null, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeWithType10() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        
        Object actual = nullifyingDeserializer.deserializeWithType(jsonParserDelegate5, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithType11() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate2, null, null);
    }
    
    @Test
    public void testDeserializeWithType12() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:98)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromAny(AsWrapperTypeDeserializer.java:64)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:49) */
        nullifyingDeserializer.deserializeWithType(filteringParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType13() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:139)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromAny(AsWrapperTypeDeserializer.java:64)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:49) */
        nullifyingDeserializer.deserializeWithType(jsonParserSequence, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType14() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:147)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromAny(AsWrapperTypeDeserializer.java:64)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:49) */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType15() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:147)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromAny(AsWrapperTypeDeserializer.java:64)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:49) */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType16() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MinimalClassNameIdResolver _idResolver = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:147)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:94)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromAny(AsArrayTypeDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:49) */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate, impl, asArrayTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType17() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MinimalClassNameIdResolver _idResolver = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:147)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:94)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromAny(AsArrayTypeDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:49) */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate, null, asExternalTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType18() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MinimalClassNameIdResolver _idResolver = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:147)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:94)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromAny(AsArrayTypeDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserializeWithType(NullifyingDeserializer.java:49) */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate, null, asExternalTypeDeserializer);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test(timeout = 1000L)
    public void testDeserializeWithType19() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "right", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nullifyingDeserializer.deserializeWithType(jsonParserSequence, null, asWrapperTypeDeserializer);
    }
    
    @Test(timeout = 1000L)
    public void testDeserializeWithType20() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "left", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test(timeout = 1000L)
    public void testDeserializeWithType21() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "right", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test(timeout = 1000L)
    public void testDeserializeWithType22() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "left", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        nullifyingDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    ///endregion
    
    ///region Errors report for deserializeWithType
    
    public void testDeserializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Failed requirement.
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1073069481433300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1073069481433300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1073069481439000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1073069481433300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1073069481439000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1073069481875800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1073069481875800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1073069481877100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1073069481875800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1073069481877100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

