package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import java.util.TreeMap;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import java.util.Comparator;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver;
import java.util.HashMap;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.node.IntNode;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.MapType;
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
 * @utbot.executesCondition {@code (!jp.isExpectedStartArrayToken()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#isExpectedStartArrayToken()}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)
 * @utbot.returnsFrom {@code return handleNonArray(jp, ctxt);}
 *  */
    @Test
    public void testDeserialize_NotJpIsExpectedStartArrayToken() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        java.lang.String[] actual = stringArrayDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
        
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
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#isExpectedStartArrayToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !jp.isExpectedStartArrayToken()
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws IOException  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:46) */
        stringArrayDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!jp.isExpectedStartArrayToken()): True}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return handleNonArray(jp, ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:116)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:47) */
        stringArrayDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!jp.isExpectedStartArrayToken()): False}
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:53) */
        stringArrayDeserializer.deserialize(((JsonParser) uTF8StreamJsonParser), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (!jp.isExpectedStartArrayToken()): False}
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:53) */
        stringArrayDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserialize(StringArrayDeserializer.java:46) */
        stringArrayDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) null));
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
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
        byte[] key = {};
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
        int[] key1 = {};
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
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
    
    ///region OTHER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test
    public void testDeserializeWithType1() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate2, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate2, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
        stringArrayDeserializer.deserializeWithType(jsonParserSequence, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType2() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
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
    
    @Test
    public void testDeserializeWithType3() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
        stringArrayDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType4() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("jdk.internal.jimage.ImageBufferCache$2"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
        stringArrayDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType5() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:94)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:50)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
        stringArrayDeserializer.deserializeWithType(jsonParserDelegate, null, asPropertyTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType6() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Integer value = 1677721617;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:247)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:85)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringArrayDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, implType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = impl;
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringArrayDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType7() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:54)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.deserializeWithType(StringArrayDeserializer.java:110) */
        stringArrayDeserializer.deserializeWithType(jsonParserDelegate1, null, asWrapperTypeDeserializer);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeWithType8() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        HashMap _deserializers = new HashMap();
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        stringArrayDeserializer.deserializeWithType(jsonParserDelegate, null, asExternalTypeDeserializer);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeWithType9() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Integer value = Integer.MIN_VALUE;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        HashMap _deserializers = new HashMap();
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
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
    ///endregion
    
    ///region Errors report for deserializeWithType
    
    public void testDeserializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeCustom(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
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
        byte[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail", _head);
        java.lang.Object[] _freeBuffer = {null};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @512255ff)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.nextToken(NodeCursor.java:208)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149)
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
        IntNode value = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size", -255);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.node.IntNode cannot be cast to class com.fasterxml.jackson.databind.node.ContainerNode (com.fasterxml.jackson.databind.node.IntNode and com.fasterxml.jackson.databind.node.ContainerNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @512255ff)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
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
    public void test_deserializeCustom_ThrowNullPointerException_4() throws Exception  {
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
    public void test_deserializeCustom_ThrowNullPointerException_5() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deser.getNullValue()
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_6() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.VALUE_NULL;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_size", -255);
        java.lang.Object[] _freeBuffer = {null};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:95) */
        stringArrayDeserializer._deserializeCustom(treeTraversingParser, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StringArrayDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer#_deserializeCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((t = jp.nextToken()) != JsonToken.END_ARRAY)
 *  */
    @Test
    public void test_deserializeCustom_ThrowNullPointerException_8() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _head = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_head", _head);
        LinkedNode _tail = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        java.lang.Object[] value = {null};
        setField(_tail, "com.fasterxml.jackson.databind.util.LinkedNode", "value", value);
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail", _tail);
        java.lang.Object[] _freeBuffer = {null};
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_freeBuffer", _freeBuffer);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1859)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer._deserializeCustom(StringArrayDeserializer.java:93) */
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:127) */
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:118) */
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:121) */
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:116) */
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.handleNonArray(StringArrayDeserializer.java:116) */
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
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:139) */
        stringArrayDeserializer.createContextual(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateContextual1() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = stringArrayDeserializerClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        try {
            createContextualMethod.invoke(stringArrayDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual2() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
            com.fasterxml.jackson.databind.DeserializationContext.constructType(DeserializationContext.java:450)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:141) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = stringArrayDeserializerClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(stringArrayDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:256)
                com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
                com.fasterxml.jackson.databind.DeserializationContext.constructType(DeserializationContext.java:450)
                com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:141) */
            stringArrayDeserializer.createContextual(impl, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual4() throws Exception  {
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(arrayBlockingQueueDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(arrayBlockingQueueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:581)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:143) */
        stringArrayDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual5() throws Throwable  {
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        ArrayType _delegateType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(arrayBlockingQueueDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(arrayBlockingQueueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MethodProperty methodProperty = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:367)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:842)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:145)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:581)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:143) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class methodPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = stringArrayDeserializerClazz.getDeclaredMethod("createContextual", implType, methodPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = methodProperty;
        try {
            createContextualMethod.invoke(stringArrayDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual6() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:367)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:141) */
        stringArrayDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual7() throws Exception  {
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        MapType _delegateType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(arrayBlockingQueueDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(arrayBlockingQueueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:367)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:842)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:145)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:581)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:143) */
        stringArrayDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual8() throws Throwable  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:545)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:545)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:545)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findConvertingContentDeserializer(StdDeserializer.java:867)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:139) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = stringArrayDeserializerClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(stringArrayDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual9() throws Throwable  {
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(arrayBlockingQueueDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(arrayBlockingQueueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MethodProperty methodProperty = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:581)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:143) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class methodPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = stringArrayDeserializerClazz.getDeclaredMethod("createContextual", implType, methodPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = methodProperty;
        try {
            createContextualMethod.invoke(stringArrayDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual10() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:367)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:141) */
        stringArrayDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual11() throws Throwable  {
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(arrayBlockingQueueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MethodProperty methodProperty = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:581)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:143) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class methodPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = stringArrayDeserializerClazz.getDeclaredMethod("createContextual", implType, methodPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = methodProperty;
        try {
            createContextualMethod.invoke(stringArrayDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual12() throws Exception  {
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(arrayBlockingQueueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:581)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:143) */
        stringArrayDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual13() throws Throwable  {
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(arrayBlockingQueueDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(arrayBlockingQueueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MethodProperty methodProperty = ((MethodProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:581)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:143) */
        Class stringArrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class methodPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = stringArrayDeserializerClazz.getDeclaredMethod("createContextual", implType, methodPropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = methodProperty;
        try {
            createContextualMethod.invoke(stringArrayDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual14() throws Exception  {
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(arrayBlockingQueueDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        StringArrayDeserializer stringArrayDeserializer = new StringArrayDeserializer(arrayBlockingQueueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:581)
            com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.createContextual(StringArrayDeserializer.java:143) */
        stringArrayDeserializer.createContextual(impl, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1062966131479100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1062966131479100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1062966131495800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1062966131479100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1062966131495800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1062966148279400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1062966148279400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1062966148291599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1062966148279400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1062966148291599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

