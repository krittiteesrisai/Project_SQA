package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import java.lang.reflect.Method;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.core.filter.TokenFilterContext;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_deser_BuilderBasedDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return finishBuild(ctxt, _deserialize(p, ctxt, builder));}
 *  */
    @Test
    public void testDeserialize_ReturnFinishBuild() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        Class initialImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        Object actual = builderBasedDeserializer.deserialize(filteringParserDelegate, impl, null);
        
        assertNull(actual);
        
        Class finalImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        assertFalse(initialImpl_view == finalImpl_view);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return finishBuild(ctxt, _deserialize(p, ctxt, builder));}
 *  */
    @Test
    public void testDeserialize_ReturnFinishBuild_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        Class initialImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        Object actual = builderBasedDeserializer.deserialize(filteringParserDelegate, impl, null);
        
        assertNull(actual);
        
        Class finalImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        assertFalse(initialImpl_view == finalImpl_view);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return finishBuild(ctxt, _deserialize(p, ctxt, builder));}
 *  */
    @Test
    public void testDeserialize_ReturnFinishBuild_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = builderBasedDeserializer.deserialize(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return finishBuild(ctxt, _deserialize(p, ctxt, builder));}
 *  */
    @Test
    public void testDeserialize_ReturnFinishBuild_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = builderBasedDeserializer.deserialize(jsonParserDelegate, impl, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        builderBasedDeserializer.deserialize(null, impl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#finishBuild(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return finishBuild(ctxt, _deserialize(p, ctxt, builder));}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return finishBuild(ctxt, _deserialize(p, ctxt, builder));
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize(BuilderBasedDeserializer.java:232)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:198) */
        builderBasedDeserializer.deserialize(filteringParserDelegate, impl, null);
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:148) */
        builderBasedDeserializer.deserialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:182) */
        builderBasedDeserializer.deserialize(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:182) */
        builderBasedDeserializer.deserialize(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (t != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:182) */
        builderBasedDeserializer.deserialize(jsonParserSequence, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        builderBasedDeserializer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:152) */
        builderBasedDeserializer.deserialize(filteringParserDelegate, null);
    }
    
    @Test
    public void testDeserialize3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:876)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:182) */
        builderBasedDeserializer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        JsonParserDelegate jsonParserDelegate6 = new JsonParserDelegate(jsonParserDelegate5);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:876)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserialize(BuilderBasedDeserializer.java:182) */
        builderBasedDeserializer.deserialize(jsonParserDelegate6, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void testDeserialize5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        builderBasedDeserializer.deserialize(jsonParserSequence, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped_ThrowNegativeArraySizeException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:133)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BuilderBasedDeserializer.java:571) */
        builderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BuilderBasedDeserializer.java:571) */
        builderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeUsingPropertyBasedWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: throw new IllegalStateException("Deserialization with Builder, External type id, @JsonCreator not yet implemented");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeUsingPropertyBasedWithExternalTypeId_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        builderBasedDeserializer.deserializeUsingPropertyBasedWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): True}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): False}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.returnsFrom {@code return builder;}
 *  */
    @Test
    public void test_deserialize_TNotEqualsJsonTokenSTART_OBJECT() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = builderBasedDeserializer._deserialize(filteringParserDelegate, impl, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): False}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.returnsFrom {@code return deserializeWithView(p, ctxt, builder, view);}
 *  */
    @Test
    public void test_deserialize__needViewProcesing() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        Class initialImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        Object actual = builderBasedDeserializer._deserialize(filteringParserDelegate, impl, null);
        
        assertNull(actual);
        
        Class finalImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        assertFalse(initialImpl_view == finalImpl_view);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): True}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): False}
 * @utbot.executesCondition {@code (_needViewProcesing): False}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.returnsFrom {@code return builder;}
 *  */
    @Test
    public void test_deserialize_Not_needViewProcesing() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        Object actual = builderBasedDeserializer._deserialize(jsonParserDelegate, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): False}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.returnsFrom {@code return deserializeWithView(p, ctxt, builder, view);}
 *  */
    @Test
    public void test_deserialize__needViewProcesing_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        
        Class initialImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        Object actual = builderBasedDeserializer._deserialize(jsonParserSequence, impl, null);
        
        assertNull(actual);
        
        Class finalImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        assertFalse(initialImpl_view == finalImpl_view);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): True}
 * @utbot.returnsFrom {@code return deserializeWithExternalTypeId(p, ctxt, builder);}
 *  */
    @Test
    public void test_deserialize__externalTypeIdHandlerNotEqualsNull() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = builderBasedDeserializer._deserialize(filteringParserDelegate, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties0);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): True}
 * @utbot.returnsFrom {@code return deserializeWithExternalTypeId(p, ctxt, builder);}
 *  */
    @Test
    public void test_deserialize__externalTypeIdHandlerNotEqualsNull_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = builderBasedDeserializer._deserialize(jsonParserSequence, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): True}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#injectValues(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> view = ctxt.getActiveView();
 *  */
    @Test
    public void test_deserialize_ThrowNullPointerException_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize(BuilderBasedDeserializer.java:221) */
        builderBasedDeserializer._deserialize(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): False}
 * @utbot.executesCondition {@code (_needViewProcesing): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserialize_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize(BuilderBasedDeserializer.java:226) */
        builderBasedDeserializer._deserialize(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): False}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> view = ctxt.getActiveView();
 *  */
    @Test
    public void test_deserialize_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize(BuilderBasedDeserializer.java:221) */
        builderBasedDeserializer._deserialize(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_injectables != null): False}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getActiveView()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserialize_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserialize(BuilderBasedDeserializer.java:226) */
        builderBasedDeserializer._deserialize(null, impl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_deserialize_ThrowIllegalArgumentException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        byte[] _valueId = {};
        setField(valueInjector, "com.fasterxml.jackson.databind.deser.impl.ValueInjector", "_valueId", _valueId);
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        builderBasedDeserializer._deserialize(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_deserialize_ThrowIllegalArgumentException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        builderBasedDeserializer._deserialize(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserialize_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = new com.fasterxml.jackson.databind.deser.impl.ValueInjector[1];
        ValueInjector valueInjector = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        _injectables[0] = valueInjector;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        builderBasedDeserializer._deserialize(null, impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withBeanProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, props);}
 *  */
    @Test
    public void testWithBeanProperties_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotatedMethod _buildMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withBeanProperties(null));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        AnnotatedMethod expected_buildMethod = expected._buildMethod;
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(expected_buildMethod, actual_buildMethod);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withBeanProperties(com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, props);}
 *  */
    @Test
    public void testWithBeanProperties_Return_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withBeanProperties(null));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.finishBuild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method finishBuild(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#finishBuild(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (null == _buildMethod): True}
 * @utbot.returnsFrom {@code return builder;}
 *  */
    @Test
    public void testFinishBuild_NullEquals_buildMethod() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        Object actual = builderBasedDeserializer.finishBuild(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method finishBuild(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#finishBuild(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (null == _buildMethod): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMethod#getMember()}
 * @utbot.invokes {@link java.lang.reflect.Method#invoke(java.lang.Object,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#wrapInstantiationProblem(java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return wrapInstantiationProblem(e, ctxt);
 *  */
    @Test(expected = NullPointerException.class)
    public void testFinishBuild_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotatedMethod _buildMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        builderBasedDeserializer.finishBuild(impl, null);
    }
    ///endregion
    
    ///region Errors report for finishBuild
    
    public void testFinishBuild_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, oir);}
 *  */
    @Test
    public void testWithObjectIdReader_Return_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        LinkedHashMap _backRefs = new LinkedHashMap();
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withObjectIdReader(null));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map expected_backRefs = expected._backRefs;
        Map actual_backRefs = actual._backRefs;
        assertTrue(deepEquals(expected_backRefs, actual_backRefs));
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, oir);}
 *  */
    @Test
    public void testWithObjectIdReader_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotatedMethod _buildMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withObjectIdReader(null));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        AnnotatedMethod expected_buildMethod = expected._buildMethod;
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(expected_buildMethod, actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
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
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BuilderBasedDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Boolean _required = false;
            setField(stdRequired, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            Class _class = Object.class;
            setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
            JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -254);
            java.lang.Object[] _hashArea = {null};
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null};
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            builderBasedDeserializer._anySetter = _anySetter;
            LinkedHashMap _backRefs = new LinkedHashMap();
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            MapLikeType _idType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_idType", _idType);
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "_deserializer", _deserializer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:213)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:351)
                com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:76)
                com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader(BuilderBasedDeserializer.java:102) */
            builderBasedDeserializer.withObjectIdReader(objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new BuilderBasedDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowClassCastException() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            Class _class = Object.class;
            setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
            ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$CharDeser");
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            java.lang.Object[] _hashArea = new java.lang.Object[2];
            Object object = createInstance("java.lang.Object");
            _hashArea[1] = object;
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null};
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            builderBasedDeserializer._anySetter = _anySetter;
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:177)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:351)
                com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:76)
                com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader(BuilderBasedDeserializer.java:102) */
            builderBasedDeserializer.withObjectIdReader(objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BuilderBasedDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            Object _delegateDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$BooleanDeser");
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
            PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
            builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", -256);
            java.lang.Object[] _hashArea = new java.lang.Object[1];
            BuilderBasedDeserializer builderBasedDeserializer1 = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            setField(builderBasedDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            setField(builderBasedDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            setField(builderBasedDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
            setField(builderBasedDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null};
            setField(builderBasedDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            setField(builderBasedDeserializer1, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
            _hashArea[0] = ((Object) builderBasedDeserializer1);
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            builderBasedDeserializer._anySetter = _anySetter;
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader] produces [java.lang.ArrayIndexOutOfBoundsException: Index -510 out of bounds for length 1]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:193)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:351)
                com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:76)
                com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader(BuilderBasedDeserializer.java:102) */
            builderBasedDeserializer.withObjectIdReader(_objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withObjectIdReader(com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new BuilderBasedDeserializer(this, oir);
 *  */
    @Test
    public void testWithObjectIdReader_ThrowClassCastException_1() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED = PropertyMetadata.STD_REQUIRED;
        try {
            PropertyMetadata stdRequired = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED", stdRequired);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
            MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
            JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
            StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            java.lang.Object[] _hashArea = new java.lang.Object[9];
            Object object = createInstance("java.lang.Object");
            _hashArea[3] = object;
            setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null};
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
            SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
            builderBasedDeserializer._anySetter = _anySetter;
            LinkedHashMap _backRefs = new LinkedHashMap();
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs", _backRefs);
            UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
            builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
            ObjectIdReader objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            setField(objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "propertyName", propertyName);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.deser.SettableBeanProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.deser.SettableBeanProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
                com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withProperty(BeanPropertyMap.java:177)
                com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:351)
                com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:76)
                com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withObjectIdReader(BuilderBasedDeserializer.java:102) */
            builderBasedDeserializer.withObjectIdReader(objectIdReader);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED", prevSTD_REQUIRED);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.vanillaDeserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method vanillaDeserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#vanillaDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testVanillaDeserialize_ThrowNullPointerException() throws Throwable  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.vanillaDeserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.vanillaDeserialize(BuilderBasedDeserializer.java:258) */
        Class builderBasedDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = builderBasedDeserializerClazz.getDeclaredMethod("vanillaDeserialize", jsonParserType, deserializationContextType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = ((Object) null);
        vanillaDeserializeMethodArguments[1] = ((Object) null);
        vanillaDeserializeMethodArguments[2] = ((Object) null);
        try {
            vanillaDeserializeMethod.invoke(builderBasedDeserializer, vanillaDeserializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method vanillaDeserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonToken)
    
    @Test(expected = JsonMappingException.class)
    public void testVanillaDeserialize1() throws Throwable  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonToken jsonToken = JsonToken.START_OBJECT;
        
        Class builderBasedDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class uTF8StreamJsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method vanillaDeserializeMethod = builderBasedDeserializerClazz.getDeclaredMethod("vanillaDeserialize", uTF8StreamJsonParserType, implType, jsonTokenType);
        vanillaDeserializeMethod.setAccessible(true);
        java.lang.Object[] vanillaDeserializeMethodArguments = new java.lang.Object[3];
        vanillaDeserializeMethodArguments[0] = uTF8StreamJsonParser;
        vanillaDeserializeMethodArguments[1] = impl;
        vanillaDeserializeMethodArguments[2] = jsonToken;
        try {
            vanillaDeserializeMethod.invoke(builderBasedDeserializer, vanillaDeserializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for vanillaDeserialize
    
    public void testVanillaDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withIgnorableProperties(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withIgnorableProperties(java.util.Set)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, ignorableProps);}
 *  */
    @Test
    public void testWithIgnorableProperties_Return_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(linkedHashSet));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#withIgnorableProperties(java.util.Set)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, ignorableProps);}
 *  */
    @Test
    public void testWithIgnorableProperties_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotatedMethod _buildMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BuilderBasedDeserializer _delegateDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        LinkedHashSet _ignorableProps = new LinkedHashSet();
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(_ignorableProps));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", _ignorableProps);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        AnnotatedMethod expected_buildMethod = expected._buildMethod;
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(expected_buildMethod, actual_buildMethod);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        assertTrue(deepEquals(expected_delegateDeserializer, actual_delegateDeserializer));
        JsonDeserializer actual_delegateDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
        assertNull(actual_delegateDeserializer_delegateDeserializer);
        
        JsonDeserializer actual_delegateDeserializer_arrayDelegateDeserializer = ((JsonDeserializer) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_arrayDelegateDeserializer"));
        assertNull(actual_delegateDeserializer_arrayDelegateDeserializer);
        
        PropertyBasedCreator actual_delegateDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
        assertNull(actual_delegateDeserializer_propertyBasedCreator);
        
        boolean actual_delegateDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
        assertFalse(actual_delegateDeserializer_nonStandardCreation);
        
        boolean actual_delegateDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
        assertFalse(actual_delegateDeserializer_vanillaProcessing);
        
        BeanPropertyMap expected_delegateDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(expected_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
        BeanPropertyMap actual_delegateDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_delegateDeserializer_beanProperties, actual_delegateDeserializer_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_delegateDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
        assertNull(actual_delegateDeserializer_injectables);
        
        SettableAnyProperty actual_delegateDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
        assertNull(actual_delegateDeserializer_anySetter);
        
        Set expected_delegateDeserializer_ignorableProps = ((Set) getFieldValue(expected_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
        Set actual_delegateDeserializer_ignorableProps = ((Set) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
        assertTrue(deepEquals(expected_delegateDeserializer_ignorableProps, actual_delegateDeserializer_ignorableProps));
        
        boolean actual_delegateDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
        assertFalse(actual_delegateDeserializer_ignoreAllUnknown);
        
        boolean actual_delegateDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
        assertFalse(actual_delegateDeserializer_needViewProcesing);
        
        Map actual_delegateDeserializer_backRefs = ((Map) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
        assertNull(actual_delegateDeserializer_backRefs);
        
        HashMap actual_delegateDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
        assertNull(actual_delegateDeserializer_subDeserializers);
        
        UnwrappedPropertyHandler actual_delegateDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
        assertNull(actual_delegateDeserializer_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_delegateDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
        assertNull(actual_delegateDeserializer_externalTypeIdHandler);
        
        ObjectIdReader actual_delegateDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
        assertNull(actual_delegateDeserializer_objectIdReader);
        
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
        assertTrue(deepEquals(expected, actual));
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        JsonDeserializer jsonDeserializer = builderBasedDeserializer._delegateDeserializer;
        Map finalBuilderBasedDeserializer_delegateDeserializer_backRefs = ((Map) getFieldValue(jsonDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_delegateDeserializer_backRefs);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnorableProperties(java.util.Set)
    
    @Test
    public void testWithIgnorableProperties1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null, null, null, null, null, null, null, null, null, null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(linkedHashSet));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        expected._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties1 = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 7);
        java.lang.Object[] _hashArea = new java.lang.Object[24];
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder1 = {};
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        BeanPropertyMap beanPropertyMap = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        BeanPropertyMap beanPropertyMap1 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap1_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder1 = ((SettableBeanProperty) get(beanPropertyMap1_beanProperties_propsInOrder, 1));
        BeanPropertyMap beanPropertyMap2 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap2_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap2, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder2 = ((SettableBeanProperty) get(beanPropertyMap2_beanProperties_propsInOrder, 2));
        BeanPropertyMap beanPropertyMap3 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap3_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap3, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder3 = ((SettableBeanProperty) get(beanPropertyMap3_beanProperties_propsInOrder, 3));
        BeanPropertyMap beanPropertyMap4 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap4_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap4, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder4 = ((SettableBeanProperty) get(beanPropertyMap4_beanProperties_propsInOrder, 4));
        BeanPropertyMap beanPropertyMap5 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap5_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap5, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder5 = ((SettableBeanProperty) get(beanPropertyMap5_beanProperties_propsInOrder, 5));
        BeanPropertyMap beanPropertyMap6 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap6_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap6, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder6 = ((SettableBeanProperty) get(beanPropertyMap6_beanProperties_propsInOrder, 6));
        BeanPropertyMap beanPropertyMap7 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap7_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap7, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder7 = ((SettableBeanProperty) get(beanPropertyMap7_beanProperties_propsInOrder, 7));
        BeanPropertyMap beanPropertyMap8 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap8_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap8, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder8 = ((SettableBeanProperty) get(beanPropertyMap8_beanProperties_propsInOrder, 8));
        BeanPropertyMap beanPropertyMap9 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap9_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap9, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder9 = ((SettableBeanProperty) get(beanPropertyMap9_beanProperties_propsInOrder, 9));
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder0);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder1);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder2);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder3);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder4);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder5);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder6);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder7);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder8);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder9);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    @Test
    public void testWithIgnorableProperties2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null, null, null, null, null, null, null, null, null};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(linkedHashSet));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties1 = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 7);
        java.lang.Object[] _hashArea = new java.lang.Object[24];
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder1 = {};
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] expected_injectables = expected._injectables;
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        int expected_injectablesSize = expected_injectables.length;
        assertEquals(expected_injectablesSize, actual_injectables.length);
        assertTrue(deepEquals(expected_injectables, actual_injectables));
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        ValueInjector finalBuilderBasedDeserializer_injectables0 = builderBasedDeserializer._injectables[0];
        ValueInjector finalBuilderBasedDeserializer_injectables1 = builderBasedDeserializer._injectables[1];
        ValueInjector finalBuilderBasedDeserializer_injectables2 = builderBasedDeserializer._injectables[2];
        ValueInjector finalBuilderBasedDeserializer_injectables3 = builderBasedDeserializer._injectables[3];
        ValueInjector finalBuilderBasedDeserializer_injectables4 = builderBasedDeserializer._injectables[4];
        ValueInjector finalBuilderBasedDeserializer_injectables5 = builderBasedDeserializer._injectables[5];
        ValueInjector finalBuilderBasedDeserializer_injectables6 = builderBasedDeserializer._injectables[6];
        ValueInjector finalBuilderBasedDeserializer_injectables7 = builderBasedDeserializer._injectables[7];
        ValueInjector finalBuilderBasedDeserializer_injectables8 = builderBasedDeserializer._injectables[8];
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_injectables0);
        
        assertNull(finalBuilderBasedDeserializer_injectables1);
        
        assertNull(finalBuilderBasedDeserializer_injectables2);
        
        assertNull(finalBuilderBasedDeserializer_injectables3);
        
        assertNull(finalBuilderBasedDeserializer_injectables4);
        
        assertNull(finalBuilderBasedDeserializer_injectables5);
        
        assertNull(finalBuilderBasedDeserializer_injectables6);
        
        assertNull(finalBuilderBasedDeserializer_injectables7);
        
        assertNull(finalBuilderBasedDeserializer_injectables8);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    @Test
    public void testWithIgnorableProperties3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _propsInOrder[0] = ((SettableBeanProperty) creatorProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(linkedHashSet));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        expected._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties1 = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 7);
        java.lang.Object[] _hashArea = new java.lang.Object[24];
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder1 = {};
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties1);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        BeanPropertyMap beanPropertyMap = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder1 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 1));
        BeanPropertyMap beanPropertyMap1 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap1_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder2 = ((SettableBeanProperty) get(beanPropertyMap1_beanProperties_propsInOrder, 2));
        BeanPropertyMap beanPropertyMap2 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap2_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap2, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder3 = ((SettableBeanProperty) get(beanPropertyMap2_beanProperties_propsInOrder, 3));
        BeanPropertyMap beanPropertyMap3 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap3_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap3, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder4 = ((SettableBeanProperty) get(beanPropertyMap3_beanProperties_propsInOrder, 4));
        BeanPropertyMap beanPropertyMap4 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap4_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap4, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder5 = ((SettableBeanProperty) get(beanPropertyMap4_beanProperties_propsInOrder, 5));
        BeanPropertyMap beanPropertyMap5 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap5_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap5, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder6 = ((SettableBeanProperty) get(beanPropertyMap5_beanProperties_propsInOrder, 6));
        BeanPropertyMap beanPropertyMap6 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap6_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap6, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder7 = ((SettableBeanProperty) get(beanPropertyMap6_beanProperties_propsInOrder, 7));
        BeanPropertyMap beanPropertyMap7 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap7_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap7, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder8 = ((SettableBeanProperty) get(beanPropertyMap7_beanProperties_propsInOrder, 8));
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder1);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder2);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder3);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder4);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder5);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder6);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder7);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder8);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    @Test
    public void testWithIgnorableProperties4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapLikeType _beanType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(linkedHashSet));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        BeanPropertyMap _beanProperties1 = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 7);
        java.lang.Object[] _hashArea = new java.lang.Object[24];
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder1 = {};
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_classAnnotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty actual_anySetter = actual._anySetter;
        assertNull(actual_anySetter);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    @Test
    public void testWithIgnorableProperties5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _propsInOrder[0] = ((SettableBeanProperty) fieldProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null, null, null, null, null, null, null, null, null};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        JavaType javaType = builderBasedDeserializer._beanType;
        Class initialBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(linkedHashSet));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties1 = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 7);
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_size", 1);
        java.lang.Object[] _hashArea = new java.lang.Object[24];
        _hashArea[0] = ((Object) _simpleName);
        _hashArea[1] = ((Object) fieldProperty);
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder1 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        _propsInOrder1[0] = ((SettableBeanProperty) fieldProperty);
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] expected_injectables = expected._injectables;
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        int expected_injectablesSize = expected_injectables.length;
        assertEquals(expected_injectablesSize, actual_injectables.length);
        assertTrue(deepEquals(expected_injectables, actual_injectables));
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = builderBasedDeserializer._beanType;
        Class finalBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        BeanPropertyMap beanPropertyMap = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder1 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 1));
        BeanPropertyMap beanPropertyMap1 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap1_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder2 = ((SettableBeanProperty) get(beanPropertyMap1_beanProperties_propsInOrder, 2));
        BeanPropertyMap beanPropertyMap2 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap2_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap2, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder3 = ((SettableBeanProperty) get(beanPropertyMap2_beanProperties_propsInOrder, 3));
        BeanPropertyMap beanPropertyMap3 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap3_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap3, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder4 = ((SettableBeanProperty) get(beanPropertyMap3_beanProperties_propsInOrder, 4));
        BeanPropertyMap beanPropertyMap4 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap4_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap4, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder5 = ((SettableBeanProperty) get(beanPropertyMap4_beanProperties_propsInOrder, 5));
        BeanPropertyMap beanPropertyMap5 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap5_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap5, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder6 = ((SettableBeanProperty) get(beanPropertyMap5_beanProperties_propsInOrder, 6));
        BeanPropertyMap beanPropertyMap6 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap6_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap6, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder7 = ((SettableBeanProperty) get(beanPropertyMap6_beanProperties_propsInOrder, 7));
        BeanPropertyMap beanPropertyMap7 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap7_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap7, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder8 = ((SettableBeanProperty) get(beanPropertyMap7_beanProperties_propsInOrder, 8));
        ValueInjector finalBuilderBasedDeserializer_injectables0 = builderBasedDeserializer._injectables[0];
        ValueInjector finalBuilderBasedDeserializer_injectables1 = builderBasedDeserializer._injectables[1];
        ValueInjector finalBuilderBasedDeserializer_injectables2 = builderBasedDeserializer._injectables[2];
        ValueInjector finalBuilderBasedDeserializer_injectables3 = builderBasedDeserializer._injectables[3];
        ValueInjector finalBuilderBasedDeserializer_injectables4 = builderBasedDeserializer._injectables[4];
        ValueInjector finalBuilderBasedDeserializer_injectables5 = builderBasedDeserializer._injectables[5];
        ValueInjector finalBuilderBasedDeserializer_injectables6 = builderBasedDeserializer._injectables[6];
        ValueInjector finalBuilderBasedDeserializer_injectables7 = builderBasedDeserializer._injectables[7];
        ValueInjector finalBuilderBasedDeserializer_injectables8 = builderBasedDeserializer._injectables[8];
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertFalse(initialBuilderBasedDeserializer_beanType_class == finalBuilderBasedDeserializer_beanType_class);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder1);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder2);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder3);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder4);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder5);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder6);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder7);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder8);
        
        assertNull(finalBuilderBasedDeserializer_injectables0);
        
        assertNull(finalBuilderBasedDeserializer_injectables1);
        
        assertNull(finalBuilderBasedDeserializer_injectables2);
        
        assertNull(finalBuilderBasedDeserializer_injectables3);
        
        assertNull(finalBuilderBasedDeserializer_injectables4);
        
        assertNull(finalBuilderBasedDeserializer_injectables5);
        
        assertNull(finalBuilderBasedDeserializer_injectables6);
        
        assertNull(finalBuilderBasedDeserializer_injectables7);
        
        assertNull(finalBuilderBasedDeserializer_injectables8);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    @Test
    public void testWithIgnorableProperties6() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        CollectionLikeType _beanType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        JsonNodeDeserializer _delegateDeserializer = ((JsonNodeDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _propsInOrder[0] = ((SettableBeanProperty) fieldProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        JavaType javaType = builderBasedDeserializer._beanType;
        Class initialBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(linkedHashSet));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties1 = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 7);
        java.lang.Object[] _hashArea = new java.lang.Object[24];
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder1 = {};
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties1);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = builderBasedDeserializer._beanType;
        Class finalBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        BeanPropertyMap beanPropertyMap = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder1 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 1));
        BeanPropertyMap beanPropertyMap1 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap1_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder2 = ((SettableBeanProperty) get(beanPropertyMap1_beanProperties_propsInOrder, 2));
        BeanPropertyMap beanPropertyMap2 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap2_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap2, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder3 = ((SettableBeanProperty) get(beanPropertyMap2_beanProperties_propsInOrder, 3));
        BeanPropertyMap beanPropertyMap3 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap3_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap3, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder4 = ((SettableBeanProperty) get(beanPropertyMap3_beanProperties_propsInOrder, 4));
        BeanPropertyMap beanPropertyMap4 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap4_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap4, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder5 = ((SettableBeanProperty) get(beanPropertyMap4_beanProperties_propsInOrder, 5));
        BeanPropertyMap beanPropertyMap5 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap5_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap5, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder6 = ((SettableBeanProperty) get(beanPropertyMap5_beanProperties_propsInOrder, 6));
        BeanPropertyMap beanPropertyMap6 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap6_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap6, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder7 = ((SettableBeanProperty) get(beanPropertyMap6_beanProperties_propsInOrder, 7));
        BeanPropertyMap beanPropertyMap7 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap7_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap7, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder8 = ((SettableBeanProperty) get(beanPropertyMap7_beanProperties_propsInOrder, 8));
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertFalse(initialBuilderBasedDeserializer_beanType_class == finalBuilderBasedDeserializer_beanType_class);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder1);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder2);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder3);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder4);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder5);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder6);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder7);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder8);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    @Test
    public void testWithIgnorableProperties7() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[10];
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _propsInOrder[1] = ((SettableBeanProperty) fieldProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        JavaType javaType = builderBasedDeserializer._beanType;
        Class initialBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.withIgnorableProperties(linkedHashSet));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        expected._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties1 = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashMask", 7);
        java.lang.Object[] _hashArea = new java.lang.Object[24];
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_hashArea", _hashArea);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder1 = {};
        setField(_beanProperties1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder1);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties1);
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps", linkedHashSet);
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        assertNull(actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
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
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap expected_beanProperties = expected._beanProperties;
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set expected_ignorableProps = expected._ignorableProps;
        Set actual_ignorableProps = actual._ignorableProps;
        assertTrue(deepEquals(expected_ignorableProps, actual_ignorableProps));
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler expected_unwrappedPropertyHandler = expected._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        List actual_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = builderBasedDeserializer._beanType;
        Class finalBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        BeanPropertyMap beanPropertyMap = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        BeanPropertyMap beanPropertyMap1 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap1_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap1, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder2 = ((SettableBeanProperty) get(beanPropertyMap1_beanProperties_propsInOrder, 2));
        BeanPropertyMap beanPropertyMap2 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap2_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap2, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder3 = ((SettableBeanProperty) get(beanPropertyMap2_beanProperties_propsInOrder, 3));
        BeanPropertyMap beanPropertyMap3 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap3_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap3, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder4 = ((SettableBeanProperty) get(beanPropertyMap3_beanProperties_propsInOrder, 4));
        BeanPropertyMap beanPropertyMap4 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap4_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap4, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder5 = ((SettableBeanProperty) get(beanPropertyMap4_beanProperties_propsInOrder, 5));
        BeanPropertyMap beanPropertyMap5 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap5_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap5, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder6 = ((SettableBeanProperty) get(beanPropertyMap5_beanProperties_propsInOrder, 6));
        BeanPropertyMap beanPropertyMap6 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap6_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap6, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder7 = ((SettableBeanProperty) get(beanPropertyMap6_beanProperties_propsInOrder, 7));
        BeanPropertyMap beanPropertyMap7 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap7_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap7, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder8 = ((SettableBeanProperty) get(beanPropertyMap7_beanProperties_propsInOrder, 8));
        BeanPropertyMap beanPropertyMap8 = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap8_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap8, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder9 = ((SettableBeanProperty) get(beanPropertyMap8_beanProperties_propsInOrder, 9));
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertFalse(initialBuilderBasedDeserializer_beanType_class == finalBuilderBasedDeserializer_beanType_class);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder0);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder2);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder3);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder4);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder5);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder6);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder7);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder8);
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder9);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withIgnorableProperties(java.util.Set)
    
    @Test
    public void testWithIgnorableProperties8() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        _propsInOrder[0] = ((SettableBeanProperty) fieldProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] _injectables = {null, null, null, null, null, null, null, null, null};
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables", _injectables);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withoutProperties(BeanPropertyMap.java:285)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:382)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:81)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties(BuilderBasedDeserializer.java:107) */
        builderBasedDeserializer.withIgnorableProperties(linkedHashSet);
    }
    
    @Test
    public void testWithIgnorableProperties9() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        CollectionType _beanType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        StringArrayDeserializer _delegateDeserializer = ((StringArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        String string = "";
        linkedHashSet.add(string);
        linkedHashSet.add(string);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withoutProperties(BeanPropertyMap.java:276)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:382)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:81)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties(BuilderBasedDeserializer.java:107) */
        builderBasedDeserializer.withIgnorableProperties(linkedHashSet);
    }
    
    @Test
    public void testWithIgnorableProperties10() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        linkedHashSet.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withoutProperties(BeanPropertyMap.java:276)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:382)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:81)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties(BuilderBasedDeserializer.java:107) */
        builderBasedDeserializer.withIgnorableProperties(linkedHashSet);
    }
    
    @Test
    public void testWithIgnorableProperties11() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[10];
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _propsInOrder[1] = ((SettableBeanProperty) fieldProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._hashCode(BeanPropertyMap.java:605)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.init(BeanPropertyMap.java:112)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.<init>(BeanPropertyMap.java:62)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withoutProperties(BeanPropertyMap.java:291)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:382)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:81)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties(BuilderBasedDeserializer.java:107) */
        builderBasedDeserializer.withIgnorableProperties(linkedHashSet);
    }
    
    @Test
    public void testWithIgnorableProperties12() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _propsInOrder[0] = ((SettableBeanProperty) fieldProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._hashCode(BeanPropertyMap.java:605)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.init(BeanPropertyMap.java:112)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.<init>(BeanPropertyMap.java:62)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withoutProperties(BeanPropertyMap.java:291)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:382)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:81)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties(BuilderBasedDeserializer.java:107) */
        builderBasedDeserializer.withIgnorableProperties(linkedHashSet);
    }
    
    @Test
    public void testWithIgnorableProperties13() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _propsInOrder[0] = ((SettableBeanProperty) fieldProperty);
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._hashCode(BeanPropertyMap.java:605)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.init(BeanPropertyMap.java:112)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.<init>(BeanPropertyMap.java:62)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.withoutProperties(BeanPropertyMap.java:291)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(BeanDeserializerBase.java:382)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.<init>(BuilderBasedDeserializer.java:81)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.withIgnorableProperties(BuilderBasedDeserializer.java:107) */
        builderBasedDeserializer.withIgnorableProperties(linkedHashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithView
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        Object actual = builderBasedDeserializer.deserializeWithView(filteringParserDelegate, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = builderBasedDeserializer.deserializeWithView(jsonParserSequence, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        Object actual = builderBasedDeserializer.deserializeWithView(readerBasedJsonParser, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Object actual = builderBasedDeserializer.deserializeWithView(jsonParserSequence, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testDeserializeWithView_ReturnBean_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        Object actual = builderBasedDeserializer.deserializeWithView(jsonParserDelegate1, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithView(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testDeserializeWithView_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithView] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithView(BuilderBasedDeserializer.java:428) */
        builderBasedDeserializer.deserializeWithView(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    @Test
    public void testDeserializeWithView1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate11 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate12 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate11, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate12);
        setField(delegate10, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate11);
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
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        Object actual = builderBasedDeserializer.deserializeWithView(jsonParserSequence, null, object, null);
        
    }
    
    @Test
    public void testDeserializeWithView2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate11 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate12 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate13 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate12, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate13);
        setField(delegate11, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate12);
        setField(delegate10, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate11);
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
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        Class class1 = Object.class;
        
        Object actual = builderBasedDeserializer.deserializeWithView(jsonParserDelegate, null, object, class1);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithView(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.Class)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserializeWithView3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        
        builderBasedDeserializer.deserializeWithView(jsonParserDelegate, null, object, null);
    }
    
    @Test
    public void testDeserializeWithView4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithView] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:395)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithView(BuilderBasedDeserializer.java:430) */
        builderBasedDeserializer.deserializeWithView(jsonParserSequence, null, object, class1);
    }
    
    @Test
    public void testDeserializeWithView5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate7, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithView] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithView(BuilderBasedDeserializer.java:430) */
        builderBasedDeserializer.deserializeWithView(jsonParserSequence, null, object, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.asArrayDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asArrayDeserializer()
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#asArrayDeserializer()}
 * @utbot.returnsFrom {@code return new BeanAsArrayBuilderDeserializer(this, props, _buildMethod);}
 *  */
    @Test
    public void testAsArrayDeserializer_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propsInOrder = {null};
        setField(_beanProperties, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder", _propsInOrder);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanAsArrayBuilderDeserializer actual = ((BeanAsArrayBuilderDeserializer) builderBasedDeserializer.asArrayDeserializer());
        
        BeanAsArrayBuilderDeserializer expected = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate", builderBasedDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties", _propsInOrder);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        expected._anySetter = _anySetter;
        expected._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        BeanDeserializerBase expected_delegate = ((BeanDeserializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
        AnnotatedMethod actual_delegate_buildMethod = ((AnnotatedMethod) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod"));
        assertNull(actual_delegate_buildMethod);
        
        Annotations actual_delegate_classAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_delegate_classAnnotations);
        
        JavaType actual_delegate_beanType = actual_delegate._beanType;
        assertNull(actual_delegate_beanType);
        
        JsonFormat.Shape expected_delegate_serializationShape = expected_delegate._serializationShape;
        JsonFormat.Shape actual_delegate_serializationShape = actual_delegate._serializationShape;
        assertEquals(expected_delegate_serializationShape, actual_delegate_serializationShape);
        
        ValueInstantiator expected_delegate_valueInstantiator = expected_delegate._valueInstantiator;
        ValueInstantiator actual_delegate_valueInstantiator = actual_delegate._valueInstantiator;
        Class actual_delegate_valueInstantiator_valueType = ((Class) getFieldValue(actual_delegate_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_delegate_valueInstantiator_valueType);
        
        JsonDeserializer actual_delegate_delegateDeserializer = actual_delegate._delegateDeserializer;
        assertNull(actual_delegate_delegateDeserializer);
        
        JsonDeserializer actual_delegate_arrayDelegateDeserializer = actual_delegate._arrayDelegateDeserializer;
        assertNull(actual_delegate_arrayDelegateDeserializer);
        
        PropertyBasedCreator actual_delegate_propertyBasedCreator = actual_delegate._propertyBasedCreator;
        assertNull(actual_delegate_propertyBasedCreator);
        
        boolean actual_delegate_nonStandardCreation = actual_delegate._nonStandardCreation;
        assertFalse(actual_delegate_nonStandardCreation);
        
        boolean actual_delegate_vanillaProcessing = actual_delegate._vanillaProcessing;
        assertFalse(actual_delegate_vanillaProcessing);
        
        BeanPropertyMap expected_delegate_beanProperties = expected_delegate._beanProperties;
        BeanPropertyMap actual_delegate_beanProperties = actual_delegate._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_delegate_beanProperties, actual_delegate_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_delegate_injectables = actual_delegate._injectables;
        assertNull(actual_delegate_injectables);
        
        SettableAnyProperty expected_delegate_anySetter = expected_delegate._anySetter;
        SettableAnyProperty actual_delegate_anySetter = actual_delegate._anySetter;
        BeanProperty actual_delegate_anySetter_property = actual_delegate_anySetter._property;
        assertNull(actual_delegate_anySetter_property);
        
        AnnotatedMember actual_delegate_anySetter_setter = actual_delegate_anySetter._setter;
        assertNull(actual_delegate_anySetter_setter);
        
        boolean actual_delegate_anySetter_setterIsField = actual_delegate_anySetter._setterIsField;
        assertFalse(actual_delegate_anySetter_setterIsField);
        
        JavaType actual_delegate_anySetter_type = actual_delegate_anySetter._type;
        assertNull(actual_delegate_anySetter_type);
        
        JsonDeserializer actual_delegate_anySetter_valueDeserializer = actual_delegate_anySetter._valueDeserializer;
        assertNull(actual_delegate_anySetter_valueDeserializer);
        
        TypeDeserializer actual_delegate_anySetter_valueTypeDeserializer = actual_delegate_anySetter._valueTypeDeserializer;
        assertNull(actual_delegate_anySetter_valueTypeDeserializer);
        
        Set actual_delegate_ignorableProps = actual_delegate._ignorableProps;
        assertNull(actual_delegate_ignorableProps);
        
        boolean actual_delegate_ignoreAllUnknown = actual_delegate._ignoreAllUnknown;
        assertFalse(actual_delegate_ignoreAllUnknown);
        
        boolean actual_delegate_needViewProcesing = actual_delegate._needViewProcesing;
        assertFalse(actual_delegate_needViewProcesing);
        
        Map actual_delegate_backRefs = actual_delegate._backRefs;
        assertNull(actual_delegate_backRefs);
        
        HashMap actual_delegate_subDeserializers = actual_delegate._subDeserializers;
        assertNull(actual_delegate_subDeserializers);
        
        UnwrappedPropertyHandler expected_delegate_unwrappedPropertyHandler = expected_delegate._unwrappedPropertyHandler;
        UnwrappedPropertyHandler actual_delegate_unwrappedPropertyHandler = actual_delegate._unwrappedPropertyHandler;
        List actual_delegate_unwrappedPropertyHandler_properties = ((List) getFieldValue(actual_delegate_unwrappedPropertyHandler, "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler", "_properties"));
        assertNull(actual_delegate_unwrappedPropertyHandler_properties);
        
        ExternalTypeHandler actual_delegate_externalTypeIdHandler = actual_delegate._externalTypeIdHandler;
        assertNull(actual_delegate_externalTypeIdHandler);
        
        ObjectIdReader actual_delegate_objectIdReader = actual_delegate._objectIdReader;
        assertNull(actual_delegate_objectIdReader);
        
        Class actual_delegate_valueClass = ((Class) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegate_valueClass);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] expected_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
        int expected_orderedPropertiesSize = expected_orderedProperties.length;
        assertEquals(expected_orderedPropertiesSize, actual_orderedProperties.length);
        assertTrue(deepEquals(expected_orderedProperties, actual_orderedProperties));
        
        AnnotatedMethod actual_buildMethod = ((AnnotatedMethod) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
        assertNull(actual_buildMethod);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        BeanPropertyMap beanPropertyMap = builderBasedDeserializer._beanProperties;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] beanPropertyMap_beanProperties_propsInOrder = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(beanPropertyMap, "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "_propsInOrder"));
        SettableBeanProperty finalBuilderBasedDeserializer_beanProperties_propsInOrder0 = ((SettableBeanProperty) get(beanPropertyMap_beanProperties_propsInOrder, 0));
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_beanProperties_propsInOrder0);
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#asArrayDeserializer()}
 * @utbot.returnsFrom {@code return new BeanAsArrayBuilderDeserializer(this, props, _buildMethod);}
 *  */
    @Test
    public void testAsArrayDeserializer_Return_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        MapType _beanType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        BeanAsArrayBuilderDeserializer actual = ((BeanAsArrayBuilderDeserializer) builderBasedDeserializer.asArrayDeserializer());
        
        BeanAsArrayBuilderDeserializer expected = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate", builderBasedDeserializer);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
        
        BeanDeserializerBase expected_delegate = ((BeanDeserializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
        BeanDeserializerBase actual_delegate = ((BeanDeserializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
        AnnotatedMethod actual_delegate_buildMethod = ((AnnotatedMethod) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod"));
        assertNull(actual_delegate_buildMethod);
        
        Annotations actual_delegate_classAnnotations = ((Annotations) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_delegate_classAnnotations);
        
        JavaType expected_delegate_beanType = expected_delegate._beanType;
        JavaType actual_delegate_beanType = actual_delegate._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_delegate_beanType, actual_delegate_beanType);
        
        JsonFormat.Shape actual_delegate_serializationShape = actual_delegate._serializationShape;
        assertNull(actual_delegate_serializationShape);
        
        ValueInstantiator actual_delegate_valueInstantiator = actual_delegate._valueInstantiator;
        assertNull(actual_delegate_valueInstantiator);
        
        JsonDeserializer actual_delegate_delegateDeserializer = actual_delegate._delegateDeserializer;
        assertNull(actual_delegate_delegateDeserializer);
        
        JsonDeserializer actual_delegate_arrayDelegateDeserializer = actual_delegate._arrayDelegateDeserializer;
        assertNull(actual_delegate_arrayDelegateDeserializer);
        
        PropertyBasedCreator actual_delegate_propertyBasedCreator = actual_delegate._propertyBasedCreator;
        assertNull(actual_delegate_propertyBasedCreator);
        
        boolean actual_delegate_nonStandardCreation = actual_delegate._nonStandardCreation;
        assertFalse(actual_delegate_nonStandardCreation);
        
        boolean actual_delegate_vanillaProcessing = actual_delegate._vanillaProcessing;
        assertFalse(actual_delegate_vanillaProcessing);
        
        BeanPropertyMap expected_delegate_beanProperties = expected_delegate._beanProperties;
        BeanPropertyMap actual_delegate_beanProperties = actual_delegate._beanProperties;
        // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected_delegate_beanProperties, actual_delegate_beanProperties));
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_delegate_injectables = actual_delegate._injectables;
        assertNull(actual_delegate_injectables);
        
        SettableAnyProperty actual_delegate_anySetter = actual_delegate._anySetter;
        assertNull(actual_delegate_anySetter);
        
        Set actual_delegate_ignorableProps = actual_delegate._ignorableProps;
        assertNull(actual_delegate_ignorableProps);
        
        boolean actual_delegate_ignoreAllUnknown = actual_delegate._ignoreAllUnknown;
        assertFalse(actual_delegate_ignoreAllUnknown);
        
        boolean actual_delegate_needViewProcesing = actual_delegate._needViewProcesing;
        assertFalse(actual_delegate_needViewProcesing);
        
        Map actual_delegate_backRefs = actual_delegate._backRefs;
        assertNull(actual_delegate_backRefs);
        
        HashMap actual_delegate_subDeserializers = actual_delegate._subDeserializers;
        assertNull(actual_delegate_subDeserializers);
        
        UnwrappedPropertyHandler actual_delegate_unwrappedPropertyHandler = actual_delegate._unwrappedPropertyHandler;
        assertNull(actual_delegate_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_delegate_externalTypeIdHandler = actual_delegate._externalTypeIdHandler;
        assertNull(actual_delegate_externalTypeIdHandler);
        
        ObjectIdReader actual_delegate_objectIdReader = actual_delegate._objectIdReader;
        assertNull(actual_delegate_objectIdReader);
        
        Class actual_delegate_valueClass = ((Class) getFieldValue(actual_delegate, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegate_valueClass);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
        assertNull(actual_orderedProperties);
        
        AnnotatedMethod actual_buildMethod = ((AnnotatedMethod) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
        assertNull(actual_buildMethod);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asArrayDeserializer()
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#asArrayDeserializer()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap#getPropertiesInInsertionOrder()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty[] props = _beanProperties.getPropertiesInInsertionOrder();
 *  */
    @Test
    public void testAsArrayDeserializer_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.asArrayDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.asArrayDeserializer(BuilderBasedDeserializer.java:117) */
        builderBasedDeserializer.asArrayDeserializer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnExtComplete_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = builderBasedDeserializer.deserializeWithExternalTypeId(jsonParserSequence, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties0);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ReturnExtComplete() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = builderBasedDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, impl, null);
        
        assertNull(actual);
        
        ExternalTypeHandler externalTypeHandler = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler1_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds0 = ((String) get(externalTypeHandler1_externalTypeIdHandler_typeIds, 0));
        ExternalTypeHandler externalTypeHandler2 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler2_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler2, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens0 = ((TokenBuffer) get(externalTypeHandler2_externalTypeIdHandler_tokens, 0));
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.getActiveView()
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:659) */
        builderBasedDeserializer.deserializeWithExternalTypeId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:660) */
        builderBasedDeserializer.deserializeWithExternalTypeId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ExternalTypeHandler ext = _externalTypeIdHandler.start();
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:660) */
        builderBasedDeserializer.deserializeWithExternalTypeId(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JsonToken t = p.getCurrentToken(); t == JsonToken.FIELD_NAME; t = p.nextToken())
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:662) */
        builderBasedDeserializer.deserializeWithExternalTypeId(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_needViewProcesing): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.returnsFrom {@code return ext.complete(p, ctxt, bean);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ext.complete(p, ctxt, bean);
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException_4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:663) */
        builderBasedDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, impl, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testDeserializeWithExternalTypeId1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        Object object = new Object();
        
        Class initialImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        Object actual = builderBasedDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, impl, object);
        
        ExternalTypeHandler externalTypeHandler = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler1_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties1 = get(externalTypeHandler1_externalTypeIdHandler_properties, 1);
        ExternalTypeHandler externalTypeHandler2 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler2_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler2, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties2 = get(externalTypeHandler2_externalTypeIdHandler_properties, 2);
        ExternalTypeHandler externalTypeHandler3 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler3_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler3, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties3 = get(externalTypeHandler3_externalTypeIdHandler_properties, 3);
        ExternalTypeHandler externalTypeHandler4 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler4_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler4, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties4 = get(externalTypeHandler4_externalTypeIdHandler_properties, 4);
        ExternalTypeHandler externalTypeHandler5 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler5_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler5, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties5 = get(externalTypeHandler5_externalTypeIdHandler_properties, 5);
        ExternalTypeHandler externalTypeHandler6 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler6_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler6, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties6 = get(externalTypeHandler6_externalTypeIdHandler_properties, 6);
        ExternalTypeHandler externalTypeHandler7 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler7_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler7, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties7 = get(externalTypeHandler7_externalTypeIdHandler_properties, 7);
        ExternalTypeHandler externalTypeHandler8 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler8_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler8, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties8 = get(externalTypeHandler8_externalTypeIdHandler_properties, 8);
        
        Class finalImpl_view = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view"));
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties1);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties2);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties3);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties4);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties5);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties6);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties7);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties8);
        
        assertFalse(initialImpl_view == finalImpl_view);
    }
    
    @Test
    public void testDeserializeWithExternalTypeId2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 17);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate8 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        Object actual = builderBasedDeserializer.deserializeWithExternalTypeId(jsonParserDelegate2, null, object);
        
        ExternalTypeHandler externalTypeHandler = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler1_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties1 = get(externalTypeHandler1_externalTypeIdHandler_properties, 1);
        ExternalTypeHandler externalTypeHandler2 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler2_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler2, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties2 = get(externalTypeHandler2_externalTypeIdHandler_properties, 2);
        ExternalTypeHandler externalTypeHandler3 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler3_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler3, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties3 = get(externalTypeHandler3_externalTypeIdHandler_properties, 3);
        ExternalTypeHandler externalTypeHandler4 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler4_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler4, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties4 = get(externalTypeHandler4_externalTypeIdHandler_properties, 4);
        ExternalTypeHandler externalTypeHandler5 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler5_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler5, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties5 = get(externalTypeHandler5_externalTypeIdHandler_properties, 5);
        ExternalTypeHandler externalTypeHandler6 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler6_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler6, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties6 = get(externalTypeHandler6_externalTypeIdHandler_properties, 6);
        ExternalTypeHandler externalTypeHandler7 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler7_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler7, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties7 = get(externalTypeHandler7_externalTypeIdHandler_properties, 7);
        ExternalTypeHandler externalTypeHandler8 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler8_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler8, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties8 = get(externalTypeHandler8_externalTypeIdHandler_properties, 8);
        ExternalTypeHandler externalTypeHandler9 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler9_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler9, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties9 = get(externalTypeHandler9_externalTypeIdHandler_properties, 9);
        ExternalTypeHandler externalTypeHandler10 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler10_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler10, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties10 = get(externalTypeHandler10_externalTypeIdHandler_properties, 10);
        ExternalTypeHandler externalTypeHandler11 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler11_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler11, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties11 = get(externalTypeHandler11_externalTypeIdHandler_properties, 11);
        ExternalTypeHandler externalTypeHandler12 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler12_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler12, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties12 = get(externalTypeHandler12_externalTypeIdHandler_properties, 12);
        ExternalTypeHandler externalTypeHandler13 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler13_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler13, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties13 = get(externalTypeHandler13_externalTypeIdHandler_properties, 13);
        ExternalTypeHandler externalTypeHandler14 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler14_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler14, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties14 = get(externalTypeHandler14_externalTypeIdHandler_properties, 14);
        ExternalTypeHandler externalTypeHandler15 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler15_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler15, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties15 = get(externalTypeHandler15_externalTypeIdHandler_properties, 15);
        ExternalTypeHandler externalTypeHandler16 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler16_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler16, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties16 = get(externalTypeHandler16_externalTypeIdHandler_properties, 16);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties1);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties2);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties3);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties4);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties5);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties6);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties7);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties8);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties9);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties10);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties11);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties12);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties13);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties14);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties15);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties16);
    }
    
    @Test
    public void testDeserializeWithExternalTypeId3() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        JsonParserDelegate jsonParserDelegate6 = new JsonParserDelegate(jsonParserDelegate5);
        JsonParserDelegate jsonParserDelegate7 = new JsonParserDelegate(jsonParserDelegate6);
        JsonParserDelegate jsonParserDelegate8 = new JsonParserDelegate(jsonParserDelegate7);
        JsonParserDelegate jsonParserDelegate9 = new JsonParserDelegate(jsonParserDelegate8);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        Object actual = builderBasedDeserializer.deserializeWithExternalTypeId(jsonParserDelegate9, impl, object);
        
        ExternalTypeHandler externalTypeHandler = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler1_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties1 = get(externalTypeHandler1_externalTypeIdHandler_properties, 1);
        ExternalTypeHandler externalTypeHandler2 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler2_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler2, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties2 = get(externalTypeHandler2_externalTypeIdHandler_properties, 2);
        ExternalTypeHandler externalTypeHandler3 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler3_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler3, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties3 = get(externalTypeHandler3_externalTypeIdHandler_properties, 3);
        ExternalTypeHandler externalTypeHandler4 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler4_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler4, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties4 = get(externalTypeHandler4_externalTypeIdHandler_properties, 4);
        ExternalTypeHandler externalTypeHandler5 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler5_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler5, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties5 = get(externalTypeHandler5_externalTypeIdHandler_properties, 5);
        ExternalTypeHandler externalTypeHandler6 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler6_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler6, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties6 = get(externalTypeHandler6_externalTypeIdHandler_properties, 6);
        ExternalTypeHandler externalTypeHandler7 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler7_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler7, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties7 = get(externalTypeHandler7_externalTypeIdHandler_properties, 7);
        ExternalTypeHandler externalTypeHandler8 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler8_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler8, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties8 = get(externalTypeHandler8_externalTypeIdHandler_properties, 8);
        ExternalTypeHandler externalTypeHandler9 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler9_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler9, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds0 = ((String) get(externalTypeHandler9_externalTypeIdHandler_typeIds, 0));
        ExternalTypeHandler externalTypeHandler10 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler10_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler10, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds1 = ((String) get(externalTypeHandler10_externalTypeIdHandler_typeIds, 1));
        ExternalTypeHandler externalTypeHandler11 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler11_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler11, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds2 = ((String) get(externalTypeHandler11_externalTypeIdHandler_typeIds, 2));
        ExternalTypeHandler externalTypeHandler12 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler12_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler12, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds3 = ((String) get(externalTypeHandler12_externalTypeIdHandler_typeIds, 3));
        ExternalTypeHandler externalTypeHandler13 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler13_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler13, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds4 = ((String) get(externalTypeHandler13_externalTypeIdHandler_typeIds, 4));
        ExternalTypeHandler externalTypeHandler14 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler14_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler14, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds5 = ((String) get(externalTypeHandler14_externalTypeIdHandler_typeIds, 5));
        ExternalTypeHandler externalTypeHandler15 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler15_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler15, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds6 = ((String) get(externalTypeHandler15_externalTypeIdHandler_typeIds, 6));
        ExternalTypeHandler externalTypeHandler16 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler16_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler16, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds7 = ((String) get(externalTypeHandler16_externalTypeIdHandler_typeIds, 7));
        ExternalTypeHandler externalTypeHandler17 = builderBasedDeserializer._externalTypeIdHandler;
        java.lang.String[] externalTypeHandler17_externalTypeIdHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler17, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds8 = ((String) get(externalTypeHandler17_externalTypeIdHandler_typeIds, 8));
        ExternalTypeHandler externalTypeHandler18 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler18_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler18, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens0 = ((TokenBuffer) get(externalTypeHandler18_externalTypeIdHandler_tokens, 0));
        ExternalTypeHandler externalTypeHandler19 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler19_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler19, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens1 = ((TokenBuffer) get(externalTypeHandler19_externalTypeIdHandler_tokens, 1));
        ExternalTypeHandler externalTypeHandler20 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler20_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler20, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens2 = ((TokenBuffer) get(externalTypeHandler20_externalTypeIdHandler_tokens, 2));
        ExternalTypeHandler externalTypeHandler21 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler21_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler21, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens3 = ((TokenBuffer) get(externalTypeHandler21_externalTypeIdHandler_tokens, 3));
        ExternalTypeHandler externalTypeHandler22 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler22_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler22, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens4 = ((TokenBuffer) get(externalTypeHandler22_externalTypeIdHandler_tokens, 4));
        ExternalTypeHandler externalTypeHandler23 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler23_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler23, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens5 = ((TokenBuffer) get(externalTypeHandler23_externalTypeIdHandler_tokens, 5));
        ExternalTypeHandler externalTypeHandler24 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler24_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler24, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens6 = ((TokenBuffer) get(externalTypeHandler24_externalTypeIdHandler_tokens, 6));
        ExternalTypeHandler externalTypeHandler25 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler25_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler25, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens7 = ((TokenBuffer) get(externalTypeHandler25_externalTypeIdHandler_tokens, 7));
        ExternalTypeHandler externalTypeHandler26 = builderBasedDeserializer._externalTypeIdHandler;
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler26_externalTypeIdHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler26, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalBuilderBasedDeserializer_externalTypeIdHandler_tokens8 = ((TokenBuffer) get(externalTypeHandler26_externalTypeIdHandler_tokens, 8));
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties1);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties2);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties3);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties4);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties5);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties6);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties7);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties8);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds1);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds2);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds3);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds4);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds5);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds6);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds7);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_typeIds8);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens1);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens2);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens3);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens4);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens5);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens6);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens7);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_tokens8);
    }
    
    @Test
    public void testDeserializeWithExternalTypeId4() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        JsonParserDelegate jsonParserDelegate6 = new JsonParserDelegate(jsonParserDelegate5);
        JsonParserDelegate jsonParserDelegate7 = new JsonParserDelegate(jsonParserDelegate6);
        JsonParserDelegate jsonParserDelegate8 = new JsonParserDelegate(jsonParserDelegate7);
        JsonParserDelegate jsonParserDelegate9 = new JsonParserDelegate(jsonParserDelegate8);
        JsonParserDelegate jsonParserDelegate10 = new JsonParserDelegate(jsonParserDelegate9);
        JsonParserDelegate jsonParserDelegate11 = new JsonParserDelegate(jsonParserDelegate10);
        Object object = new Object();
        
        Object actual = builderBasedDeserializer.deserializeWithExternalTypeId(jsonParserDelegate11, null, object);
        
        ExternalTypeHandler externalTypeHandler = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties0 = get(externalTypeHandler_externalTypeIdHandler_properties, 0);
        ExternalTypeHandler externalTypeHandler1 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler1_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties1 = get(externalTypeHandler1_externalTypeIdHandler_properties, 1);
        ExternalTypeHandler externalTypeHandler2 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler2_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler2, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties2 = get(externalTypeHandler2_externalTypeIdHandler_properties, 2);
        ExternalTypeHandler externalTypeHandler3 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler3_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler3, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties3 = get(externalTypeHandler3_externalTypeIdHandler_properties, 3);
        ExternalTypeHandler externalTypeHandler4 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler4_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler4, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties4 = get(externalTypeHandler4_externalTypeIdHandler_properties, 4);
        ExternalTypeHandler externalTypeHandler5 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler5_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler5, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties5 = get(externalTypeHandler5_externalTypeIdHandler_properties, 5);
        ExternalTypeHandler externalTypeHandler6 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler6_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler6, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties6 = get(externalTypeHandler6_externalTypeIdHandler_properties, 6);
        ExternalTypeHandler externalTypeHandler7 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler7_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler7, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties7 = get(externalTypeHandler7_externalTypeIdHandler_properties, 7);
        ExternalTypeHandler externalTypeHandler8 = builderBasedDeserializer._externalTypeIdHandler;
        Object externalTypeHandler8_externalTypeIdHandler_properties = getFieldValue(externalTypeHandler8, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalBuilderBasedDeserializer_externalTypeIdHandler_properties8 = get(externalTypeHandler8_externalTypeIdHandler_properties, 8);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties0);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties1);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties2);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties3);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties4);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties5);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties6);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties7);
        
        assertNull(finalBuilderBasedDeserializer_externalTypeIdHandler_properties8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testDeserializeWithExternalTypeId5() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:665) */
        builderBasedDeserializer.deserializeWithExternalTypeId(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testDeserializeWithExternalTypeId6() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _exposedContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_exposedContext", _exposedContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class _view = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_view", _view);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:665) */
        builderBasedDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeWithExternalTypeId7() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:663) */
        builderBasedDeserializer.deserializeWithExternalTypeId(jsonParserDelegate1, null, object);
    }
    
    @Test
    public void testDeserializeWithExternalTypeId8() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        TokenFilterContext _headContext = ((TokenFilterContext) createInstance("com.fasterxml.jackson.core.filter.TokenFilterContext"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_headContext", _headContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:286)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:664) */
        builderBasedDeserializer.deserializeWithExternalTypeId(filteringParserDelegate, impl, object);
    }
    
    @Test
    public void testDeserializeWithExternalTypeId9() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing", true);
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        java.lang.Object[] _properties = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties", _properties);
        java.lang.String[] _typeIds = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds", _typeIds);
        com.fasterxml.jackson.databind.util.TokenBuffer[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_externalTypeIdHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens", _tokens);
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate5, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:191)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:120)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:663) */
        builderBasedDeserializer.deserializeWithExternalTypeId(jsonParserSequence, impl, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserializeWithExternalTypeId(p, ctxt, _valueInstantiator.createUsingDefault(ctxt));
 *  */
    @Test
    public void testDeserializeWithExternalTypeId_ThrowNullPointerException1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithExternalTypeId(BuilderBasedDeserializer.java:652) */
        builderBasedDeserializer.deserializeWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeUsingPropertyBasedWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeUsingPropertyBasedWithExternalTypeId(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithExternalTypeId_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        builderBasedDeserializer.deserializeWithExternalTypeId(null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void testDeserializeWithExternalTypeId10() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        builderBasedDeserializer.deserializeWithExternalTypeId(null, impl);
    }
    ///endregion
    
    ///region Errors report for deserializeWithExternalTypeId
    
    public void testDeserializeWithExternalTypeId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void testDeserializeWithUnwrapped_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithUnwrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithUnwrapped(BuilderBasedDeserializer.java:525) */
        builderBasedDeserializer.deserializeWithUnwrapped(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithUnwrapped
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _valueInstantiator.createUsingDelegate(ctxt, _delegateDeserializer.deserialize(p, ctxt));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithUnwrapped_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        builderBasedDeserializer.deserializeWithUnwrapped(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeWithUnwrapped_ThrowIllegalStateException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer1 = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer1);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        
        builderBasedDeserializer.deserializeWithUnwrapped(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeUsingPropertyBasedWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testDeserializeWithUnwrapped_ThrowNegativeArraySizeException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithUnwrapped] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:133)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BuilderBasedDeserializer.java:571)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithUnwrapped(BuilderBasedDeserializer.java:469) */
        builderBasedDeserializer.deserializeWithUnwrapped(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeFromObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_nonStandardCreation): True}
 * @utbot.executesCondition {@code (_unwrappedPropertyHandler != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithUnwrapped(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return deserializeWithUnwrapped(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNegativeArraySizeException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        builderBasedDeserializer._nonStandardCreation = true;
        UnwrappedPropertyHandler _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        builderBasedDeserializer._unwrappedPropertyHandler = _unwrappedPropertyHandler;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeFromObject] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:133)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeUsingPropertyBasedWithUnwrapped(BuilderBasedDeserializer.java:571)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeWithUnwrapped(BuilderBasedDeserializer.java:469)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeFromObject(BuilderBasedDeserializer.java:287) */
        builderBasedDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_nonStandardCreation): True}
 * @utbot.executesCondition {@code (_unwrappedPropertyHandler != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeFromObjectUsingNonDefault(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return deserializeFromObjectUsingNonDefault(p, ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNegativeArraySizeException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", Integer.MIN_VALUE);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        builderBasedDeserializer._nonStandardCreation = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeFromObject] produces [java.lang.NegativeArraySizeException: -2147483648]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:133)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:337)
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1191)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeFromObject(BuilderBasedDeserializer.java:292) */
        builderBasedDeserializer.deserializeFromObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_nonStandardCreation): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object bean = _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserializeFromObject_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeFromObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.deserializeFromObject(BuilderBasedDeserializer.java:294) */
        builderBasedDeserializer.deserializeFromObject(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeFromObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeFromObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_nonStandardCreation): True}
 * @utbot.executesCondition {@code (_unwrappedPropertyHandler != null): False}
 * @utbot.executesCondition {@code (_externalTypeIdHandler != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#deserializeWithExternalTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deserializeWithExternalTypeId(p, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializeFromObject_ThrowIllegalStateException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        builderBasedDeserializer._nonStandardCreation = true;
        ExternalTypeHandler _externalTypeIdHandler = ((ExternalTypeHandler) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        builderBasedDeserializer._externalTypeIdHandler = _externalTypeIdHandler;
        
        builderBasedDeserializer.deserializeFromObject(null, null);
    }
    ///endregion
    
    ///region Errors report for deserializeFromObject
    
    public void testDeserializeFromObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNegativeArraySizeException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:92)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:133)
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:337) */
        builderBasedDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:342) */
        builderBasedDeserializer._deserializeUsingPropertyBased(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(p, ctxt, _objectIdReader);
 *  */
    @Test
    public void test_deserializeUsingPropertyBased_ThrowNullPointerException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeUsingPropertyBased(BuilderBasedDeserializer.java:337) */
        builderBasedDeserializer._deserializeUsingPropertyBased(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#_deserializeUsingPropertyBased(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#build(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bean = wrapInstantiationProblem(e, ctxt);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_deserializeUsingPropertyBased_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader", _objectIdReader);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        builderBasedDeserializer._deserializeUsingPropertyBased(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.unwrappingDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return new BuilderBasedDeserializer(this, unwrapper);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotatedMethod _buildMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        NioPathDeserializer _delegateDeserializer = ((NioPathDeserializer) createInstance("com.fasterxml.jackson.databind.ext.NioPathDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.unwrappingDeserializer(null));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        
        AnnotatedMethod expected_buildMethod = expected._buildMethod;
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(expected_buildMethod, actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertFalse(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        assertTrue(deepEquals(expected, actual));
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_1() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotatedMethod _buildMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        NioPathDeserializer _delegateDeserializer = ((NioPathDeserializer) createInstance("com.fasterxml.jackson.databind.ext.NioPathDeserializer"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.unwrappingDeserializer(null));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator", _valueInstantiator);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        
        AnnotatedMethod expected_buildMethod = expected._buildMethod;
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(expected_buildMethod, actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType actual_beanType = actual._beanType;
        assertNull(actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator expected_valueInstantiator = expected._valueInstantiator;
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        Class actual_valueInstantiator_valueType = ((Class) getFieldValue(actual_valueInstantiator, "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", "_valueType"));
        assertNull(actual_valueInstantiator_valueType);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertTrue(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        assertTrue(deepEquals(expected, actual));
        
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_2() throws Exception  {
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        AnnotatedMethod _buildMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        ReferenceType _beanType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_beanType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ANY;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std _delegateDeserializer = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std) createInstance("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        builderBasedDeserializer._propertyBasedCreator = _propertyBasedCreator;
        SettableAnyProperty _anySetter = ((SettableAnyProperty) createInstance("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        builderBasedDeserializer._anySetter = _anySetter;
        setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        
        JavaType javaType = builderBasedDeserializer._beanType;
        Class initialBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) builderBasedDeserializer.unwrappingDeserializer(null));
        
        BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_buildMethod", _buildMethod);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations", _classAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape", _serializationShape);
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        expected._anySetter = _anySetter;
        setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        AnnotatedMethod expected_buildMethod = expected._buildMethod;
        AnnotatedMethod actual_buildMethod = actual._buildMethod;
        // com.fasterxml.jackson.databind.introspect.AnnotatedMethod has overridden equals method
        assertEquals(expected_buildMethod, actual_buildMethod);
        
        Annotations expected_classAnnotations = ((Annotations) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        HashMap actual_classAnnotations_annotations = ((HashMap) getFieldValue(actual_classAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_classAnnotations_annotations);
        
        JavaType expected_beanType = expected._beanType;
        JavaType actual_beanType = actual._beanType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_beanType, actual_beanType);
        
        JsonFormat.Shape expected_serializationShape = expected._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(expected_serializationShape, actual_serializationShape);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        int expected_delegateDeserializer_kind = ((Integer) getFieldValue(expected_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std", "_kind"));
        int actual_delegateDeserializer_kind = ((Integer) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std", "_kind"));
        assertEquals(expected_delegateDeserializer_kind, actual_delegateDeserializer_kind);
        
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
        JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
        assertNull(actual_arrayDelegateDeserializer);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_propertyLookup = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyLookup"));
        assertNull(actual_propertyBasedCreator_propertyLookup);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_allProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties"));
        assertNull(actual_propertyBasedCreator_allProperties);
        
        boolean actual_nonStandardCreation = actual._nonStandardCreation;
        assertFalse(actual_nonStandardCreation);
        
        boolean actual_vanillaProcessing = actual._vanillaProcessing;
        assertFalse(actual_vanillaProcessing);
        
        BeanPropertyMap actual_beanProperties = actual._beanProperties;
        assertNull(actual_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
        SettableAnyProperty expected_anySetter = expected._anySetter;
        SettableAnyProperty actual_anySetter = actual._anySetter;
        BeanProperty actual_anySetter_property = actual_anySetter._property;
        assertNull(actual_anySetter_property);
        
        AnnotatedMember actual_anySetter_setter = actual_anySetter._setter;
        assertNull(actual_anySetter_setter);
        
        boolean actual_anySetter_setterIsField = actual_anySetter._setterIsField;
        assertFalse(actual_anySetter_setterIsField);
        
        JavaType actual_anySetter_type = actual_anySetter._type;
        assertNull(actual_anySetter_type);
        
        JsonDeserializer actual_anySetter_valueDeserializer = actual_anySetter._valueDeserializer;
        assertNull(actual_anySetter_valueDeserializer);
        
        TypeDeserializer actual_anySetter_valueTypeDeserializer = actual_anySetter._valueTypeDeserializer;
        assertNull(actual_anySetter_valueTypeDeserializer);
        
        Set actual_ignorableProps = actual._ignorableProps;
        assertNull(actual_ignorableProps);
        
        boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
        assertTrue(actual_ignoreAllUnknown);
        
        boolean actual_needViewProcesing = actual._needViewProcesing;
        assertFalse(actual_needViewProcesing);
        
        Map actual_backRefs = actual._backRefs;
        assertNull(actual_backRefs);
        
        HashMap actual_subDeserializers = actual._subDeserializers;
        assertNull(actual_subDeserializers);
        
        UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
        assertNull(actual_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
        assertNull(actual_externalTypeIdHandler);
        
        ObjectIdReader actual_objectIdReader = actual._objectIdReader;
        assertNull(actual_objectIdReader);
        
        Class expected_valueClass = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = builderBasedDeserializer._beanType;
        Class finalBuilderBasedDeserializer_beanType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
        Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
        
        assertFalse(initialBuilderBasedDeserializer_beanType_class == finalBuilderBasedDeserializer_beanType_class);
        
        assertNull(finalBuilderBasedDeserializer_ignorableProps);
        
        assertNull(finalBuilderBasedDeserializer_backRefs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BuilderBasedDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer#unwrappingDeserializer(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new BuilderBasedDeserializer(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingDeserializer_Return_3() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            BeanPropertyMap _beanProperties = ((BeanPropertyMap) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
            setField(builderBasedDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            
            Class builderBasedDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
            Method unwrappingDeserializerMethod = builderBasedDeserializerClazz.getDeclaredMethod("unwrappingDeserializer", nameTransformerClazz);
            unwrappingDeserializerMethod.setAccessible(true);
            java.lang.Object[] unwrappingDeserializerMethodArguments = new java.lang.Object[1];
            unwrappingDeserializerMethodArguments[0] = nop;
            BuilderBasedDeserializer actual = ((BuilderBasedDeserializer) unwrappingDeserializerMethod.invoke(builderBasedDeserializer, unwrappingDeserializerMethodArguments));
            
            BuilderBasedDeserializer expected = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties", _beanProperties);
            setField(expected, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown", true);
            
            AnnotatedMethod actual_buildMethod = actual._buildMethod;
            assertNull(actual_buildMethod);
            
            Annotations actual_classAnnotations = ((Annotations) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
            assertNull(actual_classAnnotations);
            
            JavaType actual_beanType = actual._beanType;
            assertNull(actual_beanType);
            
            JsonFormat.Shape actual_serializationShape = actual._serializationShape;
            assertNull(actual_serializationShape);
            
            ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
            assertNull(actual_valueInstantiator);
            
            JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
            assertNull(actual_delegateDeserializer);
            
            JsonDeserializer actual_arrayDelegateDeserializer = actual._arrayDelegateDeserializer;
            assertNull(actual_arrayDelegateDeserializer);
            
            PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
            assertNull(actual_propertyBasedCreator);
            
            boolean actual_nonStandardCreation = actual._nonStandardCreation;
            assertFalse(actual_nonStandardCreation);
            
            boolean actual_vanillaProcessing = actual._vanillaProcessing;
            assertFalse(actual_vanillaProcessing);
            
            BeanPropertyMap expected_beanProperties = expected._beanProperties;
            BeanPropertyMap actual_beanProperties = actual._beanProperties;
            // com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expected_beanProperties, actual_beanProperties));
            
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_injectables = actual._injectables;
            assertNull(actual_injectables);
            
            SettableAnyProperty actual_anySetter = actual._anySetter;
            assertNull(actual_anySetter);
            
            Set actual_ignorableProps = actual._ignorableProps;
            assertNull(actual_ignorableProps);
            
            boolean actual_ignoreAllUnknown = actual._ignoreAllUnknown;
            assertTrue(actual_ignoreAllUnknown);
            
            boolean actual_needViewProcesing = actual._needViewProcesing;
            assertFalse(actual_needViewProcesing);
            
            Map actual_backRefs = actual._backRefs;
            assertNull(actual_backRefs);
            
            HashMap actual_subDeserializers = actual._subDeserializers;
            assertNull(actual_subDeserializers);
            
            UnwrappedPropertyHandler actual_unwrappedPropertyHandler = actual._unwrappedPropertyHandler;
            assertNull(actual_unwrappedPropertyHandler);
            
            ExternalTypeHandler actual_externalTypeIdHandler = actual._externalTypeIdHandler;
            assertNull(actual_externalTypeIdHandler);
            
            ObjectIdReader actual_objectIdReader = actual._objectIdReader;
            assertNull(actual_objectIdReader);
            
            Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertNull(actual_valueClass);
            
            Set finalBuilderBasedDeserializer_ignorableProps = builderBasedDeserializer._ignorableProps;
            Map finalBuilderBasedDeserializer_backRefs = builderBasedDeserializer._backRefs;
            
            assertNull(finalBuilderBasedDeserializer_ignorableProps);
            
            assertNull(finalBuilderBasedDeserializer_backRefs);
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1083077053133599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1083077053133599.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1083077053138500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083077053133599.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083077053138500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1083077053459300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1083077053459300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1083077053460900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083077053459300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083077053460900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1083077056134000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1083077056134000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1083077056135900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083077056134000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083077056135900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

