package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.Collection;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.util.ConstantValueInstantiator;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.sun.org.apache.xerces.internal.impl.xs.util.ObjectListImpl;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.FloatDeser;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer;
import java.util.TreeMap;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_deser_std_StringCollectionDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#isExpectedStartArrayToken()}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)
 * @utbot.returnsFrom {@code return handleNonArray(p, ctxt, result);}
 *  */
    @Test
    public void testDeserialize_StringCollectionDeserializerHandleNonArray() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StringCollectionDeserializer _valueDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_skipNullValues", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        Collection actual = stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl), ((Collection) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !p.isExpectedStartArrayToken()
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:179) */
        stringCollectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null), ((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return handleNonArray(p, ctxt, result);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:265)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null), ((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return handleNonArray(p, ctxt, result);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null), ((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return handleNonArray(p, ctxt, result);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:280)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return handleNonArray(p, ctxt, result);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_4() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        SimpleType _containerType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:209) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null), ((Collection) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize1() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate2), ((DeserializationContext) null), ((Collection) null));
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StringCollectionDeserializer _valueDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.JsonParser.nextTextValue(JsonParser.java:840)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom(StringCollectionDeserializer.java:224)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:184) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize3() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StringCollectionDeserializer _valueDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:150)
            com.fasterxml.jackson.core.JsonParser.nextTextValue(JsonParser.java:840)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom(StringCollectionDeserializer.java:224)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:184) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize4() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:209) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize5() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize6() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:209) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize7() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:265)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) null), ((Collection) null));
    }
    
    @Test
    public void testDeserialize8() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:265)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null), ((Collection) null));
    }
    
    @Test
    public void testDeserialize9() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize10() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ThrowableDeserializer _valueDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:282)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize11() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdDelegatingDeserializer _valueDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserialize(StdDelegatingDeserializer.java:169)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:282)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize12() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize13() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ArrayType _containerType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize14() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 65536);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:898)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseString(StdDeserializer.java:566)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:282)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize15() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StringCollectionDeserializer _valueDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:217)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:217)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:217)
            com.fasterxml.jackson.core.JsonParser.nextTextValue(JsonParser.java:840)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom(StringCollectionDeserializer.java:224)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:184) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate2), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize16() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ArrayType _containerType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) null), ((Collection) null));
    }
    
    @Test
    public void testDeserialize17() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:209) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate2), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize18() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:209) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate3), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test
    public void testDeserialize19() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ArrayType _containerType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection)
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize20() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ArrayType _containerType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize21() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        CollectionType _containerType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize22() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ArrayType _containerType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize23() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        CollectionType _containerType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize24() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ArrayType _containerType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize25() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        CollectionType _containerType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl), ((Collection) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Collection<String> result = (Collection<String>) _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowClassCastException() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        byte[] _value = {};
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.util.ConstantValueInstantiator", "_value", _value);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Collection ([B and java.util.Collection are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:169) */
        stringCollectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Collection<String> result = (Collection<String>) _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException1() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:169) */
        stringCollectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserialize(p, ctxt, result);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_11() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        ResolvedRecursiveType _containerType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:170) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return deserialize(p, ctxt, result);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserialize(p, ctxt, result);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_21() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_skipNullValues", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:265)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:170) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserialize(p, ctxt, result);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_41() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:265)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:170) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserialize(p, ctxt, result);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_31() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:170) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _delegateDeserializer.deserialize(p, ctxt)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        stringCollectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _delegateDeserializer.deserialize(p, ctxt)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_1() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer1 = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer1);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        stringCollectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserialize26() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer1 = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.requiresCustomCodec(JsonParserDelegate.java:94)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:550)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:167) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize27() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        Object _value = createInstance("java.util.ImmutableCollections$SetN");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.util.ConstantValueInstantiator", "_value", _value);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        JsonNodeDeserializer _nullProvider = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_nullProvider", _nullProvider);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:180)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:170) */
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize28() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer1 = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:217)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:217)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:155)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:167) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize29() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer2 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserialize(StringCollectionDeserializer.java:167) */
        stringCollectionDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize30() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize31() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        ArrayType _delegateType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        stringCollectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize32() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer1 = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        MapLikeType _beanType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize33() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        MapLikeType _containerType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize34() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        ObjectListImpl _value = ((ObjectListImpl) createInstance("com.sun.org.apache.xerces.internal.impl.xs.util.ObjectListImpl"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.util.ConstantValueInstantiator", "_value", _value);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        MapLikeType _containerType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize35() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        ArrayType _arrayDelegateType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType", _arrayDelegateType);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) nonBlockingJsonParser), ((DeserializationContext) impl));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize36() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        Object _withArgsCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) readerBasedJsonParser), ((DeserializationContext) impl));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize37() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _fromStringCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator", _fromStringCreator);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) impl));
    }
    
    @Test(expected = InvalidDefinitionException.class)
    public void testDeserialize38() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) impl));
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.withResolved
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withResolved(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean)}
 * @utbot.executesCondition {@code (_unwrapSingle == unwrapSingle): True}
 * @utbot.executesCondition {@code (_nullProvider == nuller): True}
 * @utbot.executesCondition {@code (_valueDeserializer == valueDeser): True}
 * @utbot.executesCondition {@code (_delegateDeserializer == delegateDeser): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithResolved__delegateDeserializerEqualsDelegateDeser() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        StringCollectionDeserializer actual = stringCollectionDeserializer.withResolved(null, null, null, null);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JavaType actual_containerType = actual._containerType;
        assertNull(actual_containerType);
        
        NullValueProvider actual_nullProvider = actual._nullProvider;
        assertNull(actual_nullProvider);
        
        Boolean actual_unwrapSingle = actual._unwrapSingle;
        assertNull(actual_unwrapSingle);
        
        boolean actual_skipNullValues = actual._skipNullValues;
        assertFalse(actual_skipNullValues);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method withResolved(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider, java.lang.Boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return new StringCollectionDeserializer(_containerType, _valueInstantiator, delegateDeser, valueDeser, nuller, unwrapSingle);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean)}
 * @utbot.executesCondition {@code (_unwrapSingle == unwrapSingle): False}
 * @utbot.returnsFrom {@code return new StringCollectionDeserializer(_containerType, _valueInstantiator, delegateDeser, valueDeser, nuller, unwrapSingle);}
 *  */
    @Test
    public void testWithResolved__unwrapSingleNotEqualsUnwrapSingle() throws Exception  {
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
            Boolean _unwrapSingle = false;
            setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
            
            StringCollectionDeserializer actual = stringCollectionDeserializer.withResolved(null, null, null, null);
            
            StringCollectionDeserializer expected = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
            Class _valueClass = Object.class;
            setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            assertNull(actual_valueDeserializer);
            
            ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
            assertNull(actual_valueInstantiator);
            
            JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
            assertNull(actual_delegateDeserializer);
            
            JavaType actual_containerType = actual._containerType;
            assertNull(actual_containerType);
            
            NullValueProvider actual_nullProvider = actual._nullProvider;
            assertNull(actual_nullProvider);
            
            Boolean actual_unwrapSingle = actual._unwrapSingle;
            assertNull(actual_unwrapSingle);
            
            boolean actual_skipNullValues = actual._skipNullValues;
            assertFalse(actual_skipNullValues);
            
            Class expected_valueClass = expected._valueClass;
            Class actual_valueClass = actual._valueClass;
            assertEquals(Class.class, actual_valueClass.getClass());
            
        } finally {
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean)}
 * @utbot.executesCondition {@code (_unwrapSingle == unwrapSingle): True}
 * @utbot.executesCondition {@code (_nullProvider == nuller): True}
 * @utbot.executesCondition {@code (_valueDeserializer == valueDeser): True}
 * @utbot.executesCondition {@code (_delegateDeserializer == delegateDeser): False}
 * @utbot.returnsFrom {@code return new StringCollectionDeserializer(_containerType, _valueInstantiator, delegateDeser, valueDeser, nuller, unwrapSingle);}
 *  */
    @Test
    public void testWithResolved__delegateDeserializerNotEqualsDelegateDeser() throws Exception  {
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
            JsonNodeDeserializer.ArrayDeserializer _delegateDeserializer = ((JsonNodeDeserializer.ArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer"));
            setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
            
            StringCollectionDeserializer actual = stringCollectionDeserializer.withResolved(null, null, null, null);
            
            StringCollectionDeserializer expected = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
            Class _valueClass = Object.class;
            setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            assertNull(actual_valueDeserializer);
            
            ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
            assertNull(actual_valueInstantiator);
            
            JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
            assertNull(actual_delegateDeserializer);
            
            JavaType actual_containerType = actual._containerType;
            assertNull(actual_containerType);
            
            NullValueProvider actual_nullProvider = actual._nullProvider;
            assertNull(actual_nullProvider);
            
            Boolean actual_unwrapSingle = actual._unwrapSingle;
            assertNull(actual_unwrapSingle);
            
            boolean actual_skipNullValues = actual._skipNullValues;
            assertFalse(actual_skipNullValues);
            
            Class expected_valueClass = expected._valueClass;
            Class actual_valueClass = actual._valueClass;
            assertEquals(Class.class, actual_valueClass.getClass());
            
        } finally {
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean)}
 * @utbot.executesCondition {@code (_unwrapSingle == unwrapSingle): True}
 * @utbot.executesCondition {@code (_nullProvider == nuller): True}
 * @utbot.executesCondition {@code (_valueDeserializer == valueDeser): False}
 * @utbot.returnsFrom {@code return new StringCollectionDeserializer(_containerType, _valueInstantiator, delegateDeser, valueDeser, nuller, unwrapSingle);}
 *  */
    @Test
    public void testWithResolved__valueDeserializerNotEqualsValueDeser() throws Exception  {
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
            AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
            setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
            setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_nullProvider", skipper);
            
            StringCollectionDeserializer actual = stringCollectionDeserializer.withResolved(null, null, skipper, null);
            
            StringCollectionDeserializer expected = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
            setField(expected, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_nullProvider", skipper);
            setField(expected, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_skipNullValues", true);
            Class _valueClass = Object.class;
            setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            assertNull(actual_valueDeserializer);
            
            ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
            assertNull(actual_valueInstantiator);
            
            JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
            assertNull(actual_delegateDeserializer);
            
            JavaType actual_containerType = actual._containerType;
            assertNull(actual_containerType);
            
            NullValueProvider expected_nullProvider = expected._nullProvider;
            NullValueProvider actual_nullProvider = actual._nullProvider;
            Object actual_nullProvider_nullValue = getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_nullValue");
            assertNull(actual_nullProvider_nullValue);
            
            AccessPattern expected_nullProvider_access = ((AccessPattern) getFieldValue(expected_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access"));
            AccessPattern actual_nullProvider_access = ((AccessPattern) getFieldValue(actual_nullProvider, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access"));
            assertEquals(expected_nullProvider_access, actual_nullProvider_access);
            
            Boolean actual_unwrapSingle = actual._unwrapSingle;
            assertNull(actual_unwrapSingle);
            
            boolean actual_skipNullValues = actual._skipNullValues;
            assertTrue(actual_skipNullValues);
            
            Class expected_valueClass = expected._valueClass;
            Class actual_valueClass = actual._valueClass;
            assertEquals(Class.class, actual_valueClass.getClass());
            
        } finally {
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean)}
 * @utbot.executesCondition {@code (_unwrapSingle == unwrapSingle): True}
 * @utbot.executesCondition {@code (_nullProvider == nuller): False}
 * @utbot.returnsFrom {@code return new StringCollectionDeserializer(_containerType, _valueInstantiator, delegateDeser, valueDeser, nuller, unwrapSingle);}
 *  */
    @Test
    public void testWithResolved__nullProviderNotEqualsNuller() throws Exception  {
        Class nullsConstantProviderClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider");
        NullsConstantProvider prevSKIPPER = ((NullsConstantProvider) getStaticFieldValue(nullsConstantProviderClazz, "SKIPPER"));
        try {
            NullsConstantProvider skipper = ((NullsConstantProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider"));
            AccessPattern _access = AccessPattern.ALWAYS_NULL;
            setField(skipper, "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", "_access", _access);
            setStaticField(nullsConstantProviderClazz, "SKIPPER", skipper);
            StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
            ResolvedRecursiveType _containerType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
            PrimitiveArrayDeserializers.FloatDeser _nullProvider = ((PrimitiveArrayDeserializers.FloatDeser) createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser"));
            setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_nullProvider", _nullProvider);
            
            StringCollectionDeserializer actual = stringCollectionDeserializer.withResolved(null, null, null, null);
            
            StringCollectionDeserializer expected = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
            setField(expected, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
            setField(expected, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
            
            JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
            assertNull(actual_valueDeserializer);
            
            ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
            ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
            String actual_valueInstantiator_valueTypeDesc = ((String) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueTypeDesc"));
            assertNull(actual_valueInstantiator_valueTypeDesc);
            
            Class actual_valueInstantiator_valueClass = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass"));
            assertNull(actual_valueInstantiator_valueClass);
            
            AnnotatedWithParams actual_valueInstantiator_defaultCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator"));
            assertNull(actual_valueInstantiator_defaultCreator);
            
            AnnotatedWithParams actual_valueInstantiator_withArgsCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator"));
            assertNull(actual_valueInstantiator_withArgsCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueInstantiator_constructorArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_constructorArguments"));
            assertNull(actual_valueInstantiator_constructorArguments);
            
            JavaType actual_valueInstantiator_delegateType = ((JavaType) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType"));
            assertNull(actual_valueInstantiator_delegateType);
            
            AnnotatedWithParams actual_valueInstantiator_delegateCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateCreator"));
            assertNull(actual_valueInstantiator_delegateCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueInstantiator_delegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateArguments"));
            assertNull(actual_valueInstantiator_delegateArguments);
            
            JavaType actual_valueInstantiator_arrayDelegateType = ((JavaType) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType"));
            assertNull(actual_valueInstantiator_arrayDelegateType);
            
            AnnotatedWithParams actual_valueInstantiator_arrayDelegateCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateCreator"));
            assertNull(actual_valueInstantiator_arrayDelegateCreator);
            
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_valueInstantiator_arrayDelegateArguments = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateArguments"));
            assertNull(actual_valueInstantiator_arrayDelegateArguments);
            
            AnnotatedWithParams actual_valueInstantiator_fromStringCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator"));
            assertNull(actual_valueInstantiator_fromStringCreator);
            
            AnnotatedWithParams actual_valueInstantiator_fromIntCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromIntCreator"));
            assertNull(actual_valueInstantiator_fromIntCreator);
            
            AnnotatedWithParams actual_valueInstantiator_fromLongCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromLongCreator"));
            assertNull(actual_valueInstantiator_fromLongCreator);
            
            AnnotatedWithParams actual_valueInstantiator_fromDoubleCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromDoubleCreator"));
            assertNull(actual_valueInstantiator_fromDoubleCreator);
            
            AnnotatedWithParams actual_valueInstantiator_fromBooleanCreator = ((AnnotatedWithParams) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator"));
            assertNull(actual_valueInstantiator_fromBooleanCreator);
            
            AnnotatedParameter actual_valueInstantiator_incompleteParameter = ((AnnotatedParameter) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_incompleteParameter"));
            assertNull(actual_valueInstantiator_incompleteParameter);
            
            JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
            assertNull(actual_delegateDeserializer);
            
            JavaType expected_containerType = expected._containerType;
            JavaType actual_containerType = actual._containerType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_containerType, actual_containerType);
            
            NullValueProvider actual_nullProvider = actual._nullProvider;
            assertNull(actual_nullProvider);
            
            Boolean actual_unwrapSingle = actual._unwrapSingle;
            assertNull(actual_unwrapSingle);
            
            boolean actual_skipNullValues = actual._skipNullValues;
            assertFalse(actual_skipNullValues);
            
            Class actual_valueClass = actual._valueClass;
            assertNull(actual_valueClass);
            
        } finally {
            setStaticField(NullsConstantProvider.class, "SKIPPER", prevSKIPPER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_valueInstantiator != null): True}
 * @utbot.executesCondition {@code (delegateCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType delegateType = _valueInstantiator.getDelegateType(ctxt.getConfig());
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_2() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _delegateCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateCreator", _delegateCreator);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(StringCollectionDeserializer.java:109) */
        stringCollectionDeserializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_valueInstantiator != null): True}
 * @utbot.executesCondition {@code (delegateCreator != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final JavaType valueType = _containerType.getContentType();
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_4() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(StringCollectionDeserializer.java:114) */
        stringCollectionDeserializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_valueInstantiator != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final JavaType valueType = _containerType.getContentType();
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(StringCollectionDeserializer.java:114) */
        stringCollectionDeserializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_valueInstantiator != null): False}
 * @utbot.executesCondition {@code (valueDeser == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleSecondaryContextualization(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: valueDeser = ctxt.handleSecondaryContextualization(valueDeser, property, valueType);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_1() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ByteBufferDeserializer _valueDeserializer = ((ByteBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        CollectionType _containerType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(StringCollectionDeserializer.java:123) */
        stringCollectionDeserializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_valueInstantiator != null): True}
 * @utbot.executesCondition {@code (delegateCreator != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final JavaType valueType = _containerType.getContentType();
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_3() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(StringCollectionDeserializer.java:114) */
        stringCollectionDeserializer.createContextual(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_valueInstantiator != null): True}
 * @utbot.executesCondition {@code (delegateCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getDelegateCreator()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#findDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: delegate = findDeserializer(ctxt, delegateType, property);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateContextual_ThrowIllegalArgumentException_1() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _delegateCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateCreator", _delegateCreator);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        stringCollectionDeserializer.createContextual(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_valueInstantiator != null): False}
 * @utbot.executesCondition {@code (valueDeser == null): True}
 * @utbot.executesCondition {@code (valueDeser == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: valueDeser = ctxt.findContextualValueDeserializer(valueType, property);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateContextual_ThrowIllegalArgumentException() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        CollectionType _containerType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stringCollectionDeserializer.createContextual(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.isCachable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCachable()
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueDeserializer == null) && (_delegateDeserializer == null);}
 *  */
    @Test
    public void testIsCachable__valueDeserializerNotEqualsNullAnd_delegateDeserializerNotEqualsNull() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        
        boolean actual = stringCollectionDeserializer.isCachable();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueDeserializer == null) && (_delegateDeserializer == null);}
 *  */
    @Test
    public void testIsCachable__valueDeserializerNotEqualsNullAnd_delegateDeserializerNotEqualsNull_1() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        NumberDeserializers.BigDecimalDeserializer _delegateDeserializer = ((NumberDeserializers.BigDecimalDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        boolean actual = stringCollectionDeserializer.isCachable();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueDeserializer == null) && (_delegateDeserializer == null);}
 *  */
    @Test
    public void testIsCachable__valueDeserializerEqualsNullAnd_delegateDeserializerEqualsNull() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        boolean actual = stringCollectionDeserializer.isCachable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): True}
 * @utbot.executesCondition {@code (!canWrap): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.executesCondition {@code (_skipNullValues): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 *  */
    @Test
    public void testHandleNonArray__skipNullValues() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        EnumDeserializer _valueDeserializer = ((EnumDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_skipNullValues", true);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Method handleNonArrayMethod = stringCollectionDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserDelegateType, implType, collectionType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[3];
        handleNonArrayMethodArguments[0] = jsonParserDelegate;
        handleNonArrayMethodArguments[1] = impl;
        handleNonArrayMethodArguments[2] = ((Object) null);
        Collection actual = ((Collection) handleNonArrayMethod.invoke(stringCollectionDeserializer, handleNonArrayMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_1() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:265) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Method handleNonArrayMethod = stringCollectionDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserType, deserializationContextType, collectionType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[3];
        handleNonArrayMethodArguments[0] = ((Object) null);
        handleNonArrayMethodArguments[1] = ((Object) null);
        handleNonArrayMethodArguments[2] = ((Object) null);
        try {
            handleNonArrayMethod.invoke(stringCollectionDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): True}
 * @utbot.executesCondition {@code (!canWrap): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_3() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:271) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Method handleNonArrayMethod = stringCollectionDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserType, implType, collectionType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[3];
        handleNonArrayMethodArguments[0] = ((Object) null);
        handleNonArrayMethodArguments[1] = impl;
        handleNonArrayMethodArguments[2] = ((Object) null);
        try {
            handleNonArrayMethod.invoke(stringCollectionDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): False}
 * @utbot.executesCondition {@code (!canWrap): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Collection<String>) ctxt.handleUnexpectedToken(_containerType.getRawClass(), p);
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_5() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Method handleNonArrayMethod = stringCollectionDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserType, implType, collectionType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[3];
        handleNonArrayMethodArguments[0] = ((Object) null);
        handleNonArrayMethodArguments[1] = impl;
        handleNonArrayMethodArguments[2] = ((Object) null);
        try {
            handleNonArrayMethod.invoke(stringCollectionDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (!canWrap): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Method handleNonArrayMethod = stringCollectionDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserType, deserializationContextType, collectionType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[3];
        handleNonArrayMethodArguments[0] = ((Object) null);
        handleNonArrayMethodArguments[1] = ((Object) null);
        handleNonArrayMethodArguments[2] = ((Object) null);
        try {
            handleNonArrayMethod.invoke(stringCollectionDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (!canWrap): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Collection<String>) ctxt.handleUnexpectedToken(_containerType.getRawClass(), p);
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_2() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        ResolvedRecursiveType _containerType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        Boolean _unwrapSingle = false;
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_unwrapSingle", _unwrapSingle);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:267) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Method handleNonArrayMethod = stringCollectionDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserType, deserializationContextType, collectionType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[3];
        handleNonArrayMethodArguments[0] = ((Object) null);
        handleNonArrayMethodArguments[1] = ((Object) null);
        handleNonArrayMethodArguments[2] = ((Object) null);
        try {
            handleNonArrayMethod.invoke(stringCollectionDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#handleNonArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)): True}
 * @utbot.executesCondition {@code (!canWrap): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.executesCondition {@code (_skipNullValues): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.NullValueProvider#getNullValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = (String) _nullProvider.getNullValue(ctxt);
 *  */
    @Test
    public void testHandleNonArray_ThrowNullPointerException_4() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        NumberDeserializers.ShortDeserializer _valueDeserializer = ((NumberDeserializers.ShortDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer"));
        setField(stringCollectionDeserializer, "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(StringCollectionDeserializer.java:280) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class jsonParserSequenceType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Method handleNonArrayMethod = stringCollectionDeserializerClazz.getDeclaredMethod("handleNonArray", jsonParserSequenceType, implType, collectionType);
        handleNonArrayMethod.setAccessible(true);
        java.lang.Object[] handleNonArrayMethodArguments = new java.lang.Object[3];
        handleNonArrayMethodArguments[0] = jsonParserSequence;
        handleNonArrayMethodArguments[1] = impl;
        handleNonArrayMethodArguments[2] = ((Object) null);
        try {
            handleNonArrayMethod.invoke(stringCollectionDeserializer, handleNonArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.TypeDeserializer#deserializeTypedFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromArray(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithType1() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        stringCollectionDeserializer.deserializeWithType(jsonParserDelegate2, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType2() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Object key = createInstance("java.lang.Object");
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:2056)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.access$100(TokenBuffer.java:1816)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1778)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:86)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringCollectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType3() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringCollectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType4() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:97)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(filteringParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType5() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType6() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringCollectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType7() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.access$100(TokenBuffer.java:1816)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1778)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:239)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:239)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:239)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:86)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType8() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType9() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType10() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType11() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
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
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(jsonParserDelegate, impl, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType12() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate4 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(filteringParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType13() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        MapType _baseType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._idFrom(ClassNameIdResolver.java:69)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.idFromValueAndType(ClassNameIdResolver.java:39)
            com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase.idFromBaseType(TypeIdResolverBase.java:53)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._locateTypeId(AsArrayTypeDeserializer.java:135)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:96)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:53)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(filteringParserDelegate, impl, asExternalTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType14() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Integer value = 1;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:88)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, implType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = impl;
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringCollectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType15() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._locateTypeId(AsArrayTypeDeserializer.java:138)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:96)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:53)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(filteringParserDelegate, impl, asExternalTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType16() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
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
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:156)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:88)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromArray(AsWrapperTypeDeserializer.java:57)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, implType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = impl;
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringCollectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType17() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        CollectionLikeType _baseType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:97)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromArray(AsArrayTypeDeserializer.java:53)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeWithType(StringCollectionDeserializer.java:250) */
        stringCollectionDeserializer.deserializeWithType(filteringParserDelegate, impl, asExternalTypeDeserializer);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test(timeout = 1000L)
    public void testDeserializeWithType18() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "right", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringCollectionDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testDeserializeWithType19() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "left", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(stringCollectionDeserializer, deserializeWithTypeMethodArguments);
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
        // 6 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.getValueInstantiator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueInstantiator()
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#getValueInstantiator()}
 * @utbot.returnsFrom {@code return _valueInstantiator;}
 *  */
    @Test
    public void testGetValueInstantiator_Return_valueInstantiator() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        ValueInstantiator actual = stringCollectionDeserializer.getValueInstantiator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.getContentDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentDeserializer()
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#getContentDeserializer()}
 * @utbot.returnsFrom {@code return (JsonDeserializer<Object>) deser;}
 *  */
    @Test
    public void testGetContentDeserializer_ReturnDeser() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        JsonDeserializer actual = stringCollectionDeserializer.getContentDeserializer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.nextTextValue() == null
 *  */
    @Test
    public void testDeserializeUsingCustom_ThrowNullPointerException() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom(StringCollectionDeserializer.java:224) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method deserializeUsingCustomMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeUsingCustom", jsonParserType, deserializationContextType, collectionType, jsonDeserializerType);
        deserializeUsingCustomMethod.setAccessible(true);
        java.lang.Object[] deserializeUsingCustomMethodArguments = new java.lang.Object[4];
        deserializeUsingCustomMethodArguments[0] = ((Object) null);
        deserializeUsingCustomMethodArguments[1] = ((Object) null);
        deserializeUsingCustomMethodArguments[2] = ((Object) null);
        deserializeUsingCustomMethodArguments[3] = ((Object) null);
        try {
            deserializeUsingCustomMethod.invoke(stringCollectionDeserializer, deserializeUsingCustomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.nextTextValue() == null
 *  */
    @Test
    public void testDeserializeUsingCustom_ThrowNullPointerException_2() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", -1);
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2225)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:584)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextTextValue(UTF8DataInputJsonParser.java:879)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom(StringCollectionDeserializer.java:224) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class uTF8DataInputJsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method deserializeUsingCustomMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeUsingCustom", uTF8DataInputJsonParserType, deserializationContextType, collectionType, jsonDeserializerType);
        deserializeUsingCustomMethod.setAccessible(true);
        java.lang.Object[] deserializeUsingCustomMethodArguments = new java.lang.Object[4];
        deserializeUsingCustomMethodArguments[0] = uTF8DataInputJsonParser;
        deserializeUsingCustomMethodArguments[1] = ((Object) null);
        deserializeUsingCustomMethodArguments[2] = ((Object) null);
        deserializeUsingCustomMethodArguments[3] = ((Object) null);
        try {
            deserializeUsingCustomMethod.invoke(stringCollectionDeserializer, deserializeUsingCustomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.nextTextValue() == null
 *  */
    @Test
    public void testDeserializeUsingCustom_ThrowNullPointerException_3() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        byte[] _binaryValue = {(byte) 0};
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_binaryValue", _binaryValue);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2849)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:596)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextTextValue(UTF8DataInputJsonParser.java:879)
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom(StringCollectionDeserializer.java:224) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class uTF8DataInputJsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method deserializeUsingCustomMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeUsingCustom", uTF8DataInputJsonParserType, deserializationContextType, collectionType, jsonDeserializerType);
        deserializeUsingCustomMethod.setAccessible(true);
        java.lang.Object[] deserializeUsingCustomMethodArguments = new java.lang.Object[4];
        deserializeUsingCustomMethodArguments[0] = uTF8DataInputJsonParser;
        deserializeUsingCustomMethodArguments[1] = ((Object) null);
        deserializeUsingCustomMethodArguments[2] = ((Object) null);
        deserializeUsingCustomMethodArguments[3] = ((Object) null);
        try {
            deserializeUsingCustomMethod.invoke(stringCollectionDeserializer, deserializeUsingCustomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (p.nextTextValue() == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = deser.deserialize(p, ctxt);
 *  */
    @Test
    public void testDeserializeUsingCustom_ThrowNullPointerException_1() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.deserializeUsingCustom(StringCollectionDeserializer.java:239) */
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class uTF8DataInputJsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method deserializeUsingCustomMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeUsingCustom", uTF8DataInputJsonParserType, deserializationContextType, collectionType, jsonDeserializerType);
        deserializeUsingCustomMethod.setAccessible(true);
        java.lang.Object[] deserializeUsingCustomMethodArguments = new java.lang.Object[4];
        deserializeUsingCustomMethodArguments[0] = uTF8DataInputJsonParser;
        deserializeUsingCustomMethodArguments[1] = ((Object) null);
        deserializeUsingCustomMethodArguments[2] = ((Object) null);
        deserializeUsingCustomMethodArguments[3] = ((Object) null);
        try {
            deserializeUsingCustomMethod.invoke(stringCollectionDeserializer, deserializeUsingCustomMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link StringCollectionDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer#deserializeUsingCustom(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (p.nextTextValue() == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: value = deser.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeUsingCustom_ThrowIllegalStateException() throws Throwable  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        
        Class stringCollectionDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class uTF8DataInputJsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class collectionType = Class.forName("java.util.Collection");
        Class typeWrappedDeserializer1Type = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method deserializeUsingCustomMethod = stringCollectionDeserializerClazz.getDeclaredMethod("deserializeUsingCustom", uTF8DataInputJsonParserType, deserializationContextType, collectionType, typeWrappedDeserializer1Type);
        deserializeUsingCustomMethod.setAccessible(true);
        java.lang.Object[] deserializeUsingCustomMethodArguments = new java.lang.Object[4];
        deserializeUsingCustomMethodArguments[0] = uTF8DataInputJsonParser;
        deserializeUsingCustomMethodArguments[1] = ((Object) null);
        deserializeUsingCustomMethodArguments[2] = ((Object) null);
        deserializeUsingCustomMethodArguments[3] = typeWrappedDeserializer1;
        try {
            deserializeUsingCustomMethod.invoke(stringCollectionDeserializer, deserializeUsingCustomMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1096024955784600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1096024955784600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1096024955796700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1096024955784600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1096024955796700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1096024956495299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1096024956495299.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1096024956502000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1096024956495299.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1096024956502000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1096024957260700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1096024957260700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1096024957264800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1096024957260700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1096024957264800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1096024958141800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1096024958141800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1096024958149600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1096024958141800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1096024958149600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

