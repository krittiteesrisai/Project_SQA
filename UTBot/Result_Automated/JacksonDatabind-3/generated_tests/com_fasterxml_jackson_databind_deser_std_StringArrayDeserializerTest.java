package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import java.util.TreeMap;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.node.LongNode;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.JsonMappingException;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_deser_std_StringArrayDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#isExpectedStartArrayToken()}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)
 * @utbot.returnsFrom {@code return handleNonArray(jp, ctxt);}
 *  */
    @Test
    public void testDeserialize_StringArrayDeserializerHandleNonArray() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        java.lang.String[] actual = stringArrayDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl));
        
        java.lang.String[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !jp.isExpectedStartArrayToken()
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws IOException  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:47) */
        stringArrayDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return handleNonArray(jp, ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:115)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:48) */
        stringArrayDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_elementDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ObjectBuffer buffer = ctxt.leaseObjectBuffer();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:54) */
        stringArrayDeserializer.deserialize(((JsonParser) uTF8StreamJsonParser), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_elementDeserializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ObjectBuffer buffer = ctxt.leaseObjectBuffer();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:54) */
        stringArrayDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_elementDeserializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#leaseObjectBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ObjectBuffer#resetAndStart()}
 * @utbot.iterates iterate the loop {@code while((t = jp.nextToken()) != JsonToken.END_ARRAY)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = _elementDeserializer.getNullValue();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_4() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.VALUE_NULL;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:66) */
        stringArrayDeserializer.deserialize(((JsonParser) treeTraversingParser), ((DeserializationContext) impl));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
     */
    @Test
    public void testDeserializeThrowsNPE() throws IOException  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartArrayToken(JsonParserDelegate.java:93)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartArrayToken(JsonParserDelegate.java:93)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:47) */
        stringArrayDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserialize1() throws Exception  {
        AbstractDeserializer abstractDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(abstractDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u001D', '\u001D', '\u001D', '\u001D', '\u001D', '\u001D', '\u001D', '\u001D',
            '\u001D'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwUnquotedSpace(ParserMinimalBase.java:472)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1668)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:51) */
        stringArrayDeserializer.deserialize(((JsonParser) readerBasedJsonParser), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(nullifyingDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:449)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1856)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:51) */
        stringArrayDeserializer.deserialize(((JsonParser) readerBasedJsonParser), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize3() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(nullifyingDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '!', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:51) */
        stringArrayDeserializer.deserialize(((JsonParser) readerBasedJsonParser), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize4() throws Exception  {
        TokenBufferDeserializer tokenBufferDeserializer = new TokenBufferDeserializer();
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(tokenBufferDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:445)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:51) */
        stringArrayDeserializer.deserialize(((JsonParser) readerBasedJsonParser), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize5() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(nullifyingDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.text.AttributeEntry");
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.nextToken(NodeCursor.java:208)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:51) */
        stringArrayDeserializer.deserialize(((JsonParser) treeTraversingParser), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(beanDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _tail = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail", _tail);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.getBeanClass(BeanDeserializerBase.java:792)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromArray(BeanDeserializerBase.java:1210)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:126)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:95)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:51) */
        stringArrayDeserializer.deserialize(((JsonParser) treeTraversingParser), ((DeserializationContext) impl));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException_2() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.Integer ([S and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:1772)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1496)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:83)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:109) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringArrayDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringArrayDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        stringArrayDeserializer.deserializeWithType(jsonParserDelegate, null, asPropertyTypeDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException_1() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Object left = createInstance("java.util.TreeMap$Entry");
        short[] key1 = {};
        setField(left, "java.util.TreeMap$Entry", "key", key1);
        setField(root, "java.util.TreeMap$Entry", "left", left);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        stringArrayDeserializer.deserializeWithType(jsonParserDelegate, null, asPropertyTypeDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromArray(jp, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_2() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:82)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:109) */
        stringArrayDeserializer.deserializeWithType(null, null, asWrapperTypeDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromArray(jp, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws IOException  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:109) */
        stringArrayDeserializer.deserializeWithType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromArray(jp, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_1() throws IOException  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException] */
        stringArrayDeserializer.deserializeWithType(null, null, asPropertyTypeDeserializer);
    }
    ///endregion
    
    ///region Errors report for deserializeWithType
    
    public void testDeserializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeCustom(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while((t = jp.nextToken()) != JsonToken.END_ARRAY)
 *  */
    @Test
    public void test_deserializeCustom_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size", -255);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1649)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93) */
        stringArrayDeserializer._deserializeCustom(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: while((t = jp.nextToken()) != JsonToken.END_ARRAY)
 *  */
    @Test
    public void test_deserializeCustom_ThrowClassCastException() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        LongNode value = ((LongNode) createInstance("com.fasterxml.jackson.databind.node.LongNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail", _head);
        java.lang.Object[] _freeBuffer = {null};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.node.LongNode cannot be cast to class com.fasterxml.jackson.databind.node.ContainerNode (com.fasterxml.jackson.databind.node.LongNode and com.fasterxml.jackson.databind.node.ContainerNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93) */
        stringArrayDeserializer._deserializeCustom(treeTraversingParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: while((t = jp.nextToken()) != JsonToken.END_ARRAY)
 *  */
    @Test
    public void test_deserializeCustom_ThrowClassCastException_1() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        byte[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size", -255);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.nextToken(NodeCursor.java:208)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93) */
        stringArrayDeserializer._deserializeCustom(treeTraversingParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ObjectBuffer buffer = ctxt.leaseObjectBuffer();
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException() throws IOException  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:86) */
        stringArrayDeserializer._deserializeCustom(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((t = jp.nextToken()) != JsonToken.END_ARRAY)
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_7() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93) */
        stringArrayDeserializer._deserializeCustom(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((t = jp.nextToken()) != JsonToken.END_ARRAY)
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_1() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail", _head);
        java.lang.Object[] _freeBuffer = {null};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93) */
        stringArrayDeserializer._deserializeCustom(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((t = jp.nextToken()) != JsonToken.END_ARRAY)
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_5() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size", -255);
        java.lang.Object[] _freeBuffer = {null};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93) */
        stringArrayDeserializer._deserializeCustom(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((t = jp.nextToken()) != JsonToken.END_ARRAY)
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_3() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size", -255);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93) */
        stringArrayDeserializer._deserializeCustom(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.iterates iterate the loop {@code while((t = jp.nextToken()) != JsonToken.END_ARRAY)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deser.deserialize(jp, ctxt)
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_6() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size", -255);
        java.lang.Object[] _freeBuffer = {};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:95) */
        stringArrayDeserializer._deserializeCustom(treeTraversingParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.iterates iterate the loop {@code while((t = jp.nextToken()) != JsonToken.END_ARRAY)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deser.deserialize(jp, ctxt)
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_4() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size", -255);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:95) */
        stringArrayDeserializer._deserializeCustom(readerBasedJsonParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.iterates iterate the loop {@code while((t = jp.nextToken()) != JsonToken.END_ARRAY)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deser.deserialize(jp, ctxt)
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_2() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        LinkedNode _tail = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail", _tail);
        java.lang.Object[] _freeBuffer = {null};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:95) */
        stringArrayDeserializer._deserializeCustom(treeTraversingParser, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new String[] { (jp.getCurrentToken() == JsonToken.VALUE_NULL) ? null : _parseString(jp, ctxt) };}
 *  */
    @Test
    public void testHandleNonArray_ReturnNewArrayOfString_1() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class treeTraversingParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", treeTraversingParserType, implType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = treeTraversingParser;
        handleNonArrayMethodArguments[1] = impl;
        java.lang.String[] actual = ((java.lang.String[]) handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments));
        
        java.lang.String[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new String[] { (jp.getCurrentToken() == JsonToken.VALUE_NULL) ? null : _parseString(jp, ctxt) };}
 *  */
    @Test
    public void testHandleNonArray_ReturnNewArrayOfString() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserDelegateType, implType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = jsonParserDelegate;
        handleNonArrayMethodArguments[1] = impl;
        java.lang.String[] actual = ((java.lang.String[]) handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments));
        
        java.lang.String[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new String[] { (jp.getCurrentToken() == JsonToken.VALUE_NULL) ? null : _parseString(jp, ctxt) };}
 *  */
    @Test
    public void testHandleNonArray_ReturnNewArrayOfString_2() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -254);
        
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class jsonParserSequenceType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserSequenceType, implType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = jsonParserSequence;
        handleNonArrayMethodArguments[1] = impl;
        java.lang.String[] actual = ((java.lang.String[]) handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments));
        
        java.lang.String[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (jp.getCurrentToken() == JsonToken.VALUE_NULL)
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_1() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:126) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserType, implType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = ((Object) null);
        handleNonArrayMethodArguments[1] = impl;
        try {
            handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (jp.getCurrentToken() == JsonToken.VALUE_STRING) && ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_2() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:117) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserType, implType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = ((Object) null);
        handleNonArrayMethodArguments[1] = impl;
        try {
            handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): True}
 * @utbot.executesCondition {@code (jp.getCurrentToken() == JsonToken.VALUE_STRING): True}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: str.length() == 0
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_3() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 16384);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:120) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class treeTraversingParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", treeTraversingParserType, implType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = treeTraversingParser;
        handleNonArrayMethodArguments[1] = impl;
        try {
            handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:115) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserType, deserializationContextType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = ((Object) null);
        handleNonArrayMethodArguments[1] = ((Object) null);
        try {
            handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): False}
 * @utbot.executesCondition {@code ((jp.getCurrentToken() == JsonToken.VALUE_NULL)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_parseString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new String[] { (jp.getCurrentToken() == JsonToken.VALUE_NULL) ? null : _parseString(jp, ctxt) };}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return new String[] { (jp.getCurrentToken() == JsonToken.VALUE_NULL) ? null : _parseString(jp, ctxt) };
 *  */
    @Test(expected = JsonMappingException.class)
    public void testHandleNonArray_ThrowJsonMappingException() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserDelegateType, implType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = jsonParserDelegate;
        handleNonArrayMethodArguments[1] = impl;
        try {
            handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
     */
    @Test
    public void testHandleNonArrayThrowsNPE() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:115) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class jsonParserDelegate1Type = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method handleNonArrayMethod = stringArrayDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserDelegate1Type, deserializationContextType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[2];
        handleNonArrayMethodArguments[0] = jsonParserDelegate1;
        handleNonArrayMethodArguments[1] = ((Object) null);
        try {
            handleNonArrayMethod.invoke(stringArrayDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual
    
    ///region FUZZER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
     */
    @Test
    public void testCreateContextualThrowsNPE() throws JsonMappingException  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findConvertingContentDeserializer(StdDeserializer.java:865)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:138) */
        stringArrayDeserializer.createContextual(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1062685869098899 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1062685869098899.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1062685869111600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1062685869098899.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1062685869111600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

