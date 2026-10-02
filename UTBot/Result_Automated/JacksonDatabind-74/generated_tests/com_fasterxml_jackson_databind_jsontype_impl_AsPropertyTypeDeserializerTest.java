package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import java.io.IOException;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import java.util.TreeMap;
import com.fasterxml.jackson.databind.type.MapType;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import java.util.Comparator;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_jsontype_impl_AsPropertyTypeDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeTypedForId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#_deserializeTypedForId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = p.getText();
 *  */
    @Test
    public void test_deserializeTypedForId_ThrowNullPointerException() throws IOException  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException] */
        asPropertyTypeDeserializer._deserializeTypedForId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#_deserializeTypedForId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = p.getText();
 *  */
    @Test
    public void test_deserializeTypedForId_ThrowNullPointerException_1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException] */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#_deserializeTypedForId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_deserializeTypedForId_ThrowNullPointerException_2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException] */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserSequence, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeTypedForId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#_deserializeTypedForId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String typeId = p.getText();
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void test_deserializeTypedForId_ThrowStringIndexOutOfBoundsException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#_deserializeTypedForId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String typeId = p.getText();
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void test_deserializeTypedForId_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeTypedForId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void test_deserializeTypedForId1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(AsPropertyTypeDeserializer.java:112) */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserSequence, null, null);
    }
    
    @Test
    public void test_deserializeTypedForId2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(AsPropertyTypeDeserializer.java:112) */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserSequence, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedForId3() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(AsPropertyTypeDeserializer.java:112) */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserSequence, impl, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedForId4() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(AsPropertyTypeDeserializer.java:112) */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserDelegate1, impl, null);
    }
    
    @Test
    public void test_deserializeTypedForId5() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(AsPropertyTypeDeserializer.java:112) */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserDelegate, null, null);
    }
    
    @Test
    public void test_deserializeTypedForId6() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._getText2(UTF8DataInputJsonParser.java:292)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:184)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:142)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(AsPropertyTypeDeserializer.java:111) */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserDelegate, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedForId7() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        char[] _currentSegment = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 9);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:143)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(AsPropertyTypeDeserializer.java:112) */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeTypedForId8() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = new char[32];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 29);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(AsPropertyTypeDeserializer.java:112) */
        asPropertyTypeDeserializer._deserializeTypedForId(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeTypedUsingDefaultImpl(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#_deserializeTypedUsingDefaultImpl(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code (tb != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deser.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeTypedUsingDefaultImpl_ThrowIllegalStateException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _deserializeTypedUsingDefaultImpl(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl1() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _first);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483647);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(treeTraversingParser, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_first = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first");
            long finalTokenBuffer_first_tokenTypes = ((Long) getFieldValue(tokenBuffer_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            
            assertEquals(2L, finalTokenBuffer_first_tokenTypes);
            
            assertEquals(-2147483646, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl2() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 4);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            JsonWriteContext _parent = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _parent);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            JsonWriteContext initialTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(treeTraversingParser, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            JsonWriteContext finalTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
            
            assertEquals(131072L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(5, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl3() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483646);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            JsonWriteContext _parent = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _parent);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            JsonWriteContext initialTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserSequence, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            JsonWriteContext finalTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
            
            assertEquals(2L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(-2147483645, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl4() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            Object _next = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_next", _next);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 16);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            JsonWriteContext _parent = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _parent);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object initialTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            JsonWriteContext initialTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(treeTraversingParser, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object finalTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            JsonWriteContext finalTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
            
            assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
            
            assertEquals(1, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl5() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 4);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            JsonWriteContext _parent = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _parent);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            JsonWriteContext initialTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserDelegate, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            JsonWriteContext finalTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
            
            assertEquals(131072L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(5, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl6() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 4);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserDelegate, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            
            assertEquals(131072L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(5, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl7() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483646);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserSequence, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            
            assertEquals(2L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(-2147483645, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl8() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 16);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            JsonWriteContext _parent = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _parent);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object initialTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            JsonWriteContext initialTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(filteringParserDelegate, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object finalTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            JsonWriteContext finalTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
            
            assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
            
            assertEquals(1, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl9() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483647);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserDelegate, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            
            assertEquals(2L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(-2147483646, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl10() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            JsonWriteContext _parent = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _parent);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            JsonWriteContext initialTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(treeTraversingParser, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            JsonWriteContext finalTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
            
            assertEquals(32L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(2, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl11() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 16);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object initialTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(filteringParserDelegate, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object finalTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            
            assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
            
            assertEquals(1, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl12() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483646);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(treeTraversingParser, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            
            assertEquals(2L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(-2147483645, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl13() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            JsonWriteContext _parent = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _parent);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            JsonWriteContext initialTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(filteringParserDelegate, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            JsonWriteContext finalTokenBuffer_writeContext = ((JsonWriteContext) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext"));
            
            assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
            
            assertEquals(32L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(2, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl14() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483646);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(treeTraversingParser, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            
            assertEquals(2L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(-2147483645, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl15() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483647);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            Object actual = asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserDelegate, impl, tokenBuffer);
            
            assertNull(actual);
            
            Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
            long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
            int finalTokenBuffer_appendAt = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt"));
            
            assertEquals(2L, finalTokenBuffer_last_tokenTypes);
            
            assertEquals(-2147483646, finalTokenBuffer_appendAt);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeTypedUsingDefaultImpl(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeTypedUsingDefaultImpl16() throws Throwable  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            Class asPropertyTypeDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
            Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class tokenBufferType = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
            Method _deserializeTypedUsingDefaultImplMethod = asPropertyTypeDeserializerClazz.getDeclaredMethod("_deserializeTypedUsingDefaultImpl", parserType, implType, tokenBufferType);
            _deserializeTypedUsingDefaultImplMethod.setAccessible(true);
            java.lang.Object[] _deserializeTypedUsingDefaultImplMethodArguments = new java.lang.Object[3];
            _deserializeTypedUsingDefaultImplMethodArguments[0] = parser;
            _deserializeTypedUsingDefaultImplMethodArguments[1] = impl;
            _deserializeTypedUsingDefaultImplMethodArguments[2] = ((Object) null);
            try {
                _deserializeTypedUsingDefaultImplMethod.invoke(asPropertyTypeDeserializer, _deserializeTypedUsingDefaultImplMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeTypedUsingDefaultImpl17() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(treeTraversingParser, null, tokenBuffer);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeTypedUsingDefaultImpl(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl18() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            Object comparator = createInstance("java.lang.ProcessEnvironment$NameComparator");
            setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483647);
            Object _objectId = createInstance("java.lang.Object");
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _objectId);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
                java.base/java.lang.ProcessEnvironment$NameComparator.compare(ProcessEnvironment.java:195)
                java.base/java.util.TreeMap.compare(TreeMap.java:1570)
                java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
                java.base/java.util.TreeMap.put(TreeMap.java:785)
                java.base/java.util.TreeMap.put(TreeMap.java:534)
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1893)
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1841)
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1767)
                com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1098)
                com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:670)
                com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:141) */
            asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(null, impl, tokenBuffer);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl19() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            Object comparator = createInstance("java.lang.ProcessEnvironment$NameComparator");
            setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
            Object root = createInstance("java.util.TreeMap$Entry");
            Object key = createInstance("java.lang.Object");
            setField(root, "java.util.TreeMap$Entry", "key", key);
            setField(_nativeIds, "java.util.TreeMap", "root", root);
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 4);
            DeserializationFeature _typeId = DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL;
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
                java.base/java.lang.ProcessEnvironment$NameComparator.compare(ProcessEnvironment.java:195)
                java.base/java.util.TreeMap.put(TreeMap.java:795)
                java.base/java.util.TreeMap.put(TreeMap.java:534)
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1896)
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1841)
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1767)
                com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1098)
                com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:670)
                com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:141) */
            asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(null, impl, tokenBuffer);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl20() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.ProcessEnvironment$NameComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        Object _typeId = createInstance("java.lang.Object");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.ProcessEnvironment$NameComparator.compare(ProcessEnvironment.java:195)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
            java.base/java.util.TreeMap.put(TreeMap.java:785)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1896)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1841)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1767)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1098)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:670)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:141) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(null, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl21() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.ProcessEnvironment$NameComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        Object _typeId = createInstance("java.lang.Object");
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.ProcessEnvironment$NameComparator.compare(ProcessEnvironment.java:195)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1896)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1841)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1767)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1098)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:670)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:141) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(null, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl22() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ThrowableDeserializer _defaultImplDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:140)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(filteringParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl23() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ThrowableDeserializer _defaultImplDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(filteringParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl24() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.util.JsonParserDelegate.hasToken(JsonParserDelegate.java:118)
                com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35)
                com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
            asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserDelegate, impl, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl25() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_next", _first);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _first);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(filteringParserDelegate, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl26() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate3 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", -255L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _first);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserSequence, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl27() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_next", _first);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _first);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(filteringParserDelegate, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl28() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserDelegate1, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl29() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", -2147483646);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
            JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTokenLocation(UTF8StreamJsonParser.java:3696)
                com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:246)
                com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:142) */
            asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(uTF8StreamJsonParser, impl, tokenBuffer);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl30() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(treeTraversingParser, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl31() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendAt", 1);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserDelegate1, null, tokenBuffer);
    }
    
    @Test
    public void test_deserializeTypedUsingDefaultImpl32() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FailingDeserializer _defaultImplDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_hasNativeId", true);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.FailingDeserializer.deserialize(FailingDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146) */
        asPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(jsonParserDelegate1, null, tokenBuffer);
    }
    ///endregion
    
    ///region Errors report for _deserializeTypedUsingDefaultImpl
    
    public void test_deserializeTypedUsingDefaultImpl_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromAny
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeTypedFromAny(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromAny(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer#deserializeTypedFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.deserializeTypedFromArray(p, ctxt);
 *  */
    @Test
    public void testDeserializeTypedFromAny_ThrowClassCastException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromAny] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        asPropertyTypeDeserializer.deserializeTypedFromAny(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromAny(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return deserializeTypedFromObject(p, ctxt);
 *  */
    @Test
    public void testDeserializeTypedFromAny_ThrowClassCastException_1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        int[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromAny] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        asPropertyTypeDeserializer.deserializeTypedFromAny(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromAny(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.getCurrentToken() == JsonToken.START_ARRAY
 *  */
    @Test
    public void testDeserializeTypedFromAny_ThrowNullPointerException() throws IOException  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromAny] produces [java.lang.NullPointerException] */
        asPropertyTypeDeserializer.deserializeTypedFromAny(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeTypedFromAny(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromAny(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.getCurrentToken() == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeTypedFromObject(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeTypedFromAny_ThrowIllegalStateException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _defaultImplDeserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asPropertyTypeDeserializer.deserializeTypedFromAny(jsonParserSequence, null);
    }
    ///endregion
    
    ///region Errors report for deserializeTypedFromAny
    
    public void testDeserializeTypedFromAny_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeTypedFromObject_ThrowClassCastException() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        Class asPropertyTypeDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method deserializeTypedFromObjectMethod = asPropertyTypeDeserializerClazz.getDeclaredMethod("deserializeTypedFromObject", parserType, deserializationContextType);
        deserializeTypedFromObjectMethod.setAccessible(true);
        java.lang.Object[] deserializeTypedFromObjectMethodArguments = new java.lang.Object[2];
        deserializeTypedFromObjectMethodArguments[0] = parser;
        deserializeTypedFromObjectMethodArguments[1] = ((Object) null);
        try {
            deserializeTypedFromObjectMethod.invoke(asPropertyTypeDeserializer, deserializeTypedFromObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeTypedFromObject_ThrowClassCastException_1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        asPropertyTypeDeserializer.deserializeTypedFromObject(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeTypedFromObject_ThrowClassCastException_2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -10485761;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Object right = createInstance("java.util.TreeMap$Entry");
        int[] key1 = {};
        setField(right, "java.util.TreeMap$Entry", "key", key1);
        setField(root, "java.util.TreeMap$Entry", "right", right);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        asPropertyTypeDeserializer.deserializeTypedFromObject(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.canReadTypeId()
 *  */
    @Test
    public void testDeserializeTypedFromObject_ThrowNullPointerException() throws IOException  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException] */
        asPropertyTypeDeserializer.deserializeTypedFromObject(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t != JsonToken.FIELD_NAME): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#canReadTypeId()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#_deserializeTypedUsingDefaultImpl(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _deserializeTypedUsingDefaultImpl(p, ctxt, null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeTypedFromObject_ThrowIllegalStateException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _defaultImplDeserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeTypedFromObject1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeTypedFromObject2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeTypedFromObject3() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = asPropertyTypeDeserializer.deserializeTypedFromObject(jsonParserSequence, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeTypedFromObject4() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            Object actual = asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
            
            assertNull(actual);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testDeserializeTypedFromObject5() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        NullifyingDeserializer _defaultImplDeserializer = ((NullifyingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, null);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeTypedFromObject6() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
        
        assertNull(actual);
    }
    
    @Test
    public void testDeserializeTypedFromObject7() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        NullifyingDeserializer _defaultImplDeserializer = ((NullifyingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeTypedFromObject8() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _defaultImplDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test
    public void testDeserializeTypedFromObject9() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _baseType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:110)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:158)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:88) */
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test
    public void testDeserializeTypedFromObject10() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(TypeDeserializer.java:137)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:88) */
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test
    public void testDeserializeTypedFromObject11() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:110)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:158)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:88) */
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test
    public void testDeserializeTypedFromObject12() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ThrowableDeserializer _defaultImplDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:88) */
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeTypedFromObject13() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "value", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:72) */
        Class asPropertyTypeDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method deserializeTypedFromObjectMethod = asPropertyTypeDeserializerClazz.getDeclaredMethod("deserializeTypedFromObject", parserType, implType);
        deserializeTypedFromObjectMethod.setAccessible(true);
        java.lang.Object[] deserializeTypedFromObjectMethodArguments = new java.lang.Object[2];
        deserializeTypedFromObjectMethodArguments[0] = parser;
        deserializeTypedFromObjectMethodArguments[1] = impl;
        try {
            deserializeTypedFromObjectMethod.invoke(asPropertyTypeDeserializer, deserializeTypedFromObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeTypedFromObject14() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("com.sun.org.apache.xerces.internal.impl.xs.XSConstraints$1"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(TypeDeserializer.java:137)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:88) */
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test
    public void testDeserializeTypedFromObject15() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "value", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:72) */
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test
    public void testDeserializeTypedFromObject16() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:63)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedUsingDefaultImpl(AsPropertyTypeDeserializer.java:146)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:88) */
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserializeTypedFromObject17() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        String value = "";
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:251)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:51)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId(ClassNameIdResolver.java:42)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:72) */
        asPropertyTypeDeserializer.deserializeTypedFromObject(jsonParserSequence, impl);
    }
    
    @Test
    public void testDeserializeTypedFromObject18() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        EnumSetDeserializer enumSetDeserializer = ((EnumSetDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        _deserializers.put(string, enumSetDeserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        String value = "";
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1100)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1075)
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.handleNonArray(EnumSetDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserialize(EnumSetDeserializer.java:127)
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.deserialize(EnumSetDeserializer.java:18)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:256)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.deserializeTypedFromObject(AsPropertyTypeDeserializer.java:72) */
        Class asPropertyTypeDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method deserializeTypedFromObjectMethod = asPropertyTypeDeserializerClazz.getDeclaredMethod("deserializeTypedFromObject", parserType, implType);
        deserializeTypedFromObjectMethod.setAccessible(true);
        java.lang.Object[] deserializeTypedFromObjectMethodArguments = new java.lang.Object[2];
        deserializeTypedFromObjectMethodArguments[0] = parser;
        deserializeTypedFromObjectMethodArguments[1] = impl;
        try {
            deserializeTypedFromObjectMethod.invoke(asPropertyTypeDeserializer, deserializeTypedFromObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeTypedFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject19() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject20() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject21() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(jsonParserSequence, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject22() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject23() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject24() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject25() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject26() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ResolvedRecursiveType _valueType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject27() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ResolvedRecursiveType _valueType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeTypedFromObject28() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer.deserializeTypedFromObject(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region Errors report for deserializeTypedFromObject
    
    public void testDeserializeTypedFromObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.getTypeInclusion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeInclusion()
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#getTypeInclusion()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetTypeInclusion_Return() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        JsonTypeInfo.As actual = asPropertyTypeDeserializer.getTypeInclusion();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer.forProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forProperty(com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#forProperty(com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((prop == _property)): True}
 * @utbot.returnsFrom {@code return (prop == _property) ? this : new AsPropertyTypeDeserializer(this, prop);}
 *  */
    @Test
    public void testForProperty_PropEquals_property() {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        
        AsPropertyTypeDeserializer actual = ((AsPropertyTypeDeserializer) asPropertyTypeDeserializer.forProperty(null));
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
    }
    
    /**
    @utbot.classUnderTest {@link AsPropertyTypeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer#forProperty(com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((prop == _property)): False}
 * @utbot.returnsFrom {@code return (prop == _property) ? this : new AsPropertyTypeDeserializer(this, prop);}
 *  */
    @Test
    public void testForProperty_PropNotEquals_property() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapProperty _property = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        
        AsPropertyTypeDeserializer actual = ((AsPropertyTypeDeserializer) asPropertyTypeDeserializer.forProperty(null));
        
        AsPropertyTypeDeserializer expected = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        JsonTypeInfo.As actual_inclusion = actual._inclusion;
        assertNull(actual_inclusion);
        
        TypeIdResolver actual_idResolver = actual._idResolver;
        assertNull(actual_idResolver);
        
        JavaType actual_baseType = actual._baseType;
        assertNull(actual_baseType);
        
        BeanProperty actual_property = actual._property;
        assertNull(actual_property);
        
        JavaType actual_defaultImpl = actual._defaultImpl;
        assertNull(actual_defaultImpl);
        
        String actual_typePropertyName = actual._typePropertyName;
        assertNull(actual_typePropertyName);
        
        boolean actual_typeIdVisible = actual._typeIdVisible;
        assertFalse(actual_typeIdVisible);
        
        Map actual_deserializers = actual._deserializers;
        assertNull(actual_deserializers);
        
        JsonDeserializer actual_defaultImplDeserializer = actual._defaultImplDeserializer;
        assertNull(actual_defaultImplDeserializer);
        
        Map finalAsPropertyTypeDeserializer_deserializers = asPropertyTypeDeserializer._deserializers;
        
        assertNull(finalAsPropertyTypeDeserializer_deserializers);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1082559369442600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1082559369442600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1082559369448800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082559369442600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082559369448800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1082559369828500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1082559369828500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1082559369830600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082559369828500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082559369830600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1082559370508400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1082559370508400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1082559370509499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082559370508400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082559370509499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

