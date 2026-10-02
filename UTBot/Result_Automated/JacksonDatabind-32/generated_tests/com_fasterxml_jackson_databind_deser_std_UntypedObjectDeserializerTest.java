package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import com.fasterxml.jackson.core.json.JsonReadContext;
import java.io.InputStreamReader;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import java.util.HashMap;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.FloatDeser;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.DoubleDeser;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.CharDeser;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla;
import com.fasterxml.jackson.databind.JavaType;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_deser_std_UntypedObjectDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.resolve
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#constructType(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType obType = ctxt.constructType(Object.class);
 *  */
    @Test
    public void testResolve_ThrowNullPointerException() throws JsonMappingException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.resolve(UntypedObjectDeserializer.java:119) */
        untypedObjectDeserializer.resolve(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentTokenId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(p.getCurrentTokenId())
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:216) */
        untypedObjectDeserializer.deserialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:276) */
        untypedObjectDeserializer.deserialize(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.mappingException(Object.class);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_5() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:276) */
        untypedObjectDeserializer.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.mappingException(Object.class);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:276) */
        untypedObjectDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_6() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:276) */
        untypedObjectDeserializer.deserialize(jsonParserDelegate1, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NUMBER_FLOAT}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize] produces [java.lang.NullPointerException] */
        untypedObjectDeserializer.deserialize(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_numberDeserializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#hasSomeOfFeatures(int)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NUMBER_INT}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.hasSomeOfFeatures(F_MASK_INT_COERCIONS)
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_4() throws Exception  {
        int prevF_MASK_INT_COERCIONS = StdDeserializer.F_MASK_INT_COERCIONS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_INT_COERCIONS", 6);
            UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, null);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize] produces [java.lang.NullPointerException] */
            untypedObjectDeserializer.deserialize(jsonParserDelegate, null);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_INT_COERCIONS", prevF_MASK_INT_COERCIONS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_mapDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _mapDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, typeWrappedDeserializer1, null, null, null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        untypedObjectDeserializer.deserialize(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_numberDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NUMBER_INT}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _numberDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_1() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, typeWrappedDeserializer1);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NUMBER_FLOAT}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _numberDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_2() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, typeWrappedDeserializer1);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_stringDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_STRING}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _stringDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, typeWrappedDeserializer1, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_mapDeserializer != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _mapDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_4() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", stdDelegatingDeserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(asWrapperTypeDeserializer, stdDelegatingDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, typeWrappedDeserializer, null, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (ctxt.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)): False}
 * @utbot.executesCondition {@code (_listDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_START_ARRAY}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _listDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_5() throws Exception  {
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(null, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, typeWrappedDeserializer1, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        untypedObjectDeserializer.deserialize(jsonParserDelegate, impl);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_mapDeserializer != null): True}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_FIELD_NAME}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _mapDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_6() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asPropertyTypeDeserializer, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, typeWrappedDeserializer1, null, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserialize(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
     */
    @Test
    public void testDeserializeThrowsNPE() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentTokenId(JsonParserDelegate.java:98)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentTokenId(JsonParserDelegate.java:98)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:216) */
        untypedObjectDeserializer.deserialize(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 10};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2880)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 10, (byte) 13};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCR(UTF8StreamJsonParser.java:3405)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2893)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2860)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1811)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\"'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -1);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\n'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2041)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowNullPointerException() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowNullPointerException_3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowNullPointerException_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2860)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArray_ThrowNullPointerException_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._nextAfterName(UTF8StreamJsonParser.java:853)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:687)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method mapArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
     */
    @Test
    public void testMapArrayThrowsNPE() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mapArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testMapArray1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _nextToken = JsonToken.END_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialReaderBasedJsonParser_currToken = ((JsonToken) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        ArrayList actual = ((ArrayList) untypedObjectDeserializer.mapArray(readerBasedJsonParser, null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        JsonToken finalReaderBasedJsonParser_nextToken = ((JsonToken) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken"));
        JsonToken finalReaderBasedJsonParser_currToken = ((JsonToken) getFieldValue(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialReaderBasedJsonParser_currToken == finalReaderBasedJsonParser_currToken);
        
        assertNull(finalReaderBasedJsonParser_nextToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testMapArray2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[15];
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
        _inputBuffer[13] = '\"';
        _inputBuffer[14] = ' ';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 13);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 31);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2041)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[37];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 91;
        _inputBuffer[5] = (byte) 91;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        _inputBuffer[15] = (byte) 91;
        _inputBuffer[16] = (byte) 91;
        _inputBuffer[17] = (byte) 91;
        _inputBuffer[18] = (byte) 91;
        _inputBuffer[19] = (byte) 91;
        _inputBuffer[20] = (byte) 91;
        _inputBuffer[21] = (byte) 91;
        _inputBuffer[22] = (byte) 91;
        _inputBuffer[23] = (byte) 91;
        _inputBuffer[24] = (byte) 91;
        _inputBuffer[25] = (byte) 91;
        _inputBuffer[26] = (byte) 91;
        _inputBuffer[27] = (byte) 91;
        _inputBuffer[28] = (byte) 91;
        _inputBuffer[29] = (byte) 91;
        _inputBuffer[30] = (byte) 91;
        _inputBuffer[31] = (byte) 91;
        _inputBuffer[32] = (byte) 91;
        _inputBuffer[33] = (byte) 91;
        _inputBuffer[34] = (byte) 13;
        _inputBuffer[35] = (byte) 10;
        _inputBuffer[36] = (byte) 47;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 34);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipComment(UTF8StreamJsonParser.java:3035)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd2(UTF8StreamJsonParser.java:2908)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2884)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArray4() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {
            (byte) 35, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91,
            (byte) 91
        };
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 4);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd2(UTF8StreamJsonParser.java:2929)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2864)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, impl);
    }
    
    @Test
    public void testMapArray5() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[39];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 91;
        _inputBuffer[5] = (byte) 91;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        _inputBuffer[15] = (byte) 91;
        _inputBuffer[16] = (byte) 91;
        _inputBuffer[17] = (byte) 91;
        _inputBuffer[18] = (byte) 91;
        _inputBuffer[19] = (byte) 91;
        _inputBuffer[20] = (byte) 91;
        _inputBuffer[21] = (byte) 91;
        _inputBuffer[22] = (byte) 91;
        _inputBuffer[23] = (byte) 91;
        _inputBuffer[24] = (byte) 91;
        _inputBuffer[25] = (byte) 91;
        _inputBuffer[26] = (byte) 91;
        _inputBuffer[27] = (byte) 91;
        _inputBuffer[28] = (byte) 91;
        _inputBuffer[29] = (byte) 91;
        _inputBuffer[30] = (byte) 91;
        _inputBuffer[31] = (byte) 91;
        _inputBuffer[32] = (byte) 91;
        _inputBuffer[33] = (byte) 91;
        _inputBuffer[34] = (byte) 91;
        _inputBuffer[35] = (byte) 91;
        _inputBuffer[36] = (byte) 91;
        _inputBuffer[37] = (byte) 32;
        _inputBuffer[38] = (byte) 35;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 4);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd2(UTF8StreamJsonParser.java:2929)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2884)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArray6() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[15];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 13;
        _inputBuffer[5] = (byte) 10;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 4);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 7);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:725)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, impl);
    }
    
    @Test
    public void testMapArray7() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray8() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray9() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray10() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[37] = '\"';
        _inputBuffer[38] = '\t';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray11() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:613)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray12() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 64);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArray13() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray14() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[37] = '\r';
        _inputBuffer[38] = '#';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:613)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray15() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[37] = '\r';
        _inputBuffer[38] = '\u0001';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:484)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2056)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray16() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2067)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray17() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[34] = '\r';
        _inputBuffer[35] = '\n';
        _inputBuffer[36] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 34);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:462)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:2099)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2074)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2045)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray18() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[38] = ' ';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray19() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[37];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 91;
        _inputBuffer[5] = (byte) 91;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        _inputBuffer[15] = (byte) 91;
        _inputBuffer[16] = (byte) 91;
        _inputBuffer[17] = (byte) 91;
        _inputBuffer[18] = (byte) 91;
        _inputBuffer[19] = (byte) 91;
        _inputBuffer[20] = (byte) 91;
        _inputBuffer[21] = (byte) 91;
        _inputBuffer[22] = (byte) 91;
        _inputBuffer[23] = (byte) 91;
        _inputBuffer[24] = (byte) 91;
        _inputBuffer[25] = (byte) 91;
        _inputBuffer[26] = (byte) 91;
        _inputBuffer[27] = (byte) 91;
        _inputBuffer[28] = (byte) 91;
        _inputBuffer[29] = (byte) 91;
        _inputBuffer[30] = (byte) 91;
        _inputBuffer[31] = (byte) 91;
        _inputBuffer[32] = (byte) 91;
        _inputBuffer[33] = (byte) 91;
        _inputBuffer[34] = (byte) 13;
        _inputBuffer[35] = (byte) 10;
        _inputBuffer[36] = (byte) 47;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 34);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:663)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:462)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipComment(UTF8StreamJsonParser.java:3029)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd2(UTF8StreamJsonParser.java:2908)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2884)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArray20() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[39];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 91;
        _inputBuffer[5] = (byte) 91;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        _inputBuffer[15] = (byte) 91;
        _inputBuffer[16] = (byte) 91;
        _inputBuffer[17] = (byte) 91;
        _inputBuffer[18] = (byte) 91;
        _inputBuffer[19] = (byte) 91;
        _inputBuffer[20] = (byte) 91;
        _inputBuffer[21] = (byte) 91;
        _inputBuffer[22] = (byte) 91;
        _inputBuffer[23] = (byte) 91;
        _inputBuffer[24] = (byte) 91;
        _inputBuffer[25] = (byte) 91;
        _inputBuffer[26] = (byte) 91;
        _inputBuffer[27] = (byte) 91;
        _inputBuffer[28] = (byte) 91;
        _inputBuffer[29] = (byte) 91;
        _inputBuffer[30] = (byte) 91;
        _inputBuffer[31] = (byte) 91;
        _inputBuffer[32] = (byte) 91;
        _inputBuffer[33] = (byte) 91;
        _inputBuffer[34] = (byte) 91;
        _inputBuffer[35] = (byte) 91;
        _inputBuffer[36] = (byte) 91;
        _inputBuffer[37] = (byte) 10;
        _inputBuffer[38] = (byte) 9;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd2(UTF8StreamJsonParser.java:2929)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2899)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArray21() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[39];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 91;
        _inputBuffer[5] = (byte) 91;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        _inputBuffer[15] = (byte) 91;
        _inputBuffer[16] = (byte) 91;
        _inputBuffer[17] = (byte) 91;
        _inputBuffer[18] = (byte) 91;
        _inputBuffer[19] = (byte) 91;
        _inputBuffer[20] = (byte) 91;
        _inputBuffer[21] = (byte) 91;
        _inputBuffer[22] = (byte) 91;
        _inputBuffer[23] = (byte) 91;
        _inputBuffer[24] = (byte) 91;
        _inputBuffer[25] = (byte) 91;
        _inputBuffer[26] = (byte) 91;
        _inputBuffer[27] = (byte) 91;
        _inputBuffer[28] = (byte) 91;
        _inputBuffer[29] = (byte) 91;
        _inputBuffer[30] = (byte) 91;
        _inputBuffer[31] = (byte) 91;
        _inputBuffer[32] = (byte) 91;
        _inputBuffer[33] = (byte) 91;
        _inputBuffer[34] = (byte) 91;
        _inputBuffer[35] = (byte) 91;
        _inputBuffer[36] = (byte) 91;
        _inputBuffer[37] = (byte) 32;
        _inputBuffer[38] = (byte) 32;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd2(UTF8StreamJsonParser.java:2929)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2899)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArray22() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[39];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 91;
        _inputBuffer[5] = (byte) 91;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        _inputBuffer[15] = (byte) 91;
        _inputBuffer[16] = (byte) 91;
        _inputBuffer[17] = (byte) 91;
        _inputBuffer[18] = (byte) 91;
        _inputBuffer[19] = (byte) 91;
        _inputBuffer[20] = (byte) 91;
        _inputBuffer[21] = (byte) 91;
        _inputBuffer[22] = (byte) 91;
        _inputBuffer[23] = (byte) 91;
        _inputBuffer[24] = (byte) 91;
        _inputBuffer[25] = (byte) 91;
        _inputBuffer[26] = (byte) 91;
        _inputBuffer[27] = (byte) 91;
        _inputBuffer[28] = (byte) 91;
        _inputBuffer[29] = (byte) 91;
        _inputBuffer[30] = (byte) 91;
        _inputBuffer[31] = (byte) 91;
        _inputBuffer[32] = (byte) 91;
        _inputBuffer[33] = (byte) 91;
        _inputBuffer[34] = (byte) 91;
        _inputBuffer[35] = (byte) 91;
        _inputBuffer[36] = (byte) 91;
        _inputBuffer[37] = (byte) 32;
        _inputBuffer[38] = (byte) 1;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:663)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:484)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2895)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArray23() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1805)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray24() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '\r', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:605)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArray25() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '#', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:613)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArray26() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {'\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2017)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray27() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:276)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:350) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArray28() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\"', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray29() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        BufferedReader _reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2179)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1820)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray30() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[38] = '\r';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray31() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[38] = '\r';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray32() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:485)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._releaseBuffers(ReaderBasedJsonParser.java:201)
            com.fasterxml.jackson.core.base.ParserBase.close(ParserBase.java:389)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:582)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray33() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 4194304);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray34() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object _inputStream = createInstance("com.sun.org.apache.bcel.internal.util.ByteSequence$ByteArrayStream");
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputStream", _inputStream);
        byte[] _inputBuffer = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._closeInput(UTF8StreamJsonParser.java:241)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.loadMore(UTF8StreamJsonParser.java:187)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2856)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArray35() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {
            (byte) 9, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91,
            (byte) 91
        };
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:485)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._releaseBuffers(UTF8StreamJsonParser.java:257)
            com.fasterxml.jackson.core.base.ParserBase.close(ParserBase.java:389)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:695)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, impl);
    }
    
    @Test
    public void testMapArray36() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        InputStreamReader _reader = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = new char[15];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '\\';
        _inputBuffer[5] = 'u';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 6);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2215)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1820)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArray37() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {
            (byte) 93, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91, (byte) 91,
            (byte) 91
        };
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:710)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArray38() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2857)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextFieldName(UTF8StreamJsonParser.java:966)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:394)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:224)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:350) */
        untypedObjectDeserializer.mapArray(uTF8StreamJsonParser, impl);
    }
    ///endregion
    
    ///region Errors report for mapArray
    
    public void testMapArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapArrayToArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 10};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2880)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = {(byte) 0, (byte) 0};
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2860)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1811)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -1);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowNullPointerException() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowNullPointerException_3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2021)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowNullPointerException_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2860)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowNullPointerException_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._nextAfterName(UTF8StreamJsonParser.java:853)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:687)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jp.nextToken() == JsonToken.END_ARRAY
 *  */
    @Test
    public void testMapArrayToArray_ThrowNullPointerException_5() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._nextAfterName(UTF8StreamJsonParser.java:851)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:687)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(uTF8StreamJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (jp.nextToken() == JsonToken.END_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#leaseObjectBuffer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectBuffer buffer = ctxt.leaseObjectBuffer();
 *  */
    @Test
    public void testMapArrayToArray_ThrowNullPointerException_4() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _parsingContext);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:452) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method mapArrayToArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapArrayToArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
     */
    @Test
    public void testMapArrayToArrayThrowsNPE() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapArrayToArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testMapArrayToArray1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[34] = '\n';
        _inputBuffer[35] = '\r';
        _inputBuffer[36] = '\n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 34);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2041)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[36] = '\u0080';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 34);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:462)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2222)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1820)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[39];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 91;
        _inputBuffer[5] = (byte) 91;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        _inputBuffer[15] = (byte) 91;
        _inputBuffer[16] = (byte) 91;
        _inputBuffer[17] = (byte) 91;
        _inputBuffer[18] = (byte) 91;
        _inputBuffer[19] = (byte) 91;
        _inputBuffer[20] = (byte) 91;
        _inputBuffer[21] = (byte) 91;
        _inputBuffer[22] = (byte) 91;
        _inputBuffer[23] = (byte) 91;
        _inputBuffer[24] = (byte) 91;
        _inputBuffer[25] = (byte) 91;
        _inputBuffer[26] = (byte) 91;
        _inputBuffer[27] = (byte) 91;
        _inputBuffer[28] = (byte) 91;
        _inputBuffer[29] = (byte) 91;
        _inputBuffer[30] = (byte) 91;
        _inputBuffer[31] = (byte) 91;
        _inputBuffer[32] = (byte) 91;
        _inputBuffer[33] = (byte) 91;
        _inputBuffer[34] = (byte) 91;
        _inputBuffer[35] = (byte) 91;
        _inputBuffer[36] = (byte) 91;
        _inputBuffer[37] = (byte) 9;
        _inputBuffer[38] = (byte) 1;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getCurrentLocation(UTF8StreamJsonParser.java:663)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:484)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipWSOrEnd(UTF8StreamJsonParser.java:2895)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:692)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArrayToArray4() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        byte[] _inputBuffer = new byte[15];
        _inputBuffer[0] = (byte) 91;
        _inputBuffer[1] = (byte) 91;
        _inputBuffer[2] = (byte) 91;
        _inputBuffer[3] = (byte) 91;
        _inputBuffer[4] = (byte) 13;
        _inputBuffer[5] = (byte) 10;
        _inputBuffer[6] = (byte) 91;
        _inputBuffer[7] = (byte) 91;
        _inputBuffer[8] = (byte) 91;
        _inputBuffer[9] = (byte) 91;
        _inputBuffer[10] = (byte) 91;
        _inputBuffer[11] = (byte) 91;
        _inputBuffer[12] = (byte) 91;
        _inputBuffer[13] = (byte) 91;
        _inputBuffer[14] = (byte) 91;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_inputBuffer", _inputBuffer);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 4);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 7);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:725)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(uTF8StreamJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray5() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[37] = '\"';
        _inputBuffer[38] = '\t';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray6() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 34);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:462)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2222)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1820)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray7() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:613)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray8() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[38] = '\\';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray9() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2216)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1820)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray10() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1805)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray11() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray12() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray13() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[38] = '\u0001';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:484)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2056)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray14() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:613)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray15() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[38] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:462)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:2099)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2074)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2045)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray16() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[38] = ' ';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArrayToArray17() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            ']', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1805)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArrayToArray18() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = new char[15];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = ' ';
        _inputBuffer[5] = '\r';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 4);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 6);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1848)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2054)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray19() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '\r', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:605)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArrayToArray20() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
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
        _inputBuffer[38] = '\r';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:500)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:2068)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2060)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray21() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:485)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser._releaseBuffers(UTF8StreamJsonParser.java:257)
            com.fasterxml.jackson.core.base.ParserBase.close(ParserBase.java:389)
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken(UTF8StreamJsonParser.java:695)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(uTF8StreamJsonParser, null);
    }
    
    @Test
    public void testMapArrayToArray22() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:417)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1581)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:533)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:470)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1806)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:449) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArrayToArray23() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:232)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:456) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray24() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:452) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, null);
    }
    
    @Test
    public void testMapArrayToArray25() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _parsingContext);
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:232)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:456) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    
    @Test
    public void testMapArrayToArray26() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _parsingContext);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ObjectBuffer _objectBuffer = ((ObjectBuffer) createInstance("com.fasterxml.jackson.databind.util.ObjectBuffer"));
        LinkedNode _tail = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(_objectBuffer, "com.fasterxml.jackson.databind.util.ObjectBuffer", "_tail", _tail);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_objectBuffer", _objectBuffer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:501)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:509)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArray(UntypedObjectDeserializer.java:347)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserialize(UntypedObjectDeserializer.java:232)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapArrayToArray(UntypedObjectDeserializer.java:456) */
        untypedObjectDeserializer.mapArrayToArray(readerBasedJsonParser, impl);
    }
    ///endregion
    
    ///region Errors report for mapArrayToArray
    
    public void testMapArrayToArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer._clearIfStdImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _clearIfStdImpl(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#_clearIfStdImpl(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (ClassUtil.isJacksonStdImpl(deser)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isJacksonStdImpl(java.lang.Object)}
 * @utbot.returnsFrom {@code return ClassUtil.isJacksonStdImpl(deser) ? null : deser;}
 *  */
    @Test
    public void test_clearIfStdImpl_NotClassUtilIsJacksonStdImpl() {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        JsonDeserializer actual = untypedObjectDeserializer._clearIfStdImpl(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer._findCustomDeser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#_findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return ctxt.findNonContextualValueDeserializer(type);}
 *  */
    @Test
    public void test_findCustomDeser_ReturnCtxtFindNonContextualValueDeserializer() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        FromStringDeserializer.Std std = ((FromStringDeserializer.Std) createInstance("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        _cachedDeserializers.put(collectionLikeType, std);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        FromStringDeserializer.Std actual = ((FromStringDeserializer.Std) untypedObjectDeserializer._findCustomDeser(impl, collectionLikeType));
        
        FromStringDeserializer.Std expected = new FromStringDeserializer.Std(null, 0);
        
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#_findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return ctxt.findNonContextualValueDeserializer(type);}
 *  */
    @Test
    public void test_findCustomDeser_ReturnCtxtFindNonContextualValueDeserializer_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        _cachedDeserializers.put(collectionLikeType, booleanDeserializer);
        CollectionLikeType collectionLikeType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        NumberDeserializers.BooleanDeserializer booleanDeserializer1 = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        _cachedDeserializers.put(collectionLikeType1, booleanDeserializer1);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        NumberDeserializers.BooleanDeserializer actual = ((NumberDeserializers.BooleanDeserializer) untypedObjectDeserializer._findCustomDeser(impl, collectionLikeType));
        
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#_findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return ctxt.findNonContextualValueDeserializer(type);}
 *  */
    @Test
    public void test_findCustomDeser_ReturnCtxtFindNonContextualValueDeserializer_3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        _cachedDeserializers.put(collectionType, beanDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        BeanDeserializer actual = ((BeanDeserializer) untypedObjectDeserializer._findCustomDeser(impl, collectionType));
        
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#_findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return ctxt.findNonContextualValueDeserializer(type);}
 *  */
    @Test
    public void test_findCustomDeser_ReturnCtxtFindNonContextualValueDeserializer_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        PrimitiveArrayDeserializers.FloatDeser floatDeser = ((PrimitiveArrayDeserializers.FloatDeser) createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser"));
        _cachedDeserializers.put(collectionType, floatDeser);
        _cachedDeserializers.put(null, null);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        PrimitiveArrayDeserializers.FloatDeser actual = ((PrimitiveArrayDeserializers.FloatDeser) untypedObjectDeserializer._findCustomDeser(impl, collectionType));
        
        PrimitiveArrayDeserializers.FloatDeser expected = new PrimitiveArrayDeserializers.FloatDeser();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#_findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findNonContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.findNonContextualValueDeserializer(type);
 *  */
    @Test
    public void test_findCustomDeser_ThrowNullPointerException() throws JsonMappingException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer._findCustomDeser] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer._findCustomDeser(UntypedObjectDeserializer.java:162) */
        untypedObjectDeserializer._findCustomDeser(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#_findCustomDeser(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findNonContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return ctxt.findNonContextualValueDeserializer(type);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_findCustomDeser_ThrowIllegalArgumentException() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        untypedObjectDeserializer._findCustomDeser(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new LinkedHashMap<String, Object>(2);}
 *  */
    @Test
    public void testMapObject_Return_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        LinkedHashMap actual = ((LinkedHashMap) untypedObjectDeserializer.mapObject(filteringParserDelegate, null));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new LinkedHashMap<String, Object>(2);}
 *  */
    @Test
    public void testMapObject_Return() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        LinkedHashMap actual = ((LinkedHashMap) untypedObjectDeserializer.mapObject(jsonParserDelegate, null));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new LinkedHashMap<String, Object>(2);}
 *  */
    @Test
    public void testMapObject_Return_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        LinkedHashMap actual = ((LinkedHashMap) untypedObjectDeserializer.mapObject(jsonParserDelegate1, null));
        
        LinkedHashMap expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testMapObject_ThrowNullPointerException() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:391) */
        untypedObjectDeserializer.mapObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t == JsonToken.FIELD_NAME): False}
 * @utbot.executesCondition {@code (t != JsonToken.END_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t != JsonToken.END_OBJECT
 *  */
    @Test
    public void testMapObject_ThrowNullPointerException_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException] */
        untypedObjectDeserializer.mapObject(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t == JsonToken.FIELD_NAME): False}
 * @utbot.executesCondition {@code (t != JsonToken.END_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t != JsonToken.END_OBJECT
 *  */
    @Test
    public void testMapObject_ThrowNullPointerException_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException] */
        untypedObjectDeserializer.mapObject(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method mapObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#mapObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
     */
    @Test
    public void testMapObjectThrowsNPE() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:391) */
        untypedObjectDeserializer.mapObject(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testMapObject1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        untypedObjectDeserializer.mapObject(jsonParserDelegate2, null);
    }
    
    @Test
    public void testMapObject2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:396) */
        untypedObjectDeserializer.mapObject(filteringParserDelegate, null);
    }
    
    @Test
    public void testMapObject3() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.JsonParser.nextFieldName(JsonParser.java:651)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:394) */
        untypedObjectDeserializer.mapObject(filteringParserDelegate, null);
    }
    
    @Test
    public void testMapObject4() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:103)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:396) */
        untypedObjectDeserializer.mapObject(jsonParserDelegate, impl);
    }
    
    @Test
    public void testMapObject5() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.JsonParser.nextFieldName(JsonParser.java:651)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:394) */
        untypedObjectDeserializer.mapObject(jsonParserDelegate, null);
    }
    
    @Test
    public void testMapObject6() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:103)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:103)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:396) */
        untypedObjectDeserializer.mapObject(jsonParserSequence, null);
    }
    
    @Test
    public void testMapObject7() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.JsonParser.nextFieldName(JsonParser.java:651)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:394) */
        untypedObjectDeserializer.mapObject(jsonParserSequence, null);
    }
    
    @Test
    public void testMapObject8() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.JsonParser.nextFieldName(JsonParser.java:651)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:394) */
        untypedObjectDeserializer.mapObject(jsonParserSequence, impl);
    }
    
    @Test
    public void testMapObject9() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate2, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:103)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:103)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:103)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:396) */
        untypedObjectDeserializer.mapObject(jsonParserSequence, null);
    }
    
    @Test
    public void testMapObject10() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
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
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.mapObject(UntypedObjectDeserializer.java:399) */
        untypedObjectDeserializer.mapObject(jsonParserSequence, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method mapObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void testMapObject11() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        untypedObjectDeserializer.mapObject(jsonParserSequence, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.isCachable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCachable()
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsCachable_ReturnTrue() {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        boolean actual = untypedObjectDeserializer.isCachable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return this;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_stringDeserializer == null): True}
 * @utbot.executesCondition {@code (_numberDeserializer == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual__numberDeserializerNotEqualsNull() throws JsonMappingException  {
        PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, doubleDeser);
        
        UntypedObjectDeserializer actual = ((UntypedObjectDeserializer) untypedObjectDeserializer.createContextual(null, null));
        
        JsonDeserializer actual_stringDeserializer = actual._stringDeserializer;
        assertNull(actual_stringDeserializer);
        
        JsonDeserializer untypedObjectDeserializer_numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        JsonDeserializer actual_numberDeserializer = actual._numberDeserializer;
        
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_stringDeserializer == null): True}
 * @utbot.executesCondition {@code (_numberDeserializer == null): True}
 * @utbot.executesCondition {@code (_mapDeserializer == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual__mapDeserializerNotEqualsNull() throws JsonMappingException  {
        JsonNodeDeserializer.ArrayDeserializer arrayDeserializer = new JsonNodeDeserializer.ArrayDeserializer();
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, arrayDeserializer, null, null, null);
        
        UntypedObjectDeserializer actual = ((UntypedObjectDeserializer) untypedObjectDeserializer.createContextual(null, null));
        
        JsonDeserializer untypedObjectDeserializer_mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        JsonDeserializer actual_mapDeserializer = actual._mapDeserializer;
        
        JsonDeserializer actual_stringDeserializer = actual._stringDeserializer;
        assertNull(actual_stringDeserializer);
        
        JsonDeserializer actual_numberDeserializer = actual._numberDeserializer;
        assertNull(actual_numberDeserializer);
        
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_stringDeserializer == null): True}
 * @utbot.executesCondition {@code (_numberDeserializer == null): True}
 * @utbot.executesCondition {@code (_mapDeserializer == null): True}
 * @utbot.executesCondition {@code (_listDeserializer == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual__listDeserializerNotEqualsNull() throws JsonMappingException  {
        PrimitiveArrayDeserializers.CharDeser charDeser = new PrimitiveArrayDeserializers.CharDeser();
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, charDeser, null, null);
        
        UntypedObjectDeserializer actual = ((UntypedObjectDeserializer) untypedObjectDeserializer.createContextual(null, null));
        
        JsonDeserializer actual_mapDeserializer = actual._mapDeserializer;
        assertNull(actual_mapDeserializer);
        
        JsonDeserializer untypedObjectDeserializer_listDeserializer = untypedObjectDeserializer._listDeserializer;
        JsonDeserializer actual_listDeserializer = actual._listDeserializer;
        
        JsonDeserializer actual_stringDeserializer = actual._stringDeserializer;
        assertNull(actual_stringDeserializer);
        
        JsonDeserializer actual_numberDeserializer = actual._numberDeserializer;
        assertNull(actual_numberDeserializer);
        
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_stringDeserializer == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCreateContextual__stringDeserializerNotEqualsNull() throws JsonMappingException  {
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, typeWrappedDeserializer, null);
        
        UntypedObjectDeserializer actual = ((UntypedObjectDeserializer) untypedObjectDeserializer.createContextual(null, null));
        
        JsonDeserializer untypedObjectDeserializer_stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        JsonDeserializer actual_stringDeserializer = actual._stringDeserializer;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (_stringDeserializer == null): True}
 * @utbot.executesCondition {@code (_numberDeserializer == null): True}
 * @utbot.executesCondition {@code (_mapDeserializer == null): True}
 * @utbot.executesCondition {@code (_listDeserializer == null): True}
 * @utbot.executesCondition {@code (getClass() == UntypedObjectDeserializer.class): True}
 * @utbot.returnsFrom {@code return Vanilla.std;}
 *  */
    @Test
    public void testCreateContextual_GetClassEqualsUntypedObjectDeserializerClass() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, JsonMappingException  {
        UntypedObjectDeserializer.Vanilla prevStd = UntypedObjectDeserializer.Vanilla.std;
        try {
            UntypedObjectDeserializer.Vanilla std = new UntypedObjectDeserializer.Vanilla();
            Class vanillaClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla");
            setStaticField(vanillaClazz, "std", std);
            UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, null);
            
            UntypedObjectDeserializer.Vanilla actual = ((UntypedObjectDeserializer.Vanilla) untypedObjectDeserializer.createContextual(null, null));
            
            Class std_valueClass = std._valueClass;
            Class actual_valueClass = actual._valueClass;
            assertEquals(Class.class, actual_valueClass.getClass());
            
        } finally {
            setStaticField(UntypedObjectDeserializer.Vanilla.class, "std", prevStd);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
     */
    @Test
    public void testCreateContextual() throws JsonMappingException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        UntypedObjectDeserializer.Vanilla actual = ((UntypedObjectDeserializer.Vanilla) untypedObjectDeserializer.createContextual(null, null));
        
        UntypedObjectDeserializer.Vanilla expected = new UntypedObjectDeserializer.Vanilla();
        
        Class expected_valueClass = expected._valueClass;
        Class actual_valueClass = actual._valueClass;
        assertEquals(Class.class, actual_valueClass.getClass());
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer._withResolved
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _withResolved(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#_withResolved(com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new UntypedObjectDeserializer(this, mapDeser, listDeser, stringDeser, numberDeser);}
 *  */
    @Test
    public void test_withResolved_Return() {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, null);
        untypedObjectDeserializer._listType = null;
        untypedObjectDeserializer._mapType = null;
        
        UntypedObjectDeserializer actual = ((UntypedObjectDeserializer) untypedObjectDeserializer._withResolved(null, null, null, null));
        
        UntypedObjectDeserializer expected = new UntypedObjectDeserializer(null, null, null, null, null);
        expected._listType = null;
        expected._mapType = null;
        
        JsonDeserializer actual_mapDeserializer = actual._mapDeserializer;
        assertNull(actual_mapDeserializer);
        
        JsonDeserializer actual_listDeserializer = actual._listDeserializer;
        assertNull(actual_listDeserializer);
        
        JsonDeserializer actual_stringDeserializer = actual._stringDeserializer;
        assertNull(actual_stringDeserializer);
        
        JsonDeserializer actual_numberDeserializer = actual._numberDeserializer;
        assertNull(actual_numberDeserializer);
        
        JavaType actual_listType = actual._listType;
        assertNull(actual_listType);
        
        JavaType actual_mapType = actual._mapType;
        assertNull(actual_mapType);
        
        Class expected_valueClass = expected._valueClass;
        Class actual_valueClass = actual._valueClass;
        assertEquals(Class.class, actual_valueClass.getClass());
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _withResolved(com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer)
    
    @Test
    public void test_withResolvedByFuzzer() {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        UntypedObjectDeserializer actual = ((UntypedObjectDeserializer) untypedObjectDeserializer._withResolved(null, null, null, null));
        
        UntypedObjectDeserializer expected = new UntypedObjectDeserializer(null, null, null, null, null);
        expected._listType = null;
        expected._mapType = null;
        
        JsonDeserializer actual_mapDeserializer = actual._mapDeserializer;
        assertNull(actual_mapDeserializer);
        
        JsonDeserializer actual_listDeserializer = actual._listDeserializer;
        assertNull(actual_listDeserializer);
        
        JsonDeserializer actual_stringDeserializer = actual._stringDeserializer;
        assertNull(actual_stringDeserializer);
        
        JsonDeserializer actual_numberDeserializer = actual._numberDeserializer;
        assertNull(actual_numberDeserializer);
        
        JavaType actual_listType = actual._listType;
        assertNull(actual_listType);
        
        JavaType actual_mapType = actual._mapType;
        assertNull(actual_mapType);
        
        Class expected_valueClass = expected._valueClass;
        Class actual_valueClass = actual._valueClass;
        assertEquals(Class.class, actual_valueClass.getClass());
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentTokenId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(p.getCurrentTokenId())
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType(UntypedObjectDeserializer.java:282) */
        untypedObjectDeserializer.deserializeWithType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.mappingException(Object.class);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_5() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType(UntypedObjectDeserializer.java:332) */
        untypedObjectDeserializer.deserializeWithType(filteringParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NULL}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType(UntypedObjectDeserializer.java:332) */
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.mappingException(Object.class);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType(UntypedObjectDeserializer.java:332) */
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.mappingException(Object.class);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_6() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType(UntypedObjectDeserializer.java:332) */
        untypedObjectDeserializer.deserializeWithType(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_numberDeserializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#hasSomeOfFeatures(int)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NUMBER_INT}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.hasSomeOfFeatures(F_MASK_INT_COERCIONS)
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_3() throws Exception  {
        int prevF_MASK_INT_COERCIONS = StdDeserializer.F_MASK_INT_COERCIONS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_INT_COERCIONS", 6);
            UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, null);
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_FALSE;
            setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType] produces [java.lang.NullPointerException] */
            untypedObjectDeserializer.deserializeWithType(jsonParserSequence, null, null);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_INT_COERCIONS", prevF_MASK_INT_COERCIONS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NUMBER_FLOAT}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_4() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType] produces [java.lang.NullPointerException] */
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _numberDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithType_ThrowIllegalStateException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, typeWrappedDeserializer1);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_numberDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NUMBER_INT}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _numberDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithType_ThrowIllegalStateException_1() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, typeWrappedDeserializer1);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.executesCondition {@code (_stringDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_STRING}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _stringDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithType_ThrowIllegalStateException_2() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(asWrapperTypeDeserializer, typeWrappedDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, typeWrappedDeserializer1, null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _numberDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithType_ThrowIllegalStateException_3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", stdDelegatingDeserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(asWrapperTypeDeserializer, stdDelegatingDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, typeWrappedDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UntypedObjectDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _numberDeserializer.deserialize(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithType_ThrowIllegalStateException_4() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", asWrapperTypeDeserializer);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", stdDelegatingDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(asWrapperTypeDeserializer, stdDelegatingDeserializer);
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer(null, null, null, null, typeWrappedDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
     */
    @Test
    public void testDeserializeWithTypeThrowsNPE() throws IOException  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentTokenId(JsonParserDelegate.java:98)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentTokenId(JsonParserDelegate.java:98)
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.deserializeWithType(UntypedObjectDeserializer.java:282) */
        untypedObjectDeserializer.deserializeWithType(jsonParserDelegate1, null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeWithType
    
    public void testDeserializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1071172244363799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1071172244363799.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1071172244373600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1071172244363799.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1071172244373600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1071172244723900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1071172244723900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1071172244728700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1071172244723900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1071172244728700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1071172245254200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1071172245254200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1071172245258000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1071172245254200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1071172245258000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

